
/* WARNING: Removing unreachable block (ram,0x0006c420) */
/* WARNING: Removing unreachable block (ram,0x0006c2f0) */
/* WARNING: Removing unreachable block (ram,0x0006bca4) */
/* WARNING: Removing unreachable block (ram,0x0006c408) */
/* WARNING: Removing unreachable block (ram,0x0006b7f8) */
/* WARNING: Removing unreachable block (ram,0x0006b20c) */

ulong FUN_0006bf58(void)

{
  undefined8 *puVar1;
  int iVar2;
  uint uVar3;
  byte *pbVar4;
  char *pcVar5;
  undefined1 *puVar6;
  ulong uVar7;
  code *pcVar8;
  int iVar9;
  uint uVar10;
  ulong uVar11;
  ulong uVar12;
  undefined8 uVar13;
  undefined1 *puVar14;
  undefined8 *puVar15;
  undefined2 in_w8;
  ulong uVar16;
  ulong extraout_x8;
  ulong extraout_x9;
  undefined1 *puVar17;
  byte extraout_w10;
  byte bVar18;
  ulong uVar19;
  byte *pbVar20;
  undefined8 *puVar21;
  ulong uVar22;
  long unaff_x19;
  ulong unaff_x20;
  undefined8 *unaff_x21;
  long *unaff_x22;
  bool bVar23;
  long lVar24;
  undefined8 *puVar25;
  ulong unaff_x24;
  long *plVar26;
  undefined8 *puVar27;
  long unaff_x29;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  byte *in_stack_00000000;
  code *in_stack_00000008;
  undefined8 *in_stack_00000010;
  code *in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 *in_stack_00000028;
  undefined8 *in_stack_00000030;
  undefined8 *in_stack_00000038;
  long in_stack_00000050;
  undefined8 *in_stack_00000058;
  char *in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 *in_stack_00000078;
  undefined8 *in_stack_00000080;
  undefined8 *in_stack_00000088;
  undefined8 *in_stack_00000090;
  undefined8 *in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 uStack00000000000000a8;
  ulong in_stack_000000b0;
  undefined7 uStack00000000000000b8;
  undefined8 uStack00000000000000c0;
  undefined8 *in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined1 uStack00000000000000d8;
  undefined7 uStack00000000000000d9;
  undefined1 uStack00000000000000e0;
  undefined8 uStack00000000000000e1;
  char in_stack_00000118;
  undefined1 in_stack_00000120;
  undefined8 in_stack_00000128;
  undefined8 uStack0000000000000138;
  undefined8 *in_stack_00000140;
  undefined8 uStack0000000000000150;
  undefined8 *in_stack_00000158;
  undefined7 uStack0000000000000160;
  char in_stack_000001a8;
  undefined1 in_stack_000001b0;
  undefined8 in_stack_000001b8;
  
code_r0x0006bf58:
  puVar27 = in_stack_00000140;
  *(undefined2 *)(unaff_x29 + -200) = in_w8;
  *(undefined8 *)(unaff_x29 + -0xd0) = s_filename__008d1fd6._0_8_;
  if (in_stack_00000140 == (undefined8 *)0x0) goto LAB_0006c2ac;
  puVar15 = in_stack_00000098;
  puVar21 = in_stack_00000140;
  do {
    while( true ) {
      puVar25 = puVar21;
      uVar11 = puVar25[5];
      puVar21 = (undefined8 *)puVar25[4];
      if (-1 < (char)*(byte *)((long)puVar25 + 0x37)) {
        uVar11 = (ulong)*(byte *)((long)puVar25 + 0x37);
        puVar21 = puVar25 + 4;
      }
      uVar16 = uVar11;
      if (8 < uVar11) {
        uVar16 = 9;
      }
      iVar9 = _memcmp(puVar21,unaff_x29 + -0xd0,uVar16);
      if (iVar9 != 0) break;
      if (8 < uVar11) goto LAB_0006bfd4;
LAB_0006bf80:
      puVar1 = puVar25 + 1;
      puVar25 = puVar15;
      puVar21 = (undefined8 *)*puVar1;
      if ((undefined8 *)*puVar1 == (undefined8 *)0x0) goto LAB_0006bfe0;
    }
    if (iVar9 < 0) goto LAB_0006bf80;
LAB_0006bfd4:
    puVar15 = puVar25;
    puVar21 = (undefined8 *)*puVar25;
  } while ((undefined8 *)*puVar25 != (undefined8 *)0x0);
LAB_0006bfe0:
  if (puVar25 == in_stack_00000098) goto LAB_0006c2ac;
  uVar11 = puVar25[5];
  puVar15 = (undefined8 *)puVar25[4];
  if (-1 < (char)*(byte *)((long)puVar25 + 0x37)) {
    uVar11 = (ulong)*(byte *)((long)puVar25 + 0x37);
    puVar15 = puVar25 + 4;
  }
  uVar16 = uVar11;
  if (8 < uVar11) {
    uVar16 = 9;
  }
  iVar9 = _memcmp(unaff_x29 + -0xd0,puVar15,uVar16);
  pcVar8 = pcRam0000000000a2ba30;
  if (iVar9 == 0) {
    if (9 < uVar11) goto LAB_0006c2ac;
  }
  else if (iVar9 < 0) goto LAB_0006c2ac;
  pbVar20 = (byte *)(*pcRam0000000000a2ba30)();
  if ((*pbVar20 & 1) == 0) {
    uVar13 = (*in_stack_00000008)(0xa2ba18);
    func_0x0002acdc(uVar13,"^UTF-8\'\'(.+?)$",1);
    uVar13 = (*in_stack_00000008)(0xa2ba18);
    __tlv_atexit(&DAT_0002ac7c,uVar13,0);
    puVar14 = (undefined1 *)(*pcVar8)(0xa2ba30);
    *puVar14 = 1;
  }
  *(undefined1 *)(in_stack_00000030 + 2) = 0;
  *in_stack_00000030 = 0;
  in_stack_00000030[1] = 0;
  *in_stack_00000028 = 0;
  in_stack_00000028[1] = 0;
  *(undefined1 *)(in_stack_00000028 + 2) = 0;
  in_stack_00000120 = 0;
  in_stack_00000128 = 0;
  in_stack_000000c8 = (undefined8 *)0x0;
  uStack00000000000000c0 = (undefined8 *)0x0;
  uStack00000000000000d8 = 0;
  in_stack_000000d0 = 0;
  uStack00000000000000e1 = 0;
  uStack00000000000000d9 = 0;
  uStack00000000000000e0 = 0;
  uVar11 = puVar25[8];
  puVar27 = (undefined8 *)puVar25[7];
  if (-1 < (char)*(byte *)((long)puVar25 + 0x4f)) {
    uVar11 = (ulong)*(byte *)((long)puVar25 + 0x4f);
    puVar27 = puVar25 + 7;
  }
  *in_stack_00000090 = 0;
  in_stack_00000090[1] = 0;
  *(undefined1 *)(in_stack_00000090 + 2) = 0;
  *in_stack_00000088 = 0;
  in_stack_00000088[1] = 0;
  *(undefined1 *)(in_stack_00000088 + 2) = 0;
  *(undefined1 *)(unaff_x29 + -0x70) = 0;
  *(undefined8 *)(unaff_x29 + -0x68) = 0;
  unaff_x21[0x13] = 0;
  unaff_x21[0x12] = 0;
  unaff_x21[0x15] = 0;
  unaff_x21[0x14] = 0;
  *(undefined8 *)((long)unaff_x21 + 0xb1) = 0;
  *(undefined8 *)((long)unaff_x21 + 0xa9) = 0;
  uVar10 = func_0x00034500(in_stack_00000020,puVar27,(long)puVar27 + uVar11,unaff_x29 + -0xd0,
                           &dylib_command_00001040);
  func_0x0003732c(&uStack00000000000000c0,puVar27,(long)puVar27 + uVar11,unaff_x29 + -0xd0,0);
  if (*(long *)(unaff_x29 + -0xd0) != 0) {
    *(long *)(unaff_x29 + -200) = *(long *)(unaff_x29 + -0xd0);
    __ZdlPv();
  }
  uVar3 = 0;
  if (in_stack_00000118 == '\0') {
    uVar3 = uVar10;
  }
  if (uVar3 == 1) {
    puVar27 = uStack00000000000000c0;
    if ((ulong)(((long)in_stack_000000c8 - (long)uStack00000000000000c0 >> 3) * -0x5555555555555555)
        < 2) {
      puVar27 = &uStack00000000000000c0;
    }
    if (*(char *)(puVar27 + 5) == '\0') {
      uStack00000000000000a8 = (undefined8 *)0x0;
      in_stack_000000b0 = 0;
      _uStack00000000000000b8 = 0;
    }
    else {
      puVar14 = (undefined1 *)puVar27[3];
      puVar6 = (undefined1 *)puVar27[4];
      uVar11 = (long)puVar6 - (long)puVar14;
      if (0x7ffffffffffffff7 < uVar11) {
LAB_0006c774:
        func_0x0001748c(&uStack00000000000000a8);
LAB_0006c794:
                    /* WARNING: Does not return */
        pcVar8 = (code *)SoftwareBreakpoint(1,0x6c798);
        (*pcVar8)();
      }
      if (uVar11 < 0x17) {
        _uStack00000000000000b8 = CONCAT17((char)uVar11,uStack00000000000000b8);
        puVar27 = &uStack00000000000000a8;
      }
      else {
        uVar16 = (uVar11 & 0xfffffffffffffff8) + 8;
        if ((uVar11 | 7) != 0x17) {
          uVar16 = uVar11 | 7;
        }
        puVar27 = (undefined8 *)__Znwm(uVar16 + 1);
        _uStack00000000000000b8 = uVar16 + 1 | 0x8000000000000000;
        uStack00000000000000a8 = puVar27;
        in_stack_000000b0 = uVar11;
      }
      if (puVar14 == puVar6) {
        *(undefined1 *)puVar27 = 0;
      }
      else {
        if ((uVar11 < 0x40) || ((ulong)((long)puVar27 - (long)puVar14) < 0x40)) {
LAB_0006c22c:
          do {
            puVar17 = puVar14 + 1;
            puVar15 = (undefined8 *)((long)puVar27 + 1);
            *(undefined1 *)puVar27 = *puVar14;
            puVar27 = puVar15;
            puVar14 = puVar17;
          } while (puVar17 != puVar6);
        }
        else {
          uVar19 = uVar11 & 0xffffffffffffffc0;
          puVar15 = (undefined8 *)((long)puVar27 + uVar19);
          puVar27 = puVar27 + 4;
          puVar21 = (undefined8 *)(puVar14 + 0x20);
          uVar16 = uVar19;
          do {
            uVar13 = puVar21[-4];
            uVar29 = puVar21[-1];
            uVar28 = puVar21[-2];
            uVar31 = puVar21[1];
            uVar30 = *puVar21;
            uVar33 = puVar21[3];
            uVar32 = puVar21[2];
            puVar27[-3] = puVar21[-3];
            puVar27[-4] = uVar13;
            puVar27[-1] = uVar29;
            puVar27[-2] = uVar28;
            puVar27[1] = uVar31;
            *puVar27 = uVar30;
            puVar27[3] = uVar33;
            puVar27[2] = uVar32;
            uVar16 = uVar16 - 0x40;
            puVar27 = puVar27 + 8;
            puVar21 = puVar21 + 8;
          } while (uVar16 != 0);
          puVar27 = puVar15;
          puVar14 = puVar14 + uVar19;
          if (uVar11 != uVar19) goto LAB_0006c22c;
        }
        *(undefined1 *)puVar15 = 0;
      }
    }
    func_0x00060210(unaff_x29 + -0xd0,&uStack00000000000000a8,0);
    if (*(char *)(unaff_x19 + 0xcf) < '\0') {
      __ZdlPv(*in_stack_00000038);
    }
    uVar13 = unaff_x21[0x12];
    in_stack_00000038[1] = unaff_x21[0x13];
    *in_stack_00000038 = uVar13;
    in_stack_00000038[2] = *(undefined8 *)(unaff_x29 + -0xc0);
    *(undefined1 *)(unaff_x29 + -0xb9) = 0;
    *(undefined1 *)(unaff_x29 + -0xd0) = 0;
    if ((long)_uStack00000000000000b8 < 0) {
      __ZdlPv(uStack00000000000000a8);
    }
  }
  else {
    in_stack_000000a0._4_4_ = 0;
    *(undefined1 *)(unaff_x19 + 0x80) = 0;
  }
  if (uStack00000000000000c0 != (undefined8 *)0x0) {
    in_stack_000000c8 = uStack00000000000000c0;
    __ZdlPv();
  }
  puVar27 = in_stack_00000140;
  if ((uVar3 & 1) == 0) goto LAB_0006bdbc;
LAB_0006c2ac:
  func_0x00056a34(&uStack0000000000000138,puVar27);
code_r0x0006c2b8:
  bVar23 = true;
  if (uStack0000000000000150 == (undefined8 *)0x0) goto LAB_0006c2cc;
code_r0x0006c2c4:
  in_stack_00000158 = uStack0000000000000150;
  __ZdlPv();
LAB_0006c2cc:
  if (!bVar23) {
    bVar23 = false;
    goto LAB_0006b800;
  }
code_r0x0006c2d0:
  bVar18 = *(byte *)(unaff_x19 + 0x2f);
  if ((char)bVar18 < '\0') {
    uVar11 = *(ulong *)(unaff_x19 + 0x20);
  }
  else {
    uVar11 = (ulong)bVar18;
  }
  uVar16 = *(ulong *)(unaff_x19 + 0x108);
  uVar11 = uVar11 + unaff_x20 + *(long *)(unaff_x19 + 0x100);
  *(ulong *)(unaff_x19 + 0x100) = uVar11;
  pcVar5 = *(char **)(unaff_x19 + 0x18);
  if (-1 < (char)bVar18) {
    pcVar5 = in_stack_00000068;
  }
  if (uVar11 < uVar16) {
    uVar19 = *(ulong *)(unaff_x19 + 0x20);
    if (-1 < (char)bVar18) {
      uVar19 = (ulong)bVar18;
    }
    uVar22 = uVar11;
    do {
      if (*(char *)(unaff_x19 + 0xff) < '\0') {
        while (*(char *)(*unaff_x22 + uVar22) != *pcVar5) {
          uVar22 = uVar22 + 1;
          if (uVar16 == uVar22) goto LAB_0006c3f8;
        }
      }
      else {
        while (*(char *)((long)unaff_x22 + uVar22) != *pcVar5) {
          uVar22 = uVar22 + 1;
          if (uVar16 == uVar22) goto LAB_0006c3f8;
        }
      }
      if (uVar16 - uVar22 <= uVar19 - 1) {
        if (uVar19 <= uVar16 - uVar22) {
          uVar16 = uVar22;
        }
        break;
      }
      plVar26 = *(long **)(unaff_x19 + 0xe8);
      if (-1 < *(char *)(unaff_x19 + 0xff)) {
        plVar26 = unaff_x22;
      }
      if (*(char *)((long)plVar26 + uVar22) == *pcVar5) {
        uVar7 = 1;
        do {
          uVar12 = uVar7;
          if (uVar19 == uVar12) break;
          uVar7 = uVar12 + 1;
        } while (*(char *)((long)plVar26 + uVar12 + uVar22) == pcVar5[uVar12]);
        if (uVar19 <= uVar12) {
          unaff_x20 = uVar22 - uVar11;
          bVar23 = true;
          goto LAB_0006b800;
        }
      }
      uVar22 = uVar22 + 1;
    } while (uVar22 < uVar16);
  }
LAB_0006c3f8:
  unaff_x20 = uVar16 - uVar11;
  bVar23 = true;
LAB_0006b800:
  do {
    if (!bVar23) goto code_r0x0006c720;
    uVar11 = *(ulong *)(unaff_x19 + 0x100);
    if (*(long *)(unaff_x19 + 0x108) - uVar11 <= unaff_x20) {
      if (*(long *)(unaff_x19 + 0x78) == 3) goto code_r0x0006b210;
code_r0x0006c718:
      in_stack_000000a0._4_4_ = 1;
code_r0x0006c720:
      return (ulong)(in_stack_000000a0._4_4_ & 1);
    }
    if (unaff_x20 == 0) {
      plVar26 = *(long **)(in_stack_00000050 + 0x18);
      if (plVar26 != (long *)0x0) {
        uVar11 = (**(code **)(*plVar26 + 0x30))(plVar26,in_stack_00000058);
        if ((uVar11 & 1) == 0) {
          in_stack_000000a0._4_4_ = 0;
          *(undefined1 *)(unaff_x19 + 0x80) = 0;
          goto code_r0x0006c720;
        }
        if ((char)*(byte *)(unaff_x19 + 0x2f) < '\0') {
          uVar11 = *(ulong *)(unaff_x19 + 0x20);
        }
        else {
          uVar11 = (ulong)*(byte *)(unaff_x19 + 0x2f);
        }
        uVar11 = *(long *)(unaff_x19 + 0x100) + uVar11;
        *(ulong *)(unaff_x19 + 0x100) = uVar11;
        *(undefined8 *)(unaff_x19 + 0x78) = 3;
code_r0x0006b210:
        if (*(ulong *)(unaff_x19 + 0x108) != uVar11) {
                    /* WARNING: Could not recover jumptable at 0x0006b238. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          uVar11 = (*(code *)(&UNK_0006b23c + (ulong)UNK_007fc7fc * 4))();
          return uVar11;
        }
        goto code_r0x0006c718;
      }
      func_0x00056004();
      goto LAB_0006c774;
    }
    if ((char)*(byte *)(unaff_x19 + 0xff) < '\0') {
      uVar16 = *(ulong *)(unaff_x19 + 0xf0);
      if (uVar11 <= uVar16) {
        plVar26 = (long *)*unaff_x22;
        goto code_r0x0006b844;
      }
code_r0x0006c754:
      func_0x00049dd0(unaff_x29 + -0xe8);
code_r0x0006c75c:
      func_0x0001748c(unaff_x29 + -0xe8);
      goto code_r0x0006c764;
    }
    uVar16 = (ulong)*(byte *)(unaff_x19 + 0xff);
    plVar26 = unaff_x22;
    if (uVar16 < uVar11) goto code_r0x0006c754;
code_r0x0006b844:
    uVar19 = uVar16 - uVar11;
    if (unaff_x20 <= uVar16 - uVar11) {
      uVar19 = unaff_x20;
    }
    if (0x7ffffffffffffff7 < uVar19) goto code_r0x0006c75c;
    if (uVar19 < 0x17) {
      *(char *)(unaff_x29 + -0xd1) = (char)uVar19;
      lVar24 = unaff_x29 + -0xe8;
      if (uVar19 != 0) goto code_r0x0006b8a8;
    }
    else {
      uVar16 = (uVar19 & 0xfffffffffffffff8) + 8;
      if ((uVar19 | 7) != 0x17) {
        uVar16 = uVar19 | 7;
      }
      lVar24 = __Znwm(uVar16 + 1);
      *(ulong *)(unaff_x29 + -0xe0) = uVar19;
      *(ulong *)(unaff_x29 + -0xd8) = uVar16 + 1 | 0x8000000000000000;
      *(long *)(unaff_x29 + -0xe8) = lVar24;
code_r0x0006b8a8:
      _memmove(lVar24,(long)plVar26 + uVar11,uVar19);
    }
    *(undefined1 *)(lVar24 + uVar19) = 0;
    uVar11 = *(ulong *)(unaff_x29 + -0xe0);
    lVar24 = *(long *)(unaff_x29 + -0xe8);
    if (-1 < (char)*(byte *)(unaff_x29 + -0xd1)) {
      uVar11 = (ulong)*(byte *)(unaff_x29 + -0xd1);
      lVar24 = unaff_x29 + -0xe8;
    }
    uVar11 = func_0x0006c99c(lVar24,lVar24 + uVar11);
    pcVar8 = pcRam0000000000a2ba00;
    if ((uVar11 & 1) != 0) break;
    bVar23 = false;
    in_stack_000000a0._4_4_ = 0;
    *(undefined1 *)(unaff_x19 + 0x80) = 0;
  } while( true );
  bVar18 = *(byte *)(unaff_x29 + -0xd1);
  uVar16 = *(ulong *)(unaff_x29 + -0xe0);
  uVar11 = uVar16;
  if (-1 < (char)bVar18) {
    uVar11 = (ulong)bVar18;
  }
  if (uVar11 < 0xd) goto code_r0x0006ba94;
  pbVar20 = *(byte **)(unaff_x29 + -0xe8);
  pbVar4 = pbVar20;
  if (-1 < (char)bVar18) {
    pbVar4 = (byte *)(unaff_x29 + -0xe8);
  }
  if ((*pbVar4 & 0xdf) != 0x43) goto code_r0x0006ba94;
  pbVar4 = pbVar20;
  if (-1 < (char)bVar18) {
    pbVar4 = (byte *)(unaff_x29 + -0xe8);
  }
  if ((pbVar4[1] & 0xdf) != 0x4f) goto code_r0x0006ba94;
  pbVar4 = pbVar20;
  if (-1 < (char)bVar18) {
    pbVar4 = (byte *)(unaff_x29 + -0xe8);
  }
  if ((pbVar4[2] & 0xdf) != 0x4e) goto code_r0x0006ba94;
  pbVar4 = pbVar20;
  if (-1 < (char)bVar18) {
    pbVar4 = (byte *)(unaff_x29 + -0xe8);
  }
  if ((pbVar4[3] & 0xdf) != 0x54) goto code_r0x0006ba94;
  pbVar4 = pbVar20;
  if (-1 < (char)bVar18) {
    pbVar4 = (byte *)(unaff_x29 + -0xe8);
  }
  if ((pbVar4[4] & 0xdf) != 0x45) goto code_r0x0006ba94;
  pbVar4 = pbVar20;
  if (-1 < (char)bVar18) {
    pbVar4 = (byte *)(unaff_x29 + -0xe8);
  }
  if ((pbVar4[5] & 0xdf) != 0x4e) goto code_r0x0006ba94;
  pbVar4 = pbVar20;
  if (-1 < (char)bVar18) {
    pbVar4 = (byte *)(unaff_x29 + -0xe8);
  }
  if ((pbVar4[6] & 0xdf) != 0x54) goto code_r0x0006ba94;
  pbVar4 = pbVar20;
  if (-1 < (char)bVar18) {
    pbVar4 = (byte *)(unaff_x29 + -0xe8);
  }
  if (pbVar4[7] != 0x2d) goto code_r0x0006ba94;
  pbVar4 = pbVar20;
  if (-1 < (char)bVar18) {
    pbVar4 = (byte *)(unaff_x29 + -0xe8);
  }
  if ((pbVar4[8] & 0xdf) != 0x54) goto code_r0x0006ba94;
  pbVar4 = pbVar20;
  if (-1 < (char)bVar18) {
    pbVar4 = (byte *)(unaff_x29 + -0xe8);
  }
  if ((pbVar4[9] & 0xdf) != 0x59) goto code_r0x0006ba94;
  pbVar4 = pbVar20;
  if (-1 < (char)bVar18) {
    pbVar4 = (byte *)(unaff_x29 + -0xe8);
  }
  if ((pbVar4[10] & 0xdf) != 0x50) goto code_r0x0006ba94;
  pbVar4 = pbVar20;
  if (-1 < (char)bVar18) {
    pbVar4 = (byte *)(unaff_x29 + -0xe8);
  }
  if ((pbVar4[0xb] & 0xdf) != 0x45) goto code_r0x0006ba94;
  pbVar4 = pbVar20;
  if (-1 < (char)bVar18) {
    pbVar4 = (byte *)(unaff_x29 + -0xe8);
  }
  if (pbVar4[0xc] != 0x3a) goto code_r0x0006ba94;
  if ((char)bVar18 < '\0') {
    if (uVar16 < 0xd) goto code_r0x0006c780;
    pbVar20 = pbVar20 + 0xd;
  }
  else {
    uVar16 = (ulong)bVar18;
    pbVar20 = in_stack_00000000;
    if (bVar18 < 0xd) {
code_r0x0006c780:
      func_0x00049dd0(&uStack0000000000000150);
      goto LAB_0006c794;
    }
  }
  puVar27 = (undefined8 *)(uVar16 - 0xd);
  if ((undefined8 *)0x7ffffffffffffff7 < puVar27) {
    func_0x0001748c(&uStack0000000000000150);
    goto LAB_0006c794;
  }
  if ((undefined8 *)((long)&MACH_HEADER.sizeofcmds + 2) < puVar27) {
    uVar11 = ((ulong)puVar27 & 0xfffffffffffffff8) + 8;
    if (((ulong)puVar27 | 7) != 0x17) {
      uVar11 = (ulong)puVar27 | 7;
    }
    puVar15 = (undefined8 *)__Znwm(uVar11 + 1);
    _uStack0000000000000160 = uVar11 + 1 | 0x8000000000000000;
    uStack0000000000000150 = puVar15;
    in_stack_00000158 = puVar27;
  }
  else {
    _uStack0000000000000160 = CONCAT17((char)puVar27,uStack0000000000000160);
    puVar15 = &uStack0000000000000150;
    if (puVar27 == (undefined8 *)0x0) goto code_r0x0006c568;
  }
  _memmove(puVar15,pbVar20,puVar27);
code_r0x0006c568:
  *(undefined1 *)((long)puVar15 + (long)puVar27) = 0;
  func_0x0006cf30(unaff_x29 + -0xd0,&uStack0000000000000150);
  if (*(char *)(unaff_x19 + 0xe7) < '\0') {
    __ZdlPv(*in_stack_00000010);
  }
  uVar13 = unaff_x21[0x12];
  in_stack_00000010[1] = unaff_x21[0x13];
  *in_stack_00000010 = uVar13;
  in_stack_00000010[2] = *(undefined8 *)(unaff_x29 + -0xc0);
  *(undefined1 *)(unaff_x29 + -0xb9) = 0;
  *(undefined1 *)(unaff_x29 + -0xd0) = 0;
  if ((long)_uStack0000000000000160 < 0) {
    __ZdlPv(uStack0000000000000150);
  }
  goto code_r0x0006c2d0;
code_r0x0006ba94:
  pbVar20 = (byte *)(*pcRam0000000000a2ba00)();
  uVar16 = extraout_x8;
  uVar11 = extraout_x9;
  bVar18 = extraout_w10;
  if ((*pbVar20 & 1) == 0) {
    uVar13 = (*in_stack_00000018)(0xa2b9e8);
    func_0x0002acdc(uVar13,"^Content-Disposition:\\s*form-data;\\s*(.*)$",1);
    uVar13 = (*in_stack_00000018)(0xa2b9e8);
    __tlv_atexit(&DAT_0002ac7c,uVar13,0);
    puVar14 = (undefined1 *)(*pcVar8)(0xa2ba00);
    *puVar14 = 1;
    bVar18 = *(byte *)(unaff_x29 + -0xd1);
    uVar16 = (ulong)bVar18;
    uVar11 = *(ulong *)(unaff_x29 + -0xe0);
  }
  *in_stack_00000080 = 0;
  in_stack_00000080[1] = 0;
  *(undefined1 *)(in_stack_00000080 + 2) = 0;
  *in_stack_00000078 = 0;
  in_stack_00000078[1] = 0;
  *(undefined1 *)(in_stack_00000078 + 2) = 0;
  in_stack_000001b0 = 0;
  in_stack_000001b8 = 0;
  unaff_x21[1] = 0;
  *unaff_x21 = 0;
  unaff_x21[3] = 0;
  unaff_x21[2] = 0;
  *(undefined8 *)((long)unaff_x21 + 0x21) = 0;
  *(undefined8 *)((long)unaff_x21 + 0x19) = 0;
  lVar24 = *(long *)(unaff_x29 + -0xe8);
  if (-1 < (char)bVar18) {
    uVar11 = uVar16;
    lVar24 = unaff_x29 + -0xe8;
  }
  *in_stack_00000090 = 0;
  in_stack_00000090[1] = 0;
  *(undefined1 *)(in_stack_00000090 + 2) = 0;
  *in_stack_00000088 = 0;
  in_stack_00000088[1] = 0;
  *(undefined1 *)(in_stack_00000088 + 2) = 0;
  *(undefined1 *)(unaff_x29 + -0x70) = 0;
  *(undefined8 *)(unaff_x29 + -0x68) = 0;
  unaff_x21[0x13] = 0;
  unaff_x21[0x12] = 0;
  unaff_x21[0x15] = 0;
  unaff_x21[0x14] = 0;
  *(undefined8 *)((long)unaff_x21 + 0xb1) = 0;
  *(undefined8 *)((long)unaff_x21 + 0xa9) = 0;
  iVar9 = func_0x00034500(in_stack_00000070,lVar24,lVar24 + uVar11,unaff_x29 + -0xd0,
                          &dylib_command_00001040);
  func_0x0003732c(&uStack0000000000000150,lVar24,lVar24 + uVar11,unaff_x29 + -0xd0,0);
  if (*(long *)(unaff_x29 + -0xd0) != 0) {
    *(long *)(unaff_x29 + -200) = *(long *)(unaff_x29 + -0xd0);
    __ZdlPv();
  }
  iVar2 = 0;
  if (in_stack_000001a8 == '\0') {
    iVar2 = iVar9;
  }
  if (iVar2 != 1) goto code_r0x0006c2b8;
  *in_stack_00000098 = 0;
  in_stack_00000098[1] = 0;
  uStack0000000000000138 = in_stack_00000098;
  puVar27 = uStack0000000000000150;
  if ((ulong)(((long)in_stack_00000158 - (long)uStack0000000000000150 >> 3) * -0x5555555555555555) <
      2) {
    puVar27 = unaff_x21;
  }
  if (*(char *)(puVar27 + 5) == '\0') {
    *(undefined8 *)(unaff_x29 + -0xd0) = 0;
    *(undefined8 *)(unaff_x29 + -200) = 0;
    *(undefined8 *)(unaff_x29 + -0xc0) = 0;
    goto code_r0x0006bc90;
  }
  puVar14 = (undefined1 *)puVar27[3];
  puVar6 = (undefined1 *)puVar27[4];
  uVar11 = (long)puVar6 - (long)puVar14;
  if (0x7ffffffffffffff7 < uVar11) {
code_r0x0006c764:
    func_0x0001748c(unaff_x29 + -0xd0);
    goto LAB_0006c794;
  }
  if (uVar11 < 0x17) {
    *(char *)(unaff_x29 + -0xb9) = (char)uVar11;
    puVar27 = (undefined8 *)(unaff_x29 + -0xd0);
  }
  else {
    uVar16 = (uVar11 & 0xfffffffffffffff8) + 8;
    if ((uVar11 | 7) != 0x17) {
      uVar16 = uVar11 | 7;
    }
    puVar27 = (undefined8 *)__Znwm(uVar16 + 1);
    *(ulong *)(unaff_x29 + -200) = uVar11;
    *(ulong *)(unaff_x29 + -0xc0) = uVar16 + 1 | 0x8000000000000000;
    *(undefined8 **)(unaff_x29 + -0xd0) = puVar27;
  }
  if (puVar14 == puVar6) {
    *(undefined1 *)puVar27 = 0;
    goto code_r0x0006bc90;
  }
  if ((uVar11 < 0x40) || ((ulong)((long)puVar27 - (long)puVar14) < 0x40)) {
code_r0x0006bc7c:
    do {
      puVar17 = puVar14 + 1;
      puVar15 = (undefined8 *)((long)puVar27 + 1);
      *(undefined1 *)puVar27 = *puVar14;
      puVar27 = puVar15;
      puVar14 = puVar17;
    } while (puVar17 != puVar6);
  }
  else {
    uVar19 = uVar11 & 0xffffffffffffffc0;
    puVar15 = (undefined8 *)((long)puVar27 + uVar19);
    puVar27 = puVar27 + 4;
    puVar21 = (undefined8 *)(puVar14 + 0x20);
    uVar16 = uVar19;
    do {
      uVar13 = puVar21[-4];
      uVar29 = puVar21[-1];
      uVar28 = puVar21[-2];
      uVar31 = puVar21[1];
      uVar30 = *puVar21;
      uVar33 = puVar21[3];
      uVar32 = puVar21[2];
      puVar27[-3] = puVar21[-3];
      puVar27[-4] = uVar13;
      puVar27[-1] = uVar29;
      puVar27[-2] = uVar28;
      puVar27[1] = uVar31;
      *puVar27 = uVar30;
      puVar27[3] = uVar33;
      puVar27[2] = uVar32;
      uVar16 = uVar16 - 0x40;
      puVar27 = puVar27 + 8;
      puVar21 = puVar21 + 8;
    } while (uVar16 != 0);
    puVar27 = puVar15;
    puVar14 = puVar14 + uVar19;
    if (uVar11 != uVar19) goto code_r0x0006bc7c;
  }
  *(undefined1 *)puVar15 = 0;
  puVar27 = puVar15;
code_r0x0006bc90:
  func_0x0006d094(puVar27,unaff_x29 + -0xd0,&uStack0000000000000138);
  puVar27 = in_stack_00000140;
  *(char *)(unaff_x29 + -0xb9) = (char)unaff_x24;
  *(undefined4 *)(unaff_x29 + -0xd0) = 0x656d616e;
  *(undefined1 *)(unaff_x29 + -0xcc) = 0;
  if (in_stack_00000140 != (undefined8 *)0x0) {
    puVar15 = in_stack_00000098;
    puVar21 = in_stack_00000140;
    do {
      while( true ) {
        puVar25 = puVar21;
        uVar11 = puVar25[5];
        puVar21 = (undefined8 *)puVar25[4];
        if (-1 < (char)*(byte *)((long)puVar25 + 0x37)) {
          uVar11 = (ulong)*(byte *)((long)puVar25 + 0x37);
          puVar21 = puVar25 + 4;
        }
        uVar16 = uVar11;
        if (3 < uVar11) {
          uVar16 = unaff_x24;
        }
        iVar9 = _memcmp(puVar21,unaff_x29 + -0xd0,uVar16);
        if (iVar9 != 0) break;
        if (3 < uVar11) goto code_r0x0006bd24;
code_r0x0006bcd4:
        puVar1 = puVar25 + 1;
        puVar25 = puVar15;
        puVar21 = (undefined8 *)*puVar1;
        if ((undefined8 *)*puVar1 == (undefined8 *)0x0) goto code_r0x0006bd30;
      }
      if (iVar9 < 0) goto code_r0x0006bcd4;
code_r0x0006bd24:
      puVar15 = puVar25;
      puVar21 = (undefined8 *)*puVar25;
    } while ((undefined8 *)*puVar25 != (undefined8 *)0x0);
code_r0x0006bd30:
    if (puVar25 != in_stack_00000098) {
      uVar11 = puVar25[5];
      puVar15 = (undefined8 *)puVar25[4];
      if (-1 < (char)*(byte *)((long)puVar25 + 0x37)) {
        uVar11 = (ulong)*(byte *)((long)puVar25 + 0x37);
        puVar15 = puVar25 + 4;
      }
      uVar16 = uVar11;
      if (3 < uVar11) {
        uVar16 = unaff_x24;
      }
      iVar9 = _memcmp(unaff_x29 + -0xd0,puVar15,uVar16);
      if (iVar9 == 0) {
        if (uVar11 < 5) {
code_r0x0006bd74:
          puVar27 = puVar25 + 7;
          if (in_stack_00000058 != puVar27) {
            bVar18 = *(byte *)((long)puVar25 + 0x4f);
            if (*(char *)(unaff_x19 + 0x9f) < '\0') {
              uVar11 = puVar25[8];
              puVar15 = (undefined8 *)puVar25[7];
              if (-1 < (char)bVar18) {
                uVar11 = (ulong)bVar18;
                puVar15 = puVar27;
              }
              func_0x00017784(in_stack_00000058,puVar15,uVar11);
            }
            else if ((char)bVar18 < '\0') {
              func_0x000176c0(in_stack_00000058,puVar25[7],puVar25[8]);
            }
            else {
              uVar28 = puVar25[8];
              uVar13 = *puVar27;
              in_stack_00000058[2] = puVar25[9];
              in_stack_00000058[1] = uVar28;
              *in_stack_00000058 = uVar13;
            }
          }
          *(undefined1 *)(unaff_x29 + -0xb9) = 8;
          *(undefined8 *)(unaff_x29 + -0xd0) = 0x656d616e656c6966;
          *(undefined1 *)(unaff_x29 + -200) = 0;
          if (in_stack_00000140 == (undefined8 *)0x0) goto code_r0x0006bf4c;
          puVar27 = in_stack_00000098;
          puVar15 = in_stack_00000140;
          goto code_r0x0006be40;
        }
      }
      else if (-1 < iVar9) goto code_r0x0006bd74;
    }
  }
  in_stack_000000a0._4_4_ = 0;
  *(undefined1 *)(unaff_x19 + 0x80) = 0;
LAB_0006bdbc:
  func_0x00056a34(&uStack0000000000000138,puVar27);
  bVar23 = false;
  if (uStack0000000000000150 != (undefined8 *)0x0) goto code_r0x0006c2c4;
  goto LAB_0006c2cc;
code_r0x0006be40:
  do {
    puVar21 = puVar15;
    uVar11 = puVar21[5];
    puVar15 = (undefined8 *)puVar21[4];
    if (-1 < (char)*(byte *)((long)puVar21 + 0x37)) {
      uVar11 = (ulong)*(byte *)((long)puVar21 + 0x37);
      puVar15 = puVar21 + 4;
    }
    uVar16 = uVar11;
    if (7 < uVar11) {
      uVar16 = 8;
    }
    iVar9 = _memcmp(puVar15,unaff_x29 + -0xd0,uVar16);
    if (iVar9 == 0) {
      if (7 < uVar11) goto code_r0x0006be88;
code_r0x0006be34:
      puVar25 = puVar21 + 1;
      puVar21 = puVar27;
      puVar15 = (undefined8 *)*puVar25;
      if ((undefined8 *)*puVar25 == (undefined8 *)0x0) break;
      goto code_r0x0006be40;
    }
    if (iVar9 < 0) goto code_r0x0006be34;
code_r0x0006be88:
    puVar27 = puVar21;
    puVar15 = (undefined8 *)*puVar21;
  } while ((undefined8 *)*puVar21 != (undefined8 *)0x0);
  if (puVar21 != in_stack_00000098) {
    uVar11 = puVar21[5];
    puVar27 = (undefined8 *)puVar21[4];
    if (-1 < (char)*(byte *)((long)puVar21 + 0x37)) {
      uVar11 = (ulong)*(byte *)((long)puVar21 + 0x37);
      puVar27 = puVar21 + 4;
    }
    uVar16 = uVar11;
    if (7 < uVar11) {
      uVar16 = 8;
    }
    iVar9 = _memcmp(unaff_x29 + -0xd0,puVar27,uVar16);
    if (iVar9 == 0) {
      if (8 < uVar11) goto code_r0x0006bf4c;
    }
    else if (iVar9 < 0) goto code_r0x0006bf4c;
    puVar27 = puVar21 + 7;
    if (in_stack_00000038 != puVar27) {
      bVar18 = *(byte *)((long)puVar21 + 0x4f);
      if (*(char *)(unaff_x19 + 0xcf) < '\0') {
        uVar11 = puVar21[8];
        puVar15 = (undefined8 *)puVar21[7];
        if (-1 < (char)bVar18) {
          uVar11 = (ulong)bVar18;
          puVar15 = puVar27;
        }
        func_0x00017784(in_stack_00000038,puVar15,uVar11);
      }
      else if ((char)bVar18 < '\0') {
        func_0x000176c0(in_stack_00000038,puVar21[7],puVar21[8]);
      }
      else {
        uVar28 = puVar21[8];
        uVar13 = *puVar27;
        in_stack_00000038[2] = puVar21[9];
        in_stack_00000038[1] = uVar28;
        *in_stack_00000038 = uVar13;
      }
    }
  }
code_r0x0006bf4c:
  *(undefined1 *)(unaff_x29 + -0xb9) = 9;
  in_w8 = 0x2a;
  goto code_r0x0006bf58;
}

