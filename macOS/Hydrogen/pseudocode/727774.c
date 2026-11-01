
undefined8 FUN_00727774(void)

{
  char cVar1;
  undefined8 uVar2;
  int iVar3;
  long lVar4;
  char *pcVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  long lVar9;
  undefined8 uVar10;
  long *unaff_x20;
  long unaff_x29;
  undefined1 auVar11 [16];
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  long in_stack_00000050;
  undefined8 uStack0000000000000058;
  undefined8 in_stack_00000060;
  undefined8 uStack0000000000000068;
  undefined8 in_stack_00000070;
  undefined8 uStack0000000000000078;
  undefined8 in_stack_00000080;
  undefined8 uStack0000000000000088;
  undefined8 in_stack_00000090;
  undefined8 uStack0000000000000098;
  undefined1 uStack00000000000000a7;
  
  lVar4 = (*pcRam0000000000a2b600)();
  *unaff_x20 = lVar4;
  if (lVar4 == 0) {
    uVar10 = 0x1b;
  }
  else {
    lVar4 = _fopen();
    uVar10 = 0;
    if (lVar4 != 0) {
      func_0x0074066c(&uStack0000000000000008,0xfff);
      iVar3 = func_0x0073aa84(&uStack0000000000000008,lVar4);
      if (iVar3 != 0) {
        do {
          for (pcVar5 = (char *)func_0x00740a58(&uStack0000000000000008);
              (cVar1 = *pcVar5, cVar1 == '\t' || (cVar1 == ' ')); pcVar5 = pcVar5 + 1) {
          }
          if ((((cVar1 != '#') &&
               (((uStack0000000000000098 = pcVar5,
                 iVar3 = func_0x0077ebd0(&uStack0000000000000098,&uStack0000000000000068,10),
                 iVar3 == 0 && (iVar3 = func_0x0077ecc0(&uStack0000000000000098), iVar3 == 0)) &&
                (iVar3 = func_0x0077ebd0(&uStack0000000000000098,&uStack0000000000000088,0x800),
                iVar3 == 0)))) &&
              (((iVar3 = func_0x0077ecc0(&uStack0000000000000098), iVar3 == 0 &&
                (iVar3 = func_0x0077ecec(&uStack0000000000000098,&uStack0000000000000040,0xffff),
                iVar3 == 0)) && (iVar3 = func_0x0077ecc0(&uStack0000000000000098), iVar3 == 0)))) &&
             ((((iVar3 = func_0x0077ebd0(&uStack0000000000000098,&uStack0000000000000058,10),
                iVar3 == 0 && (iVar3 = func_0x0077ecc0(&uStack0000000000000098), iVar3 == 0)) &&
               ((((iVar3 = func_0x0077ebd0(&uStack0000000000000098,&uStack0000000000000078,0x800),
                  iVar3 == 0 &&
                  (((iVar3 = func_0x0077ecc0(&uStack0000000000000098), iVar3 == 0 &&
                    (iVar3 = func_0x0077ecec(&uStack0000000000000098,&uStack0000000000000038,0xffff)
                    , iVar3 == 0)) && (iVar3 = func_0x0077ecc0(&uStack0000000000000098), iVar3 == 0)
                   ))) && ((iVar3 = func_0x0077ec24(&uStack0000000000000098,&uStack0000000000000048,
                                                    0x100), iVar3 == 0 &&
                           (iVar3 = func_0x0077ecc0(&uStack0000000000000098), iVar3 == 0)))) &&
                (iVar3 = func_0x0077ecec(&uStack0000000000000098,&uStack0000000000000030,1),
                iVar3 == 0)))) &&
              (((iVar3 = func_0x0077ecc0(&uStack0000000000000098), iVar3 == 0 &&
                (iVar3 = func_0x0077ecec(&uStack0000000000000098,&uStack0000000000000028,0),
                iVar3 == 0)) &&
               (iVar3 = func_0x0077ed6c(&uStack0000000000000098), lVar9 = in_stack_00000050,
               iVar3 == 0)))))) {
            ___memcpy_chk(&uStack00000000000000a7,uStack0000000000000048,in_stack_00000050,0x101);
            (&uStack00000000000000a7)[lVar9] = 0;
            uVar6 = func_0x0076de98(&uStack00000000000000a7);
            uVar2 = uStack0000000000000040;
            uVar10 = uStack0000000000000038;
            uVar7 = func_0x007349f4(uStack0000000000000058,in_stack_00000060);
            uVar8 = func_0x007349f4(uStack0000000000000068,in_stack_00000070);
            if ((((int)uVar8 != 0) && ((int)uVar7 != 0)) &&
               (lVar9 = func_0x007286e8(uStack0000000000000088,in_stack_00000090,
                                        uStack0000000000000078,in_stack_00000080,uVar8,uVar7,uVar2,
                                        uVar10), lVar9 != 0)) {
              *(undefined8 *)(lVar9 + 0x20) = uVar6;
              *(undefined4 *)(lVar9 + 0x2c) = 0;
              *(bool *)(lVar9 + 0x28) = uStack0000000000000030 != 0;
              func_0x0075e474(unaff_x20 + 1,lVar9,lVar9 + 0x30);
            }
          }
          iVar3 = func_0x0073aa84(&uStack0000000000000008,lVar4);
        } while (iVar3 != 0);
      }
      func_0x00740678(&uStack0000000000000008);
      _fclose(lVar4);
      uVar10 = 0;
    }
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return uVar10;
  }
  auVar11 = ___stack_chk_fail(uVar10);
  *(long *)(auVar11._0_8_ + 0x28) = auVar11._8_8_;
  return 0;
}

