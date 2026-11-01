
ulong FUN_00618b48(ulong param_1)

{
  long lVar1;
  ulong uVar2;
  long in_x9;
  ulong uVar3;
  long unaff_x19;
  int unaff_w21;
  ulong unaff_x22;
  
  do {
    *(long *)(unaff_x19 + 0x78) = in_x9;
    if (unaff_x22 <= param_1) {
      if (unaff_w21 != 0) {
        lVar1 = func_0x0066ad70();
        if (lVar1 != 0) {
          lVar1 = *(long *)(unaff_x19 + 0x60);
LAB_00618b84:
          uVar2 = lVar1 - *(long *)(unaff_x19 + 0x20);
FUN_00618b98:
          if (uVar2 < 2) {
            uVar2 = 1;
          }
          return uVar2;
        }
        *(undefined8 *)(unaff_x19 + 0x78) = 0;
      }
      return 0;
    }
    lVar1 = *(long *)(unaff_x19 + 0x78);
    if (lVar1 == *(long *)(unaff_x19 + 0x70)) {
      lVar1 = func_0x0066ad70();
      if (lVar1 != 0) {
        lVar1 = *(long *)(unaff_x19 + 0x40);
        goto LAB_00618b84;
      }
      lVar1 = 0;
      *(undefined8 *)(unaff_x19 + 0x78) = 0;
    }
    uVar3 = unaff_x22 - *(long *)(unaff_x19 + 0x20);
    uVar2 = *(long *)(unaff_x19 + 0x70) - lVar1;
    if (uVar3 <= uVar2) {
      uVar2 = uVar3;
    }
    lVar1 = func_0x0066ad70();
    if (lVar1 != 0) {
      uVar2 = uVar2 - *(long *)(unaff_x19 + 0x20);
      goto FUN_00618b98;
    }
    param_1 = *(long *)(unaff_x19 + 0x20) + uVar2;
    *(ulong *)(unaff_x19 + 0x20) = param_1;
    in_x9 = *(long *)(unaff_x19 + 0x78) + uVar2;
  } while( true );
}

