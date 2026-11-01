
/* WARNING: Possible PIC construction at 0x004bc4d8: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x004bc4dc) */
/* WARNING: Removing unreachable block (ram,0x004bc4e4) */
/* WARNING: Removing unreachable block (ram,0x004bc4f0) */
/* WARNING: Removing unreachable block (ram,0x004bc4fc) */
/* WARNING: Removing unreachable block (ram,0x004bc514) */
/* WARNING: Removing unreachable block (ram,0x004bc53c) */
/* WARNING: Removing unreachable block (ram,0x004bc51c) */
/* WARNING: Removing unreachable block (ram,0x004bc504) */

void FUN_004bc4b8(long param_1)

{
  undefined8 uVar1;
  
  uVar1 = *(undefined8 *)(param_1 + 0x30);
  func_0x004bb4f4(uVar1);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar1,0x40,8);
  return;
}

