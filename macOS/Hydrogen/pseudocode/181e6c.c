
undefined1  [16] FUN_00181e6c(void)

{
  bool bVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  undefined8 uVar5;
  long unaff_x19;
  undefined8 *unaff_x20;
  ulong uVar6;
  undefined1 *unaff_x22;
  long unaff_x23;
  long lVar7;
  undefined1 auVar8 [16];
  ulong in_stack_00000010;
  undefined8 in_stack_00000018;
  
  uVar4 = func_0x004168c0();
  *(undefined8 *)(unaff_x19 + 0x10) = 0;
  *(undefined8 *)(unaff_x19 + 0x20) = in_stack_00000018;
  *(ulong *)(unaff_x19 + 0x18) = in_stack_00000010;
  if (uVar4 == 0) {
    if (unaff_x22 != (undefined1 *)0x0) {
      uVar4 = 0;
      lVar7 = unaff_x23 << 4;
      uVar6 = in_stack_00000010;
      do {
        in_stack_00000010 = uVar4;
        if (lVar7 == 0) break;
        uVar3 = unaff_x20[1];
        uVar2 = uVar6;
        if (uVar3 <= uVar6) {
          uVar2 = uVar3;
        }
        if (uVar2 == 1) {
          *(undefined1 *)*unaff_x20 = *unaff_x22;
        }
        else {
          _memcpy((undefined1 *)*unaff_x20,unaff_x22,uVar2);
        }
        unaff_x20 = unaff_x20 + 2;
        unaff_x22 = unaff_x22 + uVar2;
        uVar4 = uVar2 + uVar4;
        lVar7 = lVar7 + -0x10;
        bVar1 = uVar3 < uVar6;
        uVar6 = uVar6 - uVar2;
        in_stack_00000010 = uVar4;
      } while (bVar1);
      uVar5 = 0;
      uVar4 = *(long *)(unaff_x19 + 0x10) + in_stack_00000010;
      uVar6 = *(ulong *)(unaff_x19 + 0x18);
      if (uVar4 <= *(ulong *)(unaff_x19 + 0x18)) {
        uVar6 = uVar4;
      }
      *(ulong *)(unaff_x19 + 0x10) = uVar6;
      goto LAB_00181f48;
    }
  }
  else {
    in_stack_00000010 = uVar4;
  }
  uVar5 = 1;
LAB_00181f48:
  auVar8._8_8_ = in_stack_00000010;
  auVar8._0_8_ = uVar5;
  return auVar8;
}

