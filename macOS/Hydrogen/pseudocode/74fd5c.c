
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong FUN_0074fd5c(ulong param_1,long *param_2,undefined1 *param_3,char *param_4,long param_5)

{
  undefined1 *puVar1;
  uint uVar2;
  undefined2 uVar3;
  undefined4 uVar4;
  int iVar5;
  ulong uVar6;
  undefined8 *puVar7;
  ulong uVar8;
  undefined8 uVar9;
  long lVar10;
  char cVar11;
  long lVar12;
  char *pcVar13;
  undefined8 *puVar14;
  long lVar15;
  undefined8 *puVar16;
  ulong unaff_x26;
  undefined1 auVar17 [16];
  undefined1 uStack0000000000000018;
  undefined1 uStack0000000000000048;
  undefined1 uStack0000000000000068;
  long lStack0000000000000088;
  undefined1 auStack_a8 [4];
  int iStack_a4;
  ulong uStack_a0;
  undefined4 uStack_94;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  long lStack_68;
  
  lStack0000000000000088 = *(long *)PTR____stack_chk_guard_009b01e8;
  uVar8 = param_1;
  if ((-1 < *(char *)(param_1 + 0xa1d)) ||
     (pcVar13 = (char *)((long)param_2 + 0x1c), *pcVar13 == '\0')) goto LAB_0074ffb8;
  param_3 = &uStack0000000000000018;
  uVar8 = _inet_pton(2,pcVar13);
  if (0 < (int)uVar8) goto LAB_0074ffb8;
  param_3 = &uStack0000000000000048;
  uVar8 = _inet_pton(0x1e,pcVar13);
  if (0 < (int)uVar8) goto LAB_0074ffb8;
  lVar15 = *param_2;
  if ((*(char *)(param_1 + 0xa1d) < '\0') &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                param_1 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + param_1 + 0x18) + 8))))) {
    func_0x0073cab8(param_1,"Host %s:%d was resolved.");
  }
  func_0x0074066c(&uStack0000000000000048,0x400);
  func_0x0074066c(&uStack0000000000000068,0x400);
  for (; lVar15 != 0; lVar15 = *(long *)(lVar15 + 0x28)) {
    iVar5 = *(int *)(lVar15 + 4);
    if (iVar5 == 0x1e || iVar5 == 2) {
      uStack0000000000000018 = 0;
      if (iVar5 == 0x1e) {
        lVar10 = *(long *)(lVar15 + 0x20) + 8;
        uVar9 = 0x1e;
LAB_0074feb4:
        param_3 = &uStack0000000000000018;
        param_4 = segment_command_00000020.segname + 6;
        _inet_ntop(uVar9,lVar10);
      }
      else if (iVar5 == 2) {
        lVar10 = *(long *)(lVar15 + 0x20) + 4;
        uVar9 = 2;
        goto LAB_0074feb4;
      }
      puVar1 = auStack_a8 + (ulong)(iVar5 != 2) * 0x20 + 0xf0;
      lVar10 = func_0x00156654(puVar1);
      if (lVar10 == 0) {
LAB_0074fe4c:
        iVar5 = func_0x007408a0(puVar1,&uStack0000000000000018);
        if (iVar5 == 0) goto LAB_0074fe5c;
      }
      else {
        param_3 = (undefined1 *)((long)&MACH_HEADER.magic + 2);
        iVar5 = func_0x0074075c(puVar1,", ");
        if (iVar5 == 0) goto LAB_0074fe4c;
      }
      if ((-1 < *(char *)(param_1 + 0xa1d)) ||
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    param_1 + 0x18) != 0 &&
          (*(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + param_1 + 0x18) + 8) < 1)))) goto LAB_0074ffa8;
      pcVar13 = "too many IP, cannot show";
      goto LAB_0074ffa0;
    }
LAB_0074fe5c:
  }
  if (*(char *)(param_1 + 0xa1d) < '\0') {
    if ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  param_1 + 0x18) == 0) ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + param_1 + 0x18) + 8))) {
      lVar15 = func_0x00156654(&uStack0000000000000068);
      if (lVar15 != 0) {
        func_0x00740a58(&uStack0000000000000068);
      }
      func_0x0073cab8(param_1,"IPv6: %s");
      if (-1 < *(char *)(param_1 + 0xa1d)) goto LAB_0074ffa8;
    }
    if ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  param_1 + 0x18) == 0) ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + param_1 + 0x18) + 8))) {
      lVar15 = func_0x00156654(&uStack0000000000000048);
      if (lVar15 != 0) {
        func_0x00740a58(&uStack0000000000000048);
      }
      pcVar13 = "IPv4: %s";
LAB_0074ffa0:
      func_0x0073cab8(param_1,pcVar13);
    }
  }
LAB_0074ffa8:
  func_0x00740678(&uStack0000000000000048);
  uVar8 = func_0x00740678(&uStack0000000000000068);
