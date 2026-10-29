/* 7ff70c7ff3d0 FUN_7ff70c7ff3d0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c7ff3d0(uint *param_1,byte *param_2,byte *param_3)

{
  code *pcVar1;
  ulonglong uVar2;
  ulonglong uVar3;
  byte bVar4;
  undefined4 uVar5;
  uint uVar6;
  byte bVar7;
  byte *pbVar8;
  uint uVar9;
  longlong lVar10;
  byte bVar11;
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auStack_58 [32];
  ulonglong uStack_38;
  undefined1 auVar14 [15];
  
  uStack_38 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_58;
  bVar4 = *param_2;
  lVar10 = (longlong)(char)(&UNK_7ff70cb1c8a0)[(uint)(bVar4 >> 3)];
  uVar3 = lVar10 + (ulonglong)((0x80ff0000U >> (uint)(bVar4 >> 3) & 1) != 0);
  pbVar8 = param_2 + uVar3;
  if (param_3 != (byte *)0x0) {
    pbVar8 = param_3;
  }
  uVar9 = 0;
  if (pbVar8 <= param_2) {
    bVar4 = 0;
  }
  if (param_2 + 1 < pbVar8) {
    uVar9 = (uint)param_2[1];
  }
  if (param_2 + 2 < pbVar8) {
    bVar11 = param_2[2];
    if (param_2 + 3 < pbVar8) goto LAB_7ff70c7ff45b;
LAB_7ff70c7ff44b:
    bVar7 = 0;
  }
  else {
    bVar11 = 0;
    if (pbVar8 <= param_2 + 3) goto LAB_7ff70c7ff44b;
LAB_7ff70c7ff45b:
    bVar7 = param_2[3];
  }
  uVar6 = (bVar7 & 0x3f |
          (bVar11 & 0x3f) << 6 |
          (uVar9 & 0x3f) << 0xc | (*(uint *)(&UNK_7ff70cb1c8c0 + lVar10 * 4) & (uint)bVar4) << 0x12)
          >> ((&UNK_7ff70cb1c900)[lVar10 * 4] & 0x1f);
  *param_1 = uVar6;
  if ((((uVar9 >> 2 & 0xfffffff0) + (uint)(bVar11 >> 6) * 4 | (uint)(bVar7 >> 6) |
        (uint)(uVar6 < *(uint *)(&UNK_7ff70cb1c8e0 + lVar10 * 4)) << 6 | (uint)(0xffff < uVar6) << 8
       | (uint)((uVar6 & 0x7ffff800) == 0xd800) << 7) ^ 0x2a) >>
      ((&UNK_7ff70cb1c920)[lVar10 * 4] & 0x1f) == 0) {
    if (_DAT_7ff70cbebd80 != (uStack_38 ^ (ulonglong)auStack_58)) goto LAB_7ff70c7ff596;
  }
  else {
    auVar14 = SUB1615((undefined1  [16])0x0,1);
    auVar13[0] = -((char)uVar9 == '\0');
    auVar13[1] = -(bVar4 == 0);
    auVar13[2] = -(bVar11 == 0);
    auVar13[3] = -(bVar7 == 0);
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
    uVar5 = movmskps((uint)(byte)(&UNK_7ff70cb1c920)[lVar10 * 4],auVar12);
    uVar2 = (ulonglong)(uint)POPCOUNT(uVar5);
    if ((int)uVar3 < POPCOUNT(uVar5)) {
      uVar2 = uVar3 & 0xffffffff;
    }
    uVar3 = uVar2;
    *param_1 = 0xfffd;
    if (_DAT_7ff70cbebd80 != (uStack_38 ^ (ulonglong)auStack_58)) {
LAB_7ff70c7ff596:
      FUN_7ff70caa97e0(uStack_38 ^ (ulonglong)auStack_58);
      pcVar1 = (code *)swi(3);
      uVar3 = (*pcVar1)();
      return uVar3;
    }
  }
  return uVar3;
}


