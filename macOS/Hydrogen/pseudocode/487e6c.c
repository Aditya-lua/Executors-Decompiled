
void FUN_00487e6c(void)

{
  long lVar1;
  long lVar2;
  long unaff_x19;
  
  func_0x005d2ac4();
  lVar2 = *(long *)(unaff_x19 + 0x10);
  lVar1 = lVar2 * 0x11 + 0x19;
  if (lVar2 == 0 || lVar1 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*(long *)(unaff_x19 + 8) + lVar2 * -0x10 + -0x10,lVar1,8);
  return;
}

