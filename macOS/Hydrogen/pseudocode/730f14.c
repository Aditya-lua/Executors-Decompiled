
undefined8 FUN_00730f14(undefined8 param_1,long *param_2)

{
  undefined8 uVar1;
  byte in_w9;
  undefined4 *unaff_x19;
  
  while( true ) {
    if ((in_w9 & 1) != 0) {
                    /* WARNING: Could not recover jumptable at 0x00730f60. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar1 = (**(code **)(*param_2 + 0x50))(param_2,param_1);
      return uVar1;
    }
    param_2 = (long *)param_2[1];
    if (param_2 == (long *)0x0) break;
    in_w9 = *(byte *)((long)param_2 + 0x24);
  }
  func_0x0073c9e4(param_1,"recv: no filter connected");
  *unaff_x19 = 2;
  return 0xffffffffffffffff;
}

