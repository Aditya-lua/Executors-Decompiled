/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafc97c..0xafca8c (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afc97c_0 {
    unsigned long long field_0;
} st_afc97c_0;


unsigned long long * sub_afc97c(unsigned long a0, st_afc97c_0 **a1, unsigned long a2, st_afc97c_0 **a3)
{
    unsigned long long *v2;  // x0
    unsigned long long *v3;  // x25
    st_afc97c_0 **iter;  // x8
    unsigned long long *v6;  // x0
    unsigned long long *v7;  // x0
    unsigned long long *v8;  // x24
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_afd31c(a1);
    if (!(unsigned int)v2)
        return v2;
    v3 = 0;
    iter = a1 + 1;
    while (1)
    {
        switch (*(int *)((char *)iter - 8))
        {
        case 2:
            iter += 2;
            continue;
        case 4:
            v3 = *iter;
            goto LABEL_afc9c4;
        case 0:
            if (!v3)
                return 0;
            goto LABEL_afc9f0;
        default:
LABEL_afc9c4:
            iter += 2;
            continue;
        }
    }
LABEL_afc9f0:
    v6 = sub_b5b0e4();
    *a3 = v6;
    if (v6)
    {
        v7 = sub_afd4a0();
        v8 = *a3;
        if (v7)
            v3();
    }
    else
    {
        v8 = 0;
    }
    sub_b5b0f8(v8);
    *a3 = 0;
    return 0;
}
