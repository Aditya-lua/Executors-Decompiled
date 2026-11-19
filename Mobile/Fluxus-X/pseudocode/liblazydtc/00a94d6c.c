/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a94d6c
 */

void DES_ede3_cfb_encrypt
               (uchar *in,uchar *out,int numbits,long length,DES_key_schedule *ks1,
               DES_key_schedule *ks2,DES_key_schedule *ks3,DES_cblock *ivec,int enc)

{
  size_t sVar1;
  int iVar2;
  uint uVar3;
  byte bVar9;
  byte bVar8;
  byte bVar7;
  byte bVar6;
  byte bVar5;
  byte bVar4;
  uint uVar10;
  uint uVar11;
  uint uVar12;
  uint uVar13;
  byte *pbVar14;
  uchar *puVar15;
  uint uVar16;
  uint uVar17;
  byte *pbVar18;
  uint uVar19;
  uint uVar20;
  uint uVar21;
  uint uVar22;
  uint uVar23;
  ulong uVar24;
  uint uVar25;
  byte local_78 [4];
  byte local_74;
  byte local_73;
  byte local_72;
  byte local_71;
  byte local_70;
  byte local_6f;
  byte local_6e;
  byte local_6d;
  byte local_6c;
  byte local_6b;
  byte local_6a;
  byte local_69;
  uint local_68;
  uint uStack_64;
  
  if (0x40 < numbits) {
    return;
  }
  uVar25 = *(uint *)*ivec;
  uVar13 = *(uint *)(*ivec + 4);
  uVar3 = numbits + 7U >> 3;
  uVar24 = (ulong)uVar3;
  if (enc == 0) {
    if (uVar24 <= (ulong)length) {
      uVar3 = uVar3 - 1;
      iVar2 = numbits + 7;
      if (-1 < numbits) {
        iVar2 = numbits;
      }
      uVar11 = numbits % 8;
      sVar1 = 8;
      if (uVar11 != 0) {
        sVar1 = 9;
      }
      uVar10 = 8 - uVar11;
      uVar17 = uVar25;
      do {
        _local_68 = CONCAT44(uVar13,uVar17);
        DES_encrypt3(&local_68,ks1,ks2,ks3);
        uVar16 = 0;
        pbVar14 = in + uVar24;
        uVar23 = 0;
        switch(uVar3) {
        case 7:
          pbVar14 = pbVar14 + -1;
          uVar16 = (uint)*pbVar14 << 0x18;
        case 6:
          pbVar14 = pbVar14 + -1;
          uVar16 = uVar16 | (uint)*pbVar14 << 0x10;
        case 5:
          pbVar14 = pbVar14 + -1;
          uVar16 = uVar16 | (uint)*pbVar14 << 8;
        case 4:
          pbVar14 = pbVar14 + -1;
          uVar16 = uVar16 | *pbVar14;
        case 3:
          uVar23 = uVar16;
          pbVar14 = pbVar14 + -1;
          uVar16 = (uint)*pbVar14 << 0x18;
        case 2:
          pbVar14 = pbVar14 + -1;
          uVar16 = uVar16 | (uint)*pbVar14 << 0x10;
        case 1:
          pbVar14 = pbVar14 + -1;
          uVar16 = uVar16 | (uint)*pbVar14 << 8;
        case 0:
          pbVar14 = pbVar14 + -1;
          uVar16 = uVar16 | *pbVar14;
          break;
        default:
          uVar23 = 0;
        }
        if (numbits == 0x20) {
          uVar25 = uVar13;
          uVar12 = uVar16;
        }
        else {
          uVar25 = uVar16;
          uVar12 = uVar23;
          if (numbits != 0x40) {
            local_78[1] = (byte)(uVar17 >> 8);
            local_78[2] = (byte)(uVar17 >> 0x10);
            local_78[3] = (byte)(uVar17 >> 0x18);
            local_73 = (byte)(uVar13 >> 8);
            local_72 = (byte)(uVar13 >> 0x10);
            local_71 = (byte)(uVar13 >> 0x18);
            local_6f = (byte)(uVar16 >> 8);
            local_6e = (byte)(uVar16 >> 0x10);
            local_6d = (byte)(uVar16 >> 0x18);
            local_78[0] = (byte)uVar17;
            local_74 = (byte)uVar13;
            local_70 = (byte)uVar16;
            local_6c = (byte)uVar23;
            local_6b = (byte)(uVar23 >> 8);
            local_6a = (byte)(uVar23 >> 0x10);
            local_69 = (byte)(uVar23 >> 0x18);
            memmove(local_78,local_78 + (iVar2 >> 3),sVar1);
            uVar25 = (uint)local_78[0];
            if (uVar11 == 0) {
              uVar13 = (uint)local_78[1];
              uVar17 = (uint)local_78[2];
              uVar12 = (uint)local_78[3];
              uVar19 = (uint)local_74;
              uVar20 = (uint)local_73;
              uVar21 = (uint)local_72;
              uVar22 = (uint)local_71;
            }
            else {
              uVar25 = (uint)(local_78[1] >> (ulong)(uVar10 & 0x1f)) |
                       (uint)local_78[0] << (ulong)(uVar11 & 0x1f);
              uVar13 = (uint)(local_78[2] >> (ulong)(uVar10 & 0x1f)) |
                       (uint)local_78[1] << (ulong)(uVar11 & 0x1f);
              local_78[0] = (byte)uVar25;
              local_78[1] = (byte)uVar13;
              uVar17 = (uint)(local_78[3] >> (ulong)(uVar10 & 0x1f)) |
                       (uint)local_78[2] << (ulong)(uVar11 & 0x1f);
              uVar12 = (uint)(local_74 >> (ulong)(uVar10 & 0x1f)) |
                       (uint)local_78[3] << (ulong)(uVar11 & 0x1f);
              uVar19 = (uint)(local_73 >> (ulong)(uVar10 & 0x1f)) |
                       (uint)local_74 << (ulong)(uVar11 & 0x1f);
              uVar20 = (uint)(local_72 >> (ulong)(uVar10 & 0x1f)) |
                       (uint)local_73 << (ulong)(uVar11 & 0x1f);
              uVar21 = (uint)(local_71 >> (ulong)(uVar10 & 0x1f)) |
                       (uint)local_72 << (ulong)(uVar11 & 0x1f);
              local_78[2] = (byte)uVar17;
              local_78[3] = (byte)uVar12;
              uVar22 = (uint)(local_70 >> (ulong)(uVar10 & 0x1f)) |
                       (uint)local_71 << (ulong)(uVar11 & 0x1f);
              local_74 = (byte)uVar19;
              local_73 = (byte)uVar20;
              local_72 = (byte)uVar21;
              local_71 = (byte)uVar22;
            }
            uVar25 = uVar25 & 0xff | (uVar13 & 0xff) << 8 | (uVar17 & 0xff) << 0x10 | uVar12 << 0x18
            ;
            uVar12 = uVar19 & 0xff | (uVar20 & 0xff) << 8 | (uVar21 & 0xff) << 0x10 | uVar22 << 0x18
            ;
          }
        }
        uVar13 = uVar12;
        length = length - uVar24;
        in = pbVar14 + uVar24;
        puVar15 = out + uVar24;
        if (uVar3 < 8) {
          local_68 = local_68 ^ uVar16;
          uStack_64 = uStack_64 ^ uVar23;
          switch(uVar3) {
          case 7:
            puVar15 = puVar15 + -1;
            *puVar15 = (uchar)(uStack_64 >> 0x18);
          case 6:
            puVar15 = puVar15 + -1;
            *puVar15 = (uchar)(uStack_64 >> 0x10);
          case 5:
            puVar15 = puVar15 + -1;
            *puVar15 = (uchar)(uStack_64 >> 8);
          case 4:
            puVar15 = puVar15 + -1;
            *puVar15 = (uchar)uStack_64;
          case 3:
            puVar15 = puVar15 + -1;
            *puVar15 = (uchar)(local_68 >> 0x18);
          case 2:
            puVar15 = puVar15 + -1;
            *puVar15 = (uchar)(local_68 >> 0x10);
          case 1:
            puVar15 = puVar15 + -1;
            *puVar15 = (uchar)(local_68 >> 8);
          case 0:
            puVar15 = puVar15 + -1;
            *puVar15 = (uchar)local_68;
          }
        }
        out = puVar15 + uVar24;
        uVar17 = uVar25;
      } while (uVar24 <= (ulong)length);
    }
  }
  else if (uVar24 <= (ulong)length) {
    iVar2 = numbits + 7;
    if (-1 < numbits) {
      iVar2 = numbits;
    }
    uVar11 = numbits % 8;
    sVar1 = 8;
    if (uVar11 != 0) {
      sVar1 = 9;
    }
    uVar10 = 8 - uVar11;
    do {
      local_68 = uVar25;
      uStack_64 = uVar13;
      DES_encrypt3(&local_68,ks1,ks2,ks3);
      uVar17 = 0;
      pbVar14 = in + uVar24;
      uVar16 = 0;
      switch(uVar3 - 1) {
      case 7:
        pbVar14 = pbVar14 + -1;
        uVar17 = (uint)*pbVar14 << 0x18;
      case 6:
        pbVar14 = pbVar14 + -1;
        uVar17 = uVar17 | (uint)*pbVar14 << 0x10;
      case 5:
        pbVar14 = pbVar14 + -1;
        uVar17 = uVar17 | (uint)*pbVar14 << 8;
      case 4:
        pbVar14 = pbVar14 + -1;
        uVar17 = uVar17 | *pbVar14;
      case 3:
        uVar16 = uVar17;
        pbVar14 = pbVar14 + -1;
        uVar17 = (uint)*pbVar14 << 0x18;
      case 2:
        pbVar14 = pbVar14 + -1;
        uVar17 = uVar17 | (uint)*pbVar14 << 0x10;
      case 1:
        pbVar14 = pbVar14 + -1;
        uVar17 = uVar17 | (uint)*pbVar14 << 8;
      case 0:
        pbVar14 = pbVar14 + -1;
        uVar17 = uVar17 | *pbVar14;
        break;
      default:
        uVar16 = 0;
      }
      uVar17 = local_68 ^ uVar17;
      uVar16 = uStack_64 ^ uVar16;
      pbVar18 = out + uVar24;
      bVar4 = (byte)(uVar16 >> 8);
      bVar5 = (byte)(uVar16 >> 0x10);
      bVar6 = (byte)(uVar16 >> 0x18);
      bVar7 = (byte)(uVar17 >> 8);
      bVar8 = (byte)(uVar17 >> 0x10);
      bVar9 = (byte)(uVar17 >> 0x18);
      switch(uVar3 - 1) {
      case 7:
        pbVar18 = pbVar18 + -1;
        *pbVar18 = bVar6;
      case 6:
        pbVar18 = pbVar18 + -1;
        *pbVar18 = bVar5;
      case 5:
        pbVar18 = pbVar18 + -1;
        *pbVar18 = bVar4;
      case 4:
        pbVar18 = pbVar18 + -1;
        *pbVar18 = (byte)uVar16;
      case 3:
        pbVar18 = pbVar18 + -1;
        *pbVar18 = bVar9;
      case 2:
        pbVar18 = pbVar18 + -1;
        *pbVar18 = bVar8;
      case 1:
        pbVar18 = pbVar18 + -1;
        *pbVar18 = bVar7;
      case 0:
        pbVar18 = pbVar18 + -1;
        *pbVar18 = (byte)uVar17;
      }
      in = pbVar14 + uVar24;
      length = length - uVar24;
      out = pbVar18 + uVar24;
      uVar23 = uVar13;
      if (numbits != 0x20) {
        if (numbits == 0x40) {
          uVar23 = uVar17;
          uVar17 = uVar16;
        }
        else {
          local_78[1] = (byte)(uVar25 >> 8);
          local_78[2] = (byte)(uVar25 >> 0x10);
          local_78[3] = (byte)(uVar25 >> 0x18);
          local_73 = (byte)(uVar13 >> 8);
          local_72 = (byte)(uVar13 >> 0x10);
          local_71 = (byte)(uVar13 >> 0x18);
          local_78[0] = (byte)uVar25;
          local_74 = (byte)uVar13;
          local_70 = (byte)uVar17;
          local_6f = bVar7;
          local_6e = bVar8;
          local_6d = bVar9;
          local_6c = (byte)uVar16;
          local_6b = bVar4;
          local_6a = bVar5;
          local_69 = bVar6;
          memmove(local_78,local_78 + (iVar2 >> 3),sVar1);
          uVar25 = (uint)local_78[0];
          if (uVar11 == 0) {
            uVar13 = (uint)local_78[1];
            uVar17 = (uint)local_78[2];
            uVar16 = (uint)local_78[3];
            uVar12 = (uint)local_74;
            uVar19 = (uint)local_73;
            uVar20 = (uint)local_72;
            uVar21 = (uint)local_71;
          }
          else {
            uVar25 = (uint)(local_78[1] >> (ulong)(uVar10 & 0x1f)) |
                     (uint)local_78[0] << (ulong)(uVar11 & 0x1f);
            uVar13 = (uint)(local_78[2] >> (ulong)(uVar10 & 0x1f)) |
                     (uint)local_78[1] << (ulong)(uVar11 & 0x1f);
            local_78[0] = (byte)uVar25;
            local_78[1] = (byte)uVar13;
            uVar17 = (uint)(local_78[3] >> (ulong)(uVar10 & 0x1f)) |
                     (uint)local_78[2] << (ulong)(uVar11 & 0x1f);
            uVar16 = (uint)(local_74 >> (ulong)(uVar10 & 0x1f)) |
                     (uint)local_78[3] << (ulong)(uVar11 & 0x1f);
            uVar12 = (uint)(local_73 >> (ulong)(uVar10 & 0x1f)) |
                     (uint)local_74 << (ulong)(uVar11 & 0x1f);
            uVar19 = (uint)(local_72 >> (ulong)(uVar10 & 0x1f)) |
                     (uint)local_73 << (ulong)(uVar11 & 0x1f);
            uVar20 = (uint)(local_71 >> (ulong)(uVar10 & 0x1f)) |
                     (uint)local_72 << (ulong)(uVar11 & 0x1f);
            local_78[2] = (byte)uVar17;
            local_78[3] = (byte)uVar16;
            uVar21 = (uint)(local_70 >> (ulong)(uVar10 & 0x1f)) |
                     (uint)local_71 << (ulong)(uVar11 & 0x1f);
            local_74 = (byte)uVar12;
            local_73 = (byte)uVar19;
            local_72 = (byte)uVar20;
            local_71 = (byte)uVar21;
          }
          uVar23 = uVar25 & 0xff | (uVar13 & 0xff) << 8 | (uVar17 & 0xff) << 0x10 | uVar16 << 0x18;
          uVar17 = uVar12 & 0xff | (uVar19 & 0xff) << 8 | (uVar20 & 0xff) << 0x10 | uVar21 << 0x18;
        }
      }
      uVar13 = uVar17;
      uVar25 = uVar23;
    } while (uVar24 <= (ulong)length);
  }
  (*ivec)[1] = (uchar)(uVar25 >> 8);
  (*ivec)[4] = (uchar)uVar13;
  (*ivec)[2] = (uchar)(uVar25 >> 0x10);
  (*ivec)[3] = (uchar)(uVar25 >> 0x18);
  (*ivec)[0] = (uchar)uVar25;
  (*ivec)[5] = (uchar)(uVar13 >> 8);
  (*ivec)[6] = (uchar)(uVar13 >> 0x10);
  (*ivec)[7] = (uchar)(uVar13 >> 0x18);
  return;
}

