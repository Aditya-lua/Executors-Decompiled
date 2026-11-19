/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e0d0c
 */

undefined8 ssl_do_client_cert_cb(long param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  long lVar2;
  
  lVar2 = *(long *)(param_1 + 0x9a8);
  if (*(long *)(lVar2 + 0x200) != 0) {
    uVar1 = tls_engine_load_ssl_client_cert(param_1,param_2,param_3);
    if ((int)uVar1 != 0) {
      return uVar1;
    }
    lVar2 = *(long *)(param_1 + 0x9a8);
  }
  if (*(code **)(lVar2 + 200) == (code *)0x0) {
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x009e0d6c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(lVar2 + 200))(param_1,param_2,param_3);
  return uVar1;
}

