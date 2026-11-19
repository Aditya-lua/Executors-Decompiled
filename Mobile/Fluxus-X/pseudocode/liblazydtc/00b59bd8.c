/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b59bd8
 */

undefined8 ossl_drbg_set_ctx_params(long param_1,long param_2)

{
  long lVar1;
  undefined8 uVar2;
  
  if ((param_2 == 0) ||
     (((lVar1 = OSSL_PARAM_locate_const(param_2,"reseed_requests"), lVar1 == 0 ||
       (uVar2 = OSSL_PARAM_get_uint(lVar1,param_1 + 0xc4), (int)uVar2 != 0)) &&
      ((lVar1 = OSSL_PARAM_locate_const(param_2,"reseed_time_interval"), lVar1 == 0 ||
       (uVar2 = OSSL_PARAM_get_time_t(lVar1,param_1 + 0xd0), (int)uVar2 != 0)))))) {
    uVar2 = 1;
  }
  return uVar2;
}

