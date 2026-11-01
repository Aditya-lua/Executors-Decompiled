
long FUN_0073cea0(long param_1,long param_2,undefined8 param_3)

{
  bool bVar1;
  ulong uVar2;
  uint uVar3;
  char *pcVar4;
  char cVar5;
  int iVar6;
  int iVar7;
  long lVar8;
  long lVar9;
  char *pcVar10;
  uint uVar11;
  long unaff_x29;
  undefined1 auVar12 [16];
  undefined8 uStack0000000000000000;
  long in_stack_00000008;
  undefined1 uStack0000000000000013;
  undefined1 auStack_21e8 [8];
  undefined2 uStack_216d;
  long lStack_1968;
  undefined8 uStack_1920;
  undefined8 *puStack_1918;
  undefined2 uStack_190d;
  long lStack_1108;
  undefined8 uStack_10c0;
  undefined8 *puStack_10b8;
  undefined2 uStack_10ad;
  long lStack_8a8;
  undefined8 uStack_860;
  undefined2 uStack_84d;
  long lStack_48;
  
  *(undefined8 *)(unaff_x29 + -0x38) = **(undefined8 **)(param_1 + 0x1e8);
  if ((param_2 != 0) && (*(char *)(param_2 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 param_2 + 0x18) == 0) {
      if (0 < (int)uRam0000000000a2b560) goto LAB_0073cef4;
    }
    else {
      bVar1 = *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + param_2 + 0x18) + 8) < 1;
      if ((!bVar1 && uRam0000000000a2b560 != 0) && (bVar1 || -1 < (int)uRam0000000000a2b560)) {
LAB_0073cef4:
        in_stack_00000008 = unaff_x29 + 0x10;
        uStack0000000000000000 = uRam0000000000a2b558;
        iVar7 = func_0x00764560(&uStack0000000000000013,0x801,"[%s] ");
        iVar6 = func_0x00762a38(auStack_21e8 + (long)(&UNK_000021fb + iVar7),(long)(0x801 - iVar7),
                                param_3,unaff_x29 + 0x10);
        uVar3 = iVar6 + iVar7;
        uVar11 = uVar3;
        if (0x7ff < (int)uVar3) {
          auStack_21e8[(long)(&UNK_000021fb + (uVar3 - 1))] = 0x2e;
          auStack_21e8[(long)(&UNK_000021fb + uVar3)] = 0x2e;
          uVar11 = uVar3 + 2;
          auStack_21e8[(long)(&UNK_000021fc + uVar3)] = 0x2e;
        }
        *(undefined2 *)(auStack_21e8 + (long)(&UNK_000021fb + (int)uVar11)) = 10;
        param_2 = func_0x0073c8fc(param_2,0,&uStack0000000000000013,(long)(int)uVar11 + 1);
      }
    }
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return param_2;
  }
  auVar12 = ___stack_chk_fail();
  lVar9 = auVar12._0_8_;
  lStack_48 = *(long *)PTR____stack_chk_guard_009b01e8;
  if ((lVar9 != 0) && (*(char *)(lVar9 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 lVar9 + 0x18) == 0) {
      if (0 < (int)uRam0000000000a2b570) goto LAB_0073d02c;
    }
    else {
      bVar1 = *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + lVar9 + 0x18) + 8) < 1;
      if ((!bVar1 && uRam0000000000a2b570 != 0) && (bVar1 || -1 < (int)uRam0000000000a2b570)) {
LAB_0073d02c:
        uStack_860 = uRam0000000000a2b568;
        iVar7 = func_0x00764560(&uStack_84d,0x801,"[%s] ");
        iVar6 = func_0x00762a38((long)&uStack_84d + (long)iVar7,(long)(0x801 - iVar7),auVar12._8_8_,
                                &uStack0000000000000000);
        uVar11 = iVar6 + iVar7;
        if (0x7ff < (int)uVar11) {
          *(undefined1 *)((long)&uStack_84d + (ulong)(uVar11 - 1)) = 0x2e;
          uVar2 = (ulong)uVar11;
          *(undefined1 *)((long)&uStack_84d + uVar2) = 0x2e;
          uVar11 = uVar11 + 2;
          *(undefined1 *)((long)&uStack_84d + uVar2 + 1) = 0x2e;
        }
        *(undefined2 *)((long)&uStack_84d + (long)(int)uVar11) = 10;
        lVar9 = func_0x0073c8fc(lVar9,0,&uStack_84d,(long)(int)uVar11 + 1);
      }
    }
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_48) {
    return lVar9;
  }
  auVar12 = ___stack_chk_fail();
  lVar9 = auVar12._0_8_;
  lStack_8a8 = *(long *)PTR____stack_chk_guard_009b01e8;
  if ((lVar9 != 0) && (*(char *)(lVar9 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 lVar9 + 0x18) == 0) {
      if (0 < (int)uRam0000000000a2b580) goto LAB_0073d164;
    }
    else {
      bVar1 = *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + lVar9 + 0x18) + 8) < 1;
      if ((!bVar1 && uRam0000000000a2b580 != 0) && (bVar1 || -1 < (int)uRam0000000000a2b580)) {
LAB_0073d164:
        puStack_10b8 = &uStack_860;
        uStack_10c0 = uRam0000000000a2b578;
        iVar7 = func_0x00764560(&uStack_10ad,0x801,"[%s] ");
        iVar6 = func_0x00762a38((long)&uStack_10ad + (long)iVar7,(long)(0x801 - iVar7),auVar12._8_8_
                                ,&uStack_860);
        uVar11 = iVar6 + iVar7;
        if (0x7ff < (int)uVar11) {
          *(undefined1 *)((long)&uStack_10ad + (ulong)(uVar11 - 1)) = 0x2e;
          uVar2 = (ulong)uVar11;
          *(undefined1 *)((long)&uStack_10ad + uVar2) = 0x2e;
          uVar11 = uVar11 + 2;
          *(undefined1 *)((long)&uStack_10ad + uVar2 + 1) = 0x2e;
        }
        *(undefined2 *)((long)&uStack_10ad + (long)(int)uVar11) = 10;
        lVar9 = func_0x0073c8fc(lVar9,0,&uStack_10ad,(long)(int)uVar11 + 1);
      }
    }
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_8a8) {
    return lVar9;
  }
  auVar12 = ___stack_chk_fail();
  lVar9 = auVar12._0_8_;
  lStack_1108 = *(long *)PTR____stack_chk_guard_009b01e8;
  if ((lVar9 != 0) && (*(char *)(lVar9 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 lVar9 + 0x18) == 0) {
      if (0 < (int)uRam0000000000a2b590) goto code_r0x0073d29c;
    }
    else {
      bVar1 = *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + lVar9 + 0x18) + 8) < 1;
      if ((!bVar1 && uRam0000000000a2b590 != 0) && (bVar1 || -1 < (int)uRam0000000000a2b590)) {
code_r0x0073d29c:
        puStack_1918 = &uStack_10c0;
        uStack_1920 = uRam0000000000a2b588;
        iVar7 = func_0x00764560(&uStack_190d,0x801,"[%s] ");
        iVar6 = func_0x00762a38((long)&uStack_190d + (long)iVar7,(long)(0x801 - iVar7),auVar12._8_8_
                                ,&uStack_10c0);
        uVar11 = iVar6 + iVar7;
        if (0x7ff < (int)uVar11) {
          *(undefined1 *)((long)&uStack_190d + (ulong)(uVar11 - 1)) = 0x2e;
          uVar2 = (ulong)uVar11;
          *(undefined1 *)((long)&uStack_190d + uVar2) = 0x2e;
          uVar11 = uVar11 + 2;
          *(undefined1 *)((long)&uStack_190d + uVar2 + 1) = 0x2e;
        }
        *(undefined2 *)((long)&uStack_190d + (long)(int)uVar11) = 10;
        lVar9 = func_0x0073c8fc(lVar9,0,&uStack_190d,(long)(int)uVar11 + 1);
      }
    }
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_1108) {
    return lVar9;
  }
  auVar12 = ___stack_chk_fail();
  lVar9 = auVar12._0_8_;
  lStack_1968 = *(long *)PTR____stack_chk_guard_009b01e8;
  if ((lVar9 != 0) && (*(char *)(lVar9 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 lVar9 + 0x18) == 0) {
      if ((int)uRam0000000000a2b5a0 < 1) goto code_r0x0073d468;
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + lVar9 + 0x18) + 8) < 1 || (int)uRam0000000000a2b5a0 < 1)
    goto code_r0x0073d468;
    iVar7 = func_0x00764560(&uStack_216d,0x801,"[%s] ");
    iVar6 = func_0x00762a38((long)&uStack_216d + (long)iVar7,(long)(0x801 - iVar7),auVar12._8_8_,
                            &uStack_1920);
    uVar11 = iVar6 + iVar7;
    if (0x7ff < (int)uVar11) {
      *(undefined1 *)((long)&uStack_216d + (ulong)(uVar11 - 1)) = 0x2e;
      uVar2 = (ulong)uVar11;
      *(undefined1 *)((long)&uStack_216d + uVar2) = 0x2e;
      uVar11 = uVar11 + 2;
      *(undefined1 *)((long)&uStack_216d + uVar2 + 1) = 0x2e;
    }
    *(undefined2 *)((long)&uStack_216d + (long)(int)uVar11) = 10;
    lVar9 = func_0x0073c8fc(lVar9,0,&uStack_216d,(long)(int)uVar11 + 1);
  }
