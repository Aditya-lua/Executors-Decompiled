/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4ddd0
 */

int FUN_00a4ddd0(BIO *param_1,void *param_2,int param_3)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  int iVar4;
  _func_603 *addr;
  int iVar5;
  int iVar6;
  bio_st *pbVar7;
  
  if ((((param_2 == (void *)0x0) || (param_3 == 0)) ||
      (pbVar7 = param_1->prev_bio, pbVar7 == (bio_st *)0x0)) || (*(long *)&param_1->references == 0)
     ) {
    return 0;
  }
  BIO_clear_flags(param_1,0xf);
  iVar4 = *(int *)&pbVar7->cb_arg;
  iVar6 = 0;
  if (iVar4 != 0) goto LAB_00a4de44;
  do {
    iVar5 = *(int *)((long)&pbVar7->cb_arg + 4);
    while( true ) {
      uVar1 = param_3 + iVar5 + 0xfff;
      addr = pbVar7->callback;
      uVar2 = param_3 + iVar5 + 0x1ffe;
      if (-1 < (int)uVar1) {
        uVar2 = uVar1;
      }
      uVar2 = uVar2 & 0xfffff000;
      if (*(int *)&pbVar7->method < (int)uVar2) {
        addr = CRYPTO_realloc(addr,uVar2,"crypto/bio/bf_readbuff.c",0x61);
        if (addr == (_func_603 *)0x0) {
          return 0;
        }
        iVar5 = *(int *)((long)&pbVar7->cb_arg + 4);
        pbVar7->callback = addr;
        *(uint *)&pbVar7->method = uVar2;
      }
      iVar4 = BIO_read(*(BIO **)&param_1->references,addr + iVar5,param_3);
      if (iVar4 < 1) {
        BIO_copy_next_retry(param_1);
        if (-1 < iVar4) {
          return iVar6;
        }
        if (iVar6 < 1) {
          iVar6 = iVar4;
        }
        return iVar6;
      }
      *(int *)&pbVar7->cb_arg = iVar4;
      if (iVar4 == 0) break;
LAB_00a4de44:
      iVar3 = param_3;
      if (iVar4 <= param_3) {
        iVar3 = iVar4;
      }
      memcpy(param_2,pbVar7->callback + *(int *)((long)&pbVar7->cb_arg + 4),(long)iVar3);
      iVar6 = iVar3 + iVar6;
      iVar5 = *(int *)((long)&pbVar7->cb_arg + 4) + iVar3;
      *(int *)&pbVar7->cb_arg = *(int *)&pbVar7->cb_arg - iVar3;
      *(int *)((long)&pbVar7->cb_arg + 4) = iVar5;
      if (param_3 <= iVar4) {
        return iVar6;
      }
      param_3 = param_3 - iVar3;
      param_2 = (void *)((long)param_2 + (long)iVar3);
    }
  } while( true );
}

