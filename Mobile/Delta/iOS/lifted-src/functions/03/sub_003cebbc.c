/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3cebbc..0x3cecf0 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3cebbc_1 {
    char padding_0[16];
    struct st_3cebbc_2 *field_10;
    char padding_18[168];
    unsigned long long field_c0;
    unsigned long long field_c8;
} st_3cebbc_1;

typedef struct st_3cebbc_2 {
    unsigned long long field_0;
} st_3cebbc_2;

typedef struct st_3cebbc_0 {
    char field_0;
} st_3cebbc_0;

extern unsigned long long g_e7e5d8;

unsigned long long * sub_3cebbc(st_3cebbc_1 *a0, long long ptr, int a2)
{
    unsigned long v4;  // x21
    st_3cebbc_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_3cebbc_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a0->field_10)
    {
        v4 = a2;
        if (a0->field_c0 + v4 <= a0->field_c8)
        {
            _memcpy(ptr);
            a0->field_c0 = a0->field_c0 + v4;
            return 1;
        }
        return 0;
    }
    else if (a2 > (int)(a0->field_c8 - a0->field_c0))
    {
        _memcpy(ptr);
        a0->field_10();
    }
    else
    {
        goto *((void *)(g_e7e5d8));
    }
}
