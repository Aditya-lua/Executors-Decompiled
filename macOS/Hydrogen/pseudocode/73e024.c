
undefined8 FUN_0073e024(undefined8 param_1)

{
  undefined8 uVar1;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long *plVar2;
  undefined8 *unaff_x24;
  long unaff_x25;
  long *plVar3;
  
  *unaff_x24 = param_1;
  *unaff_x19 = (long)unaff_x24;
  uVar1 = func_0x0074075c(unaff_x24 + 1,unaff_x21 + unaff_x25);
  if ((int)uVar1 == 0) {
    uVar1 = 0;
  }
  if ((int)uVar1 != 0) {
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

