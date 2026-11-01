
void FUN_006618c4(void)

{
  long unaff_x19;
  
  *(undefined **)(unaff_x19 + 0x18) = &UNK_00a03168;
  *(undefined **)(unaff_x19 + 0x20) = &UNK_00a03238;
  func_0x00638f0c(unaff_x19 + 0x28,&UNK_009fb428);
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}

