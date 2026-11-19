/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008bc474
 */

long FUN_008bc474(undefined8 param_1,undefined8 param_2,long param_3,undefined8 *param_4)

{
  int *piVar1;
  int iVar2;
  uint uVar3;
  int iVar4;
  long lVar5;
  uint uVar6;
  ulong uVar7;
  uint uVar8;
  ulong uVar9;
  int iVar10;
  int *piVar11;
  ulong uVar12;
  
  uVar8 = (uint)((ulong)param_1 >> 0x20) & 0x7fffffff;
  uVar3 = ((uint)param_1 ^ uVar8 >> 0x12) * 0x5bd1e995;
  uVar8 = (uVar8 ^ uVar3 >> 0x16) * 0x5bd1e995;
  do {
    lVar5 = *(long *)(param_3 + 0x28) +
            (ulong)((uVar8 ^ (uVar3 ^ uVar8 >> 0x11) * 0x5bd1e995 >> 0x13) * 0x5bd1e995 &
                   (-1 << (ulong)(*(byte *)(param_3 + 5) & 0x1f) ^ 0xffffffffU)) * 0x20;
    if (*(int *)(lVar5 + 0xc) == 0) {
      if (((DAT_00d1fc90 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1fc90), iVar4 != 0)) {
                    /* try { // try from 008bc608 to 008bc60b has its CatchHandler @ 008bc670 */
        DAT_00d1fc88 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1fc90);
      }
      if (lVar5 != (long)&DWORD_007f3700 + DAT_00d1fc88) {
LAB_008bc62c:
        *(undefined8 *)(lVar5 + 0x10) = *param_4;
        *(undefined4 *)(lVar5 + 0x18) = *(undefined4 *)(param_4 + 1);
        *(uint *)(lVar5 + 0x1c) =
             *(uint *)(lVar5 + 0x1c) & 0xfffffff0 | *(uint *)((long)param_4 + 0xc) & 0xf;
        return lVar5;
      }
    }
    uVar6 = *(uint *)(param_3 + 0xc);
    while (0 < (int)uVar6) {
      uVar6 = uVar6 - 1;
      *(uint *)(param_3 + 0xc) = uVar6;
      if ((*(byte *)(*(long *)(param_3 + 0x28) + (ulong)uVar6 * 0x20 + 0x1c) & 0xf) == 0) {
        lVar5 = FUN_008bda50(param_3);
        goto LAB_008bc62c;
      }
    }
    iVar4 = 0;
    uVar9 = (ulong)(1 << (ulong)(*(byte *)(param_3 + 5) & 0x1f));
    if (*(byte *)(param_3 + 5) == 0) {
      uVar7 = 1;
LAB_008bc5bc:
      piVar11 = (int *)(*(long *)(param_3 + 0x28) + uVar7 * 0x20 + -0x14);
      do {
        uVar7 = uVar7 - 1;
        if (*piVar11 != 0) {
          iVar4 = iVar4 + 1;
        }
        piVar11 = piVar11 + -8;
      } while (uVar7 != 0);
    }
    else {
      iVar10 = 0;
      uVar7 = uVar9 & 1;
      piVar11 = (int *)(*(long *)(param_3 + 0x28) + uVar9 * 0x20 + -0x14);
      uVar12 = uVar9 & 0xfffffffffffffffe;
      do {
        iVar2 = *piVar11;
        piVar1 = piVar11 + -8;
        uVar12 = uVar12 - 2;
        piVar11 = piVar11 + -0x10;
        if (iVar2 != 0) {
          iVar4 = iVar4 + 1;
        }
        if (*piVar1 != 0) {
          iVar10 = iVar10 + 1;
        }
      } while (uVar12 != 0);
      iVar4 = iVar10 + iVar4;
      if ((uVar9 & 0xfffffffffffffffe) != uVar9) goto LAB_008bc5bc;
    }
    FUN_008ba968(param_2,param_3,*(undefined4 *)(param_3 + 8),iVar4 + 1);
  } while( true );
}

