
undefined8 FUN_003053ac(ulong param_1)

{
  uint uVar1;
  ulong uVar2;
  char *pcVar3;
  bool bVar4;
  int iVar5;
  undefined8 uVar6;
  long lVar7;
  byte *pbVar8;
  code *in_x9;
  ulong in_x10;
  byte *pbVar9;
  ulong uVar10;
  code *in_x15;
  ulong unaff_x19;
  ulong unaff_x22;
  char *unaff_x23;
  long unaff_x24;
  byte *unaff_x25;
  byte *pbVar11;
  ulong uVar12;
  long unaff_x29;
  undefined8 uVar13;
  undefined1 auVar14 [16];
  byte bStack0000000000000040;
  undefined4 uStack0000000000000174;
  
  do {
    pbVar11 = unaff_x25 + 1;
    (&bStack0000000000000040)[in_x10 & 0xffffffff] =
         (&bStack0000000000000040)[in_x10 & 0xffffffff] ^ *unaff_x25;
    uVar12 = param_1 - 1;
    uVar1 = (int)in_x10 + 1U & 0xf;
    in_x10 = (ulong)uVar1;
    if (uVar1 == 0) break;
    bVar4 = param_1 != 1;
    param_1 = uVar12;
    unaff_x25 = pbVar11;
  } while (bVar4);
  if (uVar1 == 0) {
    (*in_x9)(&bStack0000000000000040);
    uVar2 = uVar12 & 0xfffffffffffffff0;
    if (uVar2 == 0) {
      pbVar8 = pbVar11;
      in_x10 = uVar12;
    }
    else {
      (*in_x15)(&bStack0000000000000040);
      pbVar8 = pbVar11 + uVar2;
      in_x10 = uVar12 & 0xf;
    }
    if (in_x10 == 0) {
      in_x10 = 0;
    }
    else {
      if ((in_x10 < 8) ||
         ((&bStack0000000000000040 < pbVar11 + in_x10 + uVar2 &&
          (pbVar8 < &bStack0000000000000040 + in_x10)))) {
        uVar12 = 0;
      }
      else {
        uVar12 = in_x10 & 0xfffffffffffffff8;
        pbVar9 = &bStack0000000000000040;
        uVar10 = uVar12;
        do {
          uVar6 = *(undefined8 *)pbVar8;
          uVar13 = *(undefined8 *)pbVar9;
          *(ulong *)pbVar9 =
               CONCAT17((byte)((ulong)uVar13 >> 0x38) ^ (byte)((ulong)uVar6 >> 0x38),
                        CONCAT16((byte)((ulong)uVar13 >> 0x30) ^ (byte)((ulong)uVar6 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar13 >> 0x28) ^
                                          (byte)((ulong)uVar6 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar13 >> 0x20) ^
                                                   (byte)((ulong)uVar6 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar13 >> 0x18) ^
                                                            (byte)((ulong)uVar6 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar13 >> 0x10) ^
                                                                     (byte)((ulong)uVar6 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar13
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar6 >>
                                                                                    8),(byte)uVar13
                                                                                       ^ (byte)uVar6
                                                                             )))))));
          uVar10 = uVar10 - 8;
          pbVar8 = pbVar8 + 8;
          pbVar9 = pbVar9 + 8;
        } while (uVar10 != 0);
        if (in_x10 == uVar12) goto LAB_00305518;
      }
      lVar7 = in_x10 - uVar12;
      pbVar11 = pbVar11 + uVar12 + uVar2;
      pbVar8 = &bStack0000000000000040 + uVar12;
      do {
        *pbVar8 = *pbVar8 ^ *pbVar11;
        lVar7 = lVar7 + -1;
        pbVar11 = pbVar11 + 1;
        pbVar8 = pbVar8 + 1;
      } while (lVar7 != 0);
    }
  }
LAB_00305518:
  uStack0000000000000174 = (undefined4)in_x10;
  if (*(long *)(unaff_x24 + 0x218) == 0) {
    uVar6 = func_0x002f3d48();
    iVar5 = (int)uVar6;
  }
  else {
    uVar6 = func_0x002f4458();
    iVar5 = (int)uVar6;
  }
  if (iVar5 != 0) {
    func_0x002f4824();
    uVar12 = unaff_x19;
    if (0xf < unaff_x19) {
      uVar12 = 0x10;
    }
    if (uVar12 != 0) {
      unaff_x23 = " ";
      ___memcpy_chk(unaff_x29 + -0x70,&bStack0000000000000040);
    }
    iVar5 = func_0x0036e62c(unaff_x29 + -0x70);
    if (iVar5 == 0) {
      uVar6 = 1;
      unaff_x22 = unaff_x19;
    }
    else {
      unaff_x23 = "/aws-lc/crypto/fipsmodule/cipher/e_aes.c";
      unaff_x22 = 0x65;
      func_0x0028f83c(0x1e,0,0x65,"/aws-lc/crypto/fipsmodule/cipher/e_aes.c",0x4e2);
      uVar6 = 0;
    }
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return uVar6;
  }
  auVar14 = ___stack_chk_fail(uVar6);
  lVar7 = auVar14._0_8_;
  if (unaff_x23 == (char *)0x0) {
    unaff_x23 = (char *)0x0;
  }
  else {
    if (unaff_x23 < "\x06") {
      func_0x0028f83c(0x1e,0,0x67,"/aws-lc/crypto/fipsmodule/cipher/e_aes.c",0x52e);
      return 0;
    }
    unaff_x23 = unaff_x23 + -0xc;
  }
  if (((unaff_x22 & 0x1ffffffffffffff7) != 0x10) && ((unaff_x22 & 0x1fffffffffffffff) != 0x20)) {
    func_0x0028f83c(0x1e,0,0x66,"/aws-lc/crypto/fipsmodule/cipher/e_aes.c",0x447);
    return 0;
  }
  pcVar3 = " ";
  if (unaff_x23 != (char *)0x0) {
    pcVar3 = unaff_x23;
  }
  if (pcVar3 < (char *)((long)&MACH_HEADER.ncmds + 1)) {
    uVar6 = func_0x002b3d9c(lVar7 + 8,lVar7 + 0x100,0,auVar14._8_8_);
    *(undefined8 *)(lVar7 + 0x220) = uVar6;
    *(char *)(lVar7 + 0x241) = (char)pcVar3 + '\f';
    return 1;
  }
  func_0x0028f83c(0x1e,0,0x74,"/aws-lc/crypto/fipsmodule/cipher/e_aes.c",0x450);
  return 0;
}

