
undefined2 * FUN_006f49a0(void)

{
  ulong uVar1;
  bool in_NG;
  char in_OV;
  undefined2 *puVar2;
  ulong uVar3;
  uint in_w8;
  int iVar4;
  undefined1 *in_x9;
  ulong uVar5;
  undefined1 in_w10;
  undefined1 uVar6;
  int in_w12;
  long unaff_x29;
  
  *in_x9 = in_w10;
  uVar6 = 0x2d;
  if (in_NG == (bool)in_OV) {
    uVar6 = 0x2b;
  }
  in_x9[1] = uVar6;
  if (in_NG) {
    in_w8 = 1 - in_w12;
  }
  if (in_w8 < 100) {
    puVar2 = (undefined2 *)(in_x9 + 2);
  }
  else {
    puVar2 = (undefined2 *)(in_x9 + 3);
    in_x9[2] = (char)(in_w8 / 100) + '0';
    in_w8 = in_w8 % 100;
  }
  *puVar2 = *(undefined2 *)
             (
             "00010203040506070809101112131415161718192021222324252627282930313233343536373839404142434445464748495051525354555657585960616263646566676869707172737475767778798081828384858687888990919293949596979899"
             + (ulong)in_w8 * 2);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -8)) {
    return puVar2 + 1;
  }
  uVar3 = ___stack_chk_fail(puVar2 + 1);
  iVar4 = -1;
  if (0xff < (uint)uVar3) {
    uVar5 = uVar3;
    do {
      iVar4 = iVar4 + 8;
      uVar3 = uVar5 >> 8 & 0xffffff;
      uVar1 = uVar5 & 0xffff0000;
      uVar5 = uVar3;
    } while (uVar1 != 0);
  }
  return (undefined2 *)(ulong)(iVar4 + (uint)(byte)(&UNK_008c81d2)[uVar3 & 0xffffffff]);
}

