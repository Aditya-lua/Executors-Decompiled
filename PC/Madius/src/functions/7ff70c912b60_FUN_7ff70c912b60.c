/* 7ff70c912b60 FUN_7ff70c912b60 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c912b60(void)

{
  longlong lVar1;
  uint *puVar2;
  longlong lVar3;
  code *pcVar4;
  undefined1 auVar5 [16];
  undefined8 uVar6;
  bool bVar7;
  char cVar8;
  undefined1 uVar9;
  undefined4 uVar10;
  longlong lVar11;
  int iVar12;
  int iVar13;
  uint uVar14;
  longlong lVar15;
  ulonglong uVar16;
  float *pfVar17;
  ulonglong uVar18;
  undefined1 auVar19 [12];
  undefined1 auVar20 [16];
  undefined1 auVar21 [16];
  float fVar22;
  undefined1 auVar23 [16];
  undefined1 auVar24 [16];
  float fVar25;
  float fVar26;
  undefined1 auStack_108 [32];
  undefined4 uStack_e8;
  uint uStack_d8;
  float fStack_d4;
  float fStack_d0;
  float fStack_cc;
  undefined4 uStack_c8;
  char cStack_c2;
  byte bStack_c1;
  float fStack_c0;
  float fStack_bc;
  float fStack_b8;
  undefined4 uStack_b4;
  ulonglong uStack_b0;
  
  lVar11 = _DAT_7ff70cc1a3c0;
  uStack_b0 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_108;
  *(undefined1 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0xce) = 1;
  lVar1 = *(longlong *)(lVar11 + 0x1440);
  puVar2 = *(uint **)(lVar1 + 0x1c8);
  FUN_7ff70c84bf10();
  if (1 < (int)puVar2[4]) {
    FUN_7ff70c830dc0();
    FUN_7ff70c7b6530(puVar2 + 0x1c,*(undefined8 *)(lVar1 + 0x2c8));
  }
  auVar23 = blendvps(ZEXT416((uint)*(float *)(lVar1 + 0x11c)),ZEXT416(puVar2[8]),
                     ZEXT416(-(uint)(*(float *)(lVar1 + 0x11c) <= (float)puVar2[8])));
  uStack_d8 = puVar2[1];
  fVar25 = auVar23._0_4_;
  puVar2[8] = (uint)fVar25;
  *(float *)(lVar1 + 0x11c) = fVar25;
  if ((uStack_d8 & 0x10) == 0) {
    *(uint *)(lVar1 + 0x130) = puVar2[10];
  }
  fVar22 = _DAT_7ff70cb1bae4;
  if ((((uStack_d8 & 1) == 0) && (*(char *)(lVar1 + 0xd1) == '\0')) &&
     (auVar24 = blendvps(ZEXT416((uint)*(float *)(lVar1 + 0x264)),ZEXT416(puVar2[9]),
                         ZEXT416(-(uint)(*(float *)(lVar1 + 0x264) <= (float)puVar2[9]))),
     1 < (int)puVar2[4])) {
    if (*(float *)(lVar1 + 0x26c) <= fVar25) {
      auVar23._0_4_ = *(float *)(lVar1 + 0x26c);
    }
    fVar25 = _DAT_7ff70cb1ba2c + auVar24._0_4_;
    uVar16 = 0xffffffff;
    uVar18 = 1;
    lVar15 = 0;
    do {
      lVar3 = *(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0x1c8);
      if (lVar3 == 0) {
        fVar26 = 0.0;
      }
      else {
        fVar26 = (*(float *)(lVar3 + 0x18) - *(float *)(lVar3 + 0x14)) *
                 *(float *)(*(longlong *)(lVar3 + 0x68) + 0x1c + lVar15) + *(float *)(lVar3 + 0x14);
      }
      lVar3 = *(longlong *)(puVar2 + 0x1a);
      fVar26 = fVar26 + *(float *)(lVar1 + 0x28);
      uVar14 = *puVar2;
      fStack_c0 = (float)(int)(*(float *)(lVar11 + 0x1140) * fVar22);
      fStack_b8 = fVar26 + fStack_c0;
      fStack_c0 = fVar26 - fStack_c0;
      fStack_bc = auVar24._0_4_;
      uStack_b4 = auVar23._0_4_;
      cVar8 = FUN_7ff70c837800(&fStack_c0,uVar14 + uVar18 & 0xffffffff,0,2);
      if (cVar8 != '\0') {
        bStack_c1 = 0;
        cStack_c2 = '\0';
        if ((uStack_d8 & 2) == 0) {
          uStack_e8 = 0;
          FUN_7ff70c8782e0(&fStack_c0,uVar14 + uVar18 & 0xffffffff,&bStack_c1,&cStack_c2);
          if (((bStack_c1 == 0) && (cStack_c2 == '\0')) || (FUN_7ff70c848190(4), cStack_c2 == '\0'))
          goto LAB_7ff70c912cb0;
          if ((*(byte *)(lVar3 + 0x24 + lVar15) & 2) == 0) {
            uVar16 = uVar18 & 0xffffffff;
          }
          iVar12 = 0x1d;
        }
        else {
LAB_7ff70c912cb0:
          iVar12 = bStack_c1 + 0x1b;
        }
        uVar10 = FUN_7ff70c80a070(iVar12);
        fStack_d4 = (float)(int)fVar26;
        uStack_e8 = 0x3f800000;
        fStack_d0 = fVar25;
        fStack_cc = fStack_d4;
        uStack_c8 = auVar23._0_4_;
        FUN_7ff70c7bd6c0(*(undefined8 *)(lVar1 + 0x2c8),&fStack_d4,&fStack_cc,uVar10);
      }
      uVar18 = uVar18 + 1;
      lVar15 = lVar15 + 0x1c;
    } while ((longlong)uVar18 < (longlong)(int)puVar2[4]);
    iVar12 = (int)uVar16;
    if (iVar12 != -1) {
      if ((-1 < (int)puVar2[4]) && (*(char *)((longlong)puVar2 + 9) == '\0')) {
        lVar11 = -1;
        lVar15 = 4;
        do {
          *(undefined4 *)(*(longlong *)(puVar2 + 0x1a) + lVar15) =
               *(undefined4 *)(*(longlong *)(puVar2 + 0x1a) + -4 + lVar15);
          lVar11 = lVar11 + 1;
          lVar15 = lVar15 + 0x1c;
        } while (lVar11 < (int)puVar2[4]);
      }
      *(undefined1 *)((longlong)puVar2 + 9) = 1;
      fVar25 = ((float)(int)(*(float *)(_DAT_7ff70cc1a3c0 + 0x1140) * _DAT_7ff70cb1bae4) +
               (*(float *)(_DAT_7ff70cc1a3c0 + 0xe0) - *(float *)(_DAT_7ff70cc1a3c0 + 0x14cc))) -
               *(float *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0x28);
      lVar11 = *(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0x1c8);
      if (lVar11 == 0) {
        auVar19 = ZEXT812(0);
      }
      else {
        if (iVar12 < 1) {
          iVar13 = *(int *)(lVar11 + 0xc);
        }
        else {
          iVar13 = iVar12 + -1;
        }
        auVar19._4_8_ = 0;
        auVar19._0_4_ =
             (*(float *)(lVar11 + 0x18) - *(float *)(lVar11 + 0x14)) *
             *(float *)(*(longlong *)(lVar11 + 0x68) + (longlong)iVar13 * 0x1c) +
             *(float *)(lVar11 + 0x14);
      }
      auVar20._0_4_ = auVar19._0_4_ + *(float *)(_DAT_7ff70cc1a3c0 + 0xcc0);
      auVar20._4_8_ = auVar19._4_8_;
      auVar20._12_4_ = 0;
      auVar24._4_4_ = 0;
      auVar24._0_4_ = -(uint)(auVar20._0_4_ <= fVar25);
      auVar24._8_4_ = auVar19._8_4_;
      auVar24._12_4_ = 0;
      auVar21 = blendvps(auVar20,ZEXT416((uint)fVar25),auVar24);
      if ((puVar2[1] & 4) != 0) {
        if (lVar11 == 0) {
          fVar25 = 0.0;
        }
        else {
          if (iVar12 < -1) {
            iVar13 = *(int *)(lVar11 + 0xc);
          }
          else {
            iVar13 = iVar12 + 1;
          }
          fVar25 = (*(float *)(lVar11 + 0x18) - *(float *)(lVar11 + 0x14)) *
                   *(float *)(*(longlong *)(lVar11 + 0x68) + (longlong)iVar13 * 0x1c) +
                   *(float *)(lVar11 + 0x14);
        }
        fVar25 = fVar25 - *(float *)(_DAT_7ff70cc1a3c0 + 0xcc0);
        if (fVar25 <= auVar21._0_4_) {
          auVar21._0_4_ = fVar25;
        }
      }
      if (iVar12 < 0) goto LAB_7ff70c913050;
LAB_7ff70c913034:
      uVar14 = *(uint *)(lVar11 + 4);
      if ((uVar14 & 4) != 0) goto LAB_7ff70c9130b0;
      do {
        iVar12 = (int)uVar16;
        if (*(int *)(lVar11 + 0x10) + -1 <= iVar12) goto LAB_7ff70c9130b0;
        if (iVar12 < 0) {
          iVar12 = *(int *)(lVar11 + 0xc);
        }
        pfVar17 = (float *)((longlong)iVar12 * 0x1c + *(longlong *)(lVar11 + 0x68));
        if (*(char *)(lVar11 + 9) == '\0') {
          fVar25 = pfVar17[7] - *pfVar17;
        }
        else {
          fVar25 = pfVar17[8] - pfVar17[1];
        }
        auVar23 = ZEXT416((uint)((*(float *)(lVar11 + 0x18) - *(float *)(lVar11 + 0x14)) * fVar25));
        bVar7 = true;
        fVar25 = *(float *)(lVar11 + 0x18);
        lVar15 = _DAT_7ff70cc1a3c0;
        while( true ) {
          iVar12 = (int)uVar16;
          if (((uVar14 & 8) == 0) &&
             (fVar22 = fVar25 - (float)(*(int *)(lVar11 + 0x10) - iVar12) *
                                *(float *)(lVar15 + 0xcc0), fVar22 <= auVar21._0_4_)) {
            auVar21._0_4_ = fVar22;
          }
          _DAT_7ff70cc1a3c0 = lVar15;
          *(float *)(*(longlong *)(lVar11 + 0x68) + (longlong)iVar12 * 0x1c) =
               (auVar21._0_4_ - *(float *)(lVar11 + 0x14)) / (fVar25 - *(float *)(lVar11 + 0x14));
          if (!bVar7) {
            uVar9 = 1;
            goto LAB_7ff70c912ee3;
          }
          auVar5._4_4_ = 0;
          auVar5._0_4_ = -(uint)(auVar23._0_4_ <= *(float *)(lVar15 + 0xcc0));
          auVar5._8_4_ = auVar23._8_4_;
          auVar5._12_4_ = auVar23._12_4_;
          auVar23 = blendvps(auVar23,ZEXT416((uint)*(float *)(lVar15 + 0xcc0)),auVar5);
          auVar21._0_4_ = auVar21._0_4_ + auVar23._0_4_;
          uVar16 = (ulonglong)(iVar12 + 1U);
          lVar11 = *(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0x1c8);
          if (-1 < (int)(iVar12 + 1U)) goto LAB_7ff70c913034;
LAB_7ff70c913050:
          uVar16 = (ulonglong)*(uint *)(lVar11 + 0xc);
          uVar14 = *(uint *)(lVar11 + 4);
          if ((uVar14 & 4) == 0) break;
LAB_7ff70c9130b0:
          auVar23 = ZEXT816(0);
          bVar7 = false;
          fVar25 = *(float *)(lVar11 + 0x18);
          lVar15 = _DAT_7ff70cc1a3c0;
        }
      } while( true );
    }
  }
  uVar9 = 0;
LAB_7ff70c912ee3:
  *(undefined1 *)((longlong)puVar2 + 9) = uVar9;
  *(undefined8 *)(lVar1 + 0x240) = *(undefined8 *)(lVar1 + 0x250);
  *(undefined8 *)(lVar1 + 0x248) = *(undefined8 *)(lVar1 + 600);
  uVar6 = *(undefined8 *)(puVar2 + 0x15);
  *(undefined8 *)(lVar1 + 0x250) = *(undefined8 *)(puVar2 + 0x13);
  *(undefined8 *)(lVar1 + 600) = uVar6;
  *(undefined8 *)(lVar1 + 0x1c8) = 0;
  *(undefined4 *)(lVar1 + 0x160) = 0;
  *(float *)(lVar1 + 0x118) = (float)(int)(*(float *)(lVar1 + 0x28) + *(float *)(lVar1 + 0x15c));
  FUN_7ff70c854720();
  if (_DAT_7ff70cbebd80 == (uStack_b0 ^ (ulonglong)auStack_108)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_b0 ^ (ulonglong)auStack_108);
  pcVar4 = (code *)swi(3);
  (*pcVar4)();
  return;
}


