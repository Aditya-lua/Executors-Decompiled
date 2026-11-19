/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b4e40
 */

void FUN_008b4e40(long param_1,uint param_2,undefined8 param_3)

{
  undefined1 uVar1;
  byte bVar2;
  undefined1 *puVar3;
  long lVar4;
  
  puVar3 = (undefined1 *)
           FUN_008b78d0(param_1,(-(ulong)(param_2 >> 0x1f) & 0xfffffff000000000 |
                                (ulong)param_2 << 4) + 0x30,*(undefined1 *)(param_1 + 4),7,0);
  lVar4 = *(long *)(param_1 + 0x60);
  uVar1 = *(undefined1 *)(param_1 + 4);
  puVar3[6] = 1;
  bVar2 = *(byte *)(lVar4 + 2);
  *puVar3 = 7;
  puVar3[5] = (char)param_2;
  puVar3[1] = uVar1;
  *(undefined2 *)(puVar3 + 3) = 0x1400;
  puVar3[2] = bVar2 & 3;
  *(undefined8 *)(puVar3 + 0x20) = 0;
  *(undefined8 *)(puVar3 + 0x28) = 0;
  *(undefined8 *)(puVar3 + 0x10) = param_3;
  *(undefined8 *)(puVar3 + 0x18) = 0;
  return;
}

