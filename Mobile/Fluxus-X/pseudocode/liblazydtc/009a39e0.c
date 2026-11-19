/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a39e0
 */

/* ix::SocketOpenSSL::close() */

void __thiscall ix::SocketOpenSSL::close(SocketOpenSSL *this)

{
  std::__ndk1::mutex::lock((mutex *)(this + 0xe0));
  if (*(SSL **)(this + 0x40) != (SSL *)0x0) {
                    /* try { // try from 009a3a04 to 009a3a23 has its CatchHandler @ 009a3a34 */
    SSL_free(*(SSL **)(this + 0x40));
    *(undefined8 *)(this + 0x40) = 0;
  }
  if (*(SSL_CTX **)(this + 0x48) != (SSL_CTX *)0x0) {
    SSL_CTX_free(*(SSL_CTX **)(this + 0x48));
    *(undefined8 *)(this + 0x48) = 0;
  }
  Socket::close((Socket *)this);
  std::__ndk1::mutex::unlock((mutex *)(this + 0xe0));
  return;
}

