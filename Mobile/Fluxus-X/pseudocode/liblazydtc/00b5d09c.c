/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5d09c
 */

void * FUN_00b5d09c(void *param_1)

{
  int iVar1;
  void *__dest;
  undefined8 uVar2;
  EVP_MD_CTX *out;
  char *pcVar3;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 == 0) {
    return (void *)0x0;
  }
  __dest = (void *)CRYPTO_zalloc(400,"providers/implementations/signature/ecdsa_sig.c",0x18e);
  if (__dest == (void *)0x0) {
    return (void *)0x0;
  }
  memcpy(__dest,param_1,400);
  *(undefined8 *)((long)__dest + 8) = 0;
  *(undefined8 *)((long)__dest + 0x10) = 0;
  *(undefined8 *)((long)__dest + 0x170) = 0;
  *(undefined8 *)((long)__dest + 0x178) = 0;
  if ((((*(EC_KEY **)((long)param_1 + 0x10) == (EC_KEY *)0x0) ||
       (iVar1 = EC_KEY_up_ref(*(EC_KEY **)((long)param_1 + 0x10)), iVar1 != 0)) &&
      (*(long *)((long)param_1 + 0x180) == 0)) && (*(long *)((long)param_1 + 0x188) == 0)) {
    *(undefined8 *)((long)__dest + 0x10) = *(undefined8 *)((long)param_1 + 0x10);
    uVar2 = 0;
    if (*(long *)((long)param_1 + 0x170) != 0) {
      iVar1 = EVP_MD_up_ref();
      if (iVar1 == 0) goto LAB_00b5d118;
      uVar2 = *(undefined8 *)((long)param_1 + 0x170);
    }
    *(undefined8 *)((long)__dest + 0x170) = uVar2;
    if (*(long *)((long)param_1 + 0x178) != 0) {
      out = (EVP_MD_CTX *)EVP_MD_CTX_new();
      *(EVP_MD_CTX **)((long)__dest + 0x178) = out;
      if ((out == (EVP_MD_CTX *)0x0) ||
         (iVar1 = EVP_MD_CTX_copy_ex(out,*(EVP_MD_CTX **)((long)param_1 + 0x178)), iVar1 == 0))
      goto LAB_00b5d118;
    }
    if (*(char **)((long)param_1 + 8) == (char *)0x0) {
      return __dest;
    }
    pcVar3 = CRYPTO_strdup(*(char **)((long)param_1 + 8),
                           "providers/implementations/signature/ecdsa_sig.c",0x1ab);
    *(undefined8 *)((long)__dest + 8) = pcVar3;
    if (pcVar3 != (char *)0x0) {
      return __dest;
    }
  }
LAB_00b5d118:
  CRYPTO_free(*(void **)((long)__dest + 8));
  EVP_MD_CTX_free(*(undefined8 *)((long)__dest + 0x178));
  EVP_MD_free(*(undefined8 *)((long)__dest + 0x170));
  *(undefined8 *)((long)__dest + 8) = 0;
  *(undefined8 *)((long)__dest + 0x160) = 0;
  *(undefined8 *)((long)__dest + 0x170) = 0;
  *(undefined8 *)((long)__dest + 0x178) = 0;
  EC_KEY_free(*(EC_KEY **)((long)__dest + 0x10));
  BN_clear_free(*(BIGNUM **)((long)__dest + 0x180));
  BN_clear_free(*(BIGNUM **)((long)__dest + 0x188));
  CRYPTO_free(__dest);
  return (void *)0x0;
}

