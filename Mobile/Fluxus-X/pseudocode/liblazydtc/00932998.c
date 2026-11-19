/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00932998
 */

void FUN_00932998(undefined8 *param_1,long param_2)

{
  uint uVar1;
  long lVar2;
  long lVar3;
  
  lVar2 = tpidr_el0;
  lVar3 = *(long *)(lVar2 + 0x28);
  (*(code *)PTR_free_00cc4678)(param_1[0x19]);
  param_1[0x19] = 0;
  (*(code *)PTR_free_00cc4678)(param_1[0x18]);
  param_1[0x18] = 0;
  FUN_00935190(param_2);
  if ((*(byte *)((long)param_1 + 0xdb) >> 1 & 1) != 0) {
    FUN_00924348(param_1 + 0xd);
  }
  FUN_00912a70(param_2);
  param_1[2] = 0;
  param_1[3] = 0;
  uVar1 = *(uint *)((long)param_1 + 0xd9);
  *param_1 = 0xffffffffffffffff;
  param_1[1] = 0xffffffffffffffff;
  *(undefined4 *)((long)param_1 + 0x4c) = 0;
  param_1[10] = 0;
  *(undefined1 *)(param_1 + 0x1b) = 0;
  param_1[7] = 0;
  param_1[8] = 0;
  param_1[6] = 0;
  param_1[0x17] = 0;
  param_1[0x18] = 0;
  param_1[0x16] = 0;
  *(uint *)((long)param_1 + 0xd9) = uVar1 & 0xffff8042;
  param_1[5] = 0;
  param_1[4] = 0;
  *(uint *)((long)param_1 + 0xd9) = *(uint *)(param_2 + 0xa82) >> 0xc & 0x8000 | uVar1 & 0xfffa0042;
  if (*(long *)(lVar2 + 0x28) != lVar3) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

