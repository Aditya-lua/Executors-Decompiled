
/* WARNING: Possible PIC construction at 0x00591c2c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00591e78: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00591c30) */
/* WARNING: Removing unreachable block (ram,0x00591c3c) */
/* WARNING: Removing unreachable block (ram,0x00591c54) */
/* WARNING: Removing unreachable block (ram,0x00591c7c) */
/* WARNING: Removing unreachable block (ram,0x00591c5c) */
/* WARNING: Removing unreachable block (ram,0x00591c44) */
/* WARNING: Removing unreachable block (ram,0x00591e7c) */
/* WARNING: Removing unreachable block (ram,0x00591e84) */
/* WARNING: Removing unreachable block (ram,0x00591e90) */
/* WARNING: Removing unreachable block (ram,0x00591e9c) */
/* WARNING: Removing unreachable block (ram,0x00591eb4) */
/* WARNING: Removing unreachable block (ram,0x00591edc) */
/* WARNING: Removing unreachable block (ram,0x00591ebc) */
/* WARNING: Removing unreachable block (ram,0x00591ea4) */

void FUN_00591134(long param_1,long param_2)

{
  bool in_CY;
  long in_x9;
  long unaff_x19;
  undefined8 uVar1;
  
  if (in_CY) {
    param_1 = in_x9;
  }
  if (param_1 == 0) {
    return;
  }
  if (param_1 == 1) {
    uVar1 = *(undefined8 *)(unaff_x19 + 0x28);
    func_0x00590e80(uVar1);
  }
  else {
    uVar1 = *(undefined8 *)(param_2 + 0x30);
    func_0x00590e80(uVar1);
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar1,0x40,8);
  return;
}

