
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_007610ac(void)

{
  char *pcVar1;
  bool bVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  long unaff_x21;
  char *unaff_x23;
  char *unaff_x24;
  undefined8 uVar6;
  byte bVar7;
  char *pcVar8;
  long *unaff_x26;
  long *plVar9;
  long lVar10;
  
code_r0x007610ac:
  iVar3 = func_0x0077e76c(*unaff_x26);
  if ((iVar3 == 0) || (*(char *)(*unaff_x26 + 0xc) != ':')) goto LAB_007610a4;
  pcVar8 = (char *)(*unaff_x26 + 0xc);
  do {
    pcVar8 = pcVar8 + 1;
  } while (*pcVar8 == ' ');
  pcVar1 = pcVar8;
  if (pcVar8 == (char *)0x0) {
    pcVar1 = unaff_x23;
  }
  unaff_x23 = pcVar1;
  if (pcVar1 == (char *)0x0) goto code_r0x007610f4;
  goto code_r0x00761154;
LAB_007610a4:
  unaff_x26 = (long *)unaff_x26[1];
  if (unaff_x26 == (long *)0x0) goto code_r0x007610e4;
  goto code_r0x007610ac;
code_r0x007610e4:
  pcVar8 = (char *)0x0;
  if (unaff_x23 == (char *)0x0) {
code_r0x007610f4:
    if (*(int *)(unaff_x21 + 0x10) == 4) {
      unaff_x23 = "multipart/mixed";
      goto code_r0x00761154;
    }
    if (*(int *)(unaff_x21 + 0x10) == 2) {
      unaff_x23 = (char *)func_0x00760ea4(*(undefined8 *)(unaff_x21 + 0x60));
      if ((unaff_x23 != (char *)0x0) ||
         (unaff_x23 = (char *)func_0x00760ea4(*(undefined8 *)(unaff_x21 + 0x18)),
         unaff_x23 != (char *)0x0)) goto code_r0x00761154;
      unaff_x23 = (char *)0x0;
      if (*(long *)(unaff_x21 + 0x60) != 0) {
        unaff_x23 = "application/octet-stream";
      }
      iVar3 = *(int *)(unaff_x21 + 0x10);
    }
    else {
      unaff_x23 = (char *)func_0x00760ea4(*(undefined8 *)(unaff_x21 + 0x60));
      iVar3 = *(int *)(unaff_x21 + 0x10);
    }
  }
  else {
code_r0x00761154:
    iVar3 = *(int *)(unaff_x21 + 0x10);
  }
  if (iVar3 == 4) {
    lVar10 = *(long *)(unaff_x21 + 0x38);
    plVar9 = *(long **)(unaff_x21 + 0x50);
  }
  else {
    lVar10 = 0;
    if ((pcVar8 == (char *)0x0) && (unaff_x23 != (char *)0x0)) {
      iVar3 = func_0x0077e76c(unaff_x23,"text/plain",10);
      if (((iVar3 != 0) &&
          ((byte)unaff_x23[10] < 0x3c &&
           (1L << ((long)unaff_x23[10] & 0x3fU) & 0x800000100002601U) != 0)) &&
         (((int)unaff_x19 == 0 || (*(long *)(unaff_x21 + 0x60) == 0)))) {
        unaff_x23 = (char *)0x0;
      }
      lVar10 = 0;
      plVar9 = *(long **)(unaff_x21 + 0x50);
    }
    else {
      plVar9 = *(long **)(unaff_x21 + 0x50);
    }
  }
  for (; plVar9 != (long *)0x0; plVar9 = (long *)plVar9[1]) {
    iVar3 = func_0x0077e76c(*plVar9,"Content-Disposition",0x13);
    if ((iVar3 != 0) && (*(char *)(*plVar9 + 0x13) == ':')) goto code_r0x007613cc;
  }
  if (unaff_x24 == (char *)0x0) {
    if ((*(long *)(unaff_x21 + 0x60) != 0) || (*(long *)(unaff_x21 + 0x68) != 0)) {
code_r0x00761278:
      unaff_x24 = "attachment";
      iVar3 = func_0x0077e6f8("attachment","attachment");
      goto joined_r0x00761290;
    }
    if (unaff_x23 == (char *)0x0) goto code_r0x0076143c;
    iVar3 = func_0x0077e76c(unaff_x23,"multipart/",10);
    if (iVar3 == 0) goto code_r0x00761278;
code_r0x007613d0:
    uVar6 = func_0x00760e1c();
    if ((int)uVar6 != 0) {
      return uVar6;
    }
    bVar7 = 1;
    plVar9 = *(long **)(unaff_x21 + 0x50);
  }
  else {
    iVar3 = func_0x0077e6f8();
joined_r0x00761290:
    if ((iVar3 == 0) || (*(long *)(unaff_x21 + 0x68) != 0)) {
      if (unaff_x24 != (char *)0x0) {
        if (*(long *)(unaff_x21 + 0x68) == 0) goto code_r0x007612f8;
        lVar4 = func_0x007615c8();
        if (lVar4 != 0) {
          lVar5 = *(long *)(unaff_x21 + 0x60);
          goto joined_r0x007612c4;
        }
        lVar5 = 0;
code_r0x00761394:
        uVar6 = 0x1b;
        goto code_r0x00761398;
      }
    }
    else if ((unaff_x24 != (char *)0x0) && (*(long *)(unaff_x21 + 0x60) != 0)) {
code_r0x007612f8:
      lVar4 = 0;
      lVar5 = *(long *)(unaff_x21 + 0x60);
joined_r0x007612c4:
      if (lVar5 == 0) {
        lVar5 = 0;
      }
      else {
        lVar5 = func_0x007615c8();
        if (lVar5 == 0) goto code_r0x00761394;
      }
      uVar6 = func_0x00760e1c();
code_r0x00761398:
      (*pcRam0000000000a2b5f0)(lVar4);
      (*pcRam0000000000a2b5f0)(lVar5);
      if ((int)uVar6 != 0) {
        return uVar6;
      }
    }
code_r0x007613cc:
    if (unaff_x23 != (char *)0x0) goto code_r0x007613d0;
code_r0x0076143c:
    bVar7 = 0;
    plVar9 = *(long **)(unaff_x21 + 0x50);
  }
  for (; plVar9 != (long *)0x0; plVar9 = (long *)plVar9[1]) {
    iVar3 = func_0x0077e76c(*plVar9,"Content-Transfer-Encoding",0x19);
    if ((iVar3 != 0) && (*(char *)(*plVar9 + 0x19) == ':')) goto code_r0x007614d0;
  }
  if (*(long **)(unaff_x21 + 0x90) == (long *)0x0) {
    bVar2 = (bool)(bVar7 ^ 1);
    if ((int)unaff_x19 != 0) {
      bVar2 = true;
    }
    if ((bVar2) || (*(int *)(unaff_x21 + 0x10) == 4)) goto code_r0x007614d0;
  }
  else if (**(long **)(unaff_x21 + 0x90) == 0) goto code_r0x007614d0;
  uVar6 = func_0x00760e1c();
  if ((int)uVar6 != 0) {
    return uVar6;
  }
code_r0x007614d0:
  if (*(int *)(unaff_x21 + 0x78) == 1) {
    *(undefined4 *)(unaff_x21 + 0x78) = 1;
    *(undefined8 *)(unaff_x21 + 0x80) = *(undefined8 *)(unaff_x21 + 0x48);
    *(undefined8 *)(unaff_x21 + 0x88) = 0;
  }
  if ((lVar10 != 0) && (*(int *)(unaff_x21 + 0x10) == 4)) {
    if (unaff_x23 == (char *)0x0) {
      pcVar8 = (char *)0x0;
      lVar10 = *(long *)(lVar10 + 8);
    }
    else {
      iVar3 = func_0x0077e76c(unaff_x23,"multipart/form-data",0x13);
      pcVar8 = (char *)0x0;
      if (((iVar3 != 0) && ((byte)unaff_x23[0x13] < 0x3c)) &&
         ((1L << ((long)unaff_x23[0x13] & 0x3fU) & 0x800000100002601U) != 0)) {
        pcVar8 = "form-data";
      }
      lVar10 = *(long *)(lVar10 + 8);
    }
    for (; lVar10 != 0; lVar10 = *(long *)(lVar10 + 8)) {
      uVar6 = func_0x00761020(unaff_x20,lVar10,0,pcVar8,unaff_x19);
      if ((int)uVar6 != 0) {
        return uVar6;
      }
    }
  }
  return 0;
}

