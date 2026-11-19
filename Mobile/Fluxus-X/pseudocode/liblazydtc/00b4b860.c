/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4b860
 */

ulong ossl_DER_w_begin_sequence(undefined8 param_1,int param_2)

{
  int iVar1;
  ulong uVar2;
  
  if ((param_2 < 0) ||
     ((uVar2 = 0, param_2 < 0x1f && (uVar2 = WPACKET_start_sub_packet(param_1), (int)uVar2 != 0))))
  {
    iVar1 = WPACKET_start_sub_packet(param_1);
    uVar2 = (ulong)(iVar1 != 0);
  }
  return uVar2;
}

