/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d49fc
 */

undefined8
tls_parse_stoc_status_request(long param_1,long param_2,int param_3,undefined8 param_4,long param_5)

{
  undefined8 uVar1;
  int *piVar2;
  int iVar3;
  
  if (param_3 == 0x4000) {
    return 1;
  }
  if (*(int *)(param_1 + 0xa60) == 1) {
    piVar2 = *(int **)(param_1 + 8);
    if ((((*(uint *)(*(long *)(piVar2 + 0x30) + 0x60) >> 3 & 1) == 0) &&
        (iVar3 = *piVar2, 0x303 < iVar3)) && (iVar3 != 0x10000)) {
LAB_009d4ac0:
      if ((0x303 < iVar3) && (iVar3 != 0x10000)) {
        if (param_5 == 0) {
          uVar1 = tls_process_cert_status_body(param_1);
          return uVar1;
        }
        return 1;
      }
    }
    else {
      if (*(long *)(param_2 + 8) != 0) {
        ERR_new();
        ERR_set_debug("ssl/statem/extensions_clnt.c",0x57d,"tls_parse_stoc_status_request");
        uVar1 = 0x32;
        goto LAB_009d4a98;
      }
      if ((*(uint *)(*(long *)(piVar2 + 0x30) + 0x60) >> 3 & 1) == 0) {
        iVar3 = *piVar2;
        goto LAB_009d4ac0;
      }
    }
    uVar1 = 1;
    *(undefined4 *)(param_1 + 0xa74) = 1;
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/statem/extensions_clnt.c",0x579,"tls_parse_stoc_status_request");
    uVar1 = 0x6e;
LAB_009d4a98:
    ossl_statem_fatal(param_1,uVar1,0x6e,0);
    uVar1 = 0;
  }
  return uVar1;
}

