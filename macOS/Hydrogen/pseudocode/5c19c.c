
bool FUN_0005c19c(undefined8 param_1)

{
  ulong uVar1;
  char cVar2;
  undefined8 *puVar3;
  long lVar4;
  long lVar5;
  char cVar6;
  undefined1 uStack0000000000000070;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c8;
  undefined1 uStack0000000000000110;
  undefined1 uStack0000000000000140;
  undefined1 auStack_7ffffffe [2147483581];
  char cStack_41;
  
  __ZNSt13exception_ptrD1Ev(&uStack0000000000000070);
  __ZNSt13exception_ptrD1Ev(&uStack0000000000000110);
  ___cxa_end_catch();
  func_0x00070c58(&uStack0000000000000140);
  func_0x00070e14(auStack_7ffffffe + 0x8000024e);
  if (in_stack_000000c8._7_1_ < '\0') {
    __ZdlPv(in_stack_000000b8);
  }
  puVar3 = (undefined8 *)__Unwind_Resume(param_1);
  puVar3[3] = 0;
  if (*(char *)((long)puVar3 + 0x37) < '\0') {
    *(undefined1 *)puVar3[4] = 0;
    puVar3[5] = 0;
  }
  else {
    *(undefined1 *)(puVar3 + 4) = 0;
    *(undefined1 *)((long)puVar3 + 0x37) = 0;
  }
  lVar4 = (**(code **)(*(long *)*puVar3 + 0x28))((long *)*puVar3,&cStack_41,1);
  if (-1 < lVar4) {
    lVar5 = 0;
    cVar6 = '\0';
    do {
      cVar2 = cStack_41;
      if (lVar4 == 0) {
        return lVar5 != 0;
      }
      uVar1 = puVar3[3];
      if (uVar1 < puVar3[2] - 1) {
        puVar3[3] = uVar1 + 1;
        *(char *)(puVar3[1] + uVar1) = cStack_41;
        *(undefined1 *)(puVar3[1] + puVar3[3]) = 0;
      }
      else {
        if (*(char *)((long)puVar3 + 0x37) < '\0') {
          if (puVar3[5] == 0) goto LAB_0005c37c;
        }
        else if (*(char *)((long)puVar3 + 0x37) == '\0') {
LAB_0005c37c:
          func_0x0002a5d4(puVar3 + 4,puVar3[1]);
        }
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
                  (puVar3 + 4,(int)cVar2);
        cVar2 = cStack_41;
      }
      if ((cVar6 == '\r') && (cVar2 == '\n')) {
        return true;
      }
      cStack_41 = cVar2;
      lVar4 = (**(code **)(*(long *)*puVar3 + 0x28))((long *)*puVar3,&cStack_41,1);
      lVar5 = lVar5 + -1;
      cVar6 = cVar2;
    } while (-1 < lVar4);
  }
  return false;
}

