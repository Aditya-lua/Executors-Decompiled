/* 7ff70c879250 FUN_7ff70c879250 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c879250(undefined8 param_1,undefined8 *param_2,uint param_3)

{
  longlong lVar1;
  code *pcVar2;
  char cVar3;
  undefined4 uVar4;
  uint uVar5;
  ulonglong uVar6;
  undefined1 auStack_78 [32];
  uint uStack_58;
  undefined1 uStack_4a;
  undefined1 uStack_49;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined1 auStack_38 [8];
  ulonglong uStack_30;
  
  lVar1 = _DAT_7ff70cc1a3c0;
  uStack_30 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_78;
  *(undefined1 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0xce) = 1;
  lVar1 = *(longlong *)(lVar1 + 0x1440);
  if (*(char *)(lVar1 + 0xd1) == '\0') {
    uVar6 = 0;
    uVar4 = FUN_7ff70c8165d0(lVar1,param_1,0);
    FUN_7ff70c836c60(auStack_38,*param_2,0,0);
    uStack_48 = *(undefined8 *)(lVar1 + 0x118);
    uStack_40 = CONCAT44(auStack_38._4_4_ + (float)((ulonglong)uStack_48 >> 0x20),
                         auStack_38._0_4_ + (float)uStack_48);
    FUN_7ff70c8375f0(auStack_38,_DAT_7ff70cb1bae8);
    cVar3 = FUN_7ff70c837800(&uStack_48,uVar4,0,~param_3 >> 2 & 2);
    if (cVar3 != '\0') {
      uStack_58 = param_3;
      uVar5 = FUN_7ff70c8782e0(&uStack_48,uVar4,&uStack_49,&uStack_4a);
      uVar6 = (ulonglong)uVar5;
      FUN_7ff70c80dff0(&uStack_48,uVar4,0);
    }
  }
  else {
    uVar6 = 0;
  }
  if (_DAT_7ff70cbebd80 == (uStack_30 ^ (ulonglong)auStack_78)) {
    return uVar6;
  }
  FUN_7ff70caa97e0(uStack_30 ^ (ulonglong)auStack_78);
  pcVar2 = (code *)swi(3);
  uVar6 = (*pcVar2)();
  return uVar6;
}


