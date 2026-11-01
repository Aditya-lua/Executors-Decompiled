
undefined8 FUN_0074a5a0(long param_1,int param_2)

{
  bool bVar1;
  ulong *puVar2;
  byte bVar3;
  int iVar4;
  uint uVar5;
  uint uVar6;
  ulong uVar7;
  char *pcVar8;
  undefined4 *puVar9;
  long lVar10;
  int *piVar11;
  undefined4 uVar12;
  char cVar13;
  long lVar14;
  ulong uVar15;
  undefined8 uVar16;
  char *pcVar17;
  char *pcVar18;
  undefined1 *puVar19;
  uint uVar20;
  uint uVar21;
  undefined1 auVar22 [16];
  long *plStack_658;
  undefined4 uStack_650;
  uint uStack_64c;
  char acStack_646 [67];
  undefined1 auStack_603 [50];
  undefined1 auStack_5d1 [256];
  undefined1 auStack_4d1 [1025];
  undefined1 uStack_d0;
  char cStack_cf;
  ushort uStack_ce;
  undefined1 auStack_c8 [120];
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined7 uStack_38;
  undefined1 uStack_31;
  undefined7 uStack_30;
  undefined8 uStack_29;
  long lStack_18;
  
  lStack_18 = *(long *)PTR____stack_chk_guard_009b01e8;
  lVar14 = *(long *)(param_1 + 0x18);
  uStack_64c = 0xffffffff;
  uStack_29 = 0;
  uStack_30 = 0;
  uStack_48 = 0;
  uStack_50 = 0;
  uStack_38 = 0;
  uStack_31 = 0;
  uStack_40 = 0;
  pcVar17 = *(char **)(param_1 + 0x800);
  plStack_658 = (long *)0x0;
  if ((pcVar17 == (char *)0x0) || (uVar7 = _strlen(pcVar17), uVar7 < 2)) {
    uVar20 = 0;
    uVar21 = 0;
code_r0x0074a640:
    uStack_650 = 0x80;
    iVar4 = _getsockname(*(undefined4 *)(lVar14 + 0x238),&uStack_d0,&uStack_650);
    if (iVar4 == 0) {
      if (cStack_cf == '\x1e') {
        lVar10 = _inet_ntop(0x1e,auStack_c8,auStack_4d1,0x401);
      }
      else {
        lVar10 = _inet_ntop(cStack_cf,(ulong)&uStack_d0 | 4,auStack_4d1,0x401);
      }
      if (lVar10 == 0) goto LAB_0074a760;
      bVar3 = 0;
code_r0x0074a6c0:
      puVar19 = auStack_4d1;
code_r0x0074a6c4:
      iVar4 = func_0x0074f754(param_1,puVar19,0,0,&plStack_658);
      if (iVar4 == 1) {
        func_0x00728b3c(param_1,&plStack_658);
      }
      if ((plStack_658 == (long *)0x0) || (lVar10 = *plStack_658, lVar10 == 0)) {
        pcVar17 = "failed to resolve the address provided to PORT: %s";
      }
      else {
        do {
          iVar4 = func_0x0072d954(param_1,lVar10,0,*(undefined1 *)(lVar14 + 0x52a),&uStack_64c);
          if (iVar4 == 0) {
            if ((param_1 != 0) && (*(char *)(param_1 + 0xa1d) < '\0')) {
              if (*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + param_1 + 0x18) == 0) {
                if (0 < iRam0000000000a2b570) goto code_r0x0074aad8;
              }
              else {
                bVar1 = *(int *)(*(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + param_1 + 0x18) + 8) < 1;
                if ((!bVar1 && iRam0000000000a2b570 != 0) && (bVar1 || -1 < iRam0000000000a2b570)) {
code_r0x0074aad8:
                  func_0x0073cfbc(param_1,"[%s] ftp_state_use_port(), opened socket");
                }
              }
            }
            ___memcpy_chk(&uStack_d0,*(undefined8 *)(lVar10 + 0x20),*(undefined4 *)(lVar10 + 0x10),
                          0x80);
            uStack_650 = *(undefined4 *)(lVar10 + 0x10);
            if (uVar21 < uVar20) goto LAB_0074ab18;
            uVar5 = uVar20;
            goto LAB_0074ab3c;
          }
          puVar9 = (undefined4 *)___error();
          lVar10 = *(long *)(lVar10 + 0x28);
        } while (lVar10 != 0);
code_r0x0074a72c:
        func_0x0077ea88(*puVar9,auStack_5d1,0x100);
        pcVar17 = "socket failure: %s";
      }
    }
    else {
code_r0x0074a65c:
      puVar9 = (undefined4 *)___error();
      func_0x0077ea88(*puVar9,auStack_5d1,0x100);
      pcVar17 = "getsockname() failed: %s";
    }
    goto LAB_0074a758;
  }
  if (*pcVar17 == ':') {
    uVar7 = 0;
    pcVar18 = (char *)0x0;
    pcVar8 = pcVar17;
LAB_0074a90c:
    lVar10 = _strchr(pcVar8,0x3a);
    if (lVar10 == 0) {
      uVar20 = 0;
      uVar21 = 0;
    }
    else {
      _strtoul(lVar10 + 1,0,10);
      uVar5 = func_0x0078bbc8();
      lVar10 = _strchr(lVar10,0x2d);
      uVar21 = uVar5;
      uVar20 = uVar5;
      if (lVar10 != 0) {
        _strtoul(lVar10 + 1,0,10);
        uVar6 = func_0x0078bbc8();
        uVar20 = 0;
        if (uVar5 <= uVar6) {
          uVar20 = uVar5;
        }
        uVar21 = 0;
        if (uVar5 <= uVar6) {
          uVar21 = uVar6;
        }
      }
    }
joined_r0x0074a9e4:
    if (uVar7 == 0) goto code_r0x0074a640;
    pcVar17 = pcVar18;
  }
  else {
    if (*pcVar17 == '[') {
      pcVar18 = pcVar17 + 1;
      pcVar8 = (char *)_strchr(pcVar18,0x5d);
      if (pcVar8 == (char *)0x0) {
        uVar20 = 0;
        uVar21 = 0;
        goto code_r0x0074a640;
      }
      uVar7 = (long)pcVar8 - (long)pcVar18;
      goto LAB_0074a90c;
    }
    pcVar8 = (char *)_strchr(pcVar17,0x3a);
    if (pcVar8 != (char *)0x0) {
      uVar7 = (long)pcVar8 - (long)pcVar17;
      iVar4 = _inet_pton(0x1e,pcVar17,auStack_c8);
      pcVar18 = pcVar17;
      if (iVar4 != 1) goto LAB_0074a90c;
      uVar20 = 0;
      uVar21 = 0;
      goto joined_r0x0074a9e4;
    }
    uVar21 = 0;
    uVar20 = 0;
  }
  if (uVar7 < 0x32) {
    puVar19 = auStack_603;
    ___memcpy_chk(auStack_603,pcVar17,uVar7,0x32);
    puVar19[uVar7] = 0;
    uVar12 = **(undefined4 **)(lVar14 + 0x50);
    uVar16 = func_0x0075af24(*(undefined4 **)(lVar14 + 0x50) + 4);
    iVar4 = func_0x0075b008(uVar12,uVar16,*(undefined4 *)(lVar14 + 0x520),auStack_603,auStack_4d1,
                            0x401);
    if (iVar4 == 0) {
      bVar3 = 1;
      goto code_r0x0074a6c4;
    }
    if (iVar4 != 1) {
      if (iVar4 != 2) goto code_r0x0074a640;
      bVar3 = 1;
      goto code_r0x0074a6c0;
    }
  }
  goto LAB_0074a760;
