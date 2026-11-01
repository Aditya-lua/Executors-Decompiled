
undefined8 FUN_0074ae60(undefined8 param_1)

{
  ulong *puVar1;
  byte bVar2;
  undefined8 uVar3;
  ulong uVar4;
  long unaff_x19;
  long unaff_x20;
  ulong uVar5;
  long lVar6;
  long unaff_x29;
  undefined1 auVar7 [16];
  undefined *puStack0000000000000000;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  
  func_0x00764560(param_1,0x14,",%d,%d");
  puStack0000000000000000 = &UNK_008cd207;
  uVar3 = func_0x0076e34c();
  if ((int)uVar3 == 0) {
    *(undefined4 *)(unaff_x20 + 0x4e8) = 1;
    func_0x007466c4();
    uVar3 = func_0x0072f958();
    if ((int)uVar3 == 0) {
      in_stack_00000030._4_4_ = 0xffffffff;
    }
  }
  else {
    puStack0000000000000000 = (undefined *)func_0x0077e9f4();
    func_0x0073c9e4();
  }
  if (in_stack_00000028 != 0) {
    func_0x00750010();
  }
  if ((int)uVar3 == 0) {
    if ((((*(byte *)(unaff_x20 + 0x39a) >> 1 & 1) == 0) || (-1 < *(char *)(unaff_x19 + 0xa1b))) ||
       (uVar4 = func_0x007315f4(), (uVar4 & 1) != 0)) {
      uVar3 = 0;
    }
    else {
      uVar3 = func_0x00794ee8();
    }
    *(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x398) =
         *(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x398) & 0xffffffffffffefff;
    func_0x007706e4();
    func_0x00768170();
    if (in_stack_00000030._4_4_ == 0xffffffff) {
      uVar4 = 0xffffffff;
      goto code_r0x0074a800;
    }
  }
  else {
    lVar6 = *(long *)(unaff_x19 + 0x18);
    if ((((unaff_x19 != 0) && (bVar2 = *(byte *)(lVar6 + 0x4f6), bVar2 != 0)) &&
        ((*(char *)(unaff_x19 + 0xa1d) < '\0' &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))))) && (0 < iRam0000000000a2b570)) {
      puStack0000000000000000 = *(undefined **)(&UNK_00a1e570 + (ulong)bVar2 * 8);
      func_0x0073cfbc();
    }
    *(undefined1 *)(lVar6 + 0x4f6) = 0;
    uVar4 = (ulong)in_stack_00000030._4_4_;
    if (in_stack_00000030._4_4_ == 0xffffffff) goto code_r0x0074a800;
  }
  uVar4 = (ulong)in_stack_00000030._4_4_;
  func_0x0072db20();
code_r0x0074a800:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
    return uVar3;
  }
  auVar7 = ___stack_chk_fail();
  puVar1 = (ulong *)(auVar7._0_8_ + 0xa1a);
  uVar5 = *puVar1;
  *puVar1 = uVar5 | 0x8000000;
  uVar3 = func_0x007738a0(auVar7._0_8_,4,auVar7._8_8_,uVar4);
  *puVar1 = *puVar1 & 0xfffffffff0000000 | *puVar1 & 0x7ffffff | uVar5 & 0x8000000;
  return uVar3;
}

