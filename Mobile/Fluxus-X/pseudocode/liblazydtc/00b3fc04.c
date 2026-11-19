/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b3fc04
 */

undefined4
FUN_00b3fc04(undefined8 param_1,undefined8 param_2,undefined4 param_3,undefined8 param_4,
            code *param_5,undefined8 param_6,long param_7)

{
  int iVar1;
  undefined4 uVar2;
  X509_PUBKEY *a;
  int local_3c;
  ASN1_OBJECT *local_38;
  
  local_38 = (ASN1_OBJECT *)0x0;
  local_3c = -1;
  if ((param_5 != (code *)0x0) &&
     (iVar1 = (*param_5)(param_2,param_3,*(undefined4 *)(param_7 + 8),&local_38,&local_3c),
     iVar1 == 0)) {
    return 0;
  }
  a = (X509_PUBKEY *)FUN_00b3fb1c(param_2,param_3,local_38,local_3c,param_6);
  if (a == (X509_PUBKEY *)0x0) {
    if (local_3c == 0x10) {
      ASN1_STRING_free((ASN1_STRING *)local_38);
    }
    else {
      uVar2 = 0;
      if (local_3c != 6) goto LAB_00b3fcc8;
      ASN1_OBJECT_free(local_38);
    }
    uVar2 = 0;
  }
  else {
    uVar2 = PEM_write_bio_X509_PUBKEY(param_1,a);
  }
LAB_00b3fcc8:
  X509_PUBKEY_free(a);
  return uVar2;
}

