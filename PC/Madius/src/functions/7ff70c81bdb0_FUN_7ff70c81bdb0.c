/* 7ff70c81bdb0 FUN_7ff70c81bdb0 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c81bdb0(float *param_1)

{
  float fVar1;
  double dVar2;
  char cVar3;
  int iVar4;
  uint uVar5;
  int iVar6;
  longlong lVar7;
  code *pcVar8;
  bool bVar9;
  bool bVar10;
  byte bVar11;
  longlong lVar12;
  longlong lVar13;
  longlong lVar14;
  longlong lVar15;
  ulonglong uVar16;
  longlong lVar17;
  byte bVar18;
  float fVar19;
  uint uVar20;
  longlong lVar21;
  byte bVar22;
  ulonglong uVar23;
  byte bVar24;
  ulonglong uVar25;
  ulonglong uVar26;
  longlong *plVar27;
  byte bVar28;
  bool bVar29;
  float fVar30;
  float fVar31;
  undefined1 auVar32 [16];
  undefined1 auStack_68 [40];
  ulonglong uStack_40;
  
  lVar12 = _DAT_7ff70cc1a3c0;
  uStack_40 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_68;
  fVar1 = *(float *)(_DAT_7ff70cc1a3c0 + 0xc64);
  auVar32 = blendvps(ZEXT416((uint)*(float *)(_DAT_7ff70cc1a3c0 + 0xcb8)),
                     ZEXT416((uint)*(float *)(_DAT_7ff70cc1a3c0 + 0xcb4)),
                     ZEXT416(-(uint)(*(float *)(_DAT_7ff70cc1a3c0 + 0xcb8) <=
                                    *(float *)(_DAT_7ff70cc1a3c0 + 0xcb4))));
  auVar32 = blendvps(ZEXT416((uint)fVar1),auVar32,ZEXT416(-(uint)(fVar1 <= auVar32._0_4_)));
  *(int *)(_DAT_7ff70cc1a3c0 + 0x1434) = auVar32._0_4_;
  lVar14 = *(longlong *)(lVar12 + 0x1460);
  lVar15 = 0;
  if ((lVar14 != 0) && ((*(byte *)(lVar14 + 0x15) & 2) == 0)) {
    lVar15 = lVar14;
  }
  if ((longlong)*(int *)(lVar12 + 0x13e0) < 1) {
    lVar13 = 0;
  }
  else {
    uVar23 = *(ulonglong *)(lVar12 + 0xcb4);
    auVar32 = blendvps(ZEXT416((uint)fVar1),ZEXT416((uint)(float)uVar23),
                       ZEXT416(-(uint)(fVar1 <= (float)uVar23)));
    uVar26 = extractps(auVar32,0);
    fVar19 = (float)(uVar23 >> 0x20);
    auVar32 = blendvps(ZEXT416((uint)fVar1),ZEXT416((uint)fVar19),ZEXT416(-(uint)(fVar1 <= fVar19)))
    ;
    lVar21 = extractps(auVar32,0);
    fVar1 = *param_1;
    fVar19 = param_1[1];
    uVar25 = (longlong)*(int *)(lVar12 + 0x13e0) + 1;
    lVar13 = 0;
    do {
      while (((lVar7 = *(longlong *)(*(longlong *)(lVar12 + 0x13e8) + -0x10 + uVar25 * 8),
              *(char *)(lVar7 + 0xcd) != '\x01' || (*(char *)(lVar7 + 0xd4) != '\0')) ||
             ((*(uint *)(lVar7 + 0x14) & 0x200) != 0))) {
LAB_7ff70c81bff0:
        uVar25 = uVar25 - 1;
        if (uVar25 < 2) goto LAB_7ff70c81c01b;
      }
      uVar16 = uVar23;
      if ((*(uint *)(lVar7 + 0x14) & 0x42) == 0) {
        uVar16 = uVar26 | lVar21 << 0x20;
      }
      if ((((fVar1 < *(float *)(lVar7 + 0x210) - (float)uVar16) ||
           (fVar31 = (float)(uVar16 >> 0x20), fVar19 < *(float *)(lVar7 + 0x214) - fVar31)) ||
          (((float)uVar16 + *(float *)(lVar7 + 0x218) <= fVar1 ||
           (fVar31 + *(float *)(lVar7 + 0x21c) <= fVar19)))) ||
         (((*(short *)(lVar7 + 0x280) != 0 &&
           (fVar31 = (float)(int)*(short *)(lVar7 + 0x284) + *(float *)(lVar7 + 0x28),
           fVar31 <= fVar1)) &&
          ((fVar30 = (float)(int)*(short *)(lVar7 + 0x286) + *(float *)(lVar7 + 0x2c),
           fVar30 <= fVar19 &&
           ((fVar1 < fVar31 + (float)(int)*(short *)(lVar7 + 0x280) &&
            (fVar19 < fVar30 + (float)(int)*(short *)(lVar7 + 0x282))))))))) goto LAB_7ff70c81bff0;
      if (lVar15 == 0) {
        lVar15 = lVar7;
      }
      lVar17 = lVar7;
      if (lVar13 != 0) {
        lVar17 = lVar13;
      }
      if (((lVar14 == 0) || (lVar13 != 0)) ||
         (lVar17 = lVar7, *(longlong *)(lVar7 + 0x3c0) != *(longlong *)(lVar14 + 0x3c0))) {
        lVar13 = lVar17;
        if (lVar15 != 0) break;
        lVar15 = 0;
      }
      else {
        lVar13 = 0;
      }
      uVar25 = uVar25 - 1;
    } while (1 < uVar25);
  }
LAB_7ff70c81c01b:
  *(longlong *)(lVar12 + 0x1448) = lVar15;
  *(longlong *)(lVar12 + 0x1450) = lVar13;
  *(longlong *)(lVar12 + 0x1458) = lVar15;
  iVar4 = *(int *)(lVar12 + 0x1f50);
  lVar14 = (longlong)iVar4;
  bVar29 = true;
  if (0 < lVar14) {
    uVar23 = lVar14 + 1;
    plVar27 = (longlong *)(lVar14 * 0x38 + *(longlong *)(lVar12 + 0x1f58) + -0x30);
    do {
      lVar14 = *plVar27;
      if ((lVar14 != 0) && ((*(byte *)(lVar14 + 0x17) & 8) != 0)) {
        bVar22 = 1;
        if ((lVar15 != 0) &&
           (lVar13 = *(longlong *)(lVar15 + 0x3c0), *(longlong *)(lVar13 + 0x3c0) != lVar14))
        goto LAB_7ff70c81c0a0;
        bVar29 = true;
        cVar3 = *(char *)(lVar12 + 0xb10);
        goto joined_r0x7ff70c81c411;
      }
      uVar23 = uVar23 - 1;
      plVar27 = plVar27 + -7;
    } while (1 < uVar23);
  }
  bVar22 = 0;
  goto LAB_7ff70c81c0ba;
  while (lVar13 = *(longlong *)(lVar13 + 0x3b8), lVar13 != 0) {
LAB_7ff70c81c0a0:
    bVar29 = lVar13 == lVar14;
    if (bVar29) break;
  }
LAB_7ff70c81c0ba:
  cVar3 = *(char *)(lVar12 + 0xb10);
joined_r0x7ff70c81c411:
  if (cVar3 == '\x01') {
    *(bool *)(lVar12 + 0xb60) = 0 < iVar4 || lVar15 != 0;
    *(byte *)(lVar12 + 0xb65) = lVar15 != 0 | bVar22;
  }
  if ((*(char *)(lVar12 + 0xe8) == '\0') && (*(char *)(lVar12 + 0xb2e) != '\x01')) {
    uVar20 = 0xffffffff;
    bVar10 = true;
    bVar9 = true;
    cVar3 = *(char *)(lVar12 + 0xb11);
  }
  else {
    bVar10 = false;
    bVar9 = false;
    uVar20 = 0;
    cVar3 = *(char *)(lVar12 + 0xb11);
  }
  if (cVar3 == '\x01') {
    *(bool *)(lVar12 + 0xb61) = 0 < iVar4 || lVar15 != 0;
    *(byte *)(lVar12 + 0xb66) = lVar15 != 0 | bVar22;
    bVar9 = bVar10;
  }
  if (((*(char *)(lVar12 + 0xe9) != '\0') || (*(char *)(lVar12 + 0xb2f) == '\x01')) &&
     ((bVar9 || (uVar20 = 0,
                *(double *)(lVar12 + 0xaf0) <= *(double *)(lVar12 + 0xae8) &&
                *(double *)(lVar12 + 0xae8) != *(double *)(lVar12 + 0xaf0))))) {
    uVar20 = 1;
  }
  if (*(char *)(lVar12 + 0xb12) == '\x01') {
    *(bool *)(lVar12 + 0xb62) = 0 < iVar4 || lVar15 != 0;
    *(byte *)(lVar12 + 0xb67) = lVar15 != 0 | bVar22;
  }
  if (((*(char *)(lVar12 + 0xea) != '\0') || (*(char *)(lVar12 + 0xb30) == '\x01')) &&
     ((uVar20 == 0xffffffff ||
      (dVar2 = *(double *)(lVar12 + 0xae8 + (ulonglong)uVar20 * 8),
      *(double *)(lVar12 + 0xaf8) <= dVar2 && dVar2 != *(double *)(lVar12 + 0xaf8))))) {
    uVar20 = 2;
  }
  if (*(char *)(lVar12 + 0xb13) == '\x01') {
    *(bool *)(lVar12 + 0xb63) = 0 < iVar4 || lVar15 != 0;
    *(byte *)(lVar12 + 0xb68) = lVar15 != 0 | bVar22;
  }
  if (((*(char *)(lVar12 + 0xeb) != '\0') || (*(char *)(lVar12 + 0xb31) == '\x01')) &&
     ((uVar20 == 0xffffffff ||
      (dVar2 = *(double *)(lVar12 + 0xae8 + (ulonglong)uVar20 * 8),
      *(double *)(lVar12 + 0xb00) <= dVar2 && dVar2 != *(double *)(lVar12 + 0xb00))))) {
    uVar20 = 3;
  }
  if (*(char *)(lVar12 + 0xb14) == '\x01') {
    *(bool *)(lVar12 + 0xb64) = 0 < iVar4 || lVar15 != 0;
    *(byte *)(lVar12 + 0xb69) = lVar15 != 0 | bVar22;
  }
  uVar5 = *(uint *)(lVar12 + 8);
  if ((*(char *)(lVar12 + 0xec) == '\0') && (*(char *)(lVar12 + 0xb32) != '\x01')) {
    bVar24 = bVar29 & (uVar5 & 0x10) == 0;
    if (uVar20 == 0xffffffff) {
      bVar28 = 1;
      bVar18 = 1;
      cVar3 = *(char *)(lVar12 + 0x21b0);
      goto joined_r0x7ff70c81c2a6;
    }
  }
  else {
    if ((uVar20 == 0xffffffff) ||
       (dVar2 = *(double *)(lVar12 + 0xae8 + (ulonglong)uVar20 * 8),
       *(double *)(lVar12 + 0xb08) <= dVar2 && dVar2 != *(double *)(lVar12 + 0xb08))) {
      uVar20 = 4;
    }
    bVar24 = bVar29 & (uVar5 & 0x10) == 0;
  }
  bVar28 = *(byte *)(lVar12 + 0xb60 + (ulonglong)uVar20);
  bVar18 = *(byte *)(lVar12 + 0xb65 + (ulonglong)uVar20);
  cVar3 = *(char *)(lVar12 + 0x21b0);
joined_r0x7ff70c81c2a6:
  bVar11 = bVar28;
  if (cVar3 == '\x01') {
    bVar11 = (*(byte *)(lVar12 + 0x21b4) & 0x10) >> 4 | bVar28;
  }
  if ((bVar11 & bVar24) == 0) {
    *(undefined8 *)(lVar12 + 0x1448) = 0;
    *(undefined8 *)(lVar12 + 0x1450) = 0;
    lVar15 = 0;
  }
  iVar6 = *(int *)(lVar12 + 0x29a0);
  if (iVar6 == -1) {
    bVar29 = lVar15 != 0 ||
             (*(char *)(lVar12 + 0xec) != '\0' ||
             (*(char *)(lVar12 + 0xeb) != '\0' ||
             (*(char *)(lVar12 + 0xea) != '\0' ||
             (*(char *)(lVar12 + 0xe9) != '\0' || *(char *)(lVar12 + 0xe8) != '\0'))));
    *(byte *)(lVar12 + 0xb0) = bVar28 & bVar29 | 0 < iVar4;
    *(byte *)(lVar12 + 0xab4) = bVar18 & bVar29 | bVar22;
    *(undefined1 *)(lVar12 + 0xb1) = 0;
  }
  else {
    *(bool *)(lVar12 + 0xab4) = iVar6 != 0;
    *(bool *)(lVar12 + 0xb0) = iVar6 != 0;
    *(undefined1 *)(lVar12 + 0xb1) = 0;
  }
  if (((uVar5 & 0x40) == 0) &&
     ((bVar22 != 0 || *(int *)(lVar12 + 0x14b4) != 0 ||
      ((((uVar5 & 1) != 0 && (*(char *)(lVar12 + 0xb5) != '\0')) &&
       (*(char *)(lVar12 + 0x53) == '\x01')))))) {
    *(undefined1 *)(lVar12 + 0xb1) = 1;
  }
  if (*(int *)(lVar12 + 0x29a4) != -1) {
    *(bool *)(lVar12 + 0xb1) = *(int *)(lVar12 + 0x29a4) != 0;
  }
  *(bool *)(lVar12 + 0xb2) = *(int *)(lVar12 + 0x29a8) - 1U < 0xfffffffe;
  if (_DAT_7ff70cbebd80 != (uStack_40 ^ (ulonglong)auStack_68)) {
    FUN_7ff70caa97e0(uStack_40 ^ (ulonglong)auStack_68);
    pcVar8 = (code *)swi(3);
    (*pcVar8)();
    return;
  }
  return;
}


