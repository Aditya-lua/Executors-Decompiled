
void FUN_004203f8(undefined8 param_1,long param_2)

{
  uint unaff_w19;
  uint *unaff_x20;
  long unaff_x25;
  
  if (param_2 != 0) {
    func_0x00187bd4();
  }
  func_0x00187bd4();
  if (unaff_x25 == 0) {
    unaff_x20[1] = unaff_w19;
  }
  else {
    _close();
    *(long *)(unaff_x20 + 2) = unaff_x25;
  }
  *unaff_x20 = (uint)(unaff_x25 != 0);
  return;
}

