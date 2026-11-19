/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ada1c4
 */

bool ossl_rsa_check_private_exponent(long param_1,int param_2,BN_CTX *param_3)

{
  bool bVar1;
  int iVar2;
  BIGNUM *r;
  BIGNUM *a;
  BIGNUM *a_00;
  BIGNUM *b;
  BIGNUM *pBVar3;
  BIGNUM *a_01;
  
  iVar2 = BN_num_bits(*(BIGNUM **)(param_1 + 0x38));
  if (iVar2 <= param_2 >> 1) {
    return false;
  }
  BN_CTX_start(param_3);
  r = BN_CTX_get(param_3);
  a = BN_CTX_get(param_3);
  a_00 = BN_CTX_get(param_3);
  b = BN_CTX_get(param_3);
  pBVar3 = BN_CTX_get(param_3);
  a_01 = BN_CTX_get(param_3);
  if (a_01 != (BIGNUM *)0x0) {
    BN_set_flags(r,4);
    BN_set_flags(a,4);
    BN_set_flags(a_00,4);
    BN_set_flags(b,4);
    BN_set_flags(pBVar3,4);
    BN_set_flags(a_01,4);
    iVar2 = ossl_rsa_get_lcm(param_3,*(undefined8 *)(param_1 + 0x40),*(undefined8 *)(param_1 + 0x48)
                             ,b,a_01,a,a_00,pBVar3);
    bVar1 = false;
    if (iVar2 != 1) goto LAB_00ada308;
    iVar2 = BN_cmp(*(BIGNUM **)(param_1 + 0x38),b);
    bVar1 = false;
    if (-1 < iVar2) goto LAB_00ada308;
    iVar2 = BN_mod_mul(r,*(BIGNUM **)(param_1 + 0x30),*(BIGNUM **)(param_1 + 0x38),b,param_3);
    if (iVar2 != 0) {
      iVar2 = BN_is_one(r);
      bVar1 = iVar2 != 0;
      goto LAB_00ada308;
    }
  }
  bVar1 = false;
LAB_00ada308:
  BN_clear(r);
  BN_clear(a);
  BN_clear(a_00);
  BN_clear(b);
  BN_clear(a_01);
  BN_CTX_end(param_3);
  return bVar1;
}

