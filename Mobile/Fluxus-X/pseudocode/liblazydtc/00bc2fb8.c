/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc2fb8
 */

/* std::__ndk1::__shared_count::~__shared_count() */

void __thiscall std::__ndk1::__shared_count::~__shared_count(__shared_count *this)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0xbc2fc0);
  (*pcVar1)();
}

