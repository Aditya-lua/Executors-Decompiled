/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d3e08
 */

undefined8 tls_construct_ctos_padding(long param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  int *piVar4;
  ulong uVar5;
  ulong local_38;
  void *local_28;
  
  if ((*(byte *)(param_1 + 0x9e8) >> 4 & 1) == 0) {
    return 2;
  }
  iVar1 = WPACKET_get_total_written(param_2,&local_38);
  if (iVar1 == 0) {
    ERR_new();
    uVar3 = 0x39d;
LAB_009d3f38:
    ERR_set_debug("ssl/statem/extensions_clnt.c",uVar3,"tls_construct_ctos_padding");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    uVar3 = 0;
  }
  else {
    piVar4 = *(int **)(param_1 + 0x918);
    if ((((*piVar4 == 0x304) && (*(long *)(piVar4 + 0xd0) != 0)) && (*(long *)(piVar4 + 0xbe) != 0))
       && (lVar2 = ssl_md(*(undefined8 *)(param_1 + 0x9a8),
                          *(undefined4 *)(*(long *)(piVar4 + 0xbe) + 0x40)), lVar2 != 0)) {
      lVar2 = *(long *)(*(long *)(param_1 + 0x918) + 0x340);
      iVar1 = EVP_MD_get_size();
      local_38 = lVar2 + iVar1 + local_38 + 0xf;
    }
    if ((local_38 & 0xffffffffffffff00) == 0x100) {
      uVar5 = 0x200 - local_38;
      local_38 = 0x1fc - local_38;
      if (uVar5 < 5) {
        local_38 = 1;
      }
      iVar1 = WPACKET_put_bytes__(param_2,0x15,2);
      if ((iVar1 == 0) ||
         (iVar1 = WPACKET_sub_allocate_bytes__(param_2,local_38,&local_28,2), iVar1 == 0)) {
        ERR_new();
        uVar3 = 0x3c5;
        goto LAB_009d3f38;
      }
      memset(local_28,0,local_38);
    }
    uVar3 = 1;
  }
  return uVar3;
}

