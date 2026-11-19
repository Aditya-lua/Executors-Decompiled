/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fce70
 */

/* WARNING: Removing unreachable block (ram,0x008fcee0) */
/* cpr::Files::Files(std::initializer_list<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > > const&) */

void __thiscall cpr::Files::Files(Files *this,initializer_list *param_1)

{
  ulong *puVar1;
  long lVar2;
  void *__dest;
  basic_string_conflict *pbVar3;
  basic_string_conflict *pbVar4;
  ulong __n;
  void *__src;
  ulong uVar5;
  long lVar6;
  ulong local_80;
  ulong uStack_78;
  void *local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  *(undefined8 *)(this + 8) = 0;
  *(undefined8 *)(this + 0x10) = 0;
  *(undefined8 *)this = 0;
  if (*(long *)(param_1 + 8) != 0) {
    pbVar3 = *(basic_string_conflict **)param_1;
    lVar6 = *(long *)(param_1 + 8) * 0x18 + -0x18;
                    /* try { // try from 008fcf20 to 008fcf6f has its CatchHandler @ 008fd008 */
    while (std::__ndk1::vector<cpr::File,std::__ndk1::allocator<cpr::File>>::
           __emplace_back_slow_path<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&>
                     ((vector<cpr::File,std::__ndk1::allocator<cpr::File>> *)this,pbVar3),
          pbVar4 = pbVar3, lVar6 != 0) {
      while( true ) {
        puVar1 = *(ulong **)(this + 8);
        pbVar3 = pbVar4 + 0x18;
        lVar6 = lVar6 + -0x18;
        if (*(ulong **)(this + 0x10) <= puVar1) break;
        uStack_78 = 0;
        local_70 = (void *)0x0;
        local_80 = 0;
        if (((byte)*pbVar3 & 1) == 0) {
          local_70 = *(void **)(pbVar4 + 0x28);
          uStack_78 = *(ulong *)(pbVar4 + 0x20);
          local_80 = *(ulong *)pbVar3;
        }
        else {
          __n = *(ulong *)(pbVar4 + 0x20);
          if (0xffffffffffffffef < __n) {
                    /* try { // try from 008fcff8 to 008fcfff has its CatchHandler @ 008fd004 */
                    /* WARNING: Subroutine does not return */
            std::__ndk1::__basic_string_common<true>::__throw_length_error();
          }
          __src = *(void **)(pbVar4 + 0x28);
          if (__n < 0x17) {
            local_80 = (ulong)(byte)((int)__n << 1);
            __dest = (void *)((ulong)&local_80 | 1);
            if (__n != 0) goto LAB_008fcf80;
          }
          else {
            uVar5 = __n + 0x10 & 0xfffffffffffffff0;
            __dest = operator_new(uVar5);
            local_80 = uVar5 | 1;
            uStack_78 = __n;
            local_70 = __dest;
LAB_008fcf80:
            memcpy(__dest,__src,__n);
          }
          *(undefined1 *)((long)__dest + __n) = 0;
        }
        puVar1[2] = (ulong)local_70;
        puVar1[1] = uStack_78;
        *puVar1 = local_80;
        puVar1[3] = 0;
        *(undefined1 *)((long)puVar1 + 0x1f) = 0;
        *(undefined2 *)((long)puVar1 + 0x1d) = 0;
        *(undefined4 *)((long)puVar1 + 0x19) = 0;
        puVar1[4] = 0;
        puVar1[5] = 0;
        *(long *)(this + 8) = *(long *)(this + 8) + 0x30;
        pbVar4 = pbVar3;
        if (lVar6 == 0) goto LAB_008fcfc8;
      }
    }
  }
LAB_008fcfc8:
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

