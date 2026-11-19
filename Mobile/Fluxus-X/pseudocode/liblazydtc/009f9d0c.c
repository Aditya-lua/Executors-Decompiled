/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f9d0c
 */

int FUN_009f9d0c(BIO *param_1,void *param_2,int param_3)

{
  int iVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  bio_st *pbVar5;
  int iVar6;
  
  iVar4 = 0;
  if ((param_2 != (void *)0x0) && (0 < param_3)) {
    pbVar5 = param_1->prev_bio;
    if ((pbVar5 == (bio_st *)0x0) || (*(long *)&param_1->references == 0)) {
      iVar4 = 0;
    }
    else {
      BIO_clear_flags(param_1,0xf);
      iVar1 = pbVar5->flags;
      iVar2 = pbVar5->retry_reason;
      iVar3 = iVar2 + iVar1;
      iVar6 = *(int *)((long)&pbVar5->method + 4) - iVar3;
      if (iVar6 < param_3) {
        iVar4 = 0;
        do {
          if (iVar1 != 0) {
            if (0 < iVar6) {
              memcpy((void *)(*(long *)&pbVar5->init + (long)iVar3),param_2,(long)iVar6);
              iVar2 = pbVar5->retry_reason;
              param_2 = (void *)((long)param_2 + (long)iVar6);
              param_3 = param_3 - iVar6;
              iVar4 = iVar6 + iVar4;
              iVar1 = pbVar5->flags + iVar6;
              pbVar5->flags = iVar1;
            }
            do {
              iVar1 = BIO_write(*(BIO **)&param_1->references,
                                (void *)(*(long *)&pbVar5->init + (long)iVar2),iVar1);
              if (iVar1 < 1) goto LAB_009f9e70;
              iVar2 = pbVar5->retry_reason + iVar1;
              iVar1 = pbVar5->flags - iVar1;
              pbVar5->flags = iVar1;
              pbVar5->retry_reason = iVar2;
            } while (iVar1 != 0);
          }
          pbVar5->retry_reason = 0;
          while (iVar6 = *(int *)((long)&pbVar5->method + 4), iVar6 <= param_3) {
            iVar1 = BIO_write(*(BIO **)&param_1->references,param_2,param_3);
            if (iVar1 < 1) {
LAB_009f9e70:
              BIO_copy_next_retry(param_1);
              if (-1 < iVar1) {
                return iVar4;
              }
              if (iVar4 < 1) {
                iVar4 = iVar1;
              }
              return iVar4;
            }
            iVar4 = iVar1 + iVar4;
            param_3 = param_3 - iVar1;
            param_2 = (void *)((long)param_2 + (long)iVar1);
            if (param_3 == 0) {
              return iVar4;
            }
          }
          iVar1 = pbVar5->flags;
          iVar2 = pbVar5->retry_reason;
          iVar3 = iVar2 + iVar1;
          iVar6 = iVar6 - iVar3;
        } while (iVar6 < param_3);
      }
      else {
        iVar4 = 0;
      }
      memcpy((void *)(*(long *)&pbVar5->init + (long)iVar3),param_2,(long)param_3);
      iVar4 = iVar4 + param_3;
      pbVar5->flags = pbVar5->flags + param_3;
    }
  }
  return iVar4;
}

