/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4b494
 */

void ossl_DER_w_octet_string_uint32(undefined8 param_1,undefined8 param_2,uint param_3)

{
  undefined1 *puVar1;
  undefined4 local_14;
  
  local_14 = 0;
  if (param_3 != 0) {
    puVar1 = (undefined1 *)((ulong)&local_14 | 3);
    do {
      *puVar1 = (char)param_3;
      param_3 = param_3 >> 8;
      puVar1 = puVar1 + -1;
    } while (param_3 != 0);
  }
  ossl_DER_w_octet_string(param_1,param_2,&local_14,4);
  return;
}

