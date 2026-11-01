
long FUN_006fc0dc(long param_1)

{
  uint uVar1;
  long lVar2;
  int unaff_w21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  undefined4 uStack000000000000000c;
  
  while( true ) {
    unaff_x23 = unaff_x23 + param_1 * 0x20;
    uVar1 = *(uint *)(unaff_x23 + 0x1c);
    if ((((uVar1 & 0xf) == 2) && (*(long *)(unaff_x23 + 0x10) == unaff_x22)) &&
       (*(int *)(unaff_x23 + 0x18) == unaff_w21)) goto code_r0x006fc100;
    if (uVar1 < 0x10) break;
    param_1 = (long)((ulong)uVar1 << 0x20) >> 0x24;
  }
  lVar2 = __dyld_get_image_header(0);
  unaff_x23 = lVar2 + unaff_x24;
code_r0x006fc100:
  lVar2 = __dyld_get_image_header(0);
  if (unaff_x23 == lVar2 + unaff_x24) {
    uStack000000000000000c = 2;
    unaff_x23 = func_0x006fbc58();
  }
  return unaff_x23;
}

