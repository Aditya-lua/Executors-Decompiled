
void FUN_005ffb0c(long param_1)

{
  ulong uVar1;
  long lVar2;
  long in_x9;
  ulong unaff_x19;
  long unaff_x20;
  ulong uVar3;
  long lVar4;
  ulong uVar5;
  
  uVar3 = (ulong)*(uint *)(in_x9 + param_1 * 4);
  uVar5 = *(ulong *)(unaff_x20 + 0x18);
  if (uVar3 <= uVar5) goto code_r0x005ffc40;
  lVar4 = *(long *)(unaff_x20 + 0x20);
  func_0x006108a0(uVar3);
  lVar2 = func_0x006115d0(uVar3 << 3);
  if ((lVar4 == 0) || (lVar2 == 0)) {
    if (lVar4 != 0) goto code_r0x005ffc08;
  }
  else {
    uVar1 = uVar3;
    if (uVar5 <= uVar3) {
      uVar1 = uVar5;
    }
    _memcpy(lVar2,lVar4,uVar1 << 3);
code_r0x005ffc08:
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(lVar4 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644(lVar4);
  }
  *(long *)(unaff_x20 + 0x20) = lVar2;
  _bzero(lVar2 + *(long *)(unaff_x20 + 0x18) * 8,(uVar3 - *(long *)(unaff_x20 + 0x18)) * 8);
  *(ulong *)(unaff_x20 + 0x18) = uVar3;
code_r0x005ffc40:
  *(undefined8 *)(unaff_x20 + 0x10) = 0x1fffffffffffffff;
  uVar5 = unaff_x19 >> 3 & 0x1ffffffffffffff8;
  *(ulong *)(*(long *)(unaff_x20 + 0x20) + uVar5) =
       *(ulong *)(*(long *)(unaff_x20 + 0x20) + uVar5) | 1L << (unaff_x19 & 0x3f);
  return;
}

