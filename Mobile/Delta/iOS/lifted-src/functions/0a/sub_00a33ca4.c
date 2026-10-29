/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa33ca4..0xa33d44 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a33ca4_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    char padding_50[8];
    uint128_t field_58;
    uint128_t field_68;
    uint128_t field_78;
    char padding_88[8];
    unsigned long long field_90;
    unsigned int field_98;
    char padding_9c[60];
    struct st_a33ca4_0 *field_d8;
} st_a33ca4_1;

typedef struct st_a33ca4_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    char padding_50[8];
    uint128_t field_58;
    uint128_t field_68;
    uint128_t field_78;
    char padding_88[8];
    unsigned long long field_90;
    unsigned int field_98;
    char padding_9c[44];
    struct st_a33ca4_0 *field_c8;
    struct st_a33ca4_0 *field_d0;
    struct st_a33ca4_0 *field_d8;
} st_a33ca4_0;

extern st_a33ca4_0 *g_f12810;
extern st_a33ca4_0 *g_f12818;

double sub_a33ca4(st_a33ca4_0 *a0, st_a33ca4_1 *a1)
{
    uint128_t v0;  // q0
    st_a33ca4_0 *v1;  // x8
    st_a33ca4_0 **v2;  // x10

    a0->field_0 = a1->field_0;
    a0->field_10 = a1->field_10;
    a0->field_20 = a1->field_20;
    a0->field_30 = a1->field_30;
    a0->field_40 = a1->field_40;
    *(int128_t *)(a0->padding_50)[1] = *(int128_t *)(a1->padding_50)[1];
    *(int128_t *)((char *)&a0->field_58 + 8) = *(int128_t *)((char *)&a1->field_58 + 8);
    v0 = *(int128_t *)((char *)&a1->field_68 + 8);
    *(uint128_t *)((char *)&a0->field_68 + 8) = v0;
    a0->padding_88 = a1->padding_88;
    *(int *)&a0->field_90 = a1->field_90;
    v1 = *(long long *)&a1->padding_9c[52];
    a0->field_d0 = v1;
    if (v1)
    {
        if (g_f12810)
        {
            if (g_f12818 && (v2 = &g_f12818->field_c8, !g_f12818->field_c8))
                goto LABEL_a33d34;
        }
        else
        {
            if (!g_f12818)
            {
                v2 = &g_f12810;
LABEL_a33d34:
                *v2 = a0;
                g_f12818 = a0;
                *(st_a33ca4_0 **)&a0->padding_9c[36] = g_f12818;
                a0->field_c8 = 0;
                return (unsigned long long)v0;
            }
        }
    }
    return (unsigned long long)v0;
}
