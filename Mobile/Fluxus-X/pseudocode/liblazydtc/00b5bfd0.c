/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5bfd0
 */

void ossl_rand_pool_add_additional_data(undefined8 param_1)

{
  __pid_t _Var1;
  uint uVar2;
  int iVar3;
  undefined8 local_48;
  pthread_t local_40;
  ulong local_38;
  timespec local_30;
  
  local_48 = 0;
  local_40 = 0;
  local_38 = 0;
  _Var1 = openssl_get_fork_id();
  local_48 = CONCAT44(local_48._4_4_,_Var1);
  local_40 = CRYPTO_THREAD_get_current_id();
  uVar2 = OPENSSL_rdtsc();
  if (uVar2 == 0) {
    iVar3 = clock_gettime(7,&local_30);
    if ((iVar3 == 0) ||
       (iVar3 = gettimeofday((timeval *)&local_30,(__timezone_ptr_t)0x0), iVar3 == 0)) {
      local_38 = local_30.tv_nsec + (local_30.tv_sec << 0x20);
    }
    else {
      local_38 = time((time_t *)0x0);
    }
  }
  else {
    local_38 = (ulong)uVar2;
  }
  ossl_rand_pool_add(param_1,&local_48,0x18,0);
  return;
}

