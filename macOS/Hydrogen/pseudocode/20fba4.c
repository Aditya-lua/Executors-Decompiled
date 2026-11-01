
void FUN_0020fba4(undefined8 param_1,undefined8 param_2)

{
  long *unaff_x19;
  undefined8 *unaff_x21;
  undefined8 unaff_x22;
  long *unaff_x23;
  undefined8 unaff_x24;
  long unaff_x27;
  
  _memcpy(param_1,param_2,0x168);
  unaff_x21[1] = unaff_x22;
  unaff_x21[2] = &UNK_009c6730;
  *unaff_x21 = unaff_x24;
  func_0x002087e4();
  if ((unaff_x27 == -0x8000000000000000) && (*unaff_x23 != -0x8000000000000000)) {
    func_0x002097e0();
  }
  if (*unaff_x19 != 0) {
    func_0x00187bd4(unaff_x19[1],*unaff_x19 << 2,2);
  }
  func_0x00187bd4();
  return;
}

