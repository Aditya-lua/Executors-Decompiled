
undefined8 FUN_00304984(void)

{
  int iVar1;
  int in_w3;
  undefined *puVar2;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  int unaff_w24;
  undefined8 uVar3;
  
  iVar1 = _memcmp();
  if (iVar1 == 0) {
    func_0x0028f83c(0x1e,0,0x8a,"/aws-lc/crypto/fipsmodule/cipher/e_aes.c",0x27a);
    return 0;
  }
  iVar1 = unaff_w24 * 4;
  if (in_w3 == 0) {
    if (((iVar1 == 0x80) || (iVar1 == 0x100)) || (iVar1 == 0xc0)) {
      if ((uRam0000000000a334f8 >> 2 & 1) == 0) {
        if ((uRam0000000000a334f8 & 1) == 0) {
          func_0x00296a94();
        }
        else {
          func_0x0038a680();
        }
      }
      else {
        func_0x00378700();
      }
    }
    puVar2 = &_aws_lc_0_24_0_AES_decrypt;
  }
  else {
    if (((iVar1 == 0x80) || (iVar1 == 0x100)) || (iVar1 == 0xc0)) {
      if ((uRam0000000000a334f8 >> 2 & 1) == 0) {
        if ((uRam0000000000a334f8 & 1) == 0) {
          func_0x00296a94();
          puVar2 = &_aws_lc_0_24_0_AES_encrypt;
        }
        else {
          func_0x0038a640();
          puVar2 = &_aws_lc_0_24_0_AES_encrypt;
        }
        goto code_r0x00304a98;
      }
      func_0x003784e0();
    }
    puVar2 = &_aws_lc_0_24_0_AES_encrypt;
  }
code_r0x00304a98:
  *(undefined **)(unaff_x21 + 0x200) = puVar2;
  iVar1 = *(uint *)(unaff_x20 + 0x18) * 4;
  if (((iVar1 == 0x80) || (iVar1 == 0x100)) || (iVar1 == 0xc0)) {
    if ((uRam0000000000a334f8 >> 2 & 1) == 0) {
      if ((uRam0000000000a334f8 & 1) == 0) {
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
    uVar3 = *unaff_x19;
    *(undefined8 *)(unaff_x20 + 0x3c) = unaff_x19[1];
    *(undefined8 *)(unaff_x20 + 0x34) = uVar3;
  }
  return 1;
}

