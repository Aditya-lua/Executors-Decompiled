
ulong FUN_0041baf0(undefined8 param_1,undefined8 param_2)

{
  code *pcVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  undefined8 uVar5;
  long unaff_x23;
  ulong unaff_x25;
  undefined8 *puVar6;
  undefined1 auVar7 [16];
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  
  auVar7._8_8_ = param_2;
  auVar7._0_8_ = param_1;
  do {
    uVar2 = auVar7._8_8_;
    _uStack0000000000000000 = auVar7;
    if ((unaff_x21 & 1) == 0) {
      if (uVar2 == 0) {
        return unaff_x25;
      }
      uVar4 = unaff_x19 - uVar2;
      if (unaff_x19 < uVar2) {
        func_0x007a28a4(uVar2,unaff_x19,&UNK_009da6f8);
                    /* WARNING: Does not return */
        pcVar1 = (code *)SoftwareBreakpoint(1,0x41bbfc);
        (*pcVar1)();
      }
      unaff_x20 = unaff_x20 + uVar2;
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
          uVar5 = *(undefined8 *)(uVar2 - 1);
          puVar6 = *(undefined8 **)(uVar2 + 7);
          if ((code *)*puVar6 != (code *)0x0) {
            (*(code *)*puVar6)(uVar5);
          }
          if (puVar6[1] != 0) {
            func_0x00187bd4(uVar5,puVar6[1],puVar6[2]);
          }
          func_0x00187bd4(uVar2 - 1,0x18,8);
          auVar7 = _uStack0000000000000000;
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
    if (uVar4 == 0) {
      return 0;
    }
    _uStack0000000000000000 = auVar7;
    auVar7 = func_0x00417e00(unaff_x23 + 0x10,unaff_x20,uVar4);
    unaff_x21 = auVar7._0_8_;
    unaff_x19 = uVar4;
  } while( true );
}

