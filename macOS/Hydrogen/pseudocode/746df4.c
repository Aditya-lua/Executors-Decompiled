
undefined8 FUN_00746df4(void)

{
  undefined4 uVar1;
  undefined8 uVar2;
  char in_w8;
  long lVar3;
  long in_x9;
  long in_x10;
  long unaff_x20;
  undefined8 uStack0000000000000000;
  
  uVar1 = *(undefined4 *)(&UNK_008cd23c + in_x9);
  lVar3 = *(long *)(&UNK_008cd248 + (long)in_w8 * 8);
  *(undefined4 *)(unaff_x20 + 0x4ec) = *(undefined4 *)(in_x10 + in_x9);
  *(undefined4 *)(unaff_x20 + 0x4e8) = uVar1;
  uStack0000000000000000 = *(undefined8 *)(&UNK_00a1e688 + lVar3 * 8);
  uVar2 = func_0x0076e34c();
  if ((int)uVar2 == 0) {
    func_0x007466c4();
  }
  return uVar2;
}

