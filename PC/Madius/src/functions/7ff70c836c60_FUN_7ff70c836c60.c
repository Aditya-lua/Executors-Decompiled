/* 7ff70c836c60 FUN_7ff70c836c60 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 * FUN_7ff70c836c60(undefined8 *param_1,ulonglong param_2)

{
  longlong lVar1;
  code *pcVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined8 *puVar5;
  longlong lVar6;
  int iVar7;
  int iVar8;
  float fVar9;
  float fVar10;
  undefined1 in_XMM2 [16];
  undefined1 auVar11 [16];
  undefined1 in_XMM3 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  float fVar14;
  float fVar15;
  undefined1 auStack_48 [40];
  ulonglong uStack_20;
  
  uStack_20 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_48;
  auVar12._8_8_ = 0;
  auVar12._0_8_ = param_2;
  fVar9 = (float)param_2;
  fVar10 = (float)(param_2 >> 0x20);
  iVar7 = -(uint)(fVar9 < 0.0);
  iVar8 = -(uint)(fVar10 < 0.0);
  auVar13._4_4_ = iVar8;
  auVar13._0_4_ = iVar7;
  auVar11._4_4_ = iVar7;
  auVar11._0_4_ = iVar7;
  auVar11._8_4_ = iVar8;
  auVar11._12_4_ = iVar8;
  iVar7 = movmskpd((int)uStack_20,auVar11);
  fVar14 = 0.0;
  fVar15 = 0.0;
  if (iVar7 != 0) {
    lVar1 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
    lVar6 = 0x248;
    if ((*(longlong *)(lVar1 + 0x1c8) == 0) && (*(longlong *)(_DAT_7ff70cc1a3c0 + 0x2278) == 0)) {
      lVar6 = 0x278;
    }
    fVar14 = (float)*(undefined8 *)(lVar1 + lVar6) - (float)*(undefined8 *)(lVar1 + 0x118);
    fVar15 = (float)((ulonglong)*(undefined8 *)(lVar1 + lVar6) >> 0x20) -
             (float)((ulonglong)*(undefined8 *)(lVar1 + 0x118) >> 0x20);
  }
  auVar11 = insertps(in_XMM2,in_XMM3,0x10);
  auVar3._4_4_ = -(uint)(fVar10 == 0.0);
  auVar3._0_4_ = -(uint)(fVar9 == 0.0);
  auVar3._8_4_ = 0xffffffff;
  auVar3._12_4_ = 0xffffffff;
  auVar12 = blendvps(auVar12,auVar11,auVar3);
  auVar4._4_4_ = fVar15 + fVar10;
  auVar4._0_4_ = fVar14 + fVar9;
  auVar4._8_8_ = 0;
  auVar11 = maxps(_DAT_7ff70cb1d8c0,auVar4);
  auVar13._8_8_ = 0;
  auVar13 = blendvps(auVar12,auVar11,auVar13);
  *param_1 = auVar13._0_8_;
  if (_DAT_7ff70cbebd80 == (uStack_20 ^ (ulonglong)auStack_48)) {
    return param_1;
  }
  FUN_7ff70caa97e0(uStack_20 ^ (ulonglong)auStack_48);
  pcVar2 = (code *)swi(3);
  puVar5 = (undefined8 *)(*pcVar2)();
  return puVar5;
}


