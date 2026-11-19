/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009abcb4
 */

void FUN_009abcb4(void)

{
  DAT_00cc8490 = CRYPTO_get_ex_new_index
                           (5,0,"SSL for verify callback",(undefined1 *)0x0,(undefined1 *)0x0,
                            (undefined1 *)0x0);
  DAT_00d218b4 = DAT_00cc8490 >> 0x1f ^ 1;
  return;
}

