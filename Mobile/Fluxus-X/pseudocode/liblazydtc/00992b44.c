/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00992b44
 */

/* ix::WebSocketPerMessageDeflateOptions::removeSpaces(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&) */

void __thiscall
ix::WebSocketPerMessageDeflateOptions::removeSpaces
          (WebSocketPerMessageDeflateOptions *this,basic_string_conflict *param_1)

{
  ulong uVar1;
  byte bVar2;
  ulong uVar3;
  int iVar4;
  ulong *in_x8;
  byte *pbVar5;
  ulong uVar6;
  ulong uVar7;
  byte *pbVar8;
  ulong uVar9;
  ulong uVar10;
  void *__src;
  byte *pbVar11;
  byte *pbVar12;
  
  in_x8[1] = 0;
  in_x8[2] = 0;
  *in_x8 = 0;
  if (((byte)*this & 1) == 0) {
    in_x8[2] = *(ulong *)(this + 0x10);
    uVar6 = *(ulong *)this;
    in_x8[1] = *(ulong *)(this + 8);
    *in_x8 = uVar6;
  }
  else {
    uVar6 = *(ulong *)(this + 8);
    if (0xffffffffffffffef < uVar6) goto LAB_00992d04;
    __src = *(void **)(this + 0x10);
    if (uVar6 < 0x17) {
      pbVar11 = (byte *)((long)in_x8 + 1);
      *(byte *)in_x8 = (byte)((int)uVar6 << 1);
      if (uVar6 != 0) goto LAB_00992bcc;
    }
    else {
      uVar10 = uVar6 + 0x10 & 0xfffffffffffffff0;
      pbVar11 = operator_new(uVar10);
      in_x8[1] = uVar6;
      in_x8[2] = (ulong)pbVar11;
      *in_x8 = uVar10 | 1;
LAB_00992bcc:
      memcpy(pbVar11,__src,uVar6);
    }
    pbVar11[uVar6] = 0;
  }
  bVar2 = (byte)*in_x8;
  uVar10 = (ulong)bVar2;
  uVar6 = in_x8[1];
  pbVar11 = (byte *)in_x8[2];
  if ((bVar2 & 1) == 0) {
    pbVar11 = (byte *)((long)in_x8 + 1);
    uVar6 = (ulong)(bVar2 >> 1);
  }
  pbVar12 = pbVar11 + uVar6;
  if (uVar6 == 0) {
LAB_00992c30:
    if (pbVar11 != pbVar12) {
      pbVar8 = pbVar11 + 1;
      pbVar5 = pbVar11;
      if (pbVar8 != pbVar12) {
        do {
          bVar2 = *pbVar8;
          iVar4 = isspace((uint)bVar2);
          pbVar11 = pbVar5;
          if (iVar4 == 0) {
            pbVar11 = pbVar5 + 1;
            *pbVar5 = bVar2;
          }
          pbVar8 = pbVar8 + 1;
          pbVar5 = pbVar11;
        } while (pbVar12 != pbVar8);
        uVar10 = (ulong)(byte)*in_x8;
      }
    }
    pbVar12 = pbVar11;
    if ((uVar10 & 1) != 0) goto LAB_00992c84;
LAB_00992c70:
    pbVar5 = (byte *)((long)in_x8 + 1);
    uVar6 = uVar10 >> 1;
    pbVar8 = (byte *)((long)in_x8 + uVar6 + 1);
  }
  else {
    do {
      iVar4 = isspace((uint)*pbVar11);
      if (iVar4 != 0) goto LAB_00992c30;
      uVar6 = uVar6 - 1;
      pbVar11 = pbVar11 + 1;
    } while (uVar6 != 0);
    pbVar11 = pbVar12;
    if ((bVar2 & 1) == 0) goto LAB_00992c70;
LAB_00992c84:
    uVar6 = in_x8[1];
    pbVar5 = (byte *)in_x8[2];
    pbVar8 = pbVar5 + uVar6;
    pbVar11 = pbVar12;
  }
  uVar7 = (long)pbVar11 - (long)pbVar5;
  uVar3 = uVar6 - uVar7;
  if (uVar7 <= uVar6) {
    uVar9 = (long)pbVar8 - (long)pbVar11;
    if (uVar9 != 0) {
      pbVar11 = (byte *)((long)in_x8 + 1);
      if ((uVar10 & 1) != 0) {
        pbVar11 = (byte *)in_x8[2];
      }
      uVar1 = uVar3;
      if (uVar9 <= uVar3) {
        uVar1 = uVar9;
      }
      if (uVar3 - uVar1 != 0) {
        memmove(pbVar11 + uVar7,pbVar11 + uVar7 + uVar1,uVar3 - uVar1);
        uVar10 = (ulong)(byte)*in_x8;
      }
      uVar6 = uVar6 - uVar1;
      if ((uVar10 & 1) == 0) {
        *(byte *)in_x8 = (byte)((int)uVar6 << 1);
      }
      else {
        in_x8[1] = uVar6;
      }
      pbVar11[uVar6] = 0;
    }
    return;
  }
                    /* try { // try from 00992cfc to 00992d03 has its CatchHandler @ 00992d0c */
  std::__ndk1::__basic_string_common<true>::__throw_out_of_range();
LAB_00992d04:
                    /* WARNING: Subroutine does not return */
  std::__ndk1::__basic_string_common<true>::__throw_length_error();
}

