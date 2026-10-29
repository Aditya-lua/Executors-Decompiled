/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa71994..0xa71ac4 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a71994_0 {
    struct st_a71994_0 *field_0;
    char padding_8[32];
    struct st_a71994_0 *field_28;
} st_a71994_0;


st_a71994_0 * sub_a71994(st_a71994_0 *a0, st_a71994_0 *a1, st_a71994_0 **a2, st_a71994_0 **a3, st_a71994_0 *a4)
{
    st_a71994_0 *v3;  // x22
    st_a71994_0 *v4;  // x0
    st_a71994_0 *v5;  // x0
    st_a71994_0 *v6;  // x23
    st_a71994_0 *v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a0 || !a1 || !a0->field_0)
        return 0xffffffff;
    do
    {
        v3 = a0;
        if (!_strcmp(a1))
        {
            v0 = 0;
            v4 = sub_a71ac4(v3, a1, 0, &v0);
            if (!(unsigned int)v4)
                return v4;
            if (a4 && v0 > a4)
                return 0;
            if (v0)
            {
                v5 = sub_a6bf4c();
                if (!v5)
                    return v5;
                v6 = v5;
                if (sub_a71ac4(v3, a1, v6, &v0))
                {
                    sub_a6c4e8(*a2, *a3, "crypto/params.c", 1648);
                    *a2 = v6;
                    *a3 = v0;
                    return 1;
                }
                sub_a6c4e8(v6, v0, "crypto/params.c", 1643);
            }
            else
            {
                v6 = sub_a6bffc(1);
                if (v6)
                {
                    sub_a6c4e8(*a2, *a3, "crypto/params.c", 1648);
                    *a2 = v6;
                    *a3 = v0;
                    return 1;
                }
                return v6;
            }
            return 0;
        }
    } while ((a0 = &v3->field_28, v3->field_28));
    return 0xffffffff;
}
