/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a38c0
 */

/* ix::SocketOpenSSL::openSSLInitialize() */

void ix::SocketOpenSSL::openSSLInitialize(void)

{
  int iVar1;
  
  iVar1 = OPENSSL_init_ssl(0x40,0);
  if (iVar1 != 0) {
    OPENSSL_init_ssl(0,0);
    OPENSSL_init_ssl(0x200002,0);
    _openSSLInitializationSuccessful = 1;
  }
  return;
}

