/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7c924
 */

undefined8
mbedtls_asn1_traverse_sequence_of
          (long *param_1,byte *param_2,byte param_3,byte param_4,byte param_5,byte param_6,
          code *param_7,undefined8 param_8)

{
  uint uVar1;
  byte bVar2;
  undefined8 uVar3;
  byte *pbVar4;
  byte *pbVar5;
  byte *pbVar6;
  char *pcVar7;
  ulong uVar8;
  int iVar9;
  
  pcVar7 = (char *)*param_1;
  if (0 < (long)param_2 - (long)pcVar7) {
    if (*pcVar7 != '0') {
      return 0xffffff9e;
    }
    pbVar4 = (byte *)(pcVar7 + 1);
    *param_1 = (long)pbVar4;
    if (0 < (long)param_2 - (long)pbVar4) {
      if ((char)*pbVar4 < '\0') {
        uVar1 = *pbVar4 & 0x7f;
        if (3 < uVar1 - 1) {
          return 0xffffff9c;
        }
        if ((long)param_2 - (long)pbVar4 <= (long)(ulong)uVar1) {
          return 0xffffffa0;
        }
        uVar8 = 0;
        iVar9 = -uVar1;
        *param_1 = (long)(pcVar7 + 2);
        pbVar4 = (byte *)(pcVar7 + 2);
        do {
          pbVar6 = pbVar4 + 1;
          iVar9 = iVar9 + 1;
          uVar8 = (ulong)*pbVar4 | uVar8 << 8;
          *param_1 = (long)pbVar6;
          pbVar4 = pbVar6;
        } while (iVar9 != 0);
        pbVar4 = (byte *)(pcVar7 + (ulong)(uVar1 - 1) + 3);
      }
      else {
        pbVar6 = (byte *)(pcVar7 + 2);
        *param_1 = (long)pbVar6;
        uVar8 = (ulong)(byte)pcVar7[1];
        pbVar4 = pbVar6;
      }
      if (uVar8 <= (ulong)((long)param_2 - (long)pbVar4)) {
        if (pbVar6 + uVar8 != param_2) {
          return 0xffffff9a;
        }
        do {
          if (param_2 <= pbVar6) {
            return 0;
          }
          pbVar4 = pbVar6 + 1;
          *param_1 = (long)pbVar4;
          bVar2 = *pbVar6;
          if ((bVar2 & param_3) != param_4) {
            return 0xffffff9e;
          }
          if ((long)param_2 - (long)pbVar4 < 1) {
            return 0xffffffa0;
          }
          if ((char)*pbVar4 < '\0') {
            uVar1 = *pbVar4 & 0x7f;
            if (3 < uVar1 - 1) {
              return 0xffffff9c;
            }
            if ((long)param_2 - (long)pbVar4 <= (long)(ulong)uVar1) {
              return 0xffffffa0;
            }
            uVar8 = 0;
            iVar9 = -uVar1;
            *param_1 = (long)(pbVar6 + 2);
            pbVar4 = pbVar6 + 2;
            do {
              pbVar5 = pbVar4 + 1;
              iVar9 = iVar9 + 1;
              uVar8 = (ulong)*pbVar4 | uVar8 << 8;
              *param_1 = (long)pbVar5;
              pbVar4 = pbVar5;
            } while (iVar9 != 0);
            pbVar6 = pbVar6 + (ulong)(uVar1 - 1) + 3;
          }
          else {
            pbVar5 = pbVar6 + 2;
            *param_1 = (long)pbVar5;
            uVar8 = (ulong)pbVar6[1];
            pbVar6 = pbVar5;
          }
          if ((ulong)((long)param_2 - (long)pbVar6) < uVar8) {
            return 0xffffffa0;
          }
          if ((param_7 != (code *)0x0) && ((bVar2 & param_5) == param_6)) {
            uVar3 = (*param_7)(param_8,bVar2,pbVar5,uVar8);
            if ((int)uVar3 != 0) {
              return uVar3;
            }
            pbVar5 = (byte *)*param_1;
          }
          pbVar6 = pbVar5 + uVar8;
          *param_1 = (long)pbVar6;
        } while( true );
      }
    }
  }
  return 0xffffffa0;
}

