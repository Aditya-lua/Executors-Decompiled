/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a8f14
 */

undefined8 ssl3_ctx_callback_ctrl(long param_1,undefined4 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  
  uVar1 = 0;
  switch(param_2) {
  case 6:
    puVar2 = (undefined8 *)(*(long *)(param_1 + 0x158) + 0x10);
    break;
  default:
    goto switchD_009a8f34_caseD_7;
  case 0x35:
    puVar2 = (undefined8 *)(param_1 + 0x218);
    break;
  case 0x3f:
    puVar2 = (undefined8 *)(param_1 + 0x250);
    break;
  case 0x48:
    puVar2 = (undefined8 *)(param_1 + 0x240);
    break;
  case 0x4b:
    *(ulong *)(param_1 + 0x390) = *(ulong *)(param_1 + 0x390) | 0x20;
    puVar2 = (undefined8 *)(param_1 + 800);
    break;
  case 0x4c:
    *(ulong *)(param_1 + 0x390) = *(ulong *)(param_1 + 0x390) | 0x20;
    puVar2 = (undefined8 *)(param_1 + 0x328);
    break;
  case 0x4d:
    *(ulong *)(param_1 + 0x390) = *(ulong *)(param_1 + 0x390) | 0x20;
    puVar2 = (undefined8 *)(param_1 + 0x330);
    break;
  case 0x4f:
    puVar2 = (undefined8 *)(param_1 + 0x3c0);
  }
  *puVar2 = param_3;
  uVar1 = 1;
switchD_009a8f34_caseD_7:
  return uVar1;
}

