
undefined8 FUN_0073deb8(void)

{
  undefined8 uVar1;
  long *unaff_x19;
  long unaff_x20;
  long *plVar2;
  int unaff_w22;
  long *plVar3;
  
  plVar3 = (long *)*unaff_x19;
  if (((plVar3 == (long *)0x0) || (unaff_w22 == 2)) || ((int)plVar3[5] != unaff_w22)) {
    plVar3 = (long *)(*pcRam0000000000a2b608)(1,0x30);
    if (plVar3 == (long *)0x0) {
      return 0x1b;
    }
    *(int *)(plVar3 + 5) = unaff_w22;
    func_0x0074066c(plVar3 + 1,0x4000000);
    *plVar3 = *unaff_x19;
    *unaff_x19 = (long)plVar3;
  }
  uVar1 = func_0x0074075c(plVar3 + 1);
  if (((int)uVar1 == 0) && (uVar1 = func_0x0073e0b8(), (int)uVar1 != 0)) {
    plVar3 = (long *)*unaff_x19;
    *(byte *)(unaff_x20 + 0x28) = *(byte *)(unaff_x20 + 0x28) | 2;
    while (plVar3 != (long *)0x0) {
      plVar2 = (long *)*plVar3;
      func_0x00740678(plVar3 + 1);
      (*pcRam0000000000a2b5f0)(plVar3);
      *unaff_x19 = (long)plVar2;
      plVar3 = plVar2;
    }
  }
  return uVar1;
}

