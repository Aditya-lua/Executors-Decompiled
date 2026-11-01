
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined1  [16] FUN_00219b10(void)

{
  char cVar1;
  undefined2 uVar2;
  undefined1 uVar3;
  undefined *puVar4;
  code *pcVar5;
  int iVar6;
  ulong uVar7;
  long lVar8;
  undefined8 *unaff_x19;
  undefined *puVar9;
  undefined *unaff_x26;
  long unaff_x29;
  undefined1 auVar10 [16];
  undefined1 auStack_1790 [504];
  undefined1 auStack_1598 [504];
  undefined8 uStack_13a0;
  undefined8 uStack_1398;
  undefined8 uStack_1390;
  undefined8 uStack_1388;
  undefined *puStack_10f8;
  undefined8 *puStack_10f0;
  undefined8 uStack_10e8;
  undefined1 auStack_10e0 [224];
  undefined8 uStack_1000;
  undefined1 auStack_e38 [504];
  undefined1 auStack_c40 [500];
  char cStack_a4c;
  undefined2 uStack_a4b;
  undefined1 uStack_a49;
  undefined4 uStack_a48;
  undefined8 uStack_a40;
  undefined8 uStack_a38;
  undefined8 uStack_a30;
  undefined8 uStack_a28;
  undefined *puStack_a20;
  undefined8 *puStack_a18;
  undefined8 uStack_a10;
  undefined8 uStack_a08;
  undefined *puStack_a00;
  undefined8 *puStack_9f8;
  undefined8 uStack_9f0;
  undefined8 uStack_9e8;
  undefined8 uStack_9e0;
  undefined8 uStack_9d8;
  undefined8 uStack_9d0;
  undefined1 auStack_9c8 [444];
  char cStack_80c;
  undefined2 uStack_80b;
  undefined1 uStack_809;
  undefined *puStack_800;
  undefined8 *puStack_7f8;
  undefined8 uStack_7f0;
  undefined8 uStack_7e8;
  undefined *puStack_7e0;
  undefined8 *puStack_7d8;
  undefined8 uStack_7d0;
  undefined8 uStack_7c8;
  undefined8 uStack_7c0;
  undefined8 uStack_7b8;
  undefined8 uStack_7b0;
  undefined1 auStack_7a8 [444];
  char cStack_5ec;
  undefined2 uStack_5eb;
  undefined1 uStack_5e9;
  undefined *puStack_5e8;
  undefined8 *puStack_5e0;
  undefined8 uStack_5d8;
  undefined8 uStack_5d0;
  undefined8 uStack_5c8;
  undefined8 uStack_5c0;
  undefined8 uStack_5b8;
  undefined8 uStack_5b0;
  undefined1 auStack_5a8 [616];
  undefined8 uStack_340;
  undefined8 uStack_338;
  undefined8 uStack_320;
  undefined8 uStack_318;
  undefined8 uStack_310;
  undefined8 uStack_308;
  undefined *puStack_300;
  undefined8 *puStack_2f8;
  undefined *puStack_2f0;
  undefined8 uStack_2e8;
  undefined8 uStack_2e0;
  undefined8 uStack_2d8;
  undefined8 uStack_2d0;
  undefined8 uStack_2c8;
  undefined1 auStack_2c0 [436];
  char cStack_10c;
  undefined2 uStack_10b;
  undefined1 uStack_109;
  undefined *puStack_50;
  undefined8 *puStack_48;
  undefined *puStack_40;
  
  uStack_1000 = 0;
  puVar9 = (undefined *)0x8000000000000026;
  uStack_a28 = 0;
  uStack_a30 = 0;
  uStack_a38 = 0;
  uStack_a40 = 0;
  uVar7 = func_0x0027a448(&uStack_a40,0x20);
  if ((uVar7 & 1) != 0) {
    puVar9 = (undefined *)0x8000000000000020;
LAB_00219bf4:
    uStack_2e0 = uStack_1398;
    uStack_2e8 = uStack_13a0;
    uStack_2d0 = uStack_1388;
    uStack_2d8 = uStack_1390;
    puStack_300 = puVar9;
    puStack_2f8 = unaff_x19;
    puStack_2f0 = unaff_x26;
    func_0x00217060(&puStack_300);
    lVar8 = 0;
LAB_00219c18:
    auVar10._8_8_ = &UNK_009c6b00;
    auVar10._0_8_ = lVar8;
    return auVar10;
  }
  func_0x002749e8(&puStack_300,&__ZN9aws_lc_rs6cipher7AES_25617h429fb750df9efb2cE,&uStack_a40,0x20);
  if (puStack_300 == (undefined *)0x8000000000000001) {
LAB_00219bc0:
    unaff_x19 = (undefined8 *)func_0x00187bd0(0x10,8);
    if (unaff_x19 != (undefined8 *)0x0) {
      unaff_x19[1] = 1;
      *unaff_x19 = 1;
      unaff_x26 = &UNK_009c8188;
      goto LAB_00219bf4;
    }
    func_0x007a1f18(8,0x10);
  }
  else {
    uStack_a08 = uStack_2e8;
    uStack_a10 = puStack_2f0;
    puStack_a20 = puStack_300;
    puStack_a18 = puStack_2f8;
    func_0x00272cc8(&puStack_300,&puStack_a20);
    cVar1 = cStack_10c;
    puVar4 = puStack_2f0;
    if (cStack_10c == '\x04') goto LAB_00219bc0;
    uStack_9e0 = uStack_2e0;
    uStack_9e8 = uStack_2e8;
    uStack_9d0 = uStack_2d0;
    uStack_9d8 = uStack_2d8;
    _memcpy(auStack_9c8,&uStack_2c8,0x1bc);
    uStack_80b = uStack_10b;
    uStack_809 = uStack_109;
    puStack_9f8 = puStack_2f8;
    puStack_a00 = puStack_300;
    uStack_9f0 = puVar4;
    cStack_80c = cVar1;
    func_0x002749e8(&puStack_300,&__ZN9aws_lc_rs6cipher7AES_25617h429fb750df9efb2cE,&uStack_a40,0x20
                   );
    if (puStack_300 != (undefined *)0x8000000000000001) {
      uStack_7e8 = uStack_2e8;
      uStack_7f0 = puStack_2f0;
      puStack_800 = puStack_300;
      puStack_7f8 = puStack_2f8;
      func_0x00272cc8(&puStack_300,&puStack_800);
      puVar4 = puStack_2f0;
      if (cStack_10c == '\x04') goto LAB_00219cf4;
      uStack_7c0 = uStack_2e0;
      uStack_7c8 = uStack_2e8;
      uStack_7b0 = uStack_2d0;
      uStack_7b8 = uStack_2d8;
      _memcpy(auStack_7a8,&uStack_2c8,0x1bc);
      uStack_5eb = uStack_10b;
      uStack_5e9 = uStack_109;
      puStack_7d8 = puStack_2f8;
      puStack_7e0 = puStack_300;
      uStack_7d0 = puVar4;
      cStack_5ec = cStack_10c;
      func_0x002792b0(&puStack_300,___ZN9aws_lc_rs4hmac11HMAC_SHA25617h7d2cef75f637e8e2E,
                      unaff_x29 + -0x61,&UNK_009c6b40);
      unaff_x26 = puStack_300;
      if (puStack_300 == (undefined *)0x0) {
        func_0x00226b78(unaff_x29 + -0xa0);
        uStack_1398 = *(undefined8 *)(unaff_x29 + -0x80);
        uStack_13a0 = *(undefined8 *)(unaff_x29 + -0x88);
        uStack_1388 = *(undefined8 *)(unaff_x29 + -0x70);
        uStack_1390 = *(undefined8 *)(unaff_x29 + -0x78);
        unaff_x19 = puStack_48;
        puVar9 = puStack_50;
        unaff_x26 = puStack_40;
      }
      else {
        uStack_318 = uStack_2d8;
        uStack_320 = uStack_2e0;
        uStack_308 = uStack_2c8;
        uStack_310 = uStack_2d0;
        _memcpy(auStack_5a8,auStack_2c0,0x268);
        uStack_338 = uStack_318;
        uStack_340 = uStack_320;
        uStack_5d8 = puStack_2f0;
        puStack_5e0 = puStack_2f8;
        uStack_5d0 = uStack_2e8;
        uStack_5c0 = uStack_318;
        uStack_5c8 = uStack_320;
        uStack_5b0 = uStack_308;
        uStack_5b8 = uStack_310;
        puStack_5e8 = puStack_300;
        puStack_300 = (undefined *)0x0;
        puStack_2f8 = (undefined8 *)0x0;
        iVar6 = func_0x0027a448(&puStack_300,0x10);
        if (iVar6 == 0) {
          _memcpy(auStack_1598,&puStack_a00,0x1f8);
          _memcpy(auStack_1790,&puStack_7e0,500);
          uVar3 = uStack_5e9;
          uVar2 = uStack_5eb;
          cVar1 = cStack_5ec;
          _memcpy(&uStack_13a0,&puStack_5e8,0x2a8);
          puStack_10f0 = puStack_2f8;
          puStack_10f8 = puStack_300;
          if (cVar1 != '\x04') {
            _memcpy(auStack_10e0,&uStack_13a0,0x2a8);
            _memcpy(auStack_e38,auStack_1598,0x1f8);
            _memcpy(auStack_c40,auStack_1790,500);
            uStack_a4b = uVar2;
            uStack_a49 = uVar3;
            uStack_10e8 = 0;
            cStack_a4c = cVar1;
            uStack_a48 = 0xa8c0;
            lVar8 = func_0x00187bd0(0x6b8,8);
            if (lVar8 == 0) {
              func_0x007a1f18(8,0x6b8);
              goto LAB_00219fbc;
            }
            _memcpy(lVar8,&puStack_10f8,0x6b8);
            goto LAB_00219c18;
          }
          unaff_x26 = (undefined *)0x0;
          unaff_x19 = puStack_2f8;
          puVar9 = puStack_300;
          goto LAB_00219bf4;
        }
        func_0x002791ac(&puStack_5e0);
        unaff_x19 = (undefined8 *)&uStack_5eb;
        puVar9 = (undefined *)0x8000000000000020;
      }
      func_0x0027708c((ulong)&puStack_7e0 | 8);
      if ((char)puStack_7d8 == '\x03') {
        func_0x00275d00((ulong)&puStack_7e0 | 9);
      }
LAB_00219d28:
      func_0x0027708c((ulong)&puStack_a00 | 8);
      if ((char)puStack_9f8 == '\x03') {
        func_0x00275d00((ulong)&puStack_a00 | 9);
      }
      goto LAB_00219bf4;
    }
LAB_00219cf4:
    unaff_x19 = (undefined8 *)func_0x00187bd0(0x10,8);
    if (unaff_x19 != (undefined8 *)0x0) {
      unaff_x19[1] = 1;
      *unaff_x19 = 1;
      unaff_x26 = &UNK_009c8188;
      goto LAB_00219d28;
    }
  }
  func_0x007a1f18(8,0x10);
LAB_00219fbc:
                    /* WARNING: Does not return */
  pcVar5 = (code *)SoftwareBreakpoint(1,0x219fc0);
  (*pcVar5)();
}

