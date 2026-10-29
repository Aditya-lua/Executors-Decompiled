/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae7210..0xae72f8 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c7c2eb;
extern unsigned long long g_eb6e08;

void sub_ae7210(long long a0, unsigned long long a1, long long a2, unsigned long long a3)
{
    unsigned long long v14;  // x24
    unsigned long long v15;  // x23
    unsigned long long idx;  // x23
    unsigned long long v16;  // x22
    unsigned long long v17;  // x21
    unsigned long long v18;  // x20
    unsigned long long v19;  // x19
    unsigned long long v20;  // x30
    unsigned long long v21;  // x24
    unsigned long long v22;  // x23
    unsigned long long v23;  // x22
    unsigned long long v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x68]
    unsigned long long v2;  // [bp-0x60]
    unsigned long v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x40]
    unsigned long long v6;  // [bp-0x38]
    unsigned long long v7;  // [bp-0x30]
    unsigned long long v8;  // [bp-0x28]
    unsigned long long v9;  // [bp-0x20]
    unsigned long long v10;  // [bp-0x18]
    char *v11;  // [bp-0x10]
    unsigned long long v12;  // [bp-0x8]
    char v13;  // [bp+0x0]

    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = v17;
    v9 = v18;
    v10 = v19;
    v11 = &v13;
    v12 = v20;
    v3 = (unsigned int)a3 + 2;
    v4 = &g_c7c2eb;
    v0 = a3;
    v1 = &g_c7c2eb;
    v2 = a1;
    sub_9d524c();
    v21 = 0;
    v22 = &g_eb6e08;
    v23 = "Unused";
    while (1)
    {
        while (1)
        {
            idx = v22;
            if (!sub_9c064c(a2))
            {
                v23 = *(long long *)(idx + 32);
                if (*(long long *)(idx + 32))
                {
                    v22 = idx + 24;
                }
                else
                {
                    if (!(v21 & 1))
                    {
LABEL_ae72dc:
                        sub_9d4888();
                        return;
                    }
LABEL_ae72c8:
                    goto LABEL_ae72dc;
                }
            }
            else
            {
                if (v21 & 1)
                    sub_9d4888(a0, ", ");
                sub_9d4888(a0, v23);
                v23 = *(long long *)(idx + 32);
                v22 = idx + 24;
                v21 = 1;
                if (*(long long *)(idx + 32))
                    break;
                else
                    goto LABEL_ae72c8;
                goto LABEL_ae72c8;
            }
        }
    }
}
