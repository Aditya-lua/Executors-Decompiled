/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae82d0..0xae83e8 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae82d0_0 {
    char padding_0[1];
    struct st_ae82d0_0 *field_1;
} st_ae82d0_0;


st_ae82d0_0 ** sub_ae82d0(st_ae82d0_0 **a0, unsigned int a1, st_ae82d0_0 **a2, st_ae82d0_0 **a3)
{
    st_ae82d0_0 **v2;  // w8
    unsigned long long v3;  // x23
    st_ae82d0_0 **v4;  // x25
    unsigned long long v5;  // x1
    st_ae82d0_0 **v6;  // x24
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        if (a3)
            v2 = (st_ae82d0_0 **)(*(int *)a3 + 1);
        else
            v2 = (st_ae82d0_0 **)0;
        v3 = v2 & ~(v2 >> 31);
        if ((int)sub_ad69e4(a0) > (int)v3)
        {
            v4 = 0;
            do
            {
                v5 = v3;
                v6 = sub_ad69f8(a0, v5);
                if (sub_a99eac(sub_a2d030(v6, v5)) != a1)
                {
                    v6 = v4;
                    continue;
                }
                else if (a3)
                {
                    *(unsigned int *)a3 = v3;
                    if (v6)
                        goto LABEL_ae83bc;
                    goto LABEL_ae8384;
                }
                else if (v4)
                {
                    if (a2)
                    {
                        *(unsigned int *)a2 = (unsigned int)0xfffffffe;
                        return 0;
                    }
                    return 0;
                }
            } while ((v3 = (unsigned int)v3 + 1, v4 = v6, (int)sub_ad69e4(a0) > (int)v3));
            if (v6)
            {
LABEL_ae83bc:
                if (a2)
                    *(unsigned int *)a2 = sub_af4068(v6);
            }
        }
    }
    if (a3)
    {
LABEL_ae8384:
        *(unsigned int *)a3 = (unsigned int)0xffffffff;
    }
    if (!a2)
        return 0;
    *(unsigned int *)a2 = (unsigned int)0xffffffff;
    return 0;
}
