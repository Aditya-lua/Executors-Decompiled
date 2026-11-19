/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00874f8c
 */

void FUN_00874f8c(undefined4 param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4,
                 undefined8 param_5)

{
  long lVar1;
  undefined4 local_78 [2];
  undefined4 local_70;
  undefined4 uStack_6c;
  undefined4 local_68;
  undefined4 uStack_64;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 local_50;
  undefined4 uStack_48;
  undefined4 uStack_44;
  undefined4 local_40;
  undefined4 uStack_3c;
  undefined8 uStack_38;
  undefined8 local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  local_30 = 0;
  uStack_38 = 0;
  local_50 = 3;
  _uStack_48 = CONCAT44(param_2,param_1);
  _local_40 = CONCAT44(param_4,param_3);
  local_78[0] = 3;
  local_60 = 0;
  uStack_58 = 0;
  local_70 = param_1;
  uStack_6c = param_2;
  local_68 = param_3;
  uStack_64 = param_4;
  FUN_00874b84(param_5,local_78,&local_50);
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

