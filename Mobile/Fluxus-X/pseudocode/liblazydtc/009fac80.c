/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fac80
 */

undefined8
BIO_ADDR_rawmake(undefined2 *param_1,int param_2,char *param_3,long param_4,undefined2 param_5)

{
  undefined8 uVar1;
  
  if (param_2 == 10) {
    if (param_4 != 0x10) {
      return 0;
    }
    *(undefined8 *)(param_1 + 6) = 0;
    *(undefined8 *)(param_1 + 2) = 0;
    *(undefined8 *)(param_1 + 10) = 0;
    param_1[1] = param_5;
    *param_1 = 10;
    uVar1 = *(undefined8 *)param_3;
    *(undefined8 *)(param_1 + 8) = *(undefined8 *)(param_3 + 8);
    *(undefined8 *)(param_1 + 4) = uVar1;
  }
  else {
    if (param_2 != 2) {
      if (param_2 != 1) {
        return 0;
      }
      if (param_4 + 1U < 0x6d) {
        memset(param_1,0,0x6e);
        *param_1 = 1;
        strncpy((char *)(param_1 + 1),param_3,0x6b);
        return 1;
      }
      return 0;
    }
    if (param_4 != 4) {
      return 0;
    }
    *(undefined4 *)(param_1 + 6) = 0;
    *(undefined8 *)(param_1 + 2) = 0;
    param_1[1] = param_5;
    *param_1 = 2;
    *(undefined4 *)(param_1 + 2) = *(undefined4 *)param_3;
  }
  return 1;
}

