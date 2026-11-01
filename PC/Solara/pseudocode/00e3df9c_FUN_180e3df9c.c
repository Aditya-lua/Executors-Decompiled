bool FUN_180e3df9c(longlong *param_1)

{
  bool bVar1;
  int iVar2;
  longlong lVar3;
  longlong lStackX_8;
  longlong alStackX_10 [3];
  
  if ((*(uint *)((longlong)param_1 + 0x14) >> 3 & 1) == 0) {
    if ((((*(uint *)((longlong)param_1 + 0x14) & 0xc0) == 0) || (*param_1 != param_1[1])) &&
       (lVar3 = FUN_180e433cc((int)param_1[3]), lVar3 != -1)) {
      alStackX_10[0] = 0;
      iVar2 = SetFilePointerEx(lVar3,0,alStackX_10,1);
      if (iVar2 != 0) {
        lStackX_8 = 0;
        iVar2 = GetFileSizeEx(lVar3,&lStackX_8);
        if (iVar2 != 0) {
          return alStackX_10[0] == lStackX_8;
        }
      }
    }
    bVar1 = false;
  }
  else {
    bVar1 = true;
  }
  return bVar1;
}


