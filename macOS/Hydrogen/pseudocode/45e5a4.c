
ulong FUN_0045e5a4(undefined8 param_1,undefined8 param_2,long param_3)

{
  unkbyte10 Var1;
  undefined1 uStack0000000000000008;
  undefined8 in_stack_00000010;
  
  func_0x007a247c(param_1,0x1d,param_3 + 0xac0);
  in_stack_00000010 = 0;
  Var1 = func_0x007a2708(0,&uStack0000000000000008);
  return (long)((int)(short)((unkuint10)Var1 >> 0x40) - (int)LZCOUNT((long)Var1 + -1)) * 0x4d104d42
         + 0x1344135080U >> 0x20;
}

