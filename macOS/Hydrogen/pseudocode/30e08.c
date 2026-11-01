
/* WARNING: Removing unreachable block (ram,0x00030e14) */
/* WARNING: Removing unreachable block (ram,0x00030e24) */
/* WARNING: Type propagation algorithm not settling */

char * FUN_00030e08(undefined8 param_1,undefined8 param_2,char *param_3,long param_4)

{
  char *pcVar1;
  undefined8 *puVar2;
  char cVar3;
  code *pcVar4;
  undefined8 uVar5;
  char *pcVar6;
  char *******pppppppcVar7;
  int in_w8;
  ulong uVar8;
  long lVar9;
  undefined8 unaff_x19;
  long lVar10;
  undefined1 auVar11 [16];
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000040;
  long in_stack_00000050;
  undefined8 uStack_60;
  ulong uStack_58;
  undefined7 uStack_50;
  byte bStack_49;
  char *******pppppppcStack_48;
  ulong uStack_40;
  byte bStack_31;
  
  if (in_w8 < 0) {
    __ZdlPv(in_stack_00000020);
  }
  while (in_stack_00000050 < 0) {
    __ZdlPv(in_stack_00000040);
    unaff_x19 = __Unwind_Resume(unaff_x19);
  }
  auVar11 = __Unwind_Resume(unaff_x19);
  pcVar6 = auVar11._8_8_;
  lVar9 = (long)param_3 - (long)pcVar6;
  if ((1 < lVar9) && (pcVar6 + lVar9 + -1 != pcVar6)) {
    lVar10 = 0;
    cVar3 = *pcVar6;
    pcVar1 = pcVar6;
    while ((cVar3 != '=' || (pcVar1[1] != ']'))) {
      if (lVar9 + -2 == lVar10) goto code_r0x0003106c;
      lVar10 = lVar10 + 1;
      pcVar1 = pcVar6 + lVar10;
      cVar3 = *pcVar1;
    }
    if (pcVar6 + lVar10 != param_3) {
      func_0x000320f0(&pppppppcStack_48,auVar11._0_8_,pcVar6,pcVar6 + lVar10,0);
      if ((char)bStack_31 < '\0') {
        if (uStack_40 == 0) goto code_r0x00031070;
        pppppppcVar7 = pppppppcStack_48;
        uVar8 = uStack_40;
      }
      else {
        if (bStack_31 == 0) goto code_r0x00031070;
        pppppppcVar7 = (char *******)&pppppppcStack_48;
        uVar8 = (ulong)bStack_31;
      }
      func_0x00032384(&uStack_60,auVar11._0_8_,pppppppcVar7,(char *)((long)pppppppcVar7 + uVar8),0);
      uVar8 = uStack_58;
      if (-1 < (char)bStack_49) {
        uVar8 = (ulong)bStack_49;
      }
      if (uVar8 == 0) {
        if (-1 < (char)bStack_31) {
          uStack_40 = (ulong)bStack_31;
        }
        if (uStack_40 == 2) {
          pppppppcVar7 = pppppppcStack_48;
          if (-1 < (char)bStack_31) {
            pppppppcVar7 = (char *******)&pppppppcStack_48;
          }
          func_0x00031cc4(param_4,(long)*(char *)pppppppcVar7,
                          (long)*(char *)((long)pppppppcVar7 + 1));
        }
        else {
          if (uStack_40 != 1) {
            func_0x000320a4();
            goto code_r0x0003107c;
          }
          pppppppcVar7 = pppppppcStack_48;
          if (-1 < (char)bStack_31) {
            pppppppcVar7 = (char *******)&pppppppcStack_48;
          }
          func_0x0002f0ac(param_4,(long)*(char *)pppppppcVar7);
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
          uVar5 = func_0x00032578(param_4 + 0x88,&uStack_60);
          *(undefined8 *)(param_4 + 0x90) = uVar5;
        }
      }
      if ((char)bStack_49 < '\0') {
        __ZdlPv(uStack_60);
      }
      if ((char)bStack_31 < '\0') {
        __ZdlPv(pppppppcStack_48);
      }
      return pcVar6 + lVar10 + 2;
    }
  }
code_r0x0003106c:
  func_0x00030890();
code_r0x00031070:
  func_0x000320a4();
code_r0x0003107c:
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x31080);
  (*pcVar4)();
}

