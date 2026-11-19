/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e1ed8
 */

undefined8 dtls1_buffer_message(int *param_1,int param_2)

{
  long lVar1;
  undefined1 uVar2;
  ushort uVar3;
  undefined1 *data;
  pitem *item;
  long lVar4;
  long lVar5;
  long local_28;
  
  if (*(long *)(param_1 + 0x28) != 0) {
    return 0;
  }
  data = (undefined1 *)FUN_009e2038(*(undefined8 *)(param_1 + 0x26),0);
  if (data == (undefined1 *)0x0) {
    return 0;
  }
  memcpy(*(void **)(data + 0x58),*(void **)(*(long *)(param_1 + 0x22) + 8),
         *(size_t *)(param_1 + 0x26));
  lVar5 = *(long *)(param_1 + 0x12e);
  lVar4 = *(long *)(lVar5 + 0x140);
  if (param_2 == 0) {
    if (lVar4 + 0xcU != (ulong)(uint)param_1[0x26]) goto LAB_009e1fec;
  }
  else {
    lVar1 = 3;
    if (*param_1 != 0x100) {
      lVar1 = 1;
    }
    if (lVar1 + lVar4 != (ulong)(uint)param_1[0x26]) goto LAB_009e1fec;
  }
  *(long *)(data + 8) = lVar4;
  uVar3 = *(ushort *)(lVar5 + 0x148);
  *(ushort *)(data + 0x10) = uVar3;
  uVar2 = *(undefined1 *)(lVar5 + 0x138);
  *(undefined8 *)(data + 0x18) = 0;
  *(long *)(data + 0x20) = lVar4;
  *(int *)(data + 0x28) = param_2;
  *data = uVar2;
  param_2 = (uint)uVar3 * 2 - param_2;
  *(undefined8 *)(data + 0x30) = *(undefined8 *)(param_1 + 0x21e);
  *(undefined8 *)(data + 0x38) = *(undefined8 *)(param_1 + 0x224);
  *(undefined8 *)(data + 0x40) = *(undefined8 *)(param_1 + 0x21a);
  *(undefined8 *)(data + 0x48) = *(undefined8 *)(param_1 + 0x246);
  *(undefined2 *)(data + 0x50) = *(undefined2 *)(*(long *)(param_1 + 0x744) + 2);
  local_28 = (ulong)CONCAT11((char)param_2,(char)((uint)param_2 >> 8)) << 0x30;
  item = pitem_new((uchar *)&local_28,data);
  if (item != (pitem *)0x0) {
    pqueue_insert(*(pqueue *)(*(long *)(param_1 + 0x12e) + 0x120),item);
    return 1;
  }
LAB_009e1fec:
  CRYPTO_free(*(void **)(data + 0x58));
  CRYPTO_free(*(void **)(data + 0x60));
  CRYPTO_free(data);
  return 0;
}

