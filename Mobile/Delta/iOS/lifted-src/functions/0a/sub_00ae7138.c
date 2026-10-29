/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae7138..0xae7210 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae7138_0 {
    long long field_0;
    unsigned long long field_8;
} st_ae7138_0;

extern long long g_82031f;
extern unsigned long long g_c7c2eb;

long long sub_ae7138(long long a0, st_ae7138_0 *a1, unsigned long long a2)
{
    unsigned long long v0;  // [bp-0x80]
    unsigned long long v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x70]
    unsigned long long v3;  // [bp-0x68]
    unsigned long v4;  // [bp-0x58]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    if (!(int)a1->field_0)
    {
        v0 = a2;
        v1 = &g_c7c2eb;
        sub_9d524c();
        sub_af091c(a0, a1->field_8, a2);
        return sub_9d4888();
    }
    v4 = a1->field_8;
    v2 = (unsigned int)a2 + 2;
    v3 = &g_c7c2eb;
    v0 = a2;
    v1 = &g_c7c2eb;
    sub_9d524c();
    sub_9c3834(a0, &v4, 0, &g_82031f);
    return sub_9d4888(a0, "\n");
}
