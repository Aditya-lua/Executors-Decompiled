/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b85688
 */

ulong mbedtls_asn1_write_algorithm_identifier_ext
                (ulong *param_1,ulong param_2,void *param_3,ulong param_4,long param_5,int param_6)

{
  uint uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  int iVar5;
  
  if (param_6 == 0) {
    param_5 = 0;
LAB_00b856f8:
    uVar2 = *param_1;
    if ((param_2 <= uVar2) && (param_4 <= uVar2 - param_2)) {
      *param_1 = uVar2 - param_4;
      memcpy((void *)(uVar2 - param_4),param_3,param_4);
      iVar5 = (int)param_4;
      if (iVar5 < 0) goto LAB_00b85710;
      uVar2 = (ulong)iVar5;
      if (uVar2 >> 0x20 != 0) {
LAB_00b85748:
        param_4 = 0xffffff9c;
        goto LAB_00b85710;
      }
      uVar1 = 1;
      if (0x7f < uVar2) {
        uVar3 = uVar2;
        do {
          uVar3 = uVar3 >> 8;
          uVar1 = uVar1 + 1;
        } while (uVar3 != 0);
      }
      uVar3 = *param_1;
      if ((long)(ulong)uVar1 <= (long)(uVar3 - param_2)) {
        *param_1 = uVar3 - 1;
        *(char *)(uVar3 - 1) = (char)param_4;
        while (uVar2 >> 8 != 0) {
          uVar3 = *param_1;
          *param_1 = uVar3 - 1;
          *(char *)(uVar3 - 1) = (char)(uVar2 >> 8);
          uVar2 = uVar2 >> 8;
        }
        if (1 < uVar1) {
          uVar2 = *param_1;
          *param_1 = uVar2 - 1;
          *(char *)(uVar2 - 1) = (char)uVar1 + '\x7f';
        }
        uVar2 = *param_1;
        if (0 < (long)(uVar2 - param_2)) {
          uVar1 = iVar5 + uVar1 + 1;
          param_4 = (ulong)uVar1;
          *param_1 = uVar2 - 1;
          *(undefined1 *)(uVar2 - 1) = 6;
          if ((int)uVar1 < 0) goto LAB_00b85710;
          uVar2 = param_5 + (int)uVar1;
          if (uVar2 >> 0x20 != 0) goto LAB_00b85748;
          uVar1 = 1;
          if (0x7f < uVar2) {
            uVar3 = uVar2;
            do {
              uVar3 = uVar3 >> 8;
              uVar1 = uVar1 + 1;
            } while (uVar3 != 0);
          }
          uVar3 = *param_1;
          if ((long)(ulong)uVar1 <= (long)(uVar3 - param_2)) {
            *param_1 = uVar3 - 1;
            *(char *)(uVar3 - 1) = (char)uVar2;
            uVar3 = uVar2;
            while (uVar3 >> 8 != 0) {
              uVar4 = *param_1;
              *param_1 = uVar4 - 1;
              *(char *)(uVar4 - 1) = (char)(uVar3 >> 8);
              uVar3 = uVar3 >> 8;
            }
            if (1 < uVar1) {
              uVar3 = *param_1;
              *param_1 = uVar3 - 1;
              *(char *)(uVar3 - 1) = (char)uVar1 + '\x7f';
            }
            uVar3 = *param_1;
            if (0 < (long)(uVar3 - param_2)) {
              param_4 = (ulong)((int)uVar2 + uVar1 + 1);
              *param_1 = uVar3 - 1;
              *(undefined1 *)(uVar3 - 1) = 0x30;
              goto LAB_00b85710;
            }
          }
        }
      }
    }
  }
  else {
    if (param_5 != 0) goto LAB_00b856f8;
    uVar2 = *param_1;
    if (0 < (long)(uVar2 - param_2)) {
      *param_1 = uVar2 - 1;
      *(undefined1 *)(uVar2 - 1) = 0;
      uVar2 = *param_1;
      if (0 < (long)(uVar2 - param_2)) {
        param_5 = 2;
        *param_1 = uVar2 - 1;
        *(undefined1 *)(uVar2 - 1) = 5;
        goto LAB_00b856f8;
      }
    }
  }
  param_4 = 0xffffff94;
LAB_00b85710:
  return param_4 & 0xffffffff;
}

