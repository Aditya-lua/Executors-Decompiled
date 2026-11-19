/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a85464
 */

int engine_load_dynamic_int(void)

{
  int iVar1;
  ENGINE *e;
  
  e = ENGINE_new();
  if (e == (ENGINE *)0x0) {
    return 0;
  }
  iVar1 = ENGINE_set_id(e,"dynamic");
  if ((((iVar1 == 0) || (iVar1 = ENGINE_set_name(e,"Dynamic engine loading support"), iVar1 == 0))
      || (iVar1 = ENGINE_set_init_function(e,(ENGINE_GEN_INT_FUNC_PTR)&LAB_00a8553c), iVar1 == 0))
     || (((iVar1 = ENGINE_set_finish_function(e,(ENGINE_GEN_INT_FUNC_PTR)&LAB_00a85544), iVar1 == 0
          || (iVar1 = ENGINE_set_ctrl_function(e,FUN_00a8554c), iVar1 == 0)) ||
         ((iVar1 = ENGINE_set_flags(e,4), iVar1 == 0 ||
          (iVar1 = ENGINE_set_cmd_defns(e,(ENGINE_CMD_DEFN *)&DAT_00c61478), iVar1 == 0)))))) {
    iVar1 = ENGINE_free(e);
    return iVar1;
  }
  ERR_set_mark();
  ENGINE_add(e);
  ENGINE_free(e);
  iVar1 = ERR_pop_to_mark();
  return iVar1;
}

