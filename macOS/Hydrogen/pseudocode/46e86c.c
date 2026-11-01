
ulong FUN_0046e86c(code *param_1)

{
  int iVar1;
  ulong unaff_x19;
  ushort unaff_w22;
  long unaff_x24;
  ushort unaff_w25;
  
  for (; (iVar1 = (*param_1)(), iVar1 == 0 &&
         (unaff_x19 = (ulong)(unaff_w25 < unaff_w22), unaff_w25 < unaff_w22));
      unaff_w25 = unaff_w25 + 1) {
    param_1 = *(code **)(unaff_x24 + 0x20);
  }
  return unaff_x19;
}

