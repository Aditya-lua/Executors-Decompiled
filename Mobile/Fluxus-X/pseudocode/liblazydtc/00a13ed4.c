/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a13ed4
 */

undefined8 SCT_set_signature_nid(long param_1,int param_2)

{
  undefined2 uVar1;
  
  if (param_2 == 0x31a) {
    uVar1 = 0x304;
  }
  else {
    if (param_2 != 0x29c) {
      ERR_new();
      ERR_set_debug("crypto/ct/ct_sct.c",0x8a,"SCT_set_signature_nid");
      ERR_set_error(0x32,0x65,0);
      return 0;
    }
    uVar1 = 0x104;
  }
  *(undefined4 *)(param_1 + 0x60) = 0;
  *(undefined2 *)(param_1 + 0x40) = uVar1;
  return 1;
}

