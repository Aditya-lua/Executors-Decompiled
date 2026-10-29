/* 7ff70c951790 FUN_7ff70c951790 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

int FUN_7ff70c951790(longlong param_1,longlong *param_2,char *param_3)

{
  code *pcVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  longlong lVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  undefined *puVar8;
  longlong *plVar9;
  longlong alStack_120 [3];
  undefined1 auStack_108 [16];
  int aiStack_f8 [4];
  undefined *puStack_e8;
  int aiStack_e0 [6];
  undefined8 uStack_c8;
  uint uStack_c0;
  undefined4 uStack_bc;
  undefined8 auStack_b8 [2];
  uint uStack_a8;
  undefined8 uStack_a4;
  undefined4 uStack_9c;
  int iStack_98;
  int iStack_94;
  longlong lStack_88;
  char *pcStack_80;
  int aiStack_74 [13];
  
  puVar6 = (undefined8 *)auStack_108;
  auStack_b8[0] = 0;
  if (param_2 != (longlong *)0x0) {
    if (param_3 == (char *)0x0) {
      param_3 = (char *)param_2[4];
    }
    iVar2 = 0;
    puVar7 = (undefined8 *)auStack_108;
    if (((param_3 != (char *)0x0) &&
        (puVar7 = (undefined8 *)auStack_108, (*(uint *)(param_2 + 5) & 2) == 0)) &&
       (puVar7 = (undefined8 *)auStack_108, *param_3 != '\0')) {
      alStack_120[2] = 0x7ff70c951805;
      pcStack_80 = param_3;
      iVar2 = FUN_7ff70c996a10(param_1,param_3,auStack_b8 + 1,auStack_b8);
      if (iVar2 == 0) {
        alStack_120[2] = 0x7ff70c95182b;
        FUN_7ff70cb12c70(&UNK_7ff70cb9162b,0x6f,1,auStack_b8[1]);
        plVar9 = (longlong *)*param_2;
        while (iVar2 = 0, plVar9 != (longlong *)0x0) {
          while( true ) {
            uVar4 = auStack_b8[1];
            lVar5 = *plVar9;
            plVar9 = (longlong *)plVar9[2];
            if (*(longlong *)(lVar5 + 0x28) == 0x7fffffffffffffff) break;
            alStack_120[2] = 0x7ff70c9518ae;
            iVar2 = FUN_7ff70c9969c0(*(longlong *)(lVar5 + 0x28),&uStack_a8);
            if (iVar2 != 0) goto LAB_7ff70c95192b;
            aiStack_e0[0] = iStack_98 + 1;
            puVar8 = &UNK_7ff70cb923a7;
            if (*(char *)(lVar5 + 0x20) != '\0') {
              puVar8 = &UNK_7ff70cb8dfd1;
            }
            uStack_c0 = uStack_a8;
            uStack_c8._0_4_ = (undefined4)uStack_a4;
            aiStack_e0[4] = uStack_a4._4_4_;
            aiStack_e0[2] = uStack_9c;
            puStack_e8 = (undefined *)CONCAT44(puStack_e8._4_4_,iStack_94 + 0x76c);
            alStack_120[2] = 0x7ff70c95191e;
            FUN_7ff70c95c3b0(uVar4,&UNK_7ff70cb91ed0,puVar8,*(undefined8 *)(lVar5 + 0x18));
            iVar2 = 0;
            if (plVar9 == (longlong *)0x0) goto LAB_7ff70c95192b;
          }
          puVar8 = &UNK_7ff70cb923a7;
          if (*(char *)(lVar5 + 0x20) != '\0') {
            puVar8 = &UNK_7ff70cb8dfd1;
          }
          puStack_e8 = &UNK_7ff70cb87d28;
          alStack_120[2] = 0x7ff70c951886;
          FUN_7ff70c95c3b0(auStack_b8[1],&UNK_7ff70cb91e2e,puVar8,*(undefined8 *)(lVar5 + 0x18));
        }
LAB_7ff70c95192b:
        puVar6 = alStack_120 + 2;
        alStack_120[2] = auStack_b8[1];
        alStack_120[1] = 0x7ff70c951936;
        func_0x7ff70da56c37();
        lVar5 = CONCAT44(uStack_bc,uStack_c0);
        if (lVar5 != 0 && iVar2 == 0) {
          alStack_120[1] = 0x7ff70c95195a;
          iVar3 = FUN_7ff70c996b40(lVar5,lStack_88);
          iVar2 = 0x17;
          if (iVar3 == 0) {
            iVar2 = 0;
          }
          lVar5 = CONCAT44(uStack_bc,uStack_c0);
        }
        if (lVar5 != 0 && iVar2 != 0) {
          puVar6 = alStack_120 + 1;
          alStack_120[1] = lVar5;
          func_0x7ff70d799db4();
        }
      }
      puVar6[0xffffffffffffffff] = 0x7ff70c95198c;
      (*_DAT_7ff70cbebad8)(puVar6[10]);
      puVar7 = puVar6;
    }
    if (*(longlong *)(param_1 + 0x2e0) == 0) {
      return iVar2;
    }
    *(longlong *)((longlong)puVar7 + 0x98) = param_2[3];
    *(undefined8 *)((longlong)puVar7 + 0x90) = 0;
    param_2 = (longlong *)*param_2;
    if (param_2 == (longlong *)0x0) {
      return iVar2;
    }
    do {
      lVar5 = *param_2;
      param_2 = (longlong *)param_2[2];
      *(undefined8 *)((longlong)puVar7 + 0x60) = *(undefined8 *)(lVar5 + 0x18);
      *(undefined8 *)((longlong)puVar7 + -8) = 0x7ff70c951a06;
      uVar4 = FUN_7ff70cb12e80();
      *(undefined8 *)((longlong)puVar7 + 0x68) = uVar4;
      *(uint *)((longlong)puVar7 + 0x70) = (uint)*(byte *)(lVar5 + 0x20);
      lVar5 = *(longlong *)(lVar5 + 0x28);
      if (lVar5 == 0x7fffffffffffffff) {
        *(undefined8 *)((longlong)puVar7 + 0x74) = 0x6574696d696c6e75;
        *(undefined2 *)((longlong)puVar7 + 0x7c) = 100;
      }
      else {
        *(undefined8 *)((longlong)puVar7 + -8) = 0x7ff70c951a48;
        iVar2 = FUN_7ff70c9969c0(lVar5,(undefined1 *)((longlong)puVar7 + 0xa4));
        if (iVar2 != 0) {
          return iVar2;
        }
        *(undefined4 *)((longlong)puVar7 + 0x40) = *(undefined4 *)((longlong)puVar7 + 0xa4);
        *(undefined4 *)((longlong)puVar7 + 0x38) = *(undefined4 *)((longlong)puVar7 + 0xa8);
        *(undefined4 *)((longlong)puVar7 + 0x30) = *(undefined4 *)((longlong)puVar7 + 0xac);
        *(undefined4 *)((longlong)puVar7 + 0x28) = *(undefined4 *)((longlong)puVar7 + 0xb0);
        *(int *)((longlong)puVar7 + 0x20) = *(int *)((longlong)puVar7 + 0xb4) + 1;
        *(undefined8 *)((longlong)puVar7 + -8) = 0x7ff70c951ab3;
        FUN_7ff70c95c190((undefined8 *)((longlong)puVar7 + 0x74),0x12,&UNK_7ff70cb88985,
                         *(int *)((longlong)puVar7 + 0xb8) + 0x76c);
      }
      uVar4 = *(undefined8 *)(param_1 + 0x2e8);
      pcVar1 = *(code **)(param_1 + 0x2e0);
      *(undefined8 *)((longlong)puVar7 + -8) = 0x7ff70c951ac9;
      iVar2 = (*pcVar1)(param_1,(undefined1 *)((longlong)puVar7 + 0x60),
                        (undefined1 *)((longlong)puVar7 + 0x90),uVar4);
      if (iVar2 != 0) {
        if (iVar2 == 2) {
          return 0x2b;
        }
        return 0;
      }
      *(longlong *)((longlong)puVar7 + 0x90) = *(longlong *)((longlong)puVar7 + 0x90) + 1;
    } while (param_2 != (longlong *)0x0);
  }
  return 0;
}


