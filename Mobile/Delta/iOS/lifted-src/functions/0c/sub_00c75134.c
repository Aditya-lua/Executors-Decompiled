/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc75134..0xc75224 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c75134_0 {
    struct st_c75134_0 *field_0;
    struct st_c75134_0 *field_8;
} st_c75134_0;


st_c75134_0 * sub_c75134(st_c75134_0 *a0, st_c75134_0 *a1, long long a2, st_c75134_0 *a3, st_c75134_0 *a4, st_c75134_0 *a5)
{
    st_c75134_0 *v4;  // x9
    st_c75134_0 *v5;  // x8
    unsigned long long v6;  // x10
    st_c75134_0 *v7;  // x0
    st_c75134_0 *v8;  // x20
    st_c75134_0 *v9;  // x8
    st_c75134_0 **v10;  // x9
    st_c75134_0 *v11;  // x0
    st_c75134_0 *v0;  // [bp-0x40]
    st_c75134_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = 0;
    v5 = 1;
    v6 = 8;
    v7 = a0;
    if (a5 * a3 <= 0xffffffffffffffff)
    {
        v8 = a3 * a5;
        v7 = a0;
        if (-0x1 * a4 + 0x8000000000000000 >= v8)
        {
            if (a1)
            {
                v9 = a5 * a1;
                v1 = a4;
                v10 = &v0;
            }
            else
            {
                v9 = 0;
                v10 = &v1;
            }
            *v10 = v9;
            if (v1)
            {
                if (v0)
                {
                    v7 = sub_b718c0(a2);
                    if (!v7)
                        goto LABEL_c751f8;
                    goto LABEL_c751e4;
                }
                if (v8)
                {
LABEL_c751d4:
                    v7 = sub_b71868(v8, a4);
                    if (!v7)
                        goto LABEL_c751f8;
LABEL_c751e4:
                    v5 = 0;
                    a0->field_8 = v7;
                }
                else
                {
                    v7 = a4;
                    if (a4)
                        goto LABEL_c751e4;
LABEL_c751f8:
                    a0->field_8 = a4;
                    v5 = 1;
                }
            }
            else
            {
                if (v8)
                    goto LABEL_c751d4;
                v7 = a4;
                goto LABEL_c751e4;
            }
            v6 = 16;
            v4 = v8;
        }
    }
    v11 = v7;
    *(st_c75134_0 **)((char *)a0 + v6) = v4;
    a0->field_0 = v5;
    return v11;
}
