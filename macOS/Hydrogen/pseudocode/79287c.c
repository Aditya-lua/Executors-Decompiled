
/* WARNING: Possible PIC construction at 0x00791d74: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00791d78) */
/* WARNING: Removing unreachable block (ram,0x00791e4c) */
/* WARNING: Removing unreachable block (ram,0x007921d0) */
/* WARNING: Removing unreachable block (ram,0x007921d8) */
/* WARNING: Removing unreachable block (ram,0x00791e58) */
/* WARNING: Removing unreachable block (ram,0x00791e5c) */
/* WARNING: Removing unreachable block (ram,0x00791e64) */
/* WARNING: Removing unreachable block (ram,0x00791f9c) */
/* WARNING: Removing unreachable block (ram,0x00791e6c) */
/* WARNING: Removing unreachable block (ram,0x00791e74) */
/* WARNING: Removing unreachable block (ram,0x00791fa4) */
/* WARNING: Removing unreachable block (ram,0x00791fb8) */
/* WARNING: Removing unreachable block (ram,0x00791e80) */

undefined * FUN_0079287c(undefined8 param_1,undefined8 param_2,char *param_3)

{
  uint uVar1;
  uint uVar2;
  bool bVar3;
  int iVar4;
  ulong uVar5;
  ulong uVar6;
  long lVar7;
  qword *pqVar8;
  undefined4 uVar9;
  undefined4 uVar10;
  long unaff_x19;
  undefined *puVar11;
  long *unaff_x21;
  undefined8 unaff_x22;
  undefined8 uVar12;
  char *unaff_x27;
  ulong unaff_x28;
  long unaff_x29;
  undefined1 auVar13 [16];
  long *in_stack_00000030;
  long in_stack_00000038;
  ulong in_stack_00000058;
  undefined1 *in_stack_00000060;
  undefined8 in_stack_00000070;
  long in_stack_00000078;
  undefined8 in_stack_00000080;
  long *in_stack_00000098;
  qword qStack00000000000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b8;
  qword qStack00000000000000c0;
  undefined8 uStack00000000000000d8;
  undefined8 uStack0000000000000100;
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000118;
  undefined8 in_stack_00000120;
  undefined8 in_stack_00000128;
  undefined8 in_stack_00000130;
  undefined8 in_stack_00000138;
  undefined1 auStack_168 [8];
  undefined *puStack_160;
  undefined1 auStack_158 [16];
  undefined1 auStack_148 [256];
  long lStack_48;
  ulong uStack_40;
  char *pcStack_38;
  undefined8 uStack_30;
  long *plStack_28;
  undefined *puStack_20;
  
  auVar13._8_8_ = unaff_x19;
  auVar13._0_8_ = in_stack_00000098;
  lVar7 = _fopen();
  if (lVar7 != 0) {
    do {
      iVar4 = _feof(lVar7);
      if (iVar4 != 0) {
        iVar4 = _fclose(lVar7);
        if (iVar4 != 0) goto LAB_00792914;
        func_0x00740a58(&uStack00000000000000d8);
        param_3 = (char *)func_0x00156654(&uStack00000000000000d8);
        unaff_x22 = func_0x00176c5c();
        func_0x00740678(&uStack00000000000000d8);
        unaff_x28 = in_stack_00000058;
        if ((int)unaff_x22 != 7000) {
          func_0x0073c9e4();
          goto code_r0x0079292c;
        }
        unaff_x22 = func_0x00176e90();
        func_0x001772f8();
        unaff_x21 = in_stack_00000030;
        if ((int)unaff_x22 == 7000) {
          func_0x0016f6b0(in_stack_000000b8,in_stack_000000a8);
          func_0x001776b0(in_stack_000000a8);
          iVar4 = func_0x001702a4(in_stack_000000b8,in_stack_00000030);
          if (iVar4 == 7000) {
            param_3 = (char *)&qStack00000000000000c0;
            uVar12 = func_0x001713b0(*in_stack_00000030,*(undefined8 *)(in_stack_00000038 + 8));
            if ((int)uVar12 == 7000) {
              func_0x0017241c(qStack00000000000000c0,in_stack_00000030);
              puVar11 = (undefined *)0x0;
              in_stack_00000030[1] = qStack00000000000000c0;
            }
            else {
              param_3 = (char *)&section_000000b8.reserved2;
              func_0x0017816c(uVar12,&uStack0000000000000100,0x100,&uStack00000000000000d8);
              func_0x0073c9e4();
              puVar11 = (undefined *)0x7;
            }
          }
          else {
            func_0x0073c9e4();
            func_0x0017130c(*in_stack_00000030);
            puVar11 = (undefined *)0x23;
          }
        }
        else {
          func_0x0073c9e4();
          func_0x001776b0(in_stack_000000a8);
          func_0x00170cc8(in_stack_000000b8);
          puVar11 = (undefined *)0x4d;
        }
        goto LAB_0079254c;
      }
      pqVar8 = (qword *)&section_000000b8.reserved2;
      param_3 = (char *)_fread(&uStack0000000000000100,1,0x100,lVar7);
      if ((qword *)param_3 == (qword *)0x0) break;
      iVar4 = func_0x0074075c(&uStack00000000000000d8,&uStack0000000000000100);
      pqVar8 = (qword *)param_3;
    } while (iVar4 == 0);
    param_3 = (char *)pqVar8;
    _fclose(lVar7);
  }
LAB_00792914:
  func_0x0073c9e4();
  func_0x00740678(&uStack00000000000000d8);
code_r0x0079292c:
  func_0x001772f8();
  puVar11 = (undefined *)0x52;
LAB_0079254c:
  if ((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (in_stack_00000098 != (long *)0x0) goto code_r0x00792580;
    }
    else if ((in_stack_00000098 != (long *)0x0) &&
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) + 8))) {
code_r0x00792580:
      if (0 < *(int *)(*in_stack_00000098 + 0xc)) {
        param_3 = "cr_connect_common, init backend -> %d";
        func_0x0073cbdc();
      }
    }
  }
  uVar5 = unaff_x28;
  if ((int)puVar11 == 0) {
    *(undefined4 *)(unaff_x28 + 0xb8) = 2;
    uVar12 = *(undefined8 *)(in_stack_00000078 + 8);
    *(undefined4 *)(unaff_x28 + 0xc4) = 0;
    iVar4 = func_0x00172b0c(uVar12);
    if (iVar4 != 0) {
      unaff_x21 = (long *)(unaff_x19 + 0xa1a);
      unaff_x22 = 1;
      unaff_x27 = "rustls_connection wants us to read_tls.";
      do {
        *(undefined4 *)(unaff_x28 + 0xbc) = 1;
        uVar5 = func_0x00172a94(uVar12);
        uVar6 = func_0x00172ae8(uVar12);
        bVar3 = true;
        if ((uVar6 & 1) == 0) {
          bVar3 = *(long *)(in_stack_00000078 + 0x10) != 0;
        }
        param_3 = (char *)((long)&MACH_HEADER.magic + 1);
        puVar11 = (undefined *)func_0x00734ac8();
        if ((long)puVar11 < 0) {
code_r0x00792138:
          func_0x0073c9e4();
          puVar11 = (undefined *)0x1c;
          goto code_r0x007926e8;
        }
        uVar1 = in_stack_00000070._4_4_;
        if ((int)uVar5 == 0) {
          uVar1 = 0xffffffff;
        }
        uVar2 = in_stack_00000070._4_4_;
        if (!bVar3) {
          uVar2 = 0xffffffff;
        }
        param_3 = (char *)(ulong)uVar2;
        if (in_stack_00000080._4_4_ == 0) {
          puVar11 = (undefined *)0x0;
        }
        iVar4 = func_0x007731dc(uVar1,0xffffffff,param_3,puVar11);
        if (iVar4 < 0) {
          ___error();
          func_0x0073c9e4();
          puVar11 = (undefined *)0x23;
          goto code_r0x007926e8;
        }
        if ((iVar4 == 0) && (in_stack_00000080._4_4_ != 0)) goto code_r0x00792138;
        if (iVar4 == 0) {
          if ((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) {
            if (*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + unaff_x19 + 0x18) == 0) {
              if (in_stack_00000098 != (long *)0x0) goto code_r0x0079272c;
            }
            else if ((in_stack_00000098 != (long *)0x0) &&
                    (0 < *(int *)(*(long *)(
                                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                           + unaff_x19 + 0x18) + 8))) {
code_r0x0079272c:
              if (0 < *(int *)(*in_stack_00000098 + 0xc)) {
                param_3 = "Curl_socket_check: %s would block";
                func_0x0073cbdc();
              }
            }
          }
          if (bVar3) {
            *(uint *)(unaff_x28 + 0xc4) = *(uint *)(unaff_x28 + 0xc4) | 2;
          }
          puVar11 = (undefined *)0x0;
          if ((int)uVar5 != 0) {
            *(uint *)(unaff_x28 + 0xc4) = *(uint *)(unaff_x28 + 0xc4) | 1;
          }
          goto code_r0x007926e8;
        }
        if (bVar3) {
          if ((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) {
            if (*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + unaff_x19 + 0x18) == 0) {
              if (in_stack_00000098 != (long *)0x0) goto code_r0x00791e8c;
            }
            else if ((in_stack_00000098 != (long *)0x0) &&
                    (0 < *(int *)(*(long *)(
                                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                           + unaff_x19 + 0x18) + 8))) {
code_r0x00791e8c:
              if (0 < *(int *)(*in_stack_00000098 + 0xc)) {
                func_0x0073cbdc();
              }
            }
          }
          param_3 = (char *)0x0;
          func_0x00791930(in_stack_00000098);
          puVar11 = (undefined *)(ulong)(uint)qStack00000000000000a0;
          if ((uint)qStack00000000000000a0 == 0) goto code_r0x00791f3c;
          if ((uint)qStack00000000000000a0 != 0x51) goto code_r0x007926e8;
          if (unaff_x19 != 0) {
            if (*(char *)(unaff_x19 + 0xa1d) < '\0') {
              if (*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18) == 0) {
                if (in_stack_00000098 != (long *)0x0) goto code_r0x00791f14;
              }
              else if ((in_stack_00000098 != (long *)0x0) &&
                      (0 < *(int *)(*(long *)(
                                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                             + unaff_x19 + 0x18) + 8))) {
code_r0x00791f14:
                if (0 < *(int *)(*in_stack_00000098 + 0xc)) {
                  func_0x0073cbdc();
                }
              }
            }
            goto code_r0x00791f3c;
          }
          if ((uVar5 & 1) != 0) goto code_r0x00791d68;
        }
        else {
code_r0x00791f3c:
          if ((uVar5 & 1) != 0) {
            if ((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) {
              if (*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18) == 0) {
                if (in_stack_00000098 != (long *)0x0) goto code_r0x00791f74;
              }
              else if ((in_stack_00000098 != (long *)0x0) &&
                      (0 < *(int *)(*(long *)(
                                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                             + unaff_x19 + 0x18) + 8))) {
code_r0x00791f74:
                if (0 < *(int *)(*in_stack_00000098 + 0xc)) {
                  func_0x0073cbdc();
                }
              }
            }
code_r0x00791d68:
            param_3 = (char *)&qStack00000000000000a0;
            goto code_r0x00792a90;
          }
        }
        *(undefined4 *)(unaff_x28 + 0xc4) = 0;
        uVar5 = func_0x00172b0c(uVar12);
      } while ((uVar5 & 1) != 0);
    }
    uStack0000000000000100 = 0;
    uStack00000000000000d8 = 0;
    func_0x00172d64(uVar12,&uStack0000000000000100,&uStack00000000000000d8);
    func_0x00795838(in_stack_00000098);
    param_3 = (char *)0x0;
    func_0x00791930(in_stack_00000098);
    puVar11 = (undefined *)(ulong)(uint)qStack00000000000000a0;
    if ((uint)qStack00000000000000a0 == 0) {
      func_0x00172db0(uVar12);
      uVar12 = func_0x00172e6c(uVar12);
      in_stack_00000128 = 0;
      in_stack_00000120 = 0;
      in_stack_00000138 = 0;
      in_stack_00000130 = 0;
      in_stack_00000108 = 0;
      uStack0000000000000100 = 0;
      in_stack_00000118 = 0;
      in_stack_00000110 = 0;
      unaff_x21 = (long *)((long)&MACH_HEADER.magic + 1);
      param_3 = (char *)&segment_command_00000020.vmsize;
      func_0x00790dc0(uVar12,&uStack0000000000000100,0x40,1);
      if (((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        func_0x0073cab8();
      }
      puVar11 = (undefined *)0x0;
      *(undefined4 *)(unaff_x28 + 0xb8) = 3;
      *in_stack_00000060 = 1;
      uVar5 = unaff_x28;
    }
    else {
      unaff_x21 = in_stack_00000098;
      uVar5 = unaff_x28;
      if ((uint)qStack00000000000000a0 == 0x51) {
        puVar11 = (undefined *)0x0;
        *(undefined4 *)(unaff_x28 + 0xc4) = 2;
      }
    }
  }
code_r0x007926e8:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return puVar11;
  }
  auVar13 = ___stack_chk_fail();
