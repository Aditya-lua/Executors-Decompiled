/* Longer-timeout retries for functions that failed the primary export. */

/* ==================================================================== */
/* 180002f80 / FUN_180002f80 */
/* RETRY FAILED: Exception while decompiling 180002f80: process: timeout
 */

/* ==================================================================== */
/* 180010390 / FUN_180010390 */
/* RETRY FAILED: Exception while decompiling 180010390: process: timeout
 */

/* ==================================================================== */
/* 180029aa0 / FUN_180029aa0 */
/* RETRY FAILED: Exception while decompiling 180029aa0: process: timeout
 */

/* ==================================================================== */
/* 180035260 / FUN_180035260 */
/* RETRY FAILED: Exception while decompiling 180035260: process: timeout
 */

/* ==================================================================== */
/* 180041220 / FUN_180041220 */
/* RETRY FAILED: Exception while decompiling 180041220: process: timeout
 */

/* ==================================================================== */
/* 18004ea50 / FUN_18004ea50 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_18004ea50(void)

{
  longlong *plVar1;
  longlong lVar2;
  longlong lVar3;
  ulonglong uVar4;
  ulonglong uVar5;
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];

  plVar1 = (longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)_tls_index * 8);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x315f8) & 1) == 0) {
    *(uint *)(lVar2 + 0x315f8) = *(uint *)(lVar2 + 0x315f8) | 1;
    *(undefined2 *)(lVar2 + 0x3107b) = 0x10b;
    *(undefined2 *)(lVar2 + 0x31078) = 0xec35;
    *(undefined1 *)(lVar2 + 0x3107a) = 0x97;
    FUN_1805c2300(&LAB_1806f07a0);
  }
  auVar9 = _DAT_18086f850;
  auVar10 = _DAT_180863360;
  lVar2 = *plVar1;
  _DAT_180980bd0 = (ushort *)(lVar2 + 0x31078);
  uVar4 = 0;
  if (*(char *)(lVar2 + 0x3107c) != '\0') {
    uVar5 = 0;
    if (DAT_180931e30 < 5) {
      do {
        *(byte *)((longlong)_DAT_180980bd0 + uVar5) =
             *(byte *)((longlong)_DAT_180980bd0 + uVar5) ^
             (byte)(0xa957b1310bf58d61 >> (((byte)uVar5 & 7) << 3));
        uVar5 = uVar5 + 1;
      } while (uVar5 < 4);
    }
    else {
      auVar8 = vpsrlvq_avx2(_DAT_18086f850,ZEXT816(8) << 0x40);
      auVar8 = pshufb(auVar8,_DAT_180863360);
      *_DAT_180980bd0 = auVar8._0_2_ ^ *_DAT_180980bd0;
      auVar8._8_8_ = 0x18;
      auVar8._0_8_ = 0x10;
      auVar9 = vpsrlvq_avx2(auVar9,auVar8);
      auVar9 = pshufb(auVar9,auVar10);
      *(ushort *)(lVar2 + 0x3107a) = auVar9._0_2_ ^ *(ushort *)(lVar2 + 0x3107a);
    }
    *(undefined1 *)(lVar2 + 0x3107c) = 0;
  }
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x31174) & 1) == 0) {
    *(uint *)(lVar2 + 0x31174) = *(uint *)(lVar2 + 0x31174) | 1;
    *(undefined1 *)(lVar2 + 0x316ba) = 1;
    *(undefined8 *)(lVar2 + 0x316b0) = 0xc625c3707f93e82d;
    *(undefined2 *)(lVar2 + 0x316b8) = 0x8d16;
    FUN_1805c2300(&LAB_1806f0770);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x316b0;
  if (*(char *)(lVar2 + 0x316ba) != '\0') {
    FUN_180055100(lVar3,10,0xa957b1310bf58d61);
    *(undefined1 *)(lVar2 + 0x316ba) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980bd8 = lVar3;
  if ((*(uint *)(lVar2 + 0x307d0) & 1) == 0) {
    *(uint *)(lVar2 + 0x307d0) = *(uint *)(lVar2 + 0x307d0) | 1;
    *(undefined2 *)(lVar2 + 0x31aaa) = 0x1f5;
    *(undefined8 *)(lVar2 + 0x31aa0) = 0xdb25f0456392e433;
    *(undefined2 *)(lVar2 + 0x31aa8) = 0xfa0e;
    FUN_1805c2300(&LAB_1806f0740);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31aa0;
  if (*(char *)(lVar2 + 0x31aab) != '\0') {
    FUN_180055100(lVar3,0xb,0xa957b1310bf58d61);
    *(undefined1 *)(lVar2 + 0x31aab) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980be0 = lVar3;
  if ((*(uint *)(lVar2 + 0x310e0) & 1) == 0) {
    *(uint *)(lVar2 + 0x310e0) = *(uint *)(lVar2 + 0x310e0) | 1;
    *(undefined1 *)(lVar2 + 0x31ee0) = 1;
    *(undefined8 *)(lVar2 + 0x31ed8) = 0xa920de4379b4fd34;
    FUN_1805c2300(&LAB_1806f0710);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31ed8;
  if (*(char *)(lVar2 + 0x31ee0) != '\0') {
    FUN_180055100(lVar3,8,0xa957b1310bf58d61);
    *(undefined1 *)(lVar2 + 0x31ee0) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980be8 = lVar3;
  if ((*(uint *)(lVar2 + 0x31ea8) & 1) == 0) {
    *(uint *)(lVar2 + 0x31ea8) = *(uint *)(lVar2 + 0x31ea8) | 1;
    *(undefined1 *)(lVar2 + 0x30972) = 1;
    *(undefined8 *)(lVar2 + 0x30968) = 0xc625c3706582e225;
    *(undefined2 *)(lVar2 + 0x30970) = 0x8d16;
    FUN_1805c2300(&LAB_1806f06e0);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x30968;
  if (*(char *)(lVar2 + 0x30972) != '\0') {
    FUN_180055100(lVar3,10,0xa957b1310bf58d61);
    *(undefined1 *)(lVar2 + 0x30972) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980bf0 = lVar3;
  if ((*(uint *)(lVar2 + 0x318a4) & 1) == 0) {
    *(uint *)(lVar2 + 0x318a4) = *(uint *)(lVar2 + 0x318a4) | 1;
    *(undefined2 *)(lVar2 + 0x31e46) = 0x157;
    *(undefined4 *)(lVar2 + 0x31e40) = 0x6e92ec31;
    *(undefined2 *)(lVar2 + 0x31e44) = 0xc164;
    FUN_1805c2300(&LAB_1806f06b0);
  }
  lVar2 = *plVar1;
  _DAT_180980bf8 = (byte *)(lVar2 + 0x31e40);
  if (*(char *)(lVar2 + 0x31e47) != '\0') {
    *_DAT_180980bf8 = *_DAT_180980bf8 ^ 0x61;
    *(byte *)(lVar2 + 0x31e41) = *(byte *)(lVar2 + 0x31e41) ^ 0x8d;
    *(byte *)(lVar2 + 0x31e42) = *(byte *)(lVar2 + 0x31e42) ^ 0xf5;
    *(byte *)(lVar2 + 0x31e43) = *(byte *)(lVar2 + 0x31e43) ^ 0xb;
    *(byte *)(lVar2 + 0x31e44) = *(byte *)(lVar2 + 0x31e44) ^ 0x31;
    *(byte *)(lVar2 + 0x31e45) = *(byte *)(lVar2 + 0x31e45) ^ 0xb1;
    *(byte *)(lVar2 + 0x31e46) = *(byte *)(lVar2 + 0x31e46) ^ 0x57;
    *(undefined1 *)(lVar2 + 0x31e47) = 0;
  }
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x31800) & 1) == 0) {
    *(uint *)(lVar2 + 0x31800) = *(uint *)(lVar2 + 0x31800) | 1;
    *(undefined2 *)(lVar2 + 0x310f8) = 0x161;
    *(undefined8 *)(lVar2 + 0x310f0) = 0xc720de756e92ec31;
    FUN_1805c2300(&LAB_1806f0680);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x310f0;
  if (*(char *)(lVar2 + 0x310f9) != '\0') {
    FUN_180055100(lVar3,9,0xa957b1310bf58d61);
    *(undefined1 *)(lVar2 + 0x310f9) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980c00 = lVar3;
  if ((*(uint *)(lVar2 + 0x319ac) & 1) == 0) {
    *(uint *)(lVar2 + 0x319ac) = *(uint *)(lVar2 + 0x319ac) | 1;
    *(undefined2 *)(lVar2 + 0x31280) = 0x1f5;
    *(undefined4 *)(lVar2 + 0x3127c) = 0xe22faa3;
    FUN_1805c2300(&LAB_1806f0650);
  }
  lVar2 = *plVar1;
  _DAT_180980c08 = (byte *)(lVar2 + 0x3127c);
  if (*(char *)(lVar2 + 0x31281) != '\0') {
    *_DAT_180980c08 = *_DAT_180980c08 ^ 0xeb;
    *(byte *)(lVar2 + 0x3127d) = *(byte *)(lVar2 + 0x3127d) ^ 0x95;
    *(byte *)(lVar2 + 0x3127e) = *(byte *)(lVar2 + 0x3127e) ^ 0x4f;
    *(byte *)(lVar2 + 0x3127f) = *(byte *)(lVar2 + 0x3127f) ^ 0x6b;
    *(byte *)(lVar2 + 0x31280) = *(byte *)(lVar2 + 0x31280) ^ 0xf5;
    *(undefined1 *)(lVar2 + 0x31281) = 0;
  }
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x318f0) & 1) == 0) {
    *(uint *)(lVar2 + 0x318f0) = *(uint *)(lVar2 + 0x318f0) | 1;
    *(undefined1 *)(lVar2 + 0x31afc) = 1;
    *(undefined4 *)(lVar2 + 0x31af8) = 0x6b2bfbae;
    FUN_1805c2300(&LAB_1806f0630);
  }
  auVar9 = _DAT_18086c760;
  lVar2 = *plVar1;
  _DAT_180980c10 = (ushort *)(lVar2 + 0x31af8);
  if (*(char *)(lVar2 + 0x31afc) != '\0') {
    uVar5 = 0;
    if (DAT_180931e30 < 5) {
      do {
        *(byte *)(uVar5 + (longlong)_DAT_180980c10) =
             *(byte *)(uVar5 + (longlong)_DAT_180980c10) ^
             (byte)(0x7f1b25f56b4f95eb >> (((byte)uVar5 & 7) << 3));
        uVar5 = uVar5 + 1;
      } while (uVar5 < 4);
    }
    else {
      auVar8 = vpsrlvq_avx2(_DAT_18086c760,ZEXT816(8) << 0x40);
      auVar8 = pshufb(auVar8,auVar10);
      *_DAT_180980c10 = auVar8._0_2_ ^ *_DAT_180980c10;
      auVar11._8_8_ = 0x18;
      auVar11._0_8_ = 0x10;
      auVar9 = vpsrlvq_avx2(auVar9,auVar11);
      auVar9 = pshufb(auVar9,auVar10);
      *(ushort *)(lVar2 + 0x31afa) = auVar9._0_2_ ^ *(ushort *)(lVar2 + 0x31afa);
    }
    *(undefined1 *)(lVar2 + 0x31afc) = 0;
  }
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x31928) & 1) == 0) {
    *(uint *)(lVar2 + 0x31928) = *(uint *)(lVar2 + 0x31928) | 1;
    *(undefined2 *)(lVar2 + 0x3183e) = 0x11b;
    *(undefined4 *)(lVar2 + 0x31838) = 0xe3cfba2;
    *(undefined2 *)(lVar2 + 0x3183c) = 0x5187;
    FUN_1805c2300(&LAB_1806f0600);
  }
  lVar2 = *plVar1;
  _DAT_180980c18 = (byte *)(lVar2 + 0x31838);
  if (*(char *)(lVar2 + 0x3183f) != '\0') {
    *_DAT_180980c18 = *_DAT_180980c18 ^ 0xeb;
    *(byte *)(lVar2 + 0x31839) = *(byte *)(lVar2 + 0x31839) ^ 0x95;
    *(byte *)(lVar2 + 0x3183a) = *(byte *)(lVar2 + 0x3183a) ^ 0x4f;
    *(byte *)(lVar2 + 0x3183b) = *(byte *)(lVar2 + 0x3183b) ^ 0x6b;
    *(byte *)(lVar2 + 0x3183c) = *(byte *)(lVar2 + 0x3183c) ^ 0xf5;
    *(byte *)(lVar2 + 0x3183d) = *(byte *)(lVar2 + 0x3183d) ^ 0x25;
    *(byte *)(lVar2 + 0x3183e) = *(byte *)(lVar2 + 0x3183e) ^ 0x1b;
    *(undefined1 *)(lVar2 + 0x3183f) = 0;
  }
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x30754) & 1) == 0) {
    *(uint *)(lVar2 + 0x30754) = *(uint *)(lVar2 + 0x30754) | 1;
    *(undefined2 *)(lVar2 + 0x30f36) = 0x11b;
    *(undefined4 *)(lVar2 + 0x30f30) = 0xe23f0af;
    *(undefined2 *)(lVar2 + 0x30f34) = 0x4081;
    FUN_1805c2300(&LAB_1806f05d0);
  }
  lVar2 = *plVar1;
  _DAT_180980c20 = (byte *)(lVar2 + 0x30f30);
  if (*(char *)(lVar2 + 0x30f37) != '\0') {
    *_DAT_180980c20 = *_DAT_180980c20 ^ 0xeb;
    *(byte *)(lVar2 + 0x30f31) = *(byte *)(lVar2 + 0x30f31) ^ 0x95;
    *(byte *)(lVar2 + 0x30f32) = *(byte *)(lVar2 + 0x30f32) ^ 0x4f;
    *(byte *)(lVar2 + 0x30f33) = *(byte *)(lVar2 + 0x30f33) ^ 0x6b;
    *(byte *)(lVar2 + 0x30f34) = *(byte *)(lVar2 + 0x30f34) ^ 0xf5;
    *(byte *)(lVar2 + 0x30f35) = *(byte *)(lVar2 + 0x30f35) ^ 0x25;
    *(byte *)(lVar2 + 0x30f36) = *(byte *)(lVar2 + 0x30f36) ^ 0x1b;
    *(undefined1 *)(lVar2 + 0x30f37) = 0;
  }
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x31cdc) & 1) == 0) {
    *(uint *)(lVar2 + 0x31cdc) = *(uint *)(lVar2 + 0x31cdc) | 1;
    *(undefined1 *)(lVar2 + 0x31a72) = 1;
    *(undefined8 *)(lVar2 + 0x31a68) = 0x1c7a5586002cf4a9;
    *(undefined2 *)(lVar2 + 0x31a70) = 0x958e;
    FUN_1805c2300(&LAB_1806f05a0);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31a68;
  if (*(char *)(lVar2 + 0x31a72) != '\0') {
    FUN_180055100(lVar3,10,0x7f1b25f56b4f95eb);
    *(undefined1 *)(lVar2 + 0x31a72) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980c28 = lVar3;
  if ((*(uint *)(lVar2 + 0x3134c) & 1) == 0) {
    *(uint *)(lVar2 + 0x3134c) = *(uint *)(lVar2 + 0x3134c) | 1;
    *(undefined1 *)(lVar2 + 0x3196e) = 1;
    *(undefined4 *)(lVar2 + 0x31968) = 0x82ee5b8;
    *(undefined2 *)(lVar2 + 0x3196c) = 0x2590;
    FUN_1805c2300(&LAB_1806f0570);
  }
  _DAT_180980c30 = FUN_18023d790(*plVar1 + 0x31968);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x31348) & 1) == 0) {
    *(uint *)(lVar2 + 0x31348) = *(uint *)(lVar2 + 0x31348) | 1;
    *(undefined1 *)(lVar2 + 0x31e92) = 1;
    *(undefined4 *)(lVar2 + 0x31e8c) = 0xe3bfbae;
    *(undefined2 *)(lVar2 + 0x31e90) = 0x2587;
    FUN_1805c2300(&LAB_1806f0540);
  }
  _DAT_180980c38 = FUN_18023d790(*plVar1 + 0x31e8c);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x311e4) & 1) == 0) {
    *(uint *)(lVar2 + 0x311e4) = *(uint *)(lVar2 + 0x311e4) | 1;
    *(undefined2 *)(lVar2 + 0x31d46) = 0x11b;
    *(undefined4 *)(lVar2 + 0x31d40) = 0xa2ce6ae;
    *(undefined2 *)(lVar2 + 0x31d44) = 0x4085;
    FUN_1805c2300(&LAB_1806f0510);
  }
  lVar2 = *plVar1;
  _DAT_180980c40 = (byte *)(lVar2 + 0x31d40);
  if (*(char *)(lVar2 + 0x31d47) != '\0') {
    *_DAT_180980c40 = *_DAT_180980c40 ^ 0xeb;
    *(byte *)(lVar2 + 0x31d41) = *(byte *)(lVar2 + 0x31d41) ^ 0x95;
    *(byte *)(lVar2 + 0x31d42) = *(byte *)(lVar2 + 0x31d42) ^ 0x4f;
    *(byte *)(lVar2 + 0x31d43) = *(byte *)(lVar2 + 0x31d43) ^ 0x6b;
    *(byte *)(lVar2 + 0x31d44) = *(byte *)(lVar2 + 0x31d44) ^ 0xf5;
    *(byte *)(lVar2 + 0x31d45) = *(byte *)(lVar2 + 0x31d45) ^ 0x25;
    *(byte *)(lVar2 + 0x31d46) = *(byte *)(lVar2 + 0x31d46) ^ 0x1b;
    *(undefined1 *)(lVar2 + 0x31d47) = 0;
  }
  _DAT_180980c48 = "LeftCtrl";
  _DAT_180980c50 = "LeftShift";
  _DAT_180980c58 = "LeftAlt";
  _DAT_180980c60 = "LeftSuper";
  _DAT_180980c68 = "RightCtrl";
  _DAT_180980c70 = "RightShift";
  _DAT_180980c78 = "RightAlt";
  _DAT_180980c80 = "RightSuper";
  _DAT_180980c88 = &DAT_180859ef8;
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x308d8) & 1) == 0) {
    *(uint *)(lVar2 + 0x308d8) = *(uint *)(lVar2 + 0x308d8) | 1;
    *(undefined1 *)(lVar2 + 0x313d2) = 1;
    *(undefined2 *)(lVar2 + 0x313d0) = 0x1fa3;
    FUN_1805c2300(&LAB_1806f04f0);
  }
  _DAT_180980c90 = FUN_18023d700(*plVar1 + 0x313d0);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x30f2c) & 1) == 0) {
    *(uint *)(lVar2 + 0x30f2c) = *(uint *)(lVar2 + 0x30f2c) | 1;
    *(undefined1 *)(lVar2 + 0x3113e) = 1;
    *(undefined2 *)(lVar2 + 0x3113c) = 0x1fa2;
    FUN_1805c2300(&LAB_1806f04d0);
  }
  _DAT_180980c98 = FUN_18023d700(*plVar1 + 0x3113c);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x312cc) & 1) == 0) {
    *(uint *)(lVar2 + 0x312cc) = *(uint *)(lVar2 + 0x312cc) | 1;
    *(undefined1 *)(lVar2 + 0x31372) = 1;
    *(undefined2 *)(lVar2 + 0x31370) = 0x1fa1;
    FUN_1805c2300(&LAB_1806f04b0);
  }
  _DAT_180980ca0 = FUN_18023d700(*plVar1 + 0x31370);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x30f9c) & 1) == 0) {
    *(uint *)(lVar2 + 0x30f9c) = *(uint *)(lVar2 + 0x30f9c) | 1;
    *(undefined1 *)(lVar2 + 0x30fd6) = 1;
    *(undefined2 *)(lVar2 + 0x30fd4) = 0x1fa0;
    FUN_1805c2300(&LAB_1806f0490);
  }
  _DAT_180980ca8 = FUN_18023d700(*plVar1 + 0x30fd4);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x30fd8) & 1) == 0) {
    *(uint *)(lVar2 + 0x30fd8) = *(uint *)(lVar2 + 0x30fd8) | 1;
    *(undefined1 *)(lVar2 + 0x315f6) = 1;
    *(undefined2 *)(lVar2 + 0x315f4) = 0x1fa7;
    FUN_1805c2300(&LAB_1806f0470);
  }
  _DAT_180980cb0 = FUN_18023d700(*plVar1 + 0x315f4);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x307c4) & 1) == 0) {
    *(uint *)(lVar2 + 0x307c4) = *(uint *)(lVar2 + 0x307c4) | 1;
    *(undefined1 *)(lVar2 + 0x3097e) = 1;
    *(undefined2 *)(lVar2 + 0x3097c) = 0x1fa6;
    FUN_1805c2300(&LAB_1806f0450);
  }
  _DAT_180980cb8 = FUN_18023d700(*plVar1 + 0x3097c);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x30d68) & 1) == 0) {
    *(uint *)(lVar2 + 0x30d68) = *(uint *)(lVar2 + 0x30d68) | 1;
    *(undefined1 *)(lVar2 + 0x31616) = 1;
    *(undefined2 *)(lVar2 + 0x31614) = 0x1fa5;
    FUN_1805c2300(&LAB_1806f0430);
  }
  _DAT_180980cc0 = FUN_18023d700(*plVar1 + 0x31614);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x316c4) & 1) == 0) {
    *(uint *)(lVar2 + 0x316c4) = *(uint *)(lVar2 + 0x316c4) | 1;
    *(undefined1 *)(lVar2 + 0x30e86) = 1;
    *(undefined2 *)(lVar2 + 0x30e84) = 0x1fa4;
    FUN_1805c2300(&LAB_1806f0410);
  }
  _DAT_180980cc8 = FUN_18023d700(*plVar1 + 0x30e84);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x319b8) & 1) == 0) {
    *(uint *)(lVar2 + 0x319b8) = *(uint *)(lVar2 + 0x319b8) | 1;
    *(undefined1 *)(lVar2 + 0x3192e) = 1;
    *(undefined2 *)(lVar2 + 0x3192c) = 0x1fab;
    FUN_1805c2300(&LAB_1806f03f0);
  }
  _DAT_180980cd0 = FUN_18023d700(*plVar1 + 0x3192c);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x3129c) & 1) == 0) {
    *(uint *)(lVar2 + 0x3129c) = *(uint *)(lVar2 + 0x3129c) | 1;
    *(undefined1 *)(lVar2 + 0x31d32) = 1;
    *(undefined2 *)(lVar2 + 0x31d30) = 0x1faa;
    FUN_1805c2300(&LAB_1806f03d0);
  }
  _DAT_180980cd8 = FUN_18023d700(*plVar1 + 0x31d30);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x31cf0) & 1) == 0) {
    *(uint *)(lVar2 + 0x31cf0) = *(uint *)(lVar2 + 0x31cf0) | 1;
    *(undefined1 *)(lVar2 + 0x30f7a) = 1;
    *(undefined2 *)(lVar2 + 0x30f78) = 0x1fd2;
    FUN_1805c2300(&LAB_1806f03b0);
  }
  _DAT_180980ce0 = FUN_18023d700(*plVar1 + 0x30f78);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x318a8) & 1) == 0) {
    *(uint *)(lVar2 + 0x318a8) = *(uint *)(lVar2 + 0x318a8) | 1;
    *(undefined1 *)(lVar2 + 0x30d66) = 1;
    *(undefined2 *)(lVar2 + 0x30d64) = 0x1fd1;
    FUN_1805c2300(&LAB_1806f0390);
  }
  _DAT_180980ce8 = FUN_18023d700(*plVar1 + 0x30d64);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x30ce4) & 1) == 0) {
    *(uint *)(lVar2 + 0x30ce4) = *(uint *)(lVar2 + 0x30ce4) | 1;
    *(undefined1 *)(lVar2 + 0x31832) = 1;
    *(undefined2 *)(lVar2 + 0x31830) = 0x1fd0;
    FUN_1805c2300(&LAB_1806f0370);
  }
  _DAT_180980cf0 = FUN_18023d700(*plVar1 + 0x31830);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x307c0) & 1) == 0) {
    *(uint *)(lVar2 + 0x307c0) = *(uint *)(lVar2 + 0x307c0) | 1;
    *(undefined1 *)(lVar2 + 0x30fa2) = 1;
    *(undefined2 *)(lVar2 + 0x30fa0) = 0x1fd7;
    FUN_1805c2300(&LAB_1806f0350);
  }
  _DAT_180980cf8 = FUN_18023d700(*plVar1 + 0x30fa0);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x31798) & 1) == 0) {
    *(uint *)(lVar2 + 0x31798) = *(uint *)(lVar2 + 0x31798) | 1;
    *(undefined1 *)(lVar2 + 0x30eca) = 1;
    *(undefined2 *)(lVar2 + 0x30ec8) = 0x1fd6;
    FUN_1805c2300(&LAB_1806f0330);
  }
  _DAT_180980d00 = FUN_18023d700(*plVar1 + 0x30ec8);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x31668) & 1) == 0) {
    *(uint *)(lVar2 + 0x31668) = *(uint *)(lVar2 + 0x31668) | 1;
    *(undefined1 *)(lVar2 + 0x30a42) = 1;
    *(undefined2 *)(lVar2 + 0x30a40) = 0x1fd5;
    FUN_1805c2300(&LAB_1806f0310);
  }
  _DAT_180980d08 = FUN_18023d700(*plVar1 + 0x30a40);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x31c98) & 1) == 0) {
    *(uint *)(lVar2 + 0x31c98) = *(uint *)(lVar2 + 0x31c98) | 1;
    *(undefined1 *)(lVar2 + 0x315b6) = 1;
    *(undefined2 *)(lVar2 + 0x315b4) = 0x1fd4;
    FUN_1805c2300(&LAB_1806f02f0);
  }
  _DAT_180980d10 = FUN_18023d700(*plVar1 + 0x315b4);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x318bc) & 1) == 0) {
    *(uint *)(lVar2 + 0x318bc) = *(uint *)(lVar2 + 0x318bc) | 1;
    *(undefined1 *)(lVar2 + 0x315ee) = 1;
    *(undefined2 *)(lVar2 + 0x315ec) = 0x1fdb;
    FUN_1805c2300(&LAB_1806f02d0);
  }
  _DAT_180980d18 = FUN_18023d700(*plVar1 + 0x315ec);
  _DAT_180980d20 = &DAT_180859ef4;
  _DAT_180980d28 = &DAT_180859ef0;
  _DAT_180980d30 = &DAT_180859eec;
  _DAT_180980d38 = &DAT_180859f58;
  _DAT_180980d40 = &DAT_180859f54;
  _DAT_180980d48 = &DAT_180859f50;
  _DAT_180980d50 = &DAT_180859f4c;
  _DAT_180980d58 = &DAT_180859f48;
  _DAT_180980d60 = &DAT_180859f44;
  _DAT_180980d68 = &DAT_180859f40;
  _DAT_180980d70 = &DAT_180859f3c;
  _DAT_180980d78 = &DAT_180859f78;
  _DAT_180980d80 = &DAT_180859f74;
  _DAT_180980d88 = &DAT_180859f70;
  _DAT_180980d90 = &DAT_180859f6c;
  _DAT_180980d98 = &DAT_180859f68;
  _DAT_180980da0 = &DAT_180859f64;
  _DAT_180980da8 = &DAT_180859f60;
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x319bc) & 1) == 0) {
    *(uint *)(lVar2 + 0x319bc) = *(uint *)(lVar2 + 0x319bc) | 1;
    *(undefined2 *)(lVar2 + 0x30f76) = 0x177;
    *(undefined2 *)(lVar2 + 0x30f74) = 0x3a17;
    FUN_1805c2300(&LAB_1806f02a0);
  }
  lVar2 = *plVar1;
  _DAT_180980db0 = (byte *)(lVar2 + 0x30f74);
  if (*(char *)(lVar2 + 0x30f77) != '\0') {
    *_DAT_180980db0 = *_DAT_180980db0 ^ 0x51;
    *(byte *)(lVar2 + 0x30f75) = *(byte *)(lVar2 + 0x30f75) ^ 0xb;
    *(byte *)(lVar2 + 0x30f76) = *(byte *)(lVar2 + 0x30f76) ^ 0x77;
    *(undefined1 *)(lVar2 + 0x30f77) = 0;
  }
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x308b8) & 1) == 0) {
    *(uint *)(lVar2 + 0x308b8) = *(uint *)(lVar2 + 0x308b8) | 1;
    *(undefined2 *)(lVar2 + 0x30efe) = 0x177;
    *(undefined2 *)(lVar2 + 0x30efc) = 0x3917;
    FUN_1805c2300(&LAB_1806f0270);
  }
  lVar2 = *plVar1;
  _DAT_180980db8 = (byte *)(lVar2 + 0x30efc);
  if (*(char *)(lVar2 + 0x30eff) != '\0') {
    *_DAT_180980db8 = *_DAT_180980db8 ^ 0x51;
    *(byte *)(lVar2 + 0x30efd) = *(byte *)(lVar2 + 0x30efd) ^ 0xb;
    *(byte *)(lVar2 + 0x30efe) = *(byte *)(lVar2 + 0x30efe) ^ 0x77;
    *(undefined1 *)(lVar2 + 0x30eff) = 0;
  }
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x31170) & 1) == 0) {
    *(uint *)(lVar2 + 0x31170) = *(uint *)(lVar2 + 0x31170) | 1;
    *(undefined2 *)(lVar2 + 0x3074e) = 0x177;
    *(undefined2 *)(lVar2 + 0x3074c) = 0x3817;
    FUN_1805c2300(&LAB_1806f0240);
  }
  lVar2 = *plVar1;
  _DAT_180980dc0 = (byte *)(lVar2 + 0x3074c);
  if (*(char *)(lVar2 + 0x3074f) != '\0') {
    *_DAT_180980dc0 = *_DAT_180980dc0 ^ 0x51;
    *(byte *)(lVar2 + 0x3074d) = *(byte *)(lVar2 + 0x3074d) ^ 0xb;
    *(byte *)(lVar2 + 0x3074e) = *(byte *)(lVar2 + 0x3074e) ^ 0x77;
    *(undefined1 *)(lVar2 + 0x3074f) = 0;
  }
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x308bc) & 1) == 0) {
    *(uint *)(lVar2 + 0x308bc) = *(uint *)(lVar2 + 0x308bc) | 1;
    *(undefined2 *)(lVar2 + 0x311ee) = 0x177;
    *(undefined2 *)(lVar2 + 0x311ec) = 0x3f17;
    FUN_1805c2300(&LAB_1806f0210);
  }
  lVar2 = *plVar1;
  _DAT_180980dc8 = (byte *)(lVar2 + 0x311ec);
  if (*(char *)(lVar2 + 0x311ef) != '\0') {
    *_DAT_180980dc8 = *_DAT_180980dc8 ^ 0x51;
    *(byte *)(lVar2 + 0x311ed) = *(byte *)(lVar2 + 0x311ed) ^ 0xb;
    *(byte *)(lVar2 + 0x311ee) = *(byte *)(lVar2 + 0x311ee) ^ 0x77;
    *(undefined1 *)(lVar2 + 0x311ef) = 0;
  }
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x30a8c) & 1) == 0) {
    *(uint *)(lVar2 + 0x30a8c) = *(uint *)(lVar2 + 0x30a8c) | 1;
    *(undefined2 *)(lVar2 + 0x31a62) = 0x177;
    *(undefined2 *)(lVar2 + 0x31a60) = 0x3e17;
    FUN_1805c2300(&LAB_1806f01e0);
  }
  lVar2 = *plVar1;
  _DAT_180980dd0 = (byte *)(lVar2 + 0x31a60);
  if (*(char *)(lVar2 + 0x31a63) != '\0') {
    *_DAT_180980dd0 = *_DAT_180980dd0 ^ 0x51;
    *(byte *)(lVar2 + 0x31a61) = *(byte *)(lVar2 + 0x31a61) ^ 0xb;
    *(byte *)(lVar2 + 0x31a62) = *(byte *)(lVar2 + 0x31a62) ^ 0x77;
    *(undefined1 *)(lVar2 + 0x31a63) = 0;
  }
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x31628) & 1) == 0) {
    *(uint *)(lVar2 + 0x31628) = *(uint *)(lVar2 + 0x31628) | 1;
    *(undefined2 *)(lVar2 + 0x31682) = 0x177;
    *(undefined2 *)(lVar2 + 0x31680) = 0x3d17;
    FUN_1805c2300(&LAB_1806f01b0);
  }
  lVar2 = *plVar1;
  _DAT_180980dd8 = (byte *)(lVar2 + 0x31680);
  if (*(char *)(lVar2 + 0x31683) != '\0') {
    *_DAT_180980dd8 = *_DAT_180980dd8 ^ 0x51;
    *(byte *)(lVar2 + 0x31681) = *(byte *)(lVar2 + 0x31681) ^ 0xb;
    *(byte *)(lVar2 + 0x31682) = *(byte *)(lVar2 + 0x31682) ^ 0x77;
    *(undefined1 *)(lVar2 + 0x31683) = 0;
  }
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x31650) & 1) == 0) {
    *(uint *)(lVar2 + 0x31650) = *(uint *)(lVar2 + 0x31650) | 1;
    *(undefined2 *)(lVar2 + 0x309fa) = 0x177;
    *(undefined2 *)(lVar2 + 0x309f8) = 0x3c17;
    FUN_1805c2300(&LAB_1806f0180);
  }
  lVar2 = *plVar1;
  _DAT_180980de0 = (byte *)(lVar2 + 0x309f8);
  if (*(char *)(lVar2 + 0x309fb) != '\0') {
    *_DAT_180980de0 = *_DAT_180980de0 ^ 0x51;
    *(byte *)(lVar2 + 0x309f9) = *(byte *)(lVar2 + 0x309f9) ^ 0xb;
    *(byte *)(lVar2 + 0x309fa) = *(byte *)(lVar2 + 0x309fa) ^ 0x77;
    *(undefined1 *)(lVar2 + 0x309fb) = 0;
  }
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x30d5c) & 1) == 0) {
    *(uint *)(lVar2 + 0x30d5c) = *(uint *)(lVar2 + 0x30d5c) | 1;
    *(undefined2 *)(lVar2 + 0x30d52) = 0x177;
    *(undefined2 *)(lVar2 + 0x30d50) = 0x3317;
    FUN_1805c2300(&LAB_1806f0150);
  }
  lVar2 = *plVar1;
  _DAT_180980de8 = (byte *)(lVar2 + 0x30d50);
  if (*(char *)(lVar2 + 0x30d53) != '\0') {
    *_DAT_180980de8 = *_DAT_180980de8 ^ 0x51;
    *(byte *)(lVar2 + 0x30d51) = *(byte *)(lVar2 + 0x30d51) ^ 0xb;
    *(byte *)(lVar2 + 0x30d52) = *(byte *)(lVar2 + 0x30d52) ^ 0x77;
    *(undefined1 *)(lVar2 + 0x30d53) = 0;
  }
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x31840) & 1) == 0) {
    *(uint *)(lVar2 + 0x31840) = *(uint *)(lVar2 + 0x31840) | 1;
    *(undefined2 *)(lVar2 + 0x3097a) = 0x177;
    *(undefined2 *)(lVar2 + 0x30978) = 0x3217;
    FUN_1805c2300(&LAB_1806f0120);
  }
  lVar2 = *plVar1;
  _DAT_180980df0 = (byte *)(lVar2 + 0x30978);
  if (*(char *)(lVar2 + 0x3097b) != '\0') {
    *_DAT_180980df0 = *_DAT_180980df0 ^ 0x51;
    *(byte *)(lVar2 + 0x30979) = *(byte *)(lVar2 + 0x30979) ^ 0xb;
    *(byte *)(lVar2 + 0x3097a) = *(byte *)(lVar2 + 0x3097a) ^ 0x77;
    *(undefined1 *)(lVar2 + 0x3097b) = 0;
  }
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x31124) & 1) == 0) {
    *(uint *)(lVar2 + 0x31124) = *(uint *)(lVar2 + 0x31124) | 1;
    *(undefined1 *)(lVar2 + 0x30b2c) = 1;
    *(undefined4 *)(lVar2 + 0x30b28) = 0x13473a17;
    FUN_1805c2300(&LAB_1806f0100);
  }
  _DAT_180980df8 = FUN_18023d640(*plVar1 + 0x30b28);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x311e8) & 1) == 0) {
    *(uint *)(lVar2 + 0x311e8) = *(uint *)(lVar2 + 0x311e8) | 1;
    *(undefined1 *)(lVar2 + 0x30f28) = 1;
    *(undefined4 *)(lVar2 + 0x30f24) = 0x13463a17;
    FUN_1805c2300(&LAB_1806f00e0);
  }
  _DAT_180980e00 = FUN_18023d640(*plVar1 + 0x30f24);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x31ea4) & 1) == 0) {
    *(uint *)(lVar2 + 0x31ea4) = *(uint *)(lVar2 + 0x31ea4) | 1;
    *(undefined1 *)(lVar2 + 0x31d10) = 1;
    *(undefined4 *)(lVar2 + 0x31d0c) = 0x13453a17;
    FUN_1805c2300(&LAB_1806f00c0);
  }
  _DAT_180980e08 = FUN_18023d640(*plVar1 + 0x31d0c);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x30ce0) & 1) == 0) {
    *(uint *)(lVar2 + 0x30ce0) = *(uint *)(lVar2 + 0x30ce0) | 1;
    *(undefined1 *)(lVar2 + 0x3095c) = 1;
    *(undefined4 *)(lVar2 + 0x30958) = 0xd3781e3f;
    FUN_1805c2300(&LAB_1806f00a0);
  }
  _DAT_180980e10 = FUN_18023d580(*plVar1 + 0x30958);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x30760) & 1) == 0) {
    *(uint *)(lVar2 + 0x30760) = *(uint *)(lVar2 + 0x30760) | 1;
    *(undefined1 *)(lVar2 + 0x31d60) = 1;
    *(undefined4 *)(lVar2 + 0x31d5c) = 0xd37f1e3f;
    FUN_1805c2300(&LAB_1806f0080);
  }
  _DAT_180980e18 = FUN_18023d580(*plVar1 + 0x31d5c);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x3193c) & 1) == 0) {
    *(uint *)(lVar2 + 0x3193c) = *(uint *)(lVar2 + 0x3193c) | 1;
    *(undefined1 *)(lVar2 + 0x31ce8) = 1;
    *(undefined4 *)(lVar2 + 0x31ce4) = 0xd37e1e3f;
    FUN_1805c2300(&LAB_1806f0060);
  }
  _DAT_180980e20 = FUN_18023d580(*plVar1 + 0x31ce4);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x316d8) & 1) == 0) {
    *(uint *)(lVar2 + 0x316d8) = *(uint *)(lVar2 + 0x316d8) | 1;
    *(undefined1 *)(lVar2 + 0x31d74) = 1;
    *(undefined4 *)(lVar2 + 0x31d70) = 0xd37d1e3f;
    FUN_1805c2300(&LAB_1806f0040);
  }
  _DAT_180980e28 = FUN_18023d580(*plVar1 + 0x31d70);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x30d70) & 1) == 0) {
    *(uint *)(lVar2 + 0x30d70) = *(uint *)(lVar2 + 0x30d70) | 1;
    *(undefined1 *)(lVar2 + 0x30aa4) = 1;
    *(undefined4 *)(lVar2 + 0x30aa0) = 0xd37c1e3f;
    FUN_1805c2300(&LAB_1806f0020);
  }
  _DAT_180980e30 = FUN_18023d580(*plVar1 + 0x30aa0);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x312ac) & 1) == 0) {
    *(uint *)(lVar2 + 0x312ac) = *(uint *)(lVar2 + 0x312ac) | 1;
    *(undefined1 *)(lVar2 + 0x3119c) = 1;
    *(undefined4 *)(lVar2 + 0x31198) = 0xd3731e3f;
    FUN_1805c2300(&LAB_1806f0000);
  }
  _DAT_180980e38 = FUN_18023d580(*plVar1 + 0x31198);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x30e3c) & 1) == 0) {
    *(uint *)(lVar2 + 0x30e3c) = *(uint *)(lVar2 + 0x30e3c) | 1;
    *(undefined1 *)(lVar2 + 0x30ef4) = 1;
    *(undefined4 *)(lVar2 + 0x30ef0) = 0xd3721e3f;
    FUN_1805c2300(&LAB_1806effe0);
  }
  _DAT_180980e40 = FUN_18023d580(*plVar1 + 0x30ef0);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x31e80) & 1) == 0) {
    *(uint *)(lVar2 + 0x31e80) = *(uint *)(lVar2 + 0x31e80) | 1;
    *(undefined1 *)(lVar2 + 0x30858) = 1;
    *(undefined4 *)(lVar2 + 0x30854) = 0xd37b1d3f;
    FUN_1805c2300(&LAB_1806effc0);
  }
  _DAT_180980e48 = FUN_18023d580(*plVar1 + 0x30854);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x308b4) & 1) == 0) {
    *(uint *)(lVar2 + 0x308b4) = *(uint *)(lVar2 + 0x308b4) | 1;
    *(undefined1 *)(lVar2 + 0x31a2c) = 1;
    *(undefined4 *)(lVar2 + 0x31a28) = 0xd37a1d3f;
    FUN_1805c2300(&LAB_1806effa0);
  }
  _DAT_180980e50 = FUN_18023d580(*plVar1 + 0x31a28);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x3160c) & 1) == 0) {
    *(uint *)(lVar2 + 0x3160c) = *(uint *)(lVar2 + 0x3160c) | 1;
    *(undefined1 *)(lVar2 + 0x31a38) = 1;
    *(undefined4 *)(lVar2 + 0x31a34) = 0xd3791d3f;
    FUN_1805c2300(&LAB_1806eff80);
  }
  _DAT_180980e58 = FUN_18023d580(*plVar1 + 0x31a34);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x31d4c) & 1) == 0) {
    *(uint *)(lVar2 + 0x31d4c) = *(uint *)(lVar2 + 0x31d4c) | 1;
    *(undefined1 *)(lVar2 + 0x31ef8) = 1;
    *(undefined4 *)(lVar2 + 0x31ef4) = 0xd3781d3f;
    FUN_1805c2300(&LAB_1806eff60);
  }
  _DAT_180980e60 = FUN_18023d580(*plVar1 + 0x31ef4);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x30b30) & 1) == 0) {
    *(uint *)(lVar2 + 0x30b30) = *(uint *)(lVar2 + 0x30b30) | 1;
    *(undefined1 *)(lVar2 + 0x314b0) = 1;
    *(undefined4 *)(lVar2 + 0x314ac) = 0xd37f1d3f;
    FUN_1805c2300(&LAB_1806eff40);
  }
  _DAT_180980e68 = FUN_18023d580(*plVar1 + 0x314ac);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x30a3c) & 1) == 0) {
    *(uint *)(lVar2 + 0x30a3c) = *(uint *)(lVar2 + 0x30a3c) | 1;
    *(undefined2 *)(lVar2 + 0x3136a) = 0x151;
    *(undefined8 *)(lVar2 + 0x31360) = 0xcbe24551e63e5d40;
    *(undefined2 *)(lVar2 + 0x31368) = 0x4869;
    FUN_1805c2300(&LAB_1806eff10);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31360;
  if (*(char *)(lVar2 + 0x3136b) != '\0') {
    FUN_180055100(lVar3,0xb,0xbb8d372595512d01);
    *(undefined1 *)(lVar2 + 0x3136b) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980e70 = lVar3;
  if ((*(uint *)(lVar2 + 0x309b8) & 1) == 0) {
    *(uint *)(lVar2 + 0x309b8) = *(uint *)(lVar2 + 0x309b8) | 1;
    *(undefined1 *)(lVar2 + 0x31d0a) = 1;
    *(undefined4 *)(lVar2 + 0x31d04) = 0xf83c4242;
    *(undefined2 *)(lVar2 + 0x31d08) = 0x3744;
    FUN_1805c2300(&LAB_1806efee0);
  }
  _DAT_180980e78 = FUN_18023d490(*plVar1 + 0x31d04);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x311d4) & 1) == 0) {
    *(uint *)(lVar2 + 0x311d4) = *(uint *)(lVar2 + 0x311d4) | 1;
    *(undefined1 *)(lVar2 + 0x31ec2) = 1;
    *(undefined4 *)(lVar2 + 0x31ebc) = 0xe03f444c;
    *(undefined2 *)(lVar2 + 0x31ec0) = 0x3756;
    FUN_1805c2300(&LAB_1806efeb0);
  }
  _DAT_180980e80 = FUN_18023d490(*plVar1 + 0x31ebc);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x31014) & 1) == 0) {
    *(uint *)(lVar2 + 0x31014) = *(uint *)(lVar2 + 0x31014) | 1;
    *(undefined2 *)(lVar2 + 0x31336) = 0x18d;
    *(undefined4 *)(lVar2 + 0x31330) = 0xfc234851;
    *(undefined2 *)(lVar2 + 0x31334) = 0x534a;
    FUN_1805c2300(&LAB_1806efe80);
  }
  lVar2 = *plVar1;
  _DAT_180980e88 = (byte *)(lVar2 + 0x31330);
  if (*(char *)(lVar2 + 0x31337) != '\0') {
    *_DAT_180980e88 = *_DAT_180980e88 ^ 1;
    *(byte *)(lVar2 + 0x31331) = *(byte *)(lVar2 + 0x31331) ^ 0x2d;
    *(byte *)(lVar2 + 0x31332) = *(byte *)(lVar2 + 0x31332) ^ 0x51;
    *(byte *)(lVar2 + 0x31333) = *(byte *)(lVar2 + 0x31333) ^ 0x95;
    *(byte *)(lVar2 + 0x31334) = *(byte *)(lVar2 + 0x31334) ^ 0x25;
    *(byte *)(lVar2 + 0x31335) = *(byte *)(lVar2 + 0x31335) ^ 0x37;
    *(byte *)(lVar2 + 0x31336) = *(byte *)(lVar2 + 0x31336) ^ 0x8d;
    *(undefined1 *)(lVar2 + 0x31337) = 0;
  }
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x3191c) & 1) == 0) {
    *(uint *)(lVar2 + 0x3191c) = *(uint *)(lVar2 + 0x3191c) | 1;
    *(undefined1 *)(lVar2 + 0x31c5e) = 1;
    *(undefined4 *)(lVar2 + 0x31c58) = 0xe6304152;
    *(undefined2 *)(lVar2 + 0x31c5c) = 0x374d;
    FUN_1805c2300(&LAB_1806efe50);
  }
  _DAT_180980e90 = FUN_18023d490(*plVar1 + 0x31c58);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x30e80) & 1) == 0) {
    *(uint *)(lVar2 + 0x30e80) = *(uint *)(lVar2 + 0x30e80) | 1;
    *(undefined1 *)(lVar2 + 0x30952) = 1;
    *(undefined8 *)(lVar2 + 0x30948) = 0xd4e15846fc3c4852;
    *(undefined2 *)(lVar2 + 0x30950) = 0x2d6f;
    FUN_1805c2300(&LAB_1806efe20);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x30948;
  if (*(char *)(lVar2 + 0x30952) != '\0') {
    FUN_180055100(lVar3,10,0xbb8d372595512d01);
    *(undefined1 *)(lVar2 + 0x30952) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980e98 = lVar3;
  if ((*(uint *)(lVar2 + 0x312fc) & 1) == 0) {
    *(uint *)(lVar2 + 0x312fc) = *(uint *)(lVar2 + 0x312fc) | 1;
    *(undefined1 *)(lVar2 + 0x307be) = 1;
    *(undefined4 *)(lVar2 + 0x307b8) = 0xf4245c44;
    *(undefined2 *)(lVar2 + 0x307bc) = 0x3749;
    FUN_1805c2300(&LAB_1806efdf0);
  }
  _DAT_180980ea0 = FUN_18023d490(*plVar1 + 0x307b8);
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x3117c) & 1) == 0) {
    *(uint *)(lVar2 + 0x3117c) = *(uint *)(lVar2 + 0x3117c) | 1;
    *(undefined1 *)(lVar2 + 0x317f4) = 1;
    *(undefined8 *)(lVar2 + 0x317e8) = 0xd8ec4567e137484d;
    *(undefined4 *)(lVar2 + 0x317f0) = 0x9525486a;
    FUN_1805c2300(&LAB_1806efdc0);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x317e8;
  if (*(char *)(lVar2 + 0x317f4) != '\0') {
    FUN_180055100(lVar3,0xc,0xbb8d372595512d01);
    *(undefined1 *)(lVar2 + 0x317f4) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980ea8 = lVar3;
  if ((*(uint *)(lVar2 + 0x31c94) & 1) == 0) {
    *(uint *)(lVar2 + 0x31c94) = *(uint *)(lVar2 + 0x31c94) | 1;
    *(undefined1 *)(lVar2 + 0x31912) = 1;
    *(undefined8 *)(lVar2 + 0x31908) = 0x1cd2154678161cf9;
    *(undefined2 *)(lVar2 + 0x31910) = 0x7dd3;
    FUN_1805c2300(&LAB_1806efd90);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31908;
  if (*(char *)(lVar2 + 0x31912) != '\0') {
    FUN_180055100(lVar3,10,0x6fb3793513757dbb);
    *(undefined1 *)(lVar2 + 0x31912) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980eb0 = lVar3;
  if ((*(uint *)(lVar2 + 0x30b60) & 1) == 0) {
    *(uint *)(lVar2 + 0x30b60) = *(uint *)(lVar2 + 0x30b60) | 1;
    *(undefined2 *)(lVar2 + 0x30944) = 0x135;
    *(undefined8 *)(lVar2 + 0x30938) = 0xec13b417b1214e9;
    *(undefined4 *)(lVar2 + 0x30940) = 0x671016d8;
    FUN_1805c2300(&LAB_1806efd60);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x30938;
  if (*(char *)(lVar2 + 0x30945) != '\0') {
    FUN_180055100(lVar3,0xd,0x6fb3793513757dbb);
    *(undefined1 *)(lVar2 + 0x30945) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980eb8 = lVar3;
  if ((*(uint *)(lVar2 + 0x30d1c) & 1) == 0) {
    *(uint *)(lVar2 + 0x30d1c) = *(uint *)(lVar2 + 0x30d1c) | 1;
    *(undefined1 *)(lVar2 + 0x31694) = 1;
    *(undefined8 *)(lVar2 + 0x31688) = 0xcd0385065140ffc;
    *(undefined4 *)(lVar2 + 0x31690) = 0x130113de;
    FUN_1805c2300(&LAB_1806efd30);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31688;
  if (*(char *)(lVar2 + 0x31694) != '\0') {
    FUN_180055100(lVar3,0xc,0x6fb3793513757dbb);
    *(undefined1 *)(lVar2 + 0x31694) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980ec0 = lVar3;
  if ((*(uint *)(lVar2 + 0x31394) & 1) == 0) {
    *(uint *)(lVar2 + 0x31394) = *(uint *)(lVar2 + 0x31394) | 1;
    *(undefined2 *)(lVar2 + 0x30808) = 0x1bb;
    *(undefined8 *)(lVar2 + 0x30800) = 0x4d0167960051cf8;
    FUN_1805c2300(&LAB_1806efd00);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x30800;
  if (*(char *)(lVar2 + 0x30809) != '\0') {
    FUN_180055100(lVar3,9,0x6fb3793513757dbb);
    *(undefined1 *)(lVar2 + 0x30809) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980ec8 = lVar3;
  if ((*(uint *)(lVar2 + 0x310fc) & 1) == 0) {
    *(uint *)(lVar2 + 0x310fc) = *(uint *)(lVar2 + 0x310fc) | 1;
    *(undefined2 *)(lVar2 + 0x3160a) = 0x175;
    *(undefined8 *)(lVar2 + 0x31600) = 0xff15597c071ee8;
    *(undefined2 *)(lVar2 + 0x31608) = 0x16d8;
    FUN_1805c2300(&LAB_1806efcd0);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31600;
  if (*(char *)(lVar2 + 0x3160b) != '\0') {
    FUN_180055100(lVar3,0xb,0x6fb3793513757dbb);
    *(undefined1 *)(lVar2 + 0x3160b) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980ed0 = lVar3;
  if ((*(uint *)(lVar2 + 0x30f38) & 1) == 0) {
    *(uint *)(lVar2 + 0x30f38) = *(uint *)(lVar2 + 0x30f38) | 1;
    *(undefined1 *)(lVar2 + 0x319d0) = 1;
    *(undefined8 *)(lVar2 + 0x319c8) = 0x6fd81a5a5f1808f5;
    FUN_1805c2300(&LAB_1806efca0);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x319c8;
  if (*(char *)(lVar2 + 0x319d0) != '\0') {
    FUN_180055100(lVar3,8,0x6fb3793513757dbb);
    *(undefined1 *)(lVar2 + 0x319d0) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980ed8 = lVar3;
  if ((*(uint *)(lVar2 + 0x31e48) & 1) == 0) {
    *(uint *)(lVar2 + 0x31e48) = *(uint *)(lVar2 + 0x31e48) | 1;
    *(undefined1 *)(lVar2 + 0x3155c) = 1;
    *(undefined8 *)(lVar2 + 0x31550) = 0x1dd02a417d1c0feb;
    *(undefined4 *)(lVar2 + 0x31558) = 0x131b18de;
    FUN_1805c2300(&LAB_1806efc70);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31550;
  if (*(char *)(lVar2 + 0x3155c) != '\0') {
    FUN_180055100(lVar3,0xc,0x6fb3793513757dbb);
    *(undefined1 *)(lVar2 + 0x3155c) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980ee0 = lVar3;
  if ((*(uint *)(lVar2 + 0x316cc) & 1) == 0) {
    *(uint *)(lVar2 + 0x316cc) = *(uint *)(lVar2 + 0x316cc) | 1;
    *(undefined1 *)(lVar2 + 0x31d3a) = 1;
    *(undefined4 *)(lVar2 + 0x31d34) = 0x6027c69;
    *(undefined2 *)(lVar2 + 0x31d38) = 0xb5e6;
    FUN_1805c2300(&LAB_1806efc40);
  }
  auVar9 = _DAT_18086c780;
  lVar2 = *plVar1;
  _DAT_180980ee8 = (ushort *)(lVar2 + 0x31d34);
  if (*(char *)(lVar2 + 0x31d3a) != '\0') {
    if (DAT_180931e30 < 5) {
      do {
        *(byte *)(uVar4 + (longlong)_DAT_180980ee8) =
             *(byte *)(uVar4 + (longlong)_DAT_180980ee8) ^
             (byte)(0x7f53b58375771d39 >> (((byte)uVar4 & 7) << 3));
        uVar4 = uVar4 + 1;
      } while (uVar4 < 6);
    }
    else {
      auVar8 = vpsrlvq_avx2(_DAT_18086c780,ZEXT816(8) << 0x40);
      auVar8 = pshufb(auVar8,auVar10);
      *_DAT_180980ee8 = auVar8._0_2_ ^ *_DAT_180980ee8;
      auVar6._8_8_ = 0x18;
      auVar6._0_8_ = 0x10;
      auVar8 = vpsrlvq_avx2(auVar9,auVar6);
      auVar8 = pshufb(auVar8,auVar10);
      *(ushort *)(lVar2 + 0x31d36) = auVar8._0_2_ ^ *(ushort *)(lVar2 + 0x31d36);
      auVar7._8_8_ = 0x28;
      auVar7._0_8_ = 0x20;
      auVar9 = vpsrlvq_avx2(auVar9,auVar7);
      auVar10 = pshufb(auVar9,auVar10);
      *(ushort *)(lVar2 + 0x31d38) = auVar10._0_2_ ^ *(ushort *)(lVar2 + 0x31d38);
    }
    *(undefined1 *)(lVar2 + 0x31d3a) = 0;
  }
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x310e4) & 1) == 0) {
    *(uint *)(lVar2 + 0x310e4) = *(uint *)(lVar2 + 0x310e4) | 1;
    *(undefined1 *)(lVar2 + 0x30b70) = 1;
    *(undefined8 *)(lVar2 + 0x30b68) = 0x7f63d1e2050e7872;
    FUN_1805c2300(&LAB_1806efc10);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x30b68;
  if (*(char *)(lVar2 + 0x30b70) != '\0') {
    FUN_180055100(lVar3,8,0x7f53b58375771d39);
    *(undefined1 *)(lVar2 + 0x30b70) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980ef0 = lVar3;
  if ((*(uint *)(lVar2 + 0x313cc) & 1) == 0) {
    *(uint *)(lVar2 + 0x313cc) = *(uint *)(lVar2 + 0x313cc) | 1;
    *(undefined1 *)(lVar2 + 0x318b8) = 1;
    *(undefined8 *)(lVar2 + 0x318b0) = 0x7f62d1e2050e7872;
    FUN_1805c2300(&LAB_1806efbe0);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x318b0;
  if (*(char *)(lVar2 + 0x318b8) != '\0') {
    FUN_180055100(lVar3,8,0x7f53b58375771d39);
    *(undefined1 *)(lVar2 + 0x318b8) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980ef8 = lVar3;
  if ((*(uint *)(lVar2 + 0x315b8) & 1) == 0) {
    *(uint *)(lVar2 + 0x315b8) = *(uint *)(lVar2 + 0x315b8) | 1;
    *(undefined1 *)(lVar2 + 0x30f70) = 1;
    *(undefined8 *)(lVar2 + 0x30f68) = 0x7f61d1e2050e7872;
    FUN_1805c2300(&LAB_1806efbb0);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x30f68;
  if (*(char *)(lVar2 + 0x30f70) != '\0') {
    FUN_180055100(lVar3,8,0x7f53b58375771d39);
    *(undefined1 *)(lVar2 + 0x30f70) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980f00 = lVar3;
  if ((*(uint *)(lVar2 + 0x31eac) & 1) == 0) {
    *(uint *)(lVar2 + 0x31eac) = *(uint *)(lVar2 + 0x31eac) | 1;
    *(undefined1 *)(lVar2 + 0x311d0) = 1;
    *(undefined8 *)(lVar2 + 0x311c8) = 0x7f60d1e2050e7872;
    FUN_1805c2300(&LAB_1806efb80);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x311c8;
  if (*(char *)(lVar2 + 0x311d0) != '\0') {
    FUN_180055100(lVar3,8,0x7f53b58375771d39);
    *(undefined1 *)(lVar2 + 0x311d0) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980f08 = lVar3;
  if ((*(uint *)(lVar2 + 0x31d24) & 1) == 0) {
    *(uint *)(lVar2 + 0x31d24) = *(uint *)(lVar2 + 0x31d24) | 1;
    *(undefined1 *)(lVar2 + 0x30de0) = 1;
    *(undefined8 *)(lVar2 + 0x30dd8) = 0x7f67d1e2050e7872;
    FUN_1805c2300(&LAB_1806efb50);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x30dd8;
  if (*(char *)(lVar2 + 0x30de0) != '\0') {
    FUN_180055100(lVar3,8,0x7f53b58375771d39);
    *(undefined1 *)(lVar2 + 0x30de0) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980f10 = lVar3;
  if ((*(uint *)(lVar2 + 0x311dc) & 1) == 0) {
    *(uint *)(lVar2 + 0x311dc) = *(uint *)(lVar2 + 0x311dc) | 1;
    *(undefined1 *)(lVar2 + 0x308b0) = 1;
    *(undefined8 *)(lVar2 + 0x308a8) = 0x7f66d1e2050e7872;
    FUN_1805c2300(&LAB_1806efb20);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x308a8;
  if (*(char *)(lVar2 + 0x308b0) != '\0') {
    FUN_180055100(lVar3,8,0x7f53b58375771d39);
    *(undefined1 *)(lVar2 + 0x308b0) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980f18 = lVar3;
  if ((*(uint *)(lVar2 + 0x31e60) & 1) == 0) {
    *(uint *)(lVar2 + 0x31e60) = *(uint *)(lVar2 + 0x31e60) | 1;
    *(undefined1 *)(lVar2 + 0x31320) = 1;
    *(undefined8 *)(lVar2 + 0x31318) = 0x7f65d1e2050e7872;
    FUN_1805c2300(&LAB_1806efaf0);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31318;
  if (*(char *)(lVar2 + 0x31320) != '\0') {
    FUN_180055100(lVar3,8,0x7f53b58375771d39);
    *(undefined1 *)(lVar2 + 0x31320) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980f20 = lVar3;
  if ((*(uint *)(lVar2 + 0x30e60) & 1) == 0) {
    *(uint *)(lVar2 + 0x30e60) = *(uint *)(lVar2 + 0x30e60) | 1;
    *(undefined1 *)(lVar2 + 0x312a8) = 1;
    *(undefined8 *)(lVar2 + 0x312a0) = 0x97222fde7716720c;
    FUN_1805c2300(&LAB_1806efac0);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x312a0;
  if (*(char *)(lVar2 + 0x312a8) != '\0') {
    FUN_180055100(lVar3,8,0x97154bbf076f1747);
    *(undefined1 *)(lVar2 + 0x312a8) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980f28 = lVar3;
  if ((*(uint *)(lVar2 + 0x31ec4) & 1) == 0) {
    *(uint *)(lVar2 + 0x31ec4) = *(uint *)(lVar2 + 0x31ec4) | 1;
    *(undefined1 *)(lVar2 + 0x312e8) = 1;
    *(undefined8 *)(lVar2 + 0x312e0) = 0x972d2fde7716720c;
    FUN_1805c2300(&LAB_1806efa90);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x312e0;
  if (*(char *)(lVar2 + 0x312e8) != '\0') {
    FUN_180055100(lVar3,8,0x97154bbf076f1747);
    *(undefined1 *)(lVar2 + 0x312e8) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980f30 = lVar3;
  if ((*(uint *)(lVar2 + 0x30aa8) & 1) == 0) {
    *(uint *)(lVar2 + 0x30aa8) = *(uint *)(lVar2 + 0x30aa8) | 1;
    *(undefined1 *)(lVar2 + 0x30748) = 1;
    *(undefined8 *)(lVar2 + 0x30740) = 0x972c2fde7716720c;
    FUN_1805c2300(&LAB_1806efa60);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x30740;
  if (*(char *)(lVar2 + 0x30748) != '\0') {
    FUN_180055100(lVar3,8,0x97154bbf076f1747);
    *(undefined1 *)(lVar2 + 0x30748) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980f38 = lVar3;
  if ((*(uint *)(lVar2 + 0x31eb4) & 1) == 0) {
    *(uint *)(lVar2 + 0x31eb4) = *(uint *)(lVar2 + 0x31eb4) | 1;
    *(undefined1 *)(lVar2 + 0x31b76) = 1;
    *(undefined8 *)(lVar2 + 0x31b68) = 0xf2512fde7716720c;
    *(undefined4 *)(lVar2 + 0x31b70) = 0x66027e24;
    *(undefined2 *)(lVar2 + 0x31b74) = 0x4bd3;
    FUN_1805c2300(&LAB_1806efa30);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31b68;
  if (*(char *)(lVar2 + 0x31b76) != '\0') {
    FUN_180055100(lVar3,0xe,0x97154bbf076f1747);
    *(undefined1 *)(lVar2 + 0x31b76) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980f40 = lVar3;
  if ((*(uint *)(lVar2 + 0x30750) & 1) == 0) {
    *(uint *)(lVar2 + 0x30750) = *(uint *)(lVar2 + 0x30750) | 1;
    *(undefined2 *)(lVar2 + 0x30cf4) = 0x1bf;
    *(undefined8 *)(lVar2 + 0x30ce8) = 0xfe512fde7716720c;
    *(undefined4 *)(lVar2 + 0x30cf0) = 0x620b7e31;
    FUN_1805c2300(&LAB_1806efa00);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x30ce8;
  if (*(char *)(lVar2 + 0x30cf5) != '\0') {
    FUN_180055100(lVar3,0xd,0x97154bbf076f1747);
    *(undefined1 *)(lVar2 + 0x30cf5) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980f48 = lVar3;
  if ((*(uint *)(lVar2 + 0x31178) & 1) == 0) {
    *(uint *)(lVar2 + 0x31178) = *(uint *)(lVar2 + 0x31178) | 1;
    *(undefined2 *)(lVar2 + 0x31c46) = 0x115;
    *(undefined8 *)(lVar2 + 0x31c38) = 0xe2582fde7716720c;
    *(undefined4 *)(lVar2 + 0x31c40) = 0x7706632b;
    *(undefined2 *)(lVar2 + 0x31c44) = 0x32d3;
    FUN_1805c2300(&LAB_1806ef9d0);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31c38;
  if (*(char *)(lVar2 + 0x31c47) != '\0') {
    FUN_180055100(lVar3,0xf,0x97154bbf076f1747);
    *(undefined1 *)(lVar2 + 0x31c47) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980f50 = lVar3;
  if ((*(uint *)(lVar2 + 0x31ce0) & 1) == 0) {
    *(uint *)(lVar2 + 0x31ce0) = *(uint *)(lVar2 + 0x31ce0) | 1;
    *(undefined2 *)(lVar2 + 0x31966) = 0x129;
    *(undefined8 *)(lVar2 + 0x31958) = 0x547a01fe71849a88;
    *(undefined4 *)(lVar2 + 0x31960) = 0x608f8ba1;
    *(undefined2 *)(lVar2 + 0x31964) = 0x11fc;
    FUN_1805c2300(&LAB_1806ef9a0);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31958;
  if (*(char *)(lVar2 + 0x31967) != '\0') {
    FUN_180055100(lVar3,0xf,0x2129659f01fdffc3);
    *(undefined1 *)(lVar2 + 0x31967) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980f58 = lVar3;
  if ((*(uint *)(lVar2 + 0x30bac) & 1) == 0) {
    *(uint *)(lVar2 + 0x30bac) = *(uint *)(lVar2 + 0x30bac) | 1;
    *(undefined1 *)(lVar2 + 0x31c02) = 1;
    *(undefined8 *)(lVar2 + 0x31bf8) = 0x456801fe71849a88;
    *(undefined2 *)(lVar2 + 0x31c00) = 0xffa7;
    FUN_1805c2300(&LAB_1806ef970);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31bf8;
  if (*(char *)(lVar2 + 0x31c02) != '\0') {
    FUN_180055100(lVar3,10,0x2129659f01fdffc3);
    *(undefined1 *)(lVar2 + 0x31c02) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980f60 = lVar3;
  if ((*(uint *)(lVar2 + 0x31658) & 1) == 0) {
    *(uint *)(lVar2 + 0x31658) = *(uint *)(lVar2 + 0x31658) | 1;
    *(undefined1 *)(lVar2 + 0x316a4) = 1;
    *(undefined8 *)(lVar2 + 0x31698) = 0x4f6c01fe71849a88;
    *(undefined4 *)(lVar2 + 0x316a0) = 0x18f9ab7;
    FUN_1805c2300(&LAB_1806ef940);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31698;
  if (*(char *)(lVar2 + 0x316a4) != '\0') {
    FUN_180055100(lVar3,0xc,0x2129659f01fdffc3);
    *(undefined1 *)(lVar2 + 0x316a4) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980f68 = lVar3;
  if ((*(uint *)(lVar2 + 0x31594) & 1) == 0) {
    *(uint *)(lVar2 + 0x31594) = *(uint *)(lVar2 + 0x31594) | 1;
    *(undefined1 *)(lVar2 + 0x310dc) = 1;
    *(undefined8 *)(lVar2 + 0x310d0) = 0x506c01fe71849a88;
    *(undefined4 *)(lVar2 + 0x310d8) = 0x1919eb6;
    FUN_1805c2300(&LAB_1806ef910);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x310d0;
  if (*(char *)(lVar2 + 0x310dc) != '\0') {
    FUN_180055100(lVar3,0xc,0x2129659f01fdffc3);
    *(undefined1 *)(lVar2 + 0x310dc) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980f70 = lVar3;
  if ((*(uint *)(lVar2 + 0x319b0) & 1) == 0) {
    *(uint *)(lVar2 + 0x319b0) = *(uint *)(lVar2 + 0x319b0) | 1;
    *(undefined1 *)(lVar2 + 0x31e18) = 1;
    *(undefined8 *)(lVar2 + 0x31e10) = 0x1b26ab4c31de32c;
    FUN_1805c2300(&LAB_1806ef8e0);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31e10;
  if (*(char *)(lVar2 + 0x31e18) != '\0') {
    FUN_180055100(lVar3,8,0x1d909d5816d936d);
    *(undefined1 *)(lVar2 + 0x31e18) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980f78 = lVar3;
  if ((*(uint *)(lVar2 + 0x31918) & 1) == 0) {
    *(uint *)(lVar2 + 0x31918) = *(uint *)(lVar2 + 0x31918) | 1;
    *(undefined2 *)(lVar2 + 0x30c02) = 0x16d;
    *(undefined8 *)(lVar2 + 0x30bf8) = 0x60ae7bbac71de32c;
    *(undefined2 *)(lVar2 + 0x30c00) = 0xf71f;
    FUN_1805c2300(&LAB_1806ef8b0);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x30bf8;
  if (*(char *)(lVar2 + 0x30c03) != '\0') {
    FUN_180055100(lVar3,0xb,0x1d909d5816d936d);
    *(undefined1 *)(lVar2 + 0x30c03) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980f80 = lVar3;
  if ((*(uint *)(lVar2 + 0x3159c) & 1) == 0) {
    *(uint *)(lVar2 + 0x3159c) = *(uint *)(lVar2 + 0x3159c) | 1;
    *(undefined2 *)(lVar2 + 0x31e26) = 0x1d9;
    *(undefined4 *)(lVar2 + 0x31e20) = 0xb000f622;
    *(undefined2 *)(lVar2 + 0x31e24) = 0x3be5;
    FUN_1805c2300(&LAB_1806ef880);
  }
  lVar2 = *plVar1;
  _DAT_180980f88 = (byte *)(lVar2 + 0x31e20);
  if (*(char *)(lVar2 + 0x31e27) != '\0') {
    *_DAT_180980f88 = *_DAT_180980f88 ^ 0x6d;
    *(byte *)(lVar2 + 0x31e21) = *(byte *)(lVar2 + 0x31e21) ^ 0x93;
    *(byte *)(lVar2 + 0x31e22) = *(byte *)(lVar2 + 0x31e22) ^ 0x6d;
    *(byte *)(lVar2 + 0x31e23) = *(byte *)(lVar2 + 0x31e23) ^ 0x81;
    *(byte *)(lVar2 + 0x31e24) = *(byte *)(lVar2 + 0x31e24) ^ 0xd5;
    *(byte *)(lVar2 + 0x31e25) = *(byte *)(lVar2 + 0x31e25) ^ 9;
    *(byte *)(lVar2 + 0x31e26) = *(byte *)(lVar2 + 0x31e26) ^ 0xd9;
    *(undefined1 *)(lVar2 + 0x31e27) = 0;
  }
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x31af4) & 1) == 0) {
    *(uint *)(lVar2 + 0x31af4) = *(uint *)(lVar2 + 0x31af4) | 1;
    *(undefined2 *)(lVar2 + 0x310cc) = 0x15b;
    *(undefined8 *)(lVar2 + 0x310c0) = 0x7215842b5a88ae98;
    *(undefined4 *)(lVar2 + 0x310c8) = 0x4b97aeab;
    FUN_1805c2300(&LAB_1806ef850);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x310c0;
  if (*(char *)(lVar2 + 0x310cd) != '\0') {
    FUN_180055100(lVar3,0xd,0x2171e55b3fe5cfdf);
    *(undefined1 *)(lVar2 + 0x310cd) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980f90 = lVar3;
  if ((*(uint *)(lVar2 + 0x30cd8) & 1) == 0) {
    *(uint *)(lVar2 + 0x30cd8) = *(uint *)(lVar2 + 0x30cd8) | 1;
    *(undefined1 *)(lVar2 + 0x3167c) = 1;
    *(undefined8 *)(lVar2 + 0x31670) = 0x6315842b5a88ae98;
    *(undefined4 *)(lVar2 + 0x31678) = 0x3f8eacbe;
    FUN_1805c2300(&LAB_1806ef820);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31670;
  if (*(char *)(lVar2 + 0x3167c) != '\0') {
    FUN_180055100(lVar3,0xc,0x2171e55b3fe5cfdf);
    *(undefined1 *)(lVar2 + 0x3167c) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980f98 = lVar3;
  if ((*(uint *)(lVar2 + 0x309cc) & 1) == 0) {
    *(uint *)(lVar2 + 0x309cc) = *(uint *)(lVar2 + 0x309cc) | 1;
    *(undefined1 *)(lVar2 + 0x31bd8) = 1;
    *(undefined8 *)(lVar2 + 0x31bc8) = 0x75d974312e6e961a;
    *(undefined8 *)(lVar2 + 0x31bd0) = 0x33c973240766943c;
    FUN_1805c2300(&LAB_1806ef7f0);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31bc8;
  if (*(char *)(lVar2 + 0x31bd8) != '\0') {
    FUN_180055100(lVar3,0x10,0x33bd15414b03f75d);
    *(undefined1 *)(lVar2 + 0x31bd8) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980fa0 = lVar3;
  if ((*(uint *)(lVar2 + 0x31a00) & 1) == 0) {
    *(uint *)(lVar2 + 0x31a00) = *(uint *)(lVar2 + 0x31a00) | 1;
    *(undefined2 *)(lVar2 + 0x31110) = 0x15d;
    *(undefined8 *)(lVar2 + 0x31100) = 0x75d974312e6e961a;
    *(undefined8 *)(lVar2 + 0x31108) = 0x47d572281966943c;
    FUN_1805c2300(&LAB_1806ef7c0);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31100;
  if (*(char *)(lVar2 + 0x31111) != '\0') {
    FUN_180055100(lVar3,0x11,0x33bd15414b03f75d);
    *(undefined1 *)(lVar2 + 0x31111) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980fa8 = lVar3;
  if ((*(uint *)(lVar2 + 0x30eec) & 1) == 0) {
    *(uint *)(lVar2 + 0x30eec) = *(uint *)(lVar2 + 0x30eec) | 1;
    *(undefined1 *)(lVar2 + 0x3198e) = 1;
    *(undefined8 *)(lVar2 + 0x31980) = 0x75d974312e6e961a;
    *(undefined4 *)(lVar2 + 0x31988) = 0x1e66943c;
    *(undefined2 *)(lVar2 + 0x3198c) = 0x1531;
    FUN_1805c2300(&LAB_1806ef790);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31980;
  if (*(char *)(lVar2 + 0x3198e) != '\0') {
    FUN_180055100(lVar3,0xe,0x33bd15414b03f75d);
    *(undefined1 *)(lVar2 + 0x3198e) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980fb0 = lVar3;
  if ((*(uint *)(lVar2 + 0x30794) & 1) == 0) {
    *(uint *)(lVar2 + 0x30794) = *(uint *)(lVar2 + 0x30794) | 1;
    *(undefined1 *)(lVar2 + 0x30c28) = 1;
    *(undefined8 *)(lVar2 + 0x30c18) = 0x75d974312e6e961a;
    *(undefined8 *)(lVar2 + 0x30c20) = 0x33d3622e0f66943c;
    FUN_1805c2300(&LAB_1806ef760);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x30c18;
  if (*(char *)(lVar2 + 0x30c28) != '\0') {
    FUN_180055100(lVar3,0x10,0x33bd15414b03f75d);
    *(undefined1 *)(lVar2 + 0x30c28) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980fb8 = lVar3;
  if ((*(uint *)(lVar2 + 0x315a4) & 1) == 0) {
    *(uint *)(lVar2 + 0x315a4) = *(uint *)(lVar2 + 0x315a4) | 1;
    *(undefined1 *)(lVar2 + 0x319a8) = 1;
    *(undefined8 *)(lVar2 + 0x31998) = 0xed036c679ebeb894;
    *(undefined8 *)(lVar2 + 0x319a0) = 0xa9136b72b7b7b8a3;
    FUN_1805c2300(&LAB_1806ef730);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31998;
  if (*(char *)(lVar2 + 0x319a8) != '\0') {
    FUN_180055100(lVar3,0x10,0xa9670d17fbd3d9d3);
    *(undefined1 *)(lVar2 + 0x319a8) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980fc0 = lVar3;
  if ((*(uint *)(lVar2 + 0x315d4) & 1) == 0) {
    *(uint *)(lVar2 + 0x315d4) = *(uint *)(lVar2 + 0x315d4) | 1;
    *(undefined2 *)(lVar2 + 0x31db8) = 0x1d3;
    *(undefined8 *)(lVar2 + 0x31da8) = 0xed036c679ebeb894;
    *(undefined8 *)(lVar2 + 0x31db0) = 0xdd0f6a7ea9b7b8a3;
    FUN_1805c2300(&LAB_1806ef700);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31da8;
  if (*(char *)(lVar2 + 0x31db9) != '\0') {
    FUN_180055100(lVar3,0x11,0xa9670d17fbd3d9d3);
    *(undefined1 *)(lVar2 + 0x31db9) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980fc8 = lVar3;
  if ((*(uint *)(lVar2 + 0x316c0) & 1) == 0) {
    *(uint *)(lVar2 + 0x316c0) = *(uint *)(lVar2 + 0x316c0) | 1;
    *(undefined1 *)(lVar2 + 0x30c46) = 1;
    *(undefined8 *)(lVar2 + 0x30c38) = 0xed036c679ebeb894;
    *(undefined4 *)(lVar2 + 0x30c40) = 0xaeb7b8a3;
    *(undefined2 *)(lVar2 + 0x30c44) = 0xd67;
    FUN_1805c2300(&LAB_1806ef6d0);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x30c38;
  if (*(char *)(lVar2 + 0x30c46) != '\0') {
    FUN_180055100(lVar3,0xe,0xa9670d17fbd3d9d3);
    *(undefined1 *)(lVar2 + 0x30c46) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980fd0 = lVar3;
  if ((*(uint *)(lVar2 + 0x30a44) & 1) == 0) {
    *(uint *)(lVar2 + 0x30a44) = *(uint *)(lVar2 + 0x30a44) | 1;
    *(undefined1 *)(lVar2 + 0x30b08) = 1;
    *(undefined8 *)(lVar2 + 0x30af8) = 0xed036c679ebeb894;
    *(undefined8 *)(lVar2 + 0x30b00) = 0xa9097a78bfb7b8a3;
    FUN_1805c2300(&LAB_1806ef6a0);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x30af8;
  if (*(char *)(lVar2 + 0x30b08) != '\0') {
    FUN_180055100(lVar3,0x10,0xa9670d17fbd3d9d3);
    *(undefined1 *)(lVar2 + 0x30b08) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980fd8 = lVar3;
  if ((*(uint *)(lVar2 + 0x3116c) & 1) == 0) {
    *(uint *)(lVar2 + 0x3116c) = *(uint *)(lVar2 + 0x3116c) | 1;
    *(undefined1 *)(lVar2 + 0x30a2a) = 1;
    *(undefined8 *)(lVar2 + 0x30a20) = 0xa3eff2bd1872c0fa;
    *(undefined2 *)(lVar2 + 0x30a28) = 0xa18c;
    FUN_1805c2300(&LAB_1806ef670);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x30a20;
  if (*(char *)(lVar2 + 0x30a2a) != '\0') {
    FUN_180055100(lVar3,10,0xef8b93cd7d1fa1bd);
    *(undefined1 *)(lVar2 + 0x30a2a) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980fe0 = lVar3;
  if ((*(uint *)(lVar2 + 0x30908) & 1) == 0) {
    *(uint *)(lVar2 + 0x30908) = *(uint *)(lVar2 + 0x30908) | 1;
    *(undefined1 *)(lVar2 + 0x31722) = 1;
    *(undefined8 *)(lVar2 + 0x31718) = 0xbdeff2bd1872c0fa;
    *(undefined2 *)(lVar2 + 0x31720) = 0xa18c;
    FUN_1805c2300(&LAB_1806ef640);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31718;
  if (*(char *)(lVar2 + 0x31722) != '\0') {
    FUN_180055100(lVar3,10,0xef8b93cd7d1fa1bd);
    *(undefined1 *)(lVar2 + 0x31722) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980fe8 = lVar3;
  if ((*(uint *)(lVar2 + 0x31994) & 1) == 0) {
    *(uint *)(lVar2 + 0x31994) = *(uint *)(lVar2 + 0x31994) | 1;
    *(undefined1 *)(lVar2 + 0x308ea) = 1;
    *(undefined8 *)(lVar2 + 0x308e0) = 0xa3eff2bd1872c0fa;
    *(undefined2 *)(lVar2 + 0x308e8) = 0xa18f;
    FUN_1805c2300(&LAB_1806ef610);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x308e0;
  if (*(char *)(lVar2 + 0x308ea) != '\0') {
    FUN_180055100(lVar3,10,0xef8b93cd7d1fa1bd);
    *(undefined1 *)(lVar2 + 0x308ea) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980ff0 = lVar3;
  if ((*(uint *)(lVar2 + 0x30ad8) & 1) == 0) {
    *(uint *)(lVar2 + 0x30ad8) = *(uint *)(lVar2 + 0x30ad8) | 1;
    *(undefined1 *)(lVar2 + 0x30a9a) = 1;
    *(undefined8 *)(lVar2 + 0x30a90) = 0xbdeff2bd1872c0fa;
    *(undefined2 *)(lVar2 + 0x30a98) = 0xa18f;
    FUN_1805c2300(&LAB_1806ef5e0);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x30a90;
  if (*(char *)(lVar2 + 0x30a9a) != '\0') {
    FUN_180055100(lVar3,10,0xef8b93cd7d1fa1bd);
    *(undefined1 *)(lVar2 + 0x30a9a) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180980ff8 = lVar3;
  if ((*(uint *)(lVar2 + 0x31974) & 1) == 0) {
    *(uint *)(lVar2 + 0x31974) = *(uint *)(lVar2 + 0x31974) | 1;
    *(undefined1 *)(lVar2 + 0x31062) = 1;
    *(undefined8 *)(lVar2 + 0x31058) = 0xa3eff2bd1872c0fa;
    *(undefined2 *)(lVar2 + 0x31060) = 0xa18e;
    FUN_1805c2300(&LAB_1806ef5b0);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31058;
  if (*(char *)(lVar2 + 0x31062) != '\0') {
    FUN_180055100(lVar3,10,0xef8b93cd7d1fa1bd);
    *(undefined1 *)(lVar2 + 0x31062) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180981000 = lVar3;
  if ((*(uint *)(lVar2 + 0x31844) & 1) == 0) {
    *(uint *)(lVar2 + 0x31844) = *(uint *)(lVar2 + 0x31844) | 1;
    *(undefined1 *)(lVar2 + 0x31072) = 1;
    *(undefined8 *)(lVar2 + 0x31068) = 0xbdeff2bd1872c0fa;
    *(undefined2 *)(lVar2 + 0x31070) = 0xa18e;
    FUN_1805c2300(&LAB_1806ef580);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31068;
  if (*(char *)(lVar2 + 0x31072) != '\0') {
    FUN_180055100(lVar3,10,0xef8b93cd7d1fa1bd);
    *(undefined1 *)(lVar2 + 0x31072) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180981008 = lVar3;
  if ((*(uint *)(lVar2 + 0x30f88) & 1) == 0) {
    *(uint *)(lVar2 + 0x30f88) = *(uint *)(lVar2 + 0x30f88) | 1;
    *(undefined1 *)(lVar2 + 0x31312) = 1;
    *(undefined8 *)(lVar2 + 0x31300) = 0x37159a2de2b4d406;
    *(undefined8 *)(lVar2 + 0x31308) = 0x1d14b736e4b0c112;
    *(undefined2 *)(lVar2 + 0x31310) = 0xb535;
    FUN_1805c2300(&LAB_1806ef550);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31300;
  if (*(char *)(lVar2 + 0x31312) != '\0') {
    FUN_180055100(lVar3,0x12,0x7b71fb5d87d9b541);
    *(undefined1 *)(lVar2 + 0x31312) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180981010 = lVar3;
  if ((*(uint *)(lVar2 + 0x31cb0) & 1) == 0) {
    *(uint *)(lVar2 + 0x31cb0) = *(uint *)(lVar2 + 0x31cb0) | 1;
    *(undefined2 *)(lVar2 + 0x30fba) = 0x1d9;
    *(undefined8 *)(lVar2 + 0x30fa8) = 0x37159a2de2b4d406;
    *(undefined8 *)(lVar2 + 0x30fb0) = 0x1c18a936e4b0c112;
    *(undefined2 *)(lVar2 + 0x30fb8) = 0xc129;
    FUN_1805c2300(&LAB_1806ef520);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x30fa8;
  if (*(char *)(lVar2 + 0x30fbb) != '\0') {
    FUN_180055100(lVar3,0x13,0x7b71fb5d87d9b541);
    *(undefined1 *)(lVar2 + 0x30fbb) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180981018 = lVar3;
  if ((*(uint *)(lVar2 + 0x316a8) & 1) == 0) {
    *(uint *)(lVar2 + 0x316a8) = *(uint *)(lVar2 + 0x316a8) | 1;
    *(undefined1 *)(lVar2 + 0x30850) = 1;
    *(undefined8 *)(lVar2 + 0x30840) = 0x37159a2de2b4d406;
    *(undefined8 *)(lVar2 + 0x30848) = 0x7b01ae36e4b0c112;
    FUN_1805c2300(&LAB_1806ef4f0);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x30840;
  if (*(char *)(lVar2 + 0x30850) != '\0') {
    FUN_180055100(lVar3,0x10,0x7b71fb5d87d9b541);
    *(undefined1 *)(lVar2 + 0x30850) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180981020 = lVar3;
  if ((*(uint *)(lVar2 + 0x31c80) & 1) == 0) {
    *(uint *)(lVar2 + 0x31c80) = *(uint *)(lVar2 + 0x31c80) | 1;
    *(undefined1 *)(lVar2 + 0x311ba) = 1;
    *(undefined8 *)(lVar2 + 0x311a8) = 0x37159a2de2b4d406;
    *(undefined8 *)(lVar2 + 0x311b0) = 0xc1ebf36e4b0c112;
    *(undefined2 *)(lVar2 + 0x311b8) = 0xb52f;
    FUN_1805c2300(&LAB_1806ef4c0);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x311a8;
  if (*(char *)(lVar2 + 0x311ba) != '\0') {
    FUN_180055100(lVar3,0x12,0x7b71fb5d87d9b541);
    *(undefined1 *)(lVar2 + 0x311ba) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180981028 = lVar3;
  if ((*(uint *)(lVar2 + 0x3165c) & 1) == 0) {
    *(uint *)(lVar2 + 0x3165c) = *(uint *)(lVar2 + 0x3165c) | 1;
    *(undefined1 *)(lVar2 + 0x31262) = 1;
    *(undefined8 *)(lVar2 + 0x31250) = 0xb52392b16a2ceed6;
    *(undefined8 *)(lVar2 + 0x31258) = 0x8122bfaa6c28fbc2;
    *(undefined2 *)(lVar2 + 0x31260) = 0x8fe5;
    FUN_1805c2300(&LAB_1806ef490);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31250;
  if (*(char *)(lVar2 + 0x31262) != '\0') {
    FUN_180055100(lVar3,0x12,0xe747f3c10f418f91);
    *(undefined1 *)(lVar2 + 0x31262) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180981030 = lVar3;
  if ((*(uint *)(lVar2 + 0x31b64) & 1) == 0) {
    *(uint *)(lVar2 + 0x31b64) = *(uint *)(lVar2 + 0x31b64) | 1;
    *(undefined2 *)(lVar2 + 0x30b8a) = 0x141;
    *(undefined8 *)(lVar2 + 0x30b78) = 0xb52392b16a2ceed6;
    *(undefined8 *)(lVar2 + 0x30b80) = 0x802ea1aa6c28fbc2;
    *(undefined2 *)(lVar2 + 0x30b88) = 0xfbf9;
    FUN_1805c2300(&LAB_1806ef460);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x30b78;
  if (*(char *)(lVar2 + 0x30b8b) != '\0') {
    FUN_180055100(lVar3,0x13,0xe747f3c10f418f91);
    *(undefined1 *)(lVar2 + 0x30b8b) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180981038 = lVar3;
  if ((*(uint *)(lVar2 + 0x30dfc) & 1) == 0) {
    *(uint *)(lVar2 + 0x30dfc) = *(uint *)(lVar2 + 0x30dfc) | 1;
    *(undefined1 *)(lVar2 + 0x31dd0) = 1;
    *(undefined8 *)(lVar2 + 0x31dc0) = 0xb52392b16a2ceed6;
    *(undefined8 *)(lVar2 + 0x31dc8) = 0xe737a6aa6c28fbc2;
    FUN_1805c2300(&LAB_1806ef430);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31dc0;
  if (*(char *)(lVar2 + 0x31dd0) != '\0') {
    FUN_180055100(lVar3,0x10,0xe747f3c10f418f91);
    *(undefined1 *)(lVar2 + 0x31dd0) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180981040 = lVar3;
  if ((*(uint *)(lVar2 + 0x31598) & 1) == 0) {
    *(uint *)(lVar2 + 0x31598) = *(uint *)(lVar2 + 0x31598) | 1;
    *(undefined1 *)(lVar2 + 0x30b22) = 1;
    *(undefined8 *)(lVar2 + 0x30b10) = 0xb52392b16a2ceed6;
    *(undefined8 *)(lVar2 + 0x30b18) = 0x9028b7aa6c28fbc2;
    *(undefined2 *)(lVar2 + 0x30b20) = 0x8fff;
    FUN_1805c2300(&LAB_1806ef400);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x30b10;
  if (*(char *)(lVar2 + 0x30b22) != '\0') {
    FUN_180055100(lVar3,0x12,0xe747f3c10f418f91);
    *(undefined1 *)(lVar2 + 0x30b22) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180981048 = lVar3;
  if ((*(uint *)(lVar2 + 0x31504) & 1) == 0) {
    *(uint *)(lVar2 + 0x31504) = *(uint *)(lVar2 + 0x31504) | 1;
    *(undefined1 *)(lVar2 + 0x30f4a) = 1;
    *(undefined8 *)(lVar2 + 0x30f40) = 0xf9182518700e4456;
    *(undefined2 *)(lVar2 + 0x30f48) = 0x2b6f;
    FUN_1805c2300(&LAB_1806ef3d0);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x30f40;
  if (*(char *)(lVar2 + 0x30f4a) != '\0') {
    FUN_180055100(lVar3,10,0x9f7d697d037b2b1b);
    *(undefined1 *)(lVar2 + 0x30f4a) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180981050 = lVar3;
  if ((*(uint *)(lVar2 + 0x31684) & 1) == 0) {
    *(uint *)(lVar2 + 0x31684) = *(uint *)(lVar2 + 0x31684) | 1;
    *(undefined2 *)(lVar2 + 0x31d5a) = 0x17b;
    *(undefined8 *)(lVar2 + 0x31d50) = 0xf8143b18700e4456;
    *(undefined2 *)(lVar2 + 0x31d58) = 0x5f73;
    FUN_1805c2300(&LAB_1806ef3a0);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31d50;
  if (*(char *)(lVar2 + 0x31d5b) != '\0') {
    FUN_180055100(lVar3,0xb,0x9f7d697d037b2b1b);
    *(undefined1 *)(lVar2 + 0x31d5b) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180981058 = lVar3;
  if ((*(uint *)(lVar2 + 0x30d20) & 1) == 0) {
    *(uint *)(lVar2 + 0x30d20) = *(uint *)(lVar2 + 0x30d20) | 1;
    *(undefined1 *)(lVar2 + 0x31a84) = 1;
    *(undefined8 *)(lVar2 + 0x31a78) = 0xfb142418700e4456;
    *(undefined4 *)(lVar2 + 0x31a80) = 0x31e477f;
    FUN_1805c2300(&LAB_1806ef370);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31a78;
  if (*(char *)(lVar2 + 0x31a84) != '\0') {
    FUN_180055100(lVar3,0xc,0x9f7d697d037b2b1b);
    *(undefined1 *)(lVar2 + 0x31a84) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180981060 = lVar3;
  if ((*(uint *)(lVar2 + 0x309d0) & 1) == 0) {
    *(uint *)(lVar2 + 0x309d0) = *(uint *)(lVar2 + 0x309d0) | 1;
    *(undefined1 *)(lVar2 + 0x31d00) = 1;
    *(undefined8 *)(lVar2 + 0x31cf8) = 0x9f4c3118700e4456;
    FUN_1805c2300(&LAB_1806ef340);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31cf8;
  if (*(char *)(lVar2 + 0x31d00) != '\0') {
    FUN_180055100(lVar3,8,0x9f7d697d037b2b1b);
    *(undefined1 *)(lVar2 + 0x31d00) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180981068 = lVar3;
  if ((*(uint *)(lVar2 + 0x31c4c) & 1) == 0) {
    *(uint *)(lVar2 + 0x31c4c) = *(uint *)(lVar2 + 0x31c4c) | 1;
    *(undefined1 *)(lVar2 + 0x31ea0) = 1;
    *(undefined8 *)(lVar2 + 0x31e98) = 0x9f4f3118700e4456;
    FUN_1805c2300(&LAB_1806ef310);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31e98;
  if (*(char *)(lVar2 + 0x31ea0) != '\0') {
    FUN_180055100(lVar3,8,0x9f7d697d037b2b1b);
    *(undefined1 *)(lVar2 + 0x31ea0) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180981070 = lVar3;
  if ((*(uint *)(lVar2 + 0x31610) & 1) == 0) {
    *(uint *)(lVar2 + 0x31610) = *(uint *)(lVar2 + 0x31610) | 1;
    *(undefined1 *)(lVar2 + 0x310bc) = 1;
    *(undefined8 *)(lVar2 + 0x310b0) = 0xfa153e18700e4456;
    *(undefined4 *)(lVar2 + 0x310b8) = 0x323477e;
    FUN_1805c2300(&LAB_1806ef2e0);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x310b0;
  if (*(char *)(lVar2 + 0x310bc) != '\0') {
    FUN_180055100(lVar3,0xc,0x9f7d697d037b2b1b);
    *(undefined1 *)(lVar2 + 0x310bc) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180981078 = lVar3;
  if ((*(uint *)(lVar2 + 0x311a0) & 1) == 0) {
    *(uint *)(lVar2 + 0x311a0) = *(uint *)(lVar2 + 0x311a0) | 1;
    *(undefined1 *)(lVar2 + 0x31e5c) = 1;
    *(undefined8 *)(lVar2 + 0x31e50) = 0xfa153e18700e4456;
    *(undefined4 *)(lVar2 + 0x31e58) = 0x322477e;
    FUN_1805c2300(&LAB_1806ef2b0);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x31e50;
  if (*(char *)(lVar2 + 0x31e5c) != '\0') {
    FUN_180055100(lVar3,0xc,0x9f7d697d037b2b1b);
    *(undefined1 *)(lVar2 + 0x31e5c) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180981080 = lVar3;
  if ((*(uint *)(lVar2 + 0x31e94) & 1) == 0) {
    *(uint *)(lVar2 + 0x31e94) = *(uint *)(lVar2 + 0x31e94) | 1;
    *(undefined1 *)(lVar2 + 0x30e48) = 1;
    *(undefined8 *)(lVar2 + 0x30e40) = 0xdd458599dc778614;
    FUN_1805c2300(&LAB_1806ef280);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x30e40;
  if (*(char *)(lVar2 + 0x30e48) != '\0') {
    FUN_180055100(lVar3,8,0xdd29f7ed9f13e959);
    *(undefined1 *)(lVar2 + 0x30e48) = 0;
  }
  lVar2 = *plVar1;
  DAT_180981088 = lVar3;
  if ((*(uint *)(lVar2 + 0x311f4) & 1) == 0) {
    *(uint *)(lVar2 + 0x311f4) = *(uint *)(lVar2 + 0x311f4) | 1;
    *(undefined2 *)(lVar2 + 0x30bf0) = 0x159;
    *(undefined8 *)(lVar2 + 0x30be8) = 0xa94f9e85cc778614;
    FUN_1805c2300(&LAB_1806ef250);
  }
  lVar2 = *plVar1;
  lVar3 = lVar2 + 0x30be8;
  if (*(char *)(lVar2 + 0x30bf1) != '\0') {
    FUN_180055100(lVar3,9,0xdd29f7ed9f13e959);
    *(undefined1 *)(lVar2 + 0x30bf1) = 0;
  }
  lVar2 = *plVar1;
  _DAT_180981090 = lVar3;
  if ((*(uint *)(lVar2 + 0x313e4) & 1) == 0) {
    *(uint *)(lVar2 + 0x313e4) = *(uint *)(lVar2 + 0x313e4) | 1;
    *(undefined2 *)(lVar2 + 0x31036) = 0x129;
    *(undefined4 *)(lVar2 + 0x31030) = 0xde778614;
    *(undefined2 *)(lVar2 + 0x31034) = 0x8381;
    FUN_1805c2300(&LAB_1806ef220);
  }
  lVar2 = *plVar1;
  _DAT_180981098 = (byte *)(lVar2 + 0x31030);
  if (*(char *)(lVar2 + 0x31037) != '\0') {
    *_DAT_180981098 = *_DAT_180981098 ^ 0x59;
    *(byte *)(lVar2 + 0x31031) = *(byte *)(lVar2 + 0x31031) ^ 0xe9;
    *(byte *)(lVar2 + 0x31032) = *(byte *)(lVar2 + 0x31032) ^ 0x13;
    *(byte *)(lVar2 + 0x31033) = *(byte *)(lVar2 + 0x31033) ^ 0x9f;
    *(byte *)(lVar2 + 0x31034) = *(byte *)(lVar2 + 0x31034) ^ 0xed;
    *(byte *)(lVar2 + 0x31035) = *(byte *)(lVar2 + 0x31035) ^ 0xf7;
    *(byte *)(lVar2 + 0x31036) = *(byte *)(lVar2 + 0x31036) ^ 0x29;
    *(undefined1 *)(lVar2 + 0x31037) = 0;
  }
  lVar2 = *plVar1;
  if ((*(uint *)(lVar2 + 0x30c94) & 1) == 0) {
    *(uint *)(lVar2 + 0x30c94) = *(uint *)(lVar2 + 0x30c94) | 1;
    *(undefined2 *)(lVar2 + 0x30cc8) = 0x159;
    *(undefined8 *)(lVar2 + 0x30cc0) = 0xaf4c8798cc778614;
    FUN_1805c2300(&LAB_1806ef1f0);
  }
  lVar2 = *plVar1;
  if (*(char *)(lVar2 + 0x30cc9) != '\0') {
    FUN_180055100(lVar2 + 0x30cc0,9,0xdd29f7ed9f13e959);
    *(undefined1 *)(lVar2 + 0x30cc9) = 0;
  }
  _DAT_1809810a0 = lVar2 + 0x30cc0;
  return;
}



/* ==================================================================== */
/* 1800e8c90 / FUN_1800e8c90 */

