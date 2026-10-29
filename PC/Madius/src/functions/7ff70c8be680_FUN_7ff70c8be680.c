/* 7ff70c8be680 FUN_7ff70c8be680 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Instruction at (ram,0x7ff70c8be797) overlaps instruction at (ram,0x7ff70c8be796)
    */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8be680(void)

{
  undefined8 *puVar1;
  code *pcVar2;
  float fVar3;
  float fVar4;
  char cVar5;
  short sVar6;
  int iVar7;
  longlong lVar8;
  char *pcVar9;
  uint uVar10;
  undefined8 uVar11;
  undefined8 *puVar12;
  undefined8 **ppuVar13;
  undefined1 *puVar14;
  undefined1 *puVar15;
  undefined8 *puVar16;
  bool bVar17;
  undefined8 uVar18;
  float fVar19;
  float fVar20;
  float fVar21;
  float fVar22;
  undefined8 *apuStack_4b8d [7];
  undefined4 auStack_4b55 [4];
  undefined8 uStack_4b45;
  short asStack_4b3d [4];
  undefined4 auStack_4b35 [2];
  ulonglong uStack_4b2d;
  undefined1 auStack_4b25 [8];
  undefined4 uStack_4b1d;
  uint uStack_4b19;
  undefined8 auStack_4b15 [2374];
  undefined1 auStack_c8 [24];
  undefined7 uStack_b0;
  undefined4 uStack_a9;
  undefined5 uStack_a5;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  ulonglong uStack_70;
  
  uStack_70 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_c8;
  lVar8 = FUN_7ff70c808680();
  if (lVar8 == 0) {
    puVar16 = (undefined8 *)0x0;
  }
  else {
    lVar8 = FUN_7ff70c8194a0();
    puVar16 = *(undefined8 **)(lVar8 + 0x90);
  }
  lVar8 = FUN_7ff70c8194a0();
  uStack_98 = 0;
  uStack_90 = 0;
  func_0x7ff70d92e650(*puVar16,&uStack_98);
  *(ulonglong *)(lVar8 + 8) =
       CONCAT44((float)((int)((ulonglong)uStack_98 >> 0x20) - (int)((ulonglong)uStack_a0 >> 0x20)),
                (float)((int)uStack_98 - (int)uStack_a0));
  uStack_a9 = (uint)(byte)uStack_a9;
  uStack_a5 = 0;
  func_0x7ff70d74c9e6((longlong)&uStack_a9 + 1);
  *(float *)(lVar8 + 0x18) =
       (float)(CONCAT17((byte)uStack_a9,uStack_b0) - puVar16[3]) / (float)(longlong)puVar16[4];
  puVar16[3] = CONCAT17((byte)uStack_a9,uStack_b0);
  puVar1 = *(undefined8 **)(lVar8 + 0x90);
  lVar8 = func_0x7ff70d5992a4();
  uStack_a9 = uStack_a9 + 0xab;
  auStack_4b15[0] =
       CONCAT44((int)(float)((ulonglong)uRam0000000000000183 >> 0x20),
                (int)(float)uRam0000000000000183);
  puVar12 = auStack_4b15;
  apuStack_4b8d[5] = (undefined8 *)0x7ff70c8be785;
  apuStack_4b8d[6] = puVar12;
  iVar7 = func_0x7ff70d689381(*(uint *)(lVar8 + -0x75) | *(uint *)(lVar8 + 0x39));
  cVar5 = cRam0000000000000156;
  if (iVar7 != 0) {
    puVar12 = (undefined8 *)(ulonglong)uStack_4b19;
    apuStack_4b8d[5] = (undefined8 *)&UNK_7ff70c8be796;
    pcVar9 = (char *)func_0x7ff70cc3dbde(uStack_4b1d);
    pcVar9[0xabbe] = pcVar9[0xabbe] + '\x01';
    *pcVar9 = *pcVar9 + (char)pcVar9;
    cVar5 = *pcVar9;
  }
  ppuVar13 = apuStack_4b8d + 6;
  if ((cVar5 == '\0') && (ppuVar13 = apuStack_4b8d + 6, *(int *)(puVar1 + 2) == 0)) {
    apuStack_4b8d[5] = (undefined8 *)&uStack_4b1d;
    ppuVar13 = apuStack_4b8d + 5;
    iVar7 = func_0x7ff70da72602();
    if (iVar7 != 0) {
      func_0x7ff70d9f3c81(*puVar1,auStack_4b25);
                    /* WARNING: Bad instruction - Truncating control flow here */
      halt_baddata();
    }
  }
  *(undefined8 *)((longlong)ppuVar13 + -8) = 0x7ff70c8be7b4;
  cVar5 = FUN_7ff70c846a60(0x210);
  if (cVar5 != '\0') {
    *(undefined8 *)((longlong)ppuVar13 + -8) = 0x7ff70c8be7c2;
    uVar18 = func_0x7ff70d6c7083(0xa0);
    *(undefined8 *)((longlong)ppuVar13 + -8) = 0x7ff70c8be7d8;
    FUN_7ff70c800040(uVar18,0x210,0);
    *(undefined4 *)((longlong)ppuVar13 + 0x20) = 0xffffffff;
    puVar12 = (undefined8 *)0x210;
    *(undefined8 *)((longlong)ppuVar13 + -8) = 0x7ff70c8be7f9;
    FUN_7ff70c800430(0xab,0x210,0xa0,0xffffffff);
  }
  *(undefined8 *)((longlong)ppuVar13 + -8) = 0x7ff70c8be803;
  cVar5 = FUN_7ff70c846a60(0x214);
  if (cVar5 == '\0') {
    *(undefined8 *)((longlong)ppuVar13 + -8) = 0x7ff70c8be852;
    cVar5 = FUN_7ff70c846a60(0x212);
    puVar14 = (undefined1 *)ppuVar13;
    if (cVar5 != '\0') {
      *(undefined8 **)((longlong)ppuVar13 + -8) = puVar12;
      *(undefined8 *)((longlong)ppuVar13 + -0x10) = 0x7ff70c8be861;
      sVar6 = func_0x7ff70d88d73f(0x5b);
      puVar14 = (undefined1 *)((longlong)ppuVar13 + -8);
      if (-1 < sVar6) {
        *(undefined8 *)((longlong)ppuVar13 + -0x10) = 0x7ff70c8be876;
        FUN_7ff70c800040(0xab,0x212,0);
        *(undefined4 *)((longlong)ppuVar13 + 0x18) = 0xffffffff;
        *(undefined8 *)((longlong)ppuVar13 + -0x10) = 0x7ff70c8be897;
        FUN_7ff70c800430(0xab,0x212,0x5b,0xffffffff);
        puVar14 = (undefined1 *)((longlong)ppuVar13 + -8);
      }
    }
    *(undefined8 *)(puVar14 + -8) = 0x7ff70c8be8a1;
    cVar5 = FUN_7ff70c846a60(0x216);
    puVar15 = puVar14;
    if (cVar5 != '\0') {
      *(undefined8 **)(puVar14 + -8) = puVar16;
      *(undefined8 *)(puVar14 + -0x10) = 0x7ff70c8be8b0;
      sVar6 = func_0x7ff70d745234(0x5c);
      puVar15 = puVar14 + -8;
      if (-1 < sVar6) {
        *(undefined8 *)(puVar14 + -0x10) = 0x7ff70c8be8c5;
        FUN_7ff70c800040(0xab,0x216,0);
        *(undefined4 *)(puVar14 + 0x18) = 0xffffffff;
        *(undefined8 *)(puVar14 + -0x10) = 0x7ff70c8be8e6;
        FUN_7ff70c800430(0xab,0x216,0x5c,0xffffffff);
        puVar15 = puVar14 + -8;
      }
    }
    uVar18 = 0xffffffff;
    if (bRam00000000000000fb == 0) {
      *(undefined8 *)(puVar15 + -8) = 0x7ff70c8be8f6;
      uVar18 = FUN_7ff70c848140();
    }
    iVar7 = (int)uVar18;
    if ((*(int *)(puVar16 + 5) != iVar7) &&
       (*(int *)(puVar16 + 5) = iVar7, (bRam00000000000000ab & 0x20) == 0)) {
      uVar11 = 0;
      puVar14 = puVar15;
      if ((iVar7 != -1) && ((bRam00000000000000fb & 1) == 0)) {
        switch(iVar7) {
        case 1:
          uVar18 = 0x7f01;
          break;
        case 2:
          uVar18 = 0x7f86;
          break;
        case 3:
          uVar18 = 0x7f85;
          break;
        case 4:
          uVar18 = 0x7f84;
          break;
        case 5:
          uVar18 = 0x7f83;
          break;
        case 6:
          uVar18 = 0x7f82;
          break;
        case 7:
          uVar18 = 0x7f89;
          break;
        case 8:
          uVar18 = 0x7f02;
          break;
        case 9:
          uVar18 = 0x7f8a;
          break;
        case 10:
          uVar18 = 0x7f88;
          break;
        default:
          uVar18 = 0x7f00;
        }
        puVar14 = puVar15 + -8;
        *(undefined8 *)(puVar15 + -8) = 0xab;
        *(undefined8 *)(puVar15 + -0x10) = 0x7ff70c8be9d6;
        uVar18 = func_0x7ff70d86cedf(0,uVar18);
        uVar11 = uVar18;
      }
      puVar15 = puVar14 + -8;
      *(undefined8 *)(puVar14 + -8) = uVar18;
      *(undefined8 *)(puVar14 + -0x10) = 0x7ff70c8be9df;
      func_0x7ff70da085dd(uVar11);
    }
    lVar8 = lRam000000000000013b;
    if (*(char *)(lRam000000000000013b + 0x31) == '\x01') {
      *(undefined8 *)(puVar15 + 0x40) = 0;
      *(undefined8 *)(puVar15 + 0x48) = 0;
      *(undefined4 *)(puVar15 + 0x50) = 0;
      pcVar2 = *(code **)(lRam000000000000013b + 0x40);
      if (pcVar2 == (code *)0x0) {
        bVar17 = false;
      }
      else {
        *(undefined8 *)(puVar15 + -8) = 0x7ff70c8bea13;
        iVar7 = (*pcVar2)(0,1,puVar15 + 0x40);
        bVar17 = iVar7 == 0;
      }
      *(bool *)(lVar8 + 0x30) = bVar17;
      *(undefined1 *)(lVar8 + 0x31) = 0;
    }
    bRam00000000000000af = bRam00000000000000af & 0xfe;
    if ((*(char *)(lVar8 + 0x30) == '\x01') &&
       (pcVar2 = *(code **)(lVar8 + 0x48), pcVar2 != (code *)0x0)) {
      *(undefined8 *)(puVar15 + -8) = 0x7ff70c8bea47;
      iVar7 = (*pcVar2)(0,puVar15 + 0x40);
      if (iVar7 == 0) {
        bRam00000000000000af = bRam00000000000000af | 1;
        *(undefined8 *)(puVar15 + -8) = 0x7ff70c8bea6e;
        FUN_7ff70c800040(0xab,0x278,(*(ushort *)(puVar15 + 0x44) & 0x10) >> 4);
        *(undefined8 *)(puVar15 + -8) = 0x7ff70c8bea89;
        FUN_7ff70c800040(0xab,0x279,(*(ushort *)(puVar15 + 0x44) & 0x20) >> 5);
        *(undefined8 *)(puVar15 + -8) = 0x7ff70c8beaa4;
        FUN_7ff70c800040(0xab,0x27a,*(ushort *)(puVar15 + 0x44) >> 0xe & 1);
        *(undefined8 *)(puVar15 + -8) = 0x7ff70c8beabf;
        FUN_7ff70c800040(0xab,0x27b,*(ushort *)(puVar15 + 0x44) >> 0xd & 1);
        *(undefined8 *)(puVar15 + -8) = 0x7ff70c8bead6;
        FUN_7ff70c800040(0xab,0x27c,*(ushort *)(puVar15 + 0x44) >> 0xf);
        *(undefined8 *)(puVar15 + -8) = 0x7ff70c8beaf1;
        FUN_7ff70c800040(0xab,0x27d,*(ushort *)(puVar15 + 0x44) >> 0xc & 1);
        *(undefined8 *)(puVar15 + -8) = 0x7ff70c8beb0c;
        FUN_7ff70c800040(0xab,0x27e,(*(ushort *)(puVar15 + 0x44) & 4) >> 2);
        *(undefined8 *)(puVar15 + -8) = 0x7ff70c8beb27;
        FUN_7ff70c800040(0xab,0x27f,(*(ushort *)(puVar15 + 0x44) & 8) >> 3);
        *(undefined8 *)(puVar15 + -8) = 0x7ff70c8beb3e;
        FUN_7ff70c800040(0xab,0x280,puVar15[0x44] & 1);
        *(undefined8 *)(puVar15 + -8) = 0x7ff70c8beb58;
        FUN_7ff70c800040(0xab,0x281,(*(ushort *)(puVar15 + 0x44) & 2) >> 1);
        *(undefined8 *)(puVar15 + -8) = 0x7ff70c8beb6f;
        FUN_7ff70c800040(0xab,0x282,puVar15[0x45] & 1);
        *(undefined8 *)(puVar15 + -8) = 0x7ff70c8beb8a;
        FUN_7ff70c800040(0xab,0x283,*(ushort *)(puVar15 + 0x44) >> 9 & 1);
        fVar20 = _DAT_7ff70cb1f308;
        fVar4 = _DAT_7ff70cb1d7c8;
        fVar22 = _DAT_7ff70cb1ba2c;
        fVar19 = (float)(int)((byte)puVar15[0x46] - 0x1e) / _DAT_7ff70cb1f308;
        fVar3 = _DAT_7ff70cb1ba2c;
        if (fVar19 <= _DAT_7ff70cb1ba2c) {
          fVar3 = fVar19;
        }
        *(undefined8 *)(puVar15 + -8) = 0x7ff70c8bebdc;
        FUN_7ff70c7ffbb0(0xab,0x284,_DAT_7ff70cb1d7c8 < fVar19,~-(uint)(fVar19 < 0.0) & (uint)fVar3)
        ;
        fVar20 = (float)(int)((byte)puVar15[0x47] - 0x1e) / fVar20;
        fVar3 = fVar22;
        if (fVar20 <= fVar22) {
          fVar3 = fVar20;
        }
        *(undefined8 *)(puVar15 + -8) = 0x7ff70c8bec14;
        FUN_7ff70c7ffbb0(0xab,0x285,fVar4 < fVar20,~-(uint)(fVar20 < 0.0) & (uint)fVar3);
        *(undefined8 *)(puVar15 + -8) = 0x7ff70c8bec2f;
        FUN_7ff70c800040(0xab,0x286,(*(ushort *)(puVar15 + 0x44) & 0x40) >> 6);
        *(undefined8 *)(puVar15 + -8) = 0x7ff70c8bec46;
        FUN_7ff70c800040(0xab,0x287,(byte)puVar15[0x44] >> 7);
        fVar20 = _DAT_7ff70cb1f30c;
        fVar19 = (float)(*(short *)(puVar15 + 0x48) + 0x1ea9) / _DAT_7ff70cb1f30c;
        fVar3 = fVar22;
        if (fVar19 <= fVar22) {
          fVar3 = fVar19;
        }
        *(undefined8 *)(puVar15 + -8) = 0x7ff70c8bec89;
        FUN_7ff70c7ffbb0(0xab,0x288,fVar4 < fVar19,~-(uint)(fVar19 < 0.0) & (uint)fVar3);
        fVar19 = _DAT_7ff70cb1f310;
        fVar21 = (float)(*(short *)(puVar15 + 0x48) + -0x1ea9) / _DAT_7ff70cb1f310;
        fVar3 = fVar22;
        if (fVar21 <= fVar22) {
          fVar3 = fVar21;
        }
        *(undefined8 *)(puVar15 + -8) = 0x7ff70c8beccc;
        FUN_7ff70c7ffbb0(0xab,0x289,fVar4 < fVar21,~-(uint)(fVar21 < 0.0) & (uint)fVar3);
        fVar21 = (float)(*(short *)(puVar15 + 0x4a) + -0x1ea9) / fVar19;
        fVar3 = fVar22;
        if (fVar21 <= fVar22) {
          fVar3 = fVar21;
        }
        *(undefined8 *)(puVar15 + -8) = 0x7ff70c8bed06;
        FUN_7ff70c7ffbb0(0xab,0x28a,fVar4 < fVar21,~-(uint)(fVar21 < 0.0) & (uint)fVar3);
        fVar21 = (float)(*(short *)(puVar15 + 0x4a) + 0x1ea9) / fVar20;
        fVar3 = fVar22;
        if (fVar21 <= fVar22) {
          fVar3 = fVar21;
        }
        *(undefined8 *)(puVar15 + -8) = 0x7ff70c8bed40;
        FUN_7ff70c7ffbb0(0xab,0x28b,fVar4 < fVar21,~-(uint)(fVar21 < 0.0) & (uint)fVar3);
        fVar21 = (float)(*(short *)(puVar15 + 0x4c) + 0x1ea9) / fVar20;
        fVar3 = fVar22;
        if (fVar21 <= fVar22) {
          fVar3 = fVar21;
        }
        *(undefined8 *)(puVar15 + -8) = 0x7ff70c8bed7a;
        FUN_7ff70c7ffbb0(0xab,0x28c,fVar4 < fVar21,~-(uint)(fVar21 < 0.0) & (uint)fVar3);
        fVar21 = (float)(*(short *)(puVar15 + 0x4c) + -0x1ea9) / fVar19;
        fVar3 = fVar22;
        if (fVar21 <= fVar22) {
          fVar3 = fVar21;
        }
        *(undefined8 *)(puVar15 + -8) = 0x7ff70c8bedb4;
        FUN_7ff70c7ffbb0(0xab,0x28d,fVar4 < fVar21,~-(uint)(fVar21 < 0.0) & (uint)fVar3);
        fVar19 = (float)(*(short *)(puVar15 + 0x4e) + -0x1ea9) / fVar19;
        fVar3 = fVar22;
        if (fVar19 <= fVar22) {
          fVar3 = fVar19;
        }
        *(undefined8 *)(puVar15 + -8) = 0x7ff70c8bedee;
        FUN_7ff70c7ffbb0(0xab,0x28e,fVar4 < fVar19,~-(uint)(fVar19 < 0.0) & (uint)fVar3);
        fVar20 = (float)(*(short *)(puVar15 + 0x4e) + 0x1ea9) / fVar20;
        if (fVar20 <= fVar22) {
          fVar22 = fVar20;
        }
        *(undefined8 *)(puVar15 + -8) = 0x7ff70c8bee25;
        FUN_7ff70c7ffbb0(0xab,0x28f,fVar4 < fVar20,~-(uint)(fVar20 < 0.0) & (uint)fVar22);
      }
    }
    if (_DAT_7ff70cbebd80 != (*(ulonglong *)(puVar15 + 0x58) ^ (ulonglong)puVar15)) {
      *(undefined8 *)(puVar15 + -8) = 0x7ff70c8bee76;
      FUN_7ff70caa97e0(*(ulonglong *)(puVar15 + 0x58) ^ (ulonglong)puVar15);
      pcVar2 = (code *)swi(3);
      (*pcVar2)();
      return;
    }
    return;
  }
  uVar10 = 0xa1;
  *(undefined8 *)((longlong)ppuVar13 + -8) = 0x7ff70c8be811;
  lVar8 = func_0x7ff70d9d2b21();
  *(uint *)(lVar8 + -0x77) = *(uint *)(lVar8 + -0x77) ^ uVar10;
  pcVar2 = (code *)swi(1);
  (*pcVar2)();
  return;
}


