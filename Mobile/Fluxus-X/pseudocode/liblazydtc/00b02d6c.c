/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b02d6c
 */

undefined4 FUN_00b02d6c(long param_1,long param_2)

{
  int iVar1;
  char *pcVar2;
  undefined4 uVar3;
  int local_14;
  
  if (param_1 == 0) {
    uVar3 = 0x18;
  }
  else {
    iVar1 = OBJ_obj2nid(*(ASN1_OBJECT **)(param_2 + 0x20));
    iVar1 = OBJ_find_sigid_algs(iVar1,(int *)0x0,&local_14);
    if (iVar1 == 0) {
      uVar3 = 0x4c;
    }
    else {
      pcVar2 = OBJ_nid2sn(local_14);
      iVar1 = EVP_PKEY_is_a(param_1,pcVar2);
      uVar3 = 0;
      if (iVar1 == 0) {
        iVar1 = EVP_PKEY_is_a(param_1,&DAT_002db996);
        uVar3 = 0;
        if (local_14 != 0x390 || iVar1 == 0) {
          uVar3 = 0x4d;
        }
      }
    }
  }
  return uVar3;
}

