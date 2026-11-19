/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b81a7c
 */

void mbedtls_mpi_is_prime_ext(long *param_1,int param_2)

{
  long *plVar1;
  byte *pbVar2;
  ulong *puVar3;
  int iVar4;
  long lVar5;
  bool bVar6;
  undefined8 uVar7;
  ulong uVar8;
  long lVar9;
  uint uVar10;
  long lVar11;
  long lVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong *local_38;
  undefined2 local_30;
  ushort local_2e;
  long local_28;
  
  lVar5 = tpidr_el0;
  local_28 = *(long *)(lVar5 + 0x28);
  local_30 = 1;
  local_2e = *(ushort *)((long)param_1 + 10);
  local_38 = (ulong *)*param_1;
  uVar8 = (ulong)local_2e;
  do {
    if (uVar8 == 0) goto LAB_00b81b54;
    lVar9 = uVar8 - 1;
    uVar8 = uVar8 - 1;
  } while (local_38[lVar9] == 0);
  lVar9 = (ulong)local_2e - 1;
  lVar11 = lVar9;
  do {
    lVar12 = lVar11;
    if (lVar12 == -1) goto LAB_00b81b0c;
    lVar11 = lVar12 + -1;
  } while (local_38[lVar12] == 0);
  if (lVar12 + 1U < 2) {
    lVar11 = 0;
    do {
      if (lVar11 == -8) goto LAB_00b81b54;
      plVar1 = (long *)((long)local_38 + lVar11);
      lVar11 = lVar11 + -8;
    } while (*plVar1 == 1);
  }
LAB_00b81b0c:
  lVar11 = lVar9;
  do {
    lVar12 = lVar11;
    if (lVar12 == -1) goto LAB_00b81b4c;
    lVar11 = lVar12 + -1;
  } while (local_38[lVar12] == 0);
  if (lVar12 + 1U < 2) {
    lVar11 = 0;
    do {
      if (lVar11 == -8) goto LAB_00b81c60;
      plVar1 = (long *)((long)local_38 + lVar11);
      lVar11 = lVar11 + -8;
    } while (*plVar1 == 2);
  }
LAB_00b81b4c:
  if ((*local_38 & 1) != 0) {
    uVar8 = 0;
    uVar10 = 3;
    do {
      if (uVar10 == 0) {
        uVar7 = 0xfffffff4;
        goto LAB_00b81b58;
      }
      uVar13 = (ulong)uVar10;
      if ((local_2e == 0) || (uVar10 == 1)) goto LAB_00b81c04;
      uVar14 = *local_38 & 1;
      if (uVar10 != 2) {
        uVar14 = 0;
        lVar11 = lVar9;
        do {
          uVar15 = local_38[lVar11];
          bVar6 = lVar11 != 0;
          iVar4 = 0;
          if (uVar13 != 0) {
            iVar4 = (int)((uVar15 >> 0x20 | uVar14 << 0x20) / uVar13);
          }
          uVar14 = uVar15 & 0xffffffff | (ulong)((int)(uVar15 >> 0x20) - iVar4 * uVar10) << 0x20;
          uVar15 = 0;
          if (uVar13 != 0) {
            uVar15 = uVar14 / uVar13;
          }
          uVar14 = uVar14 - uVar15 * uVar13;
          lVar11 = lVar11 + -1;
        } while (bVar6);
      }
      if (uVar14 == 0) goto LAB_00b81c04;
      pbVar2 = &DAT_002d499f + uVar8;
      uVar8 = uVar8 + 1;
      uVar10 = uVar10 + *pbVar2;
    } while (uVar8 < 0xa7);
    uVar7 = FUN_00b81c6c(&local_38,(long)param_2);
    goto LAB_00b81b58;
  }
  goto LAB_00b81b54;
LAB_00b81c60:
  uVar7 = 0;
  goto LAB_00b81b58;
  while (lVar9 = lVar11 + -1, local_38[lVar11] == 0) {
LAB_00b81c04:
    lVar11 = lVar9;
    if (lVar11 == -1) goto LAB_00b81b54;
  }
  if (lVar11 == 0) {
    lVar9 = 0;
    uVar7 = 0xfffffff2;
    do {
      if (lVar9 == -8) goto LAB_00b81c60;
      puVar3 = (ulong *)((long)local_38 + lVar9);
      lVar9 = lVar9 + -8;
    } while (*puVar3 == uVar13);
    goto LAB_00b81b58;
  }
LAB_00b81b54:
  uVar7 = 0xfffffff2;
LAB_00b81b58:
  if (*(long *)(lVar5 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar7);
  }
  return;
}

