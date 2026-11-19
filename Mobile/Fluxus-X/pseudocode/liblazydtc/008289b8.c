/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008289b8
 */

void FUN_008289b8(undefined8 *param_1,long param_2,byte *param_3)

{
  byte bVar1;
  void *pvVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  
  pvVar2 = operator_new(0x50);
  bVar1 = *param_3;
  *param_1 = pvVar2;
  param_1[1] = param_2 + 8;
  param_1[2] = 0;
  if ((bVar1 & 1) == 0) {
    uVar4 = *(undefined8 *)param_3;
    uVar3 = *(undefined8 *)(param_3 + 0x10);
    *(undefined8 *)((long)pvVar2 + 0x28) = *(undefined8 *)(param_3 + 8);
    *(undefined8 *)((long)pvVar2 + 0x20) = uVar4;
    *(undefined8 *)((long)pvVar2 + 0x30) = uVar3;
  }
  else {
                    /* try { // try from 00828a08 to 00828a0f has its CatchHandler @ 00828a74 */
    FUN_007ff40c((long)pvVar2 + 0x20,*(undefined8 *)(param_3 + 0x10),*(undefined8 *)(param_3 + 8));
  }
  if ((param_3[0x18] & 1) == 0) {
    uVar4 = *(undefined8 *)(param_3 + 0x18);
    uVar3 = *(undefined8 *)(param_3 + 0x28);
    *(undefined8 *)((long)pvVar2 + 0x40) = *(undefined8 *)(param_3 + 0x20);
    *(undefined8 *)((long)pvVar2 + 0x38) = uVar4;
    *(undefined8 *)((long)pvVar2 + 0x48) = uVar3;
  }
  else {
                    /* try { // try from 00828a34 to 00828a3b has its CatchHandler @ 00828a54 */
    FUN_007ff40c((long)pvVar2 + 0x38,*(undefined8 *)(param_3 + 0x28),*(undefined8 *)(param_3 + 0x20)
                );
  }
  *(undefined1 *)(param_1 + 2) = 1;
  return;
}

