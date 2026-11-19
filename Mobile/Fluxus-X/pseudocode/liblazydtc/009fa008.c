/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fa008
 */

int FUN_009fa008(BIO *param_1,undefined1 *param_2,int param_3)

{
  int iVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  bool bVar5;
  _func_603 *p_Var6;
  int iVar7;
  bio_st *pbVar8;
  
  pbVar8 = param_1->prev_bio;
  param_3 = param_3 + -1;
  BIO_clear_flags(param_1,0xf);
  iVar2 = *(int *)&pbVar8->cb_arg;
  iVar7 = 0;
  do {
    while (iVar2 < 1) {
      iVar2 = BIO_read(*(BIO **)&param_1->references,pbVar8->callback,*(int *)&pbVar8->method);
      if (iVar2 < 1) {
        BIO_copy_next_retry(param_1);
        *param_2 = 0;
        if (-1 < iVar2) {
          return iVar7;
        }
        if (iVar7 < 1) {
          iVar7 = iVar2;
        }
        return iVar7;
      }
      *(int *)&pbVar8->cb_arg = iVar2;
      *(undefined4 *)((long)&pbVar8->cb_arg + 4) = 0;
    }
    if (param_3 < 1) {
      lVar4 = 0;
    }
    else {
      p_Var6 = pbVar8->callback;
      iVar3 = *(int *)((long)&pbVar8->cb_arg + 4);
      lVar4 = 0;
      do {
        param_2[lVar4] = p_Var6[lVar4 + iVar3];
        if (p_Var6[lVar4 + iVar3] == (_func_603)0xa) {
          iVar2 = *(int *)&pbVar8->cb_arg;
          iVar3 = (int)lVar4 + 1;
          param_2 = param_2 + lVar4 + 1;
          bVar5 = true;
          goto LAB_009fa0e8;
        }
        iVar2 = *(int *)&pbVar8->cb_arg;
        lVar4 = lVar4 + 1;
      } while ((lVar4 < param_3) && (lVar4 < iVar2));
      param_2 = param_2 + lVar4;
    }
    iVar3 = (int)lVar4;
    bVar5 = false;
LAB_009fa0e8:
    iVar1 = *(int *)((long)&pbVar8->cb_arg + 4);
    iVar7 = iVar3 + iVar7;
    iVar2 = iVar2 - iVar3;
    *(int *)&pbVar8->cb_arg = iVar2;
    *(int *)((long)&pbVar8->cb_arg + 4) = iVar1 + iVar3;
    if ((bVar5) || (param_3 = param_3 - iVar3, param_3 == 0)) {
      *param_2 = 0;
      return iVar7;
    }
  } while( true );
}

