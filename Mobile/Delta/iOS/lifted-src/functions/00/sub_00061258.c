/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x61258..0x61304 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_61258_1 {
    struct st_61258_2 *field_0;
    long long field_8;
} st_61258_1;

typedef struct st_61258_2 {
    unsigned long long field_0;
} st_61258_2;

typedef struct st_61258_0 {
    char field_0;
} st_61258_0;


void sub_61258(st_61258_1 *a0, st_61258_2 **a1, uint128_t *a2, long long a3, unsigned long a4)
{
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long *v16;  // x21
    st_61258_0 **v0;  // [bp-0x68], Other Possible Types: char
    st_61258_0 *v1;  // [bp-0x60]
    char v2;  // [bp-0x58]
    uint128_t v3;  // [bp-0x40]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v4 = v11;
    v5 = v12;
    v6 = v13;
    v7 = v14;
    v8 = &v10;
    v9 = v15;
    v1 = &v0;
    v0 = &v1;
    v16 = a0->field_0;
    if (a0->field_8 & 1)
        v16 = *(long long *)(*(long long *)((char *)*a1 + (a0->field_8 >> 1)) + (a0->field_0 & 0xffffffff));
    v3 = *a2;
    *(unsigned long long *)a2 = 0;
    *(unsigned long long *)((char *)a2 + 8) = 0;
    sub_5c38(&v2, a3);
    v16();
}
