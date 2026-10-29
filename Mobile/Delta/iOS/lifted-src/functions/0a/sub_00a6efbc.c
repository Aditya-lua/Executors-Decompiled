/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6efbc..0xa6f0b0 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6efbc_1 {
    unsigned long long field_0;
    char padding_8[8];
    long long field_10;
} st_a6efbc_1;

typedef struct st_a6efbc_0 {
    unsigned long long field_0;
    unsigned int field_8;
    struct st_a6efbc_0 *field_c;
    long long field_10;
    unsigned long long field_18;
} st_a6efbc_0;


st_a6efbc_0 * sub_a6efbc(st_a6efbc_1 *a0, unsigned long a1, long long a2, long long n, unsigned int a4)
{
    st_a6efbc_0 *v2;  // x0
    st_a6efbc_0 *v3;  // x21
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(56, "crypto/param_build.c", 55);
    if (v2)
    {
        v3 = v2;
        v2->field_0 = a1;
        v2->field_8 = a4;
        v2->field_c = n;
        v4 = sub_a71e18(n);
        v3->field_10 = v4;
        (&v3->field_8)[1] = 0;
        a0->field_0 = a0->field_0 + v4;
        if ((int)sub_ad68a0(a0->field_10, v3) > 0)
        {
            _memcpy(&v3[1].field_8, a2, n);
            return 1;
        }
        sub_a6c2e4(v3, "crypto/param_build.c", 0x44);
    }
    sub_a368c8();
    sub_a369bc("crypto/param_build.c", 80, "param_push_num");
    sub_a36abc(15, 0xc0102, 0);
    return 0;
}
