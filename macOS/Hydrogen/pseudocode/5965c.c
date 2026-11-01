
undefined8 FUN_0005965c(void)

{
  long lVar1;
  long unaff_x20;
  long *unaff_x21;
  
  lVar1 = *(long *)(unaff_x20 + 0x20);
  *unaff_x21 = lVar1;
  unaff_x21[1] = unaff_x20 + 0x20;
  *(long **)(lVar1 + 8) = unaff_x21;
  *(long **)(unaff_x20 + 0x20) = unaff_x21;
  *(long *)(unaff_x20 + 0x30) = *(long *)(unaff_x20 + 0x30) + 1;
  __ZNSt3__15mutex6unlockEv();
  __ZNSt3__118condition_variable10notify_oneEv(unaff_x20 + 0x48);
  return 1;
}

