/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa646b8..0xa647a0 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e9fb40;
extern char g_e9fb88;
extern char g_e9fbd0;
extern char g_e9fc18;
extern char g_e9fc60;

int sub_a646b8(long long a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a6e200())
    {
        return &g_e9fb40;
    }
    else if (!sub_a6e200(a0, "P-384"))
    {
        return &g_e9fb88;
    }
    else if (!sub_a6e200(a0, "P-521"))
    {
        return &g_e9fbd0;
    }
    else if (!sub_a6e200(a0, "X25519"))
    {
        return &g_e9fc18;
    }
    else if (sub_a6e200(a0, "X448"))
    {
        sub_a368c8();
        sub_a369bc("crypto/hpke/hpke_util.c", 168, "ossl_HPKE_KEM_INFO_find_curve");
        sub_a36abc(57, 176, 0);
        return 0;
    }
    else
    {
        return &g_e9fc60;
    }
}
