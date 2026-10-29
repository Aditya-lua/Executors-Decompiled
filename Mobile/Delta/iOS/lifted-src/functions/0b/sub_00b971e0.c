/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb971e0..0xb9757c (924 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b971e0_0 {
    unsigned long long field_0;
    void* field_8;
    struct st_b971e0_0 *field_10;
} st_b971e0_0;

extern char g_e06384;

unsigned long long sub_b971e0(st_b971e0_0 *a0, st_b971e0_0 *a1)
{
    unsigned long v2;  // x8
    st_b971e0_0 *v3;  // x19
    st_b971e0_0 *v4;  // x20
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
            goto *((void *)(sub_b97258 + (&g_e06384)[v2] * 4));
        v5 = sub_b971e0(v4->field_8, v3->field_8);
        if (!(unsigned int)v5)
            return v5;
        a0 = v4->field_10;
        a1 = v3->field_10;
        v2 = v4->field_10->field_0;
    } while (v4->field_10->field_0 == v3->field_10->field_0);
    return 0;
}
