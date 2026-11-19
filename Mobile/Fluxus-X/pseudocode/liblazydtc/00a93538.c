/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a93538
 */

void DES_cfb_encrypt(uchar *in,uchar *out,int numbits,long length,DES_key_schedule *schedule,
                    DES_cblock *ivec,int enc)

{
  int iVar1;
  int iVar2;
  int iVar3;
  undefined1 uVar4;
  undefined1 uVar5;
  byte bVar11;
  byte bVar10;
  byte bVar9;
  byte bVar8;
  byte bVar7;
  byte bVar6;
  uint uVar12;
  uint uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined3 uVar16;
  uint uVar17;
  byte *pbVar18;
  uint uVar19;
  long lVar20;
  uchar *puVar21;
  uint uVar22;
  byte *pbVar23;
  uint uVar24;
  uint uVar25;
  uint uVar26;
  uint uVar27;
  uint uVar28;
  ulong uVar29;
  uint uVar30;
  ulong uVar31;
  uint uVar32;
  undefined8 local_78;
  byte local_70 [4];
  byte local_6c;
  byte local_6b;
  byte local_6a;
  byte local_69;
  uint local_68;
  uint uStack_64;
  
  iVar1 = numbits + 7;
  iVar3 = iVar1;
  if (-1 < numbits) {
    iVar3 = numbits;
  }
  iVar2 = numbits + 0xe;
  if (-1 < iVar1) {
    iVar2 = iVar1;
  }
  if (0x3f < numbits - 1U) {
    return;
  }
  uVar32 = *(uint *)*ivec;
  uVar30 = *(uint *)(*ivec + 4);
  iVar2 = iVar2 >> 3;
  uVar29 = (ulong)iVar2;
  uVar12 = numbits % 8;
  if (enc == 0) {
    if (uVar29 <= (ulong)length) {
      uVar13 = iVar2 - 1;
      lVar20 = (long)(iVar3 >> 3);
      uVar19 = 8 - uVar12;
      uVar17 = uVar32;
      do {
        local_68 = uVar17;
        uStack_64 = uVar30;
        DES_encrypt1(&local_68,schedule,1);
        uVar22 = 0;
        pbVar18 = in + uVar29;
        uVar25 = 0;
        uVar32 = 0;
        uVar24 = 0;
        switch(uVar13) {
        case 7:
          pbVar18 = pbVar18 + -1;
          uVar22 = (uint)*pbVar18 << 0x18;
        case 6:
          pbVar18 = pbVar18 + -1;
          uVar22 = uVar22 | (uint)*pbVar18 << 0x10;
        case 5:
          pbVar18 = pbVar18 + -1;
          uVar22 = uVar22 | (uint)*pbVar18 << 8;
        case 4:
          pbVar18 = pbVar18 + -1;
          uVar22 = uVar22 | *pbVar18;
        case 3:
          pbVar18 = pbVar18 + -1;
          uVar32 = (uint)*pbVar18 << 0x18;
        case 2:
          pbVar18 = pbVar18 + -1;
          uVar24 = uVar32 | (uint)*pbVar18 << 0x10;
        case 1:
          pbVar18 = pbVar18 + -1;
          uVar25 = uVar24 | (uint)*pbVar18 << 8;
        case 0:
          pbVar18 = pbVar18 + -1;
          uVar25 = uVar25 | *pbVar18;
          break;
        default:
          uVar25 = 0;
        }
        if (numbits == 0x20) {
          uVar32 = uVar30;
          uVar24 = uVar25;
        }
        else {
          uVar32 = uVar25;
          uVar24 = uVar22;
          if (numbits != 0x40) {
            uVar4 = (undefined1)(uVar30 >> 0x18);
            local_70[3] = (byte)(uVar25 >> 0x18);
            local_69 = (byte)(uVar22 >> 0x18);
            local_78._0_4_ = uVar17 & 0xffffff00;
            local_78._0_5_ = (uint5)(uint)local_78;
            local_78._0_6_ = CONCAT15((char)(uVar30 >> 8),(uint5)local_78);
            local_78._0_7_ = CONCAT16((char)(uVar30 >> 0x10),(undefined6)local_78);
            local_78 = CONCAT17(uVar4,(undefined7)local_78);
            uVar14 = local_78;
            local_70[1] = (byte)(uVar25 >> 8);
            local_70[2] = (byte)(uVar25 >> 0x10);
            local_78 = CONCAT71(local_78._1_7_,(char)uVar17);
            uVar15 = local_78;
            local_78._5_3_ = SUB83(uVar14,5);
            uVar16 = local_78._5_3_;
            local_78._0_4_ = (uint)uVar15;
            local_78._0_5_ = CONCAT14((char)uVar30,(uint)local_78);
            uVar15 = local_78;
            local_70[0] = (byte)uVar25;
            local_6c = (byte)uVar22;
            local_6b = (byte)(uVar22 >> 8);
            local_6a = (byte)(uVar22 >> 0x10);
            if (uVar12 == 0) {
              uVar31 = *(ulong *)((long)&local_78 + lVar20);
              uVar32 = (uint)(uVar31 >> 8);
              uVar30 = (uint)(uVar31 >> 0x10);
              uVar17 = (uint)(uVar31 >> 0x18);
              uVar24 = (uint)(uVar31 >> 0x20);
              uVar26 = uVar24 >> 8;
              uVar27 = (uint)(ushort)(uVar31 >> 0x30);
              uVar28 = (uint)(byte)(uVar31 >> 0x38);
              local_78 = uVar31;
            }
            else {
              uVar32 = (uint)(*(byte *)((long)&local_78 + lVar20 + 1) >> (ulong)(uVar19 & 0x1f)) |
                       (uint)*(byte *)((long)&local_78 + lVar20) << (ulong)(uVar12 & 0x1f);
              uVar31 = (ulong)uVar32;
              uVar5 = (undefined1)uVar32;
              local_78 = CONCAT71(local_78._1_7_,uVar5);
              uVar32 = (uint)(*(byte *)((long)&local_78 + lVar20 + 2) >> (ulong)(uVar19 & 0x1f)) |
                       (uint)*(byte *)((long)&local_78 + lVar20 + 1) << (ulong)(uVar12 & 0x1f);
              local_78._2_6_ = SUB86(uVar15,2);
              local_78._0_2_ = CONCAT11((char)uVar32,uVar5);
              uVar30 = (uint)(*(byte *)((long)&local_78 + lVar20 + 3) >> (ulong)(uVar19 & 0x1f)) |
                       (uint)*(byte *)((long)&local_78 + lVar20 + 2) << (ulong)(uVar12 & 0x1f);
              local_78._3_5_ = SUB85(uVar15,3);
              local_78._0_3_ = CONCAT12((char)uVar30,(undefined2)local_78);
              uVar17 = (uint)(*(byte *)((long)&local_78 + lVar20 + 4) >> (ulong)(uVar19 & 0x1f)) |
                       (uint)*(byte *)((long)&local_78 + lVar20 + 3) << (ulong)(uVar12 & 0x1f);
              local_78._4_4_ = SUB84(uVar15,4);
              local_78._0_4_ = CONCAT13((char)uVar17,(undefined3)local_78);
              uVar24 = (uint)(*(byte *)((long)&local_78 + lVar20 + 5) >> (ulong)(uVar19 & 0x1f)) |
                       (uint)*(byte *)((long)&local_78 + lVar20 + 4) << (ulong)(uVar12 & 0x1f);
              local_78._0_5_ = CONCAT14((char)uVar24,(uint)local_78);
              local_78 = CONCAT35(uVar16,(uint5)local_78);
              uVar26 = (uint)(*(byte *)((long)&local_78 + lVar20 + 6) >> (ulong)(uVar19 & 0x1f)) |
                       (uint)*(byte *)((long)&local_78 + lVar20 + 5) << (ulong)(uVar12 & 0x1f);
              local_78._6_2_ = SUB82(uVar14,6);
              local_78._0_6_ = CONCAT15((char)uVar26,(uint5)local_78);
              uVar27 = (uint)(*(byte *)((long)&local_78 + lVar20 + 7) >> (ulong)(uVar19 & 0x1f)) |
                       (uint)*(byte *)((long)&local_78 + lVar20 + 6) << (ulong)(uVar12 & 0x1f);
              local_78._0_7_ = CONCAT16((char)uVar27,(undefined6)local_78);
              local_78 = CONCAT17(uVar4,(undefined7)local_78);
              uVar28 = (uint)(local_70[lVar20] >> (ulong)(uVar19 & 0x1f)) |
                       (uint)*(byte *)((long)&local_78 + lVar20 + 7) << (ulong)(uVar12 & 0x1f);
              local_78 = CONCAT17((char)uVar28,(undefined7)local_78);
            }
            uVar32 = (uint)uVar31 & 0xff | (uVar32 & 0xff) << 8 | (uVar30 & 0xff) << 0x10 |
                     uVar17 << 0x18;
            uVar24 = uVar24 & 0xff | (uVar26 & 0xff) << 8 | (uVar27 & 0xff) << 0x10 | uVar28 << 0x18
            ;
          }
        }
        uVar30 = uVar24;
        length = length - uVar29;
        in = pbVar18 + uVar29;
        puVar21 = out + uVar29;
        if (uVar13 < 8) {
          local_68 = local_68 ^ uVar25;
          uStack_64 = uStack_64 ^ uVar22;
          switch(uVar13) {
          case 7:
            puVar21 = puVar21 + -1;
            *puVar21 = (uchar)(uStack_64 >> 0x18);
          case 6:
            puVar21 = puVar21 + -1;
            *puVar21 = (uchar)(uStack_64 >> 0x10);
          case 5:
            puVar21 = puVar21 + -1;
            *puVar21 = (uchar)(uStack_64 >> 8);
          case 4:
            puVar21 = puVar21 + -1;
            *puVar21 = (uchar)uStack_64;
          case 3:
            puVar21 = puVar21 + -1;
            *puVar21 = (uchar)(local_68 >> 0x18);
          case 2:
            puVar21 = puVar21 + -1;
            *puVar21 = (uchar)(local_68 >> 0x10);
          case 1:
            puVar21 = puVar21 + -1;
            *puVar21 = (uchar)(local_68 >> 8);
          case 0:
            puVar21 = puVar21 + -1;
            *puVar21 = (uchar)local_68;
          }
        }
        out = puVar21 + uVar29;
        uVar17 = uVar32;
      } while (uVar29 <= (ulong)length);
    }
  }
  else if (uVar29 <= (ulong)length) {
    lVar20 = (long)(iVar3 >> 3);
    uVar13 = 8 - uVar12;
    do {
      local_68 = uVar32;
      uStack_64 = uVar30;
      DES_encrypt1(&local_68,schedule,1);
      uVar19 = 0;
      pbVar18 = in + uVar29;
      uVar24 = 0;
      uVar17 = 0;
      uVar22 = 0;
      switch(iVar2 + -1) {
      case 7:
        pbVar18 = pbVar18 + -1;
        uVar19 = (uint)*pbVar18 << 0x18;
      case 6:
        pbVar18 = pbVar18 + -1;
        uVar19 = uVar19 | (uint)*pbVar18 << 0x10;
      case 5:
        pbVar18 = pbVar18 + -1;
        uVar19 = uVar19 | (uint)*pbVar18 << 8;
      case 4:
        pbVar18 = pbVar18 + -1;
        uVar19 = uVar19 | *pbVar18;
      case 3:
        pbVar18 = pbVar18 + -1;
        uVar17 = (uint)*pbVar18 << 0x18;
      case 2:
        pbVar18 = pbVar18 + -1;
        uVar22 = uVar17 | (uint)*pbVar18 << 0x10;
      case 1:
        pbVar18 = pbVar18 + -1;
        uVar24 = uVar22 | (uint)*pbVar18 << 8;
      case 0:
        pbVar18 = pbVar18 + -1;
        uVar24 = uVar24 | *pbVar18;
        break;
      default:
        uVar24 = 0;
      }
      local_68 = local_68 ^ uVar24;
      uStack_64 = uStack_64 ^ uVar19;
      pbVar23 = out + uVar29;
      bVar6 = (byte)(uStack_64 >> 8);
      bVar7 = (byte)(uStack_64 >> 0x10);
      bVar8 = (byte)(uStack_64 >> 0x18);
      bVar9 = (byte)(local_68 >> 8);
      bVar10 = (byte)(local_68 >> 0x10);
      bVar11 = (byte)(local_68 >> 0x18);
      switch(iVar2 + -1) {
      case 7:
        pbVar23 = pbVar23 + -1;
        *pbVar23 = bVar8;
      case 6:
        pbVar23 = pbVar23 + -1;
        *pbVar23 = bVar7;
      case 5:
        pbVar23 = pbVar23 + -1;
        *pbVar23 = bVar6;
      case 4:
        pbVar23 = pbVar23 + -1;
        *pbVar23 = (byte)uStack_64;
      case 3:
        pbVar23 = pbVar23 + -1;
        *pbVar23 = bVar11;
      case 2:
        pbVar23 = pbVar23 + -1;
        *pbVar23 = bVar10;
      case 1:
        pbVar23 = pbVar23 + -1;
        *pbVar23 = bVar9;
      case 0:
        pbVar23 = pbVar23 + -1;
        *pbVar23 = (byte)local_68;
      }
      length = length - uVar29;
      in = pbVar18 + uVar29;
      out = pbVar23 + uVar29;
      uVar19 = uVar30;
      if (numbits != 0x20) {
        if (numbits == 0x40) {
          uVar19 = local_68;
          local_68 = uStack_64;
        }
        else {
          local_78._0_4_ = uVar32 & 0xffffff00;
          local_78._0_5_ = (uint5)(uint)local_78;
          local_78._0_6_ = CONCAT15((char)(uVar30 >> 8),(uint5)local_78);
          local_78._0_7_ = CONCAT16((char)(uVar30 >> 0x10),(undefined6)local_78);
          uVar4 = (undefined1)(uVar30 >> 0x18);
          local_78 = CONCAT17(uVar4,(undefined7)local_78);
          uVar14 = local_78;
          local_70[0] = (byte)local_68;
          local_70[1] = bVar9;
          local_70[2] = bVar10;
          local_78 = CONCAT71(local_78._1_7_,(char)uVar32);
          uVar15 = local_78;
          local_78._5_3_ = SUB83(uVar14,5);
          uVar16 = local_78._5_3_;
          local_78._0_4_ = (uint)uVar15;
          local_78._0_5_ = CONCAT14((char)uVar30,(uint)local_78);
          uVar15 = local_78;
          local_70[3] = bVar11;
          local_6c = (byte)uStack_64;
          local_6b = bVar6;
          local_6a = bVar7;
          local_69 = bVar8;
          if (uVar12 == 0) {
            uVar31 = *(ulong *)((long)&local_78 + lVar20);
            uVar32 = (uint)(uVar31 >> 8);
            uVar30 = (uint)(uVar31 >> 0x10);
            uVar19 = (uint)(uVar31 >> 0x18);
            uVar17 = (uint)(uVar31 >> 0x20);
            uVar22 = uVar17 >> 8;
            uVar24 = (uint)(ushort)(uVar31 >> 0x30);
            uVar25 = (uint)(byte)(uVar31 >> 0x38);
            local_78 = uVar31;
          }
          else {
            uVar32 = (uint)(*(byte *)((long)&local_78 + lVar20 + 1) >> (ulong)(uVar13 & 0x1f)) |
                     (uint)*(byte *)((long)&local_78 + lVar20) << (ulong)(uVar12 & 0x1f);
            uVar31 = (ulong)uVar32;
            uVar5 = (undefined1)uVar32;
            local_78 = CONCAT71(local_78._1_7_,uVar5);
            uVar32 = (uint)(*(byte *)((long)&local_78 + lVar20 + 2) >> (ulong)(uVar13 & 0x1f)) |
                     (uint)*(byte *)((long)&local_78 + lVar20 + 1) << (ulong)(uVar12 & 0x1f);
            local_78._2_6_ = SUB86(uVar15,2);
            local_78._0_2_ = CONCAT11((char)uVar32,uVar5);
            uVar30 = (uint)(*(byte *)((long)&local_78 + lVar20 + 3) >> (ulong)(uVar13 & 0x1f)) |
                     (uint)*(byte *)((long)&local_78 + lVar20 + 2) << (ulong)(uVar12 & 0x1f);
            local_78._3_5_ = SUB85(uVar15,3);
            local_78._0_3_ = CONCAT12((char)uVar30,(undefined2)local_78);
            uVar19 = (uint)(*(byte *)((long)&local_78 + lVar20 + 4) >> (ulong)(uVar13 & 0x1f)) |
                     (uint)*(byte *)((long)&local_78 + lVar20 + 3) << (ulong)(uVar12 & 0x1f);
            local_78._4_4_ = SUB84(uVar15,4);
            local_78._0_4_ = CONCAT13((char)uVar19,(undefined3)local_78);
            uVar17 = (uint)(*(byte *)((long)&local_78 + lVar20 + 5) >> (ulong)(uVar13 & 0x1f)) |
                     (uint)*(byte *)((long)&local_78 + lVar20 + 4) << (ulong)(uVar12 & 0x1f);
            local_78._0_5_ = CONCAT14((char)uVar17,(uint)local_78);
            local_78 = CONCAT35(uVar16,(uint5)local_78);
            uVar22 = (uint)(*(byte *)((long)&local_78 + lVar20 + 6) >> (ulong)(uVar13 & 0x1f)) |
                     (uint)*(byte *)((long)&local_78 + lVar20 + 5) << (ulong)(uVar12 & 0x1f);
            local_78._6_2_ = SUB82(uVar14,6);
            local_78._0_6_ = CONCAT15((char)uVar22,(uint5)local_78);
            uVar24 = (uint)(*(byte *)((long)&local_78 + lVar20 + 7) >> (ulong)(uVar13 & 0x1f)) |
                     (uint)*(byte *)((long)&local_78 + lVar20 + 6) << (ulong)(uVar12 & 0x1f);
            local_78._0_7_ = CONCAT16((char)uVar24,(undefined6)local_78);
            local_78 = CONCAT17(uVar4,(undefined7)local_78);
            uVar25 = (uint)(local_70[lVar20] >> (ulong)(uVar13 & 0x1f)) |
                     (uint)*(byte *)((long)&local_78 + lVar20 + 7) << (ulong)(uVar12 & 0x1f);
            local_78 = CONCAT17((char)uVar25,(undefined7)local_78);
          }
          uVar19 = (uint)uVar31 & 0xff | (uVar32 & 0xff) << 8 | (uVar30 & 0xff) << 0x10 |
                   uVar19 << 0x18;
          local_68 = uVar17 & 0xff | (uVar22 & 0xff) << 8 | (uVar24 & 0xff) << 0x10 | uVar25 << 0x18
          ;
        }
      }
      uVar30 = local_68;
      uVar32 = uVar19;
    } while (uVar29 <= (ulong)length);
  }
  (*ivec)[1] = (uchar)(uVar32 >> 8);
  (*ivec)[4] = (uchar)uVar30;
  (*ivec)[2] = (uchar)(uVar32 >> 0x10);
  (*ivec)[3] = (uchar)(uVar32 >> 0x18);
  (*ivec)[0] = (uchar)uVar32;
  (*ivec)[5] = (uchar)(uVar30 >> 8);
  (*ivec)[6] = (uchar)(uVar30 >> 0x10);
  (*ivec)[7] = (uchar)(uVar30 >> 0x18);
  return;
}

