/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f9ea0
 */

int FUN_009f9ea0(BIO *param_1,void *param_2,int param_3)

{
  int iVar1;
  int iVar2;
  int iVar3;
  BIO *b;
  int iVar4;
  bio_st *pbVar5;
  
  if (((param_2 == (void *)0x0) || (pbVar5 = param_1->prev_bio, pbVar5 == (bio_st *)0x0)) ||
     (*(long *)&param_1->references == 0)) {
    return 0;
  }
  BIO_clear_flags(param_1,0xf);
  iVar3 = *(int *)&pbVar5->cb_arg;
  iVar4 = 0;
  while( true ) {
    if (iVar3 != 0) {
      iVar1 = param_3;
      if (iVar3 <= param_3) {
        iVar1 = iVar3;
      }
      memcpy(param_2,pbVar5->callback + *(int *)((long)&pbVar5->cb_arg + 4),(long)iVar1);
      iVar2 = *(int *)((long)&pbVar5->cb_arg + 4);
      iVar4 = iVar1 + iVar4;
      *(int *)&pbVar5->cb_arg = *(int *)&pbVar5->cb_arg - iVar1;
      *(int *)((long)&pbVar5->cb_arg + 4) = iVar2 + iVar1;
      if (param_3 <= iVar3) {
        return iVar4;
      }
      param_3 = param_3 - iVar1;
      param_2 = (void *)((long)param_2 + (long)iVar1);
    }
    b = *(BIO **)&param_1->references;
    if (*(int *)&pbVar5->method < param_3) goto LAB_009f9f74;
    iVar3 = BIO_read(b,pbVar5->callback,*(int *)&pbVar5->method);
    if (iVar3 < 1) break;
    *(int *)&pbVar5->cb_arg = iVar3;
    *(undefined4 *)((long)&pbVar5->cb_arg + 4) = 0;
  }
LAB_009f9fbc:
  BIO_copy_next_retry(param_1);
  if ((iVar3 < 0) && (iVar4 < 1)) {
    iVar4 = iVar3;
  }
  return iVar4;
LAB_009f9f74:
  while (iVar3 = BIO_read(b,param_2,param_3), 0 < iVar3) {
    param_3 = param_3 - iVar3;
    iVar4 = iVar3 + iVar4;
    if (param_3 == 0) {
      return iVar4;
    }
    b = *(BIO **)&param_1->references;
    param_2 = (void *)((long)param_2 + (long)iVar3);
  }
  goto LAB_009f9fbc;
}

