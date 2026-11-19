/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008bcadc
 */

long FUN_008bcadc(undefined8 param_1,long param_2,long *param_3,uint param_4)

{
  int *piVar1;
  int iVar2;
  uint uVar3;
  int iVar4;
  long lVar5;
  uint uVar6;
  ulong uVar7;
  ulong uVar8;
  int iVar9;
  int *piVar10;
  ulong uVar11;
  
  uVar3 = (param_4 ^ param_4 >> 0x10) * -0x7a143595;
  uVar3 = (uVar3 ^ uVar3 >> 0xd) * -0x3d4d51cb;
  do {
    lVar5 = *(long *)(param_2 + 0x28) +
            (ulong)((uVar3 ^ uVar3 >> 0x10) &
                   (-1 << (ulong)(*(byte *)(param_2 + 5) & 0x1f) ^ 0xffffffffU)) * 0x20;
    if (*(int *)(lVar5 + 0xc) == 0) {
      if (((DAT_00d1fc90 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1fc90), iVar4 != 0)) {
                    /* try { // try from 008bcc58 to 008bcc5b has its CatchHandler @ 008bccec */
        DAT_00d1fc88 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1fc90);
      }
      if (lVar5 != (long)&DWORD_007f3700 + DAT_00d1fc88) {
LAB_008bcc7c:
        *(long *)(lVar5 + 0x10) = *param_3;
        *(int *)(lVar5 + 0x18) = (int)param_3[1];
        *(uint *)(lVar5 + 0x1c) =
             *(uint *)(lVar5 + 0x1c) & 0xfffffff0 | *(uint *)((long)param_3 + 0xc) & 0xf;
        if (((4 < *(int *)((long)param_3 + 0xc)) && ((*(byte *)(param_2 + 2) >> 2 & 1) != 0)) &&
           ((*(byte *)(*param_3 + 2) & 3) != 0)) {
          FUN_008b6370(param_1,param_2);
        }
        return lVar5;
      }
    }
    uVar6 = *(uint *)(param_2 + 0xc);
    while (0 < (int)uVar6) {
      uVar6 = uVar6 - 1;
      *(uint *)(param_2 + 0xc) = uVar6;
      if ((*(byte *)(*(long *)(param_2 + 0x28) + (ulong)uVar6 * 0x20 + 0x1c) & 0xf) == 0) {
        lVar5 = FUN_008bda50(param_2,lVar5);
        goto LAB_008bcc7c;
      }
    }
    iVar4 = 0;
    uVar8 = (ulong)(1 << (ulong)(*(byte *)(param_2 + 5) & 0x1f));
    if (*(byte *)(param_2 + 5) == 0) {
      uVar7 = 1;
LAB_008bcc10:
      piVar10 = (int *)(*(long *)(param_2 + 0x28) + uVar7 * 0x20 + -0x14);
      do {
        uVar7 = uVar7 - 1;
        if (*piVar10 != 0) {
          iVar4 = iVar4 + 1;
        }
        piVar10 = piVar10 + -8;
      } while (uVar7 != 0);
    }
    else {
      iVar9 = 0;
      uVar7 = uVar8 & 1;
      piVar10 = (int *)(*(long *)(param_2 + 0x28) + uVar8 * 0x20 + -0x14);
      uVar11 = uVar8 & 0xfffffffffffffffe;
      do {
        iVar2 = *piVar10;
        piVar1 = piVar10 + -8;
        uVar11 = uVar11 - 2;
        piVar10 = piVar10 + -0x10;
        if (iVar2 != 0) {
          iVar4 = iVar4 + 1;
        }
        if (*piVar1 != 0) {
          iVar9 = iVar9 + 1;
        }
      } while (uVar11 != 0);
      iVar4 = iVar9 + iVar4;
      if ((uVar8 & 0xfffffffffffffffe) != uVar8) goto LAB_008bcc10;
    }
    FUN_008ba968(param_1,param_2,*(undefined4 *)(param_2 + 8),iVar4 + 1);
  } while( true );
}

