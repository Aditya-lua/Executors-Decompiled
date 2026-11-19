/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b11a8
 */

EVP_MD * SSL_CIPHER_get_handshake_digest(long param_1)

{
  char *name;
  EVP_MD *pEVar1;
  
  if (*(byte *)(param_1 + 0x40) < 0xe) {
    name = OBJ_nid2sn((&DAT_0074bf20)[(ulong)*(byte *)(param_1 + 0x40) * 2]);
    pEVar1 = EVP_get_digestbyname(name);
    return pEVar1;
  }
  return (EVP_MD *)0x0;
}

