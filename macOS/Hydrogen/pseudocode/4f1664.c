
undefined8 FUN_004f1664(long param_1)

{
  code *pcVar1;
  int iVar2;
  ulong uVar3;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long *unaff_x25;
  long *unaff_x26;
  ulong *unaff_x27;
  long unaff_x29;
  undefined8 uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  undefined8 uStack0000000000000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000d8;
  
  param_1 = param_1 * 600;
  while ((*(long *)(unaff_x22 + 0x220) != unaff_x23 ||
         (iVar2 = _memcmp(*(undefined8 *)(unaff_x22 + 0x218)), iVar2 != 0))) {
    unaff_x22 = unaff_x22 + 600;
    param_1 = param_1 + -600;
    if (param_1 == 0) {
      func_0x007a23d8(&UNK_008a3952,99,&UNK_009e8258);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x4f17b8);
      (*pcVar1)();
    }
  }
  uVar4 = *(undefined8 *)(unaff_x21 + 0x10);
  *(undefined8 *)(unaff_x29 + -0x78) = *(undefined8 *)(unaff_x21 + 0x18);
  *(undefined8 *)(unaff_x29 + -0x80) = uVar4;
  *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x21 + 0x20);
  func_0x004f17d0(&uStack0000000000000098);
  if (uStack0000000000000098 == -0x7ffffffffffffff7) {
    return in_stack_000000a0;
  }
  uVar5 = *unaff_x27;
  uVar7 = unaff_x27[3];
  uVar6 = unaff_x27[4];
  uVar3 = uVar5 ^ 0x8000000000000000;
  if (8 < uVar3) {
    uVar3 = 4;
  }
  if (1 < uVar3 - 6) {
    if (uVar3 == 4) {
      if (uVar5 != 0) {
        func_0x00187bd4(unaff_x27[1],uVar5,1);
      }
      if (uVar7 != 0) {
        func_0x00187bd4(uVar6,uVar7 << 4,8);
      }
      unaff_x26 = unaff_x25;
    }
    else if (uVar3 != 0) {
      return 0;
    }
  }
  if (*unaff_x26 != 0) {
    func_0x00187bd4(unaff_x26[1],*unaff_x26,1);
  }
  return 0;
}

