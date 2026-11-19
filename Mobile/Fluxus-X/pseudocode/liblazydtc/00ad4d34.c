/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad4d34
 */

int RSA_padding_add_none(uchar *to,int tlen,uchar *f,int fl)

{
  undefined8 uVar1;
  
  if (tlen < fl) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_none.c",0x18,"RSA_padding_add_none");
    uVar1 = 0x6e;
  }
  else {
    if (tlen <= fl) {
      memcpy(to,f,(ulong)(uint)fl);
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_none.c",0x1d,"RSA_padding_add_none");
    uVar1 = 0x7a;
  }
  ERR_set_error(4,uVar1,0);
  return 0;
}

