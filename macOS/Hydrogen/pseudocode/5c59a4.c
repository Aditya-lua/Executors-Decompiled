
undefined1  [16] FUN_005c59a4(long param_1,long param_2)

{
  code *pcVar1;
  long in_x9;
  ulong in_x10;
  long lVar2;
  long lVar3;
  undefined1 auVar4 [16];
  
  while( true ) {
    if ((uint)in_x10 < (uint)*(ushort *)(in_x9 + 0x322)) {
      lVar3 = in_x10 + 1;
      if (param_1 == 0) {
        lVar2 = in_x9;
      }
      else {
        lVar2 = in_x9 + lVar3 * 8;
        do {
          lVar2 = *(long *)(lVar2 + 0x328);
          param_1 = param_1 + -1;
        } while (param_1 != 0);
        lVar3 = 0;
      }
      auVar4._8_8_ = in_x9 + in_x10 * 0x30;
      *(long *)(param_2 + 8) = lVar2;
      *(undefined8 *)(param_2 + 0x10) = 0;
      *(long *)(param_2 + 0x18) = lVar3;
      auVar4._0_8_ = in_x9 + in_x10 * 0x18 + 0x218;
      return auVar4;
    }
    if (*(long *)(in_x9 + 0x210) == 0) break;
    param_1 = param_1 + 1;
    in_x10 = (ulong)*(ushort *)(in_x9 + 800);
    in_x9 = *(long *)(in_x9 + 0x210);
  }
  func_0x007a23bc(&UNK_009f2798);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5c5a2c);
  (*pcVar1)();
}

