
void FUN_005a98e0(undefined *param_1)

{
  long lVar1;
  code *pcVar2;
  int iVar3;
  long *unaff_x20;
  long unaff_x21;
  long lVar4;
  undefined8 uVar5;
  ulong uVar6;
  long unaff_x25;
  long unaff_x26;
  undefined8 unaff_x27;
  long unaff_x29;
  long *in_stack_00000000;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000030;
  ulong in_stack_00000038;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  ulong in_stack_00000050;
  undefined *puStack0000000000000060;
  undefined8 uStack0000000000000078;
  
code_r0x005a98e0:
  uStack0000000000000078 = 0;
  puStack0000000000000060 = param_1;
  func_0x00459f08(&uStack0000000000000028,(long)register0x00000008 + 0x58);
  uVar6 = in_stack_00000038;
  uVar5 = in_stack_00000030;
  lVar4 = uStack0000000000000028;
  lVar1 = in_stack_00000010;
  if (in_stack_00000038 <= (ulong)(uStack0000000000000008 - unaff_x21)) goto code_r0x005a9978;
  func_0x007af5a0(&uStack0000000000000008,unaff_x21,in_stack_00000038,1,1);
LAB_005a99c0:
  do {
    unaff_x21 = in_stack_00000018;
    lVar1 = in_stack_00000010;
code_r0x005a9978:
    do {
      while( true ) {
        _memcpy(lVar1 + unaff_x21,uVar5,uVar6);
        unaff_x21 = unaff_x21 + uVar6;
        in_stack_00000018 = unaff_x21;
        if (lVar4 != 0) {
          func_0x00187bd4(uVar5,lVar4,1);
        }
        unaff_x20 = unaff_x20 + 8;
        unaff_x26 = unaff_x26 + -1;
        unaff_x25 = unaff_x25 + -0x40;
        if (unaff_x25 == 0) {
          in_stack_00000000[1] = in_stack_00000010;
          *in_stack_00000000 = uStack0000000000000008;
          in_stack_00000000[2] = in_stack_00000018;
          return;
        }
        uStack0000000000000020 = unaff_x20;
        if (unaff_x26 == 0) break;
        *(undefined8 **)(unaff_x29 + -0x78) = &uStack0000000000000020;
        *(undefined **)(unaff_x29 + -0x70) = &DAT_005adc18;
        puStack0000000000000060 = (undefined *)0x2;
        uStack0000000000000078 = 0;
        func_0x00459f08(&uStack0000000000000040,(long)register0x00000008 + 0x58);
        uVar6 = in_stack_00000050;
        uVar5 = in_stack_00000048;
        lVar4 = uStack0000000000000040;
        if ((ulong)(uStack0000000000000008 - unaff_x21) < in_stack_00000050) {
          func_0x007af5a0(&uStack0000000000000008,unaff_x21,in_stack_00000050,1,1);
          goto LAB_005a99c0;
        }
      }
      if (*unaff_x20 == 0xb) {
        *(undefined8 **)(unaff_x29 + -0x78) = &uStack0000000000000020;
        *(undefined **)(unaff_x29 + -0x70) = &DAT_005adc18;
        param_1 = (undefined *)0x2;
        goto code_r0x005a98e0;
      }
      *(undefined8 *)(unaff_x29 + -0x78) = 0;
      *(undefined8 *)(unaff_x29 + -0x70) = unaff_x27;
      *(undefined8 *)(unaff_x29 + -0x68) = 0;
      puStack0000000000000060 = &UNK_009f1c58;
      iVar3 = func_0x005af604(unaff_x20,(long)register0x00000008 + 0x58);
      if (iVar3 != 0) {
        func_0x007a2810(&UNK_008ae9d5,0x37,unaff_x29 + -0x59,&UNK_009f1cb8,&UNK_009f1c88);
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x5a9a24);
        (*pcVar2)();
      }
      lVar4 = *(long *)(unaff_x29 + -0x78);
      uVar5 = *(undefined8 *)(unaff_x29 + -0x70);
      uVar6 = *(ulong *)(unaff_x29 + -0x68);
      lVar1 = in_stack_00000010;
    } while (uVar6 <= (ulong)(uStack0000000000000008 - unaff_x21));
    func_0x007af5a0(&uStack0000000000000008,unaff_x21,uVar6,1,1);
  } while( true );
}

