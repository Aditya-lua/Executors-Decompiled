
/* WARNING: Possible PIC construction at 0x004bc140: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004bc180: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x004bc144) */
/* WARNING: Removing unreachable block (ram,0x004bc184) */
/* WARNING: Removing unreachable block (ram,0x004bc190) */
/* WARNING: Removing unreachable block (ram,0x004bc1a8) */
/* WARNING: Removing unreachable block (ram,0x004bc1d0) */
/* WARNING: Removing unreachable block (ram,0x004bc1b0) */
/* WARNING: Removing unreachable block (ram,0x004bc198) */

void FUN_004bc0e4(void)

{
  long extraout_x8;
  long unaff_x19;
  long *unaff_x21;
  
  if (*unaff_x21 != 0xc) {
    func_0x004bb4f4();
  }
  __Unwind_Resume();
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*(undefined8 *)(unaff_x19 + 8),extraout_x8 << 6,8);
  return;
}

