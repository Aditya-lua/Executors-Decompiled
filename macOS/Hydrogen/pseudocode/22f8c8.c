
void __ZN142__LT_rustls__client__tls12__ExpectFinished_u20_as_u20_rustls__common_state__State_LT_rustls__client__client_conn__ClientConnectionData_GT__GT_20handle_decrypt_error17h6ddf322cad125038E
               (long param_1)

{
  long lVar1;
  
  if ((*(byte *)(param_1 + 0x1a1) & 1) == 0) {
    return;
  }
  lVar1 = *(long *)(*(long *)(param_1 + 0xe8) + 0xf0);
                    /* WARNING: Could not recover jumptable at 0x0022f8f8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(lVar1 + 0x40))
            (*(long *)(*(long *)(param_1 + 0xe8) + 0xe8) +
             (*(long *)(lVar1 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10,param_1 + 200);
  return;
}

