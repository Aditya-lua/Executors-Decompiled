
/* WARNING: Possible PIC construction at 0x0019b208: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0019b20c) */

void FUN_0019b1f0(void)

{
  undefined8 *puVar1;
  
  __Unwind_Resume();
  puVar1 = (undefined8 *)func_0x007a2668();
                    /* WARNING: Could not recover jumptable at 0x007b2170. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__CFRelease_00a241b0)(*puVar1);
  return;
}

