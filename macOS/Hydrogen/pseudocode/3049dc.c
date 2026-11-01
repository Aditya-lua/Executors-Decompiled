
undefined8 FUN_003049dc(void)

{
  int iVar1;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  uint *unaff_x24;
  undefined8 uVar2;
  
  *(undefined **)(unaff_x21 + 0x200) = &_aws_lc_0_24_0_AES_encrypt;
  iVar1 = *(uint *)(unaff_x20 + 0x18) * 4;
  if (((iVar1 == 0x80) || (iVar1 == 0x100)) || (iVar1 == 0xc0)) {
    if ((*unaff_x24 >> 2 & 1) == 0) {
      if ((*unaff_x24 & 1) == 0) {
        func_0x00296a94();
      }
      else {
        func_0x0038a640();
      }
    }
    else {
      func_0x003784e0(unaff_x22 + (ulong)(*(uint *)(unaff_x20 + 0x18) >> 1),iVar1,unaff_x21 + 0xf8);
    }
  }
  *(undefined **)(unaff_x21 + 0x208) = &_aws_lc_0_24_0_AES_encrypt;
  *(long *)(unaff_x21 + 0x1f0) = unaff_x21;
  if (unaff_x19 != (undefined8 *)0x0) {
    *(long *)(unaff_x21 + 0x1f8) = unaff_x21 + 0xf8;
    uVar2 = *unaff_x19;
    *(undefined8 *)(unaff_x20 + 0x3c) = unaff_x19[1];
    *(undefined8 *)(unaff_x20 + 0x34) = uVar2;
  }
  return 1;
}

