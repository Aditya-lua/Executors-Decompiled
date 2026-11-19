/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e066c
 */

undefined8 FUN_009e066c(long param_1,undefined8 param_2)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  int *piVar6;
  long lVar7;
  
  lVar3 = ssl_get_cipher_by_char(param_1,param_2,0);
  if (lVar3 == 0) {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_clnt.c",0x521,"set_client_ciphersuite");
    uVar5 = 0xf8;
    goto LAB_009e06f8;
  }
  iVar2 = ssl_cipher_disabled(param_1,lVar3,0x10003,1);
  if (iVar2 == 0) {
    uVar5 = ssl_get_ciphers_by_id(param_1);
    iVar2 = OPENSSL_sk_find(uVar5,lVar3);
    if (iVar2 < 0) {
      ERR_new();
      uVar5 = 0x531;
    }
    else {
      piVar6 = *(int **)(param_1 + 8);
      uVar1 = *(uint *)(*(long *)(piVar6 + 0x30) + 0x60);
      if (((((uVar1 >> 3 & 1) != 0) || (*piVar6 < 0x304)) || (*piVar6 == 0x10000)) ||
         ((*(long *)(param_1 + 0x2e0) == 0 ||
          (*(int *)(*(long *)(param_1 + 0x2e0) + 0x18) == *(int *)(lVar3 + 0x18))))) {
        lVar7 = *(long *)(param_1 + 0x918);
        if (*(long *)(lVar7 + 0x2f8) != 0) {
          *(ulong *)(lVar7 + 0x300) = (ulong)*(uint *)(*(long *)(lVar7 + 0x2f8) + 0x18);
        }
        if ((*(int *)(param_1 + 0x4d0) == 0) ||
           (*(ulong *)(lVar7 + 0x300) == (ulong)*(uint *)(lVar3 + 0x18))) {
LAB_009e0794:
          *(long *)(param_1 + 0x2e0) = lVar3;
          return 1;
        }
        if (((uVar1 >> 3 & 1) == 0) && ((0x303 < *piVar6 && (*piVar6 != 0x10000)))) {
          lVar7 = ssl_md(*(undefined8 *)(param_1 + 0x9a8),*(undefined4 *)(lVar3 + 0x40));
          if ((lVar7 != 0) &&
             (lVar4 = ssl_md(*(undefined8 *)(param_1 + 0x9a8),
                             *(undefined4 *)(*(long *)(*(long *)(param_1 + 0x918) + 0x2f8) + 0x40)),
             lVar7 == lVar4)) goto LAB_009e0794;
          ERR_new();
          ERR_set_debug("ssl/statem/statem_clnt.c",0x54e,"set_client_ciphersuite");
          uVar5 = 0xda;
        }
        else {
          ERR_new();
          ERR_set_debug("ssl/statem/statem_clnt.c",0x557,"set_client_ciphersuite");
          uVar5 = 0xc5;
        }
        goto LAB_009e06f8;
      }
      ERR_new();
      uVar5 = 0x538;
    }
  }
  else {
    ERR_new();
    uVar5 = 0x529;
  }
  ERR_set_debug("ssl/statem/statem_clnt.c",uVar5,"set_client_ciphersuite");
  uVar5 = 0x105;
LAB_009e06f8:
  ossl_statem_fatal(param_1,0x2f,uVar5,0);
  return 0;
}

