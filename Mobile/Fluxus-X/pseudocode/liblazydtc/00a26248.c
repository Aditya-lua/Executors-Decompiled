/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a26248
 */

EC_KEY * o2i_ECPublicKey(EC_KEY **key,uchar **in,long len)

{
  undefined4 uVar1;
  int iVar2;
  EC_KEY *pEVar3;
  
  if (((key == (EC_KEY **)0x0) || (pEVar3 = *key, pEVar3 == (EC_KEY *)0x0)) ||
     (*(long *)(pEVar3 + 0x18) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_asn1.c",0x47a,"o2i_ECPublicKey");
    uVar1 = 0xc0102;
  }
  else {
    iVar2 = EC_KEY_oct2key(pEVar3,*in,len,0);
    if (iVar2 != 0) {
      *in = *in + len;
      return pEVar3;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_asn1.c",0x480,"o2i_ECPublicKey");
    uVar1 = 0x80010;
  }
  ERR_set_error(0x10,uVar1,0);
  return (EC_KEY *)0x0;
}

