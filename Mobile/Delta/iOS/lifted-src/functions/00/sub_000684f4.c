/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x684f4..0x68538 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_684f4_1 {
    struct st_684f4_2 *field_0;
    long long field_8;
} st_684f4_1;

typedef struct st_684f4_2 {
    unsigned long long field_0;
} st_684f4_2;

typedef struct st_684f4_0 {
    char field_0;
} st_684f4_0;


void sub_684f4(st_684f4_1 *a0, st_684f4_2 **a1)
{
    unsigned long long v5;  // x30
    unsigned long long *v6;  // x8
    st_684f4_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_684f4_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v2 = &v4;
    v3 = v5;
    v1 = &v0;
    v0 = &v1;
    v6 = a0->field_0;
    if (a0->field_8 & 1)
        v6 = *(long long *)(*(long long *)((char *)*a1 + (a0->field_8 >> 1)) + (a0->field_0 & 0xffffffff));
    v6();
}
