/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b56160
 */

undefined8 SipHash_Final(long *param_1,undefined1 *param_2,ulong param_3)

{
  undefined8 uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  int iVar5;
  ulong uVar6;
  ulong uVar7;
  uint uVar8;
  ulong uVar9;
  
  uVar1 = 0;
  if ((param_3 != 0) && (iVar5 = (int)param_1[6], iVar5 != 0)) {
    uVar1 = 0;
    if (*(uint *)((long)param_1 + 0x2c) == param_3) {
      uVar6 = param_1[1];
      uVar2 = param_1[2];
      uVar9 = param_1[3];
      uVar7 = *param_1 << 0x38;
      switch((int)param_1[5]) {
      case 7:
        uVar7 = uVar7 | (ulong)*(byte *)((long)param_1 + 0x3e) << 0x30;
      case 6:
        uVar7 = uVar7 | (ulong)*(byte *)((long)param_1 + 0x3d) << 0x28;
      case 5:
        uVar7 = uVar7 | (ulong)*(byte *)((long)param_1 + 0x3c) << 0x20;
      case 4:
        uVar7 = uVar7 | (ulong)*(byte *)((long)param_1 + 0x3b) << 0x18;
      case 3:
        uVar7 = uVar7 | (ulong)*(byte *)((long)param_1 + 0x3a) << 0x10;
      case 2:
        uVar7 = uVar7 | (ulong)*(byte *)((long)param_1 + 0x39) << 8;
      case 1:
        uVar7 = uVar7 | *(byte *)(param_1 + 7);
      default:
        uVar3 = uVar7 ^ param_1[4];
        do {
          uVar6 = uVar2 + uVar6;
          uVar2 = uVar6 ^ (uVar2 >> 0x33 | uVar2 << 0xd);
          uVar4 = uVar3 + uVar9 ^ (uVar3 >> 0x30 | uVar3 << 0x10);
          uVar6 = uVar4 + (uVar6 >> 0x20 | uVar6 << 0x20);
          uVar9 = uVar3 + uVar9 + uVar2;
          iVar5 = iVar5 + -1;
          uVar3 = uVar6 ^ (uVar4 >> 0x2b | uVar4 << 0x15);
          uVar2 = uVar9 ^ (uVar2 >> 0x2f | uVar2 << 0x11);
          uVar9 = uVar9 >> 0x20 | uVar9 << 0x20;
        } while (iVar5 != 0);
        uVar6 = uVar6 ^ uVar7;
        uVar7 = 0xee;
        if (*(uint *)((long)param_1 + 0x2c) != 0x10) {
          uVar7 = 0xff;
        }
        uVar9 = uVar9 ^ uVar7;
        if (*(uint *)((long)param_1 + 0x34) != 0) {
          uVar8 = 0;
          do {
            uVar6 = uVar2 + uVar6;
            uVar2 = uVar6 ^ (uVar2 >> 0x33 | uVar2 << 0xd);
            uVar7 = uVar3 + uVar9 ^ (uVar3 >> 0x30 | uVar3 << 0x10);
            uVar8 = uVar8 + 1;
            uVar6 = uVar7 + (uVar6 >> 0x20 | uVar6 << 0x20);
            uVar9 = uVar3 + uVar9 + uVar2;
            uVar3 = uVar6 ^ (uVar7 >> 0x2b | uVar7 << 0x15);
            uVar2 = uVar9 ^ (uVar2 >> 0x2f | uVar2 << 0x11);
            uVar9 = uVar9 >> 0x20 | uVar9 << 0x20;
          } while (uVar8 < *(uint *)((long)param_1 + 0x34));
        }
        uVar7 = uVar2 ^ uVar6 ^ uVar9 ^ uVar3;
        param_2[1] = (char)(uVar7 >> 8);
        param_2[2] = (char)(uVar7 >> 0x10);
        param_2[3] = (char)(uVar7 >> 0x18);
        param_2[4] = (char)(uVar7 >> 0x20);
        *param_2 = (char)uVar7;
        param_2[5] = (char)(uVar7 >> 0x28);
        param_2[6] = (char)(uVar7 >> 0x30);
        param_2[7] = (char)(uVar7 >> 0x38);
        if (*(int *)((long)param_1 + 0x2c) != 8) {
          uVar2 = uVar2 ^ 0xdd;
          if (*(uint *)((long)param_1 + 0x34) != 0) {
            uVar8 = 0;
            do {
              uVar6 = uVar2 + uVar6;
              uVar2 = uVar6 ^ (uVar2 >> 0x33 | uVar2 << 0xd);
              uVar7 = uVar3 + uVar9 ^ (uVar3 >> 0x30 | uVar3 << 0x10);
              uVar8 = uVar8 + 1;
              uVar6 = uVar7 + (uVar6 >> 0x20 | uVar6 << 0x20);
              uVar9 = uVar3 + uVar9 + uVar2;
              uVar3 = uVar6 ^ (uVar7 >> 0x2b | uVar7 << 0x15);
              uVar2 = uVar9 ^ (uVar2 >> 0x2f | uVar2 << 0x11);
              uVar9 = uVar9 >> 0x20 | uVar9 << 0x20;
            } while (uVar8 < *(uint *)((long)param_1 + 0x34));
          }
          uVar3 = uVar2 ^ uVar6 ^ uVar9 ^ uVar3;
          param_2[8] = (char)uVar3;
          param_2[9] = (char)(uVar3 >> 8);
          param_2[10] = (char)(uVar3 >> 0x10);
          param_2[0xb] = (char)(uVar3 >> 0x18);
          param_2[0xc] = (char)(uVar3 >> 0x20);
          param_2[0xd] = (char)(uVar3 >> 0x28);
          param_2[0xe] = (char)(uVar3 >> 0x30);
          param_2[0xf] = (char)(uVar3 >> 0x38);
        }
        uVar1 = 1;
      }
    }
  }
  return uVar1;
}

