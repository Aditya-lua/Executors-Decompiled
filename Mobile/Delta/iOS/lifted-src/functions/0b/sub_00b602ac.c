/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb602ac..0xb60314 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b602ac_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_b602ac_0;

extern st_b602ac_0 g_dfea70;

unsigned long long sub_b602ac(unsigned long long a0)
{
    int i;  // [bp-0xc]
    unsigned long long v1;  // [bp-0x8]

    v1 = a0;
    for (i = 0; i < 8; i += 1)
    {
        v1 = (&g_dfea70.field_0)[(char)v1] ^ v1 >> 8;
    }
    return v1;
}
