/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d4920
 */

undefined8 tls_parse_stoc_session_ticket(long param_1,undefined8 *param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  if ((*(code **)(param_1 + 0xae8) == (code *)0x0) ||
     (iVar1 = (**(code **)(param_1 + 0xae8))
                        (param_1,*param_2,*(undefined4 *)(param_2 + 1),
                         *(undefined8 *)(param_1 + 0xaf0)), iVar1 != 0)) {
    iVar1 = tls_use_ticket(param_1);
    if (iVar1 == 0) {
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_clnt.c",0x55e,"tls_parse_stoc_session_ticket");
      uVar2 = 0x6e;
    }
    else {
      if (param_2[1] == 0) {
        *(undefined4 *)(param_1 + 0xa98) = 1;
        return 1;
      }
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_clnt.c",0x562,"tls_parse_stoc_session_ticket");
      uVar2 = 0x32;
    }
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/statem/extensions_clnt.c",0x559,"tls_parse_stoc_session_ticket");
    uVar2 = 0x28;
  }
  ossl_statem_fatal(param_1,uVar2,0x6e,0);
  return 0;
}

