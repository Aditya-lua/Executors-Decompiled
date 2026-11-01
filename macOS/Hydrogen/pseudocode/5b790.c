
/* WARNING: Removing unreachable block (ram,0x0005ba3c) */
/* WARNING: Removing unreachable block (ram,0x0005b8c0) */
/* WARNING: Removing unreachable block (ram,0x0005b824) */
/* WARNING: Removing unreachable block (ram,0x0005b884) */
/* WARNING: Removing unreachable block (ram,0x0005b964) */
/* WARNING: Removing unreachable block (ram,0x0005bb14) */
/* WARNING: Removing unreachable block (ram,0x0005bb1c) */
/* WARNING: Removing unreachable block (ram,0x0005b9e4) */
/* WARNING: Removing unreachable block (ram,0x0005ba18) */
/* WARNING: Removing unreachable block (ram,0x0005ba1c) */
/* WARNING: Removing unreachable block (ram,0x0005ba58) */
/* WARNING: Removing unreachable block (ram,0x0005bac0) */
/* WARNING: Removing unreachable block (ram,0x0005ba64) */
/* WARNING: Removing unreachable block (ram,0x0005ba84) */
/* WARNING: Removing unreachable block (ram,0x0005bac4) */
/* WARNING: Removing unreachable block (ram,0x0005ba8c) */
/* WARNING: Restarted to delay deadcode elimination for space: stack */

uint FUN_0005b790(void)

