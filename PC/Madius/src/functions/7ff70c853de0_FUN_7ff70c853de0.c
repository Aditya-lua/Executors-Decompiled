/* 7ff70c853de0 FUN_7ff70c853de0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

float * FUN_7ff70c853de0(float *param_1)

{
  undefined8 uVar1;
  code *pcVar2;
  float *pfVar3;
  float fVar4;
  float fVar5;
  float fVar6;
  float fVar7;
  float fVar8;
  float fVar9;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  uVar1 = *(undefined8 *)(**(longlong **)(_DAT_7ff70cc1a3c0 + 0x1f88) + 8);
  fVar4 = (float)uVar1;
  fVar5 = (float)((ulonglong)uVar1 >> 0x20);
  uVar1 = *(undefined8 *)(**(longlong **)(_DAT_7ff70cc1a3c0 + 0x1f88) + 0x10);
  fVar6 = (float)uVar1 + fVar4;
  fVar7 = (float)((ulonglong)uVar1 >> 0x20) + fVar5;
  fVar8 = (float)*(undefined8 *)(_DAT_7ff70cc1a3c0 + 0xd3c);
  fVar9 = (float)((ulonglong)*(undefined8 *)(_DAT_7ff70cc1a3c0 + 0xd3c) >> 0x20);
  fVar8 = (float)(((uint)fVar8 ^ _DAT_7ff70cb1ba60) & -(uint)(fVar8 + fVar8 < fVar6 - fVar4));
  fVar9 = (float)(((uint)fVar9 ^ _UNK_7ff70cb1ba64) & -(uint)(fVar9 + fVar9 < fVar7 - fVar5));
  *param_1 = fVar4 - fVar8;
  param_1[1] = fVar5 - fVar9;
  param_1[2] = fVar8 + fVar6;
  param_1[3] = fVar9 + fVar7;
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return param_1;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar2 = (code *)swi(3);
  pfVar3 = (float *)(*pcVar2)();
  return pfVar3;
}


