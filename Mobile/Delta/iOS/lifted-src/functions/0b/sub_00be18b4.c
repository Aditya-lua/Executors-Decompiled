/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe18b4..0xbe1ca0 (1004 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be18b4_0 {
    unsigned long long field_0;
    void* field_8;
    struct st_be18b4_0 *field_10;
} st_be18b4_0;

extern char g_e067f6;

unsigned long long sub_be18b4(st_be18b4_0 *a0, st_be18b4_0 *a1)
{
    unsigned long v2;  // x8
    st_be18b4_0 *v3;  // x19
    st_be18b4_0 *v4;  // x20
    unsigned long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    if (a0->field_0 != a1->field_0)
        return 0;
    do
    {
        v3 = a1;
        v4 = a0;
        if (v2 != 7)
            goto *((void *)(sub_be192c + (&g_e067f6)[v2] * 4));
        v5 = sub_be18b4(v4->field_8, v3->field_8);
        if (!(unsigned int)v5)
            return v5;
        a0 = v4->field_10;
        a1 = v3->field_10;
        v2 = v4->field_10->field_0;
    } while (v4->field_10->field_0 == v3->field_10->field_0);
    return 0;
}
