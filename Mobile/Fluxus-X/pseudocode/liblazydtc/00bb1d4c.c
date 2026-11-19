/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb1d4c
 */

void ZSTD_getDictID_fromFrame(undefined8 param_1,undefined8 param_2)

{
  undefined4 uVar1;
  long lVar2;
  ulong uVar3;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 local_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  long local_28;
  
  lVar2 = tpidr_el0;
  local_28 = *(long *)(lVar2 + 0x28);
  uStack_48 = 0;
  local_50 = 0;
  uStack_38 = 0;
  uStack_40 = 0;
  uStack_58 = 0;
  local_60 = 0;
  uVar3 = ZSTD_getFrameHeader_advanced(&local_60,param_1,param_2,0);
  uVar1 = uStack_48._4_4_;
  if (0xffffffffffffff88 < uVar3) {
    uVar1 = 0;
  }
  if (*(long *)(lVar2 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar1);
  }
  return;
}

