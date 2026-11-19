/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089cad0
 */

void FUN_0089cad0(undefined8 *param_1)

{
  long lVar1;
  void *pvVar2;
  undefined8 *local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  *param_1 = &PTR_FUN_00c4be10;
  if ((void *)param_1[0x10] != (void *)0x0) {
    operator_delete((void *)param_1[0x10]);
    param_1[0x10] = 0;
    operator_delete((void *)param_1[0x13]);
    param_1[0x11] = 0;
    param_1[0x12] = 0;
    param_1[0x13] = 0;
    operator_delete((void *)0x0);
    param_1[0x14] = 0;
    *(undefined1 *)(param_1 + 0x16) = 0x40;
  }
  operator_delete((void *)param_1[0x13]);
  pvVar2 = (void *)param_1[0xc];
  if (pvVar2 != (void *)0x0) {
    param_1[0xd] = pvVar2;
    operator_delete(pvVar2,param_1[0xe] - (long)pvVar2);
  }
  local_30 = param_1 + 8;
  FUN_0089cf40(&local_30);
  operator_delete(param_1,200);
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

