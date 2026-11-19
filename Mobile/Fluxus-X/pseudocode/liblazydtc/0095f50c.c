/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0095f50c
 */

undefined8 FUN_0095f50c(undefined8 param_1,char *param_2)

{
  int iVar1;
  undefined8 uVar2;
  undefined1 auVar3 [16];
  
  uVar2 = FUN_0095ef3c();
  if (((int)uVar2 == 0) && (*param_2 == '\0')) {
    iVar1 = FUN_009314dc(param_1);
    if (iVar1 == 0) {
      auVar3 = FUN_00941cb8();
      uVar2 = FUN_00941244(param_1,auVar3._0_8_,auVar3._8_8_);
      return uVar2;
    }
    uVar2 = 0x2a;
  }
  return uVar2;
}

