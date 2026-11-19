/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b3fa60
 */

undefined4
FUN_00b3fa60(undefined8 param_1,undefined8 param_2,undefined4 param_3,undefined8 param_4,
            code *param_5,undefined8 param_6,long param_7)

{
  int iVar1;
  undefined4 uVar2;
  X509_PUBKEY *a;
  undefined4 local_3c;
  undefined8 local_38;
  
  local_38 = 0;
  local_3c = 0xffffffff;
  if ((param_5 == (code *)0x0) ||
     (iVar1 = (*param_5)(param_2,param_3,*(undefined4 *)(param_7 + 8),&local_38,&local_3c),
     iVar1 != 0)) {
    a = (X509_PUBKEY *)FUN_00b3fb1c(param_2,param_3,local_38,local_3c,param_6);
    if (a == (X509_PUBKEY *)0x0) {
      uVar2 = 0;
    }
    else {
      uVar2 = i2d_X509_PUBKEY_bio(param_1,a);
    }
    X509_PUBKEY_free(a);
  }
  else {
    uVar2 = 0;
  }
  return uVar2;
}

