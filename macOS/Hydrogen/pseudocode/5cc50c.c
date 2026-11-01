
undefined8 FUN_005cc50c(long param_1)

{
  char *pcVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 extraout_x1;
  long lVar4;
  undefined8 *unaff_x20;
  long *plVar5;
  undefined8 uVar6;
  long lVar7;
  long lVar8;
  undefined8 *puVar10;
  undefined8 *puVar9;
  char in_wzr;
  long in_stack_00000008;
  undefined8 *in_stack_00000010;
  
  if (param_1 != 0) {
    puVar9 = in_stack_00000010;
    do {
      puVar10 = puVar9 + 1;
      plVar5 = (long *)*puVar9;
      iVar2 = func_0x005ccb98(plVar5);
      if (iVar2 != 0) {
        uVar6 = 1;
        if (in_stack_00000008 == 0) {
          return 1;
        }
        goto code_r0x005cc5ec;
      }
      if (*plVar5 == 10) {
        lVar8 = plVar5[4];
        pcVar1 = (char *)(lVar8 + 8);
        if (*pcVar1 == '\0') {
          *pcVar1 = '\x01';
        }
        else {
          func_0x007aff64(pcVar1,extraout_x1,1000000000);
        }
        uVar6 = *unaff_x20;
        if (*(long *)(lVar8 + 0x20) != 0) {
          lVar7 = *(long *)(lVar8 + 0x18);
          lVar4 = *(long *)(lVar8 + 0x20) << 3;
          do {
            func_0x005d5ff8(uVar6,&UNK_008b598d,1,lVar7);
            lVar7 = lVar7 + 8;
            lVar4 = lVar4 + -8;
          } while (lVar4 != 0);
        }
        func_0x005d6394(uVar6,lVar8 + 0x28);
        if (*pcVar1 == '\x01') {
          *pcVar1 = in_wzr;
        }
        else {
          func_0x007b05dc(pcVar1,0);
        }
      }
      puVar9 = puVar10;
    } while (puVar10 != in_stack_00000010 + param_1);
  }
  uVar3 = 0;
  uVar6 = 0;
  if (in_stack_00000008 != 0) {
code_r0x005cc5ec:
    uVar3 = uVar6;
    func_0x00187bd4(in_stack_00000010,in_stack_00000008 << 3,8);
  }
  return uVar3;
}

