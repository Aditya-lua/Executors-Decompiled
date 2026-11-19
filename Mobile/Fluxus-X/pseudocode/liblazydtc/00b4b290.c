/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4b290
 */

ulong ossl_DER_w_boolean(undefined8 param_1,uint param_2,int param_3)

{
  int iVar1;
  ulong uVar2;
  long local_38;
  long local_28;
  
  if (((((int)param_2 < 0) ||
       ((uVar2 = 0, (int)param_2 < 0x1f &&
        (uVar2 = WPACKET_start_sub_packet(param_1), (int)uVar2 != 0)))) &&
      (uVar2 = WPACKET_start_sub_packet(param_1), (int)uVar2 != 0)) &&
     ((param_3 == 0 || (uVar2 = WPACKET_put_bytes__(param_1,0xff,1), (int)uVar2 != 0)))) {
    iVar1 = WPACKET_close(param_1);
    uVar2 = 0;
    if (iVar1 == 0) {
      iVar1 = WPACKET_put_bytes__(param_1,1,1);
      uVar2 = 0;
      if (iVar1 == 0) {
        if (-1 < (int)param_2) {
          uVar2 = WPACKET_get_total_written(param_1,&local_28);
          if ((int)uVar2 == 0) {
            return uVar2;
          }
          uVar2 = WPACKET_close(param_1);
          if ((int)uVar2 == 0) {
            return uVar2;
          }
          uVar2 = WPACKET_get_total_written(param_1,&local_38);
          if ((int)uVar2 == 0) {
            return uVar2;
          }
          if (local_28 != local_38) {
            iVar1 = WPACKET_put_bytes__(param_1,(long)(int)(param_2 | 0xa0),1);
            return (ulong)(iVar1 != 0);
          }
        }
        uVar2 = 1;
      }
    }
  }
  return uVar2;
}

