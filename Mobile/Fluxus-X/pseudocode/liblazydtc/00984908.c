/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00984908
 */

/* ix::Socket::connect(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, int, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&, std::__ndk1::function<bool ()>
   const&) */

bool __thiscall
ix::Socket::connect(Socket *this,basic_string_conflict *param_1,int param_2,
                   basic_string_conflict *param_3,function *param_4)

{
  bool bVar1;
  int iVar2;
  ulong uVar3;
  
  std::__ndk1::mutex::lock((mutex *)(this + 0xc));
                    /* try { // try from 0098494c to 0098496b has its CatchHandler @ 009849a4 */
  uVar3 = (**(code **)(**(long **)(this + 0x38) + 0x20))();
  bVar1 = false;
  if ((uVar3 & 1) != 0) {
    iVar2 = SocketConnect::connect(param_1,param_2,param_3,param_4);
    *(int *)(this + 8) = iVar2;
    bVar1 = *(int *)(this + 8) != -1;
  }
  std::__ndk1::mutex::unlock((mutex *)(this + 0xc));
  return bVar1;
}

