/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e0b38
 */

undefined8 tls_process_initial_server_flight(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  code *pcVar4;
  
  uVar2 = ssl3_check_cert_and_algorithm();
  if ((int)uVar2 == 0) {
    return uVar2;
  }
  if (*(int *)(param_1 + 0xa60) != -1) {
    pcVar4 = *(code **)(*(long *)(param_1 + 0x9a8) + 0x250);
    if (pcVar4 != (code *)0x0) {
      iVar1 = (*pcVar4)(param_1,*(undefined8 *)(*(long *)(param_1 + 0x9a8) + 600));
      if (iVar1 == 0) {
        ERR_new();
        ERR_set_debug("ssl/statem/statem_clnt.c",0xa8e,"tls_process_initial_server_flight");
        uVar2 = 0x71;
        uVar3 = 0x148;
      }
      else {
        if (-1 < iVar1) goto LAB_009e0b7c;
        ERR_new();
        ERR_set_debug("ssl/statem/statem_clnt.c",0xa93,"tls_process_initial_server_flight");
        uVar2 = 0x50;
        uVar3 = 0x131;
      }
      ossl_statem_fatal(param_1,uVar2,uVar3,0);
      return 0;
    }
  }
LAB_009e0b7c:
  if (((*(long *)(param_1 + 0xb68) == 0) || (uVar2 = ssl_validate_ct(param_1), (int)uVar2 != 0)) ||
     ((*(byte *)(param_1 + 0x968) & 1) == 0)) {
    uVar2 = 1;
  }
  return uVar2;
}

