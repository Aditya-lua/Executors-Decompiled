/* 7ff70c878fb0 FUN_7ff70c878fb0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c878fb0(undefined8 param_1)

{
  undefined4 uVar1;
  longlong lVar2;
  code *pcVar3;
  longlong lVar4;
  char cVar5;
  undefined4 uVar6;
  uint uVar7;
  undefined4 uVar8;
  ulonglong uVar9;
  byte bVar10;
  float fVar11;
  float fVar12;
  undefined1 auVar13 [16];
  undefined1 auStack_d8 [32];
  float *pfStack_b8;
  longlong lStack_b0;
  float *pfStack_a8;
  undefined8 uStack_98;
  undefined8 uStack_90;
  byte bStack_82;
  char cStack_81;
  float fStack_80;
  float fStack_7c;
  undefined8 uStack_78;
  undefined1 auStack_70 [8];
  float fStack_68;
  float fStack_64;
  ulonglong uStack_60;
  
  lVar4 = _DAT_7ff70cc1a3c0;
  uStack_60 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_d8;
  uVar1 = *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0xc90);
  *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0xc90) = 0;
  *(undefined1 *)(*(longlong *)(lVar4 + 0x1440) + 0xce) = 1;
  lVar2 = *(longlong *)(lVar4 + 0x1440);
  if (*(char *)(lVar2 + 0xd1) == '\0') {
    uVar9 = 0;
    uVar6 = FUN_7ff70c8165d0(lVar2,param_1,0);
    pfStack_b8 = (float *)CONCAT44(pfStack_b8._4_4_,0xbf800000);
    FUN_7ff70c80cf40(&fStack_68,param_1,0,1);
    fVar11 = *(float *)(lVar4 + 0xc90);
    auVar13 = blendvps(ZEXT416((uint)*(float *)(lVar2 + 0x11c)),
                       ZEXT416((uint)((*(float *)(lVar2 + 0x150) - fVar11) +
                                     *(float *)(lVar2 + 0x11c))),
                       ZEXT416(-(uint)(fVar11 < *(float *)(lVar2 + 0x150))));
    fVar12 = *(float *)(lVar2 + 0x118);
    FUN_7ff70c836c60(auStack_70,0,*(float *)(lVar4 + 0xc8c) + *(float *)(lVar4 + 0xc8c) + fStack_68,
                     fVar11 + fVar11 + fStack_64);
    fStack_7c = auVar13._0_4_;
    uStack_78 = CONCAT44(fStack_7c + auStack_70._4_4_,fVar12 + auStack_70._0_4_);
    fStack_80 = fVar12;
    FUN_7ff70c8375f0(auStack_70);
    cVar5 = FUN_7ff70c837800(&fStack_80,uVar6,0,0);
    if (cVar5 != '\0') {
      pfStack_b8._0_4_ = 0x8000;
      uVar7 = FUN_7ff70c8782e0(&fStack_80,uVar6,&cStack_81,&bStack_82);
      uVar9 = (ulonglong)uVar7;
      bVar10 = 0x15;
      if (cStack_81 != '\0') {
        bVar10 = bStack_82 | 0x16;
      }
      uVar8 = FUN_7ff70c80a070(bVar10);
      FUN_7ff70c80dff0(&fStack_80,uVar6,0);
      pfStack_b8 = (float *)CONCAT44(pfStack_b8._4_4_,*(undefined4 *)(lVar4 + 0xc94));
      FUN_7ff70c80db10(CONCAT44(fStack_7c,fStack_80),uStack_78,uVar8,1);
      if (*(char *)(lVar4 + 0x2720) == '\x01') {
        FUN_7ff70c8574b0(&UNK_7ff70cb89519,&UNK_7ff70cb894fc);
      }
      lStack_b0 = lVar4 + 0xd10;
      fVar11 = (float)*(undefined8 *)(lVar4 + 0xc8c);
      fVar12 = (float)((ulonglong)*(undefined8 *)(lVar4 + 0xc8c) >> 0x20);
      uStack_90 = CONCAT44((float)((ulonglong)uStack_78 >> 0x20) - fVar12,(float)uStack_78 - fVar11)
      ;
      uStack_98 = CONCAT44(fStack_7c + fVar12,fStack_80 + fVar11);
      pfStack_b8 = &fStack_68;
      pfStack_a8 = &fStack_80;
      FUN_7ff70c80d060(&uStack_98,&uStack_90,param_1,0);
    }
  }
  else {
    uVar9 = 0;
  }
  *(undefined4 *)(lVar4 + 0xc90) = uVar1;
  if (_DAT_7ff70cbebd80 == (uStack_60 ^ (ulonglong)auStack_d8)) {
    return uVar9;
  }
  FUN_7ff70caa97e0(uStack_60 ^ (ulonglong)auStack_d8);
  pcVar3 = (code *)swi(3);
  uVar9 = (*pcVar3)();
  return uVar9;
}


