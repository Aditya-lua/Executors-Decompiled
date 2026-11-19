/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad4dc4
 */

int RSA_padding_check_none(uchar *to,int tlen,uchar *f,int fl,int rsa_len)

{
  if (tlen < fl) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_none.c",0x2a,"RSA_padding_check_none");
    ERR_set_error(4,0x6d,0);
    tlen = -1;
  }
  else {
    memset(to,0,(long)(tlen - fl));
    memcpy(to + ((long)tlen - (long)fl),f,(long)fl);
  }
  return tlen;
}

