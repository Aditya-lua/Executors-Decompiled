/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc6aa0
 */

void FUN_00bc6aa0(byte *param_1,long param_2,ulong param_3)

{
  byte *pbVar1;
  ulong uVar2;
  ulong uVar3;
  byte bVar4;
  bool bVar5;
  ulong uVar6;
  long lVar7;
  
  if (param_3 != 0) {
    bVar4 = *param_1;
    bVar5 = (bVar4 & 1) != 0;
    uVar2 = (ulong)(bVar4 >> 1);
    if (bVar5) {
      uVar2 = *(ulong *)(param_1 + 8);
    }
    uVar6 = uVar2 - param_2;
    pbVar1 = param_1 + 4;
    if (bVar5) {
      pbVar1 = *(byte **)(param_1 + 0x10);
    }
    uVar3 = uVar6;
    if (param_3 <= uVar6) {
      uVar3 = param_3;
    }
    if (param_3 < uVar6) {
      memmove(pbVar1 + param_2 * 4,pbVar1 + param_2 * 4 + uVar3 * 4,(uVar6 - uVar3) * 4);
      bVar4 = *param_1;
    }
    lVar7 = uVar2 - uVar3;
    if ((bVar4 & 1) == 0) {
      *param_1 = (byte)((int)lVar7 << 1);
    }
    else {
      *(long *)(param_1 + 8) = lVar7;
    }
    pbVar1 = pbVar1 + lVar7 * 4;
    pbVar1[0] = 0;
    pbVar1[1] = 0;
    pbVar1[2] = 0;
    pbVar1[3] = 0;
  }
  return;
}

