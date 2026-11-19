/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a80258
 */

undefined8 OPENSSL_LH_retrieve(long *param_1,undefined8 param_2)

{
  int iVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  code *pcVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  
  if ((int)param_1[8] != 0) {
    *(undefined4 *)(param_1 + 8) = 0;
  }
  uVar2 = (*(code *)param_1[2])(param_2);
  uVar3 = (ulong)*(uint *)((long)param_1 + 0x24);
  uVar4 = 0;
  if (uVar3 != 0) {
    uVar4 = uVar2 / uVar3;
  }
  uVar3 = uVar2 - uVar4 * uVar3;
  if (uVar3 < *(uint *)(param_1 + 4)) {
    uVar4 = (ulong)*(uint *)((long)param_1 + 0x1c);
    uVar3 = 0;
    if (uVar4 != 0) {
      uVar3 = uVar2 / uVar4;
    }
    uVar3 = uVar2 - uVar3 * uVar4;
  }
  puVar6 = (undefined8 *)(*param_1 + ((long)(uVar3 << 0x20) >> 0x1d));
  puVar7 = (undefined8 *)*puVar6;
  if (puVar7 != (undefined8 *)0x0) {
    pcVar5 = (code *)param_1[1];
    do {
      if ((puVar7[2] == uVar2) && (iVar1 = (*pcVar5)(*puVar7,param_2), iVar1 == 0)) {
        if ((undefined8 *)*puVar6 == (undefined8 *)0x0) {
          return 0;
        }
        return *(undefined8 *)*puVar6;
      }
      puVar6 = puVar7 + 1;
      puVar7 = (undefined8 *)*puVar6;
    } while (puVar7 != (undefined8 *)0x0);
  }
  return 0;
}

