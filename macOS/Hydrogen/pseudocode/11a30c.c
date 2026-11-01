
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

uint FUN_0011a30c(void)

{
  undefined *puVar1;
  undefined8 *puVar2;
  bool bVar3;
  byte bVar4;
  ushort uVar5;
  char cVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  bool bVar19;
  bool bVar20;
  bool bVar21;
  bool bVar22;
  bool bVar23;
  bool bVar24;
  byte bVar25;
  int iVar26;
  uint uVar27;
  int iVar28;
  int iVar29;
  undefined4 uVar30;
  uint uVar31;
  uint uVar32;
  uint uVar33;
  uint uVar34;
  undefined8 uVar35;
  long lVar36;
  ulong uVar37;
  ushort *puVar38;
  ushort *puVar39;
  ushort *puVar40;
  undefined8 uVar41;
  undefined2 *puVar42;
  undefined8 uVar43;
  short sVar44;
  int iVar45;
  char *pcVar46;
  ulong uVar47;
  char *pcVar48;
  int *piVar49;
  long lVar50;
  short *psVar51;
  float *pfVar52;
  float *pfVar53;
  byte bVar54;
  uint uVar55;
  undefined8 *puVar56;
  long unaff_x21;
  int unaff_w22;
  int unaff_w23;
  char *unaff_x24;
  int *piVar57;
  uint unaff_w25;
  ushort *puVar58;
  int unaff_w26;
  int unaff_w27;
  ushort *puVar59;
  uint *unaff_x28;
  short *psVar60;
  short *psVar61;
  long unaff_x29;
  float fVar62;
  float fVar63;
  float fVar64;
  float fVar65;
  float fVar66;
  float fVar67;
  undefined8 uVar68;
  undefined8 uVar69;
  float fVar70;
  undefined8 uVar71;
  undefined8 uVar72;
  float fVar73;
  float fVar74;
  float fVar75;
  float fVar76;
  undefined4 uVar77;
  undefined4 uVar78;
  float fVar79;
  undefined4 uVar80;
  float unaff_s13;
  float unaff_s14;
  uint uStack000000000000000c;
  int iStack0000000000000010;
  uint uStack0000000000000014;
  int iStack0000000000000018;
  uint uStack000000000000001c;
  int in_stack_00000020;
  uint uStack0000000000000024;
  undefined8 in_stack_00000028;
  uint uStack0000000000000034;
  uint uStack0000000000000038;
  int iStack000000000000003c;
  uint in_stack_00000040;
  uint uStack000000000000004c;
  float in_stack_00000050;
  code *in_stack_00000068;
  undefined8 in_stack_00000070;
  uint in_stack_00000078;
  float in_stack_00000080;
  undefined8 in_stack_00000090;
  char *in_stack_00000098;
  int *in_stack_000000a0;
  undefined8 in_stack_000000a8;
  float in_stack_000000b0;
  long in_stack_000000c8;
  char *in_stack_000000d0;
  char *in_stack_000000d8;
  uint uStack00000000000000e0;
  uint uStack00000000000000e4;
  char *in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 uStack00000000000000f8;
  undefined8 uStack0000000000000100;
  undefined8 uStack0000000000000108;
  float fStack0000000000000110;
  float fStack0000000000000114;
  
  iVar26 = _strncmp(*(undefined8 *)(&UNK_00004f28 + unaff_x21),in_stack_000000e8,(long)unaff_w26);
  *(undefined8 *)(unaff_x29 + -0xf8) = 0;
  in_stack_000000a0[0x156] = unaff_w22;
  uVar27 = in_stack_000000a8._4_4_ + 1;
  uVar33 = unaff_x28[1];
  if ((int)uVar33 <= in_stack_000000a8._4_4_) {
    if (uVar33 == 0) {
      uVar33 = 8;
    }
    else {
      uVar32 = uVar33;
      if ((int)uVar33 < 0) {
        uVar32 = uVar33 + 1;
      }
      uVar33 = uVar33 + ((int)uVar32 >> 1);
    }
    if ((int)uVar33 <= (int)uVar27) {
      uVar33 = uVar27;
    }
    uVar35 = func_0x000b810c(-(ulong)(uVar33 >> 0x1f) & 0xfffffffe00000000 | (ulong)uVar33 << 1);
    if (*(long *)(&UNK_00004f18 + unaff_x21) != 0) {
      _memcpy(uVar35,*(long *)(&UNK_00004f18 + unaff_x21),(long)(int)*unaff_x28 << 1);
      func_0x000b83d4(*(undefined8 *)(&UNK_00004f18 + unaff_x21));
    }
    *(undefined8 *)(&UNK_00004f18 + unaff_x21) = uVar35;
    unaff_x28[1] = uVar33;
    unaff_x24 = in_stack_000000d8;
    unaff_w25 = in_stack_00000090._4_4_;
  }
  *unaff_x28 = uVar27;
  if ((int)unaff_x28[5] < 0) {
    uVar35 = func_0x000b810c(0);
    if (*(long *)(&UNK_00004f28 + unaff_x21) != 0) {
      _memcpy(uVar35,*(long *)(&UNK_00004f28 + unaff_x21),(long)(int)unaff_x28[4]);
      func_0x000b83d4(*(undefined8 *)(&UNK_00004f28 + unaff_x21));
    }
    *(undefined8 *)(&UNK_00004f28 + unaff_x21) = uVar35;
    unaff_x28[5] = 0;
    unaff_x24 = in_stack_000000d8;
  }
  unaff_x28[4] = 0;
  *(undefined1 *)(unaff_x28 + 0xc) = 0;
  uVar27 = func_0x000b8db0(*(undefined8 *)(&UNK_00004f18 + unaff_x21),in_stack_000000a8._4_4_,
                           in_stack_000000e8,0,unaff_x29 + -0xf8);
  in_stack_000000a0[0x157] = uVar27;
  in_stack_000000a0[0x158] = *(int *)(unaff_x29 + -0xf8) - (int)in_stack_000000e8;
  if (iVar26 != 0) {
    *(undefined4 *)((long)unaff_x28 + 0xe5a) = 0x630000;
    *(undefined8 *)(&UNK_00005d70 + unaff_x21) = _UNK_00813250;
    unaff_x28[0xe] = 0;
    unaff_x28[0xf] = 0;
    unaff_x28[0x10] = 0;
    unaff_x28[0x11] = 0;
    *(undefined1 *)((long)unaff_x28 + 0x52) = 0;
    unaff_x28[0x16] = 0;
    *(undefined2 *)(unaff_x28 + 0x14) = 0x100;
    *(bool *)((long)unaff_x28 + 0x53) = unaff_w27 == 0;
    *(undefined1 *)(unaff_x28 + 0x12) = 0;
    unaff_x28[0x13] = 0;
    if (unaff_w27 != 0) goto code_r0x0011a4c8;
code_r0x0011a44c:
    uVar27 = unaff_w25 >> 4 & 1;
    if ((in_stack_00000040 != 0) &&
       ((iVar26 != 0 || ((*(byte *)(in_stack_000000a0 + 0x67) >> 2 & 1) == 0)))) {
      uVar27 = 1;
    }
    if ((uStack00000000000000e4 != 0) && (*(char *)(unaff_x21 + 0xe5c) != '\0')) {
      uVar27 = 1;
    }
  }
  else {
    uVar35 = NEON_smin(*(undefined8 *)(unaff_x28 + 0xf),CONCAT44(uVar27,uVar27),4);
    *(undefined8 *)(unaff_x28 + 0xf) = uVar35;
    uVar33 = unaff_x28[0x11];
    if ((int)uVar27 <= (int)unaff_x28[0x11]) {
      uVar33 = uVar27;
    }
    unaff_x28[0x11] = uVar33;
    if (unaff_w27 == 0) goto code_r0x0011a44c;
code_r0x0011a4c8:
    uVar27 = 0;
  }
  puVar1 = &UNK_00004ef8 + unaff_x21;
  if ((unaff_w25 >> 0xd & 1) != 0) {
    *(undefined1 *)(unaff_x28 + 0x12) = 1;
  }
  bVar21 = *(char *)(unaff_x21 + 0x59) == '\0';
  uStack0000000000000034 = (uint)(uVar27 != 0);
  iVar26 = *(int *)(unaff_x24 + 0x804);
  if ((unaff_w23 != 0) && (iVar26 != unaff_w22)) {
    func_0x000c23ac();
    func_0x000dada8();
    func_0x000c3098();
    iVar26 = *(int *)(unaff_x24 + 0x804);
  }
  if (iVar26 == unaff_w22) {
    if (uStack00000000000000e4 != 0) {
      func_0x000c95f8(0x28f);
    }
    uVar27 = 3;
    if ((unaff_w25 & 0x4000080) != 0) {
      uVar27 = 0xf;
    }
    *(uint *)(unaff_x24 + 0x1108) = *(uint *)(unaff_x24 + 0x1108) | uVar27;
    func_0x000c95f8(0x20d);
    func_0x000c95f8(0x273);
    func_0x000c95f8(0x207);
    func_0x000c95f8(0x208);
    if (unaff_w27 != 0) {
      func_0x000c95f8(0x205);
      func_0x000c95f8(0x206);
    }
    if (!bVar21) {
      func_0x000c95f8(0x4000);
    }
  }
  iVar26 = *(int *)(unaff_x24 + 0x804);
  if ((iVar26 == unaff_w22) && (puVar1 == (undefined *)0x0)) {
    func_0x000c24fc();
    iVar26 = *(int *)(unaff_x24 + 0x804);
  }
  uVar37 = _uStack00000000000000e0 & 0x80;
  uVar47 = _uStack00000000000000e0 & 0x80;
  uVar7 = _uStack00000000000000e0 & 0x80;
  uVar8 = _uStack00000000000000e0 & 0x80;
  uVar9 = _uStack00000000000000e0 & 0x80;
  uVar10 = _uStack00000000000000e0 & 0x80;
  uVar11 = _uStack00000000000000e0 & 0x80;
  uVar12 = _uStack00000000000000e0 & 0x80;
  uVar13 = _uStack00000000000000e0 & 0x80;
  uVar14 = _uStack00000000000000e0 & 0x80;
  uVar15 = _uStack00000000000000e0 & 0x80;
  uVar16 = _uStack00000000000000e0 & 0x80;
  uVar17 = _uStack00000000000000e0 & 0x80;
  uVar18 = _uStack00000000000000e0 & 0x80;
  uVar27 = (uStack00000000000000e0 & 0x80) << 7;
  uVar33 = unaff_w25;
  if (iVar26 == unaff_w22) {
    _uStack0000000000000038 =
         (ulong)((uint)(*unaff_x24 != '\0') & (in_stack_00000070._4_4_ ^ 0xffffffff)) << 0x20;
    uStack00000000000000e0 = 1;
    if (puVar1 == (undefined *)0x0) goto code_r0x0011a660;
code_r0x0011a68c:
    uStack00000000000000e4 = uVar27 | unaff_w25;
    uVar32 = uStack0000000000000034;
    if (*(int *)(&UNK_00004f50 + unaff_x21) != *(int *)(&UNK_00004f54 + unaff_x21)) {
      uVar32 = 1;
    }
    uStack000000000000004c = uVar32 & uStack00000000000000e0;
    if ((uStack00000000000000e0 & uStack00000000000000e4 >> 0xe) == 1) {
      *(undefined8 *)(unaff_x29 + -0xf8) = 0;
      uVar33 = in_stack_000000a8._4_4_ + 1;
      iVar26 = *(int *)(&UNK_00004f14 + unaff_x21);
      if (in_stack_000000a8._4_4_ < iVar26) {
        uVar35 = *(undefined8 *)(&UNK_00004f18 + unaff_x21);
      }
      else {
        if (iVar26 == 0) {
          uVar34 = 8;
        }
        else {
          iVar28 = iVar26;
          if (iVar26 < 0) {
            iVar28 = iVar26 + 1;
          }
          uVar34 = iVar26 + (iVar28 >> 1);
        }
        if ((int)uVar34 <= (int)uVar33) {
          uVar34 = uVar33;
        }
        uVar35 = func_0x000b810c(-(ulong)(uVar34 >> 0x1f) & 0xfffffffe00000000 | (ulong)uVar34 << 1)
        ;
        if (*(long *)(&UNK_00004f18 + unaff_x21) != 0) {
          _memcpy(uVar35,*(long *)(&UNK_00004f18 + unaff_x21),
                  (long)*(int *)(&UNK_00004f10 + unaff_x21) << 1);
          func_0x000b83d4(*(undefined8 *)(&UNK_00004f18 + unaff_x21));
        }
        *(undefined8 *)(&UNK_00004f18 + unaff_x21) = uVar35;
        *(uint *)(&UNK_00004f14 + unaff_x21) = uVar34;
      }
      *(uint *)(&UNK_00004f10 + unaff_x21) = uVar33;
      iVar28 = func_0x000b8db0(uVar35,uVar33,in_stack_000000e8,0,unaff_x29 + -0xf8);
      iVar26 = *(int *)(unaff_x29 + -0xf8);
      *(int *)(&UNK_00004f04 + unaff_x21) = iVar28;
      *(int *)(&UNK_00004f08 + unaff_x21) = iVar26 - (int)in_stack_000000e8;
      uVar35 = NEON_smin(*(undefined8 *)(&UNK_00004f4c + unaff_x21),CONCAT44(iVar28,iVar28),4);
      *(undefined8 *)(&UNK_00004f4c + unaff_x21) = uVar35;
      iVar26 = *(int *)(&UNK_00004f54 + unaff_x21);
      if (iVar28 <= *(int *)(&UNK_00004f54 + unaff_x21)) {
        iVar26 = iVar28;
      }
      *(int *)(&UNK_00004f54 + unaff_x21) = iVar26;
      uStack000000000000004c = 0;
      if ((int)((ulong)uVar35 >> 0x20) != iVar26) {
        uStack000000000000004c = uVar32 & uStack00000000000000e0;
      }
      unaff_x24 = in_stack_000000d8;
      uVar33 = in_stack_00000090._4_4_;
    }
  }
  else {
    _uStack0000000000000038 = 0;
    uStack00000000000000e0 = 0;
    if (puVar1 != (undefined *)0x0) {
      uStack00000000000000e0 = in_stack_00000078;
      goto code_r0x0011a68c;
    }
code_r0x0011a660:
    uStack000000000000004c = 0;
  }
  uStack00000000000000e4 = uVar27 | unaff_w25;
  if ((((((uStack00000000000000e0 | uStack000000000000004c) & 1) != 0) ||
       (bVar20 = false, *(int *)(unaff_x24 + 0x804) == unaff_w22)) &&
      (bVar20 = false, puVar1 != (undefined *)0x0)) &&
     (bVar20 = false, uVar37 == 0 && (unaff_w25 & 0x4000) == 0)) {
    bVar20 = (&UNK_00004f40)[unaff_x21] != '\0';
  }
  piVar49 = (int *)(&UNK_00005d88 + unaff_x21);
  if (in_stack_00000098 == (char *)0x0) {
    bVar22 = false;
    uStack0000000000000024 = (uint)((uVar33 & 0x8000) == 0);
  }
  else {
    pcVar46 = in_stack_000000e8;
    if (bVar20) {
      pcVar46 = *(char **)(&UNK_00004f28 + unaff_x21);
    }
    bVar22 = *pcVar46 == '\0';
    uStack0000000000000024 = (uint)bVar22;
    if ((uVar33 & 0x8000) == 0) {
      uStack0000000000000024 = 1;
    }
  }
  if (uStack0000000000000024 == 0) {
    lVar36 = func_0x00105f10(*(undefined8 *)(&UNK_00003d30 + unaff_x21),0x2a);
    lVar50 = *(long *)(&UNK_00003d30 + unaff_x21);
    *(undefined4 *)(&UNK_00005db4 + unaff_x21) = *(undefined4 *)(lVar50 + 0x14);
    *(undefined8 *)(&UNK_00005e04 + unaff_x21) = *(undefined8 *)(lVar50 + 100);
    *(undefined4 *)(&UNK_00005e0c + unaff_x21) = *(undefined4 *)(lVar50 + 0x6c);
    *(undefined8 *)(&UNK_00005de0 + unaff_x21) = *(undefined8 *)(lVar50 + 0x40);
    *(long *)(&UNK_00005dd8 + unaff_x21) = lVar36;
    *(undefined4 *)(&UNK_00005db0 + unaff_x21) = *(undefined4 *)(lVar36 + 4);
    func_0x000d33a0(&UNK_00005da0 + unaff_x21);
  }
  if (*(int *)(unaff_x24 + 0x804) != unaff_w22) {
    iStack0000000000000010 = 0;
    iVar26 = *(int *)(unaff_x24 + 0x804);
joined_r0x0011a94c:
    if (iVar26 != unaff_w22) goto LAB_0011aaf0;
LAB_0011a950:
    if (unaff_x24[0x810] == '\0') {
      if (_uStack0000000000000038 != 0) {
        bVar21 = false;
        pcVar46 = (char *)0x0;
        bVar4 = 0;
        _uStack0000000000000038 = 0x100000000;
        goto LAB_0011add4;
      }
      uStack0000000000000034 =
           (uint)((in_stack_00000080 - *(float *)(&UNK_00003928 + unaff_x21)) /
                 *(float *)(&UNK_00003d38 + unaff_x21));
      if ((int)uStack0000000000000034 < 2) {
        uStack0000000000000034 = 1;
      }
      *(uint *)(&UNK_00004f5c + unaff_x21) = uStack0000000000000034;
      bVar4 = *(byte *)(unaff_x21 + 0xe5d);
      lVar36 = 0xe5c;
      if (!bVar21) {
        lVar36 = 0xe5e;
      }
      cVar6 = *(char *)(unaff_x21 + lVar36);
      if (((bVar21) || (*(char *)(unaff_x21 + 0xe5f) == '\0')) ||
         (*(char *)(unaff_x21 + 0xe5c) != '\0')) {
        bVar23 = false;
        uVar37 = func_0x000d78f8(0xa39);
        if ((uVar37 & 1) != 0) goto code_r0x0011ac68;
code_r0x0011b2e8:
        uVar31 = func_0x000d78f8(&UNK_0000220a);
        uVar32 = (uVar27 | unaff_w25 & 0x4000) >> 0xe;
        uVar34 = (uVar33 & 0x8000) >> 0xf;
        uVar55 = (uVar31 ^ 1 | uVar32 | uVar34) ^ 1;
        if ((((uVar31 ^ 1) & 1) == 0 && uVar32 == 0) && uVar34 == 0) {
joined_r0x0011ac84:
          if (in_stack_000000f0._4_4_ != 0) {
            uVar55 = (uint)(*(int *)(&UNK_00004f50 + unaff_x21) !=
                           *(int *)(&UNK_00004f54 + unaff_x21));
          }
          goto code_r0x0011b330;
        }
        uVar37 = func_0x000d78f8(0xa24);
        if ((uVar37 & 1) == 0) goto code_r0x0011b374;
code_r0x0011b344:
        if ((uVar33 & 0x4008000) == 0x4000000) {
code_r0x0011b39c:
          uStack0000000000000014 =
               (uint)(*(int *)(&UNK_00004f50 + unaff_x21) != *(int *)(&UNK_00004f54 + unaff_x21));
        }
      }
      else {
        bVar23 = *(char *)(unaff_x21 + 0xe5e) == '\0';
        uVar37 = func_0x000d78f8(0xa39);
        if ((uVar37 & 1) == 0) goto code_r0x0011b2e8;
code_r0x0011ac68:
        uVar55 = (uint)((uVar9 == 0 && (unaff_w25 & 0x4000) == 0) && (uVar33 & 0x8000) == 0);
        if ((uVar10 == 0 && (unaff_w25 & 0x4000) == 0) && (uVar33 & 0x8000) == 0)
        goto joined_r0x0011ac84;
code_r0x0011b330:
        uVar37 = func_0x000d78f8(0xa24);
        if ((uVar37 & 1) != 0) goto code_r0x0011b344;
code_r0x0011b374:
        uVar32 = func_0x000d78f8(0x1209);
        uStack0000000000000014 = 0;
        if ((uVar33 & 0x8000) == 0) {
          uStack0000000000000014 = uVar32;
        }
        if ((in_stack_000000f0._4_4_ != 0) && ((uStack0000000000000014 & 1) != 0))
        goto code_r0x0011b39c;
      }
      uVar37 = func_0x000d78f8(0xa37);
      if (((uVar37 & 1) == 0) && (uVar37 = func_0x000d78f8(&UNK_00002209), (uVar37 & 1) == 0)) {
        bVar19 = false;
        bVar24 = uVar16 == 0 && (unaff_w25 & 0x4000) == 0;
      }
      else {
        bVar24 = uVar15 == 0 && (unaff_w25 & 0x4000) == 0;
        bVar19 = bVar24;
      }
      bVar25 = func_0x000d78f8(0xa3b);
      bVar3 = false;
      if ((uVar33 & 0x10000) == 0) {
        bVar3 = bVar24;
      }
      uVar37 = func_0x000d78f8(0xa3a);
      bVar24 = bVar3;
      if (((uVar37 & 1) == 0) &&
         ((bVar21 || (iVar26 = func_0x000d78f8(&UNK_00002a3b), iVar26 == 0)))) {
        bVar24 = false;
      }
      iVar26 = func_0x000d78f8(0xa22);
      bVar54 = 0;
      if ((*(byte *)(unaff_x21 + 8) >> 1 & 1) == 0) {
        uVar37 = func_0x000d68ec(0x20d,1);
        if ((uVar37 & 1) != 0) goto code_r0x0011b480;
code_r0x0011b4c0:
        uVar33 = func_0x000d68ec(0x273,1);
        if (bVar54 == 0) goto code_r0x0011b4d4;
code_r0x0011b484:
        uVar37 = func_0x000d68ec(0x27c,0);
        if ((uVar37 & 1) == 0) {
          uStack000000000000000c = func_0x000d68ec(0x27b,0);
        }
        else {
          uStack000000000000000c = 1;
        }
        iVar28 = 1;
        uVar37 = func_0x000d78f8(0x20e);
        if ((uVar37 & 1) == 0) {
          uVar35 = 0x27a;
          goto code_r0x0011b518;
        }
      }
      else {
        bVar54 = *(byte *)(unaff_x21 + 0xc) & 1;
        uVar37 = func_0x000d68ec(0x20d,1);
        if ((uVar37 & 1) == 0) goto code_r0x0011b4c0;
code_r0x0011b480:
        uVar33 = 1;
        if (bVar54 != 0) goto code_r0x0011b484;
code_r0x0011b4d4:
        uStack000000000000000c = 0;
        uVar35 = 0x20e;
code_r0x0011b518:
        iVar28 = func_0x000d78f8(uVar35);
      }
      uVar32 = (uint)bVar4 << 0x16;
      iVar29 = func_0x000d68ec(0x201,1);
      if (iVar29 == 0) {
        iVar29 = func_0x000d68ec(0x202,1);
        if (iVar29 != 0) {
          uVar27 = 0x200001;
          if (cVar6 != '\0') {
            uVar27 = 0x20000d;
          }
          uVar33 = 0x200005;
          goto code_r0x0011b590;
        }
        iVar29 = func_0x000d68ec(0x203,1);
        if ((in_stack_000000f0._4_4_ != 0) && (iVar29 != 0)) {
          if (*(char *)(unaff_x21 + 0xe5c) == '\0') {
            iVar26 = -2;
            if (bVar23) {
              iVar26 = 2;
            }
            func_0x0011cfe8(puVar1,iVar26 + 0x200004U | uVar32);
          }
          else {
            fVar64 = *(float *)(in_stack_000000c8 + 0x90) - *(float *)(&UNK_00003d38 + unaff_x21);
            if (fVar64 < 0.0) {
              fVar64 = 0.0;
            }
            func_0x000d8cb4(fVar64);
          }
          _uStack0000000000000038 = 0;
          goto code_r0x0011b5b8;
        }
        iVar29 = func_0x000d68ec(0x204,1);
        if ((in_stack_000000f0._4_4_ != 0) && (iVar29 != 0)) {
          if (*(char *)(unaff_x21 + 0xe5c) == '\0') {
            iVar26 = 3;
            if (!bVar23) {
              iVar26 = -1;
            }
            func_0x0011cfe8(puVar1,iVar26 + 0x200004U | uVar32);
          }
          else {
            fVar64 = *(float *)(in_stack_000000c8 + 0x90) + *(float *)(&UNK_00003d38 + unaff_x21);
            fVar62 = (float)func_0x000d8c90();
            if (fVar62 <= fVar64) {
              fVar64 = fVar62;
            }
            func_0x000d8cb4(fVar64,in_stack_000000c8);
          }
          _uStack0000000000000038 = 0;
          goto code_r0x0011b5b8;
        }
        iVar29 = func_0x000d68ec(0x205,1);
        if ((in_stack_000000f0._4_4_ != 0) && (iVar29 != 0)) {
          func_0x0011cfe8(puVar1,uVar32 | 0x20000e);
          _uStack0000000000000038 = 0;
          unaff_s13 = unaff_s13 -
                      *(float *)(&UNK_00003d38 + unaff_x21) * (float)(int)uStack0000000000000034;
          goto code_r0x0011b5b8;
        }
        iVar29 = func_0x000d68ec(0x206,1);
        if ((in_stack_000000f0._4_4_ != 0) && (iVar29 != 0)) {
          func_0x0011cfe8(puVar1,uVar32 | 0x20000f);
          unaff_s13 = unaff_s13 +
                      *(float *)(&UNK_00003d38 + unaff_x21) * (float)(int)uStack0000000000000034;
          goto code_r0x0011b5b0;
        }
        iVar29 = func_0x000d68ec(0x207,1);
        if (iVar29 != 0) {
          uVar33 = 0x200004;
          if (*(char *)(unaff_x21 + 0xe5c) != '\0') {
            uVar33 = 0x200006;
          }
          goto code_r0x0011b59c;
        }
        iVar29 = func_0x000d68ec(0x208,1);
        if (iVar29 != 0) {
          uVar33 = 0x200005;
          if (*(char *)(unaff_x21 + 0xe5c) != '\0') {
            uVar33 = 0x200007;
          }
          goto code_r0x0011b59c;
        }
        uVar27 = uVar27 | unaff_w25 & 0x4000;
        uVar34 = func_0x000d68ec(0x20a,1);
        if (((uVar34 ^ 1 | uVar27 >> 0xe | uVar55) & 1) == 0) {
          if ((cVar6 != '\0') &&
             (*(int *)(&UNK_00004f50 + unaff_x21) == *(int *)(&UNK_00004f54 + unaff_x21))) {
            func_0x0011cfe8(puVar1,&UNK_0060000d);
          }
          uVar27 = 0x200008;
code_r0x0011c644:
          uVar32 = uVar32 | uVar27;
code_r0x0011c648:
          func_0x0011cfe8(puVar1,uVar32);
code_r0x0011c654:
          _uStack0000000000000038 = 0;
          goto code_r0x0011b5b8;
        }
        iVar29 = func_0x000d68ec(0x20b,1);
        if ((iVar29 != 0) && (uVar27 == 0)) {
          if (*(int *)(&UNK_00004f50 + unaff_x21) == *(int *)(&UNK_00004f54 + unaff_x21)) {
            uVar30 = 0x600004;
            if (cVar6 == '\0') {
              if ((((bVar21) || (*(char *)(unaff_x21 + 0xe5f) == '\0')) ||
                  (*(char *)(unaff_x21 + 0xe5e) != '\0')) || (*(char *)(unaff_x21 + 0xe5c) != '\0'))
              goto code_r0x0011c638;
            }
            else {
              uVar30 = 0x60000c;
            }
            func_0x0011cfe8(puVar1,uVar30);
          }
code_r0x0011c638:
          uVar27 = 0x200009;
          goto code_r0x0011c644;
        }
        if ((uVar33 | uStack000000000000000c) == 1) {
          if (in_stack_000000f0._4_4_ == 0 || (uStack000000000000000c & 1) != 0) {
            if ((in_stack_000000f0._4_4_ == 0) && (*(char *)(unaff_x21 + 0x5c) != '\0')) {
              *(undefined4 *)(&UNK_00004f50 + unaff_x21) = 0;
              *(undefined4 *)(&UNK_00004f54 + unaff_x21) =
                   *(undefined4 *)(&UNK_00004f04 + unaff_x21);
              *(undefined4 *)(&UNK_00004f4c + unaff_x21) =
                   *(undefined4 *)(&UNK_00004f04 + unaff_x21);
              (&UNK_00004f62)[unaff_x21] = 0;
              _uStack0000000000000038 = 1;
            }
            else {
              _uStack0000000000000038 = 0x100000001;
            }
            goto code_r0x0011b5b8;
          }
          if ((in_stack_00000090._4_4_ >> 0xb & 1) == 0) {
            if (*(char *)(unaff_x21 + 0xe5c) != '\0') goto code_r0x0011c5c4;
          }
          else if (*(char *)(unaff_x21 + 0xe5c) == '\0') {
code_r0x0011c5c4:
            _uStack0000000000000038 = 0x100000001;
            goto code_r0x0011b5b8;
          }
          if (uVar18 == 0 && (unaff_w25 & 0x4000) == 0) {
            *(undefined4 *)(unaff_x29 + -0xf8) = 10;
            iVar26 = func_0x0011ebdc();
            if (iVar26 == 0) goto code_r0x0011c654;
            uVar32 = *(uint *)(unaff_x29 + -0xf8);
            goto code_r0x0011c648;
          }
          goto code_r0x0011c654;
        }
        if (iVar28 == 0) {
          if ((byte)(bVar25 & bVar3 | bVar24) == 1) {
            iVar26 = 6;
            if ((bVar25 & bVar3) == 0) {
              iVar26 = 7;
            }
            func_0x0011cfe8(puVar1,iVar26 + 0x200004);
            _uStack0000000000000038 = 0;
            *(undefined4 *)(&UNK_00004f50 + unaff_x21) = *(undefined4 *)(&UNK_00004f4c + unaff_x21);
            *(undefined4 *)(&UNK_00004f54 + unaff_x21) = *(undefined4 *)(&UNK_00004f4c + unaff_x21);
          }
          else {
            if (iVar26 == 0) {
              if ((uVar55 | uStack0000000000000014) == 1) {
                if (*(long *)(unaff_x21 + 0xb0) != 0) {
                  uVar27 = *(uint *)(&UNK_00004f50 + unaff_x21);
                  uVar33 = *(uint *)(&UNK_00004f54 + unaff_x21);
                  if (uVar27 == uVar33) {
                    uVar37 = 0;
                    uVar27 = *(uint *)(&UNK_00004f04 + unaff_x21);
                  }
                  else {
                    uVar32 = uVar27;
                    if ((int)uVar33 <= (int)uVar27) {
                      uVar32 = uVar33;
                    }
                    uVar37 = (ulong)uVar32;
                    if ((int)uVar27 <= (int)uVar33) {
                      uVar27 = uVar33;
                    }
                  }
                  uVar37 = -(uVar37 >> 0x1f) & 0xfffffffe00000000 | uVar37 << 1;
                  uVar47 = -(ulong)(uVar27 >> 0x1f) & 0xfffffffe00000000 | (ulong)uVar27 << 1;
                  iVar26 = func_0x000b91c4(*(long *)(&UNK_00004f18 + unaff_x21) + uVar37,
                                           *(long *)(&UNK_00004f18 + unaff_x21) + uVar47);
                  uVar35 = func_0x000b810c((long)(iVar26 + 1));
                  func_0x000b9034(uVar35,iVar26 + 1,*(long *)(&UNK_00004f18 + unaff_x21) + uVar37,
                                  *(long *)(&UNK_00004f18 + unaff_x21) + uVar47);
                  func_0x000c2d8c(uVar35);
                  func_0x000b83d4(uVar35);
                }
                if (uVar55 != 0) {
                  iVar26 = *(int *)(&UNK_00004f50 + unaff_x21);
                  iVar28 = *(int *)(&UNK_00004f54 + unaff_x21);
                  if (iVar26 == iVar28) {
                    iVar26 = 0;
                    iVar28 = *(int *)(&UNK_00004f04 + unaff_x21);
                    *(undefined4 *)(&UNK_00004f50 + unaff_x21) = 0;
                    *(int *)(&UNK_00004f54 + unaff_x21) = iVar28;
                    *(int *)(&UNK_00004f4c + unaff_x21) = iVar28;
                    (&UNK_00004f62)[unaff_x21] = 0;
                  }
                  (&UNK_00005d7c)[unaff_x21] = 1;
                  if (iVar26 != iVar28) {
                    func_0x001294b4(puVar1,&UNK_00004f4c + unaff_x21);
                    _uStack0000000000000038 = 0;
                    (&UNK_00004f62)[unaff_x21] = 0;
                    goto code_r0x0011b5b8;
                  }
                }
              }
              else if ((bVar19) && (pcVar46 = (char *)func_0x000c2d68(), pcVar46 != (char *)0x0)) {
                lVar36 = _strlen();
                puVar42 = (undefined2 *)func_0x000b810c((lVar36 << 0x20) + 0x100000000 >> 0x1f);
                if (*pcVar46 == '\0') {
                  *puVar42 = 0;
                }
                else {
                  iVar26 = 0;
                  do {
                    iVar28 = func_0x000b6c50(unaff_x29 + -0xf8,pcVar46,0);
                    iVar29 = func_0x0011ebdc();
                    if (iVar29 != 0) {
                      puVar42[iVar26] = (short)*(undefined4 *)(unaff_x29 + -0xf8);
                      iVar26 = iVar26 + 1;
                    }
                    pcVar46 = pcVar46 + iVar28;
                  } while (*pcVar46 != '\0');
                  puVar42[iVar26] = 0;
                  if (0 < iVar26) {
                    func_0x0011eddc(puVar1,&UNK_00004f4c + unaff_x21,puVar42,iVar26);
                    (&UNK_00005d7c)[unaff_x21] = 1;
                  }
                }
                func_0x000b83d4(puVar42);
              }
              goto code_r0x0011c654;
            }
            _uStack0000000000000038 = 0;
            *(undefined4 *)(&UNK_00004f50 + unaff_x21) = 0;
            *(undefined4 *)(&UNK_00004f54 + unaff_x21) = *(undefined4 *)(&UNK_00004f04 + unaff_x21);
            *(undefined4 *)(&UNK_00004f4c + unaff_x21) = *(undefined4 *)(&UNK_00004f04 + unaff_x21);
            (&UNK_00004f62)[unaff_x21] = 0;
            (&UNK_00005d7c)[unaff_x21] = 1;
          }
          goto code_r0x0011b5b8;
        }
        if ((in_stack_00000090._4_4_ >> 0x14 & 1) == 0) {
          uStack00000000000000e0 = 0;
          bVar21 = true;
          _uStack0000000000000038 = 0x100000000;
          uStack000000000000004c = 0;
        }
        else {
          bVar23 = *in_stack_000000e8 == '\0';
          uVar27 = 0;
          if (!bVar23) {
            uVar27 = uStack000000000000004c;
          }
          _uStack0000000000000038 = (ulong)bVar23 << 0x20;
          bVar21 = !bVar23;
          uVar33 = 0;
          if (!bVar23) {
            uVar33 = uStack00000000000000e0;
          }
          uStack000000000000004c = uVar27;
          uStack00000000000000e0 = uVar33;
        }
      }
      else {
        uVar33 = 0x200004;
        uVar27 = 0x200000;
        if (cVar6 != '\0') {
          uVar27 = 0x20000c;
        }
code_r0x0011b590:
        if (!bVar23) {
          uVar33 = uVar27;
        }
code_r0x0011b59c:
        func_0x0011cfe8(puVar1,uVar33 | uVar32);
code_r0x0011b5b0:
        _uStack0000000000000038 = 0;
code_r0x0011b5b8:
        bVar21 = false;
      }
      uVar27 = 0;
      if (*(int *)(&UNK_00004f50 + unaff_x21) != *(int *)(&UNK_00004f54 + unaff_x21)) {
        uVar27 = uStack00000000000000e0;
      }
      uStack000000000000004c = uStack000000000000004c | uVar27;
      iVar26 = *(int *)(in_stack_000000d8 + 0x804);
      uVar33 = in_stack_00000090._4_4_;
      unaff_x24 = in_stack_000000d8;
      goto joined_r0x0011b5dc;
    }
    bVar21 = false;
    pcVar46 = (char *)0x0;
    bVar4 = 0;
    goto LAB_0011add4;
  }
  iStack0000000000000010 = *(int *)(&UNK_00004f08 + unaff_x21);
  (&UNK_00005d7e)[unaff_x21] = 0;
  *(int *)(&UNK_00004f44 + unaff_x21) = in_stack_000000a8._4_4_;
  *(uint *)(&UNK_00005d80 + unaff_x21) = uStack00000000000000e4;
  bVar4 = *(byte *)(unaff_x21 + 0xe48);
  unaff_x24[0x811] = bVar4 ^ 1;
  if (unaff_w27 == 0) {
    fVar64 = *(float *)(&UNK_00003d38 + unaff_x21) * 0.5;
    if (uStack0000000000000034 != 0) goto LAB_0011a998;
LAB_0011a8b4:
    fVar62 = ((*(float *)(unaff_x21 + 0xe40) - *(float *)(unaff_x29 + -0xa8)) -
             *(float *)(&UNK_00003924 + unaff_x21)) + *(float *)(&UNK_00004f48 + unaff_x21);
    if (((iStack0000000000000018 == 0) || (uVar5 = *(ushort *)(unaff_x24 + 10), uVar5 < 2)) ||
       (*(char *)(unaff_x21 + 0xe5d) != '\0')) {
      if ((*unaff_x24 == '\0') || ((&UNK_00005d7d)[unaff_x21] != '\0')) {
        if (((bVar4 != 0) && ((&UNK_00005d7d)[unaff_x21] == '\0')) &&
           ((*(float *)(unaff_x21 + 0xe8) != 0.0 || (*(float *)(unaff_x21 + 0xec) != 0.0)))) {
          func_0x0011eb90(puVar1,&UNK_00004f4c + unaff_x21);
          *(undefined4 *)(&UNK_00005d78 + unaff_x21) = 0xbe99999a;
          (&UNK_00005d7c)[unaff_x21] = 1;
        }
      }
      else if (iStack0000000000000018 != 0) {
        if (*(char *)(unaff_x21 + 0xe5d) == '\0') {
          if ((&UNK_00004f63)[unaff_x21] != '\0') {
            fVar64 = 0.0;
          }
          uVar30 = func_0x00129e5c(fVar62,fVar64,puVar1);
          *(undefined4 *)(&UNK_00004f4c + unaff_x21) = uVar30;
          *(undefined4 *)(&UNK_00004f50 + unaff_x21) = uVar30;
          *(undefined4 *)(&UNK_00004f54 + unaff_x21) = uVar30;
          (&UNK_00004f62)[unaff_x21] = 0;
        }
        else {
          func_0x0011eb90(puVar1,&UNK_00004f4c + unaff_x21);
        }
        goto code_r0x0011c308;
      }
    }
    else {
      if ((&UNK_00004f63)[unaff_x21] != '\0') {
        fVar64 = 0.0;
      }
      iVar26 = func_0x00129e5c(fVar62,fVar64,puVar1);
      piVar57 = (int *)(&UNK_00004f4c + unaff_x21);
      *piVar57 = iVar26;
      *(int *)(&UNK_00004f50 + unaff_x21) = iVar26;
      *(int *)(&UNK_00004f54 + unaff_x21) = iVar26;
      (&UNK_00004f62)[unaff_x21] = 0;
      if ((uVar5 & 1) == 0) {
        if (((iVar26 == 0) ||
            (*(short *)(*(long *)(&UNK_00004f18 + unaff_x21) + (long)iVar26 * 2 + -2) == 10)) ||
           (func_0x0011cfe8(puVar1,&UNK_0020000c),
           *(int *)(&UNK_00004f50 + unaff_x21) == *(int *)(&UNK_00004f54 + unaff_x21))) {
          iVar26 = *(int *)(&UNK_00004f4c + unaff_x21);
          *(int *)(&UNK_00004f50 + unaff_x21) = iVar26;
          *(int *)(&UNK_00004f54 + unaff_x21) = iVar26;
        }
        else {
          iVar26 = *piVar57;
        }
        uVar30 = func_0x0011ea4c(puVar1,iVar26);
        *(undefined4 *)(&UNK_00004f4c + unaff_x21) = uVar30;
        *(undefined4 *)(&UNK_00004f54 + unaff_x21) = uVar30;
        func_0x0011eb30(*(undefined4 *)(&UNK_00004f04 + unaff_x21),piVar57);
        unaff_x24 = in_stack_000000d8;
      }
      else {
        sVar44 = *(short *)(*(long *)(&UNK_00004f18 + unaff_x21) + (long)iVar26 * 2);
        func_0x0011cfe8(puVar1,&UNK_00200004);
        func_0x0011cfe8(puVar1,&UNK_00600005);
        func_0x0011cfe8(puVar1,&UNK_00600001);
        if ((unaff_w27 != 0) && (sVar44 != 10)) {
          *(int *)(&UNK_00004f54 + unaff_x21) = (int)*(undefined8 *)(&UNK_00004f50 + unaff_x21);
          *(undefined8 *)(&UNK_00004f4c + unaff_x21) = *(undefined8 *)(&UNK_00004f50 + unaff_x21);
        }
        (&UNK_00005d7c)[unaff_x21] = 0;
        unaff_x24 = in_stack_000000d8;
      }
code_r0x0011c308:
      *(undefined4 *)(&UNK_00005d78 + unaff_x21) = 0xbe99999a;
    }
  }
  else {
    fVar64 = *(float *)(unaff_x21 + 0xe44) - *(float *)(in_stack_000000c8 + 0x114);
    if (uStack0000000000000034 == 0) goto LAB_0011a8b4;
LAB_0011a998:
    *(undefined4 *)(&UNK_00004f50 + unaff_x21) = 0;
    *(undefined4 *)(&UNK_00004f54 + unaff_x21) = *(undefined4 *)(&UNK_00004f04 + unaff_x21);
    *(undefined4 *)(&UNK_00004f4c + unaff_x21) = *(undefined4 *)(&UNK_00004f04 + unaff_x21);
    (&UNK_00004f62)[unaff_x21] = 0;
    (&UNK_00005d7d)[unaff_x21] = 1;
  }
  if (((&UNK_00005d7d)[unaff_x21] != '\0') && (*(char *)(unaff_x21 + 0xe48) == '\0')) {
    (&UNK_00005d7d)[unaff_x21] = 0;
  }
  if ((((uVar33 >> 10 & 1) != 0) && (uVar47 == 0 && (unaff_w25 & 0x4000) == 0)) &&
     (iVar26 = func_0x000d78f8(0x200), iVar26 != 0)) {
    *(undefined4 *)(unaff_x29 + -0xf8) = 9;
    iVar26 = func_0x0011ebdc();
    if (iVar26 != 0) {
      func_0x0011cfe8(puVar1,*(undefined4 *)(unaff_x29 + -0xf8));
    }
  }
  if (*(char *)(unaff_x21 + 0xe5c) == '\0') {
    if (!bVar21) goto LAB_0011aa70;
    bVar23 = false;
  }
  else {
    bVar23 = *(char *)(unaff_x21 + 0xe5e) == '\0';
    if (!bVar23 && !bVar21) {
LAB_0011aa70:
      bVar23 = *(char *)(unaff_x21 + 0xe5f) != '\0';
    }
  }
  if (0 < *(int *)(&UNK_000038d8 + unaff_x21)) {
    if ((!bVar23 && (uVar7 == 0 && (unaff_w25 & 0x4000) == 0)) && (in_stack_00000040 & 1) == 0) {
      lVar36 = 0;
      do {
        uVar32 = (uint)*(ushort *)(*(long *)(&UNK_000038e0 + unaff_x21) + lVar36 * 2);
        *(uint *)(unaff_x29 + -0xf8) = uVar32;
        if ((uVar32 != 9) && (iVar26 = func_0x0011ebdc(), iVar26 != 0)) {
          func_0x0011cfe8(puVar1,*(undefined4 *)(unaff_x29 + -0xf8));
        }
        lVar36 = lVar36 + 1;
      } while (lVar36 < *(int *)(&UNK_000038d8 + unaff_x21));
    }
    if (*(int *)(&UNK_000038dc + unaff_x21) < 0) {
      uVar35 = func_0x000b810c(0);
      if (*(long *)(&UNK_000038e0 + unaff_x21) != 0) {
        _memcpy(uVar35,*(long *)(&UNK_000038e0 + unaff_x21),
                (long)*(int *)(&UNK_000038d8 + unaff_x21) << 1);
        func_0x000b83d4(*(undefined8 *)(&UNK_000038e0 + unaff_x21));
      }
      *(undefined8 *)(&UNK_000038e0 + unaff_x21) = uVar35;
      *(undefined4 *)(&UNK_000038dc + unaff_x21) = 0;
    }
    *(undefined4 *)(&UNK_000038d8 + unaff_x21) = 0;
    iVar26 = *(int *)(unaff_x24 + 0x804);
    goto joined_r0x0011a94c;
  }
  iVar26 = *(int *)(unaff_x24 + 0x804);
  if (iVar26 == unaff_w22) goto LAB_0011a950;
LAB_0011aaf0:
  bVar21 = false;
joined_r0x0011b5dc:
  if (iVar26 == unaff_w22) {
    bVar4 = 0;
    pcVar46 = (char *)0x0;
    if ((!bVar21) || (!(uVar8 == 0 && (unaff_w25 & 0x4000) == 0))) {
LAB_0011add4:
      if (uVar11 == 0 && (unaff_w25 & 0x4000) == 0) {
code_r0x0011ade8:
        uVar27 = 0;
        goto code_r0x0011adec;
      }
      uVar27 = 0;
      if (bVar21) goto code_r0x0011ae88;
code_r0x0011ae94:
      if ((uVar33 & 0x801c0) != 0) {
        if ((uVar33 >> 6 & 1) == 0) {
code_r0x0011aec8:
          if ((uVar33 >> 7 & 1) == 0) {
code_r0x0011aefc:
            if (((uVar33 >> 0x13 & 1) == 0) || ((&UNK_00005d7e)[unaff_x21] == '\0')) {
              if ((uVar33 >> 8 & 1) == 0) goto code_r0x0011b0d0;
              uVar30 = 0;
              uVar77 = 0x100;
            }
            else {
              uVar30 = 0;
              uVar77 = 0x80000;
            }
          }
          else {
            uVar30 = 0x203;
            uVar37 = func_0x000d68ec(0x203,1);
            if ((uVar37 & 1) == 0) {
              uVar30 = 0x204;
              uVar37 = func_0x000d68ec(0x204,1);
              if ((uVar37 & 1) == 0) goto code_r0x0011aefc;
            }
            uVar77 = 0x80;
          }
        }
        else {
          uVar30 = 0x200;
          uVar37 = func_0x000d78f8(0x200);
          if ((uVar37 & 1) == 0) goto code_r0x0011aec8;
          uVar77 = 0x40;
        }
        *(undefined8 *)(unaff_x29 + -0xc0) = 0;
        *(undefined8 *)(unaff_x29 + -0xd8) = 0;
        *(undefined8 *)(unaff_x29 + -0xe0) = 0;
        *(undefined8 *)(unaff_x29 + -200) = 0;
        *(undefined8 *)(unaff_x29 + -0xd0) = 0;
        *(long *)(unaff_x29 + -0xf8) = unaff_x21;
        *(undefined4 *)(unaff_x29 + -0xf0) = uVar77;
        *(uint *)(unaff_x29 + -0xec) = uStack00000000000000e4;
        *(char **)(unaff_x29 + -0xe8) = in_stack_000000d0;
        pcVar48 = in_stack_000000e8;
        if (uVar12 == 0 && (unaff_w25 & 0x4000) == 0) {
          pcVar48 = *(char **)(&UNK_00004f28 + unaff_x21);
        }
        *(undefined4 *)(unaff_x29 + -0xdc) = uVar30;
        *(char **)(unaff_x29 + -0xd8) = pcVar48;
        uVar30 = *(undefined4 *)(&UNK_00004f44 + unaff_x21);
        *(undefined4 *)(unaff_x29 + -0xd0) = *(undefined4 *)(&UNK_00004f08 + unaff_x21);
        *(undefined4 *)(unaff_x29 + -0xcc) = uVar30;
        lVar36 = *(long *)(&UNK_00004f18 + unaff_x21);
        iVar26 = func_0x000b91c4(lVar36,lVar36 + (long)*(int *)(&UNK_00004f4c + unaff_x21) * 2);
        *(int *)(unaff_x29 + -0xc4) = iVar26;
        iVar28 = func_0x000b91c4(lVar36,lVar36 + (long)*(int *)(&UNK_00004f50 + unaff_x21) * 2);
        *(int *)(unaff_x29 + -0xc0) = iVar28;
        iVar29 = func_0x000b91c4(lVar36,lVar36 + (long)*(int *)(&UNK_00004f54 + unaff_x21) * 2);
        *(int *)(unaff_x29 + -0xbc) = iVar29;
        (*in_stack_00000068)(unaff_x29 + -0xf8);
        cVar6 = *(char *)(unaff_x29 + -200);
        if ((cVar6 != '\0') || (*(int *)(unaff_x29 + -0xc4) != iVar26)) {
          uVar30 = func_0x000b8e80(*(long *)(unaff_x29 + -0xd8),
                                   *(long *)(unaff_x29 + -0xd8) + (long)*(int *)(unaff_x29 + -0xc4))
          ;
          *(undefined4 *)(&UNK_00004f4c + unaff_x21) = uVar30;
          (&UNK_00005d7c)[unaff_x21] = 1;
        }
        iVar26 = *(int *)(unaff_x29 + -0xc0);
        if ((cVar6 != '\0') || (iVar26 != iVar28)) {
          if (iVar26 == *(int *)(unaff_x29 + -0xc4)) {
            uVar30 = *(undefined4 *)(&UNK_00004f4c + unaff_x21);
          }
          else {
            uVar30 = func_0x000b8e80(*(long *)(unaff_x29 + -0xd8),
                                     *(long *)(unaff_x29 + -0xd8) + (long)iVar26);
          }
          *(undefined4 *)(&UNK_00004f50 + unaff_x21) = uVar30;
        }
        iVar26 = *(int *)(unaff_x29 + -0xbc);
        if ((cVar6 != '\0') || (iVar26 != iVar29)) {
          if (iVar26 == *(int *)(unaff_x29 + -0xc0)) {
            uVar30 = *(undefined4 *)(&UNK_00004f50 + unaff_x21);
          }
          else {
            uVar30 = func_0x000b8e80(*(long *)(unaff_x29 + -0xd8),
                                     *(long *)(unaff_x29 + -0xd8) + (long)iVar26);
          }
          *(undefined4 *)(&UNK_00004f54 + unaff_x21) = uVar30;
          if (cVar6 != '\0') {
            func_0x0011f040(puVar1,*(undefined8 *)(unaff_x29 + -0xd8),
                            *(undefined4 *)(unaff_x29 + -0xd0));
            if (((in_stack_00000090._4_4_ >> 0x12 & 1) != 0) &&
               (iVar26 = *(int *)(unaff_x29 + -0xd0) - iStack0000000000000010,
               iVar26 != 0 && iStack0000000000000010 <= *(int *)(unaff_x29 + -0xd0))) {
              func_0x0011e9c0(&UNK_00004f10 + unaff_x21,iVar26 + *(int *)(&UNK_00004f10 + unaff_x21)
                             );
            }
            uVar30 = func_0x000b8db0(*(undefined8 *)(&UNK_00004f18 + unaff_x21),
                                     *(undefined4 *)(&UNK_00004f10 + unaff_x21),
                                     *(undefined8 *)(unaff_x29 + -0xd8),0,0);
            *(undefined4 *)(&UNK_00004f04 + unaff_x21) = uVar30;
            *(undefined4 *)(&UNK_00004f08 + unaff_x21) = *(undefined4 *)(unaff_x29 + -0xd0);
            *(undefined4 *)(&UNK_00005d78 + unaff_x21) = 0xbe99999a;
          }
        }
        unaff_x24 = in_stack_000000d8;
        uVar33 = in_stack_00000090._4_4_;
      }
code_r0x0011b0d0:
      if (uVar13 == 0 && (unaff_w25 & 0x4000) == 0) {
        pcVar48 = *(char **)(&UNK_00004f28 + unaff_x21);
        iVar26 = _strcmp(pcVar48,in_stack_000000e8);
        if (iVar26 != 0) {
          uVar27 = *(uint *)(&UNK_00004f08 + unaff_x21);
          bVar4 = 1;
          pcVar46 = pcVar48;
        }
      }
    }
    else {
      if ((uVar33 >> 0x14 & 1) != 0) {
        uVar27 = *(uint *)(&UNK_00004f04 + unaff_x21);
        uVar37 = (ulong)uVar27;
        lVar36 = func_0x00129c14(&UNK_00004f6c + unaff_x21,0,uVar37,0);
        if (((int)uVar27 < 1) || (lVar36 == 0)) {
          psVar60 = *(short **)(&UNK_00004f18 + unaff_x21);
        }
        else {
          uVar47 = 0;
          psVar60 = *(short **)(&UNK_00004f18 + unaff_x21);
          if ((0x1f < uVar27) && (0x3f < (ulong)(lVar36 - (long)psVar60))) {
            lVar50 = 0;
            uVar47 = uVar37 & 0xffffffe0;
            do {
              puVar56 = (undefined8 *)((long)psVar60 + lVar50);
              uVar35 = *puVar56;
              uVar43 = puVar56[3];
              uVar41 = puVar56[2];
              uVar69 = puVar56[5];
              uVar68 = puVar56[4];
              uVar72 = puVar56[7];
              uVar71 = puVar56[6];
              puVar2 = (undefined8 *)(lVar36 + lVar50);
              puVar2[1] = puVar56[1];
              *puVar2 = uVar35;
              puVar2[3] = uVar43;
              puVar2[2] = uVar41;
              puVar2[5] = uVar69;
              puVar2[4] = uVar68;
              puVar2[7] = uVar72;
              puVar2[6] = uVar71;
              lVar50 = lVar50 + 0x40;
            } while ((uVar37 & 0xffffffe0) * 2 != lVar50);
            if (uVar47 == uVar37) goto code_r0x0011ad4c;
          }
          do {
            *(short *)(lVar36 + uVar47 * 2) = psVar60[uVar47];
            uVar47 = uVar47 + 1;
          } while (uVar37 != uVar47);
        }
code_r0x0011ad4c:
        iVar26 = *(int *)(&UNK_00004f04 + unaff_x21);
        lVar36 = (long)iVar26;
        (&UNK_00005d7e)[unaff_x21] = 1;
        iVar28 = func_0x000b91c4(psVar60,psVar60 + lVar36);
        *(int *)(&UNK_00004f04 + unaff_x21) = *(int *)(&UNK_00004f04 + unaff_x21) - iVar26;
        *(int *)(&UNK_00004f08 + unaff_x21) = *(int *)(&UNK_00004f08 + unaff_x21) - iVar28;
        sVar44 = *(short *)(*(long *)(&UNK_00004f18 + unaff_x21) + lVar36 * 2);
        if (sVar44 != 0) {
          psVar51 = (short *)(*(long *)(&UNK_00004f18 + unaff_x21) + lVar36 * 2);
          psVar61 = psVar60;
          do {
            psVar51 = psVar51 + 1;
            psVar60 = psVar61 + 1;
            *psVar61 = sVar44;
            sVar44 = *psVar51;
            psVar61 = psVar60;
          } while (sVar44 != 0);
        }
        *psVar60 = 0;
        *(undefined8 *)(&UNK_00004f50 + unaff_x21) = 0;
        bVar4 = 1;
        pcVar46 = "";
        *(undefined4 *)(&UNK_00004f4c + unaff_x21) = 0;
        unaff_x24 = in_stack_000000d8;
        goto LAB_0011add4;
      }
      pcVar46 = *(char **)(&UNK_00004f38 + unaff_x21);
      iVar26 = _strcmp(in_stack_000000e8,pcVar46);
      if (iVar26 == 0) {
        bVar4 = 0;
        pcVar46 = (char *)0x0;
        goto code_r0x0011ade8;
      }
      iVar26 = *(int *)(&UNK_00004f30 + unaff_x21);
      uVar27 = iVar26 - 1;
      *(undefined8 *)(unaff_x29 + -0xf8) = 0;
      *(undefined8 *)(unaff_x29 + -0xf0) = 0;
      if (iVar26 < 2) {
        iVar28 = 0;
        uVar35 = 0;
      }
      else {
        iVar28 = func_0x000b8e80(pcVar46,pcVar46 + uVar27);
        func_0x0011e9c0(unaff_x29 + -0xf8,iVar28 + 1);
        func_0x000b8db0(*(undefined8 *)(unaff_x29 + -0xf0),*(undefined4 *)(unaff_x29 + -0xf8),
                        pcVar46,pcVar46 + uVar27,0);
        uVar35 = *(undefined8 *)(unaff_x29 + -0xf0);
        iVar28 = *(int *)(unaff_x29 + -0xf8);
      }
      iVar28 = iVar28 + -1;
      if (iVar26 < 2) {
        iVar28 = 0;
      }
      func_0x0011eeb4(puVar1,&UNK_00004f4c + unaff_x21,uVar35,iVar28);
      func_0x0011f010(unaff_x29 + -0xf8);
      bVar4 = 1;
code_r0x0011adec:
      (&UNK_00004f40)[unaff_x21] = 1;
      uVar33 = *(int *)(&UNK_00004f10 + unaff_x21) << 2 | 1;
      iVar26 = *(int *)(&UNK_00004f24 + unaff_x21);
      if (iVar26 < (int)uVar33) {
        iVar28 = iVar26;
        if (iVar26 < 0) {
          iVar28 = iVar26 + 1;
        }
        uVar32 = 8;
        if (iVar26 != 0) {
          uVar32 = iVar26 + (iVar28 >> 1);
        }
        if ((int)uVar32 <= (int)uVar33) {
          uVar32 = uVar33;
        }
        uVar35 = func_0x000b810c((long)(int)uVar32);
        if (*(long *)(&UNK_00004f28 + unaff_x21) != 0) {
          _memcpy(uVar35,*(long *)(&UNK_00004f28 + unaff_x21),
                  (long)*(int *)(&UNK_00004f20 + unaff_x21));
          func_0x000b83d4(*(undefined8 *)(&UNK_00004f28 + unaff_x21));
        }
        *(undefined8 *)(&UNK_00004f28 + unaff_x21) = uVar35;
        *(uint *)(&UNK_00004f24 + unaff_x21) = uVar32;
      }
      else {
        uVar35 = *(undefined8 *)(&UNK_00004f28 + unaff_x21);
      }
      *(uint *)(&UNK_00004f20 + unaff_x21) = uVar33;
      func_0x000b9034(uVar35,uVar33,*(undefined8 *)(&UNK_00004f18 + unaff_x21),0);
      unaff_x24 = in_stack_000000d8;
      uVar33 = in_stack_00000090._4_4_;
      if (!bVar21) goto code_r0x0011ae94;
code_r0x0011ae88:
      if ((uVar33 >> 5 & 1) != 0) {
        if (uStack0000000000000038 != 0) goto code_r0x0011ae94;
      }
    }
    uStack0000000000000034 = (uint)bVar4;
    if (*piVar49 == unaff_w22) goto code_r0x0011b120;
code_r0x0011b608:
    if (pcVar46 != (char *)0x0) goto code_r0x0011b614;
code_r0x0011b180:
  }
  else {
    uVar27 = 0;
    pcVar46 = (char *)0x0;
    uStack0000000000000034 = 0;
    if (*piVar49 != unaff_w22) goto code_r0x0011b608;
code_r0x0011b120:
    if (*(int *)(unaff_x24 + 0x804) != unaff_w22) {
      iVar26 = func_0x000cfb2c();
      if ((iVar26 != 0) && (uVar14 == 0 && (unaff_w25 & 0x4000) == 0)) {
        pcVar48 = *(char **)(&UNK_00005d98 + unaff_x21);
        iVar26 = _strcmp(pcVar48,in_stack_000000e8);
        if (iVar26 != 0) {
          uVar27 = *(int *)(&UNK_00005d90 + unaff_x21) - 1;
          uStack0000000000000034 = 1;
          pcVar46 = pcVar48;
        }
      }
    }
    *piVar49 = 0;
    if (pcVar46 == (char *)0x0) goto code_r0x0011b180;
code_r0x0011b614:
    if ((uVar33 >> 0x12 & 1) != 0) {
      *(undefined8 *)(unaff_x29 + -0xd8) = 0;
      *(undefined8 *)(unaff_x29 + -0xe0) = 0;
      *(undefined8 *)(unaff_x29 + -200) = 0;
      *(undefined8 *)(unaff_x29 + -0xd0) = 0;
      *(undefined8 *)(unaff_x29 + -0xc0) = 0;
      *(long *)(unaff_x29 + -0xf8) = unaff_x21;
      *(undefined4 *)(unaff_x29 + -0xf0) = 0x40000;
      *(uint *)(unaff_x29 + -0xec) = uStack00000000000000e4;
      *(char **)(unaff_x29 + -0xd8) = in_stack_000000e8;
      if (in_stack_000000a8._4_4_ <= (int)(uVar27 + 1)) {
        in_stack_000000a8._4_4_ = uVar27 + 1;
      }
      *(uint *)(unaff_x29 + -0xd0) = uVar27;
      *(int *)(unaff_x29 + -0xcc) = in_stack_000000a8._4_4_;
      *(char **)(unaff_x29 + -0xe8) = in_stack_000000d0;
      (*in_stack_00000068)(unaff_x29 + -0xf8);
      in_stack_000000e8 = *(char **)(unaff_x29 + -0xd8);
      in_stack_000000a8._4_4_ = *(int *)(unaff_x29 + -0xcc);
      uVar27 = *(uint *)(unaff_x29 + -0xd0);
      if ((int)(in_stack_000000a8._4_4_ - 1U) <= (int)*(uint *)(unaff_x29 + -0xd0)) {
        uVar27 = in_stack_000000a8._4_4_ - 1U;
      }
    }
    if ((int)(uVar27 + 1) < in_stack_000000a8._4_4_) {
      in_stack_000000a8._4_4_ = uVar27 + 1;
    }
    func_0x000b7ff8(in_stack_000000e8,pcVar46,(long)in_stack_000000a8._4_4_);
  }
  _in_stack_00000040 = (float *)(&UNK_00005f3c + unaff_x21);
  iVar26 = 0;
  if (*(int *)(unaff_x24 + 0x804) == unaff_w22) {
    iVar26 = iStack000000000000003c;
  }
  if (iVar26 == 1) {
    func_0x000c24fc();
  }
  else if (*(int *)(unaff_x24 + 0x804) == unaff_w22) {
    *(undefined4 *)(&UNK_00006210 + unaff_x21) = 1;
  }
  if (in_stack_000000f0._4_4_ == 0) {
    func_0x000bd308(unaff_x29 + -0xa8);
    uVar30 = *(undefined4 *)(unaff_x29 + -0xa8);
    uVar77 = *(undefined4 *)(unaff_x29 + -0xa4);
    uVar78 = *(undefined4 *)(unaff_x29 + -0xa0);
    uVar80 = *(undefined4 *)(unaff_x29 + -0x9c);
    uVar35 = func_0x000bba44(0x3f800000,7);
    func_0x000bcf14(uVar30,uVar77,uVar78,uVar80,*(undefined4 *)(&UNK_0000392c + unaff_x21),uVar35,1)
    ;
  }
  uStack0000000000000108 = *(undefined8 *)(unaff_x29 + -0xa8);
  fVar64 = (float)((ulong)uStack0000000000000108 >> 0x20);
  _fStack0000000000000110 =
       CONCAT44(in_stack_00000080 + fVar64,in_stack_000000b0 + (float)uStack0000000000000108);
  if (in_stack_000000f0._4_4_ == 0) {
    uStack0000000000000100 =
         CONCAT44(fVar64 + (float)((ulong)*(undefined8 *)(in_stack_000000d8 + 0xc4) >> 0x20),
                  (float)uStack0000000000000108 + (float)*(undefined8 *)(in_stack_000000d8 + 0xc4));
  }
  else {
    uStack0000000000000100 = *(ulong *)(in_stack_000000c8 + 0x110);
  }
  if (bVar20) {
    in_stack_000000e8 = *(char **)(&UNK_00004f28 + unaff_x21);
  }
  if (bVar22 == false) {
    if ((uStack00000000000000e0 | uStack000000000000004c) == 1) {
      in_stack_000000d0 = in_stack_000000e8 + *(int *)(&UNK_00004f08 + unaff_x21);
      goto code_r0x0011b7f4;
    }
    if (in_stack_000000f0._4_4_ != 0) goto code_r0x0011b834;
    if (*(int *)(in_stack_000000d8 + 0x804) == unaff_w22) {
      lVar36 = (long)*(int *)(&UNK_00004f08 + unaff_x21);
    }
    else {
      lVar36 = _strlen(in_stack_000000e8);
    }
    in_stack_000000d0 = in_stack_000000e8 + lVar36;
    fVar64 = 0.0;
    in_stack_000000b0 = 0.0;
    if (0x1fffff < (long)in_stack_000000d0 - (long)in_stack_000000e8) goto code_r0x0011bbe0;
code_r0x0011b7c4:
    puVar56 = &uStack0000000000000108;
code_r0x0011bafc:
    uVar35 = func_0x000bba44(0x3f800000,bVar22);
    func_0x000f4e60(*(undefined4 *)(&UNK_00003d38 + unaff_x21),0,
                    *(undefined8 *)(in_stack_000000c8 + 0x2a8),
                    *(undefined8 *)(&UNK_00003d30 + unaff_x21),&uStack0000000000000100,uVar35,
                    in_stack_000000e8,in_stack_000000d0,puVar56);
    uVar27 = uStack0000000000000034;
    uVar32 = uStack0000000000000024;
joined_r0x0011c234:
    if ((uVar32 & 1) == 0) goto code_r0x0011bb4c;
code_r0x0011c078:
    fVar62 = in_stack_000000b0;
    if (in_stack_000000f0._4_4_ != 0) goto code_r0x0011c07c;
code_r0x0011c104:
    uVar32 = uVar32 ^ 1;
    if ((&UNK_00005ff8)[unaff_x21] == '\0') {
      uVar32 = 1;
    }
    if ((uVar32 & 1) == 0) goto LAB_0011c11c;
LAB_0011c1cc:
    if (0.0 < unaff_s14) goto LAB_0011c1d4;
LAB_0011c148:
    if (((uVar27 ^ 1) & 1) != 0 || (uVar33 & 0x8000000) != 0) goto LAB_0011c160;
  }
  else {
    lVar36 = _strlen(in_stack_00000098);
    in_stack_000000d0 = in_stack_00000098 + lVar36;
    in_stack_000000e8 = in_stack_00000098;
    if (((uStack00000000000000e0 | uStack000000000000004c) & 1) != 0) {
code_r0x0011b7f4:
      puVar58 = *(ushort **)(&UNK_00004f18 + unaff_x21);
      if (uStack00000000000000e0 == 0) {
        puVar40 = (ushort *)0x0;
        iVar26 = -1000;
      }
      else {
        puVar40 = puVar58 + *(int *)(&UNK_00004f4c + unaff_x21);
        iVar26 = -1;
      }
      uVar27 = (uint)(uStack00000000000000e0 != 0);
      if (uStack000000000000004c == 0) {
        puVar59 = (ushort *)0x0;
        iVar28 = -1000;
      }
      else {
        iVar28 = *(int *)(&UNK_00004f50 + unaff_x21);
        if (*(int *)(&UNK_00004f54 + unaff_x21) <= *(int *)(&UNK_00004f50 + unaff_x21)) {
          iVar28 = *(int *)(&UNK_00004f54 + unaff_x21);
        }
        puVar59 = puVar58 + iVar28;
        uVar27 = uVar27 + 1;
        iVar28 = -1;
      }
      iVar29 = 0;
      iVar45 = uVar27 + (in_stack_000000f0._4_4_ >> 0x1a);
      uVar5 = *puVar58;
      puVar38 = puVar58;
joined_r0x0011b89c:
      do {
        if (uVar5 == 10) {
          iVar29 = iVar29 + 1;
          if (iVar26 == -1) {
            if (puVar38 < puVar40) {
              iVar26 = -1;
            }
            else {
              iVar26 = iVar29;
              if (iVar45 < 2) goto code_r0x0011b934;
              iVar45 = iVar45 + -1;
            }
          }
          if (iVar28 != -1) goto code_r0x0011b8a4;
          if (puVar38 < puVar59) {
            iVar28 = -1;
            puVar38 = puVar38 + 1;
            uVar5 = *puVar38;
            goto joined_r0x0011b89c;
          }
          iVar28 = iVar29;
          if (iVar45 < 2) {
code_r0x0011b934:
            puVar38 = (ushort *)func_0x000b84f0(puVar40,puVar58);
            piVar49 = *(int **)(&UNK_00003d30 + unaff_x21);
            fVar62 = *(float *)(&UNK_00003d38 + unaff_x21);
            fVar64 = 0.0;
            do {
              fVar66 = 0.0;
              puVar39 = puVar38;
              while( true ) {
                do {
                  if (puVar40 <= puVar39) {
                    if (iVar26 == -1) {
                      iVar26 = iVar29 + 1;
                    }
                    if (iVar28 == -1) {
                      iVar28 = iVar29 + 1;
                    }
                    if (fVar66 <= fVar64) {
                      fVar66 = fVar64;
                    }
                    fVar70 = 0.0;
                    fVar79 = 0.0;
                    fVar63 = fVar62;
                    if (iVar28 < 0) goto code_r0x0011ba78;
                    puVar40 = (ushort *)func_0x000b84f0(puVar59,puVar58);
                    piVar49 = *(int **)(&UNK_00003d30 + unaff_x21);
                    fVar63 = *(float *)(&UNK_00003d38 + unaff_x21);
                    fVar64 = 0.0;
                    goto LAB_0011ba14;
                  }
                  puVar38 = puVar39 + 1;
                  uVar5 = *puVar39;
                  puVar39 = puVar38;
                } while (uVar5 == 0xd);
                if (uVar5 == 10) break;
                pfVar52 = (float *)(piVar49 + 4);
                if ((int)(uint)uVar5 < *piVar49) {
                  pfVar52 = (float *)(*(long *)(piVar49 + 2) + (ulong)(uint)uVar5 * 4);
                }
                fVar66 = fVar66 + (fVar62 / (float)piVar49[5]) * *pfVar52;
              }
              if (fVar64 < fVar66) {
                fVar64 = fVar66;
              }
            } while( true );
          }
          iVar45 = iVar45 + -1;
          uVar5 = puVar38[1];
        }
        else {
          if (uVar5 == 0) goto code_r0x0011b934;
code_r0x0011b8a4:
          uVar5 = puVar38[1];
        }
        puVar38 = puVar38 + 1;
      } while( true );
    }
    fVar64 = 0.0;
    if (in_stack_000000f0._4_4_ != 0) {
code_r0x0011b834:
      iVar26 = 0;
      in_stack_000000d0 = in_stack_000000e8;
      while( true ) {
        pcVar46 = in_stack_000000d0 + 1;
        cVar6 = *in_stack_000000d0;
        if (cVar6 == '\0') break;
        in_stack_000000d0 = pcVar46;
        if (cVar6 == '\n') {
          iVar26 = iVar26 + 1;
        }
      }
      fVar64 = *(float *)(&UNK_00003d38 + unaff_x21) * (float)(iVar26 + 1);
      if (in_stack_000000f0._4_4_ == 0) {
        lVar36 = (long)in_stack_000000d0 - (long)in_stack_000000e8;
        goto joined_r0x0011bb8c;
      }
      puVar56 = (undefined8 *)0x0;
      goto code_r0x0011bafc;
    }
    lVar36 = (long)in_stack_000000d0 - (long)in_stack_00000098;
    in_stack_000000b0 = 0.0;
joined_r0x0011bb8c:
    if (lVar36 < 0x200000) goto code_r0x0011b7c4;
code_r0x0011bbe0:
    uVar32 = uStack0000000000000024;
    uVar27 = uStack0000000000000034;
    if ((uStack0000000000000024 & 1) != 0) goto code_r0x0011c078;
code_r0x0011bb4c:
    func_0x000d34c4();
    fVar62 = in_stack_000000b0;
    if (in_stack_000000f0._4_4_ == 0) goto code_r0x0011c104;
code_r0x0011c07c:
    uStack00000000000000f8._0_4_ = fVar62;
    uStack00000000000000f8._4_4_ = fVar64 + *(float *)(&UNK_00003928 + unaff_x21);
    lVar36 = *(long *)(lRam0000000000a334c0 + 0x4000);
    *(undefined1 *)(lVar36 + 0xc0) = 1;
    if (*(char *)(lVar36 + 0xc3) == '\0') {
      uVar35 = *(undefined8 *)(lVar36 + 0x110);
      *(undefined8 *)(unaff_x29 + -0xf8) = uVar35;
      *(ulong *)(unaff_x29 + -0xf0) =
           CONCAT44(uStack00000000000000f8._4_4_ + (float)((ulong)uVar35 >> 0x20),
                    (float)uStack00000000000000f8 + (float)uVar35);
      func_0x000d0d0c(0xbf800000,&uStack00000000000000f8);
      func_0x000d0e24(unaff_x29 + -0xf8,0,0,0);
    }
    *(uint *)(in_stack_000000d8 + 0x112c) = *(uint *)(in_stack_000000d8 + 0x112c) | 0x401;
    func_0x000d0b80();
    uVar34 = in_stack_000000a0[2];
    func_0x000d818c();
    if (*in_stack_000000a0 != 0) goto code_r0x0011c104;
    *in_stack_000000a0 = unaff_w22;
    in_stack_000000a0[1] = in_stack_00000020;
    in_stack_000000a0[2] = uVar34 & 0x80 | uStack000000000000001c;
    uVar32 = uVar32 ^ 1;
    if ((&UNK_00005ff8)[unaff_x21] == '\0') {
      uVar32 = 1;
    }
    if ((uVar32 & 1) != 0) goto LAB_0011c1cc;
LAB_0011c11c:
    func_0x000dc80c("{","}");
    func_0x000bc2c4(&uStack0000000000000100,in_stack_000000e8,in_stack_000000d0);
    if (unaff_s14 <= 0.0) goto LAB_0011c148;
LAB_0011c1d4:
    func_0x000bc130(*(float *)(unaff_x29 + -0xa0) + *(float *)(&UNK_0000393c + unaff_x21),
                    *(float *)(unaff_x29 + -0xa4) + *(float *)(&UNK_00003928 + unaff_x21),
                    in_stack_00000028,0,1);
    if (((uVar27 ^ 1) & 1) != 0 || (uVar33 & 0x8000000) != 0) goto LAB_0011c160;
  }
  func_0x000c255c();
LAB_0011c160:
  if ((uVar33 & 0x20) != 0) {
    uVar27 = uStack0000000000000038;
  }
  return uVar27;
LAB_0011ba14:
  fVar70 = 0.0;
  puVar38 = puVar40;
LAB_0011ba18:
  if (puVar38 < puVar59) goto code_r0x0011ba20;
  if (fVar70 <= fVar64) {
    fVar70 = fVar64;
  }
  fVar79 = fVar63 * (float)iVar28;
code_r0x0011ba78:
  fVar62 = fVar62 * (float)iVar26;
  fVar65 = fVar63 * (float)(iVar29 + 1);
  fVar64 = fVar65;
  if (in_stack_000000f0._4_4_ == 0) {
    fVar64 = 0.0;
  }
  if ((uStack00000000000000e0 != 0) && ((&UNK_00005d7c)[unaff_x21] != '\0')) {
    if ((in_stack_00000090._4_4_ >> 0xc & 1) == 0) {
      if (*(float *)(&UNK_00004f48 + unaff_x21) <= fVar66) {
        fVar73 = fVar66 - (in_stack_000000b0 - *(float *)(in_stack_000000d8 + 0xc4));
        if (fVar73 < *(float *)(&UNK_00004f48 + unaff_x21)) goto code_r0x0011bc1c;
        fVar73 = in_stack_000000b0 * 0.25 + fVar73;
      }
      else {
        fVar67 = fVar66 - in_stack_000000b0 * 0.25;
        fVar73 = 0.0;
        if (0.0 < fVar67) {
          fVar73 = fVar67;
        }
      }
      *(float *)(&UNK_00004f48 + unaff_x21) = (float)(int)fVar73;
    }
    else {
      *(undefined4 *)(&UNK_00004f48 + unaff_x21) = 0;
    }
code_r0x0011bc1c:
    if (in_stack_000000f0._4_4_ != 0) {
      fVar63 = fVar62 - fVar63;
      if (unaff_s13 <= fVar63) {
        fVar63 = *(float *)(&UNK_00003928 + unaff_x21);
        if (unaff_s13 <= fVar62 - (in_stack_00000080 + fVar63 * -2.0)) {
          unaff_s13 = (fVar62 - in_stack_00000080) + fVar63 * 2.0;
        }
      }
      else {
        unaff_s13 = 0.0;
        if (0.0 < fVar63) {
          unaff_s13 = fVar63;
        }
        fVar63 = *(float *)(&UNK_00003928 + unaff_x21);
      }
      in_stack_00000080 = (fVar65 + fVar63 * 2.0) - in_stack_00000080;
      if (in_stack_00000080 < 0.0) {
        in_stack_00000080 = 0.0;
      }
      if (unaff_s13 <= in_stack_00000080) {
        in_stack_00000080 = unaff_s13;
      }
      fVar63 = 0.0;
      if (0.0 <= unaff_s13) {
        fVar63 = in_stack_00000080;
      }
      uStack0000000000000100 =
           CONCAT44(uStack0000000000000100._4_4_ + (*(float *)(in_stack_000000c8 + 0x90) - fVar63),
                    (float)uStack0000000000000100);
      *(float *)(in_stack_000000c8 + 0x90) = fVar63;
    }
    (&UNK_00005d7c)[unaff_x21] = 0;
  }
  fVar63 = *(float *)(&UNK_00004f48 + unaff_x21);
  if (uStack000000000000004c != 0) {
    iVar28 = *(int *)(&UNK_00004f50 + unaff_x21);
    iVar29 = *(int *)(&UNK_00004f54 + unaff_x21);
    iVar26 = iVar28;
    if (iVar29 <= iVar28) {
      iVar26 = iVar29;
    }
    if (iVar28 <= iVar29) {
      iVar28 = iVar29;
    }
    uVar35 = 0x3f800000;
    if (uStack00000000000000e0 == 0) {
      uVar35 = 0x3f19999a;
    }
    uVar35 = func_0x000bba44(uVar35,0x2f);
    fVar65 = 0.0;
    if (in_stack_000000f0._4_4_ == 0) {
      fVar65 = -1.0;
    }
    fVar73 = 0.0;
    if (in_stack_000000f0._4_4_ == 0) {
      fVar73 = 2.0;
    }
    if (iVar26 < iVar28) {
      puVar40 = puVar58 + iVar28;
      puVar58 = puVar58 + iVar26;
      uVar37 = uStack0000000000000100 & 0xffffffff;
      fVar70 = fVar70 + (float)uStack0000000000000100;
      fVar79 = fVar79 + uStack0000000000000100._4_4_;
      fVar67 = *(float *)(&UNK_00003d38 + unaff_x21);
      do {
        if (fStack0000000000000114 + fVar67 < fVar79) break;
        puVar59 = puVar58;
        if (uStack0000000000000108._4_4_ <= fVar79) {
          piVar49 = *(int **)(&UNK_00003d30 + unaff_x21);
          pfVar52 = (float *)(piVar49 + 4);
          fVar74 = 0.0;
          while (puVar58 < puVar40) {
            puVar59 = puVar58 + 1;
            uVar5 = *puVar58;
            puVar58 = puVar59;
            if (uVar5 != 0xd) {
              if (uVar5 == 10) {
                fVar75 = 0.0;
                if (0.0 < fVar74) {
                  fVar75 = fVar74;
                }
                fVar74 = 0.0;
                if (0.0 <= fVar75) {
                  fVar74 = fVar75;
                }
                goto joined_r0x0011be20;
              }
              pfVar53 = pfVar52;
              if ((int)(uint)uVar5 < *piVar49) {
                pfVar53 = (float *)(*(long *)(piVar49 + 2) + (ulong)(uint)uVar5 * 4);
              }
              fVar74 = fVar74 + (fVar67 / (float)piVar49[5]) * *pfVar53;
            }
          }
          if (fVar74 <= 0.0) {
            fVar74 = 0.0;
          }
joined_r0x0011be20:
          if (fVar74 <= 0.0) {
            if (0x20 < *piVar49) {
              pfVar52 = (float *)(*(long *)(piVar49 + 2) + 0x80);
            }
            fVar74 = (float)(int)(*pfVar52 * 0.5);
          }
          fVar76 = (fVar70 - fVar63) + 0.0;
          fVar75 = fVar79 + (fVar65 - fVar67);
          fVar74 = (fVar70 - fVar63) + fVar74;
          if (fVar76 < (float)uStack0000000000000108) {
            fVar76 = (float)uStack0000000000000108;
          }
          if (fVar75 < uStack0000000000000108._4_4_) {
            fVar75 = uStack0000000000000108._4_4_;
          }
          *(float *)(unaff_x29 + -0xf8) = fVar76;
          *(float *)(unaff_x29 + -0xf4) = fVar75;
          if (fStack0000000000000110 <= fVar74) {
            fVar74 = fStack0000000000000110;
          }
          fVar70 = fVar73 + fVar79;
          if (fStack0000000000000114 <= fVar73 + fVar79) {
            fVar70 = fStack0000000000000114;
          }
          *(float *)(unaff_x29 + -0xf0) = fVar74;
          *(float *)(unaff_x29 + -0xec) = fVar70;
          bVar21 = false;
          bVar20 = true;
          bVar23 = false;
          if (uStack0000000000000108._4_4_ < fVar70) {
            bVar21 = false;
            bVar20 = false;
            bVar23 = true;
            if (!NAN(fStack0000000000000114) && !NAN(fVar75)) {
              bVar21 = fStack0000000000000114 < fVar75;
              bVar20 = fStack0000000000000114 == fVar75;
              bVar23 = false;
            }
          }
          bVar19 = false;
          if ((!bVar20 && bVar21 == bVar23) &&
             (bVar19 = false, !NAN((float)uStack0000000000000108) && !NAN(fVar74))) {
            bVar19 = (float)uStack0000000000000108 < fVar74;
          }
          bVar21 = false;
          bVar20 = true;
          bVar23 = false;
          if (bVar19) {
            bVar21 = false;
            bVar20 = false;
            bVar23 = true;
            if (!NAN(fStack0000000000000110) && !NAN(fVar76)) {
              bVar21 = fStack0000000000000110 < fVar76;
              bVar20 = fStack0000000000000110 == fVar76;
              bVar23 = false;
            }
          }
          if (!bVar20 && bVar21 == bVar23) {
            func_0x000f3bb0(0,*(undefined8 *)(in_stack_000000c8 + 0x2a8),unaff_x29 + -0xf8,
                            unaff_x29 + -0xf0,uVar35,0);
            uVar37 = uStack0000000000000100 & 0xffffffff;
            fVar67 = *(float *)(&UNK_00003d38 + unaff_x21);
          }
        }
        else {
          do {
            puVar58 = puVar59;
            if (puVar40 <= puVar59) break;
            puVar58 = puVar59 + 1;
            uVar5 = *puVar59;
            puVar59 = puVar58;
          } while (uVar5 != 10);
        }
        fVar79 = fVar79 + fVar67;
        fVar70 = (float)uVar37;
      } while (puVar58 < puVar40);
    }
  }
  uVar27 = uStack0000000000000034;
  if (in_stack_000000f0._4_4_ == 0) {
    if ((long)in_stack_000000d0 - (long)in_stack_000000e8 < 0x200000) {
      puVar56 = &uStack0000000000000108;
      goto code_r0x0011bf08;
    }
  }
  else {
    puVar56 = (undefined8 *)0x0;
code_r0x0011bf08:
    uVar35 = func_0x000bba44(0x3f800000,bVar22);
    uVar41 = *(undefined8 *)(in_stack_000000c8 + 0x2a8);
    uVar43 = *(undefined8 *)(&UNK_00003d30 + unaff_x21);
    uVar30 = *(undefined4 *)(&UNK_00003d38 + unaff_x21);
    *(float *)(unaff_x29 + -0xf8) = (float)uStack0000000000000100 - fVar63;
    *(float *)(unaff_x29 + -0xf4) = uStack0000000000000100._4_4_;
    func_0x000f4e60(uVar30,0,uVar41,uVar43,unaff_x29 + -0xf8,uVar35,in_stack_000000e8,
                    in_stack_000000d0,puVar56);
  }
  in_stack_000000b0 = in_stack_00000050;
  uVar33 = in_stack_00000090._4_4_;
  uVar32 = uStack0000000000000024;
  if (uStack00000000000000e0 != 0) {
    fVar70 = *(float *)(unaff_x21 + 0x18) + *(float *)(&UNK_00005d78 + unaff_x21);
    *(float *)(&UNK_00005d78 + unaff_x21) = fVar70;
    bVar21 = true;
    if ((*(char *)(unaff_x21 + 0x5b) != '\0') && (0.0 < fVar70)) {
      fVar70 = (float)_fmodf(fVar70,0x3f99999a);
      bVar21 = fVar70 <= 0.8;
    }
    uVar32 = uStack0000000000000024;
    fVar63 = (float)(int)((fVar66 + (float)uStack0000000000000100) - fVar63);
    fVar79 = (float)(int)(fVar62 + uStack0000000000000100._4_4_);
    fVar66 = (fVar79 - *(float *)(&UNK_00003d38 + unaff_x21)) + 0.5;
    fVar70 = fVar63 + 1.0;
    *(float *)(unaff_x29 + -0xf8) = fVar63;
    *(float *)(unaff_x29 + -0xf4) = fVar66;
    fVar62 = fVar79 + -1.5;
    *(float *)(unaff_x29 + -0xf0) = fVar70;
    *(float *)(unaff_x29 + -0xec) = fVar62;
    if (bVar21) {
      bVar21 = false;
      bVar20 = true;
      bVar22 = false;
      if (uStack0000000000000108._4_4_ < fVar62) {
        bVar21 = false;
        bVar20 = false;
        bVar22 = true;
        if (!NAN(fStack0000000000000114) && !NAN(fVar66)) {
          bVar21 = fStack0000000000000114 < fVar66;
          bVar20 = fStack0000000000000114 == fVar66;
          bVar22 = false;
        }
      }
      bVar23 = false;
      if ((!bVar20 && bVar21 == bVar22) &&
         (bVar23 = false, !NAN((float)uStack0000000000000108) && !NAN(fVar70))) {
        bVar23 = (float)uStack0000000000000108 < fVar70;
      }
      bVar21 = false;
      bVar20 = true;
      bVar22 = false;
      if (bVar23) {
        bVar21 = false;
        bVar20 = false;
        bVar22 = true;
        if (!NAN(fStack0000000000000110) && !NAN(fVar63)) {
          bVar21 = fStack0000000000000110 < fVar63;
          bVar20 = fStack0000000000000110 == fVar63;
          bVar22 = false;
        }
      }
      if (!bVar20 && bVar21 == bVar22) {
        uVar41 = *(undefined8 *)(in_stack_000000c8 + 0x2a8);
        uStack00000000000000f8._0_4_ = fVar63;
        uStack00000000000000f8._4_4_ = fVar62;
        uVar35 = func_0x000bba44(0x3f800000,0);
        func_0x000f397c(0x3f800000,uVar41,unaff_x29 + -0xf8,&uStack00000000000000f8,uVar35);
      }
    }
    if (uVar17 == 0 && (unaff_w25 & 0x4000) == 0) {
      (&UNK_00005f38)[unaff_x21] = 1;
      *_in_stack_00000040 = fVar63 + -1.0;
      *(float *)(&UNK_00005f40 + unaff_x21) = fVar79 - *(float *)(&UNK_00003d38 + unaff_x21);
      *(float *)(&UNK_00005f44 + unaff_x21) = *(float *)(&UNK_00003d38 + unaff_x21);
    }
  }
  goto joined_r0x0011c234;
code_r0x0011ba20:
  puVar40 = puVar38 + 1;
  uVar5 = *puVar38;
  puVar38 = puVar40;
  if (uVar5 == 0xd) goto LAB_0011ba18;
  if (uVar5 != 10) {
    pfVar52 = (float *)(piVar49 + 4);
    if ((int)(uint)uVar5 < *piVar49) {
      pfVar52 = (float *)(*(long *)(piVar49 + 2) + (ulong)(uint)uVar5 * 4);
    }
    fVar70 = fVar70 + (fVar63 / (float)piVar49[5]) * *pfVar52;
    goto LAB_0011ba18;
  }
  if (fVar64 < fVar70) {
    fVar64 = fVar70;
  }
  goto LAB_0011ba14;
}

