/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ac528..0x1ac5cc (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ac528_2 {
    char padding_0[16];
    struct st_1ac528_1 *field_10;
} st_1ac528_2;

typedef struct st_1ac528_1 {
    struct st_1ac528_1 *field_0;
} st_1ac528_1;

typedef struct st_1ac528_0 {
    char field_0;
} st_1ac528_0;


st_1ac528_1 ** sub_1ac528(st_1ac528_2 *a0, st_1ac528_1 **a1)
{
    st_1ac528_1 **v2;  // x8
    st_1ac528_1 **v3;  // x11
    st_1ac528_1 **v12;  // w12
    st_1ac528_1 **v4;  // x8
    st_1ac528_1 **v5;  // x8
    st_1ac528_1 **v6;  // x9
    st_1ac528_1 **v7;  // x10
    st_1ac528_1 **v8;  // x12
    st_1ac528_1 **v9;  // x12
    char *v11;  // x11
    st_1ac528_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1ac528_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_10;
    if (!a0->field_10)
        return 0;
    v3 = 0;
    do
    {
        v4 = v2;
        v5 = (char *)v4 + 1;
        v3 = (char *)v3 - 1;
        v2 = v5;
    } while (*(char *)v4);
    v6 = 0;
    v7 = v3;
    v8 = a1;
    do
    {
        v9 = v8;
        v7 = (char *)v7 + 1;
        v6 = (char *)v6 - 1;
        v8 = (char *)v9 + 1;
    } while (*(char *)v9);
    if (v3 > v6)
        return 0;
    v11 = v5 + v6;
    do
    {
        v12 = (st_1ac528_1 **)*v11;
        if (v12 != *(char *)a1)
            return 0;
    } while ((a1 = (char *)a1 + 1, v11 += 1, v12));
    if (!v7)
        return 1;
    return *(char *)(v5 + v6 - 1) == 46;
}
