/* 7ff70c94acb0 FUN_7ff70c94acb0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

uint FUN_7ff70c94acb0(longlong param_1,ulonglong param_2,ulonglong param_3)

{
  longlong lVar1;
  code *pcVar2;
  longlong *plVar3;
  longlong lVar4;
  longlong lVar5;
  undefined8 uVar6;
  char cVar7;
  uint uVar8;
  int iVar9;
  uint uVar10;
  longlong lVar11;
  undefined1 auStack_138 [256];
  
  if (*(char *)(param_1 + 0x12c7) == '\0') {
    param_3 = param_3 & 0xffffffff;
    uVar8 = (uint)param_2;
    lVar1 = *(longlong *)(param_1 + 0x20);
    FUN_7ff70c944e40();
    (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 400));
    *(undefined8 *)(param_1 + 400) = 0;
    (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x188));
    *(undefined8 *)(param_1 + 0x188) = 0;
    if ((uVar8 < 0x2b) && ((0x40004800000U >> (param_2 & 0x3f) & 1) != 0)) {
      param_3 = CONCAT71((int7)(param_3 >> 8),1);
    }
    pcVar2 = *(code **)(*(longlong *)(lVar1 + 0x2e8) + 0x18);
    if (pcVar2 != (code *)0x0) {
      uVar8 = (*pcVar2)(param_1,param_2 & 0xffffffff,param_3);
    }
    uVar10 = 0x2a;
    if (uVar8 != 0x2a) {
      iVar9 = FUN_7ff70c98fcb0(param_1);
      uVar10 = 0x2a;
      if (iVar9 == 0) {
        uVar10 = uVar8;
      }
      if (uVar8 != 0) {
        uVar10 = uVar8;
      }
    }
    FUN_7ff70c955870(param_1,param_3);
    lVar11 = *(longlong *)(param_1 + 0xd8);
    plVar3 = *(longlong **)(lVar11 + 0x40);
    if (plVar3 != (longlong *)0x0) {
      lVar4 = *plVar3;
      *(undefined8 *)(lVar4 + 0x10) = 0;
      if (*(longlong *)(lVar11 + 8) == 0) {
        *(undefined8 *)(lVar4 + 0x18) = 0;
        *(longlong *)(lVar11 + 8) = lVar4;
        *(longlong *)(lVar11 + 0x10) = lVar4;
        iVar9 = *(int *)(lVar4 + 0x58);
      }
      else {
        lVar5 = *(longlong *)(lVar11 + 0x10);
        *(longlong *)(lVar5 + 0x10) = lVar4;
        *(longlong *)(lVar4 + 0x18) = lVar5;
        *(longlong *)(lVar11 + 0x10) = lVar4;
        iVar9 = *(int *)(lVar4 + 0x58);
      }
      if (iVar9 != 2) {
        *(undefined4 *)(lVar4 + 0x58) = 2;
        FUN_7ff70c994d50(lVar4);
      }
      FUN_7ff70c991030(lVar11 + 0x40,plVar3,0);
      FUN_7ff70c94a660(lVar4,0,8);
      *(undefined1 *)(lVar4 + 0x12c8) = 1;
    }
    (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0xc48));
    *(undefined8 *)(param_1 + 0xc48) = 0;
    FUN_7ff70c956120(param_1);
    if (*(longlong *)(param_1 + 0xe8) != 0) {
      FUN_7ff70c959850(param_1,5,2);
    }
    lVar11 = *(longlong *)(param_1 + 0x20);
    if (lVar11 != 0) {
      FUN_7ff70c955550(lVar11,param_1);
      FUN_7ff70c991030(lVar11 + 0x378,param_1 + 0x40,0);
    }
    *(undefined8 *)(param_1 + 0x20) = 0;
    if (*(longlong *)(lVar1 + 0x390) == 0) {
      *(undefined1 *)(param_1 + 0x12c7) = 1;
      if (*(longlong *)(lVar1 + 0x50) != 0) {
        FUN_7ff70c9848d0(param_1);
        *(undefined8 *)(lVar1 + 0x50) = 0;
      }
      FUN_7ff70c983b90(param_1);
      *(undefined8 *)(param_1 + 0xc18) = *(undefined8 *)(lVar1 + 0x48);
      if (((((*(char *)(param_1 + 0xa39) == '\x01') && (*(int *)(lVar1 + 0x3b0) != 2)) &&
           (*(int *)(lVar1 + 0x3b4) != 2)) &&
          ((*(int *)(lVar1 + 0x4a8) != 1 && (*(int *)(lVar1 + 0x4ac) != 1)))) ||
         ((*(char *)(lVar1 + 0x2ce) != '\0' ||
          (((char)param_3 != '\0' && (cVar7 = FUN_7ff70c9551d0(lVar1,0), cVar7 == '\0')))))) {
        FUN_7ff70c956760(lVar1,1);
        FUN_7ff70c958b40(param_1,lVar1,0);
        if (*(longlong *)(param_1 + 0xe8) != 0) {
          FUN_7ff70c959890(param_1,5);
        }
        FUN_7ff70c945f70(param_1,lVar1,param_3);
      }
      else {
        lVar11 = 200;
        if (((*(char *)(lVar1 + 0x2c9) == '\0') &&
            (lVar11 = 0x100, *(char *)(lVar1 + 0x2c8) == '\0')) &&
           (lVar11 = 0x78, *(char *)(lVar1 + 0x2d1) != '\0')) {
          lVar11 = 0xa8;
        }
        uVar6 = *(undefined8 *)(lVar1 + 0x48);
        FUN_7ff70c95c190(auStack_138,0x100,&UNK_7ff70cb81686,uVar6,*(undefined8 *)(lVar1 + lVar11));
        if (*(longlong *)(param_1 + 0xe8) != 0) {
          FUN_7ff70c959890(param_1,5);
        }
        cVar7 = FUN_7ff70c958d60(param_1,lVar1);
        if (cVar7 == '\0') {
          *(undefined8 *)(param_1 + 0xc10) = 0xffffffffffffffff;
        }
        else {
          *(undefined8 *)(param_1 + 0xc10) = uVar6;
          *(undefined8 *)(param_1 + 0xc18) = uVar6;
          if (*(char *)(param_1 + 0xa37) == '\x01') {
            FUN_7ff70c941400(param_1,&UNK_7ff70cb8320d,auStack_138);
          }
        }
      }
      (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0xc40));
      *(undefined8 *)(param_1 + 0xc40) = 0;
      return uVar10;
    }
    if (*(longlong *)(param_1 + 0xe8) != 0) {
      FUN_7ff70c959890(param_1,5);
      return 0;
    }
  }
  return 0;
}


