/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00934ba4
 */

undefined8 FUN_00934ba4(long *param_1,long param_2)

{
  int *piVar1;
  int iVar2;
  long lVar3;
  ushort uVar4;
  int iVar5;
  byte bVar6;
  uint uVar7;
  uint uVar8;
  long lVar9;
  long lVar10;
  void *__dest;
  ulong uVar11;
  
  uVar7 = *(uint *)(param_2 + 0x14);
  if (uVar7 != 0) {
    uVar11 = 0;
    do {
      bVar6 = *(byte *)(param_2 + uVar11 + 0x18);
      uVar4 = bVar6 & 1 | (bVar6 >> 1 & 1) << 2;
      if (uVar4 != 0) {
        uVar8 = *(uint *)(param_1 + 1);
        iVar5 = *(int *)(param_2 + uVar11 * 4);
        if ((int)uVar8 < 0) {
LAB_00934c50:
          if (uVar8 < *(uint *)((long)param_1 + 0xc)) {
            __dest = (void *)*param_1;
          }
          else {
            iVar2 = *(uint *)((long)param_1 + 0xc) + 100;
            __dest = (void *)(*(code *)PTR_calloc_00cc4690)(iVar2,8);
            if (__dest == (void *)0x0) {
              return 0x1b;
            }
            memcpy(__dest,(void *)*param_1,(ulong)*(uint *)((long)param_1 + 0xc) << 3);
            bVar6 = *(byte *)(param_1 + 2);
            if ((bVar6 & 1) != 0) {
              (*(code *)PTR_free_00cc4678)(*param_1);
              bVar6 = *(byte *)(param_1 + 2);
            }
            *param_1 = (long)__dest;
            *(int *)((long)param_1 + 0xc) = iVar2;
            *(byte *)(param_1 + 2) = bVar6 | 1;
            uVar8 = *(uint *)(param_1 + 1);
            uVar7 = *(uint *)(param_2 + 0x14);
          }
          piVar1 = (int *)((long)__dest + (ulong)uVar8 * 8);
          *piVar1 = iVar5;
          *(ushort *)(piVar1 + 1) = uVar4;
          *(uint *)(param_1 + 1) = uVar8 + 1;
        }
        else {
          lVar9 = (long)(int)uVar8 + 1;
          lVar10 = (long)(int)uVar8 << 3;
          do {
            lVar9 = lVar9 + -1;
            if (lVar9 < 1) goto LAB_00934c50;
            lVar3 = *param_1 + lVar10;
            lVar10 = lVar10 + -8;
          } while (*(int *)(lVar3 + -8) != iVar5);
          lVar10 = *param_1 + lVar10;
          *(ushort *)(lVar10 + 4) = *(ushort *)(lVar10 + 4) | uVar4;
        }
      }
      uVar11 = uVar11 + 1;
    } while (uVar11 < uVar7);
  }
  return 0;
}

