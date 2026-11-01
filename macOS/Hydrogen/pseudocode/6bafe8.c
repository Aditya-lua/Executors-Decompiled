
int * FUN_006bafe8(long param_1,int *param_2,undefined8 param_3,long param_4)

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
  undefined8 uVar10;
  int *piVar11;
  long lVar12;
  int *piVar13;
  ulong uVar14;
  int unaff_w24;
  undefined8 uVar15;
  
  if (*(long *)PTR____stack_chk_guard_009b01e8 == param_1) {
    return param_2;
  }
  uVar10 = ___stack_chk_fail();
  if (unaff_w24 < 0) {
    __ZdlPv();
  }
  piVar11 = (int *)__Unwind_Resume(uVar10);
  uVar14 = 0;
  lVar3 = param_4 + -1;
  if (1 < param_4) {
    lVar3 = param_4 + -2;
  }
  do {
    lVar1 = uVar14 + 1;
    piVar13 = piVar11 + lVar1 * 8;
    lVar12 = uVar14 * 2;
    uVar14 = uVar14 << 1 | 1;
    uVar2 = lVar12 + 2;
    if ((long)uVar2 < param_4) {
      iVar9 = piVar13[8];
      if (*piVar13 == iVar9) {
        uVar4 = *(ulong *)(piVar11 + lVar1 * 8 + 4);
        piVar7 = *(int **)(piVar11 + lVar1 * 8 + 2);
        if (-1 < (char)*(byte *)((long)piVar13 + 0x1f)) {
          uVar4 = (ulong)*(byte *)((long)piVar13 + 0x1f);
          piVar7 = piVar11 + lVar1 * 8 + 2;
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
    *piVar11 = *piVar13;
    if (*(char *)((long)piVar11 + 0x1f) < '\0') {
      __ZdlPv(*(undefined8 *)(piVar11 + 2));
    }
    uVar15 = *(undefined8 *)(piVar13 + 4);
    uVar10 = *(undefined8 *)(piVar13 + 2);
    *(undefined8 *)(piVar11 + 6) = *(undefined8 *)(piVar13 + 6);
    *(undefined8 *)(piVar11 + 4) = uVar15;
    *(undefined8 *)(piVar11 + 2) = uVar10;
    *(undefined1 *)((long)piVar13 + 0x1f) = 0;
    *(undefined1 *)(piVar13 + 2) = 0;
    piVar11 = piVar13;
    if (lVar3 >> 1 < (long)uVar14) {
      return piVar13;
    }
  } while( true );
}

