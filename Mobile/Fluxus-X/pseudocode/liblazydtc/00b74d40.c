/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b74d40
 */

undefined8 mbedtls_des_setkey_dec(undefined8 *param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  
  mbedtls_des_setkey();
  uVar1 = *param_1;
  uVar2 = param_1[1];
  *param_1 = param_1[0xf];
  param_1[1] = param_1[0xe];
  param_1[0xe] = uVar2;
  param_1[0xf] = uVar1;
  uVar1 = param_1[2];
  uVar2 = param_1[3];
  param_1[2] = param_1[0xd];
  param_1[3] = param_1[0xc];
  param_1[0xc] = uVar2;
  param_1[0xd] = uVar1;
  uVar1 = param_1[4];
  uVar2 = param_1[5];
  param_1[4] = param_1[0xb];
  param_1[5] = param_1[10];
  param_1[10] = uVar2;
  param_1[0xb] = uVar1;
  uVar1 = param_1[6];
  uVar2 = param_1[7];
  param_1[6] = param_1[9];
  param_1[7] = param_1[8];
  param_1[8] = uVar2;
  param_1[9] = uVar1;
  return 0;
}

