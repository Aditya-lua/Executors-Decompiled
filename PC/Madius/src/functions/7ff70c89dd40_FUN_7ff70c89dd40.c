/* 7ff70c89dd40 FUN_7ff70c89dd40 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c89dd40(void)

{
  longlong lVar1;
  float fVar2;
  float fVar3;
  undefined4 uVar4;
  longlong lVar5;
  longlong lVar6;
  undefined8 uVar7;
  code *pcVar8;
  longlong lVar9;
  char cVar10;
  undefined4 uVar11;
  longlong lVar12;
  uint uVar13;
  float fVar14;
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auStack_b8 [32];
  undefined4 uStack_98;
  float fStack_90;
  float fStack_8c;
  float fStack_88;
  float fStack_84;
  ulonglong uStack_80;
  
  lVar9 = _DAT_7ff70cc1a3c0;
  uStack_80 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_b8;
  lVar5 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  FUN_7ff70c84b780();
  uVar13 = *(int *)(lVar5 + 0x1a0) - 1;
  *(uint *)(lVar5 + 0x1a0) = uVar13;
  if ((*(uint *)(lVar5 + 0x1a4) >> (uVar13 & 0x1f) & 1) != 0) {
    lVar6 = *(longlong *)(lVar9 + 0x1f78);
    lVar12 = (longlong)*(int *)(lVar9 + 0x1f70);
    lVar1 = lVar6 + lVar12 * 0x28;
    if (((((*(byte *)(lVar6 + -0x22 + lVar12 * 0x28) & 2) != 0) &&
         (*(char *)(lVar9 + 0x1f93) == '\x01')) && (*(int *)(lVar9 + 0x2038) == 0)) &&
       (*(longlong *)(lVar9 + 0x1f98) == lVar5)) {
      cVar10 = FUN_7ff70c854790();
      if (cVar10 != '\0') {
        FUN_7ff70c854800(lVar9 + 0x2070,lVar6 + lVar12 * 0x28 + -0x28);
      }
    }
    lVar6 = _DAT_7ff70cc1a3c0;
    fVar2 = *(float *)(lVar1 + -0xc);
    if (((fVar2 != _DAT_7ff70cb1c5d8) || (NAN(fVar2) || NAN(_DAT_7ff70cb1c5d8))) &&
       (*(float *)(lVar5 + 0x264) <= *(float *)(lVar5 + 0x11c))) {
      lVar12 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
      auVar17 = ZEXT416((uint)*(float *)(lVar1 + -8));
      auVar16 = blendvps(ZEXT416((uint)*(float *)(lVar12 + 0x264)),
                         ZEXT416((uint)*(float *)(lVar1 + -0x10)),
                         ZEXT416(-(uint)(*(float *)(lVar12 + 0x264) <= *(float *)(lVar1 + -0x10))));
      if ((*(byte *)(lVar1 + -0x22) & 8) != 0) {
        fVar14 = *(float *)(lVar12 + 0x11c);
        if (*(longlong *)(_DAT_7ff70cc1a3c0 + 0x2278) != 0) {
          fVar3 = *(float *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x2278) + 0x80);
          auVar15 = blendvps(ZEXT416((uint)fVar14),ZEXT416((uint)fVar3),
                             ZEXT416(-(uint)(fVar14 <= fVar3)));
          fVar14 = auVar15._0_4_;
        }
        fVar14 = (float)(int)(*(float *)(_DAT_7ff70cc1a3c0 + 0x1130) * _DAT_7ff70cb1bb40 +
                             (fVar14 - *(float *)(_DAT_7ff70cc1a3c0 + 0xca0)));
        auVar17 = blendvps(auVar17,ZEXT416((uint)fVar14),
                           ZEXT416(-(uint)(*(float *)(_DAT_7ff70cc1a3c0 + 0xca0) +
                                           *(float *)(_DAT_7ff70cc1a3c0 + 0xd08) +
                                           *(float *)(lVar1 + -8) < fVar14)));
      }
      if (*(float *)(lVar12 + 0x26c) <= auVar17._0_4_) {
        auVar17._0_4_ = *(float *)(lVar12 + 0x26c);
      }
      if (auVar16._0_4_ < auVar17._0_4_) {
        if (*(short *)(lVar1 + -4) != -1) {
          FUN_7ff70c90c520();
        }
        uVar7 = *(undefined8 *)(lVar12 + 0x2c8);
        uVar4 = *(undefined4 *)(lVar6 + 0xd04);
        uVar11 = FUN_7ff70c80a070(0x34);
        uStack_98 = uVar4;
        fStack_90 = (float)(int)fVar2;
        fStack_8c = auVar16._0_4_;
        fStack_88 = (float)(int)fVar2;
        fStack_84 = auVar17._0_4_;
        FUN_7ff70c7bd6c0(uVar7,&fStack_90,&fStack_88,uVar11);
        if (*(short *)(lVar1 + -4) != -1) {
          FUN_7ff70c90c600();
        }
      }
    }
    *(int *)(lVar9 + 0x1f70) = *(int *)(lVar9 + 0x1f70) + -1;
    uVar13 = ~(1 << ((byte)uVar13 & 0x1f));
    *(ulonglong *)(lVar5 + 0x1a4) = CONCAT44(uVar13,uVar13) & *(ulonglong *)(lVar5 + 0x1a4);
  }
  FUN_7ff70c844300();
  if (_DAT_7ff70cbebd80 == (uStack_80 ^ (ulonglong)auStack_b8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_80 ^ (ulonglong)auStack_b8);
  pcVar8 = (code *)swi(3);
  (*pcVar8)();
  return;
}


