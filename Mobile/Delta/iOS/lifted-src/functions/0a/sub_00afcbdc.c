/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafcbdc..0xafcd0c (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afcbdc_0 {
    unsigned long long field_0;
} st_afcbdc_0;


unsigned long long * sub_afcbdc(unsigned long a0, st_afcbdc_0 **a1, unsigned long a2, st_afcbdc_0 **a3)
{
    unsigned long long *v2;  // x0
    unsigned long long *v3;  // x0
    unsigned long long *v4;  // x25
    st_afcbdc_0 **iter;  // x8
    unsigned long long *v7;  // x0
    unsigned long long *v8;  // x0
    unsigned long long *v9;  // x24
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_afd31c(a1);
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_afda74(a1);
    if (!(unsigned int)v3)
        return v3;
    v4 = 0;
    iter = a1 + 1;
    while (1)
    {
        switch (*(int *)((char *)iter - 8))
        {
        case 2:
            iter += 2;
            continue;
        case 4:
            v4 = *iter;
            goto LABEL_afcc30;
        case 0:
            if (!v4)
                return 0;
            goto LABEL_afcc5c;
        default:
LABEL_afcc30:
            iter += 2;
            continue;
        }
    }
LABEL_afcc5c:
    v7 = sub_b5b0e4();
    *a3 = v7;
    if (v7)
    {
        v8 = sub_afd4a0();
        v9 = *a3;
        if (v8)
            v4();
    }
    else
    {
        v9 = 0;
    }
    sub_b5b0f8(v9);
    *a3 = 0;
    return 0;
}