code_r0x0073d468:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_1968) {
    return lVar9;
  }
  lVar8 = ___stack_chk_fail();
  lVar9 = 0;
  if (lVar8 != 0) {
    lVar9 = (*pcRam0000000000a2b600)();
    if (lVar9 == 0) {
      lVar9 = 0x1b;
    }
    else {
      pcVar10 = (char *)_strtok_r(lVar9,", ",auStack_21e8);
      while (pcVar10 != (char *)0x0) {
        cVar5 = *pcVar10;
        pcVar4 = pcVar10;
        if (cVar5 == '-') {
          pcVar4 = pcVar10 + 1;
        }
        uVar11 = 1;
        if (cVar5 == '+') {
          pcVar4 = pcVar10 + 1;
        }
        else {
          uVar11 = (uint)(cVar5 != '-');
        }
        iVar7 = func_0x0077e6f8(pcVar4,"all");
        if (iVar7 == 0) {
          iVar7 = func_0x0077e6f8(pcVar4,"protocol");
          if (iVar7 != 0) {
            goto code_r0x0073d5d8;
          }
          iVar7 = func_0x0077e6f8(pcVar4,"network");
          if (iVar7 == 0) {
            iVar7 = func_0x0077e6f8(pcVar4,"proxy");
            if (iVar7 == 0) {
              iVar7 = func_0x0077e6f8(pcVar4,uRam0000000000a2b278);
              lVar8 = 0xa2b278;
              if (iVar7 == 0) {
                iVar7 = func_0x0077e6f8(pcVar4,uRam0000000000a2b2f0);
                lVar8 = 0xa2b2f0;
                if (iVar7 != 0) goto code_r0x0073d894;
                iVar7 = func_0x0077e6f8(pcVar4,uRam0000000000a2b368);
                lVar8 = 0xa2b368;
                if (iVar7 != 0) goto code_r0x0073d894;
                iVar7 = func_0x0077e6f8(pcVar4,uRam0000000000a2b3e0);
                lVar8 = 0xa2b3e0;
                if (iVar7 != 0) goto code_r0x0073d894;
                iVar7 = func_0x0077e6f8(pcVar4,uRam0000000000a2b458);
                lVar8 = 0xa2b458;
                if (iVar7 != 0) goto code_r0x0073d894;
                iVar7 = func_0x0077e6f8(pcVar4,uRam0000000000a2b4d0);
                lVar8 = 0xa2b4d0;
                if (iVar7 != 0) goto code_r0x0073d894;
                iVar7 = func_0x0077e6f8(pcVar4,uRam0000000000a2b7f0);
                lVar8 = 0xa2b7f0;
                if (iVar7 != 0) goto code_r0x0073d894;
                iVar7 = func_0x0077e6f8(pcVar4,uRam0000000000a2b868);
                lVar8 = 0xa2b868;
                if (iVar7 != 0) goto code_r0x0073d894;
                iVar7 = func_0x0077e6f8(pcVar4,uRam0000000000a2b110);
                lVar8 = 0xa2b110;
                if (iVar7 != 0) goto code_r0x0073d894;
                iVar7 = func_0x0077e6f8(pcVar4,uRam0000000000a2b610);
                lVar8 = 0xa2b610;
                if (iVar7 != 0) goto code_r0x0073d894;
                iVar7 = func_0x0077e6f8(pcVar4,uRam0000000000a2b188);
                lVar8 = 0xa2b188;
                if (iVar7 != 0) goto code_r0x0073d894;
                iVar7 = func_0x0077e6f8(pcVar4,uRam0000000000a2b688);
                lVar8 = 0xa2b688;
                if (iVar7 != 0) goto code_r0x0073d894;
                iVar7 = func_0x0077e6f8(pcVar4,uRam0000000000a2b200);
                lVar8 = 0xa2b200;
                if (iVar7 != 0) goto code_r0x0073d894;
              }
              else {
code_r0x0073d894:
                *(uint *)(lVar8 + 0xc) = uVar11;
              }
              iVar7 = func_0x0077e6f8(pcVar4,uRam0000000000a2b548);
              lVar8 = 0xa2b548;
              if (iVar7 == 0) {
                iVar7 = func_0x0077e6f8(pcVar4,uRam0000000000a2b558);
                lVar8 = 0xa2b558;
                if (iVar7 == 0) {
                  iVar7 = func_0x0077e6f8(pcVar4,uRam0000000000a2b568);
                  lVar8 = 0xa2b568;
                  if (iVar7 == 0) {
                    iVar7 = func_0x0077e6f8(pcVar4,uRam0000000000a2b5d8);
                    lVar8 = 0xa2b5d8;
                    if (iVar7 == 0) {
                      iVar7 = func_0x0077e6f8(pcVar4,uRam0000000000a2b578);
                      lVar8 = 0xa2b578;
                      if (iVar7 == 0) {
                        iVar7 = func_0x0077e6f8(pcVar4,uRam0000000000a2b588);
                        lVar8 = 0xa2b588;
                        if (iVar7 == 0) {
                          iVar7 = func_0x0077e6f8(pcVar4,uRam0000000000a2b598);
                          lVar8 = 0xa2b598;
                          if (iVar7 == 0) goto code_r0x0073d5dc;
                        }
                      }
                    }
                  }
                }
              }
              *(uint *)(lVar8 + 8) = uVar11;
            }
            else {
              uRam0000000000a2b11c = uVar11;
              uRam0000000000a2b194 = uVar11;
              uRam0000000000a2b61c = uVar11;
              uRam0000000000a2b694 = uVar11;
              uRam0000000000a2b874 = uVar11;
            }
          }
          else {
            uRam0000000000a2b284 = uVar11;
            uRam0000000000a2b2fc = uVar11;
            uRam0000000000a2b374 = uVar11;
            uRam0000000000a2b3ec = uVar11;
            uRam0000000000a2b464 = uVar11;
            uRam0000000000a2b590 = uVar11;
            uRam0000000000a2b5e0 = uVar11;
            uRam0000000000a2b7fc = uVar11;
          }
        }
        else {
          uRam0000000000a2b11c = uVar11;
          uRam0000000000a2b194 = uVar11;
          uRam0000000000a2b284 = uVar11;
          uRam0000000000a2b2fc = uVar11;
          uRam0000000000a2b374 = uVar11;
          uRam0000000000a2b3ec = uVar11;
          uRam0000000000a2b464 = uVar11;
          uRam0000000000a2b550 = uVar11;
          uRam0000000000a2b560 = uVar11;
          uRam0000000000a2b590 = uVar11;
          uRam0000000000a2b5e0 = uVar11;
          uRam0000000000a2b61c = uVar11;
          uRam0000000000a2b694 = uVar11;
          uRam0000000000a2b7fc = uVar11;
          uRam0000000000a2b874 = uVar11;
code_r0x0073d5d8:
          uRam0000000000a2b20c = uVar11;
          uRam0000000000a2b4dc = uVar11;
          uRam0000000000a2b570 = uVar11;
          uRam0000000000a2b580 = uVar11;
          uRam0000000000a2b5a0 = uVar11;
        }
code_r0x0073d5dc:
        pcVar10 = (char *)_strtok_r(0,", ",auStack_21e8);
      }
      (*pcRam0000000000a2b5f0)(lVar9);
      lVar9 = 0;
    }
  }
  return lVar9;
}

