/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091583c
 */

undefined8 FUN_0091583c(byte *param_1,ulong param_2,long *param_3,long *param_4,int param_5)

{
  byte bVar1;
  byte bVar2;
  uint uVar3;
  byte *pbVar4;
  byte *pbVar5;
  undefined8 uVar6;
  byte *pbVar7;
  byte bVar8;
  long lVar9;
  
  if (param_2 == 0) {
    param_2 = strlen((char *)param_1);
  }
  pbVar4 = (byte *)(*(code *)PTR_malloc_00cc4670)(param_2 + 1);
  if (pbVar4 == (byte *)0x0) {
    uVar6 = 0x1b;
  }
  else {
    *param_3 = (long)pbVar4;
    if (param_2 != 0) {
      pbVar5 = pbVar4;
      do {
        pbVar7 = param_1 + 1;
        bVar8 = *param_1;
        lVar9 = -1;
        if ((2 < param_2) && (bVar8 == 0x25)) {
          bVar1 = *pbVar7;
          if (9 < (bVar1 - 0x30 & 0xff)) {
            uVar3 = bVar1 - 0x41;
            lVar9 = -1;
            if ((0x25 < uVar3) || ((1L << ((ulong)uVar3 & 0x3f) & 0x3f0000003fU) == 0))
            goto LAB_00915938;
          }
          bVar2 = param_1[2];
          if (9 < (bVar2 - 0x30 & 0xff)) {
            uVar3 = bVar2 - 0x41;
            lVar9 = -1;
            if ((0x25 < uVar3) || ((1L << ((ulong)uVar3 & 0x3f) & 0x3f0000003fU) == 0))
            goto LAB_00915938;
          }
          pbVar7 = param_1 + 3;
          bVar8 = *(byte *)((long)&UINT_00746518 + (ulong)bVar2) |
                  *(char *)((long)&UINT_00746518 + (ulong)bVar1) << 4;
          lVar9 = -3;
        }
LAB_00915938:
        if ((param_5 == 3 && bVar8 < 0x20) || (param_5 == 4 && bVar8 == 0)) {
          (*(code *)PTR_free_00cc4678)(*param_3);
          *param_3 = 0;
          return 3;
        }
        param_2 = param_2 + lVar9;
        pbVar4 = pbVar5 + 1;
        *pbVar5 = bVar8;
        pbVar5 = pbVar4;
        param_1 = pbVar7;
      } while (param_2 != 0);
    }
    uVar6 = 0;
    *pbVar4 = 0;
    if (param_4 != (long *)0x0) {
      *param_4 = (long)pbVar4 - *param_3;
    }
  }
  return uVar6;
}

