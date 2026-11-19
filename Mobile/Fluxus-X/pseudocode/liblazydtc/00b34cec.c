/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b34cec
 */

int ossl_blob_length(int param_1,int param_2,int param_3)

{
  uint uVar1;
  
  uVar1 = param_1 + 7U >> 3;
  if (param_2 == 0) {
    if (param_3 == 0) {
      return (param_1 + 0xfU >> 4) * 5 + uVar1 * 2 + 4;
    }
    return uVar1 + 4;
  }
  if (param_3 == 0) {
    return uVar1 * 2 + 0x40;
  }
  return uVar1 * 3 + 0x2c;
}

