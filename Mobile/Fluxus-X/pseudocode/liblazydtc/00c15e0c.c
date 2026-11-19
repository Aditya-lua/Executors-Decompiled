/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c15e0c
 */

byte FUN_00c15e0c(long param_1)

{
  byte bVar1;
  byte bVar2;
  undefined8 *puVar3;
  
  bVar1 = *(byte *)(param_1 + 0x20);
  if ((bVar1 & 1) == 0) {
    puVar3 = *(undefined8 **)(param_1 + 0x18);
    *(undefined1 *)(param_1 + 0x20) = 1;
    if ((char)*(ushort *)((long)puVar3 + 9) < -0x40) {
                    /* try { // try from 00c15e54 to 00c15e5b has its CatchHandler @ 00c15e88 */
      bVar2 = (**(code **)*puVar3)(puVar3);
    }
    else {
      bVar2 = (*(ushort *)((long)puVar3 + 9) & 0xc0) == 0;
    }
    *(byte *)(param_1 + 0x20) = bVar1;
  }
  else {
    bVar2 = 0;
  }
  return bVar2 & 1;
}

