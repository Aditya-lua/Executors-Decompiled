/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab7490..0xab75d8 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab7490_1 {
    char padding_0[136];
    long long field_88;
    char padding_90[8];
    struct st_ab7490_0 *field_98;
} st_ab7490_1;

typedef struct st_ab7490_0 {
    char padding_0[28];
    int field_1c;
    char padding_20[8];
    unsigned long long field_28;
    char padding_30[8];
    unsigned long long field_38;
    char padding_40[16];
    unsigned long long field_50;
} st_ab7490_0;


unsigned long long sub_ab7490(st_ab7490_1 *a0, long long a1, unsigned long long *a2, long long a3, long long a4)
{
    st_ab7490_0 *v3;  // x25
    long long v4;  // x0
    unsigned long v5;  // x0
    unsigned long long v6;  // x1
    unsigned int v7;  // w0
    unsigned long v0;  // [bp-0x60]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0->field_98;
    v4 = sub_a59af4(a0->field_88);
    if (v3->field_1c != 1)
    {
        if (v3->field_1c != 4)
            goto LABEL_ab7568;
        if (!v3->field_38)
        {
            v5 = sub_a6bf4c(sub_aafbcc(sub_a59af4(a0->field_88)), "crypto/rsa/rsa_pmeth.c", 118);
            v3->field_38 = v5;
            if (!v5)
                return 0xffffffff;
        }
        v6 = sub_aafc0c(a4, a3);
        if ((int)v6 < 1)
            return v6;
        v0 = v3->field_28;
        v7 = sub_ab30ec(a1);
    }
    else
    {
LABEL_ab7568:
        v7 = sub_aafc0c(a4, a3, a1, v4);
    }
    *a2 = ~((int)(v7) >> 63) & v7 | (int)(v7) >> 63 & *a2;
    return ~((int)(v7) >> 31) & 1 | (int)(v7) >> 31 & v7;
}
