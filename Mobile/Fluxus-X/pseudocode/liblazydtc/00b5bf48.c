/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5bf48
 */

void ossl_pool_add_nonce_data(undefined8 param_1)

{
  __pid_t _Var1;
  int iVar2;
  undefined8 local_48;
  pthread_t local_40;
  long local_38;
  timespec local_30;
  
  local_48 = 0;
  local_40 = 0;
  local_38 = 0;
  _Var1 = getpid();
  local_48 = CONCAT44(local_48._4_4_,_Var1);
  local_40 = CRYPTO_THREAD_get_current_id();
  iVar2 = clock_gettime(0,&local_30);
  if ((iVar2 == 0) || (iVar2 = gettimeofday((timeval *)&local_30,(__timezone_ptr_t)0x0), iVar2 == 0)
     ) {
    local_38 = local_30.tv_nsec + (local_30.tv_sec << 0x20);
  }
  else {
    local_38 = time((time_t *)0x0);
  }
  ossl_rand_pool_add(param_1,&local_48,0x18,0);
  return;
}

