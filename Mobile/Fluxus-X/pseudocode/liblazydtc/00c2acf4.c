/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2acf4
 */

ulong FUN_00c2acf4(undefined1 param_1 [16],undefined1 param_2 [16])

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  
  uVar6 = param_2._8_8_;
  uVar5 = param_2._0_8_;
  uVar4 = param_1._8_8_;
  uVar3 = param_1._0_8_;
  uVar2 = 1;
  uVar1 = ~(uVar4 & 0x7fffffffffffffff);
  if ((0x8000ffffffffffff < uVar1 || CARRY8(uVar1 + 0x7fff000000000000,(ulong)(uVar3 == 0))) &&
     (uVar1 = ~(uVar6 & 0x7fffffffffffffff),
     0x8000ffffffffffff < uVar1 || CARRY8(uVar1 + 0x7fff000000000000,(ulong)(uVar5 == 0)))) {
    if ((uVar5 == 0 && uVar3 == 0) &&
        ((uVar6 & 0x7fffffffffffffff) == 0 && (uVar4 & 0x7fffffffffffffff) == 0)) {
      return 0;
    }
    if ((long)(uVar6 & uVar4) < 0) {
      if ((long)(uVar6 - (uVar4 + (uVar3 > uVar5))) < 0 !=
          (SCARRY8(uVar6,~uVar4) != SCARRY8(uVar6 + ~uVar4,(ulong)(uVar3 <= uVar5)))) {
        return 0xffffffff;
      }
    }
    else if ((long)(uVar4 - (uVar6 + (uVar5 > uVar3))) < 0 !=
             (SCARRY8(uVar4,~uVar6) != SCARRY8(uVar4 + ~uVar6,(ulong)(uVar5 <= uVar3)))) {
      return 0xffffffff;
    }
    uVar2 = (ulong)(uVar3 != uVar5 || uVar4 != uVar6);
  }
  return uVar2;
}

