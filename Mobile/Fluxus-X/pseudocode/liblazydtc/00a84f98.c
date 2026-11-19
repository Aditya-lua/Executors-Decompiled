/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a84f98
 */

uint OSSL_CMP_print_to_bio(BIO *param_1)

{
  uint uVar1;
  char *param2;
  uint in_w4;
  char *in_x5;
  
  if (in_w4 < 7) {
    param2 = (&PTR_s_EMERG_00c61440)[(int)in_w4];
  }
  else {
    param2 = "DEBUG";
    if (in_w4 != 7) {
      param2 = "(unknown level)";
    }
  }
  uVar1 = BIO_printf(param_1,"CMP %s: %s\n",param2,in_x5);
  return uVar1 >> 0x1f ^ 1;
}

