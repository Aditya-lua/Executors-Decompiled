/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d6170
 */

undefined8 custom_exts_copy_flags(undefined8 *param_1,undefined8 *param_2)

{
  ulong uVar1;
  short *psVar2;
  ulong uVar3;
  ulong uVar4;
  short *psVar5;
  ulong uVar6;
  
  uVar1 = param_2[1];
  if (uVar1 != 0) {
    psVar2 = (short *)*param_2;
    uVar3 = param_1[1];
    uVar4 = 0;
    do {
      if (uVar3 != 0) {
        psVar5 = (short *)*param_1;
        uVar6 = 0;
        do {
          if (*psVar5 == *psVar2) {
            if (*(int *)(psVar2 + 2) == 2) {
              if (psVar5 == (short *)0x0) break;
            }
            else if ((*(int *)(psVar5 + 2) != *(int *)(psVar2 + 2)) && (*(int *)(psVar5 + 2) != 2))
            goto LAB_009d61c0;
            *(undefined4 *)(psVar5 + 6) = *(undefined4 *)(psVar2 + 6);
            break;
          }
LAB_009d61c0:
          uVar6 = uVar6 + 1;
          psVar5 = psVar5 + 0x1c;
        } while (uVar6 < uVar3);
      }
      uVar4 = uVar4 + 1;
      psVar2 = psVar2 + 0x1c;
    } while (uVar4 < uVar1);
  }
  return 1;
}

