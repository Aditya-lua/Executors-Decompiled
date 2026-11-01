
void FUN_00213250(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined2 uVar4;
  code *pcVar5;
  long lVar6;
  long lVar7;
  undefined8 *unaff_x19;
  long *unaff_x21;
  long lVar8;
  long unaff_x24;
  long *unaff_x25;
  long lVar9;
  undefined8 *puVar10;
  long *in_stack_00000010;
  undefined1 uStack0000000000000018;
  ulong in_stack_00000058;
  long in_stack_00000060;
  long in_stack_00000068;
  long in_stack_00000070;
  long in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  undefined8 uStack0000000000000098;
  long in_stack_000000a0;
  long in_stack_000000a8;
  long in_stack_000000b0;
  long in_stack_000000b8;
  long in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 uStack00000000000000d0;
  undefined8 uStack00000000000000d8;
  long in_stack_000000e0;
  long in_stack_000000e8;
  undefined8 in_stack_00000100;
  undefined8 in_stack_00000118;
  undefined2 in_stack_00000178;
  long in_stack_000003b0;
  long in_stack_000003b8;
  long in_stack_000003c0;
  long in_stack_000003c8;
  long in_stack_000003d0;
  long in_stack_000003d8;
  long in_stack_000003e0;
  long in_stack_000003e8;
  long in_stack_000003f0;
  long in_stack_000003f8;
  long in_stack_00000400;
  long in_stack_00000408;
  undefined1 auStack_7ffffffe [2147483646];
  
  if (in_stack_00000058 < 0x41) {
    lVar8 = *(long *)(unaff_x19[0x1c] + 0x138);
    lVar9 = *(long *)(unaff_x19[0x1c] + 0x140);
    lVar7 = *(long *)(lVar9 + 0x10);
    unaff_x25[0x4f] = 0x2020202020202020;
    unaff_x25[0x4e] = 0x2020202020202020;
    unaff_x25[0x51] = 0x2020202020202020;
    unaff_x25[0x50] = 0x2020202020202020;
    unaff_x25[0x53] = 0x2020202020202020;
    unaff_x25[0x52] = 0x2020202020202020;
    unaff_x25[0x55] = 0x2020202020202020;
    unaff_x25[0x54] = 0x2020202020202020;
    unaff_x25[0x47] = 0x2020202020202020;
    unaff_x25[0x46] = 0x2020202020202020;
    unaff_x25[0x49] = 0x2020202020202020;
    unaff_x25[0x48] = 0x2020202020202020;
    unaff_x25[0x4b] = 0x2020202020202020;
    unaff_x25[0x4a] = 0x2020202020202020;
    unaff_x25[0x4d] = 0x2020202020202020;
    unaff_x25[0x4c] = 0x2020202020202020;
    uVar3 = s_TLS_1_3__server_CertificateVerif_008db0e0._24_8_;
    uVar2 = s_TLS_1_3__server_CertificateVerif_008db0e0._16_8_;
    uVar1 = s_TLS_1_3__server_CertificateVerif_008db0e0._0_8_;
    unaff_x25[0x57] = s_TLS_1_3__server_CertificateVerif_008db0e0._8_8_;
    unaff_x25[0x56] = uVar1;
    unaff_x25[0x59] = uVar3;
    unaff_x25[0x58] = uVar2;
    uVar4 = s_TLS_1_3__server_CertificateVerif_008db0e0._32_2_;
    lVar6 = in_stack_00000058 + 0x62;
    _memcpy(auStack_7ffffffe + 0x800002fe,&uStack0000000000000018);
    unaff_x25[0x65] = unaff_x25[0x57];
    unaff_x25[100] = unaff_x25[0x56];
    unaff_x25[0x67] = unaff_x25[0x59];
    unaff_x25[0x66] = unaff_x25[0x58];
    unaff_x25[0x5d] = unaff_x25[0x4f];
    unaff_x25[0x5c] = unaff_x25[0x4e];
    unaff_x25[0x5f] = unaff_x25[0x51];
    unaff_x25[0x5e] = unaff_x25[0x50];
    unaff_x25[0x61] = unaff_x25[0x53];
    unaff_x25[0x60] = unaff_x25[0x52];
    unaff_x25[99] = unaff_x25[0x55];
    unaff_x25[0x62] = unaff_x25[0x54];
    in_stack_00000178 = (undefined2)((ulong)unaff_x25[0x4d] >> 0x30);
    unaff_x25[6] = in_stack_000003d8;
    unaff_x25[5] = in_stack_000003d0;
    unaff_x25[4] = in_stack_000003c8;
    unaff_x25[3] = in_stack_000003c0;
    unaff_x25[2] = in_stack_000003b8;
    unaff_x25[1] = in_stack_000003b0;
    unaff_x25[0xc] = in_stack_00000408;
    unaff_x25[0xb] = in_stack_00000400;
    unaff_x25[10] = in_stack_000003f8;
    unaff_x25[9] = in_stack_000003f0;
    unaff_x25[8] = in_stack_000003e8;
    unaff_x25[7] = in_stack_000003e0;
    unaff_x25[0xe] = CONCAT62((int6)unaff_x25[0x47],(short)((ulong)unaff_x25[0x46] >> 0x30));
    unaff_x25[0xd] = CONCAT62((int6)unaff_x25[0x46],uVar4);
    unaff_x25[0x14] = CONCAT62((int6)unaff_x25[0x4d],(short)((ulong)unaff_x25[0x4c] >> 0x30));
    unaff_x25[0x13] = CONCAT62((int6)unaff_x25[0x4c],(short)((ulong)unaff_x25[0x4b] >> 0x30));
    unaff_x25[0x12] = CONCAT62((int6)unaff_x25[0x4b],(short)((ulong)unaff_x25[0x4a] >> 0x30));
    unaff_x25[0x11] = CONCAT62((int6)unaff_x25[0x4a],(short)((ulong)unaff_x25[0x49] >> 0x30));
    unaff_x25[0x10] = CONCAT62((int6)unaff_x25[0x49],(short)((ulong)unaff_x25[0x48] >> 0x30));
    unaff_x25[0xf] = CONCAT62((int6)unaff_x25[0x48],(short)((ulong)unaff_x25[0x47] >> 0x30));
    uStack00000000000000d0 = lVar6;
    (**(code **)(lVar9 + 0x30))
              (&uStack0000000000000098,lVar8 + (lVar7 - 1U & 0xfffffffffffffff0) + 0x10,
               &uStack00000000000000d8,lVar6);
    if (uStack0000000000000098 != unaff_x24) {
      lVar6 = *in_stack_00000010;
      unaff_x25[0x3f] = in_stack_000000a0;
      unaff_x25[0x3e] = uStack0000000000000098;
      unaff_x25[0x41] = in_stack_000000b0;
      unaff_x25[0x40] = in_stack_000000a8;
      unaff_x25[0x43] = in_stack_000000c0;
      unaff_x25[0x42] = in_stack_000000b8;
      func_0x002493e8(auStack_7ffffffe + 0x800003ae,lVar6,auStack_7ffffffe + 0x800002be);
      in_stack_00000060 = in_stack_000003b8;
      in_stack_00000068 = in_stack_000003c0;
      in_stack_00000070 = in_stack_000003c8;
      in_stack_00000078 = in_stack_000003d0;
      in_stack_00000080 = in_stack_000003d8;
      in_stack_00000088 = in_stack_000003e0;
      if (in_stack_000003b0 != unaff_x24) {
        unaff_x21[2] = in_stack_000003c0;
        unaff_x21[1] = in_stack_000003b8;
        unaff_x21[4] = in_stack_000003d0;
        unaff_x21[3] = in_stack_000003c8;
        unaff_x21[6] = in_stack_000003e0;
        unaff_x21[5] = in_stack_000003d8;
        *unaff_x21 = in_stack_000003b0;
        func_0x002087e4();
        func_0x002095c8();
        goto code_r0x00213528;
      }
    }
    in_stack_000000e0 = *unaff_x19;
    uStack00000000000000d0 = unaff_x19[1];
    in_stack_000000e8 = uStack00000000000000d0 + unaff_x19[2] * 0x18;
    uStack00000000000000d8 = uStack00000000000000d0;
    func_0x002189a8(auStack_7ffffffe + 0x800003ae,&uStack00000000000000d0,&UNK_009c2468);
    unaff_x25[1] = in_stack_000003b8;
    *unaff_x25 = in_stack_000003b0;
    lVar8 = *in_stack_00000010;
    lVar6 = *(long *)(lVar8 + 0x2f0);
    in_stack_000000e0 = in_stack_000003c0;
    if (lVar6 != -0x8000000000000000) {
      lVar9 = *(long *)(lVar8 + 0x300);
      if (lVar9 != 0) {
        puVar10 = (undefined8 *)(*(long *)(lVar8 + 0x2f8) + 8);
        do {
          lVar6 = puVar10[-1];
          if (lVar6 != -0x8000000000000000 && lVar6 != 0) {
            func_0x00187bd4(*puVar10,lVar6,1);
          }
          puVar10 = puVar10 + 3;
          lVar9 = lVar9 + -1;
        } while (lVar9 != 0);
        lVar6 = *(long *)(lVar8 + 0x2f0);
      }
      if (lVar6 != 0) {
        func_0x00187bd4(*(undefined8 *)(lVar8 + 0x2f8),lVar6 * 0x18,8);
      }
    }
    lVar6 = *unaff_x25;
    *(long *)(lVar8 + 0x2f8) = unaff_x25[1];
    *(long *)(lVar8 + 0x2f0) = lVar6;
    *(long *)(lVar8 + 0x300) = in_stack_000000e0;
    func_0x001d9854(unaff_x19 + 6);
    lVar6 = unaff_x19[0x18];
    lVar9 = unaff_x19[0x1b];
    lVar8 = unaff_x19[0x1a];
    unaff_x25[0x13] = unaff_x19[0x19];
    unaff_x25[0x12] = lVar6;
    unaff_x25[0x15] = lVar9;
    unaff_x25[0x14] = lVar8;
    in_stack_00000100 = unaff_x19[0xc];
    lVar6 = unaff_x19[8];
    lVar9 = unaff_x19[0xb];
    lVar8 = unaff_x19[10];
    unaff_x25[3] = unaff_x19[9];
    unaff_x25[2] = lVar6;
    unaff_x25[5] = lVar9;
    unaff_x25[4] = lVar8;
    lVar6 = unaff_x19[6];
    unaff_x25[1] = unaff_x19[7];
    *unaff_x25 = lVar6;
    lVar6 = unaff_x19[0x2c];
    lVar9 = unaff_x19[0x2f];
    lVar8 = unaff_x19[0x2e];
    unaff_x25[0x27] = unaff_x19[0x2d];
    unaff_x25[0x26] = lVar6;
    unaff_x25[0x29] = lVar9;
    unaff_x25[0x28] = lVar8;
    lVar6 = unaff_x19[0x30];
    unaff_x25[0x2b] = unaff_x19[0x31];
    unaff_x25[0x2a] = lVar6;
    lVar6 = unaff_x19[0x24];
    lVar9 = unaff_x19[0x27];
    lVar8 = unaff_x19[0x26];
    unaff_x25[0x1f] = unaff_x19[0x25];
    unaff_x25[0x1e] = lVar6;
    unaff_x25[0x21] = lVar9;
    unaff_x25[0x20] = lVar8;
    lVar6 = unaff_x19[0x28];
    lVar9 = unaff_x19[0x2b];
    lVar8 = unaff_x19[0x2a];
    unaff_x25[0x23] = unaff_x19[0x29];
    unaff_x25[0x22] = lVar6;
    unaff_x25[0x25] = lVar9;
    unaff_x25[0x24] = lVar8;
    lVar6 = unaff_x19[0x20];
    lVar9 = unaff_x19[0x23];
    lVar8 = unaff_x19[0x22];
    unaff_x25[0x1b] = unaff_x19[0x21];
    unaff_x25[0x1a] = lVar6;
    unaff_x25[0x1d] = lVar9;
    unaff_x25[0x1c] = lVar8;
    lVar6 = unaff_x19[0x10];
    lVar9 = unaff_x19[0x13];
    lVar8 = unaff_x19[0x12];
    unaff_x25[0xb] = unaff_x19[0x11];
    unaff_x25[10] = lVar6;
    unaff_x25[0xd] = lVar9;
    unaff_x25[0xc] = lVar8;
    lVar6 = unaff_x19[0x14];
    lVar9 = unaff_x19[0x17];
    lVar8 = unaff_x19[0x16];
    unaff_x25[0xf] = unaff_x19[0x15];
    unaff_x25[0xe] = lVar6;
    unaff_x25[0x11] = lVar9;
    unaff_x25[0x10] = lVar8;
    lVar6 = unaff_x19[0xd];
    unaff_x25[8] = unaff_x19[0xe];
    unaff_x25[7] = lVar6;
    in_stack_00000118 = unaff_x19[0xf];
    lVar9 = unaff_x19[0x1c];
    lVar8 = unaff_x19[0x1f];
    lVar6 = unaff_x19[0x1e];
    unaff_x25[0x17] = unaff_x19[0x1d];
    unaff_x25[0x16] = lVar9;
    unaff_x25[0x19] = lVar8;
    unaff_x25[0x18] = lVar6;
    lVar6 = func_0x00187bd0(0x1a8,8);
    if (lVar6 != 0) {
      _memcpy(lVar6,&uStack00000000000000d0,0x1a8);
      unaff_x21[1] = lVar6;
      unaff_x21[2] = (long)&UNK_009c66e8;
      *unaff_x21 = unaff_x24;
      func_0x002087e4();
      if (unaff_x19[3] != 0) {
        func_0x00187bd4(unaff_x19[4],unaff_x19[3],1);
      }
code_r0x00213528:
      func_0x00187bd4();
      return;
    }
    func_0x007a1f18(8,0x1a8);
  }
  else {
    func_0x007a28b0(in_stack_00000058,0x40,&UNK_009c9ca0);
  }
                    /* WARNING: Does not return */
  pcVar5 = (code *)SoftwareBreakpoint(1,0x213718);
  (*pcVar5)();
}

