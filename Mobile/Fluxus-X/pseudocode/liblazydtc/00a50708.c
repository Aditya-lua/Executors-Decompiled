/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a50708
 */

int ENGINE_cmd_is_executable(ENGINE *e,int cmd)

{
  uint uVar1;
  
  uVar1 = ENGINE_ctrl(e,0x12,(long)cmd,(void *)0x0,(f *)0x0);
  if ((int)uVar1 < 0) {
    ERR_new();
    ERR_set_debug("crypto/engine/eng_ctrl.c",0xba,"ENGINE_cmd_is_executable");
    ERR_set_error(0x26,0x8a,0);
    return 0;
  }
  return (int)((uVar1 & 7) != 0);
}

