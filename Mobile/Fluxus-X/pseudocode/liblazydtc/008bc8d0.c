/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008bc8d0
 */

long FUN_008bc8d0(undefined8 param_1,long param_2,long *param_3,long param_4)

{
  int *piVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  uint uVar5;
  ulong uVar6;
  ulong uVar7;
  int iVar8;
  int *piVar9;
  ulong uVar10;
  
  do {
    lVar4 = *(long *)(param_2 + 0x28) +
            (ulong)(*(uint *)(param_4 + 0x10) &
                   (-1 << (ulong)(*(byte *)(param_2 + 5) & 0x1f) ^ 0xffffffffU)) * 0x20;
    if (*(int *)(lVar4 + 0xc) == 0) {
      if (((DAT_00d1fc90 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1fc90), iVar3 != 0)) {
                    /* try { // try from 008bca30 to 008bca33 has its CatchHandler @ 008bcac4 */
        DAT_00d1fc88 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1fc90);
      }
      if (lVar4 != (long)&DWORD_007f3700 + DAT_00d1fc88) {
LAB_008bca54:
        *(long *)(lVar4 + 0x10) = *param_3;
        *(int *)(lVar4 + 0x18) = (int)param_3[1];
        *(uint *)(lVar4 + 0x1c) =
             *(uint *)(lVar4 + 0x1c) & 0xfffffff0 | *(uint *)((long)param_3 + 0xc) & 0xf;
        if (((4 < *(int *)((long)param_3 + 0xc)) && ((*(byte *)(param_2 + 2) >> 2 & 1) != 0)) &&
           ((*(byte *)(*param_3 + 2) & 3) != 0)) {
          FUN_008b6370(param_1,param_2);
        }
        return lVar4;
      }
    }
    uVar5 = *(uint *)(param_2 + 0xc);
    while (0 < (int)uVar5) {
      uVar5 = uVar5 - 1;
      *(uint *)(param_2 + 0xc) = uVar5;
      if ((*(byte *)(*(long *)(param_2 + 0x28) + (ulong)uVar5 * 0x20 + 0x1c) & 0xf) == 0) {
        lVar4 = FUN_008bda50(param_2,lVar4);
        goto LAB_008bca54;
      }
    }
    iVar3 = 0;
    uVar7 = (ulong)(1 << (ulong)(*(byte *)(param_2 + 5) & 0x1f));
    if (*(byte *)(param_2 + 5) == 0) {
      uVar6 = 1;
LAB_008bc9e8:
      piVar9 = (int *)(*(long *)(param_2 + 0x28) + uVar6 * 0x20 + -0x14);
      do {
        uVar6 = uVar6 - 1;
        if (*piVar9 != 0) {
          iVar3 = iVar3 + 1;
        }
        piVar9 = piVar9 + -8;
      } while (uVar6 != 0);
    }
    else {
      iVar8 = 0;
      uVar6 = uVar7 & 1;
      piVar9 = (int *)(*(long *)(param_2 + 0x28) + uVar7 * 0x20 + -0x14);
      uVar10 = uVar7 & 0xfffffffffffffffe;
      do {
        iVar2 = *piVar9;
        piVar1 = piVar9 + -8;
        uVar10 = uVar10 - 2;
        piVar9 = piVar9 + -0x10;
        if (iVar2 != 0) {
          iVar3 = iVar3 + 1;
        }
        if (*piVar1 != 0) {
          iVar8 = iVar8 + 1;
        }
      } while (uVar10 != 0);
      iVar3 = iVar8 + iVar3;
      if ((uVar7 & 0xfffffffffffffffe) != uVar7) goto LAB_008bc9e8;
    }
    FUN_008ba968(param_1,param_2,*(undefined4 *)(param_2 + 8),iVar3 + 1);
  } while( true );
}

