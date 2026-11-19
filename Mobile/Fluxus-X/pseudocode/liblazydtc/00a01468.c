/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a01468
 */

void BN_set_params(int mul,int high,int low,int mont)

{
  if (-1 < mul) {
    if (0x1e < mul) {
      mul = 0x1f;
    }
    DAT_00d21900 = mul;
  }
  if (-1 < high) {
    if (0x1e < high) {
      high = 0x1f;
    }
    DAT_00d21904 = high;
  }
  if (-1 < low) {
    if (0x1e < low) {
      low = 0x1f;
    }
    DAT_00d21908 = low;
  }
  if (-1 < mont) {
    if (0x1e < mont) {
      mont = 0x1f;
    }
    DAT_00d2190c = mont;
  }
  return;
}

