// Generated by view binder compiler. Do not edit!
package br.edu.scl.ifsp.sdm.intents.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import br.edu.scl.ifsp.sdm.intents.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityParameterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText parameterEt;

  @NonNull
  public final Button returnCloseBt;

  @NonNull
  public final ToolbarBinding toolbarIn;

  private ActivityParameterBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText parameterEt, @NonNull Button returnCloseBt,
      @NonNull ToolbarBinding toolbarIn) {
    this.rootView = rootView;
    this.parameterEt = parameterEt;
    this.returnCloseBt = returnCloseBt;
    this.toolbarIn = toolbarIn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityParameterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityParameterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_parameter, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityParameterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.parameterEt;
      EditText parameterEt = ViewBindings.findChildViewById(rootView, id);
      if (parameterEt == null) {
        break missingId;
      }

      id = R.id.returnCloseBt;
      Button returnCloseBt = ViewBindings.findChildViewById(rootView, id);
      if (returnCloseBt == null) {
        break missingId;
      }

      id = R.id.toolbarIn;
      View toolbarIn = ViewBindings.findChildViewById(rootView, id);
      if (toolbarIn == null) {
        break missingId;
      }
      ToolbarBinding binding_toolbarIn = ToolbarBinding.bind(toolbarIn);

      return new ActivityParameterBinding((ConstraintLayout) rootView, parameterEt, returnCloseBt,
          binding_toolbarIn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
