
void FUN_006827a8(long param_1,undefined1 param_2 [16],undefined1 param_3 [16],undefined8 param_4,
                 long param_5)

{
  ulong uVar1;
  long in_x9;
  ulong *puVar2;
  undefined1 (*in_x10) [16];
  long in_x11;
  long *unaff_x19;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  
  while( true ) {
    auVar3 = NEON_rev64(param_3,1);
    auVar4 = NEON_rev64(*in_x10,1);
    auVar5 = NEON_rev64(in_x10[1],1);
    *(long *)(in_x10[-2] + 8) = param_2._8_8_;
    *(long *)in_x10[-2] = param_2._0_8_;
    *(long *)(in_x10[-1] + 8) = auVar3._8_8_;
    *(long *)in_x10[-1] = auVar3._0_8_;
    *(long *)(*in_x10 + 8) = auVar4._8_8_;
    *(long *)*in_x10 = auVar4._0_8_;
    *(long *)(in_x10[1] + 8) = auVar5._8_8_;
    *(long *)in_x10[1] = auVar5._0_8_;
    in_x11 = in_x11 + -8;
    if (in_x11 == 0) break;
    param_3 = in_x10[3];
    param_2 = NEON_rev64(in_x10[2],1);
    in_x10 = in_x10 + 4;
  }
  if (in_x9 != param_1) {
    param_1 = param_1 - in_x9;
    puVar2 = (ulong *)(param_5 + in_x9 * 8);
    do {
      uVar1 = (*puVar2 & 0xff00ff00ff00ff00) >> 8 | (*puVar2 & 0xff00ff00ff00ff) << 8;
      uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
      *puVar2 = uVar1 >> 0x20 | uVar1 << 0x20;
      param_1 = param_1 + -1;
      puVar2 = puVar2 + 1;
    } while (param_1 != 0);
  }
  _memcpy();
                    /* WARNING: Could not recover jumptable at 0x00682820. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*unaff_x19 + 0xa0))();
  return;
}

