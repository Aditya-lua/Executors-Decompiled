/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fac1c
 */

undefined8 BIO_ADDR_make(undefined8 *param_1,short *param_2)

{
  short sVar1;
  undefined8 uVar2;
  
  sVar1 = *param_2;
  if (sVar1 == 1) {
    memcpy(param_1,param_2,0x6e);
    return 1;
  }
  if (sVar1 == 10) {
    uVar2 = *(undefined8 *)(param_2 + 6);
    *(undefined8 *)((long)param_1 + 0x14) = *(undefined8 *)(param_2 + 10);
    *(undefined8 *)((long)param_1 + 0xc) = uVar2;
  }
  else if (sVar1 != 2) {
    return 0;
  }
  uVar2 = *(undefined8 *)param_2;
  param_1[1] = *(undefined8 *)(param_2 + 4);
  *param_1 = uVar2;
  return 1;
}

