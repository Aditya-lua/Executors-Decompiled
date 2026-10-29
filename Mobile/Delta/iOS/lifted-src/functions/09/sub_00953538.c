/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x953538..0x953584 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_953538_1 {
    char padding_0[1264];
    struct st_953538_0 *field_4f0;
} st_953538_1;

typedef struct st_953538_2 {
    char padding_0[8];
    long long field_8;
} st_953538_2;

typedef struct st_953538_0 {
    char padding_0[280];
    long long field_118;
} st_953538_0;


st_953538_2 * sub_953538(st_953538_1 *a0)
{
    st_953538_0 *v2;  // x8
    st_953538_2 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_4f0;
    while (1)
    {
        v3 = sub_954348(v2->field_118);
        if (!v3)
            break;
        sub_9aca2c(v3->field_8);
        sub_954264(v3);
        v2 = a0->field_4f0;
    }
    return NULL;
}
