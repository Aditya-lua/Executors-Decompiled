/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092a9e8
 */

undefined4 * FUN_0092a9e8(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  int iVar2;
  undefined4 *puVar3;
  long lVar4;
  undefined4 *puVar5;
  undefined1 auStack_70 [24];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  puVar3 = (undefined4 *)(*(code *)PTR_calloc_00cc4690)(1,0x238);
  if (puVar3 != (undefined4 *)0x0) {
    puVar5 = puVar3 + 0x3e;
    *puVar3 = 0xbab1e;
    FUN_00917c68(puVar3 + 0x28,param_3);
    FUN_009164e8(puVar5,param_1,&LAB_0092f4b8,&LAB_0092f4cc,&LAB_0092f4e0);
    FUN_009164e8(puVar3 + 0x4a,0x17,&LAB_00916a04,&LAB_00916a3c,&LAB_0092aba4);
    iVar2 = FUN_0090fae0(puVar3 + 0x56,puVar3,param_2);
    if (iVar2 == 0) {
      FUN_00925c98(puVar3 + 8,0);
      FUN_00925c98(puVar3 + 0x10,0);
      FUN_00925c98(puVar3 + 0x18,0);
      puVar3[0x8a] = 100;
      *(byte *)((long)puVar3 + 0x231) = *(byte *)((long)puVar3 + 0x231) | 1;
      iVar2 = FUN_0093f910(puVar3 + 0x88,1);
      if (iVar2 < 0) {
        *(undefined8 *)(puVar3 + 0x88) = 0xffffffffffffffff;
      }
    }
    else {
      FUN_00916a74(puVar5,auStack_70);
      while (lVar4 = FUN_00916a80(auStack_70), lVar4 != 0) {
        FUN_00916838(*(undefined8 *)(lVar4 + 0x18));
      }
      FUN_00916838(puVar5);
      FUN_00916838(puVar3 + 0x4a);
      FUN_00916838(puVar3 + 0x28);
      FUN_0090fb7c(puVar3 + 0x56);
      (*(code *)PTR_free_00cc4678)(puVar3);
      puVar3 = (undefined4 *)0x0;
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return puVar3;
}

