/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008451bc
 */

byte * FUN_008451bc(long param_1,byte *param_2,byte *param_3)

{
  byte bVar1;
  void *pvVar2;
  ushort uVar3;
  long lVar4;
  
  if (param_2 == param_3) {
    return param_2;
  }
  bVar1 = *param_2;
  if (bVar1 < 100) {
    if (bVar1 == 0x44) {
      pvVar2 = operator_new(0xa8);
                    /* try { // try from 00845294 to 008452a3 has its CatchHandler @ 008453b0 */
      FUN_00846298(pvVar2,param_1,*(undefined8 *)(*(long *)(param_1 + 0x38) + 8),1,
                   *(uint *)(param_1 + 0x18) & 1,*(uint *)(param_1 + 0x18) >> 3 & 1);
      goto LAB_008452a4;
    }
    if (bVar1 != 0x53) {
      if (bVar1 != 0x57) {
        return param_2;
      }
      pvVar2 = operator_new(0xa8);
                    /* try { // try from 0084521c to 0084522b has its CatchHandler @ 008453a8 */
      FUN_00846298(pvVar2,param_1,*(undefined8 *)(*(long *)(param_1 + 0x38) + 8),1,
                   *(uint *)(param_1 + 0x18) & 1,*(uint *)(param_1 + 0x18) >> 3 & 1);
      goto LAB_008452e8;
    }
    pvVar2 = operator_new(0xa8);
                    /* try { // try from 0084532c to 0084533b has its CatchHandler @ 008453a0 */
    FUN_00846298(pvVar2,param_1,*(undefined8 *)(*(long *)(param_1 + 0x38) + 8),1,
                 *(uint *)(param_1 + 0x18) & 1,*(uint *)(param_1 + 0x18) >> 3 & 1);
LAB_0084536c:
    lVar4 = *(long *)(param_1 + 0x38);
    uVar3 = *(ushort *)((long)pvVar2 + 0xa0);
    *(void **)(param_1 + 0x38) = pvVar2;
    *(void **)(lVar4 + 8) = pvVar2;
    uVar3 = uVar3 | 1;
  }
  else {
    if (bVar1 == 0x77) {
      pvVar2 = operator_new(0xa8);
                    /* try { // try from 008452d8 to 008452e7 has its CatchHandler @ 008453ac */
      FUN_00846298(pvVar2,param_1,*(undefined8 *)(*(long *)(param_1 + 0x38) + 8),0,
                   *(uint *)(param_1 + 0x18) & 1,*(uint *)(param_1 + 0x18) >> 3 & 1);
LAB_008452e8:
      lVar4 = *(long *)(param_1 + 0x38);
      uVar3 = *(ushort *)((long)pvVar2 + 0xa0);
      *(void **)(param_1 + 0x38) = pvVar2;
      *(void **)(lVar4 + 8) = pvVar2;
      *(ushort *)((long)pvVar2 + 0xa0) = uVar3 | 0x60;
      FUN_0084612c(pvVar2,0x5f);
      goto LAB_00845384;
    }
    if (bVar1 == 0x73) {
      pvVar2 = operator_new(0xa8);
                    /* try { // try from 0084535c to 0084536b has its CatchHandler @ 0084539c */
      FUN_00846298(pvVar2,param_1,*(undefined8 *)(*(long *)(param_1 + 0x38) + 8),0,
                   *(uint *)(param_1 + 0x18) & 1,*(uint *)(param_1 + 0x18) >> 3 & 1);
      goto LAB_0084536c;
    }
    if (bVar1 != 100) {
      return param_2;
    }
    pvVar2 = operator_new(0xa8);
                    /* try { // try from 00845264 to 00845273 has its CatchHandler @ 008453a4 */
    FUN_00846298(pvVar2,param_1,*(undefined8 *)(*(long *)(param_1 + 0x38) + 8),0,
                 *(uint *)(param_1 + 0x18) & 1,*(uint *)(param_1 + 0x18) >> 3 & 1);
LAB_008452a4:
    lVar4 = *(long *)(param_1 + 0x38);
    uVar3 = *(ushort *)((long)pvVar2 + 0xa0);
    *(void **)(param_1 + 0x38) = pvVar2;
    *(void **)(lVar4 + 8) = pvVar2;
    uVar3 = uVar3 | 0x40;
  }
  *(ushort *)((long)pvVar2 + 0xa0) = uVar3;
LAB_00845384:
  return param_2 + 1;
}

