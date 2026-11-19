/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b9da0
 */

void FUN_008b9da0(long param_1,ulong param_2)

{
  undefined1 uVar1;
  byte bVar2;
  undefined1 *puVar3;
  long lVar4;
  
  if (0x40000000 < param_2) {
                    /* WARNING: Subroutine does not return */
    FUN_008b75fc(param_1);
  }
  puVar3 = (undefined1 *)FUN_008b78d0(param_1,param_2 + 0x19,*(undefined1 *)(param_1 + 4),5,0);
  lVar4 = *(long *)(param_1 + 0x60);
  uVar1 = *(undefined1 *)(param_1 + 4);
  *puVar3 = 5;
  bVar2 = *(byte *)(lVar4 + 2);
  *(undefined4 *)(puVar3 + 0x10) = 0;
  *(int *)(puVar3 + 0x14) = (int)param_2;
  puVar3[1] = uVar1;
  *(undefined4 *)(puVar3 + 4) = 0x8000ffff;
  puVar3[2] = bVar2 & 3;
  *(undefined8 *)(puVar3 + 8) = 0;
  return;
}

