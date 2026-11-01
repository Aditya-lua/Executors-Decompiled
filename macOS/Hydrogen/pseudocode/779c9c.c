
undefined8 FUN_00779c9c(void)

{
  undefined4 *unaff_x19;
  
  func_0x00739e0c(*(undefined8 *)(unaff_x19 + 0x3e));
  func_0x007508a4(unaff_x19 + 0x40);
  if (*(long *)(unaff_x19 + 0x42) != 0) {
    func_0x007969fc();
    *(undefined8 *)(unaff_x19 + 0x42) = 0;
  }
  if (*(code **)(unaff_x19 + 6) != (code *)0x0) {
    (**(code **)(unaff_x19 + 6))(0,1,*(undefined8 *)(unaff_x19 + 8));
  }
  *unaff_x19 = 0;
  (*pcRam0000000000a2b5f0)();
  return 0;
}

