
void FUN_006bacf8(undefined1 param_1 [16])

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  undefined8 *puVar5;
  int *piVar6;
  int iVar7;
  int iVar8;
  undefined8 *puVar9;
  long lVar10;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  int *unaff_x23;
  int *piVar11;
  ulong unaff_x24;
  int *unaff_x26;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 *in_stack_00000000;
  int in_stack_00000010;
  undefined8 *in_stack_00000018;
  ulong in_stack_00000020;
  ulong in_stack_00000028;
  
  *(long *)(unaff_x21 + 0x10) = param_1._8_8_;
  *(long *)(unaff_x21 + 8) = param_1._0_8_;
  *(undefined1 *)((long)unaff_x23 + 0x1f) = 0;
  *(undefined1 *)(unaff_x23 + 2) = 0;
  if ((long)unaff_x24 <= unaff_x22) {
    do {
      lVar10 = unaff_x24 * 2;
      unaff_x24 = unaff_x24 << 1 | 1;
      piVar11 = (int *)(unaff_x20 + unaff_x24 * 0x20);
      uVar1 = lVar10 + 2;
      if ((long)uVar1 < unaff_x19) {
        iVar7 = piVar11[8];
        if (*piVar11 == iVar7) {
          lVar10 = unaff_x20 + unaff_x24 * 0x20;
          puVar9 = (undefined8 *)(lVar10 + 8);
          uVar3 = *(ulong *)(lVar10 + 0x10);
          puVar5 = (undefined8 *)*puVar9;
          if (-1 < (char)*(byte *)((long)piVar11 + 0x1f)) {
            uVar3 = (ulong)*(byte *)((long)piVar11 + 0x1f);
            puVar5 = puVar9;
          }
          uVar4 = *(ulong *)(piVar11 + 0xc);
          piVar6 = *(int **)(piVar11 + 10);
          if (-1 < (char)*(byte *)((long)piVar11 + 0x3f)) {
            uVar4 = (ulong)*(byte *)((long)piVar11 + 0x3f);
            piVar6 = piVar11 + 10;
          }
          uVar2 = uVar4;
          if (uVar3 <= uVar4) {
            uVar2 = uVar3;
          }
          iVar7 = _memcmp(puVar5,piVar6,uVar2);
          if (iVar7 == 0) {
            if (uVar3 < uVar4) goto LAB_006bae14;
          }
          else if (iVar7 < 0) {
LAB_006bae14:
            piVar11 = piVar11 + 8;
            unaff_x24 = uVar1;
          }
        }
        else if (*piVar11 < iVar7) goto LAB_006bae14;
      }
      iVar7 = *piVar11;
      if (iVar7 == in_stack_00000010) {
        uVar1 = *(ulong *)(piVar11 + 4);
        piVar6 = *(int **)(piVar11 + 2);
        if (-1 < (char)*(byte *)((long)piVar11 + 0x1f)) {
          uVar1 = (ulong)*(byte *)((long)piVar11 + 0x1f);
          piVar6 = piVar11 + 2;
        }
        uVar3 = in_stack_00000020;
        puVar5 = in_stack_00000018;
        if (-1 < (long)in_stack_00000028) {
          uVar3 = in_stack_00000028 >> 0x38;
          puVar5 = in_stack_00000000;
        }
        uVar4 = uVar3;
        if (uVar1 <= uVar3) {
          uVar4 = uVar1;
        }
        iVar8 = _memcmp(piVar6,puVar5,uVar4);
        if (iVar8 == 0) {
          if (uVar1 < uVar3) break;
        }
        else if (iVar8 < 0) break;
      }
      else if (iVar7 < in_stack_00000010) break;
      *unaff_x23 = iVar7;
      unaff_x26 = piVar11 + 2;
      uVar13 = *(undefined8 *)(piVar11 + 4);
      uVar12 = *(undefined8 *)(piVar11 + 2);
      *(undefined8 *)(unaff_x23 + 6) = *(undefined8 *)(piVar11 + 6);
      *(undefined8 *)(unaff_x23 + 4) = uVar13;
      *(undefined8 *)(unaff_x23 + 2) = uVar12;
      *(undefined1 *)((long)piVar11 + 0x1f) = 0;
      *(undefined1 *)(piVar11 + 2) = 0;
      unaff_x23 = piVar11;
    } while ((long)unaff_x24 <= unaff_x22);
  }
  *unaff_x23 = in_stack_00000010;
  uVar13 = in_stack_00000000[1];
  uVar12 = *in_stack_00000000;
  *(undefined8 *)(unaff_x26 + 4) = in_stack_00000000[2];
  *(undefined8 *)(unaff_x26 + 2) = uVar13;
  *(undefined8 *)unaff_x26 = uVar12;
  return;
}

