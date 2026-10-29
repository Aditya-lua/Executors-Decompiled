/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2b1d4c..0x2b1e28 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2b1d4c_1 {
    struct st_2b1d4c_1 *field_0;
    char field_1;
    char padding_2[6];
    long long field_8;
} st_2b1d4c_1;

typedef struct st_2b1d4c_0 {
    char field_0;
} st_2b1d4c_0;


long long sub_2b1d4c(long long a0, long long a1)
{
    long long v5;  // x0
    long long v6;  // x0
    long long v7;  // x19
    st_2b1d4c_1 *n;  // x20
    long long ptr;  // x21
    st_2b1d4c_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_2b1d4c_0 *v1;  // [bp-0x40]
    st_2b1d4c_1 *v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5 = sub_9d3c1c(sub_a38690());
    v6 = sub_9d8844(sub_9d3d74(v5, 0x100), 0x100);
    v7 = sub_9d4ec8(v5, sub_9d3c1c(v6));
    sub_9d3fec(v7, a0, a1);
    sub_9d46fc(v7, 11, 0, 0);
    v2 = 0;
    sub_9d46fc(v7, 115, 0, &v2);
    n = v2->field_0;
    ptr = _malloc((char *)&n->field_0 + 1);
    if (n)
        _memcpy(ptr, *(long long *)&v2->field_1, n);
    *(ptr + (char *)n) = 0;
    sub_9d5018(v7);
    return ptr;
}
