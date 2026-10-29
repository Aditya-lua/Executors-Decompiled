/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9809f4..0x980b2c (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9809f4_0 {
    char padding_0[8];
    char field_8;
    char padding_9[15];
    long long field_18;
    long long field_20;
} st_9809f4_0;

typedef struct st_9809f4_1 {
    char field_0[21];
    long long field_8;
    char field_d;
    char padding_e[10];
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[8];
    char field_30;
} st_9809f4_1;

extern long long g_980d4c;
extern char g_10002b0;

st_9809f4_1 * sub_9809f4(st_9809f4_0 *a0, unsigned long a1, st_9809f4_1 *a2)
{
    st_9809f4_1 *v5;  // x0
    st_9809f4_1 *v6;  // x20
    st_9809f4_1 *v7;  // x0
    uint168_t v0;  // [bp-0x70]
    unsigned long long *v1;  // [bp-0x50]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    if (!a2 || !(*(int128_t *)&v0 = *(int128_t *)&a2->field_0[0], *(long long *)((char *)&v0 + 13) = *(long long *)&a2->field_0[13], v1 = &a0->field_8, 21 > *(char *)&v0 && sub_a66b6c(a0->field_18, &v0)))
    {
        v5 = sub_9806fc(a0);
        if (v5)
        {
            v6 = v5;
            v7 = sub_9807e4(a0, v6, a2);
            if (v7)
            {
                v7->field_8 = *(long long *)&v6->field_d;
                *(char *)&v7->field_18 = (char)v7->field_18 & 252 | 1;
                *(long long *)&v6->field_d = *(long long *)&v6->field_d + 1;
                v5 = 1;
            }
            else
            {
                sub_a19710(*(long long *)&v6->field_0[8], 0);
                sub_a66ccc(*(long long *)&v6->field_0[8], &g_980d4c, a0);
                sub_a66994(a0->field_20, v6);
                sub_a66664(*(long long *)&v6->field_0[8]);
                sub_a6c2e4(v6, "ssl/quic/quic_lcidm.c", 259);
                goto LABEL_980af8;
            }
        }
    }
    else
    {
LABEL_980af8:
        v5 = 0;
    }
    if (*(long long *)&g_10002b0 == v2)
        return v5;
    ___stack_chk_fail();
}
