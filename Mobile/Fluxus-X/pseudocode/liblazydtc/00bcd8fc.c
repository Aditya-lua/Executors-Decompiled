/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcd8fc
 */

/* std::__ndk1::random_device::entropy() const */

undefined1  [16] __thiscall std::__ndk1::random_device::entropy(random_device *this)

{
  int iVar1;
  double dVar2;
  undefined1 auVar3 [16];
  uint local_14;
  
                    /* try { // try from 00bcd910 to 00bcd91f has its CatchHandler @ 00bcd950 */
  iVar1 = ioctl(*(int *)this,0x80045200,&local_14);
  dVar2 = 0.0;
  if ((-1 < iVar1) && (-1 < (int)local_14)) {
    if (0x1f < local_14) {
      local_14 = 0x20;
    }
    dVar2 = (double)local_14;
  }
  auVar3._8_8_ = 0;
  auVar3._0_8_ = dVar2;
  return auVar3;
}

