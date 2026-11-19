/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcd844
 */

/* std::__ndk1::random_device::~random_device() */

int __thiscall std::__ndk1::random_device::~random_device(random_device *this)

{
  int iVar1;
  
                    /* try { // try from 00bcd854 to 00bcd857 has its CatchHandler @ 00bcd864 */
  iVar1 = close(*(int *)this);
  return iVar1;
}

