/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e3d18
 */

void FUN_008e3d18(undefined8 *param_1)

{
  long *plVar1;
  ulong uVar2;
  void *pvVar3;
  ulong uVar4;
  
  plVar1 = (long *)param_1[3];
  *param_1 = &PTR_LAB_00c4e288;
  if (plVar1 != (long *)0x0) {
    uVar4 = 0;
    while( true ) {
      uVar2 = (**(code **)(*plVar1 + 0x10))();
      plVar1 = (long *)param_1[3];
      if ((uVar2 & 0xffffffff) <= uVar4) break;
      pvVar3 = (void *)(**(code **)(*plVar1 + 0x38))(plVar1,uVar4 & 0xffffffff);
      if (pvVar3 != (void *)0x0) {
        FUN_008e4204(pvVar3);
      }
      operator_delete(pvVar3);
      plVar1 = (long *)param_1[3];
      uVar4 = uVar4 + 1;
    }
    if (plVar1 != (long *)0x0) {
      FUN_008e51c4(plVar1);
    }
    operator_delete(plVar1);
  }
  FUN_008e4254(param_1);
  return;
}

