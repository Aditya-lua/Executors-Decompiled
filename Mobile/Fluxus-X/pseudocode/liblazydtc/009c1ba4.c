/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c1ba4
 */

ulong tls1_check_ec_tmp_key(long param_1,long param_2)

{
  short sVar1;
  ulong uVar2;
  
  if ((*(byte *)(*(long *)(param_1 + 0x898) + 0x1e) & 3) == 0) {
    sVar1 = tls1_shared_group(param_1,0);
    uVar2 = (ulong)(sVar1 != 0);
  }
  else {
    if (param_2 == 0x300c02c) {
      uVar2 = tls1_check_group_id(param_1,0x18,1);
      return uVar2;
    }
    uVar2 = 0;
    if (param_2 == 0x300c02b) {
      uVar2 = tls1_check_group_id(param_1,0x17,1);
      return uVar2;
    }
  }
  return uVar2;
}

