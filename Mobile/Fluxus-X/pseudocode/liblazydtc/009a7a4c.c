/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a7a4c
 */

long DTLS_get_data_mtu(SSL *param_1)

{
  int iVar1;
  SSL_CIPHER *pSVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  long local_40;
  ulong local_38;
  ulong local_30;
  long local_28;
  
  pSVar2 = SSL_get_current_cipher(param_1);
  lVar3 = 0;
  if (pSVar2 != (SSL_CIPHER *)0x0) {
    uVar5 = *(ulong *)&param_1[1].tlsext_ocsp_exts[9].stack.sorted;
    iVar1 = ssl_cipher_get_overhead(pSVar2,&local_28,&local_30,&local_38,&local_40);
    if (iVar1 == 0) {
      lVar3 = 0;
    }
    else {
      if ((param_1->hit & 0x100) == 0) {
        local_30 = local_30 + local_28;
      }
      else {
        local_40 = local_40 + local_28;
      }
      uVar4 = uVar5 - (local_40 + 0xdU);
      lVar3 = 0;
      if (local_40 + 0xdU <= uVar5 && uVar4 != 0) {
        if (local_38 != 0) {
          uVar5 = 0;
          if (local_38 != 0) {
            uVar5 = uVar4 / local_38;
          }
          uVar4 = uVar5 * local_38;
        }
        if (uVar4 <= local_30) {
          uVar4 = local_30;
        }
        lVar3 = uVar4 - local_30;
      }
    }
  }
  return lVar3;
}

