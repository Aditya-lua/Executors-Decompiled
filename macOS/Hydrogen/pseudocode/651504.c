
void FUN_00651504(long param_1)

{
  long lVar1;
  ulong uVar2;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  
  while( true ) {
    *(undefined8 *)(param_1 + -0x30) = unaff_x22;
    lVar1 = *(long *)(param_1 + -0x10);
    uVar2 = *(ulong *)(param_1 + -0x20);
    if (*(ulong *)(param_1 + -0x18) <= *(ulong *)(param_1 + -0x20)) {
      uVar2 = *(ulong *)(param_1 + -0x18);
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
    func_0x0064f6d0(unaff_x20);
    param_1 = unaff_x19[2];
    if (param_1 == unaff_x21) break;
    unaff_x20 = param_1 + -0xa0;
    unaff_x19[2] = unaff_x20;
  }
  if (*unaff_x19 != 0) {
    __ZdlPv();
  }
  return;
}

