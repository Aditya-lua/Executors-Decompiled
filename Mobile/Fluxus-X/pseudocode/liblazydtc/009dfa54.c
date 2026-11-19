/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009dfa54
 */

bool tls_process_server_done(long param_1,long param_2)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  if (*(long *)(param_2 + 8) == 0) {
    if (((*(byte *)(*(long *)(param_1 + 0x2e0) + 0x1c) >> 5 & 1) == 0) ||
       (iVar1 = ssl_srp_calc_a_param_intern(param_1), 0 < iVar1)) {
      iVar1 = tls_process_initial_server_flight(param_1);
      return iVar1 != 0;
    }
    ERR_new();
    ERR_set_debug("ssl/statem/statem_clnt.c",0xaae,"tls_process_server_done");
    uVar2 = 0x50;
    uVar3 = 0x169;
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_clnt.c",0xaa8,"tls_process_server_done");
    uVar2 = 0x32;
    uVar3 = 0x9f;
  }
  ossl_statem_fatal(param_1,uVar2,uVar3,0);
  return false;
}

