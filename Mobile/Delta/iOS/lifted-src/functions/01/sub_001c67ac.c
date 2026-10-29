/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c67ac..0x1c6848 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c67ac_1 {
    char padding_0[56];
    struct st_1c67ac_0 *field_38;
} st_1c67ac_1;

typedef struct st_1c67ac_2 {
    char padding_0[8];
    uint128_t field_8;
    uint128_t field_18;
    char field_28;
    char padding_29[15];
    unsigned long long field_38;
} st_1c67ac_2;

typedef struct st_1c67ac_0 {
    unsigned long long field_0;
    struct st_1c67ac_0 *field_8;
    char field_10;
    char padding_11[7];
    uint128_t field_18;
    uint128_t field_28;
    char field_38;
    char padding_39[15];
    unsigned long long field_48;
    unsigned int field_50;
    char field_54;
} st_1c67ac_0;

extern char g_e6fb28;

double sub_1c67ac(st_1c67ac_1 *a0, st_1c67ac_2 *a1, char a2, unsigned int a3)
{
    st_1c67ac_0 *v2;  // x23
    st_1c67ac_0 *v3;  // x8
    uint128_t v4;  // q0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = operatornew(88);
    v3 = a0->field_38->field_8;
    v2->field_0 = &g_e6fb28;
    v2->field_8 = v3;
    std::__1::locale::locale(&v2->field_10, a1);
    *(int128_t *)(v2->padding_11)[1] = *(int128_t *)(a1->padding_0)[1];
    v4 = *(int128_t *)((char *)&a1->field_8 + 8);
    *(uint128_t *)((char *)&v2->field_18 + 8) = v4;
    sub_61070((char *)&v2->field_28 + 8, (char *)&a1->field_18 + 8);
    *(long long *)&v2->padding_39[7] = *(long long *)&a1->padding_29[7];
    *(unsigned int *)&v2->field_48 = a3;
    *((char *)&v2->field_48 + 4) = a2;
    a0->field_38->field_8 = v2;
    a0->field_38 = v2;
    return (unsigned long long)v4;
}
