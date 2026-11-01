
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_00761254(void)

{
  bool bVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  long unaff_x21;
  char *pcVar5;
  long unaff_x23;
  long unaff_x24;
  undefined8 uVar6;
  byte bVar7;
  long *plVar8;
  long unaff_x27;
  
  iVar2 = func_0x0077e6f8();
  if ((iVar2 == 0) || (*(long *)(unaff_x21 + 0x68) != 0)) {
    if (unaff_x24 != 0) {
      if (*(long *)(unaff_x21 + 0x68) == 0) goto LAB_007612f8;
      lVar3 = func_0x007615c8();
      if (lVar3 != 0) {
        lVar4 = *(long *)(unaff_x21 + 0x60);
        goto joined_r0x007612c4;
      }
      lVar4 = 0;
LAB_00761394:
      uVar6 = 0x1b;
      goto LAB_00761398;
    }
  }
  else if ((unaff_x24 != 0) && (*(long *)(unaff_x21 + 0x60) != 0)) {
LAB_007612f8:
    lVar3 = 0;
    lVar4 = *(long *)(unaff_x21 + 0x60);
joined_r0x007612c4:
    if (lVar4 == 0) {
      lVar4 = 0;
    }
    else {
      lVar4 = func_0x007615c8();
      if (lVar4 == 0) goto LAB_00761394;
    }
    uVar6 = func_0x00760e1c();
LAB_00761398:
    (*pcRam0000000000a2b5f0)(lVar3);
    (*pcRam0000000000a2b5f0)(lVar4);
    if ((int)uVar6 != 0) {
      return uVar6;
    }
  }
  if (unaff_x23 == 0) {
    bVar7 = 0;
    plVar8 = *(long **)(unaff_x21 + 0x50);
  }
  else {
    uVar6 = func_0x00760e1c();
    if ((int)uVar6 != 0) {
      return uVar6;
    }
    bVar7 = 1;
    plVar8 = *(long **)(unaff_x21 + 0x50);
  }
  for (; plVar8 != (long *)0x0; plVar8 = (long *)plVar8[1]) {
    iVar2 = func_0x0077e76c(*plVar8,"Content-Transfer-Encoding",0x19);
    if ((iVar2 != 0) && (*(char *)(*plVar8 + 0x19) == ':')) goto code_r0x007614d0;
  }
  if (*(long **)(unaff_x21 + 0x90) == (long *)0x0) {
    bVar1 = (bool)(bVar7 ^ 1);
    if ((int)unaff_x19 != 0) {
      bVar1 = true;
    }
    if ((bVar1) || (*(int *)(unaff_x21 + 0x10) == 4)) goto code_r0x007614d0;
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
  if ((unaff_x27 != 0) && (*(int *)(unaff_x21 + 0x10) == 4)) {
    if (unaff_x23 == 0) {
      pcVar5 = (char *)0x0;
      lVar3 = *(long *)(unaff_x27 + 8);
    }
    else {
      iVar2 = func_0x0077e76c();
      pcVar5 = (char *)0x0;
      if (((iVar2 != 0) && (*(byte *)(unaff_x23 + 0x13) < 0x3c)) &&
         ((1L << ((long)(char)*(byte *)(unaff_x23 + 0x13) & 0x3fU) & 0x800000100002601U) != 0)) {
        pcVar5 = "form-data";
      }
      lVar3 = *(long *)(unaff_x27 + 8);
    }
    for (; lVar3 != 0; lVar3 = *(long *)(lVar3 + 8)) {
      uVar6 = func_0x00761020(unaff_x20,lVar3,0,pcVar5,unaff_x19);
      if ((int)uVar6 != 0) {
        return uVar6;
      }
    }
  }
  return 0;
}

