/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00935664
 */

byte thunk_FUN_00937204(long param_1)

{
  undefined1 *puVar1;
  byte bVar2;
  long lVar3;
  
  lVar3 = FUN_00935644(param_1,&PTR_s_cw_out_00cc4b88);
  bVar2 = 0;
  if (lVar3 != 0) {
    if ((((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
        ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) &&
       (0 < DAT_00cc46b0)) {
      puVar1 = &DAT_002d529d;
      if ((*(byte *)(lVar3 + 0x28) & 1) != 0) {
        puVar1 = &DAT_002ab32c;
      }
      FUN_009050ec(param_1,"cw-out is%spaused",puVar1);
    }
    bVar2 = *(byte *)(lVar3 + 0x28) & 1;
  }
  return bVar2;
}

