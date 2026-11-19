/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b923b4
 */

undefined8 mbedtls_ecp_mul_restartable(void)

{
  undefined8 uVar1;
  long in_x4;
  
  if (in_x4 == 0) {
    return 0xffffb080;
  }
  uVar1 = FUN_00b923c4();
  return uVar1;
}

