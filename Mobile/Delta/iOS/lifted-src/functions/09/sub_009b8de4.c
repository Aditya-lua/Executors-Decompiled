/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b8de4..0x9b9120 (828 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b8de4_1 {
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
} st_9b8de4_1;

typedef struct st_9b8de4_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_9b8de4_0;

extern st_9b8de4_0 g_d28b40;
extern st_9b8de4_0 g_d28f40;
extern st_9b8de4_0 g_d29340;
extern void g_d29740;
extern char _NSHomeDirectory;

unsigned int sub_9b8de4(unsigned int *a0, unsigned int *a1, st_9b8de4_1 *a2)
{
    unsigned long v0;  // x8
    unsigned long v1;  // x9
    unsigned long v10;  // x13
    unsigned int v11;  // w0
    unsigned int v12;  // w14
    unsigned int v13;  // w15
    unsigned int v14;  // w17
    unsigned int v15;  // w25
    unsigned int v16;  // w24
    unsigned int v17;  // w23
    unsigned int v18;  // w22
    unsigned int v19;  // w21
    unsigned int v2;  // w17
    unsigned int v20;  // w3
    unsigned int v21;  // w20
    unsigned int v22;  // w19
    unsigned int v23;  // w7
    unsigned int v24;  // w6
    unsigned int v25;  // w5
    unsigned int v26;  // w4
    unsigned int *v27;  // x16
    st_9b8de4_1 *v28;  // x12
    unsigned long v29;  // x13
    unsigned int v3;  // w3
    unsigned long v30;  // x13
    unsigned long v31;  // x13
    unsigned long v32;  // x8
    unsigned long v4;  // x8
    unsigned long v5;  // x9
    unsigned int v6;  // w5
    unsigned int v7;  // w4
    unsigned long v8;  // x12
    unsigned int *v9;  // x16

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
        v11 = *(int *)&(&g_d29740)[4 * (__ROL__(v3, 16) & 0xffff00ff & 0xff)] ^ (&g_d29340.field_0)[v2 >> 24] ^ (&g_d28b40.field_0)[__ROL__(v6, 24) & 0xff0000ff & 0xff] ^ (&g_d28f40.field_0)[v7 & 0xff] ^ *(int *)((char *)v9 - 8);
        v12 = *(int *)&(&g_d29740)[4 * (__ROL__(v6, 16) & 0xffff00ff & 0xff)] ^ (&g_d29340.field_0)[v3 >> 24] ^ (&g_d28b40.field_0)[__ROL__(v7, 24) & 0xff0000ff & 0xff] ^ (&g_d28f40.field_0)[v2 & 0xff] ^ *(int *)((char *)v9 - 4);
        v13 = *(int *)&(&g_d29740)[4 * (__ROL__(v7, 16) & 0xffff00ff & 0xff)] ^ (&g_d29340.field_0)[v6 >> 24] ^ (&g_d28b40.field_0)[__ROL__(v2, 24) & 0xff0000ff & 0xff] ^ (&g_d28f40.field_0)[v3 & 0xff] ^ *v9;
        v14 = *(int *)&(&g_d29740)[4 * (__ROL__(v2, 16) & 0xffff00ff & 0xff)] ^ (&g_d29340.field_0)[v7 >> 24] ^ (&g_d28b40.field_0)[__ROL__(v3, 24) & 0xff0000ff & 0xff] ^ (&g_d28f40.field_0)[v6 & 0xff] ^ v9[1];
        v15 = v11 >> 24;
        v16 = __ROL__(v12, 16) & 0xffff00ff & 0xff;
        v17 = __ROL__(v13, 24) & 0xff0000ff & 0xff;
        v18 = v12 >> 24;
        v19 = __ROL__(v13, 16) & 0xffff00ff & 0xff;
        v20 = __ROL__(v14, 24) & 0xff0000ff & 0xff;
        v21 = v13 >> 24;
        v22 = __ROL__(v14, 16) & 0xffff00ff & 0xff;
        v23 = __ROL__(v11, 24) & 0xff0000ff & 0xff;
        v24 = v14 >> 24;
        v25 = __ROL__(v11, 16) & 0xffff00ff & 0xff;
        v26 = __ROL__(v12, 24) & 0xff0000ff & 0xff;
        if (!(unsigned int)v10)
            break;
        v27 = v9 + 8;
        v2 = *(int *)&(&g_d29740)[4 * v16] ^ (&g_d29340.field_0)[v15] ^ (&g_d28b40.field_0)[v17] ^ (&g_d28f40.field_0)[v14 & 0xff] ^ v9[2];
        v3 = *(int *)&(&g_d29740)[4 * v19] ^ (&g_d29340.field_0)[v18] ^ (&g_d28b40.field_0)[v20] ^ (&g_d28f40.field_0)[v11 & 0xff] ^ v9[3];
        v6 = *(int *)&(&g_d29740)[4 * v22] ^ (&g_d29340.field_0)[v21] ^ (&g_d28b40.field_0)[v23] ^ (&g_d28f40.field_0)[v12 & 0xff] ^ v9[4];
        v7 = *(int *)&(&g_d29740)[4 * v25] ^ (&g_d29340.field_0)[v24] ^ (&g_d28b40.field_0)[v26] ^ (&g_d28f40.field_0)[v13 & 0xff] ^ v9[5];
        v10 = (unsigned int)v10 - 1;
        v9 = v27;
    }
    v28 = &(&a2->field_0)[8 * v8];
    v29 = (*((char *)&(&g_d28b40.field_0)[v15] + 3) * &_NSHomeDirectory | *((char *)&(&g_d28f40.field_0)[v16] + 2) * 0x10000 | *((char *)&(&g_d29340.field_0)[v17] + 1) * 0x100 | (&g_d29740)[((v14 & 0xff) * 4 | (v14 & 0xff) >> 62) & 0x3fffffffc & 0x3ffffffff]) ^ v28->field_20;
    *a1 = (((((v29 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v29 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v29 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v29 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v30 = (*((char *)&(&g_d28b40.field_0)[v18] + 3) * &_NSHomeDirectory | *((char *)&(&g_d28f40.field_0)[v19] + 2) * 0x10000 | *((char *)&(&g_d29340.field_0)[v20] + 1) * 0x100 | (&g_d29740)[((v11 & 0xff) * 4 | (v11 & 0xff) >> 62) & 0x3fffffffc & 0x3ffffffff]) ^ v28->field_24;
    a1[1] = (((((v30 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v30 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v30 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v30 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v31 = (*((char *)&(&g_d28b40.field_0)[v21] + 3) * &_NSHomeDirectory | *((char *)&(&g_d28f40.field_0)[v22] + 2) * 0x10000 | *((char *)&(&g_d29340.field_0)[v23] + 1) * 0x100 | (&g_d29740)[((v12 & 0xff) * 4 | (v12 & 0xff) >> 62) & 0x3fffffffc & 0x3ffffffff]) ^ v28->field_28;
    a1[2] = (((((v31 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v31 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v31 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v31 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v32 = (*((char *)&(&g_d28b40.field_0)[v24] + 3) * &_NSHomeDirectory | *((char *)&(&g_d28f40.field_0)[v25] + 2) * 0x10000 | *((char *)&(&g_d29340.field_0)[v26] + 1) * 0x100 | (&g_d29740)[((v13 & 0xff) * 4 | (v13 & 0xff) >> 62) & 0x3fffffffc & 0x3ffffffff]) ^ v28->field_2c;
    a1[3] = (((((v32 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v32 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v32 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v32 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    return v11;
}
