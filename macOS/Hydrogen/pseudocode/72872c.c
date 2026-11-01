
long * FUN_0072872c(undefined8 *param_1)

{
  long *plVar1;
  long lVar2;
  ulong uVar3;
  undefined2 unaff_w20;
  undefined2 unaff_w21;
  undefined4 unaff_w22;
  undefined4 unaff_w23;
  ulong unaff_x24;
  char *unaff_x25;
  char *unaff_x26;
  ulong unaff_x27;
  
  plVar1 = (long *)(*(code *)*param_1)(1,0x50);
  if (plVar1 == (long *)0x0) {
    return (long *)0x0;
  }
  if ((unaff_x27 != 0) && (unaff_x24 != 0)) {
    if ((unaff_x27 < 3) || (*unaff_x26 != '[')) {
      uVar3 = unaff_x27 - 1;
      if ((unaff_x26[uVar3] == '.') && (unaff_x27 = uVar3, uVar3 == 0)) goto LAB_007287dc;
    }
    else {
      unaff_x26 = unaff_x26 + 1;
      unaff_x27 = unaff_x27 - 2;
    }
    if ((2 < unaff_x24) && (*unaff_x25 == '[')) {
      unaff_x25 = unaff_x25 + 1;
      unaff_x24 = unaff_x24 - 2;
    }
    lVar2 = func_0x0077e93c(unaff_x26,unaff_x27);
    *plVar1 = lVar2;
    if (lVar2 != 0) {
      lVar2 = func_0x0077e93c(unaff_x25,unaff_x24);
      plVar1[2] = lVar2;
      if (lVar2 != 0) {
        *(undefined4 *)((long)plVar1 + 0xc) = unaff_w23;
        *(undefined4 *)((long)plVar1 + 0x1c) = unaff_w22;
        *(undefined2 *)(plVar1 + 1) = unaff_w21;
        *(undefined2 *)(plVar1 + 3) = unaff_w20;
        return plVar1;
      }
    }
  }
LAB_007287dc:
  (*pcRam0000000000a2b5f0)(*plVar1);
  (*pcRam0000000000a2b5f0)(plVar1[2]);
  (*pcRam0000000000a2b5f0)(plVar1);
  return (long *)0x0;
}

