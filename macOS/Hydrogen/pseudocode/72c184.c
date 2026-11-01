
void FUN_0072c184(void)

{
  bool bVar1;
  undefined4 *puVar2;
  long *plVar3;
  long lVar4;
  undefined8 unaff_x19;
  long unaff_x20;
  int *unaff_x25;
  long unaff_x29;
  undefined1 auVar5 [16];
  undefined8 in_stack_00000028;
  
  func_0x00740678();
  if (in_stack_00000028._4_4_ == 0) {
    in_stack_00000028._4_4_ = 0;
    bVar1 = *unaff_x25 == 2;
  }
  else {
    bVar1 = false;
  }
  *(bool *)unaff_x19 = bVar1;
  *(byte *)(unaff_x20 + 0x24) = *(byte *)(unaff_x20 + 0x24) & 0xfe | bVar1;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return;
  }
  auVar5 = ___stack_chk_fail(in_stack_00000028._4_4_);
  lVar4 = auVar5._8_8_;
  plVar3 = auVar5._0_8_;
  if ((lVar4 != 0) && (*(char *)(lVar4 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 lVar4 + 0x18) == 0) {
      if (plVar3 == (long *)0x0) goto LAB_0072c2e4;
    }
    else if ((plVar3 == (long *)0x0) ||
            (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + lVar4 + 0x18) + 8) < 1)) goto LAB_0072c2e4;
    if (0 < *(int *)(*plVar3 + 0xc)) {
      func_0x0073cbdc(lVar4,plVar3,"close");
    }
  }
LAB_0072c2e4:
  *(byte *)((long)plVar3 + 0x24) = *(byte *)((long)plVar3 + 0x24) & 0xfe;
  puVar2 = (undefined4 *)plVar3[2];
  *puVar2 = 0;
  func_0x007406b0(puVar2 + 2);
  plVar3 = (long *)plVar3[1];
  if (plVar3 == (long *)0x0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x0072c318. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar3 + 0x20))(plVar3,lVar4);
  return;
}

