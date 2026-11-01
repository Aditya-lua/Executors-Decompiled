
void FUN_001a6a34(undefined8 param_1,long param_2)

{
  long lVar1;
  long lVar2;
  long *unaff_x19;
  ulong unaff_x20;
  ulong unaff_x21;
  ulong *unaff_x23;
  long unaff_x24;
  
  while( true ) {
    lVar1 = *unaff_x19;
    if ((ulong)(lVar1 - param_2) < 2) {
      func_0x0079b61c();
      param_2 = unaff_x19[2];
      lVar1 = *unaff_x19;
    }
    lVar2 = unaff_x19[1];
    *(ushort *)(lVar2 + param_2) =
         (ushort)(unaff_x20 >> 8) & 0xff | (ushort)(((uint)unaff_x20 & 0xff00ff) << 8);
    param_2 = param_2 + 2;
    unaff_x19[2] = param_2;
    if ((ulong)(lVar1 - param_2) < unaff_x20) {
      func_0x0079b61c();
      lVar2 = unaff_x19[1];
      param_2 = unaff_x19[2];
    }
    _memcpy(lVar2 + param_2,unaff_x21,unaff_x20);
    param_2 = param_2 + unaff_x20;
    unaff_x19[2] = param_2;
    unaff_x24 = unaff_x24 + -0x18;
    if (unaff_x24 == 0) break;
    unaff_x21 = unaff_x23[2];
    unaff_x20 = unaff_x23[3];
    unaff_x23 = unaff_x23 + 3;
  }
  func_0x0024031c();
  return;
}

