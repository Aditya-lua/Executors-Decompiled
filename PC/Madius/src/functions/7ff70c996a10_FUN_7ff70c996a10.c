/* 7ff70c996a10 FUN_7ff70c996a10 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

int FUN_7ff70c996a10(undefined8 param_1,undefined8 param_2,longlong *param_3,longlong *param_4)

{
  code *pcVar1;
  code *pcVar2;
  undefined4 uVar3;
  int iVar4;
  uint uVar5;
  int iVar6;
  longlong lVar7;
  longlong lVar8;
  ulonglong uVar9;
  undefined *puVar10;
  undefined1 *puVar11;
  bool bVar12;
  undefined1 auStack_a8 [8];
  undefined4 uStack_a0;
  undefined4 uStack_9c;
  undefined4 uStack_98;
  undefined4 uStack_94;
  undefined4 uStack_88;
  undefined4 uStack_84;
  undefined4 uStack_80;
  undefined4 uStack_7c;
  undefined1 auStack_78 [64];
  
  *param_4 = 0;
  lVar7 = FUN_7ff70c95fb20(param_2,&UNK_7ff70cb808ed);
  *param_3 = lVar7;
  iVar6 = 0x17;
  lVar8 = 0;
  puVar11 = auStack_a8;
  if (lVar7 != 0) {
    uVar3 = func_0x7ff70da87d44(lVar7);
    iVar4 = func_0x7ff70d5b0cf5(uVar3,auStack_78);
    if (iVar4 == -1) {
      return 0;
    }
    if (-0x7001 < uStack_7c._2_2_) {
      return 0;
    }
    puVar11 = &stack0xffffffffffffff40;
    func_0x7ff70d974b8b(*param_3);
    *param_3 = 0;
    iVar4 = FUN_7ff70c95f8e0(param_1,(longlong)&uStack_94 + 3,9);
    if (iVar4 == 0) {
      lVar8 = FUN_7ff70c95c280(&UNK_7ff70cb83f76,param_2,(longlong)&uStack_94 + 3);
      if (lVar8 == 0) {
        iVar6 = 0x1b;
        lVar8 = 0;
      }
      else {
        uVar5 = FUN_7ff70c95fae0(lVar8,0x501,0x180);
        bVar12 = SBORROW4(uVar5,-1);
        puVar11 = &stack0xffffffffffffff40;
        if (uVar5 != 0xffffffff) {
          puVar10 = &UNK_7ff70cb808ed;
          uVar9 = (ulonglong)uVar5;
          lVar7 = func_0x7ff70d87b6eb(uVar9,&UNK_7ff70cb808ed);
          if (bVar12) {
            FUN_7ff70c958630(&uStack_88);
            pcVar1 = _DAT_7ff70cb96650;
            lVar7 = (*_DAT_7ff70cb96650)(uVar9);
            lVar8 = (*pcVar1)((ulonglong)puVar10 & 0xffffffff);
            iVar6 = (*_DAT_7ff70cb958f0)(lVar7,lVar8,1);
            pcVar2 = _DAT_7ff70cb95960;
            pcVar1 = _DAT_7ff70cb958f0;
            if (iVar6 == 0) {
              do {
                FUN_7ff70c958630(auStack_78);
                uStack_a0 = uStack_88;
                uStack_9c = uStack_84;
                uStack_98 = uStack_80;
                uStack_94 = uStack_7c;
                uVar9 = FUN_7ff70c9586d0(auStack_78,&uStack_a0);
                if (1000 < uVar9) {
                  if (lVar7 != 0) {
                    (*_DAT_7ff70cb96728)(lVar7);
                  }
                  iVar6 = 1;
                  if (lVar8 == 0) {
                    return 1;
                  }
                  goto LAB_7ff70c996c05;
                }
                (*pcVar2)(1);
                iVar6 = (*pcVar1)(lVar7,lVar8,1);
              } while (iVar6 == 0);
            }
            if (lVar7 != 0) {
              (*_DAT_7ff70cb96728)(lVar7);
            }
            iVar6 = 0;
            if (lVar8 != 0) {
LAB_7ff70c996c05:
              (*_DAT_7ff70cb96728)(lVar8);
            }
            return iVar6;
          }
          *(int *)param_3 = (int)lVar7;
          if (lVar7 != 0) {
            *param_4 = lVar8;
            return 0;
          }
          iVar4 = func_0x7ff70d7007cf(uVar5);
          uVar5 = iVar4 + 0x170e76b8;
          out(0xf9,(char)uVar5);
          *(char *)(ulonglong)uVar5 = *(char *)(ulonglong)uVar5 + (char)param_3;
          puVar11 = &stack0xffffffffffffff40;
        }
      }
    }
    else {
      lVar8 = 0;
      puVar11 = &stack0xffffffffffffff40;
      iVar6 = iVar4;
    }
  }
  *(undefined8 *)(puVar11 + -8) = 0x7ff70c996aac;
  (*_DAT_7ff70cbebad8)(lVar8);
  return iVar6;
}


