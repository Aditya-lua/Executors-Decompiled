/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e293c
 */

undefined8 tls_close_construct_packet(long param_1,undefined8 param_2,int param_3)

{
  undefined8 uVar1;
  ulong local_28;
  
  if (((param_3 == 0x101) || (uVar1 = WPACKET_close(param_2), (int)uVar1 != 0)) &&
     (uVar1 = WPACKET_get_length(param_2,&local_28), (int)uVar1 != 0)) {
    uVar1 = 0;
    if (local_28 >> 0x1f == 0) {
      uVar1 = 1;
      *(long *)(param_1 + 0x98) = (long)(int)local_28;
      *(undefined8 *)(param_1 + 0xa0) = 0;
    }
  }
  return uVar1;
}

