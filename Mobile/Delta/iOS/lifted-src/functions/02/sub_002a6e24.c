/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a6e24..0x2a6e94 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a6e24_3 {
    char padding_0[128];
    char field_80;
} st_2a6e24_3;

typedef struct st_2a6e24_0 {
    char padding_0[136];
    char field_88;
} st_2a6e24_0;

typedef struct st_2a6e24_1 {
    char padding_0[80];
    char field_50;
} st_2a6e24_1;

typedef struct st_2a6e24_2 {
    char padding_0[104];
    char field_68;
} st_2a6e24_2;


st_2a6e24_0 * sub_2a6e24(st_2a6e24_0 *a0)
{
    st_2a6e24_1 *v0;  // [bp-0x28], Other Possible Types: st_2a6e24_2 *, st_2a6e24_3 *
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    sub_2a6e94(&a0[1].padding_0[7], a0->field_88);
    sub_181a8(&a0->padding_0[96]);
    v0 = &a0->padding_0[56];
    sub_2ab41c(&v0);
    v0 = &a0->padding_0[32];
    sub_2ab41c(&v0);
    v0 = &a0->padding_0[8];
    sub_10344(&v0);
    return a0;
}
