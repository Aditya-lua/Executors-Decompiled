/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9cc8c
 */

int WPACKET_finish(long param_1)

{
  int iVar1;
  long *plVar2;
  
  plVar2 = *(long **)(param_1 + 0x28);
  if (plVar2 == (long *)0x0) {
    iVar1 = 0;
  }
  else {
    iVar1 = 0;
    if (*plVar2 == 0) {
      iVar1 = FUN_00a9cab8(param_1,plVar2,1);
      if (iVar1 != 0) {
        CRYPTO_free(*(void **)(param_1 + 0x28));
        *(undefined8 *)(param_1 + 0x28) = 0;
      }
    }
  }
  return iVar1;
}

