/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ba630
 */

bool FUN_009ba630(uint *param_1,char *param_2)

{
  uint uVar1;
  int iVar2;
  char *pcVar3;
  long lVar4;
  
  uVar1 = *param_1;
  if ((uVar1 >> 1 & 1) != 0) {
    iVar2 = OPENSSL_strcasecmp(param_2,"+automatic");
    if (iVar2 == 0) {
      return true;
    }
    iVar2 = OPENSSL_strcasecmp(param_2,"automatic");
    if (iVar2 == 0) {
      return true;
    }
    uVar1 = *param_1;
  }
  if (((uVar1 & 1) != 0) && (iVar2 = strcmp(param_2,"auto"), iVar2 == 0)) {
    return true;
  }
  pcVar3 = strchr(param_2,0x3a);
  if (pcVar3 != (char *)0x0) {
    return false;
  }
  if (*(SSL_CTX **)(param_1 + 6) == (SSL_CTX *)0x0) {
    if (*(SSL **)(param_1 + 8) == (SSL *)0x0) {
      iVar2 = 1;
    }
    else {
      lVar4 = SSL_ctrl(*(SSL **)(param_1 + 8),0x5c,0,param_2);
      iVar2 = (int)lVar4;
    }
  }
  else {
    lVar4 = SSL_CTX_ctrl(*(SSL_CTX **)(param_1 + 6),0x5c,0,param_2);
    iVar2 = (int)lVar4;
  }
  return 0 < iVar2;
}

