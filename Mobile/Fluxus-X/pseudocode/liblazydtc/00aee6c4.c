/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aee6c4
 */

undefined8 UI_dup_user_data(long *param_1)

{
  long lVar1;
  undefined8 uVar2;
  uint uVar3;
  code *pcVar4;
  
  pcVar4 = *(code **)(*param_1 + 0x30);
  if ((pcVar4 == (code *)0x0) || (*(long *)(*param_1 + 0x38) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/ui/ui_lib.c",0x19a,"UI_dup_user_data");
    uVar2 = 0x70;
  }
  else {
    lVar1 = (*pcVar4)();
    if (lVar1 != 0) {
      uVar3 = *(uint *)(param_1 + 5);
      if ((uVar3 >> 1 & 1) != 0) {
        (**(code **)(*param_1 + 0x38))(param_1,param_1[2]);
        uVar3 = *(uint *)(param_1 + 5);
      }
      param_1[2] = lVar1;
      *(uint *)(param_1 + 5) = uVar3 | 2;
      return 0;
    }
    ERR_new();
    ERR_set_debug("crypto/ui/ui_lib.c",0x1a0,"UI_dup_user_data");
    uVar2 = 0xc0100;
  }
  ERR_set_error(0x28,uVar2,0);
  return 0xffffffff;
}

