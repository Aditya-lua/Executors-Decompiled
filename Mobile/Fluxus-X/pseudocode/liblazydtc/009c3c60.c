/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c3c60
 */

undefined8 FUN_009c3c60(SSL *param_1,undefined4 param_2,long param_3)

{
  uint uVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  undefined8 uVar5;
  stack_st_SSL_CIPHER *psVar6;
  long lVar7;
  SSL_METHOD *pSVar8;
  undefined1 local_54;
  undefined1 local_53;
  
  if ((param_3 == 0) || (*(int *)(param_3 + 0x24) == 0)) {
    uVar5 = 0;
  }
  else {
    uVar1 = *(uint *)(param_1->method->get_timeout + 0x60);
    if (((uVar1 >> 3 & 1) != 0) ||
       ((((iVar2 = param_1->method->version, iVar2 < 0x304 || (iVar2 == 0x10000)) ||
         (uVar5 = 0, *(int *)(param_3 + 0x14) != 0x74)) &&
        (((param_1->server != 0 || (uVar1 & 8) != 0 ||
          (*(int *)((long)&param_1[1].session + 4) < 0x304)) ||
         ((uVar5 = 0, *(int *)(param_3 + 0x14) != 0x74 &&
          ((10 < *(uint *)(param_3 + 0x10) ||
           (uVar5 = 0, (1 << (ulong)(*(uint *)(param_3 + 0x10) & 0x1f) & 0x403U) == 0)))))))))) {
      iVar2 = ssl_cert_is_disabled
                        (*(undefined8 *)&param_1[3].ex_data.dummy,(long)*(int *)(param_3 + 0x18));
      uVar5 = 0;
      if (iVar2 == 0) {
        if ((*(int *)(param_3 + 0x14) - 0x3d3U < 2) || (*(int *)(param_3 + 0x14) == 0x32b)) {
          pSVar8 = param_1->method;
          if (param_1->server == 0) {
            if ((pSVar8->version == 0x10000) && (0x303 < *(int *)&param_1[1].generate_session_id)) {
              if (0x303 < *(int *)((long)&param_1[1].session + 4)) {
                return 0;
              }
              psVar6 = SSL_get_ciphers(param_1);
              if (psVar6 == (stack_st_SSL_CIPHER *)0x0) {
                return 0;
              }
              iVar2 = OPENSSL_sk_num();
              if (iVar2 < 1) {
                iVar4 = 0;
              }
              else {
                iVar4 = 0;
                do {
                  lVar7 = OPENSSL_sk_value(psVar6,iVar4);
                  iVar3 = ssl_cipher_disabled(param_1,lVar7,0x10001,0);
                  if ((iVar3 == 0) && ((*(ushort *)(lVar7 + 0x1c) & 0x210) != 0)) break;
                  iVar4 = iVar4 + 1;
                } while (iVar4 < iVar2);
              }
              if (iVar4 == iVar2) {
                return 0;
              }
            }
          }
          else if (((((byte)pSVar8->get_timeout[0x60] >> 3 & 1) == 0) && (0x303 < pSVar8->version))
                  && (pSVar8->version != 0x10000)) {
            return 0;
          }
        }
        if (*(int *)(param_3 + 0xc) == 0) {
          iVar2 = 0xe0;
          if (*(short *)(param_3 + 8) != 0x808) {
            iVar2 = 0;
          }
          iVar4 = 0x80;
          if (*(short *)(param_3 + 8) != 0x807) {
            iVar4 = iVar2;
          }
        }
        else {
          lVar7 = ssl_md(*(undefined8 *)&param_1[3].ex_data.dummy,*(undefined4 *)(param_3 + 0x10));
          if (lVar7 == 0) {
            iVar4 = 0;
          }
          else {
            iVar4 = EVP_MD_get_type();
            iVar2 = EVP_MD_get_size(lVar7);
            if (iVar4 == 4) {
              iVar4 = 0x27;
            }
            else if (iVar4 != 0x40) {
              if (iVar4 == 0x72) {
                iVar4 = 0x43;
              }
              else {
                iVar4 = iVar2 << 2;
              }
            }
          }
        }
        local_54 = (undefined1)((ushort)*(undefined2 *)(param_3 + 8) >> 8);
        local_53 = (undefined1)*(undefined2 *)(param_3 + 8);
        uVar5 = ssl_security(param_1,param_2,iVar4,*(undefined4 *)(param_3 + 0xc),&local_54);
      }
    }
  }
  return uVar5;
}

