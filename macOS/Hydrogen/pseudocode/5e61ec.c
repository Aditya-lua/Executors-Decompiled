
ulong FUN_005e61ec(void)

{
  code *pcVar1;
  undefined1 in_ZR;
  ulong uVar2;
  ulong in_x9;
  ulong unaff_x19;
  undefined8 *puVar3;
  ulong unaff_x22;
  undefined8 uVar4;
  ulong unaff_x25;
  undefined1 auVar5 [16];
  
  do {
    if ((bool)in_ZR) {
      if (in_x9 != 4) {
        return unaff_x22;
      }
    }
    else if (in_x9 != 0x23) {
      return unaff_x22;
    }
    while( true ) {
      while( true ) {
        if (unaff_x19 == 0) {
          return 0;
        }
        auVar5 = func_0x00437984();
        unaff_x22 = auVar5._8_8_;
        if ((auVar5._0_8_ & 1) != 0) break;
        if (unaff_x22 == 0) {
          return unaff_x25;
        }
        if (unaff_x19 < unaff_x22) {
          func_0x007a28a4(unaff_x22,unaff_x19,&UNK_009f3a10);
                    /* WARNING: Does not return */
          pcVar1 = (code *)SoftwareBreakpoint(1,0x5e6248);
          (*pcVar1)();
        }
        unaff_x19 = unaff_x19 - unaff_x22;
      }
      uVar2 = unaff_x22 & 3;
      if (1 < uVar2) break;
      if (uVar2 == 0) {
        if (*(char *)(unaff_x22 + 0x10) != '#') {
          return unaff_x22;
        }
      }
      else {
        if (*(char *)(unaff_x22 + 0xf) != '#') {
          return unaff_x22;
        }
        uVar4 = *(undefined8 *)(unaff_x22 - 1);
        puVar3 = *(undefined8 **)(unaff_x22 + 7);
        if ((code *)*puVar3 != (code *)0x0) {
          (*(code *)*puVar3)(uVar4);
        }
        if (puVar3[1] != 0) {
          func_0x00187bd4(uVar4,puVar3[1],puVar3[2]);
        }
        func_0x00187bd4(unaff_x22 - 1,0x18,8);
      }
    }
    in_x9 = unaff_x22 >> 0x20;
    in_ZR = uVar2 == 2;
  } while( true );
}

