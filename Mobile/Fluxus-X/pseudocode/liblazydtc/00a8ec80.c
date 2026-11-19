/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8ec80
 */

int Camellia_set_key(uchar *userKey,int bits,CAMELLIA_KEY *key)

{
  int iVar1;
  int iVar2;
  
  iVar1 = -1;
  if ((userKey != (uchar *)0x0) && (key != (CAMELLIA_KEY *)0x0)) {
    if ((bits == 0x80) || ((bits == 0x100 || (bits == 0xc0)))) {
      iVar2 = Camellia_Ekeygen(bits,userKey,key);
      iVar1 = 0;
      key->grand_rounds = iVar2;
    }
    else {
      iVar1 = -2;
    }
  }
  return iVar1;
}

