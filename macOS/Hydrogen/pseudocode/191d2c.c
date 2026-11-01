
ulong FUN_00191d2c(long param_1)

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
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  
  do {
    lVar4 = _CFStringCreateWithBytesNoCopy(*unaff_x26,&UNK_0081af2a,0x1b,0x8000100,0,*unaff_x23);
    if (lVar4 == 0) {
LAB_00191f54:
      func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0e70);
      goto code_r0x00192020;
    }
    lVar5 = _CFStringCreateWithBytesNoCopy(*unaff_x26);
    if (lVar5 == 0) {
      func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0e70);
      goto code_r0x00192020;
    }
    uStack0000000000000028 = 0;
    uStack0000000000000008 = lVar5;
    iVar3 = _CFDictionaryGetValueIfPresent(param_1,lVar4,&uStack0000000000000028);
    if (iVar3 == 0) {
LAB_00191e14:
      func_0x0019fb28(&uStack0000000000000008);
      func_0x0019fb28();
      lVar4 = _CFStringCreateWithBytesNoCopy(*unaff_x26,&UNK_0081af4e,0x17,0x8000100,0,*unaff_x23);
      if (lVar4 == 0) goto LAB_00191f54;
      uStack0000000000000010 = 0;
      uStack0000000000000020 = lVar4;
      iVar3 = _CFDictionaryGetValueIfPresent(param_1,lVar4,&uStack0000000000000010);
      if (iVar3 == 0) {
        func_0x0019fb28(&uStack0000000000000020);
code_r0x00191f10:
        uVar8 = 0x100;
      }
      else {
        if ((uStack0000000000000010 == 0) || (lVar4 = _CFRetain(), lVar4 == 0)) {
          func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0ea0);
          goto code_r0x00192020;
        }
        uStack0000000000000010 = 0;
        uStack0000000000000028 = lVar4;
        uVar6 = _CFNumberGetValue(lVar4,4,&uStack0000000000000010);
        uVar8 = uStack0000000000000010;
        if ((uVar6 & 1) == 0) {
          func_0x0019fb28(&uStack0000000000000028);
          func_0x0019fb28(&uStack0000000000000020);
          goto code_r0x00191f10;
        }
        func_0x0019fb28(&uStack0000000000000028);
        func_0x0019fb28(&uStack0000000000000020);
        if ((uVar8 >> 0x20 != 0) || (uVar1 = (int)uVar8 - 1, 2 < uVar1)) goto code_r0x00191d10;
        uVar8 = (ulong)(uVar1 * 0x100 + 0x100);
      }
      _CFRelease();
code_r0x00191f20:
      return uVar8 | unaff_x20 << 0x20;
    }
    if ((uStack0000000000000028 == 0) ||
       (lVar5 = _CFRetain(), lVar4 = uStack0000000000000008, lVar5 == 0)) {
      func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0e70);
      goto code_r0x00192020;
    }
    uStack0000000000000010 = 1;
    uStack0000000000000018 = lVar5;
    lVar5 = _CFRetain();
    if (lVar5 == 0) {
      func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0e58);
      goto code_r0x00192020;
    }
    uStack0000000000000020 = lVar5;
    if (lVar4 == 0) {
      puVar7 = &UNK_009c0e40;
code_r0x00192010:
      func_0x007a11c0(&UNK_0081a9b0,0x22,puVar7);
      goto code_r0x00192020;
    }
    lVar4 = _CFRetain(lVar4);
    if (lVar4 == 0) {
      puVar7 = &UNK_009c0e58;
      goto code_r0x00192010;
    }
    uStack0000000000000028 = lVar4;
    iVar3 = _CFEqual(lVar5,lVar4);
    func_0x0019e6a4(&uStack0000000000000028);
    func_0x0019e6a4(&uStack0000000000000020);
    if (iVar3 != 0) {
      if (uStack0000000000000010 != 0) {
        func_0x0019fb28(&uStack0000000000000018);
      }
      goto LAB_00191e14;
    }
    if (uStack0000000000000010 != 0) {
      func_0x0019fb28(&uStack0000000000000018);
    }
    func_0x0019fb28(&uStack0000000000000008);
    func_0x0019fb28();
code_r0x00191d10:
    unaff_x22 = unaff_x22 + 1;
    if (unaff_x21 == unaff_x22) {
      _CFRelease();
      uVar8 = 0x500;
      goto code_r0x00191f20;
    }
    param_1 = _CFArrayGetValueAtIndex();
    if (param_1 == 0) {
      func_0x007a11c0(&UNK_0081a021,0x22,&UNK_009c0778);
code_r0x00192020:
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x192024);
      (*pcVar2)();
    }
  } while( true );
}

