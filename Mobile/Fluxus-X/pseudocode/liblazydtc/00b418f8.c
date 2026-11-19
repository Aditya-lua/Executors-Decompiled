/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b418f8
 */

undefined8 FUN_00b418f8(BIO *param_1,undefined8 *param_2)

{
  int iVar1;
  char *param2;
  
  if (*(int *)((long)param_2 + 0x34) == 0) {
    iVar1 = FUN_00b41650(param_1,"P:   ",*param_2);
    if (iVar1 == 0) {
      return 0;
    }
    if ((param_2[1] != 0) && (iVar1 = FUN_00b41650(param_1,"Q:   "), iVar1 == 0)) {
      return 0;
    }
    iVar1 = FUN_00b41650(param_1,"G:   ",param_2[2]);
    if (iVar1 == 0) {
      return 0;
    }
    if ((param_2[3] != 0) && (iVar1 = FUN_00b41650(param_1,"J:   "), iVar1 == 0)) {
      return 0;
    }
    if ((param_2[4] != 0) &&
       (iVar1 = FUN_00b41a48(param_1,"SEED:",param_2[4],param_2[5]), iVar1 == 0)) {
      return 0;
    }
    if ((*(int *)(param_2 + 7) != -1) &&
       (iVar1 = BIO_printf(param_1,"gindex: %d\n",*(int *)(param_2 + 7)), iVar1 < 1)) {
      return 0;
    }
    if ((*(int *)(param_2 + 6) != -1) &&
       (iVar1 = BIO_printf(param_1,"pcounter: %d\n",*(int *)(param_2 + 6)), iVar1 < 1)) {
      return 0;
    }
    if (*(int *)((long)param_2 + 0x3c) == 0) {
      return 1;
    }
    iVar1 = BIO_printf(param_1,"h: %d\n",*(int *)((long)param_2 + 0x3c));
  }
  else {
    ossl_ffc_uid_to_dh_named_group(*(int *)((long)param_2 + 0x34));
    param2 = (char *)ossl_ffc_named_group_get_name();
    if (param2 == (char *)0x0) {
      return 0;
    }
    iVar1 = BIO_printf(param_1,"GROUP: %s\n",param2);
  }
  if (iVar1 < 1) {
    return 0;
  }
  return 1;
}

