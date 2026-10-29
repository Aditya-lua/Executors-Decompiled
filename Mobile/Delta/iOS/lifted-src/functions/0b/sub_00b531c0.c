/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb531c0..0xb532dc (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b531c0_0 {
    long long field_0;
    long long field_8;
    char field_10;
    char padding_11[255];
    long long field_110;
    char field_118;
    char padding_119[31];
    struct st_b531c0_1 *field_138;
    unsigned int field_140;
    struct st_b531c0_1 *field_144;
    long long field_148;
} st_b531c0_0;

typedef struct st_b531c0_1 {
    char field_0;
} st_b531c0_1;

extern char g_10002b0;

char * sub_b531c0(st_b531c0_0 *a0, char *a1, long long a2, long long a3, long long a4, long long a5)
{
    char *v4;  // x0
    char *v5;  // x25
    long long v6;  // x0
    char v0;  // [bp-0x78]
    unsigned long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    v4 = sub_a2f9e0();
    if ((unsigned int)v4)
    {
        if (!a1)
        {
LABEL_b53228:
            v5 = 0;
LABEL_b5322c:
            v4 = sub_ac2d34(a0->field_8, a4, a5, &a0->field_10, a0->field_110, v5, a0->field_140, a1, a2, a3);
            if (v5 == &v0)
                sub_a66ec0(&v0, 32);
        }
        else if (a0->field_138)
        {
            v5 = &a0->field_118;
            goto LABEL_b5322c;
        }
        else
        {
            if ((&a0->field_140)[1])
                goto LABEL_b53228;
            v6 = sub_ac4034(a0->field_0);
            v5 = &v0;
            if (1 <= (int)sub_aa845c(a0->field_144, &v0, v6, 0))
                goto LABEL_b5322c;
            v4 = 0;
        }
    }
    if (*(long long *)&g_10002b0 == v1)
        return v4;
    ___stack_chk_fail();
}
