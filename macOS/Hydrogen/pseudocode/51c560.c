
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0051c560(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 *puVar5;
  long *plVar6;
  long *unaff_x19;
  long *unaff_x20;
  ulong unaff_x23;
  undefined1 auVar7 [16];
  undefined1 uStack_138;
  undefined7 uStack_137;
  undefined1 uStack_130;
  undefined7 uStack_12f;
  undefined8 uStack_120;
  undefined1 uStack_118;
  undefined7 uStack_117;
  undefined1 uStack_110;
  undefined7 uStack_10f;
  undefined1 uStack_108;
  undefined7 uStack_107;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined4 uStack_a8;
  undefined4 uStack_a4;
  undefined4 uStack_a0;
  undefined2 uStack_9c;
  undefined1 uStack_9a;
  undefined1 uStack_99;
  undefined2 uStack_98;
  undefined4 uStack_96;
  undefined1 uStack_92;
  undefined1 uStack_91;
  undefined2 uStack_90;
  undefined2 uStack_8e;
  undefined4 uStack_8c;
  undefined4 uStack_88;
  undefined4 uStack_84;
  undefined2 uStack_80;
  undefined4 uStack_7e;
  undefined1 uStack_7a;
  undefined1 uStack_79;
  undefined2 uStack_78;
  undefined4 uStack_76;
  undefined2 uStack_72;
  undefined4 uStack_70;
  undefined4 uStack_6c;
  undefined4 uStack_68;
  undefined2 uStack_64;
  undefined1 uStack_62;
  undefined1 uStack_61;
  undefined2 uStack_60;
  undefined4 uStack_5e;
  undefined1 uStack_5a;
  undefined1 uStack_59;
  undefined2 uStack_58;
  undefined2 uStack_56;
  undefined4 uStack_54;
  undefined4 uStack_50;
  undefined4 uStack_4c;
  undefined2 uStack_48;
  undefined4 uStack_46;
  undefined2 uStack_42;
  
  if ((((unaff_x23 & 1) == 0) && (lVar4 = *unaff_x20, lVar4 != -0x8000000000000000)) && (lVar4 != 0)
     ) {
    func_0x00187bd4(unaff_x20[1],lVar4,1);
  }
  if (*unaff_x19 == 0) {
    __Unwind_Resume();
  }
  plVar6 = (long *)((long)&MACH_HEADER.magic + 1);
  func_0x00187bd4(unaff_x19[1]);
  __Unwind_Resume();
  auVar7 = func_0x007a2668();
  puVar5 = auVar7._8_8_;
  uStack_f8 = 1;
  uStack_f0 = 0;
  uStack_e8 = 0;
  uStack_e0 = 8;
  uStack_100 = 0;
  uStack_120 = 2;
  uStack_b8 = 0;
  uStack_d0 = _UNK_0089f368;
  uStack_d8 = _UNK_0089f360;
  uStack_a8 = CONCAT31(uStack_a8._1_3_,3);
  uStack_a4 = CONCAT31(uStack_a4._1_3_,3);
  uStack_a0 = CONCAT31(uStack_a0._1_3_,3);
  uStack_9c = 0;
  uStack_9a = 3;
  uStack_96 = CONCAT31(uStack_96._1_3_,3);
  uStack_92 = 3;
  uStack_8e = 0;
  uStack_8c = CONCAT31(uStack_8c._1_3_,3);
  uStack_88 = CONCAT31(uStack_88._1_3_,3);
  uStack_84 = CONCAT31(uStack_84._1_3_,3);
  uStack_80 = 0;
  uStack_7e = CONCAT31(uStack_7e._1_3_,3);
  uStack_7a = 3;
  uStack_76 = CONCAT31(uStack_76._1_3_,3);
  uStack_72 = 0;
  uStack_70 = CONCAT31(uStack_70._1_3_,3);
  uStack_6c = CONCAT31(uStack_6c._1_3_,3);
  uStack_68 = CONCAT31(uStack_68._1_3_,3);
  uStack_64 = 0;
  uStack_62 = 3;
  uStack_5e = CONCAT31(uStack_5e._1_3_,3);
  uStack_5a = 3;
  uStack_56 = 0;
  uStack_54 = CONCAT31(uStack_54._1_3_,3);
  uStack_50 = CONCAT31(uStack_50._1_3_,3);
  uStack_4c = CONCAT31(uStack_4c._1_3_,3);
  uStack_48 = 0;
  uStack_46 = (undefined4)_UNK_008a6b08;
  puVar2 = (undefined8 *)func_0x00187bd0(0xe0,8);
  if (puVar2 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0xe0);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x51c790);
    (*pcVar1)();
  }
  puVar2[0x15] = CONCAT26(uStack_72,CONCAT42(uStack_76,uStack_78));
  puVar2[0x14] = CONCAT17(uStack_79,CONCAT16(uStack_7a,CONCAT42(uStack_7e,uStack_80)));
  puVar2[0x17] = CONCAT17(uStack_61,CONCAT16(uStack_62,CONCAT24(uStack_64,uStack_68)));
  puVar2[0x16] = CONCAT44(uStack_6c,uStack_70);
  puVar2[0x19] = CONCAT44(uStack_54,CONCAT22(uStack_56,uStack_58));
  puVar2[0x18] = CONCAT17(uStack_59,CONCAT16(uStack_5a,CONCAT42(uStack_5e,uStack_60)));
  puVar2[0x1b] = CONCAT26(uStack_42,CONCAT42(uStack_46,uStack_48));
  puVar2[0x1a] = CONCAT44(uStack_4c,uStack_50);
  puVar2[0xd] = uStack_b8;
  puVar2[0xc] = uStack_c0;
  puVar2[0xf] = CONCAT44(uStack_a4,uStack_a8);
  puVar2[0xe] = uStack_b0;
  puVar2[0x11] = CONCAT17(uStack_91,CONCAT16(uStack_92,CONCAT42(uStack_96,uStack_98)));
  puVar2[0x10] = CONCAT17(uStack_99,CONCAT16(uStack_9a,CONCAT24(uStack_9c,uStack_a0)));
  puVar2[0x13] = CONCAT44(uStack_84,uStack_88);
  puVar2[0x12] = CONCAT44(uStack_8c,CONCAT22(uStack_8e,uStack_90));
  puVar2[5] = uStack_f8;
  puVar2[4] = uStack_100;
  puVar2[7] = uStack_e8;
  puVar2[6] = uStack_f0;
  puVar2[9] = uStack_d8;
  puVar2[8] = uStack_e0;
  puVar2[0xb] = uStack_c8;
  puVar2[10] = uStack_d0;
  puVar2[1] = CONCAT71(uStack_117,uStack_118);
  *puVar2 = uStack_120;
  puVar2[3] = CONCAT71(uStack_107,uStack_108);
  puVar2[2] = CONCAT71(uStack_10f,uStack_110);
  uVar3 = func_0x0051ab00(puVar2,auVar7._0_8_);
  uStack_130 = (undefined1)puVar5[1];
  uStack_12f = (undefined7)((ulong)puVar5[1] >> 8);
  uStack_138 = (undefined1)*puVar5;
  uStack_137 = (undefined7)((ulong)*puVar5 >> 8);
  uStack_100 = puVar5[2];
  uStack_120._0_1_ = 1;
  uStack_118 = 3;
  uStack_10f = uStack_137;
  uStack_110 = uStack_138;
  uStack_108 = uStack_130;
  uStack_107 = uStack_12f;
  uVar3 = func_0x0051b0f8(uVar3,&uStack_120);
  if (*plVar6 != -0x8000000000000000) {
    uStack_110 = (undefined1)plVar6[1];
    uStack_10f = (undefined7)((ulong)plVar6[1] >> 8);
    uStack_118 = (undefined1)*plVar6;
    uStack_117 = (undefined7)((ulong)*plVar6 >> 8);
    uStack_108 = (undefined1)plVar6[2];
    uStack_107 = (undefined7)((ulong)plVar6[2] >> 8);
    uStack_120 = CONCAT71(uStack_120._1_7_,4);
    func_0x0051b078(uVar3,0xf,&uStack_120);
  }
  return;
}

