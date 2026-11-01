
void FUN_0064c324(ulong param_1)

{
  long *plVar1;
  long lVar2;
  undefined1 in_ZR;
  ulong uVar3;
  long in_x9;
  long unaff_x19;
  long unaff_x20;
  long lVar4;
  long unaff_x21;
  long unaff_x22;
  undefined8 unaff_x23;
  
  do {
    if ((bool)in_ZR) {
      do {
        func_0x00611644();
        lVar4 = unaff_x21;
        do {
          unaff_x21 = lVar4 + -0x60;
          if (unaff_x21 == unaff_x19) {
            *(long *)(unaff_x20 + 8) = unaff_x19;
            return;
          }
          *(undefined8 *)(lVar4 + -0x90) = unaff_x23;
          lVar2 = *(long *)(lVar4 + -0x70);
          uVar3 = *(ulong *)(lVar4 + -0x80);
          if (*(ulong *)(lVar4 + -0x78) <= *(ulong *)(lVar4 + -0x80)) {
            uVar3 = *(ulong *)(lVar4 + -0x78);
          }
          if (lVar2 != 0) {
            if (uVar3 != 0) {
              do {
                *(undefined8 *)(lVar2 + -8 + uVar3 * 8) = 0;
                uVar3 = uVar3 - 1;
              } while (uVar3 != 0);
            }
            func_0x00611644();
          }
          *(long *)(lVar4 + -0xc0) = unaff_x22 + 0x10;
          plVar1 = (long *)(lVar4 + -0xa0);
          param_1 = *(ulong *)(lVar4 + -0xb0);
          if (*(ulong *)(lVar4 + -0xa8) <= *(ulong *)(lVar4 + -0xb0)) {
            param_1 = *(ulong *)(lVar4 + -0xa8);
          }
          lVar4 = unaff_x21;
        } while (*plVar1 == 0);
      } while (param_1 == 0);
      in_x9 = *plVar1 + -8;
    }
    *(undefined8 *)(in_x9 + param_1 * 8) = 0;
    param_1 = param_1 - 1;
    in_ZR = param_1 == 0;
  } while( true );
}

