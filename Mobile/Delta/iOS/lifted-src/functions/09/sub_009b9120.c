/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b9120..0x9b9440 (800 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b9120_1 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
    unsigned int field_1c;
    unsigned int field_20;
    unsigned int field_24;
    unsigned int field_28;
    unsigned int field_2c;
    char padding_30[8];
    char field_38;
    char padding_39[183];
    int field_f0;
} st_9b9120_1;

typedef struct st_9b9120_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_9b9120_0;

extern st_9b9120_0 g_d29b68;
extern st_9b9120_0 g_d29f68;
extern st_9b9120_0 g_d2a368;
extern st_9b9120_0 g_d2a768;
extern char g_d2ab68;
extern char _NSHomeDirectory;

int sub_9b9120(unsigned int *a0, unsigned int *a1, st_9b9120_1 *a2)
{
    unsigned long v0;  // x8
    unsigned long v1;  // x9
    unsigned long v10;  // x15
    unsigned long long v11;  // x8
    unsigned long long v12;  // x14
    unsigned long long v13;  // x0
    unsigned long long v14;  // x4
    unsigned int *v15;  // x17
    st_9b9120_1 *v16;  // x9
    unsigned long v17;  // x11
    unsigned long v18;  // x11
    unsigned long v19;  // x11
    unsigned int v2;  // w16
    unsigned long v20;  // x8
    unsigned int v3;  // w3
    unsigned long v4;  // x8
    unsigned long v5;  // x9
    unsigned int v6;  // w5
    unsigned int v7;  // w4
    unsigned long v8;  // x9
    unsigned int *v9;  // x17

    v0 = *a0;
    v1 = a0[1];
    v2 = (unsigned int)((((((v0 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v0 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v0 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v0 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) ^ a2->field_0;
    v3 = (unsigned int)((((((v1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v1 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v1 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) ^ a2->field_4;
    v4 = a0[2];
    v5 = a0[3];
    v6 = (unsigned int)((((((v4 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v4 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v4 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v4 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) ^ a2->field_8;
    v7 = (unsigned int)((((((v5 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v5 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v5 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v5 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) ^ a2->field_c;
    v8 = (a2->field_f0 >> 1) - 1;
    v9 = &a2->field_18;
    v10 = v8;
    while (1)
    {
        v11 = (&g_d29f68.field_0)[__ROL__(v7, 16) & 0xffff00ff & 0xff] ^ (&g_d29b68.field_0)[v2 >> 24] ^ (&g_d2a368.field_0)[__ROL__(v6, 24) & 0xff0000ff & 0xff] ^ (&g_d2a768.field_0)[v3 & 0xff] ^ *(int *)((char *)v9 - 8);
        v12 = (&g_d29f68.field_0)[__ROL__(v2, 16) & 0xffff00ff & 0xff] ^ (&g_d29b68.field_0)[v3 >> 24] ^ (&g_d2a368.field_0)[__ROL__(v7, 24) & 0xff0000ff & 0xff] ^ (&g_d2a768.field_0)[v6 & 0xff] ^ *(int *)((char *)v9 - 4);
        v13 = (&g_d29f68.field_0)[__ROL__(v3, 16) & 0xffff00ff & 0xff] ^ (&g_d29b68.field_0)[v6 >> 24] ^ (&g_d2a368.field_0)[__ROL__(v2, 24) & 0xff0000ff & 0xff] ^ (&g_d2a768.field_0)[v7 & 0xff] ^ *v9;
        v14 = (&g_d29f68.field_0)[__ROL__(v6, 16) & 0xffff00ff & 0xff] ^ (&g_d29b68.field_0)[v7 >> 24] ^ (&g_d2a368.field_0)[__ROL__(v3, 24) & 0xff0000ff & 0xff] ^ (&g_d2a768.field_0)[v2 & 0xff] ^ v9[1];
        if (!(unsigned int)v10)
            break;
        v2 = (&g_d29f68.field_0)[__ROL__((unsigned int)v14, 16) & 0xffff00ff & 0xff] ^ (&g_d29b68.field_0)[(unsigned int)v11 >> 24] ^ (&g_d2a368.field_0)[__ROL__((unsigned int)v13, 24) & 0xff0000ff & 0xff] ^ (&g_d2a768.field_0)[(unsigned int)v12 & 0xff] ^ v9[2];
        v3 = (&g_d29f68.field_0)[__ROL__((unsigned int)v11, 16) & 0xffff00ff & 0xff] ^ (&g_d29b68.field_0)[(unsigned int)v12 >> 24] ^ (&g_d2a368.field_0)[__ROL__((unsigned int)v14, 24) & 0xff0000ff & 0xff] ^ (&g_d2a768.field_0)[(unsigned int)v13 & 0xff] ^ v9[3];
        v15 = v9 + 8;
        v6 = (&g_d29f68.field_0)[__ROL__((unsigned int)v12, 16) & 0xffff00ff & 0xff] ^ (&g_d29b68.field_0)[(unsigned int)v13 >> 24] ^ (&g_d2a368.field_0)[__ROL__((unsigned int)v11, 24) & 0xff0000ff & 0xff] ^ (&g_d2a768.field_0)[(unsigned int)v14 & 0xff] ^ v9[4];
        v7 = (&g_d29f68.field_0)[__ROL__((unsigned int)v13, 16) & 0xffff00ff & 0xff] ^ (&g_d29b68.field_0)[(unsigned int)v14 >> 24] ^ (&g_d2a368.field_0)[__ROL__((unsigned int)v12, 24) & 0xff0000ff & 0xff] ^ (&g_d2a768.field_0)[(unsigned int)v11 & 0xff] ^ v9[5];
        v10 = (unsigned int)v10 - 1;
        v9 = v15;
    }
    v16 = &(&a2->field_0)[8 * v8];
    v17 = ((&g_d2ab68)[v11 >> 24] * &_NSHomeDirectory | (&g_d2ab68)[(v14 * 0x1000000000000 | v14 >> 16) & 0xffff0000000000ff & 0xff] * 0x10000 | (&g_d2ab68)[(v13 * 0x100000000000000 | v13 >> 8) & 0xff000000000000ff & 0xff] * 0x100 | (&g_d2ab68)[v12 & 0xff]) ^ v16->field_20;
    *a1 = (((((v17 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v17 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v17 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v17 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v18 = ((&g_d2ab68)[v12 >> 24] * &_NSHomeDirectory | (&g_d2ab68)[(v11 * 0x1000000000000 | v11 >> 16) & 0xffff0000000000ff & 0xff] * 0x10000 | (&g_d2ab68)[(v14 * 0x100000000000000 | v14 >> 8) & 0xff000000000000ff & 0xff] * 0x100 | (&g_d2ab68)[v13 & 0xff]) ^ v16->field_24;
    a1[1] = (((((v18 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v18 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v18 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v18 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v19 = ((&g_d2ab68)[v13 >> 24] * &_NSHomeDirectory | (&g_d2ab68)[(v12 * 0x1000000000000 | v12 >> 16) & 0xffff0000000000ff & 0xff] * 0x10000 | (&g_d2ab68)[(v11 * 0x100000000000000 | v11 >> 8) & 0xff000000000000ff & 0xff] * 0x100 | (&g_d2ab68)[v14 & 0xff]) ^ v16->field_28;
    a1[2] = (((((v19 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v19 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v19 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v19 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v20 = ((&g_d2ab68)[v14 >> 24] * &_NSHomeDirectory | (&g_d2ab68)[(v13 * 0x1000000000000 | v13 >> 16) & 0xffff0000000000ff & 0xff] * 0x10000 | (&g_d2ab68)[(v12 * 0x100000000000000 | v12 >> 8) & 0xff000000000000ff & 0xff] * 0x100 | (&g_d2ab68)[v11 & 0xff]) ^ v16->field_2c;
    a1[3] = (((((v20 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v20 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v20 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v20 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    return v13;
}
