/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b53d1c
 */

int CMAC_Update(CMAC_CTX *ctx,void *data,size_t dlen)

{
  size_t __n;
  uint inl;
  int iVar1;
  ulong uVar2;
  
  if (*(int *)(ctx + 0x88) == -1) {
LAB_00b53e18:
    iVar1 = 0;
  }
  else {
    if (dlen != 0) {
      inl = EVP_CIPHER_CTX_get_block_size(*(undefined8 *)ctx);
      if ((int)inl < 0) goto LAB_00b53e18;
      iVar1 = *(int *)(ctx + 0x88);
      if (0 < iVar1) {
        __n = dlen;
        if ((ulong)(long)(int)(inl - iVar1) <= dlen) {
          __n = (long)(int)(inl - iVar1);
        }
        memcpy(ctx + (long)iVar1 + 0x68,data,__n);
        dlen = dlen - __n;
        *(int *)(ctx + 0x88) = *(int *)(ctx + 0x88) + (int)__n;
        if (dlen == 0) goto LAB_00b53e10;
        iVar1 = EVP_Cipher(*(EVP_CIPHER_CTX **)ctx,(uchar *)(ctx + 0x48),(uchar *)(ctx + 0x68),inl);
        if (iVar1 < 1) goto LAB_00b53e18;
        data = (void *)((long)data + __n);
      }
      uVar2 = (ulong)(int)inl;
      if (uVar2 < dlen) {
        do {
          iVar1 = EVP_Cipher(*(EVP_CIPHER_CTX **)ctx,(uchar *)(ctx + 0x48),data,inl);
          if (iVar1 < 1) goto LAB_00b53e18;
          dlen = dlen - uVar2;
          data = (void *)((long)data + uVar2);
        } while (uVar2 < dlen);
      }
      memcpy(ctx + 0x68,data,dlen);
      *(int *)(ctx + 0x88) = (int)dlen;
    }
LAB_00b53e10:
    iVar1 = 1;
  }
  return iVar1;
}

