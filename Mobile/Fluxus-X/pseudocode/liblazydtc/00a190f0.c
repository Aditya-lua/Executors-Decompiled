/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a190f0
 */

int i2d_DHxparams(long param_1,uchar **param_2)

{
  int iVar1;
  BIGNUM *a;
  int local_84;
  int local_80 [2];
  long local_78 [2];
  int *local_68;
  BIGNUM *local_60;
  ASN1_VALUE aAStack_58 [8];
  undefined1 auStack_50 [8];
  undefined1 auStack_48 [8];
  undefined8 local_40;
  int **local_38;
  undefined8 local_28;
  
  local_68 = (int *)0x0;
  local_60 = (BIGNUM *)0x0;
  local_28 = 0;
  ossl_ffc_params_get0_pqg(param_1 + 8,aAStack_58,auStack_50,auStack_48);
  local_40 = *(undefined8 *)(param_1 + 0x20);
  ossl_ffc_params_get_validate_params(param_1 + 8,local_78,&local_28,&local_84);
  local_80[0] = (int)local_28;
  if ((((int)local_28 < 1) || (local_84 == -1)) || (local_78[0] == 0)) {
    local_38 = (int **)0x0;
  }
  else {
    local_68 = local_80;
    local_78[1] = 8;
    a = BN_new();
    if (a == (BIGNUM *)0x0) {
      return 0;
    }
    local_60 = a;
    iVar1 = BN_set_word(a,(long)local_84);
    if (iVar1 == 0) {
      iVar1 = 0;
      goto LAB_00a191c8;
    }
    local_38 = &local_68;
  }
  iVar1 = ASN1_item_i2d(aAStack_58,param_2,(ASN1_ITEM *)&DAT_00c59ff0);
  a = local_60;
LAB_00a191c8:
  BN_free(a);
  return iVar1;
}

