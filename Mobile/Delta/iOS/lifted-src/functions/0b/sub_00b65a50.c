/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb65a50..0xb65ad0 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b65a50_2 {
    struct st_b65a50_0 *field_0;
    struct st_b65a50_0 *field_8;
} st_b65a50_2;

typedef struct st_b65a50_1 {
    struct st_b65a50_0 *field_0;
    char padding_8[8];
    struct st_b65a50_2 *field_10;
} st_b65a50_1;

typedef struct st_b65a50_0 {
    unsigned long long field_0;
} st_b65a50_0;


void sub_b65a50(st_b65a50_1 *a0)
{
    st_b65a50_0 **v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0 == 0x8000000000000000)
    {
        v2 = a0->field_10;
        if (*v2)
            (*v2)();
        if (!v2[1])
            return;
    }
    else if (!a0->field_0)
    {
        return;
    }
    _free();
    return;
}
