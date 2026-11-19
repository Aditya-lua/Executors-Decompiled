/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ce018
 */

bool ssl3_do_uncompress(long param_1,long param_2)

{
  int iVar1;
  uchar *out;
  
  out = *(uchar **)(param_2 + 0x30);
  if (out == (uchar *)0x0) {
    out = CRYPTO_malloc(0x4540,"ssl/record/ssl3_record.c",0x325);
    *(uchar **)(param_2 + 0x30) = out;
    if (out == (uchar *)0x0) {
      return false;
    }
  }
  iVar1 = COMP_expand_block(*(COMP_CTX **)(param_1 + 0x870),out,0x4000,*(uchar **)(param_2 + 0x20),
                            *(int *)(param_2 + 8));
  if (-1 < iVar1) {
    *(long *)(param_2 + 8) = (long)iVar1;
    *(undefined8 *)(param_2 + 0x20) = *(undefined8 *)(param_2 + 0x30);
  }
  return -1 < iVar1;
}

