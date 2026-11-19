/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00908350
 */

void FUN_00908350(long param_1,int param_2,undefined8 param_3,undefined8 param_4,ulong *param_5)

{
  long lVar1;
  ulong uVar2;
  long lVar3;
  
  lVar1 = tpidr_el0;
  lVar3 = *(long *)(lVar1 + 0x28);
  uVar2 = (**(code **)(*(long *)(param_1 + 0x20) + (long)param_2 * 8 + 0x228))();
  *param_5 = uVar2 & ((long)uVar2 >> 0x3f ^ 0xffffffffffffffffU);
  if (*(long *)(lVar1 + 0x28) != lVar3) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(0);
  }
  return;
}

