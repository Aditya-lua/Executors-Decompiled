
void FUN_00093960(undefined8 param_1)

{
  long unaff_x19;
  
  *(undefined8 *)(unaff_x19 + 0xb88) = param_1;
  ___cxa_guard_release(0xa28b90);
  lRam0000000000a279d8 = *(long *)(unaff_x19 + 0xb88) + 0x1bfdc18;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR____cxa_guard_release_00a24b40)(0xa279e0);
  return;
}

