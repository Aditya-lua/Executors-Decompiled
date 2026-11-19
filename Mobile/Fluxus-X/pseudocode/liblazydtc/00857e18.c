/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00857e18
 */

void FUN_00857e18(long param_1,long param_2)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  puVar1 = *(undefined8 **)(param_1 + 8);
  if (puVar1 < *(undefined8 **)(param_1 + 0x10)) {
    *puVar1 = &PTR_LAB_00c4a5f8;
    uVar2 = *(undefined8 *)(param_2 + 8);
    puVar1[2] = *(undefined8 *)(param_2 + 0x10);
    puVar1[1] = uVar2;
    if ((*(byte *)(param_2 + 0x18) & 1) == 0) {
      uVar3 = *(undefined8 *)(param_2 + 0x20);
      uVar2 = *(undefined8 *)(param_2 + 0x18);
      puVar1[5] = *(undefined8 *)(param_2 + 0x28);
      puVar1[4] = uVar3;
      puVar1[3] = uVar2;
    }
    else {
                    /* try { // try from 00857e7c to 00857e87 has its CatchHandler @ 00857ea4 */
      FUN_007ff40c(puVar1 + 3,*(undefined8 *)(param_2 + 0x28),*(undefined8 *)(param_2 + 0x20));
    }
    puVar1 = puVar1 + 6;
    *(undefined8 **)(param_1 + 8) = puVar1;
  }
  else {
    puVar1 = (undefined8 *)FUN_0086f04c(param_1);
  }
  *(undefined8 **)(param_1 + 8) = puVar1;
  return;
}

