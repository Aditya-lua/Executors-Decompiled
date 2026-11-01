
void FUN_0005e5d8(void)

{
  long *plVar1;
  long lVar2;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long *plVar3;
  long unaff_x22;
  long *plVar4;
  
  *(long *)(unaff_x19 + 0x90) = unaff_x22;
  if (unaff_x22 != 0) {
    plVar3 = (long *)(unaff_x19 + 0xb0);
    plVar1 = (long *)*plVar3;
    plVar4 = (long *)(unaff_x19 + 0x98);
    *plVar3 = 0;
    if (plVar1 == plVar4) {
      lVar2 = 4;
      plVar1 = plVar4;
LAB_0005e620:
      (**(code **)(*plVar1 + lVar2 * 8))();
    }
    else if (plVar1 != (long *)0x0) {
      lVar2 = 5;
      goto LAB_0005e620;
    }
    plVar1 = (long *)(unaff_x21 + 0x18);
    lVar2 = *plVar1;
    if (lVar2 == 0) {
      *plVar3 = 0;
    }
    else if (lVar2 == unaff_x21) {
      *plVar3 = (long)plVar4;
      (**(code **)(*(long *)*plVar1 + 0x18))((long *)*plVar1,plVar4);
    }
    else {
      *plVar3 = lVar2;
      *plVar1 = 0;
    }
  }
  plVar4 = (long *)(unaff_x19 + 0xd0);
  plVar1 = (long *)*plVar4;
  plVar3 = (long *)(unaff_x19 + 0xb8);
  *plVar4 = 0;
  if (plVar1 == plVar3) {
    lVar2 = 4;
    plVar1 = plVar3;
LAB_0005e69c:
    (**(code **)(*plVar1 + lVar2 * 8))();
  }
  else if (plVar1 != (long *)0x0) {
    lVar2 = 5;
    goto LAB_0005e69c;
  }
  plVar1 = (long *)(unaff_x20 + 0x18);
  lVar2 = *plVar1;
  if (lVar2 != 0) {
    if (lVar2 == unaff_x20) {
      *plVar4 = (long)plVar3;
      (**(code **)(*(long *)*plVar1 + 0x18))((long *)*plVar1,plVar3);
      goto LAB_0005e6e8;
    }
    *plVar4 = lVar2;
    plVar4 = plVar1;
  }
  *plVar4 = 0;
LAB_0005e6e8:
  *(undefined1 *)(unaff_x19 + 0xd8) = 0;
  return;
}

