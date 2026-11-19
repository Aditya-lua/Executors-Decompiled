/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a2690
 */

/* WARNING: Removing unreachable block (ram,0x009a2824) */
/* WARNING: Removing unreachable block (ram,0x009a2814) */
/* WARNING: Removing unreachable block (ram,0x009a281c) */
/* WARNING: Removing unreachable block (ram,0x009a284c) */
/* bool ix::WebSocketPerMessageDeflateCompressor::compressData<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, std::__ndk1::vector<unsigned
   char, std::__ndk1::allocator<unsigned char> > >(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&,
   std::__ndk1::vector<unsigned char, std::__ndk1::allocator<unsigned char> >&) */

bool __thiscall
ix::WebSocketPerMessageDeflateCompressor::
compressData<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>>
          (WebSocketPerMessageDeflateCompressor *this,basic_string_conflict *param_1,vector *param_2
          )

{
  WebSocketPerMessageDeflateCompressor *pWVar1;
  char *pcVar2;
  long lVar3;
  undefined1 *puVar4;
  ulong uVar5;
  char *pcVar6;
  basic_string_conflict *pbVar7;
  undefined1 *puVar8;
  void *__src;
  void *__dest;
  ulong uVar9;
  undefined1 *puVar10;
  
  puVar8 = *(undefined1 **)param_2;
  *(undefined1 **)(param_2 + 8) = puVar8;
  uVar9 = (ulong)((byte)*param_1 >> 1);
  if (((byte)*param_1 & 1) != 0) {
    uVar9 = *(ulong *)(param_1 + 8);
  }
  if (uVar9 != 0) {
    *(int *)(this + 0x4010) = (int)uVar9;
    pbVar7 = *(basic_string_conflict **)(param_1 + 0x10);
    pWVar1 = this + 0x4028;
    if (((byte)*param_1 & 1) == 0) {
      pbVar7 = param_1 + 1;
    }
    *(basic_string_conflict **)(this + 0x4008) = pbVar7;
    do {
      *(uint *)pWVar1 = 0x4000;
      *(WebSocketPerMessageDeflateCompressor **)(this + 0x4020) = this + 4;
      deflate(this + 0x4008,*(undefined4 *)this);
      std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>::
      insert<unsigned_char*>
                ((vector<unsigned_char,std::__ndk1::allocator<unsigned_char>> *)param_2,
                 *(undefined8 *)(param_2 + 8),this + 4,this + (0x4004 - (ulong)*(uint *)pWVar1));
    } while (*(uint *)pWVar1 == 0);
    lVar3 = *(long *)param_2;
    uVar9 = (ulong)(DAT_00d21850 >> 1);
    if ((DAT_00d21850 & 1) != 0) {
      uVar9 = DAT_00d21858;
    }
    uVar5 = *(long *)(param_2 + 8) - lVar3;
    if (uVar5 < uVar9) {
      return true;
    }
    pcVar2 = DAT_00d21860;
    if ((DAT_00d21850 & 1) == 0) {
      pcVar2 = &DAT_00d21851;
    }
    if (*(char *)(lVar3 + uVar5 + -1) != pcVar2[3]) {
      return true;
    }
    if (*(char *)(lVar3 + uVar5 + -2) != pcVar2[2]) {
      return true;
    }
    if (*(char *)(lVar3 + uVar5 + -3) != pcVar2[1]) {
      return true;
    }
    pcVar6 = (char *)(lVar3 + uVar5 + -4);
    if (*pcVar6 != *pcVar2) {
      return true;
    }
    if (uVar5 < 4) {
      std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>::__append
                ((vector<unsigned_char,std::__ndk1::allocator<unsigned_char>> *)param_2,
                 0xfffffffffffffffc);
      return true;
    }
    *(char **)(param_2 + 8) = pcVar6;
    return true;
  }
  if (*(undefined1 **)(param_2 + 0x10) == puVar8) {
    puVar4 = operator_new(1);
    puVar10 = puVar4 + 1;
    *puVar4 = 2;
    *(undefined1 **)param_2 = puVar4;
    *(undefined1 **)(param_2 + 8) = puVar10;
    *(undefined1 **)(param_2 + 0x10) = puVar4 + 1;
    if (puVar8 != (undefined1 *)0x0) {
      operator_delete(puVar8);
      puVar10 = *(undefined1 **)(param_2 + 8);
    }
  }
  else {
    *puVar8 = 2;
    puVar10 = (undefined1 *)(*(long *)(param_2 + 8) + 1);
    *(undefined1 **)(param_2 + 8) = puVar10;
  }
  if (puVar10 != *(undefined1 **)(param_2 + 0x10)) {
    *puVar10 = 0;
    *(long *)(param_2 + 8) = *(long *)(param_2 + 8) + 1;
    return true;
  }
  __src = *(void **)param_2;
  uVar5 = (long)*(undefined1 **)(param_2 + 0x10) - (long)__src;
  uVar9 = uVar5 + 1;
  if ((long)uVar9 < 0) {
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__vector_base_common<true>::__throw_length_error();
  }
  if (uVar5 < 0x3fffffffffffffff) {
    if (uVar9 <= uVar5 * 2) {
      uVar9 = uVar5 * 2;
    }
    if (uVar9 == 0) {
      __dest = (void *)0x0;
      goto LAB_009a28d8;
    }
  }
  else {
    uVar9 = 0x7fffffffffffffff;
  }
  __dest = operator_new(uVar9);
LAB_009a28d8:
  *(undefined1 *)((long)__dest + uVar5) = 0;
  if (0 < (long)uVar5) {
    memcpy(__dest,__src,uVar5);
  }
  *(void **)param_2 = __dest;
  *(undefined1 **)(param_2 + 8) = (undefined1 *)((long)__dest + uVar5) + 1;
  *(ulong *)(param_2 + 0x10) = (long)__dest + uVar9;
  if (__src != (void *)0x0) {
    operator_delete(__src);
  }
  return true;
}

