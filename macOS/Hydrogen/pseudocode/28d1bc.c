
long FUN_0028d1bc(void)

{
  int iVar1;
  long lVar2;
  int *piVar3;
  char *pcVar4;
  ulong uVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  long lVar12;
  long unaff_x29;
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000020;
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000040;
  undefined1 uStack0000000000000050;
  undefined1 uStack0000000000000060;
  undefined8 uStack0000000000000070;
  long in_stack_00000078;
  undefined8 uStack0000000000000080;
  undefined1 uStack0000000000000088;
  undefined1 uStack0000000000000098;
  
  iVar1 = func_0x0028457c();
  if ((((iVar1 != 0) && (in_stack_00000078 == 1)) &&
      (iVar1 = func_0x002843d4(unaff_x29 + -0x68,unaff_x29 + -0x78,0x20000010), iVar1 != 0)) &&
     (((((iVar1 = func_0x002843d4(unaff_x29 + -0x78,unaff_x29 + -0x88,6), iVar1 != 0 &&
         (lVar2 = func_0x00283ac4(unaff_x29 + -0x88), lVar2 == 7)) &&
        ((piVar3 = (int *)func_0x00283abc(unaff_x29 + -0x88),
         *piVar3 == -0x31b779d6 && *(int *)((long)piVar3 + 3) == 0x1013dce &&
         ((iVar1 = func_0x002843d4(unaff_x29 + -0x78,&uStack0000000000000010,2), iVar1 != 0 &&
          (iVar1 = func_0x002846b0(&uStack0000000000000010), iVar1 != 0)))))) &&
       (lVar2 = func_0x00283ac4(unaff_x29 + -0x78), lVar2 == 0)) &&
      (iVar1 = func_0x002843d4(unaff_x29 + -0x68,unaff_x29 + -0x98,0x20000010), iVar1 != 0)))) {
    iVar1 = func_0x002843d4(unaff_x29 + -0x98,&uStack0000000000000020,4);
    if (iVar1 != 0) {
      iVar1 = func_0x002843d4(unaff_x29 + -0x98,&uStack0000000000000030,4);
      if ((((iVar1 != 0) && (iVar1 = func_0x0028499c(unaff_x29 + -0x98,0,0,3), iVar1 != 0)) &&
          (lVar2 = func_0x00283ac4(unaff_x29 + -0x98), lVar2 == 0)) &&
         (iVar1 = func_0x002843d4(unaff_x29 + -0x68,&uStack0000000000000098,4), iVar1 != 0)) {
        iVar1 = func_0x002843d4(unaff_x29 + -0x68,&uStack0000000000000060,2);
        if (((iVar1 != 0) && (iVar1 = func_0x002846b0(&uStack0000000000000060), iVar1 != 0)) &&
           ((iVar1 = func_0x0028499c(unaff_x29 + -0x68,&uStack0000000000000088,
                                     (long)&uStack0000000000000080 + 4,2), iVar1 != 0 &&
            (lVar2 = func_0x00283ac4(unaff_x29 + -0x68), lVar2 == 0)))) {
          if ((uStack0000000000000080._4_4_ != 0) &&
             ((lVar2 = func_0x00283ac4(&uStack0000000000000088), lVar2 != 1 ||
              (pcVar4 = (char *)func_0x00283abc(&uStack0000000000000088), *pcVar4 != '\x01')))) {
            uVar10 = 0x7b;
            uVar11 = 0x122;
            goto code_r0x0028d250;
          }
          iVar1 = func_0x00283bdc(&uStack0000000000000098,(long)&uStack0000000000000070 + 7);
          if ((iVar1 == 0) || (uStack0000000000000070._7_1_ != '\x04')) {
            uVar10 = 0x6f;
            uVar11 = 0x12a;
            goto code_r0x0028d250;
          }
          uVar5 = func_0x00283ac4(&uStack0000000000000098);
          if ((uVar5 & 1) != 0) {
            uVar10 = 0x80;
            uVar11 = 0x12f;
            goto code_r0x0028d250;
          }
          uVar5 = func_0x00283ac4(&uStack0000000000000098);
          uVar5 = uVar5 >> 1;
          uVar10 = func_0x00283abc(&uStack0000000000000098);
          func_0x00283a8c(&uStack0000000000000040,uVar10,uVar5);
          lVar2 = func_0x00283abc(&uStack0000000000000098);
          func_0x00283a8c(&uStack0000000000000050,lVar2 + uVar5,uVar5);
          lVar2 = func_0x0029bbb8();
          lVar6 = func_0x0029bbb8();
          lVar7 = func_0x0029bbb8();
          lVar8 = func_0x0029bbb8();
          lVar9 = func_0x0029bbb8();
          lVar12 = 0;
          if ((((lVar2 == 0) || (lVar6 == 0)) || (lVar7 == 0)) || ((lVar8 == 0 || (lVar9 == 0))))
          goto LAB_0028d5bc;
          lVar12 = func_0x002c52bc();
          uVar10 = func_0x002c4ecc();
          iVar1 = func_0x0028da80(&uStack0000000000000060,uVar10);
          if (iVar1 == 0) {
            lVar12 = func_0x002c54c0();
            uVar10 = func_0x002c4ecc();
            iVar1 = func_0x0028da80(&uStack0000000000000060,uVar10);
            if (iVar1 != 0) goto LAB_0028d508;
            lVar12 = func_0x002c56d0();
            uVar10 = func_0x002c4ecc();
            iVar1 = func_0x0028da80(&uStack0000000000000060,uVar10);
            if (iVar1 != 0) goto LAB_0028d508;
            lVar12 = func_0x002c58fc();
            uVar10 = func_0x002c4ecc();
            iVar1 = func_0x0028da80(&uStack0000000000000060,uVar10);
            if (iVar1 != 0) goto LAB_0028d508;
            lVar12 = func_0x002c5b30();
            uVar10 = func_0x002c4ecc();
            iVar1 = func_0x0028da80(&uStack0000000000000060,uVar10);
            if (iVar1 != 0) goto LAB_0028d508;
LAB_0028d59c:
            func_0x0028f83c(0xf,0,0x7b,"/aws-lc/crypto/ec_extra/ec_asn1.c",0x1a0);
          }
          else {
LAB_0028d508:
            iVar1 = func_0x002c7378(lVar12,lVar2,lVar6,lVar7,0);
            if (iVar1 != 0) {
              iVar1 = func_0x0028da80(&uStack0000000000000010,lVar2);
              if (((iVar1 != 0) &&
                  (iVar1 = func_0x0028da80(&uStack0000000000000020,lVar6), iVar1 != 0)) &&
                 (iVar1 = func_0x0028da80(&uStack0000000000000030,lVar7), iVar1 != 0)) {
                uVar10 = func_0x002c7164(lVar12);
                iVar1 = func_0x002c85bc(lVar12,uVar10,lVar8,lVar9,0);
                if (iVar1 == 0) goto LAB_0028d5b8;
                iVar1 = func_0x0028da80(&uStack0000000000000040,lVar8);
                if (((iVar1 != 0) &&
                    (iVar1 = func_0x0028da80(&uStack0000000000000050,lVar9), iVar1 != 0)) &&
                   (lVar12 != 0)) goto LAB_0028d5bc;
              }
              goto LAB_0028d59c;
            }
          }
LAB_0028d5b8:
          lVar12 = 0;
LAB_0028d5bc:
          func_0x0029bc0c(lVar2);
          func_0x0029bc0c(lVar6);
          func_0x0029bc0c(lVar7);
          func_0x0029bc0c(lVar8);
          func_0x0029bc0c(lVar9);
          return lVar12;
        }
      }
    }
  }
  uVar10 = 0x80;
  uVar11 = 0x11b;
code_r0x0028d250:
  func_0x0028f83c(0xf,0,uVar10,"/aws-lc/crypto/ec_extra/ec_asn1.c",uVar11);
  return 0;
}

