/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bed090
 */

/* std::__ndk1::moneypunct_byname<wchar_t, false>::do_negative_sign() const */

void std::__ndk1::moneypunct_byname<wchar_t,false>::do_negative_sign(void)

{
  long in_x0;
  undefined8 *in_x8;
  undefined8 uVar1;
  undefined8 uVar2;
  
  if ((*(byte *)(in_x0 + 0x60) & 1) == 0) {
    uVar2 = *(undefined8 *)(in_x0 + 0x60);
    uVar1 = *(undefined8 *)(in_x0 + 0x70);
    in_x8[1] = *(undefined8 *)(in_x0 + 0x68);
    *in_x8 = uVar2;
    in_x8[2] = uVar1;
    return;
  }
  FUN_00bc5654();
  return;
}

