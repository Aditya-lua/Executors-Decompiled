/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008aecb4
 */

void FUN_008aecb4(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  long lVar1;
  long lVar2;
  undefined8 local_c0;
  undefined8 uStack_b8;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined1 *local_90;
  undefined1 **ppuStack_88;
  undefined8 *puStack_80;
  undefined8 uStack_78;
  
  lVar1 = tpidr_el0;
  lVar2 = *(long *)(lVar1 + 0x28);
  local_c0 = param_3;
  uStack_b8 = param_4;
  local_b0 = param_5;
  uStack_a8 = param_6;
  local_a0 = param_7;
  uStack_98 = param_8;
  FUN_008aee78(param_1,1);
  uStack_78 = 0xffffff80ffffffd0;
  local_90 = (undefined1 *)register0x00000008;
  ppuStack_88 = &local_90;
  puStack_80 = &local_c0;
  FUN_008ac5e4(param_1,param_2,&local_90);
  FUN_008ae364(param_1,2);
  if (*(long *)(lVar1 + 0x28) == lVar2) {
    FUN_008aa5f4(param_1);
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

