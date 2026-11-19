/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0462c
 */

/* std::__ndk1::__time_get::~__time_get() */

void __thiscall std::__ndk1::__time_get::~__time_get(__time_get *this)

{
                    /* try { // try from 00c0463c to 00c0463f has its CatchHandler @ 00c0464c */
  freelocale(*(__locale_t *)this);
  return;
}

