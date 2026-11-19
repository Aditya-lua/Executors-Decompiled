/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8ecfc
 */

void Camellia_decrypt(uchar *in,uchar *out,CAMELLIA_KEY *key)

{
  Camellia_DecryptBlock_Rounds(key->grand_rounds,in,key,out);
  return;
}

