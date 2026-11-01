
undefined8 FUN_00372a8c(undefined8 param_1)

{
  int iVar1;
  long lVar2;
  int *piVar3;
  long lVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  long *unaff_x19;
  undefined8 unaff_x20;
  undefined4 *puVar8;
  undefined8 *puVar9;
  undefined4 *puVar10;
  long *plVar11;
  undefined8 *puVar12;
  undefined4 *puVar13;
  long unaff_x29;
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000020;
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000040;
  undefined8 uStack0000000000000050;
  
  iVar1 = func_0x002843d4(param_1,&uStack0000000000000010);
  if (iVar1 != 0) {
    iVar1 = func_0x002843d4(&uStack0000000000000010,&uStack0000000000000050,0x20000010);
    if (((iVar1 == 0) || (lVar4 = func_0x00283ac4(&uStack0000000000000010), lVar4 != 0)) ||
       (iVar1 = func_0x002843d4(&uStack0000000000000050,&uStack0000000000000040,6), iVar1 == 0)) {
code_r0x00372854:
      puVar10 = (undefined4 *)0x0;
      puVar8 = (undefined4 *)0x0;
    }
    else {
      lVar4 = func_0x00283ac4(&uStack0000000000000040);
      if ((lVar4 != 9) ||
         (plVar11 = (long *)func_0x00283abc(&uStack0000000000000040),
         *plVar11 != 0x1010df78648862a || (char)plVar11[1] != '\b')) {
        func_0x0028f83c(4,0,0x80,"/aws-lc/crypto/rsa_extra/rsassa_pss_asn1.c",0x5d);
        goto code_r0x00372854;
      }
      puVar8 = (undefined4 *)func_0x0036e31c(4);
      if (puVar8 == (undefined4 *)0x0) {
code_r0x00372a34:
        puVar10 = (undefined4 *)0x0;
      }
      else {
        *puVar8 = 0x38f;
        iVar1 = func_0x002843d4(&uStack0000000000000050,&uStack0000000000000030,0x20000010);
        if ((((iVar1 == 0) || (lVar4 = func_0x00283ac4(&uStack0000000000000050), lVar4 != 0)) ||
            (iVar1 = func_0x002843d4(&uStack0000000000000030,&uStack0000000000000020,6), iVar1 == 0)
            ) || ((lVar4 = func_0x00283ac4(&uStack0000000000000030), lVar4 != 0 &&
                  (((iVar1 = func_0x002843d4(&uStack0000000000000030,unaff_x29 + -0x50,5),
                    iVar1 == 0 || (lVar4 = func_0x00283ac4(unaff_x29 + -0x50), lVar4 != 0)) ||
                   (lVar4 = func_0x00283ac4(&uStack0000000000000030), lVar4 != 0))))))
        goto code_r0x00372a34;
        lVar4 = func_0x00283ac4(&uStack0000000000000020);
        if ((lVar4 == 5) &&
           (piVar3 = (int *)func_0x00283abc(&uStack0000000000000020),
           *piVar3 == 0x2030e2b && (char)piVar3[1] == '\x1a')) {
          puVar13 = (undefined4 *)&_aws_lc_0_24_0_sha1_func;
        }
        else {
          lVar4 = func_0x00283ac4(&uStack0000000000000020);
          if ((lVar4 == 9) &&
             (plVar11 = (long *)func_0x00283abc(&uStack0000000000000020),
             *plVar11 == 0x204036501488660 && (char)plVar11[1] == '\x04')) {
            puVar13 = (undefined4 *)&_aws_lc_0_24_0_sha224_func;
          }
          else {
            lVar4 = func_0x00283ac4(&uStack0000000000000020);
            if ((lVar4 == 9) &&
               (plVar11 = (long *)func_0x00283abc(&uStack0000000000000020),
               *plVar11 == 0x204036501488660 && (char)plVar11[1] == '\x01')) {
              puVar13 = (undefined4 *)&_aws_lc_0_24_0_sha256_func;
            }
            else {
              lVar4 = func_0x00283ac4(&uStack0000000000000020);
              if ((lVar4 == 9) &&
                 (plVar11 = (long *)func_0x00283abc(&uStack0000000000000020),
                 *plVar11 == 0x204036501488660 && (char)plVar11[1] == '\x02')) {
                puVar13 = (undefined4 *)&_aws_lc_0_24_0_sha384_func;
              }
              else {
                lVar4 = func_0x00283ac4(&uStack0000000000000020);
                if ((lVar4 != 9) ||
                   (plVar11 = (long *)func_0x00283abc(&uStack0000000000000020),
                   *plVar11 != 0x204036501488660 || (char)plVar11[1] != '\x03')) {
                  func_0x0028f83c(4,0,0x80,"/aws-lc/crypto/rsa_extra/rsassa_pss_asn1.c",0x5d);
                  goto code_r0x00372a34;
                }
                puVar13 = (undefined4 *)&_aws_lc_0_24_0_sha512_func;
              }
            }
          }
        }
        puVar10 = (undefined4 *)func_0x0036e31c(4);
        if (puVar10 != (undefined4 *)0x0) {
          *puVar10 = *puVar13;
          puVar9 = (undefined8 *)func_0x0036e31c(0x10);
          if (puVar9 != (undefined8 *)0x0) {
            *puVar9 = puVar8;
            puVar9[1] = puVar10;
            iVar1 = func_0x002843d4();
            goto joined_r0x00372d18;
          }
        }
      }
    }
    func_0x0028f83c(4,0,0x66,"/aws-lc/crypto/rsa_extra/rsassa_pss_asn1.c",0x93);
    func_0x0036e3d8(puVar8);
    func_0x0036e3d8(puVar10);
    func_0x0036e3d8();
    puVar12 = (undefined8 *)0x0;
    plVar11 = (long *)0x0;
    goto LAB_00372790;
  }
  puVar9 = (undefined8 *)0x0;
  iVar1 = func_0x002843d4();
joined_r0x00372d18:
  if (iVar1 == 0) {
    plVar11 = (long *)0x0;
LAB_00372d24:
    iVar1 = func_0x002843d4();
    if (iVar1 != 0) {
      uStack0000000000000050 = 0;
      iVar1 = func_0x00284720(unaff_x29 + -0x50,&uStack0000000000000050);
      if ((iVar1 == 0) || (lVar4 = func_0x00283ac4(unaff_x29 + -0x50), lVar4 != 0)) {
        uVar6 = 0x66;
        uVar7 = 0xd5;
      }
      else {
        if (uStack0000000000000050 == 1) {
          puVar12 = (undefined8 *)func_0x0036e31c(8);
          if (puVar12 != (undefined8 *)0x0) {
            *puVar12 = 1;
            lVar4 = func_0x00283ac4();
            goto joined_r0x00372e2c;
          }
          goto LAB_00372d78;
        }
        uVar6 = 0x1f6;
        uVar7 = 0xcf;
      }
      func_0x0028f83c(4,0,uVar6,"/aws-lc/crypto/rsa_extra/rsassa_pss_asn1.c",uVar7);
      goto LAB_00372d74;
    }
    puVar12 = (undefined8 *)0x0;
    lVar4 = func_0x00283ac4();
joined_r0x00372e2c:
    if (lVar4 == 0) {
      puVar5 = (undefined8 *)func_0x0036e31c(0x20);
      *unaff_x19 = (long)puVar5;
      if (puVar5 != (undefined8 *)0x0) {
        *puVar5 = unaff_x20;
        *(undefined8 **)(*unaff_x19 + 8) = puVar9;
        *(long **)(*unaff_x19 + 0x10) = plVar11;
        *(undefined8 **)(*unaff_x19 + 0x18) = puVar12;
        return 1;
      }
    }
  }
  else {
    uStack0000000000000050 = 0;
    iVar1 = func_0x00284720(unaff_x29 + -0x50,&uStack0000000000000050);
    if ((iVar1 == 0) ||
       (lVar2 = func_0x00283ac4(unaff_x29 + -0x50), lVar4 = uStack0000000000000050, lVar2 != 0)) {
      uVar6 = 0x66;
      uVar7 = 0xe4;
    }
    else {
      if (-1 < uStack0000000000000050) {
        plVar11 = (long *)func_0x0036e31c(8);
        if (plVar11 != (long *)0x0) {
          *plVar11 = lVar4;
          goto LAB_00372d24;
        }
        goto LAB_00372d74;
      }
      uVar6 = 0x1f5;
      uVar7 = 0xde;
    }
    func_0x0028f83c(4,0,uVar6,"/aws-lc/crypto/rsa_extra/rsassa_pss_asn1.c",uVar7);
    plVar11 = (long *)0x0;
LAB_00372d74:
    puVar12 = (undefined8 *)0x0;
  }
LAB_00372d78:
  func_0x0036e3d8();
  if (puVar9 != (undefined8 *)0x0) {
    func_0x0036e3d8(*puVar9);
    func_0x0036e3d8(puVar9[1]);
    func_0x0036e3d8(puVar9);
  }
LAB_00372790:
  func_0x0036e3d8(plVar11);
  func_0x0036e3d8(puVar12);
  return 0;
}

