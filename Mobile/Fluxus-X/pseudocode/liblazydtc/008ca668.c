/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ca668
 */

undefined8 FUN_008ca668(undefined8 *param_1,long param_2,long *param_3)

{
  byte bVar1;
  undefined8 uVar2;
  byte *pbVar4;
  byte *pbVar3;
  uint uVar5;
  long lVar6;
  uint uVar7;
  uint uVar8;
  long lVar9;
  
  lVar6 = param_1[2];
  if (lVar6 == 0) {
    lVar9 = param_1[1];
    lVar6 = *param_3;
    uVar7 = 0;
    uVar8 = 0;
    do {
      bVar1 = *(byte *)(param_2 + lVar6);
      lVar6 = lVar6 + 1;
      *param_3 = lVar6;
      uVar5 = uVar7 & 0x1f;
      uVar7 = uVar7 + 7;
      uVar8 = (bVar1 & 0x7f) << (ulong)uVar5 | uVar8;
    } while ((char)bVar1 < '\0');
    if (uVar8 != 0) {
      return *(undefined8 *)(*(long *)(lVar9 + 8) + (ulong)(uVar8 - 1) * 8);
    }
  }
  else {
    lVar9 = *param_3;
    uVar7 = 0;
    uVar8 = 0;
    do {
      bVar1 = *(byte *)(param_2 + lVar9);
      lVar9 = lVar9 + 1;
      *param_3 = lVar9;
      uVar5 = uVar7 & 0x1f;
      uVar7 = uVar7 + 7;
      uVar8 = (bVar1 & 0x7f) << (ulong)uVar5 | uVar8;
    } while ((char)bVar1 < '\0');
    if (uVar8 != 0) {
      uVar7 = 0;
      uVar5 = 0;
      pbVar4 = (byte *)(param_2 + (ulong)*(uint *)(*(long *)(lVar6 + 0x60) + (ulong)(uVar8 - 1) * 4)
                       );
      do {
        pbVar3 = pbVar4 + 1;
        bVar1 = *pbVar4;
        uVar8 = uVar7 & 0x1f;
        uVar7 = uVar7 + 7;
        uVar5 = (bVar1 & 0x7f) << (ulong)uVar8 | uVar5;
        pbVar4 = pbVar3;
      } while ((char)bVar1 < '\0');
      uVar2 = FUN_008b9ff8(*param_1,pbVar3,uVar5);
      return uVar2;
    }
  }
  return 0;
}

