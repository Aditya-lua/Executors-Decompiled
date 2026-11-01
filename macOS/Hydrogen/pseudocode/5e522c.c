
ulong FUN_005e522c(void)

{
  code *pcVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong unaff_x19;
  undefined8 *puVar5;
  undefined8 uVar6;
  ulong unaff_x25;
  undefined1 auVar7 [16];
  
  do {
    auVar7 = func_0x00437984();
    uVar2 = auVar7._8_8_;
    if ((auVar7._0_8_ & 1) == 0) {
      if (uVar2 == 0) {
        return unaff_x25;
      }
      uVar4 = unaff_x19 - uVar2;
      if (unaff_x19 < uVar2) {
        func_0x007a28a4(uVar2,unaff_x19,&UNK_009f38c0);
                    /* WARNING: Does not return */
        pcVar1 = (code *)SoftwareBreakpoint(1,0x5e5318);
        (*pcVar1)();
      }
    }
    else {
      uVar3 = uVar2 & 3;
      uVar4 = unaff_x19;
      if (uVar3 < 2) {
        if (uVar3 == 0) {
          if (*(char *)(uVar2 + 0x10) != '#') {
            return uVar2;
          }
        }
        else {
          if (*(char *)(uVar2 + 0xf) != '#') {
            return uVar2;
          }
          uVar6 = *(undefined8 *)(uVar2 - 1);
          puVar5 = *(undefined8 **)(uVar2 + 7);
          if ((code *)*puVar5 != (code *)0x0) {
            (*(code *)*puVar5)(uVar6);
          }
          if (puVar5[1] != 0) {
            func_0x00187bd4(uVar6,puVar5[1],puVar5[2]);
          }
          func_0x00187bd4(uVar2 - 1,0x18,8);
        }
      }
      else if (uVar3 == 2) {
        if (uVar2 >> 0x20 != 4) {
          return uVar2;
        }
      }
      else if (uVar2 >> 0x20 != 0x23) {
        return uVar2;
      }
    }
    unaff_x19 = uVar4;
    if (uVar4 == 0) {
      return 0;
    }
  } while( true );
}

