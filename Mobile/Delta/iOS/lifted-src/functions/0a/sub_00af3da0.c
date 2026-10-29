/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf3da0..0xaf3e84 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af3da0_1 {
    char padding_0[8];
    struct st_af3da0_0 *field_8;
} st_af3da0_1;

typedef struct st_af3da0_0 {
    unsigned long long field_0;
} st_af3da0_0;

extern st_af3da0_0 *g_f09b88;
extern char g_f09b90;
extern char g_f13290;

void sub_af3da0(unsigned long a0, unsigned int a1, unsigned long a2)
{
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    st_af3da0_1 *v13;  // x0
    unsigned long long v14;  // x0
    unsigned long long v15;  // 4116
    unsigned int v0;  // [bp-0x58]
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = &v7;
    v6 = v12;
    if (a1)
    {
        if (9 > a1)
        {
            v13 = &(&g_f09b90)[a1 * 40] - 40;
        }
        else if (*(long long *)&g_f13290)
        {
            v0 = a1;
            sub_ad6ae4(*(long long *)&g_f13290);
            v14 = sub_ad66d4(*(long long *)&g_f13290, &v0);
            if (v14 >> 31 & 1 || !(v15 = arm64g_calculate_condition(65, v14 & 0xffffffff, 8, 0), !(v15 & 1)))
                goto LABEL_af3e5c;
            v13 = sub_ad69f8(*(long long *)&g_f13290, v14);
        }
        else
        {
LABEL_af3e5c:
            g_f09b88();
        }
        v13->field_8();
    }
}
