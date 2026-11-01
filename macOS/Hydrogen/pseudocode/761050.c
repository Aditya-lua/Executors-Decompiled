
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_00761050(undefined8 param_1,long param_2)

{
  char *pcVar1;
  bool bVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  undefined8 unaff_x19;
  long unaff_x21;
  undefined8 *puVar6;
  long lVar7;
  char *unaff_x23;
  char *unaff_x24;
  undefined8 uVar8;
  byte bVar9;
  char *pcVar10;
  long *plVar11;
  
  puVar6 = (undefined8 *)(param_2 + 0x48);
  func_0x00779fa4(*puVar6);
  *puVar6 = 0;
  if (*(int *)(param_2 + 0x78) == 1) {
    *(undefined4 *)(unaff_x21 + 0x78) = 1;
    *(undefined8 *)(unaff_x21 + 0x80) = 0;
    *(undefined8 *)(unaff_x21 + 0x88) = 0;
  }
  pcVar10 = *(char **)(unaff_x21 + 0x58);
  if (pcVar10 == (char *)0x0) {
    plVar11 = *(long **)(unaff_x21 + 0x50);
    if (plVar11 != (long *)0x0) {
LAB_007610ac:
      iVar3 = func_0x0077e76c(*plVar11,"Content-Type",0xc);
      if ((iVar3 == 0) || (*(char *)(*plVar11 + 0xc) != ':')) goto code_r0x007610a4;
      pcVar10 = (char *)(*plVar11 + 0xc);
      do {
        pcVar10 = pcVar10 + 1;
      } while (*pcVar10 == ' ');
      goto code_r0x00761080;
    }
LAB_007610e4:
    pcVar10 = (char *)0x0;
    if (unaff_x23 == (char *)0x0) goto LAB_007610f4;
LAB_00761154:
    iVar3 = *(int *)(unaff_x21 + 0x10);
  }
  else {
code_r0x00761080:
    pcVar1 = pcVar10;
    if (pcVar10 == (char *)0x0) {
      pcVar1 = unaff_x23;
    }
    unaff_x23 = pcVar1;
    if (pcVar1 != (char *)0x0) goto LAB_00761154;
LAB_007610f4:
    if (*(int *)(unaff_x21 + 0x10) == 4) {
      unaff_x23 = "multipart/mixed";
      goto LAB_00761154;
    }
    if (*(int *)(unaff_x21 + 0x10) == 2) {
      unaff_x23 = (char *)func_0x00760ea4(*(undefined8 *)(unaff_x21 + 0x60));
      if ((unaff_x23 != (char *)0x0) ||
         (unaff_x23 = (char *)func_0x00760ea4(*(undefined8 *)(unaff_x21 + 0x18)),
         unaff_x23 != (char *)0x0)) goto LAB_00761154;
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
  if (iVar3 == 4) {
    lVar7 = *(long *)(unaff_x21 + 0x38);
    plVar11 = *(long **)(unaff_x21 + 0x50);
  }
  else {
    if ((pcVar10 == (char *)0x0) && (unaff_x23 != (char *)0x0)) {
      iVar3 = func_0x0077e76c(unaff_x23,"text/plain",10);
      if (((iVar3 != 0) &&
          ((byte)unaff_x23[10] < 0x3c &&
           (1L << ((long)unaff_x23[10] & 0x3fU) & 0x800000100002601U) != 0)) &&
         (((int)unaff_x19 == 0 || (*(long *)(unaff_x21 + 0x60) == 0)))) {
        unaff_x23 = (char *)0x0;
      }
      plVar11 = *(long **)(unaff_x21 + 0x50);
    }
    else {
      plVar11 = *(long **)(unaff_x21 + 0x50);
    }
    lVar7 = 0;
  }
  for (; plVar11 != (long *)0x0; plVar11 = (long *)plVar11[1]) {
    iVar3 = func_0x0077e76c(*plVar11,"Content-Disposition",0x13);
    if ((iVar3 != 0) && (*(char *)(*plVar11 + 0x13) == ':')) goto code_r0x007613cc;
  }
  if (unaff_x24 == (char *)0x0) {
    if ((*(long *)(unaff_x21 + 0x60) != 0) || (*(long *)(unaff_x21 + 0x68) != 0)) {
code_r0x00761278:
      unaff_x24 = "attachment";
      iVar3 = func_0x0077e6f8("attachment","attachment");
      goto joined_r0x00761290;
    }
    if (unaff_x23 != (char *)0x0) {
      iVar3 = func_0x0077e76c(unaff_x23,"multipart/",10);
      if (iVar3 == 0) goto code_r0x00761278;
      goto code_r0x007613d0;
    }
LAB_0076143c:
    bVar9 = 0;
    plVar11 = *(long **)(unaff_x21 + 0x50);
  }
  else {
    iVar3 = func_0x0077e6f8();
joined_r0x00761290:
    if ((iVar3 == 0) || (*(long *)(unaff_x21 + 0x68) != 0)) {
      if (unaff_x24 != (char *)0x0) {
        if (*(long *)(unaff_x21 + 0x68) == 0) goto code_r0x007612f8;
        lVar4 = func_0x007615c8(param_1);
        if (lVar4 != 0) {
          lVar5 = *(long *)(unaff_x21 + 0x60);
          goto joined_r0x007612c4;
        }
        lVar5 = 0;
code_r0x00761394:
        uVar8 = 0x1b;
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
        lVar5 = func_0x007615c8(param_1);
        if (lVar5 == 0) goto code_r0x00761394;
      }
      uVar8 = func_0x00760e1c(puVar6,"Content-Disposition: %s%s%s%s%s%s%s");
code_r0x00761398:
      (*pcRam0000000000a2b5f0)(lVar4);
      (*pcRam0000000000a2b5f0)(lVar5);
      if ((int)uVar8 != 0) {
        return uVar8;
      }
    }
code_r0x007613cc:
    if (unaff_x23 == (char *)0x0) goto LAB_0076143c;
code_r0x007613d0:
    uVar8 = func_0x00760e1c(puVar6,"Content-Type: %s%s%s");
    if ((int)uVar8 != 0) {
      return uVar8;
    }
    bVar9 = 1;
    plVar11 = *(long **)(unaff_x21 + 0x50);
  }
  for (; plVar11 != (long *)0x0; plVar11 = (long *)plVar11[1]) {
    iVar3 = func_0x0077e76c(*plVar11,"Content-Transfer-Encoding",0x19);
    if ((iVar3 != 0) && (*(char *)(*plVar11 + 0x19) == ':')) goto code_r0x007614d0;
  }
  if (*(long **)(unaff_x21 + 0x90) == (long *)0x0) {
    bVar2 = (bool)(bVar9 ^ 1);
    if ((int)unaff_x19 != 0) {
      bVar2 = true;
    }
    if ((bVar2) || (*(int *)(unaff_x21 + 0x10) == 4)) goto code_r0x007614d0;
  }
  else if (**(long **)(unaff_x21 + 0x90) == 0) goto code_r0x007614d0;
  uVar8 = func_0x00760e1c(puVar6,"Content-Transfer-Encoding: %s");
  if ((int)uVar8 != 0) {
    return uVar8;
  }
code_r0x007614d0:
  if (*(int *)(unaff_x21 + 0x78) == 1) {
    *(undefined4 *)(unaff_x21 + 0x78) = 1;
    *(undefined8 *)(unaff_x21 + 0x80) = *(undefined8 *)(unaff_x21 + 0x48);
    *(undefined8 *)(unaff_x21 + 0x88) = 0;
  }
  if ((lVar7 != 0) && (*(int *)(unaff_x21 + 0x10) == 4)) {
    if (unaff_x23 == (char *)0x0) {
      pcVar10 = (char *)0x0;
      lVar7 = *(long *)(lVar7 + 8);
    }
    else {
      iVar3 = func_0x0077e76c(unaff_x23,"multipart/form-data",0x13);
      pcVar10 = (char *)0x0;
      if (((iVar3 != 0) && ((byte)unaff_x23[0x13] < 0x3c)) &&
         ((1L << ((long)unaff_x23[0x13] & 0x3fU) & 0x800000100002601U) != 0)) {
        pcVar10 = "form-data";
      }
      lVar7 = *(long *)(lVar7 + 8);
    }
    for (; lVar7 != 0; lVar7 = *(long *)(lVar7 + 8)) {
      uVar8 = func_0x00761020(param_1,lVar7,0,pcVar10,unaff_x19);
      if ((int)uVar8 != 0) {
        return uVar8;
      }
    }
  }
  return 0;
code_r0x007610a4:
  plVar11 = (long *)plVar11[1];
  if (plVar11 == (long *)0x0) goto LAB_007610e4;
  goto LAB_007610ac;
}

