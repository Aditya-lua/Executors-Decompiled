/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x139948..0x13a020 (1752 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_139948_3 {
    struct st_139948_0 *field_0;
} st_139948_3;

typedef struct st_139948_0 {
    char field_0;
} st_139948_0;

typedef struct st_139948_5 {
    unsigned long long field_0;
} st_139948_5;

typedef struct st_139948_1 {
    char padding_0[257];
    char field_101;
} st_139948_1;

typedef struct st_139948_4 {
    char padding_0[72];
    struct st_139948_5 *field_48;
    char padding_50[296];
    struct st_139948_5 *field_178;
} st_139948_4;

typedef struct st_139948_2 {
    char padding_0[96];
    struct st_139948_1 *field_60;
} st_139948_2;

extern st_139948_2 *g_f0d198;
extern st_139948_4 *g_f0d3d8;
extern unsigned long long g_f0d528;
extern char g_10002b0;

void sub_139948(long long a0)
{
    unsigned long long v18;  // x26
    unsigned long long v19;  // x25
    char v28;  // x8
    unsigned long long v20;  // x24
    unsigned long long v21;  // x23
    unsigned long long v22;  // x22
    unsigned long long v23;  // x21
    unsigned long long v24;  // x20
    unsigned long long v25;  // x19
    unsigned long long v26;  // x30
    char v27;  // x0
    st_139948_0 **v0;  // [bp-0x1c0], Other Possible Types: char
    st_139948_0 *v1;  // [bp-0x1b8]
    st_139948_0 **v2;  // [bp-0x1b0], Other Possible Types: char
    st_139948_0 *v3;  // [bp-0x1a8]
    st_139948_0 **v4;  // [bp-0x198], Other Possible Types: st_139948_3 **, char
    st_139948_0 *v5;  // [bp-0x190], Other Possible Types: st_139948_3 **
    unsigned long v6;  // [bp-0x58]
    unsigned long long v7;  // [bp-0x50]
    unsigned long long v8;  // [bp-0x48]
    unsigned long long v9;  // [bp-0x40]
    unsigned long long v10;  // [bp-0x38]
    unsigned long long v11;  // [bp-0x30]
    unsigned long long v12;  // [bp-0x28]
    unsigned long long v13;  // [bp-0x20]
    unsigned long long v14;  // [bp-0x18]
    char *v15;  // [bp-0x10]
    unsigned long long v16;  // [bp-0x8]
    char v17;  // [bp+0x0]

    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = v22;
    v12 = v23;
    v13 = v24;
    v14 = v25;
    v15 = &v17;
    v16 = v26;
    v6 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    if (g_f0d198->field_60->field_101 >> 2 & 1)
    {
        v27 = sub_f2358(a0, 1);
        if (v27)
        {
            v28 = *(long long *)(v27 + 24);
            if (v28)
            {
                v5 = &v4;
                v4 = &v5;
                if (*(long long *)(v28 + 72) && *(long long *)*(long long *)(v28 + 72) && *(char *)*(long long *)*(long long *)(v28 + 72) == 15)
                    g_f0d3d8->field_48();
                sub_d5c30(a0, g_f0d528 + 5515);
            }
        }
    }
    v5 = &v4;
    v4 = &v5;
    g_f0d3d8->field_178();
}
