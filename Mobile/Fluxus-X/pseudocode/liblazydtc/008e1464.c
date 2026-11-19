/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e1464
 */

void blake3_xof_many(undefined8 param_1,undefined8 param_2,undefined4 param_3,long param_4,
                    undefined4 param_5,long param_6,long param_7)

{
  if (param_7 != 0) {
    do {
      blake3_compress_xof_portable(param_1,param_2,param_3,param_4,param_5,param_6);
      param_7 = param_7 + -1;
      param_4 = param_4 + 1;
      param_6 = param_6 + 0x40;
    } while (param_7 != 0);
  }
  return;
}

