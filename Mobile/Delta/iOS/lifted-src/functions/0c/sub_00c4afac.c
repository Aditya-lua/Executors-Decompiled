/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4afac..0xc4b058 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c4afac_0 {
    long long field_0;
    char *field_8;
} st_c4afac_0;

typedef struct st_c4afac_1 {
    char *field_0;
    char *field_8;
    struct st_c4afac_0 *field_10;
    char *field_18;
} st_c4afac_1;


st_c4afac_1 * sub_c4afac(st_c4afac_1 *a0)
{
    char *v2;  // x20
    char *v3;  // x21
    st_c4afac_1 *v4;  // x0
    unsigned long long *v5;  // x22
    char *v6;  // x21
    char *v7;  // x20
    char **v8;  // x21
    char *v9;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    if (!v2)
        return a0;
    v3 = a0->field_8;
    v4 = a0;
    if (v4->field_8)
    {
        v5 = v2 + 8;
        do
        {
            v6 = v3;
            if (*(long long *)((char *)v5 - 8))
                _free(*v5);
        } while ((v5 += 3, v3 = v6 - 1, v6 != 1));
        v4 = _free(v2);
    }
    v7 = a0->field_18;
    if (!a0->field_18)
        return v4;
    v8 = &a0->field_10->field_8;
    do
    {
        v9 = v7;
        if (*v8)
            _free(*(long long *)((char *)v8 - 8));
    } while ((v8 += 4, v7 = v9 - 1, v9 != 1));
    return _free();
}
