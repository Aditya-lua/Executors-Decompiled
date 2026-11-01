
int * FUN_006baf70(void)

{
  long lVar1;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  int *piVar7;
  int *piVar8;
  int iVar9;
  int *piVar10;
  undefined8 uVar11;
  long lVar12;
  long unaff_x20;
  int *piVar13;
  long unaff_x22;
  ulong uVar14;
  int unaff_w24;
  undefined8 uVar15;
  long in_stack_00000018;
  
  *(char *)(unaff_x22 + -1) = (char)unaff_w24;
  piVar10 = (int *)func_0x006bb160();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000018) {
    return piVar10;
  }
  uVar11 = ___stack_chk_fail();
  if (unaff_w24 < 0) {
    __ZdlPv();
  }
  piVar10 = (int *)__Unwind_Resume(uVar11);
  uVar14 = 0;
  lVar3 = unaff_x20 + -1;
  if (1 < unaff_x20) {
    lVar3 = unaff_x20 + -2;
  }
  do {
    lVar1 = uVar14 + 1;
    piVar13 = piVar10 + lVar1 * 8;
    lVar12 = uVar14 * 2;
    uVar14 = uVar14 << 1 | 1;
    uVar2 = lVar12 + 2;
    if ((long)uVar2 < unaff_x20) {
      iVar9 = piVar13[8];
      if (*piVar13 == iVar9) {
        uVar4 = *(ulong *)(piVar10 + lVar1 * 8 + 4);
        piVar7 = *(int **)(piVar10 + lVar1 * 8 + 2);
        if (-1 < (char)*(byte *)((long)piVar13 + 0x1f)) {
          uVar4 = (ulong)*(byte *)((long)piVar13 + 0x1f);
          piVar7 = piVar10 + lVar1 * 8 + 2;
        }
        uVar5 = *(ulong *)(piVar13 + 0xc);
        piVar8 = *(int **)(piVar13 + 10);
        if (-1 < (char)*(byte *)((long)piVar13 + 0x3f)) {
          uVar5 = (ulong)*(byte *)((long)piVar13 + 0x3f);
          piVar8 = piVar13 + 10;
        }
        uVar6 = uVar5;
        if (uVar4 <= uVar5) {
          uVar6 = uVar4;
        }
        iVar9 = _memcmp(piVar7,piVar8,uVar6);
        if (iVar9 == 0) {
          if (uVar4 < uVar5) goto code_r0x006bb054;
        }
        else if (iVar9 < 0) {
code_r0x006bb054:
          piVar13 = piVar13 + 8;
          uVar14 = uVar2;
        }
      }
      else if (*piVar13 < iVar9) goto code_r0x006bb054;
    }
    *piVar10 = *piVar13;
    if (*(char *)((long)piVar10 + 0x1f) < '\0') {
      __ZdlPv(*(undefined8 *)(piVar10 + 2));
    }
    uVar15 = *(undefined8 *)(piVar13 + 4);
    uVar11 = *(undefined8 *)(piVar13 + 2);
    *(undefined8 *)(piVar10 + 6) = *(undefined8 *)(piVar13 + 6);
    *(undefined8 *)(piVar10 + 4) = uVar15;
    *(undefined8 *)(piVar10 + 2) = uVar11;
    *(undefined1 *)((long)piVar13 + 0x1f) = 0;
    *(undefined1 *)(piVar13 + 2) = 0;
    piVar10 = piVar13;
    if (lVar3 >> 1 < (long)uVar14) {
      return piVar13;
    }
  } while( true );
}

