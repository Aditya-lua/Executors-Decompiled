/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fccb8
 */

int BIO_indent(BIO *b,int indent,int max)

{
  uint uVar1;
  int iVar2;
  uint uVar3;
  
  uVar1 = indent & (indent >> 0x1f ^ 0xffffffffU);
  uVar3 = ~max;
  if ((int)uVar3 < (int)~uVar1) {
    uVar3 = ~uVar1;
  }
  do {
    uVar3 = uVar3 + 1;
    if (uVar3 == 0) {
      return 1;
    }
    iVar2 = BIO_puts(b," ");
  } while (iVar2 == 1);
  return 0;
}

