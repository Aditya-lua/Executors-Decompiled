
undefined8 FUN_00038418(undefined8 *param_1,undefined1 param_2 [16])

{
  long unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined8 uVar1;
  undefined8 uVar2;
  
  uVar2 = param_2._8_8_;
  uVar1 = param_2._0_8_;
  while( true ) {
    param_1[1] = uVar2;
    *param_1 = uVar1;
    *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + 0x10;
    unaff_x20 = unaff_x20 + 1;
    func_0x006e4860();
    unaff_x22 = unaff_x22 + 0x10;
    if (unaff_x23 == unaff_x20) break;
    uVar2 = ((undefined8 *)(*unaff_x21 + unaff_x22))[1];
    uVar1 = *(undefined8 *)(*unaff_x21 + unaff_x22);
    param_1 = *(undefined8 **)(unaff_x19 + 8);
  }
  return 1;
}

