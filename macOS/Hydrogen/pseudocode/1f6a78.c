
void thunk_FUN_001f6ad0(undefined8 param_1,long *param_2)

{
  long lVar1;
  uint unaff_w19;
  
  lVar1 = param_2[2];
  if ((ulong)(*param_2 - lVar1) < 2) {
    func_0x0079b61c(param_2,lVar1,2,1,1);
    lVar1 = param_2[2];
  }
  *(ushort *)(param_2[1] + lVar1) =
       (ushort)(unaff_w19 >> 8) & 0xff | (ushort)((unaff_w19 & 0xff00ff) << 8);
  param_2[2] = lVar1 + 2;
  return;
}

