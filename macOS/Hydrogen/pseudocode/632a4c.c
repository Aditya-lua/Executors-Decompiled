
void FUN_00632a4c(long param_1,long param_2)

{
  bool in_CY;
  long lVar1;
  ulong uVar2;
  long in_x9;
  long lVar3;
  long unaff_x20;
  long lVar4;
  long unaff_x29;
  
  if (in_CY) {
    param_1 = in_x9;
  }
  if (param_2 != 0) {
    if (param_1 != 0) {
      do {
        *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
        param_1 = param_1 + -1;
      } while (param_1 != 0);
    }
    func_0x00611644();
  }
  lVar4 = *(long *)(unaff_x29 + -0x38);
  if (lVar4 != 0) {
    lVar3 = *(long *)(unaff_x29 + -0x30);
    lVar1 = lVar4;
    if (lVar3 != lVar4) {
      do {
        *(long *)(lVar3 + -0x30) = unaff_x20 + 0x10;
        lVar1 = *(long *)(lVar3 + -0x10);
        uVar2 = *(ulong *)(lVar3 + -0x20);
        if (*(ulong *)(lVar3 + -0x18) <= *(ulong *)(lVar3 + -0x20)) {
          uVar2 = *(ulong *)(lVar3 + -0x18);
        }
        if (lVar1 != 0) {
          if (uVar2 != 0) {
            do {
              *(undefined8 *)(lVar1 + -8 + uVar2 * 8) = 0;
              uVar2 = uVar2 - 1;
            } while (uVar2 != 0);
          }
          func_0x00611644();
        }
        lVar3 = lVar3 + -0xa0;
        func_0x0064f6d0(lVar3);
      } while (lVar3 != lVar4);
      lVar1 = *(long *)(unaff_x29 + -0x38);
    }
    *(long *)(unaff_x29 + -0x30) = lVar4;
    __ZdlPv(lVar1);
  }
  return;
}

