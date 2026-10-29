/* 7ff70c91fe20 FUN_7ff70c91fe20 */

/* WARNING: Possible PIC construction at 0x7ff70c91fea4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x7ff70c920018: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x7ff70c91feaa) */
/* WARNING: Removing unreachable block (ram,0x7ff70c92001e) */
/* WARNING: Removing unreachable block (ram,0x7ff70c920028) */
/* WARNING: Removing unreachable block (ram,0x7ff70c920039) */
/* WARNING: Removing unreachable block (ram,0x7ff70c92004a) */
/* WARNING: Removing unreachable block (ram,0x7ff70c920054) */
/* WARNING: Type propagation algorithm not settling */

void FUN_7ff70c91fe20(longlong *param_1,undefined8 *param_2,int *param_3)

{
  undefined1 uVar1;
  code *pcVar2;
  int iVar3;
  longlong lVar4;
  ulonglong uVar5;
  undefined1 *puVar6;
  undefined8 *puVar7;
  undefined8 *******unaff_RBX;
  undefined8 *******pppppppuVar8;
  int *unaff_RSI;
  undefined8 *unaff_RDI;
  longlong *plVar9;
  undefined8 *******pppppppuVar10;
  undefined8 unaff_R12;
  ulonglong uVar11;
  ulonglong unaff_R14;
  undefined8 *******unaff_R15;
  bool bVar12;
  undefined *apuStack_b0 [5];
  ulonglong uStack_88;
  undefined8 *******apppppppuStack_78 [2];
  ulonglong uStack_68;
  undefined *puStack_60;
  undefined8 *******pppppppuStack_58;
  undefined8 uStack_50;
  ulonglong uStack_48;
  ulonglong uStack_40;
  undefined8 uStack_38;
  
  uStack_38 = 0xfffffffffffffffe;
  switch((int)param_1[2]) {
  case 0:
    plVar9 = (longlong *)((longlong)param_1 + 1);
    break;
  case 1:
    pppppppuStack_58 = (undefined8 *******)0x0;
    uStack_50 = 0;
    uStack_40 = 0xf;
    lVar4 = *param_1;
    bVar12 = lVar4 < 0;
    if (bVar12) {
      pppppppuStack_58 = (undefined8 *******)0x2d;
      lVar4 = -lVar4;
    }
    uStack_48 = (ulonglong)bVar12;
    apuStack_b0[0] = &UNK_7ff70c91ff1a;
    func_0x7ff70c920320(apppppppuStack_78,lVar4,param_3);
    unaff_RBX = apppppppuStack_78;
    if (0xf < puStack_60) {
      unaff_RBX = apppppppuStack_78[0];
    }
    if (uStack_40 - uStack_48 < uStack_68) {
      uStack_88 = uStack_68;
      apuStack_b0[0] = &UNK_7ff70c91ff51;
      FUN_7ff70ca00b60(&pppppppuStack_58,uStack_68,uStack_68,unaff_RBX);
    }
    else {
      unaff_R14 = uStack_48 + uStack_68;
      unaff_R15 = pppppppuStack_58;
      if (uStack_40 < 0x10) {
        unaff_R15 = &pppppppuStack_58;
      }
      puVar6 = (undefined1 *)(uStack_48 + (longlong)unaff_R15);
      apuStack_b0[0] = &UNK_7ff70c91ffbc;
      uStack_48 = unaff_R14;
      FUN_7ff70cb12b70(puVar6,unaff_RBX);
      *(undefined1 *)((longlong)unaff_R15 + unaff_R14) = 0;
    }
    if (0xf < puStack_60) {
      uVar5 = (longlong)puStack_60 + 1;
      pppppppuVar10 = apppppppuStack_78[0];
      if (0xfff < uVar5) {
        pppppppuVar10 = *(undefined8 ********)((longlong)apppppppuStack_78[0] + 0xfffffffffffffff8);
        if ((undefined1 *)0x1f <
            (undefined1 *)((longlong)apppppppuStack_78[0] + (-8 - (longlong)pppppppuVar10))) {
                    /* WARNING: Does not return */
          pcVar2 = (code *)invalidInstructionException();
          (*pcVar2)();
        }
        uVar5 = (longlong)puStack_60 + 0x28;
      }
      apuStack_b0[0] = &UNK_7ff70c91fffc;
      thunk_FUN_7ff70ca90250(pppppppuVar10,uVar5);
    }
    pppppppuVar8 = pppppppuStack_58;
    if (uStack_40 < 0x10) {
      pppppppuVar8 = &pppppppuStack_58;
    }
    pppppppuVar10 = (undefined8 *******)(uStack_48 + (longlong)pppppppuVar8);
    register0x00000020 = (BADSPACEBASE *)apuStack_b0;
    apuStack_b0[0] = &UNK_7ff70c92001d;
    unaff_RSI = param_3;
    unaff_RDI = param_2;
    goto code_r0x7ff70c920720;
  case 2:
    apuStack_b0[0] = &UNK_7ff70c91fe89;
    func_0x7ff70c920320(&pppppppuStack_58,*param_1,param_3);
    pppppppuVar8 = &pppppppuStack_58;
    if (0xf < uStack_40) {
      pppppppuVar8 = pppppppuStack_58;
    }
    pppppppuVar10 = (undefined8 *******)(uStack_48 + (longlong)pppppppuVar8);
    register0x00000020 = (BADSPACEBASE *)apuStack_b0;
    apuStack_b0[0] = &UNK_7ff70c91fea9;
    unaff_RBX = pppppppuVar8;
    unaff_RSI = param_3;
    unaff_RDI = param_2;
    goto code_r0x7ff70c920720;
  case 3:
    pppppppuVar10 = (undefined8 *******)*param_1;
    pppppppuVar8 = pppppppuVar10;
    if ((undefined8 ******)0xf < pppppppuVar10[3]) {
      pppppppuVar8 = (undefined8 *******)*pppppppuVar10;
    }
    pppppppuVar10 = (undefined8 *******)((longlong)pppppppuVar10[2] + (longlong)pppppppuVar8);
code_r0x7ff70c920720:
    *(undefined8 ********)((longlong)register0x00000020 + -8) = unaff_R15;
    *(ulonglong *)((longlong)register0x00000020 + -0x10) = unaff_R14;
    *(undefined8 *)((longlong)register0x00000020 + -0x18) = unaff_R12;
    *(int **)((longlong)register0x00000020 + -0x20) = unaff_RSI;
    *(undefined8 **)((longlong)register0x00000020 + -0x28) = unaff_RDI;
    *(undefined8 ********)((longlong)register0x00000020 + -0x30) = unaff_RBX;
    uVar11 = (longlong)pppppppuVar10 - (longlong)pppppppuVar8;
    uVar5 = *(ulonglong *)(param_3 + 2);
    if (uVar11 < uVar5) {
      if (*param_3 == 0) {
        if (pppppppuVar10 == pppppppuVar8) {
          lVar4 = uVar5 - uVar11;
        }
        else {
          do {
            while( true ) {
              uVar1 = *(undefined1 *)pppppppuVar8;
              uVar5 = param_2[2];
              if ((ulonglong)param_2[3] <= uVar5) break;
              param_2[2] = uVar5 + 1;
              puVar7 = param_2;
              if (0xf < (ulonglong)param_2[3]) {
                puVar7 = (undefined8 *)*param_2;
              }
              *(undefined1 *)((longlong)puVar7 + uVar5) = uVar1;
              *(undefined1 *)((longlong)puVar7 + uVar5 + 1) = 0;
              pppppppuVar8 = (undefined8 *******)((longlong)pppppppuVar8 + 1);
              if (pppppppuVar8 == pppppppuVar10) goto code_r0x7ff70c9208cb;
            }
            *(undefined **)((longlong)register0x00000020 + -0x60) = &UNK_7ff70c92088d;
            FUN_7ff70ca31d10(param_2,1);
            pppppppuVar8 = (undefined8 *******)((longlong)pppppppuVar8 + 1);
          } while (pppppppuVar8 != pppppppuVar10);
code_r0x7ff70c9208cb:
          lVar4 = *(longlong *)(param_3 + 2) - uVar11;
        }
        for (; lVar4 != 0; lVar4 = lVar4 + -1) {
          while( true ) {
            iVar3 = param_3[1];
            uVar5 = param_2[2];
            if ((ulonglong)param_2[3] <= uVar5) break;
            param_2[2] = uVar5 + 1;
            puVar7 = param_2;
            if (0xf < (ulonglong)param_2[3]) {
              puVar7 = (undefined8 *)*param_2;
            }
            *(char *)((longlong)puVar7 + uVar5) = (char)iVar3;
            *(undefined1 *)((longlong)puVar7 + uVar5 + 1) = 0;
            lVar4 = lVar4 + -1;
            if (lVar4 == 0) {
              return;
            }
          }
          *(undefined **)((longlong)register0x00000020 + -0x60) = &UNK_7ff70c9208ed;
          FUN_7ff70ca31d10(param_2,1);
        }
      }
      else {
        for (lVar4 = uVar5 - uVar11; lVar4 != 0; lVar4 = lVar4 + -1) {
          while( true ) {
            iVar3 = param_3[1];
            uVar5 = param_2[2];
            if ((ulonglong)param_2[3] <= uVar5) break;
            param_2[2] = uVar5 + 1;
            puVar7 = param_2;
            if (0xf < (ulonglong)param_2[3]) {
              puVar7 = (undefined8 *)*param_2;
            }
            *(char *)((longlong)puVar7 + uVar5) = (char)iVar3;
            *(undefined1 *)((longlong)puVar7 + uVar5 + 1) = 0;
            lVar4 = lVar4 + -1;
            if (lVar4 == 0) goto joined_r0x7ff70c9207a9;
          }
          *(undefined **)((longlong)register0x00000020 + -0x60) = &UNK_7ff70c92076d;
          FUN_7ff70ca31d10(param_2,1);
        }
joined_r0x7ff70c9207a9:
        while (pppppppuVar10 != pppppppuVar8) {
          uVar1 = *(undefined1 *)pppppppuVar8;
          uVar5 = param_2[2];
          if (uVar5 < (ulonglong)param_2[3]) {
            param_2[2] = uVar5 + 1;
            puVar7 = param_2;
            if (0xf < (ulonglong)param_2[3]) {
              puVar7 = (undefined8 *)*param_2;
            }
            *(undefined1 *)((longlong)puVar7 + uVar5) = uVar1;
            *(undefined1 *)((longlong)puVar7 + uVar5 + 1) = 0;
            pppppppuVar8 = (undefined8 *******)((longlong)pppppppuVar8 + 1);
          }
          else {
            *(undefined **)((longlong)register0x00000020 + -0x60) = &UNK_7ff70c9207bd;
            FUN_7ff70ca31d10(param_2,1);
            pppppppuVar8 = (undefined8 *******)((longlong)pppppppuVar8 + 1);
          }
        }
      }
    }
    else {
      for (; pppppppuVar10 != pppppppuVar8;
          pppppppuVar8 = (undefined8 *******)((longlong)pppppppuVar8 + 1)) {
        while( true ) {
          uVar1 = *(undefined1 *)pppppppuVar8;
          uVar5 = param_2[2];
          if ((ulonglong)param_2[3] <= uVar5) break;
          param_2[2] = uVar5 + 1;
          puVar7 = param_2;
          if (0xf < (ulonglong)param_2[3]) {
            puVar7 = (undefined8 *)*param_2;
          }
          *(undefined1 *)((longlong)puVar7 + uVar5) = uVar1;
          *(undefined1 *)((longlong)puVar7 + uVar5 + 1) = 0;
          pppppppuVar8 = (undefined8 *******)((longlong)pppppppuVar8 + 1);
          if (pppppppuVar8 == pppppppuVar10) {
            return;
          }
        }
        *(undefined **)((longlong)register0x00000020 + -0x60) = &UNK_7ff70c92081d;
        FUN_7ff70ca31d10(param_2,1);
      }
    }
    return;
  case 4:
    plVar9 = (longlong *)(param_1[1] + *param_1);
    param_1 = (longlong *)*param_1;
    break;
  case 5:
    param_1 = (longlong *)*param_1;
    apuStack_b0[0] = &UNK_7ff70c91ff7b;
    lVar4 = FUN_7ff70cb12e80(param_1);
    plVar9 = (longlong *)(lVar4 + (longlong)param_1);
    break;
  default:
    return;
  }
  uVar11 = (longlong)plVar9 - (longlong)param_1;
  uVar5 = *(ulonglong *)(param_3 + 2);
  if (uVar11 < uVar5) {
    if (*param_3 == 0) {
      if (param_1 == plVar9) {
        lVar4 = uVar5 - uVar11;
      }
      else {
        do {
          while( true ) {
            lVar4 = *param_1;
            uVar5 = param_2[2];
            if ((ulonglong)param_2[3] <= uVar5) break;
            param_2[2] = uVar5 + 1;
            puVar7 = param_2;
            if (0xf < (ulonglong)param_2[3]) {
              puVar7 = (undefined8 *)*param_2;
            }
            *(char *)((longlong)puVar7 + uVar5) = (char)lVar4;
            *(undefined1 *)((longlong)puVar7 + uVar5 + 1) = 0;
            param_1 = (longlong *)((longlong)param_1 + 1);
            if (param_1 == plVar9) goto code_r0x7ff70c9202b5;
          }
          puStack_60 = &UNK_7ff70c9202ad;
          FUN_7ff70ca31d10(param_2,1);
          param_1 = (longlong *)((longlong)param_1 + 1);
        } while (param_1 != plVar9);
code_r0x7ff70c9202b5:
        lVar4 = *(longlong *)(param_3 + 2) - uVar11;
      }
      for (; lVar4 != 0; lVar4 = lVar4 + -1) {
        while( true ) {
          iVar3 = param_3[1];
          uVar5 = param_2[2];
          if ((ulonglong)param_2[3] <= uVar5) break;
          param_2[2] = uVar5 + 1;
          puVar7 = param_2;
          if (0xf < (ulonglong)param_2[3]) {
            puVar7 = (undefined8 *)*param_2;
          }
          *(char *)((longlong)puVar7 + uVar5) = (char)iVar3;
          *(undefined1 *)((longlong)puVar7 + uVar5 + 1) = 0;
          lVar4 = lVar4 + -1;
          if (lVar4 == 0) {
            return;
          }
        }
        puStack_60 = &UNK_7ff70c92030d;
        FUN_7ff70ca31d10(param_2,1);
      }
    }
    else {
      for (lVar4 = uVar5 - uVar11; lVar4 != 0; lVar4 = lVar4 + -1) {
        while( true ) {
          iVar3 = param_3[1];
          uVar5 = param_2[2];
          if ((ulonglong)param_2[3] <= uVar5) break;
          param_2[2] = uVar5 + 1;
          puVar7 = param_2;
          if (0xf < (ulonglong)param_2[3]) {
            puVar7 = (undefined8 *)*param_2;
          }
          *(char *)((longlong)puVar7 + uVar5) = (char)iVar3;
          *(undefined1 *)((longlong)puVar7 + uVar5 + 1) = 0;
          lVar4 = lVar4 + -1;
          if (lVar4 == 0) goto joined_r0x7ff70c9201ff;
        }
        puStack_60 = &UNK_7ff70c9201ad;
        FUN_7ff70ca31d10(param_2,1);
      }
joined_r0x7ff70c9201ff:
      while (param_1 != plVar9) {
        lVar4 = *param_1;
        uVar5 = param_2[2];
        if (uVar5 < (ulonglong)param_2[3]) {
          param_2[2] = uVar5 + 1;
          puVar7 = param_2;
          if (0xf < (ulonglong)param_2[3]) {
            puVar7 = (undefined8 *)*param_2;
          }
          *(char *)((longlong)puVar7 + uVar5) = (char)lVar4;
          *(undefined1 *)((longlong)puVar7 + uVar5 + 1) = 0;
          param_1 = (longlong *)((longlong)param_1 + 1);
        }
        else {
          puStack_60 = &UNK_7ff70c92023d;
          FUN_7ff70ca31d10(param_2,1);
          param_1 = (longlong *)((longlong)param_1 + 1);
        }
      }
    }
  }
  else {
    for (; param_1 != plVar9; param_1 = (longlong *)((longlong)param_1 + 1)) {
      while( true ) {
        lVar4 = *param_1;
        uVar5 = param_2[2];
        if (uVar5 < (ulonglong)param_2[3]) break;
        puStack_60 = &UNK_7ff70c92018d;
        FUN_7ff70ca31d10(param_2,1);
        param_1 = (longlong *)((longlong)param_1 + 1);
        if (param_1 == plVar9) {
          return;
        }
      }
      param_2[2] = uVar5 + 1;
      puVar7 = param_2;
      if (0xf < (ulonglong)param_2[3]) {
        puVar7 = (undefined8 *)*param_2;
      }
      *(char *)((longlong)puVar7 + uVar5) = (char)lVar4;
      *(undefined1 *)((longlong)puVar7 + uVar5 + 1) = 0;
    }
  }
  return;
}


