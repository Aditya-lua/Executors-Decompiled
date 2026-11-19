/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008751d0
 */

uint FUN_008751d0(long param_1,void *param_2)

{
  long lVar1;
  ulong uVar2;
  ulong extraout_x1;
  ulong uVar3;
  long lVar4;
  uint uVar5;
  void *__dest;
  undefined1 auVar6 [16];
  undefined8 local_80;
  ulong uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 local_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  if (((*(long *)(param_1 + 0x158) == 0) ||
      (auVar6 = FUN_0087c3cc(param_1 + 0x130,param_2), (auVar6._8_8_ & 1) == 0)) ||
     (*(long *)(param_1 + 0x130) == 0)) {
    uVar5 = (int)((ulong)(*(long *)(param_1 + 0x68) - *(long *)(param_1 + 0x60)) >> 3) * -0x33333333
    ;
    if (uVar5 >> 0x17 == 0) {
      local_60 = 0;
      uStack_68 = 0;
      uStack_70 = 0;
      local_80 = 7;
      uStack_78 = (ulong)(uint)((int)((ulong)(*(long *)(param_1 + 0xb0) - *(long *)(param_1 + 0xa8))
                                     >> 3) * 0x3e0f83e1);
      if (((ulong)(*(long *)(param_1 + 0x150) * 3) >> 2 <= *(ulong *)(param_1 + 0x158)) &&
         (((*(ulong *)(param_1 + 0x158) == 0 ||
           (FUN_0087c3cc(param_1 + 0x130,param_2), (extraout_x1 & 1) == 0)) ||
          (*(long *)(param_1 + 0x130) == 0)))) {
        FUN_0087c53c(param_1 + 0x130);
      }
      auVar6 = FUN_0087c3cc(param_1 + 0x130,param_2);
      uVar2 = auVar6._0_8_;
      if ((auVar6._8_8_ & 1) == 0) {
        __dest = (void *)(*(long *)(param_1 + 0x130) + uVar2 * 0x10c);
        uVar3 = uVar2 >> 3 & 0x1ffffffffffffff8;
        *(ulong *)(*(long *)(param_1 + 0x148) + uVar3) =
             *(ulong *)(*(long *)(param_1 + 0x148) + uVar3) | 1L << (uVar2 & 0x3f);
        memcpy(__dest,param_2,0x108);
        lVar4 = *(long *)(param_1 + 0x158);
        *(undefined4 *)((long)__dest + 0x108) = 0;
        *(long *)(param_1 + 0x158) = lVar4 + 1;
      }
      *(uint *)(*(long *)(param_1 + 0x130) + uVar2 * 0x10c + 0x108) = uVar5;
      FUN_00875380((long *)(param_1 + 0xa8),param_2);
      FUN_00874c40((long *)(param_1 + 0x60),&local_80);
    }
    else {
      uVar5 = 0xffffffff;
    }
  }
  else {
    uVar5 = *(uint *)(*(long *)(param_1 + 0x130) + auVar6._0_8_ * 0x10c + 0x108);
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar5;
}

