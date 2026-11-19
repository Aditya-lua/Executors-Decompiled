/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b62488
 */

undefined8
ossl_sm2_internal_sign(uchar *param_1,int param_2,uchar *param_3,int *param_4,undefined8 param_5)

{
  int iVar1;
  BIGNUM *a;
  ECDSA_SIG *sig;
  undefined8 uVar2;
  uchar *local_28;
  
  local_28 = param_3;
  if (param_3 == (uchar *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/sm2/sm2_sign.c",0x1c5,"ossl_sm2_internal_sign");
    ERR_set_error(0x35,0xc0102,0);
    sig = (ECDSA_SIG *)0x0;
    a = (BIGNUM *)0x0;
  }
  else {
    a = BN_bin2bn(param_1,param_2,(BIGNUM *)0x0);
    if (a == (BIGNUM *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/sm2/sm2_sign.c",0x1cb,"ossl_sm2_internal_sign");
      ERR_set_error(0x35,0x80003,0);
      sig = (ECDSA_SIG *)0x0;
    }
    else {
      sig = (ECDSA_SIG *)FUN_00b61d48(param_5,a);
      if (sig == (ECDSA_SIG *)0x0) {
        ERR_new();
        uVar2 = 0x1d1;
      }
      else {
        iVar1 = i2d_ECDSA_SIG(sig,&local_28);
        if (-1 < iVar1) {
          *param_4 = iVar1;
          uVar2 = 1;
          goto LAB_00b625b0;
        }
        ERR_new();
        uVar2 = 0x1d7;
      }
      ERR_set_debug("crypto/sm2/sm2_sign.c",uVar2,"ossl_sm2_internal_sign");
      ERR_set_error(0x35,0xc0103,0);
    }
  }
  uVar2 = 0xffffffff;
LAB_00b625b0:
  ECDSA_SIG_free(sig);
  BN_free(a);
  return uVar2;
}

