/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008465a4
 */

void FUN_008465a4(undefined8 *param_1)

{
  byte *pbVar1;
  void *pvVar2;
  byte *pbVar3;
  byte *pbVar4;
  
  pbVar3 = (byte *)param_1[0x11];
  *param_1 = &PTR_FUN_00c48ec0;
  if (pbVar3 != (byte *)0x0) {
    pbVar1 = pbVar3;
    if (pbVar3 != (byte *)param_1[0x12]) {
      pbVar1 = (byte *)param_1[0x12];
      do {
        pbVar4 = pbVar1 + -0x18;
        if ((*pbVar4 & 1) != 0) {
          operator_delete(*(void **)(pbVar1 + -8),*(ulong *)(pbVar1 + -0x18) & 0xfffffffffffffffe);
        }
        pbVar1 = pbVar4;
      } while (pbVar4 != pbVar3);
      pbVar1 = (byte *)param_1[0x11];
    }
    param_1[0x12] = pbVar3;
    operator_delete(pbVar1,param_1[0x13] - (long)pbVar1);
  }
  pvVar2 = (void *)param_1[0xe];
  if (pvVar2 != (void *)0x0) {
    param_1[0xf] = pvVar2;
    operator_delete(pvVar2,param_1[0x10] - (long)pvVar2);
  }
  pbVar3 = (byte *)param_1[0xb];
  if (pbVar3 != (byte *)0x0) {
    pbVar1 = pbVar3;
    pbVar4 = (byte *)param_1[0xc];
    if (pbVar3 != (byte *)param_1[0xc]) {
      do {
        if ((pbVar4[-0x18] & 1) != 0) {
          operator_delete(*(void **)(pbVar4 + -8),*(ulong *)(pbVar4 + -0x18) & 0xfffffffffffffffe);
        }
        pbVar1 = pbVar4 + -0x30;
        if ((*pbVar1 & 1) != 0) {
          operator_delete(*(void **)(pbVar4 + -0x20),*(ulong *)(pbVar4 + -0x30) & 0xfffffffffffffffe
                         );
        }
        pbVar4 = pbVar1;
      } while (pbVar1 != pbVar3);
      pbVar1 = (byte *)param_1[0xb];
    }
    param_1[0xc] = pbVar3;
    operator_delete(pbVar1,param_1[0xd] - (long)pbVar1);
  }
  pvVar2 = (void *)param_1[8];
  if (pvVar2 != (void *)0x0) {
    param_1[9] = pvVar2;
    operator_delete(pvVar2,param_1[10] - (long)pvVar2);
  }
  pvVar2 = (void *)param_1[5];
  if (pvVar2 != (void *)0x0) {
    param_1[6] = pvVar2;
    operator_delete(pvVar2,param_1[7] - (long)pvVar2);
  }
  std::__ndk1::locale::~locale((locale *)(param_1 + 2));
  *param_1 = &PTR_LAB_00c48b78;
  if ((long *)param_1[1] == (long *)0x0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00846714. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*(long *)param_1[1] + 8))();
  return;
}

