/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4f9f8..0xb4fb30 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4f9f8_0 {
    long long field_0;
    long long field_8;
    char field_10;
    char padding_11[255];
    long long field_110;
    char field_118;
    char padding_119[31];
    struct st_b4f9f8_1 *field_138;
    unsigned int field_140;
    int field_144;
    char padding_148[272];
    unsigned int field_258;
} st_b4f9f8_0;

typedef struct st_b4f9f8_1 {
    char field_0;
} st_b4f9f8_1;

extern char g_10002b0;

char * sub_b4f9f8(st_b4f9f8_0 *a0, char *a1, long long a2, long long a3, long long a4, long long a5)
{
    char *v6;  // x0
    char *v7;  // x25
    long long v0;  // [bp-0xa0]
    char *v1;  // [bp-0x80]
    char *v2;  // [bp-0x70]
    unsigned long v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v6 = sub_a2f9e0();
    if ((unsigned int)v6)
    {
        if (a1)
        {
            if (a0->field_138)
            {
                v7 = &a0->field_118;
                goto LABEL_b4fa9c;
            }
            if (a0->field_144 == 1)
            {
                v1 = (char *)0;
                v2 = (char *)0;
                v7 = &v1;
LABEL_b4fa9c:
                *(unsigned int *)&v0 = a0->field_140;
                v6 = sub_a81754(a0->field_0, a0->field_258, a4, a5, &a0->field_10, a0->field_110, v7, 32, v0, a1, a2, a3);
                if (v7 != &a0->field_118)
                    sub_a66ec0(&v1, 32);
            }
            else
            {
                v7 = &v1;
                if ((int)sub_aa845c(a0->field_8, &v1, 32, 0) >= 1)
                    goto LABEL_b4fa9c;
                v6 = 0;
            }
        }
        else
        {
            v7 = 0;
            goto LABEL_b4fa9c;
        }
    }
    if (*(long long *)&g_10002b0 == v3)
        return v6;
    ___stack_chk_fail();
}
