/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a5338
 */

/* ix::SocketOpenSSL::recv(void*, unsigned long) */

long __thiscall ix::SocketOpenSSL::recv(SocketOpenSSL *this,void *param_1,ulong param_2)

{
  int ret_code;
  uint uVar1;
  undefined4 *puVar2;
  long lVar3;
  
  std::__ndk1::mutex::lock((mutex *)(this + 0xe0));
  if ((*(long *)(this + 0x40) == 0) || (*(long *)(this + 0x48) == 0)) {
    lVar3 = 0;
  }
  else {
                    /* try { // try from 009a5370 to 009a5373 has its CatchHandler @ 009a53e8 */
    ERR_clear_error();
                    /* try { // try from 009a5378 to 009a5387 has its CatchHandler @ 009a53e4 */
    ret_code = SSL_read(*(SSL **)(this + 0x40),param_1,(int)param_2);
    if (ret_code < 1) {
                    /* try { // try from 009a53bc to 009a53bf has its CatchHandler @ 009a53e0 */
      uVar1 = SSL_get_error(*(SSL **)(this + 0x40),ret_code);
      if ((uVar1 | 1) == 3) {
        puVar2 = (undefined4 *)__errno();
        *puVar2 = 0xb;
      }
      lVar3 = -1;
    }
    else {
      lVar3 = (long)ret_code;
    }
  }
  std::__ndk1::mutex::unlock((mutex *)(this + 0xe0));
  return lVar3;
}

