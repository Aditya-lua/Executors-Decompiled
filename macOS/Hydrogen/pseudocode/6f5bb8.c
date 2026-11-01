
void FUN_006f5bb8(undefined8 param_1)

{
  long unaff_x19;
  
  *(undefined8 *)(unaff_x19 + 0xb58) = param_1;
  ___cxa_guard_release(0xa28b60);
  lRam0000000000a278c8 = *(long *)(unaff_x19 + 0xb58) + 0x1560254;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR____cxa_guard_release_00a24b40)(0xa278d0);
  return;
}

