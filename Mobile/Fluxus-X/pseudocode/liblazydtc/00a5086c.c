/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5086c
 */

int ENGINE_ctrl_cmd_string(ENGINE *e,char *cmd_name,char *arg,int cmd_optional)

{
  int iVar1;
  uint uVar2;
  long i;
  undefined8 uVar3;
  char *local_38;
  
  if ((e == (ENGINE *)0x0) || (cmd_name == (char *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/engine/eng_ctrl.c",0xf0,"ENGINE_ctrl_cmd_string");
    uVar3 = 0xc0102;
    goto LAB_00a50958;
  }
  if ((*(long *)(e + 0x70) == 0) || (iVar1 = ENGINE_ctrl(e,0xd,0,cmd_name,(f *)0x0), iVar1 < 1)) {
    if (cmd_optional != 0) {
      ERR_clear_error();
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/engine/eng_ctrl.c",0x102,"ENGINE_ctrl_cmd_string");
    uVar3 = 0x89;
    goto LAB_00a50958;
  }
  uVar2 = ENGINE_ctrl(e,0x12,(long)iVar1,(void *)0x0,(f *)0x0);
  if ((int)uVar2 < 0) {
    ERR_new();
    ERR_set_debug("crypto/engine/eng_ctrl.c",0xba,"ENGINE_cmd_is_executable");
    ERR_set_error(0x26,0x8a,0);
  }
  else if ((uVar2 & 7) != 0) {
    uVar2 = ENGINE_ctrl(e,0x12,(long)iVar1,(void *)0x0,(f *)0x0);
    if (-1 < (int)uVar2) {
      if ((uVar2 >> 2 & 1) == 0) {
        if (arg == (char *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/engine/eng_ctrl.c",0x127,"ENGINE_ctrl_cmd_string");
          uVar3 = 0x87;
          goto LAB_00a50958;
        }
        if ((uVar2 >> 1 & 1) != 0) {
          i = 0;
          goto LAB_00a50aa4;
        }
        if ((uVar2 & 1) == 0) {
          ERR_new();
          uVar3 = 0x138;
          goto LAB_00a50a1c;
        }
        i = strtol(arg,&local_38,10);
        if ((local_38 == arg) || (*local_38 != '\0')) {
          ERR_new();
          ERR_set_debug("crypto/engine/eng_ctrl.c",0x13d,"ENGINE_ctrl_cmd_string");
          uVar3 = 0x85;
          goto LAB_00a50958;
        }
      }
      else {
        if (arg != (char *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/engine/eng_ctrl.c",0x118,"ENGINE_ctrl_cmd_string");
          uVar3 = 0x88;
          goto LAB_00a50958;
        }
        i = 0;
      }
      arg = (char *)0x0;
LAB_00a50aa4:
      iVar1 = ENGINE_ctrl(e,iVar1,i,arg,(f *)0x0);
      return (uint)(0 < iVar1);
    }
    ERR_new();
    uVar3 = 0x110;
LAB_00a50a1c:
    ERR_set_debug("crypto/engine/eng_ctrl.c",uVar3,"ENGINE_ctrl_cmd_string");
    uVar3 = 0x6e;
    goto LAB_00a50958;
  }
  ERR_new();
  ERR_set_debug("crypto/engine/eng_ctrl.c",0x106,"ENGINE_ctrl_cmd_string");
  uVar3 = 0x86;
LAB_00a50958:
  ERR_set_error(0x26,uVar3,0);
  return 0;
}

