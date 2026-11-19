/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a5274
 */

/* ix::SocketOpenSSL::send(char*, unsigned long) */

long __thiscall ix::SocketOpenSSL::send(SocketOpenSSL *this,char *param_1,ulong param_2)

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
                    /* try { // try from 009a52ac to 009a52af has its CatchHandler @ 009a5324 */
    ERR_clear_error();
                    /* try { // try from 009a52b4 to 009a52c3 has its CatchHandler @ 009a5320 */
    ret_code = SSL_write(*(SSL **)(this + 0x40),param_1,(int)param_2);
                    /* try { // try from 009a52c8 to 009a52cf has its CatchHandler @ 009a531c */
    uVar1 = SSL_get_error(*(SSL **)(this + 0x40),ret_code);
    if (uVar1 == 0) {
      lVar3 = (long)ret_code;
    }
    else {
      if ((uVar1 | 1) == 3) {
        puVar2 = (undefined4 *)__errno();
        *puVar2 = 0xb;
      }
      lVar3 = -1;
    }
  }
  std::__ndk1::mutex::unlock((mutex *)(this + 0xe0));
  return lVar3;
}

