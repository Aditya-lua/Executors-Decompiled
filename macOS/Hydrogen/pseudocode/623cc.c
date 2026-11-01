
void FUN_000623cc(void)

{
  ulong uVar1;
  undefined8 *puVar2;
  ulong uVar3;
  ulong *puVar4;
  long *plVar5;
  byte bVar6;
  code *pcVar7;
  int iVar8;
  char *pcVar9;
  undefined8 *puVar10;
  long lVar11;
  uint in_w8;
  ulong uVar12;
  ulong uVar13;
  long unaff_x19;
  undefined8 *unaff_x21;
  long unaff_x22;
  undefined8 unaff_x25;
  undefined8 *puVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uStack0000000000000010;
  char cStack0000000000000018;
  char cStack0000000000000019;
  char cStack000000000000001a;
  char cStack000000000000001b;
  char cStack000000000000001c;
  char cStack000000000000001d;
  char cStack000000000000001e;
  char cStack000000000000001f;
  undefined7 uStack0000000000000020;
  byte bStack0000000000000027;
  undefined7 in_stack_00000028;
  char cStack000000000000002f;
  undefined1 uStack0000000000000030;
  char cStack0000000000000031;
  char cStack0000000000000032;
  char cStack0000000000000033;
  char cStack0000000000000034;
  char cStack0000000000000035;
  char cStack0000000000000036;
  char cStack0000000000000037;
  uint uStack0000000000000038;
  char cStack000000000000003c;
  char cStack000000000000003d;
  char cStack000000000000003e;
  char cStack000000000000003f;
  undefined7 uStack0000000000000040;
  
  uStack0000000000000038 = in_w8 & 0xffff | 0x65700000;
  _uStack0000000000000030 = (undefined6)unaff_x25;
  _cStack0000000000000036 = (undefined2)((ulong)unaff_x25 >> 0x30);
  cStack000000000000003c = '\0';
  bVar6 = *(byte *)((long)unaff_x21 + 0x17);
  uVar13 = unaff_x21[1];
  if (-1 < (char)bVar6) {
    uVar13 = (ulong)bVar6;
  }
  uVar1 = uVar13 + 0x1f;
  if (0x7ffffffffffffff7 < uVar1) {
    func_0x0001748c(&uStack0000000000000010);
    goto code_r0x00062a00;
  }
  if (uVar1 < 0x17) {
    _cStack0000000000000018 = s_multipart_byteranges__boundary__008d1a78._8_5_;
    cStack000000000000001d = s_multipart_byteranges__boundary__008d1a78[0xd];
    cStack000000000000001e = s_multipart_byteranges__boundary__008d1a78[0xe];
    uStack0000000000000010._0_2_ = s_multipart_byteranges__boundary__008d1a78._0_2_;
    uStack0000000000000010._2_1_ = s_multipart_byteranges__boundary__008d1a78[2];
    uStack0000000000000010._3_1_ = s_multipart_byteranges__boundary__008d1a78[3];
    uStack0000000000000010._4_1_ = s_multipart_byteranges__boundary__008d1a78[4];
    uStack0000000000000010._5_1_ = s_multipart_byteranges__boundary__008d1a78[5];
    uStack0000000000000010._6_1_ = s_multipart_byteranges__boundary__008d1a78[6];
    uStack0000000000000010._7_1_ = s_multipart_byteranges__boundary__008d1a78[7];
    bStack0000000000000027 = s_multipart_byteranges__boundary__008d1a78[0x17];
    in_stack_00000028 = s_multipart_byteranges__boundary__008d1a78._24_7_;
    cStack000000000000001f = s_multipart_byteranges__boundary__008d1a78[0xf];
    uStack0000000000000020 = s_multipart_byteranges__boundary__008d1a78._16_7_;
    pcVar9 = &cStack000000000000002f;
LAB_0006247c:
    puVar2 = (undefined8 *)*unaff_x21;
    if (-1 < (char)bVar6) {
      puVar2 = unaff_x21;
    }
    _memmove(pcVar9,puVar2,uVar13);
  }
  else {
    uVar12 = (uVar1 & 0xfffffffffffffff8) + 8;
    if ((uVar1 | 7) != 0x17) {
      uVar12 = uVar1 | 7;
    }
    lVar11 = uVar12 + 1;
    pcVar9 = (char *)__Znwm(lVar11);
    uVar15 = s_multipart_byteranges__boundary__008d1a78._0_8_;
    bStack0000000000000027 = (byte)((ulong)lVar11 >> 0x38) | 0x80;
    _cStack0000000000000018 = (undefined5)uVar1;
    cStack000000000000001d = (char)(uVar1 >> 0x28);
    cStack000000000000001e = (char)(uVar1 >> 0x30);
    cStack000000000000001f = (char)(uVar1 >> 0x38);
    uStack0000000000000020 = (undefined7)lVar11;
    uStack0000000000000010._0_2_ = SUB82(pcVar9,0);
    uStack0000000000000010._2_1_ = (char)((ulong)pcVar9 >> 0x10);
    uStack0000000000000010._3_1_ = (char)((ulong)pcVar9 >> 0x18);
    uStack0000000000000010._4_1_ = (char)((ulong)pcVar9 >> 0x20);
    uStack0000000000000010._5_1_ = (char)((ulong)pcVar9 >> 0x28);
    uStack0000000000000010._6_1_ = (char)((ulong)pcVar9 >> 0x30);
    uStack0000000000000010._7_1_ = (char)((ulong)pcVar9 >> 0x38);
    *(ulong *)(pcVar9 + 8) =
         CONCAT17(s_multipart_byteranges__boundary__008d1a78[0xf],
                  s_multipart_byteranges__boundary__008d1a78._8_7_);
    *(undefined8 *)pcVar9 = uVar15;
    uVar15 = CONCAT71(s_multipart_byteranges__boundary__008d1a78._16_7_,
                      s_multipart_byteranges__boundary__008d1a78[0xf]);
    *(undefined8 *)(pcVar9 + 0x17) = s_multipart_byteranges__boundary__008d1a78._23_8_;
    *(undefined8 *)(pcVar9 + 0xf) = uVar15;
    pcVar9 = pcVar9 + 0x1f;
    if (uVar13 != 0) goto LAB_0006247c;
  }
  pcVar9[uVar13] = '\0';
  func_0x0005dd28();
  if ((char)bStack0000000000000027 < '\0') {
    __ZdlPv(CONCAT17(uStack0000000000000010._7_1_,
                     CONCAT16(uStack0000000000000010._6_1_,
                              CONCAT15(uStack0000000000000010._5_1_,
                                       CONCAT14(uStack0000000000000010._4_1_,
                                                CONCAT13(uStack0000000000000010._3_1_,
                                                         CONCAT12(uStack0000000000000010._2_1_,
                                                                  (undefined2)uStack0000000000000010
                                                                 )))))));
  }
  if ((long)_uStack0000000000000040 < 0) {
    __ZdlPv(CONCAT26(_cStack0000000000000036,_uStack0000000000000030));
  }
  iVar8 = func_0x00062e58();
  uVar13 = *(ulong *)(unaff_x19 + 0x68);
  if (-1 < (char)*(byte *)(unaff_x19 + 0x77)) {
    uVar13 = (ulong)*(byte *)(unaff_x19 + 0x77);
  }
  if (uVar13 == 0) {
    lVar11 = *(long *)(unaff_x19 + 0x90);
    if (lVar11 == 0) {
      if (*(long *)(unaff_x19 + 0xb0) == 0) {
        return;
      }
      if (*(char *)(unaff_x19 + 0xd8) == '\0') {
        return;
      }
      _uStack0000000000000040 = CONCAT17(0x11,uStack0000000000000040);
      _uStack0000000000000040 = CONCAT62(stack0x00000042,0x67);
      uStack0000000000000038 = s_Transfer_Encoding_008d1aa6._8_4_;
      cStack000000000000003c = s_Transfer_Encoding_008d1aa6[0xc];
      cStack000000000000003d = s_Transfer_Encoding_008d1aa6[0xd];
      cStack000000000000003e = s_Transfer_Encoding_008d1aa6[0xe];
      cStack000000000000003f = s_Transfer_Encoding_008d1aa6[0xf];
      _uStack0000000000000030 = s_Transfer_Encoding_008d1aa6._0_6_;
      _cStack0000000000000036 = s_Transfer_Encoding_008d1aa6._6_2_;
      bStack0000000000000027 = '\a';
      uStack0000000000000010._0_2_ = 0x6863;
      uStack0000000000000010._2_1_ = 0x75;
      uStack0000000000000010._3_1_ = 'n';
      uStack0000000000000010._4_1_ = 'k';
      uStack0000000000000010._5_1_ = 'e';
      uStack0000000000000010._6_1_ = 'd';
      uStack0000000000000010._7_1_ = '\0';
      func_0x0005dd28();
      if ((char)bStack0000000000000027 < '\0') {
        __ZdlPv(CONCAT17(uStack0000000000000010._7_1_,
                         CONCAT16(uStack0000000000000010._6_1_,
                                  CONCAT15(uStack0000000000000010._5_1_,
                                           CONCAT14(uStack0000000000000010._4_1_,
                                                    CONCAT13(uStack0000000000000010._3_1_,
                                                             CONCAT12(uStack0000000000000010._2_1_,
                                                                      (undefined2)
                                                                      uStack0000000000000010)))))));
      }
      if ((long)_uStack0000000000000040 < 0) {
        __ZdlPv(CONCAT26(_cStack0000000000000036,_uStack0000000000000030));
      }
      _cStack0000000000000036 = s_Content_Encoding_008d1ac0._6_2_;
      _uStack0000000000000030 = s_Content_Encoding_008d1ac0._0_6_;
      cStack000000000000003c = s_Content_Encoding_008d1ac0[0xc];
      cStack000000000000003d = s_Content_Encoding_008d1ac0[0xd];
      cStack000000000000003e = s_Content_Encoding_008d1ac0[0xe];
      cStack000000000000003f = s_Content_Encoding_008d1ac0[0xf];
      uStack0000000000000038 = s_Content_Encoding_008d1ac0._8_4_;
      if (iVar8 == 3) {
        _uStack0000000000000040 = CONCAT17(0x10,uStack0000000000000040);
        _uStack0000000000000040 = _uStack0000000000000040 & 0xffffffffffffff00;
        bStack0000000000000027 = 4;
        uStack0000000000000010._0_2_ = 0x737a;
        uStack0000000000000010._2_1_ = 't';
        uStack0000000000000010._3_1_ = 'd';
        uStack0000000000000010._4_1_ = '\0';
        func_0x0005dd28();
      }
      else if (iVar8 == 2) {
        _uStack0000000000000040 = CONCAT17(0x10,uStack0000000000000040);
        _uStack0000000000000040 = _uStack0000000000000040 & 0xffffffffffffff00;
        bStack0000000000000027 = 2;
        uStack0000000000000010._0_2_ = 0x7262;
        uStack0000000000000010._2_1_ = '\0';
        func_0x0005dd28();
      }
      else {
        if (iVar8 != 1) {
          s_Content_Length_008d1a55[0] = s_Content_Length_008d1a55[0];
          s_Content_Length_008d1a55[1] = s_Content_Length_008d1a55[1];
          s_Content_Length_008d1a55[2] = s_Content_Length_008d1a55[2];
          s_Content_Length_008d1a55[3] = s_Content_Length_008d1a55[3];
          s_Content_Length_008d1a55[4] = s_Content_Length_008d1a55[4];
          s_Content_Length_008d1a55[5] = s_Content_Length_008d1a55[5];
          s_Content_Length_008d1a55[6] = s_Content_Length_008d1a55[6];
          s_Content_Length_008d1a55[7] = s_Content_Length_008d1a55[7];
          s_Content_Length_008d1a55[8] = s_Content_Length_008d1a55[8];
          s_Content_Length_008d1a55[9] = s_Content_Length_008d1a55[9];
          s_Content_Length_008d1a55[10] = s_Content_Length_008d1a55[10];
          s_Content_Length_008d1a55[0xb] = s_Content_Length_008d1a55[0xb];
          s_Content_Length_008d1a55[0xc] = s_Content_Length_008d1a55[0xc];
          s_Content_Length_008d1a55[0xd] = s_Content_Length_008d1a55[0xd];
          s_multipart_byteranges__boundary__008d1a78[0] =
               s_multipart_byteranges__boundary__008d1a78[0];
          s_multipart_byteranges__boundary__008d1a78[1] =
               s_multipart_byteranges__boundary__008d1a78[1];
          s_multipart_byteranges__boundary__008d1a78[2] =
               s_multipart_byteranges__boundary__008d1a78[2];
          s_multipart_byteranges__boundary__008d1a78[3] =
               s_multipart_byteranges__boundary__008d1a78[3];
          s_multipart_byteranges__boundary__008d1a78[4] =
               s_multipart_byteranges__boundary__008d1a78[4];
          s_multipart_byteranges__boundary__008d1a78[5] =
               s_multipart_byteranges__boundary__008d1a78[5];
          s_multipart_byteranges__boundary__008d1a78[6] =
               s_multipart_byteranges__boundary__008d1a78[6];
          s_multipart_byteranges__boundary__008d1a78[7] =
               s_multipart_byteranges__boundary__008d1a78[7];
          s_multipart_byteranges__boundary__008d1a78[8] =
               s_multipart_byteranges__boundary__008d1a78[8];
          s_multipart_byteranges__boundary__008d1a78[9] =
               s_multipart_byteranges__boundary__008d1a78[9];
          s_multipart_byteranges__boundary__008d1a78[10] =
               s_multipart_byteranges__boundary__008d1a78[10];
          s_multipart_byteranges__boundary__008d1a78[0xb] =
               s_multipart_byteranges__boundary__008d1a78[0xb];
          s_multipart_byteranges__boundary__008d1a78[0xc] =
               s_multipart_byteranges__boundary__008d1a78[0xc];
          s_multipart_byteranges__boundary__008d1a78[0xd] =
               s_multipart_byteranges__boundary__008d1a78[0xd];
          s_multipart_byteranges__boundary__008d1a78[0xe] =
               s_multipart_byteranges__boundary__008d1a78[0xe];
          s_multipart_byteranges__boundary__008d1a78[0x10] =
               s_multipart_byteranges__boundary__008d1a78[0x10];
          s_multipart_byteranges__boundary__008d1a78[0x11] =
               s_multipart_byteranges__boundary__008d1a78[0x11];
          s_multipart_byteranges__boundary__008d1a78[0x12] =
               s_multipart_byteranges__boundary__008d1a78[0x12];
          s_multipart_byteranges__boundary__008d1a78[0x13] =
               s_multipart_byteranges__boundary__008d1a78[0x13];
          s_multipart_byteranges__boundary__008d1a78[0x14] =
               s_multipart_byteranges__boundary__008d1a78[0x14];
          s_multipart_byteranges__boundary__008d1a78[0x15] =
               s_multipart_byteranges__boundary__008d1a78[0x15];
          s_multipart_byteranges__boundary__008d1a78[0x16] =
               s_multipart_byteranges__boundary__008d1a78[0x16];
          s_multipart_byteranges__boundary__008d1a78[0x17] =
               s_multipart_byteranges__boundary__008d1a78[0x17];
          s_multipart_byteranges__boundary__008d1a78[0x18] =
               s_multipart_byteranges__boundary__008d1a78[0x18];
          s_multipart_byteranges__boundary__008d1a78[0x19] =
               s_multipart_byteranges__boundary__008d1a78[0x19];
          s_multipart_byteranges__boundary__008d1a78[0x1a] =
               s_multipart_byteranges__boundary__008d1a78[0x1a];
          s_multipart_byteranges__boundary__008d1a78[0x1b] =
               s_multipart_byteranges__boundary__008d1a78[0x1b];
          s_multipart_byteranges__boundary__008d1a78[0x1c] =
               s_multipart_byteranges__boundary__008d1a78[0x1c];
          s_multipart_byteranges__boundary__008d1a78[0x1d] =
               s_multipart_byteranges__boundary__008d1a78[0x1d];
          s_multipart_byteranges__boundary__008d1a78[0x1e] =
               s_multipart_byteranges__boundary__008d1a78[0x1e];
          s_Content_Range_008d1a98[0] = s_Content_Range_008d1a98[0];
          s_Content_Range_008d1a98[1] = s_Content_Range_008d1a98[1];
          s_Content_Range_008d1a98[2] = s_Content_Range_008d1a98[2];
          s_Content_Range_008d1a98[3] = s_Content_Range_008d1a98[3];
          s_Content_Range_008d1a98[4] = s_Content_Range_008d1a98[4];
          s_Content_Range_008d1a98[5] = s_Content_Range_008d1a98[5];
          s_Content_Range_008d1a98[6] = s_Content_Range_008d1a98[6];
          s_Content_Range_008d1a98[7] = s_Content_Range_008d1a98[7];
          s_Content_Range_008d1a98[8] = s_Content_Range_008d1a98[8];
          s_Content_Range_008d1a98[9] = s_Content_Range_008d1a98[9];
          s_Content_Range_008d1a98[10] = s_Content_Range_008d1a98[10];
          s_Content_Range_008d1a98[0xb] = s_Content_Range_008d1a98[0xb];
          s_Content_Range_008d1a98[0xc] = s_Content_Range_008d1a98[0xc];
          s_Transfer_Encoding_008d1aa6[0] = s_Transfer_Encoding_008d1aa6[0];
          s_Transfer_Encoding_008d1aa6[1] = s_Transfer_Encoding_008d1aa6[1];
          s_Transfer_Encoding_008d1aa6[2] = s_Transfer_Encoding_008d1aa6[2];
          s_Transfer_Encoding_008d1aa6[3] = s_Transfer_Encoding_008d1aa6[3];
          s_Transfer_Encoding_008d1aa6[4] = s_Transfer_Encoding_008d1aa6[4];
          s_Transfer_Encoding_008d1aa6[5] = s_Transfer_Encoding_008d1aa6[5];
          s_Transfer_Encoding_008d1aa6[6] = s_Transfer_Encoding_008d1aa6[6];
          s_Transfer_Encoding_008d1aa6[7] = s_Transfer_Encoding_008d1aa6[7];
          s_Transfer_Encoding_008d1aa6[8] = s_Transfer_Encoding_008d1aa6[8];
          s_Transfer_Encoding_008d1aa6[9] = s_Transfer_Encoding_008d1aa6[9];
          s_Transfer_Encoding_008d1aa6[10] = s_Transfer_Encoding_008d1aa6[10];
          s_Transfer_Encoding_008d1aa6[0xb] = s_Transfer_Encoding_008d1aa6[0xb];
          s_Transfer_Encoding_008d1aa6[0xc] = s_Transfer_Encoding_008d1aa6[0xc];
          s_Transfer_Encoding_008d1aa6[0xd] = s_Transfer_Encoding_008d1aa6[0xd];
          s_Transfer_Encoding_008d1aa6[0xe] = s_Transfer_Encoding_008d1aa6[0xe];
          s_Transfer_Encoding_008d1aa6[0xf] = s_Transfer_Encoding_008d1aa6[0xf];
          s_Content_Encoding_008d1ac0[0] = s_Content_Encoding_008d1ac0[0];
          s_Content_Encoding_008d1ac0[1] = s_Content_Encoding_008d1ac0[1];
          s_Content_Encoding_008d1ac0[2] = s_Content_Encoding_008d1ac0[2];
          s_Content_Encoding_008d1ac0[3] = s_Content_Encoding_008d1ac0[3];
          s_Content_Encoding_008d1ac0[4] = s_Content_Encoding_008d1ac0[4];
          s_Content_Encoding_008d1ac0[5] = s_Content_Encoding_008d1ac0[5];
          s_Content_Encoding_008d1ac0[6] = s_Content_Encoding_008d1ac0[6];
          s_Content_Encoding_008d1ac0[7] = s_Content_Encoding_008d1ac0[7];
          s_Content_Encoding_008d1ac0[8] = s_Content_Encoding_008d1ac0[8];
          s_Content_Encoding_008d1ac0[9] = s_Content_Encoding_008d1ac0[9];
          s_Content_Encoding_008d1ac0[10] = s_Content_Encoding_008d1ac0[10];
          s_Content_Encoding_008d1ac0[0xb] = s_Content_Encoding_008d1ac0[0xb];
          s_Content_Encoding_008d1ac0[0xc] = s_Content_Encoding_008d1ac0[0xc];
          s_Content_Encoding_008d1ac0[0xd] = s_Content_Encoding_008d1ac0[0xd];
          s_Content_Encoding_008d1ac0[0xe] = s_Content_Encoding_008d1ac0[0xe];
          s_Content_Encoding_008d1ac0[0xf] = s_Content_Encoding_008d1ac0[0xf];
          return;
        }
        _uStack0000000000000040 = CONCAT17(0x10,uStack0000000000000040);
        _uStack0000000000000040 = _uStack0000000000000040 & 0xffffffffffffff00;
        bStack0000000000000027 = 4;
        uStack0000000000000010._0_2_ = 0x7a67;
        uStack0000000000000010._2_1_ = 'i';
        uStack0000000000000010._3_1_ = 'p';
        uStack0000000000000010._4_1_ = '\0';
        func_0x0005dd28();
      }
    }
    else {
      plVar5 = *(long **)(unaff_x22 + 0x110);
      if ((plVar5 != *(long **)(unaff_x22 + 0x118)) && (*(int *)(unaff_x19 + 0x18) == 0xce)) {
        if ((long)*(long **)(unaff_x22 + 0x118) - (long)plVar5 == 0x10) {
          lVar11 = (plVar5[1] - *plVar5) + 1;
          func_0x00063120(&uStack0000000000000030);
          bStack0000000000000027 = 0xd;
          uStack0000000000000010._0_2_ = s_Content_Range_008d1a98._0_2_;
          uStack0000000000000010._2_1_ = s_Content_Range_008d1a98[2];
          uStack0000000000000010._3_1_ = s_Content_Range_008d1a98[3];
          uStack0000000000000010._4_1_ = s_Content_Range_008d1a98[4];
          uStack0000000000000010._5_1_ = s_Content_Range_008d1a98[5];
          uStack0000000000000010._6_1_ = s_Content_Range_008d1a98[6];
          uStack0000000000000010._7_1_ = s_Content_Range_008d1a98[7];
          cStack0000000000000018 = s_Content_Range_008d1a98[8];
          cStack0000000000000019 = s_Content_Range_008d1a98[9];
          cStack000000000000001a = s_Content_Range_008d1a98[10];
          cStack000000000000001b = s_Content_Range_008d1a98[0xb];
          cStack000000000000001c = s_Content_Range_008d1a98[0xc];
          cStack000000000000001d = '\0';
          func_0x0005dd28();
          if ((char)bStack0000000000000027 < '\0') {
            __ZdlPv(CONCAT17(uStack0000000000000010._7_1_,
                             CONCAT16(uStack0000000000000010._6_1_,
                                      CONCAT15(uStack0000000000000010._5_1_,
                                               CONCAT14(uStack0000000000000010._4_1_,
                                                        CONCAT13(uStack0000000000000010._3_1_,
                                                                 CONCAT12(uStack0000000000000010.
                                                                          _2_1_,(undefined2)
                                                                                                                                                                
                                                  uStack0000000000000010)))))));
          }
          if ((long)_uStack0000000000000040 < 0) {
            __ZdlPv(CONCAT26(_cStack0000000000000036,_uStack0000000000000030));
          }
        }
        else {
          _uStack0000000000000030 = 0;
          _cStack0000000000000036 = 0;
          func_0x000640b0();
          lVar11 = CONCAT26(_cStack0000000000000036,_uStack0000000000000030);
        }
      }
      _uStack0000000000000040 = CONCAT17(0xe,uStack0000000000000040);
      uStack0000000000000030 = s_Content_Length_008d1a55[0];
      cStack0000000000000031 = s_Content_Length_008d1a55[1];
      cStack0000000000000032 = s_Content_Length_008d1a55[2];
      cStack0000000000000033 = s_Content_Length_008d1a55[3];
      cStack0000000000000034 = s_Content_Length_008d1a55[4];
      cStack0000000000000035 = s_Content_Length_008d1a55[5];
      cStack0000000000000036 = s_Content_Length_008d1a55[6];
      cStack0000000000000037 = s_Content_Length_008d1a55[7];
      uStack0000000000000038 = s_Content_Length_008d1a55._8_4_;
      cStack000000000000003c = s_Content_Length_008d1a55[0xc];
      cStack000000000000003d = s_Content_Length_008d1a55[0xd];
      cStack000000000000003e = '\0';
      __ZNSt3__19to_stringEm(&uStack0000000000000010,lVar11);
      func_0x0005dd28();
    }
    goto code_r0x00062828;
  }
  puVar4 = *(ulong **)(unaff_x22 + 0x110);
  if ((puVar4 != *(ulong **)(unaff_x22 + 0x118)) && (*(int *)(unaff_x19 + 0x18) == 0xce)) {
    puVar2 = (undefined8 *)(unaff_x19 + 0x60);
    if ((long)*(ulong **)(unaff_x22 + 0x118) - (long)puVar4 == 0x10) {
      uVar1 = *puVar4;
      uVar13 = (puVar4[1] - uVar1) + 1;
      func_0x00063120(&uStack0000000000000030);
      bStack0000000000000027 = '\r';
      uStack0000000000000010._0_2_ = s_Content_Range_008d1a98._0_2_;
      uStack0000000000000010._2_1_ = s_Content_Range_008d1a98[2];
      uStack0000000000000010._3_1_ = s_Content_Range_008d1a98[3];
      uStack0000000000000010._4_1_ = s_Content_Range_008d1a98[4];
      uStack0000000000000010._5_1_ = s_Content_Range_008d1a98[5];
      uStack0000000000000010._6_1_ = s_Content_Range_008d1a98[6];
      uStack0000000000000010._7_1_ = s_Content_Range_008d1a98[7];
      cStack0000000000000018 = s_Content_Range_008d1a98[8];
      cStack0000000000000019 = s_Content_Range_008d1a98[9];
      cStack000000000000001a = s_Content_Range_008d1a98[10];
      cStack000000000000001b = s_Content_Range_008d1a98[0xb];
      cStack000000000000001c = s_Content_Range_008d1a98[0xc];
      cStack000000000000001d = '\0';
      func_0x0005dd28();
      if ((char)bStack0000000000000027 < '\0') {
        __ZdlPv(CONCAT17(uStack0000000000000010._7_1_,
                         CONCAT16(uStack0000000000000010._6_1_,
                                  CONCAT15(uStack0000000000000010._5_1_,
                                           CONCAT14(uStack0000000000000010._4_1_,
                                                    CONCAT13(uStack0000000000000010._3_1_,
                                                             CONCAT12(uStack0000000000000010._2_1_,
                                                                      (undefined2)
                                                                      uStack0000000000000010)))))));
        bVar6 = *(byte *)(unaff_x19 + 0x77);
        if (-1 < (char)bVar6) goto code_r0x00062568;
code_r0x00062880:
        uVar12 = *(ulong *)(unaff_x19 + 0x68);
        if (uVar1 <= uVar12) {
          puVar14 = (undefined8 *)*puVar2;
code_r0x00062890:
          uVar3 = uVar12 - uVar1;
          if (uVar13 <= uVar12 - uVar1) {
            uVar3 = uVar13;
          }
          if (0x7ffffffffffffff7 < uVar3) {
            func_0x0001748c(&uStack0000000000000010);
            goto code_r0x00062a00;
          }
          if (uVar3 < 0x17) {
            bStack0000000000000027 = (byte)uVar3;
            puVar10 = &uStack0000000000000010;
            if (uVar3 != 0) goto code_r0x000628f4;
          }
          else {
            uVar13 = (uVar3 & 0xfffffffffffffff8) + 8;
            if ((uVar3 | 7) != 0x17) {
              uVar13 = uVar3 | 7;
            }
            lVar11 = uVar13 + 1;
            puVar10 = (undefined8 *)__Znwm(lVar11);
            bStack0000000000000027 = (byte)((ulong)lVar11 >> 0x38) | 0x80;
            _cStack0000000000000018 = (undefined5)uVar3;
            cStack000000000000001d = (char)(uVar3 >> 0x28);
            cStack000000000000001e = (char)(uVar3 >> 0x30);
            cStack000000000000001f = (char)(uVar3 >> 0x38);
            uStack0000000000000020 = (undefined7)lVar11;
            uStack0000000000000010._0_2_ = SUB82(puVar10,0);
            uStack0000000000000010._2_1_ = (char)((ulong)puVar10 >> 0x10);
            uStack0000000000000010._3_1_ = (char)((ulong)puVar10 >> 0x18);
            uStack0000000000000010._4_1_ = (char)((ulong)puVar10 >> 0x20);
            uStack0000000000000010._5_1_ = (char)((ulong)puVar10 >> 0x28);
            uStack0000000000000010._6_1_ = (char)((ulong)puVar10 >> 0x30);
            uStack0000000000000010._7_1_ = (char)((ulong)puVar10 >> 0x38);
code_r0x000628f4:
            _memmove(puVar10,(long)puVar14 + uVar1,uVar3);
          }
          *(undefined1 *)((long)puVar10 + uVar3) = 0;
          if (*(char *)(unaff_x19 + 0x77) < '\0') {
            __ZdlPv(*puVar2);
          }
          *(ulong *)(unaff_x19 + 0x68) =
               CONCAT17(cStack000000000000001f,
                        CONCAT16(cStack000000000000001e,
                                 CONCAT15(cStack000000000000001d,_cStack0000000000000018)));
          *puVar2 = CONCAT17(uStack0000000000000010._7_1_,
                             CONCAT16(uStack0000000000000010._6_1_,
                                      CONCAT15(uStack0000000000000010._5_1_,
                                               CONCAT14(uStack0000000000000010._4_1_,
                                                        CONCAT13(uStack0000000000000010._3_1_,
                                                                 CONCAT12(uStack0000000000000010.
                                                                          _2_1_,(undefined2)
                                                                                                                                                                
                                                  uStack0000000000000010))))));
          *(ulong *)(unaff_x19 + 0x70) = CONCAT17(bStack0000000000000027,uStack0000000000000020);
          goto joined_r0x0006292c;
        }
      }
      else {
        bVar6 = *(byte *)(unaff_x19 + 0x77);
        if ((char)bVar6 < '\0') goto code_r0x00062880;
code_r0x00062568:
        uVar12 = (ulong)bVar6;
        puVar14 = puVar2;
        if (uVar1 <= uVar12) goto code_r0x00062890;
      }
      func_0x00049dd0(&uStack0000000000000010);
code_r0x00062a00:
                    /* WARNING: Does not return */
      pcVar7 = (code *)SoftwareBreakpoint(1,0x62a04);
      (*pcVar7)();
    }
    _uStack0000000000000030 = 0;
    _cStack0000000000000036 = 0;
    uStack0000000000000038 = 0;
    cStack000000000000003c = 0;
    cStack000000000000003d = 0;
    cStack000000000000003e = 0;
    cStack000000000000003f = 0;
    _uStack0000000000000040 = 0;
    func_0x0006427c();
    uVar13 = *(ulong *)(unaff_x19 + 0x70);
    uVar16 = *(undefined8 *)(unaff_x19 + 0x68);
    uVar15 = *puVar2;
    *(ulong *)(unaff_x19 + 0x68) =
         CONCAT17(cStack000000000000003f,
                  CONCAT16(cStack000000000000003e,
                           CONCAT15(cStack000000000000003d,
                                    CONCAT14(cStack000000000000003c,uStack0000000000000038))));
    *puVar2 = CONCAT26(_cStack0000000000000036,_uStack0000000000000030);
    *(ulong *)(unaff_x19 + 0x70) = _uStack0000000000000040;
    uStack0000000000000038 = (uint)uVar16;
    cStack000000000000003c = (char)((ulong)uVar16 >> 0x20);
    cStack000000000000003d = (char)((ulong)uVar16 >> 0x28);
    cStack000000000000003e = (char)((ulong)uVar16 >> 0x30);
    cStack000000000000003f = (char)((ulong)uVar16 >> 0x38);
    _uStack0000000000000030 = (undefined6)uVar15;
    _cStack0000000000000036 = (undefined2)((ulong)uVar15 >> 0x30);
    _uStack0000000000000040 = uVar13;
joined_r0x0006292c:
    if ((long)_uStack0000000000000040 < 0) {
      __ZdlPv(CONCAT26(_cStack0000000000000036,_uStack0000000000000030));
    }
  }
  uVar13 = *(ulong *)(unaff_x19 + 0x68);
  if (-1 < (char)*(byte *)(unaff_x19 + 0x77)) {
    uVar13 = (ulong)*(byte *)(unaff_x19 + 0x77);
  }
  __ZNSt3__19to_stringEm(&uStack0000000000000030,uVar13);
  bStack0000000000000027 = 0xe;
  uStack0000000000000010._0_2_ = s_Content_Length_008d1a55._0_2_;
  uStack0000000000000010._2_1_ = s_Content_Length_008d1a55[2];
  uStack0000000000000010._3_1_ = s_Content_Length_008d1a55[3];
  uStack0000000000000010._4_1_ = s_Content_Length_008d1a55[4];
  uStack0000000000000010._5_1_ = s_Content_Length_008d1a55[5];
  uStack0000000000000010._6_1_ = s_Content_Length_008d1a55[6];
  uStack0000000000000010._7_1_ = s_Content_Length_008d1a55[7];
  _cStack0000000000000018 = s_Content_Length_008d1a55._8_5_;
  cStack000000000000001d = s_Content_Length_008d1a55[0xd];
  cStack000000000000001e = '\0';
  func_0x0005dd28();
code_r0x00062828:
  if ((char)bStack0000000000000027 < '\0') {
    __ZdlPv(CONCAT17(uStack0000000000000010._7_1_,
                     CONCAT16(uStack0000000000000010._6_1_,
                              CONCAT15(uStack0000000000000010._5_1_,
                                       CONCAT14(uStack0000000000000010._4_1_,
                                                CONCAT13(uStack0000000000000010._3_1_,
                                                         CONCAT12(uStack0000000000000010._2_1_,
                                                                  (undefined2)uStack0000000000000010
                                                                 )))))));
  }
  if ((long)_uStack0000000000000040 < 0) {
    __ZdlPv(CONCAT26(_cStack0000000000000036,_uStack0000000000000030));
  }
  return;
}

