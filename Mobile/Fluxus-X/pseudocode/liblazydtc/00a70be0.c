/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a70be0
 */

uint * FUN_00a70be0(uint *param_1,uint *param_2,ulong param_3)

{
  uint uVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  uint *puVar5;
  ulong uVar6;
  
  if (param_3 != 0) {
    uVar6 = 0;
    puVar5 = param_2;
    do {
      uVar1 = puVar5[1];
      if ((((uVar1 == 0xffffffff) == (puVar5[2] == 0xffffffff)) &&
          ((puVar5[3] == 0xffffffff || ((param_1[3] & puVar5[3]) != 0)))) &&
         ((uVar1 == 0xffffffff || ((param_1[1] == uVar1 || (param_1[2] == puVar5[2])))))) {
        if (param_1[4] == 0) {
          if (*(long *)(param_1 + 6) == 0) {
            if (*(long *)(param_1 + 10) == 0) {
              return (uint *)0x0;
            }
            if ((*puVar5 == 0) || (*param_1 == *puVar5)) {
              if (*(long *)(puVar5 + 10) == 0) {
                return puVar5;
              }
              iVar2 = OPENSSL_strcasecmp();
              if (iVar2 == 0) {
                return param_2 + uVar6 * 0x10;
              }
            }
          }
          else if ((*puVar5 | 2) == 2) {
            if ((*(long *)(puVar5 + 6) != 0) && (iVar2 = OPENSSL_strcasecmp(), iVar2 == 0)) {
              uVar3 = *(undefined8 *)(param_1 + 6);
              uVar4 = 0;
LAB_00a70d2c:
              *(undefined8 *)(param_1 + 6) = uVar3;
              *(undefined8 *)(param_1 + 8) = uVar4;
              return puVar5;
            }
            if ((*(long *)(puVar5 + 8) != 0) &&
               (iVar2 = OPENSSL_strcasecmp(*(undefined8 *)(param_1 + 8)), iVar2 == 0)) {
              uVar4 = *(undefined8 *)(param_1 + 8);
              uVar3 = 0;
              goto LAB_00a70d2c;
            }
          }
        }
        else if (param_1[4] == puVar5[4]) {
          return param_2 + uVar6 * 0x10;
        }
      }
      uVar6 = uVar6 + 1;
      puVar5 = puVar5 + 0x10;
    } while (uVar6 < param_3);
  }
  return (uint *)0x0;
}

