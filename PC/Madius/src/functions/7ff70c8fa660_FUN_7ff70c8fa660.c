/* 7ff70c8fa660 FUN_7ff70c8fa660 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

int FUN_7ff70c8fa660(longlong param_1,longlong param_2)

{
  code *pcVar1;
  int iVar2;
  longlong lVar3;
  ulonglong uVar4;
  ulonglong uVar5;
  longlong lVar6;
  int iVar7;
  undefined1 auStack_68 [6];
  short sStack_62;
  undefined8 uStack_50;
  
  if (param_1 == 0) {
    return 0x2b;
  }
  if (*(code **)(param_1 + 0x30) != (code *)0x0) {
    (**(code **)(param_1 + 0x30))(*(undefined8 *)(param_1 + 0x38));
  }
  *(undefined8 *)(param_1 + 0x20) = 0;
  *(undefined8 *)(param_1 + 0x28) = 0;
  *(undefined8 *)(param_1 + 0x30) = 0;
  *(longlong *)(param_1 + 0x38) = param_1;
  *(undefined8 *)(param_1 + 0x18) = 0;
  *(undefined8 *)(param_1 + 0x40) = 0;
  *(undefined8 *)(param_1 + 0x70) = 0;
  *(undefined8 *)(param_1 + 0x98) = 0;
  *(undefined8 *)(param_1 + 0xa0) = 0;
  *(undefined8 *)(param_1 + 0xa8) = 0;
  *(undefined4 *)(param_1 + 0x10) = 0;
  *(byte *)(param_1 + 0x14) = *(byte *)(param_1 + 0x14) & 0xfb;
  *(undefined8 *)(param_1 + 0x1b0) = 1;
  *(undefined4 *)(param_1 + 0x78) = 0;
  if (param_2 != 0) {
    iVar2 = FUN_7ff70c95fb30(param_2,auStack_68);
    if ((iVar2 == 0) && (iVar2 = FUN_7ff70c95fb40(param_2,4), iVar2 == 0)) {
      iVar2 = 0;
    }
    else {
      iVar2 = 0x1a;
    }
    lVar3 = (*_DAT_7ff70cbebae8)(param_2);
    *(longlong *)(param_1 + 0x18) = lVar3;
    iVar7 = 0x1b;
    if (lVar3 == 0) {
      iVar2 = 0x1b;
    }
    *(undefined8 *)(param_1 + 0x70) = 0xffffffffffffffff;
    if ((iVar2 == 0) && (sStack_62 < -0x7000)) {
      *(undefined8 *)(param_1 + 0x70) = uStack_50;
      *(undefined **)(param_1 + 0x28) = &UNK_7ff70c8fadc0;
    }
    *(undefined **)(param_1 + 0x20) = &UNK_7ff70c8fae40;
    *(undefined **)(param_1 + 0x30) = &UNK_7ff70c8faec0;
    *(undefined4 *)(param_1 + 0x10) = 2;
    lVar3 = (*_DAT_7ff70cbebae8)(param_2);
    pcVar1 = _DAT_7ff70cbebae8;
    if (lVar3 != 0) {
      uVar4 = FUN_7ff70cb12ba0(lVar3,0x2f);
      uVar5 = FUN_7ff70cb12ba0(lVar3,0x5c);
      if (uVar5 == 0 || uVar4 == 0) {
        if (uVar4 == 0) {
          lVar6 = lVar3;
          if (uVar5 != 0) {
            lVar6 = uVar5 + 1;
          }
        }
        else {
          lVar6 = uVar4 + 1;
        }
      }
      else {
        if (uVar5 < uVar4) {
          uVar5 = uVar4;
        }
        lVar6 = uVar5 + 1;
      }
      lVar6 = (*pcVar1)(lVar6);
      (*_DAT_7ff70cbebad8)(lVar3);
      if (lVar6 != 0) {
        (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x60));
        *(undefined8 *)(param_1 + 0x60) = 0;
        lVar3 = (*_DAT_7ff70cbebae8)(lVar6);
        *(longlong *)(param_1 + 0x60) = lVar3;
        iVar7 = iVar2;
        if (lVar3 == 0) {
          iVar7 = 0x1b;
        }
        (*_DAT_7ff70cbebad8)(lVar6);
      }
    }
    return iVar7;
  }
  return 0;
}


