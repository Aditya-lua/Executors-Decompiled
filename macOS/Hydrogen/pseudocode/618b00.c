
ulong FUN_00618b00(long param_1)

{
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  ulong in_x10;
  long in_x11;
  long unaff_x19;
  int unaff_w21;
  ulong unaff_x22;
  
  while( true ) {
    uVar3 = in_x11 - param_1;
    if (in_x10 <= (ulong)(in_x11 - param_1)) {
      uVar3 = in_x10;
    }
    lVar2 = func_0x0066ad70();
    if (lVar2 != 0) break;
    uVar1 = *(long *)(unaff_x19 + 0x20) + uVar3;
    *(ulong *)(unaff_x19 + 0x20) = uVar1;
    *(ulong *)(unaff_x19 + 0x78) = *(long *)(unaff_x19 + 0x78) + uVar3;
    if (unaff_x22 <= uVar1) {
      if (unaff_w21 != 0) {
        lVar2 = func_0x0066ad70();
        if (lVar2 != 0) {
          lVar2 = *(long *)(unaff_x19 + 0x60);
LAB_00618b84:
          uVar3 = lVar2 - *(long *)(unaff_x19 + 0x20);
FUN_00618b98:
          if (uVar3 < 2) {
            uVar3 = 1;
          }
          return uVar3;
        }
        *(undefined8 *)(unaff_x19 + 0x78) = 0;
      }
      return 0;
    }
    param_1 = *(long *)(unaff_x19 + 0x78);
    if (param_1 == *(long *)(unaff_x19 + 0x70)) {
      lVar2 = func_0x0066ad70();
      if (lVar2 != 0) {
        lVar2 = *(long *)(unaff_x19 + 0x40);
        goto LAB_00618b84;
      }
      param_1 = 0;
      *(undefined8 *)(unaff_x19 + 0x78) = 0;
    }
    in_x10 = unaff_x22 - *(long *)(unaff_x19 + 0x20);
    in_x11 = *(long *)(unaff_x19 + 0x70);
  }
  uVar3 = uVar3 - *(long *)(unaff_x19 + 0x20);
  goto FUN_00618b98;
}

