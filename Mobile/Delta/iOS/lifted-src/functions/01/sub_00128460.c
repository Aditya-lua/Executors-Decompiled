/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x128460..0x1284cc (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_128460_0 {
    char field_0;
} st_128460_0;

typedef struct st_128460_2 {
    unsigned long long field_0;
} st_128460_2;

typedef struct st_128460_1 {
    char padding_0[24];
    struct st_128460_2 *field_18;
} st_128460_1;

extern st_128460_1 *g_f0d3d8;
extern unsigned long long g_f0d528;

void sub_128460(unsigned long a0)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    st_128460_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_128460_0 *v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    v1 = &v0;
    v0 = &v1;
    _strlen(g_f0d528 + 176);
    g_f0d3d8->field_18();
}
