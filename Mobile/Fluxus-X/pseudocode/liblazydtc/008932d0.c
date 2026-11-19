/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008932d0
 */

undefined8 FUN_008932d0(undefined8 *param_1,ulong param_2)

{
  undefined8 uVar1;
  ulong uVar2;
  ulong *puVar3;
  
  if (param_1[0x2e] != 0) {
    uVar2 = ((ulong)(uint)((int)param_2 << 3) + 8 ^ param_2 >> 0x20) * -0x622015f714c7d297;
    uVar2 = (param_2 >> 0x20 ^ uVar2 >> 0x2f ^ uVar2) * -0x622015f714c7d297;
    uVar2 = (uVar2 ^ uVar2 >> 0x2f) * -0x6b622cb0470b6a63 >>
            ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
    if ((*(ulong *)(param_1[0x2c] + (uVar2 >> 6) * 8) >> (uVar2 & 0x3f) & 1) != 0) {
      do {
        puVar3 = (ulong *)(param_1[0x29] + uVar2 * 0x30);
        if (*puVar3 == param_2) {
          if ((int)puVar3[1] != 3) {
            return 0xffffffff;
          }
          uVar1 = FUN_00874f18(puVar3[2],*param_1);
          if ((int)uVar1 < 0) {
                    /* WARNING: Subroutine does not return */
            FUN_0087fcd8(param_2 + 0xc,"Exceeded constant limit; simplify the code to compile");
          }
          return uVar1;
        }
        uVar2 = uVar2 + 1 & param_1[0x2d] - 1;
      } while ((*(ulong *)(param_1[0x2c] + (uVar2 >> 6) * 8) >> (uVar2 & 0x3f) & 1) != 0);
    }
  }
  return 0xffffffff;
}

