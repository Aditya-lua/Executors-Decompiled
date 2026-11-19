/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fd1f8
 */

void BIO_copy_next_retry(BIO *b)

{
  *(uint *)&b->ptr = *(uint *)&b->ptr | *(uint *)(*(long *)&b->references + 0x30) & 0xf;
  *(undefined4 *)((long)&b->ptr + 4) = *(undefined4 *)(*(long *)&b->references + 0x34);
  return;
}

