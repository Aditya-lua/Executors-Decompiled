
void FUN_0040bcf8(ulong param_1,long param_2,ulong param_3)

{
  ulong uVar1;
  long in_x9;
  undefined1 auVar2 [16];
  undefined8 uStack_18;
  
  uVar1 = (param_1 & 0xaaaaaaaaaaaaaaaa) >> 1 | (param_1 & 0x5555555555555555) << 1;
  uVar1 = (uVar1 & 0xcccccccccccccccc) >> 2 | (uVar1 & 0x3333333333333333) << 2;
  uVar1 = (uVar1 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar1 & 0xf0f0f0f0f0f0f0f) << 4;
  uVar1 = (uVar1 & 0xff00ff00ff00ff00) >> 8 | (uVar1 & 0xff00ff00ff00ff) << 8;
  uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
  uVar1 = (in_x9 + ((ulong)LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) >> 2) + 0x20) - param_2;
  if (param_3 < uVar1) {
    auVar2 = func_0x007a28b0(uVar1,param_3,&UNK_009d9a38);
    uStack_18 = auVar2._0_8_;
    func_0x004699b0(auVar2._8_8_,&UNK_00885896,0xf,&uStack_18,&UNK_009d99e8);
    return;
  }
  return;
}

