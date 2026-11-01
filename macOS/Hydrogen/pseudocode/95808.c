
undefined8 FUN_00095808(long param_1)

{
  long lVar1;
  long unaff_x19;
  
code_r0x00095808:
  *(long *)(unaff_x19 + 0x28) = param_1 + -1;
  if (param_1 == 0) {
    if (*(long *)(unaff_x19 + 0x20) != 0) {
      _free();
    }
    *(undefined8 *)(unaff_x19 + 0x20) = 0;
    if (*(long *)(unaff_x19 + 0x10) != 0) {
      _free();
      *(undefined8 *)(unaff_x19 + 0x10) = 0;
    }
    if (*(long *)(unaff_x19 + 8) != 0) {
      _free();
      *(undefined8 *)(unaff_x19 + 8) = 0;
    }
    return 0;
  }
  lVar1 = *(long *)(*(long *)(*(long *)(unaff_x19 + 0x20) + (param_1 + -1) * 8) + 8);
  if (lVar1 != 0) goto code_r0x00095824;
  goto LAB_00095800;
code_r0x00095824:
  _free(lVar1);
  param_1 = *(long *)(unaff_x19 + 0x28);
  if (*(long *)(*(long *)(unaff_x19 + 0x20) + param_1 * 8) != 0) {
LAB_00095800:
    _free();
    param_1 = *(long *)(unaff_x19 + 0x28);
  }
  goto code_r0x00095808;
}

