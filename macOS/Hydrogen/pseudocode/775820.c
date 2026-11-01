
undefined8 FUN_00775820(code *param_1,undefined8 param_2)

{
  int iVar1;
  long unaff_x19;
  
  iVar1 = (*param_1)(param_2,0,0);
  func_0x0076bad4();
  if (*(char *)(unaff_x19 + 0xa1d) < '\0') {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (iRam0000000000a2b550 < 1) goto code_r0x0077587c;
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b550 < 1)
    goto code_r0x0077587c;
    func_0x0073cd4c();
  }
code_r0x0077587c:
  if (iVar1 == 0) {
    return 0;
  }
  func_0x0073c9e4();
  return 0x41;
}

