/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098feb8
 */

/* ix::WebSocket::readyStateToString(ix::ReadyState) */

void __thiscall ix::WebSocket::readyStateToString(undefined8 *param_1,undefined4 param_2)

{
  undefined8 uVar1;
  
  switch(param_2) {
  case 0:
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
    *(undefined1 *)param_1 = 0x14;
    *(undefined2 *)((long)param_1 + 9) = 0x474e;
    builtin_strncpy((char *)((long)param_1 + 1),"CONNECTI",8);
    *(undefined1 *)((long)param_1 + 0xb) = 0;
    return;
  case 1:
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
    *(undefined1 *)param_1 = 8;
    *(undefined4 *)((long)param_1 + 1) = 0x4e45504f;
    *(undefined1 *)((long)param_1 + 5) = 0;
    return;
  case 2:
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
    uVar1 = 0x474e49534f4c43;
    break;
  case 3:
    param_1[1] = 0;
    param_1[2] = 0;
    *(undefined1 *)param_1 = 0xc;
    *(undefined2 *)((long)param_1 + 5) = 0x4445;
    *(undefined4 *)((long)param_1 + 1) = 0x534f4c43;
    *(undefined1 *)((long)param_1 + 7) = 0;
    return;
  default:
    uVar1 = 0x4e574f4e4b4e55;
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
  }
  *(undefined1 *)param_1 = 0xe;
  *(undefined8 *)((long)param_1 + 1) = uVar1;
  return;
}

