/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a2b18
 */

/* WARNING: Removing unreachable block (ram,0x009a2c94) */
/* WARNING: Removing unreachable block (ram,0x009a2c84) */
/* WARNING: Removing unreachable block (ram,0x009a2c8c) */
/* WARNING: Removing unreachable block (ram,0x009a2cbc) */
/* bool ix::WebSocketPerMessageDeflateCompressor::compressData<std::__ndk1::vector<unsigned char,
   std::__ndk1::allocator<unsigned char> >, std::__ndk1::vector<unsigned char,
   std::__ndk1::allocator<unsigned char> > >(std::__ndk1::vector<unsigned char,
   std::__ndk1::allocator<unsigned char> > const&, std::__ndk1::vector<unsigned char,
   std::__ndk1::allocator<unsigned char> >&) */

bool __thiscall
ix::WebSocketPerMessageDeflateCompressor::
compressData<std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>,std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>>
          (WebSocketPerMessageDeflateCompressor *this,vector *param_1,vector *param_2)

{
  WebSocketPerMessageDeflateCompressor *pWVar1;
  char *pcVar2;
  long lVar3;
  undefined1 *puVar4;
  ulong uVar5;
  char *pcVar6;
  undefined1 *puVar7;
  void *__src;
  void *__dest;
  ulong uVar8;
  undefined1 *puVar9;
  
  puVar7 = *(undefined1 **)param_2;
  *(undefined1 **)(param_2 + 8) = puVar7;
  lVar3 = *(long *)param_1;
  if (lVar3 != *(long *)(param_1 + 8)) {
    pWVar1 = this + 0x4028;
    *(int *)(this + 0x4010) = (int)*(long *)(param_1 + 8) - (int)lVar3;
    *(long *)(this + 0x4008) = lVar3;
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
    uVar8 = (ulong)(DAT_00d21850 >> 1);
    if ((DAT_00d21850 & 1) != 0) {
      uVar8 = DAT_00d21858;
    }
    uVar5 = *(long *)(param_2 + 8) - lVar3;
    if (uVar5 < uVar8) {
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
  if (*(undefined1 **)(param_2 + 0x10) == puVar7) {
    puVar4 = operator_new(1);
    puVar9 = puVar4 + 1;
    *puVar4 = 2;
    *(undefined1 **)param_2 = puVar4;
    *(undefined1 **)(param_2 + 8) = puVar9;
    *(undefined1 **)(param_2 + 0x10) = puVar4 + 1;
    if (puVar7 != (undefined1 *)0x0) {
      operator_delete(puVar7);
      puVar9 = *(undefined1 **)(param_2 + 8);
    }
  }
  else {
    *puVar7 = 2;
    puVar9 = (undefined1 *)(*(long *)(param_2 + 8) + 1);
    *(undefined1 **)(param_2 + 8) = puVar9;
  }
  if (puVar9 != *(undefined1 **)(param_2 + 0x10)) {
    *puVar9 = 0;
    *(long *)(param_2 + 8) = *(long *)(param_2 + 8) + 1;
    return true;
  }
  __src = *(void **)param_2;
  uVar5 = (long)*(undefined1 **)(param_2 + 0x10) - (long)__src;
  uVar8 = uVar5 + 1;
  if ((long)uVar8 < 0) {
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__vector_base_common<true>::__throw_length_error();
  }
  if (uVar5 < 0x3fffffffffffffff) {
    if (uVar8 <= uVar5 * 2) {
      uVar8 = uVar5 * 2;
    }
    if (uVar8 == 0) {
      __dest = (void *)0x0;
      goto LAB_009a2d48;
    }
  }
  else {
    uVar8 = 0x7fffffffffffffff;
  }
  __dest = operator_new(uVar8);
LAB_009a2d48:
  *(undefined1 *)((long)__dest + uVar5) = 0;
  if (0 < (long)uVar5) {
    memcpy(__dest,__src,uVar5);
  }
  *(void **)param_2 = __dest;
  *(undefined1 **)(param_2 + 8) = (undefined1 *)((long)__dest + uVar5) + 1;
  *(ulong *)(param_2 + 0x10) = (long)__dest + uVar8;
  if (__src != (void *)0x0) {
    operator_delete(__src);
  }
  return true;
}

