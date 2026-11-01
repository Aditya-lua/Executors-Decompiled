
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

uint FUN_0011a018(int param_1)

{
  undefined8 *puVar1;
  bool bVar2;
  char cVar3;
  ushort uVar4;
  bool bVar5;
  byte in_ZR;
  bool bVar6;
  bool bVar7;
  undefined1 uVar8;
  bool bVar9;
  bool bVar10;
  byte bVar11;
  int iVar12;
  int iVar13;
  int iVar14;
  undefined4 uVar15;
  uint uVar16;
  long lVar17;
  undefined8 uVar18;
  ulong uVar19;
  ushort *puVar20;
  ushort *puVar21;
  ushort *puVar22;
  undefined8 uVar23;
  undefined2 *puVar24;
  undefined8 uVar25;
  short sVar26;
  uint uVar27;
  int iVar28;
  char *pcVar29;
  ulong uVar30;
  char *pcVar31;
  int *piVar32;
  uint in_w9;
  long lVar33;
  short *psVar34;
  float *pfVar35;
  uint uVar36;
  float *pfVar37;
  uint uVar38;
  byte bVar39;
  int unaff_w19;
  uint uVar40;
  undefined8 *puVar41;
  long unaff_x21;
  int iVar42;
  undefined8 unaff_x22;
  char *unaff_x24;
  int *piVar43;
  uint unaff_w25;
  ushort *puVar44;
  undefined *unaff_x26;
  uint unaff_w27;
  ushort *puVar45;
  byte bVar46;
  int *unaff_x28;
  short *psVar47;
  short *psVar48;
  long unaff_x29;
  float fVar49;
  float fVar50;
  float fVar51;
  float fVar52;
  float fVar53;
  float fVar54;
  float fVar55;
  undefined8 uVar56;
  undefined8 uVar57;
  float fVar58;
  undefined8 uVar59;
  undefined8 uVar60;
  float fVar61;
  float fVar62;
  undefined4 uVar63;
  undefined4 uVar64;
  float fVar65;
  undefined4 uVar66;
  float fVar67;
  float unaff_s14;
  uint uStack000000000000000c;
  int iStack0000000000000010;
  uint uStack0000000000000014;
  undefined8 in_stack_00000018;
  int in_stack_00000020;
  uint uStack0000000000000024;
  undefined8 in_stack_00000028;
  uint uStack0000000000000034;
  float *pfStack0000000000000040;
  uint uStack000000000000004c;
  float in_stack_00000050;
  code *in_stack_00000068;
  float in_stack_00000080;
  uint uStack0000000000000094;
  char *in_stack_00000098;
  undefined8 in_stack_000000a8;
  float in_stack_000000b0;
  long in_stack_000000c8;
  char *in_stack_000000d0;
  char *in_stack_000000d8;
  uint in_stack_000000e0;
  uint uStack00000000000000e4;
  char *in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 uStack00000000000000f8;
  undefined8 uStack0000000000000100;
  undefined8 uStack0000000000000108;
  float fStack0000000000000110;
  float fStack0000000000000114;
  
  uVar27 = (uint)in_ZR;
  iVar42 = (int)unaff_x22;
  uStack0000000000000014 = in_w9;
  uStack0000000000000094 = unaff_w25;
  if (param_1 == 0) {
    uVar38 = 0;
    uStack00000000000000e4 = 0;
    if (unaff_w27 != 0) goto LAB_0011a078;
LAB_0011a0a0:
    uVar36 = 0;
    if (unaff_w27 != 0) {
      uVar40 = 0;
      goto LAB_0011a150;
    }
    fVar67 = 3.4028235e+38;
    uVar40 = 0;
    if (unaff_x26 == (undefined *)0x0) goto LAB_0011a0e4;
LAB_0011a178:
    bVar7 = (bool)unaff_x26[0x6b] != (unaff_w27 == 0);
    uVar40 = uVar38 | uVar40 | uVar27;
    if ((uVar40 & 1) != 0 || uVar36 != 0) goto LAB_0011a1a4;
    if ((bool)unaff_x26[0x6b] != (unaff_w27 == 0)) {
      bVar46 = 0;
      uVar40 = 0;
      bVar7 = true;
      goto LAB_0011a220;
    }
LAB_0011a1ec:
    bVar46 = 0;
    uVar8 = *(char *)(unaff_x21 + 0x59) == '\0';
    uStack0000000000000034 = 0;
    iVar12 = *(int *)(unaff_x24 + 0x804);
  }
  else {
    uVar38 = (uint)(*unaff_x24 != '\0');
    uStack00000000000000e4 = (uint)(*unaff_x24 != '\0');
    if (unaff_w27 == 0) goto LAB_0011a0a0;
LAB_0011a078:
    if (unaff_x26 == (undefined *)0x0) goto LAB_0011a0a0;
    if (unaff_w19 == 0) {
      iVar12 = *(int *)(unaff_x24 + 0x82c);
      iVar13 = func_0x000c0ed4(in_stack_000000c8,"#SCROLLY",0);
      uVar40 = (uint)(iVar12 == iVar13);
      unaff_w19 = *(int *)(unaff_x24 + 0x804);
    }
    else {
      uVar40 = 0;
    }
    iVar12 = func_0x000c0ed4(in_stack_000000c8,"#SCROLLY",0);
    uVar36 = (uint)(unaff_w19 == iVar12);
    uVar38 = uStack00000000000000e4;
LAB_0011a150:
    fVar67 = *(float *)(in_stack_000000c8 + 0x90);
    if (unaff_x26 != (undefined *)0x0) goto LAB_0011a178;
LAB_0011a0e4:
    uVar40 = uVar38 | uVar40 | uVar27;
    if ((uVar40 | uVar36) != 1) goto LAB_0011a1ec;
    bVar7 = false;
LAB_0011a1a4:
    bVar46 = 1;
    if ((*(int *)(unaff_x24 + 0x804) != iVar42) || (bVar7)) {
      bVar46 = 1;
LAB_0011a220:
      *(undefined4 *)(&UNK_00005d78 + unaff_x21) = 0xbe99999a;
      func_0x0011e888(unaff_x28[0x156]);
      iVar14 = _strlen(in_stack_000000e8);
      iVar12 = iVar14 + 1;
      iVar13 = *(int *)(&UNK_00004f34 + unaff_x21);
      if (iVar14 < iVar13) {
        uVar18 = *(undefined8 *)(&UNK_00004f38 + unaff_x21);
      }
      else {
        if (iVar13 == 0) {
          iVar13 = 8;
        }
        else {
          iVar28 = iVar13;
          if (iVar13 < 0) {
            iVar28 = iVar13 + 1;
          }
          iVar13 = iVar13 + (iVar28 >> 1);
        }
        if (iVar13 <= iVar12) {
          iVar13 = iVar12;
        }
        uVar18 = func_0x000b810c((long)iVar13);
        if (*(long *)(&UNK_00004f38 + unaff_x21) != 0) {
          _memcpy(uVar18,*(long *)(&UNK_00004f38 + unaff_x21),
                  (long)*(int *)(&UNK_00004f30 + unaff_x21));
          func_0x000b83d4(*(undefined8 *)(&UNK_00004f38 + unaff_x21));
        }
        *(undefined8 *)(&UNK_00004f38 + unaff_x21) = uVar18;
        *(int *)(&UNK_00004f34 + unaff_x21) = iVar13;
        unaff_w27 = in_stack_000000f0._4_4_;
      }
      *(int *)(&UNK_00004f30 + unaff_x21) = iVar12;
      _memcpy(uVar18,in_stack_000000e8,(long)iVar12);
      unaff_w25 = uStack0000000000000094;
      if (unaff_x28[0x156] != iVar42) {
        bVar7 = true;
      }
      if (bVar7) {
        bVar7 = false;
      }
      else if ((unaff_x28[0x158] == iVar14) &&
              (((&UNK_00004f40)[unaff_x21] == '\0' ||
               (iVar12 = _strncmp(*(undefined8 *)(&UNK_00004f28 + unaff_x21),in_stack_000000e8,
                                  (long)iVar14), iVar12 == 0)))) {
        bVar7 = true;
      }
      else {
        bVar7 = false;
      }
      *(undefined8 *)(unaff_x29 + -0xf8) = 0;
      unaff_x28[0x156] = iVar42;
      uVar38 = in_stack_000000a8._4_4_ + 1;
      iVar12 = *(int *)(&UNK_00004f14 + unaff_x21);
      if (iVar12 <= in_stack_000000a8._4_4_) {
        if (iVar12 == 0) {
          uVar16 = 8;
        }
        else {
          iVar13 = iVar12;
          if (iVar12 < 0) {
            iVar13 = iVar12 + 1;
          }
          uVar16 = iVar12 + (iVar13 >> 1);
        }
        if ((int)uVar16 <= (int)uVar38) {
          uVar16 = uVar38;
        }
        uVar18 = func_0x000b810c(-(ulong)(uVar16 >> 0x1f) & 0xfffffffe00000000 | (ulong)uVar16 << 1)
        ;
        if (*(long *)(&UNK_00004f18 + unaff_x21) != 0) {
          _memcpy(uVar18,*(long *)(&UNK_00004f18 + unaff_x21),
                  (long)(int)*(uint *)(&UNK_00004f10 + unaff_x21) << 1);
          func_0x000b83d4(*(undefined8 *)(&UNK_00004f18 + unaff_x21));
        }
        *(undefined8 *)(&UNK_00004f18 + unaff_x21) = uVar18;
        *(uint *)(&UNK_00004f14 + unaff_x21) = uVar16;
        unaff_w25 = uStack0000000000000094;
      }
      *(uint *)(&UNK_00004f10 + unaff_x21) = uVar38;
      if (*(int *)(&UNK_00004f24 + unaff_x21) < 0) {
        uVar18 = func_0x000b810c(0);
        if (*(long *)(&UNK_00004f28 + unaff_x21) != 0) {
          _memcpy(uVar18,*(long *)(&UNK_00004f28 + unaff_x21),
                  (long)*(int *)(&UNK_00004f20 + unaff_x21));
          func_0x000b83d4(*(undefined8 *)(&UNK_00004f28 + unaff_x21));
        }
        *(undefined8 *)(&UNK_00004f28 + unaff_x21) = uVar18;
        *(undefined4 *)(&UNK_00004f24 + unaff_x21) = 0;
      }
      *(undefined4 *)(&UNK_00004f20 + unaff_x21) = 0;
      (&UNK_00004f40)[unaff_x21] = 0;
      iVar12 = func_0x000b8db0(*(undefined8 *)(&UNK_00004f18 + unaff_x21),in_stack_000000a8._4_4_,
                               in_stack_000000e8,0,unaff_x29 + -0xf8);
      unaff_x28[0x157] = iVar12;
      unaff_x28[0x158] = *(int *)(unaff_x29 + -0xf8) - (int)in_stack_000000e8;
      if (bVar7) {
        uVar18 = NEON_smin(*(undefined8 *)(&UNK_00004f4c + unaff_x21),CONCAT44(iVar12,iVar12),4);
        *(undefined8 *)(&UNK_00004f4c + unaff_x21) = uVar18;
        iVar13 = *(int *)(&UNK_00004f54 + unaff_x21);
        if (iVar12 <= *(int *)(&UNK_00004f54 + unaff_x21)) {
          iVar13 = iVar12;
        }
        *(int *)(&UNK_00004f54 + unaff_x21) = iVar13;
        if (unaff_w27 == 0) goto code_r0x0011a44c;
code_r0x0011a4c8:
        uVar38 = 0;
      }
      else {
        *(undefined4 *)(&UNK_00005d6a + unaff_x21) = 0x630000;
        *(undefined8 *)(&UNK_00005d70 + unaff_x21) = _UNK_00813250;
        *(undefined8 *)(&UNK_00004f48 + unaff_x21) = 0;
        *(undefined8 *)(&UNK_00004f50 + unaff_x21) = 0;
        (&UNK_00004f62)[unaff_x21] = 0;
        *(undefined4 *)(&UNK_00004f68 + unaff_x21) = 0;
        *(undefined2 *)(&UNK_00004f60 + unaff_x21) = 0x100;
        (&UNK_00004f63)[unaff_x21] = unaff_w27 == 0;
        (&UNK_00004f58)[unaff_x21] = 0;
        *(undefined4 *)(&UNK_00004f5c + unaff_x21) = 0;
        if (unaff_w27 != 0) goto code_r0x0011a4c8;
code_r0x0011a44c:
        uVar38 = unaff_w25 >> 4 & 1;
        if ((uVar27 != 0) && ((!bVar7 || ((*(byte *)(unaff_x28 + 0x67) >> 2 & 1) == 0)))) {
          uVar38 = 1;
        }
        if ((uStack00000000000000e4 != 0) && (*(char *)(unaff_x21 + 0xe5c) != '\0')) {
          uVar38 = 1;
        }
      }
      unaff_x26 = &UNK_00004ef8 + unaff_x21;
      if ((unaff_w25 >> 0xd & 1) != 0) {
        (&UNK_00004f58)[unaff_x21] = 1;
      }
      cVar3 = *(char *)(unaff_x21 + 0x59);
      uStack0000000000000034 = (uint)(uVar38 != 0);
      iVar12 = *(int *)(in_stack_000000d8 + 0x804);
      unaff_x24 = in_stack_000000d8;
      uVar38 = uStack00000000000000e4;
    }
    else {
      cVar3 = *(char *)(unaff_x21 + 0x59);
      uStack0000000000000034 = 0;
      iVar12 = *(int *)(unaff_x24 + 0x804);
    }
    uVar8 = cVar3 == '\0';
    if ((uVar40 != 0) && (iVar12 != iVar42)) {
      func_0x000c23ac(unaff_x22);
      func_0x000dada8(unaff_x22);
      func_0x000c3098();
      iVar12 = *(int *)((long)unaff_x24 + 0x804);
      uVar38 = uStack00000000000000e4;
    }
  }
  if (iVar12 == iVar42) {
    if (uVar38 != 0) {
      func_0x000c95f8(0x28f,unaff_x22,0);
    }
    uVar27 = 3;
    if ((unaff_w25 & 0x4000080) != 0) {
      uVar27 = 0xf;
    }
    *(uint *)(unaff_x24 + 0x1108) = *(uint *)(unaff_x24 + 0x1108) | uVar27;
    func_0x000c95f8(0x20d,unaff_x22,0);
    func_0x000c95f8(0x273,unaff_x22,0);
    func_0x000c95f8(0x207,unaff_x22,0);
    func_0x000c95f8(0x208,unaff_x22,0);
    if (unaff_w27 != 0) {
      func_0x000c95f8(0x205,unaff_x22,0);
      func_0x000c95f8(0x206,unaff_x22,0);
    }
    if (!(bool)uVar8) {
      func_0x000c95f8(0x4000,unaff_x22,0);
    }
  }
  iVar12 = *(int *)(unaff_x24 + 0x804);
  if ((iVar12 == iVar42) && (unaff_x26 == (undefined *)0x0)) {
    func_0x000c24fc();
    iVar12 = *(int *)(unaff_x24 + 0x804);
  }
  uStack00000000000000e4 = (in_stack_000000e0 & 0x80) << 7;
  if (iVar12 == iVar42) {
    bVar7 = (bool)(*unaff_x24 != '\0' & (bVar46 ^ 1));
    in_stack_000000e0 = 1;
    if (unaff_x26 == (undefined *)0x0) goto code_r0x0011a660;
code_r0x0011a68c:
    uStack00000000000000e4 = uStack00000000000000e4 | unaff_w25;
    uVar38 = uStack0000000000000034;
    if (*(int *)(unaff_x26 + 0x58) != *(int *)(unaff_x26 + 0x5c)) {
      uVar38 = 1;
    }
    uStack000000000000004c = uVar38 & in_stack_000000e0;
    uVar27 = uStack00000000000000e4;
    if ((in_stack_000000e0 & uStack00000000000000e4 >> 0xe) == 1) {
      *(undefined8 *)(unaff_x29 + -0xf8) = 0;
      uVar36 = in_stack_000000a8._4_4_ + 1;
      iVar12 = *(int *)(unaff_x26 + 0x1c);
      if (in_stack_000000a8._4_4_ < iVar12) {
        uVar18 = *(undefined8 *)(unaff_x26 + 0x20);
      }
      else {
        if (iVar12 == 0) {
          uVar27 = 8;
        }
        else {
          iVar13 = iVar12;
          if (iVar12 < 0) {
            iVar13 = iVar12 + 1;
          }
          uVar27 = iVar12 + (iVar13 >> 1);
        }
        if ((int)uVar27 <= (int)uVar36) {
          uVar27 = uVar36;
        }
        uVar18 = func_0x000b810c(-(ulong)(uVar27 >> 0x1f) & 0xfffffffe00000000 | (ulong)uVar27 << 1)
        ;
        if (*(long *)(unaff_x26 + 0x20) != 0) {
          _memcpy(uVar18,*(long *)(unaff_x26 + 0x20),(long)*(int *)(unaff_x26 + 0x18) << 1);
          func_0x000b83d4(*(undefined8 *)(unaff_x26 + 0x20));
        }
        *(undefined8 *)(unaff_x26 + 0x20) = uVar18;
        *(uint *)(unaff_x26 + 0x1c) = uVar27;
      }
      uVar27 = uStack00000000000000e4;
      *(uint *)(unaff_x26 + 0x18) = uVar36;
      iVar13 = func_0x000b8db0(uVar18,uVar36,in_stack_000000e8,0,unaff_x29 + -0xf8);
      iVar12 = *(int *)(unaff_x29 + -0xf8);
      *(int *)(unaff_x26 + 0xc) = iVar13;
      *(int *)(unaff_x26 + 0x10) = iVar12 - (int)in_stack_000000e8;
      uVar18 = NEON_smin(*(undefined8 *)(unaff_x26 + 0x54),CONCAT44(iVar13,iVar13),4);
      *(undefined8 *)(unaff_x26 + 0x54) = uVar18;
      iVar12 = *(int *)(unaff_x26 + 0x5c);
      if (iVar13 <= *(int *)(unaff_x26 + 0x5c)) {
        iVar12 = iVar13;
      }
      *(int *)(unaff_x26 + 0x5c) = iVar12;
      uStack000000000000004c = 0;
      if ((int)((ulong)uVar18 >> 0x20) != iVar12) {
        uStack000000000000004c = uVar38 & in_stack_000000e0;
      }
      unaff_x24 = in_stack_000000d8;
      unaff_w25 = uStack0000000000000094;
    }
  }
  else {
    bVar7 = false;
    in_stack_000000e0 = 0;
    if (unaff_x26 != (undefined *)0x0) {
      in_stack_000000e0 = uVar36;
      goto code_r0x0011a68c;
    }
code_r0x0011a660:
    uStack00000000000000e4 = uStack00000000000000e4 | unaff_w25;
    uStack000000000000004c = 0;
    uVar27 = uStack00000000000000e4;
  }
  uVar38 = 0;
  if ((((in_stack_000000e0 != 0 || uStack000000000000004c != 0) ||
       (bVar6 = false, *(int *)(unaff_x24 + 0x804) == iVar42)) &&
      (bVar6 = false, unaff_x26 != (undefined *)0x0)) && (bVar6 = false, (uVar27 >> 0xe & 1) == 0))
  {
    bVar6 = unaff_x26[0x48] != '\0';
  }
  piVar32 = (int *)(&UNK_00005d88 + unaff_x21);
  if (in_stack_00000098 == (char *)0x0) {
    bVar9 = false;
    uStack0000000000000024 = (uint)((unaff_w25 & 0x8000) == 0);
  }
  else {
    pcVar29 = in_stack_000000e8;
    if (bVar6) {
      pcVar29 = *(char **)(unaff_x26 + 0x30);
    }
    bVar9 = *pcVar29 == '\0';
    uStack0000000000000024 = (uint)bVar9;
    if ((unaff_w25 & 0x8000) == 0) {
      uStack0000000000000024 = 1;
    }
  }
  if (uStack0000000000000024 == 0) {
    lVar17 = func_0x00105f10(*(undefined8 *)(&UNK_00003d30 + unaff_x21),0x2a);
    lVar33 = *(long *)(&UNK_00003d30 + unaff_x21);
    *(undefined4 *)(&UNK_00005db4 + unaff_x21) = *(undefined4 *)(lVar33 + 0x14);
    *(undefined8 *)(&UNK_00005e04 + unaff_x21) = *(undefined8 *)(lVar33 + 100);
    *(undefined4 *)(&UNK_00005e0c + unaff_x21) = *(undefined4 *)(lVar33 + 0x6c);
    *(undefined8 *)(&UNK_00005de0 + unaff_x21) = *(undefined8 *)(lVar33 + 0x40);
    *(long *)(&UNK_00005dd8 + unaff_x21) = lVar17;
    *(undefined4 *)(&UNK_00005db0 + unaff_x21) = *(undefined4 *)(lVar17 + 4);
    func_0x000d33a0(&UNK_00005da0 + unaff_x21);
  }
  if (*(int *)(unaff_x24 + 0x804) != iVar42) {
    iStack0000000000000010 = 0;
    iVar12 = *(int *)(unaff_x24 + 0x804);
joined_r0x0011a94c:
    if (iVar12 != iVar42) goto code_r0x0011aaf0;
code_r0x0011a950:
    if (unaff_x24[0x810] == '\0') {
      if (bVar7) {
        bVar10 = false;
        pcVar29 = (char *)0x0;
        bVar46 = 0;
        uVar38 = 0;
        bVar7 = true;
        goto code_r0x0011add4;
      }
      uStack0000000000000034 =
           (uint)((in_stack_00000080 - *(float *)(&UNK_00003928 + unaff_x21)) /
                 *(float *)(&UNK_00003d38 + unaff_x21));
      if ((int)uStack0000000000000034 < 2) {
        uStack0000000000000034 = 1;
      }
      *(uint *)(unaff_x26 + 100) = uStack0000000000000034;
      bVar46 = *(byte *)(unaff_x21 + 0xe5d);
      lVar17 = 0xe5c;
      if (!(bool)uVar8) {
        lVar17 = 0xe5e;
      }
      cVar3 = *(char *)(unaff_x21 + lVar17);
      if ((((bool)uVar8) || (*(char *)(unaff_x21 + 0xe5f) == '\0')) ||
         (*(char *)(unaff_x21 + 0xe5c) != '\0')) {
        bVar7 = false;
        uVar19 = func_0x000d78f8(0xa39,unaff_x22,1);
        if ((uVar19 & 1) != 0) goto code_r0x0011ac68;
code_r0x0011b2e8:
        uVar38 = uVar27 & 0x4000;
        uVar16 = func_0x000d78f8(&UNK_0000220a,unaff_x22,1);
        uVar27 = uStack00000000000000e4;
        uVar38 = uVar38 >> 0xe;
        uVar36 = (unaff_w25 & 0x8000) >> 0xf;
        uVar40 = (uVar16 ^ 1 | uVar38 | uVar36) ^ 1;
        if ((((uVar16 ^ 1) & 1) == 0 && uVar38 == 0) && uVar36 == 0) {
joined_r0x0011ac84:
          if (in_stack_000000f0._4_4_ != 0) {
            uVar40 = (uint)(*(int *)(unaff_x26 + 0x58) != *(int *)(unaff_x26 + 0x5c));
          }
          goto code_r0x0011b330;
        }
        uVar19 = func_0x000d78f8(0xa24,unaff_x22,0);
        if ((uVar19 & 1) != 0) goto code_r0x0011b344;
code_r0x0011b374:
        uVar38 = func_0x000d78f8(0x1209,unaff_x22,0);
        uStack0000000000000014 = 0;
        if ((unaff_w25 & 0x8000) == 0) {
          uStack0000000000000014 = uVar38;
        }
        if ((in_stack_000000f0._4_4_ != 0) && ((uStack0000000000000014 & 1) != 0)) {
code_r0x0011b39c:
          uStack0000000000000014 = (uint)(*(int *)(unaff_x26 + 0x58) != *(int *)(unaff_x26 + 0x5c));
        }
      }
      else {
        bVar7 = *(char *)(unaff_x21 + 0xe5e) == '\0';
        uVar19 = func_0x000d78f8(0xa39,unaff_x22,1);
        if ((uVar19 & 1) == 0) goto code_r0x0011b2e8;
code_r0x0011ac68:
        uVar40 = (uint)((uVar27 & 0x4000) == 0 && (unaff_w25 & 0x8000) == 0);
        if ((uVar27 & 0x4000) == 0 && (unaff_w25 & 0x8000) == 0) goto joined_r0x0011ac84;
code_r0x0011b330:
        uVar19 = func_0x000d78f8(0xa24,unaff_x22,0);
        if ((uVar19 & 1) == 0) goto code_r0x0011b374;
code_r0x0011b344:
        if ((unaff_w25 & 0x4008000) == 0x4000000) goto code_r0x0011b39c;
      }
      uVar19 = func_0x000d78f8(0xa37,unaff_x22,1);
      if (((uVar19 & 1) == 0) &&
         (uVar19 = func_0x000d78f8(&UNK_00002209,unaff_x22,1), (uVar19 & 1) == 0)) {
        bVar10 = false;
        bVar5 = (uVar27 & 0x4000) == 0;
      }
      else {
        bVar5 = (uVar27 & 0x4000) == 0;
        bVar10 = bVar5;
      }
      bVar11 = func_0x000d78f8(0xa3b,unaff_x22,1);
      bVar2 = false;
      if ((unaff_w25 & 0x10000) == 0) {
        bVar2 = bVar5;
      }
      uVar19 = func_0x000d78f8(0xa3a,unaff_x22,1);
      bVar5 = bVar2;
      if (((uVar19 & 1) == 0) &&
         (((bool)uVar8 || (iVar12 = func_0x000d78f8(&UNK_00002a3b,unaff_x22,1), iVar12 == 0)))) {
        bVar5 = false;
      }
      iVar12 = func_0x000d78f8(0xa22,unaff_x22,0);
      bVar39 = 0;
      if ((*(byte *)(unaff_x21 + 8) >> 1 & 1) == 0) {
        uVar19 = func_0x000d68ec(0x20d,1);
        if ((uVar19 & 1) != 0) goto code_r0x0011b480;
code_r0x0011b4c0:
        uVar38 = func_0x000d68ec(0x273,1);
        if (bVar39 == 0) goto code_r0x0011b4d4;
code_r0x0011b484:
        uVar19 = func_0x000d68ec(0x27c,0);
        if ((uVar19 & 1) == 0) {
          uStack000000000000000c = func_0x000d68ec(0x27b,0);
        }
        else {
          uStack000000000000000c = 1;
        }
        uVar27 = uStack00000000000000e4;
        iVar13 = 1;
        uVar19 = func_0x000d78f8(0x20e,unaff_x22,1);
        if ((uVar19 & 1) == 0) {
          uVar18 = 0x27a;
          goto code_r0x0011b518;
        }
      }
      else {
        bVar39 = *(byte *)(unaff_x21 + 0xc) & 1;
        uVar19 = func_0x000d68ec(0x20d,1);
        if ((uVar19 & 1) == 0) goto code_r0x0011b4c0;
code_r0x0011b480:
        uVar38 = 1;
        if (bVar39 != 0) goto code_r0x0011b484;
code_r0x0011b4d4:
        uStack000000000000000c = 0;
        uVar18 = 0x20e;
        uVar27 = uStack00000000000000e4;
code_r0x0011b518:
        iVar13 = func_0x000d78f8(uVar18,unaff_x22,1);
      }
      uVar36 = (uint)bVar46 << 0x16;
      iVar14 = func_0x000d68ec(0x201,1);
      if (iVar14 == 0) {
        iVar14 = func_0x000d68ec(0x202,1);
        if (iVar14 != 0) {
          uVar38 = 0x200001;
          if (cVar3 != '\0') {
            uVar38 = 0x20000d;
          }
          uVar40 = 0x200005;
          goto code_r0x0011b590;
        }
        iVar14 = func_0x000d68ec(0x203,1);
        uVar27 = uStack00000000000000e4;
        unaff_w25 = uStack0000000000000094;
        if ((in_stack_000000f0._4_4_ != 0) && (iVar14 != 0)) {
          if (*(char *)(unaff_x21 + 0xe5c) == '\0') {
            iVar12 = -2;
            if (bVar7) {
              iVar12 = 2;
            }
            func_0x0011cfe8(unaff_x26,iVar12 + 0x200004U | uVar36);
          }
          else {
            fVar51 = *(float *)(in_stack_000000c8 + 0x90) - *(float *)(&UNK_00003d38 + unaff_x21);
            if (fVar51 < 0.0) {
              fVar51 = 0.0;
            }
            func_0x000d8cb4(fVar51);
          }
          uVar38 = 0;
          bVar7 = false;
          goto code_r0x0011b5b8;
        }
        iVar14 = func_0x000d68ec(0x204,1);
        unaff_w25 = uStack0000000000000094;
        if ((in_stack_000000f0._4_4_ != 0) && (iVar14 != 0)) {
          if (*(char *)(unaff_x21 + 0xe5c) == '\0') {
            iVar12 = 3;
            if (!bVar7) {
              iVar12 = -1;
            }
            func_0x0011cfe8(unaff_x26,iVar12 + 0x200004U | uVar36);
          }
          else {
            fVar51 = *(float *)(in_stack_000000c8 + 0x90) + *(float *)(&UNK_00003d38 + unaff_x21);
            fVar49 = (float)func_0x000d8c90();
            if (fVar49 <= fVar51) {
              fVar51 = fVar49;
            }
            func_0x000d8cb4(fVar51,in_stack_000000c8);
          }
          uVar38 = 0;
          bVar7 = false;
code_r0x0011c41c:
          uVar27 = uStack00000000000000e4;
          goto code_r0x0011b5b8;
        }
        iVar14 = func_0x000d68ec(0x205,1);
        if ((in_stack_000000f0._4_4_ != 0) && (iVar14 != 0)) {
          func_0x0011cfe8(unaff_x26,uVar36 | 0x20000e);
          uVar38 = 0;
          bVar7 = false;
          fVar67 = fVar67 - *(float *)(&UNK_00003d38 + unaff_x21) *
                            (float)(int)uStack0000000000000034;
          goto code_r0x0011c364;
        }
        iVar14 = func_0x000d68ec(0x206,1);
        uVar27 = uStack00000000000000e4;
        if ((in_stack_000000f0._4_4_ != 0) && (iVar14 != 0)) {
          func_0x0011cfe8(unaff_x26,uVar36 | 0x20000f);
          fVar67 = fVar67 + *(float *)(&UNK_00003d38 + unaff_x21) *
                            (float)(int)uStack0000000000000034;
          goto code_r0x0011b5b0;
        }
        iVar14 = func_0x000d68ec(0x207,1);
        if (iVar14 != 0) {
          uVar40 = 0x200004;
          if (*(char *)(unaff_x21 + 0xe5c) != '\0') {
            uVar40 = 0x200006;
          }
          goto code_r0x0011b59c;
        }
        iVar14 = func_0x000d68ec(0x208,1);
        if (iVar14 != 0) {
          uVar40 = 0x200005;
          if (*(char *)(unaff_x21 + 0xe5c) != '\0') {
            uVar40 = 0x200007;
          }
          goto code_r0x0011b59c;
        }
        uVar16 = func_0x000d68ec(0x20a,1);
        if (((uVar16 ^ 1 | (uVar27 & 0x4000) >> 0xe | uVar40) & 1) == 0) {
          if ((cVar3 != '\0') && (*(int *)(unaff_x26 + 0x58) == *(int *)(unaff_x26 + 0x5c))) {
            func_0x0011cfe8(unaff_x26,&UNK_0060000d);
          }
          uVar27 = 0x200008;
code_r0x0011c644:
          uVar36 = uVar36 | uVar27;
code_r0x0011c648:
          func_0x0011cfe8(unaff_x26,uVar36);
code_r0x0011c654:
          uVar38 = 0;
          bVar7 = false;
code_r0x0011c364:
          unaff_w25 = uStack0000000000000094;
          goto code_r0x0011c41c;
        }
        iVar14 = func_0x000d68ec(0x20b,1);
        if ((iVar14 != 0) && ((uVar27 & 0x4000) == 0)) {
          if (*(int *)(unaff_x26 + 0x58) == *(int *)(unaff_x26 + 0x5c)) {
            uVar15 = 0x600004;
            if (cVar3 == '\0') {
              if (((((bool)uVar8) || (*(char *)(unaff_x21 + 0xe5f) == '\0')) ||
                  (*(char *)(unaff_x21 + 0xe5e) != '\0')) || (*(char *)(unaff_x21 + 0xe5c) != '\0'))
              goto code_r0x0011c638;
            }
            else {
              uVar15 = 0x60000c;
            }
            func_0x0011cfe8(unaff_x26,uVar15);
          }
code_r0x0011c638:
          uVar27 = 0x200009;
          goto code_r0x0011c644;
        }
        if ((uVar38 | uStack000000000000000c) == 1) {
          if (in_stack_000000f0._4_4_ == 0 || (uStack000000000000000c & 1) != 0) {
            if ((in_stack_000000f0._4_4_ == 0) && (*(char *)(unaff_x21 + 0x5c) != '\0')) {
              *(undefined4 *)(unaff_x26 + 0x58) = 0;
              *(undefined4 *)(unaff_x26 + 0x5c) = *(undefined4 *)(unaff_x26 + 0xc);
              *(undefined4 *)(unaff_x26 + 0x54) = *(undefined4 *)(unaff_x26 + 0xc);
              unaff_x26[0x6a] = 0;
              uVar38 = 1;
              bVar7 = false;
            }
            else {
              uVar38 = 1;
              bVar7 = true;
            }
            goto code_r0x0011c364;
          }
          if ((uStack0000000000000094 >> 0xb & 1) == 0) {
            if (*(char *)(unaff_x21 + 0xe5c) != '\0') goto code_r0x0011c5c4;
          }
          else if (*(char *)(unaff_x21 + 0xe5c) == '\0') {
code_r0x0011c5c4:
            uVar38 = 1;
            bVar7 = true;
            goto code_r0x0011c364;
          }
          if ((uStack00000000000000e4 >> 0xe & 1) == 0) {
            *(undefined4 *)(unaff_x29 + -0xf8) = 10;
            iVar12 = func_0x0011ebdc(unaff_x21,unaff_x29 + -0xf8,uStack00000000000000e4,
                                     in_stack_00000068,in_stack_000000d0,2);
            if (iVar12 == 0) goto code_r0x0011c654;
            uVar36 = *(uint *)(unaff_x29 + -0xf8);
            goto code_r0x0011c648;
          }
          goto code_r0x0011c654;
        }
        if (iVar13 == 0) {
          if ((byte)(bVar11 & bVar2 | bVar5) == 1) {
            iVar12 = 6;
            if ((bVar11 & bVar2) == 0) {
              iVar12 = 7;
            }
            func_0x0011cfe8(unaff_x26,iVar12 + 0x200004);
            uVar38 = 0;
            bVar7 = false;
            *(undefined4 *)(unaff_x26 + 0x58) = *(undefined4 *)(unaff_x26 + 0x54);
            *(undefined4 *)(unaff_x26 + 0x5c) = *(undefined4 *)(unaff_x26 + 0x54);
          }
          else {
            if (iVar12 == 0) {
              if ((uVar40 | uStack0000000000000014) == 1) {
                if (*(long *)(unaff_x21 + 0xb0) != 0) {
                  uVar27 = *(uint *)(unaff_x26 + 0x58);
                  uVar38 = *(uint *)(unaff_x26 + 0x5c);
                  if (uVar27 == uVar38) {
                    uVar19 = 0;
                    uVar27 = *(uint *)(unaff_x26 + 0xc);
                  }
                  else {
                    uVar36 = uVar27;
                    if ((int)uVar38 <= (int)uVar27) {
                      uVar36 = uVar38;
                    }
                    uVar19 = (ulong)uVar36;
                    if ((int)uVar27 <= (int)uVar38) {
                      uVar27 = uVar38;
                    }
                  }
                  uVar19 = -(uVar19 >> 0x1f) & 0xfffffffe00000000 | uVar19 << 1;
                  uVar30 = -(ulong)(uVar27 >> 0x1f) & 0xfffffffe00000000 | (ulong)uVar27 << 1;
                  iVar12 = func_0x000b91c4(*(long *)(unaff_x26 + 0x20) + uVar19,
                                           *(long *)(unaff_x26 + 0x20) + uVar30);
                  uVar18 = func_0x000b810c((long)(iVar12 + 1));
                  func_0x000b9034(uVar18,iVar12 + 1,*(long *)(unaff_x26 + 0x20) + uVar19,
                                  *(long *)(unaff_x26 + 0x20) + uVar30);
                  func_0x000c2d8c(uVar18);
                  func_0x000b83d4(uVar18);
                }
                if (uVar40 != 0) {
                  iVar12 = *(int *)(unaff_x26 + 0x58);
                  iVar13 = *(int *)(unaff_x26 + 0x5c);
                  if (iVar12 == iVar13) {
                    iVar12 = 0;
                    iVar13 = *(int *)(unaff_x26 + 0xc);
                    *(undefined4 *)(unaff_x26 + 0x58) = 0;
                    *(int *)(unaff_x26 + 0x5c) = iVar13;
                    *(int *)(unaff_x26 + 0x54) = iVar13;
                    unaff_x26[0x6a] = 0;
                  }
                  unaff_x26[0xe84] = 1;
                  if (iVar12 != iVar13) {
                    func_0x001294b4(unaff_x26,unaff_x26 + 0x54);
                    uVar38 = 0;
                    bVar7 = false;
                    unaff_x26[0x6a] = 0;
                    goto code_r0x0011c364;
                  }
                }
              }
              else if ((bVar10) && (pcVar29 = (char *)func_0x000c2d68(), pcVar29 != (char *)0x0)) {
                lVar17 = _strlen();
                puVar24 = (undefined2 *)func_0x000b810c((lVar17 << 0x20) + 0x100000000 >> 0x1f);
                if (*pcVar29 == '\0') {
                  *puVar24 = 0;
                }
                else {
                  iVar12 = 0;
                  do {
                    iVar13 = func_0x000b6c50(unaff_x29 + -0xf8,pcVar29,0);
                    iVar14 = func_0x0011ebdc(unaff_x21,unaff_x29 + -0xf8,uStack00000000000000e4,
                                             in_stack_00000068,in_stack_000000d0,4);
                    if (iVar14 != 0) {
                      puVar24[iVar12] = (short)*(undefined4 *)(unaff_x29 + -0xf8);
                      iVar12 = iVar12 + 1;
                    }
                    pcVar29 = pcVar29 + iVar13;
                  } while (*pcVar29 != '\0');
                  puVar24[iVar12] = 0;
                  if (0 < iVar12) {
                    func_0x0011eddc(unaff_x26,unaff_x26 + 0x54,puVar24,iVar12);
                    unaff_x26[0xe84] = 1;
                  }
                }
                func_0x000b83d4(puVar24);
              }
              goto code_r0x0011c654;
            }
            uVar38 = 0;
            bVar7 = false;
            *(undefined4 *)(unaff_x26 + 0x58) = 0;
            *(undefined4 *)(unaff_x26 + 0x5c) = *(undefined4 *)(unaff_x26 + 0xc);
            *(undefined4 *)(unaff_x26 + 0x54) = *(undefined4 *)(unaff_x26 + 0xc);
            unaff_x26[0x6a] = 0;
            unaff_x26[0xe84] = 1;
          }
          goto code_r0x0011c364;
        }
        if ((uStack0000000000000094 >> 0x14 & 1) == 0) {
          in_stack_000000e0 = 0;
          bVar10 = true;
          bVar7 = true;
          uStack000000000000004c = 0;
        }
        else {
          bVar7 = *in_stack_000000e8 == '\0';
          uVar27 = 0;
          if (!bVar7) {
            uVar27 = uStack000000000000004c;
          }
          bVar10 = !bVar7;
          uVar38 = 0;
          if (!bVar7) {
            uVar38 = in_stack_000000e0;
          }
          uStack000000000000004c = uVar27;
          in_stack_000000e0 = uVar38;
        }
        uVar38 = 0;
        unaff_w25 = uStack0000000000000094;
        uVar27 = uStack00000000000000e4;
      }
      else {
        uVar40 = 0x200004;
        uVar38 = 0x200000;
        if (cVar3 != '\0') {
          uVar38 = 0x20000c;
        }
code_r0x0011b590:
        if (!bVar7) {
          uVar40 = uVar38;
        }
code_r0x0011b59c:
        func_0x0011cfe8(unaff_x26,uVar40 | uVar36);
code_r0x0011b5b0:
        uVar38 = 0;
        bVar7 = false;
        unaff_w25 = uStack0000000000000094;
code_r0x0011b5b8:
        bVar10 = false;
      }
      uVar36 = 0;
      if (*(int *)(unaff_x26 + 0x58) != *(int *)(unaff_x26 + 0x5c)) {
        uVar36 = in_stack_000000e0;
      }
      uStack000000000000004c = uStack000000000000004c | uVar36;
      iVar12 = *(int *)(in_stack_000000d8 + 0x804);
      unaff_x24 = in_stack_000000d8;
      goto joined_r0x0011b5dc;
    }
    bVar10 = false;
    pcVar29 = (char *)0x0;
    bVar46 = 0;
    goto code_r0x0011add4;
  }
  iStack0000000000000010 = *(int *)(unaff_x26 + 0x10);
  unaff_x26[0xe86] = 0;
  *(int *)(unaff_x26 + 0x4c) = in_stack_000000a8._4_4_;
  *(uint *)(unaff_x26 + 0xe88) = uVar27;
  bVar46 = *(byte *)(unaff_x21 + 0xe48);
  unaff_x24[0x811] = bVar46 ^ 1;
  if (unaff_w27 == 0) {
    fVar51 = *(float *)(&UNK_00003d38 + unaff_x21) * 0.5;
    if (uStack0000000000000034 != 0) goto code_r0x0011a998;
code_r0x0011a8b4:
    fVar49 = ((*(float *)(unaff_x21 + 0xe40) - *(float *)(unaff_x29 + -0xa8)) -
             *(float *)(&UNK_00003924 + unaff_x21)) + *(float *)(unaff_x26 + 0x50);
    if (((param_1 == 0) || (uVar4 = *(ushort *)(unaff_x24 + 10), uVar4 < 2)) ||
       (*(char *)(unaff_x21 + 0xe5d) != '\0')) {
      uVar27 = uStack00000000000000e4;
      if ((*unaff_x24 == '\0') || (unaff_x26[0xe85] != '\0')) {
        if (((bVar46 != 0) && (unaff_x26[0xe85] == '\0')) &&
           ((*(float *)(unaff_x21 + 0xe8) != 0.0 || (*(float *)(unaff_x21 + 0xec) != 0.0)))) {
          func_0x0011eb90(unaff_x26,unaff_x26 + 0x54);
          *(undefined4 *)(unaff_x26 + 0xe80) = 0xbe99999a;
          unaff_x26[0xe84] = 1;
        }
      }
      else if (param_1 != 0) {
        if (*(char *)(unaff_x21 + 0xe5d) == '\0') {
          if (unaff_x26[0x6b] != '\0') {
            fVar51 = 0.0;
          }
          uVar15 = func_0x00129e5c(fVar49,fVar51,unaff_x26);
          *(undefined4 *)(unaff_x26 + 0x54) = uVar15;
          *(undefined4 *)(unaff_x26 + 0x58) = uVar15;
          *(undefined4 *)(unaff_x26 + 0x5c) = uVar15;
          unaff_x26[0x6a] = 0;
        }
        else {
          func_0x0011eb90(unaff_x26,unaff_x26 + 0x54);
        }
        goto code_r0x0011c308;
      }
    }
    else {
      if (unaff_x26[0x6b] != '\0') {
        fVar51 = 0.0;
      }
      iVar12 = func_0x00129e5c(fVar49,fVar51,unaff_x26);
      piVar43 = (int *)(unaff_x26 + 0x54);
      *piVar43 = iVar12;
      *(int *)(unaff_x26 + 0x58) = iVar12;
      *(int *)(unaff_x26 + 0x5c) = iVar12;
      unaff_x26[0x6a] = 0;
      if ((uVar4 & 1) == 0) {
        if (((iVar12 == 0) ||
            (*(short *)(*(long *)(unaff_x26 + 0x20) + (long)iVar12 * 2 + -2) == 10)) ||
           (func_0x0011cfe8(unaff_x26,&UNK_0020000c),
           *(int *)(unaff_x26 + 0x58) == *(int *)(unaff_x26 + 0x5c))) {
          iVar12 = *(int *)(unaff_x26 + 0x54);
          *(int *)(unaff_x26 + 0x58) = iVar12;
          *(int *)(unaff_x26 + 0x5c) = iVar12;
        }
        else {
          iVar12 = *piVar43;
        }
        uVar27 = uStack00000000000000e4;
        uVar15 = func_0x0011ea4c(unaff_x26,iVar12);
        *(undefined4 *)(unaff_x26 + 0x54) = uVar15;
        *(undefined4 *)(unaff_x26 + 0x5c) = uVar15;
        func_0x0011eb30(*(undefined4 *)(unaff_x26 + 0xc),piVar43);
        unaff_x24 = in_stack_000000d8;
      }
      else {
        sVar26 = *(short *)(*(long *)(unaff_x26 + 0x20) + (long)iVar12 * 2);
        func_0x0011cfe8(unaff_x26,&UNK_00200004);
        func_0x0011cfe8(unaff_x26,&UNK_00600005);
        func_0x0011cfe8(unaff_x26,&UNK_00600001);
        if ((unaff_w27 != 0) && (sVar26 != 10)) {
          *(int *)(unaff_x26 + 0x5c) = (int)*(undefined8 *)(unaff_x26 + 0x58);
          *(undefined8 *)(unaff_x26 + 0x54) = *(undefined8 *)(unaff_x26 + 0x58);
        }
        unaff_x26[0xe84] = 0;
        unaff_x24 = in_stack_000000d8;
        uVar27 = uStack00000000000000e4;
      }
code_r0x0011c308:
      *(undefined4 *)(unaff_x26 + 0xe80) = 0xbe99999a;
    }
  }
  else {
    fVar51 = *(float *)(unaff_x21 + 0xe44) - *(float *)(in_stack_000000c8 + 0x114);
    if (uStack0000000000000034 == 0) goto code_r0x0011a8b4;
code_r0x0011a998:
    *(undefined4 *)(unaff_x26 + 0x58) = 0;
    *(undefined4 *)(unaff_x26 + 0x5c) = *(undefined4 *)(unaff_x26 + 0xc);
    *(undefined4 *)(unaff_x26 + 0x54) = *(undefined4 *)(unaff_x26 + 0xc);
    unaff_x26[0x6a] = 0;
    unaff_x26[0xe85] = 1;
  }
  if ((unaff_x26[0xe85] != '\0') && (*(char *)(unaff_x21 + 0xe48) == '\0')) {
    unaff_x26[0xe85] = 0;
  }
  if ((((unaff_w25 >> 10 & 1) != 0) && ((uVar27 >> 0xe & 1) == 0)) &&
     (iVar12 = func_0x000d78f8(0x200,unaff_x22,1), iVar12 != 0)) {
    *(undefined4 *)(unaff_x29 + -0xf8) = 9;
    iVar12 = func_0x0011ebdc(unaff_x21,unaff_x29 + -0xf8,uVar27,in_stack_00000068,in_stack_000000d0,
                             2);
    if (iVar12 != 0) {
      func_0x0011cfe8(unaff_x26,*(undefined4 *)(unaff_x29 + -0xf8));
    }
  }
  if (*(char *)(unaff_x21 + 0xe5c) == '\0') {
    if (!(bool)uVar8) goto code_r0x0011aa70;
    bVar10 = false;
  }
  else {
    bVar10 = *(char *)(unaff_x21 + 0xe5e) == '\0';
    bVar5 = (bool)uVar8;
    if (bVar10) {
      bVar5 = true;
    }
    if (!bVar5) {
code_r0x0011aa70:
      bVar10 = *(char *)(unaff_x21 + 0xe5f) != '\0';
    }
  }
  if (0 < *(int *)(&UNK_000038d8 + unaff_x21)) {
    if ((!bVar10 && (uVar27 & 0x4000) == 0) && (in_ZR & 1) == 0) {
      lVar17 = 0;
      do {
        uVar27 = (uint)*(ushort *)(*(long *)(&UNK_000038e0 + unaff_x21) + lVar17 * 2);
        *(uint *)(unaff_x29 + -0xf8) = uVar27;
        if ((uVar27 != 9) &&
           (iVar12 = func_0x0011ebdc(unaff_x21,unaff_x29 + -0xf8,uStack00000000000000e4,
                                     in_stack_00000068,in_stack_000000d0,2), iVar12 != 0)) {
          func_0x0011cfe8(unaff_x26,*(undefined4 *)(unaff_x29 + -0xf8));
        }
        lVar17 = lVar17 + 1;
      } while (lVar17 < *(int *)(&UNK_000038d8 + unaff_x21));
    }
    if (*(int *)(&UNK_000038dc + unaff_x21) < 0) {
      uVar18 = func_0x000b810c(0);
      if (*(long *)(&UNK_000038e0 + unaff_x21) != 0) {
        _memcpy(uVar18,*(long *)(&UNK_000038e0 + unaff_x21),
                (long)*(int *)(&UNK_000038d8 + unaff_x21) << 1);
        func_0x000b83d4(*(undefined8 *)(&UNK_000038e0 + unaff_x21));
      }
      *(undefined8 *)(&UNK_000038e0 + unaff_x21) = uVar18;
      *(undefined4 *)(&UNK_000038dc + unaff_x21) = 0;
    }
    *(undefined4 *)(&UNK_000038d8 + unaff_x21) = 0;
    iVar12 = *(int *)(unaff_x24 + 0x804);
    uVar27 = uStack00000000000000e4;
    goto joined_r0x0011a94c;
  }
  iVar12 = *(int *)(unaff_x24 + 0x804);
  if (iVar12 == iVar42) goto code_r0x0011a950;
code_r0x0011aaf0:
  bVar10 = false;
joined_r0x0011b5dc:
  if (iVar12 == iVar42) {
    bVar46 = 0;
    pcVar29 = (char *)0x0;
    if (bVar10) {
      if ((uVar27 >> 0xe & 1) != 0) goto code_r0x0011add4;
      if ((unaff_w25 >> 0x14 & 1) != 0) {
        uVar27 = *(uint *)(unaff_x26 + 0xc);
        uVar19 = (ulong)uVar27;
        lVar17 = func_0x00129c14(unaff_x26 + 0x74,0,uVar19,0);
        if (((int)uVar27 < 1) || (lVar17 == 0)) {
          psVar47 = *(short **)(unaff_x26 + 0x20);
        }
        else {
          uVar30 = 0;
          psVar47 = *(short **)(unaff_x26 + 0x20);
          if ((0x1f < uVar27) && (0x3f < (ulong)(lVar17 - (long)psVar47))) {
            lVar33 = 0;
            uVar30 = uVar19 & 0xffffffe0;
            do {
              puVar41 = (undefined8 *)((long)psVar47 + lVar33);
              uVar18 = *puVar41;
              uVar25 = puVar41[3];
              uVar23 = puVar41[2];
              uVar57 = puVar41[5];
              uVar56 = puVar41[4];
              uVar60 = puVar41[7];
              uVar59 = puVar41[6];
              puVar1 = (undefined8 *)(lVar17 + lVar33);
              puVar1[1] = puVar41[1];
              *puVar1 = uVar18;
              puVar1[3] = uVar25;
              puVar1[2] = uVar23;
              puVar1[5] = uVar57;
              puVar1[4] = uVar56;
              puVar1[7] = uVar60;
              puVar1[6] = uVar59;
              lVar33 = lVar33 + 0x40;
            } while ((uVar19 & 0xffffffe0) * 2 != lVar33);
            if (uVar30 == uVar19) goto code_r0x0011ad4c;
          }
          do {
            *(short *)(lVar17 + uVar30 * 2) = psVar47[uVar30];
            uVar30 = uVar30 + 1;
          } while (uVar19 != uVar30);
        }
code_r0x0011ad4c:
        iVar12 = *(int *)(unaff_x26 + 0xc);
        lVar17 = (long)iVar12;
        unaff_x26[0xe86] = 1;
        iVar13 = func_0x000b91c4(psVar47,psVar47 + lVar17);
        *(int *)(unaff_x26 + 0xc) = *(int *)(unaff_x26 + 0xc) - iVar12;
        *(int *)(unaff_x26 + 0x10) = *(int *)(unaff_x26 + 0x10) - iVar13;
        sVar26 = *(short *)(*(long *)(unaff_x26 + 0x20) + lVar17 * 2);
        if (sVar26 != 0) {
          psVar34 = (short *)(*(long *)(unaff_x26 + 0x20) + lVar17 * 2);
          psVar48 = psVar47;
          do {
            psVar34 = psVar34 + 1;
            psVar47 = psVar48 + 1;
            *psVar48 = sVar26;
            sVar26 = *psVar34;
            psVar48 = psVar47;
          } while (sVar26 != 0);
        }
        *psVar47 = 0;
        *(undefined8 *)(unaff_x26 + 0x58) = 0;
        bVar46 = 1;
        pcVar29 = "";
        *(undefined4 *)(unaff_x26 + 0x54) = 0;
        unaff_x24 = in_stack_000000d8;
        uVar27 = uStack00000000000000e4;
        goto code_r0x0011add4;
      }
      pcVar29 = *(char **)(unaff_x26 + 0x40);
      iVar12 = _strcmp(in_stack_000000e8,pcVar29);
      if (iVar12 == 0) {
        bVar46 = 0;
        pcVar29 = (char *)0x0;
        goto code_r0x0011ade8;
      }
      iVar12 = *(int *)(unaff_x26 + 0x38);
      uVar36 = iVar12 - 1;
      *(undefined8 *)(unaff_x29 + -0xf8) = 0;
      *(undefined8 *)(unaff_x29 + -0xf0) = 0;
      if (iVar12 < 2) {
        iVar13 = 0;
        uVar18 = 0;
      }
      else {
        iVar13 = func_0x000b8e80(pcVar29,pcVar29 + uVar36);
        func_0x0011e9c0(unaff_x29 + -0xf8,iVar13 + 1);
        func_0x000b8db0(*(undefined8 *)(unaff_x29 + -0xf0),*(undefined4 *)(unaff_x29 + -0xf8),
                        pcVar29,pcVar29 + uVar36,0);
        uVar18 = *(undefined8 *)(unaff_x29 + -0xf0);
        iVar13 = *(int *)(unaff_x29 + -0xf8);
      }
      iVar13 = iVar13 + -1;
      if (iVar12 < 2) {
        iVar13 = 0;
      }
      func_0x0011eeb4(unaff_x26,unaff_x26 + 0x54,uVar18,iVar13);
      func_0x0011f010(unaff_x29 + -0xf8);
      bVar46 = 1;
      uVar27 = uStack00000000000000e4;
code_r0x0011adec:
      unaff_x26[0x48] = 1;
      uVar40 = *(int *)(unaff_x26 + 0x18) << 2 | 1;
      iVar12 = *(int *)(unaff_x26 + 0x2c);
      if (iVar12 < (int)uVar40) {
        iVar13 = iVar12;
        if (iVar12 < 0) {
          iVar13 = iVar12 + 1;
        }
        uVar27 = 8;
        if (iVar12 != 0) {
          uVar27 = iVar12 + (iVar13 >> 1);
        }
        if ((int)uVar27 <= (int)uVar40) {
          uVar27 = uVar40;
        }
        uVar18 = func_0x000b810c((long)(int)uVar27);
        if (*(long *)(unaff_x26 + 0x30) != 0) {
          _memcpy(uVar18,*(long *)(unaff_x26 + 0x30),(long)*(int *)(unaff_x26 + 0x28));
          func_0x000b83d4(*(undefined8 *)(unaff_x26 + 0x30));
        }
        *(undefined8 *)(unaff_x26 + 0x30) = uVar18;
        *(uint *)(unaff_x26 + 0x2c) = uVar27;
        uVar27 = uStack00000000000000e4;
      }
      else {
        uVar18 = *(undefined8 *)(unaff_x26 + 0x30);
      }
      *(uint *)(unaff_x26 + 0x28) = uVar40;
      func_0x000b9034(uVar18,uVar40,*(undefined8 *)(unaff_x26 + 0x20),0);
      unaff_x24 = in_stack_000000d8;
      unaff_w25 = uStack0000000000000094;
      if (!bVar10) goto code_r0x0011ae94;
code_r0x0011ae88:
      if (((unaff_w25 >> 5 & 1) != 0) && (uVar38 != 0)) goto code_r0x0011ae94;
    }
    else {
code_r0x0011add4:
      if ((uVar27 >> 0xe & 1) == 0) {
code_r0x0011ade8:
        uVar36 = 0;
        goto code_r0x0011adec;
      }
      uVar36 = 0;
      if (bVar10) goto code_r0x0011ae88;
code_r0x0011ae94:
      if ((unaff_w25 & 0x801c0) != 0) {
        if ((unaff_w25 >> 6 & 1) == 0) {
code_r0x0011aec8:
          if ((unaff_w25 >> 7 & 1) == 0) {
code_r0x0011aefc:
            if (((unaff_w25 >> 0x13 & 1) == 0) || (unaff_x26[0xe86] == '\0')) {
              uVar27 = uStack00000000000000e4;
              if ((unaff_w25 >> 8 & 1) == 0) goto code_r0x0011b0d0;
              uVar15 = 0;
              uVar63 = 0x100;
            }
            else {
              uVar15 = 0;
              uVar63 = 0x80000;
            }
          }
          else {
            uVar15 = 0x203;
            uVar19 = func_0x000d68ec(0x203,1);
            if ((uVar19 & 1) == 0) {
              uVar15 = 0x204;
              uVar19 = func_0x000d68ec(0x204,1);
              if ((uVar19 & 1) == 0) goto code_r0x0011aefc;
            }
            uVar63 = 0x80;
          }
        }
        else {
          uVar15 = 0x200;
          uVar19 = func_0x000d78f8(0x200,unaff_x22,0);
          if ((uVar19 & 1) == 0) goto code_r0x0011aec8;
          uVar63 = 0x40;
        }
        *(undefined8 *)(unaff_x29 + -0xc0) = 0;
        *(undefined8 *)(unaff_x29 + -0xd8) = 0;
        *(undefined8 *)(unaff_x29 + -0xe0) = 0;
        *(undefined8 *)(unaff_x29 + -200) = 0;
        *(undefined8 *)(unaff_x29 + -0xd0) = 0;
        *(long *)(unaff_x29 + -0xf8) = unaff_x21;
        *(undefined4 *)(unaff_x29 + -0xf0) = uVar63;
        *(uint *)(unaff_x29 + -0xec) = uStack00000000000000e4;
        *(char **)(unaff_x29 + -0xe8) = in_stack_000000d0;
        pcVar31 = in_stack_000000e8;
        if ((uStack00000000000000e4 >> 0xe & 1) == 0) {
          pcVar31 = *(char **)(unaff_x26 + 0x30);
        }
        *(undefined4 *)(unaff_x29 + -0xdc) = uVar15;
        *(char **)(unaff_x29 + -0xd8) = pcVar31;
        uVar15 = *(undefined4 *)(unaff_x26 + 0x4c);
        *(undefined4 *)(unaff_x29 + -0xd0) = *(undefined4 *)(unaff_x26 + 0x10);
        *(undefined4 *)(unaff_x29 + -0xcc) = uVar15;
        lVar17 = *(long *)(unaff_x26 + 0x20);
        iVar12 = func_0x000b91c4(lVar17,lVar17 + (long)*(int *)(unaff_x26 + 0x54) * 2);
        *(int *)(unaff_x29 + -0xc4) = iVar12;
        iVar13 = func_0x000b91c4(lVar17,lVar17 + (long)*(int *)(unaff_x26 + 0x58) * 2);
        *(int *)(unaff_x29 + -0xc0) = iVar13;
        iVar14 = func_0x000b91c4(lVar17,lVar17 + (long)*(int *)(unaff_x26 + 0x5c) * 2);
        *(int *)(unaff_x29 + -0xbc) = iVar14;
        (*in_stack_00000068)(unaff_x29 + -0xf8);
        cVar3 = *(char *)(unaff_x29 + -200);
        if ((cVar3 != '\0') || (*(int *)(unaff_x29 + -0xc4) != iVar12)) {
          uVar15 = func_0x000b8e80(*(long *)(unaff_x29 + -0xd8),
                                   *(long *)(unaff_x29 + -0xd8) + (long)*(int *)(unaff_x29 + -0xc4))
          ;
          *(undefined4 *)(unaff_x26 + 0x54) = uVar15;
          unaff_x26[0xe84] = 1;
        }
        iVar12 = *(int *)(unaff_x29 + -0xc0);
        if ((cVar3 != '\0') || (iVar12 != iVar13)) {
          if (iVar12 == *(int *)(unaff_x29 + -0xc4)) {
            uVar15 = *(undefined4 *)(unaff_x26 + 0x54);
          }
          else {
            uVar15 = func_0x000b8e80(*(long *)(unaff_x29 + -0xd8),
                                     *(long *)(unaff_x29 + -0xd8) + (long)iVar12);
          }
          *(undefined4 *)(unaff_x26 + 0x58) = uVar15;
        }
        unaff_w25 = uStack0000000000000094;
        iVar12 = *(int *)(unaff_x29 + -0xbc);
        if ((cVar3 != '\0') || (iVar12 != iVar14)) {
          if (iVar12 == *(int *)(unaff_x29 + -0xc0)) {
            uVar15 = *(undefined4 *)(unaff_x26 + 0x58);
          }
          else {
            uVar15 = func_0x000b8e80(*(long *)(unaff_x29 + -0xd8),
                                     *(long *)(unaff_x29 + -0xd8) + (long)iVar12);
          }
          *(undefined4 *)(unaff_x26 + 0x5c) = uVar15;
          if (cVar3 != '\0') {
            func_0x0011f040(unaff_x26,*(undefined8 *)(unaff_x29 + -0xd8),
                            *(undefined4 *)(unaff_x29 + -0xd0));
            if (((unaff_w25 >> 0x12 & 1) != 0) &&
               (iVar12 = *(int *)(unaff_x29 + -0xd0) - iStack0000000000000010,
               iVar12 != 0 && iStack0000000000000010 <= *(int *)(unaff_x29 + -0xd0))) {
              func_0x0011e9c0(unaff_x26 + 0x18,iVar12 + *(int *)(unaff_x26 + 0x18));
            }
            uVar15 = func_0x000b8db0(*(undefined8 *)(unaff_x26 + 0x20),
                                     *(undefined4 *)(unaff_x26 + 0x18),
                                     *(undefined8 *)(unaff_x29 + -0xd8),0,0);
            *(undefined4 *)(unaff_x26 + 0xc) = uVar15;
            *(undefined4 *)(unaff_x26 + 0x10) = *(undefined4 *)(unaff_x29 + -0xd0);
            *(undefined4 *)(unaff_x26 + 0xe80) = 0xbe99999a;
          }
        }
        unaff_x24 = in_stack_000000d8;
        uVar27 = uStack00000000000000e4;
      }
code_r0x0011b0d0:
      if ((uVar27 >> 0xe & 1) == 0) {
        pcVar31 = *(char **)(unaff_x26 + 0x30);
        iVar12 = _strcmp(pcVar31,in_stack_000000e8);
        if (iVar12 != 0) {
          uVar36 = *(uint *)(unaff_x26 + 0x10);
          bVar46 = 1;
          pcVar29 = pcVar31;
        }
      }
    }
    uStack0000000000000034 = (uint)bVar46;
    if (*piVar32 == iVar42) goto code_r0x0011b120;
code_r0x0011b608:
    if (pcVar29 != (char *)0x0) {
code_r0x0011b614:
      if ((unaff_w25 >> 0x12 & 1) != 0) {
        *(undefined8 *)(unaff_x29 + -0xd8) = 0;
        *(undefined8 *)(unaff_x29 + -0xe0) = 0;
        *(undefined8 *)(unaff_x29 + -200) = 0;
        *(undefined8 *)(unaff_x29 + -0xd0) = 0;
        *(undefined8 *)(unaff_x29 + -0xc0) = 0;
        *(long *)(unaff_x29 + -0xf8) = unaff_x21;
        *(undefined4 *)(unaff_x29 + -0xf0) = 0x40000;
        *(uint *)(unaff_x29 + -0xec) = uStack00000000000000e4;
        *(char **)(unaff_x29 + -0xd8) = in_stack_000000e8;
        if (in_stack_000000a8._4_4_ <= (int)(uVar36 + 1)) {
          in_stack_000000a8._4_4_ = uVar36 + 1;
        }
        *(uint *)(unaff_x29 + -0xd0) = uVar36;
        *(int *)(unaff_x29 + -0xcc) = in_stack_000000a8._4_4_;
        *(char **)(unaff_x29 + -0xe8) = in_stack_000000d0;
        (*in_stack_00000068)(unaff_x29 + -0xf8);
        in_stack_000000e8 = *(char **)(unaff_x29 + -0xd8);
        in_stack_000000a8._4_4_ = *(int *)(unaff_x29 + -0xcc);
        uVar36 = *(uint *)(unaff_x29 + -0xd0);
        if ((int)(in_stack_000000a8._4_4_ - 1U) <= (int)*(uint *)(unaff_x29 + -0xd0)) {
          uVar36 = in_stack_000000a8._4_4_ - 1U;
        }
      }
      if ((int)(uVar36 + 1) < in_stack_000000a8._4_4_) {
        in_stack_000000a8._4_4_ = uVar36 + 1;
      }
      func_0x000b7ff8(in_stack_000000e8,pcVar29,(long)in_stack_000000a8._4_4_);
    }
  }
  else {
    uVar36 = 0;
    pcVar29 = (char *)0x0;
    uStack0000000000000034 = 0;
    if (*piVar32 != iVar42) goto code_r0x0011b608;
code_r0x0011b120:
    if (*(int *)(unaff_x24 + 0x804) != iVar42) {
      iVar12 = func_0x000cfb2c();
      if ((iVar12 != 0) && ((uStack00000000000000e4 >> 0xe & 1) == 0)) {
        pcVar31 = *(char **)(&UNK_00005d98 + unaff_x21);
        iVar12 = _strcmp(pcVar31,in_stack_000000e8);
        if (iVar12 != 0) {
          uVar36 = *(int *)(&UNK_00005d90 + unaff_x21) - 1;
          uStack0000000000000034 = 1;
          pcVar29 = pcVar31;
        }
      }
    }
    *piVar32 = 0;
    if (pcVar29 != (char *)0x0) goto code_r0x0011b614;
  }
  pfStack0000000000000040 = (float *)(&UNK_00005f3c + unaff_x21);
  bVar10 = false;
  if (*(int *)(unaff_x24 + 0x804) == iVar42) {
    bVar10 = bVar7;
  }
  if (bVar10) {
    func_0x000c24fc();
  }
  else if (*(int *)(unaff_x24 + 0x804) == iVar42) {
    *(undefined4 *)(&UNK_00006210 + unaff_x21) = 1;
  }
  if (in_stack_000000f0._4_4_ == 0) {
    func_0x000bd308(unaff_x29 + -0xa8,unaff_x22,1);
    uVar15 = *(undefined4 *)(unaff_x29 + -0xa8);
    uVar63 = *(undefined4 *)(unaff_x29 + -0xa4);
    uVar64 = *(undefined4 *)(unaff_x29 + -0xa0);
    uVar66 = *(undefined4 *)(unaff_x29 + -0x9c);
    uVar18 = func_0x000bba44(0x3f800000,7);
    func_0x000bcf14(uVar15,uVar63,uVar64,uVar66,*(undefined4 *)(&UNK_0000392c + unaff_x21),uVar18,1)
    ;
  }
  uStack0000000000000108 = *(undefined8 *)(unaff_x29 + -0xa8);
  fVar51 = (float)((ulong)uStack0000000000000108 >> 0x20);
  _fStack0000000000000110 =
       CONCAT44(in_stack_00000080 + fVar51,in_stack_000000b0 + (float)uStack0000000000000108);
  if (in_stack_000000f0._4_4_ == 0) {
    uStack0000000000000100 =
         CONCAT44(fVar51 + (float)((ulong)*(undefined8 *)(in_stack_000000d8 + 0xc4) >> 0x20),
                  (float)uStack0000000000000108 + (float)*(undefined8 *)(in_stack_000000d8 + 0xc4));
  }
  else {
    uStack0000000000000100 = *(ulong *)(in_stack_000000c8 + 0x110);
  }
  if (bVar6) {
    in_stack_000000e8 = *(char **)(unaff_x26 + 0x30);
  }
  if (bVar9 == false) {
    if ((in_stack_000000e0 | uStack000000000000004c) == 1) {
      in_stack_000000d0 = in_stack_000000e8 + *(int *)(unaff_x26 + 0x10);
      goto code_r0x0011b7f4;
    }
    if (in_stack_000000f0._4_4_ != 0) goto code_r0x0011b834;
    if (*(int *)(in_stack_000000d8 + 0x804) == iVar42) {
      lVar17 = (long)*(int *)(unaff_x26 + 0x10);
    }
    else {
      lVar17 = _strlen(in_stack_000000e8);
    }
    in_stack_000000d0 = in_stack_000000e8 + lVar17;
    fVar51 = 0.0;
    in_stack_000000b0 = 0.0;
    uVar27 = uStack0000000000000034;
    uVar36 = uStack0000000000000024;
    if (0x1fffff < (long)in_stack_000000d0 - (long)in_stack_000000e8) goto joined_r0x0011c234;
code_r0x0011b7c4:
    puVar41 = &uStack0000000000000108;
code_r0x0011bafc:
    uVar18 = func_0x000bba44(0x3f800000,bVar9);
    func_0x000f4e60(*(undefined4 *)(&UNK_00003d38 + unaff_x21),0,
                    *(undefined8 *)(in_stack_000000c8 + 0x2a8),
                    *(undefined8 *)(&UNK_00003d30 + unaff_x21),&uStack0000000000000100,uVar18,
                    in_stack_000000e8,in_stack_000000d0,puVar41);
    uVar36 = uStack0000000000000024;
    uVar27 = uStack0000000000000034;
joined_r0x0011bb48:
    if ((uVar36 & 1) == 0) goto code_r0x0011bb4c;
code_r0x0011c078:
    if (in_stack_000000f0._4_4_ != 0) goto code_r0x0011c07c;
code_r0x0011c104:
    uVar36 = uVar36 ^ 1;
    if ((&UNK_00005ff8)[unaff_x21] == '\0') {
      uVar36 = 1;
    }
    if ((uVar36 & 1) == 0) goto code_r0x0011c11c;
code_r0x0011c1cc:
    if (0.0 < unaff_s14) goto code_r0x0011c1d4;
code_r0x0011c148:
    if (((uVar27 ^ 1) & 1) != 0 || (unaff_w25 & 0x8000000) != 0) goto code_r0x0011c160;
  }
  else {
    lVar17 = _strlen(in_stack_00000098);
    in_stack_000000d0 = in_stack_00000098 + lVar17;
    in_stack_000000e8 = in_stack_00000098;
    if (in_stack_000000e0 != 0 || uStack000000000000004c != 0) {
code_r0x0011b7f4:
      puVar44 = *(ushort **)(unaff_x26 + 0x20);
      if (in_stack_000000e0 == 0) {
        puVar22 = (ushort *)0x0;
        iVar12 = -1000;
      }
      else {
        puVar22 = puVar44 + *(int *)(unaff_x26 + 0x54);
        iVar12 = -1;
      }
      uVar27 = (uint)(in_stack_000000e0 != 0);
      if (uStack000000000000004c == 0) {
        puVar45 = (ushort *)0x0;
        iVar13 = -1000;
      }
      else {
        iVar13 = *(int *)(unaff_x26 + 0x58);
        if (*(int *)(unaff_x26 + 0x5c) <= *(int *)(unaff_x26 + 0x58)) {
          iVar13 = *(int *)(unaff_x26 + 0x5c);
        }
        puVar45 = puVar44 + iVar13;
        uVar27 = uVar27 + 1;
        iVar13 = -1;
      }
      iVar14 = 0;
      iVar28 = uVar27 + (in_stack_000000f0._4_4_ >> 0x1a);
      uVar4 = *puVar44;
      puVar20 = puVar44;
      do {
        while (uVar4 != 10) {
          if (uVar4 == 0) goto code_r0x0011b934;
code_r0x0011b8a4:
          uVar4 = puVar20[1];
joined_r0x0011b92c:
          puVar20 = puVar20 + 1;
        }
        iVar14 = iVar14 + 1;
        if (iVar12 == -1) {
          if (puVar20 < puVar22) {
            iVar12 = -1;
          }
          else {
            iVar12 = iVar14;
            if (iVar28 < 2) goto code_r0x0011b934;
            iVar28 = iVar28 + -1;
          }
        }
        if (iVar13 != -1) goto code_r0x0011b8a4;
        if (puVar45 <= puVar20) {
          iVar13 = iVar14;
          if (1 < iVar28) {
            iVar28 = iVar28 + -1;
            uVar4 = puVar20[1];
            goto joined_r0x0011b92c;
          }
code_r0x0011b934:
          puVar20 = (ushort *)func_0x000b84f0(puVar22,puVar44);
          piVar32 = *(int **)(&UNK_00003d30 + unaff_x21);
          fVar49 = *(float *)(&UNK_00003d38 + unaff_x21);
          fVar51 = 0.0;
          do {
            fVar54 = 0.0;
            puVar21 = puVar20;
            while( true ) {
              do {
                if (puVar22 <= puVar21) {
                  if (iVar12 == -1) {
                    iVar12 = iVar14 + 1;
                  }
                  if (iVar13 == -1) {
                    iVar13 = iVar14 + 1;
                  }
                  if (fVar54 <= fVar51) {
                    fVar54 = fVar51;
                  }
                  fVar58 = 0.0;
                  fVar65 = 0.0;
                  fVar50 = fVar49;
                  if (iVar13 < 0) goto code_r0x0011ba78;
                  puVar22 = (ushort *)func_0x000b84f0(puVar45,puVar44);
                  piVar32 = *(int **)(&UNK_00003d30 + unaff_x21);
                  fVar50 = *(float *)(&UNK_00003d38 + unaff_x21);
                  fVar51 = 0.0;
                  goto code_r0x0011ba14;
                }
                puVar20 = puVar21 + 1;
                uVar4 = *puVar21;
                puVar21 = puVar20;
              } while (uVar4 == 0xd);
              if (uVar4 == 10) break;
              pfVar35 = (float *)(piVar32 + 4);
              if ((int)(uint)uVar4 < *piVar32) {
                pfVar35 = (float *)(*(long *)(piVar32 + 2) + (ulong)(uint)uVar4 * 4);
              }
              fVar54 = fVar54 + (fVar49 / (float)piVar32[5]) * *pfVar35;
            }
            if (fVar51 < fVar54) {
              fVar51 = fVar54;
            }
          } while( true );
        }
        iVar13 = -1;
        puVar20 = puVar20 + 1;
        uVar4 = *puVar20;
      } while( true );
    }
    fVar51 = 0.0;
    if (in_stack_000000f0._4_4_ != 0) {
code_r0x0011b834:
      iVar12 = 0;
      in_stack_000000d0 = in_stack_000000e8;
      while( true ) {
        pcVar29 = in_stack_000000d0 + 1;
        cVar3 = *in_stack_000000d0;
        if (cVar3 == '\0') break;
        in_stack_000000d0 = pcVar29;
        if (cVar3 == '\n') {
          iVar12 = iVar12 + 1;
        }
      }
      fVar51 = *(float *)(&UNK_00003d38 + unaff_x21) * (float)(iVar12 + 1);
      if (in_stack_000000f0._4_4_ == 0) {
        lVar17 = (long)in_stack_000000d0 - (long)in_stack_000000e8;
        goto joined_r0x0011bb8c;
      }
      puVar41 = (undefined8 *)0x0;
      goto code_r0x0011bafc;
    }
    lVar17 = (long)in_stack_000000d0 - (long)in_stack_00000098;
    in_stack_000000b0 = 0.0;
joined_r0x0011bb8c:
    uVar27 = uStack0000000000000034;
    uVar36 = uStack0000000000000024;
    if (lVar17 < 0x200000) goto code_r0x0011b7c4;
joined_r0x0011c234:
    if ((uVar36 & 1) != 0) goto code_r0x0011c078;
code_r0x0011bb4c:
    func_0x000d34c4();
    if (in_stack_000000f0._4_4_ == 0) goto code_r0x0011c104;
code_r0x0011c07c:
    uStack00000000000000f8._0_4_ = in_stack_000000b0;
    uStack00000000000000f8._4_4_ = fVar51 + *(float *)(&UNK_00003928 + unaff_x21);
    lVar17 = *(long *)(lRam0000000000a334c0 + 0x4000);
    *(undefined1 *)(lVar17 + 0xc0) = 1;
    if (*(char *)(lVar17 + 0xc3) == '\0') {
      uVar18 = *(undefined8 *)(lVar17 + 0x110);
      *(undefined8 *)(unaff_x29 + -0xf8) = uVar18;
      *(ulong *)(unaff_x29 + -0xf0) =
           CONCAT44(uStack00000000000000f8._4_4_ + (float)((ulong)uVar18 >> 0x20),
                    (float)uStack00000000000000f8 + (float)uVar18);
      func_0x000d0d0c(0xbf800000,&uStack00000000000000f8);
      func_0x000d0e24(unaff_x29 + -0xf8,0,0,0);
    }
    *(uint *)(in_stack_000000d8 + 0x112c) = *(uint *)(in_stack_000000d8 + 0x112c) | 0x401;
    func_0x000d0b80();
    uVar40 = unaff_x28[2];
    func_0x000d818c();
    if (*unaff_x28 != 0) goto code_r0x0011c104;
    *unaff_x28 = iVar42;
    unaff_x28[1] = in_stack_00000020;
    unaff_x28[2] = uVar40 & 0x80 | in_stack_00000018._4_4_;
    uVar36 = uVar36 ^ 1;
    if ((&UNK_00005ff8)[unaff_x21] == '\0') {
      uVar36 = 1;
    }
    if ((uVar36 & 1) != 0) goto code_r0x0011c1cc;
code_r0x0011c11c:
    func_0x000dc80c("{","}");
    func_0x000bc2c4(&uStack0000000000000100,in_stack_000000e8,in_stack_000000d0);
    if (unaff_s14 <= 0.0) goto code_r0x0011c148;
code_r0x0011c1d4:
    func_0x000bc130(*(float *)(unaff_x29 + -0xa0) + *(float *)(&UNK_0000393c + unaff_x21),
                    *(float *)(unaff_x29 + -0xa4) + *(float *)(&UNK_00003928 + unaff_x21),
                    in_stack_00000028,0,1);
    if (((uVar27 ^ 1) & 1) != 0 || (unaff_w25 & 0x8000000) != 0) goto code_r0x0011c160;
  }
  func_0x000c255c(unaff_x22);
code_r0x0011c160:
  if ((unaff_w25 & 0x20) != 0) {
    uVar27 = uVar38;
  }
  return uVar27;
code_r0x0011ba14:
  fVar58 = 0.0;
  puVar20 = puVar22;
code_r0x0011ba18:
  if (puVar20 < puVar45) goto code_r0x0011ba20;
  if (fVar58 <= fVar51) {
    fVar58 = fVar51;
  }
  fVar65 = fVar50 * (float)iVar13;
code_r0x0011ba78:
  fVar49 = fVar49 * (float)iVar12;
  fVar52 = fVar50 * (float)(iVar14 + 1);
  fVar51 = fVar52;
  if (in_stack_000000f0._4_4_ == 0) {
    fVar51 = 0.0;
  }
  if ((in_stack_000000e0 != 0) && (unaff_x26[0xe84] != '\0')) {
    if ((uStack0000000000000094 >> 0xc & 1) == 0) {
      if (*(float *)(unaff_x26 + 0x50) <= fVar54) {
        fVar53 = fVar54 - (in_stack_000000b0 - *(float *)(in_stack_000000d8 + 0xc4));
        if (fVar53 < *(float *)(unaff_x26 + 0x50)) goto code_r0x0011bc1c;
        fVar53 = in_stack_000000b0 * 0.25 + fVar53;
      }
      else {
        fVar55 = fVar54 - in_stack_000000b0 * 0.25;
        fVar53 = 0.0;
        if (0.0 < fVar55) {
          fVar53 = fVar55;
        }
      }
      *(float *)(unaff_x26 + 0x50) = (float)(int)fVar53;
    }
    else {
      *(undefined4 *)(unaff_x26 + 0x50) = 0;
    }
code_r0x0011bc1c:
    if (in_stack_000000f0._4_4_ != 0) {
      fVar50 = fVar49 - fVar50;
      if (fVar67 <= fVar50) {
        fVar50 = *(float *)(&UNK_00003928 + unaff_x21);
        if (fVar67 <= fVar49 - (in_stack_00000080 + fVar50 * -2.0)) {
          fVar67 = (fVar49 - in_stack_00000080) + fVar50 * 2.0;
        }
      }
      else {
        fVar67 = 0.0;
        if (0.0 < fVar50) {
          fVar67 = fVar50;
        }
        fVar50 = *(float *)(&UNK_00003928 + unaff_x21);
      }
      in_stack_00000080 = (fVar52 + fVar50 * 2.0) - in_stack_00000080;
      if (in_stack_00000080 < 0.0) {
        in_stack_00000080 = 0.0;
      }
      if (fVar67 <= in_stack_00000080) {
        in_stack_00000080 = fVar67;
      }
      fVar50 = 0.0;
      if (0.0 <= fVar67) {
        fVar50 = in_stack_00000080;
      }
      uStack0000000000000100 =
           CONCAT44(uStack0000000000000100._4_4_ + (*(float *)(in_stack_000000c8 + 0x90) - fVar50),
                    (float)uStack0000000000000100);
      *(float *)(in_stack_000000c8 + 0x90) = fVar50;
    }
    unaff_x26[0xe84] = 0;
  }
  fVar67 = *(float *)(unaff_x26 + 0x50);
  if (uStack000000000000004c != 0) {
    iVar13 = *(int *)(unaff_x26 + 0x58);
    iVar14 = *(int *)(unaff_x26 + 0x5c);
    iVar12 = iVar13;
    if (iVar14 <= iVar13) {
      iVar12 = iVar14;
    }
    if (iVar13 <= iVar14) {
      iVar13 = iVar14;
    }
    uVar18 = 0x3f800000;
    if (in_stack_000000e0 == 0) {
      uVar18 = 0x3f19999a;
    }
    uVar18 = func_0x000bba44(uVar18,0x2f);
    fVar50 = 0.0;
    if (in_stack_000000f0._4_4_ == 0) {
      fVar50 = -1.0;
    }
    fVar52 = 0.0;
    if (in_stack_000000f0._4_4_ == 0) {
      fVar52 = 2.0;
    }
    if (iVar12 < iVar13) {
      puVar22 = puVar44 + iVar13;
      puVar44 = puVar44 + iVar12;
      uVar19 = uStack0000000000000100 & 0xffffffff;
      fVar58 = fVar58 + (float)uStack0000000000000100;
      fVar65 = fVar65 + uStack0000000000000100._4_4_;
      fVar53 = *(float *)(&UNK_00003d38 + unaff_x21);
      do {
        if (fStack0000000000000114 + fVar53 < fVar65) break;
        puVar45 = puVar44;
        if (uStack0000000000000108._4_4_ <= fVar65) {
          piVar32 = *(int **)(&UNK_00003d30 + unaff_x21);
          pfVar35 = (float *)(piVar32 + 4);
          fVar55 = 0.0;
          while (puVar44 < puVar22) {
            puVar45 = puVar44 + 1;
            uVar4 = *puVar44;
            puVar44 = puVar45;
            if (uVar4 != 0xd) {
              if (uVar4 == 10) {
                fVar61 = 0.0;
                if (0.0 < fVar55) {
                  fVar61 = fVar55;
                }
                fVar55 = 0.0;
                if (0.0 <= fVar61) {
                  fVar55 = fVar61;
                }
                goto joined_r0x0011be20;
              }
              pfVar37 = pfVar35;
              if ((int)(uint)uVar4 < *piVar32) {
                pfVar37 = (float *)(*(long *)(piVar32 + 2) + (ulong)(uint)uVar4 * 4);
              }
              fVar55 = fVar55 + (fVar53 / (float)piVar32[5]) * *pfVar37;
            }
          }
          if (fVar55 <= 0.0) {
            fVar55 = 0.0;
          }
joined_r0x0011be20:
          if (fVar55 <= 0.0) {
            if (0x20 < *piVar32) {
              pfVar35 = (float *)(*(long *)(piVar32 + 2) + 0x80);
            }
            fVar55 = (float)(int)(*pfVar35 * 0.5);
          }
          fVar62 = (fVar58 - fVar67) + 0.0;
          fVar61 = fVar65 + (fVar50 - fVar53);
          fVar55 = (fVar58 - fVar67) + fVar55;
          if (fVar62 < (float)uStack0000000000000108) {
            fVar62 = (float)uStack0000000000000108;
          }
          if (fVar61 < uStack0000000000000108._4_4_) {
            fVar61 = uStack0000000000000108._4_4_;
          }
          *(float *)(unaff_x29 + -0xf8) = fVar62;
          *(float *)(unaff_x29 + -0xf4) = fVar61;
          if (fStack0000000000000110 <= fVar55) {
            fVar55 = fStack0000000000000110;
          }
          fVar58 = fVar52 + fVar65;
          if (fStack0000000000000114 <= fVar52 + fVar65) {
            fVar58 = fStack0000000000000114;
          }
          *(float *)(unaff_x29 + -0xf0) = fVar55;
          *(float *)(unaff_x29 + -0xec) = fVar58;
          bVar7 = false;
          bVar6 = true;
          bVar10 = false;
          if (uStack0000000000000108._4_4_ < fVar58) {
            bVar7 = false;
            bVar6 = false;
            bVar10 = true;
            if (!NAN(fStack0000000000000114) && !NAN(fVar61)) {
              bVar7 = fStack0000000000000114 < fVar61;
              bVar6 = fStack0000000000000114 == fVar61;
              bVar10 = false;
            }
          }
          bVar5 = false;
          if ((!bVar6 && bVar7 == bVar10) &&
             (bVar5 = false, !NAN((float)uStack0000000000000108) && !NAN(fVar55))) {
            bVar5 = (float)uStack0000000000000108 < fVar55;
          }
          bVar7 = false;
          bVar6 = true;
          bVar10 = false;
          if (bVar5) {
            bVar7 = false;
            bVar6 = false;
            bVar10 = true;
            if (!NAN(fStack0000000000000110) && !NAN(fVar62)) {
              bVar7 = fStack0000000000000110 < fVar62;
              bVar6 = fStack0000000000000110 == fVar62;
              bVar10 = false;
            }
          }
          if (!bVar6 && bVar7 == bVar10) {
            func_0x000f3bb0(0,*(undefined8 *)(in_stack_000000c8 + 0x2a8),unaff_x29 + -0xf8,
                            unaff_x29 + -0xf0,uVar18,0);
            uVar19 = uStack0000000000000100 & 0xffffffff;
            fVar53 = *(float *)(&UNK_00003d38 + unaff_x21);
          }
        }
        else {
          do {
            puVar44 = puVar45;
            if (puVar22 <= puVar45) break;
            puVar44 = puVar45 + 1;
            uVar4 = *puVar45;
            puVar45 = puVar44;
          } while (uVar4 != 10);
        }
        fVar65 = fVar65 + fVar53;
        fVar58 = (float)uVar19;
      } while (puVar44 < puVar22);
    }
  }
  uVar27 = uStack0000000000000034;
  if (in_stack_000000f0._4_4_ == 0) {
    if ((long)in_stack_000000d0 - (long)in_stack_000000e8 < 0x200000) {
      puVar41 = &uStack0000000000000108;
      goto code_r0x0011bf08;
    }
  }
  else {
    puVar41 = (undefined8 *)0x0;
code_r0x0011bf08:
    uVar18 = func_0x000bba44(0x3f800000,bVar9);
    uVar23 = *(undefined8 *)(in_stack_000000c8 + 0x2a8);
    uVar25 = *(undefined8 *)(&UNK_00003d30 + unaff_x21);
    uVar15 = *(undefined4 *)(&UNK_00003d38 + unaff_x21);
    *(float *)(unaff_x29 + -0xf8) = (float)uStack0000000000000100 - fVar67;
    *(float *)(unaff_x29 + -0xf4) = uStack0000000000000100._4_4_;
    func_0x000f4e60(uVar15,0,uVar23,uVar25,unaff_x29 + -0xf8,uVar18,in_stack_000000e8,
                    in_stack_000000d0,puVar41);
  }
  unaff_w25 = uStack0000000000000094;
  in_stack_000000b0 = in_stack_00000050;
  uVar36 = uStack0000000000000024;
  if (in_stack_000000e0 == 0) goto joined_r0x0011c234;
  fVar58 = *(float *)(unaff_x21 + 0x18) + *(float *)(unaff_x26 + 0xe80);
  *(float *)(unaff_x26 + 0xe80) = fVar58;
  bVar7 = true;
  if ((*(char *)(unaff_x21 + 0x5b) != '\0') && (0.0 < fVar58)) {
    fVar58 = (float)_fmodf(fVar58,0x3f99999a);
    bVar7 = fVar58 <= 0.8;
  }
  uVar36 = uStack0000000000000024;
  fVar58 = (float)(int)((fVar54 + (float)uStack0000000000000100) - fVar67);
  fVar50 = (float)(int)(fVar49 + uStack0000000000000100._4_4_);
  fVar49 = (fVar50 - *(float *)(&UNK_00003d38 + unaff_x21)) + 0.5;
  fVar54 = fVar58 + 1.0;
  *(float *)(unaff_x29 + -0xf8) = fVar58;
  *(float *)(unaff_x29 + -0xf4) = fVar49;
  fVar67 = fVar50 + -1.5;
  *(float *)(unaff_x29 + -0xf0) = fVar54;
  *(float *)(unaff_x29 + -0xec) = fVar67;
  if (bVar7) {
    bVar7 = false;
    bVar6 = true;
    bVar9 = false;
    if (uStack0000000000000108._4_4_ < fVar67) {
      bVar7 = false;
      bVar6 = false;
      bVar9 = true;
      if (!NAN(fStack0000000000000114) && !NAN(fVar49)) {
        bVar7 = fStack0000000000000114 < fVar49;
        bVar6 = fStack0000000000000114 == fVar49;
        bVar9 = false;
      }
    }
    bVar10 = false;
    if ((!bVar6 && bVar7 == bVar9) &&
       (bVar10 = false, !NAN((float)uStack0000000000000108) && !NAN(fVar54))) {
      bVar10 = (float)uStack0000000000000108 < fVar54;
    }
    bVar7 = false;
    bVar6 = true;
    bVar9 = false;
    if (bVar10) {
      bVar7 = false;
      bVar6 = false;
      bVar9 = true;
      if (!NAN(fStack0000000000000110) && !NAN(fVar58)) {
        bVar7 = fStack0000000000000110 < fVar58;
        bVar6 = fStack0000000000000110 == fVar58;
        bVar9 = false;
      }
    }
    if (!bVar6 && bVar7 == bVar9) {
      uVar23 = *(undefined8 *)(in_stack_000000c8 + 0x2a8);
      uStack00000000000000f8._0_4_ = fVar58;
      uStack00000000000000f8._4_4_ = fVar67;
      uVar18 = func_0x000bba44(0x3f800000,0);
      func_0x000f397c(0x3f800000,uVar23,unaff_x29 + -0xf8,&uStack00000000000000f8,uVar18);
    }
  }
  if ((uStack00000000000000e4 >> 0xe & 1) == 0) {
    (&UNK_00005f38)[unaff_x21] = 1;
    *pfStack0000000000000040 = fVar58 + -1.0;
    *(float *)(&UNK_00005f40 + unaff_x21) = fVar50 - *(float *)(&UNK_00003d38 + unaff_x21);
    *(float *)(&UNK_00005f44 + unaff_x21) = *(float *)(&UNK_00003d38 + unaff_x21);
    goto joined_r0x0011c234;
  }
  goto joined_r0x0011bb48;
code_r0x0011ba20:
  puVar22 = puVar20 + 1;
  uVar4 = *puVar20;
  puVar20 = puVar22;
  if (uVar4 == 0xd) goto code_r0x0011ba18;
  if (uVar4 != 10) {
    pfVar35 = (float *)(piVar32 + 4);
    if ((int)(uint)uVar4 < *piVar32) {
      pfVar35 = (float *)(*(long *)(piVar32 + 2) + (ulong)(uint)uVar4 * 4);
    }
    fVar58 = fVar58 + (fVar50 / (float)piVar32[5]) * *pfVar35;
    goto code_r0x0011ba18;
  }
  if (fVar51 < fVar58) {
    fVar51 = fVar58;
  }
  goto code_r0x0011ba14;
}

