/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bccf10
 */

/* std::__ndk1::timed_mutex::try_lock() */

byte __thiscall std::__ndk1::timed_mutex::try_lock(timed_mutex *this)

{
  timed_mutex tVar1;
  byte bVar2;
  int iVar3;
  
                    /* try { // try from 00bccf24 to 00bccf27 has its CatchHandler @ 00bccf64 */
  iVar3 = pthread_mutex_trylock((pthread_mutex_t *)this);
  if (iVar3 == 0) {
    tVar1 = this[0x58];
    if (((byte)tVar1 & 1) == 0) {
      this[0x58] = (timed_mutex)0x1;
    }
                    /* try { // try from 00bccf44 to 00bccf4b has its CatchHandler @ 00bccf60 */
    pthread_mutex_unlock((pthread_mutex_t *)this);
    bVar2 = (byte)tVar1 ^ 1;
  }
  else {
    bVar2 = 0;
  }
  return bVar2;
}

