
ulong FUN_005e5288(void)

{
  code *pcVar1;
  ulong uVar2;
  ulong uVar3;
  ulong unaff_x19;
  undefined8 *puVar4;
  long unaff_x23;
  undefined8 uVar5;
  ulong unaff_x25;
  undefined1 auVar6 [16];
  
  do {
    func_0x00187bd4(unaff_x23,0x18,8);
    while( true ) {
      while( true ) {
        while( true ) {
          if (unaff_x19 == 0) {
            return 0;
          }
          auVar6 = func_0x00437984();
          uVar2 = auVar6._8_8_;
          if ((auVar6._0_8_ & 1) != 0) break;
          if (uVar2 == 0) {
            return unaff_x25;
          }
          if (unaff_x19 < uVar2) {
            func_0x007a28a4(uVar2,unaff_x19,&UNK_009f38c0);
                    /* WARNING: Does not return */
            pcVar1 = (code *)SoftwareBreakpoint(1,0x5e5318);
            (*pcVar1)();
          }
          unaff_x19 = unaff_x19 - uVar2;
        }
        uVar3 = uVar2 & 3;
        if (uVar3 < 2) break;
        if (uVar3 == 2) {
          if (uVar2 >> 0x20 != 4) {
            return uVar2;
          }
        }
        else if (uVar2 >> 0x20 != 0x23) {
          return uVar2;
        }
      }
      if (uVar3 != 0) break;
      if (*(char *)(uVar2 + 0x10) != '#') {
        return uVar2;
      }
    }
    if (*(char *)(uVar2 + 0xf) != '#') {
      return uVar2;
    }
    unaff_x23 = uVar2 - 1;
    uVar5 = *(undefined8 *)(uVar2 - 1);
    puVar4 = *(undefined8 **)(uVar2 + 7);
    if ((code *)*puVar4 != (code *)0x0) {
      (*(code *)*puVar4)(uVar5);
    }
    if (puVar4[1] != 0) {
      func_0x00187bd4(uVar5,puVar4[1],puVar4[2]);
    }
  } while( true );
}

