/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a00824
 */

BIO * BIO_new_mem_buf(void *buf,int len)

{
  BIO *pBVar1;
  bio_st *pbVar2;
  _func_603 *p_Var3;
  BIO_METHOD *pBVar4;
  _func_595 *p_Var5;
  size_t sVar6;
  
  if (buf == (void *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/bio/bss_mem.c",0x5a,"BIO_new_mem_buf");
    ERR_set_error(0x20,0xc0102,0);
    pBVar1 = (BIO *)0x0;
  }
  else {
    if (len < 0) {
      p_Var5 = (_func_595 *)strlen(buf);
    }
    else {
      p_Var5 = (_func_595 *)(long)len;
    }
    pBVar1 = BIO_new((BIO_METHOD *)&DAT_00c59548);
    if (pBVar1 != (BIO *)0x0) {
      pbVar2 = pBVar1->prev_bio;
      pBVar4 = pbVar2->method;
      *(_func_595 **)pBVar4 = p_Var5;
      pBVar4->name = buf;
      pBVar4->bwrite = p_Var5;
      p_Var3 = pbVar2->callback;
      p_Var5 = pBVar4->bwrite;
      *(_func_596 **)(p_Var3 + 0x18) = pBVar4->bread;
      *(_func_595 **)(p_Var3 + 0x10) = p_Var5;
      sVar6 = *(size_t *)pBVar4;
      *(char **)(p_Var3 + 8) = pBVar4->name;
      *(size_t *)p_Var3 = sVar6;
      *(undefined4 *)&pBVar1->next_bio = 0;
      *(uint *)&pBVar1->ptr = *(uint *)&pBVar1->ptr | 0x200;
    }
  }
  return pBVar1;
}

