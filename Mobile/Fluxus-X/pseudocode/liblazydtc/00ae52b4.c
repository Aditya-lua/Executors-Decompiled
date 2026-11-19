/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae52b4
 */

undefined8 ossl_sm3_init(undefined8 *param_1)

{
  memset(param_1 + 4,0,0x4c);
  param_1[1] = 0xda8a0600172442d7;
  *param_1 = 0x4914b2b97380166f;
  param_1[3] = 0xb0fb0e4ee38dee4d;
  param_1[2] = 0x163138aaa96f30bc;
  return 1;
}

