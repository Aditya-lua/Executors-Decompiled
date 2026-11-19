/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af01bc
 */

int WHIRLPOOL_Init(WHIRLPOOL_CTX *c)

{
  memset(c,0,0xa8);
  return 1;
}

