/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9bd68
 */

tm * OPENSSL_gmtime(time_t *param_1,tm *param_2)

{
  tm *ptVar1;
  tm *ptVar2;
  
  ptVar2 = gmtime_r(param_1,param_2);
  ptVar1 = (tm *)0x0;
  if (ptVar2 != (tm *)0x0) {
    ptVar1 = param_2;
  }
  return ptVar1;
}

