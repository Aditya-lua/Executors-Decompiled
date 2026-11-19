/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fcf58
 */

BIO * BIO_pop(BIO *b)

{
  ulong uVar1;
  BIO *pBVar2;
  int *piVar3;
  
  if (b == (BIO *)0x0) {
    pBVar2 = (BIO *)0x0;
  }
  else {
    piVar3 = &b->references;
    pBVar2 = *(BIO **)piVar3;
    BIO_ctrl(b,7,0,b);
    uVar1 = b->num_read;
    if (uVar1 != 0) {
      *(undefined8 *)(uVar1 + 0x48) = *(undefined8 *)piVar3;
    }
    if (*(long *)piVar3 != 0) {
      *(ulong *)(*(long *)piVar3 + 0x50) = uVar1;
    }
    *(undefined8 *)piVar3 = 0;
    b->num_read = 0;
  }
  return pBVar2;
}

