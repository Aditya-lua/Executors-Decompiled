/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b4164
 */

void FUN_008b4164(long param_1,uint param_2)

{
  long lVar1;
  long lVar2;
  
  if ((int)param_2 < 0) {
                    /* WARNING: Subroutine does not return */
    FUN_008b75fc(param_1);
  }
  lVar2 = *(long *)(param_1 + 0x20);
  lVar1 = FUN_008b8498(param_1,lVar2,(long)*(int *)(param_1 + 0x44) * 0x30,(ulong)param_2 * 0x30,
                       *(undefined1 *)(param_1 + 1));
  *(uint *)(param_1 + 0x44) = param_2;
  *(long *)(param_1 + 0x50) = lVar1 + (*(long *)(param_1 + 0x50) - lVar2);
  *(ulong *)(param_1 + 0x18) = lVar1 + (ulong)param_2 * 0x30 + -0x30;
  *(long *)(param_1 + 0x20) = lVar1;
  return;
}

