/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cdc34..0x9cdd00 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cdc34_0 {
    unsigned long long field_0;
    char padding_8[24];
    struct st_9cdc34_1 *field_20;
} st_9cdc34_0;

typedef struct st_9cdc34_1 {
    unsigned long long field_0;
} st_9cdc34_1;

typedef struct st_9cdc34_2 {
    struct st_9cdc34_2 *field_0;
} st_9cdc34_2;


unsigned long long sub_9cdc34(st_9cdc34_2 **a0, st_9cdc34_0 *a1)
{
    st_9cdc34_2 **v4;  // x19
    unsigned long v5;  // x21
    unsigned long long v6;  // x0
    unsigned long long v0;  // [bp-0x50]
    st_9cdc34_2 **v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0;
    if (a1->field_0 >> 12 & 1)
    {
        v1 = v4;
        v4 = &v1;
    }
    if (!(a1->field_0 & 6))
        a1->field_20();
    v5 = *v4;
    if ((int)sub_ad69e4(v5) < 1)
    {
        v6 = sub_ad6020(v5);
        *v4 = 0;
        return v6;
    }
    v0 = sub_ad69f8(v5, 0);
    a1->field_20();
}
