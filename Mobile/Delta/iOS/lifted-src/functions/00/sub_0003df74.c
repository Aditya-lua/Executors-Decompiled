/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3df74..0x3e034 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3df74_0 {
    char padding_0[16];
    struct st_3df74_1 *field_10;
    struct st_3df74_2 *field_18;
    unsigned long long field_20;
    struct st_3df74_2 *field_28;
} st_3df74_0;

typedef struct st_3df74_1 {
    long long field_0;
} st_3df74_1;

typedef struct st_3df74_2 {
    char field_0;
} st_3df74_2;


long long sub_3df74(st_3df74_0 *a0, long long *a1)
{
    long long *v3;  // x21
    long long len;  // x0
    unsigned int v0;  // [bp-0x44]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0->field_10;
    sub_39788(v3, a1[8], *(char *)a0->field_18);
    len = _strlen(a1[5]);
    v0 = sub_2df40(*v3, a1[5], len);
    sub_42648(v3, v0, a1[8] + 12);
    sub_a390(a0->field_20 + 32, &v0);
    sub_2ad10(*v3, 86, *(char *)a0->field_28, 0, *(char *)a0->field_18);
    return sub_31514(*v3, v0);
}
