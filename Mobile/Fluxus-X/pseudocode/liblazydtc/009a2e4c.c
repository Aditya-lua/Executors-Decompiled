/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a2e4c
 */

/* ix::WebSocketPerMessageDeflateDecompressor::decompress(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&)
    */

undefined8 __thiscall
ix::WebSocketPerMessageDeflateDecompressor::decompress
          (WebSocketPerMessageDeflateDecompressor *this,basic_string_conflict *param_1,
          basic_string_conflict *param_2)

{
  WebSocketPerMessageDeflateDecompressor *pWVar1;
  long lVar2;
  char *pcVar3;
  uint uVar4;
  int iVar5;
  undefined8 uVar6;
  ulong uVar7;
  void *pvVar8;
  void *__dest;
  ulong uVar9;
  ulong local_80;
  ulong uStack_78;
  void *local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  uStack_78 = 0;
  local_70 = (void *)0x0;
  local_80 = 0;
  if (((byte)*param_1 & 1) == 0) {
    local_70 = *(void **)(param_1 + 0x10);
    uStack_78 = *(ulong *)(param_1 + 8);
    local_80 = *(ulong *)param_1;
    goto LAB_009a2f08;
  }
  uVar7 = *(ulong *)(param_1 + 8);
  if (0xffffffffffffffef < uVar7) {
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  pvVar8 = *(void **)(param_1 + 0x10);
  if (uVar7 < 0x17) {
    __dest = (void *)((ulong)&local_80 | 1);
    local_80 = (ulong)(byte)((int)uVar7 << 1);
    if (uVar7 != 0) goto LAB_009a2ef4;
  }
  else {
    uVar9 = uVar7 + 0x10 & 0xfffffffffffffff0;
    __dest = operator_new(uVar9);
    local_80 = uVar9 | 1;
    uStack_78 = uVar7;
    local_70 = __dest;
LAB_009a2ef4:
    memcpy(__dest,pvVar8,uVar7);
  }
  *(undefined1 *)((long)__dest + uVar7) = 0;
LAB_009a2f08:
  if ((DAT_00d21850 & 1) == 0) {
    uVar7 = (ulong)(DAT_00d21850 >> 1);
    pcVar3 = &DAT_00d21851;
  }
  else {
    uVar7 = DAT_00d21858;
    pcVar3 = DAT_00d21860;
  }
                    /* try { // try from 009a2f28 to 009a2f33 has its CatchHandler @ 009a3048 */
  std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)&local_80
         ,pcVar3,uVar7);
  pvVar8 = (void *)((ulong)&local_80 | 1);
  uVar4 = (uint)((byte)local_80._0_1_ >> 1);
  if ((local_80 & 1) != 0) {
    pvVar8 = local_70;
    uVar4 = (uint)uStack_78;
  }
  *(uint *)(this + 0x4010) = uVar4;
  *(void **)(this + 0x4008) = pvVar8;
  if (((byte)*param_2 & 1) == 0) {
    *(undefined2 *)param_2 = 0;
  }
  else {
    **(undefined1 **)(param_2 + 0x10) = 0;
    *(undefined8 *)(param_2 + 8) = 0;
  }
  pWVar1 = this + 0x4028;
  while( true ) {
    *(uint *)pWVar1 = 0x4000;
    *(WebSocketPerMessageDeflateDecompressor **)(this + 0x4020) = this + 4;
                    /* try { // try from 009a2fa4 to 009a2fdb has its CatchHandler @ 009a304c */
    iVar5 = inflate(this + 0x4008,2);
    if ((iVar5 + 4U < 7) && ((1 << (ulong)(iVar5 + 4U & 0x1f) & 0x43U) != 0)) break;
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_2
           ,(char *)(this + 4),0x4000 - (ulong)*(uint *)pWVar1);
    if (*(uint *)pWVar1 != 0) {
      uVar6 = 1;
joined_r0x009a2ffc:
      if ((local_80 & 1) != 0) {
        operator_delete(local_70);
      }
      if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail();
      }
      return uVar6;
    }
  }
  uVar6 = 0;
  goto joined_r0x009a2ffc;
}

