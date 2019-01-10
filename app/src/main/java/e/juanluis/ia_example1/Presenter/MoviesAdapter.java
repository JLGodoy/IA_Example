package e.juanluis.ia_example1.Presenter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import e.juanluis.ia_example1.Model.MoviesModel;
import e.juanluis.ia_example1.R;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder> {

    private ArrayList<MoviesModel> mMoviesList;

    public MoviesAdapter(ArrayList<MoviesModel> moviesList){mMoviesList = moviesList;}


    @NonNull
    @Override
    public MoviesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int pos) {

        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_row, parent, false);
        return new MoviesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesViewHolder moviesViewHolder, int i) {

        moviesViewHolder.movieTitle.setText(mMoviesList.get(i).getTitle());
        moviesViewHolder.movieYear.setText(mMoviesList.get(i).getYear());

        String URL= "https://movies-sample.herokuapp.com/api/movies"
                + mMoviesList.get(i).getPosterUrl();
        Picasso.get().load(URL).resize(120,120)
                .centerCrop().into(moviesViewHolder.moviePoster);

    }

    @Override
    public int getItemCount() {
        return mMoviesList.size();
    }

    public class MoviesViewHolder extends RecyclerView.ViewHolder {

        private TextView movieTitle, movieYear;
        private ImageView moviePoster;

        public MoviesViewHolder(View view) {
            super(view);

            movieTitle = view.findViewById(R.id.movie_title);
            movieYear = view.findViewById(R.id.movie_year);
            moviePoster = view.findViewById(R.id.movie_poster);
        }
    }
}
