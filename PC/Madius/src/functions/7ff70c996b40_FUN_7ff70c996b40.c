/* 7ff70c996b40 FUN_7ff70c996b40 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c996b40(undefined8 param_1,undefined8 param_2)

{
  code *pcVar1;
  code *pcVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  ulonglong uVar6;
  undefined8 uVar7;
  undefined4 uStack_68;
  undefined4 uStack_64;
  undefined4 uStack_60;
  undefined4 uStack_5c;
  undefined4 uStack_50;
  undefined4 uStack_4c;
  undefined4 uStack_48;
  undefined4 uStack_44;
  undefined1 auStack_40 [16];
  
  FUN_7ff70c958630(&uStack_50);
  pcVar1 = _DAT_7ff70cb96650;
  lVar4 = (*_DAT_7ff70cb96650)(param_1);
  lVar5 = (*pcVar1)(param_2);
  iVar3 = (*_DAT_7ff70cb958f0)(lVar4,lVar5,1);
  pcVar2 = _DAT_7ff70cb95960;
  pcVar1 = _DAT_7ff70cb958f0;
  if (iVar3 == 0) {
    do {
      FUN_7ff70c958630(auStack_40);
      uStack_68 = uStack_50;
      uStack_64 = uStack_4c;
      uStack_60 = uStack_48;
      uStack_5c = uStack_44;
      uVar6 = FUN_7ff70c9586d0(auStack_40,&uStack_68);
      if (1000 < uVar6) {
        if (lVar4 != 0) {
          (*_DAT_7ff70cb96728)(lVar4);
        }
        uVar7 = 1;
        if (lVar5 == 0) {
          return 1;
        }
        goto LAB_7ff70c996c05;
      }
      (*pcVar2)(1);
      iVar3 = (*pcVar1)(lVar4,lVar5,1);
    } while (iVar3 == 0);
  }
  if (lVar4 != 0) {
    (*_DAT_7ff70cb96728)(lVar4);
  }
  uVar7 = 0;
  if (lVar5 != 0) {
LAB_7ff70c996c05:
    (*_DAT_7ff70cb96728)(lVar5);
  }
  return uVar7;
}


