/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085c30c
 */

undefined8 FUN_0085c30c(long param_1)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 *local_70;
  undefined8 uStack_68;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 local_50;
  undefined8 uStack_48;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  uStack_48 = *(undefined8 *)(param_1 + 0x9c);
  local_50 = *(undefined8 *)(param_1 + 0x94);
  FUN_00858f2c();
  if (*(int *)(*(long *)(param_1 + 0x160) + -4) == 0) {
    local_60 = 0;
    uStack_58 = 0;
    uVar2 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x20);
    FUN_0084fc78(uVar2,&local_50);
    local_70 = (undefined8 *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),8);
    *local_70 = uVar2;
    uStack_68 = 1;
    uVar2 = FUN_0085e984(param_1,&local_50,&local_60,&local_70,
                         "break statement must be inside a loop");
  }
  else {
    uVar2 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x20);
    FUN_0084fc78(uVar2,&local_50);
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar2;
}

