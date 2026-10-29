/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c6b84..0x1c6c68 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c6b84_1 {
    unsigned long long field_0;
    struct st_1c6b84_1 *field_8;
} st_1c6b84_1;

typedef struct st_1c6b84_2 {
    char padding_0[56];
    struct st_1c6b84_1 *field_38;
} st_1c6b84_2;

typedef struct st_1c6b84_0 {
    char field_0;
} st_1c6b84_0;

extern char g_e6fe58;

char * sub_1c6b84(st_1c6b84_2 *a0, char *a1, char *a2)
{
    char *v4;  // x0
    char *v5;  // x0
    st_1c6b84_1 *v6;  // x0
    st_1c6b84_1 *v7;  // x9
    st_1c6b84_1 *v8;  // x10
    st_1c6b84_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1c6b84_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_1a4808();
    if (v4 != a1)
        return v4;
    v5 = sub_1c4e68(a0, a1, a2);
    if (v5 != a1)
        return v5;
    if (a1 == a2 || *v5 != 46)
        return sub_1c2a28(a0, a1, a2);
    v6 = operatornew(16);
    v7 = a0->field_38;
    v8 = v7->field_8;
    v6->field_0 = &g_e6fe58;
    v6->field_8 = v8;
    v7->field_8 = v6;
    a0->field_38 = v6;
    return v5 + 1;
    return sub_1c2a28(a0, a1, a2);
}
