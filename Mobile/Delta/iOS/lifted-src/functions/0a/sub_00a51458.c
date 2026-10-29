/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa51458..0xa51618 (448 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a51458_0 {
    unsigned long long field_0;
    struct st_a51458_1 *field_8;
} st_a51458_0;

typedef struct st_a51458_1 {
    char padding_0[64];
    struct st_a51458_0 *field_40;
    char padding_48[240];
    struct st_a51458_0 *field_138;
} st_a51458_1;

extern char g_10002b0;

st_a51458_0 * sub_a51458(long long a0, unsigned long a1, unsigned long a2)
{
    st_a51458_0 *v6;  // x19
    st_a51458_0 **v7;  // x9
    long long v8;  // x1
    st_a51458_0 *v9;  // x2
    char *v0;  // [bp-0xa0]
    long long v1;  // [bp-0x90]
    char v2;  // [bp-0x88]
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    if (sub_9ca8cc(&v1, 0, 0, 0, a0))
    {
        v6 = sub_a5ba1c();
        if (v6)
        {
            if (sub_a5a05c(v6, sub_a99eac(v1)))
            {
                v7 = v6->field_8;
                if (v7[39])
                {
                    v7[39]();
                }
                else if (v7[8])
                {
                    v7[8]();
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/evp/evp_pkey.c", 56, "evp_pkcs82pkey_legacy");
                    v8 = 144;
                    v9 = 0;
                }
            }
            else
            {
                sub_a368c8(sub_9c3058(&v2, 80, v1), 80, v1);
                sub_a369bc("crypto/evp/evp_pkey.c", 42, "evp_pkcs82pkey_legacy");
                v0 = &v2;
                v9 = "TYPE=%s";
                v8 = 118;
            }
            sub_a36abc(6, v8, v9);
            sub_a5a4c8(v6);
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/evp_pkey.c", 36, "evp_pkcs82pkey_legacy");
            sub_a36abc(6, 0x80006, 0);
            if (*(long long *)&g_10002b0 == v3)
                return v6;
            ___stack_chk_fail();
        }
    }
    if (*(long long *)&g_10002b0 == v3)
        return 0;
    ___stack_chk_fail();
}
