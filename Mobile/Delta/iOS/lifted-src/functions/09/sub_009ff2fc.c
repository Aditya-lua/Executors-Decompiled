/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ff2fc..0x9ff308 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ff2fc_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_9ff2fc_0;

typedef struct st_9ff2fc_1 {
    char padding_0[184];
    struct st_9ff2fc_0 *field_b8;
} st_9ff2fc_1;


long long sub_9ff2fc(st_9ff2fc_1 *a0)
{
    goto *((void *)(a0->field_b8->field_8));
}
