
undefined8 FUN_006e4a3c(void)

{
  byte bVar1;
  long lVar2;
  long lVar3;
  long *plVar4;
  int iVar5;
  undefined1 auVar6 [12];
  
  auVar6 = func_0x006ed124();
  iVar5 = auVar6._8_4_;
  lVar2 = auVar6._0_8_;
  if (iVar5 < 1) {
    if (-10000 < iVar5) {
      plVar4 = (long *)(*(long *)(lVar2 + 8) + (long)iVar5 * 0x10);
      goto LAB_006e4aa0;
    }
    plVar4 = (long *)func_0x006e60a0(lVar2);
    lVar3 = *(long *)(lVar2 + 8);
    if (*(int *)(lVar3 + -4) == 0) goto code_r0x006e4b04;
code_r0x006e4aac:
    lVar3 = *(long *)(lVar3 + -0x10);
    iVar5 = *(int *)((long)plVar4 + 0xc);
    if (iVar5 == 8) goto code_r0x006e4b14;
code_r0x006e4abc:
    if (iVar5 != 6) {
      *(long *)(*(long *)(lVar2 + 0x18) + (long)iVar5 * 8 + 0x328) = lVar3;
      goto code_r0x006e4b48;
    }
    if (*(char *)(*plVar4 + 4) != '\0') {
      auVar6 = func_0x006ed124(lVar2);
      iVar5 = auVar6._8_4_;
      lVar2 = auVar6._0_8_;
      if (iVar5 < 1) {
        if (iVar5 < -9999) {
          plVar4 = (long *)func_0x006e60a0(lVar2);
          iVar5 = *(int *)((long)plVar4 + 0xc);
          goto joined_r0x006e4c2c;
        }
        plVar4 = (long *)(*(long *)(lVar2 + 8) + (long)iVar5 * 0x10);
      }
      else {
        plVar4 = (long *)(*(long *)(lVar2 + 0x10) + (ulong)(iVar5 - 1) * 0x10);
        if (*(long **)(lVar2 + 8) <= plVar4) {
          lVar3 = __dyld_get_image_header(0);
          plVar4 = (long *)(lVar3 + 0x4e8dd08);
          iVar5 = *(int *)(lVar3 + 0x4e8dd14);
          goto joined_r0x006e4c2c;
        }
      }
      iVar5 = *(int *)((long)plVar4 + 0xc);
joined_r0x006e4c2c:
      if (iVar5 == 9) {
        lVar3 = *(long *)(lVar2 + 8);
        *(undefined8 *)(*plVar4 + 0x58) = *(undefined8 *)(lVar3 + -0x10);
        bVar1 = *(byte *)(*plVar4 + 1);
      }
      else {
        if (iVar5 != 7) {
          *(long *)(lVar2 + 8) = *(long *)(lVar2 + 8) + -0x10;
          return 0;
        }
        lVar3 = *(long *)(lVar2 + 8);
        *(undefined8 *)(*plVar4 + 0x10) = *(undefined8 *)(lVar3 + -0x10);
        bVar1 = *(byte *)(*plVar4 + 1);
      }
      if (((bVar1 >> 2 & 1) != 0) && ((*(byte *)(*(long *)(lVar3 + -0x10) + 1) & 3) != 0)) {
        func_0x006f0d48(lVar2);
      }
      *(long *)(lVar2 + 8) = *(long *)(lVar2 + 8) + -0x10;
      return 1;
    }
    *(long *)(*plVar4 + 0x10) = lVar3;
  }
  else {
    plVar4 = (long *)(*(long *)(lVar2 + 0x10) + (ulong)(iVar5 - 1) * 0x10);
    if (plVar4 < *(long **)(lVar2 + 8)) {
LAB_006e4aa0:
      lVar3 = *(long *)(lVar2 + 8);
      iVar5 = *(int *)(lVar3 + -4);
    }
    else {
      lVar3 = __dyld_get_image_header(0);
      plVar4 = (long *)(lVar3 + 0x4e8dd08);
      lVar3 = *(long *)(lVar2 + 8);
      iVar5 = *(int *)(lVar3 + -4);
    }
    if (iVar5 != 0) goto code_r0x006e4aac;
code_r0x006e4b04:
    lVar3 = 0;
    iVar5 = *(int *)((long)plVar4 + 0xc);
    if (iVar5 != 8) goto code_r0x006e4abc;
code_r0x006e4b14:
    *(long *)(*plVar4 + 8) = (*plVar4 + 8) - lVar3;
  }
  if (((lVar3 != 0) && ((*(byte *)(*plVar4 + 1) >> 2 & 1) != 0)) &&
     ((*(byte *)(lVar3 + 1) & 3) != 0)) {
    func_0x006f0d48(lVar2);
  }
code_r0x006e4b48:
  *(long *)(lVar2 + 8) = *(long *)(lVar2 + 8) + -0x10;
  return 1;
}

