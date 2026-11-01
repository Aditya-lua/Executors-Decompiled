
void FUN_0061cbe4(int param_1)

{
  long lVar1;
  ulong uVar2;
  long *unaff_x21;
  long unaff_x22;
  int unaff_w23;
  ulong uVar3;
  
  uVar3 = (ulong)(uint)(param_1 * unaff_w23);
  uVar2 = *(ulong *)(unaff_x22 + 0x58);
  lVar1 = *(long *)(unaff_x22 + 0x60);
  if (uVar2 != uVar3) {
    if (lVar1 != 0) {
      if (uVar2 != 0) {
        do {
          *(undefined1 *)(lVar1 + -1 + uVar2) = 0;
          uVar2 = uVar2 - 1;
        } while (uVar2 != 0);
      }
      func_0x00611644(lVar1);
    }
    if (param_1 * unaff_w23 == 0) {
      lVar1 = 0;
    }
    else {
      lVar1 = func_0x006115d0(uVar3);
    }
  }
  *(ulong *)(unaff_x22 + 0x58) = uVar3;
  *(long *)(unaff_x22 + 0x60) = lVar1;
  *(undefined8 *)(unaff_x22 + 0x50) = 0xffffffffffffffff;
  func_0x005ee798();
                    /* WARNING: Could not recover jumptable at 0x0061cc6c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*unaff_x21 + 0x50))();
  return;
}

