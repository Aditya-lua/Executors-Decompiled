/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a3a6c
 */

/* ix::SocketOpenSSL::openSSLLockingCallback(int, int, char const*, int) */

void ix::SocketOpenSSL::openSSLLockingCallback(int param_1,int param_2,char *param_3,int param_4)

{
  mutex *this;
  
  this = *(mutex **)(openSSLMutexes + (long)param_2 * 8);
  if ((param_1 & 1U) == 0) {
    std::__ndk1::mutex::unlock(this);
    return;
  }
  std::__ndk1::mutex::lock(this);
  return;
}

