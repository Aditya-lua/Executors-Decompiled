
undefined8 FUN_00740d4c(void)

{
  long *plVar1;
  long *plVar2;
  undefined8 uVar3;
  long lVar4;
  ulong uVar5;
  long *unaff_x19;
  long unaff_x21;
  long lVar6;
  long unaff_x23;
  long unaff_x26;
  ulong unaff_x28;
  
  plVar2 = (long *)(*pcRam0000000000a2b608)(1,unaff_x26 + 0x22);
  if (plVar2 == (long *)0x0) {
LAB_00740e64:
    uVar3 = 0x1b;
  }
  else {
    plVar1 = plVar2 + 4;
    *plVar2 = (long)plVar1;
    _memcpy(plVar1);
    plVar2[1] = (long)plVar1 + unaff_x23 + 1;
    plVar2[2] = unaff_x23;
    _memcpy();
    plVar2[3] = unaff_x21;
    if ((unaff_x28 & 1) != 0) {
      func_0x0077e82c(*plVar2,*plVar2,plVar2[2]);
    }
    lVar4 = unaff_x19[1];
    uVar5 = lVar4 + 1;
    if (uVar5 < (ulong)unaff_x19[2]) {
      lVar6 = *unaff_x19;
    }
    else {
      uVar5 = unaff_x19[3];
      if (lVar4 + 0x10U <= uVar5 || uVar5 == 0) {
        uVar5 = lVar4 + 0x10U;
      }
      lVar6 = (*pcRam0000000000a2b608)(uVar5,8);
      if (lVar6 == 0) {
        (*pcRam0000000000a2b5f0)(plVar2);
        goto LAB_00740e64;
      }
      if (*unaff_x19 != 0) {
        _memcpy(lVar6,*unaff_x19,unaff_x19[1] << 3);
        (*pcRam0000000000a2b5f0)(*unaff_x19);
      }
      *unaff_x19 = lVar6;
      unaff_x19[2] = uVar5;
      lVar4 = unaff_x19[1];
      uVar5 = lVar4 + 1;
    }
    uVar3 = 0;
    unaff_x19[1] = uVar5;
    *(long **)(lVar6 + lVar4 * 8) = plVar2;
    unaff_x19[4] = unaff_x26 + unaff_x19[4];
  }
  return uVar3;
}

