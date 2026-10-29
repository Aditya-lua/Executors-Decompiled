/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ff954..0x9ff974 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ff954_0 {
    char padding_0[128];
    unsigned int field_80;
    char padding_84[68];
    unsigned long long field_c8;
} st_9ff954_0;


int sub_9ff954(st_9ff954_0 *a0)
{
    a0->field_80 = a0->field_80 | 1;
    a0->field_c8 = a0->field_c8 + 1;
    return 1;
}
