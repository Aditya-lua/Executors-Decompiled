
ulong FUN_00191ea0(undefined8 *param_1)

{
  uint uVar1;
  code *pcVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  undefined *puVar7;
  long unaff_x20;
  long unaff_x21;
  ulong uVar8;
  long unaff_x22;
  undefined8 *unaff_x23;
  ulong unaff_x25;
  undefined8 *unaff_x26;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  
code_r0x00191ea0:
  func_0x0019fb28(param_1);
  if ((unaff_x25 >> 0x20 != 0) || (uVar1 = (int)unaff_x25 - 1, 2 < uVar1)) {
    do {
      unaff_x22 = unaff_x22 + 1;
      if (unaff_x21 == unaff_x22) {
        _CFRelease();
        uVar8 = 0x500;
        goto code_r0x00191f20;
      }
      lVar4 = _CFArrayGetValueAtIndex();
      if (lVar4 == 0) {
        func_0x007a11c0(&UNK_0081a021,0x22,&UNK_009c0778);
        goto code_r0x00192020;
      }
      lVar5 = _CFStringCreateWithBytesNoCopy(*unaff_x26,&UNK_0081af2a,0x1b,0x8000100,0,*unaff_x23);
      if (lVar5 == 0) goto code_r0x00191f54;
      lVar6 = _CFStringCreateWithBytesNoCopy(*unaff_x26);
      if (lVar6 == 0) {
        func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0e70);
        goto code_r0x00192020;
      }
      uStack0000000000000028 = 0;
      uStack0000000000000008 = lVar6;
      iVar3 = _CFDictionaryGetValueIfPresent(lVar4,lVar5,&uStack0000000000000028);
      if (iVar3 == 0) goto code_r0x00191e14;
      if ((uStack0000000000000028 == 0) ||
         (lVar6 = _CFRetain(), lVar5 = uStack0000000000000008, lVar6 == 0)) {
        func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0e70);
        goto code_r0x00192020;
      }
      uStack0000000000000010 = 1;
      uStack0000000000000018 = lVar6;
      lVar6 = _CFRetain();
      if (lVar6 == 0) {
        func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0e58);
        goto code_r0x00192020;
      }
      uStack0000000000000020 = lVar6;
      if (lVar5 == 0) {
        puVar7 = &UNK_009c0e40;
code_r0x00192010:
        func_0x007a11c0(&UNK_0081a9b0,0x22,puVar7);
        goto code_r0x00192020;
      }
      lVar5 = _CFRetain(lVar5);
      if (lVar5 == 0) {
        puVar7 = &UNK_009c0e58;
        goto code_r0x00192010;
      }
      uStack0000000000000028 = lVar5;
      iVar3 = _CFEqual(lVar6,lVar5);
      func_0x0019e6a4(&uStack0000000000000028);
      func_0x0019e6a4(&uStack0000000000000020);
      if (iVar3 != 0) goto code_r0x00191e04;
      if (uStack0000000000000010 != 0) {
        func_0x0019fb28(&uStack0000000000000018);
      }
      func_0x0019fb28(&uStack0000000000000008);
      func_0x0019fb28();
    } while( true );
  }
  uVar8 = (ulong)(uVar1 * 0x100 + 0x100);
  goto code_r0x00191f14;
code_r0x00191e04:
  if (uStack0000000000000010 != 0) {
    func_0x0019fb28(&uStack0000000000000018);
  }
code_r0x00191e14:
  func_0x0019fb28(&uStack0000000000000008);
  func_0x0019fb28();
  lVar5 = _CFStringCreateWithBytesNoCopy(*unaff_x26,&UNK_0081af4e,0x17,0x8000100,0,*unaff_x23);
  if (lVar5 == 0) {
code_r0x00191f54:
    func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0e70);
  }
  else {
    uStack0000000000000010 = 0;
    uStack0000000000000020 = lVar5;
    iVar3 = _CFDictionaryGetValueIfPresent(lVar4,lVar5,&uStack0000000000000010);
    if (iVar3 == 0) {
      func_0x0019fb28(&uStack0000000000000020);
      goto code_r0x00191f10;
    }
    if ((uStack0000000000000010 != 0) && (lVar4 = _CFRetain(), lVar4 != 0)) {
      uStack0000000000000010 = 0;
      uStack0000000000000028 = lVar4;
      uVar8 = _CFNumberGetValue(lVar4,4,&uStack0000000000000010);
      unaff_x25 = uStack0000000000000010;
      if ((uVar8 & 1) == 0) {
        func_0x0019fb28(&uStack0000000000000028);
        func_0x0019fb28(&uStack0000000000000020);
code_r0x00191f10:
        uVar8 = 0x100;
code_r0x00191f14:
        _CFRelease();
code_r0x00191f20:
        return uVar8 | unaff_x20 << 0x20;
      }
      func_0x0019fb28(&uStack0000000000000028);
      param_1 = &uStack0000000000000020;
      goto code_r0x00191ea0;
    }
    func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0ea0);
  }
code_r0x00192020:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x192024);
  (*pcVar2)();
}

