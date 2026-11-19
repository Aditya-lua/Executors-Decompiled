/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a554f0
 */

undefined8 ERR_clear_last_mark(void)

{
  long lVar1;
  int iVar2;
  int iVar3;
  int *piVar4;
  
  lVar1 = ossl_err_get_state_int();
  if (lVar1 != 0) {
    iVar3 = *(int *)(lVar1 + 0x380);
    if (*(int *)(lVar1 + 900) == iVar3) {
      return 0;
    }
    do {
      piVar4 = (int *)(lVar1 + (long)iVar3 * 4 + 0x40);
      iVar2 = *piVar4;
      if (iVar2 != 0) {
        *piVar4 = iVar2 + -1;
        return 1;
      }
      iVar2 = iVar3 + -1;
      if (iVar3 < 1) {
        iVar2 = 0xf;
      }
      iVar3 = iVar2;
    } while (*(int *)(lVar1 + 900) != iVar2);
  }
  return 0;
}

