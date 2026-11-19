/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086f804
 */

undefined8 * FUN_0086f804(undefined8 *param_1,undefined8 *param_2)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  void *pvVar4;
  void *local_70;
  undefined8 local_68;
  undefined8 uStack_60;
  void *local_58;
  undefined8 local_50;
  undefined8 uStack_48;
  undefined1 local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (param_1 == param_2) goto LAB_0086f8f4;
  FUN_0086f5d8(&local_70);
  if ((void **)param_1 == &local_70) {
    if (local_70 != (void *)0x0) {
      operator_delete(local_70);
      local_70 = (void *)0x0;
      operator_delete(local_58);
      local_68 = 0;
      uStack_60 = 0;
      local_58 = (void *)0x0;
      operator_delete((void *)0x0);
      goto LAB_0086f8e4;
    }
  }
  else {
    if ((void *)*param_1 != (void *)0x0) {
      operator_delete((void *)*param_1);
      *param_1 = 0;
      operator_delete((void *)param_1[3]);
      param_1[1] = 0;
      param_1[2] = 0;
      param_1[3] = 0;
      operator_delete((void *)0x0);
      param_1[4] = 0;
      *(undefined1 *)(param_1 + 6) = 0x40;
    }
    *param_1 = local_70;
    operator_delete((void *)param_1[3]);
    pvVar4 = local_58;
    uVar3 = uStack_60;
    uVar2 = local_68;
    uStack_60 = 0;
    local_58 = (void *)0x0;
    local_70 = (void *)0x0;
    local_68 = 0;
    param_1[3] = pvVar4;
    param_1[2] = uVar3;
    param_1[1] = uVar2;
    *(undefined1 *)(param_1 + 6) = local_40;
    param_1[5] = uStack_48;
    param_1[4] = local_50;
    uStack_48 = 0;
LAB_0086f8e4:
    local_50 = 0;
    local_40 = 0x40;
  }
  operator_delete(local_58);
LAB_0086f8f4:
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return param_1;
}

