/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bc2c4..0x1bc374 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bc2c4_1 {
    unsigned int field_0;
    unsigned int field_4;
    long long field_8;
    long long field_10;
    unsigned int field_14;
    char field_18;
    char padding_19[7];
    char field_20;
    char padding_21[3];
    unsigned int field_24;
} st_1bc2c4_1;

typedef struct st_1bc2c4_0 {
    char field_0;
} st_1bc2c4_0;


st_1bc2c4_1 * sub_1bc2c4(st_1bc2c4_1 *a0, long long a1)
{
    unsigned int v4;  // w0
    long long str;  // x0
    long long len1;  // x0
    st_1bc2c4_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1bc2c4_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    *(char *)&a0->field_0 = 0;
    *(uint128_t *)((char *)&a0->field_10 + 4) = 0;
    *(unsigned int *)&a0->field_20 = 0;
    *(uint128_t *)&a0->field_4 = 0;
    v4 = sub_3d78c0(a1, &a0->field_10, &a0->field_14, &a0->padding_19[3], &a0->field_4);
    *(char *)&a0->field_0 = v4 != 0;
    if (!v4)
        return a0;
    str = _strdup(a1);
    a0->field_8 = str;
    sub_3d9890(str, _strlen(str));
    len1 = _strlen(a0->field_10);
    sub_3d9890(a0->field_10, len1);
    return a0;
}
