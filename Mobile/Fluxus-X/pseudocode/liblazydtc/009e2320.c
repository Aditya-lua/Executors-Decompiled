/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e2320
 */

undefined8 dtls1_close_construct_packet(long param_1,undefined8 param_2,int param_3)

{
  undefined8 uVar1;
  long lVar2;
  ulong local_28;
  
  if (((param_3 == 0x101) || (uVar1 = WPACKET_close(param_2), (int)uVar1 != 0)) &&
     (uVar1 = WPACKET_get_length(param_2,&local_28), (int)uVar1 != 0)) {
    uVar1 = 0;
    if (local_28 >> 0x1f == 0) {
      if (param_3 != 0x101) {
        lVar2 = *(long *)(param_1 + 0x4b8);
        *(ulong *)(lVar2 + 0x140) = local_28 - 0xc;
        *(ulong *)(lVar2 + 0x158) = local_28 - 0xc;
      }
      *(long *)(param_1 + 0x98) = (long)(int)local_28;
      *(undefined8 *)(param_1 + 0xa0) = 0;
      if ((param_3 == 3) ||
         (uVar1 = dtls1_buffer_message(param_1,param_3 == 0x101), (int)uVar1 != 0)) {
        uVar1 = 1;
      }
    }
  }
  return uVar1;
}

