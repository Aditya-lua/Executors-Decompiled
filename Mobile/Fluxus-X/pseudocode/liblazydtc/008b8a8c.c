/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b8a8c
 */

void FUN_008b8a8c(long param_1,long param_2,undefined8 *param_3,ulong param_4,uint param_5)

{
  int iVar1;
  char cVar2;
  undefined8 *puVar3;
  int iVar4;
  undefined8 *puVar5;
  uint uVar6;
  
  iVar1 = *(int *)(&DAT_00d1f638 + (param_4 & 0xff) * 4);
  uVar6 = 0x7fe8;
  if (iVar1 < 0x201) {
    uVar6 = 0x3fe8;
  }
  puVar3 = (undefined8 *)
           (**(code **)(*(long *)(param_1 + 0x60) + 0x48))
                     (*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x50),0,0,(ulong)uVar6);
  if (puVar3 == (undefined8 *)0x0) {
                    /* WARNING: Subroutine does not return */
    FUN_008b3f9c(param_1,4);
  }
  iVar4 = 8;
  if ((param_5 & 1) == 0) {
    iVar4 = 0;
  }
  puVar3[5] = 0;
  iVar1 = iVar1 + iVar4;
  *(uint *)(puVar3 + 4) = uVar6;
  *(int *)((long)puVar3 + 0x24) = iVar1;
  cVar2 = DAT_00d1f618;
  iVar4 = 0;
  if ((long)iVar1 != 0) {
    iVar4 = (int)(((ulong)uVar6 - 0x40) / (ulong)(long)iVar1);
  }
  puVar3[1] = 0;
  *puVar3 = 0;
  puVar3[3] = 0;
  puVar3[2] = 0;
  *(int *)(puVar3 + 6) = (iVar4 + -1) * iVar1;
  *(undefined4 *)((long)puVar3 + 0x34) = 0;
  if (cVar2 == '\x01') {
    *(undefined4 *)(puVar3 + 7) = 0;
  }
  if (param_3 != (undefined8 *)0x0) {
    puVar5 = (undefined8 *)*param_3;
    puVar3[1] = puVar5;
    if (puVar5 != (undefined8 *)0x0) {
      *puVar5 = puVar3;
    }
    *param_3 = puVar3;
  }
  *(undefined8 **)(param_2 + (param_4 & 0xff) * 8) = puVar3;
  return;
}

