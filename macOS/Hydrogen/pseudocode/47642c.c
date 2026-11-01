
void FUN_0047642c(long param_1,uint param_2,undefined8 param_3,undefined8 param_4)

{
  uint uVar1;
  long lVar2;
  long unaff_x29;
  
  uVar1 = (param_2 >> 2 & 0x3fff) / 0x19;
  lVar2 = 3;
  *(undefined2 *)(unaff_x29 + -2) =
       *(undefined2 *)(param_1 + ((ulong)(param_2 + uVar1 * -100) & 0xffff) * 2);
  if (((param_2 & 0xffff) == 0) || (uVar1 != 0)) {
    lVar2 = 2;
    *(undefined1 *)(unaff_x29 + -3) = *(undefined1 *)(param_1 + (ulong)((uVar1 & 0xf) << 1) + 1);
  }
  func_0x00468684(param_4,param_3,1,0,unaff_x29 + -5 + lVar2,5 - lVar2);
  return;
}

