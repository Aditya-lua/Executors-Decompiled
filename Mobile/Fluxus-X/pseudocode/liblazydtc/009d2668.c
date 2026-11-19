/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d2668
 */

undefined8 FUN_009d2668(int *param_1,undefined4 param_2,undefined4 param_3)

{
  int iVar1;
  undefined2 uVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  ulong uVar6;
  int iVar7;
  ulong local_60;
  long local_58;
  
  local_58 = 0;
  if (*param_1 != 0x300) {
    uVar4 = SSL_get1_supported_ciphers(param_1);
    iVar3 = OPENSSL_sk_num();
    if (iVar3 < 1) {
      OPENSSL_sk_free(uVar4);
    }
    else {
      iVar7 = 0;
      do {
        lVar5 = OPENSSL_sk_value(uVar4,iVar7);
        if (((*(byte *)(lVar5 + 0x1c) & 0x84) != 0) || ((*(byte *)(lVar5 + 0x20) >> 3 & 1) != 0)) {
          OPENSSL_sk_free(uVar4);
          goto LAB_009d2720;
        }
        iVar1 = *(int *)(lVar5 + 0x2c);
        iVar7 = iVar7 + 1;
      } while ((iVar7 < iVar3) && (iVar1 < 0x304));
      OPENSSL_sk_free(uVar4);
      if (iVar1 < 0x304) {
        return 0;
      }
LAB_009d2720:
      tls1_get_supported_groups(param_1,&local_58,&local_60);
      if (local_60 != 0) {
        uVar6 = 0;
        do {
          uVar2 = *(undefined2 *)(local_58 + uVar6 * 2);
          iVar3 = tls_valid_group(param_1,uVar2,param_2,param_3,1,0);
          if ((iVar3 != 0) && (iVar3 = tls_group_allowed(param_1,uVar2,0x20004), iVar3 != 0)) {
            return 1;
          }
          uVar6 = uVar6 + 1;
        } while (uVar6 < local_60);
      }
    }
  }
  return 0;
}

