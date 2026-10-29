/* 7ff70ca173a3 FUN_7ff70ca173a3 */

ulonglong FUN_7ff70ca173a3(void)

{
  byte bVar1;
  undefined8 uVar2;
  code *pcVar3;
  undefined4 uVar4;
  undefined4 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  longlong lVar9;
  longlong lVar10;
  ulonglong uVar11;
  longlong *plVar12;
  char cVar13;
  longlong unaff_RBP;
  ulonglong uVar14;
  char *pcVar15;
  uint uVar16;
  ulonglong uVar17;
  bool in_OF;
  undefined4 unaff_XMM6_Da;
  undefined4 unaff_XMM6_Db;
  undefined4 unaff_XMM6_Dc;
  undefined4 unaff_XMM6_Dd;
  
  if (in_OF) {
    uVar11 = func_0x7ff70d999292();
    return uVar11;
  }
  func_0x7ff70ca551f0(unaff_RBP + 0xb08);
  func_0x7ff70c788810(unaff_RBP + 0xb40);
  *(undefined8 *)(unaff_RBP + 0xb80) = 0xa00a723bd2b9f41e;
  *(undefined8 *)(unaff_RBP + 0xb88) = 0xe68676348bdac2dd;
  *(undefined8 *)(unaff_RBP + 0xb90) = 0x61d757a416745564;
  *(undefined8 *)(unaff_RBP + 0xb98) = *(undefined8 *)(unaff_RBP + 0xb68);
  *(undefined8 *)(unaff_RBP + 0x930) = *(undefined8 *)(unaff_RBP + 0xb38);
  *(undefined8 *)(unaff_RBP + 0x938) = *(undefined8 *)(unaff_RBP + 0xb30);
  *(undefined8 *)(unaff_RBP + 0x940) = *(undefined8 *)(unaff_RBP + 0xb70);
  *(undefined8 *)(unaff_RBP + 0x948) = *(undefined8 *)(unaff_RBP + 0xb68);
  *(uint *)(unaff_RBP + 0xb80) = *(uint *)(unaff_RBP + 0xb80) ^ *(uint *)(unaff_RBP + 0x930);
  *(uint *)(unaff_RBP + 0xb84) = *(uint *)(unaff_RBP + 0xb84) ^ *(uint *)(unaff_RBP + 0x934);
  *(uint *)(unaff_RBP + 0xb88) = *(uint *)(unaff_RBP + 0xb88) ^ *(uint *)(unaff_RBP + 0x938);
  *(uint *)(unaff_RBP + 0xb8c) = *(uint *)(unaff_RBP + 0xb8c) ^ *(uint *)(unaff_RBP + 0x93c);
  *(ulonglong *)(unaff_RBP + 0xb90) =
       *(ulonglong *)(unaff_RBP + 0xb90) ^ *(ulonglong *)(unaff_RBP + 0x940);
  *(ulonglong *)(unaff_RBP + 0xb98) =
       *(ulonglong *)(unaff_RBP + 0xb98) ^ *(ulonglong *)(unaff_RBP + 0x948);
  lVar9 = unaff_RBP + 0xb40;
  func_0x7ff70ca05eb0(lVar9,unaff_RBP + 0xb80);
  if (0xf < *(ulonglong *)(unaff_RBP + 0xb58)) {
    lVar9 = *(longlong *)(unaff_RBP + 0xb40);
  }
  func_0x7ff70ca341c0(unaff_RBP + 1000,lVar9,*(longlong *)(unaff_RBP + 0xb50) + lVar9);
  *(undefined4 *)(unaff_RBP + 0x8f0) = unaff_XMM6_Da;
  *(undefined4 *)(unaff_RBP + 0x8f4) = unaff_XMM6_Db;
  *(undefined4 *)(unaff_RBP + 0x8f8) = unaff_XMM6_Dc;
  *(undefined4 *)(unaff_RBP + 0x8fc) = unaff_XMM6_Dd;
  *(undefined8 *)(unaff_RBP + 0x900) = 0;
  *(undefined8 *)(unaff_RBP + 0x930) = 0x40;
  func_0x7ff70ca34f50(unaff_RBP + 0x8f0,unaff_RBP + 0x930);
  *(undefined4 *)(unaff_RBP + 0x4c0) = unaff_XMM6_Da;
  *(undefined4 *)(unaff_RBP + 0x4c4) = unaff_XMM6_Db;
  *(undefined4 *)(unaff_RBP + 0x4c8) = unaff_XMM6_Dc;
  *(undefined4 *)(unaff_RBP + 0x4cc) = unaff_XMM6_Dd;
  *(undefined8 *)(unaff_RBP + 0x4d0) = 0;
  lVar9 = unaff_RBP + 0x360;
  *(undefined1 *)(unaff_RBP + 0xb7f) = 1;
  if ((ulonglong)(*(longlong *)(unaff_RBP + 0x8f8) - *(longlong *)(unaff_RBP + 0x8f0)) < 0x40) {
    *(undefined4 *)(unaff_RBP + 0x360) = unaff_XMM6_Da;
    *(undefined4 *)(unaff_RBP + 0x364) = unaff_XMM6_Db;
    *(undefined4 *)(unaff_RBP + 0x368) = unaff_XMM6_Dc;
    *(undefined4 *)(unaff_RBP + 0x36c) = unaff_XMM6_Dd;
    *(undefined8 *)(unaff_RBP + 0x370) = 0;
    func_0x7ff70ca35100(lVar9,0,*(longlong *)(unaff_RBP + 0x4c0),
                        *(longlong *)(unaff_RBP + 0x4c8) - *(longlong *)(unaff_RBP + 0x4c0));
    func_0x7ff70ca35100(lVar9,*(undefined8 *)(unaff_RBP + 0x368));
    func_0x7ff70ca37740(lVar9,unaff_RBP + 0xb7f);
    func_0x7ff70d9634e6(&UNK_7ff70cb8b400);
                    /* WARNING: Subroutine does not return */
    FUN_7ff70ccabea7();
  }
  func_0x7ff70ca37840(unaff_RBP + 0x8f0,0x40);
  *(undefined1 (*) [16])(unaff_RBP + 0x960) = (undefined1  [16])0x0;
  *(undefined1 (*) [16])(unaff_RBP + 0x950) = (undefined1  [16])0x0;
  *(undefined1 (*) [16])(unaff_RBP + 0x940) = (undefined1  [16])0x0;
  *(undefined1 (*) [16])(unaff_RBP + 0x930) = (undefined1  [16])0x0;
  *(undefined8 *)(unaff_RBP + 0x970) = 0;
  *(undefined8 *)(unaff_RBP + 0x978) = 0xf;
  *(undefined1 (*) [16])(unaff_RBP + 0x980) = (undefined1  [16])0x0;
  *(undefined8 *)(unaff_RBP + 0x990) = 0;
  func_0x7ff70ca378d0(unaff_RBP + 0x930,*(longlong *)(unaff_RBP + 0x8f0),
                      *(longlong *)(unaff_RBP + 0x8f0) + 0x20);
  func_0x7ff70ca378d0(unaff_RBP + 0x948,*(longlong *)(unaff_RBP + 0x8f0) + 0x20);
  func_0x7ff70ca1f5a0((undefined8 *)(unaff_RBP + 0x960),unaff_RBP + 0x770);
  func_0x7ff70ca379a0(unaff_RBP + 0x980,unaff_RBP + 0x790);
  *(undefined1 (*) [16])(unaff_RBP + 0x998) = (undefined1  [16])0x0;
  *(undefined1 *)(unaff_RBP + 0x9a8) = 1;
  lVar9 = *(longlong *)(unaff_RBP + 0x6b8);
  uVar11 = *(longlong *)(unaff_RBP + 0x6c0) - lVar9;
  if (uVar11 != 0) {
    uVar17 = uVar11;
    if ((uVar11 & 7) != 0) {
      uVar17 = 0;
      do {
        *(undefined1 *)(lVar9 + uVar17) = 0;
        uVar17 = uVar17 + 1;
      } while ((uVar11 & 7) != uVar17);
      lVar9 = lVar9 + uVar17;
      uVar17 = uVar11 - uVar17;
    }
    if (7 < uVar11) {
      uVar11 = 0;
      do {
        *(undefined1 *)(lVar9 + uVar11) = 0;
        *(undefined1 *)(lVar9 + 1 + uVar11) = 0;
        *(undefined1 *)(lVar9 + 2 + uVar11) = 0;
        *(undefined1 *)(lVar9 + 3 + uVar11) = 0;
        *(undefined1 *)(lVar9 + 4 + uVar11) = 0;
        *(undefined1 *)(lVar9 + 5 + uVar11) = 0;
        *(undefined1 *)(lVar9 + 6 + uVar11) = 0;
        *(undefined1 *)(lVar9 + 7 + uVar11) = 0;
        uVar11 = uVar11 + 8;
      } while (uVar17 != uVar11);
    }
  }
  lVar9 = *(longlong *)(unaff_RBP + 0x8f0);
  uVar11 = *(longlong *)(unaff_RBP + 0x8f8) - lVar9;
  if (uVar11 != 0) {
    uVar17 = uVar11;
    if ((uVar11 & 7) != 0) {
      uVar17 = 0;
      do {
        *(undefined1 *)(lVar9 + uVar17) = 0;
        uVar17 = uVar17 + 1;
      } while ((uVar11 & 7) != uVar17);
      lVar9 = lVar9 + uVar17;
      uVar17 = uVar11 - uVar17;
    }
    if (7 < uVar11) {
      uVar11 = 0;
      do {
        *(undefined1 *)(lVar9 + uVar11) = 0;
        *(undefined1 *)(lVar9 + 1 + uVar11) = 0;
        *(undefined1 *)(lVar9 + 2 + uVar11) = 0;
        *(undefined1 *)(lVar9 + 3 + uVar11) = 0;
        *(undefined1 *)(lVar9 + 4 + uVar11) = 0;
        *(undefined1 *)(lVar9 + 5 + uVar11) = 0;
        *(undefined1 *)(lVar9 + 6 + uVar11) = 0;
        *(undefined1 *)(lVar9 + 7 + uVar11) = 0;
        uVar11 = uVar11 + 8;
      } while (uVar17 != uVar11);
    }
  }
  uVar2 = *(undefined8 *)(unaff_RBP + 0x940);
  uVar6 = *(undefined8 *)(unaff_RBP + 0x948);
  uVar7 = *(undefined8 *)(unaff_RBP + 0x950);
  uVar8 = *(undefined8 *)(unaff_RBP + 0x958);
  *(undefined8 *)(unaff_RBP + 0x2d0) = *(undefined8 *)(unaff_RBP + 0x930);
  *(undefined8 *)(unaff_RBP + 0x2d8) = *(undefined8 *)(unaff_RBP + 0x938);
  *(undefined8 *)(unaff_RBP + 0x940) = 0;
  *(undefined8 *)(unaff_RBP + 0x948) = 0;
  *(undefined8 *)(unaff_RBP + 0x930) = 0;
  *(undefined8 *)(unaff_RBP + 0x938) = 0;
  *(undefined8 *)(unaff_RBP + 0x2e0) = uVar2;
  *(undefined8 *)(unaff_RBP + 0x2e8) = uVar6;
  *(undefined8 *)(unaff_RBP + 0x950) = 0;
  *(undefined8 *)(unaff_RBP + 0x958) = 0;
  *(undefined8 *)(unaff_RBP + 0x2f0) = uVar7;
  *(undefined8 *)(unaff_RBP + 0x2f8) = uVar8;
  *(undefined8 *)(unaff_RBP + 0x300) = *(undefined8 *)(unaff_RBP + 0x960);
  *(undefined8 *)(unaff_RBP + 0x308) = *(undefined8 *)(unaff_RBP + 0x968);
  *(undefined4 *)(unaff_RBP + 0x310) = *(undefined4 *)(unaff_RBP + 0x970);
  *(undefined4 *)(unaff_RBP + 0x314) = *(undefined4 *)(unaff_RBP + 0x974);
  *(undefined4 *)(unaff_RBP + 0x318) = *(undefined4 *)(unaff_RBP + 0x978);
  *(undefined4 *)(unaff_RBP + 0x31c) = *(undefined4 *)(unaff_RBP + 0x97c);
  *(undefined8 *)(unaff_RBP + 0x970) = 0;
  *(undefined8 *)(unaff_RBP + 0x978) = 0xf;
  *(undefined1 *)(unaff_RBP + 0x960) = 0;
  uVar2 = *(undefined8 *)(unaff_RBP + 0x990);
  *(undefined8 *)(unaff_RBP + 0x990) = 0;
  uVar4 = *(undefined4 *)(unaff_RBP + 0x980);
  uVar5 = *(undefined4 *)(unaff_RBP + 0x988);
  *(undefined8 *)(unaff_RBP + 0x980) = 0;
  *(undefined8 *)(unaff_RBP + 0x988) = 0;
  *(undefined4 *)(unaff_RBP + 800) = uVar4;
  *(undefined4 *)(unaff_RBP + 0x324) = *(undefined4 *)(unaff_RBP + 0x984);
  *(undefined4 *)(unaff_RBP + 0x328) = uVar5;
  *(undefined4 *)(unaff_RBP + 0x32c) = *(undefined4 *)(unaff_RBP + 0x98c);
  *(undefined8 *)(unaff_RBP + 0x330) = uVar2;
  *(undefined8 *)(unaff_RBP + 0x338) = *(undefined8 *)(unaff_RBP + 0x998);
  *(undefined8 *)(unaff_RBP + 0x340) = *(undefined8 *)(unaff_RBP + 0x9a0);
  *(undefined1 *)(unaff_RBP + 0x348) = *(undefined1 *)(unaff_RBP + 0x9a8);
  *(undefined1 *)(unaff_RBP + 0x350) = 1;
  func_0x7ff70ca029f0(unaff_RBP + 0x930);
  func_0x7ff70c788810(unaff_RBP + 0x4c0);
  func_0x7ff70c788810(unaff_RBP + 0x8f0);
  func_0x7ff70c788810(unaff_RBP + 1000);
  func_0x7ff70c8e9fd0(unaff_RBP + 0xb40);
  func_0x7ff70c788810(unaff_RBP + 0x6f0);
  func_0x7ff70c788810(unaff_RBP + 0x210);
  func_0x7ff70c788810(unaff_RBP + 0x4a0);
  func_0x7ff70ca37a80(unaff_RBP + 0x928);
  func_0x7ff70c788810(unaff_RBP + 0x6b8);
  func_0x7ff70ca37a80(unaff_RBP + 0x920);
  func_0x7ff70ca37a80(unaff_RBP + 0x8b8);
  func_0x7ff70c788810(unaff_RBP + 0x480);
  func_0x7ff70ca37a80(unaff_RBP + 0x458);
  func_0x7ff70ca37a80(unaff_RBP + 0x7e8);
  func_0x7ff70c788810(unaff_RBP + 0x850);
  func_0x7ff70c788810(unaff_RBP + 0x6d0);
  func_0x7ff70c788810(unaff_RBP + 0x790);
  func_0x7ff70c788810(unaff_RBP + 0x870);
  func_0x7ff70c788810(unaff_RBP + 0x8d0);
  func_0x7ff70c8e9fd0(unaff_RBP + 0x438);
  func_0x7ff70c8e9fd0(unaff_RBP + 0x418);
  func_0x7ff70c8e9fd0(unaff_RBP + 0x770);
  func_0x7ff70c8e9fd0(unaff_RBP + 0x750);
  func_0x7ff70c8e9fd0(unaff_RBP + 0x730);
  func_0x7ff70ca1c2b0(unaff_RBP + 0x7b0);
  func_0x7ff70ca37b80(unaff_RBP + 0x4e0);
  uVar11 = *(ulonglong *)(unaff_RBP + 0x8a8);
  if (0xf < uVar11) {
    lVar9 = *(longlong *)(unaff_RBP + 0x890);
    uVar17 = uVar11 + 1;
    lVar10 = lVar9;
    if (0xfff < uVar17) {
      lVar10 = *(longlong *)(lVar9 + -8);
      if (0x1f < (ulonglong)((lVar9 + -8) - lVar10)) goto LAB_7ff70ca17b2c;
      uVar17 = uVar11 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar10,uVar17);
  }
  func_0x7ff70ca38e00(unaff_RBP + 0x3c8,*(undefined1 *)(unaff_RBP + 0x3c0));
  uVar11 = *(ulonglong *)(unaff_RBP + 0x2c8);
  if (0xf < uVar11) {
    lVar9 = *(longlong *)(unaff_RBP + 0x2b0);
    uVar17 = uVar11 + 1;
    lVar10 = lVar9;
    if (0xfff < uVar17) {
      lVar10 = *(longlong *)(lVar9 + -8);
      if (0x1f < (ulonglong)((lVar9 + -8) - lVar10)) goto LAB_7ff70ca17b2c;
      uVar17 = uVar11 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar10,uVar17);
  }
  uVar11 = *(ulonglong *)(unaff_RBP + 0x2a8);
  if (0xf < uVar11) {
    lVar9 = *(longlong *)(unaff_RBP + 0x290);
    uVar17 = uVar11 + 1;
    lVar10 = lVar9;
    if (0xfff < uVar17) {
      lVar10 = *(longlong *)(lVar9 + -8);
      if (0x1f < (ulonglong)((lVar9 + -8) - lVar10)) goto LAB_7ff70ca17b2c;
      uVar17 = uVar11 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar10,uVar17);
  }
  lVar9 = *(longlong *)(unaff_RBP + 0x400);
  if (lVar9 != 0) {
    uVar11 = *(longlong *)(unaff_RBP + 0x410) - lVar9;
    lVar10 = lVar9;
    if (0xfff < uVar11) {
      lVar10 = *(longlong *)(lVar9 + -8);
      if (0x1f < (ulonglong)((lVar9 + -8) - lVar10)) goto LAB_7ff70ca17b2c;
      uVar11 = uVar11 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar10,uVar11);
  }
  lVar9 = *(longlong *)(unaff_RBP + 0x7f0);
  if (lVar9 != 0) {
    uVar11 = *(longlong *)(unaff_RBP + 0x800) - lVar9;
    lVar10 = lVar9;
    if (0xfff < uVar11) {
      lVar10 = *(longlong *)(lVar9 + -8);
      if (0x1f < (ulonglong)((lVar9 + -8) - lVar10)) goto LAB_7ff70ca17b2c;
      uVar11 = uVar11 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar10,uVar11);
  }
  lVar9 = *(longlong *)(unaff_RBP + 0x460);
  if (lVar9 != 0) {
    uVar11 = *(longlong *)(unaff_RBP + 0x470) - lVar9;
    lVar10 = lVar9;
    if (0xfff < uVar11) {
      lVar10 = *(longlong *)(lVar9 + -8);
      if (0x1f < (ulonglong)((lVar9 + -8) - lVar10)) goto LAB_7ff70ca17b2c;
      uVar11 = uVar11 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar10,uVar11);
  }
  if (*(longlong *)(unaff_RBP + 0xb28) != 0) {
    plVar12 = (longlong *)(*(longlong *)((longlong)ProcessEnvironmentBlock + 0x18) + 0x10);
    do {
      do {
        do {
          plVar12 = (longlong *)*plVar12;
          lVar9 = plVar12[6];
          uVar11 = (ulonglong)*(uint *)(lVar9 + 0x88 + (longlong)*(int *)(lVar9 + 0x3c));
        } while (uVar11 == 0);
        uVar17 = (ulonglong)*(uint *)(lVar9 + 0x18 + uVar11);
      } while (uVar17 == 0);
      do {
        uVar14 = (ulonglong)
                 *(uint *)((ulonglong)*(uint *)(lVar9 + 0x20 + uVar11) + lVar9 + -4 + uVar17 * 4);
        uVar17 = uVar17 - 1;
        cVar13 = *(char *)(lVar9 + uVar14);
        if (cVar13 != '\0') {
          pcVar15 = (char *)(uVar14 + lVar9 + 1);
          uVar16 = 0xf579b59a;
          do {
            uVar16 = ((int)cVar13 ^ uVar16) * 0x1000193;
            cVar13 = *pcVar15;
            pcVar15 = pcVar15 + 1;
          } while (cVar13 != '\0');
          if (uVar16 == 0x4f482784) {
            (*(code *)((ulonglong)
                       *(uint *)((ulonglong)*(uint *)(lVar9 + 0x1c + uVar11) + lVar9 +
                                (ulonglong)
                                *(ushort *)
                                 ((ulonglong)*(uint *)(lVar9 + 0x24 + uVar11) + lVar9 + uVar17 * 2)
                                * 4) + lVar9))(*(longlong *)(unaff_RBP + 0xb28),0);
            goto LAB_7ff70ca14978;
          }
        }
      } while (uVar17 != 0);
    } while( true );
  }
LAB_7ff70ca14978:
  if (*(longlong *)(unaff_RBP + 0x918) != 0) {
    plVar12 = (longlong *)(*(longlong *)((longlong)ProcessEnvironmentBlock + 0x18) + 0x10);
    do {
      do {
        do {
          plVar12 = (longlong *)*plVar12;
          lVar9 = plVar12[6];
          uVar11 = (ulonglong)*(uint *)(lVar9 + 0x88 + (longlong)*(int *)(lVar9 + 0x3c));
        } while (uVar11 == 0);
        uVar17 = (ulonglong)*(uint *)(lVar9 + 0x18 + uVar11);
      } while (uVar17 == 0);
      do {
        uVar14 = (ulonglong)
                 *(uint *)((ulonglong)*(uint *)(lVar9 + 0x20 + uVar11) + lVar9 + -4 + uVar17 * 4);
        uVar17 = uVar17 - 1;
        cVar13 = *(char *)(lVar9 + uVar14);
        if (cVar13 != '\0') {
          pcVar15 = (char *)(uVar14 + lVar9 + 1);
          uVar16 = 0xf579b59a;
          do {
            uVar16 = ((int)cVar13 ^ uVar16) * 0x1000193;
            cVar13 = *pcVar15;
            pcVar15 = pcVar15 + 1;
          } while (cVar13 != '\0');
          if (uVar16 == 0x4f482784) {
            (*(code *)((ulonglong)
                       *(uint *)((ulonglong)*(uint *)(lVar9 + 0x1c + uVar11) + lVar9 +
                                (ulonglong)
                                *(ushort *)
                                 ((ulonglong)*(uint *)(lVar9 + 0x24 + uVar11) + lVar9 + uVar17 * 2)
                                * 4) + lVar9))(*(longlong *)(unaff_RBP + 0x918),0);
            goto LAB_7ff70ca14a2f;
          }
        }
      } while (uVar17 != 0);
    } while( true );
  }
LAB_7ff70ca14a2f:
  uVar11 = *(ulonglong *)(unaff_RBP + 0x3b8);
  if (0xf < uVar11) {
    lVar9 = *(longlong *)(unaff_RBP + 0x3a0);
    uVar17 = uVar11 + 1;
    lVar10 = lVar9;
    if (0xfff < uVar17) {
      lVar10 = *(longlong *)(lVar9 + -8);
      if (0x1f < (ulonglong)((lVar9 + -8) - lVar10)) goto LAB_7ff70ca17b2c;
      uVar17 = uVar11 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar10,uVar17);
  }
  func_0x7ff70ca35e40(unaff_RBP + 0x38);
  bVar1 = *(byte *)(unaff_RBP + 0x350);
  if ((bVar1 != 0) &&
     (func_0x7ff70ca36350(&DAT_7ff70cbed390,unaff_RBP + 0x2d0),
     *(char *)(unaff_RBP + 0x350) == '\x01')) {
    func_0x7ff70ca029f0(unaff_RBP + 0x2d0);
  }
  uVar11 = *(ulonglong *)(unaff_RBP + 0x288);
  if (0xf < uVar11) {
    lVar9 = *(longlong *)(unaff_RBP + 0x270);
    uVar17 = uVar11 + 1;
    lVar10 = lVar9;
    if (0xfff < uVar17) {
      lVar10 = *(longlong *)(lVar9 + -8);
      if (0x1f < (ulonglong)((lVar9 + -8) - lVar10)) {
LAB_7ff70ca17b2c:
                    /* WARNING: Does not return */
        pcVar3 = (code *)invalidInstructionException();
        (*pcVar3)();
      }
      uVar17 = uVar11 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar10,uVar17);
  }
  func_0x7ff70cb12580(0x7ff70cbed668);
  return (ulonglong)bVar1;
}


