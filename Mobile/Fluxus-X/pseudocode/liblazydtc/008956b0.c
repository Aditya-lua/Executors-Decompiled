/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008956b0
 */

void FUN_008956b0(undefined8 *param_1,long param_2,int param_3,ulong param_4,uint param_5)

{
  uint uVar1;
  ulong uVar2;
  
  uVar1 = (uint)param_4;
  if (((uVar1 ^ 0xffffffff) & 0xff) == 0) {
                    /* WARNING: Subroutine does not return */
    FUN_0087fcd8(param_2 + 0xc,"Exceeded result count limit; simplify the code to compile");
  }
  if ((param_2 != 0) && (*(int *)(param_2 + 8) == DAT_00d1b040)) {
    FUN_0088888c(param_1,param_2,param_3,param_4 & 0xffffffff,param_5 & 1,0);
    return;
  }
  if ((param_2 != 0) && (*(int *)(param_2 + 8) == DAT_00d1b030)) {
    if (0 < *(int *)((long)param_1 + 0xc)) {
      FUN_00876644(*param_1,*(int *)(param_2 + 0xc) + 1);
    }
    FUN_00875b54(*param_1,0x3f,param_3,uVar1 + 1,0);
    return;
  }
  FUN_0088d1d0(param_1,param_2,param_3,1);
  if (1 < (uVar1 & 0xff)) {
    uVar2 = 1;
    do {
      FUN_00875b54(*param_1,2,param_3 + (int)uVar2,0,0);
      uVar2 = uVar2 + 1;
    } while ((param_4 & 0xff) != uVar2);
  }
  return;
}

