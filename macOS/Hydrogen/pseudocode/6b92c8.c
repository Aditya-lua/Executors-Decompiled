
void FUN_006b92c8(int *param_1,int *param_2)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  int iVar4;
  byte bVar5;
  int *piVar6;
  undefined8 *puVar7;
  long *plVar8;
  int iVar9;
  int iVar10;
  int *piVar11;
  long *plVar12;
  long lVar13;
  int *piVar14;
  long lVar15;
  int *piVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  int *piStack0000000000000000;
  undefined8 *puStack0000000000000008;
  undefined8 uStack0000000000000018;
  ulong in_stack_00000020;
  undefined8 in_stack_00000028;
  
  if (param_1 + 8 != param_2) {
    lVar13 = 0;
    puStack0000000000000008 = &uStack0000000000000018;
    piVar16 = param_1 + 8;
    piVar14 = param_1;
    piStack0000000000000000 = param_2;
    do {
      piVar11 = piVar16;
      iVar4 = piVar14[8];
      if (iVar4 == *piVar14) {
        uVar1 = *(ulong *)(piVar14 + 0xc);
        piVar16 = *(int **)(piVar14 + 10);
        if (-1 < (char)*(byte *)((long)piVar14 + 0x3f)) {
          uVar1 = (ulong)*(byte *)((long)piVar14 + 0x3f);
          piVar16 = piVar14 + 10;
        }
        uVar2 = *(ulong *)(piVar14 + 4);
        piVar6 = *(int **)(piVar14 + 2);
        if (-1 < (char)*(byte *)((long)piVar14 + 0x1f)) {
          uVar2 = (ulong)*(byte *)((long)piVar14 + 0x1f);
          piVar6 = piVar14 + 2;
        }
        uVar3 = uVar2;
        if (uVar1 <= uVar2) {
          uVar3 = uVar1;
        }
        iVar9 = _memcmp(piVar16,piVar6,uVar3);
        if (iVar9 == 0) {
          if (uVar1 < uVar2) goto LAB_006b93b8;
        }
        else if (iVar9 < 0) {
LAB_006b93b8:
          uVar17 = *(undefined8 *)(piVar14 + 10);
          puStack0000000000000008[1] = *(undefined8 *)(piVar14 + 0xc);
          *puStack0000000000000008 = uVar17;
          puStack0000000000000008[2] = *(undefined8 *)(piVar14 + 0xe);
          piVar14[10] = 0;
          piVar14[0xb] = 0;
          piVar14[0xc] = 0;
          piVar14[0xd] = 0;
          piVar14[0xe] = 0;
          piVar14[0xf] = 0;
          *piVar11 = *piVar14;
          if (*(char *)((long)piVar11 + 0x1f) < '\0') {
            __ZdlPv(*(undefined8 *)(piVar11 + 2));
          }
          piVar16 = piVar14 + 2;
          uVar17 = *(undefined8 *)(piVar14 + 2);
          *(undefined8 *)(piVar11 + 4) = *(undefined8 *)(piVar14 + 4);
          *(undefined8 *)(piVar11 + 2) = uVar17;
          *(undefined8 *)(piVar11 + 6) = *(undefined8 *)(piVar14 + 6);
          *(undefined1 *)((long)piVar14 + 0x1f) = 0;
          *(undefined1 *)(piVar14 + 2) = 0;
          if (piVar14 == param_1) {
            piVar14 = param_1;
          }
          else {
            iVar9 = piVar14[-8];
            if (iVar4 == iVar9) {
              uVar1 = in_stack_00000020;
              puVar7 = uStack0000000000000018;
              if (-1 < (char)in_stack_00000028._7_1_) {
                uVar1 = (ulong)in_stack_00000028._7_1_;
                puVar7 = puStack0000000000000008;
              }
              uVar2 = *(ulong *)(piVar14 + -4);
              piVar6 = *(int **)(piVar14 + -6);
              if (-1 < (char)*(byte *)((long)piVar14 + -1)) {
                uVar2 = (ulong)*(byte *)((long)piVar14 + -1);
                piVar6 = piVar14 + -6;
              }
              uVar3 = uVar2;
              if (uVar1 <= uVar2) {
                uVar3 = uVar1;
              }
              iVar10 = _memcmp(puVar7,piVar6,uVar3);
              param_2 = piStack0000000000000000;
              if (iVar10 == 0) {
                if (uVar1 < uVar2) goto LAB_006b9494;
              }
              else if (iVar10 < 0) {
LAB_006b9494:
                lVar15 = lVar13;
                while( true ) {
                  piVar16 = (int *)((long)param_1 + lVar15);
                  *piVar16 = iVar9;
                  *(undefined8 *)(piVar16 + 4) = *(undefined8 *)(piVar16 + -4);
                  *(undefined8 *)(piVar16 + 2) = *(undefined8 *)(piVar16 + -6);
                  *(undefined8 *)(piVar16 + 6) = *(undefined8 *)(piVar16 + -2);
                  *(undefined1 *)((long)piVar16 + -1) = 0;
                  *(undefined1 *)(piVar16 + -6) = 0;
                  if (lVar15 + -0x20 == 0) break;
                  iVar9 = piVar16[-0x10];
                  if (iVar4 == iVar9) {
                    uVar1 = in_stack_00000020;
                    puVar7 = uStack0000000000000018;
                    if (-1 < (char)in_stack_00000028._7_1_) {
                      uVar1 = (ulong)in_stack_00000028._7_1_;
                      puVar7 = puStack0000000000000008;
                    }
                    plVar12 = (long *)((long)param_1 + lVar15 + -0x38);
                    bVar5 = *(byte *)((long)param_1 + lVar15 + -0x21);
                    uVar2 = *(ulong *)((long)param_1 + lVar15 + -0x30);
                    plVar8 = (long *)*plVar12;
                    if (-1 < (char)bVar5) {
                      uVar2 = (ulong)bVar5;
                      plVar8 = plVar12;
                    }
                    uVar3 = uVar2;
                    if (uVar1 <= uVar2) {
                      uVar3 = uVar1;
                    }
                    iVar10 = _memcmp(puVar7,plVar8,uVar3);
                    if (iVar10 == 0) {
                      if (uVar2 <= uVar1) goto LAB_006b9538;
                    }
                    else if (-1 < iVar10) {
LAB_006b9538:
                      piVar14 = (int *)((long)param_1 + lVar15 + -0x20);
                      goto LAB_006b9548;
                    }
                  }
                  else if (iVar9 <= iVar4) goto LAB_006b9538;
                  lVar15 = lVar15 + -0x20;
                }
                piVar14 = param_1;
LAB_006b9548:
                piVar16 = piVar16 + -6;
                param_2 = piStack0000000000000000;
              }
            }
            else if (iVar4 < iVar9) goto LAB_006b9494;
          }
          *piVar14 = iVar4;
          uVar18 = puStack0000000000000008[1];
          uVar17 = *puStack0000000000000008;
          *(undefined8 *)(piVar16 + 4) = puStack0000000000000008[2];
          *(undefined8 *)(piVar16 + 2) = uVar18;
          *(undefined8 *)piVar16 = uVar17;
        }
      }
      else if (iVar4 < *piVar14) goto LAB_006b93b8;
      lVar13 = lVar13 + 0x20;
      piVar16 = piVar11 + 8;
      piVar14 = piVar11;
    } while (piVar11 + 8 != param_2);
  }
  return;
}

