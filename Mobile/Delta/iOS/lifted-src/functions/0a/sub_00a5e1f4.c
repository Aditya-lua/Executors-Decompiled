/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5e1f4..0xa5e2fc (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5e1f4_0 {
    struct st_a5e1f4_0 *field_0;
} st_a5e1f4_0;


unsigned long long sub_a5e1f4(st_a5e1f4_0 **a0, long long a1, long long a2, long long a3, int a4, long long a5)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // 4112
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/pmeth_lib.c", 1346, "EVP_PKEY_CTX_ctrl");
        sub_a36abc(6, 147, 0);
        return 0xfffffffe;
    }
    sub_a36c8c();
    v2 = sub_a5e6d0(a0, a1, a2, a3, 0, a5, a4);
    v3 = arm64g_calculate_condition(0x11, v2 & 0xffffffff, 2, 0);
    if (!(v3 & 1))
    {
        sub_a36cd4();
    }
    else
    {
        sub_a36e70();
        if ((int)v2 < 1)
        {
            return v2;
        }
        else if (!*(int *)a0)
        {
            return 1;
        }
    }
}
