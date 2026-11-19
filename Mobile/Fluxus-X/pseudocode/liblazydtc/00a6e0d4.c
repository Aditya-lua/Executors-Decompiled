/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6e0d4
 */

undefined8 EVP_PKEY_type_names_do_all(int *param_1,code *param_2,undefined8 param_3)

{
  char *pcVar1;
  undefined8 uVar2;
  long lVar3;
  
  lVar3 = *(long *)(param_1 + 0x18);
  if (*param_1 == 0) {
    if (lVar3 != 0) goto LAB_00a6e114;
    uVar2 = 0;
  }
  else {
    if (lVar3 != 0) {
LAB_00a6e114:
      uVar2 = EVP_KEYMGMT_names_do_all(lVar3,param_2,param_3);
      return uVar2;
    }
    pcVar1 = OBJ_nid2sn(*param_1);
    (*param_2)(pcVar1,param_3);
    uVar2 = 1;
  }
  return uVar2;
}

