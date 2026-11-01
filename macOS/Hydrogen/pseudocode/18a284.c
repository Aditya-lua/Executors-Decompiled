
/* WARNING: Possible PIC construction at 0x0018a2a4: Changing call to branch */

void FUN_0018a284(long param_1)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long *plVar4;
  long *unaff_x19;
  long unaff_x22;
  long unaff_x23;
  
  while( true ) {
    func_0x00194828(param_1);
    unaff_x22 = unaff_x22 + -1;
    if (unaff_x22 == 0) break;
    param_1 = unaff_x23;
    unaff_x23 = unaff_x23 + 8;
  }
  lVar3 = *unaff_x19;
  if (lVar3 == 0) {
    plVar4 = (long *)unaff_x19[4];
    if (plVar4 != (long *)0x0) {
      lVar3 = *plVar4;
      *plVar4 = lVar3 + -1;
      LORelease();
      if (lVar3 == 1) {
        DataMemoryBarrier(2,1);
        func_0x001f9f08(unaff_x19 + 4);
      }
    }
    __Unwind_Resume();
    func_0x007a2668();
    plVar4 = (long *)func_0x007a2668();
    lVar1 = plVar4[1];
    lVar3 = plVar4[2] + 1;
    lVar2 = lVar1;
    while (lVar3 = lVar3 + -1, lVar3 != 0) {
      func_0x00194828(lVar2);
      lVar2 = lVar2 + 8;
    }
    lVar3 = *plVar4;
    if (lVar3 == 0) {
      return;
    }
  }
  else {
    lVar1 = unaff_x19[1];
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,lVar3 << 3,8);
  return;
}

