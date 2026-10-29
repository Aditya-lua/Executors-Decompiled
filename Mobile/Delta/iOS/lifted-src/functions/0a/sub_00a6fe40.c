/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6fe40..0xa6ffac (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6fe40_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    void* field_10;
} st_a6fe40_0;


unsigned long long sub_a6fe40(st_a6fe40_0 *a0, unsigned long long a1)
{
    unsigned int v3;  // w8
    void* v4;  // x8
    unsigned long long v5;  // x9
    unsigned long v6;  // x9
    unsigned int v0;  // [bp-0x14]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a1;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/params.c", 475, "OSSL_PARAM_set_int32");
        sub_a36abc(15, 0xc0102, 0);
        return 0;
    }
    *(unsigned long long *)&a0[1].field_8 = 0;
    v3 = a0->field_8;
    if (v3 == 1)
    {
        *(unsigned long long *)&a0[1].field_8 = 4;
        v4 = a0->field_10;
        if (v4)
        {
            v5 = (unsigned long long)a0[1].padding_0;
            if (v5 == 8)
            {
                *(unsigned long long *)&a0[1].field_8 = 8;
                v6 = (int)a1;
                goto LABEL_a6ff70;
            }
            else
            {
LABEL_a6feec:
                if (v5 != 4)
                    return (unsigned int)sub_a70d08();
                *(unsigned int *)v4 = a1;
                return 1;
            }
        }
    }
    else if (!(a1 >> 31 & 1) && v3 == 2)
    {
        *(unsigned long long *)&a0[1].field_8 = 4;
        v4 = a0->field_10;
        if (v4)
        {
            v5 = (unsigned long long)a0[1].padding_0;
            if (v5 != 8)
                goto LABEL_a6feec;
            *(unsigned long long *)&a0[1].field_8 = 8;
            v6 = a1 & 0xffffffff;
LABEL_a6ff70:
            *(unsigned long *)v4 = v6;
        }
    }
    else if (v3 == 3)
    {
        *(unsigned long long *)&a0[1].field_8 = 8;
        if (a0->field_10)
        {
            if (a0[1].padding_0 == 8)
            {
                *(double *)a0->field_10 = (double)(int)a1;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/params.c", 532, "OSSL_PARAM_set_int32");
                sub_a36abc(15, 130, 0);
                return 0;
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/params.c", 536, "OSSL_PARAM_set_int32");
        sub_a36abc(15, 129, 0);
        return 0;
    }
    return 1;
}
