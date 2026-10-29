/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x64064..0x640b8 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_64064_0 {
    unsigned long long field_0;
    char padding_8[8];
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[356];
    unsigned int field_18c;
    char padding_190[2];
    char field_192;
} st_64064_0;


long long sub_64064(st_64064_0 *a0)
{
    unsigned long v0;  // x8
    unsigned int v1;  // w9
    unsigned long v2;  // cc_dep1
    unsigned long long v3;  // x9
    unsigned long long v4;  // 4107
    unsigned long long v5;  // 4107
    unsigned long long v6;  // x10
    unsigned long long v7;  // x9

    v0 = a0->field_18c;
    if (v0 >> 3 & 1)
        return !((unsigned int)v0 & 8);
    *(unsigned long long *)&a0->padding_28[8] = 0;
    *(unsigned long long *)&a0->padding_28[16] = 0;
    v1 = a0->field_192;
    v2 = v1 & 0xff;
    if (v1)
    {
        v3 = 96;
        v4 = arm64g_calculate_condition(19, v2, 0, 0);
        if (!(v4 & 1))
            goto LABEL_6408e;
LABEL_6408d:
        v6 = 64;
    }
    else
    {
        v3 = 112;
        v5 = arm64g_calculate_condition(19, v2, 0, 0);
        if (v5 & 1)
            goto LABEL_6408d;
        v6 = 104;
LABEL_6408e:
    }
    v7 = *(long long *)((char *)a0 + v6) + *(long long *)((char *)a0 + v3);
    a0->field_10 = *(long long *)((char *)a0 + v6);
    a0->field_18 = v7;
    a0->field_20 = v7;
    *(unsigned long long *)&a0->padding_28[0] = 0;
    a0->field_18c = 8;
    return !((unsigned int)v0 & 8);
}
