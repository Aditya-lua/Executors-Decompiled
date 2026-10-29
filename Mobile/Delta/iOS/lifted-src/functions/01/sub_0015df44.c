/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15df44..0x15dfdc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01ec0;
extern unsigned short g_f01ec2;
extern unsigned short g_f01ec4;
extern unsigned short g_f01ec6;
extern unsigned long long g_f01f20;
extern unsigned short g_f0f968;
extern unsigned short g_f0f96a;
extern unsigned short g_f0f96c;
extern unsigned short g_f0f96e;

long long sub_15df44(void)
{
    unsigned long v0;  // x0

    g_f0f968 = 57456;
    g_f0f96a = 21684;
    g_f0f96c = 0xaff1;
    g_f0f96e = 59981;
    g_f01ec0 = g_f0f968 ^ g_f01ec0;
    g_f01ec2 = g_f0f96a ^ g_f01ec2;
    g_f01ec4 = g_f0f96c ^ g_f01ec4;
    g_f01ec6 = g_f0f96e ^ g_f01ec6;
    g_f01f20 = g_f01f20 ^ 0xea4daff154b4e070;
    return v0;
}
