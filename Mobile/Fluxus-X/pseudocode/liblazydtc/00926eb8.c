/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00926eb8
 */

undefined8 curl_mime_encoder(long param_1,long param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  if (param_1 == 0) {
    uVar2 = 0x2b;
  }
  else {
    *(undefined8 *)(param_1 + 0x90) = 0;
    if (param_2 == 0) {
      uVar2 = 0;
    }
    else {
      iVar1 = curl_strequal(param_2,"binary");
      if (iVar1 == 0) {
        uVar2 = 0x2b;
      }
      else {
        uVar2 = 0;
        *(undefined ***)(param_1 + 0x90) = &PTR_s_binary_00c4f6d8;
      }
      iVar1 = curl_strequal(param_2,&DAT_002c500f);
      if (iVar1 != 0) {
        uVar2 = 0;
        *(undefined ***)(param_1 + 0x90) = &PTR_DAT_00c4f6f0;
      }
      iVar1 = curl_strequal(param_2,&DAT_002d90ce);
      if (iVar1 != 0) {
        uVar2 = 0;
        *(undefined ***)(param_1 + 0x90) = &PTR_DAT_00c4f708;
      }
      iVar1 = curl_strequal(param_2,"base64");
      if (iVar1 != 0) {
        uVar2 = 0;
        *(undefined ***)(param_1 + 0x90) = &PTR_s_base64_00c4f720;
      }
      iVar1 = curl_strequal(param_2,"quoted-printable");
      if (iVar1 != 0) {
        uVar2 = 0;
        *(undefined ***)(param_1 + 0x90) = &PTR_s_quoted_printable_00c4f738;
      }
    }
  }
  return uVar2;
}

