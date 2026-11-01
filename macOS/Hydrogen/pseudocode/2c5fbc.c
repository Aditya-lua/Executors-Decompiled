
undefined8 * FUN_002c5fbc(void)

{
  code *pcVar1;
  int iVar2;
  undefined8 *puVar3;
  int in_w8;
  long lVar4;
  long unaff_x19;
  undefined8 *unaff_x21;
  
  pcVar1 = (code *)&_aws_lc_0_24_0_BN_add;
  if (in_w8 != 0) {
    pcVar1 = (code *)&_aws_lc_0_24_0_BN_sub;
  }
  iVar2 = (*pcVar1)();
  if (iVar2 == 0) {
LAB_002c6094:
    puVar3 = (undefined8 *)0x0;
  }
  else {
    puVar3 = (undefined8 *)func_0x0036e31c(0x228);
    if (puVar3 == (undefined8 *)0x0) {
      return (undefined8 *)0x0;
    }
    *(undefined8 *)((long)puVar3 + 0x21c) = 0x100000004;
    func_0x00373e9c(0xa29538,&DAT_002cffec);
    puVar3[0x26] = 0;
    puVar3[0x25] = 0;
    puVar3[0x28] = 0;
    puVar3[0x27] = 0;
    puVar3[0x2a] = 0;
    puVar3[0x29] = 0;
    puVar3[0x2c] = 0;
    puVar3[0x2b] = 0;
    puVar3[0x27] = 0;
    puVar3[0x29] = 0;
    puVar3[0x1e] = 0;
    puVar3[0x1d] = 0;
    puVar3[0x22] = 0;
    puVar3[0x21] = 0;
    puVar3[0x24] = 0;
    puVar3[0x23] = 0;
    puVar3[0x1d] = 0;
    puVar3[0x21] = 0;
    puVar3[0x25] = 0;
    puVar3[0x26] = 0;
    puVar3[0x28] = 0;
    puVar3[0x2a] = 0;
    puVar3[0x20] = 0;
    puVar3[0x1f] = 0;
    puVar3[0x1e] = 0;
    puVar3[0x1f] = 0;
    puVar3[0x20] = 0;
    puVar3[0x22] = 0;
    *puVar3 = 0xa3aa68;
    puVar3[1] = puVar3;
    iVar2 = func_0x002c6150(puVar3);
    if (iVar2 == 0) {
      func_0x002c6434(puVar3);
      goto LAB_002c6094;
    }
  }
  if (*(char *)(unaff_x19 + 0x28) == '\0') {
    if (*(long *)(unaff_x19 + 0x10) == 0) {
      func_0x0079db4c();
      goto LAB_002c6120;
    }
    lVar4 = *(long *)(unaff_x19 + 0x10) + -1;
    *(long *)(unaff_x19 + 0x10) = lVar4;
    *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar4 * 8);
  }
  if (unaff_x21 != (undefined8 *)0x0) {
    if ((unaff_x21[4] != 0) && (*(char *)(unaff_x21 + 5) == '\0')) {
LAB_002c6120:
      func_0x0079db28();
      func_0x00373e9c(0xa29538,&DAT_002cffec);
      return (undefined8 *)0xa3aa68;
    }
    func_0x00373520(*unaff_x21,&DAT_00302244,&_aws_lc_0_24_0_BN_free);
    func_0x0036e3d8(unaff_x21[1]);
    func_0x0036e3d8();
  }
  return puVar3;
}

