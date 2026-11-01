
undefined8 FUN_00759dd8(void)

{
  long *plVar1;
  int iVar2;
  long *plVar3;
  undefined8 *puVar4;
  ulong uVar5;
  long lVar6;
  undefined8 uVar7;
  long extraout_x1;
  undefined1 *unaff_x19;
  long unaff_x23;
  undefined8 unaff_x24;
  long lVar8;
  undefined8 uVar9;
  long unaff_x25;
  long unaff_x27;
  long unaff_x28;
  long unaff_x29;
  undefined1 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  
  func_0x0073cd4c();
  if ((int)unaff_x24 != 0) goto LAB_00759f68;
  if ((*(byte *)(unaff_x27 + 0x60) & 1) != 0) {
    lVar8 = *(long *)(unaff_x25 + 0x10);
    uStack0000000000000030 = (undefined8 *)0x0;
    if (*(long *)(unaff_x23 + 0x9f8) == 0) {
      if ((*(char *)(unaff_x23 + 0xa1d) < '\0') &&
         (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x23 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x23 + 0x18) + 8))) && (0 < iRam0000000000a2b550)))) {
        func_0x0073cd4c();
      }
      unaff_x24 = func_0x00729b5c(lVar8 + 0x20,"0\r\n\r\n",5,&uStack0000000000000028);
    }
    else {
      lVar8 = lVar8 + 0x20;
      unaff_x24 = func_0x00729b5c(lVar8,"0\r\n",3,&uStack0000000000000028);
      if ((int)unaff_x24 == 0) {
        func_0x0076bad4();
        iVar2 = (**(code **)(unaff_x23 + 0x9f8))
                          (&uStack0000000000000030,*(undefined8 *)(unaff_x23 + 0x9f0));
        func_0x0076bad4();
        puVar4 = uStack0000000000000030;
        if (iVar2 != 0) {
          func_0x0073c9e4();
          unaff_x24 = 0x2a;
          puVar4 = uStack0000000000000030;
          goto code_r0x00759ee0;
        }
        for (; puVar4 != (undefined8 *)0x0; puVar4 = (undefined8 *)puVar4[1]) {
          uVar9 = *puVar4;
          lVar6 = _strchr(uVar9,0x3a);
          if ((lVar6 == 0) || (*(char *)(lVar6 + 1) != ' ')) {
            if ((*(char *)(unaff_x23 + 0xa1d) < '\0') &&
               ((*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x23 + 0x18) == 0 ||
                (0 < *(int *)(*(long *)(
                                       "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                       + unaff_x23 + 0x18) + 8))))) {
              func_0x0073cab8();
            }
          }
          else {
            uVar7 = _strlen(uVar9);
            unaff_x24 = func_0x00729b5c(lVar8,uVar9,uVar7,&uStack0000000000000028);
            if (((int)unaff_x24 != 0) ||
               (unaff_x24 = func_0x00729b5c(lVar8,"\r\n",2,&uStack0000000000000028),
               (int)unaff_x24 != 0)) goto code_r0x0075a0c8;
          }
        }
        unaff_x24 = func_0x00729b5c(lVar8,"\r\n",2,&uStack0000000000000028);
code_r0x0075a0c8:
        func_0x00779fa4(uStack0000000000000030);
        if (unaff_x23 == 0) goto LAB_00759f50;
      }
      else {
        puVar4 = (undefined8 *)0x0;
code_r0x00759ee0:
        func_0x00779fa4(puVar4);
      }
      if ((*(char *)(unaff_x23 + 0xa1d) < '\0') &&
         (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x23 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x23 + 0x18) + 8))) && (0 < iRam0000000000a2b550)))) {
        func_0x0073cd4c();
      }
    }
LAB_00759f50:
    if ((int)unaff_x24 != 0) goto LAB_00759f68;
  }
  lVar8 = unaff_x28 + 0x20;
  uVar5 = func_0x007298e4(lVar8);
  if ((uVar5 & 1) == 0) {
    unaff_x24 = func_0x00729f70(lVar8);
    if ((int)unaff_x24 != 0) goto LAB_00759f68;
    if ((*(byte *)(unaff_x28 + 0x60) & 1) != 0) {
      iVar2 = func_0x007298e4(lVar8);
      unaff_x24 = 0;
      if (iVar2 != 0) {
        *(byte *)(unaff_x28 + 0x60) = *(byte *)(unaff_x28 + 0x60) | 2;
        *unaff_x19 = 1;
      }
      goto LAB_00759f68;
    }
  }
  unaff_x24 = 0;
LAB_00759f68:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return unaff_x24;
  }
  ___stack_chk_fail();
  lVar8 = *(long *)(extraout_x1 + 0x10);
  plVar1 = (long *)(lVar8 + 0x20);
  plVar3 = (long *)*plVar1;
  while (plVar3 != (long *)0x0) {
    *plVar1 = *plVar3;
    (*pcRam0000000000a2b5f0)();
    plVar3 = (long *)*plVar1;
  }
  while (*(undefined8 **)(lVar8 + 0x30) != (undefined8 *)0x0) {
    *(undefined8 *)(lVar8 + 0x30) = **(undefined8 **)(lVar8 + 0x30);
    (*pcRam0000000000a2b5f0)();
  }
  *(undefined8 *)(lVar8 + 0x28) = 0;
  *(undefined8 *)(lVar8 + 0x40) = 0;
  return 0;
}

