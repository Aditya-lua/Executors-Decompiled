
void FUN_0064f640(long param_1)

{
  long lVar1;
  bool in_ZR;
  ulong uVar2;
  long lVar3;
  long *unaff_x19;
  long unaff_x20;
  
  if (!in_ZR) {
    do {
      while( true ) {
        lVar3 = param_1 + -0x20;
        unaff_x19[2] = lVar3;
        lVar1 = *(long *)(param_1 + -8);
        uVar2 = *(ulong *)(param_1 + -0x18);
        if (*(ulong *)(param_1 + -0x10) <= *(ulong *)(param_1 + -0x18)) {
          uVar2 = *(ulong *)(param_1 + -0x10);
        }
        if (lVar1 == 0) break;
        if (uVar2 != 0) {
          do {
            *(undefined8 *)(lVar1 + -8 + uVar2 * 8) = 0;
            uVar2 = uVar2 - 1;
          } while (uVar2 != 0);
        }
        func_0x00611644();
        param_1 = unaff_x19[2];
        if (unaff_x19[2] == unaff_x20) goto LAB_0064f694;
      }
      param_1 = lVar3;
    } while (lVar3 != unaff_x20);
  }
LAB_0064f694:
  if (*unaff_x19 != 0) {
    __ZdlPv();
  }
  return;
}

