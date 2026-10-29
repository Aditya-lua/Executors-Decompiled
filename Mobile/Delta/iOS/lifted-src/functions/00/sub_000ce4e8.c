/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xce4e8..0xce5bc (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ce4e8_1 {
    struct st_ce4e8_1 *field_0;
    char field_8;
    char padding_9[119];
    unsigned long long field_80;
    char padding_88[32];
    unsigned long long field_a8;
    unsigned long long field_b0;
    char padding_b8[8];
    struct st_ce4e8_1 *field_c0;
    char padding_c8[112];
    struct st_ce4e8_1 *field_138;
    struct st_ce4e8_1 *field_140;
} st_ce4e8_1;

typedef struct st_ce4e8_0 {
    char field_0;
} st_ce4e8_0;


st_ce4e8_1 * sub_ce4e8(st_ce4e8_1 *a0)
{
    st_ce4e8_1 *ptr;  // x20
    st_ce4e8_1 *v5;  // x21
    st_ce4e8_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_ce4e8_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a0)
        return 0xffffff9a;
    ptr = a0->field_140;
    if (!ptr)
        return 0xffffff9a;
    if (ptr->field_c0 || (int)ptr->field_138)
    {
        v5 = 0;
        _free(ptr->field_0);
        ptr->field_0 = 0;
        if (ptr->field_80 == 8)
            goto LABEL_ce548;
    }
    else
    {
        if (ptr->field_a8 == ptr->field_b0)
            v5 = 0;
        else
            v5 = 0xffffff97;
        _free();
        ptr->field_0 = 0;
        if (ptr->field_80 == 8)
        {
LABEL_ce548:
            sub_b64f30(&ptr->field_8);
        }
    }
    _free(ptr);
    a0->field_140 = 0;
    return v5;
}
