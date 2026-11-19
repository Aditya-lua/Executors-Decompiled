/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a7f88
 */

ulong ssl3_set_handshake_header(undefined8 param_1,undefined8 param_2,int param_3)

{
  int iVar1;
  ulong uVar2;
  
  if (param_3 == 0x101) {
    uVar2 = 1;
  }
  else {
    uVar2 = WPACKET_put_bytes__(param_2,(long)param_3,1);
    if ((int)uVar2 != 0) {
      iVar1 = WPACKET_start_sub_packet_len__(param_2,3);
      uVar2 = (ulong)(iVar1 != 0);
    }
  }
  return uVar2;
}

