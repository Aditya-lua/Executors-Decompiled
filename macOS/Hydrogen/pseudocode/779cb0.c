
undefined8 FUN_00779cb0(long param_1)

{
  undefined4 *unaff_x19;
  
  if (param_1 != 0) {
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

