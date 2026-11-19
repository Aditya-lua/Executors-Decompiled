/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a12e4c
 */

uint * o2i_SCT(long *param_1,long *param_2,ulong param_3)

{
  byte *pbVar1;
  byte bVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  undefined8 uVar6;
  ulong uVar7;
  uint *puVar8;
  byte *pbVar9;
  byte *local_48;
  
  if (param_3 - 1 < 0xffff) {
    puVar8 = (uint *)SCT_new();
    if (puVar8 != (uint *)0x0) {
      pbVar9 = (byte *)*param_2;
      bVar2 = *pbVar9;
      *puVar8 = (uint)bVar2;
      local_48 = pbVar9;
      if (bVar2 == 0) {
        if (param_3 < 0x2b) {
          ERR_new();
          uVar6 = 99;
        }
        else {
          local_48 = pbVar9 + 1;
          lVar4 = CRYPTO_memdup(local_48,0x20,"crypto/ct/ct_oct.c",0x68);
          *(long *)(puVar8 + 6) = lVar4;
          if (lVar4 == 0) goto LAB_00a1308c;
          puVar8[8] = 0x20;
          puVar8[9] = 0;
          bVar2 = pbVar9[0x21];
          *(ulong *)(puVar8 + 10) = (ulong)bVar2 << 0x38;
          uVar7 = (ulong)bVar2 << 0x38 | (ulong)pbVar9[0x22] << 0x30;
          *(ulong *)(puVar8 + 10) = uVar7;
          uVar7 = uVar7 | (ulong)pbVar9[0x23] << 0x28;
          *(ulong *)(puVar8 + 10) = uVar7;
          uVar7 = uVar7 | (ulong)pbVar9[0x24] << 0x20;
          *(ulong *)(puVar8 + 10) = uVar7;
          uVar7 = uVar7 | (ulong)pbVar9[0x25] << 0x18;
          *(ulong *)(puVar8 + 10) = uVar7;
          uVar7 = uVar7 | (ulong)pbVar9[0x26] << 0x10;
          *(ulong *)(puVar8 + 10) = uVar7;
          uVar7 = uVar7 | (ulong)pbVar9[0x27] << 8;
          *(ulong *)(puVar8 + 10) = uVar7;
          *(ulong *)(puVar8 + 10) = uVar7 | pbVar9[0x28];
          pbVar1 = pbVar9 + 0x2b;
          uVar7 = (ulong)CONCAT11(pbVar9[0x29],pbVar9[0x2a]);
          lVar4 = (param_3 - 0x2b) - uVar7;
          local_48 = pbVar1;
          if (param_3 - 0x2b < uVar7) {
            ERR_new();
            uVar6 = 0x72;
          }
          else {
            if (uVar7 != 0) {
              lVar5 = CRYPTO_memdup(pbVar1,uVar7,"crypto/ct/ct_oct.c",0x76);
              *(long *)(puVar8 + 0xc) = lVar5;
              if (lVar5 == 0) goto LAB_00a1308c;
            }
            local_48 = pbVar1 + uVar7;
            *(ulong *)(puVar8 + 0xe) = uVar7;
            iVar3 = o2i_SCT_signature(puVar8,&local_48,lVar4);
            if (0 < iVar3) {
              *param_2 = (long)(local_48 + (lVar4 - iVar3));
              goto joined_r0x00a13058;
            }
            ERR_new();
            uVar6 = 0x80;
          }
        }
        ERR_set_debug("crypto/ct/ct_oct.c",uVar6,"o2i_SCT");
        ERR_set_error(0x32,0x68,0);
      }
      else {
        lVar4 = CRYPTO_memdup(pbVar9,param_3,"crypto/ct/ct_oct.c",0x87);
        *(long *)(puVar8 + 2) = lVar4;
        if (lVar4 != 0) {
          *(ulong *)(puVar8 + 4) = param_3;
          *param_2 = (long)(pbVar9 + param_3);
joined_r0x00a13058:
          if (param_1 == (long *)0x0) {
            return puVar8;
          }
          SCT_free(*param_1);
          *param_1 = (long)puVar8;
          return puVar8;
        }
      }
    }
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/ct/ct_oct.c",0x4c,"o2i_SCT");
    ERR_set_error(0x32,0x68,0);
    puVar8 = (uint *)0x0;
  }
LAB_00a1308c:
  SCT_free(puVar8);
  return (uint *)0x0;
}

