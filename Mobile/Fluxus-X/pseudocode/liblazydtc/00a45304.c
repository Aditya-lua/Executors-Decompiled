/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a45304
 */

void FUN_00a45304(uint *param_1,int param_2,uint param_3)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  long lVar8;
  undefined1 auVar9 [16];
  byte bVar10;
  byte bVar11;
  byte bVar13;
  byte bVar14;
  byte bVar15;
  byte bVar16;
  byte bVar17;
  byte bVar18;
  undefined8 uVar12;
  byte bVar19;
  byte bVar20;
  byte bVar22;
  byte bVar23;
  byte bVar24;
  byte bVar25;
  byte bVar26;
  byte bVar27;
  undefined8 uVar21;
  byte bVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  int iVar31;
  undefined8 uVar32;
  undefined1 auVar33 [12];
  undefined1 auVar34 [16];
  undefined1 auVar35 [16];
  uint uVar36;
  uint uVar37;
  uint uVar38;
  undefined8 uVar39;
  uint uVar40;
  uint uVar41;
  uint uVar42;
  undefined8 uVar43;
  uint uVar44;
  undefined8 uVar45;
  undefined8 uVar46;
  undefined8 uVar47;
  undefined8 uVar48;
  undefined8 uVar49;
  undefined8 uVar50;
  undefined8 uVar51;
  undefined8 uVar52;
  undefined8 uVar53;
  undefined8 uVar54;
  undefined8 uVar55;
  undefined8 uVar56;
  undefined8 uVar57;
  undefined8 uVar58;
  undefined8 uVar59;
  byte bVar60;
  byte bVar62;
  byte bVar63;
  byte bVar64;
  byte bVar65;
  byte bVar66;
  byte bVar67;
  byte bVar68;
  undefined8 uVar61;
  byte bVar69;
  byte bVar71;
  byte bVar72;
  byte bVar73;
  byte bVar74;
  byte bVar75;
  byte bVar76;
  byte bVar77;
  undefined8 uVar70;
  byte bVar78;
  byte bVar79;
  byte bVar80;
  byte bVar81;
  byte bVar82;
  byte bVar83;
  byte bVar84;
  byte bVar85;
  byte bVar86;
  byte bVar87;
  byte bVar88;
  byte bVar89;
  byte bVar90;
  byte bVar91;
  byte bVar92;
  byte bVar93;
  byte bVar94;
  byte bVar95;
  byte bVar96;
  byte bVar97;
  byte bVar98;
  byte bVar99;
  byte bVar100;
  byte bVar101;
  byte bVar102;
  byte bVar103;
  byte bVar104;
  byte bVar105;
  byte bVar106;
  byte bVar107;
  byte bVar108;
  byte bVar109;
  byte bVar110;
  byte bVar111;
  int iVar112;
  byte bVar115;
  byte bVar116;
  byte bVar117;
  byte bVar118;
  byte bVar120;
  byte bVar121;
  byte bVar122;
  undefined8 uVar113;
  int iVar119;
  undefined8 uVar114;
  byte bVar123;
  int iVar124;
  byte bVar127;
  byte bVar128;
  byte bVar129;
  byte bVar130;
  byte bVar132;
  byte bVar133;
  byte bVar134;
  undefined8 uVar125;
  int iVar131;
  undefined8 uVar126;
  undefined8 uVar135;
  undefined8 uVar136;
  int iVar137;
  byte bVar138;
  byte bVar139;
  byte bVar140;
  byte bVar141;
  byte bVar142;
  byte bVar143;
  byte bVar144;
  byte bVar145;
  byte bVar146;
  byte bVar147;
  byte bVar148;
  byte bVar149;
  byte bVar150;
  byte bVar151;
  byte bVar152;
  byte bVar153;
  byte bVar154;
  byte bVar155;
  byte bVar156;
  byte bVar157;
  byte bVar158;
  byte bVar159;
  byte bVar160;
  byte bVar161;
  byte bVar162;
  byte bVar163;
  byte bVar164;
  byte bVar165;
  byte bVar166;
  byte bVar167;
  byte bVar168;
  byte bVar169;
  undefined8 uVar170;
  undefined8 uVar171;
  uint uVar172;
  undefined8 uVar173;
  uint uVar174;
  undefined8 uVar175;
  undefined8 uVar176;
  undefined8 uVar177;
  undefined8 uVar178;
  undefined8 uVar179;
  undefined8 uVar180;
  undefined8 uVar181;
  undefined8 uVar182;
  undefined8 uVar183;
  undefined8 uVar184;
  undefined8 uVar185;
  undefined8 uVar186;
  undefined8 uVar187;
  undefined8 uVar188;
  undefined8 uVar189;
  byte bVar190;
  byte bVar191;
  byte bVar192;
  byte bVar193;
  byte bVar194;
  byte bVar195;
  byte bVar196;
  byte bVar197;
  byte bVar198;
  byte bVar199;
  byte bVar200;
  byte bVar201;
  byte bVar202;
  byte bVar203;
  byte bVar204;
  byte bVar205;
  
  lVar8 = (long)param_2 * 0x3c0;
  param_1[0x12] = 0;
  param_1[0x13] = 0;
  param_1[0x14] = 0;
  param_1[0x15] = 0;
  param_1[0x16] = 0;
  param_1[0x17] = 0;
  param_1[0x18] = 0;
  param_1[0x19] = 0;
  param_1[0x1a] = 0;
  param_1[0x1b] = 0;
  param_1[0x1c] = 0;
  param_1[0x1d] = 0;
  uVar177 = *(undefined8 *)(&UNK_00758d34 + lVar8);
  uVar176 = *(undefined8 *)(&DAT_00758d2c + lVar8);
  uVar41 = param_3 + (param_3 & (int)(char)param_3 >> 7) * -2;
  uVar59 = *(undefined8 *)(&UNK_00758dc4 + lVar8);
  uVar58 = *(undefined8 *)(&DAT_00758dbc + lVar8);
  uVar30 = *(undefined8 *)(param_1 + 0x18);
  uVar29 = *(undefined8 *)(param_1 + 0x16);
  uVar53 = *(undefined8 *)(&UNK_00758c88 + lVar8);
  uVar52 = *(undefined8 *)(&DAT_00758c80 + lVar8);
  uVar189 = *(undefined8 *)(&UNK_00758e58 + lVar8);
  uVar188 = *(undefined8 *)(&DAT_00758e50 + lVar8);
  uVar21 = *(undefined8 *)(param_1 + 0x14);
  uVar12 = *(undefined8 *)(param_1 + 0x12);
  uVar32 = *(undefined8 *)(param_1 + 0x1c);
  bVar71 = (byte)((ulong)uVar32 >> 8);
  bVar72 = (byte)((ulong)uVar32 >> 0x10);
  bVar73 = (byte)((ulong)uVar32 >> 0x18);
  bVar74 = (byte)((ulong)uVar32 >> 0x20);
  bVar75 = (byte)((ulong)uVar32 >> 0x28);
  bVar76 = (byte)((ulong)uVar32 >> 0x30);
  bVar77 = (byte)((ulong)uVar32 >> 0x38);
  uVar114 = *(undefined8 *)(param_1 + 0x1a);
  bVar62 = (byte)((ulong)uVar114 >> 8);
  bVar63 = (byte)((ulong)uVar114 >> 0x10);
  bVar64 = (byte)((ulong)uVar114 >> 0x18);
  bVar65 = (byte)((ulong)uVar114 >> 0x20);
  bVar66 = (byte)((ulong)uVar114 >> 0x28);
  bVar67 = (byte)((ulong)uVar114 >> 0x30);
  bVar68 = (byte)((ulong)uVar114 >> 0x38);
  uVar126 = *(undefined8 *)(&UNK_00758c5c + lVar8);
  uVar46 = *(undefined8 *)(&DAT_00758c54 + lVar8);
  uVar55 = *(undefined8 *)(&UNK_00758c78 + lVar8);
  uVar54 = *(undefined8 *)(&DAT_00758c70 + lVar8);
  uVar125 = *(undefined8 *)(&UNK_00758c98 + lVar8);
  uVar113 = *(undefined8 *)(&DAT_00758c90 + lVar8);
  uVar47 = *(undefined8 *)(&UNK_00758c34 + lVar8);
  uVar45 = *(undefined8 *)(&DAT_00758c2c + lVar8);
  uVar49 = *(undefined8 *)(&UNK_00758c44 + lVar8);
  uVar48 = *(undefined8 *)(&DAT_00758c3c + lVar8);
  iVar31 = ((uVar41 ^ 1) & 0xff) - 1;
  uVar181 = *(undefined8 *)(&UNK_00758d78 + lVar8);
  uVar180 = *(undefined8 *)(&DAT_00758d70 + lVar8);
  uVar1 = iVar31 >> 0x1f;
  uVar51 = *(undefined8 *)(&UNK_00758e14 + lVar8);
  uVar50 = *(undefined8 *)(&DAT_00758e0c + lVar8);
  bVar96 = (byte)((ulong)uVar29 >> 8);
  bVar97 = (byte)((ulong)uVar29 >> 0x10);
  bVar98 = (byte)((ulong)uVar29 >> 0x18);
  bVar99 = (byte)((ulong)uVar29 >> 0x20);
  bVar100 = (byte)((ulong)uVar29 >> 0x28);
  bVar101 = (byte)((ulong)uVar29 >> 0x30);
  bVar102 = (byte)((ulong)uVar29 >> 0x38);
  bVar104 = (byte)((ulong)uVar30 >> 8);
  bVar105 = (byte)((ulong)uVar30 >> 0x10);
  bVar106 = (byte)((ulong)uVar30 >> 0x18);
  bVar107 = (byte)((ulong)uVar30 >> 0x20);
  bVar108 = (byte)((ulong)uVar30 >> 0x28);
  bVar109 = (byte)((ulong)uVar30 >> 0x30);
  bVar110 = (byte)((ulong)uVar30 >> 0x38);
  bVar190 = (&DAT_00758e60)[lVar8];
  bVar191 = (&UNK_00758e61)[lVar8];
  bVar192 = (&UNK_00758e62)[lVar8];
  bVar193 = (&UNK_00758e63)[lVar8];
  bVar194 = (&UNK_00758e64)[lVar8];
  bVar195 = (&UNK_00758e65)[lVar8];
  bVar196 = (&UNK_00758e66)[lVar8];
  bVar197 = (&UNK_00758e67)[lVar8];
  bVar198 = (&UNK_00758e68)[lVar8];
  bVar199 = (&UNK_00758e69)[lVar8];
  bVar200 = (&UNK_00758e6a)[lVar8];
  bVar201 = (&UNK_00758e6b)[lVar8];
  bVar202 = (&UNK_00758e6c)[lVar8];
  bVar203 = (&UNK_00758e6d)[lVar8];
  bVar204 = (&UNK_00758e6e)[lVar8];
  bVar205 = (&UNK_00758e6f)[lVar8];
  bVar79 = (byte)((ulong)uVar12 >> 8);
  bVar80 = (byte)((ulong)uVar12 >> 0x10);
  bVar81 = (byte)((ulong)uVar12 >> 0x18);
  bVar82 = (byte)((ulong)uVar12 >> 0x20);
  bVar83 = (byte)((ulong)uVar12 >> 0x28);
  bVar84 = (byte)((ulong)uVar12 >> 0x30);
  bVar85 = (byte)((ulong)uVar12 >> 0x38);
  bVar87 = (byte)((ulong)uVar21 >> 8);
  bVar88 = (byte)((ulong)uVar21 >> 0x10);
  bVar89 = (byte)((ulong)uVar21 >> 0x18);
  bVar90 = (byte)((ulong)uVar21 >> 0x20);
  bVar91 = (byte)((ulong)uVar21 >> 0x28);
  bVar92 = (byte)((ulong)uVar21 >> 0x30);
  bVar93 = (byte)((ulong)uVar21 >> 0x38);
  bVar94 = (byte)(iVar31 >> 0x1f);
  bVar138 = (byte)uVar46 & bVar94;
  bVar139 = (byte)((ulong)uVar46 >> 8) & bVar94;
  bVar140 = (byte)((ulong)uVar46 >> 0x10) & bVar94;
  bVar141 = (byte)((ulong)uVar46 >> 0x18) & bVar94;
  bVar142 = (byte)((ulong)uVar46 >> 0x20) & bVar94;
  bVar143 = (byte)((ulong)uVar46 >> 0x28) & bVar94;
  bVar144 = (byte)((ulong)uVar46 >> 0x30) & bVar94;
  bVar145 = (byte)((ulong)uVar46 >> 0x38) & bVar94;
  bVar146 = (byte)uVar126 & bVar94;
  bVar147 = (byte)((ulong)uVar126 >> 8) & bVar94;
  bVar148 = (byte)((ulong)uVar126 >> 0x10) & bVar94;
  bVar149 = (byte)((ulong)uVar126 >> 0x18) & bVar94;
  bVar150 = (byte)((ulong)uVar126 >> 0x20) & bVar94;
  bVar151 = (byte)((ulong)uVar126 >> 0x28) & bVar94;
  bVar152 = (byte)((ulong)uVar126 >> 0x30) & bVar94;
  bVar153 = (byte)((ulong)uVar126 >> 0x38) & bVar94;
  uVar43 = *(undefined8 *)(&UNK_00758cac + lVar8);
  uVar39 = *(undefined8 *)(&DAT_00758ca4 + lVar8);
  bVar111 = (byte)uVar45 & bVar94;
  bVar115 = (byte)((ulong)uVar45 >> 8) & bVar94;
  bVar116 = (byte)((ulong)uVar45 >> 0x10) & bVar94;
  bVar117 = (byte)((ulong)uVar45 >> 0x18) & bVar94;
  bVar118 = (byte)((ulong)uVar45 >> 0x20) & bVar94;
  bVar120 = (byte)((ulong)uVar45 >> 0x28) & bVar94;
  bVar121 = (byte)((ulong)uVar45 >> 0x30) & bVar94;
  bVar122 = (byte)((ulong)uVar45 >> 0x38) & bVar94;
  bVar123 = (byte)uVar47 & bVar94;
  bVar127 = (byte)((ulong)uVar47 >> 8) & bVar94;
  bVar128 = (byte)((ulong)uVar47 >> 0x10) & bVar94;
  bVar129 = (byte)((ulong)uVar47 >> 0x18) & bVar94;
  bVar130 = (byte)((ulong)uVar47 >> 0x20) & bVar94;
  bVar132 = (byte)((ulong)uVar47 >> 0x28) & bVar94;
  bVar133 = (byte)((ulong)uVar47 >> 0x30) & bVar94;
  bVar134 = (byte)((ulong)uVar47 >> 0x38) & bVar94;
  bVar154 = (byte)uVar48 & bVar94;
  bVar155 = (byte)((ulong)uVar48 >> 8) & bVar94;
  bVar156 = (byte)((ulong)uVar48 >> 0x10) & bVar94;
  bVar157 = (byte)((ulong)uVar48 >> 0x18) & bVar94;
  bVar158 = (byte)((ulong)uVar48 >> 0x20) & bVar94;
  bVar159 = (byte)((ulong)uVar48 >> 0x28) & bVar94;
  bVar160 = (byte)((ulong)uVar48 >> 0x30) & bVar94;
  bVar161 = (byte)((ulong)uVar48 >> 0x38) & bVar94;
  bVar162 = (byte)uVar49 & bVar94;
  bVar163 = (byte)((ulong)uVar49 >> 8) & bVar94;
  bVar164 = (byte)((ulong)uVar49 >> 0x10) & bVar94;
  bVar165 = (byte)((ulong)uVar49 >> 0x18) & bVar94;
  bVar166 = (byte)((ulong)uVar49 >> 0x20) & bVar94;
  bVar167 = (byte)((ulong)uVar49 >> 0x28) & bVar94;
  bVar168 = (byte)((ulong)uVar49 >> 0x30) & bVar94;
  bVar169 = (byte)((ulong)uVar49 >> 0x38) & bVar94;
  bVar95 = ((byte)uVar52 ^ (byte)uVar29) & bVar94 ^ (byte)uVar29;
  bVar96 = ((byte)((ulong)uVar52 >> 8) ^ bVar96) & bVar94 ^ bVar96;
  bVar97 = ((byte)((ulong)uVar52 >> 0x10) ^ bVar97) & bVar94 ^ bVar97;
  bVar98 = ((byte)((ulong)uVar52 >> 0x18) ^ bVar98) & bVar94 ^ bVar98;
  bVar99 = ((byte)((ulong)uVar52 >> 0x20) ^ bVar99) & bVar94 ^ bVar99;
  bVar100 = ((byte)((ulong)uVar52 >> 0x28) ^ bVar100) & bVar94 ^ bVar100;
  bVar101 = ((byte)((ulong)uVar52 >> 0x30) ^ bVar101) & bVar94 ^ bVar101;
  bVar102 = ((byte)((ulong)uVar52 >> 0x38) ^ bVar102) & bVar94 ^ bVar102;
  bVar103 = ((byte)uVar53 ^ (byte)uVar30) & bVar94 ^ (byte)uVar30;
  bVar104 = ((byte)((ulong)uVar53 >> 8) ^ bVar104) & bVar94 ^ bVar104;
  bVar105 = ((byte)((ulong)uVar53 >> 0x10) ^ bVar105) & bVar94 ^ bVar105;
  bVar106 = ((byte)((ulong)uVar53 >> 0x18) ^ bVar106) & bVar94 ^ bVar106;
  bVar107 = ((byte)((ulong)uVar53 >> 0x20) ^ bVar107) & bVar94 ^ bVar107;
  bVar108 = ((byte)((ulong)uVar53 >> 0x28) ^ bVar108) & bVar94 ^ bVar108;
  bVar109 = ((byte)((ulong)uVar53 >> 0x30) ^ bVar109) & bVar94 ^ bVar109;
  bVar110 = ((byte)((ulong)uVar53 >> 0x38) ^ bVar110) & bVar94 ^ bVar110;
  uVar126 = *(undefined8 *)(&UNK_00758eb4 + lVar8);
  uVar46 = *(undefined8 *)(&DAT_00758eac + lVar8);
  bVar11 = (&DAT_00758cb4)[lVar8];
  bVar13 = (&UNK_00758cb5)[lVar8];
  bVar14 = (&UNK_00758cb6)[lVar8];
  bVar15 = (&UNK_00758cb7)[lVar8];
  bVar16 = (&UNK_00758cb8)[lVar8];
  bVar17 = (&UNK_00758cb9)[lVar8];
  bVar18 = (&UNK_00758cba)[lVar8];
  bVar19 = (&UNK_00758cbb)[lVar8];
  bVar20 = (&UNK_00758cbc)[lVar8];
  bVar22 = (&UNK_00758cbd)[lVar8];
  bVar23 = (&UNK_00758cbe)[lVar8];
  bVar24 = (&UNK_00758cbf)[lVar8];
  bVar25 = (&UNK_00758cc0)[lVar8];
  bVar26 = (&UNK_00758cc1)[lVar8];
  bVar27 = (&UNK_00758cc2)[lVar8];
  bVar28 = (&UNK_00758cc3)[lVar8];
  iVar31 = ((uVar41 ^ 2) & 0xff) - 1;
  uVar30 = *(undefined8 *)(&UNK_00758cd4 + lVar8);
  uVar29 = *(undefined8 *)(&DAT_00758ccc + lVar8);
  uVar179 = *(undefined8 *)(&UNK_00758d4c + lVar8);
  uVar178 = *(undefined8 *)(&DAT_00758d44 + lVar8);
  uVar175 = *(undefined8 *)(&UNK_00758d68 + lVar8);
  uVar173 = *(undefined8 *)(&DAT_00758d60 + lVar8);
  uVar2 = iVar31 >> 0x1f;
  uVar47 = *(undefined8 *)(&UNK_00758cf0 + lVar8);
  uVar45 = *(undefined8 *)(&DAT_00758ce8 + lVar8);
  uVar49 = *(undefined8 *)(&UNK_00758d00 + lVar8);
  uVar48 = *(undefined8 *)(&DAT_00758cf8 + lVar8);
  uVar57 = *(undefined8 *)(&UNK_00758d9c + lVar8);
  uVar56 = *(undefined8 *)(&DAT_00758d94 + lVar8);
  uVar53 = *(undefined8 *)(&UNK_00758dac + lVar8);
  uVar52 = *(undefined8 *)(&DAT_00758da4 + lVar8);
  bVar78 = ((byte)uVar54 ^ (byte)uVar12) & bVar94 ^ (byte)uVar12;
  bVar79 = ((byte)((ulong)uVar54 >> 8) ^ bVar79) & bVar94 ^ bVar79;
  bVar80 = ((byte)((ulong)uVar54 >> 0x10) ^ bVar80) & bVar94 ^ bVar80;
  bVar81 = ((byte)((ulong)uVar54 >> 0x18) ^ bVar81) & bVar94 ^ bVar81;
  bVar82 = ((byte)((ulong)uVar54 >> 0x20) ^ bVar82) & bVar94 ^ bVar82;
  bVar83 = ((byte)((ulong)uVar54 >> 0x28) ^ bVar83) & bVar94 ^ bVar83;
  bVar84 = ((byte)((ulong)uVar54 >> 0x30) ^ bVar84) & bVar94 ^ bVar84;
  bVar85 = ((byte)((ulong)uVar54 >> 0x38) ^ bVar85) & bVar94 ^ bVar85;
  bVar86 = ((byte)uVar55 ^ (byte)uVar21) & bVar94 ^ (byte)uVar21;
  bVar87 = ((byte)((ulong)uVar55 >> 8) ^ bVar87) & bVar94 ^ bVar87;
  bVar88 = ((byte)((ulong)uVar55 >> 0x10) ^ bVar88) & bVar94 ^ bVar88;
  bVar89 = ((byte)((ulong)uVar55 >> 0x18) ^ bVar89) & bVar94 ^ bVar89;
  bVar90 = ((byte)((ulong)uVar55 >> 0x20) ^ bVar90) & bVar94 ^ bVar90;
  bVar91 = ((byte)((ulong)uVar55 >> 0x28) ^ bVar91) & bVar94 ^ bVar91;
  bVar92 = ((byte)((ulong)uVar55 >> 0x30) ^ bVar92) & bVar94 ^ bVar92;
  bVar93 = ((byte)((ulong)uVar55 >> 0x38) ^ bVar93) & bVar94 ^ bVar93;
  uVar172 = *(uint *)(&DAT_00758c4c + lVar8);
  uVar4 = *(uint *)(&DAT_00758c50 + lVar8);
  uVar185 = *(undefined8 *)(&UNK_00758d88 + lVar8);
  uVar184 = *(undefined8 *)(&DAT_00758d80 + lVar8);
  uVar187 = *(undefined8 *)(&UNK_00758e24 + lVar8);
  uVar186 = *(undefined8 *)(&DAT_00758e1c + lVar8);
  uVar183 = *(undefined8 *)(&UNK_00758e3c + lVar8);
  uVar182 = *(undefined8 *)(&DAT_00758e34 + lVar8);
  bVar10 = (byte)(iVar31 >> 0x1f);
  uVar6 = *(uint *)(&DAT_00758c28 + lVar8);
  uVar3 = *(uint *)(&DAT_00758c64 + lVar8);
  uVar5 = *(uint *)(&DAT_00758c68 + lVar8);
  uVar7 = *(uint *)(&DAT_00758c6c + lVar8);
  uVar36 = *(uint *)(&DAT_00758ca0 + lVar8);
  uVar38 = *(uint *)(&DAT_00758cc4 + lVar8);
  uVar42 = *(uint *)(&DAT_00758cc8 + lVar8);
  uVar70 = *(undefined8 *)(&UNK_00758d10 + lVar8);
  uVar61 = *(undefined8 *)(&DAT_00758d08 + lVar8);
  uVar55 = *(undefined8 *)(&UNK_00758e78 + lVar8);
  uVar54 = *(undefined8 *)(&DAT_00758e70 + lVar8);
  uVar171 = *(undefined8 *)(&UNK_00758e8c + lVar8);
  uVar170 = *(undefined8 *)(&DAT_00758e84 + lVar8);
  uVar136 = *(undefined8 *)(&UNK_00758e9c + lVar8);
  uVar135 = *(undefined8 *)(&DAT_00758e94 + lVar8);
  *(ulong *)(param_1 + 3) =
       CONCAT17(bVar134,CONCAT16(bVar133,CONCAT15(bVar132,CONCAT14(bVar130,CONCAT13(bVar129,CONCAT12
                                                  (bVar128,CONCAT11(bVar127,bVar123)))))));
  *(ulong *)(param_1 + 1) =
       CONCAT17(bVar122,CONCAT16(bVar121,CONCAT15(bVar120,CONCAT14(bVar118,CONCAT13(bVar117,CONCAT12
                                                  (bVar116,CONCAT11(bVar115,bVar111)))))));
  bVar111 = ((byte)uVar39 ^ bVar111) & bVar10 ^ bVar111;
  bVar115 = ((byte)((ulong)uVar39 >> 8) ^ bVar115) & bVar10 ^ bVar115;
  bVar116 = ((byte)((ulong)uVar39 >> 0x10) ^ bVar116) & bVar10 ^ bVar116;
  bVar117 = ((byte)((ulong)uVar39 >> 0x18) ^ bVar117) & bVar10 ^ bVar117;
  bVar118 = ((byte)((ulong)uVar39 >> 0x20) ^ bVar118) & bVar10 ^ bVar118;
  bVar120 = ((byte)((ulong)uVar39 >> 0x28) ^ bVar120) & bVar10 ^ bVar120;
  bVar121 = ((byte)((ulong)uVar39 >> 0x30) ^ bVar121) & bVar10 ^ bVar121;
  bVar122 = ((byte)((ulong)uVar39 >> 0x38) ^ bVar122) & bVar10 ^ bVar122;
  bVar123 = ((byte)uVar43 ^ bVar123) & bVar10 ^ bVar123;
  bVar127 = ((byte)((ulong)uVar43 >> 8) ^ bVar127) & bVar10 ^ bVar127;
  bVar128 = ((byte)((ulong)uVar43 >> 0x10) ^ bVar128) & bVar10 ^ bVar128;
  bVar129 = ((byte)((ulong)uVar43 >> 0x18) ^ bVar129) & bVar10 ^ bVar129;
  bVar130 = ((byte)((ulong)uVar43 >> 0x20) ^ bVar130) & bVar10 ^ bVar130;
  bVar132 = ((byte)((ulong)uVar43 >> 0x28) ^ bVar132) & bVar10 ^ bVar132;
  bVar133 = ((byte)((ulong)uVar43 >> 0x30) ^ bVar133) & bVar10 ^ bVar133;
  bVar134 = ((byte)((ulong)uVar43 >> 0x38) ^ bVar134) & bVar10 ^ bVar134;
  bVar60 = ((byte)uVar113 ^ (byte)uVar114) & bVar94 ^ (byte)uVar114;
  bVar62 = ((byte)((ulong)uVar113 >> 8) ^ bVar62) & bVar94 ^ bVar62;
  bVar63 = ((byte)((ulong)uVar113 >> 0x10) ^ bVar63) & bVar94 ^ bVar63;
  bVar64 = ((byte)((ulong)uVar113 >> 0x18) ^ bVar64) & bVar94 ^ bVar64;
  bVar65 = ((byte)((ulong)uVar113 >> 0x20) ^ bVar65) & bVar94 ^ bVar65;
  bVar66 = ((byte)((ulong)uVar113 >> 0x28) ^ bVar66) & bVar94 ^ bVar66;
  bVar67 = ((byte)((ulong)uVar113 >> 0x30) ^ bVar67) & bVar94 ^ bVar67;
  bVar68 = ((byte)((ulong)uVar113 >> 0x38) ^ bVar68) & bVar94 ^ bVar68;
  bVar69 = ((byte)uVar125 ^ (byte)uVar32) & bVar94 ^ (byte)uVar32;
  bVar71 = ((byte)((ulong)uVar125 >> 8) ^ bVar71) & bVar94 ^ bVar71;
  bVar72 = ((byte)((ulong)uVar125 >> 0x10) ^ bVar72) & bVar94 ^ bVar72;
  bVar73 = ((byte)((ulong)uVar125 >> 0x18) ^ bVar73) & bVar94 ^ bVar73;
  bVar74 = ((byte)((ulong)uVar125 >> 0x20) ^ bVar74) & bVar94 ^ bVar74;
  bVar75 = ((byte)((ulong)uVar125 >> 0x28) ^ bVar75) & bVar94 ^ bVar75;
  bVar76 = ((byte)((ulong)uVar125 >> 0x30) ^ bVar76) & bVar94 ^ bVar76;
  bVar77 = ((byte)((ulong)uVar125 >> 0x38) ^ bVar77) & bVar94 ^ bVar77;
  uVar125 = *(undefined8 *)(&UNK_00758f04 + lVar8);
  uVar113 = *(undefined8 *)(&DAT_00758efc + lVar8);
  *(ulong *)(param_1 + 7) =
       CONCAT17(bVar169,CONCAT16(bVar168,CONCAT15(bVar167,CONCAT14(bVar166,CONCAT13(bVar165,CONCAT12
                                                  (bVar164,CONCAT11(bVar163,bVar162)))))));
  *(ulong *)(param_1 + 5) =
       CONCAT17(bVar161,CONCAT16(bVar160,CONCAT15(bVar159,CONCAT14(bVar158,CONCAT13(bVar157,CONCAT12
                                                  (bVar156,CONCAT11(bVar155,bVar154)))))));
  bVar154 = (bVar11 ^ bVar154) & bVar10 ^ bVar154;
  bVar155 = (bVar13 ^ bVar155) & bVar10 ^ bVar155;
  bVar156 = (bVar14 ^ bVar156) & bVar10 ^ bVar156;
  bVar157 = (bVar15 ^ bVar157) & bVar10 ^ bVar157;
  bVar158 = (bVar16 ^ bVar158) & bVar10 ^ bVar158;
  bVar159 = (bVar17 ^ bVar159) & bVar10 ^ bVar159;
  bVar160 = (bVar18 ^ bVar160) & bVar10 ^ bVar160;
  bVar161 = (bVar19 ^ bVar161) & bVar10 ^ bVar161;
  bVar162 = (bVar20 ^ bVar162) & bVar10 ^ bVar162;
  bVar163 = (bVar22 ^ bVar163) & bVar10 ^ bVar163;
  bVar164 = (bVar23 ^ bVar164) & bVar10 ^ bVar164;
  bVar165 = (bVar24 ^ bVar165) & bVar10 ^ bVar165;
  bVar166 = (bVar25 ^ bVar166) & bVar10 ^ bVar166;
  bVar167 = (bVar26 ^ bVar167) & bVar10 ^ bVar167;
  bVar168 = (bVar27 ^ bVar168) & bVar10 ^ bVar168;
  bVar169 = (bVar28 ^ bVar169) & bVar10 ^ bVar169;
  uVar21 = *(undefined8 *)(&UNK_00758f14 + lVar8);
  uVar12 = *(undefined8 *)(&DAT_00758f0c + lVar8);
  *(ulong *)(param_1 + 0xd) =
       CONCAT17(bVar153,CONCAT16(bVar152,CONCAT15(bVar151,CONCAT14(bVar150,CONCAT13(bVar149,CONCAT12
                                                  (bVar148,CONCAT11(bVar147,bVar146)))))));
  *(ulong *)(param_1 + 0xb) =
       CONCAT17(bVar145,CONCAT16(bVar144,CONCAT15(bVar143,CONCAT14(bVar142,CONCAT13(bVar141,CONCAT12
                                                  (bVar140,CONCAT11(bVar139,bVar138)))))));
  bVar138 = ((byte)uVar29 ^ bVar138) & bVar10 ^ bVar138;
  bVar139 = ((byte)((ulong)uVar29 >> 8) ^ bVar139) & bVar10 ^ bVar139;
  bVar140 = ((byte)((ulong)uVar29 >> 0x10) ^ bVar140) & bVar10 ^ bVar140;
  bVar141 = ((byte)((ulong)uVar29 >> 0x18) ^ bVar141) & bVar10 ^ bVar141;
  bVar142 = ((byte)((ulong)uVar29 >> 0x20) ^ bVar142) & bVar10 ^ bVar142;
  bVar143 = ((byte)((ulong)uVar29 >> 0x28) ^ bVar143) & bVar10 ^ bVar143;
  bVar144 = ((byte)((ulong)uVar29 >> 0x30) ^ bVar144) & bVar10 ^ bVar144;
  bVar145 = ((byte)((ulong)uVar29 >> 0x38) ^ bVar145) & bVar10 ^ bVar145;
  bVar146 = ((byte)uVar30 ^ bVar146) & bVar10 ^ bVar146;
  bVar147 = ((byte)((ulong)uVar30 >> 8) ^ bVar147) & bVar10 ^ bVar147;
  bVar148 = ((byte)((ulong)uVar30 >> 0x10) ^ bVar148) & bVar10 ^ bVar148;
  bVar149 = ((byte)((ulong)uVar30 >> 0x18) ^ bVar149) & bVar10 ^ bVar149;
  bVar150 = ((byte)((ulong)uVar30 >> 0x20) ^ bVar150) & bVar10 ^ bVar150;
  bVar151 = ((byte)((ulong)uVar30 >> 0x28) ^ bVar151) & bVar10 ^ bVar151;
  bVar152 = ((byte)((ulong)uVar30 >> 0x30) ^ bVar152) & bVar10 ^ bVar152;
  bVar153 = ((byte)((ulong)uVar30 >> 0x38) ^ bVar153) & bVar10 ^ bVar153;
  uVar32 = *(undefined8 *)(&UNK_00758f2c + lVar8);
  uVar114 = *(undefined8 *)(&DAT_00758f24 + lVar8);
  uVar30 = *(undefined8 *)(&UNK_00758f48 + lVar8);
  uVar29 = *(undefined8 *)(&DAT_00758f40 + lVar8);
  *(ulong *)(param_1 + 0x14) =
       CONCAT17(bVar93,CONCAT16(bVar92,CONCAT15(bVar91,CONCAT14(bVar90,CONCAT13(bVar89,CONCAT12(
                                                  bVar88,CONCAT11(bVar87,bVar86)))))));
  *(ulong *)(param_1 + 0x12) =
       CONCAT17(bVar85,CONCAT16(bVar84,CONCAT15(bVar83,CONCAT14(bVar82,CONCAT13(bVar81,CONCAT12(
                                                  bVar80,CONCAT11(bVar79,bVar78)))))));
  bVar11 = (&DAT_00758f50)[lVar8];
  bVar13 = (&UNK_00758f51)[lVar8];
  bVar14 = (&UNK_00758f52)[lVar8];
  bVar15 = (&UNK_00758f53)[lVar8];
  bVar16 = (&UNK_00758f54)[lVar8];
  bVar17 = (&UNK_00758f55)[lVar8];
  bVar18 = (&UNK_00758f56)[lVar8];
  bVar19 = (&UNK_00758f57)[lVar8];
  bVar20 = (&UNK_00758f58)[lVar8];
  bVar22 = (&UNK_00758f59)[lVar8];
  bVar23 = (&UNK_00758f5a)[lVar8];
  bVar24 = (&UNK_00758f5b)[lVar8];
  bVar25 = (&UNK_00758f5c)[lVar8];
  bVar26 = (&UNK_00758f5d)[lVar8];
  bVar27 = (&UNK_00758f5e)[lVar8];
  bVar28 = (&UNK_00758f5f)[lVar8];
  uVar40 = *(uint *)(&DAT_00758cdc + lVar8);
  uVar44 = *(uint *)(&DAT_00758ce0 + lVar8);
  uVar172 = uVar172 & uVar1;
  uVar3 = uVar3 & uVar1;
  uVar37 = *(uint *)(&DAT_00758ce4 + lVar8);
  uVar5 = uVar5 & uVar1;
  uVar7 = uVar7 & uVar1;
  uVar6 = (uVar6 ^ 1) & uVar1 ^ 1;
  uVar4 = (uVar4 ^ 1) & uVar1 ^ 1;
  *(ulong *)(param_1 + 0x18) =
       CONCAT17(bVar110,CONCAT16(bVar109,CONCAT15(bVar108,CONCAT14(bVar107,CONCAT13(bVar106,CONCAT12
                                                  (bVar105,CONCAT11(bVar104,bVar103)))))));
  *(ulong *)(param_1 + 0x16) =
       CONCAT17(bVar102,CONCAT16(bVar101,CONCAT15(bVar100,CONCAT14(bVar99,CONCAT13(bVar98,CONCAT12(
                                                  bVar97,CONCAT11(bVar96,bVar95)))))));
  bVar78 = ((byte)uVar45 ^ bVar78) & bVar10 ^ bVar78;
  bVar79 = ((byte)((ulong)uVar45 >> 8) ^ bVar79) & bVar10 ^ bVar79;
  bVar80 = ((byte)((ulong)uVar45 >> 0x10) ^ bVar80) & bVar10 ^ bVar80;
  bVar81 = ((byte)((ulong)uVar45 >> 0x18) ^ bVar81) & bVar10 ^ bVar81;
  bVar82 = ((byte)((ulong)uVar45 >> 0x20) ^ bVar82) & bVar10 ^ bVar82;
  bVar83 = ((byte)((ulong)uVar45 >> 0x28) ^ bVar83) & bVar10 ^ bVar83;
  bVar84 = ((byte)((ulong)uVar45 >> 0x30) ^ bVar84) & bVar10 ^ bVar84;
  bVar85 = ((byte)((ulong)uVar45 >> 0x38) ^ bVar85) & bVar10 ^ bVar85;
  bVar86 = ((byte)uVar47 ^ bVar86) & bVar10 ^ bVar86;
  bVar87 = ((byte)((ulong)uVar47 >> 8) ^ bVar87) & bVar10 ^ bVar87;
  bVar88 = ((byte)((ulong)uVar47 >> 0x10) ^ bVar88) & bVar10 ^ bVar88;
  bVar89 = ((byte)((ulong)uVar47 >> 0x18) ^ bVar89) & bVar10 ^ bVar89;
  bVar90 = ((byte)((ulong)uVar47 >> 0x20) ^ bVar90) & bVar10 ^ bVar90;
  bVar91 = ((byte)((ulong)uVar47 >> 0x28) ^ bVar91) & bVar10 ^ bVar91;
  bVar92 = ((byte)((ulong)uVar47 >> 0x30) ^ bVar92) & bVar10 ^ bVar92;
  bVar93 = ((byte)((ulong)uVar47 >> 0x38) ^ bVar93) & bVar10 ^ bVar93;
  bVar95 = ((byte)uVar48 ^ bVar95) & bVar10 ^ bVar95;
  bVar96 = ((byte)((ulong)uVar48 >> 8) ^ bVar96) & bVar10 ^ bVar96;
  bVar97 = ((byte)((ulong)uVar48 >> 0x10) ^ bVar97) & bVar10 ^ bVar97;
  bVar98 = ((byte)((ulong)uVar48 >> 0x18) ^ bVar98) & bVar10 ^ bVar98;
  bVar99 = ((byte)((ulong)uVar48 >> 0x20) ^ bVar99) & bVar10 ^ bVar99;
  bVar100 = ((byte)((ulong)uVar48 >> 0x28) ^ bVar100) & bVar10 ^ bVar100;
  bVar101 = ((byte)((ulong)uVar48 >> 0x30) ^ bVar101) & bVar10 ^ bVar101;
  bVar102 = ((byte)((ulong)uVar48 >> 0x38) ^ bVar102) & bVar10 ^ bVar102;
  bVar103 = ((byte)uVar49 ^ bVar103) & bVar10 ^ bVar103;
  bVar104 = ((byte)((ulong)uVar49 >> 8) ^ bVar104) & bVar10 ^ bVar104;
  bVar105 = ((byte)((ulong)uVar49 >> 0x10) ^ bVar105) & bVar10 ^ bVar105;
  bVar106 = ((byte)((ulong)uVar49 >> 0x18) ^ bVar106) & bVar10 ^ bVar106;
  bVar107 = ((byte)((ulong)uVar49 >> 0x20) ^ bVar107) & bVar10 ^ bVar107;
  bVar108 = ((byte)((ulong)uVar49 >> 0x28) ^ bVar108) & bVar10 ^ bVar108;
  bVar109 = ((byte)((ulong)uVar49 >> 0x30) ^ bVar109) & bVar10 ^ bVar109;
  bVar110 = ((byte)((ulong)uVar49 >> 0x38) ^ bVar110) & bVar10 ^ bVar110;
  uVar43 = *(undefined8 *)(&UNK_00758d24 + lVar8);
  uVar39 = *(undefined8 *)(&DAT_00758d1c + lVar8);
  *(ulong *)(param_1 + 0x1c) =
       CONCAT17(bVar77,CONCAT16(bVar76,CONCAT15(bVar75,CONCAT14(bVar74,CONCAT13(bVar73,CONCAT12(
                                                  bVar72,CONCAT11(bVar71,bVar69)))))));
  *(ulong *)(param_1 + 0x1a) =
       CONCAT17(bVar68,CONCAT16(bVar67,CONCAT15(bVar66,CONCAT14(bVar65,CONCAT13(bVar64,CONCAT12(
                                                  bVar63,CONCAT11(bVar62,bVar60)))))));
  *(ulong *)(param_1 + 3) =
       CONCAT17(bVar134,CONCAT16(bVar133,CONCAT15(bVar132,CONCAT14(bVar130,CONCAT13(bVar129,CONCAT12
                                                  (bVar128,CONCAT11(bVar127,bVar123)))))));
  *(ulong *)(param_1 + 1) =
       CONCAT17(bVar122,CONCAT16(bVar121,CONCAT15(bVar120,CONCAT14(bVar118,CONCAT13(bVar117,CONCAT12
                                                  (bVar116,CONCAT11(bVar115,bVar111)))))));
  *(ulong *)(param_1 + 7) =
       CONCAT17(bVar169,CONCAT16(bVar168,CONCAT15(bVar167,CONCAT14(bVar166,CONCAT13(bVar165,CONCAT12
                                                  (bVar164,CONCAT11(bVar163,bVar162)))))));
  *(ulong *)(param_1 + 5) =
       CONCAT17(bVar161,CONCAT16(bVar160,CONCAT15(bVar159,CONCAT14(bVar158,CONCAT13(bVar157,CONCAT12
                                                  (bVar156,CONCAT11(bVar155,bVar154)))))));
  *(ulong *)(param_1 + 0xd) =
       CONCAT17(bVar153,CONCAT16(bVar152,CONCAT15(bVar151,CONCAT14(bVar150,CONCAT13(bVar149,CONCAT12
                                                  (bVar148,CONCAT11(bVar147,bVar146)))))));
  *(ulong *)(param_1 + 0xb) =
       CONCAT17(bVar145,CONCAT16(bVar144,CONCAT15(bVar143,CONCAT14(bVar142,CONCAT13(bVar141,CONCAT12
                                                  (bVar140,CONCAT11(bVar139,bVar138)))))));
  param_1[0xf] = uVar3;
  param_1[0x10] = uVar5;
  param_1[0x11] = uVar7;
  *param_1 = uVar6;
  param_1[9] = uVar172;
  iVar31 = ((uVar41 ^ 3) & 0xff) - 1;
  uVar7 = (uVar37 ^ uVar7) & uVar2 ^ uVar7;
  uVar172 = (uVar38 ^ uVar172) & uVar2 ^ uVar172;
  uVar38 = *(uint *)(&DAT_00758d18 + lVar8);
  uVar1 = iVar31 >> 0x1f;
  bVar60 = ((byte)uVar61 ^ bVar60) & bVar10 ^ bVar60;
  bVar62 = ((byte)((ulong)uVar61 >> 8) ^ bVar62) & bVar10 ^ bVar62;
  bVar63 = ((byte)((ulong)uVar61 >> 0x10) ^ bVar63) & bVar10 ^ bVar63;
  bVar64 = ((byte)((ulong)uVar61 >> 0x18) ^ bVar64) & bVar10 ^ bVar64;
  bVar65 = ((byte)((ulong)uVar61 >> 0x20) ^ bVar65) & bVar10 ^ bVar65;
  bVar66 = ((byte)((ulong)uVar61 >> 0x28) ^ bVar66) & bVar10 ^ bVar66;
  bVar67 = ((byte)((ulong)uVar61 >> 0x30) ^ bVar67) & bVar10 ^ bVar67;
  bVar68 = ((byte)((ulong)uVar61 >> 0x38) ^ bVar68) & bVar10 ^ bVar68;
  bVar69 = ((byte)uVar70 ^ bVar69) & bVar10 ^ bVar69;
  bVar71 = ((byte)((ulong)uVar70 >> 8) ^ bVar71) & bVar10 ^ bVar71;
  bVar72 = ((byte)((ulong)uVar70 >> 0x10) ^ bVar72) & bVar10 ^ bVar72;
  bVar73 = ((byte)((ulong)uVar70 >> 0x18) ^ bVar73) & bVar10 ^ bVar73;
  bVar74 = ((byte)((ulong)uVar70 >> 0x20) ^ bVar74) & bVar10 ^ bVar74;
  bVar75 = ((byte)((ulong)uVar70 >> 0x28) ^ bVar75) & bVar10 ^ bVar75;
  bVar76 = ((byte)((ulong)uVar70 >> 0x30) ^ bVar76) & bVar10 ^ bVar76;
  bVar77 = ((byte)((ulong)uVar70 >> 0x38) ^ bVar77) & bVar10 ^ bVar77;
  bVar10 = (byte)(iVar31 >> 0x1f);
  uVar6 = (uVar36 ^ uVar6) & uVar2 ^ uVar6;
  bVar111 = ((byte)uVar39 ^ bVar111) & bVar10 ^ bVar111;
  bVar115 = ((byte)((ulong)uVar39 >> 8) ^ bVar115) & bVar10 ^ bVar115;
  bVar116 = ((byte)((ulong)uVar39 >> 0x10) ^ bVar116) & bVar10 ^ bVar116;
  bVar117 = ((byte)((ulong)uVar39 >> 0x18) ^ bVar117) & bVar10 ^ bVar117;
  uVar36 = CONCAT13(bVar117,CONCAT12(bVar116,CONCAT11(bVar115,bVar111)));
  bVar118 = ((byte)((ulong)uVar39 >> 0x20) ^ bVar118) & bVar10 ^ bVar118;
  bVar120 = ((byte)((ulong)uVar39 >> 0x28) ^ bVar120) & bVar10 ^ bVar120;
  bVar121 = ((byte)((ulong)uVar39 >> 0x30) ^ bVar121) & bVar10 ^ bVar121;
  bVar122 = ((byte)((ulong)uVar39 >> 0x38) ^ bVar122) & bVar10 ^ bVar122;
  bVar123 = ((byte)uVar43 ^ bVar123) & bVar10 ^ bVar123;
  bVar127 = ((byte)((ulong)uVar43 >> 8) ^ bVar127) & bVar10 ^ bVar127;
  bVar128 = ((byte)((ulong)uVar43 >> 0x10) ^ bVar128) & bVar10 ^ bVar128;
  bVar129 = ((byte)((ulong)uVar43 >> 0x18) ^ bVar129) & bVar10 ^ bVar129;
  uVar37 = CONCAT13(bVar129,CONCAT12(bVar128,CONCAT11(bVar127,bVar123)));
  bVar130 = ((byte)((ulong)uVar43 >> 0x20) ^ bVar130) & bVar10 ^ bVar130;
  bVar132 = ((byte)((ulong)uVar43 >> 0x28) ^ bVar132) & bVar10 ^ bVar132;
  bVar133 = ((byte)((ulong)uVar43 >> 0x30) ^ bVar133) & bVar10 ^ bVar133;
  bVar134 = ((byte)((ulong)uVar43 >> 0x38) ^ bVar134) & bVar10 ^ bVar134;
  param_1[10] = uVar4;
  bVar154 = ((byte)uVar176 ^ bVar154) & bVar10 ^ bVar154;
  bVar155 = ((byte)((ulong)uVar176 >> 8) ^ bVar155) & bVar10 ^ bVar155;
  bVar156 = ((byte)((ulong)uVar176 >> 0x10) ^ bVar156) & bVar10 ^ bVar156;
  bVar157 = ((byte)((ulong)uVar176 >> 0x18) ^ bVar157) & bVar10 ^ bVar157;
  bVar158 = ((byte)((ulong)uVar176 >> 0x20) ^ bVar158) & bVar10 ^ bVar158;
  bVar159 = ((byte)((ulong)uVar176 >> 0x28) ^ bVar159) & bVar10 ^ bVar159;
  bVar160 = ((byte)((ulong)uVar176 >> 0x30) ^ bVar160) & bVar10 ^ bVar160;
  bVar161 = ((byte)((ulong)uVar176 >> 0x38) ^ bVar161) & bVar10 ^ bVar161;
  bVar162 = ((byte)uVar177 ^ bVar162) & bVar10 ^ bVar162;
  bVar163 = ((byte)((ulong)uVar177 >> 8) ^ bVar163) & bVar10 ^ bVar163;
  bVar164 = ((byte)((ulong)uVar177 >> 0x10) ^ bVar164) & bVar10 ^ bVar164;
  bVar165 = ((byte)((ulong)uVar177 >> 0x18) ^ bVar165) & bVar10 ^ bVar165;
  bVar166 = ((byte)((ulong)uVar177 >> 0x20) ^ bVar166) & bVar10 ^ bVar166;
  bVar167 = ((byte)((ulong)uVar177 >> 0x28) ^ bVar167) & bVar10 ^ bVar167;
  bVar168 = ((byte)((ulong)uVar177 >> 0x30) ^ bVar168) & bVar10 ^ bVar168;
  bVar169 = ((byte)((ulong)uVar177 >> 0x38) ^ bVar169) & bVar10 ^ bVar169;
  uVar3 = (uVar40 ^ uVar3) & uVar2 ^ uVar3;
  uVar5 = (uVar44 ^ uVar5) & uVar2 ^ uVar5;
  uVar4 = (uVar42 ^ uVar4) & uVar2 ^ uVar4;
  uVar40 = *(uint *)(&DAT_00758d3c + lVar8);
  *param_1 = uVar6;
  uVar6 = (uVar38 ^ uVar6) & uVar1 ^ uVar6;
  uVar38 = *(uint *)(&DAT_00758d40 + lVar8);
  param_1[9] = uVar172;
  param_1[10] = uVar4;
  param_1[0xf] = uVar3;
  param_1[0x10] = uVar5;
  param_1[0x11] = uVar7;
  *(ulong *)(param_1 + 0x14) =
       CONCAT17(bVar93,CONCAT16(bVar92,CONCAT15(bVar91,CONCAT14(bVar90,CONCAT13(bVar89,CONCAT12(
                                                  bVar88,CONCAT11(bVar87,bVar86)))))));
  *(ulong *)(param_1 + 0x12) =
       CONCAT17(bVar85,CONCAT16(bVar84,CONCAT15(bVar83,CONCAT14(bVar82,CONCAT13(bVar81,CONCAT12(
                                                  bVar80,CONCAT11(bVar79,bVar78)))))));
  *(ulong *)(param_1 + 0x18) =
       CONCAT17(bVar110,CONCAT16(bVar109,CONCAT15(bVar108,CONCAT14(bVar107,CONCAT13(bVar106,CONCAT12
                                                  (bVar105,CONCAT11(bVar104,bVar103)))))));
  *(ulong *)(param_1 + 0x16) =
       CONCAT17(bVar102,CONCAT16(bVar101,CONCAT15(bVar100,CONCAT14(bVar99,CONCAT13(bVar98,CONCAT12(
                                                  bVar97,CONCAT11(bVar96,bVar95)))))));
  *(ulong *)(param_1 + 0x1c) =
       CONCAT17(bVar77,CONCAT16(bVar76,CONCAT15(bVar75,CONCAT14(bVar74,CONCAT13(bVar73,CONCAT12(
                                                  bVar72,CONCAT11(bVar71,bVar69)))))));
  *(ulong *)(param_1 + 0x1a) =
       CONCAT17(bVar68,CONCAT16(bVar67,CONCAT15(bVar66,CONCAT14(bVar65,CONCAT13(bVar64,CONCAT12(
                                                  bVar63,CONCAT11(bVar62,bVar60)))))));
  *param_1 = uVar6;
  param_1[1] = uVar36;
  bVar138 = ((byte)uVar178 ^ bVar138) & bVar10 ^ bVar138;
  bVar139 = ((byte)((ulong)uVar178 >> 8) ^ bVar139) & bVar10 ^ bVar139;
  bVar140 = ((byte)((ulong)uVar178 >> 0x10) ^ bVar140) & bVar10 ^ bVar140;
  bVar141 = ((byte)((ulong)uVar178 >> 0x18) ^ bVar141) & bVar10 ^ bVar141;
  bVar142 = ((byte)((ulong)uVar178 >> 0x20) ^ bVar142) & bVar10 ^ bVar142;
  bVar143 = ((byte)((ulong)uVar178 >> 0x28) ^ bVar143) & bVar10 ^ bVar143;
  bVar144 = ((byte)((ulong)uVar178 >> 0x30) ^ bVar144) & bVar10 ^ bVar144;
  bVar145 = ((byte)((ulong)uVar178 >> 0x38) ^ bVar145) & bVar10 ^ bVar145;
  bVar146 = ((byte)uVar179 ^ bVar146) & bVar10 ^ bVar146;
  bVar147 = ((byte)((ulong)uVar179 >> 8) ^ bVar147) & bVar10 ^ bVar147;
  bVar148 = ((byte)((ulong)uVar179 >> 0x10) ^ bVar148) & bVar10 ^ bVar148;
  bVar149 = ((byte)((ulong)uVar179 >> 0x18) ^ bVar149) & bVar10 ^ bVar149;
  bVar150 = ((byte)((ulong)uVar179 >> 0x20) ^ bVar150) & bVar10 ^ bVar150;
  bVar151 = ((byte)((ulong)uVar179 >> 0x28) ^ bVar151) & bVar10 ^ bVar151;
  bVar152 = ((byte)((ulong)uVar179 >> 0x30) ^ bVar152) & bVar10 ^ bVar152;
  bVar153 = ((byte)((ulong)uVar179 >> 0x38) ^ bVar153) & bVar10 ^ bVar153;
  uVar42 = *(uint *)(&DAT_00758d54 + lVar8);
  param_1[2] = (uint)(CONCAT17(bVar122,CONCAT16(bVar121,CONCAT15(bVar120,CONCAT14(bVar118,uVar36))))
                     >> 0x20);
  uVar44 = *(uint *)(&DAT_00758d58 + lVar8);
  uVar177 = *(undefined8 *)(&UNK_00758de0 + lVar8);
  uVar176 = *(undefined8 *)(&DAT_00758dd8 + lVar8);
  uVar179 = *(undefined8 *)(&UNK_00758df0 + lVar8);
  uVar178 = *(undefined8 *)(&DAT_00758de8 + lVar8);
  uVar70 = *(undefined8 *)(&UNK_00758e00 + lVar8);
  uVar61 = *(undefined8 *)(&DAT_00758df8 + lVar8);
  param_1[3] = uVar37;
  param_1[4] = (uint)(CONCAT17(bVar134,CONCAT16(bVar133,CONCAT15(bVar132,CONCAT14(bVar130,uVar37))))
                     >> 0x20);
  iVar31 = ((uVar41 ^ 4) & 0xff) - 1;
  uVar2 = iVar31 >> 0x1f;
  bVar78 = ((byte)uVar173 ^ bVar78) & bVar10 ^ bVar78;
  bVar79 = ((byte)((ulong)uVar173 >> 8) ^ bVar79) & bVar10 ^ bVar79;
  bVar80 = ((byte)((ulong)uVar173 >> 0x10) ^ bVar80) & bVar10 ^ bVar80;
  bVar81 = ((byte)((ulong)uVar173 >> 0x18) ^ bVar81) & bVar10 ^ bVar81;
  uVar37 = CONCAT13(bVar81,CONCAT12(bVar80,CONCAT11(bVar79,bVar78)));
  bVar82 = ((byte)((ulong)uVar173 >> 0x20) ^ bVar82) & bVar10 ^ bVar82;
  bVar83 = ((byte)((ulong)uVar173 >> 0x28) ^ bVar83) & bVar10 ^ bVar83;
  bVar84 = ((byte)((ulong)uVar173 >> 0x30) ^ bVar84) & bVar10 ^ bVar84;
  bVar85 = ((byte)((ulong)uVar173 >> 0x38) ^ bVar85) & bVar10 ^ bVar85;
  bVar86 = ((byte)uVar175 ^ bVar86) & bVar10 ^ bVar86;
  bVar87 = ((byte)((ulong)uVar175 >> 8) ^ bVar87) & bVar10 ^ bVar87;
  bVar88 = ((byte)((ulong)uVar175 >> 0x10) ^ bVar88) & bVar10 ^ bVar88;
  bVar89 = ((byte)((ulong)uVar175 >> 0x18) ^ bVar89) & bVar10 ^ bVar89;
  uVar174 = CONCAT13(bVar89,CONCAT12(bVar88,CONCAT11(bVar87,bVar86)));
  bVar90 = ((byte)((ulong)uVar175 >> 0x20) ^ bVar90) & bVar10 ^ bVar90;
  bVar91 = ((byte)((ulong)uVar175 >> 0x28) ^ bVar91) & bVar10 ^ bVar91;
  bVar92 = ((byte)((ulong)uVar175 >> 0x30) ^ bVar92) & bVar10 ^ bVar92;
  bVar93 = ((byte)((ulong)uVar175 >> 0x38) ^ bVar93) & bVar10 ^ bVar93;
  bVar60 = ((byte)uVar184 ^ bVar60) & bVar10 ^ bVar60;
  bVar62 = ((byte)((ulong)uVar184 >> 8) ^ bVar62) & bVar10 ^ bVar62;
  bVar63 = ((byte)((ulong)uVar184 >> 0x10) ^ bVar63) & bVar10 ^ bVar63;
  bVar64 = ((byte)((ulong)uVar184 >> 0x18) ^ bVar64) & bVar10 ^ bVar64;
  bVar65 = ((byte)((ulong)uVar184 >> 0x20) ^ bVar65) & bVar10 ^ bVar65;
  bVar66 = ((byte)((ulong)uVar184 >> 0x28) ^ bVar66) & bVar10 ^ bVar66;
  bVar67 = ((byte)((ulong)uVar184 >> 0x30) ^ bVar67) & bVar10 ^ bVar67;
  bVar68 = ((byte)((ulong)uVar184 >> 0x38) ^ bVar68) & bVar10 ^ bVar68;
  bVar69 = ((byte)uVar185 ^ bVar69) & bVar10 ^ bVar69;
  bVar71 = ((byte)((ulong)uVar185 >> 8) ^ bVar71) & bVar10 ^ bVar71;
  bVar72 = ((byte)((ulong)uVar185 >> 0x10) ^ bVar72) & bVar10 ^ bVar72;
  bVar73 = ((byte)((ulong)uVar185 >> 0x18) ^ bVar73) & bVar10 ^ bVar73;
  bVar74 = ((byte)((ulong)uVar185 >> 0x20) ^ bVar74) & bVar10 ^ bVar74;
  bVar75 = ((byte)((ulong)uVar185 >> 0x28) ^ bVar75) & bVar10 ^ bVar75;
  bVar76 = ((byte)((ulong)uVar185 >> 0x30) ^ bVar76) & bVar10 ^ bVar76;
  bVar77 = ((byte)((ulong)uVar185 >> 0x38) ^ bVar77) & bVar10 ^ bVar77;
  bVar94 = (byte)(iVar31 >> 0x1f);
  bVar111 = ((byte)uVar56 ^ bVar111) & bVar94 ^ bVar111;
  bVar115 = ((byte)((ulong)uVar56 >> 8) ^ bVar115) & bVar94 ^ bVar115;
  bVar116 = ((byte)((ulong)uVar56 >> 0x10) ^ bVar116) & bVar94 ^ bVar116;
  bVar117 = ((byte)((ulong)uVar56 >> 0x18) ^ bVar117) & bVar94 ^ bVar117;
  bVar118 = ((byte)((ulong)uVar56 >> 0x20) ^ bVar118) & bVar94 ^ bVar118;
  bVar120 = ((byte)((ulong)uVar56 >> 0x28) ^ bVar120) & bVar94 ^ bVar120;
  bVar121 = ((byte)((ulong)uVar56 >> 0x30) ^ bVar121) & bVar94 ^ bVar121;
  bVar122 = ((byte)((ulong)uVar56 >> 0x38) ^ bVar122) & bVar94 ^ bVar122;
  bVar123 = ((byte)uVar57 ^ bVar123) & bVar94 ^ bVar123;
  bVar127 = ((byte)((ulong)uVar57 >> 8) ^ bVar127) & bVar94 ^ bVar127;
  bVar128 = ((byte)((ulong)uVar57 >> 0x10) ^ bVar128) & bVar94 ^ bVar128;
  bVar129 = ((byte)((ulong)uVar57 >> 0x18) ^ bVar129) & bVar94 ^ bVar129;
  bVar130 = ((byte)((ulong)uVar57 >> 0x20) ^ bVar130) & bVar94 ^ bVar130;
  bVar132 = ((byte)((ulong)uVar57 >> 0x28) ^ bVar132) & bVar94 ^ bVar132;
  bVar133 = ((byte)((ulong)uVar57 >> 0x30) ^ bVar133) & bVar94 ^ bVar133;
  bVar134 = ((byte)((ulong)uVar57 >> 0x38) ^ bVar134) & bVar94 ^ bVar134;
  uVar43 = *(undefined8 *)(&UNK_00758f68 + lVar8);
  uVar39 = *(undefined8 *)(&DAT_00758f60 + lVar8);
  *(ulong *)(param_1 + 7) =
       CONCAT17(bVar169,CONCAT16(bVar168,CONCAT15(bVar167,CONCAT14(bVar166,CONCAT13(bVar165,CONCAT12
                                                  (bVar164,CONCAT11(bVar163,bVar162)))))));
  *(ulong *)(param_1 + 5) =
       CONCAT17(bVar161,CONCAT16(bVar160,CONCAT15(bVar159,CONCAT14(bVar158,CONCAT13(bVar157,CONCAT12
                                                  (bVar156,CONCAT11(bVar155,bVar154)))))));
  bVar154 = ((byte)uVar52 ^ bVar154) & bVar94 ^ bVar154;
  bVar155 = ((byte)((ulong)uVar52 >> 8) ^ bVar155) & bVar94 ^ bVar155;
  bVar156 = ((byte)((ulong)uVar52 >> 0x10) ^ bVar156) & bVar94 ^ bVar156;
  bVar157 = ((byte)((ulong)uVar52 >> 0x18) ^ bVar157) & bVar94 ^ bVar157;
  bVar158 = ((byte)((ulong)uVar52 >> 0x20) ^ bVar158) & bVar94 ^ bVar158;
  bVar159 = ((byte)((ulong)uVar52 >> 0x28) ^ bVar159) & bVar94 ^ bVar159;
  bVar160 = ((byte)((ulong)uVar52 >> 0x30) ^ bVar160) & bVar94 ^ bVar160;
  bVar161 = ((byte)((ulong)uVar52 >> 0x38) ^ bVar161) & bVar94 ^ bVar161;
  bVar162 = ((byte)uVar53 ^ bVar162) & bVar94 ^ bVar162;
  bVar163 = ((byte)((ulong)uVar53 >> 8) ^ bVar163) & bVar94 ^ bVar163;
  bVar164 = ((byte)((ulong)uVar53 >> 0x10) ^ bVar164) & bVar94 ^ bVar164;
  bVar165 = ((byte)((ulong)uVar53 >> 0x18) ^ bVar165) & bVar94 ^ bVar165;
  bVar166 = ((byte)((ulong)uVar53 >> 0x20) ^ bVar166) & bVar94 ^ bVar166;
  bVar167 = ((byte)((ulong)uVar53 >> 0x28) ^ bVar167) & bVar94 ^ bVar167;
  bVar168 = ((byte)((ulong)uVar53 >> 0x30) ^ bVar168) & bVar94 ^ bVar168;
  bVar169 = ((byte)((ulong)uVar53 >> 0x38) ^ bVar169) & bVar94 ^ bVar169;
  bVar95 = ((byte)uVar180 ^ bVar95) & bVar10 ^ bVar95;
  bVar96 = ((byte)((ulong)uVar180 >> 8) ^ bVar96) & bVar10 ^ bVar96;
  bVar97 = ((byte)((ulong)uVar180 >> 0x10) ^ bVar97) & bVar10 ^ bVar97;
  bVar98 = ((byte)((ulong)uVar180 >> 0x18) ^ bVar98) & bVar10 ^ bVar98;
  bVar99 = ((byte)((ulong)uVar180 >> 0x20) ^ bVar99) & bVar10 ^ bVar99;
  bVar100 = ((byte)((ulong)uVar180 >> 0x28) ^ bVar100) & bVar10 ^ bVar100;
  bVar101 = ((byte)((ulong)uVar180 >> 0x30) ^ bVar101) & bVar10 ^ bVar101;
  bVar102 = ((byte)((ulong)uVar180 >> 0x38) ^ bVar102) & bVar10 ^ bVar102;
  bVar103 = ((byte)uVar181 ^ bVar103) & bVar10 ^ bVar103;
  bVar104 = ((byte)((ulong)uVar181 >> 8) ^ bVar104) & bVar10 ^ bVar104;
  bVar105 = ((byte)((ulong)uVar181 >> 0x10) ^ bVar105) & bVar10 ^ bVar105;
  bVar106 = ((byte)((ulong)uVar181 >> 0x18) ^ bVar106) & bVar10 ^ bVar106;
  bVar107 = ((byte)((ulong)uVar181 >> 0x20) ^ bVar107) & bVar10 ^ bVar107;
  bVar108 = ((byte)((ulong)uVar181 >> 0x28) ^ bVar108) & bVar10 ^ bVar108;
  bVar109 = ((byte)((ulong)uVar181 >> 0x30) ^ bVar109) & bVar10 ^ bVar109;
  bVar110 = ((byte)((ulong)uVar181 >> 0x38) ^ bVar110) & bVar10 ^ bVar110;
  uVar49 = *(undefined8 *)(&UNK_00758f7c + lVar8);
  uVar48 = *(undefined8 *)(&DAT_00758f74 + lVar8);
  *(ulong *)(param_1 + 0xd) =
       CONCAT17(bVar153,CONCAT16(bVar152,CONCAT15(bVar151,CONCAT14(bVar150,CONCAT13(bVar149,CONCAT12
                                                  (bVar148,CONCAT11(bVar147,bVar146)))))));
  *(ulong *)(param_1 + 0xb) =
       CONCAT17(bVar145,CONCAT16(bVar144,CONCAT15(bVar143,CONCAT14(bVar142,CONCAT13(bVar141,CONCAT12
                                                  (bVar140,CONCAT11(bVar139,bVar138)))))));
  bVar138 = ((byte)uVar58 ^ bVar138) & bVar94 ^ bVar138;
  bVar139 = ((byte)((ulong)uVar58 >> 8) ^ bVar139) & bVar94 ^ bVar139;
  bVar140 = ((byte)((ulong)uVar58 >> 0x10) ^ bVar140) & bVar94 ^ bVar140;
  bVar141 = ((byte)((ulong)uVar58 >> 0x18) ^ bVar141) & bVar94 ^ bVar141;
  bVar142 = ((byte)((ulong)uVar58 >> 0x20) ^ bVar142) & bVar94 ^ bVar142;
  bVar143 = ((byte)((ulong)uVar58 >> 0x28) ^ bVar143) & bVar94 ^ bVar143;
  bVar144 = ((byte)((ulong)uVar58 >> 0x30) ^ bVar144) & bVar94 ^ bVar144;
  bVar145 = ((byte)((ulong)uVar58 >> 0x38) ^ bVar145) & bVar94 ^ bVar145;
  bVar146 = ((byte)uVar59 ^ bVar146) & bVar94 ^ bVar146;
  bVar147 = ((byte)((ulong)uVar59 >> 8) ^ bVar147) & bVar94 ^ bVar147;
  bVar148 = ((byte)((ulong)uVar59 >> 0x10) ^ bVar148) & bVar94 ^ bVar148;
  bVar149 = ((byte)((ulong)uVar59 >> 0x18) ^ bVar149) & bVar94 ^ bVar149;
  bVar150 = ((byte)((ulong)uVar59 >> 0x20) ^ bVar150) & bVar94 ^ bVar150;
  bVar151 = ((byte)((ulong)uVar59 >> 0x28) ^ bVar151) & bVar94 ^ bVar151;
  bVar152 = ((byte)((ulong)uVar59 >> 0x30) ^ bVar152) & bVar94 ^ bVar152;
  bVar153 = ((byte)((ulong)uVar59 >> 0x38) ^ bVar153) & bVar94 ^ bVar153;
  uVar47 = *(undefined8 *)(&UNK_00758f8c + lVar8);
  uVar45 = *(undefined8 *)(&DAT_00758f84 + lVar8);
  uVar53 = *(undefined8 *)(&UNK_00758fa4 + lVar8);
  uVar52 = *(undefined8 *)(&DAT_00758f9c + lVar8);
  uVar36 = *(uint *)(&DAT_00758db4 + lVar8);
  uVar5 = (uVar44 ^ uVar5) & uVar1 ^ uVar5;
  uVar7 = (*(uint *)(&DAT_00758d5c + lVar8) ^ uVar7) & uVar1 ^ uVar7;
  uVar44 = *(uint *)(&DAT_00758dd0 + lVar8);
  uVar172 = (uVar40 ^ uVar172) & uVar1 ^ uVar172;
  uVar40 = *(uint *)(&DAT_00758d90 + lVar8);
  uVar3 = (uVar42 ^ uVar3) & uVar1 ^ uVar3;
  uVar42 = *(uint *)(&DAT_00758db8 + lVar8);
  uVar4 = (uVar38 ^ uVar4) & uVar1 ^ uVar4;
  uVar38 = *(uint *)(&DAT_00758dd4 + lVar8);
  uVar1 = (*(uint *)(&DAT_00758dcc + lVar8) ^ uVar3) & uVar2 ^ uVar3;
  param_1[0xf] = uVar3;
  param_1[0x10] = uVar5;
  uVar5 = (uVar44 ^ uVar5) & uVar2 ^ uVar5;
  uVar3 = (uVar36 ^ uVar172) & uVar2 ^ uVar172;
  param_1[9] = uVar172;
  param_1[10] = uVar4;
  param_1[0x11] = uVar7;
  param_1[0x12] = uVar37;
  param_1[0x13] =
       (uint)(CONCAT17(bVar85,CONCAT16(bVar84,CONCAT15(bVar83,CONCAT14(bVar82,uVar37)))) >> 0x20);
  param_1[0x14] = uVar174;
  param_1[0x15] =
       (uint)(CONCAT17(bVar93,CONCAT16(bVar92,CONCAT15(bVar91,CONCAT14(bVar90,uVar174)))) >> 0x20);
  bVar78 = ((byte)uVar176 ^ bVar78) & bVar94 ^ bVar78;
  bVar79 = ((byte)((ulong)uVar176 >> 8) ^ bVar79) & bVar94 ^ bVar79;
  bVar80 = ((byte)((ulong)uVar176 >> 0x10) ^ bVar80) & bVar94 ^ bVar80;
  bVar81 = ((byte)((ulong)uVar176 >> 0x18) ^ bVar81) & bVar94 ^ bVar81;
  uVar172 = CONCAT13(bVar81,CONCAT12(bVar80,CONCAT11(bVar79,bVar78)));
  bVar82 = ((byte)((ulong)uVar176 >> 0x20) ^ bVar82) & bVar94 ^ bVar82;
  bVar83 = ((byte)((ulong)uVar176 >> 0x28) ^ bVar83) & bVar94 ^ bVar83;
  bVar84 = ((byte)((ulong)uVar176 >> 0x30) ^ bVar84) & bVar94 ^ bVar84;
  bVar85 = ((byte)((ulong)uVar176 >> 0x38) ^ bVar85) & bVar94 ^ bVar85;
  bVar86 = ((byte)uVar177 ^ bVar86) & bVar94 ^ bVar86;
  bVar87 = ((byte)((ulong)uVar177 >> 8) ^ bVar87) & bVar94 ^ bVar87;
  bVar88 = ((byte)((ulong)uVar177 >> 0x10) ^ bVar88) & bVar94 ^ bVar88;
  bVar89 = ((byte)((ulong)uVar177 >> 0x18) ^ bVar89) & bVar94 ^ bVar89;
  uVar44 = CONCAT13(bVar89,CONCAT12(bVar88,CONCAT11(bVar87,bVar86)));
  bVar90 = ((byte)((ulong)uVar177 >> 0x20) ^ bVar90) & bVar94 ^ bVar90;
  bVar91 = ((byte)((ulong)uVar177 >> 0x28) ^ bVar91) & bVar94 ^ bVar91;
  bVar92 = ((byte)((ulong)uVar177 >> 0x30) ^ bVar92) & bVar94 ^ bVar92;
  bVar93 = ((byte)((ulong)uVar177 >> 0x38) ^ bVar93) & bVar94 ^ bVar93;
  *(ulong *)(param_1 + 0x18) =
       CONCAT17(bVar110,CONCAT16(bVar109,CONCAT15(bVar108,CONCAT14(bVar107,CONCAT13(bVar106,CONCAT12
                                                  (bVar105,CONCAT11(bVar104,bVar103)))))));
  *(ulong *)(param_1 + 0x16) =
       CONCAT17(bVar102,CONCAT16(bVar101,CONCAT15(bVar100,CONCAT14(bVar99,CONCAT13(bVar98,CONCAT12(
                                                  bVar97,CONCAT11(bVar96,bVar95)))))));
  uVar7 = (uVar38 ^ uVar7) & uVar2 ^ uVar7;
  *(ulong *)(param_1 + 0x1c) =
       CONCAT17(bVar77,CONCAT16(bVar76,CONCAT15(bVar75,CONCAT14(bVar74,CONCAT13(bVar73,CONCAT12(
                                                  bVar72,CONCAT11(bVar71,bVar69)))))));
  *(ulong *)(param_1 + 0x1a) =
       CONCAT17(bVar68,CONCAT16(bVar67,CONCAT15(bVar66,CONCAT14(bVar65,CONCAT13(bVar64,CONCAT12(
                                                  bVar63,CONCAT11(bVar62,bVar60)))))));
  *(ulong *)(param_1 + 3) =
       CONCAT17(bVar134,CONCAT16(bVar133,CONCAT15(bVar132,CONCAT14(bVar130,CONCAT13(bVar129,CONCAT12
                                                  (bVar128,CONCAT11(bVar127,bVar123)))))));
  *(ulong *)(param_1 + 1) =
       CONCAT17(bVar122,CONCAT16(bVar121,CONCAT15(bVar120,CONCAT14(bVar118,CONCAT13(bVar117,CONCAT12
                                                  (bVar116,CONCAT11(bVar115,bVar111)))))));
  uVar6 = (uVar40 ^ uVar6) & uVar2 ^ uVar6;
  uVar4 = (uVar42 ^ uVar4) & uVar2 ^ uVar4;
  uVar2 = *(uint *)(&DAT_00758e08 + lVar8);
  param_1[0xf] = uVar1;
  param_1[0x10] = uVar5;
  param_1[0x11] = uVar7;
  *param_1 = uVar6;
  *(ulong *)(param_1 + 7) =
       CONCAT17(bVar169,CONCAT16(bVar168,CONCAT15(bVar167,CONCAT14(bVar166,CONCAT13(bVar165,CONCAT12
                                                  (bVar164,CONCAT11(bVar163,bVar162)))))));
  *(ulong *)(param_1 + 5) =
       CONCAT17(bVar161,CONCAT16(bVar160,CONCAT15(bVar159,CONCAT14(bVar158,CONCAT13(bVar157,CONCAT12
                                                  (bVar156,CONCAT11(bVar155,bVar154)))))));
  param_1[9] = uVar3;
  param_1[10] = uVar4;
  *(ulong *)(param_1 + 0xd) =
       CONCAT17(bVar153,CONCAT16(bVar152,CONCAT15(bVar151,CONCAT14(bVar150,CONCAT13(bVar149,CONCAT12
                                                  (bVar148,CONCAT11(bVar147,bVar146)))))));
  *(ulong *)(param_1 + 0xb) =
       CONCAT17(bVar145,CONCAT16(bVar144,CONCAT15(bVar143,CONCAT14(bVar142,CONCAT13(bVar141,CONCAT12
                                                  (bVar140,CONCAT11(bVar139,bVar138)))))));
  param_1[0x12] = uVar172;
  uVar38 = *(uint *)(&DAT_00758e2c + lVar8);
  iVar31 = ((uVar41 ^ 5) & 0xff) - 1;
  param_1[0x13] =
       (uint)(CONCAT17(bVar85,CONCAT16(bVar84,CONCAT15(bVar83,CONCAT14(bVar82,uVar172)))) >> 0x20);
  uVar172 = iVar31 >> 0x1f;
  uVar40 = *(uint *)(&DAT_00758e44 + lVar8);
  param_1[0x14] = uVar44;
  uVar42 = *(uint *)(&DAT_00758e48 + lVar8);
  param_1[0x15] =
       (uint)(CONCAT17(bVar93,CONCAT16(bVar92,CONCAT15(bVar91,CONCAT14(bVar90,uVar44)))) >> 0x20);
  uVar3 = (uVar38 ^ uVar3) & uVar172 ^ uVar3;
  bVar95 = ((byte)uVar178 ^ bVar95) & bVar94 ^ bVar95;
  bVar96 = ((byte)((ulong)uVar178 >> 8) ^ bVar96) & bVar94 ^ bVar96;
  bVar97 = ((byte)((ulong)uVar178 >> 0x10) ^ bVar97) & bVar94 ^ bVar97;
  bVar98 = ((byte)((ulong)uVar178 >> 0x18) ^ bVar98) & bVar94 ^ bVar98;
  bVar99 = ((byte)((ulong)uVar178 >> 0x20) ^ bVar99) & bVar94 ^ bVar99;
  bVar100 = ((byte)((ulong)uVar178 >> 0x28) ^ bVar100) & bVar94 ^ bVar100;
  bVar101 = ((byte)((ulong)uVar178 >> 0x30) ^ bVar101) & bVar94 ^ bVar101;
  bVar102 = ((byte)((ulong)uVar178 >> 0x38) ^ bVar102) & bVar94 ^ bVar102;
  bVar103 = ((byte)uVar179 ^ bVar103) & bVar94 ^ bVar103;
  bVar104 = ((byte)((ulong)uVar179 >> 8) ^ bVar104) & bVar94 ^ bVar104;
  bVar105 = ((byte)((ulong)uVar179 >> 0x10) ^ bVar105) & bVar94 ^ bVar105;
  bVar106 = ((byte)((ulong)uVar179 >> 0x18) ^ bVar106) & bVar94 ^ bVar106;
  bVar107 = ((byte)((ulong)uVar179 >> 0x20) ^ bVar107) & bVar94 ^ bVar107;
  bVar108 = ((byte)((ulong)uVar179 >> 0x28) ^ bVar108) & bVar94 ^ bVar108;
  bVar109 = ((byte)((ulong)uVar179 >> 0x30) ^ bVar109) & bVar94 ^ bVar109;
  bVar110 = ((byte)((ulong)uVar179 >> 0x38) ^ bVar110) & bVar94 ^ bVar110;
  bVar60 = ((byte)uVar61 ^ bVar60) & bVar94 ^ bVar60;
  bVar62 = ((byte)((ulong)uVar61 >> 8) ^ bVar62) & bVar94 ^ bVar62;
  bVar63 = ((byte)((ulong)uVar61 >> 0x10) ^ bVar63) & bVar94 ^ bVar63;
  bVar64 = ((byte)((ulong)uVar61 >> 0x18) ^ bVar64) & bVar94 ^ bVar64;
  bVar65 = ((byte)((ulong)uVar61 >> 0x20) ^ bVar65) & bVar94 ^ bVar65;
  bVar66 = ((byte)((ulong)uVar61 >> 0x28) ^ bVar66) & bVar94 ^ bVar66;
  bVar67 = ((byte)((ulong)uVar61 >> 0x30) ^ bVar67) & bVar94 ^ bVar67;
  bVar68 = ((byte)((ulong)uVar61 >> 0x38) ^ bVar68) & bVar94 ^ bVar68;
  bVar69 = ((byte)uVar70 ^ bVar69) & bVar94 ^ bVar69;
  bVar71 = ((byte)((ulong)uVar70 >> 8) ^ bVar71) & bVar94 ^ bVar71;
  bVar72 = ((byte)((ulong)uVar70 >> 0x10) ^ bVar72) & bVar94 ^ bVar72;
  bVar73 = ((byte)((ulong)uVar70 >> 0x18) ^ bVar73) & bVar94 ^ bVar73;
  bVar74 = ((byte)((ulong)uVar70 >> 0x20) ^ bVar74) & bVar94 ^ bVar74;
  bVar75 = ((byte)((ulong)uVar70 >> 0x28) ^ bVar75) & bVar94 ^ bVar75;
  bVar76 = ((byte)((ulong)uVar70 >> 0x30) ^ bVar76) & bVar94 ^ bVar76;
  bVar77 = ((byte)((ulong)uVar70 >> 0x38) ^ bVar77) & bVar94 ^ bVar77;
  bVar10 = (byte)(iVar31 >> 0x1f);
  bVar111 = ((byte)uVar50 ^ bVar111) & bVar10 ^ bVar111;
  bVar115 = ((byte)((ulong)uVar50 >> 8) ^ bVar115) & bVar10 ^ bVar115;
  bVar116 = ((byte)((ulong)uVar50 >> 0x10) ^ bVar116) & bVar10 ^ bVar116;
  bVar117 = ((byte)((ulong)uVar50 >> 0x18) ^ bVar117) & bVar10 ^ bVar117;
  bVar118 = ((byte)((ulong)uVar50 >> 0x20) ^ bVar118) & bVar10 ^ bVar118;
  bVar120 = ((byte)((ulong)uVar50 >> 0x28) ^ bVar120) & bVar10 ^ bVar120;
  bVar121 = ((byte)((ulong)uVar50 >> 0x30) ^ bVar121) & bVar10 ^ bVar121;
  bVar122 = ((byte)((ulong)uVar50 >> 0x38) ^ bVar122) & bVar10 ^ bVar122;
  bVar123 = ((byte)uVar51 ^ bVar123) & bVar10 ^ bVar123;
  bVar127 = ((byte)((ulong)uVar51 >> 8) ^ bVar127) & bVar10 ^ bVar127;
  bVar128 = ((byte)((ulong)uVar51 >> 0x10) ^ bVar128) & bVar10 ^ bVar128;
  bVar129 = ((byte)((ulong)uVar51 >> 0x18) ^ bVar129) & bVar10 ^ bVar129;
  bVar130 = ((byte)((ulong)uVar51 >> 0x20) ^ bVar130) & bVar10 ^ bVar130;
  bVar132 = ((byte)((ulong)uVar51 >> 0x28) ^ bVar132) & bVar10 ^ bVar132;
  bVar133 = ((byte)((ulong)uVar51 >> 0x30) ^ bVar133) & bVar10 ^ bVar133;
  bVar134 = ((byte)((ulong)uVar51 >> 0x38) ^ bVar134) & bVar10 ^ bVar134;
  uVar6 = (uVar2 ^ uVar6) & uVar172 ^ uVar6;
  bVar154 = ((byte)uVar186 ^ bVar154) & bVar10 ^ bVar154;
  bVar155 = ((byte)((ulong)uVar186 >> 8) ^ bVar155) & bVar10 ^ bVar155;
  bVar156 = ((byte)((ulong)uVar186 >> 0x10) ^ bVar156) & bVar10 ^ bVar156;
  bVar157 = ((byte)((ulong)uVar186 >> 0x18) ^ bVar157) & bVar10 ^ bVar157;
  uVar36 = CONCAT13(bVar157,CONCAT12(bVar156,CONCAT11(bVar155,bVar154)));
  bVar158 = ((byte)((ulong)uVar186 >> 0x20) ^ bVar158) & bVar10 ^ bVar158;
  bVar159 = ((byte)((ulong)uVar186 >> 0x28) ^ bVar159) & bVar10 ^ bVar159;
  bVar160 = ((byte)((ulong)uVar186 >> 0x30) ^ bVar160) & bVar10 ^ bVar160;
  bVar161 = ((byte)((ulong)uVar186 >> 0x38) ^ bVar161) & bVar10 ^ bVar161;
  bVar162 = ((byte)uVar187 ^ bVar162) & bVar10 ^ bVar162;
  bVar163 = ((byte)((ulong)uVar187 >> 8) ^ bVar163) & bVar10 ^ bVar163;
  bVar164 = ((byte)((ulong)uVar187 >> 0x10) ^ bVar164) & bVar10 ^ bVar164;
  bVar165 = ((byte)((ulong)uVar187 >> 0x18) ^ bVar165) & bVar10 ^ bVar165;
  uVar37 = CONCAT13(bVar165,CONCAT12(bVar164,CONCAT11(bVar163,bVar162)));
  bVar166 = ((byte)((ulong)uVar187 >> 0x20) ^ bVar166) & bVar10 ^ bVar166;
  bVar167 = ((byte)((ulong)uVar187 >> 0x28) ^ bVar167) & bVar10 ^ bVar167;
  bVar168 = ((byte)((ulong)uVar187 >> 0x30) ^ bVar168) & bVar10 ^ bVar168;
  bVar169 = ((byte)((ulong)uVar187 >> 0x38) ^ bVar169) & bVar10 ^ bVar169;
  uVar7 = (*(uint *)(&DAT_00758e4c + lVar8) ^ uVar7) & uVar172 ^ uVar7;
  uVar2 = *(uint *)(&DAT_00758e80 + lVar8);
  uVar38 = *(uint *)(&DAT_00758ea4 + lVar8);
  uVar4 = (*(uint *)(&DAT_00758e30 + lVar8) ^ uVar4) & uVar172 ^ uVar4;
  uVar44 = *(uint *)(&DAT_00758ea8 + lVar8);
  *(ulong *)(param_1 + 0x18) =
       CONCAT17(bVar110,CONCAT16(bVar109,CONCAT15(bVar108,CONCAT14(bVar107,CONCAT13(bVar106,CONCAT12
                                                  (bVar105,CONCAT11(bVar104,bVar103)))))));
  *(ulong *)(param_1 + 0x16) =
       CONCAT17(bVar102,CONCAT16(bVar101,CONCAT15(bVar100,CONCAT14(bVar99,CONCAT13(bVar98,CONCAT12(
                                                  bVar97,CONCAT11(bVar96,bVar95)))))));
  *(ulong *)(param_1 + 0x1c) =
       CONCAT17(bVar77,CONCAT16(bVar76,CONCAT15(bVar75,CONCAT14(bVar74,CONCAT13(bVar73,CONCAT12(
                                                  bVar72,CONCAT11(bVar71,bVar69)))))));
  *(ulong *)(param_1 + 0x1a) =
       CONCAT17(bVar68,CONCAT16(bVar67,CONCAT15(bVar66,CONCAT14(bVar65,CONCAT13(bVar64,CONCAT12(
                                                  bVar63,CONCAT11(bVar62,bVar60)))))));
  *param_1 = uVar6;
  *(ulong *)(param_1 + 3) =
       CONCAT17(bVar134,CONCAT16(bVar133,CONCAT15(bVar132,CONCAT14(bVar130,CONCAT13(bVar129,CONCAT12
                                                  (bVar128,CONCAT11(bVar127,bVar123)))))));
  *(ulong *)(param_1 + 1) =
       CONCAT17(bVar122,CONCAT16(bVar121,CONCAT15(bVar120,CONCAT14(bVar118,CONCAT13(bVar117,CONCAT12
                                                  (bVar116,CONCAT11(bVar115,bVar111)))))));
  param_1[5] = uVar36;
  uVar1 = (uVar40 ^ uVar1) & uVar172 ^ uVar1;
  uVar40 = *(uint *)(&DAT_00758ebc + lVar8);
  param_1[6] = (uint)(CONCAT17(bVar161,CONCAT16(bVar160,CONCAT15(bVar159,CONCAT14(bVar158,uVar36))))
                     >> 0x20);
  uVar5 = (uVar42 ^ uVar5) & uVar172 ^ uVar5;
  uVar42 = *(uint *)(&DAT_00758ec0 + lVar8);
  param_1[7] = uVar37;
  bVar138 = ((byte)uVar182 ^ bVar138) & bVar10 ^ bVar138;
  bVar139 = ((byte)((ulong)uVar182 >> 8) ^ bVar139) & bVar10 ^ bVar139;
  bVar140 = ((byte)((ulong)uVar182 >> 0x10) ^ bVar140) & bVar10 ^ bVar140;
  bVar141 = ((byte)((ulong)uVar182 >> 0x18) ^ bVar141) & bVar10 ^ bVar141;
  bVar142 = ((byte)((ulong)uVar182 >> 0x20) ^ bVar142) & bVar10 ^ bVar142;
  bVar143 = ((byte)((ulong)uVar182 >> 0x28) ^ bVar143) & bVar10 ^ bVar143;
  bVar144 = ((byte)((ulong)uVar182 >> 0x30) ^ bVar144) & bVar10 ^ bVar144;
  bVar145 = ((byte)((ulong)uVar182 >> 0x38) ^ bVar145) & bVar10 ^ bVar145;
  bVar146 = ((byte)uVar183 ^ bVar146) & bVar10 ^ bVar146;
  bVar147 = ((byte)((ulong)uVar183 >> 8) ^ bVar147) & bVar10 ^ bVar147;
  bVar148 = ((byte)((ulong)uVar183 >> 0x10) ^ bVar148) & bVar10 ^ bVar148;
  bVar149 = ((byte)((ulong)uVar183 >> 0x18) ^ bVar149) & bVar10 ^ bVar149;
  bVar150 = ((byte)((ulong)uVar183 >> 0x20) ^ bVar150) & bVar10 ^ bVar150;
  bVar151 = ((byte)((ulong)uVar183 >> 0x28) ^ bVar151) & bVar10 ^ bVar151;
  bVar152 = ((byte)((ulong)uVar183 >> 0x30) ^ bVar152) & bVar10 ^ bVar152;
  bVar153 = ((byte)((ulong)uVar183 >> 0x38) ^ bVar153) & bVar10 ^ bVar153;
  uVar36 = *(uint *)(&DAT_00758ec4 + lVar8);
  param_1[8] = (uint)(CONCAT17(bVar169,CONCAT16(bVar168,CONCAT15(bVar167,CONCAT14(bVar166,uVar37))))
                     >> 0x20);
  param_1[0xf] = uVar1;
  param_1[0x10] = uVar5;
  param_1[0x11] = uVar7;
  bVar78 = ((byte)uVar188 ^ bVar78) & bVar10 ^ bVar78;
  bVar79 = ((byte)((ulong)uVar188 >> 8) ^ bVar79) & bVar10 ^ bVar79;
  bVar80 = ((byte)((ulong)uVar188 >> 0x10) ^ bVar80) & bVar10 ^ bVar80;
  bVar81 = ((byte)((ulong)uVar188 >> 0x18) ^ bVar81) & bVar10 ^ bVar81;
  bVar82 = ((byte)((ulong)uVar188 >> 0x20) ^ bVar82) & bVar10 ^ bVar82;
  bVar83 = ((byte)((ulong)uVar188 >> 0x28) ^ bVar83) & bVar10 ^ bVar83;
  bVar84 = ((byte)((ulong)uVar188 >> 0x30) ^ bVar84) & bVar10 ^ bVar84;
  bVar85 = ((byte)((ulong)uVar188 >> 0x38) ^ bVar85) & bVar10 ^ bVar85;
  bVar86 = ((byte)uVar189 ^ bVar86) & bVar10 ^ bVar86;
  bVar87 = ((byte)((ulong)uVar189 >> 8) ^ bVar87) & bVar10 ^ bVar87;
  bVar88 = ((byte)((ulong)uVar189 >> 0x10) ^ bVar88) & bVar10 ^ bVar88;
  bVar89 = ((byte)((ulong)uVar189 >> 0x18) ^ bVar89) & bVar10 ^ bVar89;
  bVar90 = ((byte)((ulong)uVar189 >> 0x20) ^ bVar90) & bVar10 ^ bVar90;
  bVar91 = ((byte)((ulong)uVar189 >> 0x28) ^ bVar91) & bVar10 ^ bVar91;
  bVar92 = ((byte)((ulong)uVar189 >> 0x30) ^ bVar92) & bVar10 ^ bVar92;
  bVar93 = ((byte)((ulong)uVar189 >> 0x38) ^ bVar93) & bVar10 ^ bVar93;
  bVar95 = (bVar190 ^ bVar95) & bVar10 ^ bVar95;
  bVar96 = (bVar191 ^ bVar96) & bVar10 ^ bVar96;
  bVar97 = (bVar192 ^ bVar97) & bVar10 ^ bVar97;
  bVar98 = (bVar193 ^ bVar98) & bVar10 ^ bVar98;
  uVar37 = CONCAT13(bVar98,CONCAT12(bVar97,CONCAT11(bVar96,bVar95)));
  bVar99 = (bVar194 ^ bVar99) & bVar10 ^ bVar99;
  bVar100 = (bVar195 ^ bVar100) & bVar10 ^ bVar100;
  bVar101 = (bVar196 ^ bVar101) & bVar10 ^ bVar101;
  bVar102 = (bVar197 ^ bVar102) & bVar10 ^ bVar102;
  bVar103 = (bVar198 ^ bVar103) & bVar10 ^ bVar103;
  bVar104 = (bVar199 ^ bVar104) & bVar10 ^ bVar104;
  bVar105 = (bVar200 ^ bVar105) & bVar10 ^ bVar105;
  bVar106 = (bVar201 ^ bVar106) & bVar10 ^ bVar106;
  uVar174 = CONCAT13(bVar106,CONCAT12(bVar105,CONCAT11(bVar104,bVar103)));
  bVar107 = (bVar202 ^ bVar107) & bVar10 ^ bVar107;
  bVar108 = (bVar203 ^ bVar108) & bVar10 ^ bVar108;
  bVar109 = (bVar204 ^ bVar109) & bVar10 ^ bVar109;
  bVar110 = (bVar205 ^ bVar110) & bVar10 ^ bVar110;
  uVar51 = *(undefined8 *)(&UNK_00758ed0 + lVar8);
  uVar50 = *(undefined8 *)(&DAT_00758ec8 + lVar8);
  uVar57 = *(undefined8 *)(&UNK_00758ee0 + lVar8);
  uVar56 = *(undefined8 *)(&DAT_00758ed8 + lVar8);
  iVar31 = ((uVar41 ^ 6) & 0xff) - 1;
  uVar172 = iVar31 >> 0x1f;
  param_1[9] = uVar3;
  uVar3 = (uVar38 ^ uVar3) & uVar172 ^ uVar3;
  uVar38 = *(uint *)(&DAT_00758ef8 + lVar8);
  param_1[10] = uVar4;
  bVar60 = ((byte)uVar54 ^ bVar60) & bVar10 ^ bVar60;
  bVar62 = ((byte)((ulong)uVar54 >> 8) ^ bVar62) & bVar10 ^ bVar62;
  bVar63 = ((byte)((ulong)uVar54 >> 0x10) ^ bVar63) & bVar10 ^ bVar63;
  bVar64 = ((byte)((ulong)uVar54 >> 0x18) ^ bVar64) & bVar10 ^ bVar64;
  bVar65 = ((byte)((ulong)uVar54 >> 0x20) ^ bVar65) & bVar10 ^ bVar65;
  bVar66 = ((byte)((ulong)uVar54 >> 0x28) ^ bVar66) & bVar10 ^ bVar66;
  bVar67 = ((byte)((ulong)uVar54 >> 0x30) ^ bVar67) & bVar10 ^ bVar67;
  bVar68 = ((byte)((ulong)uVar54 >> 0x38) ^ bVar68) & bVar10 ^ bVar68;
  bVar69 = ((byte)uVar55 ^ bVar69) & bVar10 ^ bVar69;
  bVar71 = ((byte)((ulong)uVar55 >> 8) ^ bVar71) & bVar10 ^ bVar71;
  bVar72 = ((byte)((ulong)uVar55 >> 0x10) ^ bVar72) & bVar10 ^ bVar72;
  bVar73 = ((byte)((ulong)uVar55 >> 0x18) ^ bVar73) & bVar10 ^ bVar73;
  bVar74 = ((byte)((ulong)uVar55 >> 0x20) ^ bVar74) & bVar10 ^ bVar74;
  bVar75 = ((byte)((ulong)uVar55 >> 0x28) ^ bVar75) & bVar10 ^ bVar75;
  bVar76 = ((byte)((ulong)uVar55 >> 0x30) ^ bVar76) & bVar10 ^ bVar76;
  bVar77 = ((byte)((ulong)uVar55 >> 0x38) ^ bVar77) & bVar10 ^ bVar77;
  bVar10 = (byte)(iVar31 >> 0x1f);
  uVar1 = (uVar40 ^ uVar1) & uVar172 ^ uVar1;
  uVar5 = (uVar42 ^ uVar5) & uVar172 ^ uVar5;
  uVar7 = (uVar36 ^ uVar7) & uVar172 ^ uVar7;
  uVar6 = (uVar2 ^ uVar6) & uVar172 ^ uVar6;
  uVar4 = (uVar44 ^ uVar4) & uVar172 ^ uVar4;
  uVar2 = *(uint *)(&DAT_00758f1c + lVar8);
  *(ulong *)(param_1 + 0xd) =
       CONCAT17(bVar153,CONCAT16(bVar152,CONCAT15(bVar151,CONCAT14(bVar150,CONCAT13(bVar149,CONCAT12
                                                  (bVar148,CONCAT11(bVar147,bVar146)))))));
  *(ulong *)(param_1 + 0xb) =
       CONCAT17(bVar145,CONCAT16(bVar144,CONCAT15(bVar143,CONCAT14(bVar142,CONCAT13(bVar141,CONCAT12
                                                  (bVar140,CONCAT11(bVar139,bVar138)))))));
  bVar138 = ((byte)uVar46 ^ bVar138) & bVar10 ^ bVar138;
  bVar139 = ((byte)((ulong)uVar46 >> 8) ^ bVar139) & bVar10 ^ bVar139;
  bVar140 = ((byte)((ulong)uVar46 >> 0x10) ^ bVar140) & bVar10 ^ bVar140;
  bVar141 = ((byte)((ulong)uVar46 >> 0x18) ^ bVar141) & bVar10 ^ bVar141;
  bVar142 = ((byte)((ulong)uVar46 >> 0x20) ^ bVar142) & bVar10 ^ bVar142;
  bVar143 = ((byte)((ulong)uVar46 >> 0x28) ^ bVar143) & bVar10 ^ bVar143;
  bVar144 = ((byte)((ulong)uVar46 >> 0x30) ^ bVar144) & bVar10 ^ bVar144;
  bVar145 = ((byte)((ulong)uVar46 >> 0x38) ^ bVar145) & bVar10 ^ bVar145;
  bVar146 = ((byte)uVar126 ^ bVar146) & bVar10 ^ bVar146;
  bVar147 = ((byte)((ulong)uVar126 >> 8) ^ bVar147) & bVar10 ^ bVar147;
  bVar148 = ((byte)((ulong)uVar126 >> 0x10) ^ bVar148) & bVar10 ^ bVar148;
  bVar149 = ((byte)((ulong)uVar126 >> 0x18) ^ bVar149) & bVar10 ^ bVar149;
  bVar150 = ((byte)((ulong)uVar126 >> 0x20) ^ bVar150) & bVar10 ^ bVar150;
  bVar151 = ((byte)((ulong)uVar126 >> 0x28) ^ bVar151) & bVar10 ^ bVar151;
  bVar152 = ((byte)((ulong)uVar126 >> 0x30) ^ bVar152) & bVar10 ^ bVar152;
  bVar153 = ((byte)((ulong)uVar126 >> 0x38) ^ bVar153) & bVar10 ^ bVar153;
  *(ulong *)(param_1 + 0x14) =
       CONCAT17(bVar93,CONCAT16(bVar92,CONCAT15(bVar91,CONCAT14(bVar90,CONCAT13(bVar89,CONCAT12(
                                                  bVar88,CONCAT11(bVar87,bVar86)))))));
  *(ulong *)(param_1 + 0x12) =
       CONCAT17(bVar85,CONCAT16(bVar84,CONCAT15(bVar83,CONCAT14(bVar82,CONCAT13(bVar81,CONCAT12(
                                                  bVar80,CONCAT11(bVar79,bVar78)))))));
  param_1[0x16] = uVar37;
  param_1[0x17] =
       (uint)(CONCAT17(bVar102,CONCAT16(bVar101,CONCAT15(bVar100,CONCAT14(bVar99,uVar37)))) >> 0x20)
  ;
  param_1[0x18] = uVar174;
  param_1[0x19] =
       (uint)(CONCAT17(bVar110,CONCAT16(bVar109,CONCAT15(bVar108,CONCAT14(bVar107,uVar174)))) >>
             0x20);
  bVar111 = ((byte)uVar170 ^ bVar111) & bVar10 ^ bVar111;
  bVar115 = ((byte)((ulong)uVar170 >> 8) ^ bVar115) & bVar10 ^ bVar115;
  bVar116 = ((byte)((ulong)uVar170 >> 0x10) ^ bVar116) & bVar10 ^ bVar116;
  bVar117 = ((byte)((ulong)uVar170 >> 0x18) ^ bVar117) & bVar10 ^ bVar117;
  bVar118 = ((byte)((ulong)uVar170 >> 0x20) ^ bVar118) & bVar10 ^ bVar118;
  bVar120 = ((byte)((ulong)uVar170 >> 0x28) ^ bVar120) & bVar10 ^ bVar120;
  bVar121 = ((byte)((ulong)uVar170 >> 0x30) ^ bVar121) & bVar10 ^ bVar121;
  bVar122 = ((byte)((ulong)uVar170 >> 0x38) ^ bVar122) & bVar10 ^ bVar122;
  bVar123 = ((byte)uVar171 ^ bVar123) & bVar10 ^ bVar123;
  bVar127 = ((byte)((ulong)uVar171 >> 8) ^ bVar127) & bVar10 ^ bVar127;
  bVar128 = ((byte)((ulong)uVar171 >> 0x10) ^ bVar128) & bVar10 ^ bVar128;
  bVar129 = ((byte)((ulong)uVar171 >> 0x18) ^ bVar129) & bVar10 ^ bVar129;
  bVar130 = ((byte)((ulong)uVar171 >> 0x20) ^ bVar130) & bVar10 ^ bVar130;
  bVar132 = ((byte)((ulong)uVar171 >> 0x28) ^ bVar132) & bVar10 ^ bVar132;
  bVar133 = ((byte)((ulong)uVar171 >> 0x30) ^ bVar133) & bVar10 ^ bVar133;
  bVar134 = ((byte)((ulong)uVar171 >> 0x38) ^ bVar134) & bVar10 ^ bVar134;
  bVar154 = ((byte)uVar135 ^ bVar154) & bVar10 ^ bVar154;
  bVar155 = ((byte)((ulong)uVar135 >> 8) ^ bVar155) & bVar10 ^ bVar155;
  bVar156 = ((byte)((ulong)uVar135 >> 0x10) ^ bVar156) & bVar10 ^ bVar156;
  bVar157 = ((byte)((ulong)uVar135 >> 0x18) ^ bVar157) & bVar10 ^ bVar157;
  bVar158 = ((byte)((ulong)uVar135 >> 0x20) ^ bVar158) & bVar10 ^ bVar158;
  bVar159 = ((byte)((ulong)uVar135 >> 0x28) ^ bVar159) & bVar10 ^ bVar159;
  bVar160 = ((byte)((ulong)uVar135 >> 0x30) ^ bVar160) & bVar10 ^ bVar160;
  bVar161 = ((byte)((ulong)uVar135 >> 0x38) ^ bVar161) & bVar10 ^ bVar161;
  bVar162 = ((byte)uVar136 ^ bVar162) & bVar10 ^ bVar162;
  bVar163 = ((byte)((ulong)uVar136 >> 8) ^ bVar163) & bVar10 ^ bVar163;
  bVar164 = ((byte)((ulong)uVar136 >> 0x10) ^ bVar164) & bVar10 ^ bVar164;
  bVar165 = ((byte)((ulong)uVar136 >> 0x18) ^ bVar165) & bVar10 ^ bVar165;
  bVar166 = ((byte)((ulong)uVar136 >> 0x20) ^ bVar166) & bVar10 ^ bVar166;
  bVar167 = ((byte)((ulong)uVar136 >> 0x28) ^ bVar167) & bVar10 ^ bVar167;
  bVar168 = ((byte)((ulong)uVar136 >> 0x30) ^ bVar168) & bVar10 ^ bVar168;
  bVar169 = ((byte)((ulong)uVar136 >> 0x38) ^ bVar169) & bVar10 ^ bVar169;
  bVar78 = ((byte)uVar50 ^ bVar78) & bVar10 ^ bVar78;
  bVar79 = ((byte)((ulong)uVar50 >> 8) ^ bVar79) & bVar10 ^ bVar79;
  bVar80 = ((byte)((ulong)uVar50 >> 0x10) ^ bVar80) & bVar10 ^ bVar80;
  bVar81 = ((byte)((ulong)uVar50 >> 0x18) ^ bVar81) & bVar10 ^ bVar81;
  bVar82 = ((byte)((ulong)uVar50 >> 0x20) ^ bVar82) & bVar10 ^ bVar82;
  bVar83 = ((byte)((ulong)uVar50 >> 0x28) ^ bVar83) & bVar10 ^ bVar83;
  bVar84 = ((byte)((ulong)uVar50 >> 0x30) ^ bVar84) & bVar10 ^ bVar84;
  bVar85 = ((byte)((ulong)uVar50 >> 0x38) ^ bVar85) & bVar10 ^ bVar85;
  bVar86 = ((byte)uVar51 ^ bVar86) & bVar10 ^ bVar86;
  bVar87 = ((byte)((ulong)uVar51 >> 8) ^ bVar87) & bVar10 ^ bVar87;
  bVar88 = ((byte)((ulong)uVar51 >> 0x10) ^ bVar88) & bVar10 ^ bVar88;
  bVar89 = ((byte)((ulong)uVar51 >> 0x18) ^ bVar89) & bVar10 ^ bVar89;
  bVar90 = ((byte)((ulong)uVar51 >> 0x20) ^ bVar90) & bVar10 ^ bVar90;
  bVar91 = ((byte)((ulong)uVar51 >> 0x28) ^ bVar91) & bVar10 ^ bVar91;
  bVar92 = ((byte)((ulong)uVar51 >> 0x30) ^ bVar92) & bVar10 ^ bVar92;
  bVar93 = ((byte)((ulong)uVar51 >> 0x38) ^ bVar93) & bVar10 ^ bVar93;
  bVar95 = ((byte)uVar56 ^ bVar95) & bVar10 ^ bVar95;
  bVar96 = ((byte)((ulong)uVar56 >> 8) ^ bVar96) & bVar10 ^ bVar96;
  bVar97 = ((byte)((ulong)uVar56 >> 0x10) ^ bVar97) & bVar10 ^ bVar97;
  bVar98 = ((byte)((ulong)uVar56 >> 0x18) ^ bVar98) & bVar10 ^ bVar98;
  uVar172 = CONCAT13(bVar98,CONCAT12(bVar97,CONCAT11(bVar96,bVar95)));
  bVar99 = ((byte)((ulong)uVar56 >> 0x20) ^ bVar99) & bVar10 ^ bVar99;
  bVar100 = ((byte)((ulong)uVar56 >> 0x28) ^ bVar100) & bVar10 ^ bVar100;
  bVar101 = ((byte)((ulong)uVar56 >> 0x30) ^ bVar101) & bVar10 ^ bVar101;
  bVar102 = ((byte)((ulong)uVar56 >> 0x38) ^ bVar102) & bVar10 ^ bVar102;
  bVar103 = ((byte)uVar57 ^ bVar103) & bVar10 ^ bVar103;
  bVar104 = ((byte)((ulong)uVar57 >> 8) ^ bVar104) & bVar10 ^ bVar104;
  bVar105 = ((byte)((ulong)uVar57 >> 0x10) ^ bVar105) & bVar10 ^ bVar105;
  bVar106 = ((byte)((ulong)uVar57 >> 0x18) ^ bVar106) & bVar10 ^ bVar106;
  uVar36 = CONCAT13(bVar106,CONCAT12(bVar105,CONCAT11(bVar104,bVar103)));
  bVar107 = ((byte)((ulong)uVar57 >> 0x20) ^ bVar107) & bVar10 ^ bVar107;
  bVar108 = ((byte)((ulong)uVar57 >> 0x28) ^ bVar108) & bVar10 ^ bVar108;
  bVar109 = ((byte)((ulong)uVar57 >> 0x30) ^ bVar109) & bVar10 ^ bVar109;
  bVar110 = ((byte)((ulong)uVar57 >> 0x38) ^ bVar110) & bVar10 ^ bVar110;
  *(ulong *)(param_1 + 0x1c) =
       CONCAT17(bVar77,CONCAT16(bVar76,CONCAT15(bVar75,CONCAT14(bVar74,CONCAT13(bVar73,CONCAT12(
                                                  bVar72,CONCAT11(bVar71,bVar69)))))));
  *(ulong *)(param_1 + 0x1a) =
       CONCAT17(bVar68,CONCAT16(bVar67,CONCAT15(bVar66,CONCAT14(bVar65,CONCAT13(bVar64,CONCAT12(
                                                  bVar63,CONCAT11(bVar62,bVar60)))))));
  param_1[0xf] = uVar1;
  param_1[0x10] = uVar5;
  param_1[0x11] = uVar7;
  *param_1 = uVar6;
  *(ulong *)(param_1 + 3) =
       CONCAT17(bVar134,CONCAT16(bVar133,CONCAT15(bVar132,CONCAT14(bVar130,CONCAT13(bVar129,CONCAT12
                                                  (bVar128,CONCAT11(bVar127,bVar123)))))));
  *(ulong *)(param_1 + 1) =
       CONCAT17(bVar122,CONCAT16(bVar121,CONCAT15(bVar120,CONCAT14(bVar118,CONCAT13(bVar117,CONCAT12
                                                  (bVar116,CONCAT11(bVar115,bVar111)))))));
  *(ulong *)(param_1 + 7) =
       CONCAT17(bVar169,CONCAT16(bVar168,CONCAT15(bVar167,CONCAT14(bVar166,CONCAT13(bVar165,CONCAT12
                                                  (bVar164,CONCAT11(bVar163,bVar162)))))));
  *(ulong *)(param_1 + 5) =
       CONCAT17(bVar161,CONCAT16(bVar160,CONCAT15(bVar159,CONCAT14(bVar158,CONCAT13(bVar157,CONCAT12
                                                  (bVar156,CONCAT11(bVar155,bVar154)))))));
  param_1[9] = uVar3;
  param_1[10] = uVar4;
  *(ulong *)(param_1 + 0xd) =
       CONCAT17(bVar153,CONCAT16(bVar152,CONCAT15(bVar151,CONCAT14(bVar150,CONCAT13(bVar149,CONCAT12
                                                  (bVar148,CONCAT11(bVar147,bVar146)))))));
  *(ulong *)(param_1 + 0xb) =
       CONCAT17(bVar145,CONCAT16(bVar144,CONCAT15(bVar143,CONCAT14(bVar142,CONCAT13(bVar141,CONCAT12
                                                  (bVar140,CONCAT11(bVar139,bVar138)))))));
  *(ulong *)(param_1 + 0x14) =
       CONCAT17(bVar93,CONCAT16(bVar92,CONCAT15(bVar91,CONCAT14(bVar90,CONCAT13(bVar89,CONCAT12(
                                                  bVar88,CONCAT11(bVar87,bVar86)))))));
  *(ulong *)(param_1 + 0x12) =
       CONCAT17(bVar85,CONCAT16(bVar84,CONCAT15(bVar83,CONCAT14(bVar82,CONCAT13(bVar81,CONCAT12(
                                                  bVar80,CONCAT11(bVar79,bVar78)))))));
  param_1[0x16] = uVar172;
  uVar40 = *(uint *)(&DAT_00758f20 + lVar8);
  param_1[0x17] =
       (uint)(CONCAT17(bVar102,CONCAT16(bVar101,CONCAT15(bVar100,CONCAT14(bVar99,uVar172)))) >> 0x20
             );
  uVar42 = *(uint *)(&DAT_00758f34 + lVar8);
  param_1[0x18] = uVar36;
  uVar44 = *(uint *)(&DAT_00758f38 + lVar8);
  param_1[0x19] =
       (uint)(CONCAT17(bVar110,CONCAT16(bVar109,CONCAT15(bVar108,CONCAT14(bVar107,uVar36)))) >> 0x20
             );
  iVar31 = ((uVar41 ^ 7) & 0xff) - 1;
  uVar172 = iVar31 >> 0x1f;
  uVar3 = (uVar2 ^ uVar3) & uVar172 ^ uVar3;
  uVar126 = *(undefined8 *)(&UNK_00758ef0 + lVar8);
  uVar46 = *(undefined8 *)(&DAT_00758ee8 + lVar8);
  uVar1 = (uVar42 ^ uVar1) & uVar172 ^ uVar1;
  uVar42 = *(uint *)(&DAT_00758f70 + lVar8);
  uVar5 = (uVar44 ^ uVar5) & uVar172 ^ uVar5;
  uVar44 = *(uint *)(&DAT_00758f94 + lVar8);
  uVar7 = (*(uint *)(&DAT_00758f3c + lVar8) ^ uVar7) & uVar172 ^ uVar7;
  uVar36 = *(uint *)(&DAT_00758f98 + lVar8);
  uVar6 = (uVar38 ^ uVar6) & uVar172 ^ uVar6;
  uVar2 = *(uint *)(&DAT_00758fac + lVar8);
  uVar4 = (uVar40 ^ uVar4) & uVar172 ^ uVar4;
  uVar38 = *(uint *)(&DAT_00758fb0 + lVar8);
  uVar51 = *(undefined8 *)(&UNK_00758fc0 + lVar8);
  uVar50 = *(undefined8 *)(&DAT_00758fb8 + lVar8);
  uVar55 = *(undefined8 *)(&UNK_00758fd0 + lVar8);
  uVar54 = *(undefined8 *)(&DAT_00758fc8 + lVar8);
  uVar57 = *(undefined8 *)(&UNK_00758fe0 + lVar8);
  uVar56 = *(undefined8 *)(&DAT_00758fd8 + lVar8);
  uVar40 = *(uint *)(&DAT_00758fb4 + lVar8);
  bVar60 = ((byte)uVar46 ^ bVar60) & bVar10 ^ bVar60;
  bVar62 = ((byte)((ulong)uVar46 >> 8) ^ bVar62) & bVar10 ^ bVar62;
  bVar63 = ((byte)((ulong)uVar46 >> 0x10) ^ bVar63) & bVar10 ^ bVar63;
  bVar64 = ((byte)((ulong)uVar46 >> 0x18) ^ bVar64) & bVar10 ^ bVar64;
  bVar65 = ((byte)((ulong)uVar46 >> 0x20) ^ bVar65) & bVar10 ^ bVar65;
  bVar66 = ((byte)((ulong)uVar46 >> 0x28) ^ bVar66) & bVar10 ^ bVar66;
  bVar67 = ((byte)((ulong)uVar46 >> 0x30) ^ bVar67) & bVar10 ^ bVar67;
  bVar68 = ((byte)((ulong)uVar46 >> 0x38) ^ bVar68) & bVar10 ^ bVar68;
  bVar69 = ((byte)uVar126 ^ bVar69) & bVar10 ^ bVar69;
  bVar71 = ((byte)((ulong)uVar126 >> 8) ^ bVar71) & bVar10 ^ bVar71;
  bVar72 = ((byte)((ulong)uVar126 >> 0x10) ^ bVar72) & bVar10 ^ bVar72;
  bVar73 = ((byte)((ulong)uVar126 >> 0x18) ^ bVar73) & bVar10 ^ bVar73;
  bVar74 = ((byte)((ulong)uVar126 >> 0x20) ^ bVar74) & bVar10 ^ bVar74;
  bVar75 = ((byte)((ulong)uVar126 >> 0x28) ^ bVar75) & bVar10 ^ bVar75;
  bVar76 = ((byte)((ulong)uVar126 >> 0x30) ^ bVar76) & bVar10 ^ bVar76;
  bVar77 = ((byte)((ulong)uVar126 >> 0x38) ^ bVar77) & bVar10 ^ bVar77;
  iVar112 = ((uVar41 ^ 8) & 0xff) - 1;
  bVar10 = (byte)(iVar31 >> 0x1f);
  uVar172 = iVar112 >> 0x1f;
  bVar111 = ((byte)uVar113 ^ bVar111) & bVar10 ^ bVar111;
  bVar115 = ((byte)((ulong)uVar113 >> 8) ^ bVar115) & bVar10 ^ bVar115;
  bVar116 = ((byte)((ulong)uVar113 >> 0x10) ^ bVar116) & bVar10 ^ bVar116;
  bVar117 = ((byte)((ulong)uVar113 >> 0x18) ^ bVar117) & bVar10 ^ bVar117;
  bVar118 = ((byte)((ulong)uVar113 >> 0x20) ^ bVar118) & bVar10 ^ bVar118;
  bVar120 = ((byte)((ulong)uVar113 >> 0x28) ^ bVar120) & bVar10 ^ bVar120;
  bVar121 = ((byte)((ulong)uVar113 >> 0x30) ^ bVar121) & bVar10 ^ bVar121;
  bVar122 = ((byte)((ulong)uVar113 >> 0x38) ^ bVar122) & bVar10 ^ bVar122;
  bVar123 = ((byte)uVar125 ^ bVar123) & bVar10 ^ bVar123;
  bVar127 = ((byte)((ulong)uVar125 >> 8) ^ bVar127) & bVar10 ^ bVar127;
  bVar128 = ((byte)((ulong)uVar125 >> 0x10) ^ bVar128) & bVar10 ^ bVar128;
  bVar129 = ((byte)((ulong)uVar125 >> 0x18) ^ bVar129) & bVar10 ^ bVar129;
  bVar130 = ((byte)((ulong)uVar125 >> 0x20) ^ bVar130) & bVar10 ^ bVar130;
  bVar132 = ((byte)((ulong)uVar125 >> 0x28) ^ bVar132) & bVar10 ^ bVar132;
  bVar133 = ((byte)((ulong)uVar125 >> 0x30) ^ bVar133) & bVar10 ^ bVar133;
  bVar134 = ((byte)((ulong)uVar125 >> 0x38) ^ bVar134) & bVar10 ^ bVar134;
  bVar154 = ((byte)uVar12 ^ bVar154) & bVar10 ^ bVar154;
  bVar155 = ((byte)((ulong)uVar12 >> 8) ^ bVar155) & bVar10 ^ bVar155;
  bVar156 = ((byte)((ulong)uVar12 >> 0x10) ^ bVar156) & bVar10 ^ bVar156;
  bVar157 = ((byte)((ulong)uVar12 >> 0x18) ^ bVar157) & bVar10 ^ bVar157;
  bVar158 = ((byte)((ulong)uVar12 >> 0x20) ^ bVar158) & bVar10 ^ bVar158;
  bVar159 = ((byte)((ulong)uVar12 >> 0x28) ^ bVar159) & bVar10 ^ bVar159;
  bVar160 = ((byte)((ulong)uVar12 >> 0x30) ^ bVar160) & bVar10 ^ bVar160;
  bVar161 = ((byte)((ulong)uVar12 >> 0x38) ^ bVar161) & bVar10 ^ bVar161;
  bVar162 = ((byte)uVar21 ^ bVar162) & bVar10 ^ bVar162;
  bVar163 = ((byte)((ulong)uVar21 >> 8) ^ bVar163) & bVar10 ^ bVar163;
  bVar164 = ((byte)((ulong)uVar21 >> 0x10) ^ bVar164) & bVar10 ^ bVar164;
  bVar165 = ((byte)((ulong)uVar21 >> 0x18) ^ bVar165) & bVar10 ^ bVar165;
  bVar166 = ((byte)((ulong)uVar21 >> 0x20) ^ bVar166) & bVar10 ^ bVar166;
  bVar167 = ((byte)((ulong)uVar21 >> 0x28) ^ bVar167) & bVar10 ^ bVar167;
  bVar168 = ((byte)((ulong)uVar21 >> 0x30) ^ bVar168) & bVar10 ^ bVar168;
  bVar169 = ((byte)((ulong)uVar21 >> 0x38) ^ bVar169) & bVar10 ^ bVar169;
  bVar138 = ((byte)uVar114 ^ bVar138) & bVar10 ^ bVar138;
  bVar139 = ((byte)((ulong)uVar114 >> 8) ^ bVar139) & bVar10 ^ bVar139;
  bVar140 = ((byte)((ulong)uVar114 >> 0x10) ^ bVar140) & bVar10 ^ bVar140;
  bVar141 = ((byte)((ulong)uVar114 >> 0x18) ^ bVar141) & bVar10 ^ bVar141;
  bVar142 = ((byte)((ulong)uVar114 >> 0x20) ^ bVar142) & bVar10 ^ bVar142;
  bVar143 = ((byte)((ulong)uVar114 >> 0x28) ^ bVar143) & bVar10 ^ bVar143;
  bVar144 = ((byte)((ulong)uVar114 >> 0x30) ^ bVar144) & bVar10 ^ bVar144;
  bVar145 = ((byte)((ulong)uVar114 >> 0x38) ^ bVar145) & bVar10 ^ bVar145;
  bVar146 = ((byte)uVar32 ^ bVar146) & bVar10 ^ bVar146;
  bVar147 = ((byte)((ulong)uVar32 >> 8) ^ bVar147) & bVar10 ^ bVar147;
  bVar148 = ((byte)((ulong)uVar32 >> 0x10) ^ bVar148) & bVar10 ^ bVar148;
  bVar149 = ((byte)((ulong)uVar32 >> 0x18) ^ bVar149) & bVar10 ^ bVar149;
  bVar150 = ((byte)((ulong)uVar32 >> 0x20) ^ bVar150) & bVar10 ^ bVar150;
  bVar151 = ((byte)((ulong)uVar32 >> 0x28) ^ bVar151) & bVar10 ^ bVar151;
  bVar152 = ((byte)((ulong)uVar32 >> 0x30) ^ bVar152) & bVar10 ^ bVar152;
  bVar153 = ((byte)((ulong)uVar32 >> 0x38) ^ bVar153) & bVar10 ^ bVar153;
  *(ulong *)(param_1 + 0x1c) =
       CONCAT17(bVar77,CONCAT16(bVar76,CONCAT15(bVar75,CONCAT14(bVar74,CONCAT13(bVar73,CONCAT12(
                                                  bVar72,CONCAT11(bVar71,bVar69)))))));
  *(ulong *)(param_1 + 0x1a) =
       CONCAT17(bVar68,CONCAT16(bVar67,CONCAT15(bVar66,CONCAT14(bVar65,CONCAT13(bVar64,CONCAT12(
                                                  bVar63,CONCAT11(bVar62,bVar60)))))));
  bVar60 = ((byte)uVar39 ^ bVar60) & bVar10 ^ bVar60;
  bVar62 = ((byte)((ulong)uVar39 >> 8) ^ bVar62) & bVar10 ^ bVar62;
  bVar63 = ((byte)((ulong)uVar39 >> 0x10) ^ bVar63) & bVar10 ^ bVar63;
  bVar64 = ((byte)((ulong)uVar39 >> 0x18) ^ bVar64) & bVar10 ^ bVar64;
  uVar37 = CONCAT13(bVar64,CONCAT12(bVar63,CONCAT11(bVar62,bVar60)));
  bVar65 = ((byte)((ulong)uVar39 >> 0x20) ^ bVar65) & bVar10 ^ bVar65;
  bVar66 = ((byte)((ulong)uVar39 >> 0x28) ^ bVar66) & bVar10 ^ bVar66;
  bVar67 = ((byte)((ulong)uVar39 >> 0x30) ^ bVar67) & bVar10 ^ bVar67;
  bVar68 = ((byte)((ulong)uVar39 >> 0x38) ^ bVar68) & bVar10 ^ bVar68;
  bVar69 = ((byte)uVar43 ^ bVar69) & bVar10 ^ bVar69;
  bVar71 = ((byte)((ulong)uVar43 >> 8) ^ bVar71) & bVar10 ^ bVar71;
  bVar72 = ((byte)((ulong)uVar43 >> 0x10) ^ bVar72) & bVar10 ^ bVar72;
  bVar73 = ((byte)((ulong)uVar43 >> 0x18) ^ bVar73) & bVar10 ^ bVar73;
  uVar41 = CONCAT13(bVar73,CONCAT12(bVar72,CONCAT11(bVar71,bVar69)));
  bVar74 = ((byte)((ulong)uVar43 >> 0x20) ^ bVar74) & bVar10 ^ bVar74;
  bVar75 = ((byte)((ulong)uVar43 >> 0x28) ^ bVar75) & bVar10 ^ bVar75;
  bVar76 = ((byte)((ulong)uVar43 >> 0x30) ^ bVar76) & bVar10 ^ bVar76;
  bVar77 = ((byte)((ulong)uVar43 >> 0x38) ^ bVar77) & bVar10 ^ bVar77;
  bVar94 = (byte)(iVar112 >> 0x1f);
  uVar2 = (uVar2 ^ uVar1) & uVar172 ^ uVar1;
  param_1[0xf] = uVar1;
  bVar78 = ((byte)uVar29 ^ bVar78) & bVar10 ^ bVar78;
  bVar79 = ((byte)((ulong)uVar29 >> 8) ^ bVar79) & bVar10 ^ bVar79;
  bVar80 = ((byte)((ulong)uVar29 >> 0x10) ^ bVar80) & bVar10 ^ bVar80;
  bVar81 = ((byte)((ulong)uVar29 >> 0x18) ^ bVar81) & bVar10 ^ bVar81;
  bVar82 = ((byte)((ulong)uVar29 >> 0x20) ^ bVar82) & bVar10 ^ bVar82;
  bVar83 = ((byte)((ulong)uVar29 >> 0x28) ^ bVar83) & bVar10 ^ bVar83;
  bVar84 = ((byte)((ulong)uVar29 >> 0x30) ^ bVar84) & bVar10 ^ bVar84;
  bVar85 = ((byte)((ulong)uVar29 >> 0x38) ^ bVar85) & bVar10 ^ bVar85;
  bVar86 = ((byte)uVar30 ^ bVar86) & bVar10 ^ bVar86;
  bVar87 = ((byte)((ulong)uVar30 >> 8) ^ bVar87) & bVar10 ^ bVar87;
  bVar88 = ((byte)((ulong)uVar30 >> 0x10) ^ bVar88) & bVar10 ^ bVar88;
  bVar89 = ((byte)((ulong)uVar30 >> 0x18) ^ bVar89) & bVar10 ^ bVar89;
  bVar90 = ((byte)((ulong)uVar30 >> 0x20) ^ bVar90) & bVar10 ^ bVar90;
  bVar91 = ((byte)((ulong)uVar30 >> 0x28) ^ bVar91) & bVar10 ^ bVar91;
  bVar92 = ((byte)((ulong)uVar30 >> 0x30) ^ bVar92) & bVar10 ^ bVar92;
  bVar93 = ((byte)((ulong)uVar30 >> 0x38) ^ bVar93) & bVar10 ^ bVar93;
  bVar95 = (bVar11 ^ bVar95) & bVar10 ^ bVar95;
  bVar96 = (bVar13 ^ bVar96) & bVar10 ^ bVar96;
  bVar97 = (bVar14 ^ bVar97) & bVar10 ^ bVar97;
  bVar98 = (bVar15 ^ bVar98) & bVar10 ^ bVar98;
  bVar99 = (bVar16 ^ bVar99) & bVar10 ^ bVar99;
  bVar100 = (bVar17 ^ bVar100) & bVar10 ^ bVar100;
  bVar101 = (bVar18 ^ bVar101) & bVar10 ^ bVar101;
  bVar102 = (bVar19 ^ bVar102) & bVar10 ^ bVar102;
  bVar103 = (bVar20 ^ bVar103) & bVar10 ^ bVar103;
  bVar104 = (bVar22 ^ bVar104) & bVar10 ^ bVar104;
  bVar105 = (bVar23 ^ bVar105) & bVar10 ^ bVar105;
  bVar106 = (bVar24 ^ bVar106) & bVar10 ^ bVar106;
  bVar107 = (bVar25 ^ bVar107) & bVar10 ^ bVar107;
  bVar108 = (bVar26 ^ bVar108) & bVar10 ^ bVar108;
  bVar109 = (bVar27 ^ bVar109) & bVar10 ^ bVar109;
  bVar110 = (bVar28 ^ bVar110) & bVar10 ^ bVar110;
  bVar11 = ((byte)uVar48 ^ bVar111) & bVar94 ^ bVar111;
  bVar13 = ((byte)((ulong)uVar48 >> 8) ^ bVar115) & bVar94 ^ bVar115;
  bVar14 = ((byte)((ulong)uVar48 >> 0x10) ^ bVar116) & bVar94 ^ bVar116;
  bVar15 = ((byte)((ulong)uVar48 >> 0x18) ^ bVar117) & bVar94 ^ bVar117;
  bVar16 = ((byte)((ulong)uVar48 >> 0x20) ^ bVar118) & bVar94 ^ bVar118;
  bVar17 = ((byte)((ulong)uVar48 >> 0x28) ^ bVar120) & bVar94 ^ bVar120;
  bVar18 = ((byte)((ulong)uVar48 >> 0x30) ^ bVar121) & bVar94 ^ bVar121;
  bVar19 = ((byte)((ulong)uVar48 >> 0x38) ^ bVar122) & bVar94 ^ bVar122;
  bVar20 = ((byte)uVar49 ^ bVar123) & bVar94 ^ bVar123;
  bVar22 = ((byte)((ulong)uVar49 >> 8) ^ bVar127) & bVar94 ^ bVar127;
  bVar23 = ((byte)((ulong)uVar49 >> 0x10) ^ bVar128) & bVar94 ^ bVar128;
  bVar24 = ((byte)((ulong)uVar49 >> 0x18) ^ bVar129) & bVar94 ^ bVar129;
  bVar25 = ((byte)((ulong)uVar49 >> 0x20) ^ bVar130) & bVar94 ^ bVar130;
  bVar26 = ((byte)((ulong)uVar49 >> 0x28) ^ bVar132) & bVar94 ^ bVar132;
  bVar27 = ((byte)((ulong)uVar49 >> 0x30) ^ bVar133) & bVar94 ^ bVar133;
  bVar28 = ((byte)((ulong)uVar49 >> 0x38) ^ bVar134) & bVar94 ^ bVar134;
  param_1[0x10] = uVar5;
  param_1[0x11] = uVar7;
  uVar5 = (uVar38 ^ uVar5) & uVar172 ^ uVar5;
  uVar7 = (uVar40 ^ uVar7) & uVar172 ^ uVar7;
  *param_1 = uVar6;
  uVar6 = (uVar42 ^ uVar6) & uVar172 ^ uVar6;
  uVar1 = (uVar44 ^ uVar3) & uVar172 ^ uVar3;
  param_1[9] = uVar3;
  param_1[10] = uVar4;
  uVar4 = (uVar36 ^ uVar4) & uVar172 ^ uVar4;
  *(ulong *)(param_1 + 7) =
       CONCAT17(bVar169,CONCAT16(bVar168,CONCAT15(bVar167,CONCAT14(bVar166,CONCAT13(bVar165,CONCAT12
                                                  (bVar164,CONCAT11(bVar163,bVar162)))))));
  *(ulong *)(param_1 + 5) =
       CONCAT17(bVar161,CONCAT16(bVar160,CONCAT15(bVar159,CONCAT14(bVar158,CONCAT13(bVar157,CONCAT12
                                                  (bVar156,CONCAT11(bVar155,bVar154)))))));
  *(ulong *)(param_1 + 0xd) =
       CONCAT17(bVar153,CONCAT16(bVar152,CONCAT15(bVar151,CONCAT14(bVar150,CONCAT13(bVar149,CONCAT12
                                                  (bVar148,CONCAT11(bVar147,bVar146)))))));
  *(ulong *)(param_1 + 0xb) =
       CONCAT17(bVar145,CONCAT16(bVar144,CONCAT15(bVar143,CONCAT14(bVar142,CONCAT13(bVar141,CONCAT12
                                                  (bVar140,CONCAT11(bVar139,bVar138)))))));
  bVar154 = ((byte)uVar45 ^ bVar154) & bVar94 ^ bVar154;
  bVar155 = ((byte)((ulong)uVar45 >> 8) ^ bVar155) & bVar94 ^ bVar155;
  bVar156 = ((byte)((ulong)uVar45 >> 0x10) ^ bVar156) & bVar94 ^ bVar156;
  bVar157 = ((byte)((ulong)uVar45 >> 0x18) ^ bVar157) & bVar94 ^ bVar157;
  bVar158 = ((byte)((ulong)uVar45 >> 0x20) ^ bVar158) & bVar94 ^ bVar158;
  bVar159 = ((byte)((ulong)uVar45 >> 0x28) ^ bVar159) & bVar94 ^ bVar159;
  bVar160 = ((byte)((ulong)uVar45 >> 0x30) ^ bVar160) & bVar94 ^ bVar160;
  bVar161 = ((byte)((ulong)uVar45 >> 0x38) ^ bVar161) & bVar94 ^ bVar161;
  bVar162 = ((byte)uVar47 ^ bVar162) & bVar94 ^ bVar162;
  bVar163 = ((byte)((ulong)uVar47 >> 8) ^ bVar163) & bVar94 ^ bVar163;
  bVar164 = ((byte)((ulong)uVar47 >> 0x10) ^ bVar164) & bVar94 ^ bVar164;
  bVar165 = ((byte)((ulong)uVar47 >> 0x18) ^ bVar165) & bVar94 ^ bVar165;
  bVar166 = ((byte)((ulong)uVar47 >> 0x20) ^ bVar166) & bVar94 ^ bVar166;
  bVar167 = ((byte)((ulong)uVar47 >> 0x28) ^ bVar167) & bVar94 ^ bVar167;
  bVar168 = ((byte)((ulong)uVar47 >> 0x30) ^ bVar168) & bVar94 ^ bVar168;
  bVar169 = ((byte)((ulong)uVar47 >> 0x38) ^ bVar169) & bVar94 ^ bVar169;
  bVar138 = ((byte)uVar52 ^ bVar138) & bVar94 ^ bVar138;
  bVar139 = ((byte)((ulong)uVar52 >> 8) ^ bVar139) & bVar94 ^ bVar139;
  bVar140 = ((byte)((ulong)uVar52 >> 0x10) ^ bVar140) & bVar94 ^ bVar140;
  bVar141 = ((byte)((ulong)uVar52 >> 0x18) ^ bVar141) & bVar94 ^ bVar141;
  bVar142 = ((byte)((ulong)uVar52 >> 0x20) ^ bVar142) & bVar94 ^ bVar142;
  bVar143 = ((byte)((ulong)uVar52 >> 0x28) ^ bVar143) & bVar94 ^ bVar143;
  bVar144 = ((byte)((ulong)uVar52 >> 0x30) ^ bVar144) & bVar94 ^ bVar144;
  bVar145 = ((byte)((ulong)uVar52 >> 0x38) ^ bVar145) & bVar94 ^ bVar145;
  bVar146 = ((byte)uVar53 ^ bVar146) & bVar94 ^ bVar146;
  bVar147 = ((byte)((ulong)uVar53 >> 8) ^ bVar147) & bVar94 ^ bVar147;
  bVar148 = ((byte)((ulong)uVar53 >> 0x10) ^ bVar148) & bVar94 ^ bVar148;
  bVar149 = ((byte)((ulong)uVar53 >> 0x18) ^ bVar149) & bVar94 ^ bVar149;
  bVar150 = ((byte)((ulong)uVar53 >> 0x20) ^ bVar150) & bVar94 ^ bVar150;
  bVar151 = ((byte)((ulong)uVar53 >> 0x28) ^ bVar151) & bVar94 ^ bVar151;
  bVar152 = ((byte)((ulong)uVar53 >> 0x30) ^ bVar152) & bVar94 ^ bVar152;
  bVar153 = ((byte)((ulong)uVar53 >> 0x38) ^ bVar153) & bVar94 ^ bVar153;
  *(ulong *)(param_1 + 3) =
       CONCAT17(bVar134,CONCAT16(bVar133,CONCAT15(bVar132,CONCAT14(bVar130,CONCAT13(bVar129,CONCAT12
                                                  (bVar128,CONCAT11(bVar127,bVar123)))))));
  *(ulong *)(param_1 + 1) =
       CONCAT17(bVar122,CONCAT16(bVar121,CONCAT15(bVar120,CONCAT14(bVar118,CONCAT13(bVar117,CONCAT12
                                                  (bVar116,CONCAT11(bVar115,bVar111)))))));
  *(ulong *)(param_1 + 0x14) =
       CONCAT17(bVar93,CONCAT16(bVar92,CONCAT15(bVar91,CONCAT14(bVar90,CONCAT13(bVar89,CONCAT12(
                                                  bVar88,CONCAT11(bVar87,bVar86)))))));
  *(ulong *)(param_1 + 0x12) =
       CONCAT17(bVar85,CONCAT16(bVar84,CONCAT15(bVar83,CONCAT14(bVar82,CONCAT13(bVar81,CONCAT12(
                                                  bVar80,CONCAT11(bVar79,bVar78)))))));
  *(byte *)(param_1 + 0x18) = bVar103;
  *(byte *)((long)param_1 + 0x61) = bVar104;
  *(byte *)((long)param_1 + 0x62) = bVar105;
  *(byte *)((long)param_1 + 99) = bVar106;
  *(byte *)(param_1 + 0x19) = bVar107;
  *(byte *)((long)param_1 + 0x65) = bVar108;
  *(byte *)((long)param_1 + 0x66) = bVar109;
  *(byte *)((long)param_1 + 0x67) = bVar110;
  *(byte *)(param_1 + 0x16) = bVar95;
  *(byte *)((long)param_1 + 0x59) = bVar96;
  *(byte *)((long)param_1 + 0x5a) = bVar97;
  *(byte *)((long)param_1 + 0x5b) = bVar98;
  *(byte *)(param_1 + 0x17) = bVar99;
  *(byte *)((long)param_1 + 0x5d) = bVar100;
  *(byte *)((long)param_1 + 0x5e) = bVar101;
  *(byte *)((long)param_1 + 0x5f) = bVar102;
  param_1[0x1a] = uVar37;
  param_1[0x1b] =
       (uint)(CONCAT17(bVar68,CONCAT16(bVar67,CONCAT15(bVar66,CONCAT14(bVar65,uVar37)))) >> 0x20);
  param_1[0x1c] = uVar41;
  param_1[0x1d] =
       (uint)(CONCAT17(bVar77,CONCAT16(bVar76,CONCAT15(bVar75,CONCAT14(bVar74,uVar41)))) >> 0x20);
  *param_1 = uVar6;
  *(ulong *)(param_1 + 3) =
       CONCAT17(bVar28,CONCAT16(bVar27,CONCAT15(bVar26,CONCAT14(bVar25,CONCAT13(bVar24,CONCAT12(
                                                  bVar23,CONCAT11(bVar22,bVar20)))))));
  *(ulong *)(param_1 + 1) =
       CONCAT17(bVar19,CONCAT16(bVar18,CONCAT15(bVar17,CONCAT14(bVar16,CONCAT13(bVar15,CONCAT12(
                                                  bVar14,CONCAT11(bVar13,bVar11)))))));
  *(ulong *)(param_1 + 7) =
       CONCAT17(bVar169,CONCAT16(bVar168,CONCAT15(bVar167,CONCAT14(bVar166,CONCAT13(bVar165,CONCAT12
                                                  (bVar164,CONCAT11(bVar163,bVar162)))))));
  *(ulong *)(param_1 + 5) =
       CONCAT17(bVar161,CONCAT16(bVar160,CONCAT15(bVar159,CONCAT14(bVar158,CONCAT13(bVar157,CONCAT12
                                                  (bVar156,CONCAT11(bVar155,bVar154)))))));
  param_1[9] = uVar1;
  param_1[10] = uVar4;
  param_1[0xb] = CONCAT13(bVar141,CONCAT12(bVar140,CONCAT11(bVar139,bVar138)));
  param_1[0xc] = CONCAT13(bVar145,CONCAT12(bVar144,CONCAT11(bVar143,bVar142)));
  param_1[0xd] = CONCAT13(bVar149,CONCAT12(bVar148,CONCAT11(bVar147,bVar146)));
  param_1[0xe] = CONCAT13(bVar153,CONCAT12(bVar152,CONCAT11(bVar151,bVar150)));
  bVar78 = ((byte)uVar50 ^ bVar78) & bVar94 ^ bVar78;
  bVar79 = ((byte)((ulong)uVar50 >> 8) ^ bVar79) & bVar94 ^ bVar79;
  bVar80 = ((byte)((ulong)uVar50 >> 0x10) ^ bVar80) & bVar94 ^ bVar80;
  bVar81 = ((byte)((ulong)uVar50 >> 0x18) ^ bVar81) & bVar94 ^ bVar81;
  bVar82 = ((byte)((ulong)uVar50 >> 0x20) ^ bVar82) & bVar94 ^ bVar82;
  bVar83 = ((byte)((ulong)uVar50 >> 0x28) ^ bVar83) & bVar94 ^ bVar83;
  bVar84 = ((byte)((ulong)uVar50 >> 0x30) ^ bVar84) & bVar94 ^ bVar84;
  bVar85 = ((byte)((ulong)uVar50 >> 0x38) ^ bVar85) & bVar94 ^ bVar85;
  uVar114 = CONCAT17(bVar85,CONCAT16(bVar84,CONCAT15(bVar83,CONCAT14(bVar82,CONCAT13(bVar81,CONCAT12
                                                  (bVar80,CONCAT11(bVar79,bVar78)))))));
  bVar86 = ((byte)uVar51 ^ bVar86) & bVar94 ^ bVar86;
  bVar87 = ((byte)((ulong)uVar51 >> 8) ^ bVar87) & bVar94 ^ bVar87;
  bVar88 = ((byte)((ulong)uVar51 >> 0x10) ^ bVar88) & bVar94 ^ bVar88;
  bVar89 = ((byte)((ulong)uVar51 >> 0x18) ^ bVar89) & bVar94 ^ bVar89;
  iVar31 = CONCAT13(bVar89,CONCAT12(bVar88,CONCAT11(bVar87,bVar86)));
  bVar90 = ((byte)((ulong)uVar51 >> 0x20) ^ bVar90) & bVar94 ^ bVar90;
  bVar91 = ((byte)((ulong)uVar51 >> 0x28) ^ bVar91) & bVar94 ^ bVar91;
  bVar92 = ((byte)((ulong)uVar51 >> 0x30) ^ bVar92) & bVar94 ^ bVar92;
  bVar93 = ((byte)((ulong)uVar51 >> 0x38) ^ bVar93) & bVar94 ^ bVar93;
  uVar32 = CONCAT17(bVar93,CONCAT16(bVar92,CONCAT15(bVar91,CONCAT14(bVar90,iVar31))));
  bVar95 = ((byte)uVar54 ^ bVar95) & bVar94 ^ bVar95;
  bVar96 = ((byte)((ulong)uVar54 >> 8) ^ bVar96) & bVar94 ^ bVar96;
  bVar97 = ((byte)((ulong)uVar54 >> 0x10) ^ bVar97) & bVar94 ^ bVar97;
  bVar98 = ((byte)((ulong)uVar54 >> 0x18) ^ bVar98) & bVar94 ^ bVar98;
  iVar112 = CONCAT13(bVar98,CONCAT12(bVar97,CONCAT11(bVar96,bVar95)));
  bVar99 = ((byte)((ulong)uVar54 >> 0x20) ^ bVar99) & bVar94 ^ bVar99;
  bVar100 = ((byte)((ulong)uVar54 >> 0x28) ^ bVar100) & bVar94 ^ bVar100;
  bVar101 = ((byte)((ulong)uVar54 >> 0x30) ^ bVar101) & bVar94 ^ bVar101;
  bVar102 = ((byte)((ulong)uVar54 >> 0x38) ^ bVar102) & bVar94 ^ bVar102;
  auVar33._0_8_ = CONCAT17(bVar102,CONCAT16(bVar101,CONCAT15(bVar100,CONCAT14(bVar99,iVar112))));
  auVar33[8] = ((byte)uVar55 ^ bVar103) & bVar94 ^ bVar103;
  auVar33[9] = ((byte)((ulong)uVar55 >> 8) ^ bVar104) & bVar94 ^ bVar104;
  auVar33[10] = ((byte)((ulong)uVar55 >> 0x10) ^ bVar105) & bVar94 ^ bVar105;
  auVar33[0xb] = ((byte)((ulong)uVar55 >> 0x18) ^ bVar106) & bVar94 ^ bVar106;
  auVar34[0xc] = ((byte)((ulong)uVar55 >> 0x20) ^ bVar107) & bVar94 ^ bVar107;
  auVar34._0_12_ = auVar33;
  auVar34[0xd] = ((byte)((ulong)uVar55 >> 0x28) ^ bVar108) & bVar94 ^ bVar108;
  auVar34[0xe] = ((byte)((ulong)uVar55 >> 0x30) ^ bVar109) & bVar94 ^ bVar109;
  auVar34[0xf] = ((byte)((ulong)uVar55 >> 0x38) ^ bVar110) & bVar94 ^ bVar110;
  bVar60 = ((byte)uVar56 ^ bVar60) & bVar94 ^ bVar60;
  bVar62 = ((byte)((ulong)uVar56 >> 8) ^ bVar62) & bVar94 ^ bVar62;
  bVar63 = ((byte)((ulong)uVar56 >> 0x10) ^ bVar63) & bVar94 ^ bVar63;
  bVar64 = ((byte)((ulong)uVar56 >> 0x18) ^ bVar64) & bVar94 ^ bVar64;
  uVar38 = CONCAT13(bVar64,CONCAT12(bVar63,CONCAT11(bVar62,bVar60)));
  bVar65 = ((byte)((ulong)uVar56 >> 0x20) ^ bVar65) & bVar94 ^ bVar65;
  bVar66 = ((byte)((ulong)uVar56 >> 0x28) ^ bVar66) & bVar94 ^ bVar66;
  bVar67 = ((byte)((ulong)uVar56 >> 0x30) ^ bVar67) & bVar94 ^ bVar67;
  bVar68 = ((byte)((ulong)uVar56 >> 0x38) ^ bVar68) & bVar94 ^ bVar68;
  bVar69 = ((byte)uVar57 ^ bVar69) & bVar94 ^ bVar69;
  bVar71 = ((byte)((ulong)uVar57 >> 8) ^ bVar71) & bVar94 ^ bVar71;
  bVar72 = ((byte)((ulong)uVar57 >> 0x10) ^ bVar72) & bVar94 ^ bVar72;
  bVar73 = ((byte)((ulong)uVar57 >> 0x18) ^ bVar73) & bVar94 ^ bVar73;
  uVar42 = CONCAT13(bVar73,CONCAT12(bVar72,CONCAT11(bVar71,bVar69)));
  bVar74 = ((byte)((ulong)uVar57 >> 0x20) ^ bVar74) & bVar94 ^ bVar74;
  bVar75 = ((byte)((ulong)uVar57 >> 0x28) ^ bVar75) & bVar94 ^ bVar75;
  bVar76 = ((byte)((ulong)uVar57 >> 0x30) ^ bVar76) & bVar94 ^ bVar76;
  bVar77 = ((byte)((ulong)uVar57 >> 0x38) ^ bVar77) & bVar94 ^ bVar77;
  param_1[0xf] = uVar2;
  param_1[0x10] = uVar5;
  param_1[0x11] = uVar7;
  *(undefined8 *)(param_1 + 0x14) = uVar32;
  *(undefined8 *)(param_1 + 0x12) = uVar114;
  *(long *)(param_1 + 0x18) = auVar34._8_8_;
  *(undefined8 *)(param_1 + 0x16) = auVar33._0_8_;
  param_1[0x1a] = uVar38;
  uVar40 = (uint)(CONCAT17(bVar68,CONCAT16(bVar67,CONCAT15(bVar66,CONCAT14(bVar65,uVar38)))) >> 0x20
                 );
  param_1[0x1b] = uVar40;
  uVar3 = -((param_3 & 0x80) >> 7);
  uVar172 = (uVar4 ^ uVar6) & uVar3;
  param_1[0x1c] = uVar42;
  uVar44 = (uint)(CONCAT17(bVar77,CONCAT16(bVar76,CONCAT15(bVar75,CONCAT14(bVar74,uVar42)))) >> 0x20
                 );
  param_1[0x1d] = uVar44;
  param_1[10] = uVar172 ^ uVar4;
  uVar46 = *(undefined8 *)(param_1 + 8);
  iVar31 = -iVar31;
  iVar112 = -iVar112;
  iVar119 = -(int)((ulong)auVar33._0_8_ >> 0x20);
  iVar124 = -auVar33._8_4_;
  iVar131 = -auVar34._12_4_;
  *param_1 = uVar172 ^ uVar6;
  param_1[9] = ((uint)((ulong)uVar114 >> 0x20) ^ uVar1) & uVar3 ^ uVar1;
  bVar10 = (byte)uVar3;
  bVar104 = (byte)(uVar3 >> 8);
  bVar105 = (byte)(uVar3 >> 0x10);
  bVar106 = (byte)(uVar3 >> 0x18);
  uVar126 = *(undefined8 *)(param_1 + 3);
  uVar114 = *(undefined8 *)(param_1 + 1);
  *(byte *)(param_1 + 0x18) = (auVar33[8] ^ (byte)iVar124) & bVar10 ^ auVar33[8];
  *(byte *)((long)param_1 + 0x61) = (auVar33[9] ^ (byte)((uint)iVar124 >> 8)) & bVar104 ^ auVar33[9]
  ;
  *(byte *)((long)param_1 + 0x62) =
       (auVar33[10] ^ (byte)((uint)iVar124 >> 0x10)) & bVar105 ^ auVar33[10];
  *(byte *)((long)param_1 + 99) =
       (auVar33[0xb] ^ (byte)((uint)iVar124 >> 0x18)) & bVar106 ^ auVar33[0xb];
  *(byte *)(param_1 + 0x19) = (auVar34[0xc] ^ (byte)iVar131) & bVar10 ^ auVar34[0xc];
  *(byte *)((long)param_1 + 0x65) =
       (auVar34[0xd] ^ (byte)((uint)iVar131 >> 8)) & bVar104 ^ auVar34[0xd];
  *(byte *)((long)param_1 + 0x66) =
       (auVar34[0xe] ^ (byte)((uint)iVar131 >> 0x10)) & bVar105 ^ auVar34[0xe];
  *(byte *)((long)param_1 + 0x67) =
       (auVar34[0xf] ^ (byte)((uint)iVar131 >> 0x18)) & bVar106 ^ auVar34[0xf];
  *(byte *)(param_1 + 0x16) = (bVar95 ^ (byte)iVar112) & bVar10 ^ bVar95;
  *(byte *)((long)param_1 + 0x59) = (bVar96 ^ (byte)((uint)iVar112 >> 8)) & bVar104 ^ bVar96;
  *(byte *)((long)param_1 + 0x5a) = (bVar97 ^ (byte)((uint)iVar112 >> 0x10)) & bVar105 ^ bVar97;
  *(byte *)((long)param_1 + 0x5b) = (bVar98 ^ (byte)((uint)iVar112 >> 0x18)) & bVar106 ^ bVar98;
  *(byte *)(param_1 + 0x17) = (bVar99 ^ (byte)iVar119) & bVar10 ^ bVar99;
  *(byte *)((long)param_1 + 0x5d) = (bVar100 ^ (byte)((uint)iVar119 >> 8)) & bVar104 ^ bVar100;
  *(byte *)((long)param_1 + 0x5e) = (bVar101 ^ (byte)((uint)iVar119 >> 0x10)) & bVar105 ^ bVar101;
  *(byte *)((long)param_1 + 0x5f) = (bVar102 ^ (byte)((uint)iVar119 >> 0x18)) & bVar106 ^ bVar102;
  auVar35[1] = bVar139;
  auVar35[0] = bVar138;
  auVar35[2] = bVar140;
  auVar35[3] = bVar141;
  auVar35[4] = bVar142;
  auVar35[5] = bVar143;
  auVar35[6] = bVar144;
  auVar35[7] = bVar145;
  auVar35[8] = bVar146;
  auVar35[9] = bVar147;
  auVar35[10] = bVar148;
  auVar35[0xb] = bVar149;
  auVar35[0xc] = bVar150;
  auVar35[0xd] = bVar151;
  auVar35[0xe] = bVar152;
  auVar35[0xf] = bVar153;
  auVar9._8_8_ = 0;
  auVar9._0_8_ = *(ulong *)(param_1 + 0xb);
  auVar35 = NEON_ext(auVar35,auVar9,8,1);
  auVar35 = NEON_ext(auVar35,auVar35,8,1);
  iVar112 = -(int)((ulong)uVar32 >> 0x20);
  iVar119 = -uVar38;
  iVar124 = -uVar40;
  iVar131 = -uVar42;
  iVar137 = -uVar44;
  *(ulong *)(param_1 + 3) =
       CONCAT17((auVar35[0xf] ^ bVar28) & bVar106 ^ bVar28,
                CONCAT16((auVar35[0xe] ^ bVar27) & bVar105 ^ bVar27,
                         CONCAT15((auVar35[0xd] ^ bVar26) & bVar104 ^ bVar26,
                                  CONCAT14((auVar35[0xc] ^ bVar25) & bVar10 ^ bVar25,
                                           CONCAT13((auVar35[0xb] ^ bVar24) & bVar106 ^ bVar24,
                                                    CONCAT12((auVar35[10] ^ bVar23) & bVar105 ^
                                                             bVar23,CONCAT11((auVar35[9] ^ bVar22) &
                                                                             bVar104 ^ bVar22,
                                                                             (auVar35[8] ^ bVar20) &
                                                                             bVar10 ^ bVar20)))))));
  *(ulong *)(param_1 + 1) =
       CONCAT17((auVar35[7] ^ bVar19) & bVar106 ^ bVar19,
                CONCAT16((auVar35[6] ^ bVar18) & bVar105 ^ bVar18,
                         CONCAT15((auVar35[5] ^ bVar17) & bVar104 ^ bVar17,
                                  CONCAT14((auVar35[4] ^ bVar16) & bVar10 ^ bVar16,
                                           CONCAT13((auVar35[3] ^ bVar15) & bVar106 ^ bVar15,
                                                    CONCAT12((auVar35[2] ^ bVar14) & bVar105 ^
                                                             bVar14,CONCAT11((auVar35[1] ^ bVar13) &
                                                                             bVar104 ^ bVar13,
                                                                             (auVar35[0] ^ bVar11) &
                                                                             bVar10 ^ bVar11)))))));
  *(ulong *)(param_1 + 0xd) =
       CONCAT17(((byte)((ulong)uVar126 >> 0x38) ^ bVar153) & bVar106 ^ bVar153,
                CONCAT16(((byte)((ulong)uVar126 >> 0x30) ^ bVar152) & bVar105 ^ bVar152,
                         CONCAT15(((byte)((ulong)uVar126 >> 0x28) ^ bVar151) & bVar104 ^ bVar151,
                                  CONCAT14(((byte)((ulong)uVar126 >> 0x20) ^ bVar150) & bVar10 ^
                                           bVar150,CONCAT13(((byte)((ulong)uVar126 >> 0x18) ^
                                                            bVar149) & bVar106 ^ bVar149,
                                                            CONCAT12(((byte)((ulong)uVar126 >> 0x10)
                                                                     ^ bVar148) & bVar105 ^ bVar148,
                                                                     CONCAT11(((byte)((ulong)uVar126
                                                                                     >> 8) ^ bVar147
                                                                              ) & bVar104 ^ bVar147,
                                                                              ((byte)uVar126 ^
                                                                              bVar146) & bVar10 ^
                                                                              bVar146)))))));
  *(ulong *)(param_1 + 0xb) =
       CONCAT17(((byte)((ulong)uVar114 >> 0x38) ^ bVar145) & bVar106 ^ bVar145,
                CONCAT16(((byte)((ulong)uVar114 >> 0x30) ^ bVar144) & bVar105 ^ bVar144,
                         CONCAT15(((byte)((ulong)uVar114 >> 0x28) ^ bVar143) & bVar104 ^ bVar143,
                                  CONCAT14(((byte)((ulong)uVar114 >> 0x20) ^ bVar142) & bVar10 ^
                                           bVar142,CONCAT13(((byte)((ulong)uVar114 >> 0x18) ^
                                                            bVar141) & bVar106 ^ bVar141,
                                                            CONCAT12(((byte)((ulong)uVar114 >> 0x10)
                                                                     ^ bVar140) & bVar105 ^ bVar140,
                                                                     CONCAT11(((byte)((ulong)uVar114
                                                                                     >> 8) ^ bVar139
                                                                              ) & bVar104 ^ bVar139,
                                                                              ((byte)uVar114 ^
                                                                              bVar138) & bVar10 ^
                                                                              bVar138)))))));
  param_1[0xf] = (param_1[5] ^ uVar2) & uVar3 ^ uVar2;
  param_1[0x10] = (param_1[6] ^ uVar5) & uVar3 ^ uVar5;
  param_1[0x11] = (param_1[7] ^ uVar7) & uVar3 ^ uVar7;
  *(ulong *)(param_1 + 0x14) =
       CONCAT17(((byte)((uint)iVar112 >> 0x18) ^ bVar93) & bVar106 ^ bVar93,
                CONCAT16(((byte)((uint)iVar112 >> 0x10) ^ bVar92) & bVar105 ^ bVar92,
                         CONCAT15(((byte)((uint)iVar112 >> 8) ^ bVar91) & bVar104 ^ bVar91,
                                  CONCAT14(((byte)iVar112 ^ bVar90) & bVar10 ^ bVar90,
                                           CONCAT13(((byte)((uint)iVar31 >> 0x18) ^ bVar89) &
                                                    bVar106 ^ bVar89,
                                                    CONCAT12(((byte)((uint)iVar31 >> 0x10) ^ bVar88)
                                                             & bVar105 ^ bVar88,
                                                             CONCAT11(((byte)((uint)iVar31 >> 8) ^
                                                                      bVar87) & bVar104 ^ bVar87,
                                                                      ((byte)iVar31 ^ bVar86) &
                                                                      bVar10 ^ bVar86)))))));
  *(ulong *)(param_1 + 0x12) =
       CONCAT17(((byte)((ulong)uVar46 >> 0x38) ^ bVar85) & bVar106 ^ bVar85,
                CONCAT16(((byte)((ulong)uVar46 >> 0x30) ^ bVar84) & bVar105 ^ bVar84,
                         CONCAT15(((byte)((ulong)uVar46 >> 0x28) ^ bVar83) & bVar104 ^ bVar83,
                                  CONCAT14(((byte)((ulong)uVar46 >> 0x20) ^ bVar82) & bVar10 ^
                                           bVar82,CONCAT13(((byte)((ulong)uVar46 >> 0x18) ^ bVar81)
                                                           & bVar106 ^ bVar81,
                                                           CONCAT12(((byte)((ulong)uVar46 >> 0x10) ^
                                                                    bVar80) & bVar105 ^ bVar80,
                                                                    CONCAT11(((byte)((ulong)uVar46
                                                                                    >> 8) ^ bVar79)
                                                                             & bVar104 ^ bVar79,
                                                                             ((byte)uVar46 ^ bVar78)
                                                                             & bVar10 ^ bVar78))))))
               );
  *(ulong *)(param_1 + 7) =
       CONCAT17((bVar81 ^ bVar169) & bVar106 ^ bVar169,
                CONCAT16((bVar80 ^ bVar168) & bVar105 ^ bVar168,
                         CONCAT15((bVar79 ^ bVar167) & bVar104 ^ bVar167,
                                  CONCAT14((bVar78 ^ bVar166) & bVar10 ^ bVar166,
                                           CONCAT13(((byte)(uVar7 >> 0x18) ^ bVar165) & bVar106 ^
                                                    bVar165,CONCAT12(((byte)(uVar7 >> 0x10) ^
                                                                     bVar164) & bVar105 ^ bVar164,
                                                                     CONCAT11(((byte)(uVar7 >> 8) ^
                                                                              bVar163) & bVar104 ^
                                                                              bVar163,((byte)uVar7 ^
                                                                                      bVar162) &
                                                                                      bVar10 ^ 
                                                  bVar162)))))));
  *(ulong *)(param_1 + 5) =
       CONCAT17(((byte)(uVar5 >> 0x18) ^ bVar161) & bVar106 ^ bVar161,
                CONCAT16(((byte)(uVar5 >> 0x10) ^ bVar160) & bVar105 ^ bVar160,
                         CONCAT15(((byte)(uVar5 >> 8) ^ bVar159) & bVar104 ^ bVar159,
                                  CONCAT14(((byte)uVar5 ^ bVar158) & bVar10 ^ bVar158,
                                           CONCAT13(((byte)(uVar2 >> 0x18) ^ bVar157) & bVar106 ^
                                                    bVar157,CONCAT12(((byte)(uVar2 >> 0x10) ^
                                                                     bVar156) & bVar105 ^ bVar156,
                                                                     CONCAT11(((byte)(uVar2 >> 8) ^
                                                                              bVar155) & bVar104 ^
                                                                              bVar155,((byte)uVar2 ^
                                                                                      bVar154) &
                                                                                      bVar10 ^ 
                                                  bVar154)))))));
  *(ulong *)(param_1 + 0x1c) =
       CONCAT17((bVar77 ^ (byte)((uint)iVar137 >> 0x18)) & bVar106 ^ bVar77,
                CONCAT16((bVar76 ^ (byte)((uint)iVar137 >> 0x10)) & bVar105 ^ bVar76,
                         CONCAT15((bVar75 ^ (byte)((uint)iVar137 >> 8)) & bVar104 ^ bVar75,
                                  CONCAT14((bVar74 ^ (byte)iVar137) & bVar10 ^ bVar74,
                                           CONCAT13((bVar73 ^ (byte)((uint)iVar131 >> 0x18)) &
                                                    bVar106 ^ bVar73,
                                                    CONCAT12((bVar72 ^ (byte)((uint)iVar131 >> 0x10)
                                                             ) & bVar105 ^ bVar72,
                                                             CONCAT11((bVar71 ^ (byte)((uint)iVar131
                                                                                      >> 8)) &
                                                                      bVar104 ^ bVar71,
                                                                      (bVar69 ^ (byte)iVar131) &
                                                                      bVar10 ^ bVar69)))))));
  *(ulong *)(param_1 + 0x1a) =
       CONCAT17((bVar68 ^ (byte)((uint)iVar124 >> 0x18)) & bVar106 ^ bVar68,
                CONCAT16((bVar67 ^ (byte)((uint)iVar124 >> 0x10)) & bVar105 ^ bVar67,
                         CONCAT15((bVar66 ^ (byte)((uint)iVar124 >> 8)) & bVar104 ^ bVar66,
                                  CONCAT14((bVar65 ^ (byte)iVar124) & bVar10 ^ bVar65,
                                           CONCAT13((bVar64 ^ (byte)((uint)iVar119 >> 0x18)) &
                                                    bVar106 ^ bVar64,
                                                    CONCAT12((bVar63 ^ (byte)((uint)iVar119 >> 0x10)
                                                             ) & bVar105 ^ bVar63,
                                                             CONCAT11((bVar62 ^ (byte)((uint)iVar119
                                                                                      >> 8)) &
                                                                      bVar104 ^ bVar62,
                                                                      (bVar60 ^ (byte)iVar119) &
                                                                      bVar10 ^ bVar60)))))));
  return;
}

