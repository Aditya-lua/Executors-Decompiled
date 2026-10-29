/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb60380..0xb603e8 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b60380_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_b60380_0;

extern st_b60380_0 g_e04e70;

unsigned long long sub_b60380(unsigned long long a0)
{
    int i;  // [bp-0xc]
    unsigned long long v1;  // [bp-0x8]

    v1 = a0;
    for (i = 0; i < 8; i += 1)
    {
        v1 = (&g_e04e70.field_0)[v1 >> 56 & 0xff] ^ v1 * 0x100;
    }
    return v1;
}
