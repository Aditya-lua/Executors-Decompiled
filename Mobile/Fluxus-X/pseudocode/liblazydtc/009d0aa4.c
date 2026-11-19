/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d0aa4
 */

undefined8
tls_parse_all_extensions
          (long param_1,uint param_2,long param_3,undefined8 param_4,undefined8 param_5,int param_6)

{
  undefined8 uVar1;
  long lVar2;
  undefined4 *puVar3;
  undefined **ppuVar4;
  ulong uVar5;
  
  lVar2 = *(long *)(*(long *)(param_1 + 0x898) + 0x1e0);
  if (lVar2 != -0x1a) {
    uVar5 = 0;
    do {
      uVar1 = tls_parse_extension(param_1,uVar5 & 0xffffffff,param_2,param_3,param_4,param_5);
      if ((int)uVar1 == 0) {
        return uVar1;
      }
      uVar5 = uVar5 + 1;
    } while (uVar5 < lVar2 + 0x1aU);
  }
  if (param_6 != 0) {
    uVar5 = 0;
    puVar3 = (undefined4 *)(param_3 + 0x10);
    ppuVar4 = &PTR_FUN_00c58218;
    do {
      if ((((code *)*ppuVar4 != (code *)0x0) && ((*(uint *)((long)ppuVar4 + -0x2c) & param_2) != 0))
         && (uVar1 = (*(code *)*ppuVar4)(param_1,param_2,*puVar3), (int)uVar1 == 0)) {
        return uVar1;
      }
      uVar5 = uVar5 + 1;
      ppuVar4 = ppuVar4 + 7;
      puVar3 = puVar3 + 10;
    } while (uVar5 < 0x1a);
  }
  return 1;
}

