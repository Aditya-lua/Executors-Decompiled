
void FUN_0011c910(long param_1,undefined8 param_2,qword *param_3,qword *param_4,qword *param_5,
                 qword *param_6,uint param_7,undefined8 param_8,undefined8 param_9,qword param_10)

{
  undefined8 *puVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  ulong uVar5;
  qword *pqVar6;
  qword *pqVar7;
  long lVar8;
  qword *pqVar9;
  long unaff_x27;
  float fVar10;
  float fVar11;
  float fVar12;
  undefined1 auVar13 [16];
  long in_stack_00000048;
  undefined8 uStack_18;
  
  lVar8 = *(long *)(unaff_x27 + 0x4000);
  *(undefined1 *)(lVar8 + 0xc0) = 1;
  pqVar9 = param_4;
  if (*(char *)(lVar8 + 0xc3) == '\0') {
    pqVar9 = param_6;
    if (param_6 == (qword *)0x0) {
      pqVar9 = *(qword **)(&UNK_009bae38 + (long)(int)param_2 * 0x20);
    }
    func_0x0010fdc0(&param_10,0x40,param_2,param_3,pqVar9);
    param_6 = (qword *)(ulong)(param_7 | 0x8000010);
    if (param_4 == (qword *)0x0) {
      param_9 = 0;
      pqVar6 = &param_10;
      pqVar7 = &segment_command_00000020.vmsize;
      param_5 = (qword *)register0x00000008;
      iVar3 = func_0x00119cac(param_1,0,pqVar6,0x40);
      uVar4 = 0;
      if (iVar3 == 0) goto LAB_0011c928;
      uVar5 = func_0x00110318(&param_10,param_2,param_3,pqVar9);
      if ((uVar5 & 1) == 0) goto LAB_0011c924;
    }
    else {
      puVar1 = (undefined8 *)(&UNK_00003924 + unaff_x27);
      fVar10 = (float)func_0x000d89d0();
      func_0x000d8a9c();
      func_0x000d4e10(param_1);
      fVar11 = (float)func_0x000d890c();
      fVar11 = fVar11 + (fVar10 + *(float *)(&UNK_0000393c + unaff_x27)) * -2.0;
      fVar12 = 1.0;
      if (1.0 < fVar11) {
        fVar12 = fVar11;
      }
      func_0x000ba248(fVar12);
      param_9 = 0;
      pqVar7 = &segment_command_00000020.vmsize;
      pqVar6 = (qword *)register0x00000008;
      iVar2 = func_0x00119cac("",0,&param_10,0x40);
      iVar3 = 0;
      if (iVar2 != 0) {
        iVar3 = func_0x00110318(&param_10,param_2,param_3,pqVar9);
        pqVar7 = pqVar9;
      }
      uVar4 = *puVar1;
      *(int *)puVar1 = (int)((ulong)uVar4 >> 0x20);
      if ((param_7 >> 0xe & 1) != 0) {
        func_0x000d3674(1);
      }
      func_0x000d8444(0,*(undefined4 *)(&UNK_0000393c + unaff_x27));
      param_9 = CONCAT44(fVar10,fVar10);
      iVar2 = func_0x0010bcb0("-");
      if (iVar2 != 0) {
        pqVar6 = param_5;
        if (*(char *)(unaff_x27 + 0xe5c) == '\0' || param_5 == (qword *)0x0) {
          pqVar6 = param_4;
        }
        pqVar7 = param_3;
        func_0x0010ff18(param_2,0x2d,param_3,param_3,pqVar6);
        iVar3 = 1;
      }
      func_0x000d8444(0,*(undefined4 *)(&UNK_0000393c + unaff_x27));
      param_9 = CONCAT44(fVar10,fVar10);
      pqVar9 = (qword *)&UNK_00002400;
      iVar2 = func_0x0010bcb0("+");
      if (iVar2 == 0) {
        if ((param_7 >> 0xe & 1) == 0) goto LAB_0011cb28;
LAB_0011cb08:
        func_0x000d373c();
        lVar8 = func_0x000bc0e8(param_1,0);
        param_3 = pqVar9;
        pqVar9 = pqVar7;
        param_5 = pqVar6;
      }
      else {
        pqVar6 = param_5;
        if (*(char *)(unaff_x27 + 0xe5c) == '\0' || param_5 == (qword *)0x0) {
          pqVar6 = param_4;
        }
        pqVar7 = param_3;
        func_0x0010ff18(param_2,0x2b,param_3,param_3,pqVar6);
        iVar3 = 1;
        pqVar9 = param_3;
        if ((param_7 >> 0xe & 1) != 0) goto LAB_0011cb08;
LAB_0011cb28:
        lVar8 = func_0x000bc0e8(param_1,0);
        param_3 = pqVar9;
        pqVar9 = pqVar7;
        param_5 = pqVar6;
      }
      if (lVar8 != param_1) {
        func_0x000d8444(0,*(undefined4 *)(&UNK_0000393c + unaff_x27));
        param_3 = (qword *)0x0;
        func_0x0010aa24(param_1,lVar8,0);
      }
      *puVar1 = uVar4;
      func_0x000d53d0();
      func_0x000d818c();
      if (iVar3 == 0) goto LAB_0011c924;
    }
    func_0x000c255c(*(undefined4 *)(&UNK_000049a8 + unaff_x27));
    uVar4 = 1;
    pqVar6 = param_3;
    pqVar7 = pqVar9;
  }
  else {
LAB_0011c924:
    uVar4 = 0;
    pqVar6 = param_3;
    pqVar7 = pqVar9;
  }
LAB_0011c928:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000048) {
    return;
  }
  auVar13 = ___stack_chk_fail(uVar4);
  uStack_18 = 0;
  func_0x00119cac(auVar13._0_8_,0,auVar13._8_8_,pqVar6,&uStack_18,pqVar7,param_5,param_6);
  return;
}

