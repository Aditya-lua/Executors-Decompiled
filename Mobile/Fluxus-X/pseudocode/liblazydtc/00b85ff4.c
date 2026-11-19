/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b85ff4
 */

void mbedtls_asn1_write_named_bitstring
               (undefined8 param_1,undefined8 param_2,long param_3,long param_4)

{
  byte bVar1;
  byte *pbVar2;
  uint uVar3;
  ulong uVar4;
  
  if (param_4 != 0) {
    pbVar2 = (byte *)(param_3 + (param_4 + 7U >> 3) + -1);
    bVar1 = *pbVar2 >> (ulong)(((uint)(param_4 + 7U) & 0xfffffff8) - (int)param_4 & 0x1f);
    uVar3 = (uint)bVar1;
    if ((bVar1 & 1) == 0) {
      uVar4 = param_4 - 1;
      do {
        while( true ) {
          if (uVar4 == 0) {
            mbedtls_asn1_write_bitstring();
            return;
          }
          if ((uVar4 & 7) == 0) break;
          uVar3 = uVar3 >> 1;
          uVar4 = uVar4 - 1;
          if ((uVar3 & 1) != 0) goto LAB_00b86044;
        }
        pbVar2 = pbVar2 + -1;
        uVar3 = (uint)*pbVar2;
        uVar4 = uVar4 - 1;
      } while ((*pbVar2 & 1) == 0);
    }
  }
LAB_00b86044:
  mbedtls_asn1_write_bitstring();
  return;
}

