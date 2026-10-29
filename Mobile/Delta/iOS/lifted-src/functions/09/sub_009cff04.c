/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cff04..0x9d0068 (356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cff04_0 {
    unsigned int field_0;
} st_9cff04_0;

typedef struct st_9cff04_1 {
    char padding_0[40];
    unsigned long long field_28;
} st_9cff04_1;


unsigned long long sub_9cff04(st_9cff04_0 **a0, unsigned long a1, unsigned long long a2, unsigned long a3, unsigned long a4, st_9cff04_1 *a5)
{
    unsigned int *v5;  // x19
    unsigned long long v6;  // x0
    unsigned long v13;  // cc_dep2
    unsigned long v14;  // cc_ndep
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4105
    unsigned long long v17;  // w9
    unsigned long v18;  // cc_op
    unsigned long v19;  // cc_dep1
    unsigned long long v20;  // 4110
    unsigned long long v7;  // x9
    unsigned long long v21;  // 4105
    long long v8;  // x1
    unsigned long long v9;  // x8
    unsigned long long v10;  // x8
    unsigned long v11;  // x10
    unsigned long long v12;  // x9
    unsigned long long v0;  // [bp-0x44]
    unsigned long long v1;  // [bp-0x40]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = 0;
    v2 = a1;
    v0 = 0;
    v5 = *a0;
    if (!v5)
    {
        v5 = sub_a6bffc(8, "crypto/asn1/x_int64.c", 31);
        *a0 = v5;
        if (!v5)
            return v5;
    }
    if (!a2)
    {
        *v5 = 0;
        return 1;
    }
    v6 = sub_9c1d3c(&v1, &v0, &v2, a2);
    if (!(unsigned int)v6)
        return v6;
    v7 = a5->field_28;
    if (!(v7 >> 1 & 1) && v0)
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/x_int64.c", 196, "uint32_c2i");
        v8 = 226;
    }
    else if (v0)
    {
        v9 = v1;
        if (v9 < 0x80000001)
        {
            *v5 = -v9;
            return 1;
        }
        sub_a368c8();
        sub_a369bc("crypto/asn1/x_int64.c", 201, "uint32_c2i");
        v8 = 224;
    }
    else
    {
        v10 = v1;
        v11 = (v10 & 0xffffffff80000000) != 0 & (unsigned int)v7 >> 1;
        v12 = v10 >> 32;
        if (!(v7 & 2))
        {
            v15 = arm64g_calculate_condition(v18, v19, v13, v14);
            v16 = arm64g_calculate_condition(4, (v15 & 1 ? v12 : 0x40000000), 0, 0);
            v17 = (unsigned int)!(v16 & 1);
            if (!(v11 & 1))
                goto LABEL_9d0018;
        }
        else
        {
            v20 = arm64g_calculate_condition(v18, v19, v13, v14);
            v21 = arm64g_calculate_condition(0, (v20 & 1 ? v12 : 0x40000000), 0, 0);
            v17 = (unsigned int)!(v21 & 1);
            if (!(v11 & 1))
            {
LABEL_9d0018:
                if (!v17)
                {
                    *v5 = v10;
                    return 1;
                }
            }
        }
        sub_a368c8();
        sub_a369bc("crypto/asn1/x_int64.c", 208, "uint32_c2i");
        v8 = 223;
    }
    sub_a36abc(13, v8, 0);
    return 0;
}
