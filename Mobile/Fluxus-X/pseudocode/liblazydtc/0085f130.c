/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085f130
 */

undefined8 FUN_0085f130(long param_1,undefined8 param_2)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 *local_58;
  undefined8 uStack_50;
  undefined8 local_48;
  undefined8 uStack_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (*(int *)(*(long *)(param_1 + 0x160) + -4) == 0) {
    local_48 = 0;
    uStack_40 = 0;
    uVar2 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x20);
    FUN_0084fcc4(uVar2,param_2);
    local_58 = (undefined8 *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),8);
    *local_58 = uVar2;
    uStack_50 = 1;
    uVar2 = FUN_0085e984(param_1,param_2,&local_48,&local_58,
                         "continue statement must be inside a loop");
  }
  else {
    uVar2 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x20);
    FUN_0084fcc4(uVar2,param_2);
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar2;
}

