/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7cee4
 */

undefined8 ossl_ffc_validate_private_key(BIGNUM *param_1,BIGNUM *param_2,uint *param_3)

{
  int iVar1;
  BIGNUM *b;
  uint uVar2;
  
  uVar2 = 0x40;
  *param_3 = 0;
  if ((param_1 != (BIGNUM *)0x0) && (param_2 != (BIGNUM *)0x0)) {
    b = BN_value_one();
    iVar1 = BN_cmp(param_2,b);
    if (iVar1 < 0) {
      uVar2 = 0x10;
    }
    else {
      iVar1 = BN_cmp(param_2,param_1);
      if (iVar1 < 0) {
        return 1;
      }
      uVar2 = 0x20;
    }
    uVar2 = *param_3 | uVar2;
  }
  *param_3 = uVar2;
  return 0;
}

