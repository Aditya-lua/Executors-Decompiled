
void FUN_002234fc(undefined8 *param_1)

{
  bool in_ZR;
  undefined8 in_x9;
  undefined8 in_x10;
  
  if (in_ZR) {
    in_x10 = in_x9;
  }
                    /* WARNING: Could not recover jumptable at 0x00469224. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(param_1[1] + 0x18))(*param_1,in_x10);
  return;
}

