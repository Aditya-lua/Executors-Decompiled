/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2f528
 */

undefined8 FUN_00c2f528(ulong *param_1,undefined8 param_2,undefined8 *param_3)

{
  ulong uVar1;
  undefined8 uVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  long lVar6;
  ulong uVar7;
  ulong *puVar8;
  long lVar9;
  int *piVar10;
  ulong uVar11;
  ulong uVar12;
  undefined8 local_70 [4];
  
  uVar5 = (ulong)(ushort)param_1[3];
  if (uVar5 == 0) {
    return 0;
  }
  uVar7 = param_3[2];
  uVar12 = *param_1;
  if (uVar12 <= uVar7) {
    piVar10 = (int *)param_1[2];
    uVar4 = uVar5;
    do {
      if (((*piVar10 == 1) && (uVar1 = *(long *)(piVar10 + 4) + uVar12, uVar1 <= uVar7)) &&
         (uVar11 = *(ulong *)(piVar10 + 10), uVar7 < uVar11 + uVar1)) {
        puVar8 = (ulong *)param_3[1];
        uVar7 = uVar5 + 0xffffffff;
        *puVar8 = uVar1;
        puVar8[1] = uVar11;
        do {
          uVar5 = uVar5 - 1;
          piVar10 = (int *)(param_1[2] + (uVar7 & 0xffffffff) * 0x38);
          if (*piVar10 == 0x6474e550) {
            uVar2 = *param_3;
            lVar3 = param_3[1];
            lVar6 = *(long *)(piVar10 + 10);
            lVar9 = *(long *)(piVar10 + 4) + uVar12;
            *(long *)(lVar3 + 0x20) = lVar9;
            *(long *)(lVar3 + 0x28) = lVar6;
            uVar4 = FUN_00c2f664(uVar2,lVar9,lVar6 + lVar9,local_70);
            if ((uVar4 & 1) != 0) {
              lVar9 = param_3[1];
              *(undefined8 *)(lVar9 + 0x10) = local_70[0];
              *(undefined8 *)(lVar9 + 0x18) = 0xffffffffffffffff;
              return 1;
            }
          }
          uVar7 = uVar7 - 1;
        } while ((uVar5 & 0xffff) != 0);
        return 0;
      }
      uVar4 = uVar4 - 1;
      piVar10 = piVar10 + 0xe;
    } while (uVar4 != 0);
  }
  return 0;
}

