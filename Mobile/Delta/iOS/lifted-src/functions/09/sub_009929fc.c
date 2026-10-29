/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9929fc..0x992a0c (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9929fc_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_9929fc_0;

typedef struct st_9929fc_1 {
    char padding_0[24];
    struct st_9929fc_0 *field_18;
} st_9929fc_1;


void sub_9929fc(st_9929fc_1 *a0)
{
    goto *((void *)(a0->field_18->field_10));
}
