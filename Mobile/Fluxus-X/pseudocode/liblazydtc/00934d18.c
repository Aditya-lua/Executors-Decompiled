/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00934d18
 */

undefined8 FUN_00934d18(long *param_1,long param_2)

{
  long lVar1;
  int *piVar2;
  ushort uVar3;
  uint uVar4;
  int iVar5;
  byte bVar6;
  uint uVar7;
  ulong uVar8;
  long lVar9;
  long lVar10;
  
  uVar4 = *(uint *)(param_2 + 0x14);
  if (uVar4 != 0) {
    uVar8 = 0;
    do {
      bVar6 = *(byte *)(param_2 + uVar8 + 0x18);
      uVar3 = bVar6 & 1 | (bVar6 >> 1 & 1) << 2;
      if (uVar3 != 0) {
        uVar7 = *(uint *)(param_1 + 1);
        iVar5 = *(int *)(param_2 + uVar8 * 4);
        if ((int)uVar7 < 0) {
LAB_00934d8c:
          if (*(uint *)((long)param_1 + 0xc) <= uVar7) {
            return 0x1b;
          }
          piVar2 = (int *)(*param_1 + (ulong)uVar7 * 8);
          *piVar2 = iVar5;
          *(ushort *)(piVar2 + 1) = uVar3;
          *(uint *)(param_1 + 1) = uVar7 + 1;
        }
        else {
          lVar9 = (long)(int)uVar7 + 1;
          lVar10 = (long)(int)uVar7 << 3;
          do {
            lVar9 = lVar9 + -1;
            if (lVar9 < 1) goto LAB_00934d8c;
            lVar1 = *param_1 + lVar10;
            lVar10 = lVar10 + -8;
          } while (*(int *)(lVar1 + -8) != iVar5);
          lVar10 = *param_1 + lVar10;
          *(ushort *)(lVar10 + 4) = *(ushort *)(lVar10 + 4) | uVar3;
        }
      }
      uVar8 = uVar8 + 1;
    } while (uVar8 < uVar4);
  }
  return 0;
}

