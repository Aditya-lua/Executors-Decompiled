/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9d3dc
 */

undefined8
mbedtls_psa_ffdh_import_key
          (undefined8 param_1,void *param_2,ulong param_3,void *param_4,ulong param_5,ulong *param_6
          ,long *param_7)

{
  undefined8 uVar1;
  
  if (param_5 < param_3) {
    uVar1 = 0xffffff76;
  }
  else {
    memcpy(param_4,param_2,param_3);
    uVar1 = 0;
    *param_6 = param_3;
    *param_7 = param_3 << 3;
  }
  return uVar1;
}

