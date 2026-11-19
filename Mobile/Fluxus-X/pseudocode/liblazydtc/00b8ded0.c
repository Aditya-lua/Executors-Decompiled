/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8ded0
 */

undefined8 psa_key_derivation_setup(uint *param_1,uint param_2)

{
  uint uVar1;
  uint uVar2;
  undefined8 uVar3;
  
  if (*param_1 != 0) {
    return 0xffffff77;
  }
  uVar1 = param_2;
  if ((param_2 & 0x7f000000) == 0x8000000) {
LAB_00b8df64:
    uVar3 = FUN_00b8df88(param_1,uVar1);
    if ((int)uVar3 == 0) {
      *param_1 = param_2;
    }
  }
  else {
    if (((param_2 & 0x7f000000) == 0x9000000) &&
       (uVar1 = param_2 & 0xfe00ffff | 0x8000000, uVar1 != 0x8000000)) {
      uVar2 = param_2 & 0xffff0000 | 0x9000000;
      if ((uVar2 != 0x9020000) && (uVar2 != 0x9010000)) {
        return 0xffffff7a;
      }
      if (uVar1 != 0x8000609) goto LAB_00b8df64;
    }
    uVar3 = 0xffffff79;
  }
  return uVar3;
}

