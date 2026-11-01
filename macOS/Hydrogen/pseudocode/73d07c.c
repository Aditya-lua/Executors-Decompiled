
long FUN_0073d07c(void)

{
  bool bVar1;
  ulong uVar2;
  char *pcVar3;
  char cVar4;
  int iVar5;
  int iVar6;
  long lVar7;
  long lVar8;
  char *pcVar9;
  uint in_w8;
  long unaff_x22;
  uint uVar10;
  long unaff_x29;
  undefined1 auVar11 [16];
  undefined1 uStack0000000000000000;
  undefined1 auStack_1988 [8];
  undefined2 uStack_190d;
  long lStack_1108;
  undefined8 uStack_10c0;
  undefined8 *puStack_10b8;
  undefined2 uStack_10ad;
  long lStack_8a8;
  undefined8 uStack_860;
  undefined2 uStack_84d;
  long lStack_48;
  
  if (0x7ff < (int)in_w8) {
    *(undefined1 *)(unaff_x22 + (ulong)(in_w8 - 1)) = 0x2e;
    uVar2 = (ulong)in_w8;
    *(undefined1 *)(unaff_x22 + uVar2) = 0x2e;
    in_w8 = in_w8 + 2;
    ((undefined1 *)(unaff_x22 + uVar2))[1] = 0x2e;
  }
  *(undefined2 *)(unaff_x22 + (int)in_w8) = 10;
  lVar7 = func_0x0073c8fc();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return lVar7;
  }
  auVar11 = ___stack_chk_fail();
  lVar7 = auVar11._0_8_;
  lStack_48 = *(long *)PTR____stack_chk_guard_009b01e8;
  if ((lVar7 != 0) && (*(char *)(lVar7 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 lVar7 + 0x18) == 0) {
      if (0 < (int)uRam0000000000a2b580) goto LAB_0073d164;
    }
    else {
      bVar1 = *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + lVar7 + 0x18) + 8) < 1;
      if ((!bVar1 && uRam0000000000a2b580 != 0) && (bVar1 || -1 < (int)uRam0000000000a2b580)) {
LAB_0073d164:
        uStack_860 = uRam0000000000a2b578;
        iVar6 = func_0x00764560(&uStack_84d,0x801,"[%s] ");
        iVar5 = func_0x00762a38((long)&uStack_84d + (long)iVar6,(long)(0x801 - iVar6),auVar11._8_8_,
                                &uStack0000000000000000);
        uVar10 = iVar5 + iVar6;
        if (0x7ff < (int)uVar10) {
          *(undefined1 *)((long)&uStack_84d + (ulong)(uVar10 - 1)) = 0x2e;
          uVar2 = (ulong)uVar10;
          *(undefined1 *)((long)&uStack_84d + uVar2) = 0x2e;
          uVar10 = uVar10 + 2;
          *(undefined1 *)((long)&uStack_84d + uVar2 + 1) = 0x2e;
        }
        *(undefined2 *)((long)&uStack_84d + (long)(int)uVar10) = 10;
        lVar7 = func_0x0073c8fc(lVar7,0,&uStack_84d,(long)(int)uVar10 + 1);
      }
    }
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_48) {
    return lVar7;
  }
  auVar11 = ___stack_chk_fail();
  lVar7 = auVar11._0_8_;
  lStack_8a8 = *(long *)PTR____stack_chk_guard_009b01e8;
  if ((lVar7 != 0) && (*(char *)(lVar7 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 lVar7 + 0x18) == 0) {
      if (0 < (int)uRam0000000000a2b590) goto code_r0x0073d29c;
    }
    else {
      bVar1 = *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + lVar7 + 0x18) + 8) < 1;
      if ((!bVar1 && uRam0000000000a2b590 != 0) && (bVar1 || -1 < (int)uRam0000000000a2b590)) {
code_r0x0073d29c:
        puStack_10b8 = &uStack_860;
        uStack_10c0 = uRam0000000000a2b588;
        iVar6 = func_0x00764560(&uStack_10ad,0x801,"[%s] ");
        iVar5 = func_0x00762a38((long)&uStack_10ad + (long)iVar6,(long)(0x801 - iVar6),auVar11._8_8_
                                ,&uStack_860);
        uVar10 = iVar5 + iVar6;
        if (0x7ff < (int)uVar10) {
          *(undefined1 *)((long)&uStack_10ad + (ulong)(uVar10 - 1)) = 0x2e;
          uVar2 = (ulong)uVar10;
          *(undefined1 *)((long)&uStack_10ad + uVar2) = 0x2e;
          uVar10 = uVar10 + 2;
          *(undefined1 *)((long)&uStack_10ad + uVar2 + 1) = 0x2e;
        }
        *(undefined2 *)((long)&uStack_10ad + (long)(int)uVar10) = 10;
        lVar7 = func_0x0073c8fc(lVar7,0,&uStack_10ad,(long)(int)uVar10 + 1);
      }
    }
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_8a8) {
    return lVar7;
  }
  auVar11 = ___stack_chk_fail();
  lVar7 = auVar11._0_8_;
  lStack_1108 = *(long *)PTR____stack_chk_guard_009b01e8;
  if ((lVar7 != 0) && (*(char *)(lVar7 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 lVar7 + 0x18) == 0) {
      if ((int)uRam0000000000a2b5a0 < 1) goto code_r0x0073d468;
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + lVar7 + 0x18) + 8) < 1 || (int)uRam0000000000a2b5a0 < 1)
    goto code_r0x0073d468;
    iVar6 = func_0x00764560(&uStack_190d,0x801,"[%s] ");
    iVar5 = func_0x00762a38((long)&uStack_190d + (long)iVar6,(long)(0x801 - iVar6),auVar11._8_8_,
                            &uStack_10c0);
    uVar10 = iVar5 + iVar6;
    if (0x7ff < (int)uVar10) {
      *(undefined1 *)((long)&uStack_190d + (ulong)(uVar10 - 1)) = 0x2e;
      uVar2 = (ulong)uVar10;
      *(undefined1 *)((long)&uStack_190d + uVar2) = 0x2e;
      uVar10 = uVar10 + 2;
      *(undefined1 *)((long)&uStack_190d + uVar2 + 1) = 0x2e;
    }
    *(undefined2 *)((long)&uStack_190d + (long)(int)uVar10) = 10;
    lVar7 = func_0x0073c8fc(lVar7,0,&uStack_190d,(long)(int)uVar10 + 1);
  }
