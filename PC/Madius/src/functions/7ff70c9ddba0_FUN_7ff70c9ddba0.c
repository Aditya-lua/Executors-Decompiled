/* 7ff70c9ddba0 FUN_7ff70c9ddba0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

int FUN_7ff70c9ddba0(longlong param_1,longlong param_2)

{
  code *pcVar1;
  char cVar2;
  int iVar3;
  uint uVar4;
  uint uVar5;
  longlong lVar6;
  undefined8 uVar7;
  longlong lVar8;
  undefined8 uVar9;
  longlong lVar10;
  ulonglong uVar11;
  ulonglong uVar12;
  longlong lStack_158;
  undefined8 uStack_150;
  undefined1 auStack_148 [264];
  
  lVar6 = *(longlong *)(param_1 + 0x10);
  lStack_158 = 0;
  uVar7 = *(undefined8 *)(lVar6 + 8);
  uStack_150 = FUN_7ff70cb12e80(uVar7);
  iVar3 = (**(code **)(_DAT_7ff70cc1ae50 + 0x58))
                    (*(undefined8 *)(*(longlong *)(lVar6 + 0x20) + 8),0x53,&lStack_158);
  if (iVar3 == 0 && lStack_158 != 0) {
    uVar4 = FUN_7ff70c9dde80(param_2,lStack_158,0,0);
    if (uVar4 == 0) {
      FUN_7ff70c9412d0(param_2,&UNK_7ff70cb84603);
      goto LAB_7ff70c9ddd72;
    }
    uVar12 = (ulonglong)uVar4;
    lVar6 = (*_DAT_7ff70cbebad0)(uVar12);
    if (lVar6 != 0) {
      uVar5 = FUN_7ff70c9dde80(param_2,lStack_158,lVar6,uVar4);
      pcVar1 = _DAT_7ff70cb96650;
      if (uVar5 == uVar4) {
        iVar3 = 0x3c;
        if (param_2 == 0) {
          uVar11 = 0;
          do {
            while( true ) {
              if ((iVar3 != 0x3c) || (*(char *)(lVar6 + uVar11) == '\0')) goto LAB_7ff70c9dde3d;
              lVar8 = (*_DAT_7ff70cb96650)(lVar6 + uVar11);
              if (lVar8 == 0) break;
              uVar9 = FUN_7ff70cb12e80(lVar8);
              cVar2 = FUN_7ff70c9f8d00(lVar8,uVar9,uVar7,uStack_150);
              iVar3 = 0;
              if (cVar2 == '\0') {
                lVar10 = FUN_7ff70cb12e80(lVar6 + uVar11);
                uVar11 = uVar11 + lVar10 + 1;
                iVar3 = 0x3c;
              }
              (*_DAT_7ff70cb96728)(lVar8);
              if (uVar12 <= uVar11) goto LAB_7ff70c9dde3d;
            }
            iVar3 = 0x1b;
          } while (uVar11 < uVar12);
        }
        else {
          uVar11 = 0;
          do {
            while( true ) {
              if ((iVar3 != 0x3c) || (*(char *)(lVar6 + uVar11) == '\0')) goto LAB_7ff70c9dde3d;
              lVar8 = (*pcVar1)(lVar6 + uVar11);
              if (lVar8 == 0) break;
              uVar9 = FUN_7ff70cb12e80(lVar8);
              cVar2 = FUN_7ff70c9f8d00(lVar8,uVar9,uVar7,uStack_150);
              if (cVar2 == '\0') {
                if (*(char *)(param_2 + 0xa37) != '\0') {
                  FUN_7ff70c941400(param_2,&UNK_7ff70cb8e65b,uVar7,lVar8);
                }
                lVar10 = FUN_7ff70cb12e80(lVar6 + uVar11);
                uVar11 = uVar11 + lVar10 + 1;
                iVar3 = 0x3c;
              }
              else {
                iVar3 = 0;
                if (*(char *)(param_2 + 0xa37) != '\0') {
                  FUN_7ff70c941400(param_2,&UNK_7ff70cb8e6aa,uVar7,lVar8);
                }
              }
              (*_DAT_7ff70cb96728)(lVar8);
              if (uVar12 <= uVar11) goto LAB_7ff70c9dde3d;
            }
            iVar3 = 0x1b;
          } while (uVar11 < uVar12);
        }
LAB_7ff70c9dde3d:
        if (iVar3 != 0) {
          if (iVar3 == 0x3c) {
            FUN_7ff70c9412d0(param_2,&UNK_7ff70cb8205f,uVar7);
            iVar3 = 0x3c;
          }
          else {
            FUN_7ff70c9412d0(param_2,&UNK_7ff70cb882f1);
          }
        }
      }
      else {
        FUN_7ff70c9412d0(param_2,&UNK_7ff70cb85fbd);
        iVar3 = 0x3c;
      }
      goto LAB_7ff70c9ddd79;
    }
    iVar3 = 0x1b;
  }
  else {
    uVar7 = FUN_7ff70c991760(iVar3,auStack_148,0x100);
    FUN_7ff70c9412d0(param_2,&UNK_7ff70cb828c3,uVar7);
LAB_7ff70c9ddd72:
    iVar3 = 0x3c;
  }
  lVar6 = 0;
LAB_7ff70c9ddd79:
  (*_DAT_7ff70cbebad8)(lVar6);
  if (lStack_158 != 0) {
    (*_DAT_7ff70cb95640)();
  }
  return iVar3;
}


