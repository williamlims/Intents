// Generated by view binder compiler. Do not edit!
package br.edu.scl.ifsp.sdm.intents.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import br.edu.scl.ifsp.sdm.intents.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button parameterBt;

  @NonNull
  public final TextView parameterTv;

  @NonNull
  public final ToolbarBinding toolbarIn;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button parameterBt,
      @NonNull TextView parameterTv, @NonNull ToolbarBinding toolbarIn) {
    this.rootView = rootView;
    this.parameterBt = parameterBt;
    this.parameterTv = parameterTv;
    this.toolbarIn = toolbarIn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.parameterBt;
      Button parameterBt = ViewBindings.findChildViewById(rootView, id);
      if (parameterBt == null) {
        break missingId;
      }

      id = R.id.parameterTv;
      TextView parameterTv = ViewBindings.findChildViewById(rootView, id);
      if (parameterTv == null) {
        break missingId;
      }

      id = R.id.toolbarIn;
      View toolbarIn = ViewBindings.findChildViewById(rootView, id);
      if (toolbarIn == null) {
        break missingId;
      }
      ToolbarBinding binding_toolbarIn = ToolbarBinding.bind(toolbarIn);

      return new ActivityMainBinding((ConstraintLayout) rootView, parameterBt, parameterTv,
          binding_toolbarIn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
