/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a51704
 */

int ENGINE_set_cmd_defns(ENGINE *e,ENGINE_CMD_DEFN *defns)

{
  *(ENGINE_CMD_DEFN **)(e + 0x90) = defns;
  return 1;
}

