/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5eba8
 */

int evp_cipher_get_asn1_aead_params(undefined8 param_1,long param_2,void *param_3)

{
  int iVar1;
  undefined1 auStack_40 [16];
  undefined1 auStack_28 [8];
  
  iVar1 = 0;
  if ((param_2 != 0) && (param_3 != (void *)0x0)) {
    iVar1 = ossl_asn1_type_get_octetstring_int(param_2,auStack_28,0,0x10);
    if (iVar1 < 1) {
      iVar1 = -1;
    }
    else {
      ossl_asn1_type_get_octetstring_int(param_2,auStack_28,auStack_40,iVar1);
      memcpy(param_3,auStack_40,(long)iVar1);
      *(int *)((long)param_3 + 0x10) = iVar1;
    }
  }
  return iVar1;
}

