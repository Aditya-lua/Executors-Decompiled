/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097b920
 */

/* ix::gzipDecompress(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&) */

void ix::gzipDecompress(basic_string_conflict *param_1,basic_string_conflict *param_2)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  basic_string_conflict *local_40c8;
  uint local_40c0;
  char *local_40b0;
  int local_40a8;
  char acStack_4058 [16384];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  memset(&local_40c8,0,0x70);
  iVar2 = inflateInit2_(&local_40c8,0x1f,"1.3.1",0x70);
  uVar3 = 0;
  if (iVar2 == 0) {
    if (((byte)*param_1 & 1) == 0) {
      local_40c0 = (uint)((byte)*param_1 >> 1);
      local_40c8 = param_1 + 1;
    }
    else {
      local_40c0 = (uint)*(undefined8 *)(param_1 + 8);
      local_40c8 = *(basic_string_conflict **)(param_1 + 0x10);
    }
    do {
      local_40a8 = 0x4000;
      local_40b0 = acStack_4058;
      iVar2 = inflate(&local_40c8,2);
      if ((iVar2 + 4U < 7) && ((1 << (ulong)(iVar2 + 4U & 0x1f) & 0x43U) != 0)) {
        inflateEnd(&local_40c8);
        uVar3 = 0;
        goto LAB_0097ba24;
      }
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             param_2,acStack_4058,(ulong)(0x4000 - local_40a8));
    } while (local_40a8 == 0);
    inflateEnd(&local_40c8);
    uVar3 = 1;
  }
LAB_0097ba24:
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

