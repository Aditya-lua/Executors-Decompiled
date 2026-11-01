
void FUN_0077e438(void)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  undefined8 *unaff_x22;
  
  lVar1 = func_0x00782ea8();
  if (lVar1 < 0) {
    *unaff_x19 = *unaff_x22;
    unaff_x19[1] = unaff_x22;
    *unaff_x22 = 0;
  }
  else {
    uVar2 = unaff_x22[1];
    *unaff_x19 = unaff_x22;
    unaff_x19[1] = uVar2;
    unaff_x22[1] = 0;
  }
  unaff_x19[4] = unaff_x21;
  unaff_x19[5] = unaff_x20;
  unaff_x19[2] = unaff_x19;
  unaff_x19[3] = unaff_x19;
  return;
}

