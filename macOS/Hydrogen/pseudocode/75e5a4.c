
void FUN_0075e5a4(undefined8 param_1,undefined8 *param_2,undefined8 param_3)

{
  undefined8 uVar1;
  long in_x9;
  long in_x10;
  
  *(undefined8 *)(in_x10 + 0x10) = param_1;
  *(long *)(in_x9 + 0x18) = *(long *)(in_x9 + 0x18) + -1;
  uVar1 = param_2[1];
  param_2[1] = 0;
  *param_2 = 0;
  param_2[3] = 0;
  param_2[2] = 0;
  if (*(code **)(in_x9 + 0x10) == (code *)0x0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x0075e5f4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(in_x9 + 0x10))(param_3,uVar1);
  return;
}

