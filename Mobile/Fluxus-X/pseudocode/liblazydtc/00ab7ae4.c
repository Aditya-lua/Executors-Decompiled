/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab7ae4
 */

void EVP_set_pw_prompt(char *prompt)

{
  if (prompt == (char *)0x0) {
    DAT_00d221a0 = 0;
    return;
  }
  strncpy(&DAT_00d221a0,prompt,0x4f);
  DAT_00d221ef = 0;
  return;
}

