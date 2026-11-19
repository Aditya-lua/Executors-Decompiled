/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5538c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int ERR_set_mark(void)

{
  long lVar1;
  int iVar2;
  
  lVar1 = ossl_err_get_state_int();
  if (lVar1 == 0) {
    iVar2 = 0;
  }
  else {
    iVar2 = 0;
    if (*(int *)(lVar1 + 900) != *(int *)(lVar1 + 0x380)) {
      lVar1 = lVar1 + (long)*(int *)(lVar1 + 0x380) * 4;
      *(int *)(lVar1 + 0x40) = *(int *)(lVar1 + 0x40) + 1;
      iVar2 = 1;
    }
  }
  return iVar2;
}

