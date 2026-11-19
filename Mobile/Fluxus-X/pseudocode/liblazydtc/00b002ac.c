/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b002ac
 */

ulong ossl_a2ulabel(char *param_1,byte *param_2,ulong *param_3)

{
  uint uVar1;
  bool bVar2;
  int iVar3;
  char *pcVar4;
  byte bVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  size_t sVar11;
  ulong uVar12;
  ulong uVar13;
  byte local_874 [8];
  uint local_86c;
  uint local_868 [514];
  
  if (param_2 == (byte *)0x0) {
    uVar12 = 0;
  }
  else {
    uVar12 = *param_3;
  }
  uVar10 = (ulong)(param_2 != (byte *)0x0);
  uVar13 = 0;
  do {
    while( true ) {
      pcVar4 = strchr(param_1,0x2e);
      if (pcVar4 == (char *)0x0) {
        sVar11 = strlen(param_1);
      }
      else {
        sVar11 = (long)pcVar4 - (long)param_1;
      }
      iVar3 = strncmp(param_1,"xn--",4);
      if (iVar3 != 0) break;
      local_86c = 0x200;
      iVar3 = ossl_punycode_decode(param_1 + 4,sVar11 - 4,local_868,&local_86c);
      if (iVar3 < 1) {
        return 0xffffffff;
      }
      if (local_86c != 0) {
        uVar6 = 0;
        do {
          uVar1 = local_868[uVar6];
          bVar5 = (byte)uVar1;
          if (uVar1 < 0x80) {
            local_874[0] = bVar5;
            local_874[1] = 0;
            uVar7 = 1;
          }
          else if (uVar1 < 0x800) {
            local_874[0] = (byte)(uVar1 >> 6) & 0x1f | 0xc0;
            local_874[1] = bVar5 & 0x3f | 0x80;
            local_874[2] = 0;
            uVar7 = 2;
          }
          else if (uVar1 >> 0x10 == 0) {
            local_874[0] = (byte)(uVar1 >> 0xc) & 0xf | 0xe0;
            local_874[1] = (byte)(uVar1 >> 6) & 0x3f | 0x80;
            local_874[2] = bVar5 & 0x3f | 0x80;
            local_874[3] = 0;
            uVar7 = 3;
          }
          else {
            if (0x10 < uVar1 >> 0x10) {
              return 0xffffffff;
            }
            uVar7 = 4;
            local_874[0] = (byte)(uVar1 >> 0x12) & 7 | 0xf0;
            local_874[1] = (byte)(uVar1 >> 0xc) & 0x3f | 0x80;
            local_874[2] = (byte)(uVar1 >> 6) & 0x3f | 0x80;
            local_874[3] = bVar5 & 0x3f | 0x80;
            local_874[4] = 0;
          }
          uVar8 = 0;
          uVar9 = 0;
          do {
            if (uVar13 + uVar8 < uVar12) {
              *param_2 = local_874[uVar9];
              param_2 = param_2 + 1;
            }
            else {
              uVar10 = 0;
            }
            uVar8 = uVar8 + 1;
            uVar9 = uVar8 & 0xffffffff;
          } while (uVar9 < uVar7);
          uVar6 = uVar6 + 1;
          uVar13 = uVar13 + uVar8;
        } while (uVar6 < local_86c);
      }
      bVar2 = uVar13 < uVar12;
      uVar13 = uVar13 + 1;
      if (bVar2) {
        bVar5 = 0x2e;
        if (pcVar4 == (char *)0x0) {
          bVar5 = 0;
        }
        *param_2 = bVar5;
        param_2 = param_2 + 1;
      }
      else {
        uVar10 = 0;
      }
      param_1 = pcVar4 + 1;
      if (pcVar4 == (char *)0x0) goto LAB_00b004f8;
    }
    if (sVar11 != 0xffffffffffffffff) {
      uVar6 = 0;
      uVar7 = 0;
      do {
        if (uVar13 + uVar6 < uVar12) {
          *param_2 = param_1[uVar7];
          param_2 = param_2 + 1;
        }
        else {
          uVar10 = 0;
        }
        uVar6 = uVar6 + 1;
        uVar7 = uVar6 & 0xffffffff;
      } while (uVar7 < sVar11 + 1);
      uVar13 = uVar13 + uVar6;
    }
    param_1 = pcVar4 + 1;
  } while (pcVar4 != (char *)0x0);
LAB_00b004f8:
  *param_3 = uVar13;
  return uVar10;
}

