/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9b750
 */

undefined4 OPENSSL_hexchar2int(char param_1)

{
  if ((byte)(param_1 - 0x30U) < 0x37) {
    return *(undefined4 *)(&DAT_0076e880 + (long)(char)(param_1 - 0x30U) * 4);
  }
  return 0xffffffff;
}

