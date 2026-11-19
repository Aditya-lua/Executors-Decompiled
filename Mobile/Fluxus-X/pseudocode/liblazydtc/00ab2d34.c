/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab2d34
 */

int FUN_00ab2d34(X509 *param_1,int param_2,X509_STORE *param_3,uint param_4,stack_st_X509 *param_5,
                undefined8 *param_6)

{
  undefined4 uVar1;
  int iVar2;
  int iVar3;
  X509_STORE_CTX *ctx;
  X509_VERIFY_PARAM *param;
  stack_st_X509 *psVar4;
  char *pcVar5;
  
  ctx = X509_STORE_CTX_new();
  if (ctx == (X509_STORE_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ocsp/ocsp_vfy.c",0x27,"ocsp_verify_signer");
    uVar1 = 0xc0100;
LAB_00ab2e60:
    ERR_set_error(0x27,uVar1,0);
  }
  else {
    iVar2 = X509_STORE_CTX_init(ctx,param_3,param_1,param_5);
    if (iVar2 == 0) {
      ERR_new();
      ERR_set_debug("crypto/ocsp/ocsp_vfy.c",0x2b,"ocsp_verify_signer");
      uVar1 = 0x8000b;
      goto LAB_00ab2e60;
    }
    param = X509_STORE_CTX_get0_param(ctx);
    if (param != (X509_VERIFY_PARAM *)0x0) {
      if ((param_4 >> 0xc & 1) != 0) {
        X509_VERIFY_PARAM_set_flags(param,0x80000);
      }
      if ((param_2 != 0) && (iVar2 = X509_get_ext_by_NID(param_1,0x171,-1), -1 < iVar2)) {
        X509_VERIFY_PARAM_clear_flags(param,4);
      }
      X509_STORE_CTX_set_purpose(ctx,8);
      X509_STORE_CTX_set_trust(ctx,7);
      iVar2 = X509_verify_cert(ctx);
      if (iVar2 < 1) {
        iVar3 = X509_STORE_CTX_get_error(ctx);
        ERR_new();
        ERR_set_debug("crypto/ocsp/ocsp_vfy.c",0x40,"ocsp_verify_signer");
        pcVar5 = X509_verify_cert_error_string((long)iVar3);
        ERR_set_error(0x27,0x65,"Verify error: %s",pcVar5);
      }
      else if (param_6 != (undefined8 *)0x0) {
        psVar4 = X509_STORE_CTX_get1_chain(ctx);
        *param_6 = psVar4;
      }
      goto LAB_00ab2e6c;
    }
  }
  iVar2 = -1;
LAB_00ab2e6c:
  X509_STORE_CTX_free(ctx);
  return iVar2;
}

