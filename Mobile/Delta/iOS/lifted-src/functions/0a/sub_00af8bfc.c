/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf8bfc..0xaf8cf4 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af8bfc_0 {
    struct st_af8bfc_0 *field_0;
    struct st_af8bfc_0 *field_8;
} st_af8bfc_0;


st_af8bfc_0 * sub_af8bfc(st_af8bfc_0 *a0, long long a1, st_af8bfc_0 *a2, unsigned int a3)
{
    unsigned int v2;  // w0
    st_af8bfc_0 *v3;  // x23
    st_af8bfc_0 *v4;  // x23
    st_af8bfc_0 *v5;  // x0
    st_af8bfc_0 *v6;  // x8
    st_af8bfc_0 *v7;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return 0xffffffff;
    v2 = sub_ad69e4(a0->field_0);
    v3 = 0;
    while (1)
    {
        v4 = v3;
        if ((v2 & ~((int)(v2) >> 31)) == (unsigned int)v4)
            break;
        v3 = (unsigned int)v4 + 1;
        if (!sub_a9ae30(*(long long *)sub_ad69f8(a0->field_0, v4), a1))
        {
            if ((int)sub_ad69e4(a0->field_0) > (int)((unsigned int)v3 - 1) && (v5 = sub_ad69f8(a0->field_0), v5))
            {
                v6 = v5->field_8;
                if (a2)
                    goto LABEL_af8cbc;
            }
            else
            {
                v6 = 0;
                if (a2)
                {
LABEL_af8cbc:
                    if ((int)a3 < 1)
                        return 0;
                    if ((int)v6->field_0 < (int)a3)
                        v7 = (int)v6->field_0;
                    else
                        v7 = a3 - 1;
                    _memcpy();
                    *(char *)(a2 + v7) = 0;
                    return v7;
                }
            }
            return (int)v6->field_0;
        }
    }
    return 0xffffffff;
}
