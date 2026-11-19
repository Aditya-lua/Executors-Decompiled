/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9c87c
 */

undefined8 WPACKET_init(long *param_1,long param_2)

{
  long lVar1;
  
  if (param_2 != 0) {
    *param_1 = param_2;
    param_1[1] = 0;
    param_1[3] = 0;
    param_1[4] = -1;
    *(byte *)(param_1 + 6) = *(byte *)(param_1 + 6) & 0xfe;
    param_1[2] = 0;
    lVar1 = CRYPTO_zalloc(0x28,"crypto/packet.c",0x6b);
    param_1[5] = lVar1;
    if (lVar1 != 0) {
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/packet.c",0x6c,"wpacket_intern_init_len");
    ERR_set_error(0xf,0xc0100,0);
  }
  return 0;
}

