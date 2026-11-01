
undefined8 *
FUN_006e4798(ulong param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
            undefined8 param_5)

{
  byte bVar1;
  long lVar2;
  undefined8 *puVar3;
  long lVar4;
  long *plVar5;
  int iVar6;
  long unaff_x19;
  undefined8 uVar7;
  undefined1 auVar8 [12];
  
  plVar5 = (long *)(*(long *)(unaff_x19 + 0x10) + (param_1 & 0xffffffff) * 0x10);
  if (*(long **)(unaff_x19 + 8) <= plVar5) {
    lVar2 = __dyld_get_image_header(0);
    plVar5 = (long *)(lVar2 + 0x4e8dd08);
  }
  if (*(char *)(*plVar5 + 4) == '\0') {
    lVar2 = *(long *)(unaff_x19 + 8);
    puVar3 = (undefined8 *)func_0x006fbae8();
    uVar7 = *(undefined8 *)(lVar2 + -0x10);
    puVar3[1] = *(undefined8 *)(lVar2 + -8);
    *puVar3 = uVar7;
    lVar2 = *(long *)(unaff_x19 + 8);
    if (((4 < *(int *)(lVar2 + -4)) && ((*(byte *)(*plVar5 + 1) >> 2 & 1) != 0)) &&
       ((*(byte *)(*(long *)(lVar2 + -0x10) + 1) & 3) != 0)) {
      puVar3 = (undefined8 *)func_0x006f0ea0();
      lVar2 = *(long *)(unaff_x19 + 8);
    }
    *(long *)(unaff_x19 + 8) = lVar2 + -0x20;
    return puVar3;
  }
  auVar8 = func_0x006ed124();
  iVar6 = auVar8._8_4_;
  lVar2 = auVar8._0_8_;
  uVar7 = param_4;
  if (iVar6 < 1) {
    if (iVar6 < -9999) {
      plVar5 = (long *)func_0x006e60a0(lVar2);
    }
    else {
      plVar5 = (long *)(*(long *)(lVar2 + 8) + (long)iVar6 * 0x10);
    }
  }
  else {
    plVar5 = (long *)(*(long *)(lVar2 + 0x10) + (ulong)(iVar6 - 1) * 0x10);
    if (*(long **)(lVar2 + 8) <= plVar5) {
      lVar4 = __dyld_get_image_header(0);
      plVar5 = (long *)(lVar4 + 0x4e8dd08);
    }
  }
  if (*(char *)(*plVar5 + 4) == '\0') {
    lVar4 = *(long *)(lVar2 + 8);
    puVar3 = (undefined8 *)func_0x006fbe9c(lVar2,*plVar5,param_4);
    uVar7 = *(undefined8 *)(lVar4 + -0x10);
    puVar3[1] = *(undefined8 *)(lVar4 + -8);
    *puVar3 = uVar7;
    lVar4 = *(long *)(lVar2 + 8);
    if (((4 < *(int *)(lVar4 + -4)) && ((*(byte *)(*plVar5 + 1) >> 2 & 1) != 0)) &&
       ((*(byte *)(*(long *)(lVar4 + -0x10) + 1) & 3) != 0)) {
      puVar3 = (undefined8 *)func_0x006f0ea0(lVar2);
      lVar4 = *(long *)(lVar2 + 8);
    }
    *(long *)(lVar2 + 8) = lVar4 + -0x10;
    return puVar3;
  }
  auVar8 = func_0x006ed124(lVar2);
  iVar6 = auVar8._8_4_;
  lVar2 = auVar8._0_8_;
  if (iVar6 < 1) {
    if (iVar6 < -9999) {
      plVar5 = (long *)func_0x006e60a0(lVar2);
    }
    else {
      plVar5 = (long *)(*(long *)(lVar2 + 8) + (long)iVar6 * 0x10);
    }
  }
  else {
    plVar5 = (long *)(*(long *)(lVar2 + 0x10) + (ulong)(iVar6 - 1) * 0x10);
    if (*(long **)(lVar2 + 8) <= plVar5) {
      lVar4 = __dyld_get_image_header(0);
      plVar5 = (long *)(lVar4 + 0x4e8dd08);
    }
  }
  if (*(char *)(*plVar5 + 4) == '\0') {
    lVar4 = *(long *)(lVar2 + 8);
    puVar3 = (undefined8 *)func_0x006fc03c(lVar2,*plVar5,uVar7,param_5);
    uVar7 = *(undefined8 *)(lVar4 + -0x10);
    puVar3[1] = *(undefined8 *)(lVar4 + -8);
    *puVar3 = uVar7;
    lVar4 = *(long *)(lVar2 + 8);
    if (((4 < *(int *)(lVar4 + -4)) && ((*(byte *)(*plVar5 + 1) >> 2 & 1) != 0)) &&
       ((*(byte *)(*(long *)(lVar4 + -0x10) + 1) & 3) != 0)) {
      puVar3 = (undefined8 *)func_0x006f0ea0(lVar2);
      lVar4 = *(long *)(lVar2 + 8);
    }
    *(long *)(lVar2 + 8) = lVar4 + -0x10;
    return puVar3;
  }
  auVar8 = func_0x006ed124(lVar2);
  iVar6 = auVar8._8_4_;
  lVar2 = auVar8._0_8_;
  if (iVar6 < 1) {
    if (-10000 < iVar6) {
      plVar5 = (long *)(*(long *)(lVar2 + 8) + (long)iVar6 * 0x10);
      goto LAB_006e4aa0;
    }
    plVar5 = (long *)func_0x006e60a0(lVar2);
    lVar4 = *(long *)(lVar2 + 8);
    if (*(int *)(lVar4 + -4) == 0) goto code_r0x006e4b04;
code_r0x006e4aac:
    lVar4 = *(long *)(lVar4 + -0x10);
    iVar6 = *(int *)((long)plVar5 + 0xc);
    if (iVar6 == 8) goto code_r0x006e4b14;
code_r0x006e4abc:
    if (iVar6 != 6) {
      *(long *)(*(long *)(lVar2 + 0x18) + (long)iVar6 * 8 + 0x328) = lVar4;
      goto code_r0x006e4b48;
    }
    if (*(char *)(*plVar5 + 4) != '\0') {
      auVar8 = func_0x006ed124(lVar2);
      iVar6 = auVar8._8_4_;
      lVar2 = auVar8._0_8_;
      if (iVar6 < 1) {
        if (iVar6 < -9999) {
          plVar5 = (long *)func_0x006e60a0(lVar2);
          iVar6 = *(int *)((long)plVar5 + 0xc);
          goto joined_r0x006e4c2c;
        }
        plVar5 = (long *)(*(long *)(lVar2 + 8) + (long)iVar6 * 0x10);
      }
      else {
        plVar5 = (long *)(*(long *)(lVar2 + 0x10) + (ulong)(iVar6 - 1) * 0x10);
        if (*(long **)(lVar2 + 8) <= plVar5) {
          lVar4 = __dyld_get_image_header(0);
          plVar5 = (long *)(lVar4 + 0x4e8dd08);
          iVar6 = *(int *)(lVar4 + 0x4e8dd14);
          goto joined_r0x006e4c2c;
        }
      }
      iVar6 = *(int *)((long)plVar5 + 0xc);
joined_r0x006e4c2c:
      if (iVar6 == 9) {
        lVar4 = *(long *)(lVar2 + 8);
        *(undefined8 *)(*plVar5 + 0x58) = *(undefined8 *)(lVar4 + -0x10);
        bVar1 = *(byte *)(*plVar5 + 1);
      }
      else {
        if (iVar6 != 7) {
          *(long *)(lVar2 + 8) = *(long *)(lVar2 + 8) + -0x10;
          return (undefined8 *)0x0;
        }
        lVar4 = *(long *)(lVar2 + 8);
        *(undefined8 *)(*plVar5 + 0x10) = *(undefined8 *)(lVar4 + -0x10);
        bVar1 = *(byte *)(*plVar5 + 1);
      }
      if (((bVar1 >> 2 & 1) != 0) && ((*(byte *)(*(long *)(lVar4 + -0x10) + 1) & 3) != 0)) {
        func_0x006f0d48(lVar2);
      }
      *(long *)(lVar2 + 8) = *(long *)(lVar2 + 8) + -0x10;
      return (undefined8 *)((long)&MACH_HEADER.magic + 1);
    }
    *(long *)(*plVar5 + 0x10) = lVar4;
  }
  else {
    plVar5 = (long *)(*(long *)(lVar2 + 0x10) + (ulong)(iVar6 - 1) * 0x10);
    if (plVar5 < *(long **)(lVar2 + 8)) {
LAB_006e4aa0:
      lVar4 = *(long *)(lVar2 + 8);
      iVar6 = *(int *)(lVar4 + -4);
    }
    else {
      lVar4 = __dyld_get_image_header(0);
      plVar5 = (long *)(lVar4 + 0x4e8dd08);
      lVar4 = *(long *)(lVar2 + 8);
      iVar6 = *(int *)(lVar4 + -4);
    }
    if (iVar6 != 0) goto code_r0x006e4aac;
code_r0x006e4b04:
    lVar4 = 0;
    iVar6 = *(int *)((long)plVar5 + 0xc);
    if (iVar6 != 8) goto code_r0x006e4abc;
code_r0x006e4b14:
    *(long *)(*plVar5 + 8) = (*plVar5 + 8) - lVar4;
  }
  if (((lVar4 != 0) && ((*(byte *)(*plVar5 + 1) >> 2 & 1) != 0)) &&
     ((*(byte *)(lVar4 + 1) & 3) != 0)) {
    func_0x006f0d48(lVar2);
  }
code_r0x006e4b48:
  *(long *)(lVar2 + 8) = *(long *)(lVar2 + 8) + -0x10;
  return (undefined8 *)((long)&MACH_HEADER.magic + 1);
}

