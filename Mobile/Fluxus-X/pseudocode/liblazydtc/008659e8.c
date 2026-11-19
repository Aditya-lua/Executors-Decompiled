/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008659e8
 */

undefined8
FUN_008659e8(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
            undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  long lVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  long lVar5;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined1 *local_90;
  undefined1 **ppuStack_88;
  undefined8 *puStack_80;
  undefined8 uStack_78;
  
  lVar3 = tpidr_el0;
  lVar5 = *(long *)(lVar3 + 0x28);
  ppuStack_88 = &local_90;
  puStack_80 = &local_b0;
  uStack_78 = 0xffffff80ffffffe0;
  local_b0 = param_5;
  uStack_a8 = param_6;
  local_a0 = param_7;
  uStack_98 = param_8;
  local_90 = (undefined1 *)register0x00000008;
  FUN_0086e6b0(param_1,param_2,param_4,&local_90);
  lVar1 = *(long *)(param_1 + 0x1d0);
  lVar2 = *(long *)(param_1 + 0x1d8);
  uVar4 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x38);
  FUN_0084f5e0(uVar4,param_2,param_3,(int)((ulong)(lVar2 - lVar1) >> 4) * -0x55555555 + -1);
  if (*(long *)(lVar3 + 0x28) != lVar5) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar4;
}