code_r0x0074adf0:
  do {
    if ((param_2 != 0) || ((uVar7 & 0x10000) != 0)) {
      if ((param_2 == 1) && (cStack_cf != '\x02')) break;
      if ((cStack_cf == '\x1e') || (cStack_cf == '\x02')) {
        if (param_2 == 0) {
          uVar16 = func_0x0076e34c(param_1,lVar14 + 1000,"%s |%d|%s|%hu|");
          if ((int)uVar16 == 0) {
            uVar12 = 0;
            goto code_r0x0074ad94;
          }
          func_0x0077e9f4();
          pcVar17 = "Failure sending EPRT command: %s";
          goto LAB_0074af00;
        }
        if (param_2 == 1) {
          lVar10 = 0;
          goto code_r0x0074ae40;
        }
      }
    }
    param_2 = param_2 + 1;
  } while (param_2 != 2);
code_r0x0074ad90:
  uVar12 = 2;
code_r0x0074ad94:
  *(undefined4 *)(lVar14 + 0x4e8) = uVar12;
  func_0x007466c4(param_1,0x1c);
  uVar16 = func_0x0072f958(param_1,lVar14,1,&uStack_64c);
  if ((int)uVar16 == 0) {
    uStack_64c = 0xffffffff;
  }
  goto code_r0x0074a764;
