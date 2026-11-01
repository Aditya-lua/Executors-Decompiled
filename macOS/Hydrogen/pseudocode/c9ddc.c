
/* WARNING: Removing unreachable block (ram,0x000cb648) */
/* WARNING: Removing unreachable block (ram,0x000cdda4) */
/* WARNING: Removing unreachable block (ram,0x000cddf4) */
/* WARNING: Removing unreachable block (ram,0x000cddac) */
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000c9ddc(void)

{
  bool bVar1;
  float *pfVar2;
  float *pfVar3;
  char *pcVar4;
  int *piVar5;
  byte *pbVar6;
  undefined4 *puVar7;
  int iVar8;
  int iVar9;
  ulong *puVar10;
  uint uVar11;
  uint uVar12;
  byte bVar13;
  char cVar14;
  bool bVar15;
  uint uVar16;
  bool bVar17;
  int iVar18;
  char *pcVar19;
  long *plVar20;
  uint in_w8;
  uint uVar21;
  undefined8 *puVar22;
  long *plVar23;
  undefined8 *puVar24;
  undefined *puVar25;
  byte bVar26;
  uint in_w9;
  uint uVar27;
  long lVar28;
  long lVar29;
  short sVar30;
  uint uVar31;
  uint *puVar32;
  undefined *puVar33;
  long unaff_x19;
  long lVar34;
  long *unaff_x20;
  uint unaff_w21;
  uint unaff_w22;
  long lVar35;
  long unaff_x23;
  long lVar36;
  float *pfVar37;
  long lVar38;
  uint uVar39;
  uint uVar40;
  char *unaff_x26;
  int *unaff_x27;
  int *piVar41;
  float *pfVar42;
  long unaff_x29;
  float fVar43;
  undefined4 uVar44;
  float fVar45;
  float fVar46;
  undefined8 uVar47;
  undefined8 uVar48;
  undefined8 uVar49;
  undefined8 uVar50;
  undefined8 uVar51;
  undefined8 uVar52;
  float fVar53;
  undefined4 uVar54;
  float fVar55;
  float fVar56;
  undefined8 uVar57;
  undefined8 uVar58;
  int iVar59;
  undefined8 uVar60;
  undefined8 uVar61;
  ulong uVar62;
  ulong uVar63;
  float fVar64;
  float fVar65;
  float fVar66;
  float fVar68;
  ulong uVar67;
  float fVar69;
  ulong uVar70;
  ulong uVar71;
  float fVar72;
  float fVar73;
  float fVar74;
  float fVar75;
  float fVar76;
  float fVar77;
  float fVar78;
  undefined1 auVar79 [16];
  undefined8 uStack0000000000000070;
  ulong uStack00000000000000a0;
  uint uStack00000000000000c4;
  float *pfStack0000000000000108;
  uint uStack000000000000013c;
  uint uStack0000000000000140;
  uint uStack0000000000000148;
  char *in_stack_00000150;
  undefined1 *in_stack_00000168;
  uint uStack0000000000000170;
  int *in_stack_00000178;
  undefined8 in_stack_00000180;
  ulong *in_stack_00000190;
  ulong in_stack_00000198;
  int iStack00000000000001a0;
  int iStack00000000000001a4;
  uint *in_stack_000001a8;
  uint uStack00000000000001b4;
  long in_stack_000001b8;
  undefined8 uStack00000000000001c0;
  undefined8 uStack00000000000001c8;
  undefined8 uStack00000000000001d0;
  ulong in_stack_000001d8;
  ulong uStack00000000000001e0;
  float fStack00000000000001e8;
  float fStack00000000000001ec;
  
  uVar27 = 0;
  if (in_w8 == unaff_w21) {
    uVar27 = in_w9;
  }
  if (((unaff_w21 & 1) == 0) && ((uVar27 & 1) == 0)) {
    iVar18 = *(int *)(&UNK_00003fb0 + unaff_x23);
    if (iVar18 == *(int *)(&UNK_00003fb4 + unaff_x23)) {
      if (iVar18 == 0) {
        iVar59 = 8;
      }
      else {
        iVar59 = iVar18;
        if (iVar18 < 0) {
          iVar59 = iVar18 + 1;
        }
        iVar59 = iVar18 + (iVar59 >> 1);
      }
      if (iVar59 <= iVar18 + 1) {
        iVar59 = iVar18 + 1;
      }
      func_0x000cef5c(&UNK_00003fb0 + unaff_x23,iVar59);
      iVar18 = *(int *)(&UNK_00003fb0 + unaff_x23);
    }
    *(long **)(*(long *)(&UNK_00003fb8 + unaff_x23) + (long)iVar18 * 8) = unaff_x20;
    iVar18 = *(int *)(&UNK_00003fb0 + unaff_x23);
    *(int *)(&UNK_00003fb0 + unaff_x23) = iVar18 + 1;
LAB_000c9ee0:
    *(short *)((long)unaff_x20 + 0xd4) = (short)iVar18;
  }
  else if ((((in_stack_00000198._4_4_ | unaff_w21 ^ 1) & 1) == 0) && (in_w8 != unaff_w21)) {
    sVar30 = *(short *)((long)unaff_x20 + 0xd4);
    iVar18 = *(int *)(&UNK_00003fb0 + unaff_x23);
    lVar36 = *(long *)(&UNK_00003fb8 + unaff_x23);
    if (sVar30 + 1 < iVar18) {
      lVar34 = ~(long)(int)sVar30 + (long)iVar18;
      plVar23 = (long *)(lVar36 + (long)(int)sVar30 * 8);
      do {
        plVar23 = plVar23 + 1;
        *(short *)(*plVar23 + 0xd4) = *(short *)(*plVar23 + 0xd4) + -1;
        lVar34 = lVar34 + -1;
      } while (lVar34 != 0);
      sVar30 = *(short *)((long)unaff_x20 + 0xd4);
    }
    lVar36 = lVar36 + (long)sVar30 * 8;
    _memmove(lVar36,lVar36 + 8,((long)iVar18 + ~(long)sVar30) * 8);
    *(int *)(&UNK_00003fb0 + unaff_x23) = *(int *)(&UNK_00003fb0 + unaff_x23) + -1;
    iVar18 = 0xffff;
    goto LAB_000c9ee0;
  }
  *(char *)((long)unaff_x20 + 199) = (char)unaff_w21;
  *(uint *)((long)unaff_x20 + 0x14) = unaff_w22;
  if ((*in_stack_000001a8 & 0x100) == 0) {
    uVar27 = 0;
  }
  else {
    uVar27 = in_stack_000001a8[0xe];
  }
  *(uint *)(unaff_x20 + 3) = uVar27;
  *(int *)(unaff_x20 + 0x4e) = iStack00000000000001a4;
  *(float *)((long)unaff_x20 + 0x274) = (float)*(double *)(&UNK_00003f50 + unaff_x19);
  *(undefined2 *)(unaff_x20 + 0x1a) = 0;
  iVar18 = *(int *)(unaff_x19 + 0x3ff0);
  *(int *)(unaff_x19 + 0x3ff0) = iVar18 + 1;
  *(short *)((long)unaff_x20 + 0xd2) = (short)iVar18;
  iVar18 = *unaff_x27;
  if (iVar18 == 0) {
    lVar36 = 0;
    if (iStack00000000000001a0 != iStack00000000000001a4) goto code_r0x000c9f4c;
LAB_000c9cfc:
    lVar34 = unaff_x20[0x6f];
    iVar59 = (int)unaff_x20[0x20];
  }
  else {
    lVar36 = *(long *)(*(long *)(&UNK_00003fd8 + unaff_x19) + (long)(iVar18 + -1) * 0x68);
    if (iStack00000000000001a0 == iStack00000000000001a4) goto LAB_000c9cfc;
code_r0x000c9f4c:
    lVar34 = 0;
    if ((unaff_w22 & 0x5000000) != 0) {
      lVar34 = lVar36;
    }
    iVar59 = (int)unaff_x20[0x20];
  }
  uStack00000000000001b4 = unaff_w22;
  if (iVar59 == 0) {
    if (*(int *)((long)unaff_x20 + 0x104) == 0) {
      func_0x000eb9f0(unaff_x20 + 0x20,8);
      iVar18 = (int)unaff_x20[0x20];
    }
    else {
      iVar18 = 0;
    }
    *(int *)(unaff_x20[0x21] + (long)iVar18 * 4) = (int)unaff_x20[2];
    iVar59 = (int)unaff_x20[0x20] + 1;
    *(int *)(unaff_x20 + 0x20) = iVar59;
    iVar18 = *unaff_x27;
  }
  _uStack0000000000000148 = unaff_x20 + 0x20;
  *(long **)(unaff_x19 + 0x4000) = unaff_x20;
  uVar50 = *(undefined8 *)(&UNK_000049d0 + unaff_x19);
  uVar48 = *(undefined8 *)(&UNK_000049c8 + unaff_x19);
  uVar60 = *(undefined8 *)(&UNK_000049e0 + unaff_x19);
  uVar57 = *(undefined8 *)(&UNK_000049d8 + unaff_x19);
  uVar51 = *(undefined8 *)(&UNK_000049ec + unaff_x19);
  uVar49 = *(undefined8 *)(&UNK_000049e4 + unaff_x19);
  uVar61 = *(undefined8 *)(&UNK_000049b0 + unaff_x19);
  uVar58 = *(undefined8 *)(&UNK_000049a8 + unaff_x19);
  uVar52 = *(undefined8 *)(&UNK_000049c0 + unaff_x19);
  uVar47 = *(undefined8 *)(&UNK_000049b8 + unaff_x19);
  puVar32 = in_stack_000001a8 + 0x3a;
  uVar12 = *puVar32;
  uVar27 = in_stack_000001a8[0x1e];
  uVar39 = in_stack_000001a8[0x22];
  uVar21 = in_stack_000001a8[0x26];
  uVar31 = in_stack_000001a8[0x2a];
  uVar40 = in_stack_000001a8[0x32];
  uVar11 = in_stack_000001a8[0x2e];
  uVar16 = in_stack_000001a8[0x52b];
  if (iVar18 == *(int *)(&UNK_00003fd4 + unaff_x19)) {
    func_0x000ee530();
    iVar18 = *unaff_x27;
  }
  puVar22 = (undefined8 *)(*(long *)(&UNK_00003fd8 + in_stack_000001b8) + (long)iVar18 * 0x68);
  puVar22[4] = uVar52;
  puVar22[3] = uVar47;
  puVar22[6] = uVar50;
  puVar22[5] = uVar48;
  puVar22[8] = CONCAT44((int)uVar49,(int)uVar60);
  puVar22[7] = uVar57;
  *(undefined8 *)((long)puVar22 + 0x4c) = uVar51;
  *(undefined8 *)((long)puVar22 + 0x44) = uVar49;
  *puVar22 = unaff_x20;
  puVar22[2] = uVar61;
  puVar22[1] = uVar58;
  *(short *)((long)puVar22 + 0x54) = (short)iVar59;
  *(short *)((long)puVar22 + 0x56) = (short)uVar27;
  *(short *)(puVar22 + 0xb) = (short)uVar39;
  *(short *)((long)puVar22 + 0x5a) = (short)uVar21;
  *(short *)((long)puVar22 + 0x5c) = (short)uVar31;
  *(short *)((long)puVar22 + 0x5e) = (short)uVar40;
  *(short *)(puVar22 + 0xc) = (short)uVar11;
  *(short *)((long)puVar22 + 0x62) = (short)uVar12;
  *(short *)((long)puVar22 + 100) = (short)uVar16;
  *(int *)(&UNK_00003fd0 + in_stack_000001b8) = *(int *)(&UNK_00003fd0 + in_stack_000001b8) + 1;
  if ((uStack00000000000001b4 >> 0x1c & 1) != 0) {
    in_stack_000001a8[0x42] = in_stack_000001a8[0x42] + 1;
  }
  if (iStack00000000000001a0 != iStack00000000000001a4) {
    unaff_x20[0x6f] = lVar34;
    unaff_x20[0x74] = (long)unaff_x20;
    unaff_x20[0x73] = (long)unaff_x20;
    unaff_x20[0x72] = (long)unaff_x20;
    unaff_x20[0x71] = (long)unaff_x20;
    if (((uStack00000000000001b4 & 0x3000000) == 0x1000000) && (lVar34 != 0)) {
      unaff_x20[0x71] = *(long *)(lVar34 + 0x388);
    }
    if (((uStack00000000000001b4 >> 0x1a & 1) != 0) && (lVar34 != 0)) {
      unaff_x20[0x72] = *(long *)(lVar34 + 0x390);
    }
    if ((((uStack00000000000001b4 >> 0x1b & 1) == 0) && ((uStack00000000000001b4 & 0x5000000) != 0))
       && (lVar34 != 0)) {
      unaff_x20[0x73] = *(long *)(lVar34 + 0x398);
    }
    if (*(char *)((long)unaff_x20 + 0x16) < '\0') {
      plVar23 = unaff_x20;
      do {
        plVar23 = (long *)plVar23[0x6f];
      } while (*(char *)((long)plVar23 + 0x16) < '\0');
      unaff_x20[0x74] = (long)plVar23;
    }
    unaff_x20[0x70] = lVar36;
    lVar28 = 0;
    if ((uStack00000000000001b4 & 0x1000000) != 0) {
      lVar28 = lVar36;
    }
    unaff_x20[0x75] = lVar28;
  }
  lVar28 = lRam0000000000a334c0;
  piVar41 = in_stack_00000178;
  if ((uStack00000000000001b4 & 0x800000) != 0) {
    piVar41 = (int *)((long)in_stack_00000190 + 0xfcc);
  }
  iVar59 = *piVar41;
  piVar41 = (int *)(&UNK_00004aa0 + lRam0000000000a334c0);
  piVar5 = (int *)(&UNK_00004978 + lRam0000000000a334c0);
  uVar54 = *(undefined4 *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x10);
  iVar18 = *piVar41;
  if (iVar18 == *(int *)(&UNK_00004aa4 + lRam0000000000a334c0)) {
    iVar8 = iVar18;
    if (iVar18 < 0) {
      iVar8 = iVar18 + 1;
    }
    iVar9 = 8;
    if (iVar18 != 0) {
      iVar9 = iVar18 + (iVar8 >> 1);
    }
    if (iVar9 <= iVar18 + 1) {
      iVar9 = iVar18 + 1;
    }
    func_0x000cef5c(piVar41,iVar9);
    iVar18 = *piVar41;
  }
  *(ulong *)(*(long *)(&UNK_00004aa8 + lVar28) + (long)iVar18 * 8) = CONCAT44(uVar54,iVar59);
  *piVar41 = *piVar41 + 1;
  *piVar5 = iVar59;
  *(int *)(unaff_x20 + 0x7e) = *(int *)((long)in_stack_00000190 + 0xfcc);
  if ((uStack00000000000001b4 >> 0x1a & 1) != 0) {
    uVar27 = in_stack_000001a8[0x3a];
    puVar22 = (undefined8 *)
              (*(long *)(&UNK_00004ad8 + in_stack_000001b8) + (long)(int)uVar27 * 0x38);
    puVar22[1] = unaff_x20;
    *(undefined4 *)(puVar22 + 3) = *(undefined4 *)(lVar36 + 0x168);
    if (uVar27 == in_stack_000001a8[0x3b]) {
      if (uVar27 == 0) {
        iVar18 = 8;
      }
      else {
        uVar39 = uVar27;
        if ((int)uVar27 < 0) {
          uVar39 = uVar27 + 1;
        }
        iVar18 = uVar27 + ((int)uVar39 >> 1);
      }
      if (iVar18 <= (int)(uVar27 + 1)) {
        iVar18 = uVar27 + 1;
      }
      func_0x000eadcc(puVar32,iVar18);
      uVar27 = *puVar32;
    }
    puVar24 = (undefined8 *)
              (*(long *)(&UNK_00004ae8 + in_stack_000001b8) + (long)(int)uVar27 * 0x38);
    uVar49 = puVar22[1];
    uVar48 = *puVar22;
    uVar50 = puVar22[3];
    uVar47 = puVar22[2];
    uVar52 = puVar22[5];
    uVar51 = puVar22[4];
    puVar24[6] = puVar22[6];
    puVar24[3] = uVar50;
    puVar24[2] = uVar47;
    puVar24[5] = uVar52;
    puVar24[4] = uVar51;
    puVar24[1] = uVar49;
    *puVar24 = uVar48;
    *puVar32 = *puVar32 + 1;
    *(undefined4 *)(unaff_x20 + 0x1b) = *(undefined4 *)puVar22;
  }
  if ((*in_stack_000001a8 & 1) == 0) {
    uVar39 = 0;
    uVar27 = *in_stack_000001a8;
joined_r0x000ca320:
    if ((uVar27 >> 1 & 1) != 0) goto code_r0x000ca340;
code_r0x000ca2b8:
    bVar1 = false;
    bVar17 = false;
  }
  else {
    uVar27 = (int)(char)*(uint *)(unaff_x20 + 0x1d) & in_stack_000001a8[1];
    uVar39 = (uint)(uVar27 != 0);
    if ((uVar27 != 0) &&
       (1e-05 < (float)in_stack_000001a8[7] * (float)in_stack_000001a8[7] +
                (float)in_stack_000001a8[6] * (float)in_stack_000001a8[6])) {
      *(undefined8 *)((long)unaff_x20 + 0xec) = *(undefined8 *)(&UNK_00004a08 + in_stack_000001b8);
      *(undefined8 *)((long)unaff_x20 + 0xf4) = *(undefined8 *)(&UNK_00004a10 + in_stack_000001b8);
      *(uint *)(unaff_x20 + 0x1d) = *(uint *)(unaff_x20 + 0x1d) & 0xfffffff1;
      uVar39 = 1;
      uVar27 = *in_stack_000001a8;
      goto joined_r0x000ca320;
    }
    func_0x000c3730();
    uVar27 = *in_stack_000001a8;
    if ((uVar27 >> 1 & 1) == 0) goto code_r0x000ca2b8;
code_r0x000ca340:
    if ((in_stack_000001a8[2] & (int)(*(uint *)(unaff_x20 + 0x1d) << 0x10) >> 0x18) == 0) {
      bVar17 = false;
      bVar1 = false;
      uVar27 = *(uint *)(unaff_x20 + 3);
    }
    else {
      bVar17 = 0.0 < (float)in_stack_000001a8[8];
      bVar1 = 0.0 < (float)in_stack_000001a8[9];
      uVar27 = *(uint *)(unaff_x20 + 3);
    }
    if (((*(uint *)(unaff_x20 + 0x1d) >> 10 & 1) == 0) && ((uVar27 >> 2 & 1) != 0)) {
      in_stack_000001a8[8] = *(uint *)(unaff_x20 + 7);
    }
    if (((uVar27 >> 3 & 1) != 0) && ((*(byte *)((long)unaff_x20 + 0xe9) >> 2 & 1) == 0)) {
      in_stack_000001a8[9] = *(uint *)((long)unaff_x20 + 0x3c);
    }
    func_0x000d228c();
    uVar27 = *in_stack_000001a8;
  }
  if ((uVar27 >> 7 & 1) != 0) {
    if (0.0 <= (float)in_stack_000001a8[0xc]) {
      *(uint *)((long)unaff_x20 + 0x9c) = in_stack_000001a8[0xc];
      *(undefined4 *)((long)unaff_x20 + 0xa4) = 0;
    }
    if (0.0 <= (float)in_stack_000001a8[0xd]) {
      *(uint *)(unaff_x20 + 0x14) = in_stack_000001a8[0xd];
      *(undefined4 *)(unaff_x20 + 0x15) = 0;
    }
  }
  if ((uVar27 >> 2 & 1) == 0) {
    if (iStack00000000000001a0 != iStack00000000000001a4) {
      unaff_x20[10] = 0;
    }
  }
  else {
    unaff_x20[10] = *(long *)(&UNK_00004a20 + in_stack_000001b8);
    uVar27 = *in_stack_000001a8;
  }
  if ((uVar27 >> 3 & 1) != 0) {
    uVar21 = in_stack_000001a8[0xf];
    if ((in_stack_000001a8[3] == 0) ||
       ((in_stack_000001a8[3] & (int)(*(uint *)(unaff_x20 + 0x1d) << 8) >> 0x18) != 0)) {
      *(uint *)(unaff_x20 + 0x1d) = *(uint *)(unaff_x20 + 0x1d) & 0xfff1ffff;
      *(char *)((long)unaff_x20 + 0xc1) = (char)uVar21;
      uVar27 = *in_stack_000001a8;
    }
  }
  if ((uVar27 >> 5 & 1) != 0) {
    func_0x000c3098();
  }
  if (*in_stack_00000150 != '\0') {
    *(uint *)(unaff_x20 + 0x1d) = *(uint *)(unaff_x20 + 0x1d) & 0xfff7f7f7;
  }
  *(undefined8 *)(in_stack_000001b8 + 0x4000) = 0;
  lVar36 = lRam0000000000a334c0;
  if (iStack00000000000001a0 == iStack00000000000001a4) {
    *(long **)(lRam0000000000a334c0 + 0x4000) = unaff_x20;
    if ((int)unaff_x20[0x38] == -1) {
      lVar28 = 0;
    }
    else {
      lVar28 = *(long *)(&UNK_00004e40 + lVar36) + (long)(int)unaff_x20[0x38] * 0x250;
    }
    *(long *)(&UNK_00004e18 + lVar36) = lVar28;
    fVar43 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
    if (unaff_x20[0x6f] != 0) {
      fVar43 = fVar43 * *(float *)(unaff_x20[0x6f] + 0x2a0);
    }
    *(float *)(&UNK_00003d50 + lVar36) = fVar43;
    *(float *)(&UNK_00003d38 + lVar36) = fVar43;
    if (lVar28 == 0) {
      bVar17 = unaff_x20[0x37] == 0;
    }
    else {
      bVar17 = false;
    }
    *(bool *)(unaff_x20 + 0x2e) = bVar17;
    plVar23 = unaff_x20;
  }
  else {
    cVar14 = *(char *)((long)unaff_x20 + 0xe5);
    *(undefined1 *)((long)unaff_x20 + 0xbe) = 1;
    *(bool *)(unaff_x20 + 0x19) = in_stack_00000168 != (undefined1 *)0x0;
    uVar48 = _UNK_0080c300;
    *(undefined8 *)(in_stack_00000178 + 0x90) = _UNK_0080c308;
    *(undefined8 *)(in_stack_00000178 + 0x8e) = uVar48;
    iVar18 = *(int *)((long)unaff_x20 + 0x104);
    if (iVar18 < 1) {
      iVar59 = iVar18 - ((uint)-iVar18 >> 1);
      if (iVar59 < 2) {
        iVar59 = 1;
      }
      iVar8 = 8;
      if (iVar18 != 0) {
        iVar8 = iVar59;
      }
      func_0x000eb9f0(_uStack0000000000000148,iVar8);
    }
    *(undefined4 *)(unaff_x20 + 0x20) = 1;
    func_0x000ef410(unaff_x20[0x55]);
    *(undefined4 *)(unaff_x20 + 0x38) = 0xffffffff;
    if (*(char *)((long)unaff_x20 + 0x3fc) != '\0') {
      *(undefined1 *)((long)unaff_x20 + 0x3fc) = 0;
      func_0x000c202c(unaff_x20[0x55] + 0x10,*(undefined4 *)((long)unaff_x20 + 0x3f4));
      func_0x000c21e8(unaff_x20[0x55] + 0x20,(int)unaff_x20[0x7f]);
      in_stack_00000178[0xfa] = 0;
      in_stack_00000178[0xf9] = 0;
    }
    if ((*(long *)(&UNK_00004d20 + in_stack_000001b8) != 0) &&
       ((in_stack_00000198 & 0x100000000) == 0 && (*(byte *)((long)unaff_x20 + 0x16) & 2) == 0)) {
      lVar36 = unaff_x20[1];
      iVar18 = _strcmp(unaff_x26,lVar36);
      if (iVar18 != 0) {
        *(long *)(unaff_x29 + -0xd8) = (long)(int)unaff_x20[0x10];
        lVar36 = func_0x000b81dc(lVar36,unaff_x29 + -0xd8,unaff_x26);
        unaff_x20[1] = lVar36;
        *(int *)(unaff_x20 + 0x10) = (int)*(undefined8 *)(unaff_x29 + -0xd8);
      }
    }
    pfVar3 = (float *)(unaff_x20 + 8);
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
    if ((in_stack_00000198._4_4_ != 0) && (!(bool)(bVar17 & bVar1))) {
      *(undefined1 *)((long)unaff_x20 + 0xe5) = 1;
    }
    uVar27 = 0;
    if ((uStack00000000000001b4 & 0x6000000) != 0) {
      uVar27 = in_stack_00000180._4_4_;
    }
    if ((uVar27 == 1) &&
       (*(undefined1 *)((long)unaff_x20 + 0xe5) = 1, (uStack00000000000001b4 >> 6 & 1) != 0)) {
      if (!bVar17) {
        *(undefined4 *)(unaff_x20 + 7) = 0;
        *(undefined4 *)(unaff_x20 + 6) = 0;
      }
      if (!bVar1) {
        *(undefined4 *)((long)unaff_x20 + 0x3c) = 0;
        *(undefined4 *)((long)unaff_x20 + 0x34) = 0;
      }
      pfVar3[0] = 0.0;
      pfVar3[1] = 0.0;
      unaff_x20[9] = 0;
    }
    lVar36 = lRam0000000000a334c0;
    lVar28 = **(long **)(&UNK_00004b10 + lRam0000000000a334c0);
    unaff_x20[4] = lVar28;
    *(long **)(lVar36 + 0x4000) = unaff_x20;
    if ((int)unaff_x20[0x38] == -1) {
      lVar29 = 0;
    }
    else {
      lVar29 = *(long *)(&UNK_00004e40 + lVar36) + (long)(int)unaff_x20[0x38] * 0x250;
    }
    *(long *)(&UNK_00004e18 + lVar36) = lVar29;
    lVar38 = *unaff_x20;
    fVar72 = *(float *)(unaff_x20 + 0x54);
    fVar43 = *(float *)(&UNK_00003d3c + lVar38) * fVar72;
    lVar35 = unaff_x20[0x6f];
    if (lVar35 != 0) {
      fVar43 = fVar43 * *(float *)(lVar35 + 0x2a0);
    }
    *(float *)(&UNK_00003d50 + lVar36) = fVar43;
    *(float *)(&UNK_00003d38 + lVar36) = fVar43;
    if (lVar29 == 0) {
      *(bool *)(unaff_x20 + 0x2e) = unaff_x20[0x37] == 0;
      if ((uStack00000000000001b4 >> 0x18 & 1) == 0) goto LAB_000ca7ac;
code_r0x000ca71c:
      fVar53 = *(float *)(&UNK_00003918 + in_stack_000001b8);
      *(float *)((long)unaff_x20 + 100) = fVar53;
      lVar29 = *(long *)(&UNK_000038f0 + in_stack_000001b8);
      unaff_x20[0xb] = lVar29;
      fVar43 = (float)lVar29;
      if ((uStack00000000000001b4 & 0x5000000) == 0x1000000) {
        bVar15 = false;
        if (((*(byte *)(unaff_x20 + 3) >> 1 & 1) == 0) && (fVar53 == 0.0)) {
          fVar43 = 0.0;
          uVar54 = 0;
          if ((uStack00000000000001b4 >> 10 & 1) != 0) {
            uVar54 = *(undefined4 *)(&UNK_000038f4 + in_stack_000001b8);
          }
          bVar15 = false;
          *(undefined4 *)(unaff_x20 + 0xb) = 0;
          *(undefined4 *)((long)unaff_x20 + 0x5c) = uVar54;
        }
      }
      else {
        bVar15 = true;
      }
    }
    else {
      *(undefined1 *)(unaff_x20 + 0x2e) = 0;
      if ((uStack00000000000001b4 >> 0x18 & 1) != 0) goto code_r0x000ca71c;
LAB_000ca7ac:
      puVar25 = &UNK_00003920;
      if ((uStack00000000000001b4 & 0x8000000) != 0 || (uStack00000000000001b4 & 0x6000000) == 0) {
        puVar25 = &UNK_000038fc;
      }
      *(undefined4 *)((long)unaff_x20 + 100) = *(undefined4 *)(puVar25 + in_stack_000001b8);
      lVar29 = *(long *)(&UNK_000038f0 + in_stack_000001b8);
      unaff_x20[0xb] = lVar29;
      fVar43 = (float)lVar29;
      bVar15 = true;
    }
    if (fVar43 < *(float *)(&UNK_00003934 + in_stack_000001b8)) {
      fVar43 = *(float *)(&UNK_00003934 + in_stack_000001b8);
    }
    if (fVar43 < (float)in_stack_000001a8[0x19]) {
      fVar43 = (float)in_stack_000001a8[0x19];
    }
    *(float *)((long)unaff_x20 + 0x174) = fVar43;
    fVar43 = (float)in_stack_000001a8[0x1a];
    *(float *)(unaff_x20 + 0x2f) = fVar43;
    if ((uStack00000000000001b4 & 0x21) == 0) {
      fVar73 = *(float *)(unaff_x20 + 7);
      fVar55 = *(float *)(unaff_x20 + 5);
      fVar53 = *(float *)((long)unaff_x20 + 0x2c);
      fVar75 = 0.0;
      uVar27 = *(uint *)((long)unaff_x20 + 0x14);
      if ((uVar27 & 1) == 0) {
        fVar75 = *(float *)(&UNK_00003d3c + lVar38) * fVar72;
        if (lVar35 != 0) {
          fVar75 = fVar75 * *(float *)(lVar35 + 0x2a0);
        }
        fVar75 = fVar75 + *(float *)(&UNK_00003928 + lVar38) * 2.0;
      }
      *(float *)(unaff_x29 + -0xd8) = fVar55;
      *(float *)(unaff_x29 + -0xd4) = fVar53;
      *(float *)(unaff_x29 + -0xd0) = fVar55 + fVar73;
      *(float *)(unaff_x29 + -0xcc) = fVar53 + fVar75;
      if ((((*(long **)(&UNK_00004008 + in_stack_000001b8) == unaff_x20) &&
           (*(int *)((long)in_stack_00000190 + 0x6a4) == 0)) && ((int)in_stack_00000190[0xd5] == 0))
         && ((iVar18 = func_0x000c2af4(unaff_x29 + -0xd8,unaff_x29 + -0xd0,1), iVar18 != 0 &&
             (*(short *)(&UNK_0000386a + in_stack_000001b8) == 2)))) {
        *(undefined1 *)((long)unaff_x20 + 0xc2) = 1;
      }
      uStack0000000000000148 = in_stack_00000198._4_4_;
      if (*(char *)((long)unaff_x20 + 0xc2) != '\0') {
        bVar13 = *(byte *)((long)unaff_x20 + 0xc1);
        *(byte *)((long)unaff_x20 + 0xc1) = bVar13 ^ 1;
        if (bVar13 != 0) {
          uStack0000000000000148 = 1;
        }
        if (((uVar27 >> 8 & 1) == 0) && (*(float *)(&UNK_00005f5c + lVar36) <= 0.0)) {
          *(float *)(&UNK_00005f5c + lVar36) = *(float *)(lVar36 + 0x1c);
        }
      }
    }
    else {
      *(undefined1 *)((long)unaff_x20 + 0xc1) = 0;
      uVar27 = *(uint *)((long)unaff_x20 + 0x14);
      uStack0000000000000148 = in_stack_00000198._4_4_;
    }
    *(undefined1 *)((long)unaff_x20 + 0xc2) = 0;
    fVar73 = *(float *)((long)unaff_x20 + 0xb4);
    fVar75 = *(float *)(unaff_x20 + 0x17);
    *(undefined4 *)(unaff_x20 + 0xd) = 0;
    fVar55 = 0.0;
    fVar53 = 0.0;
    *(undefined4 *)(unaff_x20 + 0xe) = 0;
    if ((uVar27 & 1) == 0) {
      fVar53 = *(float *)(&UNK_00003d3c + lVar38) * fVar72;
      if (lVar35 != 0) {
        fVar53 = fVar53 * *(float *)(lVar35 + 0x2a0);
      }
      fVar53 = fVar53 + *(float *)(&UNK_00003928 + lVar38) * 2.0;
    }
    if ((uVar27 >> 10 & 1) != 0) {
      fVar72 = *(float *)(&UNK_00003d3c + lVar38) * fVar72;
      if (lVar35 != 0) {
        fVar72 = fVar72 * *(float *)(lVar35 + 0x2a0);
      }
      fVar55 = fVar43 + fVar72 + *(float *)(&UNK_00003928 + lVar38) * 2.0;
    }
    *(float *)((long)unaff_x20 + 0x6c) = fVar53 + fVar55;
    *(undefined4 *)((long)unaff_x20 + 0x74) = 0;
    *(undefined4 *)((long)unaff_x20 + 0xb4) = 0;
    *(undefined4 *)(unaff_x20 + 0x17) = 0;
    fVar43 = (float)func_0x000d1a10();
    uStack0000000000000140 = in_stack_00000198._4_4_;
    if (((uStack00000000000001b4 >> 6 & 1) == 0) || (*(char *)((long)unaff_x20 + 0xc1) != '\0')) {
      if (*(char *)((long)unaff_x20 + 0xdc) < '\x01') {
        if (*(char *)((long)unaff_x20 + 0xdd) < '\x01') {
          goto code_r0x000caaa4;
        }
      }
      else if (!bVar17) {
        fVar72 = fVar43;
        if ((*(char *)((long)unaff_x20 + 0xde) != '\0') &&
           (fVar72 = *(float *)(unaff_x20 + 7), *(float *)(unaff_x20 + 7) < fVar43)) {
          fVar72 = fVar43;
        }
        *(float *)(unaff_x20 + 7) = fVar72;
        uStack0000000000000140 = 1;
      }
      if ((!bVar1) && ('\0' < *(char *)((long)unaff_x20 + 0xdd))) {
        fVar43 = fVar55;
        if ((*(char *)((long)unaff_x20 + 0xde) != '\0') &&
           (fVar43 = *(float *)((long)unaff_x20 + 0x3c), *(float *)((long)unaff_x20 + 0x3c) < fVar55
           )) {
          fVar43 = fVar55;
        }
        *(float *)((long)unaff_x20 + 0x3c) = fVar43;
        uStack0000000000000148 = 1;
      }
      if (((*(char *)((long)unaff_x20 + 0xc1) == '\0') &&
          ((*(byte *)((long)unaff_x20 + 0x15) & 1) == 0)) &&
         (*(float *)(&UNK_00005f5c + lRam0000000000a334c0) <= 0.0)) {
        *(float *)(&UNK_00005f5c + lRam0000000000a334c0) = *(float *)(lRam0000000000a334c0 + 0x1c);
      }
    }
    else {
      if (!bVar17) {
        *(float *)(unaff_x20 + 7) = fVar43;
        uStack0000000000000140 = 1;
      }
      if (!bVar1) {
        *(float *)((long)unaff_x20 + 0x3c) = fVar55;
        uStack0000000000000148 = 1;
      }
    }
code_r0x000caaa4:
    fVar43 = (float)func_0x000d1c94();
    uVar27 = uStack00000000000001b4 >> 0x18 & 1;
    *(float *)(unaff_x20 + 7) = fVar43;
    *(float *)((long)unaff_x20 + 0x3c) = fVar55;
    if (*(char *)((long)unaff_x20 + 0xc1) == '\0') {
      uVar27 = 1;
    }
    if (uVar27 == 0) {
      fVar72 = 0.0;
      if ((*(byte *)((long)unaff_x20 + 0x14) & 1) == 0) {
        fVar72 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
        if (unaff_x20[0x6f] != 0) {
          fVar72 = fVar72 * *(float *)(unaff_x20[0x6f] + 0x2a0);
        }
        fVar72 = fVar72 + *(float *)(&UNK_00003928 + *unaff_x20) * 2.0;
      }
      *(float *)(unaff_x20 + 6) = (fVar43 + *(float *)(unaff_x20 + 5)) - *(float *)(unaff_x20 + 5);
      *(float *)((long)unaff_x20 + 0x34) =
           (*(float *)((long)unaff_x20 + 0x2c) + fVar72) - *(float *)((long)unaff_x20 + 0x2c);
    }
    else {
      *(float *)(unaff_x20 + 6) = fVar43;
      *(float *)((long)unaff_x20 + 0x34) = fVar55;
    }
    if (in_stack_00000180._4_4_ != 0) {
      *(undefined4 *)(unaff_x20 + 0x1c) = 0xffffffff;
      uVar27 = uVar39;
      if ((uStack00000000000001b4 & 0xc000000) != 0x4000000) {
        uVar27 = 1;
      }
      if (uVar27 == 0) {
        unaff_x20[5] = *(long *)(*(long *)(&UNK_00004ae8 + in_stack_000001b8) +
                                 (long)(int)*puVar32 * 0x38 + -0x14);
      }
    }
    uStack0000000000000170 = uStack00000000000001b4 & 0x3000000;
    uVar27 = uStack00000000000001b4 >> 0x1a & 1;
    if ((uStack00000000000001b4 >> 0x18 & 1) != 0) {
      iVar18 = *(int *)(lVar34 + 0x1a0);
      *(short *)(unaff_x20 + 0x1a) = (short)iVar18;
      if (iVar18 == *(int *)(lVar34 + 0x1a4)) {
        if (iVar18 == 0) {
          iVar59 = 8;
        }
        else {
          iVar59 = iVar18;
          if (iVar18 < 0) {
            iVar59 = iVar18 + 1;
          }
          iVar59 = iVar18 + (iVar59 >> 1);
        }
        if (iVar59 <= iVar18 + 1) {
          iVar59 = iVar18 + 1;
        }
        func_0x000cef5c((int *)(lVar34 + 0x1a0),iVar59);
        iVar18 = *(int *)(lVar34 + 0x1a0);
      }
      *(long **)(*(long *)(lVar34 + 0x1a8) + (long)iVar18 * 8) = unaff_x20;
      *(int *)(lVar34 + 0x1a0) = *(int *)(lVar34 + 0x1a0) + 1;
      if ((uVar39 == 0 && uVar27 == 0) && (uStack0000000000000170 != 0x3000000)) {
        unaff_x20[5] = *(long *)(lVar34 + 0x110);
      }
    }
    uVar21 = uStack00000000000001b4;
    fVar43 = *(float *)((long)unaff_x20 + 0xec);
    uVar54 = 0x7f7fffff;
    if ((fVar43 == 3.4028235e+38) || (*(char *)((long)unaff_x20 + 0xe5) != '\0')) {
      if ((uStack00000000000001b4 >> 0x1c & 1) == 0) {
        uVar31 = uVar39;
        if ((uStack00000000000001b4 & 0x4000000) == 0) {
          uVar31 = 1;
        }
        if ((uVar31 != 0) || (cVar14 < '\x01')) {
          uVar31 = uVar39;
          if ((uStack00000000000001b4 & 0x2000000) == 0) {
            uVar31 = 1;
          }
          if ((uVar31 != 0) || (uStack0000000000000170 == 0x3000000)) goto code_r0x000cac7c;
        }
      }
      uVar44 = func_0x000d2410();
      *(undefined4 *)(unaff_x20 + 5) = uVar44;
      *(undefined4 *)((long)unaff_x20 + 0x2c) = uVar54;
    }
    else {
      *(undefined8 *)((long)unaff_x20 + 0xec) = 0x7f7fffff7f7fffff;
      lVar29 = unaff_x20[5];
      *(uint *)(unaff_x20 + 0x1d) = *(uint *)(unaff_x20 + 0x1d) & 0xfffffff1;
      lVar36 = NEON_scvtf(CONCAT44((int)(*(float *)(unaff_x20 + 0x1e) -
                                        (float)((ulong)unaff_x20[6] >> 0x20) *
                                        (float)((ulong)*(undefined8 *)((long)unaff_x20 + 0xf4) >>
                                               0x20)),
                                   (int)(fVar43 - (float)unaff_x20[6] *
                                                  (float)*(undefined8 *)((long)unaff_x20 + 0xf4))),4
                         );
      unaff_x20[5] = lVar36;
      fVar43 = (float)lVar36 - (float)lVar29;
      fVar72 = (float)((ulong)lVar36 >> 0x20) - (float)((ulong)lVar29 >> 0x20);
      if ((fVar43 != 0.0) || (fVar72 != 0.0)) {
        if (((*(byte *)((long)unaff_x20 + 0x15) & 1) == 0) &&
           (*(float *)(&UNK_00005f5c + lRam0000000000a334c0) <= 0.0)) {
          *(float *)(&UNK_00005f5c + lRam0000000000a334c0) = *(float *)(lRam0000000000a334c0 + 0x1c)
          ;
        }
        unaff_x20[0x22] =
             CONCAT44(fVar72 + (float)((ulong)unaff_x20[0x22] >> 0x20),
                      fVar43 + (float)unaff_x20[0x22]);
        unaff_x20[0x26] =
             CONCAT44(fVar72 + (float)((ulong)unaff_x20[0x26] >> 0x20),
                      fVar43 + (float)unaff_x20[0x26]);
        unaff_x20[0x25] =
             CONCAT44(fVar72 + (float)((ulong)unaff_x20[0x25] >> 0x20),
                      fVar43 + (float)unaff_x20[0x25]);
        unaff_x20[0x24] =
             CONCAT44(fVar72 + (float)((ulong)unaff_x20[0x24] >> 0x20),
                      fVar43 + (float)unaff_x20[0x24]);
      }
    }
code_r0x000cac7c:
    uStack00000000000001e0._0_4_ = *(float *)(lVar28 + 4);
    uStack00000000000001e0._4_4_ = *(float *)(lVar28 + 8);
    fStack00000000000001e8 = (float)uStack00000000000001e0 + *(float *)(lVar28 + 0xc);
    fStack00000000000001ec = uStack00000000000001e0._4_4_ + *(float *)(lVar28 + 0x10);
    fVar72 = (float)*(undefined8 *)(lVar28 + 0x14);
    fVar55 = (float)((ulong)*(undefined8 *)(lVar28 + 0x14) >> 0x20);
    uVar70 = *in_stack_00000190;
    uVar71 = in_stack_00000190[1];
    uVar70 = uVar70 ^ (uVar70 ^ uVar71) &
                      ~CONCAT44(-(uint)((float)(uVar71 >> 0x20) <= (float)(uVar70 >> 0x20)),
                                -(uint)((float)uVar71 <= (float)uVar70));
    fVar65 = (float)uVar70;
    fVar53 = fVar72 + fVar65;
    fVar68 = (float)(uVar70 >> 0x20);
    fVar43 = fVar55 + fVar68;
    fVar65 = (fVar72 + (float)*(undefined8 *)(lVar28 + 0x1c)) - fVar65;
    fVar68 = (fVar55 + (float)((ulong)*(undefined8 *)(lVar28 + 0x1c) >> 0x20)) - fVar68;
    uVar70 = CONCAT44(fVar68,fVar65);
    if ((((uVar39 | (uVar21 & 0x1000000) >> 0x18) == 1) ||
        (fStack00000000000001e8 - (float)uStack00000000000001e0 <= 0.0)) ||
       (fStack00000000000001ec - uStack00000000000001e0._4_4_ <= 0.0)) {
      lVar36 = unaff_x20[5];
      lVar36 = NEON_scvtf(CONCAT44((int)(float)((ulong)lVar36 >> 0x20),(int)(float)lVar36),4);
      unaff_x20[5] = lVar36;
      if ((uVar21 >> 0x18 & 1) == 0) goto code_r0x000cad88;
      puVar25 = &UNK_00003914;
    }
    else {
      fVar72 = *(float *)((long)unaff_x20 + 0x34);
      if ((*(char *)(lRam0000000000a334c0 + 0x5f) != '\0') &&
         ((*(byte *)((long)unaff_x20 + 0x14) & 1) == 0)) {
        fVar72 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
        if (unaff_x20[0x6f] != 0) {
          fVar72 = fVar72 * *(float *)(unaff_x20[0x6f] + 0x2a0);
        }
        fVar72 = fVar72 + *(float *)(&UNK_00003928 + *unaff_x20) * 2.0;
      }
      uVar62 = unaff_x20[5];
      uVar71 = CONCAT44(fVar43 - fVar72,fVar53 - *(float *)(unaff_x20 + 6));
      fVar55 = (float)(uVar62 >> 0x20);
      uVar71 = uVar71 ^ (uVar71 ^ uVar62 ^ (uVar62 ^ uVar70) &
                                           CONCAT44(-(uint)(fVar68 < fVar55),
                                                    -(uint)(fVar65 < (float)uVar62))) &
                        ~CONCAT44(-(uint)(fVar55 < fVar43 - fVar72),
                                  -(uint)((float)uVar62 < fVar53 - *(float *)(unaff_x20 + 6)));
      uVar71 = NEON_scvtf(CONCAT44((int)(float)(uVar71 >> 0x20),(int)(float)uVar71),4);
      unaff_x20[5] = uVar71;
code_r0x000cad88:
      if ((uVar21 & 0xc000000) == 0x4000000) {
        puVar25 = &UNK_0000391c;
      }
      else {
        puVar25 = &UNK_000038f8;
      }
    }
    pfStack0000000000000108 = (float *)(unaff_x20 + 5);
    fVar72 = *(float *)(puVar25 + in_stack_000001b8);
    *(float *)(unaff_x20 + 0xc) = fVar72;
    uVar31 = in_stack_00000180._4_4_ ^ 1 | (uVar21 & 0x1000) >> 0xc;
    uVar39 = uVar31 ^ 1;
    if (uVar31 == 0 && uVar27 == 0) {
      uVar39 = (uint)(uStack0000000000000170 == 0);
    }
    *(undefined8 *)(unaff_x29 + -0xb0) = 0;
    *(undefined8 *)(unaff_x29 + -0xa8) = 0;
    lVar36 = lRam0000000000a334c0;
    uVar27 = *(uint *)((long)unaff_x20 + 0x14);
    if ((uVar27 >> 0x18 & 1) == 0) {
      uStack000000000000013c = 1;
      if (*(char *)(in_stack_000001b8 + 0x5e) != '\0') {
        uStack000000000000013c = 2;
      }
    }
    else {
      uStack000000000000013c = 0;
    }
    fVar55 = *(float *)(&UNK_00003d38 + in_stack_000001b8) * 1.1;
    fVar72 = fVar72 + 1.0;
    fVar65 = fVar72 + *(float *)(&UNK_00003d38 + in_stack_000001b8) * 0.2;
    if (fVar55 < fVar65) {
      fVar55 = fVar65;
    }
    if (((*(char *)((long)unaff_x20 + 0xc1) == '\0') && ((uVar27 & 0x42) == 0)) &&
       ((*(char *)((long)unaff_x20 + 0xdc) < '\x01' &&
        ((*(char *)((long)unaff_x20 + 0xdd) < '\x01' && (*(char *)((long)unaff_x20 + 0xbf) != '\0'))
        )))) {
      fVar65 = *(float *)(&UNK_00003d38 + lRam0000000000a334c0) * 1.35;
      fVar72 = fVar72 + *(float *)(&UNK_00003d38 + lRam0000000000a334c0) * 0.2;
      if (fVar65 < fVar72) {
        fVar65 = fVar72;
      }
      fVar72 = 0.0;
      if (*(char *)(lRam0000000000a334c0 + 0x5e) != '\0') {
        fVar72 = 4.0;
      }
      uVar21 = (uint)(*(char *)(lRam0000000000a334c0 + 0x5f) == '\0');
      if ((uVar27 & 1) == 0 && uVar21 == 0) {
        fVar68 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
        if (unaff_x20[0x6f] != 0) {
          fVar68 = fVar68 * *(float *)(unaff_x20[0x6f] + 0x2a0);
        }
        fVar43 = fVar43 - (fVar68 + *(float *)(&UNK_00003928 + *unaff_x20) * 2.0);
      }
      *(undefined4 *)(unaff_x29 + -0xe4) = 0x7f7fffff;
      *(undefined4 *)(unaff_x20 + 0x2d) = 1;
      func_0x000d4e10("#RESIZE");
      pfVar37 = (float *)(&UNK_00004d40 + lVar36);
      fVar65 = (float)(int)((float)(int)fVar65 * 0.75);
      if (uStack000000000000013c == 0) {
        uStack00000000000000c4 = 0;
        uStack0000000000000070 = 0x7f7fffff7f7fffff;
        fVar68 = 3.4028235e+38;
      }
      else {
        uVar71 = 0;
        uStack00000000000000c4 = 0;
        puVar22 = (undefined8 *)&UNK_0080c9e8;
        uStack0000000000000070 = 0x7f7fffff7f7fffff;
        uStack00000000000000a0 = 0x7f7fffff;
        fVar68 = 3.4028235e+38;
        do {
          fVar46 = (float)unaff_x20[5];
          fVar66 = (float)((ulong)unaff_x20[5] >> 0x20);
          fVar69 = (float)puVar22[-1];
          fVar64 = (float)((ulong)puVar22[-1] >> 0x20);
          fVar46 = fVar46 + fVar69 * ((fVar46 + (float)unaff_x20[6]) - fVar46);
          fVar66 = fVar66 + fVar64 * ((fVar66 + (float)((ulong)unaff_x20[6] >> 0x20)) - fVar66);
          fVar77 = (float)*puVar22;
          fVar74 = fVar77 * fVar72;
          fVar78 = (float)((ulong)*puVar22 >> 0x20);
          fVar76 = fVar78 * fVar72;
          fVar56 = fVar46 - fVar74;
          fVar45 = fVar66 - fVar76;
          fVar46 = fVar46 + fVar77 * fVar65;
          fVar66 = fVar66 + fVar78 * fVar65;
          *(ulong *)(unaff_x29 + -0xd8) = CONCAT44(fVar45,fVar56);
          *(ulong *)(unaff_x29 + -0xd0) = CONCAT44(fVar66,fVar46);
          if (fVar46 < fVar56) {
            *(float *)(unaff_x29 + -0xd8) = fVar46;
            *(float *)(unaff_x29 + -0xd0) = fVar56;
          }
          uVar62 = (ulong)(uint)fVar66;
          if (fVar66 < fVar45) {
            *(float *)(unaff_x29 + -0xd4) = fVar66;
            *(float *)(unaff_x29 + -0xcc) = fVar45;
          }
          uVar31 = *(uint *)(unaff_x20[0x21] + (long)(int)unaff_x20[0x20] * 4 + -4);
          uVar40 = (uint)uVar71;
          uVar31 = *(uint *)(&UNK_0080c404 + (ulong)((uVar31 ^ uVar40 ^ 0xffffffff) & 0xff) * 4) ^
                   ~uVar31 >> 8;
          uVar31 = *(uint *)(&UNK_0080c404 + (ulong)((uVar31 ^ uVar40 >> 8) & 0xff) * 4) ^
                   uVar31 >> 8;
          uVar31 = *(uint *)(&UNK_0080c404 + (ulong)((uVar31 ^ uVar40 >> 0x10) & 0xff) * 4) ^
                   uVar31 >> 8;
          uVar31 = *(uint *)(&UNK_0080c404 + (ulong)(uVar31 & 0xff ^ uVar40 >> 0x18) * 4) ^
                   uVar31 >> 8 ^ 0xffffffff;
          if (*(uint *)(&UNK_0000404c + *unaff_x20) == uVar31) {
            func_0x000c167c(uVar31,4,uVar71,0);
          }
          func_0x000d0e24(unaff_x29 + -0xd8,uVar31,0,8);
          func_0x0010b53c(unaff_x29 + -0xd8,uVar31,&uStack00000000000001d0,&uStack00000000000001c0,
                          &UNK_00040800);
          if ((char)uStack00000000000001d0 != '\0' || (char)uStack00000000000001c0 != '\0') {
            uVar54 = 5;
            if ((uVar71 & 1) == 0) {
              uVar54 = 6;
            }
            *(undefined4 *)(&UNK_00004ee8 + lVar36) = uVar54;
            if ((char)uStack00000000000001c0 != '\0') {
              if ((&UNK_00003865)[lVar36] == '\0') {
                uVar67 = CONCAT44(-(uint)(fVar64 == 0.0),-(uint)(fVar69 == 0.0));
                uVar63 = CONCAT44(fVar43,0xff7fffff) ^
                         (CONCAT44(fVar43,0xff7fffff) ^ CONCAT44(0xff7fffff,fVar53)) &
                         CONCAT44(-(uint)((int)(((uint)(fVar64 != 1.0) &
                                                (uVar27 | uVar21 | (uint)(fVar64 != 0.0))) << 0x1f)
                                         < 0),-(uint)((int)((uint)(fVar69 == 1.0) << 0x1f) < 0));
                uVar62 = (uVar70 ^ 0x7f7fffff7f7fffff) & uVar67 ^ 0x7f7fffff7f7fffff;
                fVar68 = fVar74 + fVar69 * (fVar77 * -fVar65 - fVar74) +
                         ((float)*(undefined8 *)(lVar36 + 0xe40) -
                         (float)*(undefined8 *)(&UNK_00004078 + lVar36));
                fVar56 = fVar76 + fVar64 * (fVar78 * -fVar65 - fVar76) +
                         ((float)((ulong)*(undefined8 *)(lVar36 + 0xe40) >> 0x20) -
                         (float)((ulong)*(undefined8 *)(&UNK_00004078 + lVar36) >> 0x20));
                uVar62 = CONCAT44(fVar56,fVar68) ^
                         (CONCAT44(fVar56,fVar68) ^ uVar62) &
                         CONCAT44(-(uint)((float)(uVar62 >> 0x20) < fVar56),
                                  -(uint)((float)uVar62 < fVar68));
                uVar62 = uVar62 ^ (uVar62 ^ uVar63) &
                                  CONCAT44(-(uint)(fVar56 < (float)(uVar63 >> 0x20)),
                                           -(uint)(fVar68 < (float)uVar63));
                fVar68 = (float)unaff_x20[5];
                fVar66 = (float)uVar62;
                fVar45 = (float)((ulong)unaff_x20[5] >> 0x20);
                fVar76 = (float)(uVar62 >> 0x20);
                fVar56 = fVar68 + (float)unaff_x20[6];
                fVar46 = fVar45 + (float)((ulong)unaff_x20[6] >> 0x20);
                fVar74 = fVar66 + fVar69 * (fVar68 - fVar66);
                fVar45 = fVar76 + fVar64 * (fVar45 - fVar76);
                fVar56 = fVar56 + fVar69 * (fVar66 - fVar56);
                fVar46 = fVar46 + fVar64 * (fVar76 - fVar46);
                uStack00000000000000a0 = CONCAT44(fVar46,fVar56);
                fVar68 = (float)func_0x000d1c94();
                uVar67 = CONCAT44((float)uStack00000000000000a0 - (fVar46 - fVar45),
                                  fVar68 - (fVar56 - fVar74)) & uVar67;
                uStack0000000000000070 =
                     CONCAT44(fVar45 - (float)(uVar67 >> 0x20),fVar74 - (float)uVar67);
              }
              else {
                fVar68 = (float)func_0x000d1c94();
                func_0x000c23ac(0,0);
                uStack00000000000000c4 = 3;
                uStack00000000000000a0 = uVar62;
              }
            }
          }
          if (((uVar71 == 0) || (((uint)(float)uStack00000000000001c0 & 0xff) != 0)) ||
             ((char)uStack00000000000001d0 != '\0')) {
            lVar28 = 0x1e;
            if ((char)uStack00000000000001d0 != '\0') {
              lVar28 = 0x1f;
            }
            if (((uint)(float)uStack00000000000001c0 & 0xff) != 0) {
              lVar28 = 0x20;
            }
            lVar28 = lVar28 * 0x10 + lRam0000000000a334c0;
            fVar45 = *(float *)(&UNK_000038e8 + lVar28 + 0xe4);
            fVar46 = *(float *)(&UNK_000038e8 + lVar28 + 0xe8);
            fVar66 = *(float *)(&UNK_000038e8 + lVar28 + 0xec);
            fVar56 = 1.0;
            if (fVar45 <= 1.0) {
              fVar56 = fVar45;
            }
            fVar69 = 0.0;
            if (0.0 <= fVar45) {
              fVar69 = fVar56;
            }
            fVar45 = *(float *)(&UNK_000038e8 + lVar28 + 0xf0) *
                     *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
            fVar56 = 1.0;
            if (fVar46 <= 1.0) {
              fVar56 = fVar46;
            }
            fVar64 = 0.0;
            if (0.0 <= fVar46) {
              fVar64 = fVar56;
            }
            iVar18 = -(uint)(fVar66 < 0.0);
            iVar59 = -(uint)(fVar45 < 0.0);
            uVar62 = NEON_fmov(0x3f800000,4);
            uVar62 = uVar62 ^ (uVar62 ^ CONCAT44(fVar45,fVar66)) &
                              ~CONCAT44(-(uint)((float)(uVar62 >> 0x20) < fVar45),
                                        -(uint)((float)uVar62 < fVar66));
            fVar56 = (float)CONCAT13((byte)(uVar62 >> 0x18) & ~(byte)((uint)iVar18 >> 0x18),
                                     CONCAT12((byte)(uVar62 >> 0x10) & ~(byte)((uint)iVar18 >> 0x10)
                                              ,CONCAT11((byte)(uVar62 >> 8) &
                                                        ~(byte)((uint)iVar18 >> 8),
                                                        (byte)uVar62 & ~(byte)iVar18)));
            uVar48 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar62 >> 0x38) &
                                                               ~(byte)((uint)iVar59 >> 0x18),
                                                               CONCAT16((byte)(uVar62 >> 0x30) &
                                                                        ~(byte)((uint)iVar59 >> 0x10
                                                                               ),CONCAT15((byte)(
                                                  uVar62 >> 0x28) & ~(byte)((uint)iVar59 >> 8),
                                                  CONCAT14((byte)(uVar62 >> 0x20) & ~(byte)iVar59,
                                                           fVar56)))) >> 0x20) * 255.0 + 0.5),
                                        (int)(fVar56 * 255.0 + 0.5)),_UNK_0080c190,4);
            *(uint *)(unaff_x29 + -0xb0 + uVar71 * 4) =
                 (int)(fVar69 * 255.0 + 0.5) | (int)(fVar64 * 255.0 + 0.5) << 8 | (uint)uVar48 |
                 (uint)((ulong)uVar48 >> 0x20);
          }
          uVar71 = uVar71 + 1;
          puVar22 = puVar22 + 3;
        } while (uStack000000000000013c != uVar71);
        *(int *)(unaff_x29 + -0xe4) = (int)uStack00000000000000a0;
      }
      *(float *)(unaff_x29 + -0xe8) = fVar68;
      lVar28 = lRam0000000000a334c0;
      if ((*(byte *)((long)unaff_x20 + 0x17) & 1) == 0) {
        uVar27 = 0;
        if (*(char *)(lVar36 + 0x5e) != '\0') {
          uVar27 = 0xf;
        }
      }
      else {
        uVar27 = *(uint *)(unaff_x20 + 3) >> 1 & 2 | *(uint *)(unaff_x20 + 3) & 8;
      }
      uVar70 = 0;
      fVar72 = (float)((ulong)uStack0000000000000070 >> 0x20);
      do {
        if ((uVar27 >> (ulong)((uint)uVar70 & 0x1f) & 1) != 0) {
                    /* WARNING: Could not recover jumptable at 0x000cd5f0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(code *)(&UNK_000cd5f4 + (ulong)(byte)(&UNK_0080c3c0)[uVar70 & 0xffffffff] * 4))();
          return;
        }
        uVar70 = uVar70 + 1;
      } while (uVar70 != 4);
      *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) =
           *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) + -1;
      *(undefined4 *)(unaff_x20 + 0x2d) = 0;
      if ((*(long *)(&UNK_00004d10 + lVar36) != 0) &&
         (*(long **)(*(long *)(&UNK_00004d10 + lVar36) + 0x388) == unaff_x20)) {
        if (*(int *)(&UNK_00004b64 + lVar36) == 3) {
          puVar25 = &UNK_00003670;
          fVar65 = *(float *)(&UNK_00003650 + lVar28) - *(float *)(&UNK_00003640 + lVar28);
          puVar33 = &UNK_00003660;
code_r0x000cdb50:
          fVar68 = *(float *)(puVar25 + lVar28) - *(float *)(puVar33 + lVar28);
        }
        else {
          fVar65 = 0.0;
          if (*(int *)(&UNK_00004b64 + lVar36) == 2) {
            fVar68 = 0.0;
            if (*(char *)(lVar36 + 0xe5d) != '\0') {
              puVar25 = &UNK_00002eb0;
              fVar65 = *(float *)(&UNK_00002e90 + lVar28) - *(float *)(&UNK_00002e80 + lVar28);
              puVar33 = &UNK_00002ea0;
              goto code_r0x000cdb50;
            }
          }
          else {
            fVar68 = 0.0;
          }
        }
        if ((fVar65 != 0.0) || (fVar68 != 0.0)) {
          fVar56 = *(float *)(lVar36 + 0x50);
          if (*(float *)(lVar36 + 0x54) <= *(float *)(lVar36 + 0x50)) {
            fVar56 = *(float *)(lVar36 + 0x54);
          }
          fVar56 = *(float *)(lVar36 + 0x18) * 600.0 * fVar56;
          fVar65 = *pfVar37 + fVar65 * fVar56;
          fVar68 = *(float *)(&UNK_00004d44 + lVar36) + fVar68 * fVar56;
          *pfVar37 = fVar65;
          *(float *)(&UNK_00004d44 + lVar36) = fVar68;
          fVar53 = (fVar53 - *(float *)(unaff_x20 + 5)) - *(float *)(unaff_x20 + 6);
          fVar43 = (fVar43 - *(float *)((long)unaff_x20 + 0x2c)) -
                   *(float *)((long)unaff_x20 + 0x34);
          if (fVar65 < fVar53) {
            fVar65 = fVar53;
          }
          if (fVar68 < fVar43) {
            fVar68 = fVar43;
          }
          *pfVar37 = fVar65;
          *(float *)(&UNK_00004d44 + lVar36) = fVar68;
          (&UNK_00004d30)[lVar36] = 0;
          (&UNK_00004b7b)[lVar36] = 1;
          uVar54 = func_0x000bba44(0x3f800000,0x20);
          *(undefined4 *)(unaff_x29 + -0xb0) = uVar54;
          if ((int)fVar65 != 0 || (int)fVar68 != 0) {
            fVar53 = (float)(int)fVar68;
            fVar43 = *(float *)((long)unaff_x20 + 0x3c) + fVar53;
            uVar54 = func_0x000d1c94();
            *(undefined4 *)(unaff_x29 + -0xe8) = uVar54;
            *(float *)(unaff_x29 + -0xe4) = fVar43;
            *pfVar37 = *pfVar37 - (float)(int)fVar65;
            *(float *)(&UNK_00004d44 + lVar36) = *(float *)(&UNK_00004d44 + lVar36) - fVar53;
          }
        }
      }
      fVar53 = *(float *)(unaff_x20 + 7);
      fVar65 = *(float *)(unaff_x29 + -0xe8);
      fVar43 = fVar53;
      if (fVar65 != 3.4028235e+38) {
        bVar17 = false;
        if ((*(float *)(unaff_x20 + 6) == fVar65) && (bVar17 = false, !NAN(fVar53) && !NAN(fVar65)))
        {
          bVar17 = fVar53 == fVar65;
        }
        if (!bVar17) {
          *(float *)(unaff_x20 + 7) = fVar65;
          *(float *)(unaff_x20 + 6) = fVar65;
          fVar43 = fVar65;
        }
      }
      fVar56 = *(float *)((long)unaff_x20 + 0x3c);
      fVar68 = *(float *)(unaff_x29 + -0xe4);
      fVar65 = fVar56;
      if (fVar68 != 3.4028235e+38) {
        bVar17 = false;
        if ((*(float *)((long)unaff_x20 + 0x34) == fVar68) &&
           (bVar17 = false, !NAN(fVar56) && !NAN(fVar68))) {
          bVar17 = fVar56 == fVar68;
        }
        if (!bVar17) {
          *(float *)((long)unaff_x20 + 0x3c) = fVar68;
          *(float *)((long)unaff_x20 + 0x34) = fVar68;
          fVar65 = fVar68;
        }
      }
      fVar46 = *(float *)(unaff_x20 + 5);
      fVar45 = *(float *)((long)unaff_x20 + 0x2c);
      fVar68 = fVar46;
      if (((float)uStack0000000000000070 != 3.4028235e+38) &&
         (fVar66 = (float)(int)(float)uStack0000000000000070, fVar46 != fVar66)) {
        *pfStack0000000000000108 = fVar66;
        fVar68 = fVar66;
      }
      fVar66 = fVar45;
      if ((fVar72 != 3.4028235e+38) && (fVar72 = (float)(int)fVar72, fVar45 != fVar72)) {
        *(float *)((long)unaff_x20 + 0x2c) = fVar72;
        fVar66 = fVar72;
      }
      if (((((fVar46 != fVar68) || (fVar45 != fVar66)) || (fVar53 != fVar43)) || (fVar56 != fVar65))
         && (((*(byte *)((long)unaff_x20 + 0x15) & 1) == 0 &&
             (*(float *)(&UNK_00005f5c + lRam0000000000a334c0) <= 0.0)))) {
        *(float *)(&UNK_00005f5c + lRam0000000000a334c0) = *(float *)(lRam0000000000a334c0 + 0x1c);
      }
      uVar21 = uStack00000000000001b4;
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
      fVar72 = 0.0;
      fVar43 = 0.0;
      if ((in_stack_00000198 & 0x100000000) == 0) {
        fVar72 = *(float *)(unaff_x20 + 0xb) + *(float *)(unaff_x20 + 0xb) +
                 *(float *)(unaff_x20 + 8);
        fVar43 = *(float *)((long)unaff_x20 + 0x5c) + *(float *)((long)unaff_x20 + 0x5c) +
                 *(float *)((long)unaff_x20 + 0x44);
      }
      if ((uStack0000000000000140 & 1) == 0) {
        uStack00000000000001c8._0_4_ =
             fVar73 + (*(float *)(unaff_x20 + 0x42) - *(float *)(unaff_x20 + 0x41));
      }
      fVar53 = *(float *)((long)unaff_x20 + 0x3c) -
               (*(float *)((long)unaff_x20 + 0x6c) + *(float *)((long)unaff_x20 + 0x74));
      if (uStack0000000000000148 == 0) {
        fVar53 = fVar75 + (*(float *)((long)unaff_x20 + 0x214) - *(float *)((long)unaff_x20 + 0x20c)
                          );
      }
      if ((uVar21 >> 0xe & 1) == 0) {
        uVar27 = uVar21 & 8;
        bVar17 = uVar27 == 0 && fVar53 < fVar43;
        *(bool *)((long)unaff_x20 + 0xbd) = bVar17;
        if ((uVar21 >> 0xf & 1) == 0) {
          if (bVar17) goto code_r0x000cb014;
          if (!(fVar72 <= (float)uStack00000000000001c8 - 0.0 || (uVar21 & 8) != 0))
          goto code_r0x000caf38;
code_r0x000cb030:
          uVar31 = 0;
          *(undefined1 *)((long)unaff_x20 + 0xbc) = 0;
        }
        else {
          uVar31 = 1;
          *(undefined1 *)((long)unaff_x20 + 0xbc) = 1;
          if (!bVar17) {
code_r0x000cb048:
            bVar17 = fVar53 < fVar43 && uVar27 == 0;
            *(bool *)((long)unaff_x20 + 0xbd) = bVar17;
            uVar31 = 1;
          }
        }
code_r0x000cb05c:
        if (bVar17) {
          fVar43 = *(float *)(&UNK_0000395c + in_stack_000001b8);
        }
        else {
          fVar43 = 0.0;
        }
        if (uVar31 != 0) goto code_r0x000cb06c;
        fVar72 = 0.0;
      }
      else {
        *(undefined1 *)((long)unaff_x20 + 0xbd) = 1;
        if ((uVar21 >> 0xf & 1) == 0) {
code_r0x000cb014:
          bVar17 = true;
          if (!((float)uStack00000000000001c8 - *(float *)(&UNK_0000395c + in_stack_000001b8) <
                fVar72 && (uVar21 & 8) == 0)) goto code_r0x000cb030;
code_r0x000caf38:
          uVar31 = (uVar21 & 0x800) >> 0xb;
          *(char *)((long)unaff_x20 + 0xbc) = (char)uVar31;
          bVar1 = bVar17;
          if ((uVar21 & 0x800) == 0) {
            bVar1 = true;
          }
          if (!bVar1) {
            uVar27 = 0;
            goto code_r0x000cb048;
          }
          goto code_r0x000cb05c;
        }
        *(undefined1 *)((long)unaff_x20 + 0xbc) = 1;
        fVar43 = *(float *)(&UNK_0000395c + in_stack_000001b8);
code_r0x000cb06c:
        fVar72 = *(float *)(&UNK_0000395c + in_stack_000001b8);
      }
      *(float *)((long)unaff_x20 + 0xb4) = fVar43;
      *(float *)(unaff_x20 + 0x17) = fVar72;
      *(float *)(unaff_x20 + 0xe) = fVar43 + *(float *)(unaff_x20 + 0xe);
      *(float *)((long)unaff_x20 + 0x74) = *(float *)((long)unaff_x20 + 0x74) + fVar72;
      uStack00000000000001c8._0_4_ = *(float *)(unaff_x20 + 7);
    }
    if (uStack0000000000000170 == 0x3000000) {
      bVar15 = true;
    }
    puVar10 = &uStack00000000000001e0;
    if (!bVar15) {
      puVar10 = (ulong *)(lVar34 + 0x248);
    }
    in_stack_000001d8 = puVar10[1];
    uVar70 = *puVar10;
    uStack00000000000001c0._0_4_ = *(float *)(unaff_x20 + 5);
    uStack00000000000001c0._4_4_ = *(float *)((long)unaff_x20 + 0x2c);
    fVar43 = (float)unaff_x20[6];
    fVar72 = (float)uStack00000000000001c0 + fVar43;
    fVar53 = uStack00000000000001c0._4_4_ + (float)((ulong)unaff_x20[6] >> 0x20);
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
    fVar75 = *pfVar37;
    *(float *)((long)unaff_x20 + 0x1fc) = uStack00000000000001c0._4_4_;
    *(float *)((long)unaff_x20 + 0x204) = fVar53;
    uStack00000000000001d0._0_4_ = (float)uVar70;
    uStack00000000000001d0._4_4_ = (float)(uVar70 >> 0x20);
    fVar73 = (float)uStack00000000000001c0;
    if ((float)uStack00000000000001c0 < (float)uStack00000000000001d0) {
      fVar73 = (float)uStack00000000000001d0;
    }
    fVar65 = uStack00000000000001c0._4_4_;
    if (uStack00000000000001c0._4_4_ < uStack00000000000001d0._4_4_) {
      fVar65 = uStack00000000000001d0._4_4_;
    }
    *(float *)(unaff_x20 + 0x3f) = fVar73;
    *(float *)((long)unaff_x20 + 0x1fc) = fVar65;
    fVar68 = (float)in_stack_000001d8;
    fVar56 = (float)(in_stack_000001d8 >> 0x20);
    unaff_x20[0x40] =
         in_stack_000001d8 ^
         (in_stack_000001d8 ^ CONCAT44(fVar53,fVar72)) &
         CONCAT44(-(uint)(fVar53 < fVar56),-(uint)(fVar72 < fVar68));
    fVar73 = (float)uStack00000000000001c0 + (float)unaff_x20[0xd];
    fVar65 = uStack00000000000001c0._4_4_ + (float)((ulong)unaff_x20[0xd] >> 0x20);
    fVar72 = fVar72 - (float)unaff_x20[0xe];
    fVar53 = fVar53 - (float)((ulong)unaff_x20[0xe] >> 0x20);
    *(ulong *)(in_stack_00000178 + 0x80) = CONCAT44(fVar53,fVar72);
    *(ulong *)(in_stack_00000178 + 0x7e) = CONCAT44(fVar65,fVar73);
    pfVar42 = pfVar37;
    if ((uVar21 & 0x401) != 1) {
      pfVar42 = (float *)(&UNK_00003930 + in_stack_000001b8);
    }
    fVar45 = (float)(int)(*(float *)(unaff_x20 + 0xb) * 0.5);
    if ((float)(int)(*(float *)(unaff_x20 + 0xb) * 0.5) < fVar75) {
      fVar45 = fVar75;
    }
    uVar62 = NEON_scvtf(CONCAT44((int)(fVar65 + 0.5 + *pfVar42),(int)(fVar73 + 0.5 + fVar45)),4);
    fVar46 = (float)(uVar62 >> 0x20);
    *(float *)((long)unaff_x20 + 0x21c) = fVar46;
    uVar71 = NEON_scvtf(CONCAT44((int)((fVar53 + 0.5) - fVar75),(int)((fVar72 + 0.5) - fVar45)),4);
    fVar75 = (float)(uVar71 >> 0x20);
    *(float *)((long)unaff_x20 + 0x224) = fVar75;
    uVar67 = uVar62 ^ (uVar62 ^ in_stack_000001d8) &
                      CONCAT44(-(uint)(fVar56 < fVar46),-(uint)(fVar68 < (float)uVar62));
    unaff_x20[0x43] =
         uVar67 ^ (uVar67 ^ uVar70) &
                  CONCAT44(-(uint)(fVar46 < uStack00000000000001d0._4_4_),
                           -(uint)((float)uVar62 < (float)uStack00000000000001d0));
    uVar62 = uVar71 ^ (uVar71 ^ in_stack_000001d8) &
                      CONCAT44(-(uint)(fVar56 < fVar75),-(uint)(fVar68 < (float)uVar71));
    unaff_x20[0x44] =
         uVar62 ^ (uVar62 ^ uVar70) &
                  CONCAT44(-(uint)(fVar75 < uStack00000000000001d0._4_4_),
                           -(uint)((float)uVar71 < (float)uStack00000000000001d0));
    if ((((uVar21 >> 6 & 1) != 0) || (fVar43 <= 0.0)) || ((uVar21 >> 0x19 & 1) != 0)) {
      fVar43 = *(float *)(&UNK_00003d38 + in_stack_000001b8) * 16.0;
    }
    else {
      fVar43 = fVar43 * 0.65;
    }
    *(float *)(unaff_x20 + 0x4f) = (float)(int)fVar43;
    fVar43 = ((float)unaff_x20[8] + (float)unaff_x20[0xb] * 2.0) - (fVar72 - fVar73);
    fVar72 = ((float)((ulong)unaff_x20[8] >> 0x20) + (float)((ulong)unaff_x20[0xb] >> 0x20) * 2.0) -
             (fVar53 - fVar65);
    iVar18 = -(uint)(fVar43 <= 0.0);
    iVar59 = -(uint)(fVar72 <= 0.0);
    *(ulong *)((long)unaff_x20 + 0x94) =
         CONCAT17((byte)((uint)fVar72 >> 0x18) & ~(byte)((uint)iVar59 >> 0x18),
                  CONCAT16((byte)((uint)fVar72 >> 0x10) & ~(byte)((uint)iVar59 >> 0x10),
                           CONCAT15((byte)((uint)fVar72 >> 8) & ~(byte)((uint)iVar59 >> 8),
                                    CONCAT14(SUB41(fVar72,0) & ~(byte)iVar59,
                                             CONCAT13((byte)((uint)fVar43 >> 0x18) &
                                                      ~(byte)((uint)iVar18 >> 0x18),
                                                      CONCAT12((byte)((uint)fVar43 >> 0x10) &
                                                               ~(byte)((uint)iVar18 >> 0x10),
                                                               CONCAT11((byte)((uint)fVar43 >> 8) &
                                                                        ~(byte)((uint)iVar18 >> 8),
                                                                        SUB41(fVar43,0) &
                                                                        ~(byte)iVar18)))))));
    uStack00000000000001d0 = uVar70;
    uVar54 = func_0x000d2840();
    *(undefined4 *)((long)unaff_x20 + 0x8c) = uVar54;
    *(int *)(unaff_x20 + 0x12) = iVar18;
    *(undefined8 *)((long)unaff_x20 + 0x9c) = 0x7f7fffff7f7fffff;
    unaff_x20[0xf] = 0;
    func_0x000f0b5c(unaff_x20[0x55],
                    *(undefined8 *)
                     (*(long *)(*(long *)(&UNK_00003d30 + in_stack_000001b8) + 0x40) + 8));
    lVar28 = *(long *)(lRam0000000000a334c0 + 0x4000);
    *(undefined1 *)(lVar28 + 0xc0) = 1;
    func_0x000f0930(*(undefined8 *)(lVar28 + 0x2a8),&uStack00000000000001d0,
                    (ulong)&uStack00000000000001d0 | 8,0);
    lVar36 = *(long *)(*(long *)(lVar28 + 0x2a8) + 0x60) +
             (long)*(int *)(*(long *)(lVar28 + 0x2a8) + 0x58) * 0x10;
    uVar48 = *(undefined8 *)(lVar36 + -0x10);
    *(undefined8 *)(lVar28 + 0x250) = *(undefined8 *)(lVar36 + -8);
    *(undefined8 *)(lVar28 + 0x248) = uVar48;
    if (bVar15) {
      bVar1 = false;
    }
    else {
      if ((*(int *)(lVar34 + 0x1a0) < 2) ||
         (lVar36 = *(long *)(*(long *)(lVar34 + 0x1a8) + (ulong)(*(int *)(lVar34 + 0x1a0) - 2) * 8),
         lVar36 == 0)) {
        bVar17 = false;
      }
      else {
        bVar17 = false;
        if ((*(float *)((long)unaff_x20 + 0x2c) <
             *(float *)(lVar36 + 0x2c) + *(float *)(lVar36 + 0x34)) &&
           (*(float *)(lVar36 + 0x2c) <
            *(float *)((long)unaff_x20 + 0x2c) + *(float *)((long)unaff_x20 + 0x34))) {
          if (*(float *)(unaff_x20 + 5) < *(float *)(lVar36 + 0x28) + *(float *)(lVar36 + 0x30)) {
            bVar17 = *(float *)(lVar36 + 0x28) <
                     *(float *)(unaff_x20 + 5) + *(float *)(unaff_x20 + 6);
          }
        }
      }
      bVar1 = false;
      if (((*(int *)(*(long *)((int *)unaff_x20[0x55] + 2) + (long)*(int *)unaff_x20[0x55] * 0x38 +
                    -0x18) == 0) && (*(int *)(*(long *)(lVar34 + 0x2a8) + 0x20) != 0)) && (!bVar17))
      {
        unaff_x20[0x55] = *(long *)(lVar34 + 0x2a8);
        bVar1 = true;
      }
    }
    lVar36 = lRam0000000000a334c0;
    lVar28 = *(long *)(&UNK_00004d10 + in_stack_000001b8);
    if (lVar28 == 0) {
      lVar28 = *(long *)(&UNK_00004b18 + in_stack_000001b8);
      if ((uVar39 & 1) == 0) goto code_r0x000cb408;
code_r0x000cb3f4:
      bVar17 = true;
    }
    else {
      if ((uVar39 & 1) != 0) goto code_r0x000cb3f4;
code_r0x000cb408:
      if (lVar28 == 0) {
        bVar17 = false;
      }
      else {
        bVar17 = unaff_x20[0x73] == *(long *)(lVar28 + 0x398);
      }
    }
    pbVar6 = &UNK_000049f8 + lRam0000000000a334c0;
    uVar27 = *(uint *)((long)unaff_x20 + 0x14);
    *(undefined1 *)((long)unaff_x20 + 0xc3) = 0;
    fVar43 = *(float *)(unaff_x20 + 0xc);
    fVar72 = *(float *)((long)unaff_x20 + 100);
    if (*(char *)((long)unaff_x20 + 0xc1) == '\0') {
      if ((uVar27 >> 7 & 1) == 0) {
        lVar28 = 2;
        if ((uVar27 & 0x1000000) != 0) {
          lVar28 = 3;
        }
        if ((uVar27 & 0x6000000) != 0) {
          lVar28 = 4;
        }
        lVar28 = lVar28 * 0x10 + lVar36;
        fVar73 = *(float *)(&UNK_000038e8 + lVar28 + 0xe4);
        fVar75 = *(float *)(&UNK_000038e8 + lVar28 + 0xf0) * *(float *)(&UNK_000038e8 + lVar36);
        fVar53 = 1.0;
        if (fVar73 <= 1.0) {
          fVar53 = fVar73;
        }
        fVar68 = 0.0;
        fVar65 = 0.0;
        if (0.0 <= fVar73) {
          fVar65 = fVar53;
        }
        uVar70 = *(ulong *)(&UNK_000038e8 + lVar28 + 0xe8);
        uVar71 = NEON_fmov(0x3f800000,4);
        fVar53 = (float)(uVar70 >> 0x20);
        uVar71 = uVar71 ^ (uVar71 ^ uVar70) &
                          ~CONCAT44(-(uint)((float)(uVar71 >> 0x20) < fVar53),
                                    -(uint)((float)uVar71 < (float)uVar70));
        iVar18 = -(uint)((float)uVar70 < 0.0);
        iVar59 = -(uint)(fVar53 < 0.0);
        fVar53 = (float)CONCAT13((byte)(uVar71 >> 0x18) & ~(byte)((uint)iVar18 >> 0x18),
                                 CONCAT12((byte)(uVar71 >> 0x10) & ~(byte)((uint)iVar18 >> 0x10),
                                          CONCAT11((byte)(uVar71 >> 8) & ~(byte)((uint)iVar18 >> 8),
                                                   (byte)uVar71 & ~(byte)iVar18)));
        uVar48 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar71 >> 0x38) &
                                                           ~(byte)((uint)iVar59 >> 0x18),
                                                           CONCAT16((byte)(uVar71 >> 0x30) &
                                                                    ~(byte)((uint)iVar59 >> 0x10),
                                                                    CONCAT15((byte)(uVar71 >> 0x28)
                                                                             & ~(byte)((uint)iVar59
                                                                                      >> 8),
                                                                             CONCAT14((byte)(uVar71 
                                                  >> 0x20) & ~(byte)iVar59,fVar53)))) >> 0x20) *
                                          255.0 + 0.5),(int)(fVar53 * 255.0 + 0.5)),_UNK_0080c188,4)
        ;
        uVar21 = (uint)uVar48 | (int)(fVar65 * 255.0 + 0.5) | (uint)((ulong)uVar48 >> 0x20);
        fVar53 = 1.0;
        if (fVar75 <= 1.0) {
          fVar53 = fVar75;
        }
        fVar73 = 0.0;
        if (0.0 <= fVar75) {
          fVar73 = fVar53;
        }
        if ((*pbVar6 >> 6 & 1) == 0) {
          uVar21 = uVar21 | (int)(fVar73 * 255.0 + 0.5) << 0x18;
          lVar28 = unaff_x20[0x55];
          if ((uVar27 & 1) != 0) goto code_r0x000cb54c;
code_r0x000cb67c:
          fVar68 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
          if (unaff_x20[0x6f] != 0) {
            fVar68 = fVar68 * *(float *)(unaff_x20[0x6f] + 0x2a0);
          }
          fVar68 = fVar68 + *(float *)(&UNK_00003928 + *unaff_x20) * 2.0;
          uVar48 = 0xc0;
        }
        else {
          fVar73 = *(float *)(&UNK_00004a58 + lVar36);
          fVar53 = 1.0;
          if (fVar73 <= 1.0) {
            fVar53 = fVar73;
          }
          fVar75 = 0.0;
          if (0.0 <= fVar73) {
            fVar75 = fVar53;
          }
          uVar21 = uVar21 & 0xffffff | (int)(fVar75 * 255.0 + 0.5) << 0x18;
          lVar28 = unaff_x20[0x55];
          if ((uVar27 & 1) == 0) goto code_r0x000cb67c;
code_r0x000cb54c:
          uVar48 = 0;
        }
        fVar53 = *(float *)((long)unaff_x20 + 0x2c);
        lVar29 = unaff_x20[5];
        *(float *)(unaff_x29 + -0xd8) = *(float *)(unaff_x20 + 5) + 0.0;
        *(float *)(unaff_x29 + -0xd4) = fVar68 + fVar53;
        *(ulong *)(unaff_x29 + -0xe8) =
             CONCAT44((float)((ulong)lVar29 >> 0x20) + (float)((ulong)unaff_x20[6] >> 0x20),
                      (float)lVar29 + (float)unaff_x20[6]);
        func_0x000f3bb0(fVar43,lVar28,unaff_x29 + -0xd8,unaff_x29 + -0xe8,uVar21,uVar48);
      }
      if ((uVar27 & 1) == 0) {
        lVar28 = 0xb0;
        if (!bVar17) {
          lVar28 = 0xa0;
        }
        lVar28 = lRam0000000000a334c0 + lVar28;
        fVar73 = *(float *)(&UNK_000038e8 + lVar28 + 0xe4);
        fVar75 = *(float *)(&UNK_000038e8 + lVar28 + 0xe8);
        fVar65 = *(float *)(&UNK_000038e8 + lVar28 + 0xec);
        fVar53 = 1.0;
        if (fVar73 <= 1.0) {
          fVar53 = fVar73;
        }
        fVar68 = 0.0;
        if (0.0 <= fVar73) {
          fVar68 = fVar53;
        }
        fVar73 = *(float *)(&UNK_000038e8 + lVar28 + 0xf0) *
                 *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
        fVar53 = 1.0;
        if (fVar75 <= 1.0) {
          fVar53 = fVar75;
        }
        fVar56 = 0.0;
        if (0.0 <= fVar75) {
          fVar56 = fVar53;
        }
        iVar18 = -(uint)(fVar65 < 0.0);
        iVar59 = -(uint)(fVar73 < 0.0);
        uVar70 = NEON_fmov(0x3f800000,4);
        uVar70 = uVar70 ^ (uVar70 ^ CONCAT44(fVar73,fVar65)) &
                          ~CONCAT44(-(uint)((float)(uVar70 >> 0x20) < fVar73),
                                    -(uint)((float)uVar70 < fVar65));
        fVar53 = (float)CONCAT13((byte)(uVar70 >> 0x18) & ~(byte)((uint)iVar18 >> 0x18),
                                 CONCAT12((byte)(uVar70 >> 0x10) & ~(byte)((uint)iVar18 >> 0x10),
                                          CONCAT11((byte)(uVar70 >> 8) & ~(byte)((uint)iVar18 >> 8),
                                                   (byte)uVar70 & ~(byte)iVar18)));
        uVar48 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar70 >> 0x38) &
                                                           ~(byte)((uint)iVar59 >> 0x18),
                                                           CONCAT16((byte)(uVar70 >> 0x30) &
                                                                    ~(byte)((uint)iVar59 >> 0x10),
                                                                    CONCAT15((byte)(uVar70 >> 0x28)
                                                                             & ~(byte)((uint)iVar59
                                                                                      >> 8),
                                                                             CONCAT14((byte)(uVar70 
                                                  >> 0x20) & ~(byte)iVar59,fVar53)))) >> 0x20) *
                                          255.0 + 0.5),(int)(fVar53 * 255.0 + 0.5)),_UNK_0080c190,4)
        ;
        func_0x000f3bb0(fVar43,unaff_x20[0x55],&uStack00000000000001c0,&uStack00000000000001c8,
                        (int)(fVar68 * 255.0 + 0.5) | (int)(fVar56 * 255.0 + 0.5) << 8 |
                        (uint)uVar48 | (uint)((ulong)uVar48 >> 0x20),0x30);
      }
      if ((uVar27 >> 10 & 1) != 0) {
        fVar73 = 0.0;
        fVar53 = 0.0;
        if ((*(uint *)((long)unaff_x20 + 0x14) & 1) == 0) {
          fVar53 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
          if (unaff_x20[0x6f] != 0) {
            fVar53 = fVar53 * *(float *)(unaff_x20[0x6f] + 0x2a0);
          }
          fVar53 = fVar53 + *(float *)(&UNK_00003928 + *unaff_x20) * 2.0;
        }
        fVar65 = *(float *)(unaff_x20 + 5);
        fVar75 = *(float *)((long)unaff_x20 + 0x2c);
        if ((*(uint *)((long)unaff_x20 + 0x14) >> 10 & 1) != 0) {
          fVar73 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
          if (unaff_x20[0x6f] != 0) {
            fVar73 = fVar73 * *(float *)(unaff_x20[0x6f] + 0x2a0);
          }
          fVar73 = *(float *)(unaff_x20 + 0x2f) + fVar73 +
                   *(float *)(&UNK_00003928 + *unaff_x20) * 2.0;
        }
        fVar53 = fVar75 + fVar53;
        fVar56 = fVar75 + *(float *)((long)unaff_x20 + 0x34);
        fVar68 = fVar53;
        if (fVar53 < fVar75) {
          fVar68 = fVar75;
        }
        fVar75 = fVar65 + *(float *)(unaff_x20 + 7);
        if (fVar65 + *(float *)(unaff_x20 + 6) <= fVar65 + *(float *)(unaff_x20 + 7)) {
          fVar75 = fVar65 + *(float *)(unaff_x20 + 6);
        }
        fVar45 = fVar53 + fVar73;
        if (fVar56 <= fVar53 + fVar73) {
          fVar45 = fVar56;
        }
        lVar28 = unaff_x20[0x55];
        *(float *)(unaff_x29 + -0xd8) = fVar72 + fVar65;
        *(float *)(unaff_x29 + -0xd4) = fVar68 + 0.0;
        *(float *)(unaff_x29 + -0xe8) = fVar75 - fVar72;
        *(float *)(unaff_x29 + -0xe4) = fVar45;
        uVar48 = _UNK_0080c190;
        fVar73 = *(float *)(&UNK_00003a9c + lRam0000000000a334c0);
        fVar68 = *(float *)(&UNK_00003aa0 + lRam0000000000a334c0);
        fVar53 = 1.0;
        if (fVar73 <= 1.0) {
          fVar53 = fVar73;
        }
        fVar56 = 0.0;
        if (0.0 <= fVar73) {
          fVar56 = fVar53;
        }
        fVar73 = *(float *)(&UNK_00003aa8 + lRam0000000000a334c0) *
                 *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
        fVar46 = *(float *)(&UNK_00003aa4 + lRam0000000000a334c0);
        fVar53 = 1.0;
        if (fVar68 <= 1.0) {
          fVar53 = fVar68;
        }
        fVar66 = 0.0;
        if (0.0 <= fVar68) {
          fVar66 = fVar53;
        }
        iVar18 = -(uint)(fVar46 < 0.0);
        iVar59 = -(uint)(fVar73 < 0.0);
        uVar71 = NEON_fmov(0x3f800000,4);
        fVar68 = (float)(uVar71 >> 0x20);
        uVar70 = CONCAT44(fVar73,fVar46) ^
                 (CONCAT44(fVar73,fVar46) ^ uVar71) &
                 CONCAT44(-(uint)(fVar68 < fVar73),-(uint)((float)uVar71 < fVar46));
        fVar53 = (float)CONCAT13((byte)(uVar70 >> 0x18) & ~(byte)((uint)iVar18 >> 0x18),
                                 CONCAT12((byte)(uVar70 >> 0x10) & ~(byte)((uint)iVar18 >> 0x10),
                                          CONCAT11((byte)(uVar70 >> 8) & ~(byte)((uint)iVar18 >> 8),
                                                   (byte)uVar70 & ~(byte)iVar18)));
        uVar49 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar70 >> 0x38) &
                                                           ~(byte)((uint)iVar59 >> 0x18),
                                                           CONCAT16((byte)(uVar70 >> 0x30) &
                                                                    ~(byte)((uint)iVar59 >> 0x10),
                                                                    CONCAT15((byte)(uVar70 >> 0x28)
                                                                             & ~(byte)((uint)iVar59
                                                                                      >> 8),
                                                                             CONCAT14((byte)(uVar70 
                                                  >> 0x20) & ~(byte)iVar59,fVar53)))) >> 0x20) *
                                          255.0 + 0.5),(int)(fVar53 * 255.0 + 0.5)),_UNK_0080c190,4)
        ;
        fVar53 = 0.0;
        if ((uVar27 & 1) != 0) {
          fVar53 = fVar43;
        }
        func_0x000f3bb0(fVar53,lVar28,unaff_x29 + -0xd8,unaff_x29 + -0xe8,
                        (int)(fVar56 * 255.0 + 0.5) | (int)(fVar66 * 255.0 + 0.5) << 8 |
                        (uint)uVar49 | (uint)((ulong)uVar49 >> 0x20),0x30);
        if ((0.0 < *(float *)(&UNK_00003930 + lVar36)) &&
           (fVar45 < *(float *)((long)unaff_x20 + 0x2c) + *(float *)((long)unaff_x20 + 0x34))) {
          lVar36 = unaff_x20[0x55];
          *(float *)(unaff_x29 + -0xd8) = fVar65;
          *(float *)(unaff_x29 + -0xd4) = fVar45;
          *(float *)(unaff_x29 + -0xe8) = fVar75;
          *(float *)(unaff_x29 + -0xe4) = fVar45;
          fVar73 = *(float *)(&UNK_00003a1c + lRam0000000000a334c0);
          fVar75 = *(float *)(&UNK_00003a20 + lRam0000000000a334c0);
          fVar65 = *(float *)(&UNK_00003a28 + lRam0000000000a334c0) *
                   *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
          fVar53 = 1.0;
          if (fVar73 <= 1.0) {
            fVar53 = fVar73;
          }
          fVar56 = 0.0;
          if (0.0 <= fVar73) {
            fVar56 = fVar53;
          }
          fVar73 = *(float *)(&UNK_00003a24 + lRam0000000000a334c0);
          fVar53 = 1.0;
          if (fVar75 <= 1.0) {
            fVar53 = fVar75;
          }
          fVar45 = 0.0;
          if (0.0 <= fVar75) {
            fVar45 = fVar53;
          }
          iVar18 = -(uint)(fVar73 < 0.0);
          iVar59 = -(uint)(fVar65 < 0.0);
          uVar70 = CONCAT44(fVar65,fVar73) ^
                   (CONCAT44(fVar65,fVar73) ^ uVar71) &
                   CONCAT44(-(uint)(fVar68 < fVar65),-(uint)((float)uVar71 < fVar73));
          fVar53 = (float)CONCAT13((byte)(uVar70 >> 0x18) & ~(byte)((uint)iVar18 >> 0x18),
                                   CONCAT12((byte)(uVar70 >> 0x10) & ~(byte)((uint)iVar18 >> 0x10),
                                            CONCAT11((byte)(uVar70 >> 8) &
                                                     ~(byte)((uint)iVar18 >> 8),
                                                     (byte)uVar70 & ~(byte)iVar18)));
          uVar48 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar70 >> 0x38) &
                                                             ~(byte)((uint)iVar59 >> 0x18),
                                                             CONCAT16((byte)(uVar70 >> 0x30) &
                                                                      ~(byte)((uint)iVar59 >> 0x10),
                                                                      CONCAT15((byte)(uVar70 >> 0x28
                                                                                     ) & ~(byte)((
                                                  uint)iVar59 >> 8),
                                                  CONCAT14((byte)(uVar70 >> 0x20) & ~(byte)iVar59,
                                                           fVar53)))) >> 0x20) * 255.0 + 0.5),
                                      (int)(fVar53 * 255.0 + 0.5)),uVar48,4);
          func_0x000f397c(lVar36,unaff_x29 + -0xd8,unaff_x29 + -0xe8,
                          (int)(fVar56 * 255.0 + 0.5) | (int)(fVar45 * 255.0 + 0.5) << 8 |
                          (uint)uVar48 | (uint)((ulong)uVar48 >> 0x20));
        }
      }
      if (*(char *)((long)unaff_x20 + 0xbc) != '\0') {
        func_0x0010c5f4(0);
      }
      if (*(char *)((long)unaff_x20 + 0xbd) != '\0') {
        func_0x0010c5f4(1);
      }
      if ((uStack000000000000013c != 0) && ((uVar27 >> 1 & 1) == 0)) {
        uVar70 = 0;
        pfVar42 = (float *)&UNK_0080c9ec;
        do {
          uVar27 = *(uint *)(unaff_x29 + -0xb0 + uVar70 * 4);
          if ((uVar27 & 0xff000000) != 0) {
            fVar65 = *(float *)(unaff_x20 + 5);
            fVar68 = *(float *)((long)unaff_x20 + 0x2c);
            fVar56 = *(float *)(unaff_x20 + 6);
            fVar75 = *(float *)((long)unaff_x20 + 0x34);
            fVar46 = pfVar42[-3];
            fVar45 = pfVar42[-2];
            lVar36 = unaff_x20[0x55];
            fVar53 = (float)(int)fVar55;
            fVar73 = fVar72;
            if ((uVar70 & 1) != 0) {
              fVar53 = fVar72;
              fVar73 = (float)(int)fVar55;
            }
            fVar66 = pfVar42[-1];
            fVar69 = *pfVar42;
            piVar41 = (int *)(lVar36 + 0x78);
            iVar18 = *piVar41;
            if (iVar18 == *(int *)(lVar36 + 0x7c)) {
              iVar59 = iVar18;
              if (iVar18 < 0) {
                iVar59 = iVar18 + 1;
              }
              iVar8 = 8;
              if (iVar18 != 0) {
                iVar8 = iVar18 + (iVar59 >> 1);
              }
              if (iVar8 <= iVar18 + 1) {
                iVar8 = iVar18 + 1;
              }
              func_0x000cef5c(piVar41,iVar8);
              iVar18 = *piVar41;
            }
            fVar65 = fVar65 + fVar46 * ((fVar65 + fVar56) - fVar65);
            fVar68 = fVar68 + fVar45 * ((fVar68 + fVar75) - fVar68);
            pfVar2 = (float *)(*(long *)(lVar36 + 0x80) + (long)iVar18 * 8);
            *pfVar2 = fVar65 + fVar53 * fVar66;
            pfVar2[1] = fVar68 + fVar73 * fVar69;
            *(int *)(lVar36 + 0x78) = *(int *)(lVar36 + 0x78) + 1;
            lVar36 = unaff_x20[0x55];
            piVar41 = (int *)(lVar36 + 0x78);
            iVar18 = *piVar41;
            if (iVar18 == *(int *)(lVar36 + 0x7c)) {
              iVar59 = iVar18;
              if (iVar18 < 0) {
                iVar59 = iVar18 + 1;
              }
              iVar8 = 8;
              if (iVar18 != 0) {
                iVar8 = iVar18 + (iVar59 >> 1);
              }
              if (iVar8 <= iVar18 + 1) {
                iVar8 = iVar18 + 1;
              }
              func_0x000cef5c(piVar41,iVar8);
              iVar18 = *piVar41;
            }
            pfVar2 = (float *)(*(long *)(lVar36 + 0x80) + (long)iVar18 * 8);
            *pfVar2 = fVar65 + fVar73 * fVar66;
            pfVar2[1] = fVar68 + fVar53 * fVar69;
            *(int *)(lVar36 + 0x78) = *(int *)(lVar36 + 0x78) + 1;
            lVar36 = unaff_x20[0x55];
            *(float *)(unaff_x29 + -0xd8) = fVar65 + (fVar43 + fVar72) * fVar66;
            *(float *)(unaff_x29 + -0xd4) = fVar68 + (fVar43 + fVar72) * fVar69;
            func_0x000f23c0(fVar43,lVar36,unaff_x29 + -0xd8,pfVar42[1],pfVar42[2]);
            lVar36 = unaff_x20[0x55];
            func_0x000f1888(lVar36,*(undefined8 *)(lVar36 + 0x80),*(undefined4 *)(lVar36 + 0x78),
                            uVar27);
            *(undefined4 *)(lVar36 + 0x78) = 0;
          }
          uVar70 = uVar70 + 1;
          pfVar42 = pfVar42 + 6;
        } while (uStack000000000000013c != uVar70);
      }
      lVar36 = lRam0000000000a334c0;
      fVar75 = *pfVar37;
      fVar72 = *(float *)(&UNK_00003a1c + lRam0000000000a334c0);
      fVar53 = *(float *)(&UNK_00003a20 + lRam0000000000a334c0);
      fVar55 = *(float *)(&UNK_00003a24 + lRam0000000000a334c0);
      fVar73 = *(float *)(&UNK_00003a28 + lRam0000000000a334c0) *
               *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
      fVar43 = 1.0;
      if (fVar72 <= 1.0) {
        fVar43 = fVar72;
      }
      fVar65 = 0.0;
      if (0.0 <= fVar72) {
        fVar65 = fVar43;
      }
      fVar43 = 1.0;
      if (fVar53 <= 1.0) {
        fVar43 = fVar53;
      }
      fVar72 = 0.0;
      if (0.0 <= fVar53) {
        fVar72 = fVar43;
      }
      fVar43 = 1.0;
      if (fVar55 <= 1.0) {
        fVar43 = fVar55;
      }
      fVar53 = 0.0;
      if (0.0 <= fVar55) {
        fVar53 = fVar43;
      }
      fVar43 = 1.0;
      if (fVar73 <= 1.0) {
        fVar43 = fVar73;
      }
      fVar55 = 0.0;
      if (0.0 <= fVar73) {
        fVar55 = fVar43;
      }
      uVar27 = (int)(fVar65 * 255.0 + 0.5) | (int)(fVar72 * 255.0 + 0.5) << 8 |
               (int)(fVar53 * 255.0 + 0.5) << 0x10 | (int)(fVar55 * 255.0 + 0.5) << 0x18;
      if (0.0 < fVar75) {
        if (*(char *)((long)unaff_x20 + 0x14) < '\0') {
          uVar21 = *(uint *)(unaff_x20 + 3);
          if ((uVar21 >> 2 & 1) != 0) {
            fVar53 = *(float *)(unaff_x20 + 0xc);
            fVar43 = *(float *)(unaff_x20 + 5) + *(float *)(unaff_x20 + 6) + -1.0;
            fVar72 = fVar53 + *(float *)((long)unaff_x20 + 0x2c);
            lVar28 = unaff_x20[0x55];
            fVar55 = ((*(float *)((long)unaff_x20 + 0x2c) + *(float *)((long)unaff_x20 + 0x34) +
                      -1.0) - fVar53) - fVar72;
            fVar43 = (fVar43 + (fVar43 - fVar43) + 0.5) - fVar53;
            *(float *)(unaff_x29 + -0xd8) = fVar43;
            *(float *)(unaff_x29 + -0xd4) = fVar53 * 0.0 + fVar72 + fVar55 * 0.0 + 0.5;
            func_0x000f249c(fVar53,0xbf490fdb,0,lVar28,unaff_x29 + -0xd8,0);
            lVar28 = unaff_x20[0x55];
            *(float *)(unaff_x29 + -0xd8) = fVar43;
            *(float *)(unaff_x29 + -0xd4) = fVar53 * 0.0 + fVar72 + fVar55 + 0.5;
            func_0x000f249c(fVar53,0,0x3f490fdb,lVar28,unaff_x29 + -0xd8,0);
            lVar28 = unaff_x20[0x55];
            func_0x000f0ff4(fVar75,lVar28,*(undefined8 *)(lVar28 + 0x80),
                            *(undefined4 *)(lVar28 + 0x78),uVar27,0);
            *(undefined4 *)(lVar28 + 0x78) = 0;
            uVar21 = *(uint *)(unaff_x20 + 3);
          }
          if ((uVar21 >> 3 & 1) != 0) {
            fVar53 = *(float *)(unaff_x20 + 0xc);
            fVar43 = *(float *)((long)unaff_x20 + 0x2c) + *(float *)((long)unaff_x20 + 0x34) + -1.0;
            fVar72 = fVar53 + *(float *)(unaff_x20 + 5);
            lVar28 = unaff_x20[0x55];
            fVar55 = ((*(float *)(unaff_x20 + 5) + *(float *)(unaff_x20 + 6) + -1.0) - fVar53) -
                     fVar72;
            fVar43 = (fVar43 + (fVar43 - fVar43) + 0.5) - fVar53;
            *(float *)(unaff_x29 + -0xd8) = fVar53 * 0.0 + fVar72 + fVar55 + 0.5;
            *(float *)(unaff_x29 + -0xd4) = fVar43;
            func_0x000f249c(fVar53,0x3f490fdb,0x3fc90fdb,lVar28,unaff_x29 + -0xd8,0);
            lVar28 = unaff_x20[0x55];
            *(float *)(unaff_x29 + -0xd8) = fVar53 * 0.0 + fVar72 + fVar55 * 0.0 + 0.5;
            *(float *)(unaff_x29 + -0xd4) = fVar43;
            func_0x000f249c(fVar53,0x3fc90fdb,0x4016cbe4,lVar28,unaff_x29 + -0xd8,0);
            lVar28 = unaff_x20[0x55];
            func_0x000f0ff4(fVar75,lVar28,*(undefined8 *)(lVar28 + 0x80),
                            *(undefined4 *)(lVar28 + 0x78),uVar27,0);
            *(undefined4 *)(lVar28 + 0x78) = 0;
          }
        }
        else {
          lVar28 = unaff_x20[0x55];
          *(ulong *)(unaff_x29 + -0xd8) =
               CONCAT44((float)((ulong)unaff_x20[5] >> 0x20) + (float)((ulong)unaff_x20[6] >> 0x20),
                        (float)unaff_x20[5] + (float)unaff_x20[6]);
          func_0x000f3af4((int)unaff_x20[0xc],fVar75,lVar28,pfStack0000000000000108,
                          unaff_x29 + -0xd8,uVar27,0);
        }
      }
      bVar13 = *(byte *)((long)unaff_x20 + 0xca);
      if ((*(byte *)((long)unaff_x20 + 0xc9) == 0xff) && (bVar13 == 0xff)) {
        fVar43 = *(float *)(&UNK_00003930 + lVar36);
      }
      else {
        bVar26 = *(byte *)((long)unaff_x20 + 0xc9);
        if (bVar13 != 0xff) {
          bVar26 = bVar13;
        }
        lVar28 = 0x1c0;
        if (bVar13 != 0xff) {
          lVar28 = 0x1d0;
        }
        lVar28 = lVar28 + lRam0000000000a334c0;
        fVar72 = *(float *)(&UNK_000038e8 + lVar28 + 0xe4);
        fVar53 = *(float *)(&UNK_000038e8 + lVar28 + 0xe8);
        fVar55 = *(float *)(&UNK_000038e8 + lVar28 + 0xec);
        fVar73 = *(float *)(&UNK_000038e8 + lVar28 + 0xf0) *
                 *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
        fVar43 = 1.0;
        if (fVar72 <= 1.0) {
          fVar43 = fVar72;
        }
        fVar68 = 0.0;
        fVar65 = 0.0;
        if (0.0 <= fVar72) {
          fVar65 = fVar43;
        }
        fVar43 = 1.0;
        if (fVar53 <= 1.0) {
          fVar43 = fVar53;
        }
        fVar72 = 0.0;
        if (0.0 <= fVar53) {
          fVar72 = fVar43;
        }
        fVar43 = 1.0;
        if (fVar55 <= 1.0) {
          fVar43 = fVar55;
        }
        fVar53 = 0.0;
        if (0.0 <= fVar55) {
          fVar53 = fVar43;
        }
        fVar43 = 1.0;
        if (fVar73 <= 1.0) {
          fVar43 = fVar73;
        }
        fVar55 = 0.0;
        if (0.0 <= fVar73) {
          fVar55 = fVar43;
        }
        fVar73 = *(float *)(unaff_x20 + 0xc);
        fVar43 = 2.0;
        if (2.0 < *(float *)((long)unaff_x20 + 100)) {
          fVar43 = *(float *)((long)unaff_x20 + 100);
        }
        fVar46 = 0.0;
        fVar56 = 0.0;
        fVar45 = 0.0;
        if (bVar26 < 4) {
          fVar56 = *(float *)(unaff_x20 + 5);
          fVar45 = *(float *)((long)unaff_x20 + 0x2c);
          fVar46 = fVar56 + *(float *)(unaff_x20 + 6) + -1.0;
          fVar68 = fVar45 + *(float *)((long)unaff_x20 + 0x34) + -1.0;
          switch(bVar26) {
          case 0:
            fVar45 = fVar73 + fVar45;
            fVar46 = fVar56 + 0.0;
            fVar68 = fVar68 - fVar73;
            break;
          case 1:
            fVar45 = fVar73 + fVar45;
            fVar68 = fVar68 - fVar73;
            fVar56 = fVar46;
            break;
          case 2:
            fVar46 = fVar46 - fVar73;
            fVar68 = fVar45 + 0.0;
            fVar56 = fVar73 + fVar56;
            break;
          case 3:
            fVar46 = fVar46 - fVar73;
            fVar56 = fVar73 + fVar56;
            fVar45 = fVar68;
          }
        }
        lVar28 = (long)(int)(char)bVar26 * 0x1c;
        lVar29 = unaff_x20[0x55];
        fVar66 = *(float *)(&UNK_0080ca4c + lVar28);
        fVar69 = *(float *)(&UNK_0080ca40 + lVar28);
        fVar64 = *(float *)(&UNK_0080ca44 + lVar28);
        *(float *)(unaff_x29 + -0xd8) =
             fVar56 + *(float *)(&UNK_0080ca48 + lVar28) * (fVar46 - fVar56) + 0.5 + fVar73 * fVar69
        ;
        *(float *)(unaff_x29 + -0xd4) = fVar45 + fVar66 * (fVar68 - fVar45) + 0.5 + fVar73 * fVar64;
        fVar74 = *(float *)(&UNK_0080ca58 + lVar28);
        func_0x000f249c(fVar73,fVar74 + -0.7853982,fVar74,lVar29,unaff_x29 + -0xd8,0);
        lVar29 = unaff_x20[0x55];
        lVar28 = (long)(int)(char)bVar26 * 0x1c;
        fVar66 = *(float *)(&UNK_0080ca54 + lVar28);
        *(float *)(unaff_x29 + -0xd8) =
             fVar73 * fVar69 + fVar56 + *(float *)(&UNK_0080ca50 + lVar28) * (fVar46 - fVar56) + 0.5
        ;
        *(float *)(unaff_x29 + -0xd4) = fVar73 * fVar64 + fVar45 + fVar66 * (fVar68 - fVar45) + 0.5;
        func_0x000f249c(fVar73,fVar74,fVar74 + 0.7853982,lVar29,unaff_x29 + -0xd8,0);
        lVar28 = unaff_x20[0x55];
        func_0x000f0ff4(fVar43,lVar28,*(undefined8 *)(lVar28 + 0x80),*(undefined4 *)(lVar28 + 0x78),
                        (int)(fVar65 * 255.0 + 0.5) | (int)(fVar72 * 255.0 + 0.5) << 8 |
                        (int)(fVar53 * 255.0 + 0.5) << 0x10 | (int)(fVar55 * 255.0 + 0.5) << 0x18,0)
        ;
        *(undefined4 *)(lVar28 + 0x78) = 0;
        fVar43 = *(float *)(&UNK_00003930 + lVar36);
      }
      if ((0.0 < fVar43) && ((*(byte *)((long)unaff_x20 + 0x14) & 1) == 0)) {
        fVar43 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
        if (unaff_x20[0x6f] != 0) {
          fVar43 = fVar43 * *(float *)(unaff_x20[0x6f] + 0x2a0);
        }
        fVar43 = *(float *)((long)unaff_x20 + 0x2c) +
                 fVar43 + *(float *)(&UNK_00003928 + *unaff_x20) * 2.0 + -1.0;
        lVar36 = unaff_x20[0x55];
        fVar72 = *(float *)(unaff_x20 + 5);
        *(float *)(unaff_x29 + -0xd8) = fVar75 + fVar72;
        *(float *)(unaff_x29 + -0xd4) = fVar43;
        *(float *)(unaff_x29 + -0xe8) = (fVar72 + *(float *)(unaff_x20 + 6)) - fVar75;
        *(float *)(unaff_x29 + -0xe4) = fVar43;
        func_0x000f397c(lVar36,unaff_x29 + -0xd8,unaff_x29 + -0xe8,uVar27);
      }
    }
    else {
      uVar54 = *(undefined4 *)(&UNK_00003930 + lVar36);
      *(float *)(&UNK_00003930 + lVar36) = fVar72;
      if (bVar17) {
        lVar28 = 0xb;
        if ((&UNK_00004b7a)[lVar36] != '\0') {
          lVar28 = 0xc;
        }
      }
      else {
        lVar28 = 0xc;
      }
      lVar28 = lVar28 * 0x10 + lVar36;
      fVar53 = *(float *)(&UNK_000038e8 + lVar28 + 0xe4);
      fVar55 = *(float *)(&UNK_000038e8 + lVar28 + 0xe8);
      fVar72 = 1.0;
      if (fVar53 <= 1.0) {
        fVar72 = fVar53;
      }
      fVar73 = 0.0;
      if (0.0 <= fVar53) {
        fVar73 = fVar72;
      }
      fVar53 = *(float *)(&UNK_000038e8 + lVar28 + 0xec);
      fVar72 = 1.0;
      if (fVar55 <= 1.0) {
        fVar72 = fVar55;
      }
      fVar75 = 0.0;
      if (0.0 <= fVar55) {
        fVar75 = fVar72;
      }
      fVar72 = *(float *)(&UNK_000038e8 + lVar28 + 0xf0) * *(float *)(&UNK_000038e8 + lVar36);
      iVar18 = -(uint)(fVar53 < 0.0);
      iVar59 = -(uint)(fVar72 < 0.0);
      uVar70 = NEON_fmov(0x3f800000,4);
      uVar70 = uVar70 ^ (uVar70 ^ CONCAT44(fVar72,fVar53)) &
                        ~CONCAT44(-(uint)((float)(uVar70 >> 0x20) < fVar72),
                                  -(uint)((float)uVar70 < fVar53));
      fVar72 = (float)CONCAT13((byte)(uVar70 >> 0x18) & ~(byte)((uint)iVar18 >> 0x18),
                               CONCAT12((byte)(uVar70 >> 0x10) & ~(byte)((uint)iVar18 >> 0x10),
                                        CONCAT11((byte)(uVar70 >> 8) & ~(byte)((uint)iVar18 >> 8),
                                                 (byte)uVar70 & ~(byte)iVar18)));
      uVar48 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar70 >> 0x38) &
                                                         ~(byte)((uint)iVar59 >> 0x18),
                                                         CONCAT16((byte)(uVar70 >> 0x30) &
                                                                  ~(byte)((uint)iVar59 >> 0x10),
                                                                  CONCAT15((byte)(uVar70 >> 0x28) &
                                                                           ~(byte)((uint)iVar59 >> 8
                                                                                  ),CONCAT14((byte)(
                                                  uVar70 >> 0x20) & ~(byte)iVar59,fVar72)))) >> 0x20
                                               ) * 255.0 + 0.5),(int)(fVar72 * 255.0 + 0.5)),
                         _UNK_0080c190,4);
      func_0x000bcf14((float)uStack00000000000001c0,uStack00000000000001c0._4_4_,
                      (float)uStack00000000000001c8,uStack00000000000001c8._4_4_,fVar43,
                      (int)(fVar73 * 255.0 + 0.5) | (int)(fVar75 * 255.0 + 0.5) << 8 | (uint)uVar48
                      | (uint)((ulong)uVar48 >> 0x20),1);
      *(undefined4 *)(&UNK_00003930 + lVar36) = uVar54;
    }
    if (bVar1) {
      unaff_x20[0x55] = (long)(unaff_x20 + 0x56);
      fVar43 = *(float *)(unaff_x20 + 10);
      if (fVar43 == 0.0) goto code_r0x000cc264;
code_r0x000cc300:
      fVar53 = *(float *)((long)unaff_x20 + 0x54);
      fVar72 = fVar43;
      if (fVar53 != 0.0) goto code_r0x000cc30c;
code_r0x000cc2b4:
      fVar55 = 0.0;
      if ((uStack00000000000001b4 >> 3 & 1) == 0) {
        fVar55 = *(float *)((long)unaff_x20 + 0x44);
      }
      fVar75 = *(float *)((long)unaff_x20 + 0x5c);
      fVar73 = *(float *)((long)unaff_x20 + 0x6c);
      fVar65 = (*(float *)((long)unaff_x20 + 0x34) + fVar75 * -2.0) -
               (fVar73 + *(float *)((long)unaff_x20 + 0x74));
      if (fVar55 < fVar65) {
        fVar55 = fVar65;
      }
    }
    else {
      fVar43 = *(float *)(unaff_x20 + 10);
      if (fVar43 != 0.0) goto code_r0x000cc300;
code_r0x000cc264:
      fVar72 = 0.0;
      if ((uStack00000000000001b4 & 0x808) == 0x800) {
        fVar72 = *pfVar3;
      }
      fVar53 = (*(float *)(unaff_x20 + 6) + *(float *)(unaff_x20 + 0xb) * -2.0) -
               (*(float *)(unaff_x20 + 0xd) + *(float *)(unaff_x20 + 0xe));
      if (fVar72 < fVar53) {
        fVar72 = fVar53;
      }
      fVar53 = *(float *)((long)unaff_x20 + 0x54);
      if (fVar53 == 0.0) goto code_r0x000cc2b4;
code_r0x000cc30c:
      fVar75 = *(float *)((long)unaff_x20 + 0x5c);
      fVar73 = *(float *)((long)unaff_x20 + 0x6c);
      fVar55 = fVar53;
    }
    fVar68 = *(float *)(unaff_x20 + 0xb);
    fVar56 = (float)*(undefined8 *)((long)unaff_x20 + 0x8c);
    fVar45 = (float)((ulong)*(undefined8 *)((long)unaff_x20 + 0x8c) >> 0x20);
    fVar65 = *(float *)((long)unaff_x20 + 100);
    uVar70 = CONCAT44(fVar75,fVar68) ^
             (CONCAT44(fVar75,fVar68) ^ CONCAT44(fVar65,fVar65)) &
             ~CONCAT44(-(uint)(fVar65 <= fVar75),-(uint)(fVar65 <= fVar68));
    lVar36 = NEON_scvtf(CONCAT44((int)(((float)((ulong)unaff_x20[0x41] >> 0x20) - fVar45) +
                                      (float)(uVar70 >> 0x20)),
                                 (int)(((float)unaff_x20[0x41] - fVar56) + (float)uVar70)),4);
    unaff_x20[0x45] = lVar36;
    unaff_x20[0x46] = CONCAT44(fVar55 + (float)((ulong)lVar36 >> 0x20),fVar72 + (float)lVar36);
    unaff_x20[0x48] = unaff_x20[0x46];
    unaff_x20[0x47] = unaff_x20[0x45];
    fVar72 = *(float *)(unaff_x20 + 0xd);
    fVar65 = fVar72 + fVar68 + (*(float *)(unaff_x20 + 5) - fVar56);
    *(float *)(unaff_x20 + 0x4b) = fVar65;
    fVar55 = fVar73 + fVar75 + (*(float *)((long)unaff_x20 + 0x2c) - fVar45);
    *(float *)((long)unaff_x20 + 0x25c) = fVar55;
    if (fVar43 == 0.0) {
      *(float *)(unaff_x20 + 0x4c) =
           fVar65 + ((*(float *)(unaff_x20 + 6) + fVar68 * -2.0) -
                    (fVar72 + *(float *)(unaff_x20 + 0xe)));
    }
    else {
      *(float *)(unaff_x20 + 0x4c) = fVar65 + fVar43;
    }
    if (fVar53 == 0.0) {
      fVar53 = (*(float *)((long)unaff_x20 + 0x34) + fVar75 * -2.0) -
               (fVar73 + *(float *)((long)unaff_x20 + 0x74));
    }
    *(float *)((long)unaff_x20 + 0x264) = fVar55 + fVar53;
    *(float *)((long)unaff_x20 + 0x154) = (fVar68 + fVar72) - fVar56;
    unaff_x20[0x2b] = 0;
    fVar43 = ((fVar68 + *(float *)(unaff_x20 + 5)) - fVar56) + fVar72 + 0.0;
    fVar73 = ((fVar75 + *(float *)((long)unaff_x20 + 0x2c)) - fVar45) + fVar73;
    *(float *)(unaff_x20 + 0x24) = fVar43;
    *(float *)((long)unaff_x20 + 0x124) = fVar73;
    *(float *)(unaff_x20 + 0x2c) = fVar43 - fVar43;
    *(float *)((long)unaff_x20 + 0x164) = fVar73 - fVar73;
    lVar36 = unaff_x20[0x24];
    unaff_x20[0x22] = lVar36;
    unaff_x20[0x23] = lVar36;
    unaff_x20[0x25] = lVar36;
    unaff_x20[0x26] = lVar36;
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
                    in_stack_00000180._4_4_);
    unaff_x20[0x33] = 0;
    if (*(int *)((long)unaff_x20 + 0x1a4) < 0) {
      func_0x000cef5c(unaff_x20 + 0x34,0);
    }
    *(undefined4 *)(unaff_x20 + 0x34) = 0;
    unaff_x20[0x36] = (long)(unaff_x20 + 0x50);
    unaff_x20[0x37] = 0;
    uVar54 = 1;
    *(undefined4 *)((long)unaff_x20 + 0x1c4) = 1;
    if (lVar34 != 0) {
      uVar54 = *(undefined4 *)(lVar34 + 0x1c4);
    }
    *(undefined4 *)(unaff_x20 + 0x39) = uVar54;
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
    lVar36 = lRam0000000000a334c0;
    fVar43 = uStack00000000000001c0._4_4_;
    fVar72 = uStack00000000000001c8._4_4_;
    if (uVar39 != 0) {
      func_0x000c3098();
      lVar36 = lRam0000000000a334c0;
      fVar43 = uStack00000000000001c0._4_4_;
      fVar72 = uStack00000000000001c8._4_4_;
      if (unaff_x20 == *(long **)(&UNK_00004b18 + in_stack_000001b8)) {
        func_0x000d0a00();
        lVar36 = lRam0000000000a334c0;
        fVar43 = uStack00000000000001c0._4_4_;
        fVar72 = uStack00000000000001c8._4_4_;
      }
    }
    lRam0000000000a334c0 = lVar36;
    uStack00000000000001c0._4_4_ = fVar43;
    uStack00000000000001c8._4_4_ = fVar72;
    if ((uStack00000000000001b4 & 1) == 0) {
      fVar53 = *(float *)((long)unaff_x20 + 100);
      uVar27 = *(uint *)((long)unaff_x20 + 0x14);
      if ((uVar27 >> 5 & 1) == 0) {
        bVar17 = *(int *)(&UNK_00003910 + lVar36) != -1;
      }
      else {
        bVar17 = false;
      }
      fVar75 = (float)uStack00000000000001c8 - fVar53;
      puVar32 = (uint *)(&UNK_0000497c + lVar36);
      uVar39 = *puVar32;
      *puVar32 = uVar39 | 0x10;
      *(undefined4 *)(unaff_x20 + 0x2d) = 1;
      fVar73 = *(float *)(&UNK_00003924 + lVar36);
      fVar65 = *(float *)(&UNK_00003d38 + lVar36);
      *(undefined8 *)(unaff_x29 + -0xc0) = 0;
      *(undefined8 *)(unaff_x29 + -0xb8) = 0;
      fVar55 = fVar73;
      if (in_stack_00000168 != (undefined1 *)0x0) {
        fVar55 = *(float *)(&UNK_00003928 + lVar36);
        *(float *)(unaff_x29 + -0xb8) = (fVar75 - fVar73) - fVar65;
        *(float *)(unaff_x29 + -0xb4) = fVar43 + fVar55;
        fVar55 = fVar73 + fVar65 + *(float *)(&UNK_0000393c + lVar36);
      }
      fVar53 = (float)uStack00000000000001c0 + fVar53;
      if (bVar17) {
        if (*(int *)(&UNK_00003910 + lVar36) == 0) {
          fVar68 = *(float *)(&UNK_00003928 + lVar36);
          *(float *)(unaff_x29 + -0xc0) = fVar53 + fVar73;
          *(float *)(unaff_x29 + -0xbc) = fVar43 + fVar68;
          fVar73 = fVar73 + fVar65 + *(float *)(&UNK_0000393c + lVar36);
        }
        else if (*(int *)(&UNK_00003910 + lVar36) == 1) {
          fVar68 = *(float *)(&UNK_00003928 + lVar36);
          *(float *)(unaff_x29 + -0xc0) = (fVar75 - fVar55) - fVar65;
          *(float *)(unaff_x29 + -0xbc) = fVar43 + fVar68;
          fVar55 = fVar55 + fVar65 + *(float *)(&UNK_0000393c + lVar36);
        }
        uVar21 = *(uint *)(unaff_x20[0x21] + (long)(int)unaff_x20[0x20] * 4 + -4);
        uVar21 = *(uint *)(&UNK_0080c404 + ((ulong)uVar21 & 0xff ^ 0xdc) * 4) ^ ~uVar21 >> 8;
        uVar21 = *(uint *)(&UNK_0080c404 + (ulong)(uVar21 & 0xff ^ 0x43) * 4) ^ uVar21 >> 8;
        uVar21 = *(uint *)(&UNK_0080c404 + (ulong)(uVar21 & 0xff ^ 0x4f) * 4) ^ uVar21 >> 8;
        uVar21 = *(uint *)(&UNK_0080c404 + (ulong)(uVar21 & 0xff ^ 0x4c) * 4) ^ uVar21 >> 8;
        uVar21 = *(uint *)(&UNK_0080c404 + (ulong)(uVar21 & 0xff ^ 0x4c) * 4) ^ uVar21 >> 8;
        uVar21 = *(uint *)(&UNK_0080c404 + (ulong)(uVar21 & 0xff ^ 0x41) * 4) ^ uVar21 >> 8;
        uVar21 = *(uint *)(&UNK_0080c404 + (ulong)(uVar21 & 0xff ^ 0x50) * 4) ^ uVar21 >> 8;
        uVar21 = *(uint *)(&UNK_0080c404 + (ulong)(uVar21 & 0xff ^ 0x53) * 4) ^ uVar21 >> 8;
        uVar21 = *(uint *)(&UNK_0080c404 + (ulong)(uVar21 & 0xff ^ 0x45) * 4) ^
                 uVar21 >> 8 ^ 0xffffffff;
        if (*(uint *)(&UNK_0000404c + *unaff_x20) == uVar21) {
          func_0x000c167c(uVar21,0xb,"#COLLAPSE",0);
        }
        iVar18 = func_0x0010c3ec(uVar21,unaff_x29 + -0xc0);
        if (iVar18 != 0) {
          *(undefined1 *)((long)unaff_x20 + 0xc2) = 1;
        }
      }
      if (in_stack_00000168 != (undefined1 *)0x0) {
        uVar21 = *(uint *)(unaff_x20[0x21] + (long)(int)unaff_x20[0x20] * 4 + -4);
        uVar21 = *(uint *)(&UNK_0080c404 + ((ulong)uVar21 & 0xff ^ 0xdc) * 4) ^ ~uVar21 >> 8;
        uVar21 = *(uint *)(&UNK_0080c404 + (ulong)(uVar21 & 0xff ^ 0x43) * 4) ^ uVar21 >> 8;
        uVar21 = *(uint *)(&UNK_0080c404 + (ulong)(uVar21 & 0xff ^ 0x4c) * 4) ^ uVar21 >> 8;
        uVar21 = *(uint *)(&UNK_0080c404 + (ulong)(uVar21 & 0xff ^ 0x4f) * 4) ^ uVar21 >> 8;
        uVar21 = *(uint *)(&UNK_0080c404 + (ulong)(uVar21 & 0xff ^ 0x53) * 4) ^ uVar21 >> 8;
        uVar21 = *(uint *)(&UNK_0080c404 + (ulong)(uVar21 & 0xff ^ 0x45) * 4) ^
                 uVar21 >> 8 ^ 0xffffffff;
        if (*(uint *)(&UNK_0000404c + *unaff_x20) == uVar21) {
          func_0x000c167c(uVar21,0xb,"#CLOSE",0);
        }
        iVar18 = func_0x0010c1d4(uVar21,unaff_x29 + -0xb8);
        if (iVar18 != 0) {
          *in_stack_00000168 = 0;
        }
      }
      *(undefined4 *)(unaff_x20 + 0x2d) = 0;
      *puVar32 = uVar39;
      fVar56 = 0.0;
      fVar68 = 0.0;
      if ((uVar27 & 0x40000) != 0) {
        fVar68 = fVar65 * 0.8;
      }
      if (unaff_x26 == (char *)0xffffffffffffffff) {
        fVar45 = *(float *)(&UNK_00003d38 + lRam0000000000a334c0);
      }
      else {
        pcVar19 = unaff_x26;
        do {
          if (*pcVar19 == '#') {
            if (pcVar19[1] == '#') break;
          }
          else if (*pcVar19 == '\0') break;
          pcVar4 = pcVar19 + 1;
          bVar17 = pcVar19 != (char *)0xfffffffffffffffe;
          pcVar19 = pcVar4;
        } while (bVar17);
        fVar45 = *(float *)(&UNK_00003d38 + lRam0000000000a334c0);
        if (pcVar19 == unaff_x26) {
          fVar56 = 0.0;
        }
        else {
          fVar56 = 3.4028235e+38;
          fVar46 = (float)func_0x00106300(fVar45,0x7f7fffff,0xbf800000,
                                          *(undefined8 *)(&UNK_00003d30 + lRam0000000000a334c0),
                                          unaff_x26,pcVar19,0);
          fVar45 = fVar56;
          fVar56 = (float)(int)(fVar46 + 0.99999);
        }
      }
      fVar68 = fVar68 + fVar56;
      *(float *)(unaff_x29 + -200) = fVar68;
      *(float *)(unaff_x29 + -0xc4) = fVar45 + 0.0;
      fVar56 = *(float *)(&UNK_00003924 + lVar36);
      if (fVar73 <= fVar56) {
        if (fVar56 < fVar55) goto code_r0x000ccc3c;
code_r0x000cc994:
        fVar56 = *(float *)(&UNK_00003908 + lVar36);
        bVar17 = false;
        if ((0.0 < fVar56) && (bVar17 = false, !NAN(fVar56))) {
          bVar17 = fVar56 < 1.0;
        }
        if (bVar17) {
code_r0x000cc9a8:
          fVar46 = ABS(fVar56 + -0.5) * -2.0 + 1.0;
          fVar45 = 1.0;
          if (fVar46 <= 1.0) {
            fVar45 = fVar46;
          }
          fVar66 = 0.0;
          if (0.0 <= fVar46) {
            fVar66 = fVar45;
          }
          fVar45 = fVar73;
          if (fVar73 < fVar55) {
            fVar45 = fVar55;
          }
          fVar46 = (((fVar75 - fVar53) - fVar73) - fVar55) - fVar68;
          if (fVar46 <= fVar45) {
            fVar45 = fVar46;
          }
          fVar45 = fVar45 * fVar66;
          if (fVar73 < fVar45) {
            fVar73 = fVar45;
          }
          if (fVar55 < fVar45) {
            fVar55 = fVar45;
          }
        }
      }
      else {
        fVar73 = fVar73 + *(float *)(&UNK_0000393c + lVar36);
        if (fVar55 <= fVar56) goto code_r0x000cc994;
code_r0x000ccc3c:
        fVar55 = fVar55 + *(float *)(&UNK_0000393c + lVar36);
        fVar56 = *(float *)(&UNK_00003908 + lVar36);
        bVar17 = false;
        if ((0.0 < fVar56) && (bVar17 = false, !NAN(fVar56))) {
          bVar17 = fVar56 < 1.0;
        }
        if (bVar17) goto code_r0x000cc9a8;
      }
      fVar53 = fVar53 + fVar73;
      fVar55 = fVar75 - fVar55;
      *(float *)(unaff_x29 + -0xd8) = fVar53;
      *(float *)(unaff_x29 + -0xd4) = fVar43;
      *(float *)(unaff_x29 + -0xd0) = fVar55;
      *(float *)(unaff_x29 + -0xcc) = fVar72;
      fVar73 = fVar55 + *(float *)(&UNK_0000393c + lVar36);
      if (fVar75 <= fVar55 + *(float *)(&UNK_0000393c + lVar36)) {
        fVar73 = fVar75;
      }
      *(float *)(unaff_x29 + -0xe8) = fVar53;
      *(float *)(unaff_x29 + -0xe4) = fVar43;
      *(float *)(unaff_x29 + -0xe0) = fVar73;
      *(float *)(unaff_x29 + -0xdc) = fVar72;
      if ((uVar27 >> 0x12 & 1) != 0) {
        fVar68 = fVar68 + fVar53 + fVar56 * ((fVar55 - fVar53) - fVar68);
        if (fVar68 <= fVar55) {
          fVar55 = fVar68;
        }
        fVar75 = fVar53;
        if (fVar53 <= fVar68) {
          fVar75 = fVar55;
        }
        if (fVar53 < fVar75) {
          fVar55 = *(float *)(&UNK_000039cc + lRam0000000000a334c0);
          fVar68 = *(float *)(&UNK_000039d0 + lRam0000000000a334c0);
          fVar56 = *(float *)(&UNK_000039d8 + lRam0000000000a334c0) *
                   *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
          fVar53 = 1.0;
          if (fVar55 <= 1.0) {
            fVar53 = fVar55;
          }
          fVar45 = 0.0;
          if (0.0 <= fVar55) {
            fVar45 = fVar53;
          }
          fVar55 = *(float *)(&UNK_000039d4 + lRam0000000000a334c0);
          fVar53 = 1.0;
          if (fVar68 <= 1.0) {
            fVar53 = fVar68;
          }
          fVar46 = 0.0;
          if (0.0 <= fVar68) {
            fVar46 = fVar53;
          }
          iVar18 = -(uint)(fVar55 < 0.0);
          iVar59 = -(uint)(fVar56 < 0.0);
          uVar70 = NEON_fmov(0x3f800000,4);
          uVar70 = uVar70 ^ (uVar70 ^ CONCAT44(fVar56,fVar55)) &
                            ~CONCAT44(-(uint)((float)(uVar70 >> 0x20) < fVar56),
                                      -(uint)((float)uVar70 < fVar55));
          fVar53 = (float)CONCAT13((byte)(uVar70 >> 0x18) & ~(byte)((uint)iVar18 >> 0x18),
                                   CONCAT12((byte)(uVar70 >> 0x10) & ~(byte)((uint)iVar18 >> 0x10),
                                            CONCAT11((byte)(uVar70 >> 8) &
                                                     ~(byte)((uint)iVar18 >> 8),
                                                     (byte)uVar70 & ~(byte)iVar18)));
          uVar48 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar70 >> 0x38) &
                                                             ~(byte)((uint)iVar59 >> 0x18),
                                                             CONCAT16((byte)(uVar70 >> 0x30) &
                                                                      ~(byte)((uint)iVar59 >> 0x10),
                                                                      CONCAT15((byte)(uVar70 >> 0x28
                                                                                     ) & ~(byte)((
                                                  uint)iVar59 >> 8),
                                                  CONCAT14((byte)(uVar70 >> 0x20) & ~(byte)iVar59,
                                                           fVar53)))) >> 0x20) * 255.0 + 0.5),
                                      (int)(fVar53 * 255.0 + 0.5)),_UNK_0080c190,4);
          func_0x001069f4(fVar75,(fVar43 + fVar72) * 0.5,unaff_x20[0x55],
                          (int)(fVar45 * 255.0 + 0.5) | (int)(fVar46 * 255.0 + 0.5) << 8 |
                          (uint)uVar48 | (uint)((ulong)uVar48 >> 0x20));
          fVar75 = fVar75 - (float)(int)(fVar65 * 0.8 * 0.5);
          if (fVar75 <= fVar73) {
            fVar73 = fVar75;
          }
          *(float *)(unaff_x29 + -0xe0) = fVar73;
        }
      }
      lVar28 = lRam0000000000a334c0;
      if (unaff_x26 != (char *)0xffffffffffffffff) {
        pcVar19 = unaff_x26;
        do {
          if (*pcVar19 == '#') {
            if (pcVar19[1] == '#') break;
          }
          else if (*pcVar19 == '\0') break;
          pcVar4 = pcVar19 + 1;
          bVar17 = pcVar19 != (char *)0xfffffffffffffffe;
          pcVar19 = pcVar4;
        } while (bVar17);
        if (((int)pcVar19 != (int)unaff_x26) &&
           (func_0x000bc610(*(undefined8 *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x2a8),
                            unaff_x29 + -0xd8,unaff_x29 + -0xd0,unaff_x26,pcVar19,unaff_x29 + -200,
                            &UNK_00003908 + lVar36,unaff_x29 + -0xe8),
           (&UNK_00005ff8)[lVar28] != '\0')) {
          func_0x000bc2c4(unaff_x29 + -0xd8,unaff_x26,pcVar19);
        }
      }
    }
    lVar36 = lRam0000000000a334c0;
    uVar27 = 0;
    puVar7 = (undefined4 *)(&UNK_000049a8 + lRam0000000000a334c0);
    *(undefined4 *)(unaff_x20 + 0x4d) = 0;
    uVar70 = in_stack_00000190[0x1fa];
    fVar43 = *(float *)(lVar36 + 0xe40);
    if ((float)uStack00000000000001c0 - *(float *)(&UNK_0000394c + lVar36) <= fVar43) {
      fVar72 = *(float *)(&UNK_0000394c + lVar36) + (float)uStack00000000000001c8;
      bVar17 = false;
      if ((uStack00000000000001c0._4_4_ - *(float *)(&UNK_00003950 + lVar36) <=
           *(float *)(lVar36 + 0xe44)) && (bVar17 = false, !NAN(fVar43) && !NAN(fVar72))) {
        bVar17 = fVar43 < fVar72;
      }
      if (bVar17) {
        uVar27 = (uint)(*(float *)(lVar36 + 0xe44) <
                       uStack00000000000001c8._4_4_ + *(float *)(&UNK_00003950 + lVar36));
      }
      else {
        uVar27 = 0;
      }
    }
    *puVar7 = *(undefined4 *)((long)unaff_x20 + 0x84);
    *(int *)(&UNK_000049ac + lVar36) = (int)uVar70;
    *(uint *)(&UNK_000049b0 + lVar36) = uVar27;
    *(ulong *)(&UNK_000049cc + lVar36) =
         CONCAT44(uStack00000000000001c8._4_4_,(float)uStack00000000000001c8);
    *(ulong *)(&UNK_000049c4 + lVar36) =
         CONCAT44(uStack00000000000001c0._4_4_,(float)uStack00000000000001c0);
    *(ulong *)(&UNK_000049bc + lVar36) =
         CONCAT44(uStack00000000000001c8._4_4_,(float)uStack00000000000001c8);
    *(ulong *)(&UNK_000049b4 + lVar36) =
         CONCAT44(uStack00000000000001c0._4_4_,(float)uStack00000000000001c0);
    iVar18 = *(int *)((long)in_stack_00000190 + 0xfd4);
    if ((iVar18 != 0) &&
       ((*in_stack_00000178 == iVar18 || (*(int *)((long)unaff_x20 + 0x84) == iVar18)))) {
      func_0x000d2b3c();
      lVar36 = lRam0000000000a334c0;
    }
    plVar23 = *(long **)(lVar36 + 0x4000);
  }
  plVar20 = unaff_x20 + 0x44;
  *(undefined1 *)(plVar23 + 0x18) = 1;
  func_0x000f0930(plVar23[0x55],unaff_x20 + 0x43,plVar20,1);
  lVar36 = *(long *)(plVar23[0x55] + 0x60) + (long)*(int *)(plVar23[0x55] + 0x58) * 0x10;
  lVar28 = *(long *)(lVar36 + -0x10);
  plVar23[0x4a] = *(long *)(lVar36 + -8);
  plVar23[0x49] = lVar28;
  *(undefined1 *)(unaff_x20 + 0x18) = 0;
  *(short *)((long)unaff_x20 + 0xcc) = *(short *)((long)unaff_x20 + 0xcc) + 1;
  *in_stack_000001a8 = 0;
  if (iStack00000000000001a0 != iStack00000000000001a4) {
    if ((uStack00000000000001b4 & 0x11000000) == 0x1000000) {
      if ((uStack00000000000001b4 >> 0x17 & 1) == 0) {
        bVar17 = false;
      }
      else {
        bVar17 = false;
        if ((char)in_stack_000001a8[0x61] != '\0') {
          bVar17 = false;
          if (*(long *)(&UNK_00004b18 + in_stack_000001b8) != 0) {
            bVar17 = *(long *)(*(long *)(&UNK_00004b18 + in_stack_000001b8) + 0x3a0) ==
                     unaff_x20[0x74];
          }
        }
      }
      if ((((&UNK_00005ff8)[in_stack_000001b8] == '\0') && (!bVar17)) &&
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
      if (lVar34 != 0) {
        if (*(char *)(lVar34 + 0xc1) == '\0') {
          if ('\0' < *(char *)(lVar34 + 0xe4)) {
            *(undefined1 *)((long)unaff_x20 + 0xe4) = 1;
          }
          if (*(char *)(lVar34 + 0xe5) < '\x01') goto LAB_000cce08;
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
      cVar14 = *(char *)((long)unaff_x20 + 0xe7);
joined_r0x000cce60:
      bVar13 = 1;
      bVar26 = 1;
    }
    else {
      if (('\0' < *(char *)((long)unaff_x20 + 0xe4)) || ('\0' < *(char *)((long)unaff_x20 + 0xe5)))
      {
        *(undefined1 *)((long)unaff_x20 + 0xc5) = 1;
        cVar14 = *(char *)((long)unaff_x20 + 0xe7);
        goto joined_r0x000cce60;
      }
      bVar26 = 0;
      bVar13 = 0;
      *(bool *)((long)unaff_x20 + 0xc5) = '\0' < *(char *)((long)unaff_x20 + 0xe6);
      cVar14 = *(char *)((long)unaff_x20 + 0xe7);
    }
    if ('\0' < cVar14) {
      *(char *)((long)unaff_x20 + 0xe7) = cVar14 + -1;
      *(uint *)((long)unaff_x20 + 0x14) = *(uint *)((long)unaff_x20 + 0x14) | 0x30200;
      bVar13 = bVar26;
    }
    if ((((*(char *)((long)unaff_x20 + 0xc1) == '\0') &&
         ((bool)(*(char *)((long)unaff_x20 + 0xbe) != '\0' & (bVar13 ^ 1)))) ||
        ('\0' < *(char *)((long)unaff_x20 + 0xdc))) || ('\0' < *(char *)((long)unaff_x20 + 0xdd))) {
      bVar17 = false;
    }
    else {
      bVar17 = *(char *)((long)unaff_x20 + 0xe5) < '\x01';
    }
    *(bool *)((long)unaff_x20 + 0xc3) = bVar17;
  }
  if (*(char *)((long)unaff_x20 + 0xc6) == '\0') {
    uVar27 = 0;
    if (*(char *)(in_stack_000001b8 + 0x79) != '\0') {
      uVar27 = in_stack_00000198._4_4_;
    }
    if (((uVar27 & 1) != 0) ||
       ((*(char *)(in_stack_000001b8 + 0x7a) != '\0' &&
        (*(int *)(&UNK_00003fd0 + in_stack_000001b8) ==
         (int)(char)(&UNK_00006074)[in_stack_000001b8])))) {
      if ('\0' < *(char *)((long)unaff_x20 + 0xdc)) {
        *(char *)((long)unaff_x20 + 0xdc) = *(char *)((long)unaff_x20 + 0xdc) + '\x01';
      }
      if (*(char *)((long)unaff_x20 + 0xdd) < '\x01') {
        bVar17 = false;
      }
      else {
        bVar17 = false;
        *(char *)((long)unaff_x20 + 0xdd) = *(char *)((long)unaff_x20 + 0xdd) + '\x01';
      }
      goto LAB_000cced0;
    }
  }
  bVar17 = *(char *)((long)unaff_x20 + 0xc3) == '\0';
LAB_000cced0:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0xa0)) {
    return;
  }
  ___stack_chk_fail(bVar17);
  auVar79 = __Unwind_Resume();
  lVar34 = *(long *)(lRam0000000000a334c0 + 0x4000);
  *(undefined1 *)(lVar34 + 0xc0) = 1;
  func_0x000f0930(*(undefined8 *)(lVar34 + 0x2a8),auVar79._0_8_,auVar79._8_8_,plVar20);
  lVar36 = *(long *)(*(long *)(lVar34 + 0x2a8) + 0x60) +
           (long)*(int *)(*(long *)(lVar34 + 0x2a8) + 0x58) * 0x10;
  uVar48 = *(undefined8 *)(lVar36 + -0x10);
  *(undefined8 *)(lVar34 + 0x250) = *(undefined8 *)(lVar36 + -8);
  *(undefined8 *)(lVar34 + 0x248) = uVar48;
  return;
}

