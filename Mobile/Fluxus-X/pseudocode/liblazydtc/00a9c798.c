/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9c798
 */

undefined8 WPACKET_init_der(undefined8 *param_1,long param_2,long param_3)

{
  undefined8 uVar1;
  long lVar2;
  
  uVar1 = 0;
  if ((param_2 != 0) && (param_3 != 0)) {
    *param_1 = 0;
    param_1[1] = param_2;
    param_1[3] = 0;
    param_1[4] = param_3;
    *(byte *)(param_1 + 6) = *(byte *)(param_1 + 6) | 1;
    param_1[2] = 0;
    lVar2 = CRYPTO_zalloc(0x28,"crypto/packet.c",0x6b);
    param_1[5] = lVar2;
    if (lVar2 == 0) {
      ERR_new();
      ERR_set_debug("crypto/packet.c",0x6c,"wpacket_intern_init_len");
      ERR_set_error(0xf,0xc0100,0);
      uVar1 = 0;
    }
    else {
      uVar1 = 1;
    }
  }
  return uVar1;
}

