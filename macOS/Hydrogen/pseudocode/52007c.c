
long * FUN_0052007c(long *param_1,long *param_2)

{
  undefined8 *puVar1;
  byte bVar2;
  byte bVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long *plVar7;
  undefined *puVar8;
  int *in_x9;
  undefined8 *puVar9;
  byte *pbVar10;
  int *in_x11;
  int *piVar11;
  undefined *puVar12;
  byte *pbVar13;
  undefined8 uVar14;
  undefined1 auVar15 [16];
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
  do {
    piVar11 = in_x11;
    if (piVar11 == in_x9) {
      *param_2 = (long)piVar11;
      uStack0000000000000008 = -0x8000000000000000;
      goto LAB_00520114;
    }
    in_x11 = piVar11 + 8;
  } while (*piVar11 != 1);
  *param_2 = (long)(piVar11 + 8);
  param_2 = (long *)func_0x0045b558(&uStack0000000000000008,*(undefined8 *)(piVar11 + 2),
                                    *(undefined8 *)(piVar11 + 4));
  lVar5 = in_stack_00000018;
  lVar4 = in_stack_00000010;
  lVar6 = in_stack_00000010;
  if (uStack0000000000000008 == -0x8000000000000000) {
    if (in_stack_00000018 < 0) {
      uVar14 = 0;
code_r0x00520134:
      puVar8 = &UNK_009e9838;
      auVar15 = func_0x007a1f00(uVar14,lVar5);
      plVar7 = auVar15._0_8_;
      puVar9 = (undefined8 *)*plVar7;
      if ((undefined8 *)*plVar7 == (undefined8 *)plVar7[1]) {
        return (long *)0x0;
      }
      do {
        puVar1 = puVar9 + 2;
        if ((undefined *)puVar9[1] == puVar8) {
          pbVar10 = (byte *)*puVar9;
          puVar12 = puVar8;
          pbVar13 = auVar15._8_8_;
          do {
            if (puVar12 == (undefined *)0x0) {
              *plVar7 = (long)puVar1;
              return (long *)((long)&MACH_HEADER.magic + 1);
            }
            bVar2 = *pbVar10;
            puVar12 = puVar12 + -1;
            bVar3 = *pbVar13;
            pbVar10 = pbVar10 + 1;
            pbVar13 = pbVar13 + 1;
          } while (((uint)bVar2 | (uint)(bVar2 - 0x41 < 0x1a) << 5) ==
                   ((uint)bVar3 | (uint)(bVar3 - 0x41 < 0x1a) << 5));
        }
        puVar9 = puVar1;
      } while (puVar1 != (undefined8 *)plVar7[1]);
      *plVar7 = (long)puVar1;
      return (long *)0x0;
    }
    if (in_stack_00000018 == 0) {
      lVar6 = 1;
    }
    else {
      uVar14 = 1;
      lVar6 = func_0x00187bd0(in_stack_00000018,1);
      if (lVar6 == 0) goto code_r0x00520134;
    }
    param_2 = (long *)_memcpy(lVar6,lVar4,lVar5);
    uStack0000000000000008 = lVar5;
  }
  param_1[1] = lVar6;
  param_1[2] = lVar5;
LAB_00520114:
  *param_1 = uStack0000000000000008;
  return param_2;
}

