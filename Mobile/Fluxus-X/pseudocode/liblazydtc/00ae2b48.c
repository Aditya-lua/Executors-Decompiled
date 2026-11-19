/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae2b48
 */

undefined8 ossl_sm3_update(long param_1,void *param_2,ulong param_3)

{
  uint uVar1;
  void *__s;
  int iVar2;
  ulong uVar3;
  size_t __n;
  
  if (param_3 != 0) {
    iVar2 = *(int *)(param_1 + 0x24);
    uVar1 = (int)param_3 * 8;
    if (CARRY4(*(uint *)(param_1 + 0x20),uVar1)) {
      iVar2 = iVar2 + 1;
      *(int *)(param_1 + 0x24) = iVar2;
    }
    uVar3 = (ulong)*(uint *)(param_1 + 0x68);
    *(uint *)(param_1 + 0x20) = *(uint *)(param_1 + 0x20) + uVar1;
    *(int *)(param_1 + 0x24) = iVar2 + (int)(param_3 >> 0x1d);
    if (*(uint *)(param_1 + 0x68) != 0) {
      __s = (void *)(param_1 + 0x28);
      if ((uVar3 + param_3 | param_3) < 0x40) {
        memcpy((void *)((long)__s + uVar3),param_2,param_3);
        *(int *)(param_1 + 0x68) = *(int *)(param_1 + 0x68) + (int)param_3;
        return 1;
      }
      __n = 0x40 - uVar3;
      memcpy((void *)((long)__s + uVar3),param_2,__n);
      ossl_sm3_block_data_order(param_1,__s,1);
      param_2 = (void *)((long)param_2 + __n);
      param_3 = param_3 - __n;
      memset(__s,0,0x44);
    }
    if (param_3 >> 6 != 0) {
      ossl_sm3_block_data_order(param_1,param_2);
      param_2 = (void *)((long)param_2 + (param_3 & 0xffffffffffffffc0));
      param_3 = param_3 - (param_3 & 0xffffffffffffffc0);
    }
    if (param_3 != 0) {
      *(int *)(param_1 + 0x68) = (int)param_3;
      memcpy((void *)(param_1 + 0x28),param_2,param_3);
    }
  }
  return 1;
}

