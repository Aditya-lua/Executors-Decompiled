
void FUN_0072e060(void)

{
  long lVar1;
  undefined4 uVar2;
  undefined4 *puVar3;
  long *plVar4;
  byte bVar5;
  long unaff_x19;
  undefined1 *unaff_x20;
  int iVar6;
  long unaff_x21;
  long lVar7;
  int unaff_w22;
  long lVar8;
  long unaff_x24;
  long lVar9;
  long unaff_x29;
  undefined1 auVar10 [16];
  undefined1 uStack0000000000000038;
  
  if (unaff_w22 != 0) {
    if (*(int *)(unaff_x24 + 0x130) != 0) {
      func_0x0072fadc(*(undefined8 *)(unaff_x21 + 0x10));
      uVar2 = *(undefined4 *)(unaff_x24 + 0x130);
      *(undefined4 *)(unaff_x19 + 0xc54) = uVar2;
      puVar3 = (undefined4 *)___error();
      *puVar3 = uVar2;
      if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        func_0x0077ea88(*(undefined4 *)(unaff_x24 + 0x130),&uStack0000000000000038,0x100);
        func_0x0073cab8();
      }
    }
    iVar6 = *(int *)(unaff_x24 + 0x98);
    if (iVar6 != -1) {
      lVar7 = *(long *)(unaff_x21 + 0x18);
      if ((lVar7 == 0) || (lVar9 = *(long *)(lVar7 + 0x20), func_0x0076b038(), lVar9 == 0)) {
        _close(iVar6);
      }
      else {
        func_0x0076bad4();
        (**(code **)(lVar7 + 0x20))(*(undefined8 *)(lVar7 + 0x28),iVar6);
        func_0x0076bad4();
      }
      *(undefined4 *)(unaff_x24 + 0x98) = 0xffffffff;
    }
    *unaff_x20 = 0;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return;
  }
  auVar10 = ___stack_chk_fail();
  lVar7 = auVar10._8_8_;
  plVar4 = auVar10._0_8_;
  lVar9 = plVar4[2];
  if ((lVar9 != 0) && (iVar6 = *(int *)(lVar9 + 0x98), iVar6 != -1)) {
    if (((lVar7 != 0) && (*(char *)(lVar7 + 0xa1d) < '\0')) &&
       (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   lVar7 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + lVar7 + 0x18) + 8))) && (0 < *(int *)(*plVar4 + 0xc))))) {
      func_0x0073cbdc(lVar7,plVar4,"cf_socket_close(%d)");
      iVar6 = *(int *)(lVar9 + 0x98);
    }
    lVar8 = plVar4[3];
    lVar1 = lVar8 + (long)(int)plVar4[4] * 4;
    if (iVar6 == *(int *)(lVar1 + 0x238)) {
      *(undefined4 *)(lVar1 + 0x238) = 0xffffffff;
      iVar6 = *(int *)(lVar9 + 0x98);
    }
    if (iVar6 != -1) {
      if (((*(byte *)(lVar9 + 0x134) >> 2 & 1) == 0) && (*(long *)(lVar8 + 0x20) != 0)) {
        func_0x0076b038(lVar7,iVar6);
        func_0x0076bad4(lVar7,1);
        (**(code **)(lVar8 + 0x20))(*(undefined8 *)(lVar8 + 0x28),iVar6);
        func_0x0076bad4(lVar7,0);
      }
      else {
        func_0x0076b038(lVar7,iVar6);
        _close(iVar6);
      }
    }
    *(undefined4 *)(lVar9 + 0x98) = 0xffffffff;
    bVar5 = *(byte *)(lVar9 + 0x134);
    if (((bVar5 >> 4 & 1) != 0) && ((int)plVar4[4] == 0)) {
      *(undefined8 *)(plVar4[3] + 0x50) = 0;
      bVar5 = *(byte *)(lVar9 + 0x134);
    }
    *(byte *)(lVar9 + 0x134) = bVar5 & 0xef;
    *(undefined8 *)(lVar9 + 0x100) = 0;
    *(undefined8 *)(lVar9 + 0x108) = 0;
    *(undefined8 *)(lVar9 + 0x110) = 0;
    *(undefined8 *)(lVar9 + 0x118) = 0;
  }
  *(byte *)((long)plVar4 + 0x24) = *(byte *)((long)plVar4 + 0x24) & 0xfe;
  return;
}

