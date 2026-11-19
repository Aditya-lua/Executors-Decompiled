/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa02b8
 */

char * BN_bn2hex(BIGNUM *a)

{
  bool bVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  char *pcVar5;
  long lVar6;
  char *pcVar7;
  ulong uVar8;
  uint uVar9;
  
  iVar4 = BN_is_zero();
  if (iVar4 != 0) {
    pcVar5 = CRYPTO_strdup("0","crypto/bn/bn_conv.c",0x18);
    return pcVar5;
  }
  pcVar5 = CRYPTO_malloc(a->top << 4 | 2,"crypto/bn/bn_conv.c",0x19);
  if (pcVar5 == (char *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_conv.c",0x1b,"BN_bn2hex");
    ERR_set_error(3,0xc0100,0);
    pcVar5 = (char *)0x0;
  }
  else {
    pcVar7 = pcVar5;
    if (a->neg != 0) {
      pcVar7 = pcVar5 + 1;
      *pcVar5 = '-';
    }
    if (0 < a->top) {
      bVar3 = false;
      lVar6 = (long)a->top;
      do {
        uVar8 = a->d[lVar6 + -1];
        if (bVar3 || (char)(uVar8 >> 0x38) != '\0') {
          cVar2 = "0123456789ABCDEF"[uVar8 >> 0x38 & 0xf];
          *pcVar7 = "0123456789ABCDEF"[uVar8 >> 0x3c];
          pcVar7[1] = cVar2;
          pcVar7 = pcVar7 + 2;
          bVar3 = true;
          uVar8 = a->d[lVar6 + -1];
        }
        if ((uVar8 & 0xff000000000000) != 0 || bVar3) {
          cVar2 = "0123456789ABCDEF"[uVar8 >> 0x30 & 0xf];
          *pcVar7 = "0123456789ABCDEF"[((ushort)(uVar8 >> 0x30) & 0xff) >> 4];
          pcVar7[1] = cVar2;
          pcVar7 = pcVar7 + 2;
          bVar3 = true;
          uVar8 = a->d[lVar6 + -1];
        }
        uVar9 = (uint)(uVar8 >> 0x28) & 0xff;
        if (uVar9 != 0 || bVar3) {
          cVar2 = "0123456789ABCDEF"[uVar8 >> 0x28 & 0xf];
          *pcVar7 = "0123456789ABCDEF"[uVar9 >> 4];
          pcVar7[1] = cVar2;
          pcVar7 = pcVar7 + 2;
          bVar3 = true;
          uVar8 = a->d[lVar6 + -1];
        }
        if ((uVar8 & 0xff00000000) != 0 || bVar3) {
          cVar2 = "0123456789ABCDEF"[uVar8 >> 0x20 & 0xf];
          *pcVar7 = "0123456789ABCDEF"[((uint)(uVar8 >> 0x20) & 0xff) >> 4];
          pcVar7[1] = cVar2;
          pcVar7 = pcVar7 + 2;
          bVar3 = true;
          uVar8 = a->d[lVar6 + -1];
        }
        if ((uVar8 & 0xff000000) != 0 || bVar3) {
          cVar2 = "0123456789ABCDEF"[uVar8 >> 0x18 & 0xf];
          *pcVar7 = "0123456789ABCDEF"[((uint)(uVar8 >> 0x18) & 0xff) >> 4];
          pcVar7[1] = cVar2;
          pcVar7 = pcVar7 + 2;
          bVar3 = true;
          uVar8 = a->d[lVar6 + -1];
        }
        uVar9 = (uint)uVar8 >> 0x10 & 0xff;
        if (uVar9 != 0 || bVar3) {
          cVar2 = "0123456789ABCDEF"[uVar8 >> 0x10 & 0xf];
          *pcVar7 = "0123456789ABCDEF"[uVar9 >> 4];
          pcVar7[1] = cVar2;
          pcVar7 = pcVar7 + 2;
          bVar3 = true;
          uVar8 = a->d[lVar6 + -1];
        }
        uVar9 = (uint)uVar8 >> 8 & 0xff;
        if (uVar9 != 0 || bVar3) {
          cVar2 = "0123456789ABCDEF"[uVar8 >> 8 & 0xf];
          *pcVar7 = "0123456789ABCDEF"[uVar9 >> 4];
          pcVar7[1] = cVar2;
          pcVar7 = pcVar7 + 2;
          bVar3 = true;
          uVar8 = a->d[lVar6 + -1];
        }
        if ((uVar8 & 0xff) != 0 || bVar3) {
          cVar2 = "0123456789ABCDEF"[uVar8 & 0xf];
          *pcVar7 = "0123456789ABCDEF"[((uint)uVar8 & 0xff) >> 4];
          pcVar7[1] = cVar2;
          pcVar7 = pcVar7 + 2;
          bVar3 = true;
        }
        bVar1 = 1 < lVar6;
        lVar6 = lVar6 + -1;
      } while (bVar1);
    }
    *pcVar7 = '\0';
  }
  return pcVar5;
}

