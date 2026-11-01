
undefined8 FUN_007613e8(undefined8 param_1)

{
  int iVar1;
  undefined8 uVar2;
  int unaff_w19;
  long unaff_x21;
  long lVar3;
  long unaff_x23;
  long *plVar4;
  long unaff_x27;
  undefined8 uStack0000000000000008;
  
  uStack0000000000000008 = param_1;
  uVar2 = func_0x00760e1c();
  if ((int)uVar2 != 0) {
    return uVar2;
  }
  for (plVar4 = *(long **)(unaff_x21 + 0x50); plVar4 != (long *)0x0; plVar4 = (long *)plVar4[1]) {
    iVar1 = func_0x0077e76c(*plVar4,"Content-Transfer-Encoding",0x19);
    if ((iVar1 != 0) && (*(char *)(*plVar4 + 0x19) == ':')) goto LAB_007614d0;
  }
  if (*(long **)(unaff_x21 + 0x90) == (long *)0x0) {
    if ((unaff_w19 != 0) || (*(int *)(unaff_x21 + 0x10) == 4)) goto LAB_007614d0;
  }
  else if (**(long **)(unaff_x21 + 0x90) == 0) goto LAB_007614d0;
  uVar2 = func_0x00760e1c();
  if ((int)uVar2 != 0) {
    return uVar2;
  }
LAB_007614d0:
  if (*(int *)(unaff_x21 + 0x78) == 1) {
    *(undefined4 *)(unaff_x21 + 0x78) = 1;
    *(undefined8 *)(unaff_x21 + 0x80) = *(undefined8 *)(unaff_x21 + 0x48);
    *(undefined8 *)(unaff_x21 + 0x88) = 0;
  }
  if ((unaff_x27 != 0) && (*(int *)(unaff_x21 + 0x10) == 4)) {
    if (unaff_x23 == 0) {
      lVar3 = *(long *)(unaff_x27 + 8);
    }
    else {
      func_0x0077e76c();
      lVar3 = *(long *)(unaff_x27 + 8);
    }
    for (; lVar3 != 0; lVar3 = *(long *)(lVar3 + 8)) {
      uVar2 = func_0x00761020();
      if ((int)uVar2 != 0) {
        return uVar2;
      }
    }
  }
  return 0;
}

