/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bab0c
 */

undefined8 FUN_009bab0c(long param_1,long param_2)

{
  X509_STORE *pXVar1;
  undefined8 uVar2;
  long *plVar3;
  long lVar4;
  
  if (*(long *)(param_1 + 0x18) == 0) {
    if (*(long *)(param_1 + 0x20) == 0) {
      return 1;
    }
    plVar3 = (long *)(*(long *)(param_1 + 0x20) + 0x898);
  }
  else {
    plVar3 = (long *)(*(long *)(param_1 + 0x18) + 0x158);
  }
  lVar4 = *plVar3;
  pXVar1 = *(X509_STORE **)(lVar4 + 0x1d0);
  if (pXVar1 == (X509_STORE *)0x0) {
    pXVar1 = X509_STORE_new();
    *(X509_STORE **)(lVar4 + 0x1d0) = pXVar1;
    if (pXVar1 == (X509_STORE *)0x0) {
      return 0;
    }
  }
  if ((param_2 == 0) || (uVar2 = X509_STORE_load_path(pXVar1,param_2), (int)uVar2 != 0)) {
    return 1;
  }
  return uVar2;
}

