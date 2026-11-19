/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9cee0
 */

undefined8 WPACKET_memcpy(long param_1,void *param_2,size_t param_3)

{
  undefined8 uVar1;
  void *local_28;
  
  if (param_3 != 0) {
    uVar1 = WPACKET_reserve_bytes(param_1,param_3,&local_28);
    if ((int)uVar1 == 0) {
      return uVar1;
    }
    *(size_t *)(param_1 + 0x18) = param_3 + *(long *)(param_1 + 0x18);
    *(size_t *)(param_1 + 0x10) = param_3 + *(long *)(param_1 + 0x10);
    if (local_28 != (void *)0x0) {
      memcpy(local_28,param_2,param_3);
    }
  }
  return 1;
}

