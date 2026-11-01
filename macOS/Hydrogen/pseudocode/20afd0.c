
void FUN_0020afd0(undefined8 param_1,undefined1 param_2 [16])

{
  long lVar1;
  undefined4 in_w9;
  long *unaff_x19;
  undefined8 *unaff_x20;
  
  *(undefined4 *)(unaff_x20 + 3) = in_w9;
  unaff_x20[1] = param_2._8_8_;
  *unaff_x20 = param_2._0_8_;
  unaff_x20[2] = param_1;
  if (*unaff_x19 == -0x7ffffffffffffffb) {
    lVar1 = unaff_x19[1];
    if ((lVar1 != -0x8000000000000000) && (lVar1 != 0)) {
      func_0x00187bd4(unaff_x19[2],lVar1,1);
    }
  }
  else {
    func_0x002087e4();
  }
  return;
}

