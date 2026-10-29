/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a5c84..0x1a5cdc (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a5c84_0 {
    char padding_0[288];
    unsigned long long field_120;
} st_1a5c84_0;

extern char g_10001c8;

void sub_1a5c84(st_1a5c84_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    a0->field_120 = &g_10001c8;
    sub_181a8(&a0->padding_0[96]);
    sub_181a8(&a0->padding_0[64]);
    sub_181a8(&a0->padding_0[32]);
    sub_181a8();
    return;
}
