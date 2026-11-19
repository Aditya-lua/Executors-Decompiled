/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aadfa0
 */

char * OBJ_nid2sn(int n)

{
  char *pcVar1;
  undefined8 uVar2;
  long lVar3;
  undefined1 auStack_58 [16];
  int local_48;
  undefined4 local_30 [2];
  undefined1 *local_28;
  
  if ((uint)n < 0x4e0) {
    if (n == 0) {
      lVar3 = 0;
    }
    else {
      if (*(int *)(&DAT_00c6da68 + (long)n * 0x28) == 0) {
        ERR_new();
        uVar2 = 0x101;
        goto LAB_00aae074;
      }
      lVar3 = (long)n;
    }
    pcVar1 = (&PTR_s_UNDEF_00c6da58)[lVar3 * 5];
  }
  else {
    OPENSSL_init_crypto(0x40,0);
    if (DAT_00d22188 == 0) {
      return (char *)0x0;
    }
    local_28 = auStack_58;
    local_30[0] = 3;
    local_48 = n;
    lVar3 = OPENSSL_LH_retrieve(DAT_00d22188,local_30);
    if (lVar3 != 0) {
      return (char *)**(undefined8 **)(lVar3 + 8);
    }
    ERR_new();
    uVar2 = 0x114;
LAB_00aae074:
    ERR_set_debug("crypto/objects/obj_dat.c",uVar2,"OBJ_nid2sn");
    ERR_set_error(8,0x65,0);
    pcVar1 = (char *)0x0;
  }
  return pcVar1;
}

