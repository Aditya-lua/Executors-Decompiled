/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b59a14
 */

undefined8 ossl_drbg_get_ctx_params(long param_1,undefined8 param_2)

{
  long lVar1;
  undefined8 uVar2;
  
  lVar1 = OSSL_PARAM_locate(param_2,"state");
  if ((((((lVar1 == 0) ||
         (uVar2 = OSSL_PARAM_set_int(lVar1,*(undefined4 *)(param_1 + 0xf0)), (int)uVar2 != 0)) &&
        ((lVar1 = OSSL_PARAM_locate(param_2,"strength"), lVar1 == 0 ||
         (uVar2 = OSSL_PARAM_set_int(lVar1,*(undefined4 *)(param_1 + 0x80)), (int)uVar2 != 0)))) &&
       ((lVar1 = OSSL_PARAM_locate(param_2,"max_request"), lVar1 == 0 ||
        (uVar2 = OSSL_PARAM_set_size_t(lVar1,*(undefined8 *)(param_1 + 0x88)), (int)uVar2 != 0))))
      && (((((lVar1 = OSSL_PARAM_locate(param_2,"min_entropylen"), lVar1 == 0 ||
             (uVar2 = OSSL_PARAM_set_size_t(lVar1,*(undefined8 *)(param_1 + 0x90)), (int)uVar2 != 0)
             ) && ((((lVar1 = OSSL_PARAM_locate(param_2,"max_entropylen"), lVar1 == 0 ||
                     (uVar2 = OSSL_PARAM_set_size_t(lVar1,*(undefined8 *)(param_1 + 0x98)),
                     (int)uVar2 != 0)) &&
                    ((lVar1 = OSSL_PARAM_locate(param_2,"min_noncelen"), lVar1 == 0 ||
                     (uVar2 = OSSL_PARAM_set_size_t(lVar1,*(undefined8 *)(param_1 + 0xa0)),
                     (int)uVar2 != 0)))) &&
                   ((lVar1 = OSSL_PARAM_locate(param_2,"max_noncelen"), lVar1 == 0 ||
                    (uVar2 = OSSL_PARAM_set_size_t(lVar1,*(undefined8 *)(param_1 + 0xa8)),
                    (int)uVar2 != 0)))))) &&
           ((lVar1 = OSSL_PARAM_locate(param_2,"max_perslen"), lVar1 == 0 ||
            (uVar2 = OSSL_PARAM_set_size_t(lVar1,*(undefined8 *)(param_1 + 0xb0)), (int)uVar2 != 0))
           )) && ((((lVar1 = OSSL_PARAM_locate(param_2,"max_adinlen"), lVar1 == 0 ||
                    (uVar2 = OSSL_PARAM_set_size_t(lVar1,*(undefined8 *)(param_1 + 0xb8)),
                    (int)uVar2 != 0)) &&
                   ((lVar1 = OSSL_PARAM_locate(param_2,"reseed_requests"), lVar1 == 0 ||
                    (uVar2 = OSSL_PARAM_set_uint(lVar1,*(undefined4 *)(param_1 + 0xc4)),
                    (int)uVar2 != 0)))) &&
                  (((lVar1 = OSSL_PARAM_locate(param_2,"reseed_time"), lVar1 == 0 ||
                    (uVar2 = OSSL_PARAM_set_time_t(lVar1,*(undefined8 *)(param_1 + 200)),
                    (int)uVar2 != 0)) &&
                   ((lVar1 = OSSL_PARAM_locate(param_2,"reseed_time_interval"), lVar1 == 0 ||
                    (uVar2 = OSSL_PARAM_set_time_t(lVar1,*(undefined8 *)(param_1 + 0xd0)),
                    (int)uVar2 != 0)))))))))) &&
     ((lVar1 = OSSL_PARAM_locate(param_2,"reseed_counter"), lVar1 == 0 ||
      (uVar2 = OSSL_PARAM_set_uint(lVar1,*(undefined4 *)(param_1 + 0xd8)), (int)uVar2 != 0)))) {
    uVar2 = 1;
  }
  return uVar2;
}

