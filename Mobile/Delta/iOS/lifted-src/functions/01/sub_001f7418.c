/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f7418..0x1f7538 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f7418_0 {
    char field_0;
} st_1f7418_0;

extern unsigned long long g_e78df0;
extern unsigned long long g_e78e18;
extern unsigned long long g_e78e20;

long long sub_1f7418(unsigned long long *a0, unsigned long long *a1)
{
    unsigned long long v11;  // x24
    unsigned long long v12;  // x23
    unsigned long long v13;  // x22
    unsigned long long v14;  // x21
    unsigned long long v15;  // x20
    unsigned long long v16;  // x19
    unsigned long long v17;  // x30
    unsigned long long v18;  // x23
    unsigned long long v19;  // x22
    unsigned long long *v20;  // x21
    st_1f7418_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1f7418_0 *v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = &v10;
    v9 = v17;
    v1 = &v0;
    v0 = &v1;
    if (a0[1] == a1[1])
    {
        if (a0[1])
        {
            v18 = 0;
            v19 = 0;
            while (sub_1f1298(*a0 + v18, *a1 + v18) & 1)
            {
                v19 += 1;
                v18 += 8;
                if (v19 >= a0[1])
                    goto *((void *)(g_e78e18));
            }
            if (!v19)
                v20 = &g_e78e20;
            else
                v20 = &g_e78df0;
            goto *((void *)(*v20));
        }
        else
        {
            goto *((void *)(g_e78e18));
        }
    }
    else
    {
        if (sub_1f0bd4(a0, a1))
            return 1;
        return 2;
    }
}
