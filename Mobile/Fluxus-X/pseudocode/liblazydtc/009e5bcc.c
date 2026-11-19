/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e5bcc
 */

undefined8
create_synthetic_message_hash
          (long param_1,undefined1 *param_2,undefined8 param_3,long param_4,undefined8 param_5)

{
  undefined8 uVar1;
  undefined4 local_7c;
  undefined1 auStack_78 [64];
  undefined8 local_38;
  
  local_7c = 0;
  local_38 = param_3;
  if (param_2 == (undefined1 *)0x0) {
    local_38 = 0;
    uVar1 = ssl3_digest_cached_records(param_1);
    if ((int)uVar1 == 0) {
      return uVar1;
    }
    param_2 = auStack_78;
    uVar1 = ssl_handshake_hash(param_1,auStack_78,0x40,&local_38);
    if ((int)uVar1 == 0) {
      return uVar1;
    }
  }
  uVar1 = ssl3_init_finished_mac(param_1);
  if ((int)uVar1 != 0) {
    local_7c = CONCAT31(local_7c._1_3_,0xfe);
    local_7c = CONCAT13((char)local_38,(undefined3)local_7c);
    uVar1 = ssl3_finish_mac(param_1,&local_7c,4);
    if ((((int)uVar1 != 0) && (uVar1 = ssl3_finish_mac(param_1,param_2,local_38), (int)uVar1 != 0))
       && ((param_4 == 0 ||
           ((uVar1 = ssl3_finish_mac(param_1,param_4,param_5), (int)uVar1 != 0 &&
            (uVar1 = ssl3_finish_mac(param_1,*(undefined8 *)(*(long *)(param_1 + 0x88) + 8),
                                     *(long *)(param_1 + 0x2d0) + 4), (int)uVar1 != 0)))))) {
      uVar1 = 1;
    }
  }
  return uVar1;
}

