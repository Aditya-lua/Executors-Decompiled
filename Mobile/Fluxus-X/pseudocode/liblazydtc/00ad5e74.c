/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad5e74
 */

int RSA_padding_check_PKCS1_type_2(uchar *to,int tlen,uchar *f,int fl,int rsa_len)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  byte bVar5;
  long lVar6;
  void *pvVar7;
  undefined8 uVar8;
  byte *pbVar9;
  ulong uVar10;
  uint uVar11;
  long lVar12;
  ulong uVar13;
  int iVar14;
  byte *pbVar15;
  uint uVar16;
  uint uVar17;
  long lVar18;
  
  if ((0 < tlen) && (0 < fl)) {
    if ((rsa_len < fl) || (rsa_len < 0xb)) {
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_pk1.c",0xba,"RSA_padding_check_PKCS1_type_2");
      uVar8 = 0x9f;
    }
    else {
      lVar18 = (long)rsa_len;
      pvVar7 = CRYPTO_malloc(rsa_len,"crypto/rsa/rsa_pk1.c",0xbe);
      if (pvVar7 != (void *)0x0) {
        uVar10 = (ulong)(rsa_len - 1U);
        lVar12 = 0;
        pbVar15 = f + fl;
        do {
          uVar11 = fl - 1U & (fl ^ 0xffffffffU);
          uVar16 = ((int)uVar11 >> 0x1f ^ 0xffffffffU) & 1;
          pbVar15 = pbVar15 + -(ulong)uVar16;
          fl = fl - uVar16;
          *(byte *)((long)pvVar7 + lVar12 + lVar18 + -1) =
               *pbVar15 & ((byte)((int)uVar11 >> 0x1f) ^ 0xff);
          lVar12 = lVar12 + -1;
        } while (rsa_len + (int)lVar12 != 0);
        pbVar15 = (byte *)((long)pvVar7 + ((lVar18 + -1) - uVar10));
        uVar11 = 0;
        if (2 < rsa_len) {
          lVar12 = 0;
          uVar11 = 0;
          uVar16 = 0;
          do {
            lVar6 = lVar12 + ((lVar18 + 1) - uVar10);
            iVar14 = (int)lVar12;
            lVar12 = lVar12 + 1;
            uVar2 = (int)(*(byte *)((long)pvVar7 + lVar6) - 1) >> 0x1f;
            uVar3 = uVar2 & (uVar16 ^ 0xffffffff);
            uVar16 = uVar2 | uVar16;
            uVar11 = ~uVar3 & uVar11 | uVar3 & iVar14 + 2U;
          } while ((ulong)(uint)rsa_len - 2 != lVar12);
        }
        uVar4 = (rsa_len - 1U) - uVar11;
        uVar3 = rsa_len - 0xb;
        uVar16 = (int)((uVar3 - tlen ^ tlen | uVar3 ^ tlen) ^ uVar3) >> 0x1f;
        uVar2 = (int)((pbVar15[1] ^ 2) - 1 & *pbVar15 - 1) >> 0x1f &
                ((int)(uVar11 - 10 & (uVar11 ^ 0xffffffff)) >> 0x1f ^ 0xffffffffU) &
                ((int)((tlen - uVar4 ^ uVar4 | uVar4 ^ tlen) ^ tlen) >> 0x1f ^ 0xffffffffU);
        uVar16 = ~uVar16 & tlen | uVar16 & uVar3;
        if (0xc < rsa_len) {
          uVar17 = 1;
          do {
            if (0xb < (int)(rsa_len - uVar17)) {
              uVar1 = uVar17 & uVar3 - uVar4;
              bVar5 = (char)((byte)(uVar1 - 1 >> 0x18) & ((byte)(uVar1 >> 0x18) ^ 0x80)) >> 7;
              lVar12 = (ulong)(rsa_len - uVar17) - 0xb;
              pbVar9 = (byte *)((long)pvVar7 + ((lVar18 + 10) - uVar10));
              do {
                lVar12 = lVar12 + -1;
                *pbVar9 = bVar5 & *pbVar9 | (bVar5 ^ 0xff) & pbVar9[(int)uVar17];
                pbVar9 = pbVar9 + 1;
              } while (lVar12 != 0);
            }
            uVar17 = uVar17 * 2;
          } while ((int)uVar17 < (int)uVar3);
        }
        if (0 < (int)uVar16) {
          uVar13 = (ulong)uVar16;
          iVar14 = (uVar11 + 1) - rsa_len;
          pbVar9 = (byte *)((long)pvVar7 + ((lVar18 + 10) - uVar10));
          do {
            bVar5 = (byte)uVar2 & (char)((byte)((uint)iVar14 >> 0x18) | (byte)(uVar4 >> 0x18)) >> 7;
            uVar13 = uVar13 - 1;
            iVar14 = iVar14 + 1;
            *to = ~bVar5 & *to | bVar5 & *pbVar9;
            pbVar9 = pbVar9 + 1;
            to = to + 1;
          } while (uVar13 != 0);
        }
        CRYPTO_clear_free(pbVar15,lVar18,"crypto/rsa/rsa_pk1.c",0x106);
        ERR_new();
        ERR_set_debug("crypto/rsa/rsa_pk1.c",0x10d,"RSA_padding_check_PKCS1_type_2");
        ERR_set_error(4,0x9f,0);
        err_clear_last_constant_time(uVar2 & 1);
        return ~uVar2 | uVar2 & uVar4;
      }
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_pk1.c",0xc0,"RSA_padding_check_PKCS1_type_2");
      uVar8 = 0xc0100;
    }
    ERR_set_error(4,uVar8,0);
  }
  return -1;
}

