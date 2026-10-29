/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc638e0..0xc639ac (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c638e0_0 {
    char padding_0[8];
    unsigned long long field_8;
    char field_10;
    char padding_11[15];
    char field_20;
    char padding_21[7];
    char field_28;
    char padding_29[39];
    unsigned long long field_50;
} st_c638e0_0;


char sub_c638e0(unsigned long a0, long long a1, unsigned long a2, st_c638e0_0 *a3, long long a4)
{
    char v2;  // w0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned long long v5;  // x8
    unsigned long long v6;  // x9
    char v7;  // x8
    unsigned long long v8;  // 4106
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a3->field_50 = 2;
    v2 = sub_988b64();
    *(unsigned int *)&a3[1].padding_0[0] = v2;
    if (!v2)
        return 1;
    if (!*(long long *)&a3->field_10 && !(a3->field_20 >> 1 & 1))
        return 0;
    *(long long *)&a3->field_28 = *(long long *)&a3->field_10;
    v3 = sub_97ba98(a1, a4);
    v4 = sub_c4c40(a1);
    if (*(long long *)&a3->field_10)
    {
        v5 = v4 + v3;
        v6 = a3->field_8;
        if (v6 + *(long long *)&a3->field_10 > v5)
        {
            a3->field_20 = a3->field_20 & 0xfffffffd;
            v7 = v5 - v6;
            if (v5 < v6)
                v7 = 0;
            *(unsigned long long *)&a3->field_10 = v7;
            v8 = arm64g_calculate_condition(132, v5, v6, 0);
            if (!(v8 & 1))
                goto LABEL_c63984;
        }
    }
    else
    {
LABEL_c63984:
        if (!(a3->field_20 >> 1 & 1))
            *(unsigned int *)&a3[1].padding_0[0] = 0;
    }
    return 1;
}
