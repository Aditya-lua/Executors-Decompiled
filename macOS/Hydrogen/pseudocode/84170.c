
undefined1  [16] FUN_00084170(long param_1)

{
  undefined1 uVar1;
  undefined1 uVar2;
  code *pcVar3;
  long *plVar4;
  ulong uVar5;
  undefined8 *puVar6;
  char *pcVar7;
  undefined1 *puVar8;
  long in_x9;
  ulong uVar9;
  long *unaff_x19;
  undefined8 uVar10;
  long lVar11;
  long unaff_x29;
  undefined1 auVar12 [16];
  undefined8 uStack0000000000000000;
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  
  *(int *)(unaff_x29 + -0x14) = (int)((ulong)(param_1 - in_x9) >> 3);
  *(undefined1 *)(unaff_x29 + -0x15) = 5;
  plVar4 = (long *)unaff_x19[0xf];
  if (plVar4 == (long *)0x0) {
    func_0x00056004();
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x84324);
    (*pcVar3)();
  }
  uVar5 = (**(code **)(*plVar4 + 0x30))
                    (plVar4,unaff_x29 + -0x14,unaff_x29 + -0x15,&uStack0000000000000028);
  uVar10 = uStack0000000000000030;
  uVar2 = (undefined1)uStack0000000000000028;
  if ((uVar5 & 1) == 0) {
LAB_000842c0:
    uVar10 = 0;
    lVar11 = 0;
  }
  else {
    if (unaff_x19[1] == unaff_x19[2]) {
      uStack0000000000000028._0_1_ = 0;
      uStack0000000000000030 = 0;
      puVar8 = (undefined1 *)*unaff_x19;
      uVar1 = *puVar8;
      *puVar8 = uVar2;
      uStack0000000000000010 = CONCAT71(uStack0000000000000028._1_7_,uVar1);
      in_stack_00000018 = *(undefined8 *)(puVar8 + 8);
      *(undefined8 *)(puVar8 + 8) = uVar10;
      func_0x00078220((ulong)&uStack0000000000000010 | 8);
      lVar11 = *unaff_x19;
    }
    else {
      pcVar7 = *(char **)(unaff_x19[2] + -8);
      if (pcVar7 == (char *)0x0) goto LAB_000842c0;
      if (*pcVar7 == '\x02') {
        lVar11 = *(long *)(pcVar7 + 8);
        puVar6 = *(undefined8 **)(lVar11 + 8);
        if (puVar6 < *(undefined8 **)(lVar11 + 0x10)) {
          puVar6[1] = uStack0000000000000030;
          *puVar6 = CONCAT71(uStack0000000000000028._1_7_,(undefined1)uStack0000000000000028);
          uStack0000000000000028._0_1_ = 0;
          uStack0000000000000030 = 0;
          puVar6 = puVar6 + 2;
        }
        else {
          puVar6 = (undefined8 *)func_0x00082e88(lVar11,&uStack0000000000000028);
        }
        *(undefined8 **)(lVar11 + 8) = puVar6;
        lVar11 = *(long *)(*(long *)(*(long *)(unaff_x19[2] + -8) + 8) + 8) + -0x10;
      }
      else {
        uVar5 = unaff_x19[8] - 1;
        uVar9 = *(ulong *)(unaff_x19[7] + (uVar5 >> 3 & 0x1ffffffffffffff8));
        unaff_x19[8] = uVar5;
        if ((uVar9 >> (uVar5 & 0x3f) & 1) == 0) goto LAB_000842c0;
        uStack0000000000000028._0_1_ = 0;
        uStack0000000000000030 = 0;
        puVar8 = (undefined1 *)unaff_x19[10];
        uVar1 = *puVar8;
        *puVar8 = uVar2;
        uStack0000000000000000 = CONCAT71(uStack0000000000000028._1_7_,uVar1);
        in_stack_00000008 = *(undefined8 *)(puVar8 + 8);
        *(undefined8 *)(puVar8 + 8) = uVar10;
        func_0x00078220((ulong)&uStack0000000000000000 | 8);
        lVar11 = unaff_x19[10];
      }
    }
    uVar10 = 1;
  }
  func_0x00078220(&uStack0000000000000030,(undefined1)uStack0000000000000028);
  auVar12._8_8_ = lVar11;
  auVar12._0_8_ = uVar10;
  return auVar12;
}

