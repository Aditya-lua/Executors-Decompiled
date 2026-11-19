/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5ca30
 */

int EVP_CIPHER_CTX_copy(EVP_CIPHER_CTX *out,EVP_CIPHER_CTX *in)

{
  char cVar1;
  bool bVar2;
  uint uVar3;
  int iVar4;
  void *__dest;
  uchar *key;
  undefined8 uVar5;
  uchar *iv;
  int in_w3;
  EVP_CIPHER *pEVar6;
  ENGINE *pEVar7;
  
  if ((in == (EVP_CIPHER_CTX *)0x0) || (pEVar6 = in->cipher, pEVar6 == (EVP_CIPHER *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/evp/evp_enc.c",0x584,"EVP_CIPHER_CTX_copy");
    uVar5 = 0x6f;
  }
  else if (pEVar6[1].do_cipher == (_func_1090 *)0x0) {
    if ((in->engine == (ENGINE *)0x0) || (iVar4 = ENGINE_init(in->engine), iVar4 != 0)) {
      EVP_CIPHER_CTX_reset(out);
      memcpy(out,in,0xb8);
      if ((in->cipher_data != (void *)0x0) &&
         (iVar4 = *(int *)&in->cipher->set_asn1_parameters, iVar4 != 0)) {
        __dest = CRYPTO_malloc(iVar4,"crypto/evp/evp_enc.c",0x5b1);
        out->cipher_data = __dest;
        if (__dest == (void *)0x0) {
          out->cipher = (EVP_CIPHER *)0x0;
          ERR_new();
          ERR_set_debug("crypto/evp/evp_enc.c",0x5b4,"EVP_CIPHER_CTX_copy");
          uVar5 = 0xc0100;
          goto LAB_00a5caf8;
        }
        memcpy(__dest,in->cipher_data,(long)*(int *)&in->cipher->set_asn1_parameters);
      }
      if ((*(byte *)((long)&in->cipher->flags + 1) >> 2 & 1) == 0) {
        return 1;
      }
      iVar4 = (*in->cipher->app_data)(in,8,0,out);
      if (iVar4 != 0) {
        return 1;
      }
      out->cipher = (EVP_CIPHER *)0x0;
      ERR_new();
      ERR_set_debug("crypto/evp/evp_enc.c",0x5bd,"EVP_CIPHER_CTX_copy");
      uVar5 = 0x86;
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/evp/evp_enc.c",0x5a8,"EVP_CIPHER_CTX_copy");
      uVar5 = 0x80026;
    }
  }
  else {
    if (pEVar6[2].init == (_func_1089 *)0x0) {
      ERR_new();
      uVar5 = 0x58c;
    }
    else {
      EVP_CIPHER_CTX_reset(out);
      iv = (uchar *)0xb8;
      memcpy(out,in,0xb8);
      out[1].cipher = (EVP_CIPHER *)0x0;
      pEVar7 = in[1].engine;
      if ((pEVar7 != (ENGINE *)0x0) && (*(int *)(pEVar7 + 0x18) == 0)) {
        pEVar7 = pEVar7 + 0x80;
        do {
          cVar1 = '\x01';
          bVar2 = (bool)ExclusiveMonitorPass(pEVar7,0x10);
          if (bVar2) {
            *(int *)pEVar7 = *(int *)pEVar7 + 1;
            cVar1 = ExclusiveMonitorsStatus();
          }
        } while (cVar1 != '\0');
      }
      uVar3 = (*in->cipher[2].init)((EVP_CIPHER_CTX *)in[1].cipher,key,iv,in_w3);
      out[1].cipher = (EVP_CIPHER *)(ulong)uVar3;
      if ((EVP_CIPHER *)(ulong)uVar3 != (EVP_CIPHER *)0x0) {
        return 1;
      }
      ERR_new();
      uVar5 = 0x59c;
    }
    ERR_set_debug("crypto/evp/evp_enc.c",uVar5,"EVP_CIPHER_CTX_copy");
    uVar5 = 0xbe;
  }
LAB_00a5caf8:
  ERR_set_error(6,uVar5,0);
  return 0;
}

