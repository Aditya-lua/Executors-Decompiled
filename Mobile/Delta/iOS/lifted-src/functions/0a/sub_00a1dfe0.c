/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1dfe0..0xa1e104 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1dfe0_1 {
    char padding_0[8];
    long long field_8;
    long long field_10;
    char padding_18[128];
    struct st_a1dfe0_0 *field_98;
} st_a1dfe0_1;

typedef struct st_a1dfe0_0 {
    char padding_0[25];
    char field_19;
    char padding_1a[6];
    long long field_20;
    long long field_28;
    long long field_30;
    long long field_38;
} st_a1dfe0_0;


unsigned long long sub_a1dfe0(st_a1dfe0_1 *a0, unsigned long long a1, long long *a2)
{
    st_a1dfe0_0 *v3;  // x23
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long long v6;  // x19
    unsigned long long v7;  // x20
    unsigned long v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0->field_98;
    if (v3->field_19 == 1)
    {
        return sub_a1e6dc();
    }
    else if (!a1)
    {
        *a2 = v3->field_38;
        return 1;
    }
    else if (*a2 == v3->field_38)
    {
        v4 = sub_a1e6dc();
        if (!(unsigned int)v4)
            return v4;
        v5 = sub_a6bf4c(v0, "crypto/ec/ec_pmeth.c", 230);
        if (!v5)
            return v5;
        v6 = v5;
        if (sub_a1e6dc(a0, v6, &v0))
            v7 = sub_a1e7f4(a1, *a2, v6, v0, v3->field_28, v3->field_30, v3->field_20, a0->field_8, a0->field_10) != 0;
        else
            v7 = 0;
        sub_a6c4e8(v6, v0, "crypto/ec/ec_pmeth.c", 242);
        return v7;
    }
    else
    {
        return 0;
    }
}
