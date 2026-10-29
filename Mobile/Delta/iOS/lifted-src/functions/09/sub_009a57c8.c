/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a57c8..0x9a5810 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a57c8_0 {
    unsigned long long field_0;
    char padding_8[120];
    struct st_9a57c8_0 *field_80;
} st_9a57c8_0;

typedef struct st_9a57c8_1 {
    char padding_0[176];
    unsigned int field_b0;
    unsigned int field_b4;
    char padding_b8[3000];
    struct st_9a57c8_0 *field_c70;
} st_9a57c8_1;


void sub_9a57c8(st_9a57c8_1 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_b4 = 1;
    if (a0->field_c70 && a0->field_c70->field_80)
        a0->field_c70->field_80();
    a0->field_b0 = 21;
    return;
}
