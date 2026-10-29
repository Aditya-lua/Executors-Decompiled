/* 7ff70c879a40 FUN_7ff70c879a40 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c879a40(undefined4 param_1,undefined8 *param_2)

{
  longlong lVar1;
  code *pcVar2;
  char cVar3;
  uint uVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  ulonglong uVar7;
  byte bVar8;
  undefined1 auStack_98 [32];
  undefined4 uStack_78;
  undefined4 uStack_70;
  byte bStack_62;
  char cStack_61;
  undefined8 uStack_60;
  undefined8 uStack_58;
  ulonglong uStack_50;
  
  uStack_50 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_98;
  lVar1 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  uStack_60 = *param_2;
  uStack_58 = CONCAT44(*(float *)(_DAT_7ff70cc1a3c0 + 0x1130) +
                       (float)((ulonglong)uStack_60 >> 0x20),
                       *(float *)(_DAT_7ff70cc1a3c0 + 0x1130) + (float)uStack_60);
  cVar3 = FUN_7ff70c837800(&uStack_60,param_1,0,0);
  uStack_78 = 0;
  uVar4 = FUN_7ff70c8782e0(&uStack_60,param_1,&cStack_61,&bStack_62);
  if (cVar3 != '\0') {
    bVar8 = 0x15;
    if (cStack_61 != '\0') {
      bVar8 = bStack_62 | 0x16;
    }
    uVar5 = FUN_7ff70c80a070(bVar8);
    uVar6 = FUN_7ff70c80a070(0);
    if (bStack_62 != 0 || cStack_61 != '\0') {
      uStack_70 = 0;
      uStack_78 = 0;
      FUN_7ff70c7bd960(*(undefined8 *)(lVar1 + 0x2c8),&uStack_60,&uStack_58,uVar5);
    }
    FUN_7ff70c80dff0(&uStack_60,param_1,2);
    uStack_78 = 0x3f800000;
    FUN_7ff70c7fa600(*(undefined8 *)(lVar1 + 0x2c8),uStack_60,uVar6,
                     (*(byte *)(lVar1 + 0xcf) ^ 1) * 2 + 1);
    cVar3 = FUN_7ff70c834b60();
    if (cVar3 != '\0') {
      cVar3 = FUN_7ff70c847de0(0);
      if (cVar3 != '\0') {
        FUN_7ff70c8199f0(lVar1);
      }
    }
  }
  if (_DAT_7ff70cbebd80 == (uStack_50 ^ (ulonglong)auStack_98)) {
    return (ulonglong)uVar4;
  }
  FUN_7ff70caa97e0(uStack_50 ^ (ulonglong)auStack_98);
  pcVar2 = (code *)swi(3);
  uVar7 = (*pcVar2)();
  return uVar7;
}


