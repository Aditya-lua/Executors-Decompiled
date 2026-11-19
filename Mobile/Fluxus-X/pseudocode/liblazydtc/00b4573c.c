/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4573c
 */

undefined8
FUN_00b4573c(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
            undefined8 param_5,undefined8 param_6,undefined8 param_7,long param_8,undefined8 param_9
            ,undefined8 param_10,undefined8 param_11)

{
  int iVar1;
  undefined8 uVar2;
  undefined1 auStack_8a8 [56];
  undefined1 auStack_870 [2048];
  undefined8 local_70 [2];
  
  iVar1 = WPACKET_init_static_len(auStack_8a8,auStack_870,0x800,0);
  if (((((iVar1 != 0) && (iVar1 = WPACKET_put_bytes__(auStack_8a8,param_11,2), iVar1 != 0)) &&
       (iVar1 = WPACKET_start_sub_packet_len__(auStack_8a8,1), iVar1 != 0)) &&
      ((iVar1 = WPACKET_memcpy(auStack_8a8,param_4,param_5), iVar1 != 0 &&
       (iVar1 = WPACKET_memcpy(auStack_8a8,param_6,param_7), iVar1 != 0)))) &&
     (iVar1 = WPACKET_close(auStack_8a8), iVar1 != 0)) {
    uVar2 = 0;
    if (param_8 != 0) {
      uVar2 = param_9;
    }
    iVar1 = WPACKET_sub_memcpy__(auStack_8a8,param_8,uVar2,1);
    if (((iVar1 != 0) && (iVar1 = WPACKET_get_total_written(auStack_8a8,local_70), iVar1 != 0)) &&
       (iVar1 = WPACKET_finish(auStack_8a8), iVar1 != 0)) {
      uVar2 = FUN_00b452cc(param_1,param_2,param_3,auStack_870,local_70[0],param_10,param_11);
      return uVar2;
    }
  }
  WPACKET_cleanup(auStack_8a8);
  return 0;
}

