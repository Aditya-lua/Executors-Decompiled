/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa51d8c..0xa51ef0 (356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a51d8c_0 {
    long long field_0;
    char padding_8[16];
    unsigned int field_18;
    char padding_1c[20];
    struct st_a51d8c_1 *field_30;
} st_a51d8c_0;

typedef struct st_a51d8c_1 {
    unsigned long long field_0;
} st_a51d8c_1;


int sub_a51d8c(st_a51d8c_0 *a0, st_a51d8c_0 *a1)
{
    st_a51d8c_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        v2 = sub_a6bffc(40, "crypto/evp/evp_rand.c", 350);
        if (v2)
        {
            /* unsupported instruction */;
            v2->field_18 = 1;
            if (a1)
            {
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
            }
            sub_a79f54(a0->field_0);
            a0->field_30();
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/evp_rand.c", 346, "EVP_RAND_CTX_new");
        sub_a36abc(6, 218, 0);
        v2 = 0;
    }
    return (unsigned int)v2;
}
