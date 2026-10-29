/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x962f5c..0x962f70 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_962f5c_0 {
    char padding_0[312];
    unsigned long long field_138;
} st_962f5c_0;


unsigned long long sub_962f5c(st_962f5c_0 *a0, unsigned long a1)
{
    unsigned long long v0;  // x8

    v0 = a0->field_138 | a1;
    a0->field_138 = v0;
    return v0;
}
