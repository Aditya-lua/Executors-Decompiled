/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b27634
 */

undefined8 FUN_00b27634(void)

{
  int iVar1;
  undefined8 uVar2;
  ulong in_x3;
  ulong in_x5;
  
  if (in_x3 < in_x5) {
    ERR_new();
    ERR_set_debug("providers/implementations/ciphers/cipher_aes_xts.c",199,"aes_xts_stream_update");
    uVar2 = 0x6a;
  }
  else {
    iVar1 = FUN_00b276e4();
    if (iVar1 != 0) {
      return 1;
    }
    ERR_new();
    ERR_set_debug("providers/implementations/ciphers/cipher_aes_xts.c",0xcc,"aes_xts_stream_update")
    ;
    uVar2 = 0x66;
  }
  ERR_set_error(0x39,uVar2,0);
  return 0;
}