/* WARNING: Function: __chkstk replaced with injection: alloca_probe */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined4 * FUN_1800e8c90(void)

{
  void *pvVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  byte *pbVar4;
  ulonglong uVar5;
  longlong lVar6;
  longlong lVar7;
  ulonglong uVar8;
  ushort *puVar9;
  longlong lVar10;
  undefined8 *puVar11;
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined4 local_res10 [2];
  undefined4 local_res18 [2];
  undefined4 local_res20 [2];
  undefined8 *local_28e8;
  undefined8 *local_28e0;
  undefined2 local_28d8;
  undefined2 uStack_28d6;
  undefined2 uStack_28d4;
  undefined2 uStack_28d2;
  undefined4 local_28d0;
  undefined2 local_28cc;
  undefined2 local_28c8;
  undefined2 uStack_28c6;
  undefined2 uStack_28c4;
  undefined2 uStack_28c2;
  undefined4 local_28b8;
  undefined4 local_28b4;
  undefined4 local_28b0;
  undefined4 local_28ac;
  undefined4 local_28a8;
  undefined4 local_28a4;
  undefined4 local_28a0;
  undefined4 local_289c;
  undefined4 local_2898 [2];
  undefined8 local_2890;
  undefined8 uStack_2888;
  undefined8 local_2880;
  undefined8 uStack_2878;
  undefined8 local_2870;
  undefined8 uStack_2868;
  undefined1 local_2860 [16];
  undefined8 local_2850;
  undefined8 uStack_2848;
  undefined1 local_2840 [16];
  undefined8 local_2830;
  undefined8 uStack_2828;
  undefined1 local_2820 [16];
  undefined8 local_2810;
  undefined8 uStack_2808;
  undefined1 local_2800 [16];
  undefined8 local_27f0;
  undefined8 uStack_27e8;
  undefined1 local_27e0 [16];
  undefined8 local_27d0;
  undefined8 uStack_27c8;
  undefined1 local_27c0 [16];
  undefined8 local_27b0;
  undefined8 uStack_27a8;
  undefined1 local_27a0 [16];
  undefined8 local_2790;
  undefined8 uStack_2788;
  undefined1 local_2780 [16];
  undefined8 local_2770;
  undefined8 uStack_2768;
  undefined1 local_2760 [16];
  undefined8 local_2750;
  undefined8 uStack_2748;
  undefined1 local_2740 [16];
  undefined8 local_2730;
  undefined8 uStack_2728;
  undefined1 local_2720 [16];
  undefined8 local_2710;
  undefined8 uStack_2708;
  undefined1 local_2700 [16];
  undefined8 local_26f0;
  undefined8 uStack_26e8;
  undefined1 local_26e0 [16];
  undefined8 local_26d0;
  undefined8 uStack_26c8;
  undefined1 local_26c0 [16];
  undefined8 local_26b0;
  undefined8 uStack_26a8;
  undefined1 local_26a0 [16];
  undefined8 local_2690;
  undefined8 uStack_2688;
  undefined1 local_2680 [16];
  undefined8 local_2668;
  undefined8 uStack_2660;
  undefined1 local_2658 [16];
  undefined8 local_2648;
  undefined8 uStack_2640;
  undefined1 local_2638 [16];
  undefined8 local_2628;
  undefined8 uStack_2620;
  undefined1 local_2618 [16];
  undefined8 local_2608;
  undefined8 uStack_2600;
  undefined1 local_25f8 [16];
  undefined8 local_25e8 [4];
  undefined8 local_25c8 [4];
  undefined8 local_25a8 [4];
  undefined8 local_2588 [4];
  undefined8 local_2568 [4];
  undefined8 local_2548;
  undefined8 uStack_2540;
  undefined1 local_2538 [16];
  undefined8 local_2528;
  undefined8 uStack_2520;
  undefined1 local_2518 [16];
  undefined8 local_2508;
  undefined8 uStack_2500;
  undefined1 local_24f8 [16];
  undefined8 local_24e8;
  undefined8 uStack_24e0;
  undefined1 local_24d8 [16];
  undefined8 local_24c8;
  undefined8 uStack_24c0;
  undefined1 local_24b8 [16];
  undefined8 local_24a8;
  undefined8 uStack_24a0;
  undefined1 local_2498 [16];
  undefined8 local_2488;
  undefined8 uStack_2480;
  undefined1 local_2478 [16];
  undefined8 local_2468;
  undefined8 uStack_2460;
  undefined1 local_2458 [16];
  undefined8 local_2448;
  undefined8 uStack_2440;
  undefined1 local_2438 [16];
  undefined8 local_2428;
  undefined8 uStack_2420;
  undefined1 local_2418 [16];
  undefined8 local_2408;
  undefined8 uStack_2400;
  undefined1 local_23f8 [16];
  undefined8 local_23e8;
  undefined8 uStack_23e0;
  undefined1 local_23d8 [16];
  undefined8 local_23c8;
  undefined8 uStack_23c0;
  undefined1 local_23b8 [16];
  undefined8 local_23a8;
  undefined8 uStack_23a0;
  undefined1 local_2398 [16];
  undefined8 local_2388;
  undefined8 uStack_2380;
  undefined1 local_2378 [16];
  undefined8 local_2368;
  undefined8 uStack_2360;
  undefined1 local_2358 [16];
  undefined8 local_2348;
  undefined8 uStack_2340;
  undefined1 local_2338 [16];
  undefined8 local_2328;
  undefined8 uStack_2320;
  undefined1 local_2318 [16];
  undefined8 local_2308;
  undefined8 uStack_2300;
  undefined1 local_22f8 [16];
  undefined8 local_22e8;
  undefined8 uStack_22e0;
  undefined1 local_22d8 [16];
  undefined8 local_22c8;
  undefined8 uStack_22c0;
  undefined1 local_22b8 [16];
  undefined8 local_22a8;
  undefined8 uStack_22a0;
  undefined8 local_2298;
  undefined8 uStack_2290;
  undefined8 local_2288;
  undefined8 uStack_2280;
  undefined8 local_2278;
  undefined8 uStack_2270;
  undefined8 local_2268;
  undefined8 uStack_2260;
  undefined8 local_2258;
  undefined8 uStack_2250;
  undefined8 local_2248;
  undefined8 uStack_2240;
  undefined8 local_2238;
  undefined8 uStack_2230;
  undefined8 local_2228;
  undefined8 uStack_2220;
  undefined8 local_2218;
  undefined8 uStack_2210;
  undefined8 local_2208;
  undefined8 uStack_2200;
  undefined8 local_21f8;
  undefined8 uStack_21f0;
  undefined8 local_21e8;
  undefined8 uStack_21e0;
  undefined8 local_21d8;
  undefined8 uStack_21d0;
  undefined8 local_21c8;
  undefined8 uStack_21c0;
  undefined8 local_21b8;
  undefined8 uStack_21b0;
  undefined8 local_21a8;
  undefined8 uStack_21a0;
  undefined8 local_2198;
  undefined8 uStack_2190;
  undefined8 local_2188;
  undefined8 uStack_2180;
  undefined8 local_2178;
  undefined8 uStack_2170;
  undefined8 local_2168;
  undefined8 uStack_2160;
  undefined8 local_2158;
  undefined8 uStack_2150;
  undefined8 local_2148;
  undefined8 uStack_2140;
  undefined1 local_2138 [16];
  undefined8 local_2128;
  undefined8 uStack_2120;
  undefined1 local_2118 [16];
  undefined8 local_2108;
  undefined8 uStack_2100;
  undefined1 local_20f8 [16];
  undefined8 local_20e8;
  undefined8 uStack_20e0;
  undefined8 local_20d8;
  undefined8 uStack_20d0;
  undefined8 local_20c8;
  undefined8 uStack_20c0;
  undefined8 local_20b8;
  undefined8 uStack_20b0;
  undefined8 local_20a8;
  undefined8 uStack_20a0;
  undefined1 local_2098 [16];
  undefined8 local_2088;
  undefined8 uStack_2080;
  undefined1 local_2078 [16];
  undefined8 local_2068;
  undefined8 uStack_2060;
  undefined1 local_2058 [16];
  undefined8 local_2048;
  undefined8 uStack_2040;
  undefined1 local_2038 [16];
  undefined8 local_2028;
  undefined8 uStack_2020;
  undefined8 local_2018;
  undefined8 uStack_2010;
  undefined8 local_2008;
  undefined8 uStack_2000;
  undefined8 local_1ff8;
  undefined8 uStack_1ff0;
  undefined8 local_1fe8;
  undefined8 uStack_1fe0;
  undefined1 local_1fd8 [16];
  undefined8 local_1fc8;
  undefined8 uStack_1fc0;
  undefined1 local_1fb8 [16];
  undefined8 local_1fa8;
  undefined8 uStack_1fa0;
  undefined1 local_1f98 [16];
  undefined8 local_1f88;
  undefined8 uStack_1f80;
  undefined1 local_1f78 [16];
  undefined8 local_1f68;
  undefined8 uStack_1f60;
  undefined1 local_1f58 [16];
  undefined8 local_1f48;
  undefined8 uStack_1f40;
  undefined1 local_1f38 [16];
  undefined8 local_1f28;
  undefined8 uStack_1f20;
  undefined1 local_1f18 [16];
  undefined8 local_1f08;
  undefined8 uStack_1f00;
  undefined1 local_1ef8 [16];
  undefined8 local_1ee8;
  undefined8 uStack_1ee0;
  undefined1 local_1ed8 [16];
  undefined8 local_1ec8;
  undefined8 uStack_1ec0;
  undefined1 local_1eb8 [16];
  undefined8 local_1ea8;
  undefined8 uStack_1ea0;
  undefined1 local_1e98 [16];
  undefined8 local_1e88;
  undefined8 uStack_1e80;
  undefined1 local_1e78 [16];
  undefined8 local_1e68;
  undefined8 uStack_1e60;
  undefined1 local_1e58 [16];
  undefined8 local_1e48;
  undefined8 uStack_1e40;
  undefined1 local_1e38 [16];
  undefined8 local_1e28;
  undefined8 uStack_1e20;
  undefined1 local_1e18 [16];
  undefined8 local_1e08;
  undefined8 uStack_1e00;
  undefined1 local_1df8 [16];
  undefined8 local_1de8;
  undefined8 uStack_1de0;
  undefined1 local_1dd8 [16];
  undefined8 local_1dc8;
  undefined8 uStack_1dc0;
  undefined1 local_1db8 [16];
  undefined8 local_1da8;
  undefined8 uStack_1da0;
  undefined8 local_1d98;
  undefined8 uStack_1d90;
  undefined8 local_1d88;
  undefined8 uStack_1d80;
  undefined1 local_1d78 [16];
  undefined8 local_1d68;
  undefined8 uStack_1d60;
  undefined1 local_1d58 [16];
  undefined8 local_1d48;
  undefined8 uStack_1d40;
  undefined8 local_1d38;
  undefined8 uStack_1d30;
  undefined8 local_1d28;
  undefined8 uStack_1d20;
  undefined8 local_1d18;
  undefined8 uStack_1d10;
  undefined8 local_1d08;
  undefined8 uStack_1d00;
  undefined1 local_1cf8 [16];
  undefined8 local_1ce8;
  undefined8 uStack_1ce0;
  undefined1 local_1cd8 [16];
  undefined8 local_1cc8;
  undefined8 uStack_1cc0;
  undefined1 local_1cb8 [16];
  undefined8 local_1ca8 [4];
  undefined1 local_1c88 [32];
  undefined1 local_1c68 [32];
  undefined1 local_1c48 [32];
  undefined1 local_1c28 [32];
  undefined1 local_1c08 [32];
  undefined1 local_1be8 [32];
  undefined1 local_1bc8 [32];
  undefined1 local_1ba8 [64];
  undefined1 local_1b68 [64];
  undefined1 local_1b28 [64];
  undefined1 local_1ae8 [64];
  undefined1 local_1aa8 [64];
  undefined1 local_1a68 [64];
  undefined1 local_1a28 [64];
  undefined1 local_19e8 [64];
  undefined1 local_19a8 [64];
  undefined1 local_1968 [64];
  undefined1 local_1928 [64];
  undefined1 local_18e8 [64];
  undefined1 local_18a8 [32];
  undefined1 local_1888 [32];
  undefined1 local_1868 [32];
  undefined1 local_1848 [32];
  undefined1 local_1828 [32];
  undefined1 local_1808 [32];
  undefined1 local_17e8 [32];
  undefined8 local_17c8 [4];
  undefined1 local_17a8 [32];
  undefined1 local_1788 [32];
  undefined1 local_1768 [32];
  undefined8 local_1748 [4];
  undefined1 local_1728 [32];
  undefined1 local_1708 [32];
  undefined1 local_16e8 [32];
  undefined8 local_16c8 [4];
  undefined1 local_16a8 [32];
  undefined1 local_1688 [32];
  undefined1 local_1668 [32];
  undefined8 local_1648 [4];
  undefined1 local_1628 [32];
  undefined1 local_1608 [32];
  undefined1 local_15e8 [32];
  undefined1 local_15c8 [64];
  undefined1 local_1588 [64];
  undefined1 local_1548 [64];
  undefined1 local_1508 [64];
  undefined1 local_14c8 [64];
  undefined1 local_1488 [64];
  undefined1 local_1448 [64];
  undefined1 local_1408 [64];
  undefined1 local_13c8 [64];
  undefined1 local_1388 [64];
  undefined1 local_1348 [64];
  undefined1 local_1308 [64];
  undefined1 local_12c8 [64];
  undefined1 local_1288 [64];
  undefined8 local_1248 [4];
  undefined1 local_1228 [32];
  undefined1 local_1208 [32];
  undefined1 local_11e8 [32];
  undefined1 local_11c8 [32];
  undefined1 local_11a8 [32];
  undefined1 local_1188 [32];
  undefined8 local_1168 [4];
  undefined1 local_1148 [32];
  undefined1 local_1128 [32];
  undefined1 local_1108 [32];
  undefined1 local_10e8 [32];
  undefined1 local_10c8 [32];
  undefined1 local_10a8 [32];
  undefined1 local_1088 [32];
  undefined1 local_1068 [32];
  undefined1 local_1048 [32];
  undefined1 local_1028 [32];
  undefined1 local_1008 [32];
  undefined1 local_fe8 [32];
  undefined1 local_fc8 [32];
  undefined1 local_fa8 [32];
  undefined1 local_f88 [32];
  undefined1 local_f68 [32];
  undefined1 local_f48 [32];
  undefined1 local_f28 [32];
  undefined1 local_f08 [32];
  undefined1 local_ee8 [32];
  undefined1 local_ec8 [32];
  undefined1 local_ea8 [32];
  undefined1 local_e88 [32];
  undefined1 local_e68 [32];
  undefined1 local_e48 [32];
  undefined1 local_e28 [32];
  undefined1 local_e08 [32];
  undefined8 local_de8 [4];
  undefined1 local_dc8 [32];
  undefined1 local_da8 [32];
  undefined1 local_d88 [32];
  undefined1 local_d68 [32];
  undefined1 local_d48 [32];
  undefined1 local_d28 [32];
  undefined1 local_d08 [32];
  undefined1 local_ce8 [32];
  undefined1 local_cc8 [32];
  undefined1 local_ca8 [32];
  undefined1 local_c88 [32];
  undefined1 local_c68 [32];
  undefined1 local_c48 [32];
  undefined1 local_c28 [32];
  undefined1 local_c08 [32];
  undefined1 local_be8 [32];
  undefined1 local_bc8 [32];
  undefined1 local_ba8 [32];
  undefined1 local_b88 [32];
  undefined1 local_b68 [32];
  undefined1 local_b48 [32];
  undefined1 local_b28 [32];
  undefined1 local_b08 [32];
  undefined1 local_ae8 [32];
  undefined1 local_ac8 [32];
  undefined1 local_aa8 [32];
  undefined1 local_a88 [32];
  undefined1 local_a68 [32];
  undefined1 local_a48 [32];
  undefined1 local_a28 [32];
  undefined1 local_a08 [32];
  undefined8 local_9e8 [12];
  undefined1 local_988 [96];
  undefined1 local_928 [96];
  undefined1 local_8c8 [96];
  undefined1 local_868 [96];
  undefined1 local_808 [96];
  undefined1 local_7a8 [96];
  undefined1 local_748 [96];
  undefined1 local_6e8 [96];
  undefined1 local_688 [96];
  undefined1 local_628 [96];
  undefined1 local_5c8 [96];
  undefined1 local_568 [96];
  undefined1 local_508 [96];
  undefined1 local_4a8 [96];
  undefined1 local_448 [96];
  undefined1 local_3e8 [96];
  undefined1 local_388 [96];
  undefined1 local_328 [96];
  undefined1 local_2c8 [96];
  undefined1 local_268 [96];
  undefined1 local_208 [96];
  undefined1 local_1a8 [96];
  undefined1 local_148 [96];
  undefined1 local_e8 [96];
  undefined1 local_88 [88];
  undefined8 uStack_30;

  pvVar1 = ThreadLocalStoragePointer;
  uStack_30 = 0x1800e8ca9;
  uVar5 = (ulonglong)_tls_index;
  if ((*(int *)(*(longlong *)((longlong)ThreadLocalStoragePointer + uVar5 * 8) + 0x130) <
       DAT_180981a24) && (FUN_1805c27ac(&DAT_180981a24), DAT_180981a24 == -1)) {
    _DAT_180981a30 = 0;
    DAT_180981a38 = 0;
    DAT_180981a40 = 0;
    DAT_180981a48 = 0;
    _DAT_180981a50 = 0;
    uRam0000000180981a58 = 0;
    DAT_180981a60 = 0;
    DAT_180981a68 = 0;
    lVar6 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar6 + 0x813c) & 1) == 0) {
      *(uint *)(lVar6 + 0x813c) = *(uint *)(lVar6 + 0x813c) | 1;
      *(undefined2 *)(lVar6 + 0x80c9) = 0x1f1;
      *(undefined4 *)(lVar6 + 0x80c0) = 0x96819091;
      *(undefined4 *)(lVar6 + 0x80c4) = 0xf445f452;
      *(undefined1 *)(lVar6 + 0x80c8) = 0xb9;
      FUN_1805c2300(&LAB_1806a3060);
    }
    lVar6 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar10 = lVar6 + 0x80c0;
    if (*(char *)(lVar6 + 0x80ca) != '\0') {
      FUN_180055100(lVar10,10,0x91219b1ff7f5f1d5);
      *(undefined1 *)(lVar6 + 0x80ca) = 0;
    }
    local_2690 = 0;
    uStack_2688 = 0;
    local_2680 = ZEXT816(0);
    lVar6 = -1;
    lVar7 = -1;
    do {
      lVar7 = lVar7 + 1;
    } while (*(char *)(lVar10 + lVar7) != '\0');
    FUN_180059df0(&local_2690,lVar10);
    local_28d8 = 0xbf62;
    uStack_28d6 = 0x402d;
    uStack_28d4 = 0x7337;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8ad4) & 1) == 0) {
      *(uint *)(lVar10 + 0x8ad4) = *(uint *)(lVar10 + 0x8ad4) | 1;
      *(undefined1 *)(lVar10 + 0x84ce) = 1;
      *(undefined8 *)(lVar10 + 0x84b8) = 0x1310164b2ca342;
      *(undefined8 *)(lVar10 + 0x84c0) = 0x2312072a4d3abd68;
      *(undefined4 *)(lVar10 + 0x84c8) = 0x402dbf62;
      *(undefined2 *)(lVar10 + 0x84cc) = 0x7337;
      FUN_1805c2300(&LAB_1806a3030);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x84b8;
    if (*(char *)(lVar10 + 0x84ce) != '\0') {
      FUN_180055100(lVar7,0x16,0x656173452549d30d);
      *(undefined1 *)(lVar10 + 0x84ce) = 0;
    }
    local_2448 = 0;
    uStack_2440 = 0;
    local_2438 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2448,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x856c) & 1) == 0) {
      *(uint *)(lVar10 + 0x856c) = *(uint *)(lVar10 + 0x856c) | 1;
      *(undefined2 *)(lVar10 + 0x7a40) = 0x1c5;
      *(undefined8 *)(lVar10 + 0x7a30) = 0x8aa3d6d7cfb0038a;
      *(undefined8 *)(lVar10 + 0x7a38) = 0x9da2dbedce9300aa;
      FUN_1805c2300(&LAB_1806a3000);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7a30;
    if (*(char *)(lVar10 + 0x7a41) != '\0') {
      FUN_180055100(lVar7,0x11,0xefc7bf81a1d573c5);
      *(undefined1 *)(lVar10 + 0x7a41) = 0;
    }
    local_2428 = 0;
    uStack_2420 = 0;
    local_2418 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2428,lVar7);
    local_28e8 = (undefined8 *)0xfa9244752bccc17a;
    local_28e0 = (undefined8 *)CONCAT26(local_28e0._6_2_,0x595c21c5de73);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7944) & 1) == 0) {
      *(uint *)(lVar10 + 0x7944) = *(uint *)(lVar10 + 0x7944) | 1;
      *(undefined2 *)(lVar10 + 0x783e) = 0x1f5;
      *(undefined8 *)(lVar10 + 0x7830) = 0xfa9244752bccc17a;
      *(undefined4 *)(lVar10 + 0x7838) = 0x21c5de73;
      *(undefined2 *)(lVar10 + 0x783c) = 0x595c;
      FUN_1805c2300(&LAB_1806a2fd0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7830;
    if (*(char *)(lVar10 + 0x783f) != '\0') {
      FUN_180055100(lVar7,0xf,0x89f52b3945a9b135);
      *(undefined1 *)(lVar10 + 0x783f) = 0;
    }
    local_2408 = 0;
    uStack_2400 = 0;
    local_23f8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2408,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x77f4) & 1) == 0) {
      *(uint *)(lVar10 + 0x77f4) = *(uint *)(lVar10 + 0x77f4) | 1;
      *(undefined2 *)(lVar10 + 0x81c4) = 0x127;
      *(undefined4 *)(lVar10 + 0x81c0) = 0xbd5c5e09;
      FUN_1805c2300(&LAB_1806a2fa0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    pbVar4 = (byte *)(lVar10 + 0x81c0);
    if (*(char *)(lVar10 + 0x81c5) != '\0') {
      *pbVar4 = *pbVar4 ^ 0x45;
      *(byte *)(lVar10 + 0x81c1) = *(byte *)(lVar10 + 0x81c1) ^ 0x31;
      *(byte *)(lVar10 + 0x81c2) = *(byte *)(lVar10 + 0x81c2) ^ 0x3d;
      *(byte *)(lVar10 + 0x81c3) = *(byte *)(lVar10 + 0x81c3) ^ 0xd9;
      *(byte *)(lVar10 + 0x81c4) = *(byte *)(lVar10 + 0x81c4) ^ 0x27;
      *(undefined1 *)(lVar10 + 0x81c5) = 0;
    }
    local_23e8 = 0;
    uStack_23e0 = 0;
    local_23d8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (pbVar4[lVar10] != 0);
    FUN_180059df0(&local_23e8);
    local_res10[0] = 0;
    FUN_1800f46d0(local_18e8,local_res10);
    puVar11 = &local_2448;
    do {
      FUN_1800f47c0(local_18e8,&local_28e8,puVar11);
      puVar11 = puVar11 + 4;
    } while (puVar11 != &local_23c8);
    FUN_1800f2e80(local_9e8,&local_2690,local_18e8);
    local_28d8 = 0xec26;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7ab4) & 1) == 0) {
      *(uint *)(lVar10 + 0x7ab4) = *(uint *)(lVar10 + 0x7ab4) | 1;
      *(undefined2 *)(lVar10 + 0x78fa) = 0x1c7;
      *(undefined8 *)(lVar10 + 0x78e8) = 0x33193d16b8b5e808;
      *(undefined8 *)(lVar10 + 0x78f0) = 0x361f3b1680a2ea24;
      *(undefined2 *)(lVar10 + 0x78f8) = 0xec26;
      FUN_1805c2300(&LAB_1806a2f70);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x78e8;
    if (*(char *)(lVar10 + 0x78fb) != '\0') {
      FUN_180055100(lVar7,0x13,0x5f694973d3c78945);
      *(undefined1 *)(lVar10 + 0x78fb) = 0;
    }
    local_26b0 = 0;
    uStack_26a8 = 0;
    local_26a0 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_26b0,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7a28) & 1) == 0) {
      *(uint *)(lVar10 + 0x7a28) = *(uint *)(lVar10 + 0x7a28) | 1;
      *(undefined1 *)(lVar10 + 0x8330) = 1;
      *(undefined8 *)(lVar10 + 0x8320) = 0x9352f9064d879e70;
      *(undefined8 *)(lVar10 + 0x8328) = 0xeb42f8077e9f9a75;
      FUN_1805c2300(&LAB_1806a2f40);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8320;
    if (*(char *)(lVar10 + 0x8330) != '\0') {
      FUN_180055100(lVar7,0x10,0xeb279b691ff3fb37);
      *(undefined1 *)(lVar10 + 0x8330) = 0;
    }
    local_1fc8 = 0;
    uStack_1fc0 = 0;
    local_1fb8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1fc8,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x782c) & 1) == 0) {
      *(uint *)(lVar10 + 0x782c) = *(uint *)(lVar10 + 0x782c) | 1;
      *(undefined1 *)(lVar10 + 0x7548) = 1;
      *(undefined8 *)(lVar10 + 0x7538) = 0xa53e970805157065;
      *(undefined8 *)(lVar10 + 0x7540) = 0xf53696060b046740;
      FUN_1805c2300(&LAB_1806a2f10);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7538;
    if (*(char *)(lVar10 + 0x7548) != '\0') {
      FUN_180055100(lVar7,0x10,0xf553e56763671535);
      *(undefined1 *)(lVar10 + 0x7548) = 0;
    }
    local_1fa8 = 0;
    uStack_1fa0 = 0;
    local_1f98 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1fa8,lVar7);
    local_28d8 = 0x53ab;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8740) & 1) == 0) {
      *(uint *)(lVar10 + 0x8740) = *(uint *)(lVar10 + 0x8740) | 1;
      *(undefined1 *)(lVar10 + 0x821a) = 1;
      *(undefined8 *)(lVar10 + 0x8208) = 0xafaee5e4affd36c9;
      *(undefined8 *)(lVar10 + 0x8210) = 0xa9a6e4eaa1ec21ec;
      *(undefined2 *)(lVar10 + 0x8218) = 0x53ab;
      FUN_1805c2300(&LAB_1806a2ee0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8208;
    if (*(char *)(lVar10 + 0x821a) != '\0') {
      FUN_180055100(lVar7,0x12,0xffc3978bc98f5399);
      *(undefined1 *)(lVar10 + 0x821a) = 0;
    }
    local_1f88 = 0;
    uStack_1f80 = 0;
    local_1f78 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1f88,lVar7);
    local_28d8 = 0xf886;
    uStack_28d6 = 0x8578;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7550) & 1) == 0) {
      *(uint *)(lVar10 + 0x7550) = *(uint *)(lVar10 + 0x7550) | 1;
      *(undefined1 *)(lVar10 + 0x7824) = 1;
      *(undefined8 *)(lVar10 + 0x7810) = 0xd9b8e7c0e36feeb7;
      *(undefined8 *)(lVar10 + 0x7818) = 0xf3b6e7dad576e792;
      *(undefined4 *)(lVar10 + 0x7820) = 0x8578f886;
      FUN_1805c2300(&LAB_1806a2eb0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7810;
    if (*(char *)(lVar10 + 0x7824) != '\0') {
      FUN_180055100(lVar7,0x14,0x9bd595af851d8be7);
      *(undefined1 *)(lVar10 + 0x7824) = 0;
    }
    local_1f68 = 0;
    uStack_1f60 = 0;
    local_1f58 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1f68,lVar7);
    local_28d8 = 0x3c1a;
    uStack_28d6 = 0xebfd;
    uStack_28d4 = 0xb3ee;
    uStack_28d2 = 0x5180;
    local_28d0 = 0xbbf62012;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7b94) & 1) == 0) {
      *(uint *)(lVar10 + 0x7b94) = *(uint *)(lVar10 + 0x7b94) | 1;
      *(undefined1 *)(lVar10 + 0x767c) = 1;
      *(undefined8 *)(lVar10 + 0x7660) = 0x6a8eb3f4dde13623;
      *(undefined8 *)(lVar10 + 0x7668) = 0x4d93a8e9d8e03106;
      *(undefined8 *)(lVar10 + 0x7670) = 0x5180b3eeebfd3c1a;
      *(undefined4 *)(lVar10 + 0x7678) = 0xbbf62012;
      FUN_1805c2300(&LAB_1806a2e80);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7660;
    if (*(char *)(lVar10 + 0x767c) != '\0') {
      FUN_180055100(lVar7,0x1c,0x39e3c19bbb935373);
      *(undefined1 *)(lVar10 + 0x767c) = 0;
    }
    local_1f48 = 0;
    uStack_1f40 = 0;
    local_1f38 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1f48,lVar7);
    local_28d8 = 0x885e;
    uStack_28d6 = 0x5d11;
    uStack_28d4 = 0x33ac;
    uStack_28d2 = 0xff7a;
    local_28d0 = 0x5b1a9456;
    local_28cc = 0x41eb;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x83dc) & 1) == 0) {
      *(uint *)(lVar10 + 0x83dc) = *(uint *)(lVar10 + 0x83dc) | 1;
      *(undefined1 *)(lVar10 + 0x75ce) = 1;
      *(undefined8 *)(lVar10 + 0x75b0) = 0xc47433b66b0d8267;
      *(undefined8 *)(lVar10 + 0x75b8) = 0xe36928ab6e0c8542;
      *(undefined8 *)(lVar10 + 0x75c0) = 0xff7a33ac5d11885e;
      *(undefined4 *)(lVar10 + 0x75c8) = 0x5b1a9456;
      *(undefined2 *)(lVar10 + 0x75cc) = 0x41eb;
      FUN_1805c2300(&LAB_1806a2e50);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x75b0;
    if (*(char *)(lVar10 + 0x75ce) != '\0') {
      FUN_180055100(lVar7,0x1e,0x971941d90d7fe737);
      *(undefined1 *)(lVar10 + 0x75ce) = 0;
    }
    local_1f28 = 0;
    uStack_1f20 = 0;
    local_1f18 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1f28,lVar7);
    local_28d8 = 0x24ea;
    uStack_28d6 = 0x2df;
    uStack_28d4 = 0x353;
    uStack_28d2 = 0xa816;
    local_28d0 = CONCAT22(local_28d0._2_2_,0x47f7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8090) & 1) == 0) {
      *(uint *)(lVar10 + 0x8090) = *(uint *)(lVar10 + 0x8090) | 1;
      *(undefined1 *)(lVar10 + 0x8472) = 1;
      *(undefined8 *)(lVar10 + 0x8458) = 0x8412054c0ddf22c9;
      *(undefined8 *)(lVar10 + 0x8460) = 0xa50a244f0ece29f8;
      *(undefined8 *)(lVar10 + 0x8468) = 0xa816035302df24ea;
      *(undefined2 *)(lVar10 + 0x8470) = 0x47f7;
      FUN_1805c2300(&LAB_1806a2e20);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8458;
    if (*(char *)(lVar10 + 0x8472) != '\0') {
      FUN_180055100(lVar7,0x1a,0xc77f77236bad4799);
      *(undefined1 *)(lVar10 + 0x8472) = 0;
    }
    local_1f08 = 0;
    uStack_1f00 = 0;
    local_1ef8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1f08,lVar7);
    local_28e8 = (undefined8 *)0xbc276f3594fe49d7;
    local_28e0 = (undefined8 *)CONCAT26(local_28e0._6_2_,0x7e3698f958f5);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8888) & 1) == 0) {
      *(uint *)(lVar10 + 0x8888) = *(uint *)(lVar10 + 0x8888) | 1;
      *(undefined2 *)(lVar10 + 0x850e) = 0x177;
      *(undefined8 *)(lVar10 + 0x8500) = 0xbc276f3594fe49d7;
      *(undefined4 *)(lVar10 + 0x8508) = 0x98f958f5;
      *(undefined2 *)(lVar10 + 0x850c) = 0x7e36;
      FUN_1805c2300(&LAB_1806a2df0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8500;
    if (*(char *)(lVar10 + 0x850f) != '\0') {
      FUN_180055100(lVar7,0xf,0xc9771b45f9913b87);
      *(undefined1 *)(lVar10 + 0x850f) = 0;
    }
    local_1ee8 = 0;
    uStack_1ee0 = 0;
    local_1ed8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1ee8,lVar7);
    local_28d8 = 0x3be;
    uStack_28d6 = 0xd864;
    uStack_28d4 = 0x49ca;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7c28) & 1) == 0) {
      *(uint *)(lVar10 + 0x7c28) = *(uint *)(lVar10 + 0x7c28) | 1;
      *(undefined1 *)(lVar10 + 0x842e) = 1;
      *(undefined8 *)(lVar10 + 0x8418) = 0xf513ddfc66a198d;
      *(undefined8 *)(lVar10 + 0x8420) = 0xf7419dbc8700fb2;
      *(undefined4 *)(lVar10 + 0x8428) = 0xd86403be;
      *(undefined2 *)(lVar10 + 0x842c) = 0x49ca;
      FUN_1805c2300(&LAB_1806a2dc0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8418;
    if (*(char *)(lVar10 + 0x842e) != '\0') {
      FUN_180055100(lVar7,0x16,0x7d0149afab056bdd);
      *(undefined1 *)(lVar10 + 0x842e) = 0;
    }
    local_1ec8 = 0;
    uStack_1ec0 = 0;
    local_1eb8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1ec8,lVar7);
    local_28d8 = 0xd69d;
    uStack_28d6 = 0xd0a1;
    uStack_28d4 = 0xb850;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7cb0) & 1) == 0) {
      *(uint *)(lVar10 + 0x7cb0) = *(uint *)(lVar10 + 0x7cb0) | 1;
      *(undefined2 *)(lVar10 + 0x78a6) = 0x107;
      *(undefined8 *)(lVar10 + 0x7890) = 0xe640a953dca6c7bf;
      *(undefined8 *)(lVar10 + 0x7898) = 0xf257ae50d099d082;
      *(undefined4 *)(lVar10 + 0x78a0) = 0xd0a1d69d;
      *(undefined2 *)(lVar10 + 0x78a4) = 0xb850;
      FUN_1805c2300(&LAB_1806a2d90);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7890;
    if (*(char *)(lVar10 + 0x78a7) != '\0') {
      FUN_180055100(lVar7,0x17,0x8707dd23b1c9b5ef);
      *(undefined1 *)(lVar10 + 0x78a7) = 0;
    }
    local_1ea8 = 0;
    uStack_1ea0 = 0;
    local_1e98 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1ea8,lVar7);
    local_28d8 = 0x3a85;
    uStack_28d6 = 0xe492;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7744) & 1) == 0) {
      *(uint *)(lVar10 + 0x7744) = *(uint *)(lVar10 + 0x7744) | 1;
      *(undefined2 *)(lVar10 + 0x844c) = 0x1b1;
      *(undefined8 *)(lVar10 + 0x8438) = 0xa91d9c1ec8e29bd;
      *(undefined8 *)(lVar10 + 0x8440) = 0x1ca1d8e1e48d3f83;
      *(undefined4 *)(lVar10 + 0x8448) = 0xe4923a85;
      FUN_1805c2300(&LAB_1806a2d60);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8438;
    if (*(char *)(lVar10 + 0x844d) != '\0') {
      FUN_180055100(lVar7,0x15,0x7fd3adb181e15bed);
      *(undefined1 *)(lVar10 + 0x844d) = 0;
    }
    local_1e88 = 0;
    uStack_1e80 = 0;
    local_1e78 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1e88,lVar7);
    local_28d8 = 0xf620;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7acc) & 1) == 0) {
      *(uint *)(lVar10 + 0x7acc) = *(uint *)(lVar10 + 0x7acc) | 1;
      *(undefined2 *)(lVar10 + 0x7e12) = 0x179;
      *(undefined8 *)(lVar10 + 0x7e00) = 0xf4c189d90216e103;
      *(undefined8 *)(lVar10 + 0x7e08) = 0xe0eb9edb1a29f83f;
      *(undefined2 *)(lVar10 + 0x7e10) = 0xf620;
      FUN_1805c2300(&LAB_1806a2d30);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7e00;
    if (*(char *)(lVar10 + 0x7e13) != '\0') {
      FUN_180055100(lVar7,0x13,0x8183fda96f799353);
      *(undefined1 *)(lVar10 + 0x7e13) = 0;
    }
    local_1e68 = 0;
    uStack_1e60 = 0;
    local_1e58 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1e68,lVar7);
    local_28d8 = 0xdcf7;
    uStack_28d6 = 0xfe3e;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x85e0) & 1) == 0) {
      *(uint *)(lVar10 + 0x85e0) = *(uint *)(lVar10 + 0x85e0) | 1;
      *(undefined2 *)(lVar10 + 0x7bd4) = 0x1cd;
      *(undefined8 *)(lVar10 + 0x7bc0) = 0x761fcdbdf622cfcf;
      *(undefined8 *)(lVar10 + 0x7bc8) = 0x7a3fcc9de322d1fd;
      *(undefined4 *)(lVar10 + 0x7bd0) = 0xfe3edcf7;
      FUN_1805c2300(&LAB_1806a2d00);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7bc0;
    if (*(char *)(lVar10 + 0x7bd5) != '\0') {
      FUN_180055100(lVar7,0x15,0x194db9cd9b4dbd9f);
      *(undefined1 *)(lVar10 + 0x7bd5) = 0;
    }
    local_1e48 = 0;
    uStack_1e40 = 0;
    local_1e38 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1e48,lVar7);
    local_28d8 = 0x3661;
    uStack_28d6 = 0x6a49;
    uStack_28d4 = 0xb2c9;
    uStack_28d2 = 0xa41a;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x86c4) & 1) == 0) {
      *(uint *)(lVar10 + 0x86c4) = *(uint *)(lVar10 + 0x86c4) | 1;
      *(undefined2 *)(lVar10 + 0x8560) = 0x131;
      *(undefined8 *)(lVar10 + 0x8548) = 0xa93da7d164543161;
      *(undefined8 *)(lVar10 + 0x8550) = 0xb81da1c0595f3158;
      *(undefined8 *)(lVar10 + 0x8558) = 0xa41ab2c96a493661;
      FUN_1805c2300(&LAB_1806a2cd0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8548;
    if (*(char *)(lVar10 + 0x8561) != '\0') {
      FUN_180055100(lVar7,0x19,0xc169d3a1093b4331);
      *(undefined1 *)(lVar10 + 0x8561) = 0;
    }
    local_1e28 = 0;
    uStack_1e20 = 0;
    local_1e18 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1e28,lVar7);
    local_28d8 = 0xc1ca;
    uStack_28d6 = 0x38b0;
    uStack_28d4 = 0xc910;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x765c) & 1) == 0) {
      *(uint *)(lVar10 + 0x765c) = *(uint *)(lVar10 + 0x765c) | 1;
      *(undefined1 *)(lVar10 + 0x77ee) = 1;
      *(undefined8 *)(lVar10 + 0x77d8) = 0x1d7bbd0526bedbf9;
      *(undefined8 *)(lVar10 + 0x77e0) = 0x1d5e99183eb8c4cc;
      *(undefined4 *)(lVar10 + 0x77e8) = 0x38b0c1ca;
      *(undefined2 *)(lVar10 + 0x77ec) = 0xc910;
      FUN_1805c2300(&LAB_1806a2ca0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x77d8;
    if (*(char *)(lVar10 + 0x77ee) != '\0') {
      FUN_180055100(lVar7,0x16,0x6f2bc9754bd1a9a9);
      *(undefined1 *)(lVar10 + 0x77ee) = 0;
    }
    local_1e08 = 0;
    uStack_1e00 = 0;
    local_1df8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1e08,lVar7);
    local_28d8 = 0xf112;
    uStack_28d6 = 0x6abf;
    uStack_28d4 = 0xea7d;
    uStack_28d2 = 0xac7d;
    local_28d0 = CONCAT22(local_28d0._2_2_,0xfa0e);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x79d0) & 1) == 0) {
      *(uint *)(lVar10 + 0x79d0) = *(uint *)(lVar10 + 0x79d0) | 1;
      *(undefined2 *)(lVar10 + 0x7e4a) = 0x1ef;
      *(undefined8 *)(lVar10 + 0x7e30) = 0xb846fd7f7280ed2d;
      *(undefined8 *)(lVar10 + 0x7e38) = 0xa461f9666d8cec1f;
      *(undefined8 *)(lVar10 + 0x7e40) = 0xac7dea7d6abff112;
      *(undefined2 *)(lVar10 + 0x7e48) = 0xfa0e;
      FUN_1805c2300(&LAB_1806a2c70);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7e30;
    if (*(char *)(lVar10 + 0x7e4b) != '\0') {
      FUN_180055100(lVar7,0x1b,0xcd15890f1fef9f7d);
      *(undefined1 *)(lVar10 + 0x7e4b) = 0;
    }
    local_1de8 = 0;
    uStack_1de0 = 0;
    local_1dd8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1de8,lVar7);
    local_28d8 = 0x2b6c;
    uStack_28d6 = 0xbca;
    uStack_28d4 = 0xa4e1;
    uStack_28d2 = 0x13a;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7658) & 1) == 0) {
      *(uint *)(lVar10 + 0x7658) = *(uint *)(lVar10 + 0x7658) | 1;
      *(undefined2 *)(lVar10 + 0x88f0) = 0x10f;
      *(undefined8 *)(lVar10 + 0x88d8) = 0xe16b9e516cc2b5f;
      *(undefined8 *)(lVar10 + 0x88e0) = 0x1c37b8c617c63a61;
      *(undefined8 *)(lVar10 + 0x88e8) = 0x13aa4e10bca2b6c;
      FUN_1805c2300(&LAB_1806a2c40);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x88d8;
    if (*(char *)(lVar10 + 0x88f1) != '\0') {
      FUN_180055100(lVar7,0x19,0x6f55cd957ba3590f);
      *(undefined1 *)(lVar10 + 0x88f1) = 0;
    }
    local_1dc8 = 0;
    uStack_1dc0 = 0;
    local_1db8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1dc8,lVar7);
    local_28d8 = 0x1a13;
    uStack_28d6 = 0x407a;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8094) & 1) == 0) {
      *(uint *)(lVar10 + 0x8094) = *(uint *)(lVar10 + 0x8094) | 1;
      *(undefined2 *)(lVar10 + 0x84e4) = 0x1fd;
      *(undefined8 *)(lVar10 + 34000) = 0x82df598d4866092b;
      *(undefined8 *)(lVar10 + 0x84d8) = 0x80e358ad407f120f;
      *(undefined4 *)(lVar10 + 0x84e0) = 0x407a1a13;
      FUN_1805c2300(&LAB_1806a2c10);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 34000;
    if (*(char *)(lVar10 + 0x84e5) != '\0') {
      FUN_180055100(lVar7,0x15,0xe3912dfd25097b7b);
      *(undefined1 *)(lVar10 + 0x84e5) = 0;
    }
    local_1da8 = 0;
    uStack_1da0 = 0;
    local_1d98 = 0;
    uStack_1d90 = 0;
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1da8,lVar7);
    auVar13 = _DAT_180867550;
    local_28c8 = 0x64d0;
    uStack_28c6 = 0x7b17;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x754c) & 1) == 0) {
      *(uint *)(lVar10 + 0x754c) = *(uint *)(lVar10 + 0x754c) | 1;
      *(undefined1 *)(lVar10 + 0x86bc) = 1;
      *(undefined8 *)(lVar10 + 0x8698) = 0x36b5559d160a73f9;
      *(undefined8 *)(lVar10 + 0x86a0) = 0x348954bd1e1368dd;
      *(undefined1 (*) [16])(lVar10 + 0x86a8) = auVar13;
      *(undefined4 *)(lVar10 + 0x86b8) = 0x7b1764d0;
      FUN_1805c2300(&LAB_1806a2be0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8698;
    if (*(char *)(lVar10 + 0x86bc) != '\0') {
      FUN_180055100(lVar7,0x24,0x57fb21ed7b6501a9);
      *(undefined1 *)(lVar10 + 0x86bc) = 0;
    }
    local_1d88 = 0;
    uStack_1d80 = 0;
    local_1d78 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1d88,lVar7);
    local_28d8 = 0xd638;
    uStack_28d6 = 0xaa7f;
    uStack_28d4 = 0xb0d7;
    uStack_28d2 = 0xba0b;
    local_28d0 = CONCAT22(local_28d0._2_2_,0xc02e);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7900) & 1) == 0) {
      *(uint *)(lVar10 + 0x7900) = *(uint *)(lVar10 + 0x7900) | 1;
      *(undefined2 *)(lVar10 + 0x7c4a) = 0x12f;
      *(undefined8 *)(lVar10 + 0x7c30) = 0xb420a7d5b240d70d;
      *(undefined8 *)(lVar10 + 0x7c38) = 0xb701bad1bc4ac931;
      *(undefined8 *)(lVar10 + 0x7c40) = 0xba0bb0d7aa7fd638;
      *(undefined2 *)(lVar10 + 0x7c48) = 0xc02e;
      FUN_1805c2300(&LAB_1806a2bb0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7c30;
    if (*(char *)(lVar10 + 0x7c4b) != '\0') {
      FUN_180055100(lVar7,0x1b,0xdb63d3a5df2fa55d);
      *(undefined1 *)(lVar10 + 0x7c4b) = 0;
    }
    local_1d68 = 0;
    uStack_1d60 = 0;
    local_1d58 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1d68,lVar7);
    local_28d8 = 0x2685;
    uStack_28d6 = 0xffcc;
    uStack_28d4 = 0xbfe4;
    uStack_28d2 = 0x3db6;
    local_28d0 = 0xafda3088;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8a78) & 1) == 0) {
      *(uint *)(lVar10 + 0x8a78) = *(uint *)(lVar10 + 0x8a78) | 1;
      *(undefined1 *)(lVar10 + 0x7514) = 1;
      *(undefined8 *)(lVar10 + 0x74f8) = 0x16b0bff0dfda31b9;
      *(undefined8 *)(lVar10 + 0x7500) = 0x37bcb9f2cad32f86;
      *(undefined8 *)(lVar10 + 0x7508) = 0x3db6bfe4ffcc2685;
      *(undefined4 *)(lVar10 + 0x7510) = 0xafda3088;
      FUN_1805c2300(&LAB_1806a2b80);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x74f8;
    if (*(char *)(lVar10 + 0x7514) != '\0') {
      FUN_180055100(lVar7,0x1c,0x55d5cd91afbf43e9);
      *(undefined1 *)(lVar10 + 0x7514) = 0;
    }
    local_1d48 = 0;
    uStack_1d40 = 0;
    local_1d38 = 0;
    uStack_1d30 = 0;
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1d48,lVar7);
    auVar13 = _DAT_18086ccc0;
    local_28c8 = 0x6eb6;
    uStack_28c6 = 0xec8c;
    uStack_28c4 = 0x5a83;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7970) & 1) == 0) {
      *(uint *)(lVar10 + 0x7970) = *(uint *)(lVar10 + 0x7970) | 1;
      *(undefined2 *)(lVar10 + 0x83ae) = 0x143;
      *(undefined8 *)(lVar10 + 0x8388) = 0xa2315c9ec08b4a88;
      *(undefined8 *)(lVar10 + 0x8390) = 0x8533509ff68c4dba;
      *(undefined1 (*) [16])(lVar10 + 0x8398) = auVar13;
      *(undefined4 *)(lVar10 + 0x83a8) = 0xec8c6eb6;
      *(undefined2 *)(lVar10 + 0x83ac) = 0x5a83;
      FUN_1805c2300(&LAB_1806a2b50);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8388;
    if (*(char *)(lVar10 + 0x83af) != '\0') {
      FUN_180055100(lVar7,0x27,0xf14339ed95ff2fcf);
      *(undefined1 *)(lVar10 + 0x83af) = 0;
    }
    local_1d28 = 0;
    uStack_1d20 = 0;
    local_1d18 = 0;
    uStack_1d10 = 0;
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1d28,lVar7);
    auVar13 = _DAT_18086bde0;
    local_28c8 = 0x890c;
    uStack_28c6 = 0x6d8;
    uStack_28c4 = 0xa3f6;
    uStack_28c2 = 0x1b64;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8930) & 1) == 0) {
      *(uint *)(lVar10 + 0x8930) = *(uint *)(lVar10 + 0x8930) | 1;
      *(undefined1 *)(lVar10 + 0x8318) = 1;
      *(undefined8 *)(lVar10 + 0x82f0) = 0x4875a8fc20ed802a;
      *(undefined8 *)(lVar10 + 0x82f8) = 0x6f77a4fd16ea8718;
      *(undefined1 (*) [16])(lVar10 + 0x8300) = auVar13;
      *(undefined8 *)(lVar10 + 0x8310) = 0x1b64a3f606d8890c;
      FUN_1805c2300(&LAB_1806a2b20);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x82f0;
    if (*(char *)(lVar10 + 0x8318) != '\0') {
      FUN_180055100(lVar7,0x28,0x1b07cd8f7599e56d);
      *(undefined1 *)(lVar10 + 0x8318) = 0;
    }
    local_1d08 = 0;
    uStack_1d00 = 0;
    local_1cf8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1d08,lVar7);
    local_28d8 = 0xf690;
    uStack_28d6 = 0x54b1;
    uStack_28d4 = 0x5243;
    uStack_28d2 = 0x5c13;
    local_28d0 = 0x7eacd88a;
    local_28cc = 0x5059;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7ff0) & 1) == 0) {
      *(uint *)(lVar10 + 0x7ff0) = *(uint *)(lVar10 + 0x7ff0) | 1;
      *(undefined2 *)(lVar10 + 0x87de) = 0x167;
      *(undefined8 *)(lVar10 + 0x87c0) = 0x7a15564452abfcbe;
      *(undefined8 *)(lVar10 + 0x87c8) = 0x5d175a4564acfb8c;
      *(undefined8 *)(lVar10 + 0x87d0) = 0x5c13524354b1f690;
      *(undefined4 *)(lVar10 + 0x87d8) = 0x7eacd88a;
      *(undefined2 *)(lVar10 + 0x87dc) = 0x5059;
      FUN_1805c2300(&LAB_1806a2af0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x87c0;
    if (*(char *)(lVar10 + 0x87df) != '\0') {
      FUN_180055100(lVar7,0x1f,0x2967333707df99f9);
      *(undefined1 *)(lVar10 + 0x87df) = 0;
    }
    local_1ce8 = 0;
    uStack_1ce0 = 0;
    local_1cd8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1ce8,lVar7);
    local_28d8 = 0x6da6;
    uStack_28d6 = 0xcb1e;
    uStack_28d4 = 0x82dc;
    uStack_28d2 = 0xfd2a;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7d6c) & 1) == 0) {
      *(uint *)(lVar10 + 0x7d6c) = *(uint *)(lVar10 + 0x7d6c) | 1;
      *(undefined1 *)(lVar10 + 0x8848) = 1;
      *(undefined8 *)(lVar10 + 0x8830) = 0xb41985cdce126d83;
      *(undefined8 *)(lVar10 + 0x8838) = 0xad3d94cbd1184c83;
      *(undefined8 *)(lVar10 + 0x8840) = 0xfd2a82dccb1e6da6;
      FUN_1805c2300(&LAB_1806a2ac0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8830;
    if (*(char *)(lVar10 + 0x8848) != '\0') {
      FUN_180055100(lVar7,0x18,0xfd4ff1bda37d1fd3);
      *(undefined1 *)(lVar10 + 0x8848) = 0;
    }
    local_1cc8 = 0;
    uStack_1cc0 = 0;
    local_1cb8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1cc8,lVar7);
    local_res18[0] = 0;
    FUN_1800f46d0(local_1928,local_res18);
    puVar11 = &local_1fc8;
    do {
      FUN_1800f47c0(local_1928,&local_28e8,puVar11);
      puVar11 = puVar11 + 4;
    } while (puVar11 != local_1ca8);
    FUN_1800f2e80(local_988,&local_26b0,local_1928);
    local_28e8 = (undefined8 *)0x574dc09671e8b241;
    local_28e0 = (undefined8 *)CONCAT44(local_28e0._4_4_,0x5feb47c);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7a84) & 1) == 0) {
      *(uint *)(lVar10 + 0x7a84) = *(uint *)(lVar10 + 0x7a84) | 1;
      *(undefined1 *)(lVar10 + 0x8344) = 1;
      *(undefined8 *)(lVar10 + 0x8338) = 0x574dc09671e8b241;
      *(undefined4 *)(lVar10 + 0x8340) = 0x5feb47c;
      FUN_1805c2300(&LAB_1806a2a90);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8338;
    if (*(char *)(lVar10 + 0x8344) != '\0') {
      FUN_180055100(lVar7,0xc,0x213fa5c5059bd715);
      *(undefined1 *)(lVar10 + 0x8344) = 0;
    }
    local_26d0 = 0;
    uStack_26c8 = 0;
    local_26c0 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_26d0,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8610) & 1) == 0) {
      *(uint *)(lVar10 + 0x8610) = *(uint *)(lVar10 + 0x8610) | 1;
      *(undefined1 *)(lVar10 + 0x7f88) = 1;
      *(undefined4 *)(lVar10 + 0x7f84) = 0x11314029;
      FUN_1805c2300(&LAB_1806a2a70);
    }
    auVar13 = _DAT_180867aa0;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    puVar9 = (ushort *)(lVar10 + 0x7f84);
    if (*(char *)(lVar10 + 0x7f88) != '\0') {
      uVar8 = 0;
      if (DAT_180931e30 < 5) {
        do {
          *(byte *)((longlong)puVar9 + uVar8) =
               *(byte *)((longlong)puVar9 + uVar8) ^
               (byte)(0x3b7577db115f355b >> (((byte)uVar8 & 7) << 3));
          uVar8 = uVar8 + 1;
        } while (uVar8 < 4);
      }
      else {
        auVar12 = vpsrlvq_avx2(_DAT_180867aa0,ZEXT816(8) << 0x40);
        auVar12 = pshufb(auVar12,_DAT_180863360);
        *puVar9 = auVar12._0_2_ ^ *puVar9;
        auVar12._8_8_ = 0x18;
        auVar12._0_8_ = 0x10;
        auVar13 = vpsrlvq_avx2(auVar13,auVar12);
        auVar13 = pshufb(auVar13,_DAT_180863360);
        *(ushort *)(lVar10 + 0x7f86) = auVar13._0_2_ ^ *(ushort *)(lVar10 + 0x7f86);
      }
      *(undefined1 *)(lVar10 + 0x7f88) = 0;
    }
    local_26f0 = 0;
    uStack_26e8 = 0;
    local_26e0 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)((longlong)puVar9 + lVar10) != '\0');
    FUN_180059df0(&local_26f0,puVar9);
    local_res20[0] = 0;
    FUN_1800f46d0(local_1968,local_res20);
    FUN_1800f47c0(local_1968,&local_28e8,&local_26f0);
    FUN_1800f2e80(local_928,&local_26d0,local_1968);
    local_28d8 = 0x556;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7ffc) & 1) == 0) {
      *(uint *)(lVar10 + 0x7ffc) = *(uint *)(lVar10 + 0x7ffc) | 1;
      *(undefined1 *)(lVar10 + 0x7b02) = 1;
      *(undefined8 *)(lVar10 + 0x7af0) = 0x73626e40f438607e;
      *(undefined8 *)(lVar10 + 0x7af8) = 0x526e7f53e2187646;
      *(undefined2 *)(lVar10 + 0x7b00) = 0x556;
      FUN_1805c2300(&LAB_1806a2a40);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7af0;
    if (*(char *)(lVar10 + 0x7b02) != '\0') {
      FUN_180055100(lVar7,0x12,0x31070921874b0533);
      *(undefined1 *)(lVar10 + 0x7b02) = 0;
    }
    local_2710 = 0;
    uStack_2708 = 0;
    local_2700 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2710,lVar7);
    local_28e8 = (undefined8 *)0xc05c58d6a4379e54;
    local_28e0 = (undefined8 *)CONCAT44(local_28e0._4_4_,0x8d0a9e74);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8a50) & 1) == 0) {
      *(uint *)(lVar10 + 0x8a50) = *(uint *)(lVar10 + 0x8a50) | 1;
      *(undefined2 *)(lVar10 + 0x823c) = 0x1b3;
      *(undefined8 *)(lVar10 + 0x8230) = 0xc05c58d6a4379e54;
      *(undefined4 *)(lVar10 + 0x8238) = 0x8d0a9e74;
      FUN_1805c2300(&LAB_1806a2a10);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8230;
    if (*(char *)(lVar10 + 0x823d) != '\0') {
      FUN_180055100(lVar7,0xd,0xa12f2bb3e943fb13);
      *(undefined1 *)(lVar10 + 0x823d) = 0;
    }
    local_2148 = 0;
    uStack_2140 = 0;
    local_2138 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2148,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7770) & 1) == 0) {
      *(uint *)(lVar10 + 0x7770) = *(uint *)(lVar10 + 0x7770) | 1;
      *(undefined1 *)(lVar10 + 0x8828) = 1;
      *(undefined8 *)(lVar10 + 0x8820) = 0xcfe788e05b19e8e1;
      FUN_1805c2300(&LAB_1806a29e0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8820;
    if (*(char *)(lVar10 + 0x8828) != '\0') {
      FUN_180055100(lVar7,8,0xcf8ffb89377b9db1);
      *(undefined1 *)(lVar10 + 0x8828) = 0;
    }
    local_2128 = 0;
    uStack_2120 = 0;
    local_2118 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2128,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x75d0) & 1) == 0) {
      *(uint *)(lVar10 + 0x75d0) = *(uint *)(lVar10 + 0x75d0) | 1;
      *(undefined2 *)(lVar10 + 0x7574) = 0x135;
      *(undefined4 *)(lVar10 + 0x7570) = 0xb13930cc;
      FUN_1805c2300(&LAB_1806a29b0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    pbVar4 = (byte *)(lVar10 + 0x7570);
    if (*(char *)(lVar10 + 0x7575) != '\0') {
      *pbVar4 = *pbVar4 ^ 0x8f;
      *(byte *)(lVar10 + 0x7571) = *(byte *)(lVar10 + 0x7571) ^ 0x51;
      *(byte *)(lVar10 + 0x7572) = *(byte *)(lVar10 + 0x7572) ^ 0x55;
      *(byte *)(lVar10 + 0x7573) = *(byte *)(lVar10 + 0x7573) ^ 0xdd;
      *(byte *)(lVar10 + 0x7574) = *(byte *)(lVar10 + 0x7574) ^ 0x35;
      *(undefined1 *)(lVar10 + 0x7575) = 0;
    }
    local_2108 = 0;
    uStack_2100 = 0;
    local_20f8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (pbVar4[lVar10] != 0);
    FUN_180059df0(&local_2108);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7ff8) & 1) == 0) {
      *(uint *)(lVar10 + 0x7ff8) = *(uint *)(lVar10 + 0x7ff8) | 1;
      *(undefined1 *)(lVar10 + 0x7b90) = 1;
      *(undefined8 *)(lVar10 + 0x7b88) = 0xdbdb30e289eb7c88;
      FUN_1805c2300(&LAB_1806a2980);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7b88;
    if (*(char *)(lVar10 + 0x7b90) != '\0') {
      FUN_180055100(lVar7,8,0xdbaf4383c59f19cf);
      *(undefined1 *)(lVar10 + 0x7b90) = 0;
    }
    local_20e8 = 0;
    uStack_20e0 = 0;
    local_20d8 = 0;
    uStack_20d0 = 0;
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_20e8,lVar7);
    auVar13 = _DAT_180868a40;
    local_28c8 = 0xd595;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8278) & 1) == 0) {
      *(uint *)(lVar10 + 0x8278) = *(uint *)(lVar10 + 0x8278) | 1;
      *(undefined1 *)(lVar10 + 0x7fca) = 1;
      *(undefined8 *)(lVar10 + 0x7fa8) = 0x6eb9ac6d3587b0b6;
      *(undefined8 *)(lVar10 + 0x7fb0) = 0x6ea5b77a289fba92;
      *(undefined1 (*) [16])(lVar10 + 0x7fb8) = auVar13;
      *(undefined2 *)(lVar10 + 0x7fc8) = 0xd595;
      FUN_1805c2300(&LAB_1806a2950);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7fa8;
    if (*(char *)(lVar10 + 0x7fca) != '\0') {
      FUN_180055100(lVar7,0x22,0x1cdc31f65f3d5f1);
      *(undefined1 *)(lVar10 + 0x7fca) = 0;
    }
    local_20c8 = 0;
    uStack_20c0 = 0;
    local_20b8 = 0;
    uStack_20b0 = 0;
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_20c8,lVar7);
    auVar13 = _DAT_18086f070;
    local_28c8 = 0xa3c6;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x87b4) & 1) == 0) {
      *(uint *)(lVar10 + 0x87b4) = *(uint *)(lVar10 + 0x87b4) | 1;
      *(undefined2 *)(lVar10 + 0x7d52) = 0x10f;
      *(undefined8 *)(lVar10 + 0x7d30) = 0xa8a7b48f077ba2c8;
      *(undefined8 *)(lVar10 + 0x7d38) = 0xa8bbaf981a63a8ec;
      *(undefined1 (*) [16])(lVar10 + 0x7d40) = auVar13;
      *(undefined2 *)(lVar10 + 0x7d50) = 0xa3c6;
      FUN_1805c2300(&LAB_1806a2920);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7d30;
    if (*(char *)(lVar10 + 0x7d53) != '\0') {
      FUN_180055100(lVar7,0x23,0xc7d3dbfd570fc78f);
      *(undefined1 *)(lVar10 + 0x7d53) = 0;
    }
    local_20a8 = 0;
    uStack_20a0 = 0;
    local_2098 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_20a8,lVar7);
    local_28e8 = (undefined8 *)0x84140065e0484abe;
    local_28e0 = (undefined8 *)CONCAT44(local_28e0._4_4_,0x85575896);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8adc) & 1) == 0) {
      *(uint *)(lVar10 + 0x8adc) = *(uint *)(lVar10 + 0x8adc) | 1;
      *(undefined1 *)(lVar10 + 0x7734) = 1;
      *(undefined8 *)(lVar10 + 0x7728) = 0x84140065e0484abe;
      *(undefined4 *)(lVar10 + 0x7730) = 0x85575896;
      FUN_1805c2300(&LAB_1806a28f0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7728;
    if (*(char *)(lVar10 + 0x7734) != '\0') {
      FUN_180055100(lVar7,0xc,0xf165653785232bf3);
      *(undefined1 *)(lVar10 + 0x7734) = 0;
    }
    local_2088 = 0;
    uStack_2080 = 0;
    local_2078 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2088,lVar7);
    local_28d8 = 0xed7c;
    uStack_28d6 = 0x4c39;
    uStack_28d4 = 0x7bcb;
    uStack_28d2 = 0xbe40;
    local_28d0 = 0x5722fc6c;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7974) & 1) == 0) {
      *(uint *)(lVar10 + 0x7974) = *(uint *)(lVar10 + 0x7974) | 1;
      *(undefined2 *)(lVar10 + 0x83fc) = 0x1af;
      *(undefined8 *)(lVar10 + 0x83e0) = 0x9f4d5ac64f33ec49;
      *(undefined8 *)(lVar10 + 0x83e8) = 0x824946cc4c25f66b;
      *(undefined8 *)(lVar10 + 0x83f0) = 0xbe407bcb4c39ed7c;
      *(undefined4 *)(lVar10 + 0x83f8) = 0x5722fc6c;
      FUN_1805c2300(&LAB_1806a28c0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x83e0;
    if (*(char *)(lVar10 + 0x83fd) != '\0') {
      FUN_180055100(lVar7,0x1d,0xcf2529af23519919);
      *(undefined1 *)(lVar10 + 0x83fd) = 0;
    }
    local_2068 = 0;
    uStack_2060 = 0;
    local_2058 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2068,lVar7);
    local_28d8 = 0x6780;
    uStack_28d6 = 0xf215;
    uStack_28d4 = 0xf913;
    uStack_28d2 = 0xa672;
    local_28d0 = 0xee137c95;
    local_28cc = 0xab12;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x751c) & 1) == 0) {
      *(uint *)(lVar10 + 0x751c) = *(uint *)(lVar10 + 0x751c) | 1;
      *(undefined1 *)(lVar10 + 0x8886) = 1;
      *(undefined8 *)(lVar10 + 0x8868) = 0x857fd81ef11f66b5;
      *(undefined8 *)(lVar10 + 0x8870) = 0x987bc414f2097c97;
      *(undefined8 *)(lVar10 + 0x8878) = 0xa672f913f2156780;
      *(undefined4 *)(lVar10 + 0x8880) = 0xee137c95;
      *(undefined2 *)(lVar10 + 0x8884) = 0xab12;
      FUN_1805c2300(&LAB_1806a2890);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8868;
    if (*(char *)(lVar10 + 0x8886) != '\0') {
      FUN_180055100(lVar7,0x1e,0xd517ab779d7d13e5);
      *(undefined1 *)(lVar10 + 0x8886) = 0;
    }
    local_2048 = 0;
    uStack_2040 = 0;
    local_2038 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2048,lVar7);
    local_28e8 = (undefined8 *)0xb33269745a1fe41c;
    local_28e0 = (undefined8 *)CONCAT62(local_28e0._2_6_,0x912a);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7874) & 1) == 0) {
      *(uint *)(lVar10 + 0x7874) = *(uint *)(lVar10 + 0x7874) | 1;
      *(undefined1 *)(lVar10 + 0x7a62) = 1;
      *(undefined8 *)(lVar10 + 0x7a58) = 0xb33269745a1fe41c;
      *(undefined2 *)(lVar10 + 0x7a60) = 0x912a;
      FUN_1805c2300(&LAB_1806a2860);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7a58;
    if (*(char *)(lVar10 + 0x7a62) != '\0') {
      FUN_180055100(lVar7,10,0xd15b1b17297d914f);
      *(undefined1 *)(lVar10 + 0x7a62) = 0;
    }
    local_2028 = 0;
    uStack_2020 = 0;
    local_2018 = 0;
    uStack_2010 = 0;
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2028,lVar7);
    auVar13 = _DAT_18086ba40;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7708) & 1) == 0) {
      *(uint *)(lVar10 + 0x7708) = *(uint *)(lVar10 + 0x7708) | 1;
      *(undefined2 *)(lVar10 + 0x7cf8) = 0x1a5;
      *(undefined8 *)(lVar10 + 0x7cd8) = 0x67c451a0b86948f6;
      *(undefined8 *)(lVar10 + 0x7ce0) = 0x6ad94cb19b6469c0;
      *(undefined1 (*) [16])(lVar10 + 0x7ce8) = auVar13;
      FUN_1805c2300(&LAB_1806a2830);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7cd8;
    if (*(char *)(lVar10 + 0x7cf9) != '\0') {
      FUN_180055100(lVar7,0x21,0x5ad23c3cb0b3da5);
      *(undefined1 *)(lVar10 + 0x7cf9) = 0;
    }
    local_2008 = 0;
    uStack_2000 = 0;
    local_1ff8 = 0;
    uStack_1ff0 = 0;
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2008,lVar7);
    auVar13 = _DAT_18086fc70;
    local_28c8 = 0xdbe;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x74f0) & 1) == 0) {
      *(uint *)(lVar10 + 0x74f0) = *(uint *)(lVar10 + 0x74f0) | 1;
      *(undefined1 *)(lVar10 + 0x892a) = 1;
      *(undefined8 *)(lVar10 + 0x8908) = 0xbdc6c722ec2b7888;
      *(undefined8 *)(lVar10 + 0x8910) = 0xb0dbda33cf2659be;
      *(undefined1 (*) [16])(lVar10 + 0x8918) = auVar13;
      *(undefined2 *)(lVar10 + 0x8928) = 0xdbe;
      FUN_1805c2300(&LAB_1806a2800);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8908;
    if (*(char *)(lVar10 + 0x892a) != '\0') {
      FUN_180055100(lVar7,0x22,0xdfafb5419f490ddb);
      *(undefined1 *)(lVar10 + 0x892a) = 0;
    }
    local_1fe8 = 0;
    uStack_1fe0 = 0;
    local_1fd8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_1fe8,lVar7);
    local_28b8 = 0;
    FUN_1800f46d0(local_19a8,&local_28b8);
    puVar11 = &local_2148;
    do {
      FUN_1800f47c0(local_19a8,&local_28e8,puVar11);
      puVar11 = puVar11 + 4;
    } while (puVar11 != &local_1fc8);
    FUN_1800f2e80(local_8c8,&local_2710,local_19a8);
    local_28e8 = (undefined8 *)0xc09132cea8905d65;
    local_28e0 = (undefined8 *)CONCAT26(local_28e0._6_2_,0x32deb6895d42);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7518) & 1) == 0) {
      *(uint *)(lVar10 + 0x7518) = *(uint *)(lVar10 + 0x7518) | 1;
      *(undefined2 *)(lVar10 + 0x7c9e) = 0x1e3;
      *(undefined8 *)(lVar10 + 0x7c90) = 0xc09132cea8905d65;
      *(undefined4 *)(lVar10 + 0x7c98) = 0xb6895d42;
      *(undefined2 *)(lVar10 + 0x7c9c) = 0x32de;
      FUN_1805c2300(&LAB_1806a27d0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7c90;
    if (*(char *)(lVar10 + 0x7c9f) != '\0') {
      FUN_180055100(lVar7,0xf,0x93e357bddfff2f27);
      *(undefined1 *)(lVar10 + 0x7c9f) = 0;
    }
    local_2730 = 0;
    uStack_2728 = 0;
    local_2720 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2730,lVar7);
    local_28d8 = 0xd52a;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7a94) & 1) == 0) {
      *(uint *)(lVar10 + 0x7a94) = *(uint *)(lVar10 + 0x7a94) | 1;
      *(undefined1 *)(lVar10 + 0x870a) = 1;
      *(undefined8 *)(lVar10 + 0x86f8) = 0x700cf577e75ea512;
      *(undefined8 *)(lVar10 + 0x8700) = 0x6807e95cde49b02e;
      *(undefined2 *)(lVar10 + 0x8708) = 0xd52a;
      FUN_1805c2300(&LAB_1806a27a0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x86f8;
    if (*(char *)(lVar10 + 0x870a) != '\0') {
      FUN_180055100(lVar7,0x12,0x7638735893bd55d);
      *(undefined1 *)(lVar10 + 0x870a) = 0;
    }
    local_23c8 = 0;
    uStack_23c0 = 0;
    local_23b8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_23c8,lVar7);
    local_28d8 = 0xcfc6;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x827c) & 1) == 0) {
      *(uint *)(lVar10 + 0x827c) = *(uint *)(lVar10 + 0x827c) | 1;
      *(undefined1 *)(lVar10 + 0x83da) = 1;
      *(undefined8 *)(lVar10 + 0x83c8) = 0x26c3b4bdc5f0bff0;
      *(undefined8 *)(lVar10 + 0x83d0) = 0x2edba796dddaaac9;
      *(undefined2 *)(lVar10 + 0x83d8) = 0xcfc6;
      FUN_1805c2300(&LAB_1806a2770);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x83c8;
    if (*(char *)(lVar10 + 0x83da) != '\0') {
      FUN_180055100(lVar7,0x12,0x4fb7d5f3ab95cfbf);
      *(undefined1 *)(lVar10 + 0x83da) = 0;
    }
    local_23a8 = 0;
    uStack_23a0 = 0;
    local_2398 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_23a8,lVar7);
    local_28d8 = 0x234b;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8454) & 1) == 0) {
      *(uint *)(lVar10 + 0x8454) = *(uint *)(lVar10 + 0x8454) | 1;
      *(undefined1 *)(lVar10 + 0x8542) = 1;
      *(undefined8 *)(lVar10 + 0x8530) = 0xe1baafd014fc5b7a;
      *(undefined8 *)(lVar10 + 0x8538) = 0xdbb6a9c624f8555e;
      *(undefined2 *)(lVar10 + 0x8540) = 0x234b;
      FUN_1805c2300(&LAB_1806a2740);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8530;
    if (*(char *)(lVar10 + 0x8542) != '\0') {
      FUN_180055100(lVar7,0x12,0xabdfdba57799233f);
      *(undefined1 *)(lVar10 + 0x8542) = 0;
    }
    local_2388 = 0;
    uStack_2380 = 0;
    local_2378 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2388,lVar7);
    local_28d8 = 0xb1d3;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8224) & 1) == 0) {
      *(uint *)(lVar10 + 0x8224) = *(uint *)(lVar10 + 0x8224) | 1;
      *(undefined2 *)(lVar10 + 0x860a) = 0x18d;
      *(undefined8 *)(lVar10 + 0x85f8) = 0xfa61338f0cf9a0f1;
      *(undefined8 *)(lVar10 + 0x8600) = 0xfc473eae18fba4e9;
      *(undefined2 *)(lVar10 + 0x8608) = 0xb1d3;
      FUN_1805c2300(&LAB_1806a2710);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x85f8;
    if (*(char *)(lVar10 + 0x860b) != '\0') {
      FUN_180055100(lVar7,0x13,0x95355dfd798dc5a3);
      *(undefined1 *)(lVar10 + 0x860b) = 0;
    }
    local_2368 = 0;
    uStack_2360 = 0;
    local_2358 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2368,lVar7);
    local_28e8 = (undefined8 *)0x44162ae417956c12;
    local_28e0 = (undefined8 *)CONCAT44(local_28e0._4_4_,0x739f6720);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7a50) & 1) == 0) {
      *(uint *)(lVar10 + 0x7a50) = *(uint *)(lVar10 + 0x7a50) | 1;
      *(undefined1 *)(lVar10 + 0x8204) = 1;
      *(undefined8 *)(lVar10 + 0x81f8) = 0x44162ae417956c12;
      *(undefined4 *)(lVar10 + 0x8200) = 0x739f6720;
      FUN_1805c2300(&LAB_1806a26e0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x81f8;
    if (*(char *)(lVar10 + 0x8204) != '\0') {
      FUN_180055100(lVar7,0xc,0x297b45a773fb0941);
      *(undefined1 *)(lVar10 + 0x8204) = 0;
    }
    local_2348 = 0;
    uStack_2340 = 0;
    local_2338 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2348,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8a4c) & 1) == 0) {
      *(uint *)(lVar10 + 0x8a4c) = *(uint *)(lVar10 + 0x8a4c) | 1;
      *(undefined1 *)(lVar10 + 0x7988) = 1;
      *(undefined8 *)(lVar10 + 0x7978) = 0xdcf64850f36a4f8;
      *(undefined8 *)(lVar10 + 0x7980) = 0x7fd973a80d1aadd4;
      FUN_1805c2300(&LAB_1806a26b0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7978;
    if (*(char *)(lVar10 + 0x7988) != '\0') {
      FUN_180055100(lVar7,0x10,0x7fad1dcd7b5fc9bd);
      *(undefined1 *)(lVar10 + 0x7988) = 0;
    }
    local_2328 = 0;
    uStack_2320 = 0;
    local_2318 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2328,lVar7);
    local_28d8 = 0x8385;
    uStack_28d6 = 0x307e;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7a64) & 1) == 0) {
      *(uint *)(lVar10 + 0x7a64) = *(uint *)(lVar10 + 0x7a64) | 1;
      *(undefined2 *)(lVar10 + 0x862c) = 0x1c7;
      *(undefined8 *)(lVar10 + 0x8618) = 0x6f7a5890297497a4;
      *(undefined8 *)(lVar10 + 0x8620) = 0x6e6e55b33250938a;
      *(undefined4 *)(lVar10 + 0x8628) = 0x307e8385;
      FUN_1805c2300(&LAB_1806a2680);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8618;
    if (*(char *)(lVar10 + 0x862d) != '\0') {
      FUN_180055100(lVar7,0x15,0x7393dc74711e7eb);
      *(undefined1 *)(lVar10 + 0x862d) = 0;
    }
    local_2308 = 0;
    uStack_2300 = 0;
    local_22f8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2308,lVar7);
    local_28e8 = (undefined8 *)0xe973804004cb9a52;
    local_28e0 = (undefined8 *)CONCAT26(local_28e0._6_2_,0x906816d49a52);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7a48) & 1) == 0) {
      *(uint *)(lVar10 + 0x7a48) = *(uint *)(lVar10 + 0x7a48) | 1;
      *(undefined2 *)(lVar10 + 0x825e) = 0x107;
      *(undefined8 *)(lVar10 + 0x8250) = 0xe973804004cb9a52;
      *(undefined4 *)(lVar10 + 0x8258) = 0x16d49a52;
      *(undefined2 *)(lVar10 + 0x825c) = 0x9068;
      FUN_1805c2300(&LAB_1806a2650);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8250;
    if (*(char *)(lVar10 + 0x825f) != '\0') {
      FUN_180055100(lVar7,0xf,0x8107f5017dbbf511);
      *(undefined1 *)(lVar10 + 0x825f) = 0;
    }
    local_22e8 = 0;
    uStack_22e0 = 0;
    local_22d8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_22e8,lVar7);
    local_28d8 = 0x50a8;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8950) & 1) == 0) {
      *(uint *)(lVar10 + 0x8950) = *(uint *)(lVar10 + 0x8950) | 1;
      *(undefined2 *)(lVar10 + 0x7b32) = 0x193;
      *(undefined8 *)(lVar10 + 0x7b20) = 0x60093fd4cefc4b84;
      *(undefined8 *)(lVar10 + 0x7b28) = 0x6b1514e6cff654b0;
      *(undefined2 *)(lVar10 + 0x7b30) = 0x50a8;
      FUN_1805c2300(&LAB_1806a2620);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7b20;
    if (*(char *)(lVar10 + 0x7b33) != '\0') {
      FUN_180055100(lVar7,0x13,0xf7b7db1bd9327c7);
      *(undefined1 *)(lVar10 + 0x7b33) = 0;
    }
    local_22c8 = 0;
    uStack_22c0 = 0;
    local_22b8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_22c8,lVar7);
    local_28b4 = 0;
    FUN_1800f46d0(local_19e8,&local_28b4);
    puVar11 = &local_23c8;
    do {
      FUN_1800f47c0(local_19e8,&local_28e8,puVar11);
      puVar11 = puVar11 + 4;
    } while (puVar11 != &local_22a8);
    FUN_1800f2e80(local_868,&local_2730,local_19e8);
    local_28e8 = (undefined8 *)0x24ea661699e1da9c;
    local_28e0 = (undefined8 *)CONCAT26(local_28e0._6_2_,0x661ca6f5cdae);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x87b0) & 1) == 0) {
      *(uint *)(lVar10 + 0x87b0) = *(uint *)(lVar10 + 0x87b0) | 1;
      *(undefined2 *)(lVar10 + 0x8966) = 0x19d;
      *(undefined8 *)(lVar10 + 0x8958) = 0x24ea661699e1da9c;
      *(undefined4 *)(lVar10 + 0x8960) = 0xa6f5cdae;
      *(undefined2 *)(lVar10 + 0x8964) = 0x661c;
      FUN_1805c2300(&LAB_1806a25f0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8958;
    if (*(char *)(lVar10 + 0x8967) != '\0') {
      FUN_180055100(lVar7,0xf,0x779d037fcf83bfcb);
      *(undefined1 *)(lVar10 + 0x8967) = 0;
    }
    local_2750 = 0;
    uStack_2748 = 0;
    local_2740 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2750,lVar7);
    local_28e8 = (undefined8 *)0x19d3201ef394e17e;
    local_28e0 = (undefined8 *)CONCAT62(local_28e0._2_6_,0xe65e);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8228) & 1) == 0) {
      *(uint *)(lVar10 + 0x8228) = *(uint *)(lVar10 + 0x8228) | 1;
      *(undefined2 *)(lVar10 + 0x7912) = 0x1f1;
      *(undefined8 *)(lVar10 + 0x7908) = 0x19d3201ef394e17e;
      *(undefined2 *)(lVar10 + 0x7910) = 0xe65e;
      FUN_1805c2300(&LAB_1806a25c0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7908;
    if (*(char *)(lVar10 + 0x7913) != '\0') {
      FUN_180055100(lVar7,0xb,0x7dbd49499df19131);
      *(undefined1 *)(lVar10 + 0x7913) = 0;
    }
    local_2770 = 0;
    uStack_2768 = 0;
    local_2760 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2770,lVar7);
    local_28b0 = 0;
    FUN_1800f46d0(local_1a28,&local_28b0);
    FUN_1800f47c0(local_1a28,&local_28e8,&local_2770);
    FUN_1800f2e80(local_808,&local_2750,local_1a28);
    local_28e8 = (undefined8 *)0x46f00795e6930a50;
    local_28e0 = (undefined8 *)CONCAT26(local_28e0._6_2_,0x7391f7841d6d);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8934) & 1) == 0) {
      *(uint *)(lVar10 + 0x8934) = *(uint *)(lVar10 + 0x8934) | 1;
      *(undefined1 *)(lVar10 + 0x85f6) = 1;
      *(undefined8 *)(lVar10 + 0x85e8) = 0x46f00795e6930a50;
      *(undefined4 *)(lVar10 + 0x85f0) = 0xf7841d6d;
      *(undefined2 *)(lVar10 + 0x85f4) = 0x7391;
      FUN_1805c2300(&LAB_1806a2590);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x85e8;
    if (*(char *)(lVar10 + 0x85f6) != '\0') {
      FUN_180055100(lVar7,0xe,0x29b373e58fe16903);
      *(undefined1 *)(lVar10 + 0x85f6) = 0;
    }
    local_2790 = 0;
    uStack_2788 = 0;
    local_2780 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2790,lVar7);
    local_28d8 = 0x33b0;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8348) & 1) == 0) {
      *(uint *)(lVar10 + 0x8348) = *(uint *)(lVar10 + 0x8348) | 1;
      *(undefined2 *)(lVar10 + 0x7d6a) = 0x171;
      *(undefined8 *)(lVar10 + 0x7d58) = 0xb8fc2f9ebc153b90;
      *(undefined8 *)(lVar10 + 0x7d60) = 0x88f611858f182db2;
      *(undefined2 *)(lVar10 + 0x7d68) = 0x33b0;
      FUN_1805c2300(&LAB_1806a2560);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7d58;
    if (*(char *)(lVar10 + 0x7d6b) != '\0') {
      FUN_180055100(lVar7,0x13,0xeb995df1ff715fd1);
      *(undefined1 *)(lVar10 + 0x7d6b) = 0;
    }
    local_2628 = 0;
    uStack_2620 = 0;
    local_2618 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2628,lVar7);
    local_28d8 = 0x6518;
    uStack_28d6 = 0xf9ae;
    uStack_28d4 = 0xd92c;
    uStack_28d2 = 0x8312;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8744) & 1) == 0) {
      *(uint *)(lVar10 + 0x8744) = *(uint *)(lVar10 + 0x8744) | 1;
      *(undefined1 *)(lVar10 + 0x7a08) = 1;
      *(undefined8 *)(lVar10 + 0x79f0) = 0xea01ce1ed8bf6a22;
      *(undefined8 *)(lVar10 + 0x79f8) = 0xef1acb22cf997f01;
      *(undefined8 *)(lVar10 + 0x7a00) = 0x8312d92cf9ae6518;
      FUN_1805c2300(&LAB_1806a2530);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x79f0;
    if (*(char *)(lVar10 + 0x7a08) != '\0') {
      FUN_180055100(lVar7,0x18,0x8373ad4dbdc90b71);
      *(undefined1 *)(lVar10 + 0x7a08) = 0;
    }
    local_2608 = 0;
    uStack_2600 = 0;
    local_25f8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2608,lVar7);
    local_28ac = 0;
    FUN_1800f46d0(local_1a68,&local_28ac);
    puVar11 = &local_2628;
    do {
      FUN_1800f47c0(local_1a68,&local_28e8,puVar11);
      puVar11 = puVar11 + 4;
    } while (puVar11 != local_25e8);
    FUN_1800f2e80(local_7a8,&local_2790,local_1a68);
    local_28d8 = 0x1db9;
    uStack_28d6 = 0x6846;
    uStack_28d4 = 0xa72a;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x78fc) & 1) == 0) {
      *(uint *)(lVar10 + 0x78fc) = *(uint *)(lVar10 + 0x78fc) | 1;
      *(undefined1 *)(lVar10 + 0x8136) = 1;
      *(undefined8 *)(lVar10 + 0x8120) = 0xc379d33f625d0898;
      *(undefined8 *)(lVar10 + 0x8128) = 0xd47ad52a67460da4;
      *(undefined4 *)(lVar10 + 0x8130) = 0x68461db9;
      *(undefined2 *)(lVar10 + 0x8134) = 0xa72a;
      FUN_1805c2300(&LAB_1806a2500);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8120;
    if (*(char *)(lVar10 + 0x8136) != '\0') {
      FUN_180055100(lVar7,0x16,0xb129a74f0b2f6bcb);
      *(undefined1 *)(lVar10 + 0x8136) = 0;
    }
    local_27b0 = 0;
    uStack_27a8 = 0;
    local_27a0 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_27b0,lVar7);
    local_28d8 = 0xd124;
    uStack_28d6 = 0xf1c4;
    uStack_28d4 = 0x59d2;
    uStack_28d2 = 0xc92a;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7fa0) & 1) == 0) {
      *(uint *)(lVar10 + 0x7fa0) = *(uint *)(lVar10 + 0x7fa0) | 1;
      *(undefined1 *)(lVar10 + 0x7ae8) = 1;
      *(undefined8 *)(lVar10 + 0x7ad0) = 0xa0394ee0d0d5de1e;
      *(undefined8 *)(lVar10 + 0x7ad8) = 0xa5224bdcc7f3cb3d;
      *(undefined8 *)(lVar10 + 0x7ae0) = 0xc92a59d2f1c4d124;
      FUN_1805c2300(&LAB_1806a24d0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7ad0;
    if (*(char *)(lVar10 + 0x7ae8) != '\0') {
      FUN_180055100(lVar7,0x18,0xc94b2db3b5a3bf4d);
      *(undefined1 *)(lVar10 + 0x7ae8) = 0;
    }
    local_27d0 = 0;
    uStack_27c8 = 0;
    local_27c0 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_27d0,lVar7);
    local_28a8 = 0;
    FUN_1800f46d0(local_1aa8,&local_28a8);
    FUN_1800f47c0(local_1aa8,&local_28e8,&local_27d0);
    FUN_1800f2e80(local_748,&local_27b0,local_1aa8);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x81a0) & 1) == 0) {
      *(uint *)(lVar10 + 0x81a0) = *(uint *)(lVar10 + 0x81a0) | 1;
      *(undefined1 *)(lVar10 + 0x7c58) = 1;
      *(undefined8 *)(lVar10 + 0x7c50) = 0x4db24dd6f68a7b67;
      FUN_1805c2300(&LAB_1806a24a0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7c50;
    if (*(char *)(lVar10 + 0x7c58) != '\0') {
      FUN_180055100(lVar7,8,0x4dc13fb38feb1737);
      *(undefined1 *)(lVar10 + 0x7c58) = 0;
    }
    local_27f0 = 0;
    uStack_27e8 = 0;
    local_27e0 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_27f0,lVar7);
    local_28e8 = (undefined8 *)0x9be8338dea9ff8ed;
    local_28e0 = (undefined8 *)CONCAT44(local_28e0._4_4_,0x858aeeca);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8140) & 1) == 0) {
      *(uint *)(lVar10 + 0x8140) = *(uint *)(lVar10 + 0x8140) | 1;
      *(undefined1 *)(lVar10 + 0x77d4) = 1;
      *(undefined8 *)(lVar10 + 0x77c8) = 0x9be8338dea9ff8ed;
      *(undefined4 *)(lVar10 + 0x77d0) = 0x858aeeca;
      FUN_1805c2300(&LAB_1806a2470);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x77c8;
    if (*(char *)(lVar10 + 0x77d4) != '\0') {
      FUN_180055100(lVar7,0xc,0xf9a947ff85ef9dbf);
      *(undefined1 *)(lVar10 + 0x77d4) = 0;
    }
    local_2668 = 0;
    uStack_2660 = 0;
    local_2658 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2668,lVar7);
    local_28e8 = (undefined8 *)0xe76c91afb6af8ad1;
    local_28e0 = (undefined8 *)CONCAT26(local_28e0._6_2_,0xe5ee8fba9cf6);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8544) & 1) == 0) {
      *(uint *)(lVar10 + 0x8544) = *(uint *)(lVar10 + 0x8544) | 1;
      *(undefined1 *)(lVar10 + 0x85de) = 1;
      *(undefined8 *)(lVar10 + 0x85d0) = 0xe76c91afb6af8ad1;
      *(undefined4 *)(lVar10 + 0x85d8) = 0x8fba9cf6;
      *(undefined2 *)(lVar10 + 0x85dc) = 0xe5ee;
      FUN_1805c2300(&LAB_1806a2440);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x85d0;
    if (*(char *)(lVar10 + 0x85de) != '\0') {
      FUN_180055100(lVar7,0xe,0x852de5ddd9dfef83);
      *(undefined1 *)(lVar10 + 0x85de) = 0;
    }
    local_2648 = 0;
    uStack_2640 = 0;
    local_2638 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2648,lVar7);
    local_28a4 = 0;
    FUN_1800f46d0(local_1ae8,&local_28a4);
    puVar11 = &local_2668;
    do {
      FUN_1800f47c0(local_1ae8,&local_28e8,puVar11);
      puVar11 = puVar11 + 4;
    } while (puVar11 != &local_2628);
    FUN_1800f2e80(local_6e8,&local_27f0,local_1ae8);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7774) & 1) == 0) {
      *(uint *)(lVar10 + 0x7774) = *(uint *)(lVar10 + 0x7774) | 1;
      *(undefined1 *)(lVar10 + 0x89e8) = 1;
      *(undefined8 *)(lVar10 + 0x89e0) = 0x9b1e9ae07ad7547c;
      FUN_1805c2300(&LAB_1806a2410);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x89e0;
    if (*(char *)(lVar10 + 0x89e8) != '\0') {
      FUN_180055100(lVar7,8,0x9b77efa71fa53b3f);
      *(undefined1 *)(lVar10 + 0x89e8) = 0;
    }
    local_2810 = 0;
    uStack_2808 = 0;
    local_2800 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2810,lVar7);
    local_28e8 = (undefined8 *)0x4e4face6d0b8f42f;
    local_28e0 = (undefined8 *)CONCAT26(local_28e0._6_2_,0xbbdadda0fb1e);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x892c) & 1) == 0) {
      *(uint *)(lVar10 + 0x892c) = *(uint *)(lVar10 + 0x892c) | 1;
      *(undefined2 *)(lVar10 + 0x873e) = 0x13d;
      *(undefined8 *)(lVar10 + 0x8730) = 0x4e4face6d0b8f42f;
      *(undefined4 *)(lVar10 + 0x8738) = 0xdda0fb1e;
      *(undefined2 *)(lVar10 + 0x873c) = 0xbbda;
      FUN_1805c2300(&LAB_1806a23e0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8730;
    if (*(char *)(lVar10 + 0x873f) != '\0') {
      FUN_180055100(lVar7,0xf,0x2b3dcfb5b5d3957b);
      *(undefined1 *)(lVar10 + 0x873f) = 0;
    }
    local_24c8 = 0;
    uStack_24c0 = 0;
    local_24b8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_24c8,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x80d0) & 1) == 0) {
      *(uint *)(lVar10 + 0x80d0) = *(uint *)(lVar10 + 0x80d0) | 1;
      *(undefined1 *)(lVar10 + 0x75a8) = 1;
      *(undefined8 *)(lVar10 + 0x7598) = 0xf4dfdc8d5ee03eb7;
      *(undefined8 *)(lVar10 + 0x75a0) = 0x91ead7885df53e80;
      FUN_1805c2300(&LAB_1806a23b0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7598;
    if (*(char *)(lVar10 + 0x75a8) != '\0') {
      FUN_180055100(lVar7,0x10,0x918db9e1398751e3);
      *(undefined1 *)(lVar10 + 0x75a8) = 0;
    }
    local_24a8 = 0;
    uStack_24a0 = 0;
    local_2498 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_24a8,lVar7);
    local_28d8 = 0xe322;
    uStack_28d6 = 0xf093;
    uStack_28d4 = 0x1b65;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8198) & 1) == 0) {
      *(uint *)(lVar10 + 0x8198) = *(uint *)(lVar10 + 0x8198) | 1;
      *(undefined1 *)(lVar10 + 0x8866) = 1;
      *(undefined8 *)(lVar10 + 0x8850) = 0x30bb7844fb92ff02;
      *(undefined8 *)(lVar10 + 0x8858) = 0x13ba6f78fd84e128;
      *(undefined4 *)(lVar10 + 0x8860) = 0xf093e322;
      *(undefined2 *)(lVar10 + 0x8864) = 0x1b65;
      FUN_1805c2300(&LAB_1806a2380);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8850;
    if (*(char *)(lVar10 + 0x8866) != '\0') {
      FUN_180055100(lVar7,0x16,0x55c91b1795f78f4d);
      *(undefined1 *)(lVar10 + 0x8866) = 0;
    }
    local_2488 = 0;
    uStack_2480 = 0;
    local_2478 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2488,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x88b0) & 1) == 0) {
      *(uint *)(lVar10 + 0x88b0) = *(uint *)(lVar10 + 0x88b0) | 1;
      *(undefined2 *)(lVar10 + 0x8158) = 0x11d;
      *(undefined8 *)(lVar10 + 0x8148) = 0xf6efc29fdbbcab52;
      *(undefined8 *)(lVar10 + 0x8150) = 0xe1eecfa5da9fa872;
      FUN_1805c2300(&LAB_1806a2350);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8148;
    if (*(char *)(lVar10 + 0x8159) != '\0') {
      FUN_180055100(lVar7,0x11,0x938babc9b5d9db1d);
      *(undefined1 *)(lVar10 + 0x8159) = 0;
    }
    local_2468 = 0;
    uStack_2460 = 0;
    local_2458 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2468,lVar7);
    local_28a0 = 0;
    FUN_1800f46d0(local_1b28,&local_28a0);
    puVar11 = &local_24c8;
    do {
      FUN_1800f47c0(local_1b28,&local_28e8,puVar11);
      puVar11 = puVar11 + 4;
    } while (puVar11 != &local_2448);
    FUN_1800f2e80(local_688,&local_2810,local_1b28);
    local_28e8 = (undefined8 *)0xc8309449102fd626;
    local_28e0 = (undefined8 *)CONCAT26(local_28e0._6_2_,0xed581620c107);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8164) & 1) == 0) {
      *(uint *)(lVar10 + 0x8164) = *(uint *)(lVar10 + 0x8164) | 1;
      *(undefined1 *)(lVar10 + 0x808e) = 1;
      *(undefined8 *)(lVar10 + 0x8080) = 0xc8309449102fd626;
      *(undefined4 *)(lVar10 + 0x8088) = 0x1620c107;
      *(undefined2 *)(lVar10 + 0x808c) = 0xed58;
      FUN_1805c2300(&LAB_1806a2320);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8080;
    if (*(char *)(lVar10 + 0x808e) != '\0') {
      FUN_180055100(lVar7,0xe,0xad63ed3d7549b775);
      *(undefined1 *)(lVar10 + 0x808e) = 0;
    }
    local_2830 = 0;
    uStack_2828 = 0;
    local_2820 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2830,lVar7);
    local_28e8 = (undefined8 *)0x285ca1616660a33;
    local_28e0 = (undefined8 *)CONCAT26(local_28e0._6_2_,0xdd2a1b7e0502);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x87b8) & 1) == 0) {
      *(uint *)(lVar10 + 0x87b8) = *(uint *)(lVar10 + 0x87b8) | 1;
      *(undefined2 *)(lVar10 + 0x76ce) = 0x1f7;
      *(undefined8 *)(lVar10 + 0x76c0) = 0x285ca1616660a33;
      *(undefined4 *)(lVar10 + 0x76c8) = 0x1b7e0502;
      *(undefined2 *)(lVar10 + 0x76cc) = 0xdd2a;
      FUN_1805c2300(&LAB_1806a22f0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x76c0;
    if (*(char *)(lVar10 + 0x76cf) != '\0') {
      FUN_180055100(lVar7,0xf,0x67f7a945730d6b67);
      *(undefined1 *)(lVar10 + 0x76cf) = 0;
    }
    local_2850 = 0;
    uStack_2848 = 0;
    local_2840 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2850,lVar7);
    local_289c = 0;
    FUN_1800f46d0(local_1b68,&local_289c);
    FUN_1800f47c0(local_1b68,&local_28e8,&local_2850);
    FUN_1800f2e80(local_628,&local_2830,local_1b68);
    local_28e8 = (undefined8 *)0xace90f54e2b6b8c0;
    local_28e0 = (undefined8 *)CONCAT62(local_28e0._2_6_,0xa8e4);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7aac) & 1) == 0) {
      *(uint *)(lVar10 + 0x7aac) = *(uint *)(lVar10 + 0x7aac) | 1;
      *(undefined2 *)(lVar10 + 0x89a2) = 0x1df;
      *(undefined8 *)(lVar10 + 0x8998) = 0xace90f54e2b6b8c0;
      *(undefined2 *)(lVar10 + 0x89a0) = 0xa8e4;
      FUN_1805c2300(&LAB_1806a22c0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8998;
    if (*(char *)(lVar10 + 0x89a3) != '\0') {
      FUN_180055100(lVar7,0xb,0xc59f7d31b1dfcd87);
      *(undefined1 *)(lVar10 + 0x89a3) = 0;
    }
    local_2870 = 0;
    uStack_2868 = 0;
    local_2860 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2870,lVar7);
    local_28d8 = 0xe170;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8a1c) & 1) == 0) {
      *(uint *)(lVar10 + 0x8a1c) = *(uint *)(lVar10 + 0x8a1c) | 1;
      *(undefined1 *)(lVar10 + 0x7a82) = 1;
      *(undefined8 *)(lVar10 + 0x7a70) = 0x64d0ab6f4b329148;
      *(undefined8 *)(lVar10 + 0x7a78) = 0x7cdbb74472258474;
      *(undefined2 *)(lVar10 + 0x7a80) = 0xe170;
      FUN_1805c2300(&LAB_1806a2290);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7a70;
    if (*(char *)(lVar10 + 0x7a82) != '\0') {
      FUN_180055100(lVar7,0x12,0x13bfd92d2557e107);
      *(undefined1 *)(lVar10 + 0x7a82) = 0;
    }
    local_2548 = 0;
    uStack_2540 = 0;
    local_2538 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2548,lVar7);
    local_28d8 = 0x2d8c;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x82d0) & 1) == 0) {
      *(uint *)(lVar10 + 0x82d0) = *(uint *)(lVar10 + 0x82d0) | 1;
      *(undefined1 *)(lVar10 + 0x7bb2) = 1;
      *(undefined8 *)(lVar10 + 0x7ba0) = 0x9c23ee5d5d665dba;
      *(undefined8 *)(lVar10 + 0x7ba8) = 0x943bfd76454c4883;
      *(undefined2 *)(lVar10 + 0x7bb0) = 0x2d8c;
      FUN_1805c2300(&LAB_1806a2260);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7ba0;
    if (*(char *)(lVar10 + 0x7bb2) != '\0') {
      FUN_180055100(lVar7,0x12,0xf5578f1333032df5);
      *(undefined1 *)(lVar10 + 0x7bb2) = 0;
    }
    local_2528 = 0;
    uStack_2520 = 0;
    local_2518 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2528,lVar7);
    local_28d8 = 0xafb2;
    uStack_28d6 = 0x8430;
    uStack_28d4 = 0xf785;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8818) & 1) == 0) {
      *(uint *)(lVar10 + 0x8818) = *(uint *)(lVar10 + 0x8818) | 1;
      *(undefined1 *)(lVar10 + 0x7de6) = 1;
      *(undefined8 *)(lVar10 + 0x7dd0) = 0x7408948f8a36a991;
      *(undefined8 *)(lVar10 + 0x7dd8) = 0x640091829f3695a7;
      *(undefined4 *)(lVar10 + 0x7de0) = 0x8430afb2;
      *(undefined2 *)(lVar10 + 0x7de4) = 0xf785;
      FUN_1805c2300(&LAB_1806a2230);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7dd0;
    if (*(char *)(lVar10 + 0x7de6) != '\0') {
      FUN_180055100(lVar7,0x16,0x769f7ebeb59dbd3);
      *(undefined1 *)(lVar10 + 0x7de6) = 0;
    }
    local_2508 = 0;
    uStack_2500 = 0;
    local_24f8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2508,lVar7);
    local_28d8 = 0x7c71;
    uStack_28d6 = 0xfa8e;
    uStack_28d4 = 0xaea7;
    uStack_28d2 = 0xef12;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7b68) & 1) == 0) {
      *(uint *)(lVar10 + 0x7b68) = *(uint *)(lVar10 + 0x7b68) | 1;
      *(undefined2 *)(lVar10 + 0x7798) = 0x105;
      *(undefined8 *)(lVar10 + 0x7780) = 0xe906b3baf9895056;
      *(undefined8 *)(lVar10 + 0x7788) = 0xf108aebdf9984664;
      *(undefined8 *)(lVar10 + 0x7790) = 0xef12aea7fa8e7c71;
      FUN_1805c2300(&LAB_1806a2200);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7780;
    if (*(char *)(lVar10 + 0x7799) != '\0') {
      FUN_180055100(lVar7,0x19,0x8165c1cfa9fd3505);
      *(undefined1 *)(lVar10 + 0x7799) = 0;
    }
    local_24e8 = 0;
    uStack_24e0 = 0;
    local_24d8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_24e8,lVar7);
    local_2898[0] = 0;
    FUN_1800f46d0(local_1ba8,local_2898);
    puVar11 = &local_2548;
    do {
      FUN_1800f47c0(local_1ba8,&local_28e8,puVar11);
      puVar11 = puVar11 + 4;
    } while (puVar11 != &local_24c8);
    FUN_1800f2e80(local_5c8,&local_2870,local_1ba8);
    local_28e8 = (undefined8 *)0xb8862f10ee470693;
    local_28e0 = (undefined8 *)CONCAT26(local_28e0._6_2_,0x241aec5f1dba);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7a0c) & 1) == 0) {
      *(uint *)(lVar10 + 0x7a0c) = *(uint *)(lVar10 + 0x7a0c) | 1;
      *(undefined2 *)(lVar10 + 0x7f9e) = 0x1e1;
      *(undefined8 *)(lVar10 + 0x7f90) = 0xb8862f10ee470693;
      *(undefined4 *)(lVar10 + 0x7f98) = 0xec5f1dba;
      *(undefined2 *)(lVar10 + 0x7f9c) = 0x241a;
      FUN_1805c2300(&LAB_1806a21d0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7f90;
    if (*(char *)(lVar10 + 0x7f9f) != '\0') {
      FUN_180055100(lVar7,0xf,0xebe1417985296fdf);
      *(undefined1 *)(lVar10 + 0x7f9f) = 0;
    }
    local_2890 = 0;
    uStack_2888 = 0;
    local_2880 = 0;
    uStack_2878 = 0;
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2890,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7bb8) & 1) == 0) {
      *(uint *)(lVar10 + 0x7bb8) = *(uint *)(lVar10 + 0x7bb8) | 1;
      *(undefined1 *)(lVar10 + 0x8718) = 1;
      *(undefined8 *)(lVar10 + 0x8710) = 0x6f3173d07d407762;
      FUN_1805c2300(&LAB_1806a21a0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8710;
    if (*(char *)(lVar10 + 0x8718) != '\0') {
      FUN_180055100(lVar7,8,0x6f5d01851325072d);
      *(undefined1 *)(lVar10 + 0x8718) = 0;
    }
    local_22a8 = 0;
    uStack_22a0 = 0;
    local_2298 = 0;
    uStack_2290 = 0;
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_22a8,lVar7);
    local_28e8 = (undefined8 *)0x29bcfd3eb045502f;
    local_28e0 = (undefined8 *)CONCAT62(local_28e0._2_6_,0x3507);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8160) & 1) == 0) {
      *(uint *)(lVar10 + 0x8160) = *(uint *)(lVar10 + 0x8160) | 1;
      *(undefined1 *)(lVar10 + 0x83c2) = 1;
      *(undefined8 *)(lVar10 + 0x83b8) = 0x29bcfd3eb045502f;
      *(undefined2 *)(lVar10 + 0x83c0) = 0x3507;
      FUN_1805c2300(&LAB_1806a2170);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x83b8;
    if (*(char *)(lVar10 + 0x83c2) != '\0') {
      FUN_180055100(lVar7,10,0x5be9895dd531356b);
      *(undefined1 *)(lVar10 + 0x83c2) = 0;
    }
    local_2288 = 0;
    uStack_2280 = 0;
    local_2278 = 0;
    uStack_2270 = 0;
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2288,lVar7);
    local_28e8 = (undefined8 *)0xf247364dc329cc9;
    local_28e0 = (undefined8 *)CONCAT26(local_28e0._6_2_,0x6b65e0348cd7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x89ec) & 1) == 0) {
      *(uint *)(lVar10 + 0x89ec) = *(uint *)(lVar10 + 0x89ec) | 1;
      *(undefined2 *)(lVar10 + 0x7c16) = 0x141;
      *(undefined8 *)(lVar10 + 0x7c08) = 0xf247364dc329cc9;
      *(undefined4 *)(lVar10 + 0x7c10) = 0xe0348cd7;
      *(undefined2 *)(lVar10 + 0x7c14) = 0x6b65;
      FUN_1805c2300(&LAB_1806a2140);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7c08;
    if (*(char *)(lVar10 + 0x7c17) != '\0') {
      FUN_180055100(lVar7,0xf,0x7d410717b555f99b);
      *(undefined1 *)(lVar10 + 0x7c17) = 0;
    }
    local_2268 = 0;
    uStack_2260 = 0;
    local_2258 = 0;
    uStack_2250 = 0;
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2268,lVar7);
    local_28d8 = 0xa1f4;
    uStack_28d6 = 0x4de8;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x88f8) & 1) == 0) {
      *(uint *)(lVar10 + 0x88f8) = *(uint *)(lVar10 + 0x88f8) | 1;
      *(undefined1 *)(lVar10 + 0x7dac) = 1;
      *(undefined8 *)(lVar10 + 0x7d98) = 0x6848a9093ff0a7c2;
      *(undefined8 *)(lVar10 + 0x7da0) = 0x7f54891809fda1c4;
      *(undefined4 *)(lVar10 + 0x7da8) = 0x4de8a1f4;
      FUN_1805c2300(&LAB_1806a2110);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7d98;
    if (*(char *)(lVar10 + 0x7dac) != '\0') {
      FUN_180055100(lVar7,0x14,0x93de57d4d91d391);
      *(undefined1 *)(lVar10 + 0x7dac) = 0;
    }
    local_2248 = 0;
    uStack_2240 = 0;
    local_2238 = 0;
    uStack_2230 = 0;
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2248,lVar7);
    local_28d8 = 0xae83;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x87ac) & 1) == 0) {
      *(uint *)(lVar10 + 0x87ac) = *(uint *)(lVar10 + 0x87ac) | 1;
      *(undefined2 *)(lVar10 + 0x7d12) = 0x145;
      *(undefined8 *)(lVar10 + 32000) = 0x26a4901b552aa3a2;
      *(undefined8 *)(lVar10 + 0x7d08) = 0x16b38c3b4001bb83;
      *(undefined2 *)(lVar10 + 0x7d10) = 0xae83;
      FUN_1805c2300(&LAB_1806a20e0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 32000;
    if (*(char *)(lVar10 + 0x7d13) != '\0') {
      FUN_180055100(lVar7,0x13,0x73c5e5572545d7f1);
      *(undefined1 *)(lVar10 + 0x7d13) = 0;
    }
    local_2228 = 0;
    uStack_2220 = 0;
    local_2218 = 0;
    uStack_2210 = 0;
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2228,lVar7);
    local_28d8 = 0x8ba2;
    uStack_28d6 = 0x5fd1;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x86c0) & 1) == 0) {
      *(uint *)(lVar10 + 0x86c0) = *(uint *)(lVar10 + 0x86c0) | 1;
      *(undefined1 *)(lVar10 + 0x80ec) = 1;
      *(undefined8 *)(lVar10 + 0x80d8) = 0x729f15d42bc88cb0;
      *(undefined8 *)(lVar10 + 0x80e0) = 0x6eac13de2bd59eb0;
      *(undefined4 *)(lVar10 + 33000) = 0x5fd18ba2;
      FUN_1805c2300(&LAB_1806a20b0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x80d8;
    if (*(char *)(lVar10 + 0x80ec) != '\0') {
      FUN_180055100(lVar7,0x14,0x1dcb7db75fa1fbe3);
      *(undefined1 *)(lVar10 + 0x80ec) = 0;
    }
    local_2208 = 0;
    uStack_2200 = 0;
    local_21f8 = 0;
    uStack_21f0 = 0;
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2208,lVar7);
    local_28d8 = 0xd858;
    uStack_28d6 = 0x33ff;
    uStack_28d4 = 0x99c4;
    uStack_28d2 = 0xa80c;
    local_28d0 = 0x47fbcd4a;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x870c) & 1) == 0) {
      *(uint *)(lVar10 + 0x870c) = *(uint *)(lVar10 + 0x870c) | 1;
      *(undefined1 *)(lVar10 + 0x88d4) = 1;
      *(undefined8 *)(lVar10 + 35000) = 0xa81f85c237fbc858;
      *(undefined8 *)(lVar10 + 0x88c0) = 0xb43f9fce33e2ca58;
      *(undefined8 *)(lVar10 + 0x88c8) = 0xa80c99c433ffd858;
      *(undefined4 *)(lVar10 + 0x88d0) = 0x47fbcd4a;
      FUN_1805c2300(&LAB_1806a2080);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 35000;
    if (*(char *)(lVar10 + 0x88d4) != '\0') {
      FUN_180055100(lVar7,0x1c,0xdb6bf7ad478bbd0b);
      *(undefined1 *)(lVar10 + 0x88d4) = 0;
    }
    local_21e8 = 0;
    uStack_21e0 = 0;
    local_21d8 = 0;
    uStack_21d0 = 0;
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_21e8,lVar7);
    local_28e8 = (undefined8 *)0x4dcd72aa71c15a30;
    local_28e0 = (undefined8 *)CONCAT26(local_28e0._6_2_,0x1a74fe05e02);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8ad0) & 1) == 0) {
      *(uint *)(lVar10 + 0x8ad0) = *(uint *)(lVar10 + 0x8ad0) | 1;
      *(undefined1 *)(lVar10 + 0x802e) = 1;
      *(undefined8 *)(lVar10 + 0x8020) = 0x4dcd72aa71c15a30;
      *(undefined4 *)(lVar10 + 0x8028) = 0x4fe05e02;
      *(undefined2 *)(lVar10 + 0x802c) = 0x1a7;
      FUN_1805c2300(&LAB_1806a2050);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8020;
    if (*(char *)(lVar10 + 0x802e) != '\0') {
      FUN_180055100(lVar7,0xe,0x1b901cb3db53f77);
      *(undefined1 *)(lVar10 + 0x802e) = 0;
    }
    local_21c8 = 0;
    uStack_21c0 = 0;
    local_21b8 = 0;
    uStack_21b0 = 0;
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_21c8,lVar7);
    local_28d8 = 0x610e;
    uStack_28d6 = 0x2ed5;
    uStack_28d4 = 0x4837;
    uStack_28d2 = 0x7be;
    local_28d0 = CONCAT22(local_28d0._2_2_,0xf07);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x8a24) & 1) == 0) {
      *(uint *)(lVar10 + 0x8a24) = *(uint *)(lVar10 + 0x8a24) | 1;
      *(undefined1 *)(lVar10 + 0x7d92) = 1;
      *(undefined8 *)(lVar10 + 0x7d78) = 0x19a84b3706c56a2c;
      *(undefined8 *)(lVar10 + 0x7d80) = 0x259f5c380bc36e0e;
      *(undefined8 *)(lVar10 + 0x7d88) = 0x7be48372ed5610e;
      *(undefined2 *)(lVar10 + 0x7d90) = 0xf07;
      FUN_1805c2300(&LAB_1806a2020);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7d78;
    if (*(char *)(lVar10 + 0x7d92) != '\0') {
      FUN_180055100(lVar7,0x1a,0x75eb2f5947b10f6b);
      *(undefined1 *)(lVar10 + 0x7d92) = 0;
    }
    local_21a8 = 0;
    uStack_21a0 = 0;
    local_2198 = 0;
    uStack_2190 = 0;
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_21a8,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7ff4) & 1) == 0) {
      *(uint *)(lVar10 + 0x7ff4) = *(uint *)(lVar10 + 0x7ff4) | 1;
      *(undefined1 *)(lVar10 + 0x7888) = 1;
      *(undefined8 *)(lVar10 + 0x7878) = 0x32eeabc9fde81ef6;
      *(undefined8 *)(lVar10 + 0x7880) = 0x55ef9cd7eac91ed6;
      FUN_1805c2300(&LAB_1806a1ff0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7878;
    if (*(char *)(lVar10 + 0x7888) != '\0') {
      FUN_180055100(lVar7,0x10,0x558bf9a58fbd6dbf);
      *(undefined1 *)(lVar10 + 0x7888) = 0;
    }
    local_2188 = 0;
    uStack_2180 = 0;
    local_2178 = 0;
    uStack_2170 = 0;
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059df0(&local_2188,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x82cc) & 1) == 0) {
      *(uint *)(lVar10 + 0x82cc) = *(uint *)(lVar10 + 0x82cc) | 1;
      *(undefined1 *)(lVar10 + 0x8590) = 1;
      *(undefined8 *)(lVar10 + 0x8588) = 0x5d1f21f02f023944;
      FUN_1805c2300(&LAB_1806a1fc0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x8588;
    if (*(char *)(lVar10 + 0x8590) != '\0') {
      FUN_180055100(lVar7,8,0x5d5373a54167492b);
      *(undefined1 *)(lVar10 + 0x8590) = 0;
    }
    local_2168 = 0;
    uStack_2160 = 0;
    local_2158 = 0;
    uStack_2150 = 0;
    do {
      lVar6 = lVar6 + 1;
    } while (*(char *)(lVar7 + lVar6) != '\0');
    FUN_180059df0(&local_2168,lVar7,lVar6);
    local_28e8 = &local_22a8;
    local_28e0 = &local_2148;
    FUN_1800f4370(local_1448,&local_28e8);
    FUN_1800f2e80(local_568,&local_2890,local_1448);
    uVar2 = FUN_1800ee7b0();
    uVar2 = FUN_1800f4230(uVar2);
    uVar2 = FUN_180059db0(local_1c28,uVar2);
    uVar3 = FUN_1800ee820();
    uVar3 = FUN_1800adf40(uVar3);
    FUN_180059db0(local_16c8,uVar3);
    uVar3 = FUN_1800ee8a0();
    uVar3 = FUN_1800a5de0(uVar3);
    FUN_180059db0(local_16a8,uVar3);
    uVar3 = FUN_1800ee910();
    uVar3 = FUN_1800f4200(uVar3);
    FUN_180059db0(local_1688,uVar3);
    uVar3 = FUN_1800ee970();
    uVar3 = FUN_1800f41d0(uVar3);
    FUN_180059db0(local_1668,uVar3);
    local_28e8 = local_16c8;
    local_28e0 = local_1648;
    FUN_1800f4370(local_1488,&local_28e8);
    FUN_1800f2e80(local_508,uVar2,local_1488);
    uVar2 = FUN_1800ee9d0();
    uVar2 = FUN_1800f41a0(uVar2);
    uVar2 = FUN_180059db0(local_1c48,uVar2);
    uVar3 = FUN_1800eea60();
    uVar3 = FUN_1800f4170(uVar3);
    FUN_180059db0(local_1248,uVar3);
    uVar3 = FUN_1800eeae0();
    uVar3 = FUN_1800f4140(uVar3);
    FUN_180059db0(local_1228,uVar3);
    uVar3 = FUN_1800eeb40();
    uVar3 = FUN_1800f4110(uVar3);
    FUN_180059db0(local_1208,uVar3);
    uVar3 = FUN_1800eebc0();
    uVar3 = FUN_1800f40e0(uVar3);
    FUN_180059db0(local_11e8,uVar3);
    uVar3 = FUN_1800eec20();
    uVar3 = FUN_1800f40b0(uVar3);
    FUN_180059db0(local_11c8,uVar3);
    uVar3 = FUN_1800eeca0();
    uVar3 = FUN_1800f4080(uVar3);
    FUN_180059db0(local_11a8,uVar3);
    uVar3 = FUN_1800eed10();
    uVar3 = FUN_1800f4050(uVar3);
    FUN_180059db0(local_1188,uVar3);
    local_28e8 = local_1248;
    local_28e0 = local_1168;
    FUN_1800f4370(local_14c8,&local_28e8);
    FUN_1800f2e80(local_4a8,uVar2,local_14c8);
    uVar2 = FUN_1800eeda0();
    uVar2 = FUN_1800f4020(uVar2);
    uVar2 = FUN_180059db0(local_1c68,uVar2);
    uVar3 = FUN_1800eee20();
    uVar3 = FUN_1800f3ff0(uVar3);
    FUN_180059db0(local_1748,uVar3);
    uVar3 = FUN_1800eeea0();
    uVar3 = FUN_1800f3fc0(uVar3);
    FUN_180059db0(local_1728,uVar3);
    uVar3 = FUN_1800eef00();
    uVar3 = FUN_1800f3f90(uVar3);
    FUN_180059db0(local_1708,uVar3);
    uVar3 = FUN_1800eef70();
    uVar3 = FUN_1800f3f60(uVar3);
    FUN_180059db0(local_16e8,uVar3);
    local_28e8 = local_1748;
    local_28e0 = local_16c8;
    FUN_1800f4370(local_1508,&local_28e8);
    FUN_1800f2e80(local_448,uVar2,local_1508);
    uVar2 = FUN_1800ef000();
    uVar2 = FUN_1800f3f30(uVar2);
    uVar2 = FUN_180059db0(local_17e8,uVar2);
    uVar3 = FUN_1800ef0c0();
    uVar3 = FUN_1800f3f00(uVar3);
    FUN_180059db0(local_2568,uVar3);
    local_28e8 = local_2568;
    local_28e0 = &local_2548;
    FUN_1800f4370(local_1548,&local_28e8);
    FUN_1800f2e80(local_3e8,uVar2,local_1548);
    uVar2 = FUN_1800ef130();
    uVar2 = FUN_1800f3ed0(uVar2);
    uVar2 = FUN_180059db0(local_1808,uVar2);
    uVar3 = FUN_1800ef1a0();
    uVar3 = FUN_1800f3ea0(uVar3);
    FUN_180059db0(local_1168,uVar3);
    uVar3 = FUN_1800ef230();
    uVar3 = FUN_1800f3e70(uVar3);
    FUN_180059db0(local_1148,uVar3);
    uVar3 = FUN_1800ef2b0();
    uVar3 = FUN_1800f3e40(uVar3);
    FUN_180059db0(local_1128,uVar3);
    uVar3 = FUN_1800ef320();
    uVar3 = FUN_1800f3e10(uVar3);
    FUN_180059db0(local_1108,uVar3);
    uVar3 = FUN_1800ef3b0();
    uVar3 = FUN_1800f3de0(uVar3);
    FUN_180059db0(local_10e8,uVar3);
    uVar3 = FUN_1800ef450();
    uVar3 = FUN_1800f3db0(uVar3);
    FUN_180059db0(local_10c8,uVar3);
    uVar3 = FUN_1800ef4f0();
    uVar3 = FUN_1800f3d80(uVar3);
    FUN_180059db0(local_10a8,uVar3);
    uVar3 = FUN_1800ef5b0();
    uVar3 = FUN_1800f3d50(uVar3);
    FUN_180059db0(local_1088,uVar3);
    uVar3 = FUN_1800ef640();
    uVar3 = FUN_1800f3d20(uVar3);
    FUN_180059db0(local_1068,uVar3);
    uVar3 = FUN_1800ef700();
    uVar3 = FUN_1800f3cf0(uVar3);
    FUN_180059db0(local_1048,uVar3);
    uVar3 = FUN_1800ef780();
    uVar3 = FUN_1800a8880(uVar3);
    FUN_180059db0(local_1028,uVar3);
    uVar3 = FUN_1800ef7f0();
    uVar3 = FUN_1800f3cc0(uVar3);
    FUN_180059db0(local_1008,uVar3);
    uVar3 = FUN_1800ef860();
    uVar3 = FUN_1800f3c90(uVar3);
    FUN_180059db0(local_fe8,uVar3);
    uVar3 = FUN_1800ef8e0();
    uVar3 = FUN_1800f3c60(uVar3);
    FUN_180059db0(local_fc8,uVar3);
    uVar3 = FUN_1800ef980();
    uVar3 = FUN_1800f3c30(uVar3);
    FUN_180059db0(local_fa8,uVar3);
    uVar3 = FUN_1800efa30();
    uVar3 = FUN_1800f3c00(uVar3);
    FUN_180059db0(local_f88,uVar3);
    uVar3 = FUN_1800efad0();
    uVar3 = FUN_1800f3bd0(uVar3);
    FUN_180059db0(local_f68,uVar3);
    uVar3 = FUN_1800efb90();
    uVar3 = FUN_1800f3ba0(uVar3);
    FUN_180059db0(local_f48,uVar3);
    uVar3 = FUN_1800efc30();
    uVar3 = FUN_1800f3b70(uVar3);
    FUN_180059db0(local_f28,uVar3);
    uVar3 = FUN_1800efcb0();
    uVar3 = FUN_1800f3b40(uVar3);
    FUN_180059db0(local_f08,uVar3);
    uVar3 = FUN_1800efd70();
    uVar3 = FUN_1800f3b10(uVar3);
    FUN_180059db0(local_ee8,uVar3);
    uVar3 = FUN_1800efe20();
    uVar3 = FUN_1800e23a0(uVar3);
    FUN_180059db0(local_ec8,uVar3);
    uVar3 = FUN_1800efed0();
    uVar3 = FUN_1800f3ae0(uVar3);
    FUN_180059db0(local_ea8,uVar3);
    uVar3 = FUN_1800eff70();
    uVar3 = FUN_1800f3ab0(uVar3);
    FUN_180059db0(local_e88,uVar3);
    uVar3 = FUN_1800f0020();
    uVar3 = FUN_1800f3a80(uVar3);
    FUN_180059db0(local_e68,uVar3);
    uVar3 = FUN_1800f0100();
    uVar3 = FUN_1800f3a50(uVar3);
    FUN_180059db0(local_e48,uVar3);
    uVar3 = FUN_1800f0180();
    uVar3 = FUN_1800f3a20(uVar3);
    FUN_180059db0(local_e28,uVar3);
    uVar3 = FUN_1800f0230();
    uVar3 = FUN_1800f39f0(uVar3);
    FUN_180059db0(local_e08,uVar3);
    local_28e8 = local_1168;
    local_28e0 = local_de8;
    FUN_1800f4370(local_1588,&local_28e8);
    FUN_1800f2e80(local_388,uVar2,local_1588);
    uVar2 = FUN_1800f02a0();
    uVar2 = FUN_1800f39c0(uVar2);
    uVar2 = FUN_180059db0(local_1828,uVar2);
    uVar3 = FUN_1800f0310();
    uVar3 = FUN_1800f3990(uVar3);
    FUN_180059db0(local_17c8,uVar3);
    uVar3 = FUN_1800f03c0();
    uVar3 = FUN_1800f3960(uVar3);
    FUN_180059db0(local_17a8,uVar3);
    uVar3 = FUN_1800f0460();
    uVar3 = FUN_1800f3930(uVar3);
    FUN_180059db0(local_1788,uVar3);
    uVar3 = FUN_1800f0500();
    uVar3 = FUN_1800f3900(uVar3);
    FUN_180059db0(local_1768,uVar3);
    local_28e8 = local_17c8;
    local_28e0 = local_1748;
    FUN_1800f4370(local_15c8,&local_28e8);
    FUN_1800f2e80(local_328,uVar2,local_15c8);
    uVar2 = FUN_1800f05c0();
    uVar2 = FUN_1800f38d0(uVar2);
    uVar2 = FUN_180059db0(local_1848,uVar2);
    uVar3 = FUN_1800f0650();
    uVar3 = FUN_1800677a0(uVar3);
    FUN_180059db0(local_de8,uVar3);
    uVar3 = FUN_1800f06f0();
    uVar3 = FUN_1800f38a0(uVar3);
    FUN_180059db0(local_dc8,uVar3);
    uVar3 = FUN_1800f0790();
    uVar3 = FUN_1800f3870(uVar3);
    FUN_180059db0(local_da8,uVar3);
    uVar3 = FUN_1800f0830();
    uVar3 = FUN_1800f3840(uVar3);
    FUN_180059db0(local_d88,uVar3);
    uVar3 = FUN_1800f08d0();
    uVar3 = FUN_1800c06b0(uVar3);
    FUN_180059db0(local_d68,uVar3);
    uVar3 = FUN_1800f0990();
    uVar3 = FUN_1800f3810(uVar3);
    FUN_180059db0(local_d48,uVar3);
    uVar3 = FUN_1800f0a20();
    uVar3 = FUN_1800f37e0(uVar3);
    FUN_180059db0(local_d28,uVar3);
    uVar3 = FUN_1800f0ac0();
    uVar3 = FUN_1800f37b0(uVar3);
    FUN_180059db0(local_d08,uVar3);
    uVar3 = FUN_1800f0b70();
    uVar3 = FUN_1800f3780(uVar3);
    FUN_180059db0(local_ce8,uVar3);
    uVar3 = FUN_1800f0c00();
    uVar3 = FUN_1800f3750(uVar3);
    FUN_180059db0(local_cc8,uVar3);
    uVar3 = FUN_1800f0c90();
    uVar3 = FUN_1800f3720(uVar3);
    FUN_180059db0(local_ca8,uVar3);
    uVar3 = FUN_1800f0d20();
    uVar3 = FUN_1800f36f0(uVar3);
    FUN_180059db0(local_c88,uVar3);
    uVar3 = FUN_1800f0dc0();
    uVar3 = FUN_180067740(uVar3);
    FUN_180059db0(local_c68,uVar3);
    uVar3 = FUN_1800f0e50();
    uVar3 = FUN_1800f36c0(uVar3);
    FUN_180059db0(local_c48,uVar3);
    uVar3 = FUN_1800f0ef0();
    uVar3 = FUN_1800f3690(uVar3);
    FUN_180059db0(local_c28,uVar3);
    uVar3 = FUN_1800f0f90();
    uVar3 = FUN_1800f3660(uVar3);
    FUN_180059db0(local_c08,uVar3);
    uVar3 = FUN_1800f1030();
    uVar3 = FUN_1800f3630(uVar3);
    FUN_180059db0(local_be8,uVar3);
    uVar3 = FUN_1800f10b0();
    uVar3 = FUN_1800f3600(uVar3);
    FUN_180059db0(local_bc8,uVar3);
    uVar3 = FUN_1800f1140();
    uVar3 = FUN_1800f35d0(uVar3);
    FUN_180059db0(local_ba8,uVar3);
    uVar3 = FUN_1800f11e0();
    uVar3 = FUN_1800f35a0(uVar3);
    FUN_180059db0(local_b88,uVar3);
    uVar3 = FUN_1800f12a0();
    uVar3 = FUN_1800f3570(uVar3);
    FUN_180059db0(local_b68,uVar3);
    uVar3 = FUN_1800f1380();
    uVar3 = FUN_1800f3540(uVar3);
    FUN_180059db0(local_b48,uVar3);
    uVar3 = FUN_1800f1430();
    uVar3 = FUN_1800f3510(uVar3);
    FUN_180059db0(local_b28,uVar3);
    uVar3 = FUN_1800f14e0();
    uVar3 = FUN_1800f34e0(uVar3);
    FUN_180059db0(local_b08,uVar3);
    uVar3 = FUN_1800f1590();
    uVar3 = FUN_1800f34b0(uVar3);
    FUN_180059db0(local_ae8,uVar3);
    uVar3 = FUN_1800f1640();
    uVar3 = FUN_1800f3480(uVar3);
    FUN_180059db0(local_ac8,uVar3);
    uVar3 = FUN_1800f16f0();
    uVar3 = FUN_1800f3450(uVar3);
    FUN_180059db0(local_aa8,uVar3);
    uVar3 = FUN_1800f17a0();
    uVar3 = FUN_1800f3420(uVar3);
    FUN_180059db0(local_a88,uVar3);
    uVar3 = FUN_1800f1830();
    uVar3 = FUN_1800f33f0(uVar3);
    FUN_180059db0(local_a68,uVar3);
    uVar3 = FUN_1800f18d0();
    uVar3 = FUN_1800f33c0(uVar3);
    FUN_180059db0(local_a48,uVar3);
    uVar3 = FUN_1800f1970();
    uVar3 = FUN_1800f3390(uVar3);
    FUN_180059db0(local_a28,uVar3);
    uVar3 = FUN_1800f1a20();
    uVar3 = FUN_1800f3360(uVar3);
    FUN_180059db0(local_a08,uVar3);
    local_28e8 = local_de8;
    local_28e0 = local_9e8;
    FUN_1800f4370(local_1348,&local_28e8);
    FUN_1800f2e80(local_2c8,uVar2,local_1348);
    uVar2 = FUN_1800f1ad0();
    uVar2 = FUN_1800f3330(uVar2);
    uVar2 = FUN_180059db0(local_1868,uVar2);
    uVar3 = FUN_1800f1b40();
    uVar3 = FUN_1800f3300(uVar3);
    FUN_180059db0(local_2588,uVar3);
    local_28e8 = local_2588;
    local_28e0 = local_2568;
    FUN_1800f4370(local_1288,&local_28e8);
    FUN_1800f2e80(local_268,uVar2,local_1288);
    uVar2 = FUN_1800f1be0();
    uVar2 = FUN_1800f32d0(uVar2);
    uVar2 = FUN_180059db0(local_1888,uVar2);
    uVar3 = FUN_1800f1c60();
    uVar3 = FUN_1800f32a0(uVar3);
    FUN_180059db0(local_25a8,uVar3);
    local_28e8 = local_25a8;
    local_28e0 = local_2588;
    FUN_1800f4370(local_12c8,&local_28e8);
    FUN_1800f2e80(local_208,uVar2,local_12c8);
    uVar2 = FUN_1800f1cc0();
    uVar2 = FUN_1800f3270(uVar2);
    uVar2 = FUN_180059db0(local_18a8,uVar2);
    uVar3 = FUN_1800f1d60();
    uVar3 = FUN_1800f3240(uVar3);
    FUN_180059db0(local_1ca8,uVar3);
    uVar3 = FUN_1800f1e00();
    uVar3 = FUN_1800f3210(uVar3);
    FUN_180059db0(local_1c88,uVar3);
    local_28e8 = local_1ca8;
    local_28e0 = (undefined8 *)local_1c68;
    FUN_1800f4370(local_1308,&local_28e8);
    FUN_1800f2e80(local_1a8,uVar2,local_1308);
    uVar2 = FUN_1800f1ed0();
    uVar2 = FUN_1800f31e0(uVar2);
    uVar2 = FUN_180059db0(local_1bc8,uVar2);
    uVar3 = FUN_1800f1f50();
    uVar3 = FUN_1800f31b0(uVar3);
    FUN_180059db0(local_25c8,uVar3);
    local_28e8 = local_25c8;
    local_28e0 = local_25a8;
    FUN_1800f4370(local_1388,&local_28e8);
    FUN_1800f2e80(local_148,uVar2,local_1388);
    uVar2 = FUN_1800f1ff0();
    uVar2 = FUN_1800f3180(uVar2);
    uVar2 = FUN_180059db0(local_1be8,uVar2);
    uVar3 = FUN_1800f2090();
    uVar3 = FUN_1800f3150(uVar3);
    FUN_180059db0(local_1648,uVar3);
    uVar3 = FUN_1800f2140();
    uVar3 = FUN_1800f3120(uVar3);
    FUN_180059db0(local_1628,uVar3);
    uVar3 = FUN_1800f21e0();
    uVar3 = FUN_1800f30f0(uVar3);
    FUN_180059db0(local_1608,uVar3);
    uVar3 = FUN_1800f2240();
    uVar3 = FUN_1800f30c0(uVar3);
    FUN_180059db0(local_15e8,uVar3);
    local_28e8 = local_1648;
    local_28e0 = (undefined8 *)local_15c8;
    FUN_1800f4370(local_13c8,&local_28e8);
    FUN_1800f2e80(local_e8,uVar2,local_13c8);
    uVar2 = FUN_1800f22e0();
    uVar2 = FUN_1800f3090(uVar2);
    uVar2 = FUN_180059db0(local_1c08,uVar2);
    uVar3 = FUN_1800f2380();
    uVar3 = FUN_1800f3060(uVar3);
    FUN_180059db0(local_25e8,uVar3);
    local_28e8 = local_25e8;
    local_28e0 = local_25c8;
    FUN_1800f4370(local_1408,&local_28e8);
    uVar2 = FUN_1800f2e80(local_88,uVar2,local_1408);
    local_28e8 = local_9e8;
    local_28e0 = (undefined8 *)(local_88 + 0x60);
    FUN_1800f4290(uVar2,&local_28e8);
    _eh_vector_destructor_iterator_(local_9e8,0x60,0x1a,FUN_1800f2420);
    FUN_1800f2400(local_1408);
    _eh_vector_destructor_iterator_(local_25e8,0x20,1,thunk_FUN_18005a4a0);
    FUN_18005a4a0(local_1c08);
    FUN_1800f2400(local_13c8);
    _eh_vector_destructor_iterator_(local_1648,0x20,4,thunk_FUN_18005a4a0);
    FUN_18005a4a0(local_1be8);
    FUN_1800f2400(local_1388);
    _eh_vector_destructor_iterator_(local_25c8,0x20,1,thunk_FUN_18005a4a0);
    FUN_18005a4a0(local_1bc8);
    FUN_1800f2400(local_1308);
    _eh_vector_destructor_iterator_(local_1ca8,0x20,2,thunk_FUN_18005a4a0);
    FUN_18005a4a0(local_18a8);
    FUN_1800f2400(local_12c8);
    _eh_vector_destructor_iterator_(local_25a8,0x20,1,thunk_FUN_18005a4a0);
    FUN_18005a4a0(local_1888);
    FUN_1800f2400(local_1288);
    _eh_vector_destructor_iterator_(local_2588,0x20,1,thunk_FUN_18005a4a0);
    FUN_18005a4a0(local_1868);
    FUN_1800f2400(local_1348);
    _eh_vector_destructor_iterator_(local_de8,0x20,0x20,thunk_FUN_18005a4a0);
    FUN_18005a4a0(local_1848);
    FUN_1800f2400(local_15c8);
    _eh_vector_destructor_iterator_(local_17c8,0x20,4,thunk_FUN_18005a4a0);
    FUN_18005a4a0(local_1828);
    FUN_1800f2400(local_1588);
    _eh_vector_destructor_iterator_(local_1168,0x20,0x1c,thunk_FUN_18005a4a0);
    FUN_18005a4a0(local_1808);
    FUN_1800f2400(local_1548);
    _eh_vector_destructor_iterator_(local_2568,0x20,1,thunk_FUN_18005a4a0);
    FUN_18005a4a0(local_17e8);
    FUN_1800f2400(local_1508);
    _eh_vector_destructor_iterator_(local_1748,0x20,4,thunk_FUN_18005a4a0);
    FUN_18005a4a0(local_1c68);
    FUN_1800f2400(local_14c8);
    _eh_vector_destructor_iterator_(local_1248,0x20,7,thunk_FUN_18005a4a0);
    FUN_18005a4a0(local_1c48);
    FUN_1800f2400(local_1488);
    _eh_vector_destructor_iterator_(local_16c8,0x20,4,thunk_FUN_18005a4a0);
    FUN_18005a4a0(local_1c28);
    FUN_1800f2400(local_1448);
    _eh_vector_destructor_iterator_(&local_22a8,0x20,0xb,thunk_FUN_18005a4a0);
    FUN_18005a4a0(&local_2890);
    FUN_1800f2400(local_1ba8);
    _eh_vector_destructor_iterator_(&local_2548,0x20,4,thunk_FUN_18005a4a0);
    FUN_18005a4a0(&local_2870);
    FUN_1800f2400(local_1b68);
    _eh_vector_destructor_iterator_(&local_2850,0x20,1,thunk_FUN_18005a4a0);
    FUN_18005a4a0(&local_2830);
    FUN_1800f2400(local_1b28);
    _eh_vector_destructor_iterator_(&local_24c8,0x20,4,thunk_FUN_18005a4a0);
    FUN_18005a4a0(&local_2810);
    FUN_1800f2400(local_1ae8);
    _eh_vector_destructor_iterator_(&local_2668,0x20,2,thunk_FUN_18005a4a0);
    FUN_18005a4a0(&local_27f0);
    FUN_1800f2400(local_1aa8);
    _eh_vector_destructor_iterator_(&local_27d0,0x20,1,thunk_FUN_18005a4a0);
    FUN_18005a4a0(&local_27b0);
    FUN_1800f2400(local_1a68);
    _eh_vector_destructor_iterator_(&local_2628,0x20,2,thunk_FUN_18005a4a0);
    FUN_18005a4a0(&local_2790);
    FUN_1800f2400(local_1a28);
    _eh_vector_destructor_iterator_(&local_2770,0x20,1,thunk_FUN_18005a4a0);
    FUN_18005a4a0(&local_2750);
    FUN_1800f2400(local_19e8);
    _eh_vector_destructor_iterator_(&local_23c8,0x20,9,thunk_FUN_18005a4a0);
    FUN_18005a4a0(&local_2730);
    FUN_1800f2400(local_19a8);
    _eh_vector_destructor_iterator_(&local_2148,0x20,0xc,thunk_FUN_18005a4a0);
    FUN_18005a4a0(&local_2710);
    FUN_1800f2400(local_1968);
    _eh_vector_destructor_iterator_(&local_26f0,0x20,1,thunk_FUN_18005a4a0);
    FUN_18005a4a0(&local_26d0);
    FUN_1800f2400(local_1928);
    _eh_vector_destructor_iterator_(&local_1fc8,0x20,0x19,thunk_FUN_18005a4a0);
    FUN_18005a4a0(&local_26b0);
    FUN_1800f2400(local_18e8);
    _eh_vector_destructor_iterator_(&local_2448,0x20,4,thunk_FUN_18005a4a0);
    FUN_18005a4a0(&local_2690);
    atexit(FUN_1806a0c30);
    _Init_thread_footer(&DAT_180981a24);
  }
  return &DAT_180981a30;
}



/* ==================================================================== */
/* 1801a5970 / FUN_1801a5970 */
/* RETRY FAILED: Exception while decompiling 1801a5970: Decompiler process died
 */

/* Retry summary: recovered=2, attempted=8 */
