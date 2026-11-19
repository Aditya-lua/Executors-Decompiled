/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6e374
 */

int mbedtls_aes_setkey_dec(uint *param_1,undefined8 param_2,undefined4 param_3)

{
  long lVar1;
  int iVar2;
  uint *puVar3;
  uint *puVar4;
  ulong uVar5;
  uint *puVar6;
  int iVar7;
  uint uVar8;
  undefined8 uVar9;
  uint local_168 [2];
  long local_160;
  uint auStack_158 [68];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  memset(local_168,0,0x120);
  param_1[2] = 0;
  param_1[3] = 0;
  iVar2 = mbedtls_aes_setkey_enc(local_168,param_2,param_3);
  if (iVar2 == 0) {
    puVar4 = param_1 + 8;
    *param_1 = local_168[0];
    puVar3 = local_168 + local_160 + (long)(int)local_168[0] * 4;
    uVar9 = *(undefined8 *)(puVar3 + 4);
    *(undefined8 *)(param_1 + 6) = *(undefined8 *)(puVar3 + 6);
    *(undefined8 *)(param_1 + 4) = uVar9;
    if ((int)local_168[0] < 2) {
      puVar6 = puVar3 + 8;
    }
    else {
      uVar8 = 0xfffffffd;
      if (-3 < (int)~local_168[0]) {
        uVar8 = ~local_168[0];
      }
      iVar7 = local_168[0] + 1;
      uVar5 = (ulong)(local_168[0] + uVar8 + 1);
      puVar6 = auStack_158 + uVar5 * -4 + local_160 + (long)(int)local_168[0] * 4;
      do {
        uVar8 = *puVar3;
        iVar7 = iVar7 + -1;
        *puVar4 = (&DAT_00d23e08)[(byte)(&DAT_00d23908)[uVar8 >> 8 & 0xff]] ^
                  (&DAT_00d23a08)[(byte)(&DAT_00d23908)[(ulong)uVar8 & 0xff]] ^
                  (&DAT_00d24208)[(byte)(&DAT_00d23908)[uVar8 >> 0x10 & 0xff]] ^
                  (&DAT_00d24608)[(byte)(&DAT_00d23908)[uVar8 >> 0x18]];
        uVar8 = puVar3[1];
        puVar4[1] = (&DAT_00d23e08)[(byte)(&DAT_00d23908)[uVar8 >> 8 & 0xff]] ^
                    (&DAT_00d23a08)[(byte)(&DAT_00d23908)[(ulong)uVar8 & 0xff]] ^
                    (&DAT_00d24208)[(byte)(&DAT_00d23908)[uVar8 >> 0x10 & 0xff]] ^
                    (&DAT_00d24608)[(byte)(&DAT_00d23908)[uVar8 >> 0x18]];
        uVar8 = puVar3[2];
        puVar4[2] = (&DAT_00d23e08)[(byte)(&DAT_00d23908)[uVar8 >> 8 & 0xff]] ^
                    (&DAT_00d23a08)[(byte)(&DAT_00d23908)[(ulong)uVar8 & 0xff]] ^
                    (&DAT_00d24208)[(byte)(&DAT_00d23908)[uVar8 >> 0x10 & 0xff]] ^
                    (&DAT_00d24608)[(byte)(&DAT_00d23908)[uVar8 >> 0x18]];
        uVar8 = puVar3[3];
        puVar3 = puVar3 + -4;
        puVar4[3] = (&DAT_00d23e08)[(byte)(&DAT_00d23908)[uVar8 >> 8 & 0xff]] ^
                    (&DAT_00d23a08)[(byte)(&DAT_00d23908)[(ulong)uVar8 & 0xff]] ^
                    (&DAT_00d24208)[(byte)(&DAT_00d23908)[uVar8 >> 0x10 & 0xff]] ^
                    (&DAT_00d24608)[(byte)(&DAT_00d23908)[uVar8 >> 0x18]];
        puVar4 = puVar4 + 4;
      } while (2 < iVar7);
      puVar4 = param_1 + uVar5 * 4 + 0xc;
    }
    *puVar4 = *puVar3;
    *(undefined8 *)(puVar4 + 1) = *(undefined8 *)(puVar6 + -7);
    puVar4[3] = puVar6[-5];
  }
  mbedtls_platform_zeroize(local_168,0x120);
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

