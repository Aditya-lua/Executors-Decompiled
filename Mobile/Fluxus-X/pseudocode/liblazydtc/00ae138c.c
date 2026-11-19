/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae138c
 */

int SHA384_Init(SHA512_CTX *c)

{
  c->h[1] = 0x629a292a367cd507;
  c->h[0] = 0xcbbb9d5dc1059ed8;
  c->h[3] = 0x152fecd8f70e5939;
  c->h[2] = 0x9159015a3070dd17;
  c->num = 0;
  c->md_len = 0x30;
  c->h[5] = 0x8eb44a8768581511;
  c->h[4] = 0x67332667ffc00b31;
  c->h[7] = 0x47b5481dbefa4fa4;
  c->h[6] = 0xdb0c2e0d64f98fa7;
  c->Nl = 0;
  c->Nh = 0;
  return 1;
}

