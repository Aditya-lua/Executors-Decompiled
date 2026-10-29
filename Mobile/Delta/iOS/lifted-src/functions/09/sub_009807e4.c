/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9807e4..0x9808b8 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9807e4_1 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_9807e4_1;

typedef struct st_9807e4_2 {
    char padding_0[24];
    long long field_18;
} st_9807e4_2;

typedef struct st_9807e4_0 {
    char field_0[21];
    char field_d;
    char padding_e[18];
    unsigned long long field_20;
    struct st_9807e4_1 *field_28;
} st_9807e4_0;


st_9807e4_0 * sub_9807e4(st_9807e4_2 *a0, st_9807e4_1 *a1, void* a2)
{
    st_9807e4_0 *v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (20 < *(char *)a2)
        return 0;
    v2 = sub_a6bffc(56, "ssl/quic/quic_lcidm.c", 270);
    if (v2)
    {
        *(int128_t *)&v2->field_0[0] = *(int128_t *)a2;
        *(long long *)&v2->field_0[13] = (long long)a2[13];
        *(st_9807e4_2 **)&v2->padding_e[10] = &a0->padding_0[8];
        v2->field_20 = a1;
        sub_a66794(a1->field_8, v2);
        if (!sub_a66e38(a1->field_8))
        {
            sub_a66794(a0->field_18, v2);
            if (!sub_a66e38(a0->field_18))
            {
                a1->field_0 = a1->field_0 + 1;
                return v2;
            }
            sub_a66994(a1->field_8, v2);
        }
    }
    sub_a6c2e4(v2, "ssl/quic/quic_lcidm.c", 291);
    return 0;
}
