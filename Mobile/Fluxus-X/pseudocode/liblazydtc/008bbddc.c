/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008bbddc
 */

long FUN_008bbddc(undefined8 param_1,long param_2,double *param_3)

{
  int *piVar1;
  float fVar2;
  int iVar3;
  int iVar4;
  long lVar5;
  uint uVar6;
  uint uVar7;
  ulong uVar8;
  ulong uVar9;
  int iVar10;
  int *piVar11;
  ulong uVar12;
  double dVar13;
  
  fVar2 = *(float *)((long)param_3 + 0xc);
  if ((int)fVar2 < 3) {
    if (fVar2 == 1.4013e-45) {
      fVar2 = *(float *)param_3;
      do {
        lVar5 = *(long *)(param_2 + 0x28) +
                (ulong)((uint)fVar2 & (-1 << (ulong)(*(byte *)(param_2 + 5) & 0x1f) ^ 0xffffffffU))
                * 0x20;
        if (*(int *)(lVar5 + 0xc) == 0) {
          if (((DAT_00d1fc90 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1fc90), iVar4 != 0))
          {
                    /* try { // try from 008bc034 to 008bc037 has its CatchHandler @ 008bc09c */
            DAT_00d1fc88 = FUN_007fe1ec(DAT_00cca8c8);
            __cxa_guard_release(&DAT_00d1fc90);
          }
          if (lVar5 != (long)&DWORD_007f3700 + DAT_00d1fc88) {
LAB_008bc058:
            *(double *)(lVar5 + 0x10) = *param_3;
            *(float *)(lVar5 + 0x18) = *(float *)(param_3 + 1);
            *(uint *)(lVar5 + 0x1c) =
                 *(uint *)(lVar5 + 0x1c) & 0xfffffff0 | (uint)*(float *)((long)param_3 + 0xc) & 0xf;
            return lVar5;
          }
        }
        uVar6 = *(uint *)(param_2 + 0xc);
        while (0 < (int)uVar6) {
          uVar6 = uVar6 - 1;
          *(uint *)(param_2 + 0xc) = uVar6;
          if ((*(byte *)(*(long *)(param_2 + 0x28) + (ulong)uVar6 * 0x20 + 0x1c) & 0xf) == 0) {
            lVar5 = FUN_008bda50(param_2);
            goto LAB_008bc058;
          }
        }
        iVar4 = 0;
        uVar9 = (ulong)(1 << (ulong)(*(byte *)(param_2 + 5) & 0x1f));
        if (*(byte *)(param_2 + 5) == 0) {
          uVar8 = 1;
LAB_008bbfe8:
          piVar11 = (int *)(*(long *)(param_2 + 0x28) + uVar8 * 0x20 + -0x14);
          do {
            uVar8 = uVar8 - 1;
            if (*piVar11 != 0) {
              iVar4 = iVar4 + 1;
            }
            piVar11 = piVar11 + -8;
          } while (uVar8 != 0);
        }
        else {
          iVar10 = 0;
          uVar8 = uVar9 & 1;
          piVar11 = (int *)(*(long *)(param_2 + 0x28) + uVar9 * 0x20 + -0x14);
          uVar12 = uVar9 & 0xfffffffffffffffe;
          do {
            iVar3 = *piVar11;
            piVar1 = piVar11 + -8;
            uVar12 = uVar12 - 2;
            piVar11 = piVar11 + -0x10;
            if (iVar3 != 0) {
              iVar4 = iVar4 + 1;
            }
            if (*piVar1 != 0) {
              iVar10 = iVar10 + 1;
            }
          } while (uVar12 != 0);
          iVar4 = iVar10 + iVar4;
          if ((uVar9 & 0xfffffffffffffffe) != uVar9) goto LAB_008bbfe8;
        }
        FUN_008ba968(param_1,param_2,*(undefined4 *)(param_2 + 8),iVar4 + 1);
      } while( true );
    }
    if (fVar2 == 2.8026e-45) {
      uVar6 = (SUB84(*param_3,0) ^ SUB84(*param_3,0) >> 0x10) * -0x7a143595;
      uVar6 = (uVar6 ^ uVar6 >> 0xd) * -0x3d4d51cb;
      do {
        lVar5 = *(long *)(param_2 + 0x28) +
                (ulong)((uVar6 ^ uVar6 >> 0x10) &
                       (-1 << (ulong)(*(byte *)(param_2 + 5) & 0x1f) ^ 0xffffffffU)) * 0x20;
        if (*(int *)(lVar5 + 0xc) == 0) {
          if (((DAT_00d1fc90 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1fc90), iVar4 != 0))
          {
                    /* try { // try from 008bc23c to 008bc23f has its CatchHandler @ 008bc2a4 */
            DAT_00d1fc88 = FUN_007fe1ec(DAT_00cca8c8);
            __cxa_guard_release(&DAT_00d1fc90);
          }
          if (lVar5 != (long)&DWORD_007f3700 + DAT_00d1fc88) {
LAB_008bc260:
            *(double *)(lVar5 + 0x10) = *param_3;
            *(float *)(lVar5 + 0x18) = *(float *)(param_3 + 1);
            *(uint *)(lVar5 + 0x1c) =
                 *(uint *)(lVar5 + 0x1c) & 0xfffffff0 | (uint)*(float *)((long)param_3 + 0xc) & 0xf;
            return lVar5;
          }
        }
        uVar7 = *(uint *)(param_2 + 0xc);
        while (0 < (int)uVar7) {
          uVar7 = uVar7 - 1;
          *(uint *)(param_2 + 0xc) = uVar7;
          if ((*(byte *)(*(long *)(param_2 + 0x28) + (ulong)uVar7 * 0x20 + 0x1c) & 0xf) == 0) {
            lVar5 = FUN_008bda50(param_2);
            goto LAB_008bc260;
          }
        }
        iVar4 = 0;
        uVar9 = (ulong)(1 << (ulong)(*(byte *)(param_2 + 5) & 0x1f));
        if (*(byte *)(param_2 + 5) == 0) {
          uVar8 = 1;
LAB_008bc1f0:
          piVar11 = (int *)(*(long *)(param_2 + 0x28) + uVar8 * 0x20 + -0x14);
          do {
            uVar8 = uVar8 - 1;
            if (*piVar11 != 0) {
              iVar4 = iVar4 + 1;
            }
            piVar11 = piVar11 + -8;
          } while (uVar8 != 0);
        }
        else {
          iVar10 = 0;
          uVar8 = uVar9 & 1;
          piVar11 = (int *)(*(long *)(param_2 + 0x28) + uVar9 * 0x20 + -0x14);
          uVar12 = uVar9 & 0xfffffffffffffffe;
          do {
            iVar3 = *piVar11;
            piVar1 = piVar11 + -8;
            uVar12 = uVar12 - 2;
            piVar11 = piVar11 + -0x10;
            if (iVar3 != 0) {
              iVar4 = iVar4 + 1;
            }
            if (*piVar1 != 0) {
              iVar10 = iVar10 + 1;
            }
          } while (uVar12 != 0);
          iVar4 = iVar10 + iVar4;
          if ((uVar9 & 0xfffffffffffffffe) != uVar9) goto LAB_008bc1f0;
        }
        FUN_008ba968(param_1,param_2,*(undefined4 *)(param_2 + 8),iVar4 + 1);
      } while( true );
    }
    if (fVar2 == 0.0) {
                    /* WARNING: Subroutine does not return */
      FUN_008b39cc(param_1,"table index is nil");
    }
  }
  else {
    if (fVar2 == 4.2039e-45) {
      dVar13 = *param_3;
      if (NAN(dVar13)) {
                    /* WARNING: Subroutine does not return */
        FUN_008b39cc(param_1,"table index is NaN");
      }
      if (dVar13 == (double)(int)dVar13) {
        lVar5 = FUN_008bc2bc();
        return lVar5;
      }
      lVar5 = FUN_008bc474();
      return lVar5;
    }
    if (fVar2 == 5.60519e-45) {
      if (((NAN(*(float *)param_3)) || (NAN(*(float *)((long)param_3 + 4)))) ||
         (NAN(*(float *)(param_3 + 1)))) {
                    /* WARNING: Subroutine does not return */
        FUN_008b39cc(param_1,"table index contains NaN");
      }
      lVar5 = FUN_008bc688();
      return lVar5;
    }
    if (fVar2 == 7.00649e-45) {
      lVar5 = FUN_008bc8d0();
      return lVar5;
    }
  }
  lVar5 = FUN_008bcadc();
  return lVar5;
}

