/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0096a60c
 */

undefined8 FUN_0096a60c(long param_1,int param_2,undefined4 param_3)

{
  undefined8 uVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  
  if (*(long *)(param_1 + 0x20) != 0) {
    for (puVar3 = *(undefined8 **)(*(long *)(param_1 + 0x20) + (long)param_2 * 8 + 0x248);
        puVar3 != (undefined8 *)0x0; puVar3 = (undefined8 *)puVar3[1]) {
      if (((undefined **)*puVar3 == &PTR_DAT_00cc4d20) ||
         ((undefined **)*puVar3 == &PTR_s_SSL_PROXY_00cc4d98)) {
        lVar2 = puVar3[2];
        uVar4 = *(undefined8 *)(lVar2 + 0x38);
        *(long *)(lVar2 + 0x38) = param_1;
        uVar1 = (**(code **)(PTR_DAT_00cc4d08 + 0x78))(lVar2,param_3);
        *(undefined8 *)(puVar3[2] + 0x38) = uVar4;
        return uVar1;
      }
    }
  }
  return 0;
}

