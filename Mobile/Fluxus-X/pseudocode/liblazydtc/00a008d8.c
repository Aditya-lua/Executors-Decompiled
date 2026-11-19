/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a008d8
 */

int FUN_00a008d8(BIO *param_1,void *param_2,int param_3)

{
  BIO_METHOD *pBVar1;
  _func_603 *p_Var2;
  int iVar3;
  char *__dest;
  char *__src;
  bio_st *pbVar4;
  bio_st *pbVar5;
  int iVar6;
  undefined8 uVar7;
  _func_595 *p_Var8;
  
  if ((*(byte *)((long)&param_1->ptr + 1) >> 1 & 1) == 0) {
    pbVar5 = param_1->prev_bio;
    BIO_clear_flags(param_1,0xf);
    if (param_3 == 0) {
      return 0;
    }
    if (param_2 != (void *)0x0) {
      uVar7 = *(undefined8 *)pbVar5->callback;
      if ((param_1->num != 0) && (pbVar4 = param_1->prev_bio, pbVar4 != (bio_st *)0x0)) {
        __src = *(char **)(pbVar4->callback + 8);
        __dest = pbVar4->method->name;
        if (__src != __dest) {
          memmove(__dest,__src,*(size_t *)pbVar4->callback);
          pBVar1 = pbVar4->method;
          p_Var2 = pbVar4->callback;
          *(undefined8 *)pBVar1 = *(undefined8 *)p_Var2;
          *(char **)(p_Var2 + 8) = pBVar1->name;
        }
      }
      iVar6 = (int)uVar7;
      iVar3 = BUF_MEM_grow_clean((BUF_MEM *)pbVar5->method,(long)(iVar6 + param_3));
      if (iVar3 == 0) {
        return -1;
      }
      memcpy(pbVar5->method->name + iVar6,param_2,(long)param_3);
      pBVar1 = pbVar5->method;
      p_Var2 = pbVar5->callback;
      p_Var8 = pBVar1->bwrite;
      *(_func_596 **)(p_Var2 + 0x18) = pBVar1->bread;
      *(_func_595 **)(p_Var2 + 0x10) = p_Var8;
      uVar7 = *(undefined8 *)pBVar1;
      *(char **)(p_Var2 + 8) = pBVar1->name;
      *(undefined8 *)p_Var2 = uVar7;
      return param_3;
    }
    ERR_new();
    ERR_set_debug("crypto/bio/bss_mem.c",0xe4,"mem_write");
    uVar7 = 0xc0102;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/bio/bss_mem.c",0xdd,"mem_write");
    uVar7 = 0x7e;
  }
  ERR_set_error(0x20,uVar7,0);
  return -1;
}

