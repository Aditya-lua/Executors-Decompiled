
undefined8 FUN_000642dc(void)

{
  long *plVar1;
  ulong uVar2;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  ulong unaff_x26;
  char unaff_w27;
  undefined2 unaff_w28;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  undefined8 uStack0000000000000018;
  undefined6 uStack0000000000000020;
  char cStack0000000000000026;
  undefined1 uStack0000000000000027;
  char cStack000000000000002f;
  undefined1 uStack0000000000000030;
  
  while( true ) {
    unaff_x25 = unaff_x25 + 0x10;
    if ((ulong)(*(long *)(unaff_x24 + 0x118) - *(long *)(unaff_x24 + 0x110) >> 4) <= unaff_x26) {
      cStack000000000000002f = '\x02';
      uStack0000000000000018._0_2_ = 0x2d2d;
      uStack0000000000000018._2_4_ = (uint)uStack0000000000000018._3_3_ << 8;
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      if (cStack000000000000002f < '\0') {
        __ZdlPv(CONCAT17(uStack0000000000000018._7_1_,
                         CONCAT16(uStack0000000000000018._6_1_,
                                  CONCAT42(uStack0000000000000018._2_4_,
                                           (undefined2)uStack0000000000000018))));
      }
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      cStack000000000000002f = '\x02';
      uStack0000000000000018._0_2_ = 0x2d2d;
      uStack0000000000000018._2_4_ = uStack0000000000000018._2_4_ & 0xffffff00;
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      if (cStack000000000000002f < '\0') {
        __ZdlPv(CONCAT17(uStack0000000000000018._7_1_,
                         CONCAT16(uStack0000000000000018._6_1_,
                                  CONCAT42(uStack0000000000000018._2_4_,
                                           (undefined2)uStack0000000000000018))));
      }
      return 1;
    }
    uStack0000000000000018._0_2_ = 0x2d2d;
    uStack0000000000000018._2_4_ = (uint)uStack0000000000000018._3_3_ << 8;
    cStack000000000000002f = unaff_w27;
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    if (cStack000000000000002f < '\0') {
      __ZdlPv(CONCAT17(uStack0000000000000018._7_1_,
                       CONCAT16(uStack0000000000000018._6_1_,
                                CONCAT42(uStack0000000000000018._2_4_,
                                         (undefined2)uStack0000000000000018))));
    }
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    uStack0000000000000018._2_4_ = uStack0000000000000018._2_4_ & 0xffffff00;
    uStack0000000000000018._0_2_ = unaff_w28;
    cStack000000000000002f = unaff_w27;
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    if (cStack000000000000002f < '\0') {
      __ZdlPv(CONCAT17(uStack0000000000000018._7_1_,
                       CONCAT16(uStack0000000000000018._6_1_,
                                CONCAT42(uStack0000000000000018._2_4_,
                                         (undefined2)uStack0000000000000018))));
      uVar2 = *(ulong *)(unaff_x23 + 8);
      if (-1 < (char)*(byte *)(unaff_x23 + 0x17)) {
        uVar2 = (ulong)*(byte *)(unaff_x23 + 0x17);
      }
    }
    else {
      uVar2 = *(ulong *)(unaff_x23 + 8);
      if (-1 < (char)*(byte *)(unaff_x23 + 0x17)) {
        uVar2 = (ulong)*(byte *)(unaff_x23 + 0x17);
      }
    }
    if (uVar2 != 0) {
      cStack000000000000002f = '\x0e';
      uStack0000000000000018._0_2_ = s_Content_Type__008d1b5f._0_2_;
      uStack0000000000000018._2_4_ = s_Content_Type__008d1b5f._2_4_;
      uStack0000000000000018._6_1_ = s_Content_Type__008d1b5f[6];
      uStack0000000000000018._7_1_ = s_Content_Type__008d1b5f[7];
      cStack0000000000000026 = 0;
      uStack0000000000000020 = s_Content_Type__008d1b5f._8_6_;
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      if (cStack000000000000002f < '\0') {
        __ZdlPv(CONCAT17(uStack0000000000000018._7_1_,
                         CONCAT16(uStack0000000000000018._6_1_,
                                  CONCAT42(uStack0000000000000018._2_4_,
                                           (undefined2)uStack0000000000000018))));
      }
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      uStack0000000000000018._2_4_ = uStack0000000000000018._2_4_ & 0xffffff00;
      uStack0000000000000018._0_2_ = unaff_w28;
      cStack000000000000002f = unaff_w27;
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      if (cStack000000000000002f < '\0') {
        __ZdlPv(CONCAT17(uStack0000000000000018._7_1_,
                         CONCAT16(uStack0000000000000018._6_1_,
                                  CONCAT42(uStack0000000000000018._2_4_,
                                           (undefined2)uStack0000000000000018))));
      }
    }
    plVar1 = (long *)(*(long *)(unaff_x24 + 0x110) + unaff_x25);
    uStack0000000000000008 = *plVar1;
    in_stack_00000010 = (plVar1[1] - uStack0000000000000008) + 1;
    cStack000000000000002f = '\x0f';
    uStack0000000000000018._0_2_ = s_Content_Range__008d1b6e._0_2_;
    uStack0000000000000018._2_4_ = s_Content_Range__008d1b6e._2_4_;
    uStack0000000000000018._6_1_ = s_Content_Range__008d1b6e[6];
    uStack0000000000000018._7_1_ = s_Content_Range__008d1b6e[7];
    uStack0000000000000020 = s_Content_Range__008d1b6e._8_6_;
    cStack0000000000000026 = s_Content_Range__008d1b6e[0xe];
    uStack0000000000000027 = 0;
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    if (cStack000000000000002f < '\0') {
      __ZdlPv(CONCAT17(uStack0000000000000018._7_1_,
                       CONCAT16(uStack0000000000000018._6_1_,
                                CONCAT42(uStack0000000000000018._2_4_,
                                         (undefined2)uStack0000000000000018))));
    }
    func_0x00063120(&uStack0000000000000018,&uStack0000000000000008);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    if (cStack000000000000002f < '\0') {
      __ZdlPv(CONCAT17(uStack0000000000000018._7_1_,
                       CONCAT16(uStack0000000000000018._6_1_,
                                CONCAT42(uStack0000000000000018._2_4_,
                                         (undefined2)uStack0000000000000018))));
    }
    uStack0000000000000018._2_4_ = uStack0000000000000018._2_4_ & 0xffffff00;
    uStack0000000000000018._0_2_ = unaff_w28;
    cStack000000000000002f = unaff_w27;
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    if (cStack000000000000002f < '\0') {
      __ZdlPv(CONCAT17(uStack0000000000000018._7_1_,
                       CONCAT16(uStack0000000000000018._6_1_,
                                CONCAT42(uStack0000000000000018._2_4_,
                                         (undefined2)uStack0000000000000018))));
    }
    uStack0000000000000018._2_4_ = uStack0000000000000018._2_4_ & 0xffffff00;
    uStack0000000000000018._0_2_ = unaff_w28;
    cStack000000000000002f = unaff_w27;
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    if (cStack000000000000002f < '\0') {
      __ZdlPv(CONCAT17(uStack0000000000000018._7_1_,
                       CONCAT16(uStack0000000000000018._6_1_,
                                CONCAT42(uStack0000000000000018._2_4_,
                                         (undefined2)uStack0000000000000018))));
    }
    uVar2 = func_0x00064660(&uStack0000000000000030,uStack0000000000000008,in_stack_00000010);
    if ((uVar2 & 1) == 0) break;
    uStack0000000000000018._2_4_ = uStack0000000000000018._2_4_ & 0xffffff00;
    uStack0000000000000018._0_2_ = unaff_w28;
    cStack000000000000002f = unaff_w27;
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    if (cStack000000000000002f < '\0') {
      __ZdlPv(CONCAT17(uStack0000000000000018._7_1_,
                       CONCAT16(uStack0000000000000018._6_1_,
                                CONCAT42(uStack0000000000000018._2_4_,
                                         (undefined2)uStack0000000000000018))));
    }
    unaff_x26 = unaff_x26 + 1;
  }
  return 0;
}

