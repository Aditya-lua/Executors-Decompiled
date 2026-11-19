/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a51660
 */

int ENGINE_set_name(ENGINE *e,char *name)

{
  if (name == (char *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/engine/eng_lib.c",0xd6,"ENGINE_set_name");
    ERR_set_error(0x26,0xc0102,0);
    return 0;
  }
  *(char **)(e + 8) = name;
  return 1;
}

