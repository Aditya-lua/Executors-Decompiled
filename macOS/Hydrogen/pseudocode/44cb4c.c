
undefined1  [16] FUN_0044cb4c(ulong param_1)

{
  long lVar1;
  undefined1 auVar2 [16];
  
  lVar1 = (param_1 & 0xffff) * 8;
  auVar2._8_8_ = *(undefined8 *)(&UNK_0088f0a0 + lVar1);
  auVar2._0_8_ = *(undefined8 *)(&UNK_009ddd28 + lVar1);
  return auVar2;
}

