/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b98d0
 */

undefined8 * FUN_008b98d0(long param_1)

{
  undefined1 uVar1;
  byte bVar2;
  undefined8 *puVar3;
  long lVar4;
  
  puVar3 = (undefined8 *)FUN_008b78d0(param_1,0x88,*(undefined1 *)(param_1 + 4),9,0);
  puVar3[0x10] = 0;
  puVar3[1] = 0;
  *puVar3 = 0;
  puVar3[3] = 0;
  puVar3[2] = 0;
  puVar3[5] = 0;
  puVar3[4] = 0;
  puVar3[7] = 0;
  puVar3[6] = 0;
  puVar3[9] = 0;
  puVar3[8] = 0;
  puVar3[0xb] = 0;
  puVar3[10] = 0;
  puVar3[0xd] = 0;
  puVar3[0xc] = 0;
  puVar3[0xf] = 0;
  puVar3[0xe] = 0;
  lVar4 = *(long *)(param_1 + 0x60);
  uVar1 = *(undefined1 *)(param_1 + 4);
  *(undefined1 *)puVar3 = 9;
  bVar2 = *(byte *)(lVar4 + 2);
  *(undefined1 *)((long)puVar3 + 1) = uVar1;
  puVar3[0xc] = lVar4;
  *(undefined1 *)((long)puVar3 + 4) = uVar1;
  *(byte *)((long)puVar3 + 2) = bVar2 & 3;
  FUN_008b9968(puVar3,param_1);
  uVar1 = *(undefined1 *)(param_1 + 5);
  puVar3[0xf] = *(undefined8 *)(param_1 + 0x78);
  *(undefined1 *)((long)puVar3 + 5) = uVar1;
  return puVar3;
}

