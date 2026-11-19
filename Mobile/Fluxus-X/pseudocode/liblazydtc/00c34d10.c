/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c34d10
 */

SSL_SESSION * d2i_SSL_SESSION(SSL_SESSION **a,uchar **pp,long length)

{
  SSL_SESSION *pSVar1;
  
  pSVar1 = d2i_SSL_SESSION(a,pp,length);
  return pSVar1;
}

