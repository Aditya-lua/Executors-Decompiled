/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0bce8
 */

void BUF_reverse(uchar *out,uchar *in,size_t siz)

{
  undefined1 (*pauVar1) [16];
  uchar uVar2;
  undefined1 auVar3 [16];
  uchar *puVar4;
  uchar *puVar5;
  ulong uVar6;
  long lVar7;
  undefined1 (*pauVar8) [16];
  uchar *puVar9;
  long lVar10;
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  
  if (in == (uchar *)0x0) {
    uVar6 = siz >> 1;
    if (uVar6 != 0) {
      puVar4 = out + siz;
      do {
        puVar4 = puVar4 + -1;
        uVar2 = *puVar4;
        uVar6 = uVar6 - 1;
        *puVar4 = *out;
        *out = uVar2;
        out = out + 1;
      } while (uVar6 != 0);
    }
  }
  else if (siz != 0) {
    puVar4 = out + siz + -1;
    if ((siz < 0x20) || ((out < in + siz && (in < out + siz)))) {
      lVar7 = 0;
      puVar5 = in;
    }
    else {
      uVar6 = siz & 0x1f;
      lVar7 = siz - uVar6;
      puVar4 = puVar4 + (uVar6 - siz);
      puVar5 = in + lVar7;
      pauVar8 = (undefined1 (*) [16])(in + 0x10);
      puVar9 = out + (siz - 0x10);
      lVar10 = lVar7;
      do {
        pauVar1 = pauVar8 + -1;
        auVar3 = *pauVar8;
        pauVar8 = pauVar8 + 2;
        lVar10 = lVar10 + -0x20;
        auVar11._8_8_ = 0x1020304050607;
        auVar11._0_8_ = 0x8090a0b0c0d0e0f;
        auVar11 = a64_TBL(ZEXT816(0),*pauVar1,auVar11);
        auVar12._8_8_ = 0x1020304050607;
        auVar12._0_8_ = 0x8090a0b0c0d0e0f;
        auVar12 = a64_TBL(ZEXT816(0),auVar3,auVar12);
        *(long *)(puVar9 + -8) = auVar12._8_8_;
        *(long *)(puVar9 + -0x10) = auVar12._0_8_;
        *(long *)(puVar9 + 8) = auVar11._8_8_;
        *(long *)puVar9 = auVar11._0_8_;
        puVar9 = puVar9 + -0x20;
      } while (lVar10 != 0);
      if (uVar6 == 0) {
        return;
      }
    }
    lVar7 = siz - lVar7;
    do {
      lVar7 = lVar7 + -1;
      *puVar4 = *puVar5;
      puVar4 = puVar4 + -1;
      puVar5 = puVar5 + 1;
    } while (lVar7 != 0);
  }
  return;
}

