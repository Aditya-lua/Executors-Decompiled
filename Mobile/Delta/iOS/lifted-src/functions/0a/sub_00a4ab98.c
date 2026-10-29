/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4ab98..0xa4abfc (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern void g_e9d050;

unsigned long long sub_a4ab98(unsigned long long a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v12;  // x0
    void* v13;  // x20
    unsigned long long v14;  // x21
    unsigned long long v15;  // x21
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (a0)
    {
        v0 = v7;
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = &v6;
        v5 = v11;
        v12 = sub_a4abfc();
        if (!(unsigned int)v12)
        {
            v13 = &g_e9d050;
            v14 = 82;
            do
            {
                v15 = v14;
                if (!sub_a6e200(*(long long *)((char *)v13 - 8), a0))
                {
                    v12 = *(int *)v13;
                    goto LABEL_a4abec;
                }
            } while ((v13 += 16, v14 = v15 - 1, v15 != 1));
            v12 = 0;
        }
LABEL_a4abec:
        a0 = v12;
    }
    return (unsigned int)a0;
}
