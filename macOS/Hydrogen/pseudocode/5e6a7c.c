
void FUN_005e6a7c(ulong *param_1)

{
  code *pcVar1;
  long lVar2;
  ulong uVar3;
  long in_x9;
  long in_x10;
  uint in_w11;
  ulong unaff_x19;
  ulong *unaff_x20;
  ulong uVar4;
  long *plVar5;
  undefined1 auVar6 [16];
  long *plStack0000000000000000;
  ulong uStack0000000000000008;
  undefined1 uStack0000000000000010;
  
  uVar4 = *param_1;
  auVar6._8_8_ = -(ulong)((long)((ulong)in_w11 << 0x3f) < 0);
  auVar6._0_8_ = -(ulong)((long)((ulong)in_w11 << 0x3f) < 0);
  auVar6 = *(undefined1 (*) [16])(in_x9 + 8) ^
           (*(undefined1 (*) [16])(in_x9 + 8) ^ *(undefined1 (*) [16])(in_x10 + 8)) & ~auVar6;
  uStack0000000000000008 = auVar6._8_8_;
  plVar5 = auVar6._0_8_;
  plStack0000000000000000 = plVar5;
  if ((uVar4 & 1) == 0) {
    uVar3 = (**(code **)(uStack0000000000000008 + 0x38))(plVar5,&uStack0000000000000010);
  }
  else {
    uVar3 = (**(code **)(uStack0000000000000008 + 0x38))
                      ((long)plVar5 +
                       (*(long *)(uStack0000000000000008 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10,
                       &uStack0000000000000010);
    uVar4 = 1;
    lVar2 = *plVar5;
    *plVar5 = lVar2 + 1;
    if (lVar2 < 0) {
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x5e6cd4);
      (*pcVar1)();
    }
  }
  *unaff_x20 = uVar4;
  unaff_x20[2] = uStack0000000000000008;
  unaff_x20[1] = (ulong)plStack0000000000000000;
  unaff_x20[3] = uVar3;
  unaff_x20[4] = unaff_x19;
  return;
}

