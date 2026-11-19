/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092a30c
 */

void curl_msnprintf(undefined1 *param_1,long param_2,undefined8 param_3,undefined8 param_4,
                   undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  long lVar1;
  ulong uVar2;
  undefined1 auStack_b0 [8];
  undefined8 local_a8;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined1 *local_60;
  undefined1 *puStack_58;
  undefined1 *puStack_50;
  undefined8 uStack_48;
  undefined1 *local_40;
  long lStack_38;
  long local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  puStack_50 = auStack_b0;
  puStack_58 = auStack_b0 + 0x30;
  lStack_38 = 0;
  uStack_48 = 0xffffff80ffffffd8;
  local_a8 = param_4;
  local_a0 = param_5;
  uStack_98 = param_6;
  local_90 = param_7;
  uStack_88 = param_8;
  local_60 = (undefined1 *)register0x00000008;
  local_40 = param_1;
  local_30 = param_2;
  uVar2 = FUN_00929028(&local_40,&LAB_0092a2d0,param_3,&local_60);
  if (local_30 != 0) {
    if (local_30 == lStack_38) {
      local_40[-1] = 0;
      uVar2 = (ulong)((int)uVar2 - 1);
    }
    else {
      *local_40 = 0;
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar2);
  }
  return;
}

