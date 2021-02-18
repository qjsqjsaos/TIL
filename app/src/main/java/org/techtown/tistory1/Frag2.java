package org.techtown.tistory1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Frag2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false );

        setInit(view);

        return view;

    }

    private void setInit(View _view) {
        TextView textView = _view.findViewById(R.id.textView); //여기에 각자 텍스트 뷰 참조 가능
    }
}
