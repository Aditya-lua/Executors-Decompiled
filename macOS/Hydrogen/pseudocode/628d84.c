
void FUN_00628d84(long param_1)

{
  undefined8 uVar1;
  long unaff_x20;
  long *unaff_x21;
  
  uVar1 = (**(code **)(param_1 + 0x50))();
  (**(code **)(*(long *)(unaff_x20 + 8) + 0x68))((long *)(unaff_x20 + 8));
  (**(code **)(unaff_x21[3] + 0xa8))();
  func_0x005ffccc(unaff_x21 + 6,uVar1);
  *(undefined4 *)(unaff_x21 + 5) = 0;
                    /* WARNING: Could not recover jumptable at 0x00628dec. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*unaff_x21 + 0x28))();
  return;
}