code_r0x0074ae40:
  cVar13 = *(char *)((long)&uStack_50 + lVar10);
  if (cVar13 == '.') {
    cVar13 = ',';
  }
  else if (cVar13 == '\0') goto code_r0x0074ae50;
  acStack_646[lVar10] = cVar13;
  lVar10 = lVar10 + 1;
  goto code_r0x0074ae40;
code_r0x0074ae50:
  acStack_646[lVar10] = '\0';
  func_0x00764560(acStack_646 + lVar10,0x14,",%d,%d");
  uVar16 = func_0x0076e34c(param_1,lVar14 + 1000,"%s %s");
  if ((int)uVar16 != 0) {
    func_0x0077e9f4();
    pcVar17 = "Failure sending PORT command: %s";
LAB_0074af00:
    func_0x0073c9e4(param_1,pcVar17);
    goto code_r0x0074a764;
  }
  uVar12 = 1;
  goto code_r0x0074ad94;
  while( true ) {
    piVar11 = (int *)___error();
    iVar4 = *piVar11;
    if ((bool)(bVar3 & iVar4 == 0x31)) {
      if (((param_1 != 0) && (*(char *)(param_1 + 0xa1d) < '\0')) &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    param_1 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + param_1 + 0x18) + 8))))) {
        func_0x0077ea88(0x31,auStack_5d1,0x100);
        func_0x0073cab8(param_1,"bind(port=%hu) on non-local address failed: %s");
      }
      uStack_650 = 0x80;
      iVar4 = _getsockname(*(undefined4 *)(lVar14 + 0x238),&uStack_d0,&uStack_650);
      if (iVar4 != 0) goto code_r0x0074a65c;
      bVar3 = 0;
      uVar5 = uVar20;
    }
    else {
      if ((iVar4 != 0xd) && (iVar4 != 0x30)) {
        func_0x0077ea88(iVar4,auStack_5d1,0x100);
        pcVar17 = "bind(port=%hu) failed: %s";
        goto LAB_0074a758;
      }
      uVar5 = (uVar5 & 0xffff) + 1;
    }
    if (uVar21 < (uVar5 & 0xffff)) break;
