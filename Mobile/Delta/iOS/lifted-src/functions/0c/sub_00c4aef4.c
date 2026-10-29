/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4aef4..0xc4afac (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c4aef4_0 {
    long long field_0;
    char *field_8;
} st_c4aef4_0;

typedef struct st_c4aef4_1 {
    char *field_0;
    char *field_8;
    char *field_10;
    struct st_c4aef4_0 *field_18;
    char *field_20;
} st_c4aef4_1;


st_c4aef4_1 * sub_c4aef4(st_c4aef4_1 *a0)
{
    char *v2;  // x19
    char *v3;  // x21
    unsigned long long *v4;  // x22
    char *v5;  // x21
    char *v6;  // x20
    char **v7;  // x21
    char *v8;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_0)
        return a0;
    v2 = a0->field_8;
    if (!v2)
        return a0;
    v3 = a0->field_10;
    if (a0->field_10)
    {
        v4 = v2 + 8;
        do
        {
            v5 = v3;
            if (*(long long *)((char *)v4 - 8))
                _free(*v4);
        } while ((v4 += 3, v3 = v5 - 1, v5 != 1));
        _free(v2);
    }
    v6 = a0->field_20;
    if (!a0->field_20)
        return a0;
    v7 = &a0->field_18->field_8;
    do
    {
        v8 = v6;
        if (*v7)
            _free(*(long long *)((char *)v7 - 8));
    } while ((v7 += 4, v6 = v8 - 1, v8 != 1));
    return _free();
}
