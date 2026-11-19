/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7d2a0
 */

undefined8 mbedtls_mpi_safe_cond_assign(long *param_1,undefined8 *param_2,ulong param_3)

{
  ushort uVar1;
  ushort uVar2;
  undefined8 uVar3;
  void *__dest;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  undefined8 *puVar9;
  ulong uVar10;
  ulong uVar11;
  void *__src;
  size_t __n;
  byte bVar12;
  byte bVar13;
  byte bVar14;
  byte bVar15;
  byte bVar16;
  byte bVar17;
  byte bVar18;
  byte bVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  
  uVar1 = *(ushort *)((long)param_2 + 10);
  if ((ulong)uVar1 < 0x2711) {
    uVar2 = *(ushort *)((long)param_1 + 10);
    if (uVar2 < uVar1) {
      __dest = calloc((ulong)uVar1,8);
      if (__dest == (void *)0x0) goto LAB_00b7d2d4;
      __src = (void *)*param_1;
      if (__src != (void *)0x0) {
        __n = (ulong)uVar2 << 3;
        memcpy(__dest,__src,__n);
        mbedtls_zeroize_and_free(__src,__n);
      }
      *(ushort *)((long)param_1 + 10) = uVar1;
      *param_1 = (long)__dest;
    }
    uVar4 = -(param_3 & 0xff);
    uVar11 = (long)(uVar4 | param_3 & 0xff) >> 0x3f;
    uVar1 = (ushort)((long)uVar4 >> 0x3f);
    *(ushort *)(param_1 + 1) =
         (*(short *)(param_2 + 1) + 1U & uVar1 | ~uVar1 & (short)param_1[1] + 1U) - 1;
    mbedtls_mpi_core_cond_assign(*param_1,*param_2,*(undefined2 *)((long)param_2 + 10),uVar11);
    uVar4 = (ulong)*(ushort *)((long)param_2 + 10);
    uVar1 = *(ushort *)((long)param_1 + 10);
    uVar3 = 0;
    if (*(ushort *)((long)param_2 + 10) < uVar1) {
      lVar5 = *param_1;
      uVar6 = uVar1 - uVar4;
      uVar11 = ~uVar11;
      if (3 < uVar6) {
        uVar8 = uVar6 & 0xfffffffffffffffc;
        lVar7 = uVar4 * 8;
        uVar4 = uVar8 + uVar4;
        puVar9 = (undefined8 *)(lVar5 + lVar7 + 0x10);
        uVar10 = uVar8;
        do {
          uVar20 = puVar9[-1];
          uVar3 = puVar9[-2];
          uVar22 = puVar9[1];
          uVar21 = *puVar9;
          uVar10 = uVar10 - 4;
          bVar12 = (byte)uVar11;
          bVar13 = (byte)(uVar11 >> 8);
          bVar14 = (byte)(uVar11 >> 0x10);
          bVar15 = (byte)(uVar11 >> 0x18);
          bVar16 = (byte)(uVar11 >> 0x20);
          bVar17 = (byte)(uVar11 >> 0x28);
          bVar18 = (byte)(uVar11 >> 0x30);
          bVar19 = (byte)(uVar11 >> 0x38);
          puVar9[-1] = CONCAT17((byte)((ulong)uVar20 >> 0x38) & bVar19,
                                CONCAT16((byte)((ulong)uVar20 >> 0x30) & bVar18,
                                         CONCAT15((byte)((ulong)uVar20 >> 0x28) & bVar17,
                                                  CONCAT14((byte)((ulong)uVar20 >> 0x20) & bVar16,
                                                           CONCAT13((byte)((ulong)uVar20 >> 0x18) &
                                                                    bVar15,CONCAT12((byte)((ulong)
                                                  uVar20 >> 0x10) & bVar14,
                                                  CONCAT11((byte)((ulong)uVar20 >> 8) & bVar13,
                                                           (byte)uVar20 & bVar12)))))));
          puVar9[-2] = CONCAT17((byte)((ulong)uVar3 >> 0x38) & bVar19,
                                CONCAT16((byte)((ulong)uVar3 >> 0x30) & bVar18,
                                         CONCAT15((byte)((ulong)uVar3 >> 0x28) & bVar17,
                                                  CONCAT14((byte)((ulong)uVar3 >> 0x20) & bVar16,
                                                           CONCAT13((byte)((ulong)uVar3 >> 0x18) &
                                                                    bVar15,CONCAT12((byte)((ulong)
                                                  uVar3 >> 0x10) & bVar14,
                                                  CONCAT11((byte)((ulong)uVar3 >> 8) & bVar13,
                                                           (byte)uVar3 & bVar12)))))));
          puVar9[1] = CONCAT17((byte)((ulong)uVar22 >> 0x38) & bVar19,
                               CONCAT16((byte)((ulong)uVar22 >> 0x30) & bVar18,
                                        CONCAT15((byte)((ulong)uVar22 >> 0x28) & bVar17,
                                                 CONCAT14((byte)((ulong)uVar22 >> 0x20) & bVar16,
                                                          CONCAT13((byte)((ulong)uVar22 >> 0x18) &
                                                                   bVar15,CONCAT12((byte)((ulong)
                                                  uVar22 >> 0x10) & bVar14,
                                                  CONCAT11((byte)((ulong)uVar22 >> 8) & bVar13,
                                                           (byte)uVar22 & bVar12)))))));
          *puVar9 = CONCAT17((byte)((ulong)uVar21 >> 0x38) & bVar19,
                             CONCAT16((byte)((ulong)uVar21 >> 0x30) & bVar18,
                                      CONCAT15((byte)((ulong)uVar21 >> 0x28) & bVar17,
                                               CONCAT14((byte)((ulong)uVar21 >> 0x20) & bVar16,
                                                        CONCAT13((byte)((ulong)uVar21 >> 0x18) &
                                                                 bVar15,CONCAT12((byte)((ulong)
                                                  uVar21 >> 0x10) & bVar14,
                                                  CONCAT11((byte)((ulong)uVar21 >> 8) & bVar13,
                                                           (byte)uVar21 & bVar12)))))));
          puVar9 = puVar9 + 4;
        } while (uVar10 != 0);
        if (uVar6 == uVar8) {
          return 0;
        }
      }
      do {
        lVar7 = uVar4 * 8;
        uVar4 = uVar4 + 1;
        *(ulong *)(lVar5 + lVar7) = *(ulong *)(lVar5 + lVar7) & uVar11;
      } while (uVar4 < uVar1);
      uVar3 = 0;
    }
  }
  else {
LAB_00b7d2d4:
    uVar3 = 0xfffffff0;
  }
  return uVar3;
}

