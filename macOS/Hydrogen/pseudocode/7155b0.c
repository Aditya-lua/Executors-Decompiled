
ulong FUN_007155b0(undefined8 param_1)

{
  undefined4 uVar1;
  long lVar2;
  undefined8 uVar3;
  ulong uVar4;
  long lVar5;
  undefined8 uVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  ulong uVar10;
  long unaff_x19;
  undefined8 *unaff_x22;
  long unaff_x29;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined1 uStack0000000000000040;
  undefined1 uStack0000000000000048;
  
  uStack0000000000000028 = 0;
  uStack0000000000000030 = 0;
  uStack0000000000000020 = param_1;
  func_0x00719504();
  if (*(int *)(unaff_x19 + 0x80) == 0x3d) {
    func_0x00710d48();
  }
  else {
    func_0x0072447c();
  }
  uVar1 = *(undefined4 *)(unaff_x19 + 0x114);
  uVar3 = *(undefined8 *)(unaff_x19 + 0x84);
  *(undefined8 *)(unaff_x29 + -0x48) = *(undefined8 *)(unaff_x19 + 0x8c);
  *(undefined8 *)(unaff_x29 + -0x50) = uVar3;
  if ((*(int *)(unaff_x19 + 0x80) != 0x26) && (*(int *)(unaff_x19 + 0x80) != 0x7c)) {
    func_0x0071f5c8();
    *(undefined4 *)(unaff_x19 + 0x114) = uVar1;
  }
  lVar2 = func_0x0071cf0c();
  *(undefined4 *)(unaff_x19 + 0x114) = uVar1;
  uVar3 = *(undefined8 *)(unaff_x19 + 0xd8);
  uVar6 = *(undefined8 *)(lVar2 + 0x14);
  *(undefined8 *)(unaff_x29 + -0x50) = *unaff_x22;
  *(undefined8 *)(unaff_x29 + -0x48) = uVar6;
  uVar4 = func_0x00704c24(uVar3,0x68);
  func_0x00707768(uVar4,unaff_x29 + -0x50,&uStack0000000000000040,&uStack0000000000000048);
  if (*(char *)(unaff_x19 + 0x58) != '\0') {
    uVar3 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0x38);
    func_0x00709684();
    lVar2 = *(long *)(unaff_x19 + 0x420);
    if ((ulong)(lVar2 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
      if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (uVar4 != *(ulong *)(unaff_x19 + 0x430))) {
        uVar7 = 0;
        uVar9 = uVar4 >> 4 ^ uVar4 >> 9;
        do {
          uVar9 = uVar9 & lVar2 - 1U;
          uVar10 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar9 * 0x10);
          if (uVar10 == uVar4) goto code_r0x00715760;
          uVar7 = uVar7 + 1;
          uVar9 = uVar7 + uVar9;
        } while (uVar10 != *(ulong *)(unaff_x19 + 0x430) && uVar7 <= lVar2 - 1U);
      }
      func_0x006db93c();
      lVar2 = *(long *)(unaff_x19 + 0x420);
    }
code_r0x00715760:
    lVar5 = *(long *)(unaff_x19 + 0x418);
    uVar7 = (uVar4 >> 4 ^ uVar4 >> 9) & lVar2 - 1U;
    uVar9 = *(ulong *)(lVar5 + uVar7 * 0x10);
    if (uVar9 != *(ulong *)(unaff_x19 + 0x430)) {
      lVar8 = 1;
      do {
        if (uVar9 == uVar4) goto LAB_007157c0;
        uVar7 = uVar7 + lVar8 & lVar2 - 1U;
        uVar9 = *(ulong *)(lVar5 + uVar7 * 0x10);
        lVar8 = lVar8 + 1;
      } while (uVar9 != *(ulong *)(unaff_x19 + 0x430));
    }
    *(ulong *)(lVar5 + uVar7 * 0x10) = uVar4;
    *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
LAB_007157c0:
    *(undefined8 *)(lVar5 + uVar7 * 0x10 + 8) = uVar3;
  }
  return uVar4;
}

