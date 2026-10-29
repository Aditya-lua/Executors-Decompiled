/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb74c..0xb814 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b74c_2 {
    long long field_0;
    char padding_8[4];
    unsigned int field_c;
} st_b74c_2;

typedef struct st_b74c_1 {
    char padding_0[48];
    long long field_30;
} st_b74c_1;

typedef struct st_b74c_0 {
    char field_0;
} st_b74c_0;


long long sub_b74c(st_b74c_1 *a0, char *a1, unsigned long long n)
{
    st_b74c_2 *v7;  // x21
    long long v8;  // x22
    unsigned int v9;  // w8
    st_b74c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_b74c_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x40]
    unsigned int v3;  // [bp-0x38]
    unsigned int v4;  // [bp-0x34]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v2 = a1;
    v0 = &v1;
    v3 = n;
    v4 = 0;
    sub_a328();
    v7 = sub_9ea8(a0, &v2);
    if (v7->field_c)
        return v7->field_0;
    v8 = sub_404c(a0->field_30, n + 1);
    _memcpy(v8, a1, n);
    *(char *)(v8 + n) = 0;
    v7->field_0 = v8;
    if (*a1 == 64)
        v9 = 284;
    else
        v9 = 281;
    v7->field_c = v9;
    return v8;
}
