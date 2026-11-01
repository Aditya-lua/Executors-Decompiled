
void FUN_006211d8(void)

{
  ulong uVar1;
  long lVar2;
  long unaff_x19;
  ulong uVar3;
  long lVar4;
  ulong uVar5;
  
  *(undefined1 *)(unaff_x19 + 0x6d) = 1;
  *(int *)(unaff_x19 + 0x68) =
       (1 << (ulong)(*(uint *)(unaff_x19 + 0x60) & 0x1f)) - *(int *)(unaff_x19 + 0x68);
  uVar3 = *(ulong *)(unaff_x19 + 0x48);
  uVar5 = *(ulong *)(unaff_x19 + 0x18);
  if (uVar3 <= uVar5) goto code_r0x00603204;
  lVar4 = *(long *)(unaff_x19 + 0x20);
  func_0x006108a0(uVar3);
  lVar2 = func_0x006115d0(uVar3 << 3);
  if (lVar4 == 0 || lVar2 == 0) {
    if (lVar4 != 0) goto joined_r0x006031cc;
  }
  else {
    uVar1 = uVar3;
    if (uVar5 <= uVar3) {
      uVar1 = uVar5;
    }
    _memcpy(lVar2,lVar4,uVar1 << 3);
joined_r0x006031cc:
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(lVar4 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644(lVar4);
  }
  *(long *)(unaff_x19 + 0x20) = lVar2;
  _bzero(lVar2 + *(long *)(unaff_x19 + 0x18) * 8,(uVar3 - *(long *)(unaff_x19 + 0x18)) * 8);
  *(ulong *)(unaff_x19 + 0x18) = uVar3;
code_r0x00603204:
  *(undefined8 *)(unaff_x19 + 0x10) = 0x1fffffffffffffff;
  if (*(int *)(unaff_x19 + 0x28) == 1) {
    if (*(int *)(unaff_x19 + 0x58) == 1) {
      func_0x00606b04();
      *(undefined4 *)(unaff_x19 + 0x28) = 1;
      return;
    }
  }
  else if (*(int *)(unaff_x19 + 0x58) != 1) {
    func_0x00606b04();
    return;
  }
  func_0x00606e54();
  return;
}

