
long FUN_00732918(undefined8 param_1,ulong param_2)

{
  long lVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  int in_w8;
  long lVar5;
  ulong uVar6;
  long unaff_x19;
  long *unaff_x20;
  int unaff_w25;
  long unaff_x29;
  undefined8 in_stack_00000000;
  uint in_stack_00000008;
  
  while( true ) {
    func_0x007733c8(param_1,param_2,(long)in_w8);
    func_0x0077355c();
    lVar3 = func_0x00740a58();
    if (lVar3 == 0) break;
    func_0x00733f28();
    lVar3 = func_0x00740a58();
    if (lVar3 == 0) break;
    func_0x00782d28();
    lVar3 = func_0x00782dc4();
    if (-1 < lVar3) break;
    func_0x00773540();
    iVar2 = func_0x00733ad4();
    if (iVar2 != 0) {
      func_0x0077355c();
      break;
    }
    param_2 = (ulong)in_stack_00000008;
    in_w8 = unaff_w25;
    if (-(int)lVar3 < 1000) {
      in_w8 = -(int)lVar3;
    }
    param_1 = in_stack_00000000;
  }
  lVar3 = func_0x00740a58();
  if (lVar3 != 0) {
    do {
      func_0x00156654(lVar3);
      func_0x0075e5fc(lVar3);
      func_0x0073391c();
      lVar3 = func_0x00740a58();
    } while (lVar3 != 0);
  }
  lVar3 = func_0x00740a58(unaff_x19 + 0x58);
  if (lVar3 != 0) {
    do {
      func_0x00156654(lVar3);
      func_0x0075e5fc(lVar3);
      func_0x0073391c();
      lVar3 = func_0x00740a58(unaff_x19 + 0x58);
    } while (lVar3 != 0);
  }
  func_0x00750144(*unaff_x20,*(undefined8 *)(*unaff_x20 + 0xc0));
  lVar3 = *unaff_x20;
  *(undefined8 *)(lVar3 + 0xd0) = 0;
  *(undefined8 *)(lVar3 + 0xe0) = 0;
  func_0x0078443c();
  lVar3 = func_0x0074dd44();
  *(undefined8 *)(unaff_x19 + 0x80) = 0;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return lVar3;
  }
  lVar3 = ___stack_chk_fail();
  if (lVar3 == 0) {
LAB_00732a7c:
    *(undefined8 *)(lVar3 + 8) = 0;
    *(undefined8 *)(lVar3 + 0xc00) = 0xffffffffffffffff;
    return lVar3;
  }
  lVar5 = *(long *)(lVar3 + 0xe0);
  if ((lVar5 == 0) || ((*(byte *)(lVar5 + 4) >> 5 & 1) == 0)) {
    lVar5 = *(long *)(lVar3 + 0xd8);
    if ((lVar5 == 0) && (lVar5 = *(long *)(lVar3 + 0xd0), lVar5 == 0)) goto LAB_00732a7c;
    lVar1 = lVar5 + 0x188;
    lVar5 = *(long *)(lVar5 + 0x210);
  }
  else {
    lVar1 = lVar5 + 0x28;
    lVar5 = *(long *)(lVar5 + 0xb0);
  }
  lVar4 = lVar3;
  if ((lVar5 != 0) && ((*(byte *)(lVar5 + 4) >> 5 & 1) != 0)) {
    lVar4 = func_0x00779cfc(*(undefined8 *)(lVar1 + 0x78),5,2);
  }
  *(byte *)(lVar1 + 0x98) = *(byte *)(lVar1 + 0x98) | 1;
  lVar5 = *(long *)(lVar1 + 0x40);
  *(long *)(lVar1 + 0x40) = lVar5 + 1;
  *(long *)(lVar3 + 8) = lVar5;
  if (lVar5 < 0) {
    *(undefined8 *)(lVar1 + 0x40) = 0;
  }
  *(undefined8 *)(lVar3 + 0xc00) = 0xffffffffffffffff;
  lVar5 = *(long *)(lVar1 + 0x78);
  *(undefined4 *)(lVar5 + 0x998) = *(undefined4 *)(lVar3 + 0x998);
  *(undefined4 *)(lVar5 + 0x9a4) = *(undefined4 *)(lVar3 + 0x9a4);
  uVar6 = *(ulong *)(lVar5 + 0xa1a);
  *(ulong *)(lVar5 + 0xa1a) =
       uVar6 & 0xfffffff800000000 | uVar6 & 0x3ffffffff | *(ulong *)(lVar3 + 0xa1a) & 0x400000000;
  *(byte *)(lVar1 + 0x98) = *(byte *)(lVar1 + 0x98) & 0xfe;
  if ((*(long *)(lVar1 + 0x88) == 0) || ((*(byte *)(*(long *)(lVar1 + 0x88) + 4) >> 5 & 1) == 0)) {
    return lVar4;
  }
  lVar3 = *(long *)(*(long *)(lVar1 + 0x78) + 0xe0);
  if (lVar3 == 0) {
    return 3;
  }
  if (((*(uint *)(lVar3 + 4) >> 5 & 1) != 0) && (*(code **)(lVar3 + 0x18) != (code *)0x0)) {
    (**(code **)(lVar3 + 0x18))(*(long *)(lVar1 + 0x78),5,*(undefined8 *)(lVar3 + 0x20));
  }
  return 0;
}

