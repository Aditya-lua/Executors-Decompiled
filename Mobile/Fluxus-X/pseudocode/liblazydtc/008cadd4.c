/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008cadd4
 */

void FUN_008cadd4(long param_1,long *param_2,undefined8 param_3,undefined8 *param_4)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  undefined8 *puVar4;
  long *plVar5;
  double *pdVar6;
  undefined8 uVar7;
  uint uVar8;
  long lVar9;
  int iVar10;
  undefined8 uVar11;
  
  iVar3 = *(int *)((long)param_2 + 0xc);
  iVar10 = 100;
  do {
    if (iVar3 == 6) {
      lVar9 = *param_2;
      puVar4 = (undefined8 *)FUN_008bb604(lVar9,param_3);
      if (((DAT_00d1f1e0 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar3 != 0)) {
                    /* try { // try from 008caf24 to 008caf27 has its CatchHandler @ 008cb058 */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1f1e0);
      }
      if (puVar4 != (undefined8 *)((long)&DWORD_007f2ef0 + DAT_00d1f1d8)) {
        *(int *)(param_1 + 0x2c) = (int)((ulong)((long)puVar4 - *(long *)(lVar9 + 0x28)) >> 5);
      }
      if (*(int *)((long)puVar4 + 0xc) != 0) {
        uVar11 = puVar4[1];
        uVar7 = *puVar4;
        goto LAB_008caf44;
      }
      lVar9 = *(long *)(lVar9 + 0x10);
      if ((lVar9 == 0) || ((*(byte *)(lVar9 + 6) & 1) != 0)) {
LAB_008cb020:
        *(undefined4 *)((long)param_4 + 0xc) = 0;
        return;
      }
      if ((*(byte *)(lVar9 + 7) >> 1 & 1) == 0) {
        plVar5 = (long *)FUN_008bdfe0(lVar9,0,*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x338));
        if (plVar5 == (long *)0x0) goto LAB_008cb020;
      }
      else {
        plVar5 = (long *)(*(long *)(lVar9 + 0x20) + -0x10);
      }
    }
    else {
      if (DAT_00d1fdd0 == '\x01') {
        if (iVar3 == 0xc) {
          lVar9 = *param_2;
          pdVar6 = (double *)FUN_008bb604(*(undefined8 *)(*(long *)(lVar9 + 0x10) + 0x38),param_3);
          if (*(int *)((long)pdVar6 + 0xc) == 0) {
LAB_008cb048:
            uVar7 = FUN_008b3c58(param_1,param_2,param_3);
                    /* catch() { ... } // from try @ 008caf24 with catch @ 008cb058 */
            __cxa_guard_abort(&DAT_00d1f1e0);
                    /* WARNING: Subroutine does not return */
            FUN_00c2c090(uVar7);
          }
          uVar8 = (uint)*pdVar6;
          uVar2 = *(uint *)(*(long *)(lVar9 + 0x10) + 0x58);
          plVar5 = (long *)(lVar9 + 0x20);
          if (uVar2 <= uVar8) {
            plVar5 = (long *)(*(long *)(lVar9 + 0x10) + 0x28);
          }
          uVar1 = 0;
          if (uVar2 <= uVar8) {
            uVar1 = uVar2;
          }
          puVar4 = (undefined8 *)(*plVar5 + (ulong)(uVar8 - uVar1) * 0x10);
          uVar11 = puVar4[1];
          uVar7 = *puVar4;
LAB_008caf44:
          param_4[1] = uVar11;
          *param_4 = uVar7;
          return;
        }
        if (iVar3 == 0xb) {
          lVar9 = *param_2;
          pdVar6 = (double *)FUN_008bb604(*(undefined8 *)(lVar9 + 0x38),param_3);
          if ((*(int *)((long)pdVar6 + 0xc) == 0) || ((uint)(int)*pdVar6 < *(uint *)(lVar9 + 0x58)))
          goto LAB_008cb048;
          puVar4 = (undefined8 *)
                   (*(long *)(lVar9 + 0x28) + (ulong)((int)*pdVar6 - *(uint *)(lVar9 + 0x58)) * 0x10
                   );
          uVar11 = puVar4[1];
          uVar7 = *puVar4;
          goto LAB_008caf44;
        }
      }
      plVar5 = (long *)FUN_008be028(param_1,param_2,0);
      if (*(int *)((long)plVar5 + 0xc) == 0) {
        FUN_008b3be4(param_1,param_2,param_3);
        goto LAB_008cb038;
      }
    }
    iVar3 = *(int *)((long)plVar5 + 0xc);
    if (iVar3 == 7) {
      FUN_008cb070(param_1,param_4,plVar5,param_2,param_3);
      return;
    }
    iVar10 = iVar10 + -1;
    param_2 = plVar5;
    if (iVar10 == 0) {
LAB_008cb038:
                    /* WARNING: Subroutine does not return */
      FUN_008b39cc(param_1,"\'__index\' chain too long; possible loop");
    }
  } while( true );
}

