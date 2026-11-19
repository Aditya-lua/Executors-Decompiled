/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fcc8c
 */

void FUN_007fcc8c(long param_1,byte *param_2)

{
  ulong uVar1;
  long lVar2;
  byte bVar3;
  undefined8 *puVar4;
  long lVar5;
  long lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  
  std::__ndk1::mutex::lock((mutex *)(param_1 + 0x60));
  lVar5 = *(long *)(param_1 + 0x38);
  lVar6 = *(long *)(param_1 + 0x40);
  lVar2 = 0;
  if (lVar6 != lVar5) {
    lVar2 = (lVar6 - lVar5 >> 3) * 0xaa + -1;
  }
  if (lVar2 == *(long *)(param_1 + 0x58) + *(long *)(param_1 + 0x50)) {
                    /* try { // try from 007fccd8 to 007fcd4b has its CatchHandler @ 007fcd68 */
    FUN_007feb50(param_1 + 0x30);
    lVar5 = *(long *)(param_1 + 0x38);
    lVar6 = *(long *)(param_1 + 0x40);
  }
  if (lVar6 == lVar5) {
    puVar4 = (undefined8 *)0x0;
    bVar3 = *param_2;
  }
  else {
    uVar1 = *(long *)(param_1 + 0x58) + *(long *)(param_1 + 0x50);
    puVar4 = (undefined8 *)(*(long *)(lVar5 + (uVar1 / 0xaa) * 8) + (uVar1 % 0xaa) * 0x18);
    bVar3 = *param_2;
  }
  if ((bVar3 & 1) == 0) {
    uVar8 = *(undefined8 *)(param_2 + 8);
    uVar7 = *(undefined8 *)param_2;
    puVar4[2] = *(undefined8 *)(param_2 + 0x10);
    puVar4[1] = uVar8;
    *puVar4 = uVar7;
  }
  else {
    FUN_007ff40c(puVar4,*(undefined8 *)(param_2 + 0x10),*(undefined8 *)(param_2 + 8));
  }
  *(long *)(param_1 + 0x58) = *(long *)(param_1 + 0x58) + 1;
  std::__ndk1::mutex::unlock((mutex *)(param_1 + 0x60));
  return;
}

