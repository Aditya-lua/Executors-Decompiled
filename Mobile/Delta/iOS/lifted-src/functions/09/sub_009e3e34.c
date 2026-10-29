/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e3e34..0x9e403c (520 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_1000000;
extern char g_10002b0;

void sub_9e3e34(unsigned long long *a0, unsigned long long *a1, long long a2, unsigned long long a3)
{
    unsigned long long v19;  // x8
    unsigned long long v20;  // x9
    unsigned long long idx;  // x7
    unsigned long v30;  // x19
    unsigned long v31;  // x20
    unsigned long v32;  // x11
    unsigned long long v33;  // x21
    unsigned long long v34;  // x23
    unsigned long long v35;  // x2
    unsigned long long v36;  // x12
    unsigned long long v37;  // x12
    unsigned long long v38;  // x12
    unsigned long long v21;  // x10
    unsigned long long v39;  // 4168
    unsigned long long v40;  // x2
    unsigned long long v41;  // x8
    unsigned long long v42;  // x8
    unsigned long long v43;  // x8
    unsigned long long v22;  // x11
    unsigned long long v23;  // x12
    unsigned long long idx1;  // x9
    unsigned long long index;  // x13
    unsigned long long idx2;  // x15
    unsigned long long v27;  // x17
    unsigned long long v28;  // x5
    unsigned long long v0;  // [bp-0xd8]
    unsigned long long v1;  // [bp-0xd0]
    unsigned long long v2;  // [bp-0xc8]
    unsigned long long v3;  // [bp-0xc0]
    unsigned long long v4;  // [bp-0xb8]
    unsigned long long v5;  // [bp-0xb0]
    unsigned long long v6;  // [bp-0xa8]
    unsigned long long v7;  // [bp-0xa0]
    unsigned long long v8;  // [bp-0x98]
    unsigned long v9;  // [bp-0x90]
    unsigned long v10;  // [bp-0x88]
    unsigned long v11;  // [bp-0x80]
    unsigned long v12;  // [bp-0x78]
    unsigned long v13;  // [bp-0x70]
    unsigned long v14;  // [bp-0x68]
    unsigned long v15;  // [bp-0x60]
    unsigned long v16;  // [bp-0x58]
    char *v17;  // [bp-0x10]
    char v18;  // [bp+0x0]

    v17 = &v18;
    v19 = a2 & 0x1fffffffffffffff;
    v20 = v19 * 2;
    v21 = v19 * 4;
    v22 = a2 * 8;
    v16 = *(long long *)&g_10002b0;
    v0 = 0;
    v1 = v19;
    v23 = v20 ^ v19;
    v2 = v20;
    v3 = v23;
    v4 = v21;
    v5 = v21 ^ v19;
    v6 = v20 ^ v21;
    v7 = v23 ^ v21;
    v8 = v22;
    v9 = v22 ^ v19;
    v10 = v20 ^ v22;
    v11 = v23 ^ v22;
    v12 = v21 ^ v22;
    v13 = v5 ^ v22;
    v14 = v6 ^ v22;
    v15 = v7 ^ v22;
    idx1 = (a3 * 0x100000000000000 | a3 >> 8) & 0xff0000000000000f & 15;
    index = (a3 * 0x1000000000000 | a3 >> 16) & 0xffff00000000000f & 15;
    idx2 = (a3 * 0x10000000000 | a3 >> 24) & 0xffffff000000000f & 15;
    v27 = (a3 * 0x100000000 | a3 >> 32) & 0xffffffff0000000f & 15;
    v28 = (a3 * &g_1000000 | a3 >> 40) & 0xffffffffff00000f & 15;
    idx = (a3 * 0x10000 | a3 >> 48) & 0xffffffffffff000f & 15;
    v30 = (&v0)[(a3 * 0x1000 | a3 >> 52) & 0xfffffffffffff00f & 15];
    v31 = (&v0)[(a3 * 0x100 | a3 >> 56) & 0xffffffffffffff0f & 15];
    v32 = *(long long *)((char *)&v0 + (a3 >> 57 & 120));
    v33 = (long long)(a2 * 4) >> 63 & 0xfffffffffffffffe | __ROL__(a2, 3) & 0xfffffffffffffff9 & 1;
    v34 = (long long)(a2 * 2) >> 63 & 0xfffffffffffffffe | __ROL__(a2, 2) & 0xfffffffffffffffd & 1;
    if (0 <= a2)
        v35 = 0;
    else
        v35 = a3 * 0x8000000000000000;
    v36 = v34 & a3 * 0x4000000000000000 ^ v33 & a3 * 0x2000000000000000 ^ v35 ^ (&v0)[a3 & 15] ^ (&v0)[(a3 * 0x1000000000000000 | a3 >> 4) & 17293822569102704655 & 15] * 16 ^ (&v0)[idx1] * 0x100 ^ (&v0)[(a3 * 0x10000000000000 | a3 >> 12) & 0xfff000000000000f & 15] * 0x1000 ^ (&v0)[index] * 0x10000;
    v37 = v36 ^ (&v0)[(a3 * 0x100000000000 | a3 >> 20) & 0xfffff0000000000f & 15] * 0x100000 ^ (&v0)[idx2] * &g_1000000 ^ (&v0)[(a3 * 0x1000000000 | a3 >> 28) & 0xfffffff00000000f & 15] * 0x10000000 ^ (&v0)[v27] * 0x100000000;
    v38 = v37 ^ (&v0)[(a3 * 0x10000000 | a3 >> 36) & 0xfffffffff000000f & 15] * 0x1000000000 ^ (&v0)[v28] * 0x10000000000 ^ (&v0)[(a3 * 0x100000 | a3 >> 44) & 0xfffffffffff0000f & 15] * 0x100000000000 ^ (&v0)[idx] * 0x1000000000000;
    v39 = arm64g_calculate_condition(164, a2, 0, 0);
    if (v39 & 1)
        v40 = 0;
    else
        v40 = a3 >> 1;
    v41 = v34 & a3 >> 2 ^ v33 & a3 >> 3 ^ v40 ^ (&v0)[(a3 * 0x1000000000000000 | a3 >> 4) & 17293822569102704655 & 15] >> 60 ^ (&v0)[idx1] >> 56 ^ (&v0)[(a3 * 0x10000000000000 | a3 >> 12) & 0xfff000000000000f & 15] >> 52 ^ (&v0)[index] >> 48;
    v42 = v41 ^ (&v0)[(a3 * 0x100000000000 | a3 >> 20) & 0xfffff0000000000f & 15] >> 44 ^ (&v0)[idx2] >> 40 ^ (&v0)[(a3 * 0x1000000000 | a3 >> 28) & 0xfffffff00000000f & 15] >> 36 ^ (&v0)[v27] >> 32;
    v43 = v42 ^ (&v0)[(a3 * 0x10000000 | a3 >> 36) & 0xfffffffff000000f & 15] >> 28 ^ (&v0)[v28] >> 24 ^ (&v0)[(a3 * 0x100000 | a3 >> 44) & 0xfffffffffff0000f & 15] >> 20 ^ (&v0)[idx] >> 16;
    *a0 = v43 ^ v30 >> 12 ^ v31 >> 8 ^ v32 >> 4;
    *a1 = v38 ^ v30 * 0x10000000000000 ^ v31 * 0x100000000000000 ^ v32 * 0x1000000000000000;
    if (*(long long *)&g_10002b0 == v16)
        return;
    ___stack_chk_fail();
}
