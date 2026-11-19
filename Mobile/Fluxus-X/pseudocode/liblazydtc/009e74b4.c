/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e74b4
 */

bool tls_construct_server_certificate(long param_1,undefined8 param_2)

{
  bool bVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  
  lVar4 = *(long *)(param_1 + 0x388);
  if (lVar4 == 0) {
    ERR_new();
    uVar3 = 0xe10;
LAB_009e7540:
    ERR_set_debug("ssl/statem/statem_srvr.c",uVar3,"tls_construct_server_certificate");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    bVar1 = false;
  }
  else {
    if ((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) {
      iVar2 = **(int **)(param_1 + 8);
      if (((0x303 < iVar2) && (iVar2 != 0x10000)) &&
         (iVar2 = WPACKET_put_bytes__(param_2,0,1), iVar2 == 0)) {
        ERR_new();
        uVar3 = 0xe19;
        goto LAB_009e7540;
      }
    }
    lVar4 = ssl3_output_cert_chain(param_1,param_2,lVar4);
    bVar1 = lVar4 != 0;
  }
  return bVar1;
}

