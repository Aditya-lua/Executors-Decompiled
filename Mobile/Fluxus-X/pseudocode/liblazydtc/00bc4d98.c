/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc4d98
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&) */

void __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
operator=(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
         basic_string_conflict *param_1)

{
  ulong uVar1;
  basic_string_conflict *pbVar2;
  basic_string_conflict bVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  
  if (this != (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
              param_1) {
    bVar3 = *param_1;
    if (((byte)*this & 1) != 0) {
      uVar1 = *(ulong *)(param_1 + 8);
      pbVar2 = *(basic_string_conflict **)(param_1 + 0x10);
      if (((byte)bVar3 & 1) == 0) {
        pbVar2 = param_1 + 1;
        uVar1 = (ulong)((byte)bVar3 >> 1);
      }
      FUN_007fe004(this,pbVar2,uVar1);
      return;
    }
    if (((byte)bVar3 & 1) != 0) {
      FUN_007fdf5c(this,*(undefined8 *)(param_1 + 0x10),*(undefined8 *)(param_1 + 8));
      return;
    }
    uVar5 = *(undefined8 *)(param_1 + 8);
    uVar4 = *(undefined8 *)param_1;
    *(undefined8 *)(this + 0x10) = *(undefined8 *)(param_1 + 0x10);
    *(undefined8 *)(this + 8) = uVar5;
    *(undefined8 *)this = uVar4;
  }
  return;
}

