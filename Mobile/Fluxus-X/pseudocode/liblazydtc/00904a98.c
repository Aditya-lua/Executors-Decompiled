/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00904a98
 */

void FUN_00904a98(long param_1,uint param_2,void *param_3,size_t param_4)

{
  uint uVar1;
  
  if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) {
    if (*(long *)(param_1 + 600) != 0) {
      uVar1 = FUN_0092f1bc(param_1);
      FUN_0092f198(param_1,1);
      (**(code **)(param_1 + 600))
                (param_1,(ulong)param_2,param_3,param_4,*(undefined8 *)(param_1 + 0x1c0));
      FUN_0092f198(param_1,uVar1 & 1);
      return;
    }
    if (param_2 < 3) {
      fwrite(&UNK_007464a8 + (ulong)param_2 + (ulong)param_2 * 2,2,1,*(FILE **)(param_1 + 0x1b8));
      fwrite(param_3,param_4,1,*(FILE **)(param_1 + 0x1b8));
      return;
    }
  }
  return;
}

