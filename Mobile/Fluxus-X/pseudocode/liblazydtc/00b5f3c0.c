/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5f3c0
 */

void * FUN_00b5f3c0(void *param_1)

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
  __dest = (void *)CRYPTO_zalloc(0xc0,"providers/implementations/signature/rsa_sig.c",0x3df);
  if (__dest == (void *)0x0) {
    ERR_new();
    ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x3e1,"rsa_dupctx");
    ERR_set_error(0x39,0xc0100,0);
    return (void *)0x0;
  }
  memcpy(__dest,param_1,0xb8);
  *(undefined8 *)((long)__dest + 0x20) = 0;
  *(undefined8 *)((long)__dest + 0x70) = 0;
  *(undefined8 *)((long)__dest + 0xb8) = 0;
  *(undefined8 *)((long)__dest + 0x10) = 0;
  *(undefined8 *)((long)__dest + 8) = 0;
  *(undefined8 *)((long)__dest + 0x28) = 0;
  uVar2 = 0;
  if (*(RSA **)((long)param_1 + 0x10) != (RSA *)0x0) {
    iVar1 = RSA_up_ref(*(RSA **)((long)param_1 + 0x10));
    if (iVar1 == 0) goto LAB_00b5f4b0;
    uVar2 = *(undefined8 *)((long)param_1 + 0x10);
  }
  *(undefined8 *)((long)__dest + 0x10) = uVar2;
  uVar2 = 0;
  if (*(long *)((long)param_1 + 0x20) != 0) {
    iVar1 = EVP_MD_up_ref();
    if (iVar1 == 0) goto LAB_00b5f4b0;
    uVar2 = *(undefined8 *)((long)param_1 + 0x20);
  }
  *(undefined8 *)((long)__dest + 0x20) = uVar2;
  uVar2 = 0;
  if (*(long *)((long)param_1 + 0x70) != 0) {
    iVar1 = EVP_MD_up_ref();
    if (iVar1 == 0) goto LAB_00b5f4b0;
    uVar2 = *(undefined8 *)((long)param_1 + 0x70);
  }
  *(undefined8 *)((long)__dest + 0x70) = uVar2;
  if (*(long *)((long)param_1 + 0x28) != 0) {
    out = (EVP_MD_CTX *)EVP_MD_CTX_new();
    *(EVP_MD_CTX **)((long)__dest + 0x28) = out;
    if ((out == (EVP_MD_CTX *)0x0) ||
       (iVar1 = EVP_MD_CTX_copy_ex(out,*(EVP_MD_CTX **)((long)param_1 + 0x28)), iVar1 == 0))
    goto LAB_00b5f4b0;
  }
  if (*(char **)((long)param_1 + 8) == (char *)0x0) {
    return __dest;
  }
  pcVar3 = CRYPTO_strdup(*(char **)((long)param_1 + 8),
                         "providers/implementations/signature/rsa_sig.c",0x401);
  *(undefined8 *)((long)__dest + 8) = pcVar3;
  if (pcVar3 != (char *)0x0) {
    return __dest;
  }
LAB_00b5f4b0:
  FUN_00b5f318(__dest);
  return (void *)0x0;
}

