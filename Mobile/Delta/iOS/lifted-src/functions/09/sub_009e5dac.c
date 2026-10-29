/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e5dac..0x9e5e68 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_9db29c;
extern unsigned long long g_9db58c;

int sub_9e5dac(void* a0, long long a1, void* a2, long long a3)
{
    unsigned int v2;  // w0
    unsigned long long v3;  // x3
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 == a2)
    {
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_mod.c", 22, "BN_nnmod");
        sub_a36abc(3, 0x80106, 0);
        return 0;
    }
    v2 = sub_9de520(0, a0, a1, a2, a3);
    if (!v2)
    {
        return v2;
    }
    else if ((int)a0[16])
    {
        if (!(int)a2[16])
            v3 = &g_9db29c;
        else
            v3 = &g_9db58c;
        goto *((void *)(v3));
    }
    else
    {
        return 1;
    }
}
