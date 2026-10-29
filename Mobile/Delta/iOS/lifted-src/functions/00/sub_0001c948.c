/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c948..0x1c9f0 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c948_1 {
    char padding_0[128];
    unsigned int field_80;
} st_1c948_1;

typedef struct st_1c948_0 {
    char field_0;
} st_1c948_0;

extern unsigned long long g_e62c68;

long long sub_1c948(st_1c948_1 *a0)
{
    unsigned long long v5;  // x30
    unsigned int v6;  // w8
    unsigned long long v7;  // x9
    unsigned long long v8;  // x8
    st_1c948_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_1c948_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v2 = &v4;
    v3 = v5;
    v1 = &v0;
    v0 = &v1;
    v6 = a0->field_80;
    v7 = 24;
    if (v6 == 279)
        v7 = 0;
    if (v6 == 269)
        v7 = 8;
    v8 = 16;
    if (v6 == 278)
        v7 = v8;
    goto *((void *)(*(long long *)((char *)&g_e62c68 + v7)));
}
