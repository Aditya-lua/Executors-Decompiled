/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00915d74
 */

void FUN_00915d74(long param_1,uint param_2)

{
  uint uVar1;
  long lVar2;
  undefined8 uVar3;
  
  lVar2 = tpidr_el0;
  if (param_1 == 0) {
    uVar3 = 0x2b;
  }
  else {
    uVar1 = (param_2 & 0xf00000) - 0x100000 >> 0x14;
    if (uVar1 < 6) {
                    /* WARNING: Jumptable with 0 entries at 0x00915e0c */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)(&DAT_00746580 + *(int *)(&DAT_00746580 + (ulong)uVar1 * 4)))();
      return;
    }
    uVar3 = 0x30;
  }
  if (*(long *)(lVar2 + 0x28) != *(long *)(lVar2 + 0x28)) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

