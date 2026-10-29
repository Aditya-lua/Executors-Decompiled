/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaaca2c..0xaacac4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aaca2c_0 {
    struct st_aaca2c_0 *field_0;
} st_aaca2c_0;


st_aaca2c_0 ** sub_aaca2c(unsigned long a0, unsigned long a1, unsigned long a2, st_aaca2c_0 **a3)
{
    st_aaca2c_0 **v3;  // w0
    long long v4;  // x19
    long long v5;  // x20
    st_aaca2c_0 **v0;  // [bp-0x24]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = (st_aaca2c_0 **)0;
    v3 = (st_aaca2c_0 **)(unsigned int)sub_aaf01c();
    if (!v3)
        return v3;
    if (!a3 || *(int *)a3 >= 0)
    {
        if (v0 == 1)
            return 1;
        v4 = 139;
        v5 = 604;
    }
    else
    {
        v4 = 150;
        v5 = 596;
    }
    sub_a368c8();
    sub_a369bc("crypto/rsa/rsa_ameth.c", v5, "rsa_pss_verify_param");
    sub_a36abc(4, v4, 0);
    return 0;
}
