/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a57a8..0x9a57c8 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a57a8_0 {
    char padding_0[128];
    struct st_9a57a8_0 *field_80;
} st_9a57a8_0;

typedef struct st_9a57a8_1 {
    char padding_0[180];
    unsigned int field_b4;
    char padding_b8[3000];
    struct st_9a57a8_0 *field_c70;
} st_9a57a8_1;


void sub_9a57a8(st_9a57a8_1 *a0, unsigned int a1)
{
    a0->field_b4 = a1;
    if (!a0->field_c70)
    {
        return;
    }
    else if (a0->field_c70->field_80)
    {
        goto *((void *)(a0->field_c70->field_80));
    }
    else
    {
        return;
    }
}
