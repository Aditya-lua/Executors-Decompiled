/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4dd2c
 */

undefined8
OSSL_DECODER_export(long *param_1,long param_2,undefined8 param_3,long param_4,long param_5)

{
  undefined8 uVar1;
  
  if ((((param_1 == (long *)0x0) || (param_2 == 0)) || (param_4 == 0)) || (param_5 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/decoder_lib.c",0x277,"OSSL_DECODER_export");
    ERR_set_error(0x3c,0xc0102,0);
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00a4dd44. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(*param_1 + 0x78))(param_1[1]);
  return uVar1;
}

