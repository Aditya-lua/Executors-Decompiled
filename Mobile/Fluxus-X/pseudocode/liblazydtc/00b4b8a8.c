/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4b8a8
 */

ulong ossl_DER_w_end_sequence(undefined8 param_1,uint param_2)

{
  int iVar1;
  ulong uVar2;
  long local_40;
  long lStack_38;
  long local_30;
  long lStack_28;
  
  uVar2 = WPACKET_get_total_written(param_1,&lStack_38);
  if ((((int)uVar2 != 0) && (uVar2 = WPACKET_close(param_1), (int)uVar2 != 0)) &&
     (uVar2 = WPACKET_get_total_written(param_1,&local_40), (int)uVar2 != 0)) {
    if (lStack_38 == local_40) {
      uVar2 = WPACKET_set_flags(param_1,2);
      iVar1 = (int)uVar2;
    }
    else {
      uVar2 = WPACKET_put_bytes__(param_1,0x30,1);
      iVar1 = (int)uVar2;
    }
    if (iVar1 != 0) {
      if (-1 < (int)param_2) {
        if (0x1e < (int)param_2) {
          return 0;
        }
        uVar2 = WPACKET_get_total_written(param_1,&lStack_28);
        if ((int)uVar2 == 0) {
          return uVar2;
        }
        uVar2 = WPACKET_close(param_1);
        if ((int)uVar2 == 0) {
          return uVar2;
        }
        uVar2 = WPACKET_get_total_written(param_1,&local_30);
        if ((int)uVar2 == 0) {
          return uVar2;
        }
        if (lStack_28 != local_30) {
          iVar1 = WPACKET_put_bytes__(param_1,(long)(int)(param_2 | 0xa0),1);
          return (ulong)(iVar1 != 0);
        }
      }
      uVar2 = 1;
    }
  }
  return uVar2;
}

