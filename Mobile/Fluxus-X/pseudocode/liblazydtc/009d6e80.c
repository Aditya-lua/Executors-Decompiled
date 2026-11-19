/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d6e80
 */

undefined8 tls_parse_ctos_session_ticket(long param_1,undefined8 *param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  if ((*(code **)(param_1 + 0xae8) == (code *)0x0) ||
     (iVar1 = (**(code **)(param_1 + 0xae8))
                        (param_1,*param_2,*(undefined4 *)(param_2 + 1),
                         *(undefined8 *)(param_1 + 0xaf0)), iVar1 != 0)) {
    uVar2 = 1;
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/statem/extensions_srvr.c",0xfd,"tls_parse_ctos_session_ticket");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    uVar2 = 0;
  }
  return uVar2;
}

