/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9c9c0
 */

bool WPACKET_init_null_der(undefined8 *param_1)

{
  long lVar1;
  
  *param_1 = 0;
  param_1[1] = 0;
  param_1[3] = 0;
  param_1[4] = 0xffffffffffffffff;
  *(byte *)(param_1 + 6) = *(byte *)(param_1 + 6) | 1;
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

