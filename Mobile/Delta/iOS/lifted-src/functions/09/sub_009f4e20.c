/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f4e20..0x9f4e78 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f4e20_0 {
    char padding_0[16];
    struct st_9f4e20_1 *field_10;
} st_9f4e20_0;

typedef struct st_9f4e20_1 {
    unsigned long long field_0;
} st_9f4e20_1;

extern st_9f4e20_0 *g_f127b8;

void sub_9f4e20(unsigned long a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_9f4e20_0 *v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = g_f127b8;
    if (!g_f127b8)
    {
        v8 = sub_9f3178(NULL);
        g_f127b8 = v8;
    }
    v8->field_10();
}
