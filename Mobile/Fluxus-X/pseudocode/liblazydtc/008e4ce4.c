/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e4ce4
 */

void thunk_FUN_008e4c60(ulong param_1,ulong param_2)

{
  ulong uVar1;
  uint uVar2;
  uint uVar3;
  ulong uVar4;
  
  if (DAT_00d1fed0 == 0) {
    DAT_00d1fed0 = ctr_el0;
    uVar2 = (uint)DAT_00d1fed0;
  }
  else {
    uVar2 = (uint)DAT_00d1fed0;
  }
  uVar3 = (uint)DAT_00d1fed0;
  if ((uVar2 >> 0x1c & 1) == 0) {
    uVar4 = (ulong)(uint)(4 << (ulong)(uVar3 >> 0x10 & 0xf));
    for (uVar1 = -uVar4 & param_1; uVar1 < param_2; uVar1 = uVar1 + uVar4) {
      DC_CVAU(uVar1);
    }
  }
  DataSynchronizationBarrier(2,3,0);
  if ((uVar3 >> 0x1d & 1) == 0) {
    uVar1 = (ulong)(uint)(4 << (ulong)(uVar3 & 0xf));
    for (param_1 = -uVar1 & param_1; param_1 < param_2; param_1 = param_1 + uVar1) {
      IC_IVAU(param_1);
    }
  }
  InstructionSynchronizationBarrier();
  return;
}

