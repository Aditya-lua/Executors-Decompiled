/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5174c
 */

ENGINE_CMD_DEFN * ENGINE_get_cmd_defns(ENGINE *e)

{
  return *(ENGINE_CMD_DEFN **)(e + 0x90);
}

