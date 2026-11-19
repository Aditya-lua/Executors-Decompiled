/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f9f8
 */

undefined8 ossl_ec_key_simple_oct2priv(long param_1,uchar *param_2,int param_3)

{
  undefined4 uVar1;
  BIGNUM *pBVar2;
  
  pBVar2 = *(BIGNUM **)(param_1 + 0x28);
  if (pBVar2 == (BIGNUM *)0x0) {
    pBVar2 = (BIGNUM *)BN_secure_new();
    *(BIGNUM **)(param_1 + 0x28) = pBVar2;
    if (pBVar2 == (BIGNUM *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_key.c",0x3bd,"ossl_ec_key_simple_oct2priv");
      uVar1 = 0xc0100;
      goto LAB_00a2faa4;
    }
  }
  pBVar2 = BN_bin2bn(param_2,param_3,pBVar2);
  if (pBVar2 != (BIGNUM *)0x0) {
    *(long *)(param_1 + 0x68) = *(long *)(param_1 + 0x68) + 1;
    return 1;
  }
  ERR_new();
  ERR_set_debug("crypto/ec/ec_key.c",0x3c1,"ossl_ec_key_simple_oct2priv");
  uVar1 = 0x80003;
LAB_00a2faa4:
  ERR_set_error(0x10,uVar1,0);
  return 0;
}

