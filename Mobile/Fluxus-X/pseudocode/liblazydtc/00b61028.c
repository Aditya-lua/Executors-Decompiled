/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b61028
 */

void * FUN_00b61028(void *param_1)

{
  int iVar1;
  void *__dest;
  undefined8 uVar2;
  char *pcVar3;
  EVP_MD_CTX *out;
  void *__dest_00;
  
  __dest = (void *)CRYPTO_zalloc(0x188,"providers/implementations/signature/sm2_sig.c",0x157);
  if (__dest == (void *)0x0) {
    return (void *)0x0;
  }
  memcpy(__dest,param_1,0x188);
  *(undefined8 *)((long)__dest + 8) = 0;
  *(undefined8 *)((long)__dest + 0x178) = 0;
  *(undefined8 *)((long)__dest + 0x10) = 0;
  *(undefined8 *)((long)__dest + 0x160) = 0;
  *(undefined8 *)((long)__dest + 0x168) = 0;
  uVar2 = 0;
  if (*(EC_KEY **)((long)param_1 + 0x10) != (EC_KEY *)0x0) {
    iVar1 = EC_KEY_up_ref(*(EC_KEY **)((long)param_1 + 0x10));
    if (iVar1 == 0) goto LAB_00b61128;
    uVar2 = *(undefined8 *)((long)param_1 + 0x10);
  }
  *(undefined8 *)((long)__dest + 0x10) = uVar2;
  if (*(char **)((long)param_1 + 8) != (char *)0x0) {
    pcVar3 = CRYPTO_strdup(*(char **)((long)param_1 + 8),
                           "providers/implementations/signature/sm2_sig.c",0x167);
    *(undefined8 *)((long)__dest + 8) = pcVar3;
    if (pcVar3 == (char *)0x0) goto LAB_00b61128;
  }
  uVar2 = 0;
  if (*(long *)((long)param_1 + 0x160) != 0) {
    iVar1 = EVP_MD_up_ref();
    if (iVar1 == 0) goto LAB_00b61128;
    uVar2 = *(undefined8 *)((long)param_1 + 0x160);
  }
  *(undefined8 *)((long)__dest + 0x160) = uVar2;
  if (*(long *)((long)param_1 + 0x168) != 0) {
    out = (EVP_MD_CTX *)EVP_MD_CTX_new();
    *(EVP_MD_CTX **)((long)__dest + 0x168) = out;
    if ((out == (EVP_MD_CTX *)0x0) ||
       (iVar1 = EVP_MD_CTX_copy_ex(out,*(EVP_MD_CTX **)((long)param_1 + 0x168)), iVar1 == 0))
    goto LAB_00b61128;
  }
  if (*(long *)((long)param_1 + 0x178) == 0) {
    return __dest;
  }
  __dest_00 = CRYPTO_malloc((int)*(undefined8 *)((long)param_1 + 0x180),
                            "providers/implementations/signature/sm2_sig.c",0x178);
  *(void **)((long)__dest + 0x178) = __dest_00;
  if (__dest_00 != (void *)0x0) {
    *(undefined8 *)((long)__dest + 0x180) = *(undefined8 *)((long)param_1 + 0x180);
    memcpy(__dest_00,*(void **)((long)param_1 + 0x178),*(size_t *)((long)param_1 + 0x180));
    return __dest;
  }
LAB_00b61128:
  EVP_MD_CTX_free(*(undefined8 *)((long)__dest + 0x168));
  EVP_MD_free(*(undefined8 *)((long)__dest + 0x160));
  *(undefined8 *)((long)__dest + 0x160) = 0;
  *(undefined8 *)((long)__dest + 0x168) = 0;
  EC_KEY_free(*(EC_KEY **)((long)__dest + 0x10));
  CRYPTO_free(*(void **)((long)__dest + 8));
  CRYPTO_free(*(void **)((long)__dest + 0x178));
  CRYPTO_free(__dest);
  return (void *)0x0;
}

