
undefined8 FUN_00068838(undefined8 param_1)

{
  long lVar1;
  undefined6 uVar2;
  undefined6 uVar3;
  undefined2 uVar4;
  undefined2 uVar5;
  undefined6 uVar6;
  undefined6 uVar7;
  bool bVar8;
  int iVar9;
  long lVar10;
  undefined8 uVar11;
  long unaff_x19;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  char cStack0000000000000010;
  char cStack0000000000000011;
  char cStack0000000000000012;
  char cStack0000000000000013;
  char cStack0000000000000014;
  char cStack0000000000000015;
  undefined1 uStack0000000000000016;
  undefined8 in_stack_00000018;
  undefined6 uStack0000000000000020;
  char cStack0000000000000026;
  char cStack0000000000000027;
  char cStack0000000000000028;
  char cStack0000000000000029;
  char cStack000000000000002a;
  char cStack000000000000002b;
  char cStack000000000000002c;
  char cStack000000000000002d;
  undefined1 uStack000000000000002e;
  char cStack0000000000000037;
  
  iVar9 = _memcmp(param_1,"PATCH");
  uVar6 = s_Content_Length_008d1a55._8_6_;
  uVar4 = s_Content_Length_008d1a55._6_2_;
  uVar2 = s_Content_Length_008d1a55._0_6_;
  if (iVar9 != 0) {
    cStack0000000000000037 = '\x0e';
    uStack0000000000000020._0_1_ = s_Content_Length_008d1a55[0];
    uStack0000000000000020._1_1_ = s_Content_Length_008d1a55[1];
    uStack0000000000000020._2_1_ = s_Content_Length_008d1a55[2];
    uStack0000000000000020._3_1_ = s_Content_Length_008d1a55[3];
    uStack0000000000000020._4_1_ = s_Content_Length_008d1a55[4];
    uStack0000000000000020._5_1_ = s_Content_Length_008d1a55[5];
    cStack0000000000000026 = s_Content_Length_008d1a55[6];
    cStack0000000000000027 = s_Content_Length_008d1a55[7];
    cStack0000000000000028 = s_Content_Length_008d1a55[8];
    cStack0000000000000029 = s_Content_Length_008d1a55[9];
    cStack000000000000002a = s_Content_Length_008d1a55[10];
    cStack000000000000002b = s_Content_Length_008d1a55[0xb];
    cStack000000000000002c = s_Content_Length_008d1a55[0xc];
    cStack000000000000002d = s_Content_Length_008d1a55[0xd];
    uStack000000000000002e = 0;
    lVar1 = unaff_x19 + 0x48;
    lVar10 = func_0x00063e9c(lVar1,&uStack0000000000000020);
    uVar7 = s_Content_Length_008d1a55._8_6_;
    uVar5 = s_Content_Length_008d1a55._6_2_;
    uVar3 = s_Content_Length_008d1a55._0_6_;
    if (lVar10 == 0) {
      bVar8 = false;
    }
    else {
      in_stack_00000018._7_1_ = '\x0e';
      s_Content_Length_008d1a55[0] = (char)uVar2;
      s_Content_Length_008d1a55[1] = SUB61(uVar2,1);
      s_Content_Length_008d1a55[2] = SUB61(uVar2,2);
      s_Content_Length_008d1a55[3] = SUB61(uVar2,3);
      s_Content_Length_008d1a55[4] = SUB61(uVar2,4);
      s_Content_Length_008d1a55[5] = SUB61(uVar2,5);
      uStack0000000000000008._0_1_ = s_Content_Length_008d1a55[0];
      uStack0000000000000008._1_1_ = s_Content_Length_008d1a55[1];
      uStack0000000000000008._2_1_ = s_Content_Length_008d1a55[2];
      uStack0000000000000008._3_1_ = s_Content_Length_008d1a55[3];
      uStack0000000000000008._4_1_ = s_Content_Length_008d1a55[4];
      uStack0000000000000008._5_1_ = s_Content_Length_008d1a55[5];
      s_Content_Length_008d1a55[6] = (char)uVar4;
      s_Content_Length_008d1a55[7] = SUB21(uVar4,1);
      uStack0000000000000008._6_1_ = s_Content_Length_008d1a55[6];
      uStack0000000000000008._7_1_ = s_Content_Length_008d1a55[7];
      s_Content_Length_008d1a55[8] = (char)uVar6;
      s_Content_Length_008d1a55[9] = SUB61(uVar6,1);
      s_Content_Length_008d1a55[10] = SUB61(uVar6,2);
      s_Content_Length_008d1a55[0xb] = SUB61(uVar6,3);
      s_Content_Length_008d1a55[0xc] = SUB61(uVar6,4);
      s_Content_Length_008d1a55[0xd] = SUB61(uVar6,5);
      cStack0000000000000010 = s_Content_Length_008d1a55[8];
      cStack0000000000000011 = s_Content_Length_008d1a55[9];
      cStack0000000000000012 = s_Content_Length_008d1a55[10];
      cStack0000000000000013 = s_Content_Length_008d1a55[0xb];
      cStack0000000000000014 = s_Content_Length_008d1a55[0xc];
      cStack0000000000000015 = s_Content_Length_008d1a55[0xd];
      uStack0000000000000016 = 0;
      s_Content_Length_008d1a55._0_6_ = uVar3;
      s_Content_Length_008d1a55._6_2_ = uVar5;
      s_Content_Length_008d1a55._8_6_ = uVar7;
      *(undefined1 *)(unaff_x29 + -0x21) = 0;
      lVar10 = func_0x00069608(lVar1,&uStack0000000000000008,0,0,unaff_x29 + -0x21);
      bVar8 = lVar10 != 0;
      if (in_stack_00000018._7_1_ < '\0') {
        __ZdlPv(CONCAT26(uStack0000000000000008._6_2_,(undefined6)uStack0000000000000008));
      }
    }
    if (cStack0000000000000037 < '\0') {
      __ZdlPv(CONCAT26(_cStack0000000000000026,uStack0000000000000020));
    }
    if (!bVar8) {
      uVar11 = func_0x000692e4(lVar1);
      return uVar11;
    }
  }
  return 1;
}

