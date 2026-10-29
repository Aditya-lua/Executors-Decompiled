/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaacf88..0xaad090 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aacf88_0 {
    char padding_0[32];
    void* field_20;
} st_aacf88_0;


int sub_aacf88(st_aacf88_0 *a0, unsigned int a1, unsigned long a2, unsigned int *a3)
{
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    long long v12;  // x19
    long long v13;  // x20
    char v0;  // [bp-0x3c], Other Possible Types: unsigned int
    char v1;  // [bp-0x38]
    long long v2;  // [bp-0x30]
    unsigned int v3;  // [bp-0x24]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (a1 != 3)
        return 0xfffffffe;
    v4 = v9;
    v5 = v10;
    v6 = &v8;
    v7 = v11;
    if (!(long long)a0->field_20[128])
    {
        *a3 = 672;
        return 1;
    }
    v3 = 0;
    if (sub_aaf01c((long long)a0->field_20[128], &v2, &v1, &v0, &v3))
    {
        if ((int)v0 >= 0)
        {
            if (v3 == 1)
            {
                *a3 = sub_9c7b68(v2);
                return 2;
            }
            v12 = 139;
            v13 = 604;
        }
        else
        {
            v12 = 150;
            v13 = 596;
        }
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_ameth.c", v13, "rsa_pss_verify_param");
        sub_a36abc(4, v12, 0);
    }
    sub_a368c8();
    sub_a369bc("crypto/rsa/rsa_ameth.c", 431, "rsa_pkey_ctrl");
    sub_a36abc(4, 0xc0103, 0);
    return 0;
}
