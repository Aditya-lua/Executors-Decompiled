/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f2df0..0x9f2e60 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f2df0_0 {
    char padding_0[16];
    struct st_9f2df0_0 *field_10;
} st_9f2df0_0;

extern long long g_9f2e60;
extern long long g_9f2e94;

int sub_9f2df0(st_9f2df0_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_9f2df0_0 *v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return (unsigned int)a0;
    if (a0->field_10)
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_a66520(sub_a66530(&g_9f2e60, &g_9f2e94), " ", "@", " ", "@");
    a0->field_10 = v8;
    a0 = v8;
    if (!a0)
        return (unsigned int)a0;
    return 1;
}
