/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b4cdc
 */

void FUN_008b4cdc(long param_1)

{
  undefined1 uVar1;
  byte bVar2;
  undefined1 *puVar3;
  long lVar4;
  
  puVar3 = (undefined1 *)FUN_008b78d0(param_1,0xf0,*(undefined1 *)(param_1 + 4),0xe,0);
  uVar1 = *(undefined1 *)(param_1 + 4);
  lVar4 = *(long *)(param_1 + 0x60);
  *puVar3 = 0xe;
  puVar3[1] = uVar1;
  bVar2 = *(byte *)(lVar4 + 2);
  *(undefined8 *)(puVar3 + 0x44) = 0;
  *(undefined8 *)(puVar3 + 0x3c) = 0;
  *(undefined8 *)(puVar3 + 0x3b) = 0;
  *(undefined8 *)(puVar3 + 0x33) = 0;
  *(undefined8 *)(puVar3 + 0x2b) = 0;
  *(undefined8 *)(puVar3 + 0x23) = 0;
  puVar3[2] = bVar2 & 3;
  *(undefined8 *)(puVar3 + 0x1b) = 0;
  *(undefined8 *)(puVar3 + 0x13) = 0;
  *(undefined8 *)(puVar3 + 0xb) = 0;
  *(undefined8 *)(puVar3 + 3) = 0;
  *(undefined8 *)(puVar3 + 0x71) = 0;
  *(undefined8 *)(puVar3 + 0x69) = 0;
  *(undefined8 *)(puVar3 + 0x58) = 0;
  *(undefined8 *)(puVar3 + 0x50) = 0;
  *(undefined8 *)(puVar3 + 0x68) = 0;
  *(undefined8 *)(puVar3 + 0x60) = 0;
  *(undefined8 *)(puVar3 + 0x98) = 0;
  *(undefined8 *)(puVar3 + 0x90) = 0;
  *(undefined8 *)(puVar3 + 0xa8) = 0;
  *(undefined8 *)(puVar3 + 0xa0) = 0;
  *(undefined8 *)(puVar3 + 0xb8) = 0;
  *(undefined8 *)(puVar3 + 0xb0) = 0;
  *(undefined8 *)(puVar3 + 200) = 0;
  *(undefined8 *)(puVar3 + 0xc0) = 0;
  *(undefined8 *)(puVar3 + 0xd8) = 0;
  *(undefined8 *)(puVar3 + 0xd0) = 0;
  *(undefined8 *)(puVar3 + 0xe8) = 0;
  *(undefined8 *)(puVar3 + 0xe0) = 0;
  *(undefined8 *)(puVar3 + 0x88) = 0;
  *(undefined8 *)(puVar3 + 0x80) = 0;
  return;
}

