/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b68b58
 */

bool FUN_00b68b58(ulong *param_1,ulong param_2,long param_3,long *param_4,undefined4 *param_5,
                 long param_6,ulong param_7,long param_8,undefined8 param_9)

{
  byte *pbVar1;
  ulong uVar2;
  byte *__s;
  uint uVar3;
  uint uVar4;
  bool bVar5;
  int iVar6;
  void *pvVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  byte local_12c [64];
  byte abStack_ec [128];
  uint local_6c;
  
  bVar5 = false;
  if ((param_7 < 0x41) && (param_7 <= param_2)) {
    if (param_7 == 0) {
      bVar5 = param_8 != 0;
    }
    else {
      uVar14 = *param_1;
      uVar13 = uVar14 - param_7;
      *param_1 = uVar13;
      if (param_6 == 1) {
        if (param_4 != (long *)0x0) {
          *param_4 = param_3 + uVar13;
        }
        if (param_5 == (undefined4 *)0x0) {
          bVar5 = true;
        }
        else {
          *param_5 = 0;
          bVar5 = true;
        }
      }
      else {
        iVar6 = RAND_bytes_ex(param_9,local_12c,param_7,0);
        if ((iVar6 < 1) || (param_4 == (long *)0x0)) {
          bVar5 = false;
        }
        else {
          bVar5 = false;
          if (param_5 != (undefined4 *)0x0) {
            pvVar7 = CRYPTO_malloc((int)param_7,"ssl/record/tls_pad.c",0x104);
            *param_4 = (long)pvVar7;
            bVar5 = false;
            if (pvVar7 != (void *)0x0) {
              *param_5 = 1;
              uVar8 = param_7 + 0x100;
              __s = abStack_ec + ((ulong)(uint)-(int)abStack_ec & 0x3c);
              uVar12 = param_2;
              if (param_2 <= uVar8) {
                uVar12 = uVar8;
              }
              uVar12 = uVar12 - uVar8;
              memset(__s,0,param_7);
              uVar8 = 0;
              if (uVar12 < param_2) {
                uVar9 = 0;
                uVar8 = 0;
                uVar10 = 0;
                do {
                  uVar2 = uVar10 + 1;
                  uVar11 = (long)((uVar12 ^ uVar13) - 1 & (uVar12 ^ uVar13 ^ 0xffffffffffffffff)) >>
                           0x3f;
                  pbVar1 = (byte *)(param_3 + uVar12);
                  uVar9 = (uVar11 | uVar9) &
                          (long)((uVar12 - uVar14 ^ uVar14 | uVar12 ^ uVar14) ^ uVar12) >> 0x3f;
                  uVar8 = uVar11 & uVar10 | uVar8;
                  uVar12 = uVar12 + 1;
                  __s[uVar10] = __s[uVar10] | *pbVar1 & (byte)uVar9;
                  uVar10 = uVar2 & (long)((uVar2 - param_7 ^ param_7 | uVar2 ^ param_7) ^ uVar2) >>
                                   0x3f;
                } while (uVar12 < param_2);
              }
              uVar13 = 0;
              uVar3 = ~((uint)param_8 & 0xff);
              bVar5 = true;
              do {
                iVar6 = ((uint)uVar8 & 0x20) - 1;
                uVar14 = uVar8 + 1;
                uVar4 = ~(iVar6 >> 0x1f & 0xffU);
                local_6c = uVar4;
                local_6c = uVar3;
                *(byte *)((long)pvVar7 + uVar13) =
                     (byte)uVar3 & local_12c[uVar13] |
                     (byte)param_8 &
                     ((byte)uVar4 & __s[uVar8 | 0x20] |
                     (byte)(iVar6 >> 0x1f) & __s[uVar8 & 0xffffffffffffffdf]);
                uVar13 = uVar13 + 1;
                uVar8 = uVar14 & (long)((uVar14 - param_7 ^ param_7 | uVar14 ^ param_7) ^ uVar14) >>
                                 0x3f;
              } while (param_7 != uVar13);
            }
          }
        }
      }
    }
  }
  return bVar5;
}

