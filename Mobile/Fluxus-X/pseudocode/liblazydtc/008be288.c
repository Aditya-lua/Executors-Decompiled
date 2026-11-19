/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008be288
 */

void FUN_008be288(long param_1,ulong param_2,undefined4 param_3)

{
  ulong uVar1;
  undefined1 uVar2;
  byte bVar3;
  undefined1 *puVar4;
  long lVar5;
  
  if (0x7fffffe7 < param_2) {
                    /* WARNING: Subroutine does not return */
    FUN_008b75fc(param_1);
  }
  uVar1 = (ulong)((int)param_2 + 0xf) & 0xfffffff0;
  if (param_2 < 0x11) {
    uVar1 = param_2;
  }
  puVar4 = (undefined1 *)FUN_008b78d0(param_1,uVar1 + 0x10,*(undefined1 *)(param_1 + 4),8,param_3);
  lVar5 = *(long *)(param_1 + 0x60);
  uVar2 = *(undefined1 *)(param_1 + 4);
  *puVar4 = 8;
  *(int *)(puVar4 + 4) = (int)param_2;
  bVar3 = *(byte *)(lVar5 + 2);
  *(undefined8 *)(puVar4 + 8) = 0;
  puVar4[1] = uVar2;
  puVar4[2] = bVar3 & 3;
  puVar4[3] = (char)param_3;
  return;
}

