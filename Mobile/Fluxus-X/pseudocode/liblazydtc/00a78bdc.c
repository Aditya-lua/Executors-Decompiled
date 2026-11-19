/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a78bdc
 */

undefined4 ossl_dh_get_named_group_uid_from_size(int param_1)

{
  uint uVar1;
  undefined4 uVar2;
  
  uVar1 = param_1 - 0x800U >> 10 | param_1 << 0x16;
  uVar2 = 0;
  if ((uVar1 < 7) && (uVar2 = 0, (0x57U >> (ulong)(param_1 - 0x800U >> 10 & 0x1f) & 1) != 0)) {
    uVar2 = *(undefined4 *)(&DAT_00766920 + (long)(int)uVar1 * 4);
  }
  return uVar2;
}

