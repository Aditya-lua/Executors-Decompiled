/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5c100
 */

int EVP_CIPHER_CTX_ctrl(EVP_CIPHER_CTX *ctx,int type,int arg,void *ptr)

{
  int iVar1;
  char *pcVar2;
  EVP_CIPHER *pEVar3;
  undefined8 uVar4;
  EVP_CIPHER *pEVar5;
  long lVar6;
  undefined8 local_128;
  undefined8 uStack_120;
  undefined8 local_118;
  undefined8 uStack_110;
  undefined8 local_108;
  undefined8 local_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 local_e0;
  undefined8 local_d8;
  undefined8 uStack_d0;
  undefined8 local_c8;
  undefined8 uStack_c0;
  undefined8 local_b8;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  int local_5c;
  long local_58;
  
  lVar6 = (long)arg;
  local_58 = lVar6;
  memset(&local_100,0,0xa0);
  if ((ctx == (EVP_CIPHER_CTX *)0x0) || (pEVar5 = ctx->cipher, pEVar5 == (EVP_CIPHER *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/evp/evp_enc.c",0x450,"EVP_CIPHER_CTX_ctrl");
    uVar4 = 0x83;
    goto LAB_00a5c1bc;
  }
  if (pEVar5[1].do_cipher == (_func_1090 *)0x0) {
    if (pEVar5->app_data != (code *)0x0) {
      iVar1 = (*pEVar5->app_data)(ctx,type,arg,ptr);
      goto LAB_00a5c700;
    }
    ERR_new();
    ERR_set_debug("crypto/evp/evp_enc.c",0x506,"EVP_CIPHER_CTX_ctrl");
    uVar4 = 0x84;
    goto LAB_00a5c1bc;
  }
  iVar1 = 1;
  switch(type) {
  case 0:
    goto switchD_00a5c17c_caseD_0;
  case 1:
    OSSL_PARAM_construct_size_t(&local_128,"keylen",&local_58);
    goto LAB_00a5c6dc;
  case 2:
    iVar1 = 0;
  case 3:
    OSSL_PARAM_construct_size_t(&local_128,"keybits",&local_58);
LAB_00a5c2a0:
    local_e0 = local_108;
    uStack_f8 = uStack_120;
    local_100 = local_128;
    uStack_e8 = uStack_110;
    uStack_f0 = local_118;
    pEVar5 = ctx->cipher;
    pEVar3 = ctx[1].cipher;
    if (iVar1 != 0) goto LAB_00a5c6fc;
LAB_00a5c318:
    iVar1 = evp_do_ciph_ctx_getparams(pEVar5,pEVar3,&local_100);
    goto LAB_00a5c700;
  case 4:
    iVar1 = 0;
  case 5:
    if (-1 < arg) {
      local_5c = arg;
      OSSL_PARAM_construct_uint(&local_128,"rounds",&local_5c);
      goto LAB_00a5c2a0;
    }
    goto LAB_00a5c1c4;
  case 6:
    pcVar2 = "randkey";
    goto LAB_00a5c2e8;
  default:
    goto switchD_00a5c17c_caseD_7;
  case 9:
    if (-1 < arg) goto LAB_00a5c340;
    goto LAB_00a5c1c4;
  case 0x10:
    iVar1 = 0;
  case 0x11:
    OSSL_PARAM_construct_octet_string(&local_128,&DAT_002c5a75,ptr,lVar6);
    goto LAB_00a5c2a0;
  case 0x12:
    pcVar2 = "tlsivfixed";
    break;
  case 0x13:
    if (arg < 0) {
      lVar6 = 0;
      local_58 = 0;
    }
    pcVar2 = "tlsivgen";
LAB_00a5c2e8:
    OSSL_PARAM_construct_octet_string(&local_128,pcVar2,ptr,lVar6);
    local_e0 = local_108;
    uStack_f8 = uStack_120;
    local_100 = local_128;
    uStack_e8 = uStack_110;
    uStack_f0 = local_118;
    pEVar5 = ctx->cipher;
    pEVar3 = ctx[1].cipher;
    goto LAB_00a5c318;
  case 0x14:
    if (6 < arg - 2U) {
      return 0;
    }
    local_58 = (long)(0xf - arg);
LAB_00a5c340:
    OSSL_PARAM_construct_size_t(&local_128,"ivlen",&local_58);
    local_e0 = local_108;
    uStack_f8 = uStack_120;
    local_100 = local_128;
    uStack_e8 = uStack_110;
    uStack_f0 = local_118;
    *(undefined4 *)&ctx->field_0x6c = 0xffffffff;
    goto LAB_00a5c6f0;
  case 0x16:
    OSSL_PARAM_construct_octet_string(&local_128,"tlsaad",ptr,lVar6);
    local_e0 = local_108;
    uStack_f8 = uStack_120;
    local_100 = local_128;
    uStack_e8 = uStack_110;
    uStack_f0 = local_118;
    iVar1 = evp_do_ciph_ctx_setparams(ctx->cipher,ctx[1].cipher,&local_100);
    if (0 < iVar1) {
      OSSL_PARAM_construct_size_t(&local_128,"tlsaadpad",&local_58);
      local_e0 = local_108;
      uStack_f8 = uStack_120;
      local_100 = local_128;
      uStack_e8 = uStack_110;
      uStack_f0 = local_118;
      iVar1 = evp_do_ciph_ctx_getparams(ctx->cipher,ctx[1].cipher,&local_100);
      if (0 < iVar1) goto LAB_00a5c6b8;
    }
    goto LAB_00a5c700;
  case 0x17:
    if (arg < 0) {
      return -1;
    }
    pcVar2 = "mackey";
    break;
  case 0x18:
    if (arg < 0) goto LAB_00a5c1c4;
    pcVar2 = "tlsivinv";
    break;
  case 0x19:
    if (arg < 0x20) {
      return 0;
    }
    OSSL_PARAM_construct_octet_string
              (&local_128,"tls1multi_aad",*(undefined8 *)((long)ptr + 8),
               *(undefined8 *)((long)ptr + 0x10));
    local_e0 = local_108;
    uStack_f8 = uStack_120;
    local_100 = local_128;
    uStack_e8 = uStack_110;
    uStack_f0 = local_118;
    OSSL_PARAM_construct_uint(&local_128,"tls1multi_interleave",(long)ptr + 0x18);
    local_b8 = local_108;
    uStack_c0 = uStack_110;
    local_c8 = local_118;
    uStack_d0 = uStack_120;
    local_d8 = local_128;
    iVar1 = evp_do_ciph_ctx_setparams(ctx->cipher,ctx[1].cipher,&local_100);
    if (iVar1 < 1) {
      return iVar1;
    }
    OSSL_PARAM_construct_size_t(&local_128,"tls1multi_aadpacklen",&local_58);
    local_e0 = local_108;
    uStack_f8 = uStack_120;
    local_100 = local_128;
    uStack_e8 = uStack_110;
    uStack_f0 = local_118;
    OSSL_PARAM_construct_uint(&local_128,"tls1multi_interleave",(long)ptr + 0x18);
    local_b8 = local_108;
    uStack_d0 = uStack_120;
    local_d8 = local_128;
    uStack_c0 = uStack_110;
    local_c8 = local_118;
    OSSL_PARAM_construct_end(&local_128);
    local_90 = local_108;
    uStack_98 = uStack_110;
    local_a0 = local_118;
    uStack_a8 = uStack_120;
    local_b0 = local_128;
    goto LAB_00a5c6a4;
  case 0x1a:
    OSSL_PARAM_construct_octet_string
              (&local_128,"tls1multi_enc",*(undefined8 *)ptr,*(undefined8 *)((long)ptr + 0x10));
    local_e0 = local_108;
    uStack_f8 = uStack_120;
    local_100 = local_128;
    uStack_e8 = uStack_110;
    uStack_f0 = local_118;
    OSSL_PARAM_construct_octet_string
              (&local_128,"tls1multi_encin",*(undefined8 *)((long)ptr + 8),
               *(undefined8 *)((long)ptr + 0x10));
    local_b8 = local_108;
    uStack_c0 = uStack_110;
    local_c8 = local_118;
    uStack_d0 = uStack_120;
    local_d8 = local_128;
    OSSL_PARAM_construct_uint(&local_128,"tls1multi_interleave",(long)ptr + 0x18);
    local_90 = local_108;
    uStack_98 = uStack_110;
    local_a0 = local_118;
    uStack_a8 = uStack_120;
    local_b0 = local_128;
    iVar1 = evp_do_ciph_ctx_setparams(ctx->cipher,ctx[1].cipher,&local_100);
    if (iVar1 < 1) {
      return iVar1;
    }
    OSSL_PARAM_construct_size_t(&local_128,"tls1multi_enclen",&local_58);
    local_e0 = local_108;
    uStack_f8 = uStack_120;
    local_100 = local_128;
    uStack_e8 = uStack_110;
    uStack_f0 = local_118;
    OSSL_PARAM_construct_end(&local_128);
    local_b8 = local_108;
    uStack_d0 = uStack_120;
    local_d8 = local_128;
    uStack_c0 = uStack_110;
    local_c8 = local_118;
    goto LAB_00a5c6a4;
  case 0x1c:
    OSSL_PARAM_construct_size_t(&local_128,"tls1multi_maxsndfrag",&local_58);
    local_e0 = local_108;
    uStack_f8 = uStack_120;
    local_100 = local_128;
    uStack_e8 = uStack_110;
    uStack_f0 = local_118;
    iVar1 = evp_do_ciph_ctx_setparams(ctx->cipher,ctx[1].cipher,&local_100);
    if (iVar1 < 1) goto LAB_00a5c1c4;
    OSSL_PARAM_construct_size_t(&local_128,"tls1multi_maxbufsz",&local_58);
    local_e0 = local_108;
    uStack_f8 = uStack_120;
    local_100 = local_128;
    uStack_e8 = uStack_110;
    uStack_f0 = local_118;
    OSSL_PARAM_construct_end(&local_128);
    local_b8 = local_108;
    uStack_c0 = uStack_110;
    local_c8 = local_118;
    uStack_d0 = uStack_120;
    local_d8 = local_128;
LAB_00a5c6a4:
    iVar1 = evp_do_ciph_ctx_getparams(ctx->cipher,ctx[1].cipher,&local_100);
    if (0 < iVar1) {
LAB_00a5c6b8:
      return (int)local_58;
    }
    goto LAB_00a5c1c4;
  case 0x27:
    if (arg < 0) goto LAB_00a5c1c4;
    local_5c = arg;
    OSSL_PARAM_construct_uint(&local_128,"speed",&local_5c);
    goto LAB_00a5c6dc;
  }
  OSSL_PARAM_construct_octet_string(&local_128,pcVar2,ptr,lVar6);
LAB_00a5c6dc:
  local_e0 = local_108;
  uStack_f8 = uStack_120;
  local_100 = local_128;
  uStack_e8 = uStack_110;
  uStack_f0 = local_118;
LAB_00a5c6f0:
  pEVar5 = ctx->cipher;
  pEVar3 = ctx[1].cipher;
LAB_00a5c6fc:
  iVar1 = evp_do_ciph_ctx_setparams(pEVar5,pEVar3,&local_100);
LAB_00a5c700:
  if (iVar1 == -1) {
switchD_00a5c17c_caseD_7:
    ERR_new();
    ERR_set_debug("crypto/evp/evp_enc.c",0x50e,"EVP_CIPHER_CTX_ctrl");
    uVar4 = 0x85;
LAB_00a5c1bc:
    ERR_set_error(6,uVar4,0);
LAB_00a5c1c4:
    iVar1 = 0;
  }
switchD_00a5c17c_caseD_0:
  return iVar1;
}

