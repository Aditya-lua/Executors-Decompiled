/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b66ce4
 */

undefined8 ossl_ccm_stream_update(void)

{
  int iVar1;
  undefined8 uVar2;
  ulong in_x3;
  ulong in_x5;
  
  if (in_x3 < in_x5) {
    ERR_new();
    ERR_set_debug("providers/implementations/ciphers/ciphercommon_ccm.c",0x114,
                  "ossl_ccm_stream_update");
    uVar2 = 0x6a;
  }
  else {
    iVar1 = FUN_00b66d70();
    if (iVar1 != 0) {
      return 1;
    }
    ERR_new();
    ERR_set_debug("providers/implementations/ciphers/ciphercommon_ccm.c",0x119,
                  "ossl_ccm_stream_update");
    uVar2 = 0x66;
  }
  ERR_set_error(0x39,uVar2,0);
  return 0;
}

