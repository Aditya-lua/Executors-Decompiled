/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e6138..0x9e620c (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e6138_0 {
    char padding_0[16];
    unsigned int field_10;
} st_9e6138_0;

extern unsigned long long g_9db29c;

int sub_9e6138(st_9e6138_0 *a0, unsigned long a1, unsigned long a2, st_9e6138_0 *a3, long long a4)
{
    unsigned int v2;  // w0
    unsigned int v3;  // w0
    unsigned long long v4;  // x3
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9db58c();
    if (!v2)
    {
        return v2;
    }
    else if (a0 != a3)
    {
        v3 = sub_9de520(0, a0, a0, a3, a4);
        if (!v3)
        {
            return v3;
        }
        else if (a0->field_10)
        {
            if (!a3->field_10)
                v4 = &g_9db29c;
            else
                v4 = sub_9db58c;
            goto *((void *)(v4));
        }
        else
        {
            return 1;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_mod.c", 22, "BN_nnmod");
        sub_a36abc(3, 0x80106, 0);
        return 0;
    }
}
