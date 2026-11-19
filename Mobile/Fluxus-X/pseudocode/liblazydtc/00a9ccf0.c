/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9ccf0
 */

undefined8 WPACKET_start_sub_packet(long param_1)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  
  if (*(long *)(param_1 + 0x28) != 0) {
    puVar1 = (undefined8 *)CRYPTO_zalloc(0x28,"crypto/packet.c",0x162);
    if (puVar1 != (undefined8 *)0x0) {
      *puVar1 = *(undefined8 *)(param_1 + 0x28);
      uVar2 = *(undefined8 *)(param_1 + 0x18);
      *(undefined8 **)(param_1 + 0x28) = puVar1;
      puVar1[1] = 0;
      puVar1[2] = 0;
      puVar1[3] = uVar2;
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/packet.c",0x163,"WPACKET_start_sub_packet_len__");
    ERR_set_error(0xf,0xc0100,0);
  }
  return 0;
}

