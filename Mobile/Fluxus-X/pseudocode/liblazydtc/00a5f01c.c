/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f01c
 */

int EVP_Cipher(EVP_CIPHER_CTX *c,uchar *out,uchar *in,uint inl)

{
  long lVar1;
  int iVar2;
  long lVar3;
  EVP_CIPHER *pEVar4;
  undefined8 local_18;
  
  pEVar4 = c->cipher;
  if (pEVar4[1].do_cipher == (_func_1090 *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00a5f080. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    iVar2 = (*pEVar4->cleanup)(c);
    return iVar2;
  }
  local_18 = 0;
  iVar2 = pEVar4->block_size;
  lVar3 = (long)iVar2;
  if (*(code **)&pEVar4[2].key_len == (code *)0x0) {
    if (in == (uchar *)0x0) {
      lVar1 = 0;
      if (iVar2 != 1) {
        lVar1 = lVar3;
      }
      local_18._0_4_ = (**(code **)(pEVar4 + 2))(c[1].cipher,out,&local_18,lVar1);
    }
    else {
      lVar1 = 0;
      if (iVar2 != 1) {
        lVar1 = lVar3;
      }
      local_18._0_4_ = (*pEVar4[1].app_data)(c[1].cipher,out,&local_18,lVar1 + (ulong)inl);
    }
  }
  else {
    lVar1 = 0;
    if (iVar2 != 1) {
      lVar1 = lVar3;
    }
    iVar2 = (**(code **)&pEVar4[2].key_len)(c[1].cipher,out,&local_18,lVar1 + (ulong)inl);
    if (iVar2 == 0) {
      local_18._0_4_ = -1;
    }
  }
  return (int)local_18;
}

