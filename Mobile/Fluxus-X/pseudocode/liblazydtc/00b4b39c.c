/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4b39c
 */

ulong ossl_DER_w_octet_string(undefined8 param_1,uint param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  ulong uVar2;
  long local_40;
  long lStack_38;
  
  if (-1 < (int)param_2) {
    if (0x1e < (int)param_2) {
      return 0;
    }
    uVar2 = WPACKET_start_sub_packet(param_1);
    if ((int)uVar2 == 0) {
      return uVar2;
    }
  }
  uVar2 = WPACKET_start_sub_packet(param_1);
  if ((int)uVar2 == 0) {
    return uVar2;
  }
  uVar2 = WPACKET_memcpy(param_1,param_3,param_4);
  if ((int)uVar2 == 0) {
    return uVar2;
  }
  uVar2 = WPACKET_close(param_1);
  if ((int)uVar2 == 0) {
    return uVar2;
  }
  uVar2 = WPACKET_put_bytes__(param_1,4,1);
  if ((int)uVar2 == 0) {
    return uVar2;
  }
  if (-1 < (int)param_2) {
    uVar2 = WPACKET_get_total_written(param_1,&lStack_38);
    if ((int)uVar2 == 0) {
      return uVar2;
    }
    uVar2 = WPACKET_close(param_1);
    if ((int)uVar2 == 0) {
      return uVar2;
    }
    uVar2 = WPACKET_get_total_written(param_1,&local_40);
    if ((int)uVar2 == 0) {
      return uVar2;
    }
    if (lStack_38 != local_40) {
      iVar1 = WPACKET_put_bytes__(param_1,(long)(int)(param_2 | 0xa0),1);
      return (ulong)(iVar1 != 0);
    }
  }
  return 1;
}

