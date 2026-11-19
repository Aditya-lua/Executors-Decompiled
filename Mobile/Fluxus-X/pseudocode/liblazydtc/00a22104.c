/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a22104
 */

undefined8
ossl_dsa_sign_int(undefined8 param_1,undefined8 param_2,undefined4 param_3,uchar *param_4,
                 uint *param_5,long param_6)

{
  uint uVar1;
  DSA_METHOD *pDVar2;
  DSA_SIG *a;
  DSA_METHOD *pDVar3;
  DSA_SIG local_50;
  uchar *puStack_38;
  
  puStack_38 = param_4;
  if (param_4 == (uchar *)0x0) {
    local_50.r = *(BIGNUM **)(param_6 + 0x10);
    if (local_50.r == (BIGNUM *)0x0) {
      uVar1 = 0xffffffff;
    }
    else {
      local_50.s = local_50.r;
      uVar1 = i2d_DSA_SIG(&local_50,(uchar **)0x0);
      uVar1 = uVar1 & ((int)uVar1 >> 0x1f ^ 0xffffffffU);
    }
    *param_5 = uVar1;
  }
  else {
    if ((*(long *)(param_6 + 0xb8) == 0) ||
       (pDVar3 = *(DSA_METHOD **)(param_6 + 0xa0), pDVar2 = DSA_get_default_method(),
       pDVar3 != pDVar2)) {
      a = (DSA_SIG *)(**(code **)(*(long *)(param_6 + 0xa0) + 8))(param_2,param_3,param_6);
    }
    else {
      a = (DSA_SIG *)ossl_dsa_do_sign_int(param_2,param_3,param_6);
    }
    if (a == (DSA_SIG *)0x0) {
      *param_5 = 0;
      return 0;
    }
    uVar1 = i2d_DSA_SIG(a,&puStack_38);
    *param_5 = uVar1;
    BN_clear_free(a->r);
    BN_clear_free(a->s);
    CRYPTO_free(a);
  }
  return 1;
}

