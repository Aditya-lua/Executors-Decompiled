/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1763ec..0x176450 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1763ec_0 {
    char padding_0[8];
    void* field_8;
} st_1763ec_0;


void* sub_1763ec(st_1763ec_0 *a0, int a1)
{
    void* v2;  // x0
    void* v3;  // x20
    unsigned long long i;  // x21
    unsigned long long v5;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_8;
    if (a1)
    {
        v3 = v2 + 80 * a1;
        i = a1 * 80;
        do
        {
            v5 = i;
            memset(v2, 0, 80);
            v2 = sub_188ccc() + 80;
            i = v5 - 80;
        } while (i);
        v2 = v3;
    }
    a0->field_8 = v2;
    return v2;
}
