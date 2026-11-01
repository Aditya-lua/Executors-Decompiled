
void thunk_FUN_004a77d0(void)

{
  undefined8 extraout_x1;
  undefined8 uVar1;
  long lVar2;
  long lStack_58;
  long lStack_50;
  long lStack_48;
  
  __Unwind_Resume();
  func_0x005dc67c(&lStack_58);
  for (lVar2 = 0; lStack_48 * 8 != lVar2; lVar2 = lVar2 + 8) {
    uVar1 = *(undefined8 *)(lStack_50 + lVar2);
    func_0x004aa3a8(extraout_x1,uVar1);
    func_0x004a9af0(uVar1,extraout_x1);
  }
  if (lStack_58 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lStack_50,lStack_58 << 3,8);
  return;
}

