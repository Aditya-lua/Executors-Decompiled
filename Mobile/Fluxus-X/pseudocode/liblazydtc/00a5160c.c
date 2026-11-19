/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5160c
 */

int ENGINE_set_id(ENGINE *e,char *id)

{
  if (id == (char *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/engine/eng_lib.c",0xcc,"ENGINE_set_id");
    ERR_set_error(0x26,0xc0102,0);
    return 0;
  }
  *(char **)e = id;
  return 1;
}

