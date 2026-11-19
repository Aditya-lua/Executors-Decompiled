/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b401e4
 */

undefined4 FUN_00b401e4(long param_1,long *param_2)

{
  undefined4 uVar1;
  long lVar2;
  
  if (param_1 == 0) {
    ERR_new();
    ERR_set_debug("providers/implementations/encode_decode/encode_key2any.c",0x300,
                  "ecx_spki_pub_to_der");
    uVar1 = 0xc0102;
  }
  else {
    lVar2 = CRYPTO_memdup(param_1 + 0x11,*(undefined8 *)(param_1 + 0x58),
                          "providers/implementations/encode_decode/encode_key2any.c",0x304);
    if (lVar2 != 0) {
      *param_2 = lVar2;
      return *(undefined4 *)(param_1 + 0x58);
    }
    ERR_new();
    ERR_set_debug("providers/implementations/encode_decode/encode_key2any.c",0x306,
                  "ecx_spki_pub_to_der");
    uVar1 = 0xc0100;
  }
  ERR_set_error(0x39,uVar1,0);
  return 0;
}

