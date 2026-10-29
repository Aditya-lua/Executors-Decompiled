/* 7ff70c803f00 FUN_7ff70c803f00 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c803f00(byte *param_1,byte *param_2)

{
  code *pcVar1;
  ulonglong uVar2;
  byte bVar3;
  undefined4 uVar4;
  ulonglong uVar5;
  byte *pbVar6;
  uint uVar7;
  longlong lVar8;
  byte bVar9;
  byte bVar10;
  byte bVar11;
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auStack_58 [40];
  ulonglong uStack_30;
  undefined1 auVar14 [15];
  
  uStack_30 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_58;
  bVar9 = *param_1;
  lVar8 = (longlong)(char)(&UNK_7ff70cb1c8a0)[(uint)(bVar9 >> 3)];
  uVar2 = lVar8 + (ulonglong)((0x80ff0000U >> (uint)(bVar9 >> 3) & 1) != 0);
  pbVar6 = param_1 + uVar2;
  if (param_2 != (byte *)0x0) {
    pbVar6 = param_2;
  }
  bVar10 = 0;
  if (pbVar6 <= param_1) {
    bVar9 = 0;
  }
  if (param_1 + 1 < pbVar6) {
    bVar10 = param_1[1];
  }
  if (param_1 + 2 < pbVar6) {
    bVar11 = param_1[2];
  }
  else {
    bVar11 = 0;
  }
  if (param_1 + 3 < pbVar6) {
    bVar3 = param_1[3];
  }
  else {
    bVar3 = 0;
  }
  uVar7 = (bVar3 & 0x3f |
          (bVar11 & 0x3f) << 6 |
          (bVar10 & 0x3f) << 0xc | (*(uint *)(&UNK_7ff70cb1c8c0 + lVar8 * 4) & (uint)bVar9) << 0x12)
          >> ((&UNK_7ff70cb1c900)[lVar8 * 4] & 0x1f);
  uVar5 = uVar2;
  if ((((bVar10 >> 2 & 0xfffffff0) + (uint)(bVar11 >> 6) * 4 | (uint)(bVar3 >> 6) |
        (uint)(uVar7 < *(uint *)(&UNK_7ff70cb1c8e0 + lVar8 * 4)) << 6 | (uint)(0xffff < uVar7) << 8
       | (uint)((uVar7 & 0x7ffff800) == 0xd800) << 7) ^ 0x2a) >>
      ((&UNK_7ff70cb1c920)[lVar8 * 4] & 0x1f) != 0) {
    auVar14 = SUB1615((undefined1  [16])0x0,1);
    auVar13[0] = -(bVar10 == 0);
    auVar13[1] = -(bVar9 == 0);
    auVar13[2] = -(bVar11 == 0);
    auVar13[3] = -(bVar3 == 0);
    auVar13[4] = 0xff;
    auVar13[5] = 0xff;
    auVar13[6] = 0xff;
    auVar13[7] = 0xff;
    auVar13[8] = 0xff;
    auVar13[9] = -(auVar14[8] == '\0');
    auVar13[10] = -(auVar14[9] == '\0');
    auVar13[0xb] = -(auVar14[10] == '\0');
    auVar13[0xc] = -(auVar14[0xb] == '\0');
    auVar13[0xd] = -(auVar14[0xc] == '\0');
    auVar13[0xe] = -(auVar14[0xd] == '\0');
    auVar13[0xf] = -(auVar14[0xe] == '\0');
    auVar12._8_4_ = 0xffffffff;
    auVar12._0_8_ = 0xffffffffffffffff;
    auVar12._12_4_ = 0xffffffff;
    auVar12 = pmovsxbd(auVar12 ^ auVar13,auVar12 ^ auVar13);
    uVar4 = movmskps((uint)(byte)(&UNK_7ff70cb1c920)[lVar8 * 4],auVar12);
    uVar5 = (ulonglong)(uint)POPCOUNT(uVar4);
    if ((int)uVar2 < POPCOUNT(uVar4)) {
      uVar5 = uVar2 & 0xffffffff;
    }
  }
  if (_DAT_7ff70cbebd80 == (uStack_30 ^ (ulonglong)auStack_58)) {
    return uVar5;
  }
  FUN_7ff70caa97e0(uStack_30 ^ (ulonglong)auStack_58);
  pcVar1 = (code *)swi(3);
  uVar2 = (*pcVar1)();
  return uVar2;
}


