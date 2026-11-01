
/* WARNING: Removing unreachable block (ram,0x0046cb0c) */
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_0046cb64(void)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  byte *pbVar4;
  bool bVar5;
  ulong uVar6;
  ulong uVar7;
  uint in_w8;
  undefined8 unaff_x19;
  undefined8 uVar8;
  undefined8 unaff_x22;
  code *unaff_x23;
  code *unaff_x25;
  long unaff_x26;
  byte *unaff_x27;
  byte *unaff_x28;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  int iStack0000000000000028;
  byte bStack000000000000002e;
  byte bStack000000000000002f;
  
  do {
    if ((in_w8 == 1) && (uVar7 = (*unaff_x25)(), (uVar7 & 1) != 0)) goto LAB_0046ca00;
    uVar7 = (*unaff_x23)();
    if ((uVar7 & 1) != 0) goto LAB_0046ca00;
    uVar7 = func_0x004650d8(&uStack0000000000000008,&UNK_00893e13,2);
LAB_0046ca04:
    do {
      do {
        do {
          if (unaff_x28 == unaff_x27) {
code_r0x0046cbb4:
            if ((uVar7 & 1) == 0) {
              uVar8 = 1;
              uVar7 = (*unaff_x25)();
              if ((uVar7 & 1) == 0) {
                uVar8 = (*unaff_x25)();
              }
            }
            else {
              uVar8 = 1;
            }
            return uVar8;
          }
          uVar1 = (uint)*unaff_x28;
          pbVar4 = unaff_x28 + 1;
          if ((char)*unaff_x28 < '\0') {
            if (uVar1 < 0xe0) {
              uVar1 = unaff_x28[1] & 0x3f | (uVar1 & 0x1f) << 6;
              pbVar4 = unaff_x28 + 2;
            }
            else {
              uVar2 = unaff_x28[2] & 0x3f | (unaff_x28[1] & 0x3f) << 6;
              if (uVar1 < 0xf0) {
                uVar1 = uVar2 | (uVar1 & 0x1f) << 0xc;
                pbVar4 = unaff_x28 + 3;
              }
              else {
                uVar1 = unaff_x28[3] & 0x3f | uVar2 << 6 | (uVar1 & 7) << 0x12;
                if (uVar1 == 0x110000) goto code_r0x0046cbb4;
                pbVar4 = unaff_x28 + 4;
              }
            }
          }
          unaff_x28 = pbVar4;
          uVar6 = uVar7 & 1;
          uVar7 = 1;
        } while (uVar6 != 0);
        uVar7 = 1;
        uStack0000000000000008 = unaff_x19;
        in_stack_00000010 = unaff_x26;
        in_stack_00000018 = unaff_x22;
        uVar6 = (*unaff_x25)();
      } while ((uVar6 & 1) != 0);
      unaff_x23 = *(code **)(unaff_x26 + 0x20);
      uVar6 = (*unaff_x23)();
    } while ((uVar6 & 1) != 0);
    func_0x004623d8((long)&uStack0000000000000020 + 4,uVar1,0x101);
    iVar3 = iStack0000000000000028;
    bVar5 = uStack0000000000000020._4_1_ != -0x80;
    if (bVar5) {
      uVar7 = func_0x004650d8(&uStack0000000000000008,
                              (long)&uStack0000000000000020 + (ulong)bStack000000000000002e + 4,
                              (ulong)bStack000000000000002f - (ulong)bStack000000000000002e);
    }
    else {
      uVar7 = (*unaff_x23)();
    }
    if ((uVar7 & 1) != 0) {
LAB_0046ca00:
      uVar7 = 1;
      goto LAB_0046ca04;
    }
    in_w8 = (uint)(!bVar5 && iVar3 == 10);
  } while( true );
}

