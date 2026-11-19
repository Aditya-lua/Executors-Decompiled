/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00baf43c
 */

undefined8 mbedtls_sha3_self_test(ulong param_1)

{
  int iVar1;
  ulong uVar2;
  
  uVar2 = param_1 & 0xffffffff;
  iVar1 = FUN_00baf5c8(param_1,"SHA3-224",1,0);
  if (iVar1 != 0) {
    return 1;
  }
  iVar1 = FUN_00baf5c8(uVar2,"SHA3-256",2,0);
  if (((iVar1 == 0) && (iVar1 = FUN_00baf5c8(uVar2,"SHA3-384",3,0), iVar1 == 0)) &&
     (iVar1 = FUN_00baf5c8(uVar2,"SHA3-512",4,0), iVar1 == 0)) {
    iVar1 = FUN_00baf5c8(uVar2,"SHA3-224",1,1);
    if (iVar1 != 0) {
      return 1;
    }
    iVar1 = FUN_00baf5c8(uVar2,"SHA3-256",2,1);
    if (iVar1 != 0) {
      return 1;
    }
    iVar1 = FUN_00baf5c8(uVar2,"SHA3-384",3,1);
    if (iVar1 != 0) {
      return 1;
    }
    iVar1 = FUN_00baf5c8(uVar2,"SHA3-512",4,1);
    if (iVar1 != 0) {
      return 1;
    }
    iVar1 = FUN_00baf7f0(uVar2,"SHA3-224",1);
    if (iVar1 != 0) {
      return 1;
    }
    iVar1 = FUN_00baf7f0(uVar2,"SHA3-256",2);
    if (((iVar1 == 0) && (iVar1 = FUN_00baf7f0(uVar2,"SHA3-384",3), iVar1 == 0)) &&
       (iVar1 = FUN_00baf7f0(uVar2,"SHA3-512",4), iVar1 == 0)) {
      if ((int)param_1 != 0) {
        putchar(10);
      }
      return 0;
    }
  }
  return 1;
}

