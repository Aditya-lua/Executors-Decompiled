/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2ace4..0xa2ae34 (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2ace4_0 {
    char padding_0[8];
    struct st_a2ace4_1 *field_8;
} st_a2ace4_0;

typedef struct st_a2ace4_1 {
    unsigned int field_0;
} st_a2ace4_1;


unsigned long long sub_a2ace4(long long a0, st_a2ace4_0 *a1)
{
    unsigned int v6;  // w9
    unsigned int v7;  // w11
    unsigned long long v8;  // x0
    unsigned long long v9;  // x20
    unsigned long long v10;  // x1
    long long v12;  // x1
    long long v13;  // x1
    unsigned long long v0;  // [bp-0x50]
    unsigned int v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v0 = 0;
    if (a1[2].padding_0 && *(long long *)&a1[2].padding_0[80])
    {
        v6 = *(int *)a1->field_8;
        if (v6 == 1035)
            v7 = 56;
        else
            v7 = 57;
        if (v6 == 1087)
            v7 = 32;
        if (v6 == 1034)
            v7 = 32;
        v1 = v7;
        v2 = *(long long *)&a1[2].padding_0[80];
        v3 = 0;
        v8 = sub_9cf0e0();
        if (!(v8 >> 31 & 1))
        {
            v9 = v8;
            if (sub_9ca82c(a0, sub_a99624(*(int *)a1->field_8), 0, 0xffffffff, 0, v0, v9))
                return 1;
            v10 = v9 & 0xffffffff;
            sub_a368c8(sub_a6c4e8(v0, v10, "crypto/ec/ecx_meth.c", 122), v10, "crypto/ec/ecx_meth.c", 122);
            v12 = 123;
        }
        else
        {
            sub_a368c8();
            v12 = 116;
        }
        sub_a369bc("crypto/ec/ecx_meth.c", v12, "ecx_priv_encode");
        v13 = 524301;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecx_meth.c", 106, "ecx_priv_encode");
        v13 = 123;
    }
    sub_a36abc(16, v13, 0);
    return 0;
}
