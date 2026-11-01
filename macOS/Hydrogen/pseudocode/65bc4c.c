
void FUN_0065bc4c(int param_1)

{
  ulong uVar1;
  int iVar2;
  ulong uVar3;
  long lVar4;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long lVar5;
  long unaff_x22;
  ulong unaff_x23;
  long unaff_x26;
  ulong unaff_x27;
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000018;
  undefined1 uStack0000000000000038;
  undefined1 in_stack_00000058;
  undefined1 uStack0000000000000060;
  
  if (-1 < param_1) {
    unaff_x23 = unaff_x27;
  }
  iVar2 = func_0x00609ec8(unaff_x21 + 0x50,unaff_x22 + 0x50);
  if (-1 < iVar2) {
    func_0x00650c94(&uStack0000000000000010);
    do {
      lVar5 = unaff_x21;
      func_0x00677180(unaff_x22 + 8,lVar5 + 8);
      func_0x00677180(unaff_x22 + 0x28,lVar5 + 0x28);
      *(undefined1 *)(unaff_x22 + 0x48) = *(undefined1 *)(lVar5 + 0x48);
      func_0x005ffccc(unaff_x22 + 0x50,lVar5 + 0x50);
      if (unaff_x26 < (long)unaff_x23) break;
      lVar4 = unaff_x23 * 2;
      unaff_x23 = unaff_x23 << 1 | 1;
      unaff_x21 = unaff_x20 + unaff_x23 * 0x80;
      uVar1 = lVar4 + 2;
      if ((long)uVar1 < unaff_x19) {
        uVar3 = func_0x00609ec8(unaff_x21 + 0x50,unaff_x21 + 0xd0);
        unaff_x21 = unaff_x21 + (uVar3 >> 0x1f & 1) * 0x80;
        if (-1 < (int)uVar3) {
          uVar1 = unaff_x23;
        }
        unaff_x23 = uVar1;
      }
      iVar2 = func_0x00609ec8(unaff_x21 + 0x50,&uStack0000000000000060);
      unaff_x22 = lVar5;
    } while (-1 < iVar2);
    func_0x00677180(lVar5 + 8,&uStack0000000000000018);
    func_0x00677180(lVar5 + 0x28,&uStack0000000000000038);
    *(undefined1 *)(lVar5 + 0x48) = in_stack_00000058;
    func_0x005ffccc(lVar5 + 0x50,&uStack0000000000000060);
    func_0x00650db0(&uStack0000000000000010);
  }
  return;
}

