/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fb168
 */

int BIO_ADDRINFO_protocol(long param_1)

{
  int iVar1;
  int iVar2;
  
  if (param_1 == 0) {
    return 0;
  }
  iVar1 = *(int *)(param_1 + 0xc);
  if ((iVar1 == 0) && (iVar1 = 0, *(int *)(param_1 + 4) != 1)) {
    iVar2 = 0x11;
    if (*(int *)(param_1 + 8) != 2) {
      iVar2 = 0;
    }
    iVar1 = 6;
    if (*(int *)(param_1 + 8) != 1) {
      iVar1 = iVar2;
    }
  }
  return iVar1;
}

