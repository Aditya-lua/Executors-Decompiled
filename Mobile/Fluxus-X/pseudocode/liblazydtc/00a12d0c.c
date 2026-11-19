/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a12d0c
 */

int o2i_SCT_signature(int *param_1,long *param_2,ulong param_3)

{
  ulong uVar1;
  ulong uVar2;
  undefined1 uVar3;
  undefined1 uVar4;
  int iVar5;
  undefined8 uVar6;
  undefined1 *puVar7;
  
  if (*param_1 == 0) {
    if (param_3 < 5) {
      ERR_new();
      uVar6 = 0x2a;
    }
    else {
      puVar7 = (undefined1 *)*param_2;
      *(undefined1 *)(param_1 + 0x10) = *puVar7;
      *(undefined1 *)((long)param_1 + 0x41) = puVar7[1];
      iVar5 = SCT_get_signature_nid();
      if (iVar5 == 0) {
        ERR_new();
        uVar6 = 0x33;
      }
      else {
        uVar3 = puVar7[2];
        uVar4 = puVar7[3];
        puVar7 = puVar7 + 4;
        uVar2 = (ulong)CONCAT11(uVar3,uVar4);
        uVar1 = (*param_2 - (long)puVar7) + param_3;
        if (uVar2 <= uVar1) {
          iVar5 = SCT_set1_signature(param_1,puVar7,uVar2);
          if (iVar5 == 1) {
            *param_2 = (long)(puVar7 + uVar2);
            return ((uint)CONCAT11(uVar3,uVar4) + (int)param_3) - (int)uVar1;
          }
          return -1;
        }
        ERR_new();
        uVar6 = 0x3a;
      }
    }
    ERR_set_debug("crypto/ct/ct_oct.c",uVar6,"o2i_SCT_signature");
    uVar6 = 0x6b;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/ct/ct_oct.c",0x1f,"o2i_SCT_signature");
    uVar6 = 0x67;
  }
  ERR_set_error(0x32,uVar6,0);
  return -1;
}

