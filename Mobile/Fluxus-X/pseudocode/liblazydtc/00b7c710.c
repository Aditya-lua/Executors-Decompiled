/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7c710
 */

undefined8 mbedtls_asn1_get_mpi(long *param_1,long param_2,undefined8 param_3)

{
  uint uVar1;
  undefined8 uVar2;
  byte *pbVar4;
  byte *pbVar3;
  char *pcVar5;
  int iVar6;
  ulong uVar7;
  
  pcVar5 = (char *)*param_1;
  if (0 < param_2 - (long)pcVar5) {
    if (*pcVar5 != '\x02') {
      return 0xffffff9e;
    }
    pbVar4 = (byte *)(pcVar5 + 1);
    *param_1 = (long)pbVar4;
    if (0 < param_2 - (long)pbVar4) {
      if ((char)*pbVar4 < '\0') {
        uVar1 = *pbVar4 & 0x7f;
        if (3 < uVar1 - 1) {
          return 0xffffff9c;
        }
        if (param_2 - (long)pbVar4 <= (long)(ulong)uVar1) {
          return 0xffffffa0;
        }
        uVar7 = 0;
        iVar6 = -uVar1;
        *param_1 = (long)(pcVar5 + 2);
        pbVar4 = (byte *)(pcVar5 + 2);
        do {
          pbVar3 = pbVar4 + 1;
          iVar6 = iVar6 + 1;
          uVar7 = (ulong)*pbVar4 | uVar7 << 8;
          *param_1 = (long)pbVar3;
          pbVar4 = pbVar3;
        } while (iVar6 != 0);
        pbVar4 = (byte *)(pcVar5 + (ulong)(uVar1 - 1) + 3);
      }
      else {
        pbVar3 = (byte *)(pcVar5 + 2);
        *param_1 = (long)pbVar3;
        uVar7 = (ulong)(byte)pcVar5[1];
        pbVar4 = pbVar3;
      }
      if (uVar7 <= (ulong)(param_2 - (long)pbVar4)) {
        uVar2 = mbedtls_mpi_read_binary(param_3,pbVar3,uVar7);
        *param_1 = *param_1 + uVar7;
        return uVar2;
      }
    }
  }
  return 0xffffffa0;
}

