/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9cf48
 */

undefined8 WPACKET_sub_memcpy__(long param_1,void *param_2,size_t param_3,undefined8 param_4)

{
  int iVar1;
  long *plVar2;
  void *local_28;
  
  iVar1 = WPACKET_start_sub_packet_len__(param_1,param_4);
  if (iVar1 != 0) {
    if (param_3 != 0) {
      iVar1 = WPACKET_reserve_bytes(param_1,param_3,&local_28);
      if (iVar1 == 0) {
        return 0;
      }
      *(size_t *)(param_1 + 0x18) = param_3 + *(long *)(param_1 + 0x18);
      *(size_t *)(param_1 + 0x10) = param_3 + *(long *)(param_1 + 0x10);
      if (local_28 != (void *)0x0) {
        memcpy(local_28,param_2,param_3);
      }
    }
    plVar2 = *(long **)(param_1 + 0x28);
    if (((plVar2 != (long *)0x0) && (*plVar2 != 0)) &&
       (iVar1 = FUN_00a9cab8(param_1,plVar2,1), iVar1 != 0)) {
      return 1;
    }
  }
  return 0;
}

