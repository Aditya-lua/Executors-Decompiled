/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5c548
 */

void * FUN_00b5c548(void *param_1)

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
  __dest = (void *)CRYPTO_zalloc(0x178,"providers/implementations/signature/dsa_sig.c",0x198);
  if (__dest == (void *)0x0) {
    return (void *)0x0;
  }
  memcpy(__dest,param_1,0x178);
  *(undefined8 *)((long)__dest + 8) = 0;
  *(undefined8 *)((long)__dest + 0x10) = 0;
  *(undefined8 *)((long)__dest + 0x160) = 0;
  *(undefined8 *)((long)__dest + 0x168) = 0;
  uVar2 = 0;
  if (*(DSA **)((long)param_1 + 0x10) != (DSA *)0x0) {
    iVar1 = DSA_up_ref(*(DSA **)((long)param_1 + 0x10));
    if (iVar1 == 0) goto LAB_00b5c614;
    uVar2 = *(undefined8 *)((long)param_1 + 0x10);
  }
  *(undefined8 *)((long)__dest + 0x10) = uVar2;
  uVar2 = 0;
  if (*(long *)((long)param_1 + 0x160) != 0) {
    iVar1 = EVP_MD_up_ref();
    if (iVar1 == 0) goto LAB_00b5c614;
    uVar2 = *(undefined8 *)((long)param_1 + 0x160);
  }
  *(undefined8 *)((long)__dest + 0x160) = uVar2;
  if (*(long *)((long)param_1 + 0x168) != 0) {
    out = (EVP_MD_CTX *)EVP_MD_CTX_new();
    *(EVP_MD_CTX **)((long)__dest + 0x168) = out;
    if ((out == (EVP_MD_CTX *)0x0) ||
       (iVar1 = EVP_MD_CTX_copy_ex(out,*(EVP_MD_CTX **)((long)param_1 + 0x168)), iVar1 == 0))
    goto LAB_00b5c614;
  }
  if (*(char **)((long)param_1 + 8) == (char *)0x0) {
    return __dest;
  }
  pcVar3 = CRYPTO_strdup(*(char **)((long)param_1 + 8),
                         "providers/implementations/signature/dsa_sig.c",0x1b1);
  *(undefined8 *)((long)__dest + 8) = pcVar3;
  if (pcVar3 != (char *)0x0) {
    return __dest;
  }
LAB_00b5c614:
  CRYPTO_free(*(void **)((long)__dest + 8));
  EVP_MD_CTX_free(*(undefined8 *)((long)__dest + 0x168));
  EVP_MD_free(*(undefined8 *)((long)__dest + 0x160));
  *(undefined8 *)((long)__dest + 8) = 0;
  *(undefined8 *)((long)__dest + 0x160) = 0;
  *(undefined8 *)((long)__dest + 0x168) = 0;
  DSA_free(*(DSA **)((long)__dest + 0x10));
  CRYPTO_free(__dest);
  return (void *)0x0;
}

