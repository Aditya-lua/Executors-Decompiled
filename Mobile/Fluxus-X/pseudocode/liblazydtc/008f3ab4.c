/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f3ab4
 */

/* std::__ndk1::function<void (cpr::DebugCallback::InfoType, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >,
   long)>::swap(std::__ndk1::function<void (cpr::DebugCallback::InfoType,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >,
   long)>&) */

void __thiscall
std::__ndk1::
function<void(cpr::DebugCallback::InfoType,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,long)>
::swap(function<void(cpr::DebugCallback::InfoType,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,long)>
       *this,function *param_1)

{
  long lVar1;
  function<void(cpr::DebugCallback::InfoType,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,long)>
  *pfVar2;
  function *pfVar3;
  long local_60 [5];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (param_1 != (function *)this) {
    pfVar2 = *(function<void(cpr::DebugCallback::InfoType,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,long)>
               **)(this + 0x20);
    if (pfVar2 == this) {
      if (*(function **)(param_1 + 0x20) == param_1) {
                    /* try { // try from 008f3b7c to 008f3b83 has its CatchHandler @ 008f3c14 */
        (**(code **)(*(long *)pfVar2 + 0x18))(pfVar2,local_60);
        (**(code **)(**(long **)(this + 0x20) + 0x20))();
        *(undefined8 *)(this + 0x20) = 0;
                    /* try { // try from 008f3ba4 to 008f3bab has its CatchHandler @ 008f3c14 */
        (**(code **)(**(long **)(param_1 + 0x20) + 0x18))(*(long **)(param_1 + 0x20),this);
        (**(code **)(**(long **)(param_1 + 0x20) + 0x20))();
        *(undefined8 *)(param_1 + 0x20) = 0;
        *(function<void(cpr::DebugCallback::InfoType,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,long)>
          **)(this + 0x20) = this;
                    /* try { // try from 008f3bcc to 008f3bd7 has its CatchHandler @ 008f3c14 */
        (**(code **)(local_60[0] + 0x18))(local_60,param_1);
        (**(code **)(local_60[0] + 0x20))(local_60);
      }
      else {
                    /* try { // try from 008f3b1c to 008f3b23 has its CatchHandler @ 008f3c18 */
        (**(code **)(*(long *)pfVar2 + 0x18))(pfVar2,param_1);
        (**(code **)(**(long **)(this + 0x20) + 0x20))();
        *(undefined8 *)(this + 0x20) = *(undefined8 *)(param_1 + 0x20);
      }
      *(function **)(param_1 + 0x20) = param_1;
    }
    else {
      pfVar3 = *(function **)(param_1 + 0x20);
      if (param_1 == pfVar3) {
                    /* try { // try from 008f3b48 to 008f3b53 has its CatchHandler @ 008f3c18 */
        (**(code **)(*(long *)pfVar3 + 0x18))(pfVar3,this);
        (**(code **)(**(long **)(param_1 + 0x20) + 0x20))();
        *(undefined8 *)(param_1 + 0x20) = *(undefined8 *)(this + 0x20);
        *(function<void(cpr::DebugCallback::InfoType,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,long)>
          **)(this + 0x20) = this;
      }
      else {
        *(function **)(this + 0x20) = pfVar3;
        *(function<void(cpr::DebugCallback::InfoType,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,long)>
          **)(param_1 + 0x20) = pfVar2;
      }
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

