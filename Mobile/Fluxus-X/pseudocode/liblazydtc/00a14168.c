/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a14168
 */

undefined4 SCT_get_signature_nid(int *param_1)

{
  undefined4 uVar1;
  undefined4 uVar2;
  
  uVar1 = 0;
  if ((*param_1 == 0) && (uVar1 = 0, (char)param_1[0x10] == '\x04')) {
    uVar2 = 0x29c;
    if (*(char *)((long)param_1 + 0x41) != '\x01') {
      uVar2 = 0;
    }
    uVar1 = 0x31a;
    if (*(char *)((long)param_1 + 0x41) != '\x03') {
      uVar1 = uVar2;
    }
  }
  return uVar1;
}

