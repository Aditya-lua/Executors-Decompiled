/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcd108
 */

/* std::__ndk1::recursive_timed_mutex::try_lock() */

undefined8 __thiscall std::__ndk1::recursive_timed_mutex::try_lock(recursive_timed_mutex *this)

{
  int iVar1;
  pthread_t pVar2;
  long lVar3;
  undefined8 uVar4;
  
  pVar2 = pthread_self();
                    /* try { // try from 00bcd128 to 00bcd12f has its CatchHandler @ 00bcd18c */
  iVar1 = pthread_mutex_trylock((pthread_mutex_t *)this);
  if (iVar1 == 0) {
    lVar3 = *(long *)(this + 0x58);
    if ((lVar3 == 0) || ((uVar4 = 0, lVar3 != -1 && (*(pthread_t *)(this + 0x60) == pVar2)))) {
      uVar4 = 1;
      *(long *)(this + 0x58) = lVar3 + 1;
      *(pthread_t *)(this + 0x60) = pVar2;
    }
                    /* try { // try from 00bcd168 to 00bcd16f has its CatchHandler @ 00bcd188 */
    pthread_mutex_unlock((pthread_mutex_t *)this);
  }
  else {
    uVar4 = 0;
  }
  return uVar4;
}