code_r0x00792a90:
  lStack_48 = *(long *)PTR____stack_chk_guard_009b01e8;
  lVar7 = *(long *)(*(long *)(auVar13._0_8_ + 0x10) + 0x40);
  puStack_160 = (undefined *)0x0;
  uStack_40 = uVar5;
  pcStack_38 = unaff_x27;
  uStack_30 = unaff_x22;
  plStack_28 = unaff_x21;
  puStack_20 = puVar11;
  auStack_158 = auVar13;
  uVar12 = func_0x00172474(*(undefined8 *)(lVar7 + 8),&DAT_00792bec,auStack_158,&puStack_160);
  if ((int)uVar12 == 0) {
    uVar12 = func_0x001728a0(*(undefined8 *)(lVar7 + 8));
    if ((int)uVar12 == 7000) {
      *(byte *)(lVar7 + 0x18) = *(byte *)(lVar7 + 0x18) | 1;
      *(undefined4 *)param_3 = 0;
      puVar11 = puStack_160;
      goto code_r0x00792bb0;
    }
    func_0x0017816c(uVar12,auStack_148,0xff,auStack_168);
    func_0x0073c9e4(auVar13._8_8_,"rustls_connection_process_new_packets: %.*s");
    iVar4 = func_0x00178d78(uVar12);
    uVar10 = 0x2b;
    if ((int)uVar12 != 0x1b5a) {
      uVar10 = 0x38;
    }
    uVar9 = 0x3c;
    if (iVar4 == 0) {
      uVar9 = uVar10;
    }
  }
  else if ((int)uVar12 == 0x23) {
    uVar9 = 0x51;
  }
  else {
    func_0x0077ea88(uVar12,auStack_148,0x100);
    func_0x0073c9e4(auVar13._8_8_,"reading from socket: %s");
    uVar9 = 0x38;
  }
  *(undefined4 *)param_3 = uVar9;
  puVar11 = (undefined *)0xffffffffffffffff;
code_r0x00792bb0:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_48) {
    return puVar11;
  }
  ___stack_chk_fail(puVar11);
  return &UNK_00001b58;
}

