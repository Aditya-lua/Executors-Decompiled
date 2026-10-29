/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5ffe0..0xa60188 (424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5ffe0_1 {
} st_a5ffe0_1;

typedef struct st_a5ffe0_0 {
    char padding_0[8];
    unsigned long long field_8;
    struct st_a5ffe0_1 *field_10;
    char padding_18[72];
    struct st_a5ffe0_1 *field_60;
} st_a5ffe0_0;

extern void g_c7c2eb;

unsigned int sub_a5ffe0(void* a0)
{
    long long v4;  // x1
    st_a5ffe0_0 *v5;  // x20
    void* v6;  // x19
    void* v7;  // x2
    long long v8;  // x1
    void* v9;  // x8
    unsigned long v0;  // [bp-0x40]
    void* v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a0)
    {
        if (*(int *)a0 == 32 || *(int *)a0 == 0x8000)
        {
            if ((long long)a0[48])
            {
                v5 = (long long)a0[40];
                if (!v5->field_10)
                    v6 = &g_c7c2eb;
                else
                    v6 = v5->field_10;
                if (v5->field_60)
                    v5->field_60();
                sub_a368c8();
                sub_a369bc("crypto/evp/signature.c", 1168, "EVP_PKEY_verify");
                v0 = v5->field_8;
                v1 = v6;
                v7 = "%s verify:%s";
                v8 = 237;
            }
            else
            {
                v9 = (long long)a0[120];
                if (v9 && (long long)v9[88])
                    goto *((void *)((long long)v9[88]));
                sub_a368c8();
                sub_a369bc("crypto/evp/signature.c", 1182, "EVP_PKEY_verify");
                v8 = 150;
                v7 = 0;
            }
            sub_a36abc(6, v8, v7);
            return 0xfffffffe;
        }
        sub_a368c8();
        sub_a369bc("crypto/evp/signature.c", 1158, "EVP_PKEY_verify");
        v4 = 151;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/signature.c", 1152, "EVP_PKEY_verify");
        v4 = 786690;
    }
    sub_a36abc(6, v4, 0);
    return 0xffffffff;
}
