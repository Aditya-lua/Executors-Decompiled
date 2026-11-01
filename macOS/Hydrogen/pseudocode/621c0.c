
void thunk_FUN_000621ec(undefined8 param_1,undefined8 param_2,long param_3,undefined8 *param_4,
                       undefined8 *param_5)

{
  undefined8 *puVar1;
  ulong uVar2;
  ulong *puVar3;
  ulong uVar4;
  byte bVar5;
  undefined6 uVar6;
  undefined2 uVar7;
  code *pcVar8;
  int iVar9;
  long lVar10;
  char *pcVar11;
  undefined2 *puVar12;
  long extraout_x1;
  ulong uVar13;
  ulong uVar14;
  undefined8 *puVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 in_stack_00000040;
  long in_stack_00000050;
  undefined8 in_stack_00000058;
  long in_stack_00000068;
  ulong uStack_c0;
  ulong uStack_b8;
  undefined2 uStack_b0;
  char cStack_ae;
  char cStack_ad;
  char cStack_ac;
  char cStack_ab;
  char cStack_aa;
  char cStack_a9;
  char acStack_a8 [5];
  char cStack_a3;
  char cStack_a2;
  char cStack_a1;
  char acStack_a0 [7];
  byte bStack_99;
  undefined7 uStack_98;
  char cStack_91;
  undefined6 uStack_90;
  undefined2 uStack_8a;
  undefined4 uStack_88;
  char cStack_84;
  char cStack_83;
  char cStack_82;
  char cStack_81;
  undefined8 uStack_80;
  
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
  }
  if (in_stack_00000050 < 0) {
    __ZdlPv(in_stack_00000040);
  }
  while (-1 < in_stack_00000068) {
    __Unwind_Resume();
  }
  __ZdlPv(in_stack_00000058);
  __Unwind_Resume();
  if ((0x10 < (ulong)(*(long *)(extraout_x1 + 0x118) - *(long *)(extraout_x1 + 0x110))) &&
     (*(int *)(param_3 + 0x18) == 0xce)) {
    uStack_80 = CONCAT17(0xc,(undefined7)uStack_80);
    uStack_88 = 0x65707954;
    uStack_90 = s_Content_Type_008d186c._0_6_;
    uVar6 = uStack_90;
    uStack_8a = s_Content_Type_008d186c._6_2_;
    uVar7 = uStack_8a;
    cStack_84 = 0;
    lVar10 = func_0x00063304(param_3 + 0x38,&uStack_90);
    if ((long)uStack_80 < 0) {
      __ZdlPv(CONCAT26(uStack_8a,uStack_90));
    }
    if (lVar10 != 0) {
      puVar1 = (undefined8 *)(lVar10 + 0x28);
      if (puVar1 != param_4) {
        bVar5 = *(byte *)(lVar10 + 0x3f);
        if (*(char *)((long)param_4 + 0x17) < '\0') {
          uVar14 = *(ulong *)(lVar10 + 0x30);
          puVar15 = *(undefined8 **)(lVar10 + 0x28);
          if (-1 < (char)bVar5) {
            uVar14 = (ulong)bVar5;
            puVar15 = puVar1;
          }
          func_0x00017784(param_4,puVar15,uVar14);
        }
        else if ((char)bVar5 < '\0') {
          func_0x000176c0(param_4,*(undefined8 *)(lVar10 + 0x28),*(undefined8 *)(lVar10 + 0x30));
        }
        else {
          uVar17 = *(undefined8 *)(lVar10 + 0x30);
          uVar16 = *puVar1;
          param_4[2] = *(undefined8 *)(lVar10 + 0x38);
          param_4[1] = uVar17;
          *param_4 = uVar16;
        }
      }
      func_0x00063518(&uStack_90,param_3 + 0x38,lVar10);
      lVar10 = CONCAT26(uStack_8a,uStack_90);
      uStack_90._0_1_ = '\0';
      uStack_90._1_1_ = '\0';
      uStack_90._2_1_ = '\0';
      uStack_90._3_1_ = '\0';
      uStack_90._4_1_ = '\0';
      uStack_90._5_1_ = '\0';
      uStack_8a._0_1_ = '\0';
      uStack_8a._1_1_ = '\0';
      if (lVar10 != 0) {
        if ((char)uStack_80 != '\0') {
          if (*(char *)(lVar10 + 0x3f) < '\0') {
            __ZdlPv(*(undefined8 *)(lVar10 + 0x28));
          }
          if (*(char *)(lVar10 + 0x27) < '\0') {
            __ZdlPv(*(undefined8 *)(lVar10 + 0x10));
          }
        }
        __ZdlPv(lVar10);
      }
    }
    func_0x00062c6c(&uStack_90);
    if (*(char *)((long)param_5 + 0x17) < '\0') {
      __ZdlPv(*param_5);
    }
    param_5[1] = CONCAT17(cStack_81,
                          CONCAT16(cStack_82,CONCAT15(cStack_83,CONCAT14(cStack_84,uStack_88))));
    *param_5 = CONCAT26(uStack_8a,uStack_90);
    param_5[2] = uStack_80;
    uStack_80 = CONCAT17(0xc,(undefined7)uStack_80);
    uStack_88 = 0x65707954;
    cStack_84 = '\0';
    bVar5 = *(byte *)((long)param_5 + 0x17);
    uVar14 = param_5[1];
    if (-1 < (char)bVar5) {
      uVar14 = (ulong)bVar5;
    }
    uVar13 = uVar14 + 0x1f;
    uStack_90 = uVar6;
    uStack_8a = uVar7;
    if (0x7ffffffffffffff7 < uVar13) {
      func_0x0001748c(&uStack_b0);
      goto code_r0x00062a00;
    }
    if (uVar13 < 0x17) {
      acStack_a8 = s_multipart_byteranges__boundary__008d1a78._8_5_;
      cStack_a3 = s_multipart_byteranges__boundary__008d1a78[0xd];
      cStack_a2 = s_multipart_byteranges__boundary__008d1a78[0xe];
      uStack_b0 = s_multipart_byteranges__boundary__008d1a78._0_2_;
      cStack_ae = s_multipart_byteranges__boundary__008d1a78[2];
      cStack_ad = s_multipart_byteranges__boundary__008d1a78[3];
      cStack_ac = s_multipart_byteranges__boundary__008d1a78[4];
      cStack_ab = s_multipart_byteranges__boundary__008d1a78[5];
      cStack_aa = s_multipart_byteranges__boundary__008d1a78[6];
      cStack_a9 = s_multipart_byteranges__boundary__008d1a78[7];
      bStack_99 = s_multipart_byteranges__boundary__008d1a78[0x17];
      uStack_98 = s_multipart_byteranges__boundary__008d1a78._24_7_;
      cStack_a1 = s_multipart_byteranges__boundary__008d1a78[0xf];
      acStack_a0[0] = s_multipart_byteranges__boundary__008d1a78[0x10];
      acStack_a0[1] = s_multipart_byteranges__boundary__008d1a78[0x11];
      acStack_a0[2] = s_multipart_byteranges__boundary__008d1a78[0x12];
      acStack_a0[3] = s_multipart_byteranges__boundary__008d1a78[0x13];
      acStack_a0[4] = s_multipart_byteranges__boundary__008d1a78[0x14];
      acStack_a0[5] = s_multipart_byteranges__boundary__008d1a78[0x15];
      acStack_a0[6] = s_multipart_byteranges__boundary__008d1a78[0x16];
      pcVar11 = &cStack_91;
code_r0x0006247c:
      puVar1 = (undefined8 *)*param_5;
      if (-1 < (char)bVar5) {
        puVar1 = param_5;
      }
      _memmove(pcVar11,puVar1,uVar14);
    }
    else {
      uVar4 = (uVar13 & 0xfffffffffffffff8) + 8;
      if ((uVar13 | 7) != 0x17) {
        uVar4 = uVar13 | 7;
      }
      lVar10 = uVar4 + 1;
      pcVar11 = (char *)__Znwm(lVar10);
      uVar16 = s_multipart_byteranges__boundary__008d1a78._0_8_;
      bStack_99 = (byte)((ulong)lVar10 >> 0x38) | 0x80;
      acStack_a8 = SUB85(uVar13,0);
      cStack_a3 = (char)(uVar13 >> 0x28);
      cStack_a2 = (char)(uVar13 >> 0x30);
      cStack_a1 = (char)(uVar13 >> 0x38);
      acStack_a0 = SUB87(lVar10,0);
      uStack_b0 = SUB82(pcVar11,0);
      cStack_ae = (char)((ulong)pcVar11 >> 0x10);
      cStack_ad = (char)((ulong)pcVar11 >> 0x18);
      cStack_ac = (char)((ulong)pcVar11 >> 0x20);
      cStack_ab = (char)((ulong)pcVar11 >> 0x28);
      cStack_aa = (char)((ulong)pcVar11 >> 0x30);
      cStack_a9 = (char)((ulong)pcVar11 >> 0x38);
      *(ulong *)(pcVar11 + 8) =
           CONCAT17(s_multipart_byteranges__boundary__008d1a78[0xf],
                    s_multipart_byteranges__boundary__008d1a78._8_7_);
      *(undefined8 *)pcVar11 = uVar16;
      uVar16 = CONCAT71(s_multipart_byteranges__boundary__008d1a78._16_7_,
                        s_multipart_byteranges__boundary__008d1a78[0xf]);
      *(undefined8 *)(pcVar11 + 0x17) = s_multipart_byteranges__boundary__008d1a78._23_8_;
      *(undefined8 *)(pcVar11 + 0xf) = uVar16;
      pcVar11 = pcVar11 + 0x1f;
      if (uVar14 != 0) goto code_r0x0006247c;
    }
    pcVar11[uVar14] = '\0';
    func_0x0005dd28(param_3,&uStack_90,&uStack_b0);
    if ((char)bStack_99 < '\0') {
      __ZdlPv(CONCAT17(cStack_a9,
                       CONCAT16(cStack_aa,
                                CONCAT15(cStack_ab,
                                         CONCAT14(cStack_ac,
                                                  CONCAT13(cStack_ad,CONCAT12(cStack_ae,uStack_b0)))
                                        ))));
    }
    if ((long)uStack_80 < 0) {
      __ZdlPv(CONCAT26(uStack_8a,uStack_90));
    }
  }
  iVar9 = func_0x00062e58(extraout_x1,param_3);
  uVar14 = *(ulong *)(param_3 + 0x68);
  if (-1 < (char)*(byte *)(param_3 + 0x77)) {
    uVar14 = (ulong)*(byte *)(param_3 + 0x77);
  }
  if (uVar14 == 0) {
    uVar14 = *(ulong *)(param_3 + 0x90);
    if (uVar14 == 0) {
      if (*(long *)(param_3 + 0xb0) == 0) {
        return;
      }
      if (*(char *)(param_3 + 0xd8) == '\0') {
        return;
      }
      uStack_80 = CONCAT17(0x11,(undefined7)uStack_80);
      uStack_80 = CONCAT62(uStack_80._2_6_,0x67);
      uStack_88 = s_Transfer_Encoding_008d1aa6._8_4_;
      cStack_84 = s_Transfer_Encoding_008d1aa6[0xc];
      cStack_83 = s_Transfer_Encoding_008d1aa6[0xd];
      cStack_82 = s_Transfer_Encoding_008d1aa6[0xe];
      cStack_81 = s_Transfer_Encoding_008d1aa6[0xf];
      uStack_90 = s_Transfer_Encoding_008d1aa6._0_6_;
      uStack_8a = s_Transfer_Encoding_008d1aa6._6_2_;
      bStack_99 = '\a';
      uStack_b0 = 0x6863;
      cStack_ae = 0x75;
      cStack_ad = 'n';
      cStack_ac = 'k';
      cStack_ab = 'e';
      cStack_aa = 'd';
      cStack_a9 = '\0';
      func_0x0005dd28(param_3,&uStack_90,&uStack_b0);
      if ((char)bStack_99 < '\0') {
        __ZdlPv(CONCAT17(cStack_a9,
                         CONCAT16(cStack_aa,
                                  CONCAT15(cStack_ab,
                                           CONCAT14(cStack_ac,
                                                    CONCAT13(cStack_ad,CONCAT12(cStack_ae,uStack_b0)
                                                            ))))));
      }
      if ((long)uStack_80 < 0) {
        __ZdlPv(CONCAT26(uStack_8a,uStack_90));
      }
      uStack_8a = s_Content_Encoding_008d1ac0._6_2_;
      uStack_90 = s_Content_Encoding_008d1ac0._0_6_;
      cStack_84 = s_Content_Encoding_008d1ac0[0xc];
      cStack_83 = s_Content_Encoding_008d1ac0[0xd];
      cStack_82 = s_Content_Encoding_008d1ac0[0xe];
      cStack_81 = s_Content_Encoding_008d1ac0[0xf];
      uStack_88 = s_Content_Encoding_008d1ac0._8_4_;
      if (iVar9 == 3) {
        uStack_80 = CONCAT17(0x10,(undefined7)uStack_80);
        uStack_80 = uStack_80 & 0xffffffffffffff00;
        bStack_99 = 4;
        uStack_b0 = 0x737a;
        cStack_ae = 't';
        cStack_ad = 'd';
        cStack_ac = '\0';
        func_0x0005dd28(param_3,&uStack_90,&uStack_b0);
      }
      else if (iVar9 == 2) {
        uStack_80 = CONCAT17(0x10,(undefined7)uStack_80);
        uStack_80 = uStack_80 & 0xffffffffffffff00;
        bStack_99 = 2;
        uStack_b0 = 0x7262;
        cStack_ae = '\0';
        func_0x0005dd28(param_3,&uStack_90,&uStack_b0);
      }
      else {
        if (iVar9 != 1) {
          s_Content_Type_008d186c[0] = s_Content_Type_008d186c[0];
          s_Content_Type_008d186c[1] = s_Content_Type_008d186c[1];
          s_Content_Type_008d186c[2] = s_Content_Type_008d186c[2];
          s_Content_Type_008d186c[3] = s_Content_Type_008d186c[3];
          s_Content_Type_008d186c[4] = s_Content_Type_008d186c[4];
          s_Content_Type_008d186c[5] = s_Content_Type_008d186c[5];
          s_Content_Type_008d186c[6] = s_Content_Type_008d186c[6];
          s_Content_Type_008d186c[7] = s_Content_Type_008d186c[7];
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
        uStack_80 = CONCAT17(0x10,(undefined7)uStack_80);
        uStack_80 = uStack_80 & 0xffffffffffffff00;
        bStack_99 = 4;
        uStack_b0 = 0x7a67;
        cStack_ae = 'i';
        cStack_ad = 'p';
        cStack_ac = '\0';
        func_0x0005dd28(param_3,&uStack_90,&uStack_b0);
      }
    }
    else {
      puVar3 = *(ulong **)(extraout_x1 + 0x110);
      uVar13 = uVar14;
      if ((puVar3 != *(ulong **)(extraout_x1 + 0x118)) && (*(int *)(param_3 + 0x18) == 0xce)) {
        if ((long)*(ulong **)(extraout_x1 + 0x118) - (long)puVar3 == 0x10) {
          uStack_c0 = *puVar3;
          uVar13 = (puVar3[1] - uStack_c0) + 1;
          uStack_b8 = uVar13;
          func_0x00063120(&uStack_90,&uStack_c0,uVar14);
          bStack_99 = 0xd;
          uStack_b0 = s_Content_Range_008d1a98._0_2_;
          cStack_ae = s_Content_Range_008d1a98[2];
          cStack_ad = s_Content_Range_008d1a98[3];
          cStack_ac = s_Content_Range_008d1a98[4];
          cStack_ab = s_Content_Range_008d1a98[5];
          cStack_aa = s_Content_Range_008d1a98[6];
          cStack_a9 = s_Content_Range_008d1a98[7];
          acStack_a8[0] = s_Content_Range_008d1a98[8];
          acStack_a8[1] = s_Content_Range_008d1a98[9];
          acStack_a8[2] = s_Content_Range_008d1a98[10];
          acStack_a8[3] = s_Content_Range_008d1a98[0xb];
          acStack_a8[4] = s_Content_Range_008d1a98[0xc];
          cStack_a3 = '\0';
          func_0x0005dd28(param_3,&uStack_b0,&uStack_90);
          if ((char)bStack_99 < '\0') {
            __ZdlPv(CONCAT17(cStack_a9,
                             CONCAT16(cStack_aa,
                                      CONCAT15(cStack_ab,
                                               CONCAT14(cStack_ac,
                                                        CONCAT13(cStack_ad,
                                                                 CONCAT12(cStack_ae,uStack_b0)))))))
            ;
          }
          if ((long)uStack_80 < 0) {
            __ZdlPv(CONCAT26(uStack_8a,uStack_90));
          }
        }
        else {
          uStack_90 = 0;
          uStack_8a = 0;
          func_0x000640b0(extraout_x1,param_5,param_4,uVar14,&uStack_90,&uStack_90,&uStack_90);
          uVar13 = CONCAT26(uStack_8a,uStack_90);
        }
      }
      uStack_80 = CONCAT17(0xe,(undefined7)uStack_80);
      uStack_90._0_1_ = s_Content_Length_008d1a55[0];
      uStack_90._1_1_ = s_Content_Length_008d1a55[1];
      uStack_90._2_1_ = s_Content_Length_008d1a55[2];
      uStack_90._3_1_ = s_Content_Length_008d1a55[3];
      uStack_90._4_1_ = s_Content_Length_008d1a55[4];
      uStack_90._5_1_ = s_Content_Length_008d1a55[5];
      uStack_8a._0_1_ = s_Content_Length_008d1a55[6];
      uStack_8a._1_1_ = s_Content_Length_008d1a55[7];
      uStack_88 = s_Content_Length_008d1a55._8_4_;
      cStack_84 = s_Content_Length_008d1a55[0xc];
      cStack_83 = s_Content_Length_008d1a55[0xd];
      cStack_82 = '\0';
      __ZNSt3__19to_stringEm(&uStack_b0,uVar13);
      func_0x0005dd28(param_3,&uStack_90,&uStack_b0);
    }
    goto code_r0x00062828;
  }
  puVar3 = *(ulong **)(extraout_x1 + 0x110);
  if ((puVar3 != *(ulong **)(extraout_x1 + 0x118)) && (*(int *)(param_3 + 0x18) == 0xce)) {
    puVar1 = (undefined8 *)(param_3 + 0x60);
    if ((long)*(ulong **)(extraout_x1 + 0x118) - (long)puVar3 == 0x10) {
      uVar4 = *puVar3;
      uVar13 = (puVar3[1] - uVar4) + 1;
      uStack_c0 = uVar4;
      uStack_b8 = uVar13;
      func_0x00063120(&uStack_90,&uStack_c0,uVar14);
      bStack_99 = 0xd;
      uStack_b0 = s_Content_Range_008d1a98._0_2_;
      cStack_ae = s_Content_Range_008d1a98[2];
      cStack_ad = s_Content_Range_008d1a98[3];
      cStack_ac = s_Content_Range_008d1a98[4];
      cStack_ab = s_Content_Range_008d1a98[5];
      cStack_aa = s_Content_Range_008d1a98[6];
      cStack_a9 = s_Content_Range_008d1a98[7];
      acStack_a8[0] = s_Content_Range_008d1a98[8];
      acStack_a8[1] = s_Content_Range_008d1a98[9];
      acStack_a8[2] = s_Content_Range_008d1a98[10];
      acStack_a8[3] = s_Content_Range_008d1a98[0xb];
      acStack_a8[4] = s_Content_Range_008d1a98[0xc];
      cStack_a3 = '\0';
      func_0x0005dd28(param_3,&uStack_b0,&uStack_90);
      if ((char)bStack_99 < '\0') {
        __ZdlPv(CONCAT17(cStack_a9,
                         CONCAT16(cStack_aa,
                                  CONCAT15(cStack_ab,
                                           CONCAT14(cStack_ac,
                                                    CONCAT13(cStack_ad,CONCAT12(cStack_ae,uStack_b0)
                                                            ))))));
        bVar5 = *(byte *)(param_3 + 0x77);
        if ((char)bVar5 < '\0') goto code_r0x00062880;
code_r0x00062568:
        uVar14 = (ulong)bVar5;
        puVar15 = puVar1;
        if (uVar4 <= uVar14) {
code_r0x00062890:
          uVar2 = uVar14 - uVar4;
          if (uVar13 <= uVar14 - uVar4) {
            uVar2 = uVar13;
          }
          if (0x7ffffffffffffff7 < uVar2) {
            func_0x0001748c(&uStack_b0);
            goto code_r0x00062a00;
          }
          if (uVar2 < 0x17) {
            bStack_99 = (byte)uVar2;
            puVar12 = &uStack_b0;
            if (uVar2 != 0) goto FUN_000628f4;
          }
          else {
            uVar14 = (uVar2 & 0xfffffffffffffff8) + 8;
            if ((uVar2 | 7) != 0x17) {
              uVar14 = uVar2 | 7;
            }
            lVar10 = uVar14 + 1;
            puVar12 = (undefined2 *)__Znwm(lVar10);
            bStack_99 = (byte)((ulong)lVar10 >> 0x38) | 0x80;
            acStack_a8 = SUB85(uVar2,0);
            cStack_a3 = (char)(uVar2 >> 0x28);
            cStack_a2 = (char)(uVar2 >> 0x30);
            cStack_a1 = (char)(uVar2 >> 0x38);
            acStack_a0 = SUB87(lVar10,0);
            uStack_b0 = SUB82(puVar12,0);
            cStack_ae = (char)((ulong)puVar12 >> 0x10);
            cStack_ad = (char)((ulong)puVar12 >> 0x18);
            cStack_ac = (char)((ulong)puVar12 >> 0x20);
            cStack_ab = (char)((ulong)puVar12 >> 0x28);
            cStack_aa = (char)((ulong)puVar12 >> 0x30);
            cStack_a9 = (char)((ulong)puVar12 >> 0x38);
FUN_000628f4:
            _memmove(puVar12,(long)puVar15 + uVar4,uVar2);
          }
          *(undefined1 *)((long)puVar12 + uVar2) = 0;
          if (*(char *)(param_3 + 0x77) < '\0') {
            __ZdlPv(*puVar1);
          }
          *(ulong *)(param_3 + 0x68) =
               CONCAT17(cStack_a1,CONCAT16(cStack_a2,CONCAT15(cStack_a3,acStack_a8)));
          *puVar1 = CONCAT17(cStack_a9,
                             CONCAT16(cStack_aa,
                                      CONCAT15(cStack_ab,
                                               CONCAT14(cStack_ac,
                                                        CONCAT13(cStack_ad,
                                                                 CONCAT12(cStack_ae,uStack_b0))))));
          *(ulong *)(param_3 + 0x70) = CONCAT17(bStack_99,acStack_a0);
          goto joined_r0x0006292c;
        }
      }
      else {
        bVar5 = *(byte *)(param_3 + 0x77);
        if (-1 < (char)bVar5) goto code_r0x00062568;
code_r0x00062880:
        uVar14 = *(ulong *)(param_3 + 0x68);
        if (uVar4 <= uVar14) {
          puVar15 = (undefined8 *)*puVar1;
          goto code_r0x00062890;
        }
      }
      func_0x00049dd0(&uStack_b0);
code_r0x00062a00:
                    /* WARNING: Does not return */
      pcVar8 = (code *)SoftwareBreakpoint(1,0x62a04);
      (*pcVar8)();
    }
    uStack_90 = 0;
    uStack_8a = 0;
    uStack_88 = 0;
    cStack_84 = 0;
    cStack_83 = 0;
    cStack_82 = 0;
    cStack_81 = 0;
    uStack_80 = 0;
    func_0x0006427c(extraout_x1,param_5,param_4,uVar14,&uStack_90,&uStack_90,&uStack_90,param_3);
    uVar14 = *(ulong *)(param_3 + 0x70);
    uVar17 = *(undefined8 *)(param_3 + 0x68);
    uVar16 = *puVar1;
    *(ulong *)(param_3 + 0x68) =
         CONCAT17(cStack_81,CONCAT16(cStack_82,CONCAT15(cStack_83,CONCAT14(cStack_84,uStack_88))));
    *puVar1 = CONCAT26(uStack_8a,uStack_90);
    *(ulong *)(param_3 + 0x70) = uStack_80;
    uStack_88 = (undefined4)uVar17;
    cStack_84 = (char)((ulong)uVar17 >> 0x20);
    cStack_83 = (char)((ulong)uVar17 >> 0x28);
    cStack_82 = (char)((ulong)uVar17 >> 0x30);
    cStack_81 = (char)((ulong)uVar17 >> 0x38);
    uStack_90 = (undefined6)uVar16;
    uStack_8a = (undefined2)((ulong)uVar16 >> 0x30);
    uStack_80 = uVar14;
joined_r0x0006292c:
    if ((long)uStack_80 < 0) {
      __ZdlPv(CONCAT26(uStack_8a,uStack_90));
    }
  }
  uVar14 = *(ulong *)(param_3 + 0x68);
  if (-1 < (char)*(byte *)(param_3 + 0x77)) {
    uVar14 = (ulong)*(byte *)(param_3 + 0x77);
  }
  __ZNSt3__19to_stringEm(&uStack_90,uVar14);
  bStack_99 = 0xe;
  uStack_b0 = s_Content_Length_008d1a55._0_2_;
  cStack_ae = s_Content_Length_008d1a55[2];
  cStack_ad = s_Content_Length_008d1a55[3];
  cStack_ac = s_Content_Length_008d1a55[4];
  cStack_ab = s_Content_Length_008d1a55[5];
  cStack_aa = s_Content_Length_008d1a55[6];
  cStack_a9 = s_Content_Length_008d1a55[7];
  acStack_a8 = s_Content_Length_008d1a55._8_5_;
  cStack_a3 = s_Content_Length_008d1a55[0xd];
  cStack_a2 = '\0';
  func_0x0005dd28(param_3,&uStack_b0,&uStack_90);
code_r0x00062828:
  if ((char)bStack_99 < '\0') {
    __ZdlPv(CONCAT17(cStack_a9,
                     CONCAT16(cStack_aa,
                              CONCAT15(cStack_ab,
                                       CONCAT14(cStack_ac,
                                                CONCAT13(cStack_ad,CONCAT12(cStack_ae,uStack_b0)))))
                    ));
  }
  if ((long)uStack_80 < 0) {
    __ZdlPv(CONCAT26(uStack_8a,uStack_90));
  }
  return;
}

