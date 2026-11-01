
void FUN_0064c314(ulong param_1,long param_2)

{
  long lVar1;
  ulong uVar2;
  long unaff_x19;
  long unaff_x20;
  long lVar3;
  long unaff_x21;
  long unaff_x22;
  undefined8 unaff_x23;
  
  do {
    if (param_1 != 0) {
      do {
        *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
        param_1 = param_1 - 1;
      } while (param_1 != 0);
    }
    func_0x00611644();
    lVar3 = unaff_x21;
    do {
      unaff_x21 = lVar3 + -0x60;
      if (unaff_x21 == unaff_x19) {
        *(long *)(unaff_x20 + 8) = unaff_x19;
        return;
      }
      *(undefined8 *)(lVar3 + -0x90) = unaff_x23;
      lVar1 = *(long *)(lVar3 + -0x70);
      uVar2 = *(ulong *)(lVar3 + -0x80);
      if (*(ulong *)(lVar3 + -0x78) <= *(ulong *)(lVar3 + -0x80)) {
        uVar2 = *(ulong *)(lVar3 + -0x78);
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
      *(long *)(lVar3 + -0xc0) = unaff_x22 + 0x10;
      param_2 = *(long *)(lVar3 + -0xa0);
      param_1 = *(ulong *)(lVar3 + -0xb0);
      if (*(ulong *)(lVar3 + -0xa8) <= *(ulong *)(lVar3 + -0xb0)) {
        param_1 = *(ulong *)(lVar3 + -0xa8);
      }
      lVar3 = unaff_x21;
    } while (param_2 == 0);
  } while( true );
}

