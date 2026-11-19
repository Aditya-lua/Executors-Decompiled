/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcc0e0
 */

/* std::__ndk1::future_error::~future_error() */

void __thiscall std::__ndk1::future_error::~future_error(future_error *this)

{
  domain_error::~domain_error((domain_error *)this);
  return;
}

