/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb35f80..0xb3612c (428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b35f80_0 {
    unsigned short field_0;
    char padding_2[22];
    long long field_18;
    long long field_20;
    char padding_28[16];
    unsigned long long field_38;
} st_b35f80_0;

extern long long g_dfe4c7;
extern char g_10002b0;

long long sub_b35f80(long long *a0, long long a1, unsigned long long a2, unsigned long long a3)
{
    st_b35f80_0 *v8;  // x21
    long long v9;  // x20
    long long v10;  // x19
    long long v11;  // x0
    unsigned long v12;  // x8
    unsigned long long v0;  // [bp-0xb0]
    unsigned long long v1;  // [bp-0xa8]
    unsigned long long v2;  // [bp-0xa0]
    unsigned short v3;  // [bp-0x8a]
    char v4;  // [bp-0x88]
    unsigned long v5;  // [bp-0x48]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v8 = sub_a646b8();
    if (v8->field_38 > a3)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kem/ecx_kem.c", 350, "ossl_ecx_dhkem_derive_private");
        v0 = a3;
        v1 = v8->field_38;
        sub_a36abc(57, 230, "ikm length is :%zu, should be at least %zu");
        v9 = 0;
        v10 = 0;
        goto LABEL_b360e0;
    }
    else
    {
        v11 = sub_a64d0c("HKDF", v8->field_18, *a0, a0[1]);
        if (v11)
        {
            v10 = v11;
            v12 = v8->field_0;
            v3 = (((((v12 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v12 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v12 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v12 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
            v1 = a2;
            v2 = a3;
            v0 = "dkp_prk";
            if (sub_a64954())
                v9 = sub_a64b24(v10, a1, v8->field_38, &v4, v8->field_20, &g_dfe4c7, &v3, 2, "sk", 0, 0) != 0;
            else
                v9 = 0;
LABEL_b360e0:
            sub_a66ec0(&v4, 64);
            sub_a53588(v10);
        }
        else
        {
            v9 = 0;
        }
    }
    if (*(long long *)&g_10002b0 == v5)
        return v9;
    ___stack_chk_fail();
}
