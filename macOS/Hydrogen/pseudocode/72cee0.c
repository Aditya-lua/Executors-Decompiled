
void FUN_0072cee0(long *param_1,long param_2,undefined8 param_3)

{
  int *piVar1;
  ulong uVar2;
  int *piVar3;
  ulong uVar4;
  
  piVar3 = (int *)param_1[2];
  uVar2 = *(ulong *)(piVar3 + 0x26);
  if (uVar2 != 0) {
    uVar4 = 0;
    piVar1 = piVar3;
    do {
      if ((*(long *)(piVar1 + 0xc) != 0) && (piVar1[0xe] == 0)) {
        func_0x0073177c(*(long *)(piVar1 + 0xc),param_2,param_3);
        uVar2 = *(ulong *)(piVar3 + 0x26);
      }
      uVar4 = uVar4 + 1;
      piVar1 = piVar1 + 0xe;
    } while (uVar4 < uVar2);
  }
  if ((param_2 != 0) && (*(char *)(param_2 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 param_2 + 0x18) == 0) {
      if (param_1 == (long *)0x0) {
        return;
      }
    }
    else {
      if (param_1 == (long *)0x0) {
        return;
      }
      if (*(int *)(*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + param_2 + 0x18) + 8) < 1) {
        return;
      }
    }
    if (0 < *(int *)(*param_1 + 0xc)) {
      func_0x0073cbdc(param_2,param_1,"adjust_pollset -> %d socks");
      return;
    }
  }
  return;
}

