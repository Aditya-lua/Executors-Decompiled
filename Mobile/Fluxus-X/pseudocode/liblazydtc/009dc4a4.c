/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009dc4a4
 */

undefined8 tls_construct_client_certificate(long param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  
  if ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) &&
      (iVar1 = **(int **)(param_1 + 8), 0x303 < iVar1)) && (iVar1 != 0x10000)) {
    if (*(long *)(param_1 + 0xbb0) == 0) {
      iVar1 = WPACKET_put_bytes__(param_2,0,1);
      if (iVar1 != 0) goto LAB_009dc524;
      ERR_new();
      uVar3 = 0xdb4;
    }
    else {
      iVar1 = WPACKET_sub_memcpy__
                        (param_2,*(long *)(param_1 + 0xbb0),*(undefined8 *)(param_1 + 3000),1);
      if (iVar1 != 0) goto LAB_009dc524;
      ERR_new();
      uVar3 = 0xdb8;
    }
    ERR_set_debug("ssl/statem/statem_clnt.c",uVar3,"tls_construct_client_certificate");
    uVar3 = 0x50;
    uVar4 = 0xc0103;
LAB_009dc5f0:
    ossl_statem_fatal(param_1,uVar3,uVar4,0);
    uVar3 = 0;
  }
  else {
LAB_009dc524:
    uVar3 = 0;
    if (*(int *)(param_1 + 0x2f0) != 2) {
      uVar3 = **(undefined8 **)(param_1 + 0x898);
    }
    lVar2 = ssl3_output_cert_chain(param_1,param_2,uVar3);
    if (lVar2 == 0) {
      return 0;
    }
    lVar2 = *(long *)(*(int **)(param_1 + 8) + 0x30);
    if ((*(byte *)(lVar2 + 0x60) >> 3 & 1) == 0) {
      iVar1 = **(int **)(param_1 + 8);
      if (iVar1 < 0x304) {
        return 1;
      }
      if (iVar1 == 0x10000) {
        return 1;
      }
      if (((*(long *)(param_1 + 0x240) == 0) || (*(long *)(param_1 + 0x2c8) == 0)) &&
         (iVar1 = (**(code **)(lVar2 + 0x20))(param_1,0x92), iVar1 == 0)) {
        ERR_new();
        ERR_set_debug("ssl/statem/statem_clnt.c",0xdcb,"tls_construct_client_certificate");
        uVar3 = 0xffffffff;
        uVar4 = 0x6d;
        goto LAB_009dc5f0;
      }
    }
    uVar3 = 1;
  }
  return uVar3;
}

