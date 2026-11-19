/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c9fcc
 */

undefined8 dtls1_write_bytes(long param_1,undefined8 param_2,undefined8 param_3,ulong param_4)

{
  undefined8 uVar1;
  
  if (param_4 < 0x4001) {
    *(undefined4 *)(param_1 + 0x28) = 1;
    uVar1 = do_dtls1_write(param_1);
    return uVar1;
  }
  ERR_new();
  ERR_set_debug("ssl/record/rec_layer_d1.c",0x310,"dtls1_write_bytes");
  ossl_statem_fatal(param_1,0x50,0xc0103,0);
  return 0xffffffff;
}

