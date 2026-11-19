/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ff860
 */

int BIO_socket_wait(uint param_1,int param_2,long param_3)

{
  fd_set *__readfds;
  fd_set *__writefds;
  int iVar1;
  time_t tVar2;
  timeval local_d0;
  fd_set fStack_c0;
  
  if (param_1 < 0x400) {
    if (param_3 == 0) {
      iVar1 = 1;
    }
    else {
      tVar2 = time((time_t *)0x0);
      iVar1 = 0;
      if (tVar2 <= param_3) {
        memset(&fStack_c0,0,0x80);
        __FD_SET_chk(param_1,&fStack_c0,0x80);
        local_d0.tv_sec = param_3 - tVar2;
        __readfds = &fStack_c0;
        if (param_2 == 0) {
          __readfds = (fd_set *)0x0;
        }
        __writefds = (fd_set *)0x0;
        if (param_2 == 0) {
          __writefds = &fStack_c0;
        }
        local_d0.tv_usec = 0;
        iVar1 = select(param_1 + 1,__readfds,__writefds,(fd_set *)0x0,&local_d0);
      }
    }
  }
  else {
    iVar1 = -1;
  }
  return iVar1;
}

