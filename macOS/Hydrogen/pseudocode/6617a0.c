
void FUN_006617a0(undefined8 param_1,long param_2)

{
  long in_x9;
  long unaff_x19;
  
  *(undefined8 *)(param_2 + 0x10) = param_1;
  *(long *)(param_2 + 0x18) = in_x9 + 0xf80;
  *(char **)(param_2 + 0x20) =
       "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation" +
       in_x9 + 0x30;
  *(char **)(param_2 + 0x28) =
       "/System/Library/Frameworks/SystemConfiguration.framework/Versions/A/SystemConfiguration" +
       in_x9 + 0x40;
  func_0x00630324(param_2 + 0x220);
  *(undefined **)(unaff_x19 + 0x20) = &UNK_00a03168;
  *(undefined **)(unaff_x19 + 0x28) = &UNK_00a03238;
  func_0x00638f0c(unaff_x19 + 0x30,&UNK_009fb428);
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}

