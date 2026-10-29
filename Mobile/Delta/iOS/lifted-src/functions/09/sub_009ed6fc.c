/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ed6fc..0x9edb30 (1076 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ed6fc_0 {
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
    unsigned int field_30;
    unsigned int field_34;
    unsigned int field_38;
    unsigned int field_3c;
    unsigned int field_40;
    unsigned int field_44;
    unsigned int field_48;
    unsigned int field_4c;
    unsigned int field_50;
    unsigned int field_54;
    unsigned int field_58;
    unsigned int field_5c;
    unsigned int field_60;
    unsigned int field_64;
    unsigned int field_68;
    unsigned int field_6c;
    unsigned int field_70;
    unsigned int field_74;
    unsigned int field_78;
    unsigned int field_7c;
    unsigned int field_80;
} st_9ed6fc_0;

typedef struct st_9ed6fc_1 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_9ed6fc_1;

extern st_9ed6fc_1 g_d33ee8;
extern st_9ed6fc_1 g_d342e8;
extern st_9ed6fc_1 g_d346e8;
extern st_9ed6fc_1 g_d34ae8;

unsigned int * sub_9ed6fc(unsigned int *a0, st_9ed6fc_0 *a1)
{
    unsigned int v0;  // w13
    unsigned int v1;  // w12
    unsigned int v10;  // w14
    unsigned long v11;  // x15
    unsigned int v12;  // w14
    unsigned long v13;  // x15
    unsigned int v14;  // w13
    unsigned int v15;  // w14
    unsigned long v16;  // x15
    unsigned int v17;  // w12
    unsigned int v18;  // w14
    unsigned long v19;  // x15
    unsigned int v2;  // w14
    unsigned int v20;  // w13
    unsigned int v21;  // w14
    unsigned long v22;  // x15
    unsigned int v23;  // w12
    unsigned int v24;  // w14
    unsigned long v25;  // x15
    unsigned int v26;  // w13
    unsigned int v27;  // w14
    unsigned long v28;  // x15
    unsigned int v29;  // w12
    unsigned long v3;  // x15
    unsigned int v30;  // w14
    unsigned long v31;  // x15
    unsigned int v32;  // w13
    unsigned int v33;  // w14
    unsigned long v34;  // x15
    unsigned int v35;  // w12
    unsigned int v36;  // w14
    unsigned long v37;  // x15
    unsigned int v38;  // w13
    unsigned int v39;  // w14
    unsigned int v4;  // w13
    unsigned long v40;  // x15
    unsigned int v41;  // w12
    unsigned int v42;  // w14
    unsigned long v43;  // x15
    unsigned int v44;  // w13
    unsigned int v45;  // w14
    unsigned long v46;  // x15
    unsigned int v5;  // w14
    unsigned long v6;  // x15
    unsigned int v7;  // w12
    unsigned int v8;  // w14
    unsigned long v9;  // x15

    v0 = *a0;
    v1 = a0[1];
    if (!a1->field_80)
    {
        v2 = a1->field_78 + v1;
        v3 = -a1->field_7c;
        if (v3 & 31)
            v2 = v2 << (char)(32 - (v3 & 31)) | v2 >> ((char)v3 & 31);
        v4 = ((&g_d342e8.field_0)[v2 & 0xff] ^ (&g_d33ee8.field_0)[__ROL__(v2, 24) & 0xff0000ff & 0xff]) - (&g_d346e8.field_0)[v2 >> 24] + (&g_d34ae8.field_0)[__ROL__(v2, 16) & 0xffff00ff & 0xff] ^ *a0;
        v5 = a1->field_70 - v4;
        v6 = -a1->field_74;
        if (v6 & 31)
            v5 = v5 << (char)(32 - (v6 & 31)) | v5 >> ((char)v6 & 31);
        v7 = ((&g_d342e8.field_0)[v5 & 0xff] + (&g_d33ee8.field_0)[__ROL__(v5, 24) & 0xff0000ff & 0xff] ^ (&g_d346e8.field_0)[v5 >> 24]) - (&g_d34ae8.field_0)[__ROL__(v5, 16) & 0xffff00ff & 0xff] ^ v1;
        v8 = v7 ^ a1->field_68;
        v9 = -a1->field_6c;
        if (v9 & 31)
            v8 = v8 << (char)(32 - (v9 & 31)) | v8 >> ((char)v9 & 31);
        v0 = (&g_d34ae8.field_0)[__ROL__(v8, 16) & 0xffff00ff & 0xff] ^ v4 ^ (&g_d33ee8.field_0)[__ROL__(v8, 24) & 0xff0000ff & 0xff] - (&g_d342e8.field_0)[v8 & 0xff] + (&g_d346e8.field_0)[v8 >> 24];
        v10 = v0 + a1->field_60;
        v11 = -a1->field_64;
        if (v11 & 31)
            v10 = v10 << (char)(32 - (v11 & 31)) | v10 >> ((char)v11 & 31);
        v1 = ((&g_d342e8.field_0)[v10 & 0xff] ^ (&g_d33ee8.field_0)[__ROL__(v10, 24) & 0xff0000ff & 0xff]) - (&g_d346e8.field_0)[v10 >> 24] + (&g_d34ae8.field_0)[__ROL__(v10, 16) & 0xffff00ff & 0xff] ^ v7;
    }
    v12 = a1->field_58 - v1;
    v13 = -a1->field_5c;
    if (v13 & 31)
        v12 = v12 << (char)(32 - (v13 & 31)) | v12 >> ((char)v13 & 31);
    v14 = ((&g_d342e8.field_0)[v12 & 0xff] + (&g_d33ee8.field_0)[__ROL__(v12, 24) & 0xff0000ff & 0xff] ^ (&g_d346e8.field_0)[v12 >> 24]) - (&g_d34ae8.field_0)[__ROL__(v12, 16) & 0xffff00ff & 0xff] ^ v0;
    v15 = v14 ^ a1->field_50;
    v16 = -a1->field_54;
    if (v16 & 31)
        v15 = v15 << (char)(32 - (v16 & 31)) | v15 >> ((char)v16 & 31);
    v17 = (&g_d34ae8.field_0)[__ROL__(v15, 16) & 0xffff00ff & 0xff] ^ v1 ^ (&g_d33ee8.field_0)[__ROL__(v15, 24) & 0xff0000ff & 0xff] - (&g_d342e8.field_0)[v15 & 0xff] + (&g_d346e8.field_0)[v15 >> 24];
    v18 = v17 + a1->field_48;
    v19 = -a1->field_4c;
    if (v19 & 31)
        v18 = v18 << (char)(32 - (v19 & 31)) | v18 >> ((char)v19 & 31);
    v20 = ((&g_d342e8.field_0)[v18 & 0xff] ^ (&g_d33ee8.field_0)[__ROL__(v18, 24) & 0xff0000ff & 0xff]) - (&g_d346e8.field_0)[v18 >> 24] + (&g_d34ae8.field_0)[__ROL__(v18, 16) & 0xffff00ff & 0xff] ^ v14;
    v21 = a1->field_40 - v20;
    v22 = -a1->field_44;
    if (v22 & 31)
        v21 = v21 << (char)(32 - (v22 & 31)) | v21 >> ((char)v22 & 31);
    v23 = ((&g_d342e8.field_0)[v21 & 0xff] + (&g_d33ee8.field_0)[__ROL__(v21, 24) & 0xff0000ff & 0xff] ^ (&g_d346e8.field_0)[v21 >> 24]) - (&g_d34ae8.field_0)[__ROL__(v21, 16) & 0xffff00ff & 0xff] ^ v17;
    v24 = v23 ^ a1->field_38;
    v25 = -a1->field_3c;
    if (v25 & 31)
        v24 = v24 << (char)(32 - (v25 & 31)) | v24 >> ((char)v25 & 31);
    v26 = (&g_d34ae8.field_0)[__ROL__(v24, 16) & 0xffff00ff & 0xff] ^ v20 ^ (&g_d33ee8.field_0)[__ROL__(v24, 24) & 0xff0000ff & 0xff] - (&g_d342e8.field_0)[v24 & 0xff] + (&g_d346e8.field_0)[v24 >> 24];
    v27 = v26 + a1->field_30;
    v28 = -a1->field_34;
    if (v28 & 31)
        v27 = v27 << (char)(32 - (v28 & 31)) | v27 >> ((char)v28 & 31);
    v29 = ((&g_d342e8.field_0)[v27 & 0xff] ^ (&g_d33ee8.field_0)[__ROL__(v27, 24) & 0xff0000ff & 0xff]) - (&g_d346e8.field_0)[v27 >> 24] + (&g_d34ae8.field_0)[__ROL__(v27, 16) & 0xffff00ff & 0xff] ^ v23;
    v30 = a1->field_28 - v29;
    v31 = -a1->field_2c;
    if (v31 & 31)
        v30 = v30 << (char)(32 - (v31 & 31)) | v30 >> ((char)v31 & 31);
    v32 = ((&g_d342e8.field_0)[v30 & 0xff] + (&g_d33ee8.field_0)[__ROL__(v30, 24) & 0xff0000ff & 0xff] ^ (&g_d346e8.field_0)[v30 >> 24]) - (&g_d34ae8.field_0)[__ROL__(v30, 16) & 0xffff00ff & 0xff] ^ v26;
    v33 = v32 ^ a1->field_20;
    v34 = -a1->field_24;
    if (v34 & 31)
        v33 = v33 << (char)(32 - (v34 & 31)) | v33 >> ((char)v34 & 31);
    v35 = (&g_d34ae8.field_0)[__ROL__(v33, 16) & 0xffff00ff & 0xff] ^ v29 ^ (&g_d33ee8.field_0)[__ROL__(v33, 24) & 0xff0000ff & 0xff] - (&g_d342e8.field_0)[v33 & 0xff] + (&g_d346e8.field_0)[v33 >> 24];
    v36 = v35 + a1->field_18;
    v37 = -a1->field_1c;
    if (v37 & 31)
        v36 = v36 << (char)(32 - (v37 & 31)) | v36 >> ((char)v37 & 31);
    v38 = ((&g_d342e8.field_0)[v36 & 0xff] ^ (&g_d33ee8.field_0)[__ROL__(v36, 24) & 0xff0000ff & 0xff]) - (&g_d346e8.field_0)[v36 >> 24] + (&g_d34ae8.field_0)[__ROL__(v36, 16) & 0xffff00ff & 0xff] ^ v32;
    v39 = a1->field_10 - v38;
    v40 = -a1->field_14;
    if (v40 & 31)
        v39 = v39 << (char)(32 - (v40 & 31)) | v39 >> ((char)v40 & 31);
    v41 = ((&g_d342e8.field_0)[v39 & 0xff] + (&g_d33ee8.field_0)[__ROL__(v39, 24) & 0xff0000ff & 0xff] ^ (&g_d346e8.field_0)[v39 >> 24]) - (&g_d34ae8.field_0)[__ROL__(v39, 16) & 0xffff00ff & 0xff] ^ v35;
    v42 = v41 ^ a1->field_8;
    v43 = -a1->field_c;
    if (v43 & 31)
        v42 = v42 << (char)(32 - (v43 & 31)) | v42 >> ((char)v43 & 31);
    v44 = (&g_d34ae8.field_0)[__ROL__(v42, 16) & 0xffff00ff & 0xff] ^ v38 ^ (&g_d33ee8.field_0)[__ROL__(v42, 24) & 0xff0000ff & 0xff] - (&g_d342e8.field_0)[v42 & 0xff] + (&g_d346e8.field_0)[v42 >> 24];
    v45 = v44 + a1->field_0;
    v46 = -a1->field_4;
    if (v46 & 31)
        v45 = v45 << (char)(32 - (v46 & 31)) | v45 >> ((char)v46 & 31);
    *a0 = ((&g_d342e8.field_0)[v45 & 0xff] ^ (&g_d33ee8.field_0)[__ROL__(v45, 24) & 0xff0000ff & 0xff]) - (&g_d346e8.field_0)[v45 >> 24] + (&g_d34ae8.field_0)[__ROL__(v45, 16) & 0xffff00ff & 0xff] ^ v41;
    a0[1] = v44;
    return a0;
}
