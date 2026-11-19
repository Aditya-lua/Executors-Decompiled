/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9c910
 */

bool WPACKET_init_null(undefined8 *param_1,ulong param_2)

{
  long lVar1;
  
  *param_1 = 0;
  param_1[1] = 0;
  if (param_2 - 1 < 7) {
    lVar1 = (1L << ((param_2 & 7) << 3)) + (param_2 - 1);
  }
  else {
    lVar1 = -1;
  }
  param_1[3] = 0;
  param_1[4] = lVar1;
  *(byte *)(param_1 + 6) = *(byte *)(param_1 + 6) & 0xfe;
  param_1[2] = 0;
  lVar1 = CRYPTO_zalloc(0x28,"crypto/packet.c",0x6b);
  param_1[5] = lVar1;
  if (lVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/packet.c",0x6c,"wpacket_intern_init_len");
    ERR_set_error(0xf,0xc0100,0);
  }
  return lVar1 != 0;
}

