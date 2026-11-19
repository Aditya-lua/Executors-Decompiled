/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ba870
 */

bool FUN_009ba870(byte *param_1,char *param_2)

{
  int iVar1;
  long lVar2;
  char *pcVar3;
  long *plVar4;
  ulong uVar5;
  int iVar6;
  
  if (*(SSL_CTX **)(param_1 + 0x18) == (SSL_CTX *)0x0) {
    plVar4 = (long *)0x0;
    iVar1 = 1;
    lVar2 = *(long *)(param_1 + 0x20);
  }
  else {
    iVar1 = SSL_CTX_use_certificate_chain_file(*(SSL_CTX **)(param_1 + 0x18),param_2);
    plVar4 = *(long **)(*(long *)(param_1 + 0x18) + 0x158);
    lVar2 = *(long *)(param_1 + 0x20);
  }
  if (lVar2 != 0) {
    iVar1 = SSL_use_certificate_chain_file(lVar2,param_2);
    plVar4 = *(long **)(*(long *)(param_1 + 0x20) + 0x898);
  }
  iVar6 = iVar1;
  if (((plVar4 != (long *)0x0) && (0 < iVar1)) && ((*param_1 >> 6 & 1) != 0)) {
    uVar5 = (ulong)(*plVar4 - (long)(plVar4 + 4)) >> 3;
    CRYPTO_free(*(void **)(param_1 + uVar5 * 0x6666666666666668 + 0x30));
    pcVar3 = CRYPTO_strdup(param_2,"ssl/ssl_conf.c",0x1bc);
    iVar6 = 0;
    if (pcVar3 != (char *)0x0) {
      iVar6 = iVar1;
    }
    *(char **)(param_1 + uVar5 * 0x6666666666666668 + 0x30) = pcVar3;
  }
  return 0 < iVar6;
}

