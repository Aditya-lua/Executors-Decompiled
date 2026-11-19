/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1e6d8
 */

int DH_compute_key_padded(uchar *key,BIGNUM *pub_key,DH *dh)

{
  int iVar1;
  int iVar2;
  int iVar3;
  
  iVar1 = (**(code **)&(dh[1].priv_key)->neg)();
  if (iVar1 < 1) {
    iVar3 = iVar1;
  }
  else {
    iVar2 = BN_num_bits(dh->p);
    iVar3 = iVar2 + 0xe;
    if (-1 < iVar2 + 7) {
      iVar3 = iVar2 + 7;
    }
    iVar3 = iVar3 >> 3;
    iVar2 = iVar3 - iVar1;
    if (0 < iVar2) {
      memmove(key + iVar2,key,(long)iVar1);
      memset(key,0,(long)iVar2);
    }
  }
  return iVar3;
}

