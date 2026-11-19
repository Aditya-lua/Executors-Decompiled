/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0d150
 */

/* std::__ndk1::regex_error::regex_error(std::__ndk1::regex_constants::error_type) */

void __thiscall std::__ndk1::regex_error::regex_error(regex_error *this,int param_2)

{
  char *pcVar1;
  
  if (param_2 - 1U < 0x11) {
    pcVar1 = &DAT_0078bf38 + *(int *)(&DAT_0078bf38 + (ulong)(param_2 - 1U) * 4);
  }
  else {
    pcVar1 = "Unknown error type";
  }
  runtime_error::runtime_error((runtime_error *)this,pcVar1);
  *(undefined ***)this = &PTR__regex_error_00cafc30;
  *(int *)(this + 0x10) = param_2;
  return;
}

