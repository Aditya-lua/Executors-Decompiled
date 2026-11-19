/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0099deec
 */

/* macaron::Base64::Encode(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >) */

void __thiscall macaron::Base64::Encode(ulong *param_1,Base64 *this)

{
  byte bVar1;
  uint uVar2;
  long lVar3;
  ulong uVar4;
  byte *pbVar5;
  Base64 *pBVar6;
  Base64 *pBVar7;
  Base64 *pBVar8;
  ulong __n;
  byte *pbVar9;
  ulong uVar10;
  
  if (((byte)*this & 1) == 0) {
    uVar10 = (ulong)((byte)*this >> 1);
  }
  else {
    uVar10 = *(ulong *)(this + 8);
  }
  uVar4 = (uVar10 + 2) / 3;
  __n = uVar4 * 4;
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  if (0xffffffffffffffef < __n) {
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  if (__n < 0x17) {
    pbVar9 = (byte *)((long)param_1 + 1);
    *(byte *)param_1 = (byte)((int)uVar4 << 3);
    if (__n == 0) goto LAB_0099df98;
  }
  else {
    uVar4 = __n + 0x10 & 0xfffffffffffffff0;
    pbVar9 = operator_new(uVar4);
    param_1[1] = __n;
    param_1[2] = (ulong)pbVar9;
    *param_1 = uVar4 | 1;
  }
  memset(pbVar9,0,__n);
LAB_0099df98:
  pbVar9[__n] = 0;
  pbVar9 = (byte *)((long)param_1 + 1);
  if ((*param_1 & 1) != 0) {
    pbVar9 = (byte *)param_1[2];
  }
  uVar4 = 0;
  if (uVar10 != 2) {
    pBVar6 = this + 1;
    pbVar5 = pbVar9;
    do {
      pBVar7 = pBVar6;
      if (((byte)*this & 1) != 0) {
        pBVar7 = *(Base64 **)(this + 0x10);
      }
      *pbVar5 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
                [(byte)pBVar7[uVar4] >> 2];
      if (((byte)*this & 1) == 0) {
        pBVar7 = this + uVar4 + 1;
        pBVar8 = pBVar6;
      }
      else {
        pBVar8 = *(Base64 **)(this + 0x10);
        pBVar7 = pBVar8 + uVar4;
      }
      pbVar5[1] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
                  [(uint)((byte)pBVar8[uVar4 + 1] >> 4) | ((byte)*pBVar7 & 3) << 4];
      if (((byte)*this & 1) == 0) {
        pBVar7 = this + uVar4 + 2;
        pBVar8 = pBVar6;
      }
      else {
        pBVar8 = *(Base64 **)(this + 0x10);
        pBVar7 = pBVar8 + uVar4 + 1;
      }
      pbVar5[2] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
                  [(uint)((byte)pBVar8[uVar4 + 2] >> 6) | ((byte)*pBVar7 & 0xf) << 2];
      pBVar7 = pBVar6;
      if (((byte)*this & 1) != 0) {
        pBVar7 = *(Base64 **)(this + 0x10);
      }
      lVar3 = uVar4 + 2;
      uVar4 = uVar4 + 3;
      pbVar9 = pbVar5 + 4;
      pbVar5[3] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
                  [(ulong)(byte)pBVar7[lVar3] & 0x3f];
      pbVar5 = pbVar9;
    } while (uVar4 < uVar10 - 2);
  }
  if (uVar4 < uVar10) {
    if (((byte)*this & 1) == 0) {
      pBVar6 = this + 1;
    }
    else {
      pBVar6 = *(Base64 **)(this + 0x10);
    }
    *pbVar9 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
              [(byte)pBVar6[uVar4] >> 2];
    if (((byte)*this & 1) == 0) {
      pBVar6 = this + 1;
    }
    else {
      pBVar6 = *(Base64 **)(this + 0x10);
    }
    uVar2 = ((byte)pBVar6[uVar4] & 3) << 4;
    if (uVar4 == uVar10 - 1) {
      bVar1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"[uVar2];
      pbVar9[2] = 0x3d;
      pbVar9[1] = bVar1;
    }
    else {
      if (((byte)*this & 1) == 0) {
        pBVar6 = this + 1;
      }
      else {
        pBVar6 = *(Base64 **)(this + 0x10);
      }
      pbVar9[1] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
                  [uVar2 | (byte)pBVar6[uVar4 + 1] >> 4];
      if (((byte)*this & 1) == 0) {
        this = this + 1;
      }
      else {
        this = *(Base64 **)(this + 0x10);
      }
      pbVar9[2] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
                  [((byte)this[uVar4 + 1] & 0xf) << 2];
    }
    pbVar9[3] = 0x3d;
  }
  return;
}

