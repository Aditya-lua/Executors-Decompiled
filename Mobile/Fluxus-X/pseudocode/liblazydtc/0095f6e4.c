/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0095f6e4
 */

undefined8 FUN_0095f6e4(undefined4 param_1)

{
  undefined8 uVar1;
  
  uVar1 = 0x44;
  switch(param_1) {
  case 0:
  case 4:
    return 0x47;
  case 1:
    goto switchD_0095f704_caseD_1;
  case 2:
    return 0x45;
  case 3:
    return 0x46;
  case 5:
    return 0x48;
  case 6:
    return 0x49;
  case 7:
    return 0x4a;
  case 0xffffff9c:
    uVar1 = 0;
switchD_0095f704_caseD_1:
    return uVar1;
  case 0xffffff9d:
    return 0x1c;
  case 0xffffff9e:
    return 7;
  default:
    return 0x2a;
  }
}

