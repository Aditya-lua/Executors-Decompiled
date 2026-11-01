
void FUN_00661914(long param_1,long *param_2)

{
  long unaff_x19;
  
  param_2[-1] = param_1 + 0xe8;
  *param_2 = param_1 + 0x140;
  param_2[1] = (long)&UNK_00a02f80;
  param_2[2] = (long)&UNK_00a03020;
  param_2[3] = (long)&UNK_00a030f0;
  func_0x00630324(param_2 + 0x42);
  *(undefined **)(unaff_x19 + 0x10) = &UNK_00a03168;
  *(undefined **)(unaff_x19 + 0x18) = &UNK_00a03238;
  func_0x00638f0c(unaff_x19 + 0x20,&UNK_009fb428);
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}

