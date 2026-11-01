
/* WARNING: Possible PIC construction at 0x004bc0e0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004bc140: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004bc180: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x004bc144) */
/* WARNING: Removing unreachable block (ram,0x004bc184) */
/* WARNING: Removing unreachable block (ram,0x004bc190) */
/* WARNING: Removing unreachable block (ram,0x004bc1a8) */
/* WARNING: Removing unreachable block (ram,0x004bc1d0) */
/* WARNING: Removing unreachable block (ram,0x004bc1b0) */
/* WARNING: Removing unreachable block (ram,0x004bc198) */

void FUN_004bc0c0(long param_1)

{
  undefined8 uVar1;
  long lVar2;
  long extraout_x8;
  long unaff_x19;
  long *unaff_x21;
  long unaff_x23;
  long unaff_x24;
  
  while( true ) {
    func_0x004ca6d8(param_1);
    unaff_x23 = unaff_x23 + -1;
    if (unaff_x23 == 0) break;
    param_1 = unaff_x24;
    unaff_x24 = unaff_x24 + 0x40;
  }
  lVar2 = *(long *)(unaff_x19 + 0x60);
  if (lVar2 == 0) {
    if (*unaff_x21 != 0xc) {
      func_0x004bb4f4();
    }
    __Unwind_Resume();
    uVar1 = *(undefined8 *)(unaff_x19 + 8);
    lVar2 = extraout_x8;
  }
  else {
    uVar1 = *(undefined8 *)(unaff_x19 + 0x68);
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar1,lVar2 << 6,8);
  return;
}

