/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008bb604
 */

long FUN_008bb604(long param_1,double *param_2)

{
  float fVar1;
  float fVar2;
  int iVar3;
  long lVar4;
  uint uVar5;
  uint uVar6;
  double dVar7;
  undefined8 uVar8;
  float fVar9;
  byte bVar10;
  byte bVar11;
  byte bVar13;
  int iVar12;
  byte bVar14;
  
  fVar1 = *(float *)((long)param_2 + 0xc);
  if ((char)DAT_00d1fcc0 == '\x01') {
    if ((int)fVar1 < 3) {
      if (fVar1 == 0.0) {
        if (((DAT_00d1f1e0 & 1) != 0) || (iVar3 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar3 == 0))
        goto LAB_008bbb38;
                    /* try { // try from 008bb754 to 008bb757 has its CatchHandler @ 008bbcd0 */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
      }
      else if (fVar1 == 1.4013e-45) {
        lVar4 = *(long *)(param_1 + 0x28) +
                (ulong)((uint)*(float *)param_2 &
                       (-1 << (ulong)(*(byte *)(param_1 + 5) & 0x1f) ^ 0xffffffffU)) * 0x20;
        while( true ) {
          uVar5 = *(uint *)(lVar4 + 0x1c);
          if (((uVar5 & 0xf) == 1) && (*(float *)(lVar4 + 0x10) == *(float *)param_2)) {
            return lVar4;
          }
          if (uVar5 < 0x10) break;
          lVar4 = lVar4 + ((long)((ulong)uVar5 << 0x20) >> 0x24) * 0x20;
        }
        if (((DAT_00d1f1e0 & 1) != 0) || (iVar3 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar3 == 0))
        goto LAB_008bbb38;
                    /* try { // try from 008bbb18 to 008bbb1b has its CatchHandler @ 008bbcb8 */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
      }
      else {
        if (fVar1 == 2.8026e-45) {
LAB_008bb664:
          uVar5 = SUB84(*param_2,0);
          uVar5 = (uVar5 ^ uVar5 >> 0x10) * -0x7a143595;
          uVar5 = (uVar5 ^ uVar5 >> 0xd) * -0x3d4d51cb;
          lVar4 = *(long *)(param_1 + 0x28) +
                  (ulong)((uVar5 ^ uVar5 >> 0x10) &
                         (-1 << (ulong)(*(byte *)(param_1 + 5) & 0x1f) ^ 0xffffffffU)) * 0x20;
          while( true ) {
            uVar5 = *(uint *)(lVar4 + 0x1c);
            if ((((uVar5 & 0xf) == 2) && (*(double *)(lVar4 + 0x10) == *param_2)) &&
               (*(float *)(lVar4 + 0x18) == *(float *)(param_2 + 1))) break;
            if (uVar5 < 0x10) {
              if (((DAT_00d1f1e0 & 1) == 0) &&
                 (iVar3 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar3 != 0)) {
                    /* try { // try from 008bb5d4 to 008bb5d7 has its CatchHandler @ 008bb5ec */
                DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
                __cxa_guard_release(&DAT_00d1f1e0);
              }
              return (long)&DWORD_007f2ef0 + DAT_00d1f1d8;
            }
            lVar4 = lVar4 + ((long)((ulong)uVar5 << 0x20) >> 0x24) * 0x20;
          }
          return lVar4;
        }
LAB_008bb694:
        uVar5 = SUB84(*param_2,0);
        uVar5 = (uVar5 ^ uVar5 >> 0x10) * -0x7a143595;
        uVar5 = (uVar5 ^ uVar5 >> 0xd) * -0x3d4d51cb;
        lVar4 = *(long *)(param_1 + 0x28) +
                (ulong)((uVar5 ^ uVar5 >> 0x10) &
                       (-1 << (ulong)(*(byte *)(param_1 + 5) & 0x1f) ^ 0xffffffffU)) * 0x20;
        while( true ) {
          uVar5 = *(uint *)(lVar4 + 0x1c);
          if (((float)(uVar5 & 0xf) == fVar1) && (*(double *)(lVar4 + 0x10) == *param_2)) {
            return lVar4;
          }
          if (uVar5 < 0x10) break;
          lVar4 = lVar4 + ((long)((ulong)uVar5 << 0x20) >> 0x24) * 0x20;
        }
        if (((DAT_00d1f1e0 & 1) != 0) || (iVar3 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar3 == 0))
        goto LAB_008bbb38;
                    /* try { // try from 008bbab8 to 008bbabb has its CatchHandler @ 008bbcc0 */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
      }
    }
    else {
      if (fVar1 == 4.2039e-45) {
        dVar7 = *param_2;
        if (dVar7 != (double)(int)dVar7) {
          uVar6 = (uint)((ulong)dVar7 >> 0x20) & 0x7fffffff;
          uVar5 = (SUB84(dVar7,0) ^ uVar6 >> 0x12) * 0x5bd1e995;
          uVar6 = (uVar6 ^ uVar5 >> 0x16) * 0x5bd1e995;
          lVar4 = *(long *)(param_1 + 0x28) +
                  (ulong)((uVar6 ^ (uVar5 ^ uVar6 >> 0x11) * 0x5bd1e995 >> 0x13) * 0x5bd1e995 &
                         (-1 << (ulong)(*(byte *)(param_1 + 5) & 0x1f) ^ 0xffffffffU)) * 0x20;
          while( true ) {
            uVar5 = *(uint *)(lVar4 + 0x1c);
            if (((uVar5 & 0xf) == 3) && (*(double *)(lVar4 + 0x10) == dVar7)) {
              return lVar4;
            }
            if (uVar5 < 0x10) break;
            lVar4 = lVar4 + ((long)((ulong)uVar5 << 0x20) >> 0x24) * 0x20;
          }
LAB_008bbc3c:
          lVar4 = FUN_008bb3b0(&DWORD_007f2ef0);
          return lVar4;
        }
LAB_008bb7b8:
        lVar4 = FUN_008bb19c();
        return lVar4;
      }
      if (fVar1 != 5.60519e-45) {
        if (fVar1 == 7.00649e-45) {
LAB_008bb71c:
          lVar4 = FUN_008bb440(param_1,*param_2);
          return lVar4;
        }
        goto LAB_008bb694;
      }
      uVar8 = *(undefined8 *)((long)param_2 + 4);
      fVar2 = *(float *)param_2;
      iVar3 = -(uint)((float)uVar8 == -0.0);
      fVar9 = (float)((ulong)uVar8 >> 0x20);
      iVar12 = -(uint)(fVar9 == -0.0);
      bVar10 = (byte)((ulong)uVar8 >> 0x10) & ~(byte)((uint)iVar3 >> 0x10);
      bVar11 = (byte)((ulong)uVar8 >> 0x18) & ~(byte)((uint)iVar3 >> 0x18);
      bVar13 = (byte)((ulong)uVar8 >> 0x30) & ~(byte)((uint)iVar12 >> 0x10);
      bVar14 = (byte)((ulong)uVar8 >> 0x38) & ~(byte)((uint)iVar12 >> 0x18);
      iVar3 = CONCAT13(bVar11,CONCAT12(bVar10,CONCAT11(bVar11 >> 1 ^
                                                       (byte)((ulong)uVar8 >> 8) &
                                                       ~(byte)((uint)iVar3 >> 8),
                                                       (byte)(CONCAT11(bVar11,bVar10) >> 1) ^
                                                       (byte)uVar8 & ~(byte)iVar3)));
      fVar1 = 0.0;
      if (fVar2 != -0.0) {
        fVar1 = fVar2;
      }
      lVar4 = *(long *)(param_1 + 0x28) +
              (ulong)((iVar3 * 0x127409f ^ ((uint)fVar1 ^ (uint)fVar1 >> 0x11) * 0x466f45d ^
                      (int)(CONCAT17(bVar14,CONCAT16(bVar13,CONCAT15(bVar14 >> 1 ^
                                                                     (byte)((ulong)uVar8 >> 0x28) &
                                                                     ~(byte)((uint)iVar12 >> 8),
                                                                     CONCAT14((byte)(((ulong)
                                                  CONCAT11(bVar14,bVar13) << 0x30) >> 0x31) ^
                                                  (byte)((ulong)uVar8 >> 0x20) & ~(byte)iVar12,iVar3
                                                  )))) >> 0x20) * 0x4f9ffb7) &
                     (-1 << (ulong)(*(byte *)(param_1 + 5) & 0x1f) ^ 0xffffffffU)) * 0x20;
      while( true ) {
        uVar5 = *(uint *)(lVar4 + 0x1c);
        if (((((uVar5 & 0xf) == 4) && (*(float *)(lVar4 + 0x10) == fVar2)) &&
            (*(float *)(lVar4 + 0x14) == (float)uVar8)) && (*(float *)(lVar4 + 0x18) == fVar9)) {
          return lVar4;
        }
        if (uVar5 < 0x10) break;
        lVar4 = lVar4 + ((long)((ulong)uVar5 << 0x20) >> 0x24) * 0x20;
      }
      if (((DAT_00d1f1e0 & 1) != 0) || (iVar3 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar3 == 0))
      goto LAB_008bbb38;
                    /* try { // try from 008bba6c to 008bba6f has its CatchHandler @ 008bbcc8 */
      DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
    }
  }
  else if ((int)fVar1 < 3) {
    if (fVar1 == 0.0) {
      if (((DAT_00d1f1e0 & 1) != 0) || (iVar3 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar3 == 0))
      goto LAB_008bbb38;
                    /* try { // try from 008bb784 to 008bb787 has its CatchHandler @ 008bbccc */
      DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
    }
    else {
      if (fVar1 != 1.4013e-45) {
        if (fVar1 == 2.8026e-45) goto LAB_008bb664;
        goto LAB_008bb7c4;
      }
      lVar4 = *(long *)(param_1 + 0x28) +
              (ulong)((uint)*(float *)param_2 &
                     (-1 << (ulong)(*(byte *)(param_1 + 5) & 0x1f) ^ 0xffffffffU)) * 0x20;
      while( true ) {
        uVar5 = *(uint *)(lVar4 + 0x1c);
        if (((uVar5 & 0xf) == 1) && (*(float *)(lVar4 + 0x10) == *(float *)param_2)) {
          return lVar4;
        }
        if (uVar5 < 0x10) break;
        lVar4 = lVar4 + ((long)((ulong)uVar5 << 0x20) >> 0x24) * 0x20;
      }
      if (((DAT_00d1f1e0 & 1) != 0) || (iVar3 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar3 == 0))
      goto LAB_008bbb38;
                    /* try { // try from 008bbc98 to 008bbc9b has its CatchHandler @ 008bbcb4 */
      DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
    }
  }
  else {
    if (fVar1 == 4.2039e-45) {
      dVar7 = *param_2;
      if (dVar7 != (double)(int)dVar7) {
        uVar6 = (uint)((ulong)dVar7 >> 0x20) & 0x7fffffff;
        uVar5 = (SUB84(dVar7,0) ^ uVar6 >> 0x12) * 0x5bd1e995;
        uVar6 = (uVar6 ^ uVar5 >> 0x16) * 0x5bd1e995;
        lVar4 = *(long *)(param_1 + 0x28) +
                (ulong)((uVar6 ^ (uVar5 ^ uVar6 >> 0x11) * 0x5bd1e995 >> 0x13) * 0x5bd1e995 &
                       (-1 << (ulong)(*(byte *)(param_1 + 5) & 0x1f) ^ 0xffffffffU)) * 0x20;
        while( true ) {
          uVar5 = *(uint *)(lVar4 + 0x1c);
          if (((uVar5 & 0xf) == 3) && (*(double *)(lVar4 + 0x10) == dVar7)) {
            return lVar4;
          }
          if (uVar5 < 0x10) break;
          lVar4 = lVar4 + ((long)((ulong)uVar5 << 0x20) >> 0x24) * 0x20;
        }
        goto LAB_008bbc3c;
      }
      goto LAB_008bb7b8;
    }
    if (fVar1 == 5.60519e-45) {
      uVar8 = *(undefined8 *)((long)param_2 + 4);
      fVar2 = *(float *)param_2;
      iVar3 = -(uint)((float)uVar8 == -0.0);
      fVar9 = (float)((ulong)uVar8 >> 0x20);
      iVar12 = -(uint)(fVar9 == -0.0);
      bVar10 = (byte)((ulong)uVar8 >> 0x10) & ~(byte)((uint)iVar3 >> 0x10);
      bVar11 = (byte)((ulong)uVar8 >> 0x18) & ~(byte)((uint)iVar3 >> 0x18);
      bVar13 = (byte)((ulong)uVar8 >> 0x30) & ~(byte)((uint)iVar12 >> 0x10);
      bVar14 = (byte)((ulong)uVar8 >> 0x38) & ~(byte)((uint)iVar12 >> 0x18);
      iVar3 = CONCAT13(bVar11,CONCAT12(bVar10,CONCAT11(bVar11 >> 1 ^
                                                       (byte)((ulong)uVar8 >> 8) &
                                                       ~(byte)((uint)iVar3 >> 8),
                                                       (byte)(CONCAT11(bVar11,bVar10) >> 1) ^
                                                       (byte)uVar8 & ~(byte)iVar3)));
      fVar1 = 0.0;
      if (fVar2 != -0.0) {
        fVar1 = fVar2;
      }
      lVar4 = *(long *)(param_1 + 0x28) +
              (ulong)((iVar3 * 0x127409f ^ ((uint)fVar1 ^ (uint)fVar1 >> 0x11) * 0x466f45d ^
                      (int)(CONCAT17(bVar14,CONCAT16(bVar13,CONCAT15(bVar14 >> 1 ^
                                                                     (byte)((ulong)uVar8 >> 0x28) &
                                                                     ~(byte)((uint)iVar12 >> 8),
                                                                     CONCAT14((byte)(((ulong)
                                                  CONCAT11(bVar14,bVar13) << 0x30) >> 0x31) ^
                                                  (byte)((ulong)uVar8 >> 0x20) & ~(byte)iVar12,iVar3
                                                  )))) >> 0x20) * 0x4f9ffb7) &
                     (-1 << (ulong)(*(byte *)(param_1 + 5) & 0x1f) ^ 0xffffffffU)) * 0x20;
      while( true ) {
        uVar5 = *(uint *)(lVar4 + 0x1c);
        if (((((uVar5 & 0xf) == 4) && (*(float *)(lVar4 + 0x10) == fVar2)) &&
            (*(float *)(lVar4 + 0x14) == (float)uVar8)) && (*(float *)(lVar4 + 0x18) == fVar9)) {
          return lVar4;
        }
        if (uVar5 < 0x10) break;
        lVar4 = lVar4 + ((long)((ulong)uVar5 << 0x20) >> 0x24) * 0x20;
      }
      if (((DAT_00d1f1e0 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar3 != 0)) {
                    /* try { // try from 008bbc68 to 008bbc6b has its CatchHandler @ 008bbcc4 */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1f1e0);
      }
      goto LAB_008bbb38;
    }
    if (fVar1 == 7.00649e-45) goto LAB_008bb71c;
LAB_008bb7c4:
    uVar5 = SUB84(*param_2,0);
    uVar5 = (uVar5 ^ uVar5 >> 0x10) * -0x7a143595;
    uVar5 = (uVar5 ^ uVar5 >> 0xd) * -0x3d4d51cb;
    lVar4 = *(long *)(param_1 + 0x28) +
            (ulong)((uVar5 ^ uVar5 >> 0x10) &
                   (-1 << (ulong)(*(byte *)(param_1 + 5) & 0x1f) ^ 0xffffffffU)) * 0x20;
    while( true ) {
      uVar5 = *(uint *)(lVar4 + 0x1c);
      if (((float)(uVar5 & 0xf) == fVar1) && (*(double *)(lVar4 + 0x10) == *param_2)) {
        return lVar4;
      }
      if (uVar5 < 0x10) break;
      lVar4 = lVar4 + ((long)((ulong)uVar5 << 0x20) >> 0x24) * 0x20;
    }
    if (((DAT_00d1f1e0 & 1) != 0) || (iVar3 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar3 == 0))
    goto LAB_008bbb38;
                    /* try { // try from 008bbae8 to 008bbaeb has its CatchHandler @ 008bbcbc */
    DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
  }
  __cxa_guard_release(&DAT_00d1f1e0);
LAB_008bbb38:
  return (long)&DWORD_007f2ef0 + DAT_00d1f1d8;
}

