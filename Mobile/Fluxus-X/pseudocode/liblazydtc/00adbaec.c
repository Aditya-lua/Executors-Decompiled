/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00adbaec
 */

int RSA_X931_hash_id(int nid)

{
  if (nid < 0x2a1) {
    if (nid == 0x40) {
      return 0x33;
    }
    if (nid == 0x2a0) {
      return 0x34;
    }
  }
  else {
    if (nid == 0x2a1) {
      return 0x36;
    }
    if (nid == 0x2a2) {
      return 0x35;
    }
  }
  return -1;
}

