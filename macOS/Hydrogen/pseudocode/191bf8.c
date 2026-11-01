
void FUN_00191bf8(long param_1)

{
  long lVar1;
  undefined4 *unaff_x19;
  undefined1 auVar2 [16];
  long in_stack_00000008;
  
  lVar1 = _CFArrayCreate(**(undefined8 **)(param_1 + 0x238),8,0,PTR__kCFTypeArrayCallBacks_009b0258)
  ;
  if (lVar1 == 0) {
    func_0x007a11c0(&UNK_00819f20,0x22,&UNK_009c0728);
    lVar1 = in_stack_00000008;
    if (in_stack_00000008 == 0) {
      auVar2 = func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c11d0);
                    /* WARNING: Could not recover jumptable at 0x007b2914. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__SecTrustSettingsSetTrustSettings_00a246c8)(*auVar2._8_8_,*auVar2._0_8_,0);
      return;
    }
  }
  *(long *)(unaff_x19 + 2) = lVar1;
  *(undefined8 *)(unaff_x19 + 4) = 0;
  *unaff_x19 = 0;
  return;
}

