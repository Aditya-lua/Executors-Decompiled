/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00984a30
 */

/* ix::Socket::send(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&) */

void __thiscall ix::Socket::send(Socket *this,basic_string_conflict *param_1)

{
  ulong uVar1;
  basic_string_conflict *pbVar2;
  
  uVar1 = *(ulong *)(param_1 + 8);
  pbVar2 = *(basic_string_conflict **)(param_1 + 0x10);
  if (((byte)*param_1 & 1) == 0) {
    pbVar2 = param_1 + 1;
    uVar1 = (ulong)((byte)*param_1 >> 1);
  }
                    /* WARNING: Could not recover jumptable at 0x00984a50. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*(long *)this + 0x28))(this,pbVar2,uVar1);
  return;
}

