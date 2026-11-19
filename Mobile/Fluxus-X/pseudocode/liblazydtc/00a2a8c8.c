/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2a8c8
 */

ulong ossl_ec_GF2m_simple_cmp(EC_GROUP *param_1,EC_POINT *param_2,EC_POINT *param_3,BN_CTX *param_4)

{
  int iVar1;
  int iVar2;
  BIGNUM *a;
  BIGNUM *a_00;
  BIGNUM *b;
  BIGNUM *b_00;
  BN_CTX *c;
  ulong uVar3;
  
  iVar1 = EC_POINT_is_at_infinity(param_1,param_2);
  iVar2 = EC_POINT_is_at_infinity(param_1,param_3);
  if (iVar1 != 0) {
    return (ulong)(iVar2 == 0);
  }
  if (iVar2 == 0) {
    if ((*(int *)(param_2 + 0x28) == 0) || (*(int *)(param_3 + 0x28) == 0)) {
      c = (BN_CTX *)0x0;
      if ((param_4 == (BN_CTX *)0x0) &&
         (param_4 = BN_CTX_new(), c = param_4, param_4 == (BN_CTX *)0x0)) {
        return 0xffffffff;
      }
      BN_CTX_start(param_4);
      a = BN_CTX_get(param_4);
      a_00 = BN_CTX_get(param_4);
      b = BN_CTX_get(param_4);
      b_00 = BN_CTX_get(param_4);
      if (((b_00 == (BIGNUM *)0x0) ||
          (iVar1 = EC_POINT_get_affine_coordinates(param_1,param_2,a,a_00,param_4), iVar1 == 0)) ||
         (iVar1 = EC_POINT_get_affine_coordinates(param_1,param_3,b,b_00,param_4), iVar1 == 0)) {
        uVar3 = 0xffffffff;
      }
      else {
        iVar1 = BN_cmp(a,b);
        if (iVar1 == 0) {
          iVar1 = BN_cmp(a_00,b_00);
          uVar3 = (ulong)(iVar1 != 0);
        }
        else {
          uVar3 = 1;
        }
      }
      BN_CTX_end(param_4);
      BN_CTX_free(c);
      return uVar3;
    }
    iVar1 = BN_cmp(*(BIGNUM **)(param_2 + 0x10),*(BIGNUM **)(param_3 + 0x10));
    if (iVar1 == 0) {
      iVar1 = BN_cmp(*(BIGNUM **)(param_2 + 0x18),*(BIGNUM **)(param_3 + 0x18));
      return (ulong)(iVar1 != 0);
    }
  }
  return 1;
}

