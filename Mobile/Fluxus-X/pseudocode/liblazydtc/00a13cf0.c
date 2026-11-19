/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a13cf0
 */

undefined8 SCT_set_log_entry_type(long param_1,uint param_2)

{
  *(undefined4 *)(param_1 + 0x60) = 0;
  if (param_2 < 2) {
    *(uint *)(param_1 + 0x58) = param_2;
    return 1;
  }
  ERR_new();
  ERR_set_debug("crypto/ct/ct_sct.c",0x4c,"SCT_set_log_entry_type");
  ERR_set_error(0x32,0x66,0);
  return 0;
}

