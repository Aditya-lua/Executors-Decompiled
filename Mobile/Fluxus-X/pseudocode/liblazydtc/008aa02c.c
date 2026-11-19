/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008aa02c
 */

void FUN_008aa02c(undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8,
                 undefined8 param_9)

{
  long lVar1;
  long lVar2;
  undefined1 auStack_c0 [8];
  undefined8 local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined1 *local_80;
  undefined1 **ppuStack_78;
  undefined1 *puStack_70;
  undefined8 uStack_68;
  
  puStack_70 = auStack_c0;
  lVar1 = tpidr_el0;
  lVar2 = *(long *)(lVar1 + 0x28);
  *param_1 = 0;
  param_1[1] = 0;
  ppuStack_78 = &local_80;
  param_1[2] = 0;
  uStack_68 = 0xffffff80ffffffc8;
                    /* try { // try from 008aa0ac to 008aa0bb has its CatchHandler @ 008aa0e0 */
  local_b8 = param_3;
  uStack_b0 = param_4;
  local_a8 = param_5;
  uStack_a0 = param_6;
  local_98 = param_7;
  uStack_90 = param_8;
  local_88 = param_9;
  local_80 = (undefined1 *)register0x00000008;
  FUN_008a9f20(param_1,param_2,&local_80);
  if (*(long *)(lVar1 + 0x28) != lVar2) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

