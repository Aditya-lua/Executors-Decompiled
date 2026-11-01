
undefined8 FUN_0078de50(undefined8 param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  uint uVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  long unaff_x19;
  long unaff_x21;
  ulong unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x28;
  long in_stack_00000008;
  
  while (iVar2 = func_0x007731dc(param_1,0xffffffff,unaff_x24,param_4), -1 < iVar2) {
    uVar3 = func_0x007841a0();
    if ((int)uVar3 != 0) {
      return uVar3;
    }
    unaff_x21 = unaff_x21 - in_stack_00000008;
    if (unaff_x21 == 0) {
      return 0;
    }
    uVar1 = *(uint *)(*(long *)(unaff_x19 + 0x18) + 0x238);
    unaff_x24 = (ulong)uVar1;
    if (*(char *)(unaff_x25 + 3) < '\0') {
      if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0) {
        if (0 < *(int *)(unaff_x28 + 8)) goto code_r0x0078de14;
      }
      else if (0 < *(int *)(*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + unaff_x19 + 0x18) + 8) && 0 < *(int *)(unaff_x28 + 8)) {
code_r0x0078de14:
        func_0x0073d364();
      }
    }
    lVar4 = func_0x00734ac8();
    if (lVar4 < 0) break;
    if (uVar1 == 0xffffffff) {
      return 0x37;
    }
    param_4 = unaff_x26;
    if (lVar4 != 0) {
      param_4 = lVar4;
    }
    param_1 = 0xffffffff;
  }
  func_0x0073c9e4();
  return 0x37;
}