{
  code *pcVar1;
  uint uVar2;
  int iVar3;
  long lVar4;
  long *plVar5;
  undefined8 uVar6;
  int in_w9;
  undefined *unaff_x22;
  uint unaff_w24;
  ulong unaff_x25;
  undefined8 *unaff_x26;
  long unaff_x27;
  long unaff_x28;
  long unaff_x29;
  long in_stack_00000008;
  undefined4 in_stack_00000020;
  undefined8 *in_stack_00000028;
  long in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  undefined8 uStack0000000000000060;
  long in_stack_00000068;
  undefined8 uStack0000000000000080;
  undefined8 in_stack_00000088;
  undefined7 uStack0000000000000090;
  byte bStack0000000000000097;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c8;
  long lStack00000000000000d0;
  long *in_stack_000000e8;
  long lStack00000000000000f0;
  long in_stack_000000f8;
  long in_stack_00000100;
  long *in_stack_00000108;
  undefined8 uStack0000000000000110;
  byte bStack0000000000000127;
  undefined1 uStack0000000000000140;
  int in_stack_00000158;
  undefined1 uStack00000000000001a0;
  undefined7 uStack00000000000001a1;
  undefined8 in_stack_000001a8;
  undefined8 in_stack_000001b0;
  undefined8 in_stack_000001d0;
  long lStack00000000000001d8;
  long *in_stack_000001f0;
  undefined *in_stack_00000220;
  long in_stack_00000228;
  char in_stack_00000237;
  undefined *in_stack_00000238;
  ulong in_stack_00000240;
  byte in_stack_0000024f;
  long in_stack_00000360;
  long in_stack_00000368;
  undefined1 auStack_7ffffffe [2147483646];
  
  if (in_w9 < 0) {
    func_0x00017784();
  }
  else if (*(char *)((long)in_stack_00000028 + 0x17) < '\0') {
    func_0x000176c0();
  }
  else {
    uVar6 = *in_stack_00000028;
    unaff_x26[1] = in_stack_00000028[1];
    *unaff_x26 = uVar6;
    unaff_x26[2] = in_stack_00000028[2];
  }
  uStack0000000000000110._0_1_ = s_LOCAL_ADDR_008d19c1[0];
  uStack0000000000000110._1_1_ = s_LOCAL_ADDR_008d19c1[1];
  uStack0000000000000110._2_1_ = s_LOCAL_ADDR_008d19c1[2];
  uStack0000000000000110._3_1_ = s_LOCAL_ADDR_008d19c1[3];
  uStack0000000000000110._4_1_ = s_LOCAL_ADDR_008d19c1[4];
  uStack0000000000000110._5_1_ = s_LOCAL_ADDR_008d19c1[5];
  uStack0000000000000110._6_1_ = s_LOCAL_ADDR_008d19c1[6];
  uStack0000000000000110._7_1_ = s_LOCAL_ADDR_008d19c1[7];
  func_0x0005ce54(auStack_7ffffffe + 0x8000024e,&uStack0000000000000110);
  uStack0000000000000110._0_1_ = s_LOCAL_PORT_008d19cc[0];
  uStack0000000000000110._1_1_ = s_LOCAL_PORT_008d19cc[1];
  uStack0000000000000110._2_1_ = s_LOCAL_PORT_008d19cc[2];
  uStack0000000000000110._3_1_ = s_LOCAL_PORT_008d19cc[3];
  uStack0000000000000110._4_1_ = s_LOCAL_PORT_008d19cc[4];
  uStack0000000000000110._5_1_ = s_LOCAL_PORT_008d19cc[5];
  uStack0000000000000110._6_1_ = s_LOCAL_PORT_008d19cc[6];
  uStack0000000000000110._7_1_ = s_LOCAL_PORT_008d19cc[7];
  __ZNSt3__19to_stringEi(&uStack0000000000000080,in_stack_00000020);
  func_0x0005ce54(auStack_7ffffffe + 0x8000024e,&uStack0000000000000110,&uStack0000000000000080);
  if ((char)bStack0000000000000097 < '\0') {
    __ZdlPv(CONCAT17(uStack0000000000000080._7_1_,
                     CONCAT16(uStack0000000000000080._6_1_,
                              CONCAT24(uStack0000000000000080._4_2_,
                                       (undefined4)uStack0000000000000080))));
  }
  bStack0000000000000127 = 5;
  uStack0000000000000110 = (undefined *)CONCAT26(uStack0000000000000110._6_2_,0x65676e6152);
  lVar4 = func_0x00063e9c();
  if (lVar4 != 0) {
    bStack0000000000000097 = 5;
    uStack0000000000000080._0_4_ = 0x676e6152;
    uStack0000000000000080._4_2_ = 0x65;
    func_0x0005cc80(&uStack0000000000000110,auStack_7ffffffe + 0x8000024e,&uStack0000000000000080,""
                    ,0);
    if ((char)bStack0000000000000097 < '\0') {
      __ZdlPv(CONCAT17(uStack0000000000000080._7_1_,
                       CONCAT16(uStack0000000000000080._6_1_,
                                CONCAT24(uStack0000000000000080._4_2_,
                                         (undefined4)uStack0000000000000080))));
    }
    uVar2 = func_0x0005cf1c(&uStack0000000000000110,unaff_x28 + 0x110);
    if ((uVar2 & 1) == 0) {
      in_stack_00000158 = 0x1a0;
      unaff_w24 = func_0x00061994();
      in_stack_00000368 = in_stack_00000360;
    }
    if (uVar2 == 0) goto LAB_0005b464;
  }
  plVar5 = *(long **)(in_stack_00000008 + 0x18);
  if (plVar5 != (long *)0x0) {
    (**(code **)(*plVar5 + 0x30))(plVar5,auStack_7ffffffe + 0x8000024e);
  }
  bStack0000000000000097 = 6;
  uStack0000000000000080._0_4_ = 0x65707845;
  uStack0000000000000080._4_2_ = 0x7463;
  uStack0000000000000080._6_1_ = 0;
  func_0x0005cc80(&uStack0000000000000110,auStack_7ffffffe + 0x8000024e,&uStack0000000000000080,"",0
                 );
  if ((char)bStack0000000000000097 < '\0') {
    __ZdlPv(CONCAT17(uStack0000000000000080._7_1_,
                     CONCAT16(uStack0000000000000080._6_1_,
                              CONCAT24(uStack0000000000000080._4_2_,
                                       (undefined4)uStack0000000000000080))));
  }
  uStack0000000000000110 = &UNK_009b8ad8;
  func_0x00065600(&uStack0000000000000110);
  (**(code **)(uStack0000000000000110 + 0x20))();
  unaff_x22 = (undefined *)
              func_0x0005d2d8(in_stack_00000048,auStack_7ffffffe + 0x8000024e,
                              &uStack0000000000000140);
  if ((int)unaff_x22 == 0) {
    if (in_stack_00000158 == -1) {
      in_stack_00000158 = 0x194;
    }
  }
  else {
    unaff_x22 = (undefined *)(unaff_x27 + 0xe0);
    if ((in_stack_00000158 == -1) &&
       (in_stack_00000158 = 200, in_stack_00000360 != in_stack_00000368)) {
      in_stack_00000158 = 0xce;
    }
    if (in_stack_00000237 < '\0') {
      if (in_stack_00000228 != 0) goto LAB_0005bbb4;
    }
    else if (in_stack_00000237 != '\0') {
      in_stack_00000220 = unaff_x22;
LAB_0005bbb4:
      uStack0000000000000110 = in_stack_00000220;
      func_0x0005ddf0(&uStack0000000000000060,&uStack0000000000000110);
      if ((*(char *)(uStack0000000000000060 + 0x18) == '\0') &&
         (*(long *)(uStack0000000000000060 + 0x10) == 0)) {
        if (in_stack_000001b0._7_1_ < '\0') {
          *(undefined1 *)CONCAT71(uStack00000000000001a1,uStack00000000000001a0) = 0;
          in_stack_000001a8 = 0;
        }
        else {
          uStack00000000000001a0 = 0;
          in_stack_000001b0._7_1_ = '\0';
        }
        plVar5 = &lStack00000000000001d8;
        in_stack_000001d0 = 0;
        if (in_stack_000001f0 == plVar5) {
          lVar4 = 4;
LAB_0005be40:
          (**(code **)(*plVar5 + lVar4 * 8))();
        }
        else if (in_stack_000001f0 != (long *)0x0) {
          lVar4 = 5;
          plVar5 = in_stack_000001f0;
          goto LAB_0005be40;
        }
        in_stack_00000158 = 0x194;
        unaff_w24 = func_0x00061994(in_stack_00000048);
        func_0x0000bf9c(&uStack0000000000000060);
        goto LAB_0005b464;
      }
      if ((char)in_stack_0000024f < '\0') {
        func_0x00017634(&uStack0000000000000110,in_stack_00000238,in_stack_00000240);
      }
      else {
        uStack0000000000000110 = in_stack_00000238;
        unaff_x25 = in_stack_00000240;
        bStack0000000000000127 = in_stack_0000024f;
      }
      if (-1 < (char)bStack0000000000000127) {
        unaff_x25 = (ulong)bStack0000000000000127;
      }
      if (unaff_x25 == 0) {
        func_0x0005de70(&uStack0000000000000080,unaff_x22,in_stack_00000048 + 0x98,
                        in_stack_00000048 + 0xb0);
        if ((char)bStack0000000000000127 < '\0') {
          __ZdlPv(uStack0000000000000110);
        }
        uStack0000000000000110 =
             (undefined *)
             CONCAT17(uStack0000000000000080._7_1_,
                      CONCAT16(uStack0000000000000080._6_1_,
                               CONCAT24(uStack0000000000000080._4_2_,
                                        (undefined4)uStack0000000000000080)));
        bStack0000000000000127 = bStack0000000000000097;
      }
      uVar6 = *(undefined8 *)(uStack0000000000000060 + 8);
      if (in_stack_00000068 != 0) {
        *(long *)(in_stack_00000068 + 8) = *(long *)(in_stack_00000068 + 8) + 1;
      }
      lStack00000000000000f0 = (long)&UNK_009b9178;
      in_stack_000000f8 = uStack0000000000000060;
      uStack0000000000000050 = 0;
      in_stack_00000058 = 0;
      in_stack_00000108 = &lStack00000000000000f0;
      in_stack_00000100 = in_stack_00000068;
      in_stack_000000e8 = (long *)0x0;
      func_0x0005e578(&uStack0000000000000140,uVar6,&uStack0000000000000110,&lStack00000000000000f0,
                      &lStack00000000000000d0);
      if (in_stack_000000e8 == &lStack00000000000000d0) {
        lVar4 = 4;
        plVar5 = &lStack00000000000000d0;
LAB_0005bcf0:
        (**(code **)(*plVar5 + lVar4 * 8))();
      }
      else if (in_stack_000000e8 != (long *)0x0) {
        lVar4 = 5;
        plVar5 = in_stack_000000e8;
        goto LAB_0005bcf0;
      }
      if (in_stack_00000108 == &lStack00000000000000f0) {
        lVar4 = 4;
        plVar5 = &lStack00000000000000f0;
LAB_0005bd20:
        (**(code **)(*plVar5 + lVar4 * 8))();
      }
      else if (in_stack_00000108 != (long *)0x0) {
        lVar4 = 5;
        plVar5 = in_stack_00000108;
        goto LAB_0005bd20;
      }
      func_0x0000bf9c(&uStack0000000000000050);
      if ((char)bStack0000000000000127 < '\0') {
        __ZdlPv(uStack0000000000000110);
      }
      func_0x0000bf9c(&uStack0000000000000060);
    }
    iVar3 = func_0x0005e728(auStack_7ffffffe + 0x8000024e,&uStack0000000000000140);
    if (iVar3 != 0) {
      if (in_stack_000001b0._7_1_ < '\0') {
        *(undefined1 *)CONCAT71(uStack00000000000001a1,uStack00000000000001a0) = 0;
        in_stack_000001a8 = 0;
      }
      else {
        uStack00000000000001a0 = 0;
        in_stack_000001b0._7_1_ = '\0';
      }
      plVar5 = &lStack00000000000001d8;
      in_stack_000001d0 = 0;
      if (in_stack_000001f0 == plVar5) {
        lVar4 = 4;
LAB_0005bdb4:
        (**(code **)(*plVar5 + lVar4 * 8))();
      }
      else if (in_stack_000001f0 != (long *)0x0) {
        lVar4 = 5;
        plVar5 = in_stack_000001f0;
        goto LAB_0005bdb4;
      }
      in_stack_00000158 = 0x1a0;
    }
  }
  unaff_w24 = func_0x00061994(in_stack_00000048);
LAB_0005b464:
  func_0x00070c58(&uStack0000000000000140);
  func_0x00070e14(auStack_7ffffffe + 0x8000024e);
  if (in_stack_000000c8._7_1_ < '\0') {
    __ZdlPv(in_stack_000000b8);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x68)) {
    ___stack_chk_fail();
    func_0x0001748c(unaff_x22);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x5c128);
    (*pcVar1)();
  }
  return unaff_w24 & 1;
}

