
char * FUN_00072d6c(code *param_1,undefined8 param_2,undefined8 param_3,char *param_4)

{
  int iVar1;
  long lVar2;
  char *pcVar3;
  undefined8 *puVar4;
  char *pcVar5;
  char *pcVar6;
  long lVar7;
  undefined8 uVar8;
  long lVar9;
  long lVar10;
  undefined1 auVar11 [16];
  
  (*param_1)();
  auVar11 = __Unwind_Resume();
  lVar2 = auVar11._0_8_;
  lVar9 = *(long *)(lVar2 + 0x38);
  pcVar3 = auVar11._8_8_;
  do {
    pcVar5 = pcVar3;
    pcVar3 = (char *)func_0x00073638(lVar2,pcVar5,param_4);
    if (pcVar5 == pcVar3) {
      uVar8 = *(undefined8 *)(lVar2 + 0x38);
      iVar1 = *(int *)(lVar2 + 0x1c);
      pcVar3 = (char *)func_0x0007395c(lVar2,pcVar5,param_4);
      if (pcVar5 == pcVar3) break;
      pcVar3 = (char *)func_0x00073bc4(lVar2,pcVar3,param_4,uVar8,iVar1 + 1,
                                       *(int *)(lVar2 + 0x1c) + 1);
    }
  } while (pcVar3 != pcVar5);
  if (pcVar5 == auVar11._8_8_) {
    puVar4 = (undefined8 *)__Znwm(0x10);
    lVar10 = *(long *)(lVar2 + 0x38);
    uVar8 = *(undefined8 *)(lVar10 + 8);
    *puVar4 = &UNK_009b2fd8;
    puVar4[1] = uVar8;
    *(undefined8 **)(lVar10 + 8) = puVar4;
    *(undefined8 *)(lVar2 + 0x38) = *(undefined8 *)(*(long *)(lVar2 + 0x38) + 8);
  }
  do {
    if (pcVar5 == param_4) {
      return param_4;
    }
    if (*pcVar5 != '|') {
      return pcVar5;
    }
    lVar10 = *(long *)(lVar2 + 0x38);
    pcVar3 = pcVar5 + 1;
    pcVar6 = pcVar3;
    do {
      pcVar5 = pcVar6;
      pcVar6 = (char *)func_0x00073638(lVar2,pcVar5,param_4);
      if (pcVar5 == pcVar6) {
        uVar8 = *(undefined8 *)(lVar2 + 0x38);
        iVar1 = *(int *)(lVar2 + 0x1c);
        pcVar6 = (char *)func_0x0007395c(lVar2,pcVar5,param_4);
        if (pcVar5 == pcVar6) break;
        pcVar6 = (char *)func_0x00073bc4(lVar2,pcVar6,param_4,uVar8,iVar1 + 1,
                                         *(int *)(lVar2 + 0x1c) + 1);
      }
    } while (pcVar6 != pcVar5);
    if (pcVar5 == pcVar3) {
      puVar4 = (undefined8 *)__Znwm(0x10);
      lVar7 = *(long *)(lVar2 + 0x38);
      uVar8 = *(undefined8 *)(lVar7 + 8);
      *puVar4 = &UNK_009b2fd8;
      puVar4[1] = uVar8;
      *(undefined8 **)(lVar7 + 8) = puVar4;
      *(undefined8 *)(lVar2 + 0x38) = *(undefined8 *)(*(long *)(lVar2 + 0x38) + 8);
    }
    puVar4 = (undefined8 *)__Znwm(0x18);
    uVar8 = *(undefined8 *)(lVar10 + 8);
    puVar4[1] = *(undefined8 *)(lVar9 + 8);
    puVar4[2] = uVar8;
    *puVar4 = &UNK_009b3548;
    *(undefined8 **)(lVar9 + 8) = puVar4;
    *(undefined8 *)(lVar10 + 8) = 0;
    puVar4 = (undefined8 *)__Znwm(0x10);
    uVar8 = *(undefined8 *)(*(long *)(lVar2 + 0x38) + 8);
    *puVar4 = &UNK_009b2fd8;
    puVar4[1] = uVar8;
    *(undefined8 **)(lVar10 + 8) = puVar4;
    *(undefined8 *)(*(long *)(lVar2 + 0x38) + 8) = 0;
    puVar4 = (undefined8 *)__Znwm(0x10);
    uVar8 = *(undefined8 *)(lVar10 + 8);
    *puVar4 = &UNK_009b3590;
    puVar4[1] = uVar8;
    *(undefined8 **)(*(long *)(lVar2 + 0x38) + 8) = puVar4;
    *(undefined8 *)(lVar2 + 0x38) = *(undefined8 *)(lVar10 + 8);
  } while( true );
}

