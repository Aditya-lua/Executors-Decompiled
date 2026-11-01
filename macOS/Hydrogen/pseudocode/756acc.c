
void FUN_00756acc(long param_1)

{
  undefined8 *puVar1;
  long unaff_x19;
  long unaff_x20;
  
  puVar1 = (undefined8 *)(unaff_x20 + 0x5f0);
  (*(code *)*puVar1)(*(undefined8 *)(param_1 + 0x18));
  (*(code *)*puVar1)(*(undefined8 *)(unaff_x19 + 0x20));
  (*(code *)*puVar1)(*(undefined8 *)(unaff_x19 + 0x28));
  func_0x00740ab8(unaff_x19 + 0x30);
  func_0x00740ab8(unaff_x19 + 0x68);
                    /* WARNING: Could not recover jumptable at 0x00756b14. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*puVar1)();
  return;
}

