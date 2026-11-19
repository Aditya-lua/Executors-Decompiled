/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae7bf0
 */

undefined8 * SRP_VBASE_get1_by_user(undefined8 *param_1,char *param_2)

{
  int iVar1;
  int iVar2;
  undefined8 *puVar3;
  undefined8 *ptr;
  char *pcVar4;
  EVP_MD *type;
  EVP_MD_CTX *ctx;
  size_t sVar5;
  BIGNUM *pBVar6;
  BIGNUM *pBVar7;
  char *pcVar8;
  undefined8 uVar9;
  uchar auStack_68 [20];
  uchar auStack_54 [20];
  
  if (param_1 == (undefined8 *)0x0) {
    return (undefined8 *)0x0;
  }
  iVar1 = OPENSSL_sk_num(*param_1);
  if (0 < iVar1) {
    iVar1 = 0;
    do {
      puVar3 = (undefined8 *)OPENSSL_sk_value(*param_1,iVar1);
      iVar2 = strcmp((char *)*puVar3,param_2);
      if (iVar2 == 0) {
        if (puVar3 != (undefined8 *)0x0) {
          ptr = CRYPTO_malloc(0x30,"crypto/srp/srp_vfy.c",0xc2);
          if (ptr == (undefined8 *)0x0) {
            return (undefined8 *)0x0;
          }
          ptr[3] = 0;
          ptr[2] = 0;
          ptr[5] = 0;
          ptr[4] = 0;
          ptr[1] = 0;
          *ptr = 0;
          uVar9 = puVar3[3];
          ptr[4] = puVar3[4];
          ptr[3] = uVar9;
          pcVar8 = (char *)*puVar3;
          pcVar4 = (char *)puVar3[5];
          CRYPTO_free((void *)0x0);
          CRYPTO_free((void *)ptr[5]);
          if (pcVar8 != (char *)0x0) {
            pcVar8 = CRYPTO_strdup(pcVar8,"crypto/srp/srp_vfy.c",0xdb);
            *ptr = pcVar8;
            if (pcVar8 == (char *)0x0) goto LAB_00ae7ef8;
          }
          if (pcVar4 != (char *)0x0) {
            pcVar4 = CRYPTO_strdup(pcVar4,"crypto/srp/srp_vfy.c",0xdd);
            ptr[5] = pcVar4;
            if (pcVar4 == (char *)0x0) goto LAB_00ae7ef8;
          }
          pBVar6 = BN_dup((BIGNUM *)puVar3[1]);
          pBVar7 = BN_dup((BIGNUM *)puVar3[2]);
          BN_free((BIGNUM *)ptr[1]);
          BN_clear_free((BIGNUM *)ptr[2]);
          ptr[1] = pBVar6;
          ptr[2] = pBVar7;
          if ((pBVar6 != (BIGNUM *)0x0) && (pBVar7 != (BIGNUM *)0x0)) {
            return ptr;
          }
          goto LAB_00ae7ef8;
        }
        break;
      }
      iVar1 = iVar1 + 1;
      iVar2 = OPENSSL_sk_num(*param_1);
    } while (iVar1 < iVar2);
  }
  if (param_1[2] == 0) {
    return (undefined8 *)0x0;
  }
  if (param_1[3] == 0) {
    return (undefined8 *)0x0;
  }
  if (param_1[4] == 0) {
    return (undefined8 *)0x0;
  }
  ptr = CRYPTO_malloc(0x30,"crypto/srp/srp_vfy.c",0xc2);
  if (ptr == (undefined8 *)0x0) {
    return (undefined8 *)0x0;
  }
  ptr[3] = 0;
  ptr[2] = 0;
  ptr[5] = 0;
  ptr[4] = 0;
  ptr[1] = 0;
  *ptr = 0;
  uVar9 = param_1[3];
  ptr[4] = param_1[4];
  ptr[3] = uVar9;
  CRYPTO_free((void *)0x0);
  CRYPTO_free((void *)ptr[5]);
  if (param_2 == (char *)0x0) {
LAB_00ae7dd4:
    iVar1 = RAND_priv_bytes(auStack_54,0x14);
    if (0 < iVar1) {
      type = (EVP_MD *)EVP_MD_fetch(0,&DAT_002d142e,0);
      if (type == (EVP_MD *)0x0) {
        ctx = (EVP_MD_CTX *)0x0;
        goto LAB_00ae7ee8;
      }
      ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
      if ((ctx == (EVP_MD_CTX *)0x0) ||
         (iVar1 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0), iVar1 == 0)) goto LAB_00ae7ee8;
      pcVar4 = (char *)param_1[2];
      sVar5 = strlen(pcVar4);
      iVar1 = EVP_DigestUpdate(ctx,pcVar4,sVar5);
      if (iVar1 == 0) goto LAB_00ae7ee8;
      sVar5 = strlen(param_2);
      iVar1 = EVP_DigestUpdate(ctx,param_2,sVar5);
      if ((iVar1 == 0) || (iVar1 = EVP_DigestFinal_ex(ctx,auStack_68,(uint *)0x0), iVar1 == 0))
      goto LAB_00ae7ee8;
      EVP_MD_CTX_free(ctx);
      EVP_MD_free(type);
      pBVar6 = BN_bin2bn(auStack_68,0x14,(BIGNUM *)0x0);
      pBVar7 = BN_bin2bn(auStack_54,0x14,(BIGNUM *)0x0);
      BN_free((BIGNUM *)ptr[1]);
      BN_clear_free((BIGNUM *)ptr[2]);
      ptr[1] = pBVar6;
      ptr[2] = pBVar7;
      if (pBVar6 != (BIGNUM *)0x0) {
        ctx = (EVP_MD_CTX *)0x0;
        type = (EVP_MD *)0x0;
        if (pBVar7 != (BIGNUM *)0x0) {
          return ptr;
        }
        goto LAB_00ae7ee8;
      }
    }
  }
  else {
    pcVar4 = CRYPTO_strdup(param_2,"crypto/srp/srp_vfy.c",0xdb);
    *ptr = pcVar4;
    if (pcVar4 != (char *)0x0) goto LAB_00ae7dd4;
  }
  ctx = (EVP_MD_CTX *)0x0;
  type = (EVP_MD *)0x0;
LAB_00ae7ee8:
  EVP_MD_free(type);
  EVP_MD_CTX_free(ctx);
LAB_00ae7ef8:
  BN_free((BIGNUM *)ptr[1]);
  BN_clear_free((BIGNUM *)ptr[2]);
  CRYPTO_free((void *)*ptr);
  CRYPTO_free((void *)ptr[5]);
  CRYPTO_free(ptr);
  return (undefined8 *)0x0;
}

