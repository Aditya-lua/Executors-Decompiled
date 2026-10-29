/* 7ff70c9969c0 FUN_7ff70c9969c0 */

undefined8 FUN_7ff70c9969c0(undefined8 param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  byte bVar5;
  char cVar6;
  char in_AF;
  char cVar7;
  char cVar8;
  undefined1 auStack_38 [40];
  undefined8 uStack_10;
  
  bVar5 = &stack0xfffffffffffffff8 < (undefined1 *)0x30;
  cVar8 = (longlong)auStack_38 < 0;
  cVar7 = &stack0x00000000 == (undefined1 *)0x38;
  cVar6 = (POPCOUNT((ulonglong)auStack_38 & 0xff) & 1U) == 0;
  uStack_10 = param_1;
  uVar3 = func_0x7ff70d5aea78(&uStack_10);
  puVar4 = (undefined8 *)
           CONCAT62((int6)((ulonglong)uVar3 >> 0x10),
                    CONCAT11(cVar8 << 7 | cVar7 << 6 | in_AF << 4 | cVar6 << 2 | 2U | bVar5,
                             (char)uVar3));
  if (puVar4 != (undefined8 *)0x0) {
    *(undefined4 *)(param_2 + 4) = *(undefined4 *)(puVar4 + 4);
    uVar3 = *puVar4;
    uVar1 = puVar4[1];
    uVar2 = puVar4[3];
    param_2[2] = puVar4[2];
    param_2[3] = uVar2;
    *param_2 = uVar3;
    param_2[1] = uVar1;
    return 0;
  }
  return 0x2b;
}


