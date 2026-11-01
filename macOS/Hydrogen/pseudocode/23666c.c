
void FUN_0023666c(undefined8 param_1)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  code *pcVar3;
  int iVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 *unaff_x19;
  int unaff_w20;
  long unaff_x23;
  long unaff_x29;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000040;
  undefined1 uStack0000000000000041;
  undefined1 uStack0000000000000042;
  undefined1 uStack0000000000000043;
  undefined1 uStack0000000000000044;
  undefined1 uStack0000000000000045;
  undefined1 uStack0000000000000046;
  undefined1 uStack0000000000000047;
  undefined1 uStack0000000000000048;
  undefined1 uStack0000000000000049;
  undefined1 uStack000000000000004a;
  undefined1 uStack000000000000004b;
  undefined1 uStack000000000000004c;
  undefined1 uStack000000000000004d;
  undefined1 uStack000000000000004e;
  undefined1 uStack000000000000004f;
  undefined1 uStack0000000000000050;
  undefined1 uStack0000000000000051;
  undefined1 uStack0000000000000052;
  undefined1 uStack0000000000000053;
  undefined1 uStack0000000000000054;
  undefined1 uStack0000000000000055;
  undefined1 uStack0000000000000056;
  undefined1 uStack0000000000000057;
  undefined1 uStack0000000000000058;
  undefined1 uStack0000000000000059;
  undefined1 uStack000000000000005a;
  undefined1 uStack000000000000005b;
  undefined1 uStack000000000000005c;
  undefined1 uStack000000000000005d;
  undefined1 uStack000000000000005e;
  undefined1 uStack000000000000005f;
  undefined8 uStack0000000000000060;
  undefined1 uStack0000000000000070;
  undefined4 uStack0000000000000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined1 uStack00000000000000c0;
  undefined8 uStack00000000000000c8;
  undefined8 uStack00000000000000d0;
  undefined8 uStack00000000000000d8;
  undefined8 uStack00000000000000e0;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000118;
  undefined8 in_stack_00000120;
  undefined8 uStack0000000000000130;
  undefined8 in_stack_00000138;
  undefined8 in_stack_00000140;
  undefined8 in_stack_00000148;
  undefined8 in_stack_00000150;
  undefined8 in_stack_00000158;
  undefined4 uStack0000000000000160;
  undefined8 in_stack_00000168;
  undefined8 in_stack_00000170;
  undefined8 in_stack_00000178;
  undefined8 in_stack_00000180;
  undefined8 in_stack_00000188;
  undefined8 in_stack_00000190;
  undefined8 in_stack_00000198;
  undefined8 in_stack_000001d8;
  undefined8 in_stack_000001e0;
  undefined8 in_stack_000001e8;
  undefined8 in_stack_000001f0;
  undefined8 in_stack_000001f8;
  undefined8 in_stack_00000200;
  
  uStack0000000000000078 = uStack0000000000000160;
  uStack00000000000000c8 = in_stack_00000008;
  _uStack00000000000000c0 = in_stack_00000000;
  uStack00000000000000d8 = in_stack_00000018;
  uStack00000000000000d0 = in_stack_00000010;
  uStack00000000000000e0 = in_stack_00000020;
  uStack0000000000000060 = param_1;
  (**(code **)(*(long *)(unaff_x23 + 0x28) + 0x30))
            (&uStack0000000000000130,*(undefined8 *)(unaff_x23 + 0x20),&uStack00000000000000c0,
             &uStack0000000000000030);
  if ((char)uStack0000000000000130 == '\x03') {
    uStack0000000000000130 = 0;
    in_stack_00000138 = 1;
    in_stack_00000140 = 0;
    iVar4 = func_0x001eee28(&uStack0000000000000130,&UNK_008287d7,0x17);
    if (iVar4 != 0) {
      func_0x007a2810(&UNK_00820107,0x37,&uStack00000000000000c0,&UNK_009c4330,&UNK_009c4300);
LAB_002369a0:
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x2369a4);
      (*pcVar3)();
    }
    unaff_x19[3] = in_stack_00000138;
    unaff_x19[2] = uStack0000000000000130;
    unaff_x19[4] = in_stack_00000140;
    unaff_x19[1] = 0x800000000000001e;
    *(undefined1 *)unaff_x19 = 3;
  }
  else {
    in_stack_00000088 = in_stack_00000138;
    in_stack_00000080 = uStack0000000000000130;
    in_stack_00000098 = in_stack_00000148;
    in_stack_00000090 = in_stack_00000140;
    in_stack_000000a8 = in_stack_00000158;
    in_stack_000000a0 = in_stack_00000150;
    in_stack_000000b0 = _uStack0000000000000160;
    uStack00000000000000c8 =
         CONCAT17(uStack000000000000004f,
                  CONCAT16(uStack000000000000004e,
                           CONCAT15(uStack000000000000004d,
                                    CONCAT14(uStack000000000000004c,
                                             CONCAT13(uStack000000000000004b,
                                                      CONCAT12(uStack000000000000004a,
                                                               CONCAT11(uStack0000000000000049,
                                                                        uStack0000000000000048))))))
                 );
    _uStack00000000000000c0 =
         CONCAT17(uStack0000000000000047,
                  CONCAT16(uStack0000000000000046,
                           CONCAT15(uStack0000000000000045,
                                    CONCAT14(uStack0000000000000044,
                                             CONCAT13(uStack0000000000000043,
                                                      CONCAT12(uStack0000000000000042,
                                                               CONCAT11(uStack0000000000000041,
                                                                        uStack0000000000000040))))))
                 );
    uStack00000000000000d8 =
         CONCAT17(uStack000000000000005f,
                  CONCAT16(uStack000000000000005e,
                           CONCAT15(uStack000000000000005d,
                                    CONCAT14(uStack000000000000005c,
                                             CONCAT13(uStack000000000000005b,
                                                      CONCAT12(uStack000000000000005a,
                                                               CONCAT11(uStack0000000000000059,
                                                                        uStack0000000000000058))))))
                 );
    uStack00000000000000d0 =
         CONCAT17(uStack0000000000000057,
                  CONCAT16(uStack0000000000000056,
                           CONCAT15(uStack0000000000000055,
                                    CONCAT14(uStack0000000000000054,
                                             CONCAT13(uStack0000000000000053,
                                                      CONCAT12(uStack0000000000000052,
                                                               CONCAT11(uStack0000000000000051,
                                                                        uStack0000000000000050))))))
                 );
    uStack00000000000000e0 = uStack0000000000000060;
    (**(code **)(*(long *)(unaff_x23 + 0x28) + 0x30))
              (&uStack0000000000000130,*(undefined8 *)(unaff_x23 + 0x20),&uStack00000000000000c0,
               &uStack0000000000000070);
    if ((char)uStack0000000000000130 == '\x03') {
      uStack0000000000000130 = 0;
      in_stack_00000138 = 1;
      in_stack_00000140 = 0;
      iVar4 = func_0x001eee28(&uStack0000000000000130,&UNK_008287d7,0x17);
      if (iVar4 != 0) {
        func_0x007a2810(&UNK_00820107,0x37,&uStack00000000000000c0,&UNK_009c4330,&UNK_009c4300);
        goto LAB_002369a0;
      }
      unaff_x19[3] = in_stack_00000138;
      unaff_x19[2] = uStack0000000000000130;
      unaff_x19[4] = in_stack_00000140;
      unaff_x19[1] = 0x800000000000001e;
      *(undefined1 *)unaff_x19 = 3;
    }
    else {
      puVar1 = (undefined8 *)(unaff_x29 + -0xb0);
      puVar2 = (undefined8 *)(unaff_x29 + -0x78);
      if (unaff_w20 == 0) {
        puVar1 = (undefined8 *)(unaff_x29 + -0x78);
        puVar2 = (undefined8 *)(unaff_x29 + -0xb0);
      }
      puVar2[1] = in_stack_00000088;
      *puVar2 = in_stack_00000080;
      puVar2[3] = in_stack_00000098;
      puVar2[2] = in_stack_00000090;
      puVar2[5] = in_stack_000000a8;
      puVar2[4] = in_stack_000000a0;
      puVar2[6] = in_stack_000000b0;
      puVar1[1] = in_stack_00000138;
      *puVar1 = uStack0000000000000130;
      puVar1[3] = in_stack_00000148;
      puVar1[2] = in_stack_00000140;
      puVar1[5] = in_stack_00000158;
      puVar1[4] = in_stack_00000150;
      puVar1[6] = _uStack0000000000000160;
      uVar6 = *(undefined8 *)(unaff_x29 + -0x80);
      uVar7 = *(undefined8 *)(unaff_x29 + -0xb0);
      uVar9 = *(undefined8 *)(unaff_x29 + -0x98);
      uVar8 = *(undefined8 *)(unaff_x29 + -0xa0);
      uVar11 = *(undefined8 *)(unaff_x29 + -0x88);
      uVar10 = *(undefined8 *)(unaff_x29 + -0x90);
      uVar5 = *(undefined8 *)(unaff_x29 + -0x48);
      unaff_x19[1] = *(undefined8 *)(unaff_x29 + -0xa8);
      *unaff_x19 = uVar7;
      unaff_x19[3] = uVar9;
      unaff_x19[2] = uVar8;
      unaff_x19[0xb] = in_stack_000001f8;
      unaff_x19[10] = in_stack_000001f0;
      unaff_x19[0xd] = uVar5;
      unaff_x19[0xc] = in_stack_00000200;
      unaff_x19[7] = in_stack_000001d8;
      unaff_x19[6] = uVar6;
      unaff_x19[9] = in_stack_000001e8;
      unaff_x19[8] = in_stack_000001e0;
      unaff_x19[5] = uVar11;
      unaff_x19[4] = uVar10;
    }
  }
  return;
}

