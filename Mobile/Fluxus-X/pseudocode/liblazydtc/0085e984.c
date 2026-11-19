/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085e984
 */

undefined8
FUN_0085e984(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
            undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  long lVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  long lVar5;
  undefined1 auStack_c0 [8];
  undefined8 local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined1 *local_a0;
  undefined1 **ppuStack_98;
  undefined1 *puStack_90;
  undefined8 uStack_88;
  
  lVar3 = tpidr_el0;
  lVar5 = *(long *)(lVar3 + 0x28);
  ppuStack_98 = &local_a0;
  puStack_90 = auStack_c0;
  uStack_88 = 0xffffff80ffffffe8;
  local_b8 = param_6;
  uStack_b0 = param_7;
  local_a8 = param_8;
  local_a0 = (undefined1 *)register0x00000008;
  FUN_0086e6b0(param_1,param_2,param_5,&local_a0);
  lVar1 = *(long *)(param_1 + 0x1d0);
  lVar2 = *(long *)(param_1 + 0x1d8);
  uVar4 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x48);
  FUN_00850a5c(uVar4,param_2,param_3,param_4,(int)((ulong)(lVar2 - lVar1) >> 4) * -0x55555555 + -1);
  if (*(long *)(lVar3 + 0x28) != lVar5) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar4;
}

