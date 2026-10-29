/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa71ac4..0xa71bbc (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a71ac4_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    struct st_a71ac4_0 *field_10;
    struct st_a71ac4_0 *field_18;
    char padding_20[8];
    struct st_a71ac4_0 *field_28;
} st_a71ac4_0;


st_a71ac4_0 * sub_a71ac4(st_a71ac4_0 *a0, st_a71ac4_0 *a1, st_a71ac4_0 *a2, long long *a3)
{
    st_a71ac4_0 *v3;  // x21
    st_a71ac4_0 *v4;  // x21
    st_a71ac4_0 *v5;  // x22
    char v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0;
    if (a2)
    {
        if (!sub_c68800(&v0, a2, *a3, 0))
            return 0;
    }
    else
    {
        if (!sub_a6ea2c(&v0, 0))
            return 0;
    }
    if (!v3)
    {
LABEL_a71b5c:
        if (sub_c68eb8(&v0, a3))
        {
            v5 = sub_a6eaf8(&v0) != 0;
            sub_a6ed4c(&v0);
            return v5;
        }
    }
    else if (v3->field_8 == 5)
    {
LABEL_a71b14:
        if (!v3->field_10 || !v3->field_18 || sub_a6ebd4(&v0))
        {
            v4 = v3;
            if (a1)
            {
                while (1)
                {
                    v3 = &v4->field_28;
                    if (!v4->field_28)
                        break;
                    v4 = v3;
                    if (!_strcmp(a1))
                    {
                        if (v3->field_8 != 5)
                        {
                            sub_a6ed4c(&v0);
                            return 0;
                        }
                        goto LABEL_a71b14;
                    }
                }
            }
            goto LABEL_a71b5c;
        }
    }
    sub_a6ed4c(&v0);
    return 0;
}
