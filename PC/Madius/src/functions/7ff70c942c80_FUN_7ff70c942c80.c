/* 7ff70c942c80 FUN_7ff70c942c80 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

int FUN_7ff70c942c80(longlong param_1,longlong param_2,longlong param_3,longlong param_4)

{
  longlong lVar1;
  int iVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  undefined1 *puVar6;
  longlong lVar7;
  undefined8 unaff_RBX;
  undefined8 uVar8;
  int iStack_78;
  undefined8 uStack_58;
  longlong alStack_50 [2];
  
  alStack_50[1] = 0;
  if (param_2 == 0) {
    iVar3 = 0;
  }
  else {
    iVar3 = 0x5a;
    if (param_4 != 0 && param_3 != 0) {
      iVar2 = (*_DAT_7ff70cb96698)(param_2,&UNK_7ff70cb8bfdc,8);
      if (iVar2 == 0) {
        alStack_50[0] = 0;
        uStack_58 = 0;
        if (*(longlong *)(_DAT_7ff70cbec7c0 + 0xb8) == 0) {
          iVar3 = 0x5a;
        }
        else {
          lVar4 = (*_DAT_7ff70cbebad0)(0x20);
          iVar3 = 0x1b;
          if (lVar4 != 0) {
            iVar3 = (**(code **)(_DAT_7ff70cbec7c0 + 0xb8))(param_3,param_4,lVar4,0x20);
            if (iVar3 == 0) {
              iVar3 = FUN_7ff70c97f570(lVar4,0x20,&uStack_58,alStack_50);
              (*_DAT_7ff70cbebad8)(lVar4);
              if (iVar3 != 0) {
                return iVar3;
              }
              if ((param_1 != 0) && (*(char *)(param_1 + 0xa37) == '\x01')) {
                FUN_7ff70c941400(param_1,&UNK_7ff70cb8259f,uStack_58);
              }
              lVar5 = FUN_7ff70cb12e80(param_2);
              lVar4 = (*_DAT_7ff70cbebad0)(lVar5 + 1);
              if (lVar4 == 0) {
                (*_DAT_7ff70cbebad8)(uStack_58);
                return 0x1b;
              }
              FUN_7ff70cb12b60(lVar4,param_2,lVar5 + 1);
              lVar5 = lVar4;
              do {
                puVar6 = (undefined1 *)FUN_7ff70cb12bb0(lVar5,&UNK_7ff70cb8bfdb);
                lVar1 = alStack_50[0];
                if (puVar6 == (undefined1 *)0x0) {
                  lVar7 = FUN_7ff70cb12e80(lVar5 + 8);
                  if (lVar1 != lVar7) break;
LAB_7ff70c942f55:
                  uVar8 = uStack_58;
                  iVar2 = FUN_7ff70cb12b50(uStack_58,lVar5 + 8,lVar1);
                  if ((puVar6 == (undefined1 *)0x0) || (iVar2 == 0)) {
                    iVar3 = 0x5a;
                    if (iVar2 == 0) {
                      iVar3 = 0;
                    }
                    goto LAB_7ff70c942f8f;
                  }
                }
                else {
                  *puVar6 = 0;
                  lVar7 = FUN_7ff70cb12e80(lVar5 + 8);
                  if (lVar1 == lVar7) goto LAB_7ff70c942f55;
                }
                *puVar6 = 0x3b;
                lVar5 = FUN_7ff70cb12bb0(puVar6,&UNK_7ff70cb8bfdc);
              } while (lVar5 != 0);
              iVar3 = 0x5a;
              uVar8 = uStack_58;
LAB_7ff70c942f8f:
              (*_DAT_7ff70cbebad8)(uVar8);
              uStack_58 = 0;
            }
            (*_DAT_7ff70cbebad8)(lVar4);
          }
        }
      }
      else {
        lVar4 = FUN_7ff70c95fb20(param_2,&UNK_7ff70cb89228);
        if (lVar4 != 0) {
          func_0x7ff70d596740(lVar4,0,2);
          iVar3 = 0x5a;
          if (iStack_78 == 0) {
            func_0x7ff70d7674f4(lVar4);
                    /* WARNING: Bad instruction - Truncating control flow here */
            halt_baddata();
          }
          (*_DAT_7ff70cbebad8)(0);
          (*_DAT_7ff70cbebad8)(unaff_RBX);
          func_0x7ff70d80b628(lVar4);
        }
      }
    }
  }
  return iVar3;
}


