/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b67bc0
 */

undefined8
ossl_gcm_stream_update
          (undefined8 param_1,undefined8 param_2,undefined8 *param_3,ulong param_4,
          undefined8 param_5,ulong param_6)

{
  int iVar1;
  undefined8 uVar2;
  
  if (param_6 == 0) {
    *param_3 = 0;
    return 1;
  }
  if (param_4 < param_6) {
    ERR_new();
    ERR_set_debug("providers/implementations/ciphers/ciphercommon_gcm.c",0x140,
                  "ossl_gcm_stream_update");
    uVar2 = 0x6a;
  }
  else {
    iVar1 = FUN_00b67c64();
    if (0 < iVar1) {
      return 1;
    }
    ERR_new();
    ERR_set_debug("providers/implementations/ciphers/ciphercommon_gcm.c",0x145,
                  "ossl_gcm_stream_update");
    uVar2 = 0x66;
  }
  ERR_set_error(0x39,uVar2,0);
  return 0;
}

