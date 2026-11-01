
/* WARNING: Possible PIC construction at 0x006baf18: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x006baf1c) */
/* WARNING: Removing unreachable block (ram,0x006bafbc) */
/* WARNING: Removing unreachable block (ram,0x006bafc8) */
/* WARNING: Removing unreachable block (ram,0x006bafd0) */
/* WARNING: Removing unreachable block (ram,0x006baf2c) */
/* WARNING: Removing unreachable block (ram,0x006baf40) */
/* WARNING: Removing unreachable block (ram,0x006baf48) */
/* WARNING: Removing unreachable block (ram,0x006baffc) */
/* WARNING: Removing unreachable block (ram,0x006bb008) */
/* WARNING: Removing unreachable block (ram,0x006bb010) */
/* WARNING: Removing unreachable block (ram,0x006bafa0) */

int * FUN_006baef8(undefined8 param_1,int *param_2,undefined8 param_3,undefined8 param_4,
                  long param_5)

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
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  long lVar10;
  int *piVar11;
  ulong uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined7 uStack0000000000000008;
  undefined1 uStack000000000000000f;
  undefined7 uStack0000000000000010;
  
  uStack0000000000000008 = (undefined7)param_1;
  uStack000000000000000f = (undefined1)*(undefined8 *)((long)param_2 + 0x17);
  uStack0000000000000010 = (undefined7)((ulong)*(undefined8 *)((long)param_2 + 0x17) >> 8);
  param_2[4] = 0;
  param_2[5] = 0;
  param_2[6] = 0;
  param_2[7] = 0;
  param_2[2] = 0;
  param_2[3] = 0;
  uVar12 = 0;
  lVar3 = param_5 + -1;
  if (1 < param_5) {
    lVar3 = param_5 + -2;
  }
  do {
    lVar1 = uVar12 + 1;
    piVar11 = param_2 + lVar1 * 8;
    lVar10 = uVar12 * 2;
    uVar12 = uVar12 << 1 | 1;
    uVar2 = lVar10 + 2;
    if ((long)uVar2 < param_5) {
      iVar9 = piVar11[8];
      if (*piVar11 == iVar9) {
        uVar4 = *(ulong *)(param_2 + lVar1 * 8 + 4);
        piVar7 = *(int **)(param_2 + lVar1 * 8 + 2);
        if (-1 < (char)*(byte *)((long)piVar11 + 0x1f)) {
          uVar4 = (ulong)*(byte *)((long)piVar11 + 0x1f);
          piVar7 = param_2 + lVar1 * 8 + 2;
        }
        uVar5 = *(ulong *)(piVar11 + 0xc);
        piVar8 = *(int **)(piVar11 + 10);
        if (-1 < (char)*(byte *)((long)piVar11 + 0x3f)) {
          uVar5 = (ulong)*(byte *)((long)piVar11 + 0x3f);
          piVar8 = piVar11 + 10;
        }
        uVar6 = uVar5;
        if (uVar4 <= uVar5) {
          uVar6 = uVar4;
        }
        iVar9 = _memcmp(piVar7,piVar8,uVar6);
        param_4 = extraout_x1;
        if (iVar9 == 0) {
          if (uVar4 < uVar5) goto code_r0x006bb054;
        }
        else if (iVar9 < 0) {
code_r0x006bb054:
          piVar11 = piVar11 + 8;
          uVar12 = uVar2;
        }
      }
      else if (*piVar11 < iVar9) goto code_r0x006bb054;
    }
    *param_2 = *piVar11;
    if (*(char *)((long)param_2 + 0x1f) < '\0') {
      __ZdlPv(*(undefined8 *)(param_2 + 2),param_4);
      param_4 = extraout_x1_00;
    }
    uVar14 = *(undefined8 *)(piVar11 + 4);
    uVar13 = *(undefined8 *)(piVar11 + 2);
    *(undefined8 *)(param_2 + 6) = *(undefined8 *)(piVar11 + 6);
    *(undefined8 *)(param_2 + 4) = uVar14;
    *(undefined8 *)(param_2 + 2) = uVar13;
    *(undefined1 *)((long)piVar11 + 0x1f) = 0;
    *(undefined1 *)(piVar11 + 2) = 0;
    param_2 = piVar11;
    if (lVar3 >> 1 < (long)uVar12) {
      return piVar11;
    }
  } while( true );
}

