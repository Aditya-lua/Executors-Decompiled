/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851588
 */

long FUN_00851588(uint param_1)

{
  uint3 *puVar1;
  uint3 *puVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  
  uVar4 = 0x6fa;
  puVar2 = (uint3 *)&DAT_0035f77c;
  do {
    uVar5 = uVar4 >> 1;
    puVar1 = puVar2 + uVar5 * 2 + 2;
    uVar4 = uVar4 + ~uVar5;
    if (param_1 <= puVar2[uVar5 * 2]) {
      puVar1 = puVar2;
      uVar4 = uVar5;
    }
    puVar2 = puVar1;
  } while (uVar4 != 0);
  if (puVar1 == (uint3 *)&switchD_00852230::switchdataD_00362f4c) {
    return 0;
  }
  lVar3 = (long)puVar1 + 3;
  if (param_1 != *puVar1) {
    lVar3 = 0;
  }
  return lVar3;
}

