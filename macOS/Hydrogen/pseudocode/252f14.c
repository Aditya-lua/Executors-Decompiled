
undefined8 FUN_00252f14(long param_1)

{
  uint uVar1;
  uint extraout_w1;
  undefined8 unaff_x19;
  uint unaff_w21;
  uint unaff_w22;
  
  uVar1 = (**(code **)(param_1 + 0x30))();
  if (unaff_w22 != (extraout_w1 & 0xff) && unaff_w21 == 7 || unaff_w21 != (uVar1 & 0xff)) {
    unaff_x19 = 0;
  }
  return unaff_x19;
}

