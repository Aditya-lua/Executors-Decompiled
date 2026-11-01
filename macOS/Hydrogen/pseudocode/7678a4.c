
undefined8 FUN_007678a4(void)

{
  long lVar1;
  long *unaff_x19;
  undefined8 uVar2;
  long unaff_x21;
  
  lVar1 = func_0x0077e8e4();
  if (lVar1 == 0) {
    uVar2 = 0x1b;
  }
  else {
    uVar2 = 0;
    *unaff_x19 = lVar1;
    unaff_x19[1] = unaff_x21;
  }
  (*pcRam0000000000a2b5f0)(*unaff_x19);
  *unaff_x19 = 0;
  func_0x00740678(unaff_x19 + 5);
  return uVar2;
}

