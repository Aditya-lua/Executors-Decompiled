/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9898b8..0x9898e4 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9898b8_0 {
    char padding_0[256];
    unsigned long long field_100;
} st_9898b8_0;


unsigned int sub_9898b8(unsigned long a0, st_9898b8_0 *a1)
{
    unsigned int v0;  // w0

    v0 = __ROL__((unsigned int)a1->field_100, 24) & 0xff0000ff & 0xff;
    if (!v0)
    {
        return v0;
    }
    else if (v0 == 1)
    {
        a1->field_100 = a1->field_100 & 0xffffffffffff00ff | 0x200;
        return v0;
    }
    else
    {
        return 1;
    }
}
