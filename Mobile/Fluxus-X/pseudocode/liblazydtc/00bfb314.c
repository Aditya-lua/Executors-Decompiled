/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfb314
 */

/* std::__ndk1::locale::name() const */

void std::__ndk1::locale::name(void)

{
  long *in_x0;
  undefined8 *in_x8;
  long lVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  lVar1 = *in_x0;
  if ((*(byte *)(lVar1 + 0x120) & 1) == 0) {
    uVar3 = *(undefined8 *)(lVar1 + 0x128);
    uVar2 = *(undefined8 *)(lVar1 + 0x120);
    in_x8[2] = *(undefined8 *)(lVar1 + 0x130);
    in_x8[1] = uVar3;
    *in_x8 = uVar2;
    return;
  }
  FUN_007ff40c();
  return;
}

