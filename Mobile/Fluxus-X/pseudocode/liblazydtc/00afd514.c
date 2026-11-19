/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afd514
 */

char * SCT_validation_status_string(void)

{
  uint uVar1;
  
  uVar1 = SCT_get_validation_status();
  if (uVar1 < 6) {
    return (&PTR_s_not_set_00c7fd40)[(int)uVar1];
  }
  return "unknown status";
}

