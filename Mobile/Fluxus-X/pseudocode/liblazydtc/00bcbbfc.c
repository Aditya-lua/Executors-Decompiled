/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcbbfc
 */

/* std::__ndk1::error_category::~error_category() */

void __thiscall std::__ndk1::error_category::~error_category(error_category *this)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0xbcbc04);
  (*pcVar1)();
}

