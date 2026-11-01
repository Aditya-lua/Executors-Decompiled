
void FUN_006f6814(void)

{
  code *pcVar1;
  long unaff_x19;
  long unaff_x20;
  
  func_0x006f3a2c();
  pcVar1 = *(code **)(*(long *)(unaff_x19 + 0x18) + 0x530);
  if (pcVar1 != (code *)0x0) {
    (*pcVar1)();
  }
                    /* WARNING: Could not recover jumptable at 0x006f6848. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(unaff_x20 + 0x10))(*(undefined8 *)(unaff_x20 + 0x18));
  return;
}

