/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8ece8
 */

void Camellia_encrypt(uchar *in,uchar *out,CAMELLIA_KEY *key)

{
  Camellia_EncryptBlock_Rounds(key->grand_rounds,in,key,out);
  return;
}

