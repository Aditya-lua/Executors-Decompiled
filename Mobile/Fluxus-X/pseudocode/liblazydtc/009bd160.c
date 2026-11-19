/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bd160
 */

undefined8
FUN_009bd160(undefined8 param_1,uint param_2,uint param_3,long *param_4,ulong *param_5,
            undefined8 param_6,long param_7,undefined4 *param_8)

{
  undefined1 *puVar1;
  undefined1 *puVar2;
  long lVar3;
  ulong uVar4;
  int iVar5;
  undefined8 uVar6;
  ulong uVar7;
  ulong local_40;
  long lStack_38;
  
  local_40 = 0;
  lStack_38 = 0;
  if (((param_3 >> 0xc & 1) == 0) || (uVar6 = 0, param_7 == 0)) {
    iVar5 = ssl_get_server_cert_serverinfo(param_1,&lStack_38,&local_40);
    if (iVar5 == 0) {
      uVar6 = 0;
    }
    else {
      *param_4 = 0;
      *param_5 = 0;
      if ((lStack_38 == 0) || ((long)local_40 < 1)) {
LAB_009bd21c:
        *param_8 = 0x50;
        uVar6 = 0xffffffff;
      }
      else {
        do {
          if (local_40 - 1 < 5) goto LAB_009bd21c;
          if (local_40 == 0) {
            return 0;
          }
          if ((local_40 & 0xfffffffffffffffe) == 6) goto LAB_009bd21c;
          uVar7 = local_40 - 8;
          uVar4 = (ulong)CONCAT11(*(undefined1 *)(lStack_38 + 6),*(undefined1 *)(lStack_38 + 7));
          local_40 = uVar7 - uVar4;
          if (uVar7 < uVar4) goto LAB_009bd21c;
          puVar1 = (undefined1 *)(lStack_38 + 4);
          puVar2 = (undefined1 *)(lStack_38 + 5);
          lVar3 = lStack_38 + 8;
          lStack_38 = lVar3 + uVar4;
        } while (CONCAT11(*puVar1,*puVar2) != param_2);
        uVar6 = 1;
        *param_4 = lVar3;
        *param_5 = uVar4;
      }
    }
  }
  return uVar6;
}

