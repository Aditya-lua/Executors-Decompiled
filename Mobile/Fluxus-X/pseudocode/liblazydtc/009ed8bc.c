/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ed8bc
 */

int ASN1_STRING_to_UTF8(uchar **out,ASN1_STRING *in)

{
  uint uVar1;
  int iVar2;
  ASN1_STRING local_38;
  ASN1_STRING *local_18;
  
  local_18 = &local_38;
  if (((in == (ASN1_STRING *)0x0) || (uVar1 = in->type, 0x1e < uVar1)) ||
     ((0x2a23efffU >> ((long)(int)uVar1 & 0x3fU) & 1) != 0)) {
    iVar2 = -1;
  }
  else {
    local_38.length = 0;
    local_38.data = (uchar *)0x0;
    local_38.flags = 0;
    iVar2 = ASN1_mbstring_copy(&local_18,in->data,in->length,
                               (int)(char)(&DAT_0074dd74)[(int)uVar1] | 0x1000,0x2000);
    if (-1 < iVar2) {
      *out = local_38.data;
      iVar2 = local_38.length;
    }
  }
  return iVar2;
}