code_r0x0073d468:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_1108) {
    return lVar7;
  }
  lVar8 = ___stack_chk_fail();
  lVar7 = 0;
  if (lVar8 != 0) {
    lVar7 = (*pcRam0000000000a2b600)();
    if (lVar7 == 0) {
      lVar7 = 0x1b;
    }
    else {
      pcVar9 = (char *)_strtok_r(lVar7,", ",auStack_1988);
      while (pcVar9 != (char *)0x0) {
        cVar4 = *pcVar9;
        pcVar3 = pcVar9;
        if (cVar4 == '-') {
          pcVar3 = pcVar9 + 1;
        }
        uVar10 = 1;
        if (cVar4 == '+') {
          pcVar3 = pcVar9 + 1;
        }
        else {
          uVar10 = (uint)(cVar4 != '-');
        }
        iVar6 = func_0x0077e6f8(pcVar3,"all");
        if (iVar6 == 0) {
          iVar6 = func_0x0077e6f8(pcVar3,"protocol");
          if (iVar6 != 0) {
            goto code_r0x0073d5d8;
          }
          iVar6 = func_0x0077e6f8(pcVar3,"network");
          if (iVar6 == 0) {
            iVar6 = func_0x0077e6f8(pcVar3,"proxy");
            if (iVar6 == 0) {
              iVar6 = func_0x0077e6f8(pcVar3,uRam0000000000a2b278);
              lVar8 = 0xa2b278;
              if (iVar6 == 0) {
                iVar6 = func_0x0077e6f8(pcVar3,uRam0000000000a2b2f0);
                lVar8 = 0xa2b2f0;
                if (iVar6 != 0) goto code_r0x0073d894;
                iVar6 = func_0x0077e6f8(pcVar3,uRam0000000000a2b368);
                lVar8 = 0xa2b368;
                if (iVar6 != 0) goto code_r0x0073d894;
                iVar6 = func_0x0077e6f8(pcVar3,uRam0000000000a2b3e0);
                lVar8 = 0xa2b3e0;
                if (iVar6 != 0) goto code_r0x0073d894;
                iVar6 = func_0x0077e6f8(pcVar3,uRam0000000000a2b458);
                lVar8 = 0xa2b458;
                if (iVar6 != 0) goto code_r0x0073d894;
                iVar6 = func_0x0077e6f8(pcVar3,uRam0000000000a2b4d0);
                lVar8 = 0xa2b4d0;
                if (iVar6 != 0) goto code_r0x0073d894;
                iVar6 = func_0x0077e6f8(pcVar3,uRam0000000000a2b7f0);
                lVar8 = 0xa2b7f0;
                if (iVar6 != 0) goto code_r0x0073d894;
                iVar6 = func_0x0077e6f8(pcVar3,uRam0000000000a2b868);
                lVar8 = 0xa2b868;
                if (iVar6 != 0) goto code_r0x0073d894;
                iVar6 = func_0x0077e6f8(pcVar3,uRam0000000000a2b110);
                lVar8 = 0xa2b110;
                if (iVar6 != 0) goto code_r0x0073d894;
                iVar6 = func_0x0077e6f8(pcVar3,uRam0000000000a2b610);
                lVar8 = 0xa2b610;
                if (iVar6 != 0) goto code_r0x0073d894;
                iVar6 = func_0x0077e6f8(pcVar3,uRam0000000000a2b188);
                lVar8 = 0xa2b188;
                if (iVar6 != 0) goto code_r0x0073d894;
                iVar6 = func_0x0077e6f8(pcVar3,uRam0000000000a2b688);
                lVar8 = 0xa2b688;
                if (iVar6 != 0) goto code_r0x0073d894;
                iVar6 = func_0x0077e6f8(pcVar3,uRam0000000000a2b200);
                lVar8 = 0xa2b200;
                if (iVar6 != 0) goto code_r0x0073d894;
              }
              else {
code_r0x0073d894:
                *(uint *)(lVar8 + 0xc) = uVar10;
              }
              iVar6 = func_0x0077e6f8(pcVar3,uRam0000000000a2b548);
              lVar8 = 0xa2b548;
              if (iVar6 == 0) {
                iVar6 = func_0x0077e6f8(pcVar3,uRam0000000000a2b558);
                lVar8 = 0xa2b558;
                if (iVar6 == 0) {
                  iVar6 = func_0x0077e6f8(pcVar3,uRam0000000000a2b568);
                  lVar8 = 0xa2b568;
                  if (iVar6 == 0) {
                    iVar6 = func_0x0077e6f8(pcVar3,uRam0000000000a2b5d8);
                    lVar8 = 0xa2b5d8;
                    if (iVar6 == 0) {
                      iVar6 = func_0x0077e6f8(pcVar3,uRam0000000000a2b578);
                      lVar8 = 0xa2b578;
                      if (iVar6 == 0) {
                        iVar6 = func_0x0077e6f8(pcVar3,uRam0000000000a2b588);
                        lVar8 = 0xa2b588;
                        if (iVar6 == 0) {
                          iVar6 = func_0x0077e6f8(pcVar3,uRam0000000000a2b598);
                          lVar8 = 0xa2b598;
                          if (iVar6 == 0) goto code_r0x0073d5dc;
                        }
                      }
                    }
                  }
                }
              }
              *(uint *)(lVar8 + 8) = uVar10;
            }
            else {
              uRam0000000000a2b11c = uVar10;
              uRam0000000000a2b194 = uVar10;
              uRam0000000000a2b61c = uVar10;
              uRam0000000000a2b694 = uVar10;
              uRam0000000000a2b874 = uVar10;
            }
          }
          else {
            uRam0000000000a2b284 = uVar10;
            uRam0000000000a2b2fc = uVar10;
            uRam0000000000a2b374 = uVar10;
            uRam0000000000a2b3ec = uVar10;
            uRam0000000000a2b464 = uVar10;
            uRam0000000000a2b590 = uVar10;
            uRam0000000000a2b5e0 = uVar10;
            uRam0000000000a2b7fc = uVar10;
          }
        }
        else {
          uRam0000000000a2b11c = uVar10;
          uRam0000000000a2b194 = uVar10;
          uRam0000000000a2b284 = uVar10;
          uRam0000000000a2b2fc = uVar10;
          uRam0000000000a2b374 = uVar10;
          uRam0000000000a2b3ec = uVar10;
          uRam0000000000a2b464 = uVar10;
          uRam0000000000a2b550 = uVar10;
          uRam0000000000a2b560 = uVar10;
          uRam0000000000a2b590 = uVar10;
          uRam0000000000a2b5e0 = uVar10;
          uRam0000000000a2b61c = uVar10;
          uRam0000000000a2b694 = uVar10;
          uRam0000000000a2b7fc = uVar10;
          uRam0000000000a2b874 = uVar10;
code_r0x0073d5d8:
          uRam0000000000a2b20c = uVar10;
          uRam0000000000a2b4dc = uVar10;
          uRam0000000000a2b570 = uVar10;
          uRam0000000000a2b580 = uVar10;
          uRam0000000000a2b5a0 = uVar10;
        }
code_r0x0073d5dc:
        pcVar9 = (char *)_strtok_r(0,", ",auStack_1988);
      }
      (*pcRam0000000000a2b5f0)(lVar7);
      lVar7 = 0;
    }
  }
  return lVar7;
}

