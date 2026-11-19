/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009156cc
 */

byte * curl_easy_unescape(undefined8 param_1,byte *param_2,int param_3,undefined4 *param_4)

{
  byte bVar1;
  byte bVar2;
  uint uVar3;
  undefined4 uVar4;
  byte *pbVar5;
  byte *pbVar6;
  byte *pbVar7;
  byte bVar8;
  long lVar9;
  byte *pbVar10;
  ulong uVar11;
  
  pbVar10 = (byte *)0x0;
  if ((param_2 != (byte *)0x0) && (-1 < param_3)) {
    if (param_3 == 0) {
      uVar11 = strlen((char *)param_2);
    }
    else {
      uVar11 = (ulong)param_3;
    }
    pbVar10 = (byte *)(*(code *)PTR_malloc_00cc4670)(uVar11 + 1);
    if (pbVar10 != (byte *)0x0) {
      if (uVar11 == 0) {
        *pbVar10 = 0;
        pbVar6 = pbVar10;
      }
      else {
        pbVar5 = pbVar10;
        do {
          pbVar7 = param_2 + 1;
          bVar8 = *param_2;
          lVar9 = -1;
          if ((2 < uVar11) && (bVar8 == 0x25)) {
            bVar1 = *pbVar7;
            if (9 < (bVar1 - 0x30 & 0xff)) {
              uVar3 = bVar1 - 0x41;
              lVar9 = -1;
              if ((0x25 < uVar3) || ((1L << ((ulong)uVar3 & 0x3f) & 0x3f0000003fU) == 0))
              goto LAB_009157d0;
            }
            bVar2 = param_2[2];
            if (9 < (bVar2 - 0x30 & 0xff)) {
              uVar3 = bVar2 - 0x41;
              lVar9 = -1;
              if ((0x25 < uVar3) || ((1L << ((ulong)uVar3 & 0x3f) & 0x3f0000003fU) == 0))
              goto LAB_009157d0;
            }
            pbVar7 = param_2 + 3;
            bVar8 = *(byte *)((long)&UINT_00746518 + (ulong)bVar2) |
                    *(char *)((long)&UINT_00746518 + (ulong)bVar1) << 4;
            lVar9 = -3;
          }
LAB_009157d0:
          uVar11 = uVar11 + lVar9;
          pbVar6 = pbVar5 + 1;
          *pbVar5 = bVar8;
          pbVar5 = pbVar6;
          param_2 = pbVar7;
        } while (uVar11 != 0);
        *pbVar6 = 0;
      }
      if (param_4 != (undefined4 *)0x0) {
        if ((ulong)((long)pbVar6 - (long)pbVar10) >> 0x1f == 0) {
          uVar4 = FUN_00963a5c();
          *param_4 = uVar4;
        }
        else {
          (*(code *)PTR_free_00cc4678)(pbVar10);
          pbVar10 = (byte *)0x0;
        }
      }
    }
  }
  return pbVar10;
}

