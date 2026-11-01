
void FUN_0026c524(long param_1,undefined1 param_2 [16])

{
  char cVar1;
  long lVar2;
  long lVar3;
  undefined1 *puVar4;
  int iVar5;
  undefined1 uVar6;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x22;
  ulong uVar7;
  ulong unaff_x24;
  undefined1 *puVar8;
  long lVar9;
  undefined8 extraout_d0;
  undefined8 uVar10;
  undefined8 extraout_var;
  undefined8 uVar11;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  long in_stack_00000010;
  
  uVar11 = param_2._8_8_;
  uVar10 = param_2._0_8_;
code_r0x0026c524:
  do {
    uVar6 = 0;
    if (in_stack_00000010 == 0) goto LAB_0026c570;
    unaff_x22 = *(long *)(unaff_x22 + unaff_x24 * 8 + 0x380);
    in_stack_00000010 = in_stack_00000010 + -1;
    unaff_x24 = (ulong)*(ushort *)(unaff_x22 + 0x37a);
    lVar9 = unaff_x24 * 0x18;
    uVar7 = 0xffffffffffffffff;
    param_1 = unaff_x22 + 8;
    puVar4 = (undefined1 *)(unaff_x22 + 0x108);
    do {
      puVar8 = puVar4;
      if (lVar9 == 0) goto code_r0x0026c524;
      lVar2 = param_1 + 0x18;
      lVar3 = *(long *)(param_1 + 0x10);
      iVar5 = _memcmp();
      lVar3 = unaff_x20 - lVar3;
      if (iVar5 != 0) {
        lVar3 = (long)iVar5;
      }
      cVar1 = 0 < lVar3;
      if (lVar3 < 0) {
        cVar1 = -1;
      }
      lVar9 = lVar9 + -0x18;
      uVar7 = uVar7 + 1;
      param_1 = lVar2;
      puVar4 = puVar8 + 0x38;
      uVar10 = extraout_d0;
      uVar11 = extraout_var;
    } while (cVar1 == '\x01');
    unaff_x24 = uVar7;
  } while (cVar1 != '\0');
  param_1 = *(long *)(puVar8 + 0x20);
  uVar11 = *(undefined8 *)(puVar8 + 0x30);
  uVar10 = *(undefined8 *)(puVar8 + 0x28);
  uVar6 = puVar8[0x38];
  in_stack_00000008 = *(undefined8 *)(puVar8 + 0x10);
  in_stack_00000000 = *(undefined8 *)(puVar8 + 8);
LAB_0026c570:
  unaff_x19[2] = in_stack_00000008;
  unaff_x19[1] = in_stack_00000000;
  unaff_x19[3] = param_1;
  unaff_x19[5] = uVar11;
  unaff_x19[4] = uVar10;
  *(undefined1 *)(unaff_x19 + 6) = uVar6;
  *unaff_x19 = 0x800000000000002c;
  return;
}

