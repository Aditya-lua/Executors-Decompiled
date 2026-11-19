/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0c920
 */

uint X509_get_signature_info
               (X509 *param_1,undefined4 *param_2,undefined4 *param_3,undefined4 *param_4,
               undefined4 *param_5)

{
  X509_check_purpose(param_1,-1,-1);
  if (param_2 != (undefined4 *)0x0) {
    *param_2 = *(undefined4 *)(param_1->sha1_hash + 8);
  }
  if (param_3 != (undefined4 *)0x0) {
    *param_3 = *(undefined4 *)(param_1->sha1_hash + 0xc);
  }
  if (param_4 != (undefined4 *)0x0) {
    *param_4 = *(undefined4 *)(param_1->sha1_hash + 0x10);
  }
  if (param_5 != (undefined4 *)0x0) {
    *param_5 = *(undefined4 *)&param_1->field_0xbc;
  }
  return *(uint *)&param_1->field_0xbc & 1;
}

