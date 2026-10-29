/* 7ff70c877ed0 FUN_7ff70c877ed0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c877ed0(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  longlong lVar1;
  code *pcVar2;
  longlong lVar3;
  char cVar4;
  undefined4 uVar5;
  float fVar6;
  undefined1 auVar7 [16];
  float fVar8;
  undefined8 uStackX_10;
  undefined8 uStackX_18;
  undefined8 uStackX_20;
  undefined1 auStack_a8 [32];
  undefined4 uStack_88;
  undefined8 *puStack_78;
  float fStack_70;
  float fStack_6c;
  undefined8 uStack_68;
  float fStack_60;
  float fStack_5c;
  float fStack_58;
  float fStack_54;
  undefined8 uStack_50;
  undefined8 uStack_48;
  ulonglong uStack_40;
  
  lVar3 = _DAT_7ff70cc1a3c0;
  uStack_40 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_a8;
  puStack_78 = &uStackX_10;
  *(undefined1 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0xce) = 1;
  lVar1 = *(longlong *)(lVar3 + 0x1440);
  uStackX_10 = param_2;
  uStackX_18 = param_3;
  uStackX_20 = param_4;
  if (*(char *)(lVar1 + 0xd1) == '\0') {
    FUN_7ff70c802cf0(&uStack_48,&uStack_50,param_1);
    uStack_88 = 0xbf800000;
    FUN_7ff70c80cf40(&fStack_58,uStack_48,uStack_50,0);
    fStack_60 = 0.0;
    if (0.0 < fStack_58) {
      fStack_60 = fStack_58 + *(float *)(lVar3 + 0xc8c) + *(float *)(lVar3 + 0xc8c);
    }
    fStack_60 = *(float *)(lVar3 + 0x1130) + fStack_60;
    fStack_5c = fStack_54;
    fVar6 = *(float *)(lVar1 + 0x118);
    fVar8 = *(float *)(lVar1 + 0x11c) + *(float *)(lVar1 + 0x150);
    FUN_7ff70c8375f0(&fStack_60);
    auVar7 = insertps(ZEXT416((uint)fVar6),ZEXT416((uint)fVar8),0x10);
    uStack_68 = CONCAT44(auVar7._4_4_ + fStack_5c,auVar7._0_4_ + fStack_60);
    fStack_70 = fVar6;
    fStack_6c = fVar8;
    cVar4 = FUN_7ff70c837800(&fStack_70,0,0,0);
    if (cVar4 != '\0') {
      uVar5 = FUN_7ff70c80a070(0);
      fVar6 = *(float *)(lVar3 + 0x1130) * _DAT_7ff70cb1ba70;
      FUN_7ff70c7fa970(*(undefined8 *)(lVar1 + 0x2c8),
                       CONCAT44(fVar6 + fStack_6c,*(float *)(lVar3 + 0xc8c) + fVar6 + fStack_70),
                       uVar5);
      FUN_7ff70c80c6b0(CONCAT44(fStack_6c + 0.0,
                                *(float *)(lVar3 + 0xc8c) + *(float *)(lVar3 + 0xc8c) +
                                *(float *)(lVar3 + 0x1130) + fStack_70),uStack_48,uStack_50,0);
    }
  }
  if (_DAT_7ff70cbebd80 == (uStack_40 ^ (ulonglong)auStack_a8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_40 ^ (ulonglong)auStack_a8);
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}


