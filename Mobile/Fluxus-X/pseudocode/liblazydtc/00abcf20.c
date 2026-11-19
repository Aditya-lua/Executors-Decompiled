/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abcf20
 */

uchar * OPENSSL_asc2uni(char *asc,int asclen,uchar **uni,int *unilen)

{
  int num;
  char *pcVar1;
  uchar *puVar2;
  uchar *puVar3;
  ulong uVar4;
  uchar *puVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  uint uVar9;
  ulong uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  
  uVar8 = (ulong)(uint)asclen;
  if (asclen == -1) {
    uVar8 = strlen(asc);
    asclen = (int)uVar8;
  }
  if (-1 < asclen) {
    uVar4 = (uVar8 & 0xffffffff) << 1;
    uVar10 = -(uVar8 >> 0x1f & 1) & 0xfffffffe00000000 | uVar4;
    uVar9 = (uint)uVar4;
    num = uVar9 + 2;
    puVar3 = CRYPTO_malloc(num,"crypto/pkcs12/p12_utl.c",0x1b);
    if (puVar3 != (uchar *)0x0) {
      if (0 < (int)uVar8) {
        uVar8 = uVar10;
        if ((long)uVar10 < 3) {
          uVar8 = 2;
        }
        uVar8 = (uVar8 - 1 >> 1) + 1;
        uVar4 = 0;
        if (0x1f < uVar8) {
          uVar7 = uVar10;
          if ((long)uVar10 < 3) {
            uVar7 = 2;
          }
          if ((asc + (uVar7 - 1 >> 1) + 1 <= puVar3) || (uVar4 = 0, puVar3 + uVar7 <= asc)) {
            uVar6 = uVar8 & 0xffffffffffffffe0;
            uVar7 = 0;
            puVar5 = puVar3 + 0x20;
            uVar4 = uVar6 << 1;
            do {
              pcVar1 = asc + (uVar7 & 0x7fffffffffffffe0);
              uVar14 = *(undefined8 *)(pcVar1 + 8);
              uVar13 = *(undefined8 *)pcVar1;
              uVar12 = *(undefined8 *)(pcVar1 + 0x18);
              uVar11 = *(undefined8 *)(pcVar1 + 0x10);
              uVar7 = uVar7 + 0x20;
              puVar5[-0x20] = '\0';
              puVar5[-0x1f] = (uchar)uVar13;
              puVar5[-0x1e] = '\0';
              puVar5[-0x1d] = (uchar)((ulong)uVar13 >> 8);
              puVar5[-0x1c] = '\0';
              puVar5[-0x1b] = (uchar)((ulong)uVar13 >> 0x10);
              puVar5[-0x1a] = '\0';
              puVar5[-0x19] = (uchar)((ulong)uVar13 >> 0x18);
              puVar5[-0x18] = '\0';
              puVar5[-0x17] = (uchar)((ulong)uVar13 >> 0x20);
              puVar5[-0x16] = '\0';
              puVar5[-0x15] = (uchar)((ulong)uVar13 >> 0x28);
              puVar5[-0x14] = '\0';
              puVar5[-0x13] = (uchar)((ulong)uVar13 >> 0x30);
              puVar5[-0x12] = '\0';
              puVar5[-0x11] = (uchar)((ulong)uVar13 >> 0x38);
              puVar5[-0x10] = '\0';
              puVar5[-0xf] = (uchar)uVar14;
              puVar5[-0xe] = '\0';
              puVar5[-0xd] = (uchar)((ulong)uVar14 >> 8);
              puVar5[-0xc] = '\0';
              puVar5[-0xb] = (uchar)((ulong)uVar14 >> 0x10);
              puVar5[-10] = '\0';
              puVar5[-9] = (uchar)((ulong)uVar14 >> 0x18);
              puVar5[-8] = '\0';
              puVar5[-7] = (uchar)((ulong)uVar14 >> 0x20);
              puVar5[-6] = '\0';
              puVar5[-5] = (uchar)((ulong)uVar14 >> 0x28);
              puVar5[-4] = '\0';
              puVar5[-3] = (uchar)((ulong)uVar14 >> 0x30);
              puVar5[-2] = '\0';
              puVar5[-1] = (uchar)((ulong)uVar14 >> 0x38);
              *puVar5 = '\0';
              puVar5[1] = (uchar)uVar11;
              puVar5[2] = '\0';
              puVar5[3] = (uchar)((ulong)uVar11 >> 8);
              puVar5[4] = '\0';
              puVar5[5] = (uchar)((ulong)uVar11 >> 0x10);
              puVar5[6] = '\0';
              puVar5[7] = (uchar)((ulong)uVar11 >> 0x18);
              puVar5[8] = '\0';
              puVar5[9] = (uchar)((ulong)uVar11 >> 0x20);
              puVar5[10] = '\0';
              puVar5[0xb] = (uchar)((ulong)uVar11 >> 0x28);
              puVar5[0xc] = '\0';
              puVar5[0xd] = (uchar)((ulong)uVar11 >> 0x30);
              puVar5[0xe] = '\0';
              puVar5[0xf] = (uchar)((ulong)uVar11 >> 0x38);
              puVar5[0x10] = '\0';
              puVar5[0x11] = (uchar)uVar12;
              puVar5[0x12] = '\0';
              puVar5[0x13] = (uchar)((ulong)uVar12 >> 8);
              puVar5[0x14] = '\0';
              puVar5[0x15] = (uchar)((ulong)uVar12 >> 0x10);
              puVar5[0x16] = '\0';
              puVar5[0x17] = (uchar)((ulong)uVar12 >> 0x18);
              puVar5[0x18] = '\0';
              puVar5[0x19] = (uchar)((ulong)uVar12 >> 0x20);
              puVar5[0x1a] = '\0';
              puVar5[0x1b] = (uchar)((ulong)uVar12 >> 0x28);
              puVar5[0x1c] = '\0';
              puVar5[0x1d] = (uchar)((ulong)uVar12 >> 0x30);
              puVar5[0x1e] = '\0';
              puVar5[0x1f] = (uchar)((ulong)uVar12 >> 0x38);
              puVar5 = puVar5 + 0x40;
            } while (uVar6 != uVar7);
            if (uVar8 == uVar6) goto LAB_00abd048;
          }
        }
        puVar5 = (uchar *)(asc + (uVar4 >> 1));
        do {
          puVar2 = puVar3 + uVar4;
          *puVar2 = '\0';
          uVar4 = uVar4 + 2;
          puVar2[1] = *puVar5;
          puVar5 = puVar5 + 1;
        } while ((long)uVar4 < (long)uVar10);
      }
LAB_00abd048:
      puVar3[uVar10] = '\0';
      puVar3[(int)(uVar9 | 1)] = '\0';
      if (unilen != (int *)0x0) {
        *unilen = num;
      }
      if (uni == (uchar **)0x0) {
        return puVar3;
      }
      *uni = puVar3;
      return puVar3;
    }
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_utl.c",0x1c,"OPENSSL_asc2uni");
    ERR_set_error(0x23,0xc0100,0);
  }
  return (uchar *)0x0;
}

