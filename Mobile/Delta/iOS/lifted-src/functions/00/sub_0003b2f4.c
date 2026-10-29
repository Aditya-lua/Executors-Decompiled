/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3b2f4..0x3b374 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3b2f4_1 {
    struct st_3b2f4_2 *field_0;
    unsigned long long field_8;
} st_3b2f4_1;

typedef struct st_3b2f4_0 {
    char padding_0[16];
    long long field_10;
} st_3b2f4_0;

typedef struct st_3b2f4_2 {
    long long field_0;
} st_3b2f4_2;


long long sub_3b2f4(st_3b2f4_1 *a0, st_3b2f4_0 *a1)
{
    long long len;  // x0
    unsigned int v0;  // [bp-0x44]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    len = _strlen(a1->field_10);
    v0 = sub_2df40(*(long long *)a0->field_0, a1->field_10, len);
    sub_42648(a0->field_0, v0, a1 + 1);
    return sub_a390(a0->field_8 + 8, &v0);
}
