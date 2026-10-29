/* 7ff70ca176d8 FUN_7ff70ca176d8 */

char FUN_7ff70ca176d8(void)

{
  code *pcVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  longlong lVar7;
  longlong lVar8;
  ulonglong uVar9;
  longlong *plVar10;
  char cVar11;
  longlong unaff_RBP;
  ulonglong uVar12;
  char *pcVar13;
  uint uVar14;
  ulonglong uVar15;
  undefined8 uVar16;
  undefined4 unaff_XMM6_Da;
  undefined4 unaff_XMM6_Db;
  undefined4 unaff_XMM6_Dc;
  undefined4 unaff_XMM6_Dd;
  
  FUN_7ff70d996775();
  func_0x7ff70ca551f0();
  func_0x7ff70c788810(unaff_RBP + 0xb08);
  func_0x7ff70ca377b0(unaff_RBP + 0x4c0);
  func_0x7ff70c788810();
  func_0x7ff70ca35100(unaff_RBP + 0x8f0,*(undefined8 *)(unaff_RBP + 0x8f8));
  uVar16 = func_0x7ff70c788810();
  *(char *)(unaff_RBP + 0xb7f) = *(char *)(unaff_RBP + 0xb7f) + '\x01';
  if ((ulonglong)(*(longlong *)(unaff_RBP + 0x8f8) - *(longlong *)(unaff_RBP + 0x8f0)) < 0x40) {
    *(undefined4 *)(unaff_RBP + 0x360) = unaff_XMM6_Da;
    *(undefined4 *)(unaff_RBP + 0x364) = unaff_XMM6_Db;
    *(undefined4 *)(unaff_RBP + 0x368) = unaff_XMM6_Dc;
    *(undefined4 *)(unaff_RBP + 0x36c) = unaff_XMM6_Dd;
    *(undefined8 *)(unaff_RBP + 0x370) = 0;
    uVar16 = func_0x7ff70ca35100(uVar16,0,*(longlong *)(unaff_RBP + 0x4c0),
                                 *(longlong *)(unaff_RBP + 0x4c8) - *(longlong *)(unaff_RBP + 0x4c0)
                                );
    uVar16 = func_0x7ff70ca35100(uVar16,*(undefined8 *)(unaff_RBP + 0x368));
    func_0x7ff70ca37740(uVar16,unaff_RBP + 0xb7f);
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
  lVar7 = *(longlong *)(unaff_RBP + 0x6b8);
  uVar9 = *(longlong *)(unaff_RBP + 0x6c0) - lVar7;
  if (uVar9 != 0) {
    uVar15 = uVar9;
    if ((uVar9 & 7) != 0) {
      uVar15 = 0;
      do {
        *(undefined1 *)(lVar7 + uVar15) = 0;
        uVar15 = uVar15 + 1;
      } while ((uVar9 & 7) != uVar15);
      lVar7 = lVar7 + uVar15;
      uVar15 = uVar9 - uVar15;
    }
    if (7 < uVar9) {
      uVar9 = 0;
      do {
        *(undefined1 *)(lVar7 + uVar9) = 0;
        *(undefined1 *)(lVar7 + 1 + uVar9) = 0;
        *(undefined1 *)(lVar7 + 2 + uVar9) = 0;
        *(undefined1 *)(lVar7 + 3 + uVar9) = 0;
        *(undefined1 *)(lVar7 + 4 + uVar9) = 0;
        *(undefined1 *)(lVar7 + 5 + uVar9) = 0;
        *(undefined1 *)(lVar7 + 6 + uVar9) = 0;
        *(undefined1 *)(lVar7 + 7 + uVar9) = 0;
        uVar9 = uVar9 + 8;
      } while (uVar15 != uVar9);
    }
  }
  lVar7 = *(longlong *)(unaff_RBP + 0x8f0);
  uVar9 = *(longlong *)(unaff_RBP + 0x8f8) - lVar7;
  if (uVar9 != 0) {
    uVar15 = uVar9;
    if ((uVar9 & 7) != 0) {
      uVar15 = 0;
      do {
        *(undefined1 *)(lVar7 + uVar15) = 0;
        uVar15 = uVar15 + 1;
      } while ((uVar9 & 7) != uVar15);
      lVar7 = lVar7 + uVar15;
      uVar15 = uVar9 - uVar15;
    }
    if (7 < uVar9) {
      uVar9 = 0;
      do {
        *(undefined1 *)(lVar7 + uVar9) = 0;
        *(undefined1 *)(lVar7 + 1 + uVar9) = 0;
        *(undefined1 *)(lVar7 + 2 + uVar9) = 0;
        *(undefined1 *)(lVar7 + 3 + uVar9) = 0;
        *(undefined1 *)(lVar7 + 4 + uVar9) = 0;
        *(undefined1 *)(lVar7 + 5 + uVar9) = 0;
        *(undefined1 *)(lVar7 + 6 + uVar9) = 0;
        *(undefined1 *)(lVar7 + 7 + uVar9) = 0;
        uVar9 = uVar9 + 8;
      } while (uVar15 != uVar9);
    }
  }
  uVar16 = *(undefined8 *)(unaff_RBP + 0x940);
  uVar4 = *(undefined8 *)(unaff_RBP + 0x948);
  uVar5 = *(undefined8 *)(unaff_RBP + 0x950);
  uVar6 = *(undefined8 *)(unaff_RBP + 0x958);
  *(undefined8 *)(unaff_RBP + 0x2d0) = *(undefined8 *)(unaff_RBP + 0x930);
  *(undefined8 *)(unaff_RBP + 0x2d8) = *(undefined8 *)(unaff_RBP + 0x938);
  *(undefined8 *)(unaff_RBP + 0x940) = 0;
  *(undefined8 *)(unaff_RBP + 0x948) = 0;
  *(undefined8 *)(unaff_RBP + 0x930) = 0;
  *(undefined8 *)(unaff_RBP + 0x938) = 0;
  *(undefined8 *)(unaff_RBP + 0x2e0) = uVar16;
  *(undefined8 *)(unaff_RBP + 0x2e8) = uVar4;
  *(undefined8 *)(unaff_RBP + 0x950) = 0;
  *(undefined8 *)(unaff_RBP + 0x958) = 0;
  *(undefined8 *)(unaff_RBP + 0x2f0) = uVar5;
  *(undefined8 *)(unaff_RBP + 0x2f8) = uVar6;
  *(undefined8 *)(unaff_RBP + 0x300) = *(undefined8 *)(unaff_RBP + 0x960);
  *(undefined8 *)(unaff_RBP + 0x308) = *(undefined8 *)(unaff_RBP + 0x968);
  *(undefined4 *)(unaff_RBP + 0x310) = *(undefined4 *)(unaff_RBP + 0x970);
  *(undefined4 *)(unaff_RBP + 0x314) = *(undefined4 *)(unaff_RBP + 0x974);
  *(undefined4 *)(unaff_RBP + 0x318) = *(undefined4 *)(unaff_RBP + 0x978);
  *(undefined4 *)(unaff_RBP + 0x31c) = *(undefined4 *)(unaff_RBP + 0x97c);
  *(undefined8 *)(unaff_RBP + 0x970) = 0;
  *(undefined8 *)(unaff_RBP + 0x978) = 0xf;
  *(undefined1 *)(unaff_RBP + 0x960) = 0;
  uVar16 = *(undefined8 *)(unaff_RBP + 0x990);
  *(undefined8 *)(unaff_RBP + 0x990) = 0;
  uVar2 = *(undefined4 *)(unaff_RBP + 0x980);
  uVar3 = *(undefined4 *)(unaff_RBP + 0x988);
  *(undefined8 *)(unaff_RBP + 0x980) = 0;
  *(undefined8 *)(unaff_RBP + 0x988) = 0;
  *(undefined4 *)(unaff_RBP + 800) = uVar2;
  *(undefined4 *)(unaff_RBP + 0x324) = *(undefined4 *)(unaff_RBP + 0x984);
  *(undefined4 *)(unaff_RBP + 0x328) = uVar3;
  *(undefined4 *)(unaff_RBP + 0x32c) = *(undefined4 *)(unaff_RBP + 0x98c);
  *(undefined8 *)(unaff_RBP + 0x330) = uVar16;
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
  uVar9 = *(ulonglong *)(unaff_RBP + 0x8a8);
  if (0xf < uVar9) {
    lVar7 = *(longlong *)(unaff_RBP + 0x890);
    uVar15 = uVar9 + 1;
    lVar8 = lVar7;
    if (0xfff < uVar15) {
      lVar8 = *(longlong *)(lVar7 + -8);
      if (0x1f < (ulonglong)((lVar7 + -8) - lVar8)) goto LAB_7ff70ca17b2c;
      uVar15 = uVar9 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar8,uVar15);
  }
  func_0x7ff70ca38e00(unaff_RBP + 0x3c8,*(undefined1 *)(unaff_RBP + 0x3c0));
  uVar9 = *(ulonglong *)(unaff_RBP + 0x2c8);
  if (0xf < uVar9) {
    lVar7 = *(longlong *)(unaff_RBP + 0x2b0);
    uVar15 = uVar9 + 1;
    lVar8 = lVar7;
    if (0xfff < uVar15) {
      lVar8 = *(longlong *)(lVar7 + -8);
      if (0x1f < (ulonglong)((lVar7 + -8) - lVar8)) goto LAB_7ff70ca17b2c;
      uVar15 = uVar9 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar8,uVar15);
  }
  uVar9 = *(ulonglong *)(unaff_RBP + 0x2a8);
  if (0xf < uVar9) {
    lVar7 = *(longlong *)(unaff_RBP + 0x290);
    uVar15 = uVar9 + 1;
    lVar8 = lVar7;
    if (0xfff < uVar15) {
      lVar8 = *(longlong *)(lVar7 + -8);
      if (0x1f < (ulonglong)((lVar7 + -8) - lVar8)) goto LAB_7ff70ca17b2c;
      uVar15 = uVar9 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar8,uVar15);
  }
  lVar7 = *(longlong *)(unaff_RBP + 0x400);
  if (lVar7 != 0) {
    uVar9 = *(longlong *)(unaff_RBP + 0x410) - lVar7;
    lVar8 = lVar7;
    if (0xfff < uVar9) {
      lVar8 = *(longlong *)(lVar7 + -8);
      if (0x1f < (ulonglong)((lVar7 + -8) - lVar8)) goto LAB_7ff70ca17b2c;
      uVar9 = uVar9 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar8,uVar9);
  }
  lVar7 = *(longlong *)(unaff_RBP + 0x7f0);
  if (lVar7 != 0) {
    uVar9 = *(longlong *)(unaff_RBP + 0x800) - lVar7;
    lVar8 = lVar7;
    if (0xfff < uVar9) {
      lVar8 = *(longlong *)(lVar7 + -8);
      if (0x1f < (ulonglong)((lVar7 + -8) - lVar8)) goto LAB_7ff70ca17b2c;
      uVar9 = uVar9 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar8,uVar9);
  }
  lVar7 = *(longlong *)(unaff_RBP + 0x460);
  if (lVar7 != 0) {
    uVar9 = *(longlong *)(unaff_RBP + 0x470) - lVar7;
    lVar8 = lVar7;
    if (0xfff < uVar9) {
      lVar8 = *(longlong *)(lVar7 + -8);
      if (0x1f < (ulonglong)((lVar7 + -8) - lVar8)) goto LAB_7ff70ca17b2c;
      uVar9 = uVar9 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar8,uVar9);
  }
  if (*(longlong *)(unaff_RBP + 0xb28) != 0) {
    plVar10 = (longlong *)(*(longlong *)((longlong)ProcessEnvironmentBlock + 0x18) + 0x10);
    do {
      do {
        do {
          plVar10 = (longlong *)*plVar10;
          lVar7 = plVar10[6];
          uVar9 = (ulonglong)*(uint *)(lVar7 + 0x88 + (longlong)*(int *)(lVar7 + 0x3c));
        } while (uVar9 == 0);
        uVar15 = (ulonglong)*(uint *)(lVar7 + 0x18 + uVar9);
      } while (uVar15 == 0);
      do {
        uVar12 = (ulonglong)
                 *(uint *)((ulonglong)*(uint *)(lVar7 + 0x20 + uVar9) + lVar7 + -4 + uVar15 * 4);
        uVar15 = uVar15 - 1;
        cVar11 = *(char *)(lVar7 + uVar12);
        if (cVar11 != '\0') {
          pcVar13 = (char *)(uVar12 + lVar7 + 1);
          uVar14 = 0xf579b59a;
          do {
            uVar14 = ((int)cVar11 ^ uVar14) * 0x1000193;
            cVar11 = *pcVar13;
            pcVar13 = pcVar13 + 1;
          } while (cVar11 != '\0');
          if (uVar14 == 0x4f482784) {
            (*(code *)((ulonglong)
                       *(uint *)((ulonglong)*(uint *)(lVar7 + 0x1c + uVar9) + lVar7 +
                                (ulonglong)
                                *(ushort *)
                                 ((ulonglong)*(uint *)(lVar7 + 0x24 + uVar9) + lVar7 + uVar15 * 2) *
                                4) + lVar7))(*(longlong *)(unaff_RBP + 0xb28),0);
            goto LAB_7ff70ca14978;
          }
        }
      } while (uVar15 != 0);
    } while( true );
  }
LAB_7ff70ca14978:
  if (*(longlong *)(unaff_RBP + 0x918) != 0) {
    plVar10 = (longlong *)(*(longlong *)((longlong)ProcessEnvironmentBlock + 0x18) + 0x10);
    do {
      do {
        do {
          plVar10 = (longlong *)*plVar10;
          lVar7 = plVar10[6];
          uVar9 = (ulonglong)*(uint *)(lVar7 + 0x88 + (longlong)*(int *)(lVar7 + 0x3c));
        } while (uVar9 == 0);
        uVar15 = (ulonglong)*(uint *)(lVar7 + 0x18 + uVar9);
      } while (uVar15 == 0);
      do {
        uVar12 = (ulonglong)
                 *(uint *)((ulonglong)*(uint *)(lVar7 + 0x20 + uVar9) + lVar7 + -4 + uVar15 * 4);
        uVar15 = uVar15 - 1;
        cVar11 = *(char *)(lVar7 + uVar12);
        if (cVar11 != '\0') {
          pcVar13 = (char *)(uVar12 + lVar7 + 1);
          uVar14 = 0xf579b59a;
          do {
            uVar14 = ((int)cVar11 ^ uVar14) * 0x1000193;
            cVar11 = *pcVar13;
            pcVar13 = pcVar13 + 1;
          } while (cVar11 != '\0');
          if (uVar14 == 0x4f482784) {
            (*(code *)((ulonglong)
                       *(uint *)((ulonglong)*(uint *)(lVar7 + 0x1c + uVar9) + lVar7 +
                                (ulonglong)
                                *(ushort *)
                                 ((ulonglong)*(uint *)(lVar7 + 0x24 + uVar9) + lVar7 + uVar15 * 2) *
                                4) + lVar7))(*(longlong *)(unaff_RBP + 0x918),0);
            goto LAB_7ff70ca14a2f;
          }
        }
      } while (uVar15 != 0);
    } while( true );
  }
LAB_7ff70ca14a2f:
  uVar9 = *(ulonglong *)(unaff_RBP + 0x3b8);
  if (0xf < uVar9) {
    lVar7 = *(longlong *)(unaff_RBP + 0x3a0);
    uVar15 = uVar9 + 1;
    lVar8 = lVar7;
    if (0xfff < uVar15) {
      lVar8 = *(longlong *)(lVar7 + -8);
      if (0x1f < (ulonglong)((lVar7 + -8) - lVar8)) goto LAB_7ff70ca17b2c;
      uVar15 = uVar9 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar8,uVar15);
  }
  func_0x7ff70ca35e40(unaff_RBP + 0x38);
  cVar11 = *(char *)(unaff_RBP + 0x350);
  if ((cVar11 != '\0') &&
     (func_0x7ff70ca36350(&DAT_7ff70cbed390,unaff_RBP + 0x2d0),
     *(char *)(unaff_RBP + 0x350) == '\x01')) {
    func_0x7ff70ca029f0(unaff_RBP + 0x2d0);
  }
  uVar9 = *(ulonglong *)(unaff_RBP + 0x288);
  if (0xf < uVar9) {
    lVar7 = *(longlong *)(unaff_RBP + 0x270);
    uVar15 = uVar9 + 1;
    lVar8 = lVar7;
    if (0xfff < uVar15) {
      lVar8 = *(longlong *)(lVar7 + -8);
      if (0x1f < (ulonglong)((lVar7 + -8) - lVar8)) {
LAB_7ff70ca17b2c:
                    /* WARNING: Does not return */
        pcVar1 = (code *)invalidInstructionException();
        (*pcVar1)();
      }
      uVar15 = uVar9 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar8,uVar15);
  }
  func_0x7ff70cb12580(0x7ff70cbed668);
  return cVar11;
}


