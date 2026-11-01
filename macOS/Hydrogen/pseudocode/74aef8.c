
undefined8 FUN_0074aef8(void)

{
  ulong *puVar1;
  undefined8 uVar2;
  ulong uVar3;
  long unaff_x19;
  long unaff_x20;
  ulong uVar4;
  undefined8 unaff_x21;
  long lVar5;
  long unaff_x29;
  undefined1 auVar6 [16];
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  
  func_0x0073c9e4();
  if (in_stack_00000028 != 0) {
    func_0x00750010();
  }
  if ((int)unaff_x21 == 0) {
    if ((((*(byte *)(unaff_x20 + 0x39a) >> 1 & 1) == 0) || (-1 < *(char *)(unaff_x19 + 0xa1b))) ||
       (uVar3 = func_0x007315f4(), (uVar3 & 1) != 0)) {
      unaff_x21 = 0;
    }
    else {
      unaff_x21 = func_0x00794ee8();
    }
    *(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x398) =
         *(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x398) & 0xffffffffffffefff;
    func_0x007706e4();
    func_0x00768170();
    if (in_stack_00000030._4_4_ == 0xffffffff) {
      uVar3 = 0xffffffff;
      goto code_r0x0074a800;
    }
  }
  else {
    lVar5 = *(long *)(unaff_x19 + 0x18);
    if ((((unaff_x19 != 0) && (*(char *)(lVar5 + 0x4f6) != '\0')) &&
        ((*(char *)(unaff_x19 + 0xa1d) < '\0' &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))))) && (0 < iRam0000000000a2b570)) {
      func_0x0073cfbc();
    }
    *(undefined1 *)(lVar5 + 0x4f6) = 0;
    uVar3 = (ulong)in_stack_00000030._4_4_;
    if (in_stack_00000030._4_4_ == 0xffffffff) goto code_r0x0074a800;
  }
  uVar3 = (ulong)in_stack_00000030._4_4_;
  func_0x0072db20();
code_r0x0074a800:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
    return unaff_x21;
  }
  auVar6 = ___stack_chk_fail();
  puVar1 = (ulong *)(auVar6._0_8_ + 0xa1a);
  uVar4 = *puVar1;
  *puVar1 = uVar4 | 0x8000000;
  uVar2 = func_0x007738a0(auVar6._0_8_,4,auVar6._8_8_,uVar3);
  *puVar1 = *puVar1 & 0xfffffffff0000000 | *puVar1 & 0x7ffffff | uVar4 & 0x8000000;
  return uVar2;
}

