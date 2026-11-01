
ulong FUN_00191da4(void)

{
  uint uVar1;
  code *pcVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  undefined *puVar7;
  long unaff_x20;
  long unaff_x21;
  ulong uVar8;
  long unaff_x22;
  undefined8 *unaff_x23;
  undefined8 *unaff_x26;
  long unaff_x27;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  
  do {
    lVar4 = _CFRetain();
    lVar5 = uStack0000000000000008;
    if (lVar4 == 0) break;
    uStack0000000000000010 = 1;
    uStack0000000000000018 = lVar4;
    lVar4 = _CFRetain();
    if (lVar4 == 0) {
      func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0e58);
      goto LAB_00192020;
    }
    uStack0000000000000020 = lVar4;
    if (lVar5 == 0) {
      puVar7 = &UNK_009c0e40;
code_r0x00192010:
      func_0x007a11c0(&UNK_0081a9b0,0x22,puVar7);
      goto LAB_00192020;
    }
    lVar5 = _CFRetain(lVar5);
    if (lVar5 == 0) {
      puVar7 = &UNK_009c0e58;
      goto code_r0x00192010;
    }
    uStack0000000000000028 = lVar5;
    iVar3 = _CFEqual(lVar4,lVar5);
    func_0x0019e6a4(&uStack0000000000000028);
    func_0x0019e6a4(&uStack0000000000000020);
    if (iVar3 == 0) {
      if (uStack0000000000000010 != 0) {
        func_0x0019fb28(&uStack0000000000000018);
      }
      func_0x0019fb28(&uStack0000000000000008);
      func_0x0019fb28();
      goto code_r0x00191d10;
    }
    if (uStack0000000000000010 != 0) {
      func_0x0019fb28(&uStack0000000000000018);
    }
    do {
      func_0x0019fb28(&uStack0000000000000008);
      func_0x0019fb28();
      lVar5 = _CFStringCreateWithBytesNoCopy(*unaff_x26,&UNK_0081af4e,0x17,0x8000100,0,*unaff_x23);
      if (lVar5 == 0) {
FUN_00191f54:
        func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0e70);
        goto LAB_00192020;
      }
      uStack0000000000000010 = 0;
      uStack0000000000000020 = lVar5;
      iVar3 = _CFDictionaryGetValueIfPresent(unaff_x27,lVar5,&uStack0000000000000010);
      if (iVar3 == 0) {
        func_0x0019fb28(&uStack0000000000000020);
code_r0x00191f10:
        uVar8 = 0x100;
code_r0x00191f14:
        _CFRelease();
code_r0x00191f20:
        return uVar8 | unaff_x20 << 0x20;
      }
      if ((uStack0000000000000010 == 0) || (lVar5 = _CFRetain(), lVar5 == 0)) {
        func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0ea0);
        goto LAB_00192020;
      }
      uStack0000000000000010 = 0;
      uStack0000000000000028 = lVar5;
      uVar6 = _CFNumberGetValue(lVar5,4,&uStack0000000000000010);
      uVar8 = uStack0000000000000010;
      if ((uVar6 & 1) == 0) {
        func_0x0019fb28(&uStack0000000000000028);
        func_0x0019fb28(&uStack0000000000000020);
        goto code_r0x00191f10;
      }
      func_0x0019fb28(&uStack0000000000000028);
      func_0x0019fb28(&uStack0000000000000020);
      if ((uVar8 >> 0x20 == 0) && (uVar1 = (int)uVar8 - 1, uVar1 < 3)) {
        uVar8 = (ulong)(uVar1 * 0x100 + 0x100);
        goto code_r0x00191f14;
      }
code_r0x00191d10:
      unaff_x22 = unaff_x22 + 1;
      if (unaff_x21 == unaff_x22) {
        _CFRelease();
        uVar8 = 0x500;
        goto code_r0x00191f20;
      }
      unaff_x27 = _CFArrayGetValueAtIndex();
      if (unaff_x27 == 0) {
        func_0x007a11c0(&UNK_0081a021,0x22,&UNK_009c0778);
        goto LAB_00192020;
      }
      lVar5 = _CFStringCreateWithBytesNoCopy(*unaff_x26,&UNK_0081af2a,0x1b,0x8000100,0,*unaff_x23);
      if (lVar5 == 0) goto FUN_00191f54;
      lVar4 = _CFStringCreateWithBytesNoCopy(*unaff_x26);
      if (lVar4 == 0) {
        func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0e70);
        goto LAB_00192020;
      }
      uStack0000000000000028 = 0;
      uStack0000000000000008 = lVar4;
      iVar3 = _CFDictionaryGetValueIfPresent(unaff_x27,lVar5,&uStack0000000000000028);
    } while (iVar3 == 0);
  } while (uStack0000000000000028 != 0);
  func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0e70);
LAB_00192020:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x192024);
  (*pcVar2)();
}

