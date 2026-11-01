
void FUN_0052a5dc(void)

{
  bool in_ZR;
  long in_x9;
  undefined8 in_x10;
  long in_x11;
  undefined8 in_x12;
  
  if (!in_ZR) {
    in_x10 = in_x12;
    in_x9 = in_x11;
  }
                    /* WARNING: Could not recover jumptable at 0x0052a5e8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(in_x9 + 0x30))(in_x10);
  return;
}

