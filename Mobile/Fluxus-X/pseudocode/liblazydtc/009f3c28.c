/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f3c28
 */

ulong ASN1_tag2bit(int tag)

{
  ulong uVar1;
  
  uVar1 = 0;
  if ((uint)tag < 0x1f) {
    uVar1 = *(ulong *)(&DAT_0074e0c0 + (long)tag * 8);
  }
  return uVar1;
}

