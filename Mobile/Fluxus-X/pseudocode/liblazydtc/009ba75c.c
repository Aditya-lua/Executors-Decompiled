/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ba75c
 */

bool FUN_009ba75c(long param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  
  if (*(long *)(param_1 + 0x18) == 0) {
    iVar1 = 1;
    lVar2 = *(long *)(param_1 + 0x20);
  }
  else {
    iVar1 = SSL_CTX_set_ciphersuites(*(long *)(param_1 + 0x18),param_2);
    lVar2 = *(long *)(param_1 + 0x20);
  }
  if (lVar2 != 0) {
    iVar1 = SSL_set_ciphersuites(lVar2,param_2);
  }
  return 0 < iVar1;
}

