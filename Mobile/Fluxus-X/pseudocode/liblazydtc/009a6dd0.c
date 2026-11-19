/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a6dd0
 */

bool dtls1_is_timer_expired(long param_1)

{
  long lVar1;
  long lVar2;
  timeval local_30;
  
  if ((*(long *)(*(long *)(param_1 + 0x4b8) + 0x1f0) == 0) &&
     (*(long *)(*(long *)(param_1 + 0x4b8) + 0x1f8) == 0)) {
    return false;
  }
  gettimeofday(&local_30,(__timezone_ptr_t)0x0);
  lVar1 = *(long *)(param_1 + 0x4b8);
  if ((local_30.tv_sec <= *(long *)(lVar1 + 0x1f0)) &&
     ((*(long *)(lVar1 + 0x1f0) != local_30.tv_sec || (local_30.tv_usec < *(long *)(lVar1 + 0x1f8)))
     )) {
    lVar2 = *(long *)(lVar1 + 0x1f0) - local_30.tv_sec;
    lVar1 = *(long *)(lVar1 + 0x1f8) - local_30.tv_usec;
    if (lVar1 < 0) {
      lVar2 = lVar2 + -1;
      lVar1 = lVar1 + 1000000;
    }
    if ((14999 < lVar1) || (lVar2 != 0)) {
      if (0 < lVar2) {
        return false;
      }
      goto LAB_009a6e80;
    }
  }
  lVar1 = 0;
LAB_009a6e80:
  return lVar1 < 1;
}

