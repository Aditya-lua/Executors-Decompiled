/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf0cc
 */

long ossl_bsearch(undefined8 param_1,long param_2,int param_3,int param_4,code *param_5,uint param_6
                 )

{
  int iVar1;
  int iVar2;
  long lVar3;
  bool bVar4;
  long lVar5;
  int iVar6;
  int iVar7;
  
  if (param_3 == 0) {
    lVar5 = 0;
  }
  else {
    if (param_3 < 1) {
      lVar5 = 0;
      iVar6 = 0;
joined_r0x00aaf180:
      bVar4 = false;
    }
    else {
      iVar7 = 0;
      do {
        iVar6 = param_3 + iVar7;
        if (iVar6 < 0) {
          iVar6 = iVar6 + 1;
        }
        iVar6 = iVar6 >> 1;
        lVar5 = param_2 + iVar6 * param_4;
        iVar1 = (*param_5)(param_1,lVar5);
        iVar2 = iVar6;
        if (-1 < iVar1) {
          if (iVar1 == 0) goto joined_r0x00aaf180;
          iVar7 = iVar6 + 1;
          iVar2 = param_3;
        }
        param_3 = iVar2;
      } while (iVar7 < param_3);
      if ((param_6 & 1) == 0) {
        return 0;
      }
      bVar4 = true;
    }
    if (((param_6 >> 1 & 1) != 0) && (!bVar4)) {
      lVar5 = (long)iVar6 + 1;
      lVar3 = param_2 + ((long)iVar6 + -1) * (long)param_4;
      iVar6 = iVar6 * param_4;
      do {
        iVar7 = iVar6;
        lVar5 = lVar5 + -1;
        if (lVar5 < 1) break;
        iVar2 = (*param_5)(param_1,lVar3);
        lVar3 = lVar3 - param_4;
        iVar6 = iVar7 - param_4;
      } while (iVar2 == 0);
      lVar5 = param_2 + iVar7;
    }
  }
  return lVar5;
}

