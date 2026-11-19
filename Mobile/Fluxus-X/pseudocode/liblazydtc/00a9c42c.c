/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9c42c
 */

undefined8
WPACKET_sub_allocate_bytes__(long param_1,long param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  long *plVar2;
  
  iVar1 = WPACKET_start_sub_packet_len__(param_1,param_4);
  if ((iVar1 != 0) && (iVar1 = WPACKET_reserve_bytes(param_1,param_2,param_3), iVar1 != 0)) {
    plVar2 = *(long **)(param_1 + 0x28);
    *(long *)(param_1 + 0x18) = param_2 + *(long *)(param_1 + 0x18);
    *(long *)(param_1 + 0x10) = param_2 + *(long *)(param_1 + 0x10);
    if ((plVar2 != (long *)0x0) &&
       ((*plVar2 != 0 && (iVar1 = FUN_00a9cab8(param_1,plVar2,1), iVar1 != 0)))) {
      return 1;
    }
  }
  return 0;
}

