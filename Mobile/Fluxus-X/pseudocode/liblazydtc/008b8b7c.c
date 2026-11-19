/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b8b7c
 */

void FUN_008b8b7c(long param_1,long param_2,ulong param_3)

{
  int iVar1;
  int iVar2;
  char cVar3;
  undefined8 *puVar4;
  uint uVar5;
  
  iVar1 = *(int *)(&DAT_00d1f638 + (param_3 & 0xff) * 4);
  uVar5 = 0x7fe8;
  if (iVar1 < 0x201) {
    uVar5 = 0x3fe8;
  }
  puVar4 = (undefined8 *)
           (**(code **)(*(long *)(param_1 + 0x60) + 0x48))
                     (*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x50),0,0,(ulong)uVar5);
  if (puVar4 != (undefined8 *)0x0) {
    iVar1 = iVar1 + 8;
    *(uint *)(puVar4 + 4) = uVar5;
    *(int *)((long)puVar4 + 0x24) = iVar1;
    puVar4[5] = 0;
    cVar3 = DAT_00d1f618;
    iVar2 = 0;
    if ((long)iVar1 != 0) {
      iVar2 = (int)(((ulong)uVar5 - 0x40) / (ulong)(long)iVar1);
    }
    puVar4[1] = 0;
    *puVar4 = 0;
    puVar4[3] = 0;
    puVar4[2] = 0;
    *(int *)(puVar4 + 6) = (iVar2 + -1) * iVar1;
    *(undefined4 *)((long)puVar4 + 0x34) = 0;
    if (cVar3 == '\x01') {
      *(undefined4 *)(puVar4 + 7) = 0;
    }
  }
  *(undefined8 **)(param_2 + (param_3 & 0xff) * 8) = puVar4;
  return;
}

