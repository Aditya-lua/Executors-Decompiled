/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b625d4
 */

undefined4
ossl_sm2_internal_verify(uchar *param_1,int param_2,uchar *param_3,int param_4,undefined8 param_5)

{
  int iVar1;
  undefined4 uVar2;
  ECDSA_SIG *pEVar3;
  undefined8 uVar4;
  BIGNUM *a;
  uchar *local_58;
  uchar *puStack_50;
  ECDSA_SIG *local_48;
  
  local_58 = (uchar *)0x0;
  puStack_50 = param_3;
  local_48 = ECDSA_SIG_new();
  if (local_48 == (ECDSA_SIG *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/sm2/sm2_sign.c",0x1f1,"ossl_sm2_internal_verify");
    uVar4 = 0xc0100;
LAB_00b626bc:
    ERR_set_error(0x35,uVar4,0);
    a = (BIGNUM *)0x0;
  }
  else {
    pEVar3 = d2i_ECDSA_SIG(&local_48,&puStack_50,(long)param_4);
    if (pEVar3 == (ECDSA_SIG *)0x0) {
      ERR_new();
      uVar4 = 0x1f5;
LAB_00b626b0:
      ERR_set_debug("crypto/sm2/sm2_sign.c",uVar4,"ossl_sm2_internal_verify");
      uVar4 = 0x68;
      goto LAB_00b626bc;
    }
    iVar1 = i2d_ECDSA_SIG(local_48,&local_58);
    if ((iVar1 != param_4) || (iVar1 = memcmp(param_3,local_58,(long)param_4), iVar1 != 0)) {
      ERR_new();
      uVar4 = 0x1fb;
      goto LAB_00b626b0;
    }
    a = BN_bin2bn(param_1,param_2,(BIGNUM *)0x0);
    if (a != (BIGNUM *)0x0) {
      uVar2 = FUN_00b621b0(param_5,local_48,a);
      goto LAB_00b626cc;
    }
    ERR_new();
    ERR_set_debug("crypto/sm2/sm2_sign.c",0x201,"ossl_sm2_internal_verify");
    ERR_set_error(0x35,0x80003,0);
  }
  uVar2 = 0xffffffff;
LAB_00b626cc:
  CRYPTO_free(local_58);
  BN_free(a);
  ECDSA_SIG_free(local_48);
  return uVar2;
}

