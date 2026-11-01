
undefined8 FUN_006dd7ac(void)

{
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  long unaff_x19;
  long unaff_x20;
  
  (**(code **)**(undefined8 **)(unaff_x19 + 0x28))();
  if (*(long *)(unaff_x20 + 0xd0) != 0) {
    uVar1 = *(ulong *)(unaff_x19 + 0x20);
    if (*(ulong *)(unaff_x20 + 0xd8) != uVar1) {
      uVar3 = 0;
      uVar4 = *(long *)(unaff_x20 + 200) - 1;
      uVar5 = uVar1 >> 4 ^ uVar1 >> 9;
      do {
        uVar5 = uVar5 & uVar4;
        uVar6 = *(ulong *)(*(long *)(unaff_x20 + 0xc0) + uVar5 * 0x10);
        if (uVar6 == uVar1) {
          lVar2 = *(long *)(*(long *)(unaff_x20 + 0xc0) + uVar5 * 0x10 + 8);
          if (lVar2 == 0 || *(int *)(lVar2 + 8) != iRam0000000000a27cc8) {
            return 0;
          }
          if (*(long *)(lVar2 + 0x30) == 0) {
            return 0;
          }
          func_0x006de830();
          return 0;
        }
        uVar3 = uVar3 + 1;
        uVar5 = uVar3 + uVar5;
      } while (uVar6 != *(ulong *)(unaff_x20 + 0xd8) && uVar3 <= uVar4);
    }
  }
  return 0;
}

