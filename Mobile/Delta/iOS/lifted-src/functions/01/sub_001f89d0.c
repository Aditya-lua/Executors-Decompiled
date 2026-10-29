/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f89d0..0x1f9834 (3684 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f89d0_0 {
    char field_0;
} st_1f89d0_0;

typedef struct st_1f89d0_4 {
    unsigned long long field_0;
} st_1f89d0_4;

typedef struct st_1f89d0_1 {
    char padding_0[257];
    char field_101;
} st_1f89d0_1;

typedef struct st_1f89d0_3 {
    char padding_0[312];
    struct st_1f89d0_4 *field_138;
} st_1f89d0_3;

typedef struct st_1f89d0_2 {
    char padding_0[96];
    struct st_1f89d0_1 *field_60;
} st_1f89d0_2;

extern st_1f89d0_2 *g_f0d198;
extern st_1f89d0_3 *g_f0d3d8;
extern unsigned long long g_f0d528;
extern char g_10002b0;

void sub_1f89d0(long long a0)
{
    unsigned long long v16;  // x28
    unsigned long long v17;  // x27
    char v26;  // x22
    unsigned long long v18;  // x24
    unsigned long long v19;  // x23
    unsigned long long v20;  // x22
    unsigned long long v21;  // x21
    unsigned long long v22;  // x20
    unsigned long long v23;  // x19
    unsigned long long v24;  // x30
    char v25;  // x0
    st_1f89d0_0 **v0;  // [bp-0x140], Other Possible Types: char
    st_1f89d0_0 *v1;  // [bp-0x138]
    st_1f89d0_0 *v2;  // [bp-0x120]
    st_1f89d0_0 **v3;  // [bp-0xa0], Other Possible Types: char
    unsigned long v4;  // [bp-0x58]
    unsigned long long v5;  // [bp-0x50]
    unsigned long long v6;  // [bp-0x48]
    unsigned long long v7;  // [bp-0x40]
    unsigned long long v8;  // [bp-0x38]
    unsigned long long v9;  // [bp-0x30]
    unsigned long long v10;  // [bp-0x28]
    unsigned long long v11;  // [bp-0x20]
    unsigned long long v12;  // [bp-0x18]
    char *v13;  // [bp-0x10]
    unsigned long long v14;  // [bp-0x8]
    char v15;  // [bp+0x0]

    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = v22;
    v12 = v23;
    v13 = &v15;
    v14 = v24;
    v4 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v2 = &v3;
    v3 = &v2;
    if (g_f0d198->field_60->field_101 >> 2 & 1)
    {
        v25 = sub_1f3fcc(a0, 1);
        if (v25)
        {
            v26 = *(long long *)(v25 + 24);
            if (v26)
            {
                if (*(char *)(v26 + 80) != 1 || !*(long long *)(v26 + 64))
                    sub_d5c30(a0, g_f0d528 + 2627);
                g_f0d3d8->field_138();
            }
        }
    }
    sub_c60dcc(a0);
    __debugbreak();
}
