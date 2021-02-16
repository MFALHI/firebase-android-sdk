// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.firebase.storage.network;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.firebase.FirebaseApp;
import com.google.firebase.emulators.EmulatedServiceSettings;

/** A network request that deletes a gcs object. */
public class DeleteNetworkRequest extends NetworkRequest {
  public DeleteNetworkRequest(@NonNull Uri gsUri, @NonNull FirebaseApp app, @Nullable EmulatedServiceSettings emulatorSettings) {
    super(gsUri, app, emulatorSettings);
  }

  @Override
  @NonNull
  protected String getAction() {
    return DELETE;
  }
}
