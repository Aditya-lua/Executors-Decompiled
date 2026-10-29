/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe827c..0xbe82fc (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be827c_2 {
    char padding_0[8];
    struct st_be827c_0 *field_8;
    struct st_be827c_3 *field_10;
} st_be827c_2;

typedef struct st_be827c_0 {
    char padding_0[24];
    struct st_be827c_1 *field_18;
    unsigned long long field_20;
} st_be827c_0;

typedef struct st_be827c_1 {
    unsigned long long field_0;
} st_be827c_1;

typedef struct st_be827c_3 {
    char field_0;
} st_be827c_3;


void sub_be827c(st_be827c_2 *a0, unsigned int a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_be827c_0 *v12;  // x21
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a0->field_8;
    if (*(char *)a0->field_10 & 1)
        v12->field_18();
    *(char *)a0->field_10 = a1 == 10;
    goto *((void *)(v12->field_20));
}
