/* 7ff70c87dd50 FUN_7ff70c87dd50 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c87dd50(undefined8 param_1)

{
  float fVar1;
  float fVar2;
  longlong lVar3;
  code *pcVar4;
  longlong lVar5;
  char cVar6;
  undefined4 uVar7;
  undefined8 uVar8;
  float fVar9;
  float fVar10;
  float fVar11;
  undefined1 auVar12 [16];
  float fVar13;
  float fVar14;
  float fVar15;
  undefined1 auStack_148 [32];
  undefined8 uStack_128;
  undefined8 uStack_120;
  float *pfStack_118;
  float fStack_108;
  float fStack_104;
  float fStack_100;
  float fStack_fc;
  float fStack_f8;
  float fStack_f4;
  float fStack_f0;
  float fStack_ec;
  float fStack_e8;
  float fStack_e4;
  float fStack_e0;
  float fStack_dc;
  float fStack_d8;
  float fStack_d4;
  ulonglong uStack_d0;
  
  lVar3 = _DAT_7ff70cc1a3c0;
  uStack_d0 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_148;
  *(undefined1 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0xce) = 1;
  if (*(char *)(*(longlong *)(lVar3 + 0x1440) + 0xd1) == '\0') {
    uVar8 = FUN_7ff70c80c630(param_1,0);
    lVar5 = _DAT_7ff70cc1a3c0;
    lVar3 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
    uStack_128 = CONCAT44(uStack_128._4_4_,0xbf800000);
    FUN_7ff70c80cf40(&fStack_d8,param_1,uVar8,0);
    fVar2 = *(float *)(lVar3 + 0x118);
    fVar10 = *(float *)(lVar3 + 0x11c);
    fVar1 = *(float *)(lVar5 + 0xd20);
    fVar14 = *(float *)(lVar5 + 0xd2c);
    fVar11 = *(float *)(lVar5 + 0xd30) + *(float *)(lVar5 + 0xd30) + fStack_d4;
    auVar12 = blendvps(ZEXT416((uint)fVar1),ZEXT416((uint)fVar11),ZEXT416(-(uint)(fVar1 <= fVar11)))
    ;
    fStack_e0 = fStack_d8 + 0.0 + fVar14 + fVar14;
    fStack_dc = auVar12._0_4_;
    fStack_e4 = fStack_dc + fVar10;
    fStack_e8 = *(float *)(lVar3 + 0x248);
    fVar13 = (float)(int)(((fStack_e4 - fVar10) - fStack_d4) * *(float *)(lVar5 + 0xd28) +
                         _DAT_7ff70cb1d650);
    fStack_f0 = fVar2;
    fStack_ec = fVar10;
    FUN_7ff70c8375f0(&fStack_e0,fVar13);
    cVar6 = FUN_7ff70c837800(&fStack_f0,0,0,0);
    fVar11 = fStack_e8;
    if (cVar6 != '\0') {
      fVar15 = (float)(int)((fStack_ec + fStack_e4) * _DAT_7ff70cb1ba70 + _DAT_7ff70cb1d650);
      fVar9 = (fStack_e8 - fVar2) - (fVar14 + fVar14);
      fStack_f4 = fVar10 + fVar13;
      fVar10 = ((float)(~-(uint)(fVar9 <= 0.0) & (uint)fVar9) - fStack_d8) *
               *(float *)(lVar5 + 0xd24);
      fVar14 = (float)(~-(uint)(fVar10 <= 0.0) & (uint)fVar10) + fVar14 + fVar2;
      *(float *)(lVar3 + 0x120) = fStack_d8 + fVar14;
      fStack_f8 = fVar14;
      uVar7 = FUN_7ff70c80a070(0x1b,_DAT_7ff70cb1ba2c);
      if (fStack_d8 <= 0.0) {
        if (*(char *)(lVar5 + 0x2720) == '\x01') {
          FUN_7ff70c856f00(&UNK_7ff70cb8e029);
        }
        if (0.0 < fVar1) {
          fStack_100 = fVar11;
          uStack_128 = CONCAT44(uStack_128._4_4_,fVar1);
          fStack_108 = fVar2;
          fStack_104 = fVar15;
          fStack_fc = fVar15;
          FUN_7ff70c7bd6c0(*(undefined8 *)(lVar3 + 0x2c8),&fStack_108,&fStack_100,uVar7);
        }
      }
      else {
        fVar10 = *(float *)(lVar5 + 0xc9c);
        if ((0.0 < fVar1) && (fVar13 = fVar14 - fVar10, fVar2 < fVar13)) {
          uStack_128 = CONCAT44(uStack_128._4_4_,fVar1);
          fStack_108 = fVar2;
          fStack_104 = fVar15;
          fStack_100 = fVar13;
          fStack_fc = fVar15;
          FUN_7ff70c7bd6c0(*(undefined8 *)(lVar3 + 0x2c8),&fStack_108,&fStack_100,uVar7);
        }
        if ((0.0 < fVar1) && (fVar10 = fVar14 + fStack_d8 + fVar10, fVar10 < fVar11)) {
          fStack_100 = fVar11;
          uStack_128 = CONCAT44(uStack_128._4_4_,fVar1);
          fStack_108 = fVar10;
          fStack_104 = fVar15;
          fStack_fc = fVar15;
          FUN_7ff70c7bd6c0(*(undefined8 *)(lVar3 + 0x2c8),&fStack_108,&fStack_100,uVar7);
        }
        if (*(char *)(lVar5 + 0x2720) == '\x01') {
          FUN_7ff70c8574b0(&UNK_7ff70cb8e029,0);
        }
        fStack_fc = fStack_e4 + *(float *)(lVar5 + 0xca0);
        fStack_100 = fStack_e8;
        uStack_128 = param_1;
        uStack_120 = uVar8;
        pfStack_118 = &fStack_d8;
        FUN_7ff70c80d450(*(undefined8 *)(lVar3 + 0x2c8),&fStack_f8,&fStack_100);
      }
    }
  }
  if (_DAT_7ff70cbebd80 == (uStack_d0 ^ (ulonglong)auStack_148)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_d0 ^ (ulonglong)auStack_148);
  pcVar4 = (code *)swi(3);
  (*pcVar4)();
  return;
}


