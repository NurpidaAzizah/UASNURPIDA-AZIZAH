package simple.example.fashionpedia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import simple.example.fashionpedia.model.Fashion;

public class DaftarFashionAdapter extends ArrayAdapter<Fashion> {

    Context context;

    public DaftarFashionAdapter(Context context, List<Fashion> fashions) {
        super(context, R.layout.row_daftar_fashion, fashions);
        this.context = context;
    }

    private static class ViewHolder  {
        TextView textModel;
        TextView textMerek;
        ImageView gambar;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fashion fashion = getItem(position);
        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_daftar_fashion, parent, false);
            viewHolder.textModel =  convertView.findViewById(R.id.row_text_model);
            viewHolder.textMerek = (TextView) convertView.findViewById(R.id.row_text_merek);
            viewHolder.gambar = convertView.findViewById(R.id.row_image_fashion);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.textModel.setText(fashion.getModel());
        viewHolder.textMerek.setText(fashion.getMerek());
        viewHolder.gambar.setImageDrawable(context.getDrawable(fashion.getDrawableRes()));
        return convertView;
    }

}
