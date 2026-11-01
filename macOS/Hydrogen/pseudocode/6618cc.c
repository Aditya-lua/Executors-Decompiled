
void FUN_006618cc(long param_1)

{
  long unaff_x19;
  
  *(long *)(unaff_x19 + 0x18) = param_1;
  *(long *)(unaff_x19 + 0x20) = param_1 + 0xd0;
  func_0x00638f0c(unaff_x19 + 0x28,&UNK_009fb428);
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}

