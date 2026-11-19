/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bce0d8
 */

/* std::__ndk1::ios_base::init(void*) */

void __thiscall std::__ndk1::ios_base::init(ios_base *this,void *param_1)

{
  *(void **)(this + 0x28) = param_1;
  *(uint *)(this + 0x20) = (uint)(param_1 == (void *)0x0);
  *(undefined4 *)(this + 0x24) = 0;
  *(undefined8 *)(this + 0x18) = 0;
  *(undefined8 *)(this + 0x10) = 6;
  *(undefined4 *)(this + 8) = 0x1002;
  *(undefined8 *)(this + 0x40) = 0;
  *(undefined8 *)(this + 0x38) = 0;
  *(undefined8 *)(this + 0x50) = 0;
  *(undefined8 *)(this + 0x48) = 0;
  *(undefined8 *)(this + 0x60) = 0;
  *(undefined8 *)(this + 0x58) = 0;
  *(undefined8 *)(this + 0x70) = 0;
  *(undefined8 *)(this + 0x68) = 0;
  *(undefined8 *)(this + 0x80) = 0;
  *(undefined8 *)(this + 0x78) = 0;
  locale::locale((locale *)(this + 0x30));
  return;
}

