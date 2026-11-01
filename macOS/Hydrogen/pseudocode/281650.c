
undefined8 FUN_00281650(void)

{
  int iVar1;
  undefined8 uVar2;
  int in_w8;
  long *unaff_x19;
  char *unaff_x20;
  
  if (in_w8 == 0x78) {
    uVar2 = func_0x002810b0();
    iVar1 = (int)uVar2;
  }
  else {
    uVar2 = func_0x00281464();
    iVar1 = (int)uVar2;
  }
  if (iVar1 != 0) {
    if (*unaff_x20 != '-') {
      return 1;
    }
    iVar1 = func_0x0029b308(*unaff_x19);
    uVar2 = 1;
    if (iVar1 == 0) {
      *(undefined4 *)(*unaff_x19 + 0x10) = 1;
      return uVar2;
    }
  }
  return uVar2;
}

