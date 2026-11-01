
ulong FUN_00191cb4(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  uint uVar1;
  undefined *puVar2;
  code *pcVar3;
  uint uVar4;
  int iVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  ulong uVar10;
  undefined8 uVar11;
  undefined *puVar12;
  ulong uVar13;
  ulong uVar14;
  long lVar15;
  undefined1 auVar16 [16];
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined *puStack_50;
  undefined8 uStack_48;
  undefined **ppuStack_40;
  undefined8 uStack_38;
  undefined *puStack_30;
  undefined8 uStack_28;
  undefined *puStack_20;
  undefined *puStack_18;
  
  uVar4 = _SecTrustSettingsCopyTrustSettings(param_1,param_3,&uStack0000000000000010);
  uVar13 = uStack0000000000000010;
  if (uVar4 == 0) {
    if (uStack0000000000000010 == 0) {
      uVar11 = func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c11d0);
      func_0x0019fb28(&uStack0000000000000008);
      func_0x0019fb28();
      _CFRelease(0);
      __Unwind_Resume(uVar11);
      auVar16 = func_0x007a2668();
      if (*auVar16._0_8_ == 0) {
        puStack_20 = &UNK_0081a9a8;
        puStack_18 = &
                     __ZN4core3fmt3num53__LT_impl_u20_core__fmt__LowerHex_u20_for_u20_i32_GT_3fmt17h8658f8c6e64504abE
        ;
        puStack_50 = &UNK_007fc120;
        uStack_48 = 1;
        puStack_30 = &UNK_0081af68;
        uStack_28 = 1;
        ppuStack_40 = &puStack_20;
        uStack_38 = 1;
        uVar13 = func_0x0046849c(*auVar16._8_8_,auVar16._8_8_[1],&puStack_50);
      }
      else {
        puStack_50 = (undefined *)CONCAT44(puStack_50._4_4_,*auVar16._0_8_);
        uVar13 = func_0x0019a6f0(&puStack_50);
      }
      return uVar13;
    }
    lVar6 = _CFArrayGetCount(uStack0000000000000010);
    puVar2 = PTR__kCFAllocatorNull_009b0240;
    puVar12 = PTR__kCFAllocatorDefault_009b0238;
    if (0 < lVar6) {
      lVar15 = 0;
      do {
        lVar7 = _CFArrayGetValueAtIndex(uVar13,lVar15);
        if (lVar7 == 0) {
          func_0x007a11c0(&UNK_0081a021,0x22,&UNK_009c0778);
          goto code_r0x00192020;
        }
        lVar8 = _CFStringCreateWithBytesNoCopy
                          (*(undefined8 *)puVar12,&UNK_0081af2a,0x1b,0x8000100,0,
                           *(undefined8 *)puVar2);
        if (lVar8 == 0) {
code_r0x00191f54:
          func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0e70);
          goto code_r0x00192020;
        }
        lVar9 = _CFStringCreateWithBytesNoCopy
                          (*(undefined8 *)puVar12,&UNK_0081af45,9,0x8000100,0,*(undefined8 *)puVar2)
        ;
        if (lVar9 == 0) {
          func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0e70);
          goto code_r0x00192020;
        }
        uStack0000000000000028 = 0;
        uStack0000000000000008 = lVar9;
        iVar5 = _CFDictionaryGetValueIfPresent(lVar7,lVar8,&uStack0000000000000028);
        if (iVar5 == 0) {
code_r0x00191e14:
          func_0x0019fb28(&uStack0000000000000008);
          func_0x0019fb28();
          lVar8 = _CFStringCreateWithBytesNoCopy
                            (*(undefined8 *)puVar12,&UNK_0081af4e,0x17,0x8000100,0,
                             *(undefined8 *)puVar2);
          if (lVar8 == 0) goto code_r0x00191f54;
          uStack0000000000000010 = 0;
          uStack0000000000000020 = lVar8;
          iVar5 = _CFDictionaryGetValueIfPresent(lVar7,lVar8,&uStack0000000000000010);
          if (iVar5 == 0) {
            func_0x0019fb28(&uStack0000000000000020);
code_r0x00191f10:
            uVar14 = 0x100;
          }
          else {
            if ((uStack0000000000000010 == 0) || (lVar7 = _CFRetain(), lVar7 == 0)) {
              func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0ea0);
              goto code_r0x00192020;
            }
            uStack0000000000000010 = 0;
            uStack0000000000000028 = lVar7;
            uVar10 = _CFNumberGetValue(lVar7,4,&uStack0000000000000010);
            uVar14 = uStack0000000000000010;
            if ((uVar10 & 1) == 0) {
              func_0x0019fb28(&uStack0000000000000028);
              func_0x0019fb28(&uStack0000000000000020);
              goto code_r0x00191f10;
            }
            func_0x0019fb28(&uStack0000000000000028);
            func_0x0019fb28(&uStack0000000000000020);
            if ((uVar14 >> 0x20 != 0) || (uVar1 = (int)uVar14 - 1, 2 < uVar1))
            goto code_r0x00191d10;
            uVar14 = (ulong)(uVar1 * 0x100 + 0x100);
          }
          _CFRelease(uVar13);
          uVar13 = 0;
          goto LAB_00191f20;
        }
        if ((uStack0000000000000028 == 0) ||
           (lVar9 = _CFRetain(), lVar8 = uStack0000000000000008, lVar9 == 0)) {
          func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0e70);
          goto code_r0x00192020;
        }
        uStack0000000000000010 = 1;
        uStack0000000000000018 = lVar9;
        lVar9 = _CFRetain();
        if (lVar9 == 0) {
          func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0e58);
          goto code_r0x00192020;
        }
        uStack0000000000000020 = lVar9;
        if (lVar8 == 0) {
          puVar12 = &UNK_009c0e40;
code_r0x00192010:
          func_0x007a11c0(&UNK_0081a9b0,0x22,puVar12);
code_r0x00192020:
                    /* WARNING: Does not return */
          pcVar3 = (code *)SoftwareBreakpoint(1,0x192024);
          (*pcVar3)();
        }
        lVar8 = _CFRetain(lVar8);
        if (lVar8 == 0) {
          puVar12 = &UNK_009c0e58;
          goto code_r0x00192010;
        }
        uStack0000000000000028 = lVar8;
        iVar5 = _CFEqual(lVar9,lVar8);
        func_0x0019e6a4(&uStack0000000000000028);
        func_0x0019e6a4(&uStack0000000000000020);
        if (iVar5 != 0) {
          if (uStack0000000000000010 != 0) {
            func_0x0019fb28(&uStack0000000000000018);
          }
          goto code_r0x00191e14;
        }
        if (uStack0000000000000010 != 0) {
          func_0x0019fb28(&uStack0000000000000018);
        }
        func_0x0019fb28(&uStack0000000000000008);
        func_0x0019fb28();
code_r0x00191d10:
        lVar15 = lVar15 + 1;
      } while (lVar6 != lVar15);
    }
    _CFRelease(uVar13);
    uVar13 = 0;
    uVar14 = 0x500;
  }
  else {
    uVar14 = 0;
    uVar13 = 1;
  }
LAB_00191f20:
  return uVar14 | (ulong)uVar4 << 0x20 | uVar13;
}

