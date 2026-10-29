/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x183f8..0x18494 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_183f8_1 {
    uint128_t field_0;
} st_183f8_1;

typedef struct st_183f8_0 {
    struct st_183f8_1 *field_0;
    struct st_183f8_1 *field_8;
    uint128_t field_10;
} st_183f8_0;

typedef struct st_183f8_2 {
    char field_0;
} st_183f8_2;


double sub_183f8(st_183f8_0 *a0, st_183f8_0 *a1)
{
    uint128_t v4;  // q0
    uint128_t *v5;  // x8
    uint128_t *i;  // x9
    st_183f8_2 **v0;  // [bp-0x30], Other Possible Types: char
    st_183f8_2 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    a0->field_0 = 0;
    a0->field_8 = 0;
    v4 = a1->field_10;
    a0->field_10 = v4;
    if (a1->field_8)
    {
        a0->field_0 = operatornew(a1->field_8 * 16);
        if (a1->field_8)
        {
            v5 = 0;
            i = 0;
            do
            {
                v4 = *(int128_t *)(a1->field_0 + v5);
                *(uint128_t *)(a0->field_0 + v5) = v4;
                i = (char *)i + 1;
                a0->field_8 = i;
                v5 += 1;
            } while (i < a1->field_8);
        }
    }
    return *(unsigned long long *)&v4;
}
