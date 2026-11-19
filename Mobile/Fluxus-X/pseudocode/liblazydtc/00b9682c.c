/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9682c
 */

int FUN_00b9682c(undefined8 *param_1)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong *puVar4;
  ulong uVar5;
  ushort uVar6;
  int iVar7;
  ulong *puVar8;
  ulong *puVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  
  iVar7 = mbedtls_mpi_grow(param_1,6);
  if (iVar7 == 0) {
    puVar8 = (ulong *)*param_1;
    uVar6 = *(ushort *)((long)param_1 + 10);
    uVar12 = *puVar8;
    uVar13 = puVar8[1];
    uVar10 = puVar8[3];
    puVar9 = puVar8 + 5;
    uVar11 = *puVar9;
    uVar5 = 2;
    if (!CARRY8(uVar10,uVar12)) {
      uVar5 = 1;
    }
    *puVar8 = uVar11 + uVar10 + uVar12;
    uVar3 = (ulong)CARRY8(uVar10,uVar12);
    if (CARRY8(uVar11,uVar10 + uVar12)) {
      uVar3 = uVar5;
    }
    uVar12 = puVar8[4];
    uVar5 = 2;
    if (!CARRY8(uVar3,uVar13)) {
      uVar5 = 1;
    }
    uVar1 = uVar3 + uVar13 + uVar10;
    uVar2 = (ulong)CARRY8(uVar3,uVar13);
    if (CARRY8(uVar3 + uVar13,uVar10)) {
      uVar2 = uVar5;
    }
    uVar13 = puVar8[2];
    uVar5 = uVar12 + uVar1;
    if (CARRY8(uVar12,uVar1)) {
      uVar2 = uVar2 + 1;
    }
    puVar8[1] = uVar11 + uVar5;
    if (CARRY8(uVar11,uVar5)) {
      uVar2 = uVar2 + 1;
    }
    uVar5 = 2;
    if (!CARRY8(uVar2,uVar13)) {
      uVar5 = 1;
    }
    uVar10 = uVar2 + uVar13 + uVar12;
    uVar3 = (ulong)CARRY8(uVar2,uVar13);
    if (CARRY8(uVar2 + uVar13,uVar12)) {
      uVar3 = uVar5;
    }
    puVar8[2] = uVar11 + uVar10;
    if (CARRY8(uVar11,uVar10)) {
      uVar3 = uVar3 + 1;
    }
    puVar8[3] = uVar3;
    if (4 < (ulong)uVar6) {
      puVar4 = puVar8 + uVar6;
      if (puVar8 + uVar6 <= puVar9) {
        puVar4 = puVar9;
      }
      memset(puVar8 + 4,0,(long)puVar4 + (~(ulong)puVar8 - 0x18) & 0xfffffffffffffff8);
    }
  }
  return iVar7;
}

