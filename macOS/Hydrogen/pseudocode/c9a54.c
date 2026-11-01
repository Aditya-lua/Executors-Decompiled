
/* WARNING: Removing unreachable block (ram,0x000cb648) */
/* WARNING: Removing unreachable block (ram,0x000cdda4) */
/* WARNING: Removing unreachable block (ram,0x000cddf4) */
/* WARNING: Removing unreachable block (ram,0x000cddac) */
/* WARNING: Removing unreachable block (ram,0x000c9e2c) */
/* WARNING: Removing unreachable block (ram,0x000c9e34) */
/* WARNING: Removing unreachable block (ram,0x000c9e80) */
/* WARNING: Removing unreachable block (ram,0x000c9e4c) */
/* WARNING: Removing unreachable block (ram,0x000c9e60) */
/* WARNING: Removing unreachable block (ram,0x000c9e78) */
/* WARNING: Removing unreachable block (ram,0x000c9e84) */
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000c9a54(void)

{
  float *pfVar1;
  float *pfVar2;
  char *pcVar3;
  undefined4 *puVar4;
  ulong *puVar5;
  byte *pbVar6;
  ulong *puVar7;
  uint uVar8;
  uint uVar9;
  byte bVar10;
  char cVar11;
  bool bVar12;
  uint uVar13;
  code *pcVar14;
  bool bVar15;
  bool bVar16;
  int iVar17;
  undefined8 *puVar18;
  int *piVar19;
  char *pcVar20;
  int iVar21;
  uint uVar22;
  long lVar23;
  long *plVar24;
  undefined8 *puVar25;
  undefined *puVar26;
  byte bVar27;
  uint uVar28;
  long lVar29;
  long lVar30;
  long lVar31;
  uint uVar32;
  uint *puVar33;
  undefined *puVar34;
  long unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  long *plVar35;
  long unaff_x22;
  long lVar36;
  uint unaff_w23;
  float *pfVar37;
  int *unaff_x24;
  uint *puVar38;
  long lVar39;
  undefined4 unaff_w25;
  uint uVar40;
  uint uVar41;
  char *unaff_x26;
  int *piVar42;
  float *pfVar43;
  long unaff_x29;
  float fVar44;
  undefined4 uVar45;
  float fVar46;
  float fVar47;
  undefined8 uVar48;
  undefined8 uVar49;
  undefined8 uVar50;
  undefined8 uVar51;
  undefined8 uVar52;
  undefined8 uVar53;
  float fVar54;
  undefined4 uVar55;
  float fVar56;
  float fVar57;
  undefined8 uVar58;
  undefined8 uVar59;
  int iVar60;
  undefined8 uVar61;
  undefined8 uVar62;
  ulong uVar63;
  ulong uVar64;
  float fVar65;
  float fVar66;
  float fVar67;
  float fVar69;
  ulong uVar68;
  float fVar70;
  ulong uVar71;
  ulong uVar72;
  float fVar73;
  float fVar74;
  float fVar75;
  float fVar76;
  float fVar77;
  float fVar78;
  float fVar79;
  undefined1 auVar80 [16];
  undefined8 uStack0000000000000070;
  ulong uStack00000000000000a0;
  uint uStack00000000000000c4;
  float *pfStack0000000000000108;
  uint uStack000000000000013c;
  uint uStack0000000000000140;
  uint uStack0000000000000148;
  char *pcStack0000000000000150;
  undefined1 *in_stack_00000168;
  uint uStack0000000000000170;
  uint uStack0000000000000184;
  uint uStack000000000000019c;
  int iStack00000000000001a0;
  int iStack00000000000001a4;
  uint uStack00000000000001b4;
  long in_stack_000001b8;
  undefined8 uStack00000000000001c0;
  undefined8 uStack00000000000001c8;
  undefined8 uStack00000000000001d0;
  ulong in_stack_000001d8;
  ulong uStack00000000000001e0;
  float fStack00000000000001e8;
  float fStack00000000000001ec;
  
  func_0x000eb044();
  lVar23 = *(long *)(&UNK_00003fe8 + in_stack_000001b8);
  lVar29 = *(int *)(in_stack_000001b8 + 0x3fe0) - unaff_x19;
  if (lVar29 != 0 && unaff_x19 <= *(int *)(in_stack_000001b8 + 0x3fe0)) {
    lVar23 = lVar23 + unaff_x19 * 0x10;
    _memmove(lVar23 + 0x10,lVar23,lVar29 * 0x10);
    lVar23 = *(long *)(&UNK_00003fe8 + in_stack_000001b8);
  }
  puVar4 = (undefined4 *)(lVar23 + unaff_x19 * 0x10);
  *puVar4 = unaff_w25;
  *(long **)(puVar4 + 2) = unaff_x20;
  *unaff_x24 = *unaff_x24 + 1;
  if ((unaff_w23 >> 8 & 1) == 0) {
    if (*(int *)((long)unaff_x20 + 0x2a4) == -1) {
      if (*(long *)(&UNK_00005f88 + lRam0000000000a334c0) != 0) {
        piVar42 = (int *)(*(long *)(&UNK_00005f88 + lRam0000000000a334c0) + 4);
        piVar19 = piVar42;
        do {
          if ((*piVar19 == (int)unaff_x20[2]) && (*(char *)((long)piVar19 + 0xf) == '\0'))
          goto LAB_000c9ac4;
          piVar19 = (int *)((long)piVar19 + (long)piVar19[-1]);
        } while (piVar19 !=
                 (int *)((long)piVar42 + (long)*(int *)(&UNK_00005f80 + lRam0000000000a334c0)));
      }
      goto LAB_000c9b98;
    }
    if (*(long *)(&UNK_00005f88 + lRam0000000000a334c0) == 0) goto LAB_000c9b98;
    piVar19 = (int *)(*(long *)(&UNK_00005f88 + lRam0000000000a334c0) +
                     (long)*(int *)((long)unaff_x20 + 0x2a4));
LAB_000c9ac4:
    *(int *)((long)unaff_x20 + 0x2a4) = (int)piVar19 - *(int *)(&UNK_00005f88 + in_stack_000001b8);
    func_0x000ddb38();
    uVar28 = *(uint *)(&UNK_00003fa0 + in_stack_000001b8);
    if ((unaff_w23 >> 0xd & 1) != 0) goto LAB_000c9aec;
LAB_000c9bb4:
    if (uVar28 == *(uint *)(&UNK_00003fa4 + in_stack_000001b8)) {
      if (uVar28 == 0) {
        iVar17 = 8;
      }
      else {
        uVar40 = uVar28;
        if ((int)uVar28 < 0) {
          uVar40 = uVar28 + 1;
        }
        iVar17 = uVar28 + ((int)uVar40 >> 1);
      }
      if (iVar17 <= (int)(uVar28 + 1)) {
        iVar17 = uVar28 + 1;
      }
      func_0x000cef5c(&UNK_00003fa0 + in_stack_000001b8,iVar17);
      uVar28 = *(uint *)(&UNK_00003fa0 + in_stack_000001b8);
    }
    puVar18 = (undefined8 *)(*(long *)(&UNK_00003fa8 + in_stack_000001b8) + (long)(int)uVar28 * 8);
  }
  else {
LAB_000c9b98:
    func_0x000ddb38();
    uVar28 = *(uint *)(&UNK_00003fa0 + in_stack_000001b8);
    if ((unaff_w23 >> 0xd & 1) == 0) goto LAB_000c9bb4;
LAB_000c9aec:
    puVar38 = (uint *)(&UNK_00003fa0 + in_stack_000001b8);
    if (uVar28 == 0) {
      if (*(int *)(&UNK_00003fa4 + in_stack_000001b8) == 0) {
        func_0x000cef5c(puVar38,8);
        lVar23 = (long)(int)*puVar38;
      }
      else {
        lVar23 = 0;
      }
      puVar18 = (undefined8 *)(*(long *)(&UNK_00003fa8 + in_stack_000001b8) + lVar23 * 8);
    }
    else {
      if (uVar28 == *(uint *)(&UNK_00003fa4 + in_stack_000001b8)) {
        uVar40 = uVar28;
        if ((int)uVar28 < 0) {
          uVar40 = uVar28 + 1;
        }
        iVar17 = uVar28 + ((int)uVar40 >> 1);
        if (iVar17 <= (int)(uVar28 + 1)) {
          iVar17 = uVar28 + 1;
        }
        func_0x000cef5c(puVar38,iVar17);
        uVar28 = *puVar38;
      }
      puVar18 = *(undefined8 **)(&UNK_00003fa8 + in_stack_000001b8);
      if (0 < (int)uVar28) {
        _memmove(puVar18 + 1,puVar18,(ulong)uVar28 << 3);
        puVar18 = *(undefined8 **)(&UNK_00003fa8 + in_stack_000001b8);
      }
    }
  }
  *puVar18 = unaff_x20;
  *(int *)(&UNK_00003fa0 + in_stack_000001b8) = *(int *)(&UNK_00003fa0 + in_stack_000001b8) + 1;
  uStack000000000000019c = 1;
  puVar5 = (ulong *)(in_stack_000001b8 + unaff_x21);
  plVar35 = unaff_x20 + 2;
  if (*(int *)(in_stack_000001b8 + 0x3ffc) == (int)*plVar35) {
                    /* WARNING: Does not return */
    pcVar14 = (code *)SoftwareBreakpoint(0xf000,0xc9c60);
    (*pcVar14)();
  }
  puVar38 = (uint *)(in_stack_000001b8 + unaff_x22);
  uVar28 = unaff_w23 | 6;
  if (((unaff_w23 ^ 0xffffffff) & 0x30200) != 0) {
    uVar28 = unaff_w23;
  }
  iStack00000000000001a4 = *(int *)(&UNK_00003f58 + in_stack_000001b8);
  if (*(int *)(&UNK_00003fd0 + in_stack_000001b8) == 0) {
    iStack00000000000001a0 = (int)unaff_x20[0x4e];
    *(bool *)((long)unaff_x20 + 0xc6) = *(char *)((long)puVar5 + 0x5b9) != '\0';
    if ((uVar28 >> 0x1a & 1) == 0) goto code_r0x000c9ca0;
code_r0x000c9d40:
    piVar42 = (int *)(*(long *)(&UNK_00004ad8 + in_stack_000001b8) + (long)(int)puVar38[0x3a] * 0x38
                     );
    bVar16 = (int)unaff_x20[0x1b] != *piVar42;
    bVar15 = unaff_x20 != *(long **)(piVar42 + 2);
    *(bool *)((long)unaff_x20 + 0xc4) =
         (bVar16 || bVar15) || iStack00000000000001a0 < iStack00000000000001a4 + -1;
    if (!((bVar16 || bVar15) || iStack00000000000001a0 < iStack00000000000001a4 + -1))
    goto code_r0x000c9cb8;
code_r0x000c9d7c:
    *(uint *)(unaff_x20 + 0x1d) = *(uint *)(unaff_x20 + 0x1d) | 0x80808;
    uStack0000000000000184 = 1;
    if (iStack00000000000001a0 == iStack00000000000001a4) goto code_r0x000c9cd0;
code_r0x000c9dac:
    lVar23 = lRam0000000000a334c0;
    uVar40 = (uint)((uVar28 & 0x14000000) != 0x4000000) & uVar28 >> 0x18;
    if (uVar40 == 0) {
      iVar17 = *(int *)(&UNK_00003fb0 + lRam0000000000a334c0);
      if (iVar17 == *(int *)(&UNK_00003fb4 + lRam0000000000a334c0)) {
        piVar42 = (int *)(&UNK_00003fb0 + lRam0000000000a334c0);
        if (iVar17 == 0) {
          iVar60 = 8;
        }
        else {
          iVar60 = iVar17;
          if (iVar17 < 0) {
            iVar60 = iVar17 + 1;
          }
          iVar60 = iVar17 + (iVar60 >> 1);
        }
        if (iVar60 <= iVar17 + 1) {
          iVar60 = iVar17 + 1;
        }
        func_0x000cef5c(piVar42,iVar60);
        iVar17 = *piVar42;
      }
      *(long **)(*(long *)(&UNK_00003fb8 + lVar23) + (long)iVar17 * 8) = unaff_x20;
      iVar17 = *(int *)(&UNK_00003fb0 + lVar23);
      *(int *)(&UNK_00003fb0 + lVar23) = iVar17 + 1;
      *(short *)((long)unaff_x20 + 0xd4) = (short)iVar17;
    }
    *(char *)((long)unaff_x20 + 199) = (char)uVar40;
    *(uint *)((long)unaff_x20 + 0x14) = uVar28;
    if ((*puVar38 & 0x100) == 0) {
      uVar40 = 0;
    }
    else {
      uVar40 = puVar38[0xe];
    }
    *(uint *)(unaff_x20 + 3) = uVar40;
    *(int *)(unaff_x20 + 0x4e) = iStack00000000000001a4;
    *(float *)((long)unaff_x20 + 0x274) = (float)*(double *)(&UNK_00003f50 + in_stack_000001b8);
    *(undefined2 *)(unaff_x20 + 0x1a) = 0;
    iVar17 = *(int *)(in_stack_000001b8 + 0x3ff0);
    *(int *)(in_stack_000001b8 + 0x3ff0) = iVar17 + 1;
    *(short *)((long)unaff_x20 + 0xd2) = (short)iVar17;
    iVar17 = *(int *)(&UNK_00003fd0 + in_stack_000001b8);
    if (iVar17 != 0) goto LAB_000c9cdc;
code_r0x000c9f3c:
    lVar23 = 0;
    uStack00000000000001b4 = uVar28;
    if (iStack00000000000001a0 == iStack00000000000001a4) goto LAB_000c9cfc;
code_r0x000c9f4c:
    lVar29 = 0;
    if ((uStack00000000000001b4 & 0x5000000) != 0) {
      lVar29 = lVar23;
    }
    iVar60 = (int)unaff_x20[0x20];
  }
  else {
    iStack00000000000001a0 = (int)unaff_x20[0x4e];
    *(undefined1 *)((long)unaff_x20 + 0xc6) = 0;
    if ((uVar28 >> 0x1a & 1) != 0) goto code_r0x000c9d40;
code_r0x000c9ca0:
    *(bool *)((long)unaff_x20 + 0xc4) = iStack00000000000001a0 < iStack00000000000001a4 + -1;
    if (iStack00000000000001a0 < iStack00000000000001a4 + -1) goto code_r0x000c9d7c;
code_r0x000c9cb8:
    uStack0000000000000184 = 0;
    if (iStack00000000000001a0 != iStack00000000000001a4) goto code_r0x000c9dac;
code_r0x000c9cd0:
    uVar28 = *(uint *)((long)unaff_x20 + 0x14);
    iVar17 = *(int *)(&UNK_00003fd0 + in_stack_000001b8);
    if (iVar17 == 0) goto code_r0x000c9f3c;
LAB_000c9cdc:
    lVar23 = *(long *)(*(long *)(&UNK_00003fd8 + in_stack_000001b8) + (long)(iVar17 + -1) * 0x68);
    uStack00000000000001b4 = uVar28;
    if (iStack00000000000001a0 != iStack00000000000001a4) goto code_r0x000c9f4c;
LAB_000c9cfc:
    lVar29 = unaff_x20[0x6f];
    iVar60 = (int)unaff_x20[0x20];
  }
  if (iVar60 == 0) {
    if (*(int *)((long)unaff_x20 + 0x104) == 0) {
      func_0x000eb9f0(unaff_x20 + 0x20,8);
      iVar17 = (int)unaff_x20[0x20];
    }
    else {
      iVar17 = 0;
    }
    *(int *)(unaff_x20[0x21] + (long)iVar17 * 4) = (int)unaff_x20[2];
    iVar60 = (int)unaff_x20[0x20] + 1;
    *(int *)(unaff_x20 + 0x20) = iVar60;
    iVar17 = *(int *)(&UNK_00003fd0 + in_stack_000001b8);
  }
  pcStack0000000000000150 = (char *)((long)unaff_x20 + 0xc4);
  _uStack0000000000000148 = unaff_x20 + 0x20;
  *(long **)(in_stack_000001b8 + 0x4000) = unaff_x20;
  uVar51 = *(undefined8 *)(&UNK_000049d0 + in_stack_000001b8);
  uVar49 = *(undefined8 *)(&UNK_000049c8 + in_stack_000001b8);
  uVar61 = *(undefined8 *)(&UNK_000049e0 + in_stack_000001b8);
  uVar58 = *(undefined8 *)(&UNK_000049d8 + in_stack_000001b8);
  uVar52 = *(undefined8 *)(&UNK_000049ec + in_stack_000001b8);
  uVar50 = *(undefined8 *)(&UNK_000049e4 + in_stack_000001b8);
  uVar62 = *(undefined8 *)(&UNK_000049b0 + in_stack_000001b8);
  uVar59 = *(undefined8 *)(&UNK_000049a8 + in_stack_000001b8);
  uVar53 = *(undefined8 *)(&UNK_000049c0 + in_stack_000001b8);
  uVar48 = *(undefined8 *)(&UNK_000049b8 + in_stack_000001b8);
  puVar33 = puVar38 + 0x3a;
  uVar9 = *puVar33;
  uVar28 = puVar38[0x1e];
  uVar40 = puVar38[0x22];
  uVar22 = puVar38[0x26];
  uVar32 = puVar38[0x2a];
  uVar41 = puVar38[0x32];
  uVar8 = puVar38[0x2e];
  uVar13 = puVar38[0x52b];
  if (iVar17 == *(int *)(&UNK_00003fd4 + in_stack_000001b8)) {
    if (iVar17 == 0) {
      iVar21 = 8;
    }
    else {
      iVar21 = iVar17;
      if (iVar17 < 0) {
        iVar21 = iVar17 + 1;
      }
      iVar21 = iVar17 + (iVar21 >> 1);
    }
    if (iVar21 <= iVar17 + 1) {
      iVar21 = iVar17 + 1;
    }
    func_0x000ee530(&UNK_00003fd0 + in_stack_000001b8,iVar21);
    iVar17 = *(int *)(&UNK_00003fd0 + in_stack_000001b8);
  }
  puVar18 = (undefined8 *)(*(long *)(&UNK_00003fd8 + in_stack_000001b8) + (long)iVar17 * 0x68);
  puVar18[4] = uVar53;
  puVar18[3] = uVar48;
  puVar18[6] = uVar51;
  puVar18[5] = uVar49;
  puVar18[8] = CONCAT44((int)uVar50,(int)uVar61);
  puVar18[7] = uVar58;
  *(undefined8 *)((long)puVar18 + 0x4c) = uVar52;
  *(undefined8 *)((long)puVar18 + 0x44) = uVar50;
  *puVar18 = unaff_x20;
  puVar18[2] = uVar62;
  puVar18[1] = uVar59;
  *(short *)((long)puVar18 + 0x54) = (short)iVar60;
  *(short *)((long)puVar18 + 0x56) = (short)uVar28;
  *(short *)(puVar18 + 0xb) = (short)uVar40;
  *(short *)((long)puVar18 + 0x5a) = (short)uVar22;
  *(short *)((long)puVar18 + 0x5c) = (short)uVar32;
  *(short *)((long)puVar18 + 0x5e) = (short)uVar41;
  *(short *)(puVar18 + 0xc) = (short)uVar8;
  *(short *)((long)puVar18 + 0x62) = (short)uVar9;
  *(short *)((long)puVar18 + 100) = (short)uVar13;
  *(int *)(&UNK_00003fd0 + in_stack_000001b8) = *(int *)(&UNK_00003fd0 + in_stack_000001b8) + 1;
  if ((uStack00000000000001b4 >> 0x1c & 1) != 0) {
    puVar38[0x42] = puVar38[0x42] + 1;
  }
  if (iStack00000000000001a0 != iStack00000000000001a4) {
    unaff_x20[0x6f] = lVar29;
    unaff_x20[0x74] = (long)unaff_x20;
    unaff_x20[0x73] = (long)unaff_x20;
    unaff_x20[0x72] = (long)unaff_x20;
    unaff_x20[0x71] = (long)unaff_x20;
    if (((uStack00000000000001b4 & 0x3000000) == 0x1000000) && (lVar29 != 0)) {
      unaff_x20[0x71] = *(long *)(lVar29 + 0x388);
    }
    if (((uStack00000000000001b4 >> 0x1a & 1) != 0) && (lVar29 != 0)) {
      unaff_x20[0x72] = *(long *)(lVar29 + 0x390);
    }
    if ((((uStack00000000000001b4 >> 0x1b & 1) == 0) && ((uStack00000000000001b4 & 0x5000000) != 0))
       && (lVar29 != 0)) {
      unaff_x20[0x73] = *(long *)(lVar29 + 0x398);
    }
    if (*(char *)((long)unaff_x20 + 0x16) < '\0') {
      plVar24 = unaff_x20;
      do {
        plVar24 = (long *)plVar24[0x6f];
      } while (*(char *)((long)plVar24 + 0x16) < '\0');
      unaff_x20[0x74] = (long)plVar24;
    }
    unaff_x20[0x70] = lVar23;
    lVar30 = 0;
    if ((uStack00000000000001b4 & 0x1000000) != 0) {
      lVar30 = lVar23;
    }
    unaff_x20[0x75] = lVar30;
  }
  lVar30 = lRam0000000000a334c0;
  plVar24 = plVar35;
  if ((uStack00000000000001b4 & 0x800000) != 0) {
    plVar24 = (long *)((long)puVar5 + 0xfcc);
  }
  lVar31 = *plVar24;
  piVar42 = (int *)(&UNK_00004aa0 + lRam0000000000a334c0);
  piVar19 = (int *)(&UNK_00004978 + lRam0000000000a334c0);
  uVar55 = *(undefined4 *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x10);
  iVar17 = *piVar42;
  if (iVar17 == *(int *)(&UNK_00004aa4 + lRam0000000000a334c0)) {
    iVar60 = iVar17;
    if (iVar17 < 0) {
      iVar60 = iVar17 + 1;
    }
    iVar21 = 8;
    if (iVar17 != 0) {
      iVar21 = iVar17 + (iVar60 >> 1);
    }
    if (iVar21 <= iVar17 + 1) {
      iVar21 = iVar17 + 1;
    }
    func_0x000cef5c(piVar42,iVar21);
    iVar17 = *piVar42;
  }
  *(ulong *)(*(long *)(&UNK_00004aa8 + lVar30) + (long)iVar17 * 8) = CONCAT44(uVar55,(int)lVar31);
  *piVar42 = *piVar42 + 1;
  *piVar19 = (int)lVar31;
  *(int *)(unaff_x20 + 0x7e) = *(int *)((long)puVar5 + 0xfcc);
  if ((uStack00000000000001b4 >> 0x1a & 1) != 0) {
    uVar28 = puVar38[0x3a];
    puVar18 = (undefined8 *)
              (*(long *)(&UNK_00004ad8 + in_stack_000001b8) + (long)(int)uVar28 * 0x38);
    puVar18[1] = unaff_x20;
    *(undefined4 *)(puVar18 + 3) = *(undefined4 *)(lVar23 + 0x168);
    if (uVar28 == puVar38[0x3b]) {
      if (uVar28 == 0) {
        iVar17 = 8;
      }
      else {
        uVar40 = uVar28;
        if ((int)uVar28 < 0) {
          uVar40 = uVar28 + 1;
        }
        iVar17 = uVar28 + ((int)uVar40 >> 1);
      }
      if (iVar17 <= (int)(uVar28 + 1)) {
        iVar17 = uVar28 + 1;
      }
      func_0x000eadcc(puVar33,iVar17);
      uVar28 = *puVar33;
    }
    puVar25 = (undefined8 *)
              (*(long *)(&UNK_00004ae8 + in_stack_000001b8) + (long)(int)uVar28 * 0x38);
    uVar50 = puVar18[1];
    uVar49 = *puVar18;
    uVar51 = puVar18[3];
    uVar48 = puVar18[2];
    uVar53 = puVar18[5];
    uVar52 = puVar18[4];
    puVar25[6] = puVar18[6];
    puVar25[3] = uVar51;
    puVar25[2] = uVar48;
    puVar25[5] = uVar53;
    puVar25[4] = uVar52;
    puVar25[1] = uVar50;
    *puVar25 = uVar49;
    *puVar33 = *puVar33 + 1;
    *(undefined4 *)(unaff_x20 + 0x1b) = *(undefined4 *)puVar18;
  }
  if ((*puVar38 & 1) == 0) {
    uVar40 = 0;
    uVar28 = *puVar38;
joined_r0x000ca320:
    if ((uVar28 >> 1 & 1) == 0) goto code_r0x000ca2b8;
code_r0x000ca340:
    if ((puVar38[2] & (int)(*(uint *)(unaff_x20 + 0x1d) << 0x10) >> 0x18) == 0) {
      bVar16 = false;
      bVar15 = false;
      uVar28 = *(uint *)(unaff_x20 + 3);
    }
    else {
      bVar16 = 0.0 < (float)puVar38[8];
      bVar15 = 0.0 < (float)puVar38[9];
      uVar28 = *(uint *)(unaff_x20 + 3);
    }
    if (((*(uint *)(unaff_x20 + 0x1d) >> 10 & 1) == 0) && ((uVar28 >> 2 & 1) != 0)) {
      puVar38[8] = *(uint *)(unaff_x20 + 7);
    }
    if (((uVar28 >> 3 & 1) != 0) && ((*(byte *)((long)unaff_x20 + 0xe9) >> 2 & 1) == 0)) {
      puVar38[9] = *(uint *)((long)unaff_x20 + 0x3c);
    }
    func_0x000d228c();
    uVar28 = *puVar38;
  }
  else {
    uVar28 = (int)(char)*(uint *)(unaff_x20 + 0x1d) & puVar38[1];
    uVar40 = (uint)(uVar28 != 0);
    if ((uVar28 != 0) &&
       (1e-05 < (float)puVar38[7] * (float)puVar38[7] + (float)puVar38[6] * (float)puVar38[6])) {
      *(undefined8 *)((long)unaff_x20 + 0xec) = *(undefined8 *)(&UNK_00004a08 + in_stack_000001b8);
      *(undefined8 *)((long)unaff_x20 + 0xf4) = *(undefined8 *)(&UNK_00004a10 + in_stack_000001b8);
      *(uint *)(unaff_x20 + 0x1d) = *(uint *)(unaff_x20 + 0x1d) & 0xfffffff1;
      uVar40 = 1;
      uVar28 = *puVar38;
      goto joined_r0x000ca320;
    }
    func_0x000c3730();
    uVar28 = *puVar38;
    if ((uVar28 >> 1 & 1) != 0) goto code_r0x000ca340;
code_r0x000ca2b8:
    bVar15 = false;
    bVar16 = false;
  }
  if ((uVar28 >> 7 & 1) != 0) {
    if (0.0 <= (float)puVar38[0xc]) {
      *(uint *)((long)unaff_x20 + 0x9c) = puVar38[0xc];
      *(undefined4 *)((long)unaff_x20 + 0xa4) = 0;
    }
    if (0.0 <= (float)puVar38[0xd]) {
      *(uint *)(unaff_x20 + 0x14) = puVar38[0xd];
      *(undefined4 *)(unaff_x20 + 0x15) = 0;
    }
  }
  if ((uVar28 >> 2 & 1) == 0) {
    if (iStack00000000000001a0 != iStack00000000000001a4) {
      unaff_x20[10] = 0;
    }
  }
  else {
    unaff_x20[10] = *(long *)(&UNK_00004a20 + in_stack_000001b8);
    uVar28 = *puVar38;
  }
  if ((uVar28 >> 3 & 1) != 0) {
    uVar22 = puVar38[0xf];
    if ((puVar38[3] == 0) || ((puVar38[3] & (int)(*(uint *)(unaff_x20 + 0x1d) << 8) >> 0x18) != 0))
    {
      *(uint *)(unaff_x20 + 0x1d) = *(uint *)(unaff_x20 + 0x1d) & 0xfff1ffff;
      *(char *)((long)unaff_x20 + 0xc1) = (char)uVar22;
      uVar28 = *puVar38;
    }
  }
  if ((uVar28 >> 5 & 1) != 0) {
    func_0x000c3098();
  }
  if (*pcStack0000000000000150 != '\0') {
    *(uint *)(unaff_x20 + 0x1d) = *(uint *)(unaff_x20 + 0x1d) & 0xfff7f7f7;
  }
  *(undefined8 *)(in_stack_000001b8 + 0x4000) = 0;
  lVar23 = lRam0000000000a334c0;
  if (iStack00000000000001a0 == iStack00000000000001a4) {
    *(long **)(lRam0000000000a334c0 + 0x4000) = unaff_x20;
    if ((int)unaff_x20[0x38] == -1) {
      lVar30 = 0;
    }
    else {
      lVar30 = *(long *)(&UNK_00004e40 + lVar23) + (long)(int)unaff_x20[0x38] * 0x250;
    }
    *(long *)(&UNK_00004e18 + lVar23) = lVar30;
    fVar44 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
    if (unaff_x20[0x6f] != 0) {
      fVar44 = fVar44 * *(float *)(unaff_x20[0x6f] + 0x2a0);
    }
    *(float *)(&UNK_00003d50 + lVar23) = fVar44;
    *(float *)(&UNK_00003d38 + lVar23) = fVar44;
    if (lVar30 == 0) {
      bVar16 = unaff_x20[0x37] == 0;
    }
    else {
      bVar16 = false;
    }
    *(bool *)(unaff_x20 + 0x2e) = bVar16;
    plVar35 = unaff_x20;
  }
  else {
    cVar11 = *(char *)((long)unaff_x20 + 0xe5);
    *(undefined1 *)((long)unaff_x20 + 0xbe) = 1;
    *(bool *)(unaff_x20 + 0x19) = in_stack_00000168 != (undefined1 *)0x0;
    lVar23 = _UNK_0080c300;
    unaff_x20[0x4a] = _UNK_0080c308;
    unaff_x20[0x49] = lVar23;
    iVar17 = *(int *)((long)unaff_x20 + 0x104);
    if (iVar17 < 1) {
      iVar60 = iVar17 - ((uint)-iVar17 >> 1);
      if (iVar60 < 2) {
        iVar60 = 1;
      }
      iVar21 = 8;
      if (iVar17 != 0) {
        iVar21 = iVar60;
      }
      func_0x000eb9f0(_uStack0000000000000148,iVar21);
    }
    *(undefined4 *)(unaff_x20 + 0x20) = 1;
    func_0x000ef410(unaff_x20[0x55]);
    *(undefined4 *)(unaff_x20 + 0x38) = 0xffffffff;
    if (*(char *)((long)unaff_x20 + 0x3fc) != '\0') {
      *(undefined1 *)((long)unaff_x20 + 0x3fc) = 0;
      func_0x000c202c(unaff_x20[0x55] + 0x10,*(undefined4 *)((long)unaff_x20 + 0x3f4));
      func_0x000c21e8(unaff_x20[0x55] + 0x20,(int)unaff_x20[0x7f]);
      *(undefined4 *)(unaff_x20 + 0x7f) = 0;
      *(undefined4 *)((long)unaff_x20 + 0x3f4) = 0;
    }
    if ((*(long *)(&UNK_00004d20 + in_stack_000001b8) != 0) &&
       ((uStack000000000000019c & 1) == 0 && (*(byte *)((long)unaff_x20 + 0x16) & 2) == 0)) {
      lVar23 = unaff_x20[1];
      iVar17 = _strcmp(unaff_x26,lVar23);
      if (iVar17 != 0) {
        *(long *)(unaff_x29 + -0xd8) = (long)(int)unaff_x20[0x10];
        lVar23 = func_0x000b81dc(lVar23,unaff_x29 + -0xd8,unaff_x26);
        unaff_x20[1] = lVar23;
        *(int *)(unaff_x20 + 0x10) = (int)*(undefined8 *)(unaff_x29 + -0xd8);
      }
    }
    pfVar2 = (float *)(unaff_x20 + 8);
    func_0x000d18dc();
    if ('\0' < *(char *)((long)unaff_x20 + 0xe4)) {
      *(char *)((long)unaff_x20 + 0xe4) = *(char *)((long)unaff_x20 + 0xe4) + -1;
    }
    if ('\0' < *(char *)((long)unaff_x20 + 0xe5)) {
      *(char *)((long)unaff_x20 + 0xe5) = *(char *)((long)unaff_x20 + 0xe5) + -1;
    }
    if ('\0' < *(char *)((long)unaff_x20 + 0xe6)) {
      *(char *)((long)unaff_x20 + 0xe6) = *(char *)((long)unaff_x20 + 0xe6) + -1;
    }
    if ((uStack000000000000019c != 0) && (!(bool)(bVar16 & bVar15))) {
      *(undefined1 *)((long)unaff_x20 + 0xe5) = 1;
    }
    uVar28 = 0;
    if ((uStack00000000000001b4 & 0x6000000) != 0) {
      uVar28 = uStack0000000000000184;
    }
    if ((uVar28 == 1) &&
       (*(undefined1 *)((long)unaff_x20 + 0xe5) = 1, (uStack00000000000001b4 >> 6 & 1) != 0)) {
      if (!bVar16) {
        *(undefined4 *)(unaff_x20 + 7) = 0;
        *(undefined4 *)(unaff_x20 + 6) = 0;
      }
      if (!bVar15) {
        *(undefined4 *)((long)unaff_x20 + 0x3c) = 0;
        *(undefined4 *)((long)unaff_x20 + 0x34) = 0;
      }
      pfVar2[0] = 0.0;
      pfVar2[1] = 0.0;
      unaff_x20[9] = 0;
    }
    lVar23 = lRam0000000000a334c0;
    lVar30 = **(long **)(&UNK_00004b10 + lRam0000000000a334c0);
    unaff_x20[4] = lVar30;
    *(long **)(lVar23 + 0x4000) = unaff_x20;
    if ((int)unaff_x20[0x38] == -1) {
      lVar31 = 0;
    }
    else {
      lVar31 = *(long *)(&UNK_00004e40 + lVar23) + (long)(int)unaff_x20[0x38] * 0x250;
    }
    *(long *)(&UNK_00004e18 + lVar23) = lVar31;
    lVar39 = *unaff_x20;
    fVar73 = *(float *)(unaff_x20 + 0x54);
    fVar44 = *(float *)(&UNK_00003d3c + lVar39) * fVar73;
    lVar36 = unaff_x20[0x6f];
    if (lVar36 != 0) {
      fVar44 = fVar44 * *(float *)(lVar36 + 0x2a0);
    }
    *(float *)(&UNK_00003d50 + lVar23) = fVar44;
    *(float *)(&UNK_00003d38 + lVar23) = fVar44;
    if (lVar31 == 0) {
      *(bool *)(unaff_x20 + 0x2e) = unaff_x20[0x37] == 0;
      if ((uStack00000000000001b4 >> 0x18 & 1) != 0) goto code_r0x000ca71c;
LAB_000ca7ac:
      puVar26 = &UNK_00003920;
      if ((uStack00000000000001b4 & 0x8000000) != 0 || (uStack00000000000001b4 & 0x6000000) == 0) {
        puVar26 = &UNK_000038fc;
      }
      *(undefined4 *)((long)unaff_x20 + 100) = *(undefined4 *)(puVar26 + in_stack_000001b8);
      lVar31 = *(long *)(&UNK_000038f0 + in_stack_000001b8);
      unaff_x20[0xb] = lVar31;
      fVar44 = (float)lVar31;
      bVar12 = true;
    }
    else {
      *(undefined1 *)(unaff_x20 + 0x2e) = 0;
      if ((uStack00000000000001b4 >> 0x18 & 1) == 0) goto LAB_000ca7ac;
code_r0x000ca71c:
      fVar54 = *(float *)(&UNK_00003918 + in_stack_000001b8);
      *(float *)((long)unaff_x20 + 100) = fVar54;
      lVar31 = *(long *)(&UNK_000038f0 + in_stack_000001b8);
      unaff_x20[0xb] = lVar31;
      fVar44 = (float)lVar31;
      if ((uStack00000000000001b4 & 0x5000000) == 0x1000000) {
        bVar12 = false;
        if (((*(byte *)(unaff_x20 + 3) >> 1 & 1) == 0) && (fVar54 == 0.0)) {
          fVar44 = 0.0;
          uVar55 = 0;
          if ((uStack00000000000001b4 >> 10 & 1) != 0) {
            uVar55 = *(undefined4 *)(&UNK_000038f4 + in_stack_000001b8);
          }
          bVar12 = false;
          *(undefined4 *)(unaff_x20 + 0xb) = 0;
          *(undefined4 *)((long)unaff_x20 + 0x5c) = uVar55;
        }
      }
      else {
        bVar12 = true;
      }
    }
    if (fVar44 < *(float *)(&UNK_00003934 + in_stack_000001b8)) {
      fVar44 = *(float *)(&UNK_00003934 + in_stack_000001b8);
    }
    if (fVar44 < (float)puVar38[0x19]) {
      fVar44 = (float)puVar38[0x19];
    }
    *(float *)((long)unaff_x20 + 0x174) = fVar44;
    fVar44 = (float)puVar38[0x1a];
    *(float *)(unaff_x20 + 0x2f) = fVar44;
    if ((uStack00000000000001b4 & 0x21) == 0) {
      fVar74 = *(float *)(unaff_x20 + 7);
      fVar56 = *(float *)(unaff_x20 + 5);
      fVar54 = *(float *)((long)unaff_x20 + 0x2c);
      fVar76 = 0.0;
      uVar28 = *(uint *)((long)unaff_x20 + 0x14);
      if ((uVar28 & 1) == 0) {
        fVar76 = *(float *)(&UNK_00003d3c + lVar39) * fVar73;
        if (lVar36 != 0) {
          fVar76 = fVar76 * *(float *)(lVar36 + 0x2a0);
        }
        fVar76 = fVar76 + *(float *)(&UNK_00003928 + lVar39) * 2.0;
      }
      *(float *)(unaff_x29 + -0xd8) = fVar56;
      *(float *)(unaff_x29 + -0xd4) = fVar54;
      *(float *)(unaff_x29 + -0xd0) = fVar56 + fVar74;
      *(float *)(unaff_x29 + -0xcc) = fVar54 + fVar76;
      if ((((*(long **)(&UNK_00004008 + in_stack_000001b8) == unaff_x20) &&
           (*(int *)((long)puVar5 + 0x6a4) == 0)) && ((int)puVar5[0xd5] == 0)) &&
         ((iVar17 = func_0x000c2af4(unaff_x29 + -0xd8,unaff_x29 + -0xd0,1), iVar17 != 0 &&
          (*(short *)(&UNK_0000386a + in_stack_000001b8) == 2)))) {
        *(undefined1 *)((long)unaff_x20 + 0xc2) = 1;
      }
      uStack0000000000000148 = uStack000000000000019c;
      if (*(char *)((long)unaff_x20 + 0xc2) != '\0') {
        bVar10 = *(byte *)((long)unaff_x20 + 0xc1);
        *(byte *)((long)unaff_x20 + 0xc1) = bVar10 ^ 1;
        if (bVar10 != 0) {
          uStack0000000000000148 = 1;
        }
        if (((uVar28 >> 8 & 1) == 0) && (*(float *)(&UNK_00005f5c + lVar23) <= 0.0)) {
          *(float *)(&UNK_00005f5c + lVar23) = *(float *)(lVar23 + 0x1c);
        }
      }
    }
    else {
      *(undefined1 *)((long)unaff_x20 + 0xc1) = 0;
      uVar28 = *(uint *)((long)unaff_x20 + 0x14);
      uStack0000000000000148 = uStack000000000000019c;
    }
    *(undefined1 *)((long)unaff_x20 + 0xc2) = 0;
    fVar74 = *(float *)((long)unaff_x20 + 0xb4);
    fVar76 = *(float *)(unaff_x20 + 0x17);
    *(undefined4 *)(unaff_x20 + 0xd) = 0;
    fVar56 = 0.0;
    fVar54 = 0.0;
    *(undefined4 *)(unaff_x20 + 0xe) = 0;
    if ((uVar28 & 1) == 0) {
      fVar54 = *(float *)(&UNK_00003d3c + lVar39) * fVar73;
      if (lVar36 != 0) {
        fVar54 = fVar54 * *(float *)(lVar36 + 0x2a0);
      }
      fVar54 = fVar54 + *(float *)(&UNK_00003928 + lVar39) * 2.0;
    }
    if ((uVar28 >> 10 & 1) != 0) {
      fVar73 = *(float *)(&UNK_00003d3c + lVar39) * fVar73;
      if (lVar36 != 0) {
        fVar73 = fVar73 * *(float *)(lVar36 + 0x2a0);
      }
      fVar56 = fVar44 + fVar73 + *(float *)(&UNK_00003928 + lVar39) * 2.0;
    }
    *(float *)((long)unaff_x20 + 0x6c) = fVar54 + fVar56;
    *(undefined4 *)((long)unaff_x20 + 0x74) = 0;
    *(undefined4 *)((long)unaff_x20 + 0xb4) = 0;
    *(undefined4 *)(unaff_x20 + 0x17) = 0;
    fVar44 = (float)func_0x000d1a10();
    uStack0000000000000140 = uStack000000000000019c;
    if (((uStack00000000000001b4 >> 6 & 1) == 0) || (*(char *)((long)unaff_x20 + 0xc1) != '\0')) {
      if (*(char *)((long)unaff_x20 + 0xdc) < '\x01') {
        if (*(char *)((long)unaff_x20 + 0xdd) < '\x01') {
          goto code_r0x000caaa4;
        }
      }
      else if (!bVar16) {
        fVar73 = fVar44;
        if ((*(char *)((long)unaff_x20 + 0xde) != '\0') &&
           (fVar73 = *(float *)(unaff_x20 + 7), *(float *)(unaff_x20 + 7) < fVar44)) {
          fVar73 = fVar44;
        }
        *(float *)(unaff_x20 + 7) = fVar73;
        uStack0000000000000140 = 1;
      }
      if ((!bVar15) && ('\0' < *(char *)((long)unaff_x20 + 0xdd))) {
        fVar44 = fVar56;
        if ((*(char *)((long)unaff_x20 + 0xde) != '\0') &&
           (fVar44 = *(float *)((long)unaff_x20 + 0x3c), *(float *)((long)unaff_x20 + 0x3c) < fVar56
           )) {
          fVar44 = fVar56;
        }
        *(float *)((long)unaff_x20 + 0x3c) = fVar44;
        uStack0000000000000148 = 1;
      }
      if (((*(char *)((long)unaff_x20 + 0xc1) == '\0') &&
          ((*(byte *)((long)unaff_x20 + 0x15) & 1) == 0)) &&
         (*(float *)(&UNK_00005f5c + lRam0000000000a334c0) <= 0.0)) {
        *(float *)(&UNK_00005f5c + lRam0000000000a334c0) = *(float *)(lRam0000000000a334c0 + 0x1c);
      }
    }
    else {
      if (!bVar16) {
        *(float *)(unaff_x20 + 7) = fVar44;
        uStack0000000000000140 = 1;
      }
      if (!bVar15) {
        *(float *)((long)unaff_x20 + 0x3c) = fVar56;
        uStack0000000000000148 = 1;
      }
    }
code_r0x000caaa4:
    fVar44 = (float)func_0x000d1c94();
    uVar28 = uStack00000000000001b4 >> 0x18 & 1;
    *(float *)(unaff_x20 + 7) = fVar44;
    *(float *)((long)unaff_x20 + 0x3c) = fVar56;
    if (*(char *)((long)unaff_x20 + 0xc1) == '\0') {
      uVar28 = 1;
    }
    if (uVar28 == 0) {
      fVar73 = 0.0;
      if ((*(byte *)((long)unaff_x20 + 0x14) & 1) == 0) {
        fVar73 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
        if (unaff_x20[0x6f] != 0) {
          fVar73 = fVar73 * *(float *)(unaff_x20[0x6f] + 0x2a0);
        }
        fVar73 = fVar73 + *(float *)(&UNK_00003928 + *unaff_x20) * 2.0;
      }
      *(float *)(unaff_x20 + 6) = (fVar44 + *(float *)(unaff_x20 + 5)) - *(float *)(unaff_x20 + 5);
      *(float *)((long)unaff_x20 + 0x34) =
           (*(float *)((long)unaff_x20 + 0x2c) + fVar73) - *(float *)((long)unaff_x20 + 0x2c);
    }
    else {
      *(float *)(unaff_x20 + 6) = fVar44;
      *(float *)((long)unaff_x20 + 0x34) = fVar56;
    }
    if (uStack0000000000000184 != 0) {
      *(undefined4 *)(unaff_x20 + 0x1c) = 0xffffffff;
      uVar28 = uVar40;
      if ((uStack00000000000001b4 & 0xc000000) != 0x4000000) {
        uVar28 = 1;
      }
      if (uVar28 == 0) {
        unaff_x20[5] = *(long *)(*(long *)(&UNK_00004ae8 + in_stack_000001b8) +
                                 (long)(int)*puVar33 * 0x38 + -0x14);
      }
    }
    uStack0000000000000170 = uStack00000000000001b4 & 0x3000000;
    uVar28 = uStack00000000000001b4 >> 0x1a & 1;
    if ((uStack00000000000001b4 >> 0x18 & 1) != 0) {
      iVar17 = *(int *)(lVar29 + 0x1a0);
      *(short *)(unaff_x20 + 0x1a) = (short)iVar17;
      if (iVar17 == *(int *)(lVar29 + 0x1a4)) {
        if (iVar17 == 0) {
          iVar60 = 8;
        }
        else {
          iVar60 = iVar17;
          if (iVar17 < 0) {
            iVar60 = iVar17 + 1;
          }
          iVar60 = iVar17 + (iVar60 >> 1);
        }
        if (iVar60 <= iVar17 + 1) {
          iVar60 = iVar17 + 1;
        }
        func_0x000cef5c((int *)(lVar29 + 0x1a0),iVar60);
        iVar17 = *(int *)(lVar29 + 0x1a0);
      }
      *(long **)(*(long *)(lVar29 + 0x1a8) + (long)iVar17 * 8) = unaff_x20;
      *(int *)(lVar29 + 0x1a0) = *(int *)(lVar29 + 0x1a0) + 1;
      if ((uVar40 == 0 && uVar28 == 0) && (uStack0000000000000170 != 0x3000000)) {
        unaff_x20[5] = *(long *)(lVar29 + 0x110);
      }
    }
    uVar22 = uStack00000000000001b4;
    fVar44 = *(float *)((long)unaff_x20 + 0xec);
    uVar55 = 0x7f7fffff;
    if ((fVar44 == 3.4028235e+38) || (*(char *)((long)unaff_x20 + 0xe5) != '\0')) {
      if ((uStack00000000000001b4 >> 0x1c & 1) == 0) {
        uVar32 = uVar40;
        if ((uStack00000000000001b4 & 0x4000000) == 0) {
          uVar32 = 1;
        }
        if ((uVar32 != 0) || (cVar11 < '\x01')) {
          uVar32 = uVar40;
          if ((uStack00000000000001b4 & 0x2000000) == 0) {
            uVar32 = 1;
          }
          if ((uVar32 != 0) || (uStack0000000000000170 == 0x3000000)) goto code_r0x000cac7c;
        }
      }
      uVar45 = func_0x000d2410();
      *(undefined4 *)(unaff_x20 + 5) = uVar45;
      *(undefined4 *)((long)unaff_x20 + 0x2c) = uVar55;
    }
    else {
      *(undefined8 *)((long)unaff_x20 + 0xec) = 0x7f7fffff7f7fffff;
      lVar31 = unaff_x20[5];
      *(uint *)(unaff_x20 + 0x1d) = *(uint *)(unaff_x20 + 0x1d) & 0xfffffff1;
      lVar23 = NEON_scvtf(CONCAT44((int)(*(float *)(unaff_x20 + 0x1e) -
                                        (float)((ulong)unaff_x20[6] >> 0x20) *
                                        (float)((ulong)*(undefined8 *)((long)unaff_x20 + 0xf4) >>
                                               0x20)),
                                   (int)(fVar44 - (float)unaff_x20[6] *
                                                  (float)*(undefined8 *)((long)unaff_x20 + 0xf4))),4
                         );
      unaff_x20[5] = lVar23;
      fVar44 = (float)lVar23 - (float)lVar31;
      fVar73 = (float)((ulong)lVar23 >> 0x20) - (float)((ulong)lVar31 >> 0x20);
      if ((fVar44 != 0.0) || (fVar73 != 0.0)) {
        if (((*(byte *)((long)unaff_x20 + 0x15) & 1) == 0) &&
           (*(float *)(&UNK_00005f5c + lRam0000000000a334c0) <= 0.0)) {
          *(float *)(&UNK_00005f5c + lRam0000000000a334c0) = *(float *)(lRam0000000000a334c0 + 0x1c)
          ;
        }
        unaff_x20[0x22] =
             CONCAT44(fVar73 + (float)((ulong)unaff_x20[0x22] >> 0x20),
                      fVar44 + (float)unaff_x20[0x22]);
        unaff_x20[0x26] =
             CONCAT44(fVar73 + (float)((ulong)unaff_x20[0x26] >> 0x20),
                      fVar44 + (float)unaff_x20[0x26]);
        unaff_x20[0x25] =
             CONCAT44(fVar73 + (float)((ulong)unaff_x20[0x25] >> 0x20),
                      fVar44 + (float)unaff_x20[0x25]);
        unaff_x20[0x24] =
             CONCAT44(fVar73 + (float)((ulong)unaff_x20[0x24] >> 0x20),
                      fVar44 + (float)unaff_x20[0x24]);
      }
    }
code_r0x000cac7c:
    uStack00000000000001e0._0_4_ = *(float *)(lVar30 + 4);
    uStack00000000000001e0._4_4_ = *(float *)(lVar30 + 8);
    fStack00000000000001e8 = (float)uStack00000000000001e0 + *(float *)(lVar30 + 0xc);
    fStack00000000000001ec = uStack00000000000001e0._4_4_ + *(float *)(lVar30 + 0x10);
    fVar73 = (float)*(undefined8 *)(lVar30 + 0x14);
    fVar56 = (float)((ulong)*(undefined8 *)(lVar30 + 0x14) >> 0x20);
    uVar71 = *puVar5;
    uVar72 = puVar5[1];
    uVar71 = uVar71 ^ (uVar71 ^ uVar72) &
                      ~CONCAT44(-(uint)((float)(uVar72 >> 0x20) <= (float)(uVar71 >> 0x20)),
                                -(uint)((float)uVar72 <= (float)uVar71));
    fVar66 = (float)uVar71;
    fVar54 = fVar73 + fVar66;
    fVar69 = (float)(uVar71 >> 0x20);
    fVar44 = fVar56 + fVar69;
    fVar66 = (fVar73 + (float)*(undefined8 *)(lVar30 + 0x1c)) - fVar66;
    fVar69 = (fVar56 + (float)((ulong)*(undefined8 *)(lVar30 + 0x1c) >> 0x20)) - fVar69;
    uVar71 = CONCAT44(fVar69,fVar66);
    if ((((uVar40 | (uVar22 & 0x1000000) >> 0x18) == 1) ||
        (fStack00000000000001e8 - (float)uStack00000000000001e0 <= 0.0)) ||
       (fStack00000000000001ec - uStack00000000000001e0._4_4_ <= 0.0)) {
      lVar23 = unaff_x20[5];
      lVar23 = NEON_scvtf(CONCAT44((int)(float)((ulong)lVar23 >> 0x20),(int)(float)lVar23),4);
      unaff_x20[5] = lVar23;
      if ((uVar22 >> 0x18 & 1) == 0) goto code_r0x000cad88;
      puVar26 = &UNK_00003914;
    }
    else {
      fVar73 = *(float *)((long)unaff_x20 + 0x34);
      if ((*(char *)(lRam0000000000a334c0 + 0x5f) != '\0') &&
         ((*(byte *)((long)unaff_x20 + 0x14) & 1) == 0)) {
        fVar73 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
        if (unaff_x20[0x6f] != 0) {
          fVar73 = fVar73 * *(float *)(unaff_x20[0x6f] + 0x2a0);
        }
        fVar73 = fVar73 + *(float *)(&UNK_00003928 + *unaff_x20) * 2.0;
      }
      uVar63 = unaff_x20[5];
      uVar72 = CONCAT44(fVar44 - fVar73,fVar54 - *(float *)(unaff_x20 + 6));
      fVar56 = (float)(uVar63 >> 0x20);
      uVar72 = uVar72 ^ (uVar72 ^ uVar63 ^ (uVar63 ^ uVar71) &
                                           CONCAT44(-(uint)(fVar69 < fVar56),
                                                    -(uint)(fVar66 < (float)uVar63))) &
                        ~CONCAT44(-(uint)(fVar56 < fVar44 - fVar73),
                                  -(uint)((float)uVar63 < fVar54 - *(float *)(unaff_x20 + 6)));
      uVar72 = NEON_scvtf(CONCAT44((int)(float)(uVar72 >> 0x20),(int)(float)uVar72),4);
      unaff_x20[5] = uVar72;
code_r0x000cad88:
      if ((uVar22 & 0xc000000) == 0x4000000) {
        puVar26 = &UNK_0000391c;
      }
      else {
        puVar26 = &UNK_000038f8;
      }
    }
    pfStack0000000000000108 = (float *)(unaff_x20 + 5);
    fVar73 = *(float *)(puVar26 + in_stack_000001b8);
    *(float *)(unaff_x20 + 0xc) = fVar73;
    uVar32 = uStack0000000000000184 ^ 1 | (uVar22 & 0x1000) >> 0xc;
    uVar40 = uVar32 ^ 1;
    if (uVar32 == 0 && uVar28 == 0) {
      uVar40 = (uint)(uStack0000000000000170 == 0);
    }
    *(undefined8 *)(unaff_x29 + -0xb0) = 0;
    *(undefined8 *)(unaff_x29 + -0xa8) = 0;
    lVar23 = lRam0000000000a334c0;
    uVar28 = *(uint *)((long)unaff_x20 + 0x14);
    if ((uVar28 >> 0x18 & 1) == 0) {
      uStack000000000000013c = 1;
      if (*(char *)(in_stack_000001b8 + 0x5e) != '\0') {
        uStack000000000000013c = 2;
      }
    }
    else {
      uStack000000000000013c = 0;
    }
    fVar56 = *(float *)(&UNK_00003d38 + in_stack_000001b8) * 1.1;
    fVar73 = fVar73 + 1.0;
    fVar66 = fVar73 + *(float *)(&UNK_00003d38 + in_stack_000001b8) * 0.2;
    if (fVar56 < fVar66) {
      fVar56 = fVar66;
    }
    if (((*(char *)((long)unaff_x20 + 0xc1) == '\0') && ((uVar28 & 0x42) == 0)) &&
       ((*(char *)((long)unaff_x20 + 0xdc) < '\x01' &&
        ((*(char *)((long)unaff_x20 + 0xdd) < '\x01' && (*(char *)((long)unaff_x20 + 0xbf) != '\0'))
        )))) {
      fVar66 = *(float *)(&UNK_00003d38 + lRam0000000000a334c0) * 1.35;
      fVar73 = fVar73 + *(float *)(&UNK_00003d38 + lRam0000000000a334c0) * 0.2;
      if (fVar66 < fVar73) {
        fVar66 = fVar73;
      }
      fVar73 = 0.0;
      if (*(char *)(lRam0000000000a334c0 + 0x5e) != '\0') {
        fVar73 = 4.0;
      }
      uVar22 = (uint)(*(char *)(lRam0000000000a334c0 + 0x5f) == '\0');
      if ((uVar28 & 1) == 0 && uVar22 == 0) {
        fVar69 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
        if (unaff_x20[0x6f] != 0) {
          fVar69 = fVar69 * *(float *)(unaff_x20[0x6f] + 0x2a0);
        }
        fVar44 = fVar44 - (fVar69 + *(float *)(&UNK_00003928 + *unaff_x20) * 2.0);
      }
      *(undefined4 *)(unaff_x29 + -0xe4) = 0x7f7fffff;
      *(undefined4 *)(unaff_x20 + 0x2d) = 1;
      func_0x000d4e10("#RESIZE");
      pfVar37 = (float *)(&UNK_00004d40 + lVar23);
      fVar66 = (float)(int)((float)(int)fVar66 * 0.75);
      if (uStack000000000000013c == 0) {
        uStack00000000000000c4 = 0;
        uStack0000000000000070 = 0x7f7fffff7f7fffff;
        fVar69 = 3.4028235e+38;
      }
      else {
        uVar72 = 0;
        uStack00000000000000c4 = 0;
        puVar18 = (undefined8 *)&UNK_0080c9e8;
        uStack0000000000000070 = 0x7f7fffff7f7fffff;
        uStack00000000000000a0 = 0x7f7fffff;
        fVar69 = 3.4028235e+38;
        do {
          fVar47 = (float)unaff_x20[5];
          fVar67 = (float)((ulong)unaff_x20[5] >> 0x20);
          fVar70 = (float)puVar18[-1];
          fVar65 = (float)((ulong)puVar18[-1] >> 0x20);
          fVar47 = fVar47 + fVar70 * ((fVar47 + (float)unaff_x20[6]) - fVar47);
          fVar67 = fVar67 + fVar65 * ((fVar67 + (float)((ulong)unaff_x20[6] >> 0x20)) - fVar67);
          fVar78 = (float)*puVar18;
          fVar75 = fVar78 * fVar73;
          fVar79 = (float)((ulong)*puVar18 >> 0x20);
          fVar77 = fVar79 * fVar73;
          fVar57 = fVar47 - fVar75;
          fVar46 = fVar67 - fVar77;
          fVar47 = fVar47 + fVar78 * fVar66;
          fVar67 = fVar67 + fVar79 * fVar66;
          *(ulong *)(unaff_x29 + -0xd8) = CONCAT44(fVar46,fVar57);
          *(ulong *)(unaff_x29 + -0xd0) = CONCAT44(fVar67,fVar47);
          if (fVar47 < fVar57) {
            *(float *)(unaff_x29 + -0xd8) = fVar47;
            *(float *)(unaff_x29 + -0xd0) = fVar57;
          }
          uVar63 = (ulong)(uint)fVar67;
          if (fVar67 < fVar46) {
            *(float *)(unaff_x29 + -0xd4) = fVar67;
            *(float *)(unaff_x29 + -0xcc) = fVar46;
          }
          uVar32 = *(uint *)(unaff_x20[0x21] + (long)(int)unaff_x20[0x20] * 4 + -4);
          uVar41 = (uint)uVar72;
          uVar32 = *(uint *)(&UNK_0080c404 + (ulong)((uVar32 ^ uVar41 ^ 0xffffffff) & 0xff) * 4) ^
                   ~uVar32 >> 8;
          uVar32 = *(uint *)(&UNK_0080c404 + (ulong)((uVar32 ^ uVar41 >> 8) & 0xff) * 4) ^
                   uVar32 >> 8;
          uVar32 = *(uint *)(&UNK_0080c404 + (ulong)((uVar32 ^ uVar41 >> 0x10) & 0xff) * 4) ^
                   uVar32 >> 8;
          uVar32 = *(uint *)(&UNK_0080c404 + (ulong)(uVar32 & 0xff ^ uVar41 >> 0x18) * 4) ^
                   uVar32 >> 8 ^ 0xffffffff;
          if (*(uint *)(&UNK_0000404c + *unaff_x20) == uVar32) {
            func_0x000c167c(uVar32,4,uVar72,0);
          }
          func_0x000d0e24(unaff_x29 + -0xd8,uVar32,0,8);
          func_0x0010b53c(unaff_x29 + -0xd8,uVar32,&uStack00000000000001d0,&uStack00000000000001c0,
                          &UNK_00040800);
          if ((char)uStack00000000000001d0 != '\0' || (char)uStack00000000000001c0 != '\0') {
            uVar55 = 5;
            if ((uVar72 & 1) == 0) {
              uVar55 = 6;
            }
            *(undefined4 *)(&UNK_00004ee8 + lVar23) = uVar55;
            if ((char)uStack00000000000001c0 != '\0') {
              if ((&UNK_00003865)[lVar23] == '\0') {
                uVar68 = CONCAT44(-(uint)(fVar65 == 0.0),-(uint)(fVar70 == 0.0));
                uVar64 = CONCAT44(fVar44,0xff7fffff) ^
                         (CONCAT44(fVar44,0xff7fffff) ^ CONCAT44(0xff7fffff,fVar54)) &
                         CONCAT44(-(uint)((int)(((uint)(fVar65 != 1.0) &
                                                (uVar28 | uVar22 | (uint)(fVar65 != 0.0))) << 0x1f)
                                         < 0),-(uint)((int)((uint)(fVar70 == 1.0) << 0x1f) < 0));
                uVar63 = (uVar71 ^ 0x7f7fffff7f7fffff) & uVar68 ^ 0x7f7fffff7f7fffff;
                fVar69 = fVar75 + fVar70 * (fVar78 * -fVar66 - fVar75) +
                         ((float)*(undefined8 *)(lVar23 + 0xe40) -
                         (float)*(undefined8 *)(&UNK_00004078 + lVar23));
                fVar57 = fVar77 + fVar65 * (fVar79 * -fVar66 - fVar77) +
                         ((float)((ulong)*(undefined8 *)(lVar23 + 0xe40) >> 0x20) -
                         (float)((ulong)*(undefined8 *)(&UNK_00004078 + lVar23) >> 0x20));
                uVar63 = CONCAT44(fVar57,fVar69) ^
                         (CONCAT44(fVar57,fVar69) ^ uVar63) &
                         CONCAT44(-(uint)((float)(uVar63 >> 0x20) < fVar57),
                                  -(uint)((float)uVar63 < fVar69));
                uVar63 = uVar63 ^ (uVar63 ^ uVar64) &
                                  CONCAT44(-(uint)(fVar57 < (float)(uVar64 >> 0x20)),
                                           -(uint)(fVar69 < (float)uVar64));
                fVar69 = (float)unaff_x20[5];
                fVar67 = (float)uVar63;
                fVar46 = (float)((ulong)unaff_x20[5] >> 0x20);
                fVar77 = (float)(uVar63 >> 0x20);
                fVar57 = fVar69 + (float)unaff_x20[6];
                fVar47 = fVar46 + (float)((ulong)unaff_x20[6] >> 0x20);
                fVar75 = fVar67 + fVar70 * (fVar69 - fVar67);
                fVar46 = fVar77 + fVar65 * (fVar46 - fVar77);
                fVar57 = fVar57 + fVar70 * (fVar67 - fVar57);
                fVar47 = fVar47 + fVar65 * (fVar77 - fVar47);
                uStack00000000000000a0 = CONCAT44(fVar47,fVar57);
                fVar69 = (float)func_0x000d1c94();
                uVar68 = CONCAT44((float)uStack00000000000000a0 - (fVar47 - fVar46),
                                  fVar69 - (fVar57 - fVar75)) & uVar68;
                uStack0000000000000070 =
                     CONCAT44(fVar46 - (float)(uVar68 >> 0x20),fVar75 - (float)uVar68);
              }
              else {
                fVar69 = (float)func_0x000d1c94();
                func_0x000c23ac(0,0);
                uStack00000000000000c4 = 3;
                uStack00000000000000a0 = uVar63;
              }
            }
          }
          if (((uVar72 == 0) || (((uint)(float)uStack00000000000001c0 & 0xff) != 0)) ||
             ((char)uStack00000000000001d0 != '\0')) {
            lVar30 = 0x1e;
            if ((char)uStack00000000000001d0 != '\0') {
              lVar30 = 0x1f;
            }
            if (((uint)(float)uStack00000000000001c0 & 0xff) != 0) {
              lVar30 = 0x20;
            }
            lVar30 = lVar30 * 0x10 + lRam0000000000a334c0;
            fVar46 = *(float *)(&UNK_000038e8 + lVar30 + 0xe4);
            fVar47 = *(float *)(&UNK_000038e8 + lVar30 + 0xe8);
            fVar67 = *(float *)(&UNK_000038e8 + lVar30 + 0xec);
            fVar57 = 1.0;
            if (fVar46 <= 1.0) {
              fVar57 = fVar46;
            }
            fVar70 = 0.0;
            if (0.0 <= fVar46) {
              fVar70 = fVar57;
            }
            fVar46 = *(float *)(&UNK_000038e8 + lVar30 + 0xf0) *
                     *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
            fVar57 = 1.0;
            if (fVar47 <= 1.0) {
              fVar57 = fVar47;
            }
            fVar65 = 0.0;
            if (0.0 <= fVar47) {
              fVar65 = fVar57;
            }
            iVar17 = -(uint)(fVar67 < 0.0);
            iVar60 = -(uint)(fVar46 < 0.0);
            uVar63 = NEON_fmov(0x3f800000,4);
            uVar63 = uVar63 ^ (uVar63 ^ CONCAT44(fVar46,fVar67)) &
                              ~CONCAT44(-(uint)((float)(uVar63 >> 0x20) < fVar46),
                                        -(uint)((float)uVar63 < fVar67));
            fVar57 = (float)CONCAT13((byte)(uVar63 >> 0x18) & ~(byte)((uint)iVar17 >> 0x18),
                                     CONCAT12((byte)(uVar63 >> 0x10) & ~(byte)((uint)iVar17 >> 0x10)
                                              ,CONCAT11((byte)(uVar63 >> 8) &
                                                        ~(byte)((uint)iVar17 >> 8),
                                                        (byte)uVar63 & ~(byte)iVar17)));
            uVar49 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar63 >> 0x38) &
                                                               ~(byte)((uint)iVar60 >> 0x18),
                                                               CONCAT16((byte)(uVar63 >> 0x30) &
                                                                        ~(byte)((uint)iVar60 >> 0x10
                                                                               ),CONCAT15((byte)(
                                                  uVar63 >> 0x28) & ~(byte)((uint)iVar60 >> 8),
                                                  CONCAT14((byte)(uVar63 >> 0x20) & ~(byte)iVar60,
                                                           fVar57)))) >> 0x20) * 255.0 + 0.5),
                                        (int)(fVar57 * 255.0 + 0.5)),_UNK_0080c190,4);
            *(uint *)(unaff_x29 + -0xb0 + uVar72 * 4) =
                 (int)(fVar70 * 255.0 + 0.5) | (int)(fVar65 * 255.0 + 0.5) << 8 | (uint)uVar49 |
                 (uint)((ulong)uVar49 >> 0x20);
          }
          uVar72 = uVar72 + 1;
          puVar18 = puVar18 + 3;
        } while (uStack000000000000013c != uVar72);
        *(int *)(unaff_x29 + -0xe4) = (int)uStack00000000000000a0;
      }
      *(float *)(unaff_x29 + -0xe8) = fVar69;
      lVar30 = lRam0000000000a334c0;
      if ((*(byte *)((long)unaff_x20 + 0x17) & 1) == 0) {
        uVar28 = 0;
        if (*(char *)(lVar23 + 0x5e) != '\0') {
          uVar28 = 0xf;
        }
      }
      else {
        uVar28 = *(uint *)(unaff_x20 + 3) >> 1 & 2 | *(uint *)(unaff_x20 + 3) & 8;
      }
      uVar71 = 0;
      fVar73 = (float)((ulong)uStack0000000000000070 >> 0x20);
      do {
        if ((uVar28 >> (ulong)((uint)uVar71 & 0x1f) & 1) != 0) {
                    /* WARNING: Could not recover jumptable at 0x000cd5f0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(code *)(&UNK_000cd5f4 + (ulong)(byte)(&UNK_0080c3c0)[uVar71 & 0xffffffff] * 4))();
          return;
        }
        uVar71 = uVar71 + 1;
      } while (uVar71 != 4);
      *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) =
           *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) + -1;
      *(undefined4 *)(unaff_x20 + 0x2d) = 0;
      if ((*(long *)(&UNK_00004d10 + lVar23) != 0) &&
         (*(long **)(*(long *)(&UNK_00004d10 + lVar23) + 0x388) == unaff_x20)) {
        if (*(int *)(&UNK_00004b64 + lVar23) == 3) {
          puVar26 = &UNK_00003670;
          fVar66 = *(float *)(&UNK_00003650 + lVar30) - *(float *)(&UNK_00003640 + lVar30);
          puVar34 = &UNK_00003660;
code_r0x000cdb50:
          fVar69 = *(float *)(puVar26 + lVar30) - *(float *)(puVar34 + lVar30);
        }
        else {
          fVar66 = 0.0;
          if (*(int *)(&UNK_00004b64 + lVar23) == 2) {
            fVar69 = 0.0;
            if (*(char *)(lVar23 + 0xe5d) != '\0') {
              puVar26 = &UNK_00002eb0;
              fVar66 = *(float *)(&UNK_00002e90 + lVar30) - *(float *)(&UNK_00002e80 + lVar30);
              puVar34 = &UNK_00002ea0;
              goto code_r0x000cdb50;
            }
          }
          else {
            fVar69 = 0.0;
          }
        }
        if ((fVar66 != 0.0) || (fVar69 != 0.0)) {
          fVar57 = *(float *)(lVar23 + 0x50);
          if (*(float *)(lVar23 + 0x54) <= *(float *)(lVar23 + 0x50)) {
            fVar57 = *(float *)(lVar23 + 0x54);
          }
          fVar57 = *(float *)(lVar23 + 0x18) * 600.0 * fVar57;
          fVar66 = *pfVar37 + fVar66 * fVar57;
          fVar69 = *(float *)(&UNK_00004d44 + lVar23) + fVar69 * fVar57;
          *pfVar37 = fVar66;
          *(float *)(&UNK_00004d44 + lVar23) = fVar69;
          fVar54 = (fVar54 - *(float *)(unaff_x20 + 5)) - *(float *)(unaff_x20 + 6);
          fVar44 = (fVar44 - *(float *)((long)unaff_x20 + 0x2c)) -
                   *(float *)((long)unaff_x20 + 0x34);
          if (fVar66 < fVar54) {
            fVar66 = fVar54;
          }
          if (fVar69 < fVar44) {
            fVar69 = fVar44;
          }
          *pfVar37 = fVar66;
          *(float *)(&UNK_00004d44 + lVar23) = fVar69;
          (&UNK_00004d30)[lVar23] = 0;
          (&UNK_00004b7b)[lVar23] = 1;
          uVar55 = func_0x000bba44(0x3f800000,0x20);
          *(undefined4 *)(unaff_x29 + -0xb0) = uVar55;
          if ((int)fVar66 != 0 || (int)fVar69 != 0) {
            fVar54 = (float)(int)fVar69;
            fVar44 = *(float *)((long)unaff_x20 + 0x3c) + fVar54;
            uVar55 = func_0x000d1c94();
            *(undefined4 *)(unaff_x29 + -0xe8) = uVar55;
            *(float *)(unaff_x29 + -0xe4) = fVar44;
            *pfVar37 = *pfVar37 - (float)(int)fVar66;
            *(float *)(&UNK_00004d44 + lVar23) = *(float *)(&UNK_00004d44 + lVar23) - fVar54;
          }
        }
      }
      fVar54 = *(float *)(unaff_x20 + 7);
      fVar66 = *(float *)(unaff_x29 + -0xe8);
      fVar44 = fVar54;
      if (fVar66 != 3.4028235e+38) {
        bVar16 = false;
        if ((*(float *)(unaff_x20 + 6) == fVar66) && (bVar16 = false, !NAN(fVar54) && !NAN(fVar66)))
        {
          bVar16 = fVar54 == fVar66;
        }
        if (!bVar16) {
          *(float *)(unaff_x20 + 7) = fVar66;
          *(float *)(unaff_x20 + 6) = fVar66;
          fVar44 = fVar66;
        }
      }
      fVar57 = *(float *)((long)unaff_x20 + 0x3c);
      fVar69 = *(float *)(unaff_x29 + -0xe4);
      fVar66 = fVar57;
      if (fVar69 != 3.4028235e+38) {
        bVar16 = false;
        if ((*(float *)((long)unaff_x20 + 0x34) == fVar69) &&
           (bVar16 = false, !NAN(fVar57) && !NAN(fVar69))) {
          bVar16 = fVar57 == fVar69;
        }
        if (!bVar16) {
          *(float *)((long)unaff_x20 + 0x3c) = fVar69;
          *(float *)((long)unaff_x20 + 0x34) = fVar69;
          fVar66 = fVar69;
        }
      }
      fVar47 = *(float *)(unaff_x20 + 5);
      fVar46 = *(float *)((long)unaff_x20 + 0x2c);
      fVar69 = fVar47;
      if (((float)uStack0000000000000070 != 3.4028235e+38) &&
         (fVar67 = (float)(int)(float)uStack0000000000000070, fVar47 != fVar67)) {
        *pfStack0000000000000108 = fVar67;
        fVar69 = fVar67;
      }
      fVar67 = fVar46;
      if ((fVar73 != 3.4028235e+38) && (fVar73 = (float)(int)fVar73, fVar46 != fVar73)) {
        *(float *)((long)unaff_x20 + 0x2c) = fVar73;
        fVar67 = fVar73;
      }
      if (((((fVar47 != fVar69) || (fVar46 != fVar67)) || (fVar54 != fVar44)) || (fVar57 != fVar66))
         && (((*(byte *)((long)unaff_x20 + 0x15) & 1) == 0 &&
             (*(float *)(&UNK_00005f5c + lRam0000000000a334c0) <= 0.0)))) {
        *(float *)(&UNK_00005f5c + lRam0000000000a334c0) = *(float *)(lRam0000000000a334c0 + 0x1c);
      }
      uVar22 = uStack00000000000001b4;
      if ((uStack00000000000000c4 != 0) &&
         (uStack0000000000000140 = uStack0000000000000140 | uStack00000000000000c4,
         uStack00000000000000c4 != 1)) {
        uStack0000000000000148 = 1;
      }
    }
    *(undefined1 *)((long)unaff_x20 + 0xc9) = 0xff;
    *(undefined1 *)((long)unaff_x20 + 0xca) = 0xff;
    uStack00000000000001c8._0_4_ = *(float *)(unaff_x20 + 7);
    if (*(char *)((long)unaff_x20 + 0xc1) == '\0') {
      fVar73 = 0.0;
      fVar44 = 0.0;
      if ((uStack000000000000019c & 1) == 0) {
        fVar73 = *(float *)(unaff_x20 + 0xb) + *(float *)(unaff_x20 + 0xb) +
                 *(float *)(unaff_x20 + 8);
        fVar44 = *(float *)((long)unaff_x20 + 0x5c) + *(float *)((long)unaff_x20 + 0x5c) +
                 *(float *)((long)unaff_x20 + 0x44);
      }
      if ((uStack0000000000000140 & 1) == 0) {
        uStack00000000000001c8._0_4_ =
             fVar74 + (*(float *)(unaff_x20 + 0x42) - *(float *)(unaff_x20 + 0x41));
      }
      fVar54 = *(float *)((long)unaff_x20 + 0x3c) -
               (*(float *)((long)unaff_x20 + 0x6c) + *(float *)((long)unaff_x20 + 0x74));
      if (uStack0000000000000148 == 0) {
        fVar54 = fVar76 + (*(float *)((long)unaff_x20 + 0x214) - *(float *)((long)unaff_x20 + 0x20c)
                          );
      }
      if ((uVar22 >> 0xe & 1) == 0) {
        uVar28 = uVar22 & 8;
        bVar16 = uVar28 == 0 && fVar54 < fVar44;
        *(bool *)((long)unaff_x20 + 0xbd) = bVar16;
        if ((uVar22 >> 0xf & 1) == 0) {
          if (bVar16) goto code_r0x000cb014;
          if (!(fVar73 <= (float)uStack00000000000001c8 - 0.0 || (uVar22 & 8) != 0))
          goto code_r0x000caf38;
code_r0x000cb030:
          uVar32 = 0;
          *(undefined1 *)((long)unaff_x20 + 0xbc) = 0;
        }
        else {
          uVar32 = 1;
          *(undefined1 *)((long)unaff_x20 + 0xbc) = 1;
          if (!bVar16) {
code_r0x000cb048:
            bVar16 = fVar54 < fVar44 && uVar28 == 0;
            *(bool *)((long)unaff_x20 + 0xbd) = bVar16;
            uVar32 = 1;
          }
        }
code_r0x000cb05c:
        if (bVar16) {
          fVar44 = *(float *)(&UNK_0000395c + in_stack_000001b8);
        }
        else {
          fVar44 = 0.0;
        }
        if (uVar32 != 0) goto code_r0x000cb06c;
        fVar73 = 0.0;
      }
      else {
        *(undefined1 *)((long)unaff_x20 + 0xbd) = 1;
        if ((uVar22 >> 0xf & 1) == 0) {
code_r0x000cb014:
          bVar16 = true;
          if (!((float)uStack00000000000001c8 - *(float *)(&UNK_0000395c + in_stack_000001b8) <
                fVar73 && (uVar22 & 8) == 0)) goto code_r0x000cb030;
code_r0x000caf38:
          uVar32 = (uVar22 & 0x800) >> 0xb;
          *(char *)((long)unaff_x20 + 0xbc) = (char)uVar32;
          bVar15 = bVar16;
          if ((uVar22 & 0x800) == 0) {
            bVar15 = true;
          }
          if (!bVar15) {
            uVar28 = 0;
            goto code_r0x000cb048;
          }
          goto code_r0x000cb05c;
        }
        *(undefined1 *)((long)unaff_x20 + 0xbc) = 1;
        fVar44 = *(float *)(&UNK_0000395c + in_stack_000001b8);
code_r0x000cb06c:
        fVar73 = *(float *)(&UNK_0000395c + in_stack_000001b8);
      }
      *(float *)((long)unaff_x20 + 0xb4) = fVar44;
      *(float *)(unaff_x20 + 0x17) = fVar73;
      *(float *)(unaff_x20 + 0xe) = fVar44 + *(float *)(unaff_x20 + 0xe);
      *(float *)((long)unaff_x20 + 0x74) = *(float *)((long)unaff_x20 + 0x74) + fVar73;
      uStack00000000000001c8._0_4_ = *(float *)(unaff_x20 + 7);
    }
    if (uStack0000000000000170 == 0x3000000) {
      bVar12 = true;
    }
    puVar7 = &uStack00000000000001e0;
    if (!bVar12) {
      puVar7 = (ulong *)(lVar29 + 0x248);
    }
    in_stack_000001d8 = puVar7[1];
    uVar71 = *puVar7;
    uStack00000000000001c0._0_4_ = *(float *)(unaff_x20 + 5);
    uStack00000000000001c0._4_4_ = *(float *)((long)unaff_x20 + 0x2c);
    fVar44 = (float)unaff_x20[6];
    fVar73 = (float)uStack00000000000001c0 + fVar44;
    fVar54 = uStack00000000000001c0._4_4_ + (float)((ulong)unaff_x20[6] >> 0x20);
    uStack00000000000001c8._4_4_ = 0.0;
    if ((*(byte *)((long)unaff_x20 + 0x14) & 1) == 0) {
      uStack00000000000001c8._4_4_ =
           *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
      if (unaff_x20[0x6f] != 0) {
        uStack00000000000001c8._4_4_ =
             uStack00000000000001c8._4_4_ * *(float *)(unaff_x20[0x6f] + 0x2a0);
      }
      uStack00000000000001c8._4_4_ =
           uStack00000000000001c8._4_4_ + *(float *)(&UNK_00003928 + *unaff_x20) * 2.0;
    }
    uStack00000000000001c8._0_4_ = (float)uStack00000000000001c0 + (float)uStack00000000000001c8;
    uStack00000000000001c8._4_4_ = uStack00000000000001c0._4_4_ + uStack00000000000001c8._4_4_;
    pfVar37 = (float *)((long)unaff_x20 + 100);
    fVar76 = *pfVar37;
    *(float *)((long)unaff_x20 + 0x1fc) = uStack00000000000001c0._4_4_;
    *(float *)((long)unaff_x20 + 0x204) = fVar54;
    uStack00000000000001d0._0_4_ = (float)uVar71;
    uStack00000000000001d0._4_4_ = (float)(uVar71 >> 0x20);
    fVar74 = (float)uStack00000000000001c0;
    if ((float)uStack00000000000001c0 < (float)uStack00000000000001d0) {
      fVar74 = (float)uStack00000000000001d0;
    }
    fVar66 = uStack00000000000001c0._4_4_;
    if (uStack00000000000001c0._4_4_ < uStack00000000000001d0._4_4_) {
      fVar66 = uStack00000000000001d0._4_4_;
    }
    *(float *)(unaff_x20 + 0x3f) = fVar74;
    *(float *)((long)unaff_x20 + 0x1fc) = fVar66;
    fVar69 = (float)in_stack_000001d8;
    fVar57 = (float)(in_stack_000001d8 >> 0x20);
    unaff_x20[0x40] =
         in_stack_000001d8 ^
         (in_stack_000001d8 ^ CONCAT44(fVar54,fVar73)) &
         CONCAT44(-(uint)(fVar54 < fVar57),-(uint)(fVar73 < fVar69));
    fVar74 = (float)uStack00000000000001c0 + (float)unaff_x20[0xd];
    fVar66 = uStack00000000000001c0._4_4_ + (float)((ulong)unaff_x20[0xd] >> 0x20);
    fVar73 = fVar73 - (float)unaff_x20[0xe];
    fVar54 = fVar54 - (float)((ulong)unaff_x20[0xe] >> 0x20);
    unaff_x20[0x42] = CONCAT44(fVar54,fVar73);
    unaff_x20[0x41] = CONCAT44(fVar66,fVar74);
    pfVar43 = pfVar37;
    if ((uVar22 & 0x401) != 1) {
      pfVar43 = (float *)(&UNK_00003930 + in_stack_000001b8);
    }
    fVar46 = (float)(int)(*(float *)(unaff_x20 + 0xb) * 0.5);
    if ((float)(int)(*(float *)(unaff_x20 + 0xb) * 0.5) < fVar76) {
      fVar46 = fVar76;
    }
    uVar63 = NEON_scvtf(CONCAT44((int)(fVar66 + 0.5 + *pfVar43),(int)(fVar74 + 0.5 + fVar46)),4);
    fVar47 = (float)(uVar63 >> 0x20);
    *(float *)((long)unaff_x20 + 0x21c) = fVar47;
    uVar72 = NEON_scvtf(CONCAT44((int)((fVar54 + 0.5) - fVar76),(int)((fVar73 + 0.5) - fVar46)),4);
    fVar76 = (float)(uVar72 >> 0x20);
    *(float *)((long)unaff_x20 + 0x224) = fVar76;
    uVar68 = uVar63 ^ (uVar63 ^ in_stack_000001d8) &
                      CONCAT44(-(uint)(fVar57 < fVar47),-(uint)(fVar69 < (float)uVar63));
    unaff_x20[0x43] =
         uVar68 ^ (uVar68 ^ uVar71) &
                  CONCAT44(-(uint)(fVar47 < uStack00000000000001d0._4_4_),
                           -(uint)((float)uVar63 < (float)uStack00000000000001d0));
    uVar63 = uVar72 ^ (uVar72 ^ in_stack_000001d8) &
                      CONCAT44(-(uint)(fVar57 < fVar76),-(uint)(fVar69 < (float)uVar72));
    unaff_x20[0x44] =
         uVar63 ^ (uVar63 ^ uVar71) &
                  CONCAT44(-(uint)(fVar76 < uStack00000000000001d0._4_4_),
                           -(uint)((float)uVar72 < (float)uStack00000000000001d0));
    if ((((uVar22 >> 6 & 1) != 0) || (fVar44 <= 0.0)) || ((uVar22 >> 0x19 & 1) != 0)) {
      fVar44 = *(float *)(&UNK_00003d38 + in_stack_000001b8) * 16.0;
    }
    else {
      fVar44 = fVar44 * 0.65;
    }
    *(float *)(unaff_x20 + 0x4f) = (float)(int)fVar44;
    fVar44 = ((float)unaff_x20[8] + (float)unaff_x20[0xb] * 2.0) - (fVar73 - fVar74);
    fVar73 = ((float)((ulong)unaff_x20[8] >> 0x20) + (float)((ulong)unaff_x20[0xb] >> 0x20) * 2.0) -
             (fVar54 - fVar66);
    iVar17 = -(uint)(fVar44 <= 0.0);
    iVar60 = -(uint)(fVar73 <= 0.0);
    *(ulong *)((long)unaff_x20 + 0x94) =
         CONCAT17((byte)((uint)fVar73 >> 0x18) & ~(byte)((uint)iVar60 >> 0x18),
                  CONCAT16((byte)((uint)fVar73 >> 0x10) & ~(byte)((uint)iVar60 >> 0x10),
                           CONCAT15((byte)((uint)fVar73 >> 8) & ~(byte)((uint)iVar60 >> 8),
                                    CONCAT14(SUB41(fVar73,0) & ~(byte)iVar60,
                                             CONCAT13((byte)((uint)fVar44 >> 0x18) &
                                                      ~(byte)((uint)iVar17 >> 0x18),
                                                      CONCAT12((byte)((uint)fVar44 >> 0x10) &
                                                               ~(byte)((uint)iVar17 >> 0x10),
                                                               CONCAT11((byte)((uint)fVar44 >> 8) &
                                                                        ~(byte)((uint)iVar17 >> 8),
                                                                        SUB41(fVar44,0) &
                                                                        ~(byte)iVar17)))))));
    uStack00000000000001d0 = uVar71;
    uVar55 = func_0x000d2840();
    *(undefined4 *)((long)unaff_x20 + 0x8c) = uVar55;
    *(int *)(unaff_x20 + 0x12) = iVar17;
    *(undefined8 *)((long)unaff_x20 + 0x9c) = 0x7f7fffff7f7fffff;
    unaff_x20[0xf] = 0;
    func_0x000f0b5c(unaff_x20[0x55],
                    *(undefined8 *)
                     (*(long *)(*(long *)(&UNK_00003d30 + in_stack_000001b8) + 0x40) + 8));
    lVar30 = *(long *)(lRam0000000000a334c0 + 0x4000);
    *(undefined1 *)(lVar30 + 0xc0) = 1;
    func_0x000f0930(*(undefined8 *)(lVar30 + 0x2a8),&uStack00000000000001d0,
                    (ulong)&uStack00000000000001d0 | 8,0);
    lVar23 = *(long *)(*(long *)(lVar30 + 0x2a8) + 0x60) +
             (long)*(int *)(*(long *)(lVar30 + 0x2a8) + 0x58) * 0x10;
    uVar49 = *(undefined8 *)(lVar23 + -0x10);
    *(undefined8 *)(lVar30 + 0x250) = *(undefined8 *)(lVar23 + -8);
    *(undefined8 *)(lVar30 + 0x248) = uVar49;
    if (bVar12) {
      bVar15 = false;
    }
    else {
      if ((*(int *)(lVar29 + 0x1a0) < 2) ||
         (lVar23 = *(long *)(*(long *)(lVar29 + 0x1a8) + (ulong)(*(int *)(lVar29 + 0x1a0) - 2) * 8),
         lVar23 == 0)) {
        bVar16 = false;
      }
      else {
        bVar16 = false;
        if ((*(float *)((long)unaff_x20 + 0x2c) <
             *(float *)(lVar23 + 0x2c) + *(float *)(lVar23 + 0x34)) &&
           (*(float *)(lVar23 + 0x2c) <
            *(float *)((long)unaff_x20 + 0x2c) + *(float *)((long)unaff_x20 + 0x34))) {
          if (*(float *)(unaff_x20 + 5) < *(float *)(lVar23 + 0x28) + *(float *)(lVar23 + 0x30)) {
            bVar16 = *(float *)(lVar23 + 0x28) <
                     *(float *)(unaff_x20 + 5) + *(float *)(unaff_x20 + 6);
          }
        }
      }
      bVar15 = false;
      if (((*(int *)(*(long *)((int *)unaff_x20[0x55] + 2) + (long)*(int *)unaff_x20[0x55] * 0x38 +
                    -0x18) == 0) && (*(int *)(*(long *)(lVar29 + 0x2a8) + 0x20) != 0)) && (!bVar16))
      {
        unaff_x20[0x55] = *(long *)(lVar29 + 0x2a8);
        bVar15 = true;
      }
    }
    lVar23 = lRam0000000000a334c0;
    lVar30 = *(long *)(&UNK_00004d10 + in_stack_000001b8);
    if (lVar30 == 0) {
      lVar30 = *(long *)(&UNK_00004b18 + in_stack_000001b8);
      if ((uVar40 & 1) != 0) goto code_r0x000cb3f4;
code_r0x000cb408:
      if (lVar30 == 0) {
        bVar16 = false;
      }
      else {
        bVar16 = unaff_x20[0x73] == *(long *)(lVar30 + 0x398);
      }
    }
    else {
      if ((uVar40 & 1) == 0) goto code_r0x000cb408;
code_r0x000cb3f4:
      bVar16 = true;
    }
    pbVar6 = &UNK_000049f8 + lRam0000000000a334c0;
    uVar28 = *(uint *)((long)unaff_x20 + 0x14);
    *(undefined1 *)((long)unaff_x20 + 0xc3) = 0;
    fVar44 = *(float *)(unaff_x20 + 0xc);
    fVar73 = *(float *)((long)unaff_x20 + 100);
    if (*(char *)((long)unaff_x20 + 0xc1) == '\0') {
      if ((uVar28 >> 7 & 1) == 0) {
        lVar30 = 2;
        if ((uVar28 & 0x1000000) != 0) {
          lVar30 = 3;
        }
        if ((uVar28 & 0x6000000) != 0) {
          lVar30 = 4;
        }
        lVar30 = lVar30 * 0x10 + lVar23;
        fVar74 = *(float *)(&UNK_000038e8 + lVar30 + 0xe4);
        fVar76 = *(float *)(&UNK_000038e8 + lVar30 + 0xf0) * *(float *)(&UNK_000038e8 + lVar23);
        fVar54 = 1.0;
        if (fVar74 <= 1.0) {
          fVar54 = fVar74;
        }
        fVar69 = 0.0;
        fVar66 = 0.0;
        if (0.0 <= fVar74) {
          fVar66 = fVar54;
        }
        uVar71 = *(ulong *)(&UNK_000038e8 + lVar30 + 0xe8);
        uVar72 = NEON_fmov(0x3f800000,4);
        fVar54 = (float)(uVar71 >> 0x20);
        uVar72 = uVar72 ^ (uVar72 ^ uVar71) &
                          ~CONCAT44(-(uint)((float)(uVar72 >> 0x20) < fVar54),
                                    -(uint)((float)uVar72 < (float)uVar71));
        iVar17 = -(uint)((float)uVar71 < 0.0);
        iVar60 = -(uint)(fVar54 < 0.0);
        fVar54 = (float)CONCAT13((byte)(uVar72 >> 0x18) & ~(byte)((uint)iVar17 >> 0x18),
                                 CONCAT12((byte)(uVar72 >> 0x10) & ~(byte)((uint)iVar17 >> 0x10),
                                          CONCAT11((byte)(uVar72 >> 8) & ~(byte)((uint)iVar17 >> 8),
                                                   (byte)uVar72 & ~(byte)iVar17)));
        uVar49 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar72 >> 0x38) &
                                                           ~(byte)((uint)iVar60 >> 0x18),
                                                           CONCAT16((byte)(uVar72 >> 0x30) &
                                                                    ~(byte)((uint)iVar60 >> 0x10),
                                                                    CONCAT15((byte)(uVar72 >> 0x28)
                                                                             & ~(byte)((uint)iVar60
                                                                                      >> 8),
                                                                             CONCAT14((byte)(uVar72 
                                                  >> 0x20) & ~(byte)iVar60,fVar54)))) >> 0x20) *
                                          255.0 + 0.5),(int)(fVar54 * 255.0 + 0.5)),_UNK_0080c188,4)
        ;
        uVar22 = (uint)uVar49 | (int)(fVar66 * 255.0 + 0.5) | (uint)((ulong)uVar49 >> 0x20);
        fVar54 = 1.0;
        if (fVar76 <= 1.0) {
          fVar54 = fVar76;
        }
        fVar74 = 0.0;
        if (0.0 <= fVar76) {
          fVar74 = fVar54;
        }
        if ((*pbVar6 >> 6 & 1) == 0) {
          uVar22 = uVar22 | (int)(fVar74 * 255.0 + 0.5) << 0x18;
          lVar30 = unaff_x20[0x55];
          if ((uVar28 & 1) == 0) goto code_r0x000cb67c;
code_r0x000cb54c:
          uVar49 = 0;
        }
        else {
          fVar74 = *(float *)(&UNK_00004a58 + lVar23);
          fVar54 = 1.0;
          if (fVar74 <= 1.0) {
            fVar54 = fVar74;
          }
          fVar76 = 0.0;
          if (0.0 <= fVar74) {
            fVar76 = fVar54;
          }
          uVar22 = uVar22 & 0xffffff | (int)(fVar76 * 255.0 + 0.5) << 0x18;
          lVar30 = unaff_x20[0x55];
          if ((uVar28 & 1) != 0) goto code_r0x000cb54c;
code_r0x000cb67c:
          fVar69 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
          if (unaff_x20[0x6f] != 0) {
            fVar69 = fVar69 * *(float *)(unaff_x20[0x6f] + 0x2a0);
          }
          fVar69 = fVar69 + *(float *)(&UNK_00003928 + *unaff_x20) * 2.0;
          uVar49 = 0xc0;
        }
        fVar54 = *(float *)((long)unaff_x20 + 0x2c);
        lVar31 = unaff_x20[5];
        *(float *)(unaff_x29 + -0xd8) = *(float *)(unaff_x20 + 5) + 0.0;
        *(float *)(unaff_x29 + -0xd4) = fVar69 + fVar54;
        *(ulong *)(unaff_x29 + -0xe8) =
             CONCAT44((float)((ulong)lVar31 >> 0x20) + (float)((ulong)unaff_x20[6] >> 0x20),
                      (float)lVar31 + (float)unaff_x20[6]);
        func_0x000f3bb0(fVar44,lVar30,unaff_x29 + -0xd8,unaff_x29 + -0xe8,uVar22,uVar49);
      }
      if ((uVar28 & 1) == 0) {
        lVar30 = 0xb0;
        if (!bVar16) {
          lVar30 = 0xa0;
        }
        lVar30 = lRam0000000000a334c0 + lVar30;
        fVar74 = *(float *)(&UNK_000038e8 + lVar30 + 0xe4);
        fVar76 = *(float *)(&UNK_000038e8 + lVar30 + 0xe8);
        fVar66 = *(float *)(&UNK_000038e8 + lVar30 + 0xec);
        fVar54 = 1.0;
        if (fVar74 <= 1.0) {
          fVar54 = fVar74;
        }
        fVar69 = 0.0;
        if (0.0 <= fVar74) {
          fVar69 = fVar54;
        }
        fVar74 = *(float *)(&UNK_000038e8 + lVar30 + 0xf0) *
                 *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
        fVar54 = 1.0;
        if (fVar76 <= 1.0) {
          fVar54 = fVar76;
        }
        fVar57 = 0.0;
        if (0.0 <= fVar76) {
          fVar57 = fVar54;
        }
        iVar17 = -(uint)(fVar66 < 0.0);
        iVar60 = -(uint)(fVar74 < 0.0);
        uVar71 = NEON_fmov(0x3f800000,4);
        uVar71 = uVar71 ^ (uVar71 ^ CONCAT44(fVar74,fVar66)) &
                          ~CONCAT44(-(uint)((float)(uVar71 >> 0x20) < fVar74),
                                    -(uint)((float)uVar71 < fVar66));
        fVar54 = (float)CONCAT13((byte)(uVar71 >> 0x18) & ~(byte)((uint)iVar17 >> 0x18),
                                 CONCAT12((byte)(uVar71 >> 0x10) & ~(byte)((uint)iVar17 >> 0x10),
                                          CONCAT11((byte)(uVar71 >> 8) & ~(byte)((uint)iVar17 >> 8),
                                                   (byte)uVar71 & ~(byte)iVar17)));
        uVar49 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar71 >> 0x38) &
                                                           ~(byte)((uint)iVar60 >> 0x18),
                                                           CONCAT16((byte)(uVar71 >> 0x30) &
                                                                    ~(byte)((uint)iVar60 >> 0x10),
                                                                    CONCAT15((byte)(uVar71 >> 0x28)
                                                                             & ~(byte)((uint)iVar60
                                                                                      >> 8),
                                                                             CONCAT14((byte)(uVar71 
                                                  >> 0x20) & ~(byte)iVar60,fVar54)))) >> 0x20) *
                                          255.0 + 0.5),(int)(fVar54 * 255.0 + 0.5)),_UNK_0080c190,4)
        ;
        func_0x000f3bb0(fVar44,unaff_x20[0x55],&uStack00000000000001c0,&uStack00000000000001c8,
                        (int)(fVar69 * 255.0 + 0.5) | (int)(fVar57 * 255.0 + 0.5) << 8 |
                        (uint)uVar49 | (uint)((ulong)uVar49 >> 0x20),0x30);
      }
      if ((uVar28 >> 10 & 1) != 0) {
        fVar74 = 0.0;
        fVar54 = 0.0;
        if ((*(uint *)((long)unaff_x20 + 0x14) & 1) == 0) {
          fVar54 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
          if (unaff_x20[0x6f] != 0) {
            fVar54 = fVar54 * *(float *)(unaff_x20[0x6f] + 0x2a0);
          }
          fVar54 = fVar54 + *(float *)(&UNK_00003928 + *unaff_x20) * 2.0;
        }
        fVar66 = *(float *)(unaff_x20 + 5);
        fVar76 = *(float *)((long)unaff_x20 + 0x2c);
        if ((*(uint *)((long)unaff_x20 + 0x14) >> 10 & 1) != 0) {
          fVar74 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
          if (unaff_x20[0x6f] != 0) {
            fVar74 = fVar74 * *(float *)(unaff_x20[0x6f] + 0x2a0);
          }
          fVar74 = *(float *)(unaff_x20 + 0x2f) + fVar74 +
                   *(float *)(&UNK_00003928 + *unaff_x20) * 2.0;
        }
        fVar54 = fVar76 + fVar54;
        fVar57 = fVar76 + *(float *)((long)unaff_x20 + 0x34);
        fVar69 = fVar54;
        if (fVar54 < fVar76) {
          fVar69 = fVar76;
        }
        fVar76 = fVar66 + *(float *)(unaff_x20 + 7);
        if (fVar66 + *(float *)(unaff_x20 + 6) <= fVar66 + *(float *)(unaff_x20 + 7)) {
          fVar76 = fVar66 + *(float *)(unaff_x20 + 6);
        }
        fVar46 = fVar54 + fVar74;
        if (fVar57 <= fVar54 + fVar74) {
          fVar46 = fVar57;
        }
        lVar30 = unaff_x20[0x55];
        *(float *)(unaff_x29 + -0xd8) = fVar73 + fVar66;
        *(float *)(unaff_x29 + -0xd4) = fVar69 + 0.0;
        *(float *)(unaff_x29 + -0xe8) = fVar76 - fVar73;
        *(float *)(unaff_x29 + -0xe4) = fVar46;
        uVar49 = _UNK_0080c190;
        fVar74 = *(float *)(&UNK_00003a9c + lRam0000000000a334c0);
        fVar69 = *(float *)(&UNK_00003aa0 + lRam0000000000a334c0);
        fVar54 = 1.0;
        if (fVar74 <= 1.0) {
          fVar54 = fVar74;
        }
        fVar57 = 0.0;
        if (0.0 <= fVar74) {
          fVar57 = fVar54;
        }
        fVar74 = *(float *)(&UNK_00003aa8 + lRam0000000000a334c0) *
                 *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
        fVar47 = *(float *)(&UNK_00003aa4 + lRam0000000000a334c0);
        fVar54 = 1.0;
        if (fVar69 <= 1.0) {
          fVar54 = fVar69;
        }
        fVar67 = 0.0;
        if (0.0 <= fVar69) {
          fVar67 = fVar54;
        }
        iVar17 = -(uint)(fVar47 < 0.0);
        iVar60 = -(uint)(fVar74 < 0.0);
        uVar72 = NEON_fmov(0x3f800000,4);
        fVar69 = (float)(uVar72 >> 0x20);
        uVar71 = CONCAT44(fVar74,fVar47) ^
                 (CONCAT44(fVar74,fVar47) ^ uVar72) &
                 CONCAT44(-(uint)(fVar69 < fVar74),-(uint)((float)uVar72 < fVar47));
        fVar54 = (float)CONCAT13((byte)(uVar71 >> 0x18) & ~(byte)((uint)iVar17 >> 0x18),
                                 CONCAT12((byte)(uVar71 >> 0x10) & ~(byte)((uint)iVar17 >> 0x10),
                                          CONCAT11((byte)(uVar71 >> 8) & ~(byte)((uint)iVar17 >> 8),
                                                   (byte)uVar71 & ~(byte)iVar17)));
        uVar50 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar71 >> 0x38) &
                                                           ~(byte)((uint)iVar60 >> 0x18),
                                                           CONCAT16((byte)(uVar71 >> 0x30) &
                                                                    ~(byte)((uint)iVar60 >> 0x10),
                                                                    CONCAT15((byte)(uVar71 >> 0x28)
                                                                             & ~(byte)((uint)iVar60
                                                                                      >> 8),
                                                                             CONCAT14((byte)(uVar71 
                                                  >> 0x20) & ~(byte)iVar60,fVar54)))) >> 0x20) *
                                          255.0 + 0.5),(int)(fVar54 * 255.0 + 0.5)),_UNK_0080c190,4)
        ;
        fVar54 = 0.0;
        if ((uVar28 & 1) != 0) {
          fVar54 = fVar44;
        }
        func_0x000f3bb0(fVar54,lVar30,unaff_x29 + -0xd8,unaff_x29 + -0xe8,
                        (int)(fVar57 * 255.0 + 0.5) | (int)(fVar67 * 255.0 + 0.5) << 8 |
                        (uint)uVar50 | (uint)((ulong)uVar50 >> 0x20),0x30);
        if ((0.0 < *(float *)(&UNK_00003930 + lVar23)) &&
           (fVar46 < *(float *)((long)unaff_x20 + 0x2c) + *(float *)((long)unaff_x20 + 0x34))) {
          lVar23 = unaff_x20[0x55];
          *(float *)(unaff_x29 + -0xd8) = fVar66;
          *(float *)(unaff_x29 + -0xd4) = fVar46;
          *(float *)(unaff_x29 + -0xe8) = fVar76;
          *(float *)(unaff_x29 + -0xe4) = fVar46;
          fVar74 = *(float *)(&UNK_00003a1c + lRam0000000000a334c0);
          fVar76 = *(float *)(&UNK_00003a20 + lRam0000000000a334c0);
          fVar66 = *(float *)(&UNK_00003a28 + lRam0000000000a334c0) *
                   *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
          fVar54 = 1.0;
          if (fVar74 <= 1.0) {
            fVar54 = fVar74;
          }
          fVar57 = 0.0;
          if (0.0 <= fVar74) {
            fVar57 = fVar54;
          }
          fVar74 = *(float *)(&UNK_00003a24 + lRam0000000000a334c0);
          fVar54 = 1.0;
          if (fVar76 <= 1.0) {
            fVar54 = fVar76;
          }
          fVar46 = 0.0;
          if (0.0 <= fVar76) {
            fVar46 = fVar54;
          }
          iVar17 = -(uint)(fVar74 < 0.0);
          iVar60 = -(uint)(fVar66 < 0.0);
          uVar71 = CONCAT44(fVar66,fVar74) ^
                   (CONCAT44(fVar66,fVar74) ^ uVar72) &
                   CONCAT44(-(uint)(fVar69 < fVar66),-(uint)((float)uVar72 < fVar74));
          fVar54 = (float)CONCAT13((byte)(uVar71 >> 0x18) & ~(byte)((uint)iVar17 >> 0x18),
                                   CONCAT12((byte)(uVar71 >> 0x10) & ~(byte)((uint)iVar17 >> 0x10),
                                            CONCAT11((byte)(uVar71 >> 8) &
                                                     ~(byte)((uint)iVar17 >> 8),
                                                     (byte)uVar71 & ~(byte)iVar17)));
          uVar49 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar71 >> 0x38) &
                                                             ~(byte)((uint)iVar60 >> 0x18),
                                                             CONCAT16((byte)(uVar71 >> 0x30) &
                                                                      ~(byte)((uint)iVar60 >> 0x10),
                                                                      CONCAT15((byte)(uVar71 >> 0x28
                                                                                     ) & ~(byte)((
                                                  uint)iVar60 >> 8),
                                                  CONCAT14((byte)(uVar71 >> 0x20) & ~(byte)iVar60,
                                                           fVar54)))) >> 0x20) * 255.0 + 0.5),
                                      (int)(fVar54 * 255.0 + 0.5)),uVar49,4);
          func_0x000f397c(lVar23,unaff_x29 + -0xd8,unaff_x29 + -0xe8,
                          (int)(fVar57 * 255.0 + 0.5) | (int)(fVar46 * 255.0 + 0.5) << 8 |
                          (uint)uVar49 | (uint)((ulong)uVar49 >> 0x20));
        }
      }
      if (*(char *)((long)unaff_x20 + 0xbc) != '\0') {
        func_0x0010c5f4(0);
      }
      if (*(char *)((long)unaff_x20 + 0xbd) != '\0') {
        func_0x0010c5f4(1);
      }
      if ((uStack000000000000013c != 0) && ((uVar28 >> 1 & 1) == 0)) {
        uVar71 = 0;
        pfVar43 = (float *)&UNK_0080c9ec;
        do {
          uVar28 = *(uint *)(unaff_x29 + -0xb0 + uVar71 * 4);
          if ((uVar28 & 0xff000000) != 0) {
            fVar66 = *(float *)(unaff_x20 + 5);
            fVar69 = *(float *)((long)unaff_x20 + 0x2c);
            fVar57 = *(float *)(unaff_x20 + 6);
            fVar76 = *(float *)((long)unaff_x20 + 0x34);
            fVar47 = pfVar43[-3];
            fVar46 = pfVar43[-2];
            lVar23 = unaff_x20[0x55];
            fVar54 = (float)(int)fVar56;
            fVar74 = fVar73;
            if ((uVar71 & 1) != 0) {
              fVar54 = fVar73;
              fVar74 = (float)(int)fVar56;
            }
            fVar67 = pfVar43[-1];
            fVar70 = *pfVar43;
            piVar42 = (int *)(lVar23 + 0x78);
            iVar17 = *piVar42;
            if (iVar17 == *(int *)(lVar23 + 0x7c)) {
              iVar60 = iVar17;
              if (iVar17 < 0) {
                iVar60 = iVar17 + 1;
              }
              iVar21 = 8;
              if (iVar17 != 0) {
                iVar21 = iVar17 + (iVar60 >> 1);
              }
              if (iVar21 <= iVar17 + 1) {
                iVar21 = iVar17 + 1;
              }
              func_0x000cef5c(piVar42,iVar21);
              iVar17 = *piVar42;
            }
            fVar66 = fVar66 + fVar47 * ((fVar66 + fVar57) - fVar66);
            fVar69 = fVar69 + fVar46 * ((fVar69 + fVar76) - fVar69);
            pfVar1 = (float *)(*(long *)(lVar23 + 0x80) + (long)iVar17 * 8);
            *pfVar1 = fVar66 + fVar54 * fVar67;
            pfVar1[1] = fVar69 + fVar74 * fVar70;
            *(int *)(lVar23 + 0x78) = *(int *)(lVar23 + 0x78) + 1;
            lVar23 = unaff_x20[0x55];
            piVar42 = (int *)(lVar23 + 0x78);
            iVar17 = *piVar42;
            if (iVar17 == *(int *)(lVar23 + 0x7c)) {
              iVar60 = iVar17;
              if (iVar17 < 0) {
                iVar60 = iVar17 + 1;
              }
              iVar21 = 8;
              if (iVar17 != 0) {
                iVar21 = iVar17 + (iVar60 >> 1);
              }
              if (iVar21 <= iVar17 + 1) {
                iVar21 = iVar17 + 1;
              }
              func_0x000cef5c(piVar42,iVar21);
              iVar17 = *piVar42;
            }
            pfVar1 = (float *)(*(long *)(lVar23 + 0x80) + (long)iVar17 * 8);
            *pfVar1 = fVar66 + fVar74 * fVar67;
            pfVar1[1] = fVar69 + fVar54 * fVar70;
            *(int *)(lVar23 + 0x78) = *(int *)(lVar23 + 0x78) + 1;
            lVar23 = unaff_x20[0x55];
            *(float *)(unaff_x29 + -0xd8) = fVar66 + (fVar44 + fVar73) * fVar67;
            *(float *)(unaff_x29 + -0xd4) = fVar69 + (fVar44 + fVar73) * fVar70;
            func_0x000f23c0(fVar44,lVar23,unaff_x29 + -0xd8,pfVar43[1],pfVar43[2]);
            lVar23 = unaff_x20[0x55];
            func_0x000f1888(lVar23,*(undefined8 *)(lVar23 + 0x80),*(undefined4 *)(lVar23 + 0x78),
                            uVar28);
            *(undefined4 *)(lVar23 + 0x78) = 0;
          }
          uVar71 = uVar71 + 1;
          pfVar43 = pfVar43 + 6;
        } while (uStack000000000000013c != uVar71);
      }
      lVar23 = lRam0000000000a334c0;
      fVar76 = *pfVar37;
      fVar73 = *(float *)(&UNK_00003a1c + lRam0000000000a334c0);
      fVar54 = *(float *)(&UNK_00003a20 + lRam0000000000a334c0);
      fVar56 = *(float *)(&UNK_00003a24 + lRam0000000000a334c0);
      fVar74 = *(float *)(&UNK_00003a28 + lRam0000000000a334c0) *
               *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
      fVar44 = 1.0;
      if (fVar73 <= 1.0) {
        fVar44 = fVar73;
      }
      fVar66 = 0.0;
      if (0.0 <= fVar73) {
        fVar66 = fVar44;
      }
      fVar44 = 1.0;
      if (fVar54 <= 1.0) {
        fVar44 = fVar54;
      }
      fVar73 = 0.0;
      if (0.0 <= fVar54) {
        fVar73 = fVar44;
      }
      fVar44 = 1.0;
      if (fVar56 <= 1.0) {
        fVar44 = fVar56;
      }
      fVar54 = 0.0;
      if (0.0 <= fVar56) {
        fVar54 = fVar44;
      }
      fVar44 = 1.0;
      if (fVar74 <= 1.0) {
        fVar44 = fVar74;
      }
      fVar56 = 0.0;
      if (0.0 <= fVar74) {
        fVar56 = fVar44;
      }
      uVar28 = (int)(fVar66 * 255.0 + 0.5) | (int)(fVar73 * 255.0 + 0.5) << 8 |
               (int)(fVar54 * 255.0 + 0.5) << 0x10 | (int)(fVar56 * 255.0 + 0.5) << 0x18;
      if (0.0 < fVar76) {
        if (*(char *)((long)unaff_x20 + 0x14) < '\0') {
          uVar22 = *(uint *)(unaff_x20 + 3);
          if ((uVar22 >> 2 & 1) != 0) {
            fVar54 = *(float *)(unaff_x20 + 0xc);
            fVar44 = *(float *)(unaff_x20 + 5) + *(float *)(unaff_x20 + 6) + -1.0;
            fVar73 = fVar54 + *(float *)((long)unaff_x20 + 0x2c);
            lVar30 = unaff_x20[0x55];
            fVar56 = ((*(float *)((long)unaff_x20 + 0x2c) + *(float *)((long)unaff_x20 + 0x34) +
                      -1.0) - fVar54) - fVar73;
            fVar44 = (fVar44 + (fVar44 - fVar44) + 0.5) - fVar54;
            *(float *)(unaff_x29 + -0xd8) = fVar44;
            *(float *)(unaff_x29 + -0xd4) = fVar54 * 0.0 + fVar73 + fVar56 * 0.0 + 0.5;
            func_0x000f249c(fVar54,0xbf490fdb,0,lVar30,unaff_x29 + -0xd8,0);
            lVar30 = unaff_x20[0x55];
            *(float *)(unaff_x29 + -0xd8) = fVar44;
            *(float *)(unaff_x29 + -0xd4) = fVar54 * 0.0 + fVar73 + fVar56 + 0.5;
            func_0x000f249c(fVar54,0,0x3f490fdb,lVar30,unaff_x29 + -0xd8,0);
            lVar30 = unaff_x20[0x55];
            func_0x000f0ff4(fVar76,lVar30,*(undefined8 *)(lVar30 + 0x80),
                            *(undefined4 *)(lVar30 + 0x78),uVar28,0);
            *(undefined4 *)(lVar30 + 0x78) = 0;
            uVar22 = *(uint *)(unaff_x20 + 3);
          }
          if ((uVar22 >> 3 & 1) != 0) {
            fVar54 = *(float *)(unaff_x20 + 0xc);
            fVar44 = *(float *)((long)unaff_x20 + 0x2c) + *(float *)((long)unaff_x20 + 0x34) + -1.0;
            fVar73 = fVar54 + *(float *)(unaff_x20 + 5);
            lVar30 = unaff_x20[0x55];
            fVar56 = ((*(float *)(unaff_x20 + 5) + *(float *)(unaff_x20 + 6) + -1.0) - fVar54) -
                     fVar73;
            fVar44 = (fVar44 + (fVar44 - fVar44) + 0.5) - fVar54;
            *(float *)(unaff_x29 + -0xd8) = fVar54 * 0.0 + fVar73 + fVar56 + 0.5;
            *(float *)(unaff_x29 + -0xd4) = fVar44;
            func_0x000f249c(fVar54,0x3f490fdb,0x3fc90fdb,lVar30,unaff_x29 + -0xd8,0);
            lVar30 = unaff_x20[0x55];
            *(float *)(unaff_x29 + -0xd8) = fVar54 * 0.0 + fVar73 + fVar56 * 0.0 + 0.5;
            *(float *)(unaff_x29 + -0xd4) = fVar44;
            func_0x000f249c(fVar54,0x3fc90fdb,0x4016cbe4,lVar30,unaff_x29 + -0xd8,0);
            lVar30 = unaff_x20[0x55];
            func_0x000f0ff4(fVar76,lVar30,*(undefined8 *)(lVar30 + 0x80),
                            *(undefined4 *)(lVar30 + 0x78),uVar28,0);
            *(undefined4 *)(lVar30 + 0x78) = 0;
          }
        }
        else {
          lVar30 = unaff_x20[0x55];
          *(ulong *)(unaff_x29 + -0xd8) =
               CONCAT44((float)((ulong)unaff_x20[5] >> 0x20) + (float)((ulong)unaff_x20[6] >> 0x20),
                        (float)unaff_x20[5] + (float)unaff_x20[6]);
          func_0x000f3af4((int)unaff_x20[0xc],fVar76,lVar30,pfStack0000000000000108,
                          unaff_x29 + -0xd8,uVar28,0);
        }
      }
      bVar10 = *(byte *)((long)unaff_x20 + 0xca);
      if ((*(byte *)((long)unaff_x20 + 0xc9) == 0xff) && (bVar10 == 0xff)) {
        fVar44 = *(float *)(&UNK_00003930 + lVar23);
      }
      else {
        bVar27 = *(byte *)((long)unaff_x20 + 0xc9);
        if (bVar10 != 0xff) {
          bVar27 = bVar10;
        }
        lVar30 = 0x1c0;
        if (bVar10 != 0xff) {
          lVar30 = 0x1d0;
        }
        lVar30 = lVar30 + lRam0000000000a334c0;
        fVar73 = *(float *)(&UNK_000038e8 + lVar30 + 0xe4);
        fVar54 = *(float *)(&UNK_000038e8 + lVar30 + 0xe8);
        fVar56 = *(float *)(&UNK_000038e8 + lVar30 + 0xec);
        fVar74 = *(float *)(&UNK_000038e8 + lVar30 + 0xf0) *
                 *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
        fVar44 = 1.0;
        if (fVar73 <= 1.0) {
          fVar44 = fVar73;
        }
        fVar69 = 0.0;
        fVar66 = 0.0;
        if (0.0 <= fVar73) {
          fVar66 = fVar44;
        }
        fVar44 = 1.0;
        if (fVar54 <= 1.0) {
          fVar44 = fVar54;
        }
        fVar73 = 0.0;
        if (0.0 <= fVar54) {
          fVar73 = fVar44;
        }
        fVar44 = 1.0;
        if (fVar56 <= 1.0) {
          fVar44 = fVar56;
        }
        fVar54 = 0.0;
        if (0.0 <= fVar56) {
          fVar54 = fVar44;
        }
        fVar44 = 1.0;
        if (fVar74 <= 1.0) {
          fVar44 = fVar74;
        }
        fVar56 = 0.0;
        if (0.0 <= fVar74) {
          fVar56 = fVar44;
        }
        fVar74 = *(float *)(unaff_x20 + 0xc);
        fVar44 = 2.0;
        if (2.0 < *(float *)((long)unaff_x20 + 100)) {
          fVar44 = *(float *)((long)unaff_x20 + 100);
        }
        fVar47 = 0.0;
        fVar57 = 0.0;
        fVar46 = 0.0;
        if (bVar27 < 4) {
          fVar57 = *(float *)(unaff_x20 + 5);
          fVar46 = *(float *)((long)unaff_x20 + 0x2c);
          fVar47 = fVar57 + *(float *)(unaff_x20 + 6) + -1.0;
          fVar69 = fVar46 + *(float *)((long)unaff_x20 + 0x34) + -1.0;
          switch(bVar27) {
          case 0:
            fVar46 = fVar74 + fVar46;
            fVar47 = fVar57 + 0.0;
            fVar69 = fVar69 - fVar74;
            break;
          case 1:
            fVar46 = fVar74 + fVar46;
            fVar69 = fVar69 - fVar74;
            fVar57 = fVar47;
            break;
          case 2:
            fVar47 = fVar47 - fVar74;
            fVar69 = fVar46 + 0.0;
            fVar57 = fVar74 + fVar57;
            break;
          case 3:
            fVar47 = fVar47 - fVar74;
            fVar57 = fVar74 + fVar57;
            fVar46 = fVar69;
          }
        }
        lVar30 = (long)(int)(char)bVar27 * 0x1c;
        lVar31 = unaff_x20[0x55];
        fVar67 = *(float *)(&UNK_0080ca4c + lVar30);
        fVar70 = *(float *)(&UNK_0080ca40 + lVar30);
        fVar65 = *(float *)(&UNK_0080ca44 + lVar30);
        *(float *)(unaff_x29 + -0xd8) =
             fVar57 + *(float *)(&UNK_0080ca48 + lVar30) * (fVar47 - fVar57) + 0.5 + fVar74 * fVar70
        ;
        *(float *)(unaff_x29 + -0xd4) = fVar46 + fVar67 * (fVar69 - fVar46) + 0.5 + fVar74 * fVar65;
        fVar75 = *(float *)(&UNK_0080ca58 + lVar30);
        func_0x000f249c(fVar74,fVar75 + -0.7853982,fVar75,lVar31,unaff_x29 + -0xd8,0);
        lVar31 = unaff_x20[0x55];
        lVar30 = (long)(int)(char)bVar27 * 0x1c;
        fVar67 = *(float *)(&UNK_0080ca54 + lVar30);
        *(float *)(unaff_x29 + -0xd8) =
             fVar74 * fVar70 + fVar57 + *(float *)(&UNK_0080ca50 + lVar30) * (fVar47 - fVar57) + 0.5
        ;
        *(float *)(unaff_x29 + -0xd4) = fVar74 * fVar65 + fVar46 + fVar67 * (fVar69 - fVar46) + 0.5;
        func_0x000f249c(fVar74,fVar75,fVar75 + 0.7853982,lVar31,unaff_x29 + -0xd8,0);
        lVar30 = unaff_x20[0x55];
        func_0x000f0ff4(fVar44,lVar30,*(undefined8 *)(lVar30 + 0x80),*(undefined4 *)(lVar30 + 0x78),
                        (int)(fVar66 * 255.0 + 0.5) | (int)(fVar73 * 255.0 + 0.5) << 8 |
                        (int)(fVar54 * 255.0 + 0.5) << 0x10 | (int)(fVar56 * 255.0 + 0.5) << 0x18,0)
        ;
        *(undefined4 *)(lVar30 + 0x78) = 0;
        fVar44 = *(float *)(&UNK_00003930 + lVar23);
      }
      if ((0.0 < fVar44) && ((*(byte *)((long)unaff_x20 + 0x14) & 1) == 0)) {
        fVar44 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
        if (unaff_x20[0x6f] != 0) {
          fVar44 = fVar44 * *(float *)(unaff_x20[0x6f] + 0x2a0);
        }
        fVar44 = *(float *)((long)unaff_x20 + 0x2c) +
                 fVar44 + *(float *)(&UNK_00003928 + *unaff_x20) * 2.0 + -1.0;
        lVar23 = unaff_x20[0x55];
        fVar73 = *(float *)(unaff_x20 + 5);
        *(float *)(unaff_x29 + -0xd8) = fVar76 + fVar73;
        *(float *)(unaff_x29 + -0xd4) = fVar44;
        *(float *)(unaff_x29 + -0xe8) = (fVar73 + *(float *)(unaff_x20 + 6)) - fVar76;
        *(float *)(unaff_x29 + -0xe4) = fVar44;
        func_0x000f397c(lVar23,unaff_x29 + -0xd8,unaff_x29 + -0xe8,uVar28);
      }
    }
    else {
      uVar55 = *(undefined4 *)(&UNK_00003930 + lVar23);
      *(float *)(&UNK_00003930 + lVar23) = fVar73;
      if (bVar16) {
        lVar30 = 0xb;
        if ((&UNK_00004b7a)[lVar23] != '\0') {
          lVar30 = 0xc;
        }
      }
      else {
        lVar30 = 0xc;
      }
      lVar30 = lVar30 * 0x10 + lVar23;
      fVar54 = *(float *)(&UNK_000038e8 + lVar30 + 0xe4);
      fVar56 = *(float *)(&UNK_000038e8 + lVar30 + 0xe8);
      fVar73 = 1.0;
      if (fVar54 <= 1.0) {
        fVar73 = fVar54;
      }
      fVar74 = 0.0;
      if (0.0 <= fVar54) {
        fVar74 = fVar73;
      }
      fVar54 = *(float *)(&UNK_000038e8 + lVar30 + 0xec);
      fVar73 = 1.0;
      if (fVar56 <= 1.0) {
        fVar73 = fVar56;
      }
      fVar76 = 0.0;
      if (0.0 <= fVar56) {
        fVar76 = fVar73;
      }
      fVar73 = *(float *)(&UNK_000038e8 + lVar30 + 0xf0) * *(float *)(&UNK_000038e8 + lVar23);
      iVar17 = -(uint)(fVar54 < 0.0);
      iVar60 = -(uint)(fVar73 < 0.0);
      uVar71 = NEON_fmov(0x3f800000,4);
      uVar71 = uVar71 ^ (uVar71 ^ CONCAT44(fVar73,fVar54)) &
                        ~CONCAT44(-(uint)((float)(uVar71 >> 0x20) < fVar73),
                                  -(uint)((float)uVar71 < fVar54));
      fVar73 = (float)CONCAT13((byte)(uVar71 >> 0x18) & ~(byte)((uint)iVar17 >> 0x18),
                               CONCAT12((byte)(uVar71 >> 0x10) & ~(byte)((uint)iVar17 >> 0x10),
                                        CONCAT11((byte)(uVar71 >> 8) & ~(byte)((uint)iVar17 >> 8),
                                                 (byte)uVar71 & ~(byte)iVar17)));
      uVar49 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar71 >> 0x38) &
                                                         ~(byte)((uint)iVar60 >> 0x18),
                                                         CONCAT16((byte)(uVar71 >> 0x30) &
                                                                  ~(byte)((uint)iVar60 >> 0x10),
                                                                  CONCAT15((byte)(uVar71 >> 0x28) &
                                                                           ~(byte)((uint)iVar60 >> 8
                                                                                  ),CONCAT14((byte)(
                                                  uVar71 >> 0x20) & ~(byte)iVar60,fVar73)))) >> 0x20
                                               ) * 255.0 + 0.5),(int)(fVar73 * 255.0 + 0.5)),
                         _UNK_0080c190,4);
      func_0x000bcf14((float)uStack00000000000001c0,uStack00000000000001c0._4_4_,
                      (float)uStack00000000000001c8,uStack00000000000001c8._4_4_,fVar44,
                      (int)(fVar74 * 255.0 + 0.5) | (int)(fVar76 * 255.0 + 0.5) << 8 | (uint)uVar49
                      | (uint)((ulong)uVar49 >> 0x20),1);
      *(undefined4 *)(&UNK_00003930 + lVar23) = uVar55;
    }
    if (bVar15) {
      unaff_x20[0x55] = (long)(unaff_x20 + 0x56);
      fVar44 = *(float *)(unaff_x20 + 10);
      if (fVar44 != 0.0) goto code_r0x000cc300;
code_r0x000cc264:
      fVar73 = 0.0;
      if ((uStack00000000000001b4 & 0x808) == 0x800) {
        fVar73 = *pfVar2;
      }
      fVar54 = (*(float *)(unaff_x20 + 6) + *(float *)(unaff_x20 + 0xb) * -2.0) -
               (*(float *)(unaff_x20 + 0xd) + *(float *)(unaff_x20 + 0xe));
      if (fVar73 < fVar54) {
        fVar73 = fVar54;
      }
      fVar54 = *(float *)((long)unaff_x20 + 0x54);
      if (fVar54 != 0.0) goto code_r0x000cc30c;
code_r0x000cc2b4:
      fVar56 = 0.0;
      if ((uStack00000000000001b4 >> 3 & 1) == 0) {
        fVar56 = *(float *)((long)unaff_x20 + 0x44);
      }
      fVar76 = *(float *)((long)unaff_x20 + 0x5c);
      fVar74 = *(float *)((long)unaff_x20 + 0x6c);
      fVar66 = (*(float *)((long)unaff_x20 + 0x34) + fVar76 * -2.0) -
               (fVar74 + *(float *)((long)unaff_x20 + 0x74));
      if (fVar56 < fVar66) {
        fVar56 = fVar66;
      }
    }
    else {
      fVar44 = *(float *)(unaff_x20 + 10);
      if (fVar44 == 0.0) goto code_r0x000cc264;
code_r0x000cc300:
      fVar54 = *(float *)((long)unaff_x20 + 0x54);
      fVar73 = fVar44;
      if (fVar54 == 0.0) goto code_r0x000cc2b4;
code_r0x000cc30c:
      fVar76 = *(float *)((long)unaff_x20 + 0x5c);
      fVar74 = *(float *)((long)unaff_x20 + 0x6c);
      fVar56 = fVar54;
    }
    fVar69 = *(float *)(unaff_x20 + 0xb);
    fVar57 = (float)*(undefined8 *)((long)unaff_x20 + 0x8c);
    fVar46 = (float)((ulong)*(undefined8 *)((long)unaff_x20 + 0x8c) >> 0x20);
    fVar66 = *(float *)((long)unaff_x20 + 100);
    uVar71 = CONCAT44(fVar76,fVar69) ^
             (CONCAT44(fVar76,fVar69) ^ CONCAT44(fVar66,fVar66)) &
             ~CONCAT44(-(uint)(fVar66 <= fVar76),-(uint)(fVar66 <= fVar69));
    lVar23 = NEON_scvtf(CONCAT44((int)(((float)((ulong)unaff_x20[0x41] >> 0x20) - fVar46) +
                                      (float)(uVar71 >> 0x20)),
                                 (int)(((float)unaff_x20[0x41] - fVar57) + (float)uVar71)),4);
    unaff_x20[0x45] = lVar23;
    unaff_x20[0x46] = CONCAT44(fVar56 + (float)((ulong)lVar23 >> 0x20),fVar73 + (float)lVar23);
    unaff_x20[0x48] = unaff_x20[0x46];
    unaff_x20[0x47] = unaff_x20[0x45];
    fVar73 = *(float *)(unaff_x20 + 0xd);
    fVar66 = fVar73 + fVar69 + (*(float *)(unaff_x20 + 5) - fVar57);
    *(float *)(unaff_x20 + 0x4b) = fVar66;
    fVar56 = fVar74 + fVar76 + (*(float *)((long)unaff_x20 + 0x2c) - fVar46);
    *(float *)((long)unaff_x20 + 0x25c) = fVar56;
    if (fVar44 == 0.0) {
      *(float *)(unaff_x20 + 0x4c) =
           fVar66 + ((*(float *)(unaff_x20 + 6) + fVar69 * -2.0) -
                    (fVar73 + *(float *)(unaff_x20 + 0xe)));
    }
    else {
      *(float *)(unaff_x20 + 0x4c) = fVar66 + fVar44;
    }
    if (fVar54 == 0.0) {
      fVar54 = (*(float *)((long)unaff_x20 + 0x34) + fVar76 * -2.0) -
               (fVar74 + *(float *)((long)unaff_x20 + 0x74));
    }
    *(float *)((long)unaff_x20 + 0x264) = fVar56 + fVar54;
    *(float *)((long)unaff_x20 + 0x154) = (fVar69 + fVar73) - fVar57;
    unaff_x20[0x2b] = 0;
    fVar44 = ((fVar69 + *(float *)(unaff_x20 + 5)) - fVar57) + fVar73 + 0.0;
    fVar74 = ((fVar76 + *(float *)((long)unaff_x20 + 0x2c)) - fVar46) + fVar74;
    *(float *)(unaff_x20 + 0x24) = fVar44;
    *(float *)((long)unaff_x20 + 0x124) = fVar74;
    *(float *)(unaff_x20 + 0x2c) = fVar44 - fVar44;
    *(float *)((long)unaff_x20 + 0x164) = fVar74 - fVar74;
    lVar23 = unaff_x20[0x24];
    unaff_x20[0x22] = lVar23;
    unaff_x20[0x23] = lVar23;
    unaff_x20[0x25] = lVar23;
    unaff_x20[0x26] = lVar23;
    *(undefined4 *)(unaff_x20 + 0x2d) = 0;
    unaff_x20[0x28] = 0;
    unaff_x20[0x29] = 0;
    unaff_x20[0x27] = 0;
    *(undefined2 *)(unaff_x20 + 0x2a) = 0;
    *(undefined2 *)((long)unaff_x20 + 0x16c) = *(undefined2 *)((long)unaff_x20 + 0x16e);
    *(undefined4 *)((long)unaff_x20 + 0x16e) = 0x10000;
    *(bool *)((long)unaff_x20 + 0x172) = 0.0 < *(float *)(unaff_x20 + 0x13);
    *(undefined1 *)((long)unaff_x20 + 0x173) = 0;
    func_0x00124fb4(*(undefined4 *)(&UNK_00003934 + in_stack_000001b8),(long)unaff_x20 + 0x17c,
                    uStack0000000000000184);
    unaff_x20[0x33] = 0;
    if (*(int *)((long)unaff_x20 + 0x1a4) < 0) {
      func_0x000cef5c(unaff_x20 + 0x34,0);
    }
    *(undefined4 *)(unaff_x20 + 0x34) = 0;
    unaff_x20[0x36] = (long)(unaff_x20 + 0x50);
    unaff_x20[0x37] = 0;
    uVar55 = 1;
    *(undefined4 *)((long)unaff_x20 + 0x1c4) = 1;
    if (lVar29 != 0) {
      uVar55 = *(undefined4 *)(lVar29 + 0x1c4);
    }
    *(undefined4 *)(unaff_x20 + 0x39) = uVar55;
    *(int *)((long)unaff_x20 + 0x1cc) = (int)unaff_x20[0x4f];
    *(undefined4 *)(unaff_x20 + 0x3a) = 0xbf800000;
    if (*(int *)((long)unaff_x20 + 0x1dc) < 0) {
      func_0x000eb9f0(unaff_x20 + 0x3b,0);
    }
    *(undefined4 *)(unaff_x20 + 0x3b) = 0;
    if (*(int *)((long)unaff_x20 + 0x1ec) < 0) {
      func_0x000eb9f0(unaff_x20 + 0x3d,0);
    }
    *(undefined4 *)(unaff_x20 + 0x3d) = 0;
    if ('\0' < *(char *)((long)unaff_x20 + 0xdc)) {
      *(char *)((long)unaff_x20 + 0xdc) = *(char *)((long)unaff_x20 + 0xdc) + -1;
    }
    if ('\0' < *(char *)((long)unaff_x20 + 0xdd)) {
      *(char *)((long)unaff_x20 + 0xdd) = *(char *)((long)unaff_x20 + 0xdd) + -1;
    }
    lVar23 = lRam0000000000a334c0;
    fVar44 = uStack00000000000001c0._4_4_;
    fVar73 = uStack00000000000001c8._4_4_;
    if (uVar40 != 0) {
      func_0x000c3098();
      lVar23 = lRam0000000000a334c0;
      fVar44 = uStack00000000000001c0._4_4_;
      fVar73 = uStack00000000000001c8._4_4_;
      if (unaff_x20 == *(long **)(&UNK_00004b18 + in_stack_000001b8)) {
        func_0x000d0a00();
        lVar23 = lRam0000000000a334c0;
        fVar44 = uStack00000000000001c0._4_4_;
        fVar73 = uStack00000000000001c8._4_4_;
      }
    }
    lRam0000000000a334c0 = lVar23;
    uStack00000000000001c0._4_4_ = fVar44;
    uStack00000000000001c8._4_4_ = fVar73;
    if ((uStack00000000000001b4 & 1) == 0) {
      fVar54 = *(float *)((long)unaff_x20 + 100);
      uVar28 = *(uint *)((long)unaff_x20 + 0x14);
      if ((uVar28 >> 5 & 1) == 0) {
        bVar16 = *(int *)(&UNK_00003910 + lVar23) != -1;
      }
      else {
        bVar16 = false;
      }
      fVar76 = (float)uStack00000000000001c8 - fVar54;
      puVar33 = (uint *)(&UNK_0000497c + lVar23);
      uVar40 = *puVar33;
      *puVar33 = uVar40 | 0x10;
      *(undefined4 *)(unaff_x20 + 0x2d) = 1;
      fVar74 = *(float *)(&UNK_00003924 + lVar23);
      fVar66 = *(float *)(&UNK_00003d38 + lVar23);
      *(undefined8 *)(unaff_x29 + -0xc0) = 0;
      *(undefined8 *)(unaff_x29 + -0xb8) = 0;
      fVar56 = fVar74;
      if (in_stack_00000168 != (undefined1 *)0x0) {
        fVar56 = *(float *)(&UNK_00003928 + lVar23);
        *(float *)(unaff_x29 + -0xb8) = (fVar76 - fVar74) - fVar66;
        *(float *)(unaff_x29 + -0xb4) = fVar44 + fVar56;
        fVar56 = fVar74 + fVar66 + *(float *)(&UNK_0000393c + lVar23);
      }
      fVar54 = (float)uStack00000000000001c0 + fVar54;
      if (bVar16) {
        if (*(int *)(&UNK_00003910 + lVar23) == 0) {
          fVar69 = *(float *)(&UNK_00003928 + lVar23);
          *(float *)(unaff_x29 + -0xc0) = fVar54 + fVar74;
          *(float *)(unaff_x29 + -0xbc) = fVar44 + fVar69;
          fVar74 = fVar74 + fVar66 + *(float *)(&UNK_0000393c + lVar23);
        }
        else if (*(int *)(&UNK_00003910 + lVar23) == 1) {
          fVar69 = *(float *)(&UNK_00003928 + lVar23);
          *(float *)(unaff_x29 + -0xc0) = (fVar76 - fVar56) - fVar66;
          *(float *)(unaff_x29 + -0xbc) = fVar44 + fVar69;
          fVar56 = fVar56 + fVar66 + *(float *)(&UNK_0000393c + lVar23);
        }
        uVar22 = *(uint *)(unaff_x20[0x21] + (long)(int)unaff_x20[0x20] * 4 + -4);
        uVar22 = *(uint *)(&UNK_0080c404 + ((ulong)uVar22 & 0xff ^ 0xdc) * 4) ^ ~uVar22 >> 8;
        uVar22 = *(uint *)(&UNK_0080c404 + (ulong)(uVar22 & 0xff ^ 0x43) * 4) ^ uVar22 >> 8;
        uVar22 = *(uint *)(&UNK_0080c404 + (ulong)(uVar22 & 0xff ^ 0x4f) * 4) ^ uVar22 >> 8;
        uVar22 = *(uint *)(&UNK_0080c404 + (ulong)(uVar22 & 0xff ^ 0x4c) * 4) ^ uVar22 >> 8;
        uVar22 = *(uint *)(&UNK_0080c404 + (ulong)(uVar22 & 0xff ^ 0x4c) * 4) ^ uVar22 >> 8;
        uVar22 = *(uint *)(&UNK_0080c404 + (ulong)(uVar22 & 0xff ^ 0x41) * 4) ^ uVar22 >> 8;
        uVar22 = *(uint *)(&UNK_0080c404 + (ulong)(uVar22 & 0xff ^ 0x50) * 4) ^ uVar22 >> 8;
        uVar22 = *(uint *)(&UNK_0080c404 + (ulong)(uVar22 & 0xff ^ 0x53) * 4) ^ uVar22 >> 8;
        uVar22 = *(uint *)(&UNK_0080c404 + (ulong)(uVar22 & 0xff ^ 0x45) * 4) ^
                 uVar22 >> 8 ^ 0xffffffff;
        if (*(uint *)(&UNK_0000404c + *unaff_x20) == uVar22) {
          func_0x000c167c(uVar22,0xb,"#COLLAPSE",0);
        }
        iVar17 = func_0x0010c3ec(uVar22,unaff_x29 + -0xc0);
        if (iVar17 != 0) {
          *(undefined1 *)((long)unaff_x20 + 0xc2) = 1;
        }
      }
      if (in_stack_00000168 != (undefined1 *)0x0) {
        uVar22 = *(uint *)(unaff_x20[0x21] + (long)(int)unaff_x20[0x20] * 4 + -4);
        uVar22 = *(uint *)(&UNK_0080c404 + ((ulong)uVar22 & 0xff ^ 0xdc) * 4) ^ ~uVar22 >> 8;
        uVar22 = *(uint *)(&UNK_0080c404 + (ulong)(uVar22 & 0xff ^ 0x43) * 4) ^ uVar22 >> 8;
        uVar22 = *(uint *)(&UNK_0080c404 + (ulong)(uVar22 & 0xff ^ 0x4c) * 4) ^ uVar22 >> 8;
        uVar22 = *(uint *)(&UNK_0080c404 + (ulong)(uVar22 & 0xff ^ 0x4f) * 4) ^ uVar22 >> 8;
        uVar22 = *(uint *)(&UNK_0080c404 + (ulong)(uVar22 & 0xff ^ 0x53) * 4) ^ uVar22 >> 8;
        uVar22 = *(uint *)(&UNK_0080c404 + (ulong)(uVar22 & 0xff ^ 0x45) * 4) ^
                 uVar22 >> 8 ^ 0xffffffff;
        if (*(uint *)(&UNK_0000404c + *unaff_x20) == uVar22) {
          func_0x000c167c(uVar22,0xb,"#CLOSE",0);
        }
        iVar17 = func_0x0010c1d4(uVar22,unaff_x29 + -0xb8);
        if (iVar17 != 0) {
          *in_stack_00000168 = 0;
        }
      }
      *(undefined4 *)(unaff_x20 + 0x2d) = 0;
      *puVar33 = uVar40;
      fVar57 = 0.0;
      fVar69 = 0.0;
      if ((uVar28 & 0x40000) != 0) {
        fVar69 = fVar66 * 0.8;
      }
      if (unaff_x26 == (char *)0xffffffffffffffff) {
        fVar46 = *(float *)(&UNK_00003d38 + lRam0000000000a334c0);
      }
      else {
        pcVar20 = unaff_x26;
        do {
          if (*pcVar20 == '#') {
            if (pcVar20[1] == '#') break;
          }
          else if (*pcVar20 == '\0') break;
          pcVar3 = pcVar20 + 1;
          bVar16 = pcVar20 != (char *)0xfffffffffffffffe;
          pcVar20 = pcVar3;
        } while (bVar16);
        fVar46 = *(float *)(&UNK_00003d38 + lRam0000000000a334c0);
        if (pcVar20 == unaff_x26) {
          fVar57 = 0.0;
        }
        else {
          fVar57 = 3.4028235e+38;
          fVar47 = (float)func_0x00106300(fVar46,0x7f7fffff,0xbf800000,
                                          *(undefined8 *)(&UNK_00003d30 + lRam0000000000a334c0),
                                          unaff_x26,pcVar20,0);
          fVar46 = fVar57;
          fVar57 = (float)(int)(fVar47 + 0.99999);
        }
      }
      fVar69 = fVar69 + fVar57;
      *(float *)(unaff_x29 + -200) = fVar69;
      *(float *)(unaff_x29 + -0xc4) = fVar46 + 0.0;
      fVar57 = *(float *)(&UNK_00003924 + lVar23);
      if (fVar74 <= fVar57) {
        if (fVar56 <= fVar57) goto code_r0x000cc994;
code_r0x000ccc3c:
        fVar56 = fVar56 + *(float *)(&UNK_0000393c + lVar23);
        fVar57 = *(float *)(&UNK_00003908 + lVar23);
        bVar16 = false;
        if ((0.0 < fVar57) && (bVar16 = false, !NAN(fVar57))) {
          bVar16 = fVar57 < 1.0;
        }
        if (bVar16) {
code_r0x000cc9a8:
          fVar47 = ABS(fVar57 + -0.5) * -2.0 + 1.0;
          fVar46 = 1.0;
          if (fVar47 <= 1.0) {
            fVar46 = fVar47;
          }
          fVar67 = 0.0;
          if (0.0 <= fVar47) {
            fVar67 = fVar46;
          }
          fVar46 = fVar74;
          if (fVar74 < fVar56) {
            fVar46 = fVar56;
          }
          fVar47 = (((fVar76 - fVar54) - fVar74) - fVar56) - fVar69;
          if (fVar47 <= fVar46) {
            fVar46 = fVar47;
          }
          fVar46 = fVar46 * fVar67;
          if (fVar74 < fVar46) {
            fVar74 = fVar46;
          }
          if (fVar56 < fVar46) {
            fVar56 = fVar46;
          }
        }
      }
      else {
        fVar74 = fVar74 + *(float *)(&UNK_0000393c + lVar23);
        if (fVar57 < fVar56) goto code_r0x000ccc3c;
code_r0x000cc994:
        fVar57 = *(float *)(&UNK_00003908 + lVar23);
        bVar16 = false;
        if ((0.0 < fVar57) && (bVar16 = false, !NAN(fVar57))) {
          bVar16 = fVar57 < 1.0;
        }
        if (bVar16) goto code_r0x000cc9a8;
      }
      fVar54 = fVar54 + fVar74;
      fVar56 = fVar76 - fVar56;
      *(float *)(unaff_x29 + -0xd8) = fVar54;
      *(float *)(unaff_x29 + -0xd4) = fVar44;
      *(float *)(unaff_x29 + -0xd0) = fVar56;
      *(float *)(unaff_x29 + -0xcc) = fVar73;
      fVar74 = fVar56 + *(float *)(&UNK_0000393c + lVar23);
      if (fVar76 <= fVar56 + *(float *)(&UNK_0000393c + lVar23)) {
        fVar74 = fVar76;
      }
      *(float *)(unaff_x29 + -0xe8) = fVar54;
      *(float *)(unaff_x29 + -0xe4) = fVar44;
      *(float *)(unaff_x29 + -0xe0) = fVar74;
      *(float *)(unaff_x29 + -0xdc) = fVar73;
      if ((uVar28 >> 0x12 & 1) != 0) {
        fVar69 = fVar69 + fVar54 + fVar57 * ((fVar56 - fVar54) - fVar69);
        if (fVar69 <= fVar56) {
          fVar56 = fVar69;
        }
        fVar76 = fVar54;
        if (fVar54 <= fVar69) {
          fVar76 = fVar56;
        }
        if (fVar54 < fVar76) {
          fVar56 = *(float *)(&UNK_000039cc + lRam0000000000a334c0);
          fVar69 = *(float *)(&UNK_000039d0 + lRam0000000000a334c0);
          fVar57 = *(float *)(&UNK_000039d8 + lRam0000000000a334c0) *
                   *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
          fVar54 = 1.0;
          if (fVar56 <= 1.0) {
            fVar54 = fVar56;
          }
          fVar46 = 0.0;
          if (0.0 <= fVar56) {
            fVar46 = fVar54;
          }
          fVar56 = *(float *)(&UNK_000039d4 + lRam0000000000a334c0);
          fVar54 = 1.0;
          if (fVar69 <= 1.0) {
            fVar54 = fVar69;
          }
          fVar47 = 0.0;
          if (0.0 <= fVar69) {
            fVar47 = fVar54;
          }
          iVar17 = -(uint)(fVar56 < 0.0);
          iVar60 = -(uint)(fVar57 < 0.0);
          uVar71 = NEON_fmov(0x3f800000,4);
          uVar71 = uVar71 ^ (uVar71 ^ CONCAT44(fVar57,fVar56)) &
                            ~CONCAT44(-(uint)((float)(uVar71 >> 0x20) < fVar57),
                                      -(uint)((float)uVar71 < fVar56));
          fVar54 = (float)CONCAT13((byte)(uVar71 >> 0x18) & ~(byte)((uint)iVar17 >> 0x18),
                                   CONCAT12((byte)(uVar71 >> 0x10) & ~(byte)((uint)iVar17 >> 0x10),
                                            CONCAT11((byte)(uVar71 >> 8) &
                                                     ~(byte)((uint)iVar17 >> 8),
                                                     (byte)uVar71 & ~(byte)iVar17)));
          uVar49 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar71 >> 0x38) &
                                                             ~(byte)((uint)iVar60 >> 0x18),
                                                             CONCAT16((byte)(uVar71 >> 0x30) &
                                                                      ~(byte)((uint)iVar60 >> 0x10),
                                                                      CONCAT15((byte)(uVar71 >> 0x28
                                                                                     ) & ~(byte)((
                                                  uint)iVar60 >> 8),
                                                  CONCAT14((byte)(uVar71 >> 0x20) & ~(byte)iVar60,
                                                           fVar54)))) >> 0x20) * 255.0 + 0.5),
                                      (int)(fVar54 * 255.0 + 0.5)),_UNK_0080c190,4);
          func_0x001069f4(fVar76,(fVar44 + fVar73) * 0.5,unaff_x20[0x55],
                          (int)(fVar46 * 255.0 + 0.5) | (int)(fVar47 * 255.0 + 0.5) << 8 |
                          (uint)uVar49 | (uint)((ulong)uVar49 >> 0x20));
          fVar76 = fVar76 - (float)(int)(fVar66 * 0.8 * 0.5);
          if (fVar76 <= fVar74) {
            fVar74 = fVar76;
          }
          *(float *)(unaff_x29 + -0xe0) = fVar74;
        }
      }
      lVar30 = lRam0000000000a334c0;
      if (unaff_x26 != (char *)0xffffffffffffffff) {
        pcVar20 = unaff_x26;
        do {
          if (*pcVar20 == '#') {
            if (pcVar20[1] == '#') break;
          }
          else if (*pcVar20 == '\0') break;
          pcVar3 = pcVar20 + 1;
          bVar16 = pcVar20 != (char *)0xfffffffffffffffe;
          pcVar20 = pcVar3;
        } while (bVar16);
        if (((int)pcVar20 != (int)unaff_x26) &&
           (func_0x000bc610(*(undefined8 *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x2a8),
                            unaff_x29 + -0xd8,unaff_x29 + -0xd0,unaff_x26,pcVar20,unaff_x29 + -200,
                            &UNK_00003908 + lVar23,unaff_x29 + -0xe8),
           (&UNK_00005ff8)[lVar30] != '\0')) {
          func_0x000bc2c4(unaff_x29 + -0xd8,unaff_x26,pcVar20);
        }
      }
    }
    lVar23 = lRam0000000000a334c0;
    uVar28 = 0;
    puVar4 = (undefined4 *)(&UNK_000049a8 + lRam0000000000a334c0);
    *(undefined4 *)(unaff_x20 + 0x4d) = 0;
    uVar71 = puVar5[0x1fa];
    fVar44 = *(float *)(lVar23 + 0xe40);
    if ((float)uStack00000000000001c0 - *(float *)(&UNK_0000394c + lVar23) <= fVar44) {
      fVar73 = *(float *)(&UNK_0000394c + lVar23) + (float)uStack00000000000001c8;
      bVar16 = false;
      if ((uStack00000000000001c0._4_4_ - *(float *)(&UNK_00003950 + lVar23) <=
           *(float *)(lVar23 + 0xe44)) && (bVar16 = false, !NAN(fVar44) && !NAN(fVar73))) {
        bVar16 = fVar44 < fVar73;
      }
      if (bVar16) {
        uVar28 = (uint)(*(float *)(lVar23 + 0xe44) <
                       uStack00000000000001c8._4_4_ + *(float *)(&UNK_00003950 + lVar23));
      }
      else {
        uVar28 = 0;
      }
    }
    *puVar4 = *(undefined4 *)((long)unaff_x20 + 0x84);
    *(int *)(&UNK_000049ac + lVar23) = (int)uVar71;
    *(uint *)(&UNK_000049b0 + lVar23) = uVar28;
    *(ulong *)(&UNK_000049cc + lVar23) =
         CONCAT44(uStack00000000000001c8._4_4_,(float)uStack00000000000001c8);
    *(ulong *)(&UNK_000049c4 + lVar23) =
         CONCAT44(uStack00000000000001c0._4_4_,(float)uStack00000000000001c0);
    *(ulong *)(&UNK_000049bc + lVar23) =
         CONCAT44(uStack00000000000001c8._4_4_,(float)uStack00000000000001c8);
    *(ulong *)(&UNK_000049b4 + lVar23) =
         CONCAT44(uStack00000000000001c0._4_4_,(float)uStack00000000000001c0);
    iVar17 = *(int *)((long)puVar5 + 0xfd4);
    if ((iVar17 != 0) && (((int)*plVar35 == iVar17 || (*(int *)((long)unaff_x20 + 0x84) == iVar17)))
       ) {
      func_0x000d2b3c();
      lVar23 = lRam0000000000a334c0;
    }
    plVar35 = *(long **)(lVar23 + 0x4000);
  }
  bVar16 = iStack00000000000001a0 != iStack00000000000001a4;
  plVar24 = unaff_x20 + 0x44;
  *(undefined1 *)(plVar35 + 0x18) = 1;
  func_0x000f0930(plVar35[0x55],unaff_x20 + 0x43,plVar24,1);
  lVar23 = *(long *)(plVar35[0x55] + 0x60) + (long)*(int *)(plVar35[0x55] + 0x58) * 0x10;
  lVar30 = *(long *)(lVar23 + -0x10);
  plVar35[0x4a] = *(long *)(lVar23 + -8);
  plVar35[0x49] = lVar30;
  *(undefined1 *)(unaff_x20 + 0x18) = 0;
  *(short *)((long)unaff_x20 + 0xcc) = *(short *)((long)unaff_x20 + 0xcc) + 1;
  *puVar38 = 0;
  if (bVar16) {
    if ((uStack00000000000001b4 & 0x11000000) == 0x1000000) {
      if ((uStack00000000000001b4 >> 0x17 & 1) == 0) {
        bVar16 = false;
      }
      else {
        bVar16 = false;
        if ((char)puVar38[0x61] != '\0') {
          bVar16 = false;
          if (*(long *)(&UNK_00004b18 + in_stack_000001b8) != 0) {
            bVar16 = *(long *)(*(long *)(&UNK_00004b18 + in_stack_000001b8) + 0x3a0) ==
                     unaff_x20[0x74];
          }
        }
      }
      if ((((&UNK_00005ff8)[in_stack_000001b8] == '\0') && (!bVar16)) &&
         ((*(float *)(unaff_x20 + 0x40) <= *(float *)(unaff_x20 + 0x3f) ||
          (*(float *)((long)unaff_x20 + 0x204) <= *(float *)((long)unaff_x20 + 0x1fc))))) {
        if ((*(char *)((long)unaff_x20 + 0xdc) < '\x01') &&
           (*(char *)((long)unaff_x20 + 0xdd) < '\x01')) {
          *(undefined1 *)((long)unaff_x20 + 0xe4) = 1;
        }
        else {
          *(undefined1 *)((long)unaff_x20 + 0xe5) = 1;
        }
      }
      if (lVar29 != 0) {
        if (*(char *)(lVar29 + 0xc1) == '\0') {
          if ('\0' < *(char *)(lVar29 + 0xe4)) {
            *(undefined1 *)((long)unaff_x20 + 0xe4) = 1;
          }
          if (*(char *)(lVar29 + 0xe5) < '\x01') goto LAB_000cce08;
        }
        else {
          *(undefined1 *)((long)unaff_x20 + 0xe4) = 1;
        }
        *(undefined1 *)((long)unaff_x20 + 0xe5) = 1;
      }
    }
LAB_000cce08:
    if (*(float *)(&UNK_000038e8 + in_stack_000001b8) <= 0.0) {
      *(undefined1 *)((long)unaff_x20 + 0xe4) = 1;
      *(undefined1 *)((long)unaff_x20 + 0xc5) = 1;
      cVar11 = *(char *)((long)unaff_x20 + 0xe7);
joined_r0x000cce60:
      bVar10 = 1;
      bVar27 = 1;
    }
    else {
      if (('\0' < *(char *)((long)unaff_x20 + 0xe4)) || ('\0' < *(char *)((long)unaff_x20 + 0xe5)))
      {
        *(undefined1 *)((long)unaff_x20 + 0xc5) = 1;
        cVar11 = *(char *)((long)unaff_x20 + 0xe7);
        goto joined_r0x000cce60;
      }
      bVar27 = 0;
      bVar10 = 0;
      *(bool *)((long)unaff_x20 + 0xc5) = '\0' < *(char *)((long)unaff_x20 + 0xe6);
      cVar11 = *(char *)((long)unaff_x20 + 0xe7);
    }
    if ('\0' < cVar11) {
      *(char *)((long)unaff_x20 + 0xe7) = cVar11 + -1;
      *(uint *)((long)unaff_x20 + 0x14) = *(uint *)((long)unaff_x20 + 0x14) | 0x30200;
      bVar10 = bVar27;
    }
    if ((((*(char *)((long)unaff_x20 + 0xc1) == '\0') &&
         ((bool)(*(char *)((long)unaff_x20 + 0xbe) != '\0' & (bVar10 ^ 1)))) ||
        ('\0' < *(char *)((long)unaff_x20 + 0xdc))) || ('\0' < *(char *)((long)unaff_x20 + 0xdd))) {
      bVar16 = false;
    }
    else {
      bVar16 = *(char *)((long)unaff_x20 + 0xe5) < '\x01';
    }
    *(bool *)((long)unaff_x20 + 0xc3) = bVar16;
  }
  if (*(char *)((long)unaff_x20 + 0xc6) == '\0') {
    uVar28 = 0;
    if (*(char *)(in_stack_000001b8 + 0x79) != '\0') {
      uVar28 = uStack000000000000019c;
    }
    if (((uVar28 & 1) != 0) ||
       ((*(char *)(in_stack_000001b8 + 0x7a) != '\0' &&
        (*(int *)(&UNK_00003fd0 + in_stack_000001b8) ==
         (int)(char)(&UNK_00006074)[in_stack_000001b8])))) {
      if ('\0' < *(char *)((long)unaff_x20 + 0xdc)) {
        *(char *)((long)unaff_x20 + 0xdc) = *(char *)((long)unaff_x20 + 0xdc) + '\x01';
      }
      if (*(char *)((long)unaff_x20 + 0xdd) < '\x01') {
        bVar16 = false;
      }
      else {
        bVar16 = false;
        *(char *)((long)unaff_x20 + 0xdd) = *(char *)((long)unaff_x20 + 0xdd) + '\x01';
      }
      goto LAB_000cced0;
    }
  }
  bVar16 = *(char *)((long)unaff_x20 + 0xc3) == '\0';
LAB_000cced0:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0xa0)) {
    return;
  }
  ___stack_chk_fail(bVar16);
  auVar80 = __Unwind_Resume();
  lVar29 = *(long *)(lRam0000000000a334c0 + 0x4000);
  *(undefined1 *)(lVar29 + 0xc0) = 1;
  func_0x000f0930(*(undefined8 *)(lVar29 + 0x2a8),auVar80._0_8_,auVar80._8_8_,plVar24);
  lVar23 = *(long *)(*(long *)(lVar29 + 0x2a8) + 0x60) +
           (long)*(int *)(*(long *)(lVar29 + 0x2a8) + 0x58) * 0x10;
  uVar49 = *(undefined8 *)(lVar23 + -0x10);
  *(undefined8 *)(lVar29 + 0x250) = *(undefined8 *)(lVar23 + -8);
  *(undefined8 *)(lVar29 + 0x248) = uVar49;
  return;
}