LAB_0074ffb8:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack0000000000000088) {
    return uVar8;
  }
  auVar17 = ___stack_chk_fail();
  lVar10 = auVar17._8_8_;
  lVar15 = auVar17._0_8_;
  param_4[0] = '\0';
  param_4[1] = '\0';
  param_4[2] = '\0';
  param_4[3] = '\0';
  param_4[4] = '\0';
  param_4[5] = '\0';
  param_4[6] = '\0';
  param_4[7] = '\0';
  if (param_5 < 0) {
    return 0xfffffffe;
  }
  puVar16 = (undefined8 *)((long)&MACH_HEADER.magic + 1);
  lStack_68 = *(long *)PTR____stack_chk_guard_009b01e8;
  puVar14 = *(undefined8 **)(lVar15 + 0x18);
  uVar8 = _strlen(lVar10);
  if (6 < uVar8) {
    iVar5 = func_0x0077e6f8(uVar8 + lVar10 + -6,".onion");
    if ((iVar5 != 0) || (iVar5 = func_0x0077e6f8(uVar8 + lVar10 + -7,".onion."), iVar5 != 0)) {
      func_0x0073c9e4(lVar15,"Not resolving .onion address (RFC 7686)");
      goto LAB_0074f7e8;
    }
  }
  param_4[0] = '\0';
  param_4[1] = '\0';
  param_4[2] = '\0';
  param_4[3] = '\0';
  param_4[4] = '\0';
  param_4[5] = '\0';
  param_4[6] = '\0';
  param_4[7] = '\0';
  puVar14[0x73] = puVar14[0x73] & 0xfffffffffdffffff;
  if (*(long *)(lVar15 + 0xe0) != 0) {
    func_0x00779cfc(lVar15,3,2);
  }
  unaff_x26 = func_0x0074f110(lVar15,lVar10,param_3);
  uStack_a0 = unaff_x26;
  if (unaff_x26 == 0) goto code_r0x0074f8e4;
  if ((*(char *)(lVar15 + 0xa1d) < '\0') &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                lVar15 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + lVar15 + 0x18) + 8))))) {
    func_0x0073cab8(lVar15,"Hostname %s was found in DNS cache");
  }
  uVar8 = 0;
  *(long *)(unaff_x26 + 0x10) = *(long *)(unaff_x26 + 0x10) + 1;
  lVar12 = *(long *)(lVar15 + 0xe0);
  do {
    if (lVar12 != 0) {
      func_0x00779d40(lVar15,3);
    }
    if (unaff_x26 == 0) {
      iStack_a4 = 0;
      if (*(long *)(lVar15 + 0x9c0) == 0) {
code_r0x0074f934:
        iVar5 = _inet_pton(2,lVar10,auStack_a8);
        if (iVar5 < 1) {
          iVar5 = _inet_pton(0x1e,lVar10,&uStack_80);
          unaff_x26 = (ulong)(0 < iVar5);
          cVar11 = *(char *)((long)puVar14 + 0x52b);
        }
        else {
          unaff_x26 = 1;
          cVar11 = *(char *)((long)puVar14 + 0x52b);
        }
        if (cVar11 == '\x02') {
          cVar11 = *(char *)(*(long *)(lVar15 + 0xd0) + 0x270);
          if (cVar11 == '\0') {
            iVar5 = _socket(0x1e,2,0);
            if (iVar5 == -1) {
              cVar11 = '\x01';
            }
            else {
              _close();
              cVar11 = '\x02';
            }
            *(char *)(*(long *)(lVar15 + 0xd0) + 0x270) = cVar11;
          }
          if (cVar11 != '\x02') goto LAB_0074f7e8;
        }
        iVar5 = func_0x0077e6f8(lVar10,"localhost");
        if ((((iVar5 == 0) && (iVar5 = func_0x0077e6f8(lVar10,"localhost."), iVar5 == 0)) &&
            (uVar6 = func_0x0074fc70(lVar10,".localhost"), (uVar6 & 1) == 0)) &&
           (iVar5 = func_0x0074fc70(lVar10,".localhost."), iVar5 == 0)) {
          if ((int)puVar16 != 0) {
            iVar5 = (int)unaff_x26;
            if ((*(byte *)(lVar15 + 0xa20) & 8) == 0) {
              iVar5 = 1;
            }
            if (iVar5 == 0) {
              puVar14 = (undefined8 *)func_0x0073ebd4(lVar15,lVar10,param_3,&iStack_a4);
              goto joined_r0x0074fb5c;
            }
          }
          iVar5 = func_0x00750844(lVar15,puVar14);
          if (iVar5 == 0) goto LAB_0074f7e8;
          puVar14 = (undefined8 *)func_0x0074ef84(lVar15,lVar10,param_3,&iStack_a4);
        }
        else {
          lVar12 = _strlen(lVar10);
          iVar5 = _inet_pton(2,"127.0.0.1",&uStack_94);
          uVar4 = uStack_94;
          if (iVar5 < 1) {
            puVar14 = (undefined8 *)0x0;
          }
          else {
            puVar16 = (undefined8 *)0xa2b608;
            puVar14 = (undefined8 *)(*pcRam0000000000a2b608)(1,lVar12 + 0x41);
            uVar9 = _UNK_008cd500;
            if (puVar14 != (undefined8 *)0x0) {
              uVar2 = ((uint)param_3 & 0xff00ff00) >> 8 | ((uint)param_3 & 0xff00ff) << 8;
              unaff_x26 = (ulong)(uVar2 & 0xffff);
              puVar14[1] = _UNK_008cd508;
              *puVar14 = uVar9;
              *(undefined4 *)(puVar14 + 2) = 0x10;
              *(undefined2 *)(puVar14 + 6) = 0x200;
              uVar3 = (undefined2)uVar2;
              *(undefined2 *)((long)puVar14 + 0x32) = uVar3;
              *(undefined4 *)((long)puVar14 + 0x34) = uVar4;
              puVar14[7] = 0;
              puVar14[3] = puVar14 + 8;
              puVar14[4] = puVar14 + 6;
              _strcpy(puVar14 + 8,lVar10);
              lVar12 = _strlen(lVar10);
              puVar7 = (undefined8 *)(*pcRam0000000000a2b608)(1,lVar12 + 0x4d);
              if (puVar7 != (undefined8 *)0x0) {
                _inet_pton(0x1e,"::1",&uStack_90);
                uVar9 = _UNK_008cd510;
                uStack_78 = uStack_88;
                uStack_80 = uStack_90;
                puVar7[1] = _UNK_008cd518;
                *puVar7 = uVar9;
                *(undefined4 *)(puVar7 + 2) = 0x1c;
                *(undefined1 *)((long)puVar7 + 0x31) = 0x1e;
                *(undefined2 *)((long)puVar7 + 0x32) = uVar3;
                *(undefined4 *)((long)puVar7 + 0x34) = 0;
                puVar7[8] = uStack_88;
                puVar7[7] = uStack_90;
                *(undefined4 *)(puVar7 + 9) = 0;
                puVar7[4] = puVar7 + 6;
                puVar7[5] = 0;
                puVar7[3] = (undefined1 *)((long)puVar7 + 0x4c);
                _strcpy((undefined1 *)((long)puVar7 + 0x4c),lVar10);
                puVar7[5] = puVar14;
                puVar14 = puVar7;
                puVar16 = puVar7;
              }
            }
          }
        }
joined_r0x0074fb5c:
        if (puVar14 == (undefined8 *)0x0) {
          if (iStack_a4 == 0) {
            unaff_x26 = 0;
          }
          else {
            if ((*(byte *)(*(long *)(lVar15 + 0x18) + 0x39b) >> 1 & 1) == 0) {
              param_3 = (undefined1 *)func_0x00728c18(lVar15,&uStack_a0);
            }
            else {
              param_3 = (undefined1 *)func_0x0073f68c(lVar15,&uStack_a0);
            }
            if (uStack_a0 != 0) {
              func_0x0074fd54(lVar15);
            }
            if ((int)param_3 != 0) goto LAB_0074f7e8;
            uVar8 = (ulong)(uStack_a0 == 0);
            unaff_x26 = uStack_a0;
          }
        }
        else {
          if (*(long *)(lVar15 + 0xe0) != 0) {
            func_0x00779cfc(lVar15,3,2);
          }
          unaff_x26 = func_0x0074f314(lVar15,puVar14,lVar10,0,param_3,0);
          uStack_a0 = unaff_x26;
          if (*(long *)(lVar15 + 0xe0) != 0) {
            func_0x00779d40(lVar15,3);
          }
          if (unaff_x26 == 0) {
            func_0x0073a4d8(puVar14);
            unaff_x26 = uStack_a0;
          }
          else {
            func_0x0074fd54(lVar15,unaff_x26);
            uVar8 = 0;
          }
        }
        goto code_r0x0074f8c4;
      }
      func_0x0076bad4(lVar15,1);
      unaff_x26 = (**(code **)(lVar15 + 0x9c0))
                            (*(undefined8 *)(lVar15 + 0xd38),0,*(undefined8 *)(lVar15 + 0x9c8));
      func_0x0076bad4(lVar15,0);
      if ((int)unaff_x26 == 0) goto code_r0x0074f934;
LAB_0074f7e8:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_68) {
        return 0xffffffff;
      }
    }
    else {
code_r0x0074f8c4:
      *(ulong *)param_4 = unaff_x26;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_68) {
        return uVar8;
      }
    }
    ___stack_chk_fail();
code_r0x0074f8e4:
    uVar8 = 0xffffffff;
    lVar12 = *(long *)(lVar15 + 0xe0);
  } while( true );
}