LAB_0074ab3c:
    uStack_ce = (ushort)(uVar5 >> 8) & 0xff | (ushort)((uVar5 & 0xff00ff) << 8);
    iVar4 = _bind(uStack_64c,&uStack_d0,uStack_650);
    if (iVar4 == 0) {
      uStack_650 = 0x80;
      iVar4 = _getsockname(uStack_64c,&uStack_d0,&uStack_650);
      if (iVar4 != 0) goto code_r0x0074a65c;
      if (param_1 == 0) {
        iVar4 = _listen(uStack_64c,1);
        if (iVar4 == 0) goto code_r0x0074ad5c;
      }
      else {
        if (*(char *)(param_1 + 0xa1d) < '\0') {
          if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + param_1 + 0x18) == 0) {
            if (0 < iRam0000000000a2b570) goto code_r0x0074acb0;
          }
          else {
            bVar1 = *(int *)(*(long *)(
                                      "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                      + param_1 + 0x18) + 8) < 1;
            if ((!bVar1 && iRam0000000000a2b570 != 0) && (bVar1 || -1 < iRam0000000000a2b570)) {
code_r0x0074acb0:
              func_0x0073cfbc(param_1,"[%s] ftp_state_use_port(), socket bound to port %d");
            }
          }
        }
        iVar4 = _listen(uStack_64c,1);
        if (iVar4 == 0) {
          if ((*(char *)(param_1 + 0xa1d) < '\0') &&
             (((*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + param_1 + 0x18) == 0 ||
               (0 < *(int *)(*(long *)(
                                      "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                      + param_1 + 0x18) + 8))) && (0 < iRam0000000000a2b570)))) {
            func_0x0073cfbc(param_1,"[%s] ftp_state_use_port(), listening on %d");
          }
code_r0x0074ad5c:
          func_0x0074ef88(lVar10,&uStack_50,0x2f);
          uVar7 = *(ulong *)(lVar14 + 0x398);
          if ((uVar7 & 0x10800) == 0x800) {
            uVar7 = uVar7 | 0x10000;
            *(ulong *)(lVar14 + 0x398) = uVar7;
          }
          if (param_2 == 2) goto code_r0x0074ad90;
          goto code_r0x0074adf0;
        }
      }
      puVar9 = (undefined4 *)___error();
      goto code_r0x0074a72c;
    }
  }
LAB_0074ab18:
  pcVar17 = "bind() failed, we ran out of ports";
LAB_0074a758:
  func_0x0073c9e4(param_1,pcVar17);
LAB_0074a760:
  uVar16 = 0x1e;
code_r0x0074a764:
  if (plStack_658 != (long *)0x0) {
    func_0x00750010(param_1,&plStack_658);
  }
  if ((int)uVar16 == 0) {
    if ((((*(byte *)(lVar14 + 0x39a) >> 1 & 1) == 0) || (-1 < *(char *)(param_1 + 0xa1b))) ||
       (uVar7 = func_0x007315f4(lVar14,1), (uVar7 & 1) != 0)) {
      uVar16 = 0;
    }
    else {
      uVar16 = func_0x00794ee8(param_1,lVar14,1);
    }
    *(ulong *)(*(long *)(param_1 + 0x18) + 0x398) =
         *(ulong *)(*(long *)(param_1 + 0x18) + 0x398) & 0xffffffffffffefff;
    func_0x007706e4(param_1,10);
    iVar4 = 60000;
    if (*(int *)(param_1 + 0x6b8) != 0) {
      iVar4 = *(int *)(param_1 + 0x6b8);
    }
    func_0x00768170(param_1,iVar4,0xd);
  }
  else {
    lVar10 = *(long *)(param_1 + 0x18);
    if (((param_1 != 0) && (*(char *)(lVar10 + 0x4f6) != '\0')) &&
       (((*(char *)(param_1 + 0xa1d) < '\0' &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    param_1 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + param_1 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)))) {
      func_0x0073cfbc(param_1,"[%s] -> [%s]");
    }
    *(undefined1 *)(lVar10 + 0x4f6) = 0;
  }
  uVar7 = (ulong)uStack_64c;
  if (uStack_64c != 0xffffffff) {
    func_0x0072db20(param_1,lVar14);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_18) {
    return uVar16;
  }
  auVar22 = ___stack_chk_fail();
  puVar2 = (ulong *)(auVar22._0_8_ + 0xa1a);
  uVar15 = *puVar2;
  *puVar2 = uVar15 | 0x8000000;
  uVar16 = func_0x007738a0(auVar22._0_8_,4,auVar22._8_8_,uVar7);
  *puVar2 = *puVar2 & 0xfffffffff0000000 | *puVar2 & 0x7ffffff | uVar15 & 0x8000000;
  return uVar16;
}

