/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae3b90..0xae3bac (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae3b90_0 {
    char padding_0[56];
    unsigned long long field_38;
    char padding_40[108];
    unsigned int field_ac;
    unsigned int field_b0;
    char padding_b4[4];
    unsigned long long field_b8;
} st_ae3b90_0;


void sub_ae3b90(void)
{
    st_ae3b90_0 *v0;  // x19
    unsigned int v1;  // w22
    unsigned long v2;  // x20

    v0->field_ac = v1;
    v0->field_b0 = 46;
    v0->field_b8 = v2;
    goto *((void *)(v0->field_38));
}
