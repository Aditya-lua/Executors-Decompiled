
/* WARNING: Removing unreachable block (ram,0x00074e54) */
/* WARNING: Removing unreachable block (ram,0x00074e78) */
/* WARNING: Type propagation algorithm not settling */

char * thunk_FUN_00074e44(undefined8 param_1,undefined8 param_2,char *param_3,long param_4)

{
  char *pcVar1;
  undefined8 *puVar2;
  char cVar3;
  char *pcVar4;
  char *pcVar5;
  code *pcVar6;
  undefined8 uVar7;
  char *pcVar8;
  char *******pppppppcVar9;
  char *pcVar10;
  ulong uVar11;
  undefined8 unaff_x19;
  undefined1 auVar12 [16];
  undefined8 in_stack_00000040;
  undefined8 uStack_60;
  ulong uStack_58;
  undefined7 uStack_50;
  byte bStack_49;
  char *******pppppppcStack_48;
  ulong uStack_40;
  byte bStack_31;
  
  __ZdlPv(in_stack_00000040);
  auVar12 = __Unwind_Resume(unaff_x19);
  pcVar8 = auVar12._8_8_;
  if ((1 < (long)param_3 - (long)pcVar8) && (pcVar8 + ((long)param_3 - (long)pcVar8) + -1 != pcVar8)
     ) {
    pcVar10 = param_3 + -2;
    cVar3 = *pcVar8;
    pcVar1 = pcVar8;
    pcVar5 = pcVar8;
    while ((pcVar4 = pcVar5 + 1, cVar3 != '=' || (*pcVar4 != ']'))) {
      if (pcVar8 == pcVar10) goto LAB_000750b4;
      pcVar1 = pcVar1 + 1;
      pcVar10 = pcVar10 + -1;
      cVar3 = *pcVar4;
      pcVar5 = pcVar4;
    }
    if (pcVar5 != param_3) {
      func_0x000758a0(&pppppppcStack_48,auVar12._0_8_,pcVar8,pcVar1,0);
      if ((char)bStack_31 < '\0') {
        if (uStack_40 == 0) goto LAB_000750b8;
        pppppppcVar9 = pppppppcStack_48;
        uVar11 = uStack_40;
      }
      else {
        if (bStack_31 == 0) goto LAB_000750b8;
        pppppppcVar9 = (char *******)&pppppppcStack_48;
        uVar11 = (ulong)bStack_31;
      }
      func_0x00032384(&uStack_60,auVar12._0_8_,pppppppcVar9,(char *)((long)pppppppcVar9 + uVar11),0)
      ;
      uVar11 = uStack_58;
      if (-1 < (char)bStack_49) {
        uVar11 = (ulong)bStack_49;
      }
      if (uVar11 == 0) {
        if (-1 < (char)bStack_31) {
          uStack_40 = (ulong)bStack_31;
        }
        if (uStack_40 == 2) {
          pppppppcVar9 = pppppppcStack_48;
          if (-1 < (char)bStack_31) {
            pppppppcVar9 = (char *******)&pppppppcStack_48;
          }
          func_0x00031cc4(param_4,(long)*(char *)pppppppcVar9,
                          (long)*(char *)((long)pppppppcVar9 + 1));
        }
        else {
          if (uStack_40 != 1) {
            func_0x000320a4();
            goto LAB_000750c4;
          }
          pppppppcVar9 = pppppppcStack_48;
          if (-1 < (char)bStack_31) {
            pppppppcVar9 = (char *******)&pppppppcStack_48;
          }
          func_0x0002f0ac(param_4,(long)*(char *)pppppppcVar9);
        }
      }
      else {
        puVar2 = *(undefined8 **)(param_4 + 0x90);
        if (puVar2 < *(undefined8 **)(param_4 + 0x98)) {
          if ((char)bStack_49 < '\0') {
            func_0x00017634(puVar2,uStack_60);
          }
          else {
            puVar2[2] = CONCAT17(bStack_49,uStack_50);
            puVar2[1] = uStack_58;
            *puVar2 = uStack_60;
          }
          *(undefined8 **)(param_4 + 0x90) = puVar2 + 3;
          *(undefined8 **)(param_4 + 0x90) = puVar2 + 3;
        }
        else {
          uVar7 = func_0x00032578(param_4 + 0x88,&uStack_60);
          *(undefined8 *)(param_4 + 0x90) = uVar7;
        }
      }
      if ((char)bStack_49 < '\0') {
        __ZdlPv(uStack_60);
      }
      if ((char)bStack_31 < '\0') {
        __ZdlPv(pppppppcStack_48);
        return pcVar1 + 2;
      }
      return pcVar1 + 2;
    }
  }
LAB_000750b4:
  func_0x00030890();
LAB_000750b8:
  func_0x000320a4();
LAB_000750c4:
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x750c8);
  (*pcVar6)();
}

