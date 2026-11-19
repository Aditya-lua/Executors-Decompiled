/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a4118
 */

void FUN_008a4118(undefined8 *param_1)

{
  void *pvVar1;
  
  *param_1 = &PTR_FUN_00c4c4b8;
  if ((void *)param_1[0x23] != (void *)0x0) {
    operator_delete((void *)param_1[0x23]);
    param_1[0x23] = 0;
    operator_delete((void *)param_1[0x26]);
    param_1[0x24] = 0;
    param_1[0x25] = 0;
    param_1[0x26] = 0;
    operator_delete((void *)0x0);
    param_1[0x27] = 0;
    *(undefined1 *)(param_1 + 0x29) = 0x40;
  }
  operator_delete((void *)param_1[0x26]);
  if ((void *)param_1[0x1c] != (void *)0x0) {
    operator_delete((void *)param_1[0x1c]);
    param_1[0x1c] = 0;
    operator_delete((void *)param_1[0x1f]);
    param_1[0x1d] = 0;
    param_1[0x1e] = 0;
    param_1[0x1f] = 0;
    operator_delete((void *)0x0);
    param_1[0x20] = 0;
    *(undefined1 *)(param_1 + 0x22) = 0x40;
  }
  operator_delete((void *)param_1[0x1f]);
  if ((void *)param_1[0x15] != (void *)0x0) {
    operator_delete((void *)param_1[0x15]);
    param_1[0x15] = 0;
    operator_delete((void *)param_1[0x18]);
    param_1[0x16] = 0;
    param_1[0x17] = 0;
    param_1[0x18] = 0;
    operator_delete((void *)0x0);
    param_1[0x19] = 0;
    *(undefined1 *)(param_1 + 0x1b) = 0x40;
  }
  operator_delete((void *)param_1[0x18]);
  pvVar1 = (void *)param_1[0x12];
  if (pvVar1 != (void *)0x0) {
    param_1[0x13] = pvVar1;
    operator_delete(pvVar1,param_1[0x14] - (long)pvVar1);
  }
  if ((void *)param_1[0xb] != (void *)0x0) {
    operator_delete((void *)param_1[0xb]);
    param_1[0xb] = 0;
    operator_delete((void *)param_1[0xe]);
    param_1[0xc] = 0;
    param_1[0xd] = 0;
    param_1[0xe] = 0;
    operator_delete((void *)0x0);
    param_1[0xf] = 0;
    *(undefined1 *)(param_1 + 0x11) = 0x40;
  }
  operator_delete((void *)param_1[0xe]);
  return;
}

