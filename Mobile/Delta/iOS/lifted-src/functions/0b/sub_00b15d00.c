/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb15d00..0xb15f44 (580 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b15d00_2 {
    long long field_0;
    char padding_8[256];
    struct st_b15d00_0 *field_108;
    unsigned long long field_110;
} st_b15d00_2;

typedef struct st_b15d00_0 {
    char padding_0[24];
    struct st_b15d00_1 *field_18;
    char padding_20[8];
    struct st_b15d00_1 *field_28;
} st_b15d00_0;

typedef struct st_b15d00_1 {
    unsigned long long field_0;
} st_b15d00_1;

extern char g_10002b0;

unsigned long long sub_b15d00(st_b15d00_2 *a0, unsigned long a1, unsigned long long a2, unsigned long a3, unsigned long a4, long long a5, long long a6)
{
    unsigned long long v7;  // x0
    unsigned long long v0;  // [bp-0x108]
    unsigned long long v1;  // [bp-0x100]
    unsigned long long v2;  // [bp-0xf0]
    unsigned long long v3;  // [bp-0xe0]
    unsigned long v4;  // [bp-0x58]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v7 = sub_afd760(a0->field_0);
    v0 = 0;
    if (v7)
    {
        *(unsigned int *)&a0->field_110 = a2;
        if ((!(unsigned int)a2 || a2 & 1) && a0->field_108->field_18)
        {
            v2 = 0;
            v3 = 0;
            v1 = 0;
            if (sub_a76e48(&v1, a5, a6))
            {
                sub_9f2aec(a0->field_0);
                a0->field_108->field_18();
            }
        }
        else
        {
            sub_9d3c28();
            v7 = 0;
        }
        sub_9d3c28(v7);
        a0->field_108->field_28();
    }
    else
    {
        if (*(long long *)&g_10002b0 == v4)
            return 0;
        ___stack_chk_fail();
    }
}
