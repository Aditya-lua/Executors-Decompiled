/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc62074..0xc620c8 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c62074_0 {
    char padding_0[120];
    char *field_78;
    struct st_c62074_1 *field_80;
    unsigned long long field_88;
} st_c62074_0;

typedef struct st_c62074_1 {
    char padding_0[72];
    struct st_c62074_1 *field_48;
    struct st_c62074_1 *field_50;
    char padding_58[16];
    struct st_c62074_1 *field_68;
} st_c62074_1;


st_c62074_0 * sub_c62074(st_c62074_0 *a0, char *a1)
{
    char *v0;  // x8
    char *v1;  // x8

    if (!a1)
        return a0;
    v0 = *(long long *)&a1[104] - 1;
    *(char **)&a1[104] = v0;
    if (v0)
        return a0;
    v1 = &a0->field_80->padding_0[0];
    if (v1)
        *(char **)&v1[72] = a1;
    *(unsigned long long *)&a1[72] = 0;
    *(char **)&a1[80] = v1;
    a0->field_80 = a1;
    if (!a0->field_78)
        a0->field_78 = a1;
    a0->field_88 = a0->field_88 + 1;
    return a0;
}
