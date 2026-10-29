/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5bfbc..0xa5c03c (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5bfbc_0 {
    struct st_a5bfbc_0 *field_0;
    char padding_8[88];
    struct st_a5bfbc_0 *field_60;
    long long field_68;
} st_a5bfbc_0;


st_a5bfbc_0 * sub_a5bfbc(st_a5bfbc_0 *a0, unsigned long a1)
{
    st_a5bfbc_0 *v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
LABEL_a5c004:
        sub_a368c8();
        sub_a369bc("crypto/evp/p_lib.c", 2466, "EVP_PKEY_get_params");
        sub_a36abc(6, 163, 0);
        return 0;
    }
    if (a0->field_60)
    {
        v2 = (st_a5bfbc_0 *)(unsigned int)sub_a55b74(a0->field_60, a0->field_68);
    }
    else
    {
        if (!(int)a0->field_0)
            goto LABEL_a5c004;
        v2 = (st_a5bfbc_0 *)(unsigned int)sub_a3bab0();
    }
    return v2 > 0;
}
