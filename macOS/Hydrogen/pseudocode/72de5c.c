
long * FUN_0072de5c(void)

{
  long lVar1;
  long *plVar2;
  long *plVar3;
  long lVar4;
  byte bVar5;
  int iVar6;
  long lVar7;
  long lVar8;
  long unaff_x29;
  undefined1 auVar9 [16];
  
  func_0x0073cbdc();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return (long *)0x0;
  }
  auVar9 = ___stack_chk_fail();
  lVar4 = auVar9._8_8_;
  plVar2 = auVar9._0_8_;
  lVar7 = plVar2[2];
  plVar3 = plVar2;
  if ((lVar7 != 0) && (iVar6 = *(int *)(lVar7 + 0x98), iVar6 != -1)) {
    if (((lVar4 != 0) && (*(char *)(lVar4 + 0xa1d) < '\0')) &&
       (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   lVar4 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + lVar4 + 0x18) + 8))) && (0 < *(int *)(*plVar2 + 0xc))))) {
      plVar3 = (long *)func_0x0073cbdc(lVar4,plVar2,"cf_socket_close(%d)");
      iVar6 = *(int *)(lVar7 + 0x98);
    }
    lVar8 = plVar2[3];
    lVar1 = lVar8 + (long)(int)plVar2[4] * 4;
    if (iVar6 == *(int *)(lVar1 + 0x238)) {
      *(undefined4 *)(lVar1 + 0x238) = 0xffffffff;
      iVar6 = *(int *)(lVar7 + 0x98);
    }
    if (iVar6 != -1) {
      if (((*(byte *)(lVar7 + 0x134) >> 2 & 1) == 0) && (*(long *)(lVar8 + 0x20) != 0)) {
        func_0x0076b038(lVar4,iVar6);
        func_0x0076bad4(lVar4,1);
        (**(code **)(lVar8 + 0x20))(*(undefined8 *)(lVar8 + 0x28),iVar6);
        plVar3 = (long *)func_0x0076bad4(lVar4,0);
      }
      else {
        func_0x0076b038(lVar4,iVar6);
        plVar3 = (long *)_close(iVar6);
      }
    }
    *(undefined4 *)(lVar7 + 0x98) = 0xffffffff;
    bVar5 = *(byte *)(lVar7 + 0x134);
    if (((bVar5 >> 4 & 1) != 0) && ((int)plVar2[4] == 0)) {
      *(undefined8 *)(plVar2[3] + 0x50) = 0;
      bVar5 = *(byte *)(lVar7 + 0x134);
    }
    *(byte *)(lVar7 + 0x134) = bVar5 & 0xef;
    *(undefined8 *)(lVar7 + 0x100) = 0;
    *(undefined8 *)(lVar7 + 0x108) = 0;
    *(undefined8 *)(lVar7 + 0x110) = 0;
    *(undefined8 *)(lVar7 + 0x118) = 0;
  }
  *(byte *)((long)plVar2 + 0x24) = *(byte *)((long)plVar2 + 0x24) & 0xfe;
  return plVar3;
}

