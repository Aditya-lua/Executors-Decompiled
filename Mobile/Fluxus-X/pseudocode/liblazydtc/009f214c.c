/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f214c
 */

char * ASN1_tag2str(int tag)

{
  uint uVar1;
  
  uVar1 = tag & 0xfffffeff;
  if ((tag | 8U) != 0x10a) {
    uVar1 = tag;
  }
  if (uVar1 < 0x1f) {
    return (&PTR_DAT_00c58948)[(int)uVar1];
  }
  return "(unknown)";
}

