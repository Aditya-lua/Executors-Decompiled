/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5b060..0xa5b298 (568 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_e9f7e0;
extern unsigned int g_e9f7f0;
extern unsigned int g_e9f800;
extern unsigned int g_e9f810;
extern unsigned int g_e9f820;
extern unsigned int g_e9f830;
extern unsigned int g_e9f840;
extern unsigned int g_e9f850;
extern unsigned int g_e9f860;
extern unsigned int g_e9f870;
extern unsigned int g_e9f880;
extern unsigned int g_e9f890;

unsigned int * sub_a5b060(long long a0)
{
    unsigned int *v3;  // x0
    unsigned long v4;  // x20
    unsigned int *v5;  // x0
    unsigned int *v6;  // x19
    unsigned long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!sub_a6e200())
    {
        return g_e9f7e0;
    }
    else if (!sub_a6e200(a0, "RSA-PSS"))
    {
        return g_e9f7f0;
    }
    else if (!sub_a6e200(a0, "EC"))
    {
        return g_e9f800;
    }
    else if (!sub_a6e200(a0, "ED25519"))
    {
        return g_e9f810;
    }
    else if (!sub_a6e200(a0, "ED448"))
    {
        return g_e9f820;
    }
    else if (!sub_a6e200(a0, "X25519"))
    {
        return g_e9f830;
    }
    else if (!sub_a6e200(a0, "X448"))
    {
        return g_e9f840;
    }
    else if (!sub_a6e200(a0, "SM2"))
    {
        return g_e9f850;
    }
    else if (!sub_a6e200(a0, "DH"))
    {
        return g_e9f860;
    }
    else if (!sub_a6e200(a0, "X9.42 DH"))
    {
        return g_e9f870;
    }
    else if (!sub_a6e200(a0, "DHX"))
    {
        return g_e9f880;
    }
    else if (sub_a6e200(a0, "DSA"))
    {
        v3 = sub_9c5df4(&v0, sub_a998f4(a0));
        if (v3)
        {
            v4 = *v3;
            sub_a32e7c(v0);
            if ((unsigned int)v4)
                return v4;
        }
        else
        {
            sub_a32e7c(v0);
        }
        v5 = sub_9c5df4(&v0, sub_a99a1c(a0));
        if (v5)
            v6 = *v5;
        else
            v6 = 0;
        sub_a32e7c(v0);
        return v6;
    }
    else
    {
        return g_e9f890;
    }
}
