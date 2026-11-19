/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a01044
 */

int BIO_sock_non_fatal_error(int error)

{
  if ((((error - 0x47U < 0x2d) && ((1L << ((ulong)(error - 0x47U) & 0x3f) & 0x181000000001U) != 0))
      || (error == 4)) || (error == 0xb)) {
    return 1;
  }
  return 0;
}

