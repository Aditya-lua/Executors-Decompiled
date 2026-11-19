/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4c270
 */

void FUN_00a4c270(ulong *param_1,long param_2,ulong param_3)

{
  byte *pbVar1;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  
  if (param_3 == 0) {
    uVar4 = 0;
    uVar5 = 0;
  }
  else {
    uVar6 = 0;
    uVar5 = 0;
    uVar4 = 0;
    do {
      pbVar1 = (byte *)(param_2 + uVar4);
      uVar4 = uVar4 + 1;
      uVar5 = (ulong)*pbVar1 << (uVar6 & 0x3f) | uVar5;
      if (7 < uVar4) break;
      uVar6 = uVar6 + 8;
    } while (uVar4 < param_3);
  }
  *param_1 = uVar5;
  if (uVar4 < param_3) {
    uVar6 = 0;
    uVar5 = 0;
    uVar7 = 0;
    do {
      uVar2 = uVar7 + 1;
      uVar5 = (ulong)*(byte *)(param_2 + uVar4 + uVar7) << (uVar6 & 0x3f) | uVar5;
      if (7 < uVar2) break;
      lVar3 = uVar4 + uVar7;
      uVar6 = uVar6 + 8;
      uVar7 = uVar2;
    } while (lVar3 + 1U < param_3);
    uVar4 = uVar4 + uVar2;
  }
  else {
    uVar5 = 0;
  }
  param_1[1] = uVar5;
  if (uVar4 < param_3) {
    uVar6 = 0;
    uVar5 = 0;
    uVar7 = 0;
    do {
      uVar2 = uVar7 + 1;
      uVar5 = (ulong)*(byte *)(param_2 + uVar4 + uVar7) << (uVar6 & 0x3f) | uVar5;
      if (7 < uVar2) break;
      lVar3 = uVar4 + uVar7;
      uVar6 = uVar6 + 8;
      uVar7 = uVar2;
    } while (lVar3 + 1U < param_3);
    uVar4 = uVar4 + uVar2;
  }
  else {
    uVar5 = 0;
  }
  param_1[2] = uVar5;
  if (uVar4 < param_3) {
    uVar6 = 0;
    uVar5 = 0;
    uVar7 = 0;
    do {
      uVar2 = uVar7 + 1;
      uVar5 = (ulong)*(byte *)(param_2 + uVar4 + uVar7) << (uVar6 & 0x3f) | uVar5;
      if (7 < uVar2) break;
      lVar3 = uVar4 + uVar7;
      uVar6 = uVar6 + 8;
      uVar7 = uVar2;
    } while (lVar3 + 1U < param_3);
    uVar4 = uVar4 + uVar2;
  }
  else {
    uVar5 = 0;
  }
  param_1[3] = uVar5;
  if (uVar4 < param_3) {
    uVar6 = 0;
    uVar5 = 0;
    uVar7 = 0;
    do {
      uVar2 = uVar7 + 1;
      uVar5 = (ulong)*(byte *)(param_2 + uVar4 + uVar7) << (uVar6 & 0x3f) | uVar5;
      if (7 < uVar2) break;
      lVar3 = uVar4 + uVar7;
      uVar6 = uVar6 + 8;
      uVar7 = uVar2;
    } while (lVar3 + 1U < param_3);
    uVar4 = uVar4 + uVar2;
  }
  else {
    uVar5 = 0;
  }
  param_1[4] = uVar5;
  if (uVar4 < param_3) {
    uVar6 = 0;
    uVar5 = 0;
    uVar7 = 0;
    do {
      uVar2 = uVar7 + 1;
      uVar5 = (ulong)*(byte *)(param_2 + uVar4 + uVar7) << (uVar6 & 0x3f) | uVar5;
      if (7 < uVar2) break;
      lVar3 = uVar4 + uVar7;
      uVar6 = uVar6 + 8;
      uVar7 = uVar2;
    } while (lVar3 + 1U < param_3);
    uVar4 = uVar4 + uVar2;
  }
  else {
    uVar5 = 0;
  }
  uVar6 = 0;
  param_1[5] = uVar5;
  if (uVar4 < param_3) {
    uVar5 = 0;
    uVar6 = 0;
    uVar7 = 0;
    do {
      uVar6 = (ulong)*(byte *)(param_2 + uVar4 + uVar7) << (uVar5 & 0x3f) | uVar6;
      if (7 < uVar7 + 1) break;
      uVar2 = uVar4 + 1 + uVar7;
      uVar5 = uVar5 + 8;
      uVar7 = uVar7 + 1;
    } while (uVar2 < param_3);
  }
  param_1[6] = uVar6;
  return;
}

