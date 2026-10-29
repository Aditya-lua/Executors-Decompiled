/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae5fd8..0xae6168 (400 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c7c2eb;

int sub_ae5fd8(unsigned long a0, long long a1, long long a2, long long a3)
{
    long long *v4;  // x22
    unsigned long v5;  // x22
    long long *v6;  // x26
    long long v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if ((int)sub_ad69e4(a1) < 1)
        return 1;
    v4 = sub_ad69f8(a1, 0);
    if (*v4)
        sub_ae7138(a2);
    if (v4[1])
        sub_ae7210(a2, "Reasons");
    if (v4[2])
    {
        v0 = a3;
        v1 = &g_c7c2eb;
        sub_9d524c(a2, "%*sCRL Issuer:\n");
        sub_af091c(a2, v4[2], a3);
    }
    if ((int)sub_ad69e4(a1) < 2)
        return 1;
    v5 = 1;
    do
    {
        sub_9d4888(a2, "\n");
        v6 = sub_ad69f8(a1, v5);
        if (*v6)
            sub_ae7138(a2);
        if (v6[1])
            sub_ae7210(a2, "Reasons");
        if (v6[2])
        {
            v0 = a3;
            v1 = &g_c7c2eb;
            sub_9d524c(a2, "%*sCRL Issuer:\n");
            sub_af091c(a2, v6[2], a3);
        }
        v5 = (unsigned int)v5 + 1;
    } while ((int)sub_ad69e4(a1) > (int)v5);
    return 1;
}
