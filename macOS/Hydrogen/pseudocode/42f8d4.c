
ulong FUN_0042f8d4(uint param_1)

{
  undefined4 uVar1;
  int iVar2;
  uint uVar3;
  uint uVar4;
  uint *puVar5;
  undefined4 unaff_w21;
  ulong uVar6;
  ulong unaff_x22;
  undefined1 auVar7 [16];
  undefined8 uStack0000000000000008;
  undefined1 uStack0000000000000010;
  undefined4 uStack0000000000000014;
  undefined4 uStack0000000000000018;
  undefined4 uStack000000000000001c;
  
  if (((param_1 | 4) == param_1) || (iVar2 = _fcntl(), iVar2 != -1)) {
    uStack0000000000000018 = (int)unaff_x22;
    uStack0000000000000014 = 1;
    uStack000000000000001c = 1;
    _uStack0000000000000010 = unaff_w21;
LAB_0042f91c:
    do {
      iVar2 = _poll(&uStack0000000000000010,2,0xffffffff);
      if (iVar2 != -1) {
        if (uStack0000000000000014._2_2_ == 0) {
LAB_0042f958:
          if (uStack000000000000001c._2_2_ == 0) goto LAB_0042f91c;
          auVar7 = func_0x00430c40((long)&uStack0000000000000008 + 4);
          uVar1 = (undefined4)uStack0000000000000008;
          uVar6 = auVar7._8_8_;
          if ((auVar7._0_8_ & 1) != 0) {
            if ((uVar6 & 0xffffffff00000003) != 0x2300000002) goto LAB_0042f9b4;
            goto LAB_0042f91c;
          }
          uVar4 = _fcntl((undefined4)uStack0000000000000008,3);
          if ((uVar4 != 0xffffffff) &&
             (((uVar4 & 0xfffffffb) == uVar4 || (iVar2 = _fcntl(uVar1,4), iVar2 != -1)))) {
            auVar7 = func_0x00430c40(&uStack0000000000000008);
LAB_0042fa78:
            uVar6 = auVar7._8_8_;
            if ((auVar7._0_8_ & 1) == 0) {
              uVar6 = 0;
            }
            goto LAB_0042f9b4;
          }
        }
        else {
          auVar7 = func_0x00430c40(&uStack0000000000000008);
          uVar4 = uStack0000000000000008._4_4_;
          uVar6 = auVar7._8_8_;
          if ((auVar7._0_8_ & 1) != 0) {
            if ((uVar6 & 0xffffffff00000003) == 0x2300000002) goto LAB_0042f958;
            goto LAB_0042f9b4;
          }
          uVar3 = _fcntl(uStack0000000000000008._4_4_,3);
          if ((uVar3 != 0xffffffff) &&
             (((uVar3 & 0xfffffffb) == uVar3 || (iVar2 = _fcntl(uVar4,4), iVar2 != -1)))) {
            auVar7 = func_0x00430c40((long)&uStack0000000000000008 + 4);
            goto LAB_0042fa78;
          }
        }
        puVar5 = (uint *)___error();
        uVar6 = (ulong)*puVar5 << 0x20 | 2;
        goto LAB_0042f9b4;
      }
      puVar5 = (uint *)___error();
    } while (*puVar5 == 4);
    uVar6 = (ulong)*puVar5 << 0x20 | 2;
LAB_0042f9b4:
    unaff_x22 = (ulong)uStack0000000000000008._4_4_;
  }
  else {
    puVar5 = (uint *)___error();
    uVar6 = (ulong)*puVar5 << 0x20 | 2;
  }
  _close(unaff_x22);
  _close((undefined4)uStack0000000000000008);
  return uVar6;
}

