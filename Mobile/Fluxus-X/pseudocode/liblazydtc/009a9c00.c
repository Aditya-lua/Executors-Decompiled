/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a9c00
 */

int ssl_fill_hello_random(long param_1,int param_2,undefined1 *param_3,ulong param_4,int param_5)

{
  int iVar1;
  time_t tVar2;
  undefined1 *puVar3;
  ulong uVar4;
  undefined8 *puVar5;
  uint uVar6;
  undefined8 uVar7;
  
  if (param_4 < 4) {
    return 0;
  }
  uVar6 = 0x20;
  if (param_2 != 0) {
    uVar6 = 0x40;
  }
  if ((*(uint *)(param_1 + 0x9f0) & uVar6) == 0) {
    puVar5 = *(undefined8 **)(param_1 + 0x9a8);
    puVar3 = param_3;
    uVar4 = param_4;
  }
  else {
    tVar2 = time((time_t *)0x0);
    *param_3 = (char)((ulong)tVar2 >> 0x18);
    param_3[1] = (char)((ulong)tVar2 >> 0x10);
    param_3[2] = (char)((ulong)tVar2 >> 8);
    param_3[3] = (char)tVar2;
    puVar5 = *(undefined8 **)(param_1 + 0x9a8);
    puVar3 = param_3 + 4;
    uVar4 = param_4 - 4;
  }
  iVar1 = RAND_bytes_ex(*puVar5,puVar3,uVar4,0);
  if (0 < iVar1) {
    if (param_4 < 9) {
      return 0;
    }
    if (param_5 == 2) {
      uVar7 = 0x4452474e574f44;
    }
    else {
      if (param_5 != 1) {
        return iVar1;
      }
      uVar7 = 0x14452474e574f44;
    }
    *(undefined8 *)(param_3 + (param_4 - 8)) = uVar7;
  }
  return iVar1;
}

