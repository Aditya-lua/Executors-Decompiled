/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x214320..0x214340 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_214320_1 {
    char padding_0[8];
    struct st_214320_0 *field_8;
} st_214320_1;

typedef struct st_214320_0 {
    struct st_214320_1 *field_0;
    char padding_8[4];
    unsigned int field_c;
} st_214320_0;

typedef struct st_214320_2 {
    char padding_0[32];
    struct st_214320_1 *field_20;
    char padding_28[4];
    unsigned int field_2c;
} st_214320_2;


st_214320_0 * sub_214320(unsigned long a0, int a1)
{
    st_214320_2 *v0;  // x8
    st_214320_0 *v1;  // x0

    v0 = a0 + a1 * 16;
    v1 = &v0->field_20;
    if (v0->field_2c == 16)
        v1 = v1->field_0->field_8;
    return v1;
}
