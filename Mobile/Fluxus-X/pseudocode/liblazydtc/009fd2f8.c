/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fd2f8
 */

undefined8 FUN_009fd2f8(BIO *param_1,long param_2,uint param_3)

{
  long lVar1;
  undefined8 uVar2;
  time_t tVar3;
  uint uVar4;
  __useconds_t __useconds;
  undefined4 local_24;
  
  if (param_2 == 0) {
    return 1;
  }
  lVar1 = BIO_ctrl(param_1,0x69,0,&local_24);
  if ((0 < lVar1) &&
     (uVar2 = BIO_socket_wait(local_24,*(uint *)&param_1->ptr & 1,param_2), (int)uVar2 != -1)) {
    return uVar2;
  }
  tVar3 = time((time_t *)0x0);
  param_2 = param_2 - tVar3;
  if (param_2 < 0) {
    return 0;
  }
  if (param_2 == 0) {
    uVar4 = 1000;
    if (param_3 < 1000) {
      __useconds = ((param_3 & 0xffff) % 1000) * 1000;
      goto LAB_009fd3e4;
    }
    __useconds = 0;
  }
  else {
    uVar4 = (int)param_2 * 1000;
    if ((ulong)param_3 <= (ulong)(param_2 * 1000)) {
      uVar4 = param_3;
    }
    __useconds = (uVar4 % 1000) * 1000;
    if (uVar4 < 1000) goto LAB_009fd3e4;
  }
  sleep(uVar4 / 1000);
LAB_009fd3e4:
  usleep(__useconds);
  return 1;
}

