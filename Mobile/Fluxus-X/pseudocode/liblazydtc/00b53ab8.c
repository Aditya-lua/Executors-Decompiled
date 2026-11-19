/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b53ab8
 */

int CMAC_Init(CMAC_CTX *ctx,void *key,size_t keylen,EVP_CIPHER *cipher,ENGINE *impl)

{
  CMAC_CTX CVar1;
  CMAC_CTX CVar2;
  int iVar3;
  uint inl;
  long lVar4;
  byte bVar5;
  CMAC_CTX *pCVar6;
  ulong uVar7;
  byte bVar8;
  ulong uVar9;
  CMAC_CTX *out;
  
  if ((((keylen == 0) && (key == (void *)0x0)) && (cipher == (EVP_CIPHER *)0x0)) &&
     (impl == (ENGINE *)0x0)) {
    if (*(int *)(ctx + 0x88) != -1) {
      iVar3 = EVP_EncryptInit_ex(*(EVP_CIPHER_CTX **)ctx,(EVP_CIPHER *)0x0,(ENGINE *)0x0,
                                 (uchar *)0x0,"");
      if (iVar3 == 0) {
        return 0;
      }
      iVar3 = EVP_CIPHER_CTX_get_block_size(*(undefined8 *)ctx);
      memset(ctx + 0x48,0,(long)iVar3);
      *(undefined4 *)(ctx + 0x88) = 0;
      return 1;
    }
  }
  else {
    if (cipher == (EVP_CIPHER *)0x0) {
      if (key == (void *)0x0) {
        return 1;
      }
    }
    else {
      *(undefined4 *)(ctx + 0x88) = 0xffffffff;
      iVar3 = EVP_EncryptInit_ex(*(EVP_CIPHER_CTX **)ctx,cipher,impl,(uchar *)0x0,(uchar *)0x0);
      if (iVar3 == 0) {
        return 0;
      }
      if (key == (void *)0x0) {
        return (uint)(iVar3 != 0);
      }
    }
    *(undefined4 *)(ctx + 0x88) = 0xffffffff;
    lVar4 = EVP_CIPHER_CTX_get0_cipher(*(undefined8 *)ctx);
    if (lVar4 == 0) {
      return 0;
    }
    iVar3 = EVP_CIPHER_CTX_set_key_length(*(EVP_CIPHER_CTX **)ctx,(int)keylen);
    if (0 < iVar3) {
      iVar3 = EVP_EncryptInit_ex(*(EVP_CIPHER_CTX **)ctx,(EVP_CIPHER *)0x0,(ENGINE *)0x0,key,"");
      if (iVar3 == 0) {
        return 0;
      }
      inl = EVP_CIPHER_CTX_get_block_size(*(undefined8 *)ctx);
      if (-1 < (int)inl) {
        out = ctx + 0x48;
        iVar3 = EVP_Cipher(*(EVP_CIPHER_CTX **)ctx,(uchar *)out,"",inl);
        if (0 < iVar3) {
          CVar1 = ctx[0x48];
          bVar5 = (char)CVar1 << 1;
          if ((int)inl < 2) {
            pCVar6 = ctx + 8;
          }
          else {
            pCVar6 = ctx + 0x49;
            uVar7 = (ulong)(inl - 1);
            do {
              uVar7 = uVar7 - 1;
              CVar2 = (CMAC_CTX)(bVar5 | (byte)*pCVar6 >> 7);
              bVar5 = (char)*pCVar6 << 1;
              pCVar6[-0x41] = CVar2;
              pCVar6 = pCVar6 + 1;
            } while (uVar7 != 0);
            pCVar6 = ctx + (ulong)(inl - 1) + 8;
          }
          bVar8 = 0x87;
          if (inl != 0x10) {
            bVar8 = 0x1b;
          }
          *pCVar6 = (CMAC_CTX)(bVar5 ^ bVar8 & (char)CVar1 >> 7);
          CVar1 = ctx[8];
          bVar5 = (char)CVar1 << 1;
          if ((int)inl < 2) {
            uVar7 = 0;
          }
          else {
            uVar7 = (ulong)(inl - 1);
            pCVar6 = ctx + 0x28;
            uVar9 = uVar7;
            do {
              uVar9 = uVar9 - 1;
              CVar2 = (CMAC_CTX)(bVar5 | (byte)pCVar6[-0x1f] >> 7);
              bVar5 = (char)pCVar6[-0x1f] << 1;
              *pCVar6 = CVar2;
              pCVar6 = pCVar6 + 1;
            } while (uVar9 != 0);
          }
          ctx[uVar7 + 0x28] = (CMAC_CTX)(bVar5 ^ bVar8 & (char)CVar1 >> 7);
          OPENSSL_cleanse(out,(long)(int)inl);
          iVar3 = EVP_EncryptInit_ex(*(EVP_CIPHER_CTX **)ctx,(EVP_CIPHER *)0x0,(ENGINE *)0x0,
                                     (uchar *)0x0,"");
          if (iVar3 == 0) {
            return 0;
          }
          memset(out,0,(long)(int)inl);
          *(undefined4 *)(ctx + 0x88) = 0;
          return 1;
        }
      }
    }
  }
  return 0;
}

