/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b0b20
 */

int SSL_CIPHER_get_bits(SSL_CIPHER *c,int *alg_bits)

{
  int iVar1;
  
  iVar1 = 0;
  if (c != (SSL_CIPHER *)0x0) {
    if (alg_bits != (int *)0x0) {
      *alg_bits = (int)c->algorithm2;
    }
    iVar1 = *(int *)((long)&c->algo_strength + 4);
  }
  return iVar1;
}

