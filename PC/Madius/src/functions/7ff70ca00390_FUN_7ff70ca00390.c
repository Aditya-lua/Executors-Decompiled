/* 7ff70ca00390 FUN_7ff70ca00390 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70ca00390(undefined8 param_1,undefined8 param_2,undefined4 param_3,int param_4)

{
  undefined8 uVar1;
  code *pcVar2;
  undefined1 auVar3 [16];
  char cVar4;
  uint uVar5;
  undefined8 uVar6;
  ulonglong uVar7;
  undefined8 uVar8;
  float fVar9;
  float fVar10;
  float fVar11;
  float fVar12;
  float fVar13;
  float fVar14;
  undefined1 auStack_b8 [32];
  undefined4 uStack_98;
  undefined4 uStack_90;
  float fStack_80;
  float fStack_7c;
  float fStack_78;
  float fStack_74;
  undefined8 uStack_70;
  undefined8 uStack_68;
  ulonglong uStack_60;
  
  uStack_60 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_b8;
  uStack_70 = 0x4208000042380000;
  uStack_68 = param_2;
  FUN_7ff70c84b370(&uStack_68);
  uVar5 = FUN_7ff70c879250(param_1,&uStack_70,0);
  cVar4 = FUN_7ff70c8183c0(0);
  if (cVar4 == '\0') {
    uVar8 = 0xffb4aaaa;
    uVar6 = FUN_7ff70c83dc60();
  }
  else {
    DAT_7ff70cc1b318 = 1;
    uVar6 = FUN_7ff70c83dc60();
    fStack_78 = (float)uStack_70 + (float)uStack_68;
    fStack_74 = (float)((ulonglong)uStack_70 >> 0x20) + (float)((ulonglong)uStack_68 >> 0x20);
    uStack_90 = 0;
    uStack_98 = 0;
    FUN_7ff70c7bd960(uVar6,&uStack_68,&fStack_78,param_3);
    cVar4 = FUN_7ff70c834b60();
    if (cVar4 != '\0') {
      uStack_90 = 0;
      uStack_98 = 0;
      FUN_7ff70c7bd960(uVar6,&uStack_68,&fStack_78,0x1effffff);
    }
    uVar8 = 0xffffffff;
  }
  fVar9 = (float)uStack_70 * _DAT_7ff70cb1ba80 + (float)uStack_68;
  fVar10 = (float)((ulonglong)uStack_70 >> 0x20) * _UNK_7ff70cb1ba84 +
           (float)((ulonglong)uStack_68 >> 0x20);
  fVar14 = _DAT_7ff70cb1c678 + fVar9;
  fStack_78 = fVar14;
  if (param_4 == 0) {
    fStack_80 = fVar9 + _DAT_7ff70cb74a40;
    fStack_7c = fVar10 + _UNK_7ff70cb74a44;
    fStack_74 = fVar10 + _DAT_7ff70cb1ba70;
  }
  else {
    fVar13 = fVar10 + _DAT_7ff70cb1c678;
    fVar9 = fVar9 + _DAT_7ff70cb74a30;
    fVar10 = fVar10 + _UNK_7ff70cb74a34;
    fVar11 = _UNK_7ff70cb1ba88 * 0.0 + 0.0 + _UNK_7ff70cb74a38;
    fVar12 = _UNK_7ff70cb1ba8c * 0.0 + 0.0 + _UNK_7ff70cb74a3c;
    uStack_98 = 0x3fa66666;
    fStack_80 = fVar9;
    fStack_7c = fVar10;
    fStack_74 = fVar13;
    FUN_7ff70c7bd6c0(uVar6,&fStack_80,&fStack_78,uVar8);
    auVar3._4_4_ = fVar10;
    auVar3._0_4_ = fVar9;
    auVar3._8_4_ = fVar11;
    auVar3._12_4_ = fVar12;
    uVar1 = extractps(auVar3,1);
    fStack_7c = (float)uVar1;
    fStack_78 = (float)((ulonglong)uVar1 >> 0x20);
    fStack_80 = fVar14;
    fStack_74 = fVar13;
  }
  uStack_98 = 0x3fa66666;
  FUN_7ff70c7bd6c0(uVar6,&fStack_80,&fStack_78,uVar8);
  if (_DAT_7ff70cbebd80 == (uStack_60 ^ (ulonglong)auStack_b8)) {
    return (ulonglong)uVar5;
  }
  FUN_7ff70caa97e0(uStack_60 ^ (ulonglong)auStack_b8);
  pcVar2 = (code *)swi(3);
  uVar7 = (*pcVar2)();
  return uVar7;
}


