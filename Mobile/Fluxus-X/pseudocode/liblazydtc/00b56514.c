/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b56514
 */

undefined8 FUN_00b56514(long param_1,undefined8 param_2)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  void *ptr;
  undefined8 uVar6;
  EVP_CIPHER_CTX *pEVar7;
  EVP_CIPHER_CTX *pEVar8;
  ulong uVar9;
  undefined8 *puVar10;
  undefined8 uVar11;
  long lVar12;
  long lVar13;
  int local_54;
  
  lVar13 = *(long *)(param_1 + 0xf8);
  uVar4 = ossl_prov_ctx_get0_libctx(*(undefined8 *)(param_1 + 8));
  lVar5 = OSSL_PARAM_locate_const(param_2,"use_derivation_function");
  if ((lVar5 == 0) || (iVar2 = OSSL_PARAM_get_int(lVar5,&local_54), iVar2 == 0)) {
    bVar1 = false;
  }
  else {
    bVar1 = true;
    *(uint *)(lVar13 + 0x30) = (uint)(local_54 != 0);
  }
  lVar5 = OSSL_PARAM_locate_const(param_2,"properties");
  if (lVar5 == 0) {
    uVar11 = 0;
  }
  else {
    if (*(int *)(lVar5 + 8) != 4) {
      return 0;
    }
    uVar11 = *(undefined8 *)(lVar5 + 0x10);
  }
  lVar5 = OSSL_PARAM_locate_const(param_2,"cipher");
  if (lVar5 == 0) {
    if (!bVar1) goto LAB_00b56930;
  }
  else {
    if (*(int *)(lVar5 + 8) != 4) {
      return 0;
    }
    if (*(ulong *)(lVar5 + 0x18) < 3) {
      return 0;
    }
    lVar12 = *(long *)(lVar5 + 0x10);
    iVar2 = OPENSSL_strcasecmp(&DAT_002ca822,lVar12 + *(ulong *)(lVar5 + 0x18) + -3);
    if (iVar2 != 0) {
      ERR_new();
      ERR_set_debug("providers/implementations/rands/drbg_ctr.c",0x2b6,"drbg_ctr_set_ctx_params");
      uVar4 = 0xce;
      goto LAB_00b5675c;
    }
    ptr = (void *)CRYPTO_strndup(lVar12,*(undefined8 *)(lVar5 + 0x18),
                                 "providers/implementations/rands/drbg_ctr.c",0x2b9);
    if (ptr == (void *)0x0) {
      ERR_new();
      ERR_set_debug("providers/implementations/rands/drbg_ctr.c",0x2ba,"drbg_ctr_set_ctx_params");
      uVar4 = 0xc0100;
      goto LAB_00b5675c;
    }
    *(undefined4 *)((long)ptr + *(long *)(lVar5 + 0x18) + -3) = 0x424345;
    EVP_CIPHER_free(*(undefined8 *)(lVar13 + 0x18));
    EVP_CIPHER_free(*(undefined8 *)(lVar13 + 0x20));
    uVar6 = EVP_CIPHER_fetch(uVar4,lVar12,uVar11);
    *(undefined8 *)(lVar13 + 0x20) = uVar6;
    uVar4 = EVP_CIPHER_fetch(uVar4,ptr,uVar11);
    *(undefined8 *)(lVar13 + 0x18) = uVar4;
    CRYPTO_free(ptr);
    if ((*(long *)(lVar13 + 0x20) == 0) || (*(long *)(lVar13 + 0x18) == 0)) {
      ERR_new();
      ERR_set_debug("providers/implementations/rands/drbg_ctr.c",0x2c4,"drbg_ctr_set_ctx_params");
      uVar4 = 0xcf;
      goto LAB_00b5675c;
    }
  }
  puVar10 = *(undefined8 **)(param_1 + 0xf8);
  if (puVar10[4] == 0) {
    ERR_new();
    ERR_set_debug("providers/implementations/rands/drbg_ctr.c",0x214,"drbg_ctr_init");
    uVar4 = 0x9b;
LAB_00b5675c:
    ERR_set_error(0x39,uVar4,0);
    return 0;
  }
  iVar2 = EVP_CIPHER_get_key_length();
  pEVar8 = (EVP_CIPHER_CTX *)*puVar10;
  puVar10[5] = (long)iVar2;
  if (pEVar8 == (EVP_CIPHER_CTX *)0x0) {
    pEVar8 = EVP_CIPHER_CTX_new();
    *puVar10 = pEVar8;
    lVar5 = puVar10[1];
    if (lVar5 != 0) goto LAB_00b56660;
LAB_00b56838:
    pEVar7 = EVP_CIPHER_CTX_new();
    pEVar8 = (EVP_CIPHER_CTX *)*puVar10;
    puVar10[1] = pEVar7;
    if (pEVar7 == (EVP_CIPHER_CTX *)0x0) goto LAB_00b56848;
LAB_00b56664:
    if (pEVar8 == (EVP_CIPHER_CTX *)0x0) goto LAB_00b56848;
    iVar3 = EVP_CipherInit_ex(pEVar8,(EVP_CIPHER *)puVar10[3],(ENGINE *)0x0,(uchar *)0x0,
                              (uchar *)0x0,1);
    if ((iVar3 == 0) ||
       (iVar3 = EVP_CipherInit_ex((EVP_CIPHER_CTX *)puVar10[1],(EVP_CIPHER *)puVar10[4],
                                  (ENGINE *)0x0,(uchar *)0x0,(uchar *)0x0,1), iVar3 == 0)) {
      ERR_new();
      ERR_set_debug("providers/implementations/rands/drbg_ctr.c",0x225,"drbg_ctr_init");
      uVar4 = 0xd0;
      goto LAB_00b56898;
    }
    *(int *)(param_1 + 0x80) = iVar2 << 3;
    *(long *)(param_1 + 0xe8) = (long)iVar2 + 0x10;
    if (*(int *)(puVar10 + 6) == 0) {
LAB_00b566f4:
      lVar5 = *(long *)(param_1 + 0xf8);
      *(undefined8 *)(param_1 + 0x88) = 0x10000;
      if (*(int *)(lVar5 + 0x30) == 0) {
        if (*(long *)(lVar5 + 0x28) == 0) {
          uVar4 = 0x7fffffff;
        }
        else {
          uVar4 = *(undefined8 *)(param_1 + 0xe8);
        }
        *(undefined8 *)(param_1 + 0x90) = uVar4;
        *(undefined8 *)(param_1 + 0x98) = uVar4;
        *(undefined8 *)(param_1 + 0xa0) = 0;
        *(undefined8 *)(param_1 + 0xa8) = 0;
        *(undefined8 *)(param_1 + 0xb0) = uVar4;
        *(undefined8 *)(param_1 + 0xb8) = uVar4;
      }
      else {
        *(undefined8 *)(param_1 + 0xb8) = 0x7fffffff;
        *(undefined8 *)(param_1 + 0xb0) = 0x7fffffff;
        *(undefined8 *)(param_1 + 0x98) = 0x7fffffff;
        *(undefined8 *)(param_1 + 0x90) = 0;
        *(undefined8 *)(param_1 + 0xa8) = 0x7fffffff;
        *(undefined8 *)(param_1 + 0xa0) = 0;
        uVar9 = *(ulong *)(lVar5 + 0x28);
        if (uVar9 != 0) {
          *(ulong *)(param_1 + 0x90) = uVar9;
          *(ulong *)(param_1 + 0xa0) = uVar9 >> 1;
        }
      }
LAB_00b56930:
      uVar4 = ossl_drbg_set_ctx_params(param_1,param_2);
      return uVar4;
    }
    pEVar8 = (EVP_CIPHER_CTX *)puVar10[2];
    if (pEVar8 != (EVP_CIPHER_CTX *)0x0) {
LAB_00b566d4:
      iVar2 = EVP_CipherInit_ex(pEVar8,(EVP_CIPHER *)puVar10[3],(ENGINE *)0x0,"",(uchar *)0x0,1);
      if (iVar2 == 0) {
        ERR_new();
        ERR_set_debug("providers/implementations/rands/drbg_ctr.c",0x23e,"drbg_ctr_init");
        uVar4 = 0xcd;
        goto LAB_00b56898;
      }
      goto LAB_00b566f4;
    }
    pEVar8 = EVP_CIPHER_CTX_new();
    puVar10[2] = pEVar8;
    if (pEVar8 != (EVP_CIPHER_CTX *)0x0) goto LAB_00b566d4;
    ERR_new();
    uVar4 = 0x238;
  }
  else {
    lVar5 = puVar10[1];
    if (lVar5 == 0) goto LAB_00b56838;
LAB_00b56660:
    if (lVar5 != 0) goto LAB_00b56664;
LAB_00b56848:
    ERR_new();
    uVar4 = 0x21d;
  }
  ERR_set_debug("providers/implementations/rands/drbg_ctr.c",uVar4,"drbg_ctr_init");
  uVar4 = 0xc0100;
LAB_00b56898:
  ERR_set_error(0x39,uVar4,0);
  EVP_CIPHER_CTX_free((EVP_CIPHER_CTX *)*puVar10);
  EVP_CIPHER_CTX_free((EVP_CIPHER_CTX *)puVar10[1]);
  *puVar10 = 0;
  puVar10[1] = 0;
  return 0;
}

