
undefined8 FUN_0028dd24(int param_1)

{
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  
  if (param_1 == 0) {
    func_0x002c3420();
    return 0;
  }
  if (unaff_x19 != (undefined8 *)0x0) {
    func_0x002c3420(*unaff_x19);
    *unaff_x19 = unaff_x20;
  }
  return unaff_x20;
}

