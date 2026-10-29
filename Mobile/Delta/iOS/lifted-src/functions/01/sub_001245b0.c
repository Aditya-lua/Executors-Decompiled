/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1245b0..0x1250c0 (2832 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1245b0_3 {
    struct st_1245b0_0 *field_0;
} st_1245b0_3;

typedef struct st_1245b0_0 {
    char field_0;
} st_1245b0_0;

typedef struct st_1245b0_5 {
    unsigned long long field_0;
} st_1245b0_5;

typedef struct st_1245b0_1 {
    char padding_0[257];
    char field_101;
} st_1245b0_1;

typedef struct st_1245b0_4 {
    char padding_0[376];
    struct st_1245b0_5 *field_178;
} st_1245b0_4;

typedef struct st_1245b0_2 {
    char padding_0[96];
    struct st_1245b0_1 *field_60;
} st_1245b0_2;

extern st_1245b0_2 *g_f0d198;
extern st_1245b0_4 *g_f0d3d8;
extern unsigned long long g_f0d528;
extern char g_10002b0;

void sub_1245b0(long long a0)
{
    unsigned long long v20;  // x28
    unsigned long long v21;  // x27
    unsigned long long v30;  // x30
    char v31;  // x0
    char v32;  // x8
    unsigned long long v22;  // x26
    unsigned long long v23;  // x25
    unsigned long long v24;  // x24
    unsigned long long v25;  // x23
    unsigned long long v26;  // x22
    unsigned long long v27;  // x21
    unsigned long long v28;  // x20
    unsigned long long v29;  // x19
    st_1245b0_0 **v0;  // [bp-0x210], Other Possible Types: char
    st_1245b0_0 *v1;  // [bp-0x208]
    st_1245b0_0 **v2;  // [bp-0x1f0], Other Possible Types: st_1245b0_3 **, char
    st_1245b0_0 **v3;  // [bp-0x1b0], Other Possible Types: char
    st_1245b0_0 *v4;  // [bp-0x1a8]
    st_1245b0_0 *v5;  // [bp-0x1a0], Other Possible Types: st_1245b0_3 **
    unsigned long v6;  // [bp-0x68]
    unsigned long long v7;  // [bp-0x60]
    unsigned long long v8;  // [bp-0x58]
    unsigned long long v9;  // [bp-0x50]
    unsigned long long v10;  // [bp-0x48]
    unsigned long long v11;  // [bp-0x40]
    unsigned long long v12;  // [bp-0x38]
    unsigned long long v13;  // [bp-0x30]
    unsigned long long v14;  // [bp-0x28]
    unsigned long long v15;  // [bp-0x20]
    unsigned long long v16;  // [bp-0x18]
    char *v17;  // [bp-0x10]
    unsigned long long v18;  // [bp-0x8]
    char v19;  // [bp+0x0]

    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = v27;
    v15 = v28;
    v16 = v29;
    v17 = &v19;
    v18 = v30;
    v6 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v4 = &v3;
    v3 = &v4;
    if (g_f0d198->field_60->field_101 >> 2 & 1)
    {
        v31 = sub_f2358(a0, 1);
        if (v31)
        {
            v32 = *(long long *)(v31 + 24);
            if (v32)
            {
                v5 = &v2;
                v2 = &v5;
                if (*(long long *)(v32 + 72) && *(long long *)*(long long *)(v32 + 72) && *(char *)*(long long *)*(long long *)(v32 + 72) == 15)
                    g_f0d3d8->field_178();
                sub_d5c30(a0, g_f0d528 + 5515);
            }
        }
    }
    v5 = &v2;
    v2 = &v5;
    g_f0d3d8->field_178();
}
