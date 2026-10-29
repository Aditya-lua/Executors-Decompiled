/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x43d434..0x43d454 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

long long sub_43d434(unsigned long long a0, unsigned long long a1)
{
    unsigned long long v0;  // x8

    v0 = -a0;
    return (a1 ^ v0) + a0 + (a1 - a0 - (a1 | v0)) * 2;
}
